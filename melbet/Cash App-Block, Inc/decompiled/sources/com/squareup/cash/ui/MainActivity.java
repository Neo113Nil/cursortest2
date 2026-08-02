package com.squareup.cash.ui;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.splashscreen.SplashScreen$Impl;
import androidx.core.splashscreen.SplashScreen$Impl31;
import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.Lifecycle;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda2;
import app.cash.molecule.PlatformKt;
import app.cash.util.leakdetector.api.LeakDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.CashApp;
import com.squareup.cash.R;
import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.account.backend.AccountSwitchScreenStateRelay;
import com.squareup.cash.attribution.deeplink.DeepLinkCompletableNavigatorKt$DeepLinkCompletableNavigator$1;
import com.squareup.cash.cdf.app.AppLifecycleRestore;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim$$ExternalSyntheticLambda0;
import com.squareup.cash.core.navigationcontainer.api.scrim.ScrimScreen;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AndroidProductionJankMonitoring;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourneyActivity;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.viewcontainer.ProductionViewContainer;
import com.squareup.cash.intent.RealIntentHandler;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.localization.LanguageManagerKt;
import com.squareup.cash.localization.RealLanguageManager;
import com.squareup.cash.mooncake.themes.HasThemeInfo;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.performance.JankStatsAggregator;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.support.screenshot.ScreenshotEventReceiver;
import com.squareup.cash.support.screenshot.ScreenshotEventReceiver$Factory$Impl;
import com.squareup.cash.support.screenshot.ScreenshotView;
import com.squareup.cash.ui.gcm.DebugPushPayloadStore;
import com.squareup.cash.util.konfetti.HasKonfetti;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.thing.Thing;
import com.squareup.util.android.ActivityResult;
import com.squareup.util.android.bundle.BundleDumper;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import nl.dionsegijn.konfetti.KonfettiView;
import okhttp3.ConnectionPool;
import okio.Path$$ExternalSyntheticBUOutline0;
import timber.log.Timber;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity implements UiContainer, HasThemeInfo, HasKonfetti, MainActivityDelegate, OpenTheAppUserJourneyActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public KonfettiView _konfettiView;
    public AccountSwitchScreenStateRelay accountSwitchScreenStateRelay;
    public ContextScope activityCoroutineScope;
    public AcceptableScrim activityScrim;
    public BugsnagClient bugSnag;
    public CashNavigationLogger cashNaviationLogger;
    public ViewGroup container;
    public ErrorReporter errorReporter;
    public SharedPreferencesKeyValue fpsCounterEnabled;
    public boolean isContentReady;
    public RealLanguageManager languageManager;
    public MainContainerDelegate mainContainerDelegate;
    public RealObservabilityManager observabilityManager;
    public PermissionChecker permissionChecker;
    public LeakDetector refWatcher;
    public boolean restoringState;
    public StateFlow sandboxedActivityContextFlow;
    public SessionManager sessionManager;
    public ThemeInfo themeInfo;
    public StandaloneCoroutine themeInfoJob;
    public ProductionViewContainer viewContainer;
    public final SharedFlowImpl activityEvents = FlowKt.MutableSharedFlow$default(1, 50, null, 4);
    public final SharedFlowImpl activityResults = FlowKt.MutableSharedFlow$default(0, 50, null, 5);
    public final SharedFlowImpl unhandledIntents = FlowKt.MutableSharedFlow$default(0, 50, null, 5);
    public final WindowFlags windowFlags = new WindowFlags();
    public final MainActivity$navigatorSwitcher$1 navigatorSwitcher = new MainActivity$navigatorSwitcher$1(this);
    public final RealScreenRecordingDetector screenRecordingDetector = new RealScreenRecordingDetector(this);
    public final MainActivity$$ExternalSyntheticLambda6 unlockedNavigator = new Navigator() { // from class: com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda6
        @Override // app.cash.broadway.navigation.Navigator
        public final void goTo(Screen screen) {
            int i = MainActivity.$r8$clinit;
            screen.getClass();
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                mainActivity.runOnUiThread(new MainActivity$$ExternalSyntheticLambda8(0, mainActivity, screen));
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("Attempting to navigate within a destroyed activity.");
            }
        }
    };

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        VariantAppComponent.Impl impl = (VariantAppComponent.Impl) ((CashApp) applicationContext).appComponent();
        impl.getClass();
        ProductionViewContainer productionViewContainer = (ProductionViewContainer) impl.productionViewContainerProvider.getValue();
        productionViewContainer.getClass();
        this.viewContainer = productionViewContainer;
        SessionManager sessionManager = (SessionManager) impl.doubleWriteSessionManagerProvider.getValue();
        sessionManager.getClass();
        this.sessionManager = sessionManager;
        PermissionChecker permissionChecker = (PermissionChecker) impl.androidPermissionCheckerProvider.getValue();
        permissionChecker.getClass();
        this.permissionChecker = permissionChecker;
        this.bugSnag = impl.bugsnagClientInstance;
        this.errorReporter = (ErrorReporter) impl.realErrorReporterProvider.invoke();
        this.refWatcher = impl.refWatcherInstance;
        RealObservabilityManager realObservabilityManager = (RealObservabilityManager) impl.realObservabilityManagerProvider.getValue();
        realObservabilityManager.getClass();
        this.observabilityManager = realObservabilityManager;
        RealLanguageManager realLanguageManager = (RealLanguageManager) impl.realLanguageManagerProvider.getValue();
        realLanguageManager.getClass();
        this.languageManager = realLanguageManager;
        CashNavigationLogger cashNavigationLogger = (CashNavigationLogger) impl.cashNavigationLoggerProvider.getValue();
        cashNavigationLogger.getClass();
        this.cashNaviationLogger = cashNavigationLogger;
        SharedPreferences sharedPreferences = (SharedPreferences) impl.provideSharedPreferencesProvider.getValue();
        sharedPreferences.getClass();
        this.fpsCounterEnabled = Room.BooleanKeyValue(sharedPreferences, "fps_counter_enabled", false, false);
        RealLanguageManager realLanguageManager2 = this.languageManager;
        if (realLanguageManager2 != null) {
            super.attachBaseContext(LanguageManagerKt.wrapContext(realLanguageManager2, context));
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("languageManager");
            throw null;
        }
    }

    public final Thing.ThingContextThemeWrapper createContainerContext() {
        return new Thing.ThingContextThemeWrapper(this, R.style.Theme_Cash_Default, new Thing(this, null));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        try {
            return super.dispatchKeyEvent(keyEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final Collection dumpBackStack() {
        MainContainerDelegate mainContainerDelegate = this.mainContainerDelegate;
        if (mainContainerDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
            throw null;
        }
        SimpleActor simpleActor = mainContainerDelegate.cashNavigator.navigator;
        Object obj = ((LinkedHashMap) simpleActor.messageQueue).get((Enum) simpleActor.consumeMessage);
        obj.getClass();
        List unmodifiableList = Collections.unmodifiableList(((BetterNavigator) obj).backStack.getScreenEntries());
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public final StateFlow getSandboxedActivityContextFlow() {
        StateFlow stateFlow = this.sandboxedActivityContextFlow;
        if (stateFlow != null) {
            return stateFlow;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sandboxedActivityContextFlow");
        throw null;
    }

    @Override // com.squareup.cash.mooncake.themes.HasThemeInfo
    public final ThemeInfo getThemeInfo() {
        ThemeInfo themeInfo = this.themeInfo;
        if (themeInfo != null) {
            return themeInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("themeInfo");
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        StateFlowKt.emitOrThrow(this.activityResults, new ActivityResult(i, i2, intent));
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        MainContainerDelegate mainContainerDelegate = this.mainContainerDelegate;
        if (mainContainerDelegate != null) {
            return mainContainerDelegate.cashNavigator.onBack();
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getOnBackPressedDispatcher().hasEnabledCallbacks || !onBack()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        updateThemeInfo();
        MainContainerDelegate mainContainerDelegate = this.mainContainerDelegate;
        if (mainContainerDelegate != null) {
            mainContainerDelegate.recreateUi(createContainerContext(), true);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(!r0.containsKey("sandboxId") ? null : java.lang.Long.valueOf(r0.getLong("sandboxId")), r10.storageLink.getId()) != false) goto L30;
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        AccountSwitchScreenStateRelay accountSwitchScreenStateRelay;
        Parcelable parcelable;
        Bundle bundle2 = bundle;
        ContextScope MainScope = JobKt.MainScope();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        this.activityCoroutineScope = JobKt.plus(new CoroutineName("MainActivity"), JobKt.plus(MainDispatcherLoader.dispatcher.immediate, MainScope));
        Continuation continuation = null;
        if (bundle2 == null || (accountSwitchScreenStateRelay = (AccountSwitchScreenStateRelay) bundle2.getParcelable("accountSwitchScreenStateRelay")) == null) {
            accountSwitchScreenStateRelay = new AccountSwitchScreenStateRelay(null, null, null);
        }
        this.accountSwitchScreenStateRelay = accountSwitchScreenStateRelay;
        int i = 0;
        AcceptableScrim acceptableScrim = new AcceptableScrim(new MainActivity$$ExternalSyntheticLambda0(this, i));
        acceptableScrim.activeScrim.setValue(bundle2 != null ? (ScrimScreen) bundle2.getParcelable("activeScrim") : null);
        this.activityScrim = acceptableScrim;
        if (Intrinsics.areEqual(getIntent().getAction(), "android.nfc.action.NDEF_DISCOVERED")) {
            setIntent(getIntent().cloneFilter());
        }
        SplashScreen$Impl splashScreen$Impl31 = Build.VERSION.SDK_INT >= 31 ? new SplashScreen$Impl31(this) : new SplashScreen$Impl(this);
        splashScreen$Impl31.install();
        int i2 = 1;
        splashScreen$Impl31.setKeepOnScreenCondition(new Path$$ExternalSyntheticBUOutline0(1));
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        StateFlow stateFlow = (StateFlow) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new MainActivity$updateThemeInfo$1(this, continuation, i2));
        ContextScope contextScope = this.activityCoroutineScope;
        if (contextScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityCoroutineScope");
            throw null;
        }
        this.sandboxedActivityContextFlow = StateFlowKt.stateInScoped(stateFlow, contextScope, new MoleculeKt$$ExternalSyntheticLambda2(7, this, ref$BooleanRef));
        SandboxedActivityContext sandboxedActivityContext = (SandboxedActivityContext) getSandboxedActivityContextFlow().getValue();
        sandboxedActivityContext.getClass();
        if (bundle2 != null) {
        }
        bundle2 = null;
        if (bundle2 == null) {
            splashScreen$Impl31.setKeepOnScreenCondition(new MainActivity$$ExternalSyntheticLambda3(this));
            splashScreen$Impl31.setOnExitAnimationListener(new MainActivity$$ExternalSyntheticLambda3(this));
        } else {
            splashScreen$Impl31.setKeepOnScreenCondition(new Path$$ExternalSyntheticBUOutline0(2));
        }
        super.onCreate(bundle2);
        if (bundle2 != null) {
            bundle2.setClassLoader(getClass().getClassLoader());
        }
        Window window = getWindow();
        Trace.setDecorFitsSystemWindows(window, false);
        window.setSoftInputMode(16);
        if (bundle2 != null && (parcelable = bundle2.getParcelable("tabFlags")) != null) {
            RealSessionFlags realSessionFlags = sandboxedActivityContext.sessionFlags;
            if (!(parcelable instanceof Bundle)) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return;
            }
            StateFlowImpl stateFlowImpl = realSessionFlags.showModernTabs;
            Bundle bundle3 = (Bundle) parcelable;
            Boolean valueOf = Boolean.valueOf(bundle3.getBoolean("showModernTabs"));
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, valueOf);
            StateFlowImpl stateFlowImpl2 = realSessionFlags.moneybotHome;
            Boolean valueOf2 = Boolean.valueOf(bundle3.getBoolean("moneybotHome"));
            stateFlowImpl2.getClass();
            stateFlowImpl2.updateState(null, valueOf2);
            StateFlowImpl stateFlowImpl3 = realSessionFlags.moneybotRespectSystemAppearance;
            Boolean valueOf3 = Boolean.valueOf(bundle3.getBoolean("moneybotRespectSystemAppearance"));
            stateFlowImpl3.getClass();
            stateFlowImpl3.updateState(null, valueOf3);
        }
        updateThemeInfo();
        Timber.Forest forest = Timber.Forest;
        forest.i("Main Activity Created", new Object[0]);
        ProductionViewContainer productionViewContainer = this.viewContainer;
        if (productionViewContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewContainer");
            throw null;
        }
        FeatureFlagManager featureFlagManager = ((SandboxedActivityContext) getSandboxedActivityContextFlow().getValue()).featureFlagManager;
        StateFlowKt.mapState(getSandboxedActivityContextFlow(), new MainActivity$$ExternalSyntheticLambda5(i));
        MainActivity$$ExternalSyntheticLambda6 mainActivity$$ExternalSyntheticLambda6 = this.unlockedNavigator;
        mainActivity$$ExternalSyntheticLambda6.getClass();
        FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(this);
        frameLayout.addView(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(this);
        RealScreenshotManager realScreenshotManager = productionViewContainer.screenshotManager;
        ScreenshotEventReceiver$Factory$Impl screenshotEventReceiver$Factory$Impl = productionViewContainer.screenshotEventReceiverFactory;
        MainActivity$$ExternalSyntheticLambda0 mainActivity$$ExternalSyntheticLambda0 = new MainActivity$$ExternalSyntheticLambda0(this, i2);
        CheckDepositAmountPresenter.MetroFactory metroFactory = screenshotEventReceiver$Factory$Impl.delegateFactory;
        RealScreenshotManager realScreenshotManager2 = (RealScreenshotManager) metroFactory.analytics.getValue();
        Analytics analytics = (Analytics) metroFactory.blockerFlowAnalytics.invoke();
        realScreenshotManager2.getClass();
        analytics.getClass();
        frameLayout3.addView(new ScreenshotView(this, realScreenshotManager, new ScreenshotEventReceiver(mainActivity$$ExternalSyntheticLambda6, mainActivity$$ExternalSyntheticLambda0, realScreenshotManager2, analytics), productionViewContainer.toaster));
        frameLayout.addView(frameLayout3);
        this.container = frameLayout2;
        KonfettiView konfettiView = new KonfettiView(this);
        konfettiView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        konfettiView.setVisibility(8);
        konfettiView.setOnParticleSystemUpdateListener(new ConnectionPool((Object) konfettiView));
        this._konfettiView = konfettiView;
        MainContainerDelegate createContainer = sandboxedActivityContext.createContainer(createContainerContext());
        this.mainContainerDelegate = createContainer;
        ViewGroup viewGroup = this.container;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
            throw null;
        }
        viewGroup.addView(createContainer.containerAndOverlay);
        ViewGroup viewGroup2 = this.container;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
            throw null;
        }
        KonfettiView konfettiView2 = this._konfettiView;
        if (konfettiView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_konfettiView");
            throw null;
        }
        viewGroup2.addView(konfettiView2);
        ViewGroup viewGroup3 = this.container;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
            throw null;
        }
        AcceptableScrim acceptableScrim2 = this.activityScrim;
        if (acceptableScrim2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityScrim");
            throw null;
        }
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new AcceptableScrim$$ExternalSyntheticLambda0(acceptableScrim2), true, -1506511823));
        viewGroup3.addView(composeView);
        MainContainerDelegate mainContainerDelegate = this.mainContainerDelegate;
        if (mainContainerDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
            throw null;
        }
        if (mainContainerDelegate.cashNavigator._needsColdStartNavigation) {
            ViewGroup viewGroup4 = this.container;
            if (viewGroup4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("container");
                throw null;
            }
            viewGroup4.setVisibility(4);
            MainContainerDelegate mainContainerDelegate2 = this.mainContainerDelegate;
            if (mainContainerDelegate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
                throw null;
            }
            Intent intent = getIntent();
            intent.getClass();
            mainContainerDelegate2.goToColdStart(new InitialScreenPlaceholder(new InitialScreenPlaceholder.TriggeredBy.ActivityLaunch(intent)));
        } else {
            forest.i("State restored", new Object[0]);
            window.setBackgroundDrawable(new ColorDrawable(getColor(R.color.splash_background)));
            this.restoringState = true;
            ((DeepLinkCompletableNavigatorKt$DeepLinkCompletableNavigator$1) sandboxedActivityContext.deepLinkCompletableNavigator).complete(((MainActivity) sandboxedActivityContext.mainActivityDelegate).unlockedNavigator);
        }
        ActivityEvent activityEvent = ActivityEvent.CREATE;
        SharedFlowImpl sharedFlowImpl = this.activityEvents;
        StateFlowKt.emitOrThrow(sharedFlowImpl, activityEvent);
        sandboxedActivityContext.initWorkers();
        String string2 = getString(R.string.app_name);
        string2.getClass();
        setTaskDescription(new ActivityManager.TaskDescription(string2, (Bitmap) null, getColor(R.color.slightly_dark_green_normal)));
        ContextScope contextScope2 = this.activityCoroutineScope;
        if (contextScope2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityCoroutineScope");
            throw null;
        }
        RealObservabilityManager realObservabilityManager = this.observabilityManager;
        if (realObservabilityManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("observabilityManager");
            throw null;
        }
        SharedPreferencesKeyValue sharedPreferencesKeyValue = this.fpsCounterEnabled;
        if (sharedPreferencesKeyValue == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fpsCounterEnabled");
            throw null;
        }
        boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((SandboxedActivityContext) getSandboxedActivityContextFlow().getValue()).featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AndroidProductionJankMonitoring.INSTANCE)).enabled();
        MainContainerDelegate mainContainerDelegate3 = this.mainContainerDelegate;
        if (mainContainerDelegate3 != null) {
            new JankStatsAggregator(this, contextScope2, realObservabilityManager, enabled, sharedPreferencesKeyValue, this.activityResults, sharedFlowImpl, (DerivedStateFlow) mainContainerDelegate3.cashNavigator.navigator.remainingMessages);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Timber.Forest.i("Main Activity Destroyed", new Object[0]);
        ContextScope contextScope = this.activityCoroutineScope;
        if (contextScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityCoroutineScope");
            throw null;
        }
        JobKt.cancel(contextScope, (CancellationException) null);
        StateFlowKt.emitOrThrow(this.activityEvents, ActivityEvent.DESTROY);
    }

    @Override // android.app.Activity
    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        Application application = getApplication();
        application.getClass();
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        Iterator it = ((List) ((VariantAppComponent.Impl) ((CashApp) applicationContext).appComponent()).provideKeyboardShortcutsProvider.getValue()).iterator();
        if (!it.hasNext()) {
            return false;
        }
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(it.next());
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Timber.Forest.i("Main Activity New Intent", new Object[0]);
        SandboxedActivityContext sandboxedActivityContext = (SandboxedActivityContext) getSandboxedActivityContextFlow().getValue();
        setIntent(intent);
        MainContainerDelegate mainContainerDelegate = this.mainContainerDelegate;
        if (mainContainerDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
            throw null;
        }
        if (((DerivedStateFlow) mainContainerDelegate.cashNavigator.navigator.remainingMessages).getValue() instanceof NavigationModel.Ready) {
            SessionManager sessionManager = this.sessionManager;
            if (sessionManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
                throw null;
            }
            boolean hasOnboardedAccount = PlatformKt.hasOnboardedAccount(sessionManager);
            MainActivity$$ExternalSyntheticLambda6 mainActivity$$ExternalSyntheticLambda6 = this.unlockedNavigator;
            if (hasOnboardedAccount && ((RealIntentHandler) sandboxedActivityContext.intentHandler).handleIntent(intent, mainActivity$$ExternalSyntheticLambda6, false)) {
                intent.putExtra("deep_link_consumed", true);
                DebugPushPayloadStore.onNotificationTapped();
                return;
            } else {
                RealIntentHandler realIntentHandler = (RealIntentHandler) sandboxedActivityContext.intentHandler;
                mainActivity$$ExternalSyntheticLambda6.getClass();
                if (PlatformKt.hasOnboardedAccount(realIntentHandler.sessionManager) ? false : Intrinsics.areEqual(realIntentHandler.handleDeepLink(intent, mainActivity$$ExternalSyntheticLambda6, null, false), Boolean.TRUE)) {
                    intent.putExtra("deep_link_consumed", true);
                    return;
                }
            }
        }
        StateFlowKt.emitOrThrow(this.unhandledIntents, intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Timber.Forest.i("Main Activity Paused", new Object[0]);
        StateFlowKt.emitOrThrow(this.activityEvents, ActivityEvent.PAUSE);
        int i = Build.VERSION.SDK_INT;
        if (i == 31 || i == 32) {
            getSplashScreen().clearOnExitAnimationListener();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr);
        PermissionChecker permissionChecker = this.permissionChecker;
        if (permissionChecker != null) {
            permissionChecker.requestPermissionsResult(strArr, iArr);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("permissionChecker");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        long j;
        bundle.getClass();
        super.onRestoreInstanceState(bundle);
        CashApp.Companion.getClass();
        j = CashApp.START_TIME;
        ((SandboxedActivityContext) getSandboxedActivityContextFlow().getValue()).analytics.track(new AppLifecycleRestore(Integer.valueOf((int) (System.currentTimeMillis() - bundle.getLong("activitySaveTime"))), Boolean.valueOf(j == bundle.getLong("appStartTime"))), null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Timber.Forest forest = Timber.Forest;
        forest.i("Main Activity Resumed", new Object[0]);
        StateFlowKt.emitOrThrow(this.activityEvents, ActivityEvent.RESUME);
        PermissionChecker permissionChecker = this.permissionChecker;
        if (permissionChecker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permissionChecker");
            throw null;
        }
        permissionChecker.triggerRefresh();
        this.restoringState = false;
        boolean z = getRequestedOrientation() == 0;
        boolean z2 = getResources().getConfiguration().orientation == 2;
        if (z != z2) {
            forest.e(new IllegalStateException(CameraSelector$$ExternalSyntheticOutline0.m("Incorrect orientation: Requested Orientation: ", z ? "Landscape" : "Portrait", " Configuration Orientation: ", z2 ? "Landscape" : "Portrait")));
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        long j;
        bundle.getClass();
        SandboxedActivityContext sandboxedActivityContext = (SandboxedActivityContext) getSandboxedActivityContextFlow().getValue();
        CashApp.Companion.getClass();
        j = CashApp.START_TIME;
        bundle.putLong("appStartTime", j);
        bundle.putLong("activitySaveTime", System.currentTimeMillis());
        Parcelable parcelable = this.accountSwitchScreenStateRelay;
        if (parcelable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountSwitchScreenStateRelay");
            throw null;
        }
        bundle.putParcelable("accountSwitchScreenStateRelay", parcelable);
        AcceptableScrim acceptableScrim = this.activityScrim;
        if (acceptableScrim == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityScrim");
            throw null;
        }
        bundle.putParcelable("activeScrim", (Parcelable) acceptableScrim.activeScrim.getValue());
        sandboxedActivityContext.getClass();
        Long id = sandboxedActivityContext.storageLink.getId();
        if (id != null) {
            bundle.putLong("sandboxId", id.longValue());
        }
        RealSessionFlags realSessionFlags = sandboxedActivityContext.sessionFlags;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("showModernTabs", ((Boolean) realSessionFlags.showModernTabs.getValue()).booleanValue());
        bundle2.putBoolean("moneybotHome", ((Boolean) realSessionFlags.moneybotHome.getValue()).booleanValue());
        bundle2.putBoolean("moneybotRespectSystemAppearance", ((Boolean) realSessionFlags.moneybotRespectSystemAppearance.getValue()).booleanValue());
        bundle.putParcelable("tabFlags", bundle2);
        super.onSaveInstanceState(bundle);
        if (BundleDumper.parcelSize(bundle) > 1048576) {
            BugsnagClient bugsnagClient = this.bugSnag;
            if (bugsnagClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bugSnag");
                throw null;
            }
            bugsnagClient.leaveManualBreadcrumb("Saving too large instance state", MapsKt__MapsJVMKt.mapOf(new Pair("Bundle size breakdown", BundleDumper.dumpKeyAndValueSizes$default(bundle))));
            bundle.clear();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        StateFlowKt.emitOrThrow(this.activityEvents, ActivityEvent.START);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        StateFlowKt.emitOrThrow(this.activityEvents, ActivityEvent.STOP);
    }

    public final void updateThemeInfo() {
        StandaloneCoroutine standaloneCoroutine = this.themeInfoJob;
        Continuation continuation = null;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        ContextScope contextScope = this.activityCoroutineScope;
        if (contextScope != null) {
            this.themeInfoJob = JobKt.launch$default(contextScope, null, CoroutineStart.UNDISPATCHED, new MainActivity$updateThemeInfo$1(this, continuation, 0), 1);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("activityCoroutineScope");
            throw null;
        }
    }
}
