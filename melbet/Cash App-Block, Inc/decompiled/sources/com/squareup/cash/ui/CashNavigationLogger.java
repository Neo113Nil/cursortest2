package com.squareup.cash.ui;

import android.content.SharedPreferences;
import androidx.room.Room;
import app.cash.broadway.screen.Screen;
import coil3.RealImageLoader;
import com.squareup.cash.account.backend.PrincipalAccountTokenModule$$ExternalSyntheticLambda0;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.cash.card.spendinginsights.views.inject.SpendingInsightsViewFactory;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import com.squareup.cash.datetimeformatter.real.RealTodayDateTimeFormatter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.CombinedAnalytics;
import com.squareup.cash.interaction.ScreenNavigationEnd;
import com.squareup.cash.interaction.ScreenNavigationStart;
import com.squareup.cash.interaction.ScreenPresentationStart;
import com.squareup.cash.interaction.UiCreate;
import com.squareup.cash.interaction.UiInteractionLatencyAnalyzer;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.storage.StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1;
import com.squareup.cash.support.backend.api.RecentlyViewedNode;
import com.squareup.cash.support.backend.real.RealDisputesTrackerMapper;
import com.squareup.cash.support.chat.backend.api.AdvocateAvailabilityData;
import com.squareup.cash.support.chat.backend.real.ChatBackendModule$Companion$provideReadTokenStorage$3;
import com.squareup.cash.support.presenters.RealSupportLinkNavigator;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.tabprovider.real.RealLocalTabProvider;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.backend.real.RealTapToPayErrorReporter;
import com.squareup.cash.tax.presenters.RealTaxDesktopTooltipPreference;
import com.squareup.cash.treehouse.android.RealCashContextService;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseLinkQrCodeProcessor;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.userjourneys.tracker.RealCdfJourneyMap;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourneyAnalytics;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.cash.work.data.real.RealLastClockedInInfoUseCase;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.presenters.shift.data.ClockInStateResolver;
import com.squareup.kotterknife.Lazy;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.squareup.preferences.KeyValue;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final class CashNavigationLogger extends EventListener {
    public final UiInteractionLatencyAnalyzer interactionEventSink;
    public final RealObservabilityManager observabilityManager;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider interactionEventSink;
        public final Provider observabilityManager;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, int i) {
            this.$r8$classId = i;
            this.interactionEventSink = provider;
            this.observabilityManager = provider2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 3;
            int i3 = 1;
            Provider provider = this.observabilityManager;
            Provider provider2 = this.interactionEventSink;
            switch (i) {
                case 0:
                    UiInteractionLatencyAnalyzer uiInteractionLatencyAnalyzer = (UiInteractionLatencyAnalyzer) provider2.invoke();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider.invoke();
                    uiInteractionLatencyAnalyzer.getClass();
                    realObservabilityManager.getClass();
                    return new CashNavigationLogger(uiInteractionLatencyAnalyzer, realObservabilityManager);
                case 1:
                    RealTodayDateTimeFormatter realTodayDateTimeFormatter = (RealTodayDateTimeFormatter) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    realTodayDateTimeFormatter.getClass();
                    factory.getClass();
                    return new RealDisputesTrackerMapper(realTodayDateTimeFormatter, factory);
                case 2:
                    Moshi moshi = (Moshi) provider2.invoke();
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    moshi.getClass();
                    sharedPreferences.getClass();
                    JsonAdapter adapter = moshi.adapter(Types.newParameterizedType(List.class, RecentlyViewedNode.class));
                    KeyValue.OnDeserializationFailure onDeserializationFailure = KeyValue.OnDeserializationFailure.Delete;
                    return Room.SerDeKeyValue$default(sharedPreferences, "support_viewed_articles_preference", new PrincipalAccountTokenModule$$ExternalSyntheticLambda0(adapter, 2), new PrincipalAccountTokenModule$$ExternalSyntheticLambda0(adapter, i2), new Moneys$$ExternalSyntheticLambda0(19), 64);
                case 3:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider2.invoke();
                    Moshi moshi2 = (Moshi) provider.invoke();
                    sharedPreferences2.getClass();
                    moshi2.getClass();
                    KeyValue.OnDeserializationFailure onDeserializationFailure2 = KeyValue.OnDeserializationFailure.Delete;
                    JsonAdapter adapter2 = moshi2.adapter(AdvocateAvailabilityData.class, Util.NO_ANNOTATIONS, null);
                    return Room.SerDeKeyValue(sharedPreferences2, "support_chat_anchor_message_token", new StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1(adapter2, 10), new StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1(adapter2, 11), new ChatBackendModule$Companion$provideReadTokenStorage$3(3), onDeserializationFailure2, false);
                case 4:
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) provider2.invoke();
                    IntentLauncher intentLauncher = (IntentLauncher) provider.invoke();
                    realRouter$Factory$Impl.getClass();
                    intentLauncher.getClass();
                    return new RealSupportLinkNavigator(realRouter$Factory$Impl, intentLauncher);
                case 5:
                    RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) provider2.invoke();
                    IntentLauncher intentLauncher2 = (IntentLauncher) provider.invoke();
                    realRouter$Factory$Impl2.getClass();
                    intentLauncher2.getClass();
                    return new Lazy(18, realRouter$Factory$Impl2, intentLauncher2);
                case 6:
                    Storage storage = (Storage) provider2.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) provider.invoke();
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    storage.getClass();
                    coroutineScope.getClass();
                    defaultIoScheduler.getClass();
                    return new RealScreenshotManager(storage, coroutineScope, defaultIoScheduler);
                case 7:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider2.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                    featureFlagManager.getClass();
                    syncValueReader.getClass();
                    return new RealLocalTabProvider(syncValueReader, featureFlagManager);
                case 8:
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider.invoke();
                    errorReporter.getClass();
                    featureFlagManager2.getClass();
                    return new RealTapToPayErrorReporter(errorReporter, featureFlagManager2);
                case 9:
                    SharedPreferences sharedPreferences3 = (SharedPreferences) provider2.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    sharedPreferences3.getClass();
                    coroutineContext.getClass();
                    return new RealTaxDesktopTooltipPreference(sharedPreferences3, coroutineContext);
                case 10:
                    RealImageLoader realImageLoader = (RealImageLoader) provider2.invoke();
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider.invoke();
                    realImageLoader.getClass();
                    realCashVibrator.getClass();
                    return new SpendingInsightsViewFactory(realImageLoader, realCashVibrator, i3);
                case 11:
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    RealServiceContextManager realServiceContextManager = (RealServiceContextManager) provider.invoke();
                    sessionManager.getClass();
                    realServiceContextManager.getClass();
                    return new RealCashContextService(sessionManager, realServiceContextManager, "https://cash.app/");
                case 12:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider2.invoke();
                    AndroidClock androidClock = (AndroidClock) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    androidClock.getClass();
                    return new RealTreehouseLinkQrCodeProcessor(cashAccountDatabaseImpl, androidClock);
                case 13:
                    UserJourneyTracker userJourneyTracker = (UserJourneyTracker) provider2.invoke();
                    RealUserJourneyTracker realUserJourneyTracker = (RealUserJourneyTracker) provider.invoke();
                    userJourneyTracker.getClass();
                    realUserJourneyTracker.getClass();
                    return new UserJourneyAnalytics(userJourneyTracker, realUserJourneyTracker);
                case 14:
                    UserJourneyTracker userJourneyTracker2 = (UserJourneyTracker) provider2.invoke();
                    RealCdfJourneyMap realCdfJourneyMap = (RealCdfJourneyMap) provider.invoke();
                    userJourneyTracker2.getClass();
                    realCdfJourneyMap.getClass();
                    return new CombinedAnalytics(userJourneyTracker2, realCdfJourneyMap);
                case 15:
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider2.invoke();
                    RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) provider.invoke();
                    androidStringManager.getClass();
                    realShiftTimeFormatter.getClass();
                    return new ToolbarTuckTargets(androidStringManager, realShiftTimeFormatter);
                case 16:
                    RealShiftTimeFormatter realShiftTimeFormatter2 = (RealShiftTimeFormatter) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    realShiftTimeFormatter2.getClass();
                    factory2.getClass();
                    return new Lazy(realShiftTimeFormatter2, factory2);
                default:
                    RealLastClockedInInfoUseCase realLastClockedInInfoUseCase = (RealLastClockedInInfoUseCase) provider2.invoke();
                    ClockInStateResolver clockInStateResolver = (ClockInStateResolver) provider.invoke();
                    realLastClockedInInfoUseCase.getClass();
                    clockInStateResolver.getClass();
                    return new ToolbarTuckTargets(realLastClockedInInfoUseCase, clockInStateResolver);
            }
        }
    }

    public CashNavigationLogger(UiInteractionLatencyAnalyzer uiInteractionLatencyAnalyzer, RealObservabilityManager realObservabilityManager) {
        this.interactionEventSink = uiInteractionLatencyAnalyzer;
        this.observabilityManager = realObservabilityManager;
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void appFullyDrawn(Screen screen) {
        screen.getClass();
        RealObservabilityManager realObservabilityManager = this.observabilityManager;
        if (realObservabilityManager.appFullyDisplayedReported.get()) {
            return;
        }
        realObservabilityManager.processOrEnqueue(RealObservabilityManager.AppFullyDisplayed.INSTANCE);
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void navigationEnd(Screen screen, EventListener.Initiator initiator, EventListener.State state) {
        screen.getClass();
        if ((screen instanceof Back) || (screen instanceof Finish)) {
            return;
        }
        this.interactionEventSink.sendEvent(new ScreenNavigationEnd(screen));
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void navigationStart(Screen screen, EventListener.Initiator initiator, EventListener.State state) {
        screen.getClass();
        if ((screen instanceof Back) || (screen instanceof Finish)) {
            return;
        }
        this.interactionEventSink.sendEvent(new ScreenNavigationStart(screen));
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    /* renamed from: presenterStart-5qebJ5I */
    public final void mo3506presenterStart5qebJ5I(Screen screen, long j, long j2) {
        screen.getClass();
        this.interactionEventSink.sendEvent(new ScreenPresentationStart(screen, j, j2));
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void uiCreate(Screen screen) {
        screen.getClass();
        this.interactionEventSink.sendEvent(new UiCreate(screen));
    }
}
