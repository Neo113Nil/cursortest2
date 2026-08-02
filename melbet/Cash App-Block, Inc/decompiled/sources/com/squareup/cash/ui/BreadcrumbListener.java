package com.squareup.cash.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Debug;
import androidx.metrics.performance.JankStats;
import androidx.room.Room;
import app.cash.broadway.screen.Screen;
import coil3.RealImageLoader;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SupportTransactionRenderTimeout;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.storage.TempStorageCleaner;
import com.squareup.cash.support.backend.real.RealSupportStatus;
import com.squareup.cash.support.backend.real.RealSupportTransactionMapper;
import com.squareup.cash.support.backend.real.RealSupportTransactionService;
import com.squareup.cash.support.chat.backend.real.ChatBackendModule$Companion$provideReadTokenStorage$1;
import com.squareup.cash.support.chat.backend.real.ChatBackendModule$Companion$provideReadTokenStorage$3;
import com.squareup.cash.support.chat.backend.real.SupportConversationPersistence;
import com.squareup.cash.support.presenters.RealViewTokenGenerator;
import com.squareup.cash.tabprovider.real.EmptyTabProvider;
import com.squareup.cash.tabprovider.real.RealTabPublisher;
import com.squareup.cash.tax.backend.real.RealTaxesDocumentsTaxReturnsDataProvider;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsSpanTrackingService;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsWarningsRepository;
import com.squareup.cash.transfers.backend.real.RealTransferRequirementHandler;
import com.squareup.cash.treehouse.android.LazyZiplineHttpClient;
import com.squareup.cash.treehouse.android.platform.RealErrorReporterService;
import com.squareup.cash.treehouse.android.playground.TreehousePlayground;
import com.squareup.cash.treehouse.android.presenters.TreehousePresenterFactory;
import com.squareup.cash.treehouse.sqldelight.AndroidSqlDelightBridgeHolder;
import com.squareup.cash.ui.gcm.GcmModule$Companion$provideGcmOnSignOutAction$1;
import com.squareup.cash.ui.gcm.RealGcmRegistrar;
import com.squareup.cash.ui.qrcodes.RealQrShortcutInstaller;
import com.squareup.cash.ui.util.BalanceAnimator;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.List;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Symbol;
import squareup.cash.moneta.api.v1_0.MonetaService;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class BreadcrumbListener extends EventListener {
    public final BugsnagClient bugsnagClient;
    public EventListener.State lastState;

    public BreadcrumbListener(BugsnagClient bugsnagClient) {
        this.bugsnagClient = bugsnagClient;
    }

    public static String getId(EventListener.Initiator initiator) {
        if (initiator instanceof EventListener.Initiator.Location) {
            return ((EventListener.Initiator.Location) initiator).id;
        }
        if (initiator.equals(EventListener.Initiator.None.INSTANCE)) {
            return "none";
        }
        if (initiator.equals(EventListener.Initiator.Restore.INSTANCE)) {
            return "restore";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static String getName(EventListener.Initiator initiator) {
        if (initiator instanceof EventListener.Initiator.Location) {
            return ((EventListener.Initiator.Location) initiator).screen.getClass().getSimpleName();
        }
        if (initiator.equals(EventListener.Initiator.None.INSTANCE)) {
            return "none";
        }
        if (initiator.equals(EventListener.Initiator.Restore.INSTANCE)) {
            return "restore";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void answerEnd(EventListener.Initiator initiator, EventListener.State state) {
        updateState(EventListener.Initiator.None.INSTANCE, state);
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void backEnd(EventListener.State state) {
        updateState(EventListener.Initiator.None.INSTANCE, state);
    }

    public final void leaveBreadcrumb(String str, MapBuilder mapBuilder) {
        Timber.Forest.i(str + "\n" + mapBuilder, new Object[0]);
        this.bugsnagClient.leaveNavigationBreadcrumb(str, mapBuilder);
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void navigationEnd(Screen screen, EventListener.Initiator initiator, EventListener.State state) {
        screen.getClass();
        updateState(initiator, state);
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void stateChanged(EventListener.State state) {
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        MapBuilder mapBuilder = new MapBuilder(5);
        mapBuilder.put("navigator", state.identifier);
        mapBuilder.put("navigatorState", state.state.name());
        mapBuilder.put("backStack", state.backStack.backStackEntries.toString());
        mapBuilder.put("jvmHeapBytes", Long.valueOf(freeMemory));
        mapBuilder.put("nativeHeapBytes", Long.valueOf(nativeHeapAllocatedSize));
        leaveBreadcrumb("State change", mapBuilder.build());
    }

    public final void updateState(EventListener.Initiator initiator, EventListener.State state) {
        EventListener.Location location;
        EventListener.Location location2;
        EventListener.State state2 = this.lastState;
        EventListener.Location location3 = state2 != null ? state2.fullScreen : null;
        EventListener.Location location4 = state2 != null ? state2.overlay : null;
        EventListener.Location location5 = state.fullScreen;
        List list = state.backStack.backStackEntries;
        BetterNavigator.State state3 = state.state;
        String str = state.identifier;
        EventListener.Location location6 = state.overlay;
        if (Intrinsics.areEqual(location6, location4) || location4 == null) {
            location = location6;
            location2 = location5;
        } else {
            Screen screen = location4.screen;
            location = location6;
            String concat = "Dismiss overlay: ".concat(screen.getClass().getSimpleName());
            long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
            MapBuilder mapBuilder = new MapBuilder(9);
            mapBuilder.put("navigator", str);
            mapBuilder.put("navigatorState", state3.name());
            mapBuilder.put("screen", screen.toString());
            mapBuilder.put("screenId", location4.id);
            mapBuilder.put("initiator", getName(initiator));
            mapBuilder.put("initiatorId", getId(initiator));
            mapBuilder.put("backStack", list.toString());
            mapBuilder.put("jvmHeapBytes", Long.valueOf(freeMemory));
            mapBuilder.put("nativeHeapBytes", Long.valueOf(nativeHeapAllocatedSize));
            leaveBreadcrumb(concat, mapBuilder.build());
            location2 = location5;
        }
        if (!Intrinsics.areEqual(location2, location3)) {
            location2.getClass();
            Screen screen2 = location2.screen;
            String concat2 = "Show full screen: ".concat(screen2.getClass().getSimpleName());
            long freeMemory2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            long nativeHeapAllocatedSize2 = Debug.getNativeHeapAllocatedSize();
            MapBuilder mapBuilder2 = new MapBuilder(10);
            mapBuilder2.put("navigator", str);
            mapBuilder2.put("navigatorState", state3.name());
            mapBuilder2.put("screen", screen2.toString());
            mapBuilder2.put("screenId", location2.id);
            mapBuilder2.put("initiator", getName(initiator));
            mapBuilder2.put("initiatorId", getId(initiator));
            mapBuilder2.put("back", Boolean.valueOf(location2.isBack));
            mapBuilder2.put("backStack", list.toString());
            mapBuilder2.put("jvmHeapBytes", Long.valueOf(freeMemory2));
            mapBuilder2.put("nativeHeapBytes", Long.valueOf(nativeHeapAllocatedSize2));
            leaveBreadcrumb(concat2, mapBuilder2.build());
        }
        EventListener.Location location7 = location;
        if (!Intrinsics.areEqual(location7, location4) && location7 != null) {
            Screen screen3 = location7.screen;
            String concat3 = "Show overlay: ".concat(screen3.getClass().getSimpleName());
            long freeMemory3 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            long nativeHeapAllocatedSize3 = Debug.getNativeHeapAllocatedSize();
            MapBuilder mapBuilder3 = new MapBuilder(9);
            mapBuilder3.put("navigator", str);
            mapBuilder3.put("navigatorState", state3.name());
            mapBuilder3.put("screen", screen3.toString());
            mapBuilder3.put("screenId", location7.id);
            mapBuilder3.put("initiator", getName(initiator));
            mapBuilder3.put("initiatorId", getId(initiator));
            mapBuilder3.put("backStack", list.toString());
            mapBuilder3.put("jvmHeapBytes", Long.valueOf(freeMemory3));
            mapBuilder3.put("nativeHeapBytes", Long.valueOf(nativeHeapAllocatedSize3));
            leaveBreadcrumb(concat3, mapBuilder3.build());
        }
        this.lastState = state;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider bugsnagClient;

        public /* synthetic */ MetroFactory(Provider provider, int i) {
            this.$r8$classId = i;
            this.bugsnagClient = provider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 0;
            Provider provider = this.bugsnagClient;
            switch (i) {
                case 0:
                    BugsnagClient bugsnagClient = (BugsnagClient) provider.invoke();
                    bugsnagClient.getClass();
                    return new BreadcrumbListener(bugsnagClient);
                case 1:
                    Storage storage = (Storage) provider.invoke();
                    storage.getClass();
                    return new TempStorageCleaner(storage, i2);
                case 2:
                    SupportConversationPersistence supportConversationPersistence = (SupportConversationPersistence) provider.invoke();
                    supportConversationPersistence.getClass();
                    return new RealSupportStatus(supportConversationPersistence);
                case 3:
                    ErrorReporter errorReporter = (ErrorReporter) provider.invoke();
                    errorReporter.getClass();
                    return new RealSupportTransactionMapper(errorReporter);
                case 4:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    featureFlagManager.getClass();
                    return new RealSupportTransactionService.TimeoutConfig(((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SupportTransactionRenderTimeout.INSTANCE)).value);
                case 5:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    sharedPreferences.getClass();
                    return Room.SerDeKeyValue$default(sharedPreferences, "support_chat_saved_input", ChatBackendModule$Companion$provideReadTokenStorage$1.INSTANCE$1, ChatBackendModule$Companion$provideReadTokenStorage$1.INSTANCE$2, ChatBackendModule$Companion$provideReadTokenStorage$3.INSTANCE$1, 96);
                case 6:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                    sharedPreferences2.getClass();
                    return Room.SerDeKeyValue$default(sharedPreferences2, "support_chat_loaded_message_token", ChatBackendModule$Companion$provideReadTokenStorage$1.INSTANCE$3, ChatBackendModule$Companion$provideReadTokenStorage$1.INSTANCE$4, ChatBackendModule$Companion$provideReadTokenStorage$3.INSTANCE$2, 96);
                case 7:
                    SharedPreferences sharedPreferences3 = (SharedPreferences) provider.invoke();
                    sharedPreferences3.getClass();
                    return Room.SerDeKeyValue$default(sharedPreferences3, "support_chat_read_message_token", ChatBackendModule$Companion$provideReadTokenStorage$1.INSTANCE, ChatBackendModule$Companion$provideReadTokenStorage$1.INSTANCE$5, ChatBackendModule$Companion$provideReadTokenStorage$3.INSTANCE, 96);
                case 8:
                    SupportConversationPersistence supportConversationPersistence2 = (SupportConversationPersistence) provider.invoke();
                    supportConversationPersistence2.getClass();
                    return new WireAdapter(supportConversationPersistence2);
                case 9:
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider.invoke();
                    realUuidGenerator.getClass();
                    return new RealViewTokenGenerator(realUuidGenerator);
                case 10:
                    RealTabPublisher realTabPublisher = (RealTabPublisher) provider.invoke();
                    realTabPublisher.getClass();
                    return new EmptyTabProvider(realTabPublisher, i2);
                case 11:
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider.invoke();
                    featureFlagManager2.getClass();
                    return new zzb(featureFlagManager2);
                case 12:
                    RealKeyStoreProvider realKeyStoreProvider = (RealKeyStoreProvider) provider.invoke();
                    realKeyStoreProvider.getClass();
                    return new JCAContext(realKeyStoreProvider, 27);
                case 13:
                    SharedPreferences sharedPreferences4 = (SharedPreferences) provider.invoke();
                    sharedPreferences4.getClass();
                    return Room.BooleanKeyValue(sharedPreferences4, "TAP_TO_PAY_FIRST_TIME", true, false);
                case 14:
                    RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                    realImageLoader.getClass();
                    return new ScoreUiFactory(realImageLoader, 21);
                case 15:
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider.invoke();
                    featureFlagManager3.getClass();
                    return new RealTaxesDocumentsTaxReturnsDataProvider(featureFlagManager3);
                case 16:
                    Context context = (Context) provider.invoke();
                    context.getClass();
                    return new Symbol(context);
                case 17:
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider.invoke();
                    realObservabilityManager.getClass();
                    return new RealThreeDsSpanTrackingService(realObservabilityManager);
                case 18:
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    coroutineContext.getClass();
                    return new RealThreeDsWarningsRepository(coroutineContext);
                case 19:
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider.invoke();
                    realImageLoader2.getClass();
                    return new ScoreUiFactory(realImageLoader2, 22);
                case 20:
                    MonetaService monetaService = (MonetaService) provider.invoke();
                    monetaService.getClass();
                    return new RealTransferRequirementHandler(monetaService);
                case 21:
                    SharedPreferences sharedPreferences5 = (SharedPreferences) provider.invoke();
                    sharedPreferences5.getClass();
                    return JankStats.Companion.provideHasSeenLinkedAccountsNux(sharedPreferences5);
                case 22:
                    provider.getClass();
                    return new LazyZiplineHttpClient(provider);
                case 23:
                    TreehousePlayground treehousePlayground = (TreehousePlayground) provider.invoke();
                    treehousePlayground.getClass();
                    return treehousePlayground;
                case 24:
                    ErrorReporter errorReporter2 = (ErrorReporter) provider.invoke();
                    errorReporter2.getClass();
                    return new RealErrorReporterService.Factory(errorReporter2);
                case 25:
                    TreehousePresenterFactory treehousePresenterFactory = (TreehousePresenterFactory) provider.invoke();
                    treehousePresenterFactory.getClass();
                    return treehousePresenterFactory;
                case 26:
                    Context context2 = (Context) provider.invoke();
                    context2.getClass();
                    return new AndroidSqlDelightBridgeHolder(context2);
                case 27:
                    RealGcmRegistrar realGcmRegistrar = (RealGcmRegistrar) provider.invoke();
                    realGcmRegistrar.getClass();
                    return new GcmModule$Companion$provideGcmOnSignOutAction$1(realGcmRegistrar, i2);
                case 28:
                    Context context3 = (Context) provider.invoke();
                    context3.getClass();
                    return new RealQrShortcutInstaller(context3);
                default:
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    factory.getClass();
                    return new BalanceAnimator(factory);
            }
        }

        public /* synthetic */ MetroFactory(Object obj, DoubleCheck doubleCheck, int i) {
            this.$r8$classId = i;
            this.bugsnagClient = doubleCheck;
        }
    }
}
