package com.squareup.preferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.Lifecycle;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import app.cash.badging.api.Badger2;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.cdp.backend.jvm.ActivityEventFlushStrategy;
import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import app.cash.local.navigation.api.RealCashLocalShortlinkHandler;
import app.cash.local.worker.LocalActivitySetupTeardown;
import app.cash.local.worker.LocalActivitySetupTeardown$Factory$Impl;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor;
import app.cash.passcode.backend.AppLockRecentScreenshotsDisabler;
import app.cash.passcode.backend.AppLockRecentScreenshotsDisabler$special$$inlined$map$1;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.redwood.treehouse.RealTreehouseApp;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.attribution.ActivityTransitionsSideEffectsPerformer;
import com.squareup.cash.attribution.deeplink.DeepLinkOnboardingContextWorker;
import com.squareup.cash.attribution.deeplink.RealDeepLinkAttributionWorker;
import com.squareup.cash.bitcoin.graph.real.BitcoinGraphPrefetch;
import com.squareup.cash.blockers.views.FileBlockerView;
import com.squareup.cash.braze.BrazeSetupTeardownActivityWorker;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.cashapppay.presenters.GrantPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.CustomerStreamingSubscriber;
import com.squareup.cash.clientsync.RealExponentialBackoff;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.sync.ClientSyncSetupTeardown;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator$$ExternalSyntheticLambda3;
import com.squareup.cash.data.ClearAppUserDataApplicationWorker;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactRepository$recents$$inlined$mapItems$1;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.deviceintegrity.DeviceIntegrity$EntryPoint;
import com.squareup.cash.e2ee.signature.RealSignatureManager;
import com.squareup.cash.favorites.presenters.FavoriteUpsellRefresher;
import com.squareup.cash.featureflags.AmplitudeExperiments$QrCodeWidgetTile;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.gps.backend.real.GpsLocationRefresher;
import com.squareup.cash.history.navigation.PaymentActionHandler$Factory$Impl;
import com.squareup.cash.history.navigation.PaymentActionNavigator;
import com.squareup.cash.history.navigation.PaymentActionNavigator$Factory$Impl;
import com.squareup.cash.initialscreenloader.backend.AppVersionCheckerActivityWorker;
import com.squareup.cash.initialscreenloader.backend.AppVersionCheckerActivityWorker$Factory$Impl;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenPreludeNavigator;
import com.squareup.cash.integration.echo.EchoModule$provideEchoWorkerFactory$1;
import com.squareup.cash.integration.echo.EchoModule$provideEchoWorkerFactory$1$create$1;
import com.squareup.cash.localization.LanguageDisclosureSetupTeardown;
import com.squareup.cash.localization.LanguageDisclosureSetupTeardown$Factory$Impl;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.mri.android.MobileRuntimeIntegrityWorker;
import com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.presenters.PersonalizePaymentResourceRefresher;
import com.squareup.cash.pools.backend.real.PoolsRefresher;
import com.squareup.cash.session.backend.RealSessionInitiator;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionManagerKt$special$$inlined$filterIsInstance$1;
import com.squareup.cash.session.backend.SetupTeardownRunner$run$2;
import com.squareup.cash.session.backend.SignedInStateSetupTeardown;
import com.squareup.cash.session.backend.SignoutSideEffectsPerformer;
import com.squareup.cash.session.backend.SignoutSideEffectsPerformer$Factory$Impl;
import com.squareup.cash.shortcut.RealDynamicShortcutManager;
import com.squareup.cash.shortcut.RealDynamicShortcutManager$setup$1$1;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.cash.storage.SandboxingAnalyticsLogger;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.support.backend.real.RealSupportPhoneVerificationMonitor;
import com.squareup.cash.support.backend.real.RealSupportPhoneVerificationMonitor$Factory$Impl;
import com.squareup.cash.support.chat.backend.real.ChatNotificationLifecycleWorker;
import com.squareup.cash.tabprovider.api.TabInfoState;
import com.squareup.cash.tabprovider.real.EmptyTabProvider;
import com.squareup.cash.tabprovider.real.RealTabPublisher;
import com.squareup.cash.task.RepeatTaskAggregator;
import com.squareup.cash.treehouse.android.RegisteredTreehouseApp;
import com.squareup.cash.treehouse.android.configuration.TreehouseStartupSetupTeardown;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.cash.ui.MainActivityDelegate;
import com.squareup.cash.ui.SandboxedActivityContext;
import com.squareup.cash.ui.SandboxedActivitySetupTeardowns;
import com.squareup.cash.ui.qrcodes.widget.QrWidgetRefreshApplicationWorker$work$2$1$1$2;
import com.squareup.cash.userjourneys.data.CompletedJourney;
import com.squareup.cash.userjourneys.tracker.JourneysToUpload;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyReporter;
import com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor;
import com.squareup.cash.userjourneys.tracker.Signal;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.wallet.presenters.CardAppletTileRepository;
import com.squareup.cash.wallet.presenters.LastViewedHeroTag;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.workers.CardAppletWorker;
import com.squareup.protos.cash.blockuserjourneys.api.v1.EntityType;
import com.squareup.protos.cash.blockuserjourneys.api.v1.RecordCompletedJourneyRequest;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.CustomerProfileClientService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import com.squareup.util.coroutines.android.UiActivitySetupTeardown;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.SendingCollector;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.Handshake$Companion$$ExternalSyntheticLambda0;
import okio.ByteString;
import papa.InteractionRuleClient$$ExternalSyntheticLambda0;
import papa.SafeTrace;
import retrofit2.OkHttpCall;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class PreferenceFlow$flow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreferenceFlow$flow$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                PreferenceFlow$flow$1 preferenceFlow$flow$1 = new PreferenceFlow$flow$1((PreferenceFlow) obj2, continuation, 0);
                preferenceFlow$flow$1.L$0 = obj;
                return preferenceFlow$flow$1;
            case 1:
                return new PreferenceFlow$flow$1((RealSessionInitiator) this.L$0, (String) obj2, continuation, 1);
            case 2:
                PreferenceFlow$flow$1 preferenceFlow$flow$12 = new PreferenceFlow$flow$1(continuation, (SignedInStateSetupTeardown) obj2, 2);
                preferenceFlow$flow$12.L$0 = obj;
                return preferenceFlow$flow$12;
            case 3:
                PreferenceFlow$flow$1 preferenceFlow$flow$13 = new PreferenceFlow$flow$1(continuation, (SignoutSideEffectsPerformer) obj2, 3);
                preferenceFlow$flow$13.L$0 = obj;
                return preferenceFlow$flow$13;
            case 4:
                PreferenceFlow$flow$1 preferenceFlow$flow$14 = new PreferenceFlow$flow$1(continuation, (RealDynamicShortcutManager) obj2, 4);
                preferenceFlow$flow$14.L$0 = obj;
                return preferenceFlow$flow$14;
            case 5:
                return new PreferenceFlow$flow$1((StateFlow) this.L$0, (SandboxingAnalyticsLogger) obj2, continuation, 5);
            case 6:
                PreferenceFlow$flow$1 preferenceFlow$flow$15 = new PreferenceFlow$flow$1(continuation, (SandboxJanitor) obj2, 6);
                preferenceFlow$flow$15.L$0 = obj;
                return preferenceFlow$flow$15;
            case 7:
                PreferenceFlow$flow$1 preferenceFlow$flow$16 = new PreferenceFlow$flow$1(continuation, (ChatNotificationLifecycleWorker) obj2, 7);
                preferenceFlow$flow$16.L$0 = obj;
                return preferenceFlow$flow$16;
            case 8:
                PreferenceFlow$flow$1 preferenceFlow$flow$17 = new PreferenceFlow$flow$1(continuation, (EmptyTabProvider) obj2, 8);
                preferenceFlow$flow$17.L$0 = obj;
                return preferenceFlow$flow$17;
            case 9:
                return new PreferenceFlow$flow$1((RealTabPublisher) this.L$0, (TabInfoState) obj2, continuation, 9);
            case 10:
                PreferenceFlow$flow$1 preferenceFlow$flow$18 = new PreferenceFlow$flow$1(continuation, (TreehouseStartupSetupTeardown) obj2, 10);
                preferenceFlow$flow$18.L$0 = obj;
                return preferenceFlow$flow$18;
            case 11:
                return new PreferenceFlow$flow$1((SandboxedActivityContext) this.L$0, (Navigator) obj2, continuation, 11);
            case 12:
                return new PreferenceFlow$flow$1((VariantSandboxedComponent) this.L$0, (ClearAppUserDataApplicationWorker) obj2, continuation, 12);
            case 13:
                PreferenceFlow$flow$1 preferenceFlow$flow$19 = new PreferenceFlow$flow$1(continuation, (RealUserJourneyReporter) obj2, 13);
                preferenceFlow$flow$19.L$0 = obj;
                return preferenceFlow$flow$19;
            case 14:
                return new PreferenceFlow$flow$1((RealUserJourneyReporter) this.L$0, (JourneysToUpload) obj2, continuation, 14);
            case 15:
                return new PreferenceFlow$flow$1((Signal) this.L$0, (RealUserJourneySignalProcessor) obj2, continuation, 15);
            case 16:
                return new PreferenceFlow$flow$1((CardAppletTileRepository) this.L$0, (CardRegistry) obj2, continuation, 16);
            case 17:
                PreferenceFlow$flow$1 preferenceFlow$flow$110 = new PreferenceFlow$flow$1(continuation, (CardAppletWorker) obj2, 17);
                preferenceFlow$flow$110.L$0 = obj;
                return preferenceFlow$flow$110;
            case 18:
                PreferenceFlow$flow$1 preferenceFlow$flow$111 = new PreferenceFlow$flow$1((SharedPreferencesKeyValue) obj2, continuation, 18);
                preferenceFlow$flow$111.L$0 = obj;
                return preferenceFlow$flow$111;
            case 19:
                return new PreferenceFlow$flow$1((Function1) this.L$0, (JobImpl) obj2, continuation, 19);
            case 20:
                return new PreferenceFlow$flow$1((Ref$ObjectRef) obj2, continuation, 20);
            case 21:
                return new PreferenceFlow$flow$1((CoroutinesKt$until$2) this.L$0, (Ref$ObjectRef) obj2, continuation, 21);
            case 22:
                PreferenceFlow$flow$1 preferenceFlow$flow$112 = new PreferenceFlow$flow$1((ChannelFlow) obj2, continuation, 22);
                preferenceFlow$flow$112.L$0 = obj;
                return preferenceFlow$flow$112;
            default:
                return new PreferenceFlow$flow$1((Flow) this.L$0, (SendingCollector) obj2, continuation, 23);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((PreferenceFlow$flow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 3:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 6:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 8:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((PreferenceFlow$flow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 21:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((PreferenceFlow$flow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((PreferenceFlow$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RealContactRepository$recents$$inlined$mapItems$1 recents;
        Object withContext;
        RealTreehouseApp treehouseApp;
        Object lastViewedHeroTag;
        Ref$ObjectRef ref$ObjectRef;
        int i = this.$r8$classId;
        int i2 = 26;
        int i3 = 22;
        int i4 = 13;
        int i5 = 3;
        int i6 = 11;
        int i7 = 12;
        int i8 = 24;
        Object obj2 = this.this$0;
        int i9 = 4;
        final int i10 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                final PreferenceFlow preferenceFlow = (PreferenceFlow) obj2;
                SharedPreferences sharedPreferences = preferenceFlow.preferences;
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final int i12 = 0;
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.squareup.preferences.PreferenceFlow$flow$1$$ExternalSyntheticLambda0
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                            int i13 = i12;
                            ProducerScope producerScope2 = producerScope;
                            Object obj3 = preferenceFlow;
                            switch (i13) {
                                case 0:
                                    PreferenceFlow preferenceFlow2 = (PreferenceFlow) obj3;
                                    if (Intrinsics.areEqual(str, preferenceFlow2.key)) {
                                        ((ProducerCoroutine) producerScope2).mo1159trySendJP2dKIU(preferenceFlow2.valueGetter.invoke());
                                        break;
                                    }
                                    break;
                                default:
                                    SharedPreferencesKeyValue sharedPreferencesKeyValue = (SharedPreferencesKeyValue) obj3;
                                    if (Intrinsics.areEqual(str, sharedPreferencesKeyValue.key)) {
                                        ((ProducerCoroutine) producerScope2).mo1159trySendJP2dKIU(sharedPreferencesKeyValue.reader.read(sharedPreferencesKeyValue));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferences, preferenceFlow.key);
                    InteractionRuleClient$$ExternalSyntheticLambda0 interactionRuleClient$$ExternalSyntheticLambda0 = new InteractionRuleClient$$ExternalSyntheticLambda0(i7, preferenceFlow, onSharedPreferenceChangeListener);
                    this.L$0 = null;
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope, interactionRuleClient$$ExternalSyntheticLambda0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 != 0) {
                    if (i13 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint = DeviceIntegrity$EntryPoint.INITIATE_SESSION;
                this.label = 1;
                Object attestClassicRequest = ((RealSessionInitiator) this.L$0).deviceIntegrityAttester.attestClassicRequest((String) obj2, deviceIntegrity$EntryPoint, this);
                return attestClassicRequest == coroutineSingletons2 ? coroutineSingletons2 : attestClassicRequest;
            case 2:
                SignedInStateSetupTeardown signedInStateSetupTeardown = (SignedInStateSetupTeardown) obj2;
                SessionManager sessionManager = (SessionManager) signedInStateSetupTeardown.sessionManager;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    m.element = sessionManager.getSessionState().getValue();
                    StateFlow sessionState = sessionManager.getSessionState();
                    CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$2 = new CashCdpConfigProvider$1$2(i8, m, signedInStateSetupTeardown);
                    this.L$0 = null;
                    this.label = 1;
                    if (sessionState.collect(cashCdpConfigProvider$1$2, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 3:
                SignoutSideEffectsPerformer signoutSideEffectsPerformer = (SignoutSideEffectsPerformer) obj2;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow buffer$default = FlowKt.buffer$default((Flow) signoutSideEffectsPerformer.signOut, -1, 2);
                    Cache.AnonymousClass1.C00671 c00671 = new Cache.AnonymousClass1.C00671(signoutSideEffectsPerformer, i9);
                    this.L$0 = null;
                    this.label = 1;
                    if (buffer$default.collect(c00671, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                int i16 = 6;
                RealDynamicShortcutManager realDynamicShortcutManager = (RealDynamicShortcutManager) obj2;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    recents = realDynamicShortcutManager.contactRepository.recents(15L);
                    ChannelFlowTransformLatest mapLatest = FlowKt.mapLatest(new RealDynamicShortcutManager$setup$1$1(realDynamicShortcutManager, null), recents);
                    Cache.AnonymousClass1.C00671 c006712 = new Cache.AnonymousClass1.C00671(realDynamicShortcutManager, i16);
                    this.L$0 = null;
                    this.label = 1;
                    if (mapLatest.collect(c006712, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                int i18 = 7;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow stateFlow = (StateFlow) this.L$0;
                    Cache.AnonymousClass1.C00671 c006713 = new Cache.AnonymousClass1.C00671((SandboxingAnalyticsLogger) obj2, i18);
                    this.label = 1;
                    if (stateFlow.collect(c006713, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 6:
                int i20 = 8;
                SandboxJanitor sandboxJanitor = (SandboxJanitor) obj2;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.i("Vacuuming sandboxes", new Object[0]);
                    sandboxJanitor.storageLinker.vacuum();
                    StorageLink storageLink = sandboxJanitor.storageLink;
                    StorageLink.Legacy legacy = StorageLink.Legacy.INSTANCE;
                    if (!storageLink.equals(legacy)) {
                        VariantAppComponent.Impl.ZombieLegacyGraphExtensionImpl zombieLegacyGraphExtensionImpl = new VariantAppComponent.Impl.ZombieLegacyGraphExtensionImpl((VariantAppComponent.Impl) sandboxJanitor.zombieLegacyGraphExtensionFactory);
                        SharedPreferences sharedPreferences2 = (SharedPreferences) zombieLegacyGraphExtensionImpl.provideSharedPreferencesProvider.getValue();
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        Context context = (Context) zombieLegacyGraphExtensionImpl.provideSandboxedContextProvider.getValue();
                        SupportSQLiteOpenHelper supportSQLiteOpenHelper = (SupportSQLiteOpenHelper) zombieLegacyGraphExtensionImpl.provideAccountDatabaseHelperProvider.getValue();
                        OkHttpCall.AnonymousClass1 anonymousClass1 = new OkHttpCall.AnonymousClass1(sharedPreferences2, defaultIoScheduler, context, supportSQLiteOpenHelper);
                        this.L$0 = null;
                        this.label = 1;
                        if (legacy.equals(legacy)) {
                            String databaseName = supportSQLiteOpenHelper.getDatabaseName();
                            if (databaseName == null) {
                                withContext = Unit.INSTANCE;
                            } else {
                                context.deleteDatabase(databaseName);
                                withContext = JobKt.withContext(defaultIoScheduler, new CashApp$onCreate$1(anonymousClass1, null, i20), this);
                                if (withContext != obj3) {
                                    withContext = Unit.INSTANCE;
                                }
                                if (withContext != obj3) {
                                    withContext = Unit.INSTANCE;
                                }
                            }
                        } else {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final ChatNotificationLifecycleWorker chatNotificationLifecycleWorker = (ChatNotificationLifecycleWorker) obj2;
                    StateFlow stateFlow2 = chatNotificationLifecycleWorker.activityLifecycleState;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.support.chat.backend.real.ChatNotificationLifecycleWorker$setup$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj4, Continuation continuation2) {
                            ChatNotificationLifecycleWorker.this.notificationSuppressor.inForeground = ((Lifecycle.State) obj4).isAtLeast(Lifecycle.State.STARTED);
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 1;
                    if (stateFlow2.collect(flowCollector, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 8:
                int i23 = 9;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealTabPublisher realTabPublisher = (RealTabPublisher) ((EmptyTabProvider) obj2).tabPublisher;
                    this.L$0 = null;
                    this.label = 1;
                    Object withContext2 = JobKt.withContext(realTabPublisher.scope.getCoroutineContext(), new PreferenceFlow$flow$1(realTabPublisher, TabInfoState.Onboarding.INSTANCE, null, i23), this);
                    if (withContext2 != obj4) {
                        withContext2 = Unit.INSTANCE;
                    }
                    if (withContext2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                TabInfoState tabInfoState = (TabInfoState) obj2;
                RealTabPublisher realTabPublisher2 = (RealTabPublisher) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BetterNavigator$$ExternalSyntheticLambda3 betterNavigator$$ExternalSyntheticLambda3 = realTabPublisher2.listener;
                    if (betterNavigator$$ExternalSyntheticLambda3 != null) {
                        betterNavigator$$ExternalSyntheticLambda3.invoke(tabInfoState);
                    }
                    StateFlowImpl stateFlowImpl = realTabPublisher2._state;
                    this.label = 1;
                    stateFlowImpl.setValue(tabInfoState);
                    if (Unit.INSTANCE == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                TreehouseStartupSetupTeardown treehouseStartupSetupTeardown = (TreehouseStartupSetupTeardown) obj2;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionManagerKt$special$$inlined$filterIsInstance$1 onAuthenticated = PlatformKt.getOnAuthenticated(treehouseStartupSetupTeardown.sessionManager);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.first(onAuthenticated, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                RegisteredTreehouseApp registeredTreehouseApp = (RegisteredTreehouseApp) ((Map) treehouseStartupSetupTeardown.treehouseApps.getValue()).get("activity");
                if (registeredTreehouseApp != null && (treehouseApp = registeredTreehouseApp.getTreehouseApp()) != null) {
                    treehouseApp.start();
                }
                return Unit.INSTANCE;
            case 11:
                SandboxedActivityContext sandboxedActivityContext = (SandboxedActivityContext) this.L$0;
                MainActivityDelegate mainActivityDelegate = sandboxedActivityContext.mainActivityDelegate;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    WireAdapter wireAdapter = sandboxedActivityContext.setupTeardownsFactory;
                    Navigator navigator = (Navigator) obj2;
                    RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = new RoomDatabase$closeBarrier$1(0, mainActivityDelegate, MainActivityDelegate.class, "activeArgs", "activeArgs()Lapp/cash/broadway/screen/Screen;", 0, 8);
                    navigator.getClass();
                    SandboxedActivitySetupTeardowns.MetroFactory metroFactory = (SandboxedActivitySetupTeardowns.MetroFactory) wireAdapter.adapter;
                    CoroutineContext coroutineContext = (CoroutineContext) metroFactory.uiDispatcher.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) metroFactory.ioDispatcher.invoke();
                    AppMessageSyncer appMessageSyncer = (AppMessageSyncer) metroFactory.appMessageSyncer.invoke();
                    Badger2 badger2 = (Badger2) metroFactory.badger.invoke();
                    ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer = (ActivityTransitionsSideEffectsPerformer) metroFactory.transitionsSideEffectsPerformer.invoke();
                    ChatNotificationLifecycleWorker chatNotificationLifecycleWorker2 = (ChatNotificationLifecycleWorker) metroFactory.chatNotificationLifecycleWorker.invoke();
                    RealDeepLinkAttributionWorker realDeepLinkAttributionWorker = (RealDeepLinkAttributionWorker) metroFactory.deepLinkAttributionWorker.invoke();
                    DeepLinkOnboardingContextWorker deepLinkOnboardingContextWorker = (DeepLinkOnboardingContextWorker) metroFactory.deepLinkOnboardingContextWorker.invoke();
                    SignoutSideEffectsPerformer$Factory$Impl signoutSideEffectsPerformer$Factory$Impl = (SignoutSideEffectsPerformer$Factory$Impl) metroFactory.signoutSideEffectsPerformer.value;
                    FillrInitializer fillrInitializer = (FillrInitializer) metroFactory.fillrInitializer.invoke();
                    RealSessionFlags realSessionFlags = (RealSessionFlags) metroFactory.sessionFlags.invoke();
                    ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer2 = (ActivityTransitionsSideEffectsPerformer) metroFactory.tabProviderActivityWorker.invoke();
                    LanguageDisclosureSetupTeardown$Factory$Impl languageDisclosureSetupTeardown$Factory$Impl = (LanguageDisclosureSetupTeardown$Factory$Impl) metroFactory.languageDisclosureSetupTeardown.value;
                    AppVersionCheckerActivityWorker$Factory$Impl appVersionCheckerActivityWorker$Factory$Impl = (AppVersionCheckerActivityWorker$Factory$Impl) metroFactory.appVersionCheckerActivityWorker.value;
                    AppLockMonitor appLockMonitor = (AppLockMonitor) metroFactory.appLockMonitor.invoke();
                    RealSupportPhoneVerificationMonitor$Factory$Impl realSupportPhoneVerificationMonitor$Factory$Impl = (RealSupportPhoneVerificationMonitor$Factory$Impl) metroFactory.supportPhoneVerificationMonitor.value;
                    LocalActivitySetupTeardown$Factory$Impl localActivitySetupTeardown$Factory$Impl = (LocalActivitySetupTeardown$Factory$Impl) metroFactory.localIoActivitySetupTeardown.value;
                    CustomerStreamingSubscriber customerStreamingSubscriber = (CustomerStreamingSubscriber) metroFactory.customerStreamingSubscriber.invoke();
                    RealSignatureManager realSignatureManager = (RealSignatureManager) metroFactory.signatureManager.invoke();
                    ActivityEventFlushStrategy activityEventFlushStrategy = (ActivityEventFlushStrategy) metroFactory.activityEventFlushStrategy.invoke();
                    PaymentActionNavigator$Factory$Impl paymentActionNavigator$Factory$Impl = (PaymentActionNavigator$Factory$Impl) metroFactory.paymentActionNavigatorFactory.value;
                    RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) metroFactory.featureFlagManager.invoke();
                    RealGlobalConfigManager realGlobalConfigManager = (RealGlobalConfigManager) metroFactory.globalConfigManager.invoke();
                    SignoutSideEffectsPerformer signoutSideEffectsPerformer2 = (SignoutSideEffectsPerformer) metroFactory.eligibilityRefresherSetupTeardown.invoke();
                    ClientSyncSetupTeardown clientSyncSetupTeardown = (ClientSyncSetupTeardown) metroFactory.clientSyncSetupTeardown.invoke();
                    MobileRuntimeIntegrityWorker mobileRuntimeIntegrityWorker = (MobileRuntimeIntegrityWorker) metroFactory.mobileRuntimeIntegrityWorker.invoke();
                    RealSignatureManager realSignatureManager2 = (RealSignatureManager) metroFactory.clientTrustSignalsPublisher.invoke();
                    BitcoinGraphPrefetch bitcoinGraphPrefetch = (BitcoinGraphPrefetch) metroFactory.activitiesWorker.invoke();
                    FavoriteUpsellRefresher favoriteUpsellRefresher = (FavoriteUpsellRefresher) metroFactory.favoriteUpsellRefresher.invoke();
                    RealMainPaymentPadRefresher realMainPaymentPadRefresher = (RealMainPaymentPadRefresher) metroFactory.mainPaymentPadRefresher.invoke();
                    PersonalizePaymentResourceRefresher personalizePaymentResourceRefresher = (PersonalizePaymentResourceRefresher) metroFactory.personalizePaymentResourceRefresher.invoke();
                    GpsLocationRefresher gpsLocationRefresher = (GpsLocationRefresher) metroFactory.gpsLocationRefresher.invoke();
                    BitcoinGraphPrefetch bitcoinGraphPrefetch2 = (BitcoinGraphPrefetch) metroFactory.bitcoinGraphModelPrefetch.invoke();
                    PoolsRefresher poolsRefresher = (PoolsRefresher) metroFactory.poolsRefresher.invoke();
                    RealSignatureManager realSignatureManager3 = (RealSignatureManager) metroFactory.threeDsServiceInitializer.invoke();
                    ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer3 = (ActivityTransitionsSideEffectsPerformer) metroFactory.threeDsAuthenticationWorker.invoke();
                    RepeatTaskAggregator repeatTaskAggregator = (RepeatTaskAggregator) metroFactory.repeatTaskAggregator.invoke();
                    CardAppletWorker cardAppletWorker = (CardAppletWorker) metroFactory.cardAppletWorker.invoke();
                    EchoModule$provideEchoWorkerFactory$1 echoModule$provideEchoWorkerFactory$1 = (EchoModule$provideEchoWorkerFactory$1) metroFactory.echoWorker.invoke();
                    AppLockRecentScreenshotsDisabler appLockRecentScreenshotsDisabler = (AppLockRecentScreenshotsDisabler) metroFactory.appLockRecentScreenshotsDisabler.invoke();
                    BrazeSetupTeardownActivityWorker brazeSetupTeardownActivityWorker = (BrazeSetupTeardownActivityWorker) metroFactory.brazeSetup.invoke();
                    RealFilamentSupportProvider realFilamentSupportProvider = (RealFilamentSupportProvider) metroFactory.filamentSupportProvider.invoke();
                    EmptyTabProvider emptyTabProvider = (EmptyTabProvider) metroFactory.ddaAccountSetupTeardown.invoke();
                    coroutineContext.getClass();
                    coroutineContext2.getClass();
                    badger2.getClass();
                    deepLinkOnboardingContextWorker.getClass();
                    signoutSideEffectsPerformer$Factory$Impl.getClass();
                    fillrInitializer.getClass();
                    realSessionFlags.getClass();
                    languageDisclosureSetupTeardown$Factory$Impl.getClass();
                    appVersionCheckerActivityWorker$Factory$Impl.getClass();
                    realSupportPhoneVerificationMonitor$Factory$Impl.getClass();
                    localActivitySetupTeardown$Factory$Impl.getClass();
                    activityEventFlushStrategy.getClass();
                    paymentActionNavigator$Factory$Impl.getClass();
                    realFeatureFlagManager.getClass();
                    realGlobalConfigManager.getClass();
                    realMainPaymentPadRefresher.getClass();
                    repeatTaskAggregator.getClass();
                    cardAppletWorker.getClass();
                    echoModule$provideEchoWorkerFactory$1.getClass();
                    realFilamentSupportProvider.getClass();
                    FileBlockerView.MetroFactory metroFactory2 = signoutSideEffectsPerformer$Factory$Impl.delegateFactory;
                    Flow flow = (Flow) metroFactory2.vibrator.invoke();
                    FlowStarter flowStarter = (FlowStarter) metroFactory2.permissionManager.invoke();
                    MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1 = (MainActivity$navigatorSwitcher$1) metroFactory2.activityEvents.value;
                    flow.getClass();
                    flowStarter.getClass();
                    mainActivity$navigatorSwitcher$1.getClass();
                    SignoutSideEffectsPerformer signoutSideEffectsPerformer3 = new SignoutSideEffectsPerformer(flow, flowStarter, mainActivity$navigatorSwitcher$1, navigator);
                    LocalActivitySetupTeardown.MetroFactory metroFactory3 = localActivitySetupTeardown$Factory$Impl.delegateFactory;
                    AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) metroFactory3.appForegroundStateProvider.invoke();
                    SessionManager sessionManager2 = (SessionManager) metroFactory3.sessionManager.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) metroFactory3.syncValueReader.invoke();
                    RealCashLocalShortlinkHandler realCashLocalShortlinkHandler = (RealCashLocalShortlinkHandler) metroFactory3.shortlinkHandler.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) metroFactory3.ioDispatcher.invoke();
                    appForegroundStateProvider.getClass();
                    sessionManager2.getClass();
                    syncValueReader.getClass();
                    realCashLocalShortlinkHandler.getClass();
                    coroutineContext3.getClass();
                    LocalActivitySetupTeardown localActivitySetupTeardown = new LocalActivitySetupTeardown(appForegroundStateProvider, sessionManager2, syncValueReader, realCashLocalShortlinkHandler, coroutineContext3, navigator);
                    SimpleActor simpleActor = paymentActionNavigator$Factory$Impl.delegateFactory;
                    Activity activity = (Activity) ((InstanceFactory) simpleActor.scope).value;
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) simpleActor.consumeMessage).invoke();
                    PaymentActionHandler$Factory$Impl paymentActionHandler$Factory$Impl = (PaymentActionHandler$Factory$Impl) ((InstanceFactory) simpleActor.messageQueue).value;
                    PaymentManager paymentManager = (PaymentManager) ((Provider) simpleActor.remainingMessages).invoke();
                    activity.getClass();
                    realRouter$Factory$Impl.getClass();
                    paymentActionHandler$Factory$Impl.getClass();
                    paymentManager.getClass();
                    List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new UiActivitySetupTeardown[]{appMessageSyncer, chatNotificationLifecycleWorker2, signoutSideEffectsPerformer3, customerStreamingSubscriber, localActivitySetupTeardown, activityEventFlushStrategy, new PaymentActionNavigator(activity, realRouter$Factory$Impl, paymentActionHandler$Factory$Impl, paymentManager, navigator, roomDatabase$closeBarrier$1), realGlobalConfigManager, signoutSideEffectsPerformer2, clientSyncSetupTeardown, appLockRecentScreenshotsDisabler});
                    EchoModule$provideEchoWorkerFactory$1$create$1 echoModule$provideEchoWorkerFactory$1$create$1 = new EchoModule$provideEchoWorkerFactory$1$create$1();
                    LanguageDisclosureSetupTeardown.MetroFactory metroFactory4 = languageDisclosureSetupTeardown$Factory$Impl.delegateFactory;
                    CustomerProfileClientService customerProfileClientService = (CustomerProfileClientService) metroFactory4.appService.invoke();
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) metroFactory4.cashAppLiteGate.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) metroFactory4.database.invoke();
                    RealInitialScreenPreludeNavigator realInitialScreenPreludeNavigator = (RealInitialScreenPreludeNavigator) metroFactory4.initialScreenPreludeNavigator.invoke();
                    KeyValue keyValue = (KeyValue) metroFactory4.isLanguageDisclosureAcceptancePending.invoke();
                    RealLocaleManager realLocaleManager = (RealLocaleManager) metroFactory4.localeManager.invoke();
                    SessionManager sessionManager3 = (SessionManager) metroFactory4.sessionManager.invoke();
                    customerProfileClientService.getClass();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                    cashAccountDatabaseImpl.getClass();
                    realInitialScreenPreludeNavigator.getClass();
                    keyValue.getClass();
                    realLocaleManager.getClass();
                    sessionManager3.getClass();
                    LanguageDisclosureSetupTeardown languageDisclosureSetupTeardown = new LanguageDisclosureSetupTeardown(customerProfileClientService, cashAppLiteReleaseModule$$ExternalSyntheticLambda0, cashAccountDatabaseImpl, realInitialScreenPreludeNavigator, keyValue, realLocaleManager, sessionManager3, navigator);
                    GrantPresenter.MetroFactory metroFactory5 = appVersionCheckerActivityWorker$Factory$Impl.delegateFactory;
                    MoshiPreference moshiPreference = (MoshiPreference) metroFactory5.blockersDataNavigator.invoke();
                    AppService appService = (AppService) metroFactory5.multiBlockerFacilitator.invoke();
                    RealInitialScreenPreludeNavigator realInitialScreenPreludeNavigator2 = (RealInitialScreenPreludeNavigator) metroFactory5.analytics.invoke();
                    MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$12 = (MainActivity$navigatorSwitcher$1) metroFactory5.activityEvents.value;
                    com.squareup.util.coroutines.Signal signal = (com.squareup.util.coroutines.Signal) metroFactory5.blockerFlowAnalytics.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) metroFactory5.blockersHelperFactory.invoke();
                    OpenTheAppUserJourney openTheAppUserJourney = (OpenTheAppUserJourney) metroFactory5.blockerActionUriDecoder.invoke();
                    moshiPreference.getClass();
                    appService.getClass();
                    realInitialScreenPreludeNavigator2.getClass();
                    mainActivity$navigatorSwitcher$12.getClass();
                    signal.getClass();
                    coroutineContext4.getClass();
                    openTheAppUserJourney.getClass();
                    AppVersionCheckerActivityWorker appVersionCheckerActivityWorker = new AppVersionCheckerActivityWorker(moshiPreference, appService, realInitialScreenPreludeNavigator2, mainActivity$navigatorSwitcher$12, signal, coroutineContext4, navigator, openTheAppUserJourney);
                    LocalActivitySetupTeardown.MetroFactory metroFactory6 = realSupportPhoneVerificationMonitor$Factory$Impl.delegateFactory;
                    RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory6.appForegroundStateProvider.invoke();
                    RealInitialScreenPreludeNavigator realInitialScreenPreludeNavigator3 = (RealInitialScreenPreludeNavigator) metroFactory6.sessionManager.invoke();
                    SessionManager sessionManager4 = (SessionManager) metroFactory6.syncValueReader.invoke();
                    RealAppLockState realAppLockState = (RealAppLockState) metroFactory6.shortlinkHandler.invoke();
                    SyncValueReader syncValueReader2 = (SyncValueReader) metroFactory6.ioDispatcher.invoke();
                    realRouter$Factory$Impl2.getClass();
                    realInitialScreenPreludeNavigator3.getClass();
                    sessionManager4.getClass();
                    realAppLockState.getClass();
                    syncValueReader2.getClass();
                    List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new IoActivitySetupTeardown[]{echoModule$provideEchoWorkerFactory$1$create$1, badger2, activityTransitionsSideEffectsPerformer, realDeepLinkAttributionWorker, deepLinkOnboardingContextWorker, fillrInitializer, realSessionFlags, activityTransitionsSideEffectsPerformer2, languageDisclosureSetupTeardown, appVersionCheckerActivityWorker, appLockMonitor, new RealSupportPhoneVerificationMonitor(navigator, realRouter$Factory$Impl2, realInitialScreenPreludeNavigator3, sessionManager4, realAppLockState, syncValueReader2), realSignatureManager, realFeatureFlagManager, mobileRuntimeIntegrityWorker, realSignatureManager2, bitcoinGraphPrefetch, favoriteUpsellRefresher, realMainPaymentPadRefresher, personalizePaymentResourceRefresher, gpsLocationRefresher, bitcoinGraphPrefetch2, poolsRefresher, realSignatureManager3, activityTransitionsSideEffectsPerformer3, repeatTaskAggregator, cardAppletWorker, realFilamentSupportProvider, brazeSetupTeardownActivityWorker, emptyTabProvider});
                    listOf.getClass();
                    listOf2.getClass();
                    SandboxedActivitySetupTeardowns sandboxedActivitySetupTeardowns = new SandboxedActivitySetupTeardowns(new Pair[]{new Pair(coroutineContext, new Handshake$Companion$$ExternalSyntheticLambda0(listOf, 1)), new Pair(coroutineContext2, new Handshake$Companion$$ExternalSyntheticLambda0(listOf2, 1))});
                    Lifecycle lifecycle = ((MainActivity) mainActivityDelegate).getLifecycle();
                    this.label = 1;
                    Object coroutineScope = JobKt.coroutineScope(new SetupTeardownRunner$run$2(sandboxedActivitySetupTeardowns, lifecycle, (Continuation) null), this);
                    if (coroutineScope != obj5) {
                        coroutineScope = Unit.INSTANCE;
                    }
                    if (coroutineScope == obj5) {
                        return obj5;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new AppLockRecentScreenshotsDisabler$special$$inlined$map$1(((RealFeatureFlagManager) ((FeatureFlagManager) ((VariantSandboxedComponent.Impl) variantSandboxedComponent).realFeatureFlagManagerProvider.getValue())).peekValues(AmplitudeExperiments$QrCodeWidgetTile.INSTANCE), i5));
                    QrWidgetRefreshApplicationWorker$work$2$1$1$2 qrWidgetRefreshApplicationWorker$work$2$1$1$2 = new QrWidgetRefreshApplicationWorker$work$2$1$1$2(variantSandboxedComponent, (ClearAppUserDataApplicationWorker) obj2, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(distinctUntilChanged, qrWidgetRefreshApplicationWorker$work$2$1$1$2, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                RealUserJourneyReporter realUserJourneyReporter = (RealUserJourneyReporter) obj2;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelAsFlow receiveAsFlow = FlowKt.receiveAsFlow(((RealUserJourneySignalProcessor) realUserJourneyReporter.userJourneySignalProcessor).journeysToUpload);
                    CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$22 = new CashCdpConfigProvider$1$2(i2, coroutineScope2, realUserJourneyReporter);
                    this.L$0 = null;
                    this.label = 1;
                    if (receiveAsFlow.collect(cashCdpConfigProvider$1$22, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealUserJourneyReporter realUserJourneyReporter2 = (RealUserJourneyReporter) this.L$0;
                    JourneysToUpload journeysToUpload = (JourneysToUpload) obj2;
                    this.label = 1;
                    int i31 = RealUserJourneyReporter.$r8$clinit;
                    List list = journeysToUpload.journeys;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        CompletedJourney completedJourney = (CompletedJourney) it.next();
                        boolean z = journeysToUpload.isRetry;
                        completedJourney.getClass();
                        EntityType entityType = EntityType.ENTITY_TYPE_CASH_CUSTOMER;
                        String entityId = completedJourney.getJourney().getContext().getEntityId();
                        String sessionId = completedJourney.getJourney().getContext().getSessionId();
                        String appToken = completedJourney.getJourney().getContext().getAppToken();
                        String lowerCase = completedJourney.getJourney().getContext().getPlatformName().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        String platformVersion = completedJourney.getJourney().getContext().getPlatformVersion();
                        String deviceModel = completedJourney.getJourney().getContext().getDeviceModel();
                        String appName = completedJourney.getJourney().getContext().getAppName();
                        String appVersion = completedJourney.getJourney().getContext().getAppVersion();
                        String locale = completedJourney.getJourney().getContext().getLocale();
                        String uuid = completedJourney.getJourney().getId().toString();
                        String label = completedJourney.getJourney().getName().getLabel();
                        long createdAtEpoch = completedJourney.getJourney().getCreatedAtEpoch();
                        long durationRealtime = completedJourney.getTerminationContext().getDurationRealtime();
                        long durationRealtime2 = completedJourney.getTerminationContext().getDurationRealtime() + completedJourney.getJourney().getCreatedAtEpoch();
                        String variant = completedJourney.getJourney().getVariant();
                        Set<String> tags = completedJourney.getJourney().getTags();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(tags, 10));
                        Iterator<T> it2 = tags.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(DBUtil.kebabCase((String) it2.next()));
                        }
                        Set<String> frustrationSignals = completedJourney.getJourney().getFrustrationSignals();
                        Iterator it3 = it;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(frustrationSignals, 10));
                        Iterator<T> it4 = frustrationSignals.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(DBUtil.kebabCase((String) it4.next()));
                        }
                        Set<String> frictionSignals = completedJourney.getJourney().getFrictionSignals();
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(frictionSignals, 10));
                        Iterator<T> it5 = frictionSignals.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(DBUtil.kebabCase((String) it5.next()));
                        }
                        arrayList.add(new RecordCompletedJourneyRequest(label, uuid, entityType, entityId, appToken, lowerCase, platformVersion, deviceModel, appName, appVersion, locale, Long.valueOf(createdAtEpoch), Long.valueOf(durationRealtime2), Long.valueOf(durationRealtime), completedJourney.getTerminationContext().getOutcome(), completedJourney.getTerminationContext().getTerminationReason(), variant, arrayList3, arrayList4, arrayList2, sessionId, Boolean.valueOf(z), ByteString.EMPTY));
                        it = it3;
                    }
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        ((RecordCompletedJourneyRequest) it6.next()).getClass();
                    }
                    Object doRequest = realUserJourneyReporter2.doRequest(arrayList, journeysToUpload, new RealExponentialBackoff(RealUserJourneyReporter.RETRY_BASE_INTERVAL, RealUserJourneyReporter.RETRY_MAX_INTERVAL), this);
                    if (doRequest != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        doRequest = Unit.INSTANCE;
                    }
                    if (doRequest == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                Signal signal2 = (Signal) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = ((Signal.Start) signal2).timeout;
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(j, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((RealUserJourneySignalProcessor) obj2).add(new Signal.TimeOutJourney(((Signal.Start) signal2).id));
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardAppletTileRepository cardAppletTileRepository = (CardAppletTileRepository) this.L$0;
                    this.label = 1;
                    lastViewedHeroTag = ((RealCardAppletTileRepository) cardAppletTileRepository).lastViewedHeroTag(this);
                    if (lastViewedHeroTag == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    lastViewedHeroTag = obj;
                }
                LastViewedHeroTag lastViewedHeroTag2 = (LastViewedHeroTag) lastViewedHeroTag;
                if (lastViewedHeroTag2 != null) {
                    CardRegistry cardRegistry = (CardRegistry) obj2;
                    CardSchemeViewModel.Module.HeroTag heroTag = lastViewedHeroTag2.heroTag;
                    int i34 = lastViewedHeroTag2.page;
                    if (!cardRegistry.activeHeroTagStateOwned) {
                        cardRegistry.activeHeroTagStateOwned = true;
                        cardRegistry.activeHeroTag$delegate.setValue(heroTag);
                        cardRegistry.activeHeroTagPage$delegate.setValue(Integer.valueOf(i34));
                    }
                }
                return Unit.INSTANCE;
            case 17:
                CardAppletWorker cardAppletWorker2 = (CardAppletWorker) obj2;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(cardAppletWorker2.sessionManager.getSessionState(), i3);
                    Cache.AnonymousClass1 anonymousClass12 = new Cache.AnonymousClass1(cardAppletWorker2, continuation, i6);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, anonymousClass12, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                final SharedPreferencesKeyValue sharedPreferencesKeyValue = (SharedPreferencesKeyValue) obj2;
                SharedPreferences sharedPreferences3 = sharedPreferencesKeyValue.preferences;
                final ProducerScope producerScope2 = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.squareup.preferences.PreferenceFlow$flow$1$$ExternalSyntheticLambda0
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences22, String str) {
                            int i132 = i10;
                            ProducerScope producerScope22 = producerScope2;
                            Object obj32 = sharedPreferencesKeyValue;
                            switch (i132) {
                                case 0:
                                    PreferenceFlow preferenceFlow2 = (PreferenceFlow) obj32;
                                    if (Intrinsics.areEqual(str, preferenceFlow2.key)) {
                                        ((ProducerCoroutine) producerScope22).mo1159trySendJP2dKIU(preferenceFlow2.valueGetter.invoke());
                                        break;
                                    }
                                    break;
                                default:
                                    SharedPreferencesKeyValue sharedPreferencesKeyValue2 = (SharedPreferencesKeyValue) obj32;
                                    if (Intrinsics.areEqual(str, sharedPreferencesKeyValue2.key)) {
                                        ((ProducerCoroutine) producerScope22).mo1159trySendJP2dKIU(sharedPreferencesKeyValue2.reader.read(sharedPreferencesKeyValue2));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    sharedPreferences3.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener2);
                    onSharedPreferenceChangeListener2.onSharedPreferenceChanged(sharedPreferences3, sharedPreferencesKeyValue.key);
                    InteractionRuleClient$$ExternalSyntheticLambda0 interactionRuleClient$$ExternalSyntheticLambda02 = new InteractionRuleClient$$ExternalSyntheticLambda0(i4, sharedPreferencesKeyValue, onSharedPreferenceChangeListener2);
                    this.L$0 = null;
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope2, interactionRuleClient$$ExternalSyntheticLambda02, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function1 function1 = (Function1) this.L$0;
                    this.label = 1;
                    if (function1.invoke(this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((JobImpl) obj2).cancel(null);
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj2;
                    try {
                        this.L$0 = ref$ObjectRef2;
                        this.label = 1;
                        JobKt.awaitCancellation(this);
                        return coroutineSingletons18;
                    } catch (Throwable th) {
                        th = th;
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                } else {
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) this.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                Teardown teardown = (Teardown) ref$ObjectRef.element;
                if (teardown != null) {
                    teardown.teardown();
                }
                throw th;
            case 21:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutinesKt$until$2 coroutinesKt$until$2 = (CoroutinesKt$until$2) this.L$0;
                    Object obj6 = ((Ref$ObjectRef) obj2).element;
                    this.label = 1;
                    if (coroutinesKt$until$2.invoke(obj6, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                ProducerScope producerScope3 = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (((ChannelFlow) obj2).collectTo(producerScope3, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i40 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = this.label;
                if (i41 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((Flow) this.L$0).collect((SendingCollector) obj2, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i41 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreferenceFlow$flow$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreferenceFlow$flow$1(Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
