package com.squareup.cash.ui;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0;
import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.savedstate.SavedStateRegistry;
import app.cash.badging.backend.Badger$collect$$inlined$combine$2$3;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.Broadway;
import app.cash.broadway.presenter.SavedState;
import app.cash.cdp.backend.jvm.TimeIntervalFlushStrategy$triggers$1;
import app.cash.util.leakdetector.api.LeakDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.bugsnag.android.DeviceBuildInfo;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.views.RealAppMessageImageLoader;
import com.squareup.cash.appmessages.views.RealTooltipTargetLoadedCallbackRegistry;
import com.squareup.cash.backstack.real.RealBackStack;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.UiContainer$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.api.NavigatorState;
import com.squareup.cash.core.navigationcontainer.models.ContainerUiModel;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Ready;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$TabTreatment;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.CashNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.CashNavigator$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.NavigatorError;
import com.squareup.cash.core.navigationcontainer.navigator.OverlayScreen;
import com.squareup.cash.core.navigationcontainer.navigator.PresentersSavedState;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotTopControlsTransition;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SheetV3;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.overlays.OverlayContextWrapper;
import com.squareup.cash.overlays.RealOverlayLayer;
import com.squareup.cash.storage.RealStorage$temp$1;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.lifecycle.MinimumLifecycleOwner;
import com.squareup.thing.Thing;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import dev.zacsweers.metro.Provider;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class MainContainerDelegate {
    public final LifecycleOwner activityLifecycleOwner;
    public final CashNavigator cashNavigator;
    public StandaloneCoroutine chaosJob;
    public com.squareup.cash.core.navigationcontainer.UiContainer container;
    public final FrameLayout containerAndOverlay;
    public ContainerLifecycle containerLifecycle;
    public StandaloneCoroutine containerModelJob;
    public final ReadonlySharedFlow containerModels;
    public final StateFlow containerPresenterBinding;
    public final FeatureFlagManager featureFlagManager;
    public final AnonymousClass3 lifecycleObserver;
    public final MainActivityDelegate mainActivityDelegate;
    public final MainActivity$$ExternalSyntheticLambda6 navigator;
    public final ContextScope navigatorScope;
    public RealOverlayLayer overlayLayer;
    public final StateFlowImpl presenterFactory;
    public final TabToolbarPresenter$Factory$Impl tabToolbarTransformerFactory;
    public final Lazy toolbarPresenter$delegate;
    public final boolean uiChaosEnabled;
    public final UiContainer$Factory$Impl uiContainerFactory;

    /* renamed from: com.squareup.cash.ui.MainContainerDelegate$5, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass5 extends AdaptedFunctionReference implements Function4 {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5(4, MainContainerDelegate.class, "containerUiModel", "_init_$containerUiModel(Lcom/squareup/cash/core/navigationcontainer/models/NavigationModel;Lcom/squareup/cash/core/navigationcontainer/models/MainScreensViewModel$Ready;Lcom/squareup/cash/tabs/viewmodels/TabToolbarInternalViewModel;)Lcom/squareup/cash/core/navigationcontainer/models/ContainerUiModel;", 4);

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            MainScreensViewModel$Ready mainScreensViewModel$Ready = (MainScreensViewModel$Ready) obj2;
            MainScreensViewModel$TabTreatment mainScreensViewModel$TabTreatment = mainScreensViewModel$Ready.tabTreatment;
            ImmutableList immutableList = mainScreensViewModel$Ready.tabs;
            boolean z = mainScreensViewModel$Ready.flatTabs;
            return new ContainerUiModel((NavigationModel) obj, new ContainerUiModel.Chrome(mainScreensViewModel$TabTreatment, immutableList, mainScreensViewModel$Ready.inAppNotification, mainScreensViewModel$Ready.tooltipAppMessage, (TabToolbarInternalViewModel) obj3, z, mainScreensViewModel$Ready.navTransitionsEnabled, mainScreensViewModel$Ready.sharedToolbarEnabled));
        }
    }

    /* renamed from: com.squareup.cash.ui.MainContainerDelegate$6, reason: invalid class name */
    public final class AnonymousClass6 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ MainContainerDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass6(MainContainerDelegate mainContainerDelegate, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = mainContainerDelegate;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            MainContainerDelegate mainContainerDelegate = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass6(mainContainerDelegate, continuation, 0);
                default:
                    return new AnonymousClass6(mainContainerDelegate, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                default:
                    ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            final MainContainerDelegate mainContainerDelegate = this.this$0;
            final int i2 = 1;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new FinishSetupTileBadgeCounter(19, new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1((DerivedStateFlow) mainContainerDelegate.cashNavigator.navigator.remainingMessages, 21), mainContainerDelegate), 1);
                        final int i4 = 0;
                        FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.ui.MainContainerDelegate.6.2
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj2, Continuation continuation) {
                                int i5 = i4;
                                MainContainerDelegate mainContainerDelegate2 = mainContainerDelegate;
                                switch (i5) {
                                    case 0:
                                        MainActivity mainActivity = (MainActivity) mainContainerDelegate2.mainActivityDelegate;
                                        mainActivity.isContentReady = true;
                                        ViewGroup viewGroup = mainActivity.container;
                                        if (viewGroup != null) {
                                            viewGroup.setVisibility(0);
                                            return Unit.INSTANCE;
                                        }
                                        Intrinsics.throwUninitializedPropertyAccessException("container");
                                        throw null;
                                    default:
                                        ContainerUiModel containerUiModel = (ContainerUiModel) obj2;
                                        com.squareup.cash.core.navigationcontainer.UiContainer uiContainer = mainContainerDelegate2.container;
                                        if (uiContainer != null) {
                                            uiContainer.setModel(containerUiModel);
                                            return Unit.INSTANCE;
                                        }
                                        Intrinsics.throwUninitializedPropertyAccessException("container");
                                        throw null;
                                }
                            }
                        };
                        this.label = 1;
                        if (take.collect(flowCollector, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlySharedFlow readonlySharedFlow = mainContainerDelegate.containerModels;
                        FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.ui.MainContainerDelegate.6.2
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj2, Continuation continuation) {
                                int i52 = i2;
                                MainContainerDelegate mainContainerDelegate2 = mainContainerDelegate;
                                switch (i52) {
                                    case 0:
                                        MainActivity mainActivity = (MainActivity) mainContainerDelegate2.mainActivityDelegate;
                                        mainActivity.isContentReady = true;
                                        ViewGroup viewGroup = mainActivity.container;
                                        if (viewGroup != null) {
                                            viewGroup.setVisibility(0);
                                            return Unit.INSTANCE;
                                        }
                                        Intrinsics.throwUninitializedPropertyAccessException("container");
                                        throw null;
                                    default:
                                        ContainerUiModel containerUiModel = (ContainerUiModel) obj2;
                                        com.squareup.cash.core.navigationcontainer.UiContainer uiContainer = mainContainerDelegate2.container;
                                        if (uiContainer != null) {
                                            uiContainer.setModel(containerUiModel);
                                            return Unit.INSTANCE;
                                        }
                                        Intrinsics.throwUninitializedPropertyAccessException("container");
                                        throw null;
                                }
                            }
                        };
                        this.label = 1;
                        if (readonlySharedFlow.$$delegate_0.collect(flowCollector2, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.lifecycle.LifecycleObserver, com.squareup.cash.ui.MainContainerDelegate$3] */
    public MainContainerDelegate(UiContainer$Factory$Impl uiContainer$Factory$Impl, CashNavigator$Factory$Impl cashNavigator$Factory$Impl, LifecycleOwner lifecycleOwner, FeatureFlagManager featureFlagManager, boolean z, CoroutineScope coroutineScope, Thing.ThingContextThemeWrapper thingContextThemeWrapper, MainActivityDelegate mainActivityDelegate, TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl) {
        this.uiContainerFactory = uiContainer$Factory$Impl;
        this.activityLifecycleOwner = lifecycleOwner;
        this.featureFlagManager = featureFlagManager;
        this.uiChaosEnabled = z;
        this.mainActivityDelegate = mainActivityDelegate;
        this.tabToolbarTransformerFactory = tabToolbarPresenter$Factory$Impl;
        MainActivity mainActivity = (MainActivity) mainActivityDelegate;
        this.navigator = mainActivity.unlockedNavigator;
        ContextScope plus = JobKt.plus(new JobImpl(JobKt.getJob(coroutineScope.getCoroutineContext())), coroutineScope);
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        ContextScope plus2 = JobKt.plus(MainDispatcherLoader.dispatcher.immediate, plus);
        this.navigatorScope = plus2;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(null);
        this.presenterFactory = MutableStateFlow;
        int i = 1;
        this.toolbarPresenter$delegate = LazyKt.lazy(new MainContainerDelegate$$ExternalSyntheticLambda1(this, i));
        final SavedStateRegistry savedStateRegistry = mainActivity.getSavedStateRegistry();
        RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = new RoomDatabase$closeBarrier$1(0, mainActivityDelegate, MainActivityDelegate.class, "systemOnBackPressed", "systemOnBackPressed()V", 0, 6);
        MainContainerDelegate$$ExternalSyntheticLambda0 mainContainerDelegate$$ExternalSyntheticLambda0 = new MainContainerDelegate$$ExternalSyntheticLambda0(this, i);
        Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey("navigator");
        Set set = MainContainerConfigKt.experimentalPersistedOverlayScreens;
        set.getClass();
        BetterNavigator$Factory$Impl betterNavigator$Factory$Impl = (BetterNavigator$Factory$Impl) cashNavigator$Factory$Impl.delegateFactory.scope.value;
        betterNavigator$Factory$Impl.getClass();
        CashNavigator cashNavigator = new CashNavigator(betterNavigator$Factory$Impl, roomDatabase$closeBarrier$1, mainContainerDelegate$$ExternalSyntheticLambda0, consumeRestoredStateForKey, set);
        this.cashNavigator = cashNavigator;
        ?? r3 = new DefaultLifecycleObserver() { // from class: com.squareup.cash.ui.MainContainerDelegate.3
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onCreate(LifecycleOwner lifecycleOwner2) {
                final int i2 = 0;
                final MainContainerDelegate mainContainerDelegate = this;
                SavedStateRegistry.SavedStateProvider savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: com.squareup.cash.ui.MainContainerDelegate$3$$ExternalSyntheticLambda0
                    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                    public final Bundle saveState() {
                        Bundle bundle;
                        SavedState savePresenterState;
                        int i3 = i2;
                        MainContainerDelegate mainContainerDelegate2 = mainContainerDelegate;
                        switch (i3) {
                            case 0:
                                CashNavigator cashNavigator2 = mainContainerDelegate2.cashNavigator;
                                cashNavigator2.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("needsColdStart", cashNavigator2._needsColdStartNavigation);
                                bundle2.putBoolean("hasReceivedLockNavigation", cashNavigator2.hasReceivedLockNavigation);
                                SimpleActor simpleActor = cashNavigator2.navigator;
                                simpleActor.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("active", ((Enum) simpleActor.consumeMessage).name());
                                Bundle bundle4 = new Bundle();
                                for (Map.Entry entry : ((LinkedHashMap) simpleActor.messageQueue).entrySet()) {
                                    Enum r4 = (Enum) entry.getKey();
                                    BetterNavigator betterNavigator = (BetterNavigator) entry.getValue();
                                    String name = r4.name();
                                    ErrorReporter errorReporter = betterNavigator.errorReporter;
                                    NavigatorState navigatorState = betterNavigator.identifier;
                                    RealBackStack realBackStack = betterNavigator.backStack;
                                    if (betterNavigator.readyToNavigate || (bundle = betterNavigator.savedState) == null || betterNavigator.hasReceivedNavigation) {
                                        boolean isEmpty = betterNavigator.goToQueue.isEmpty();
                                        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                                        if (!isEmpty) {
                                            errorReporter.report(new NavigatorError.SavedWithNonEmptyQueue(navigatorState.name(), betterNavigator.fullScreen == null ? "null" : "non-null", realBackStack.isEmpty() ? "empty" : "not empty"), defaultSamplingStrategy);
                                        }
                                        if (betterNavigator.fullScreen == null && !realBackStack.isEmpty()) {
                                            errorReporter.report(new NavigatorError.SavedWithStackAndNoFullScreen(navigatorState.name()), defaultSamplingStrategy);
                                        }
                                        bundle = new Bundle();
                                        bundle.putString("identifier", navigatorState.name());
                                        bundle.putString("state", betterNavigator.state.name());
                                        bundle.putParcelable("stack", realBackStack);
                                        bundle.putInt("navigationCount", betterNavigator.navigationCount);
                                        bundle.putParcelable("tabsSavedState", new PresentersSavedState(betterNavigator.tabPresenterStates));
                                        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(betterNavigator.pausedStates);
                                        com.squareup.cash.core.navigationcontainer.navigator.FullScreen fullScreen = betterNavigator.swipe;
                                        if (fullScreen != null && (savePresenterState = betterNavigator.savePresenterState(fullScreen)) != null) {
                                            mutableMap.put(betterNavigator.swipeStateKey, savePresenterState);
                                        }
                                        bundle.putParcelable("pausedStates", new PresentersSavedState(mutableMap));
                                        com.squareup.cash.core.navigationcontainer.navigator.FullScreen fullScreen2 = betterNavigator.fullScreen;
                                        if (fullScreen2 != null) {
                                            bundle.putString("fullScreenStateKey", fullScreen2.stateKey);
                                            bundle.putParcelable("fullScreen", fullScreen2.screen);
                                            bundle.putParcelable("fullScreenState", betterNavigator.savePresenterState(fullScreen2));
                                        }
                                        OverlayScreen overlayScreen = betterNavigator.overlay;
                                        if (overlayScreen != null) {
                                            bundle.putString("overlayStateKey", overlayScreen.getStateKey());
                                            bundle.putParcelable("overlayScreen", overlayScreen.getScreen());
                                            bundle.putParcelable("overlayScreenState", betterNavigator.savePresenterState(overlayScreen));
                                        }
                                        bundle.putInt("swipePageVersion", betterNavigator.swipeState.activePage.version);
                                        bundle.putString("swipePage", ((NavigationModel.Ready.Swipe.Page) betterNavigator.swipeState.activePage.value).name());
                                        bundle.putBoolean("sidePanelHasBeenForegrounded", betterNavigator.sidePanelHasBeenForegrounded);
                                    }
                                    bundle4.putBundle(name, bundle);
                                }
                                bundle3.putBundle("navigators", bundle4);
                                bundle2.putBundle("navigator", bundle3);
                                return bundle2;
                            default:
                                ContainerLifecycle containerLifecycle = mainContainerDelegate2.containerLifecycle;
                                if (containerLifecycle == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("containerLifecycle");
                                    throw null;
                                }
                                Bundle bundle5 = new Bundle();
                                containerLifecycle.savedStateRegistryController.performSave(bundle5);
                                return bundle5;
                        }
                    }
                };
                SavedStateRegistry savedStateRegistry2 = SavedStateRegistry.this;
                savedStateRegistry2.registerSavedStateProvider("navigator", savedStateProvider);
                final int i3 = 1;
                savedStateRegistry2.registerSavedStateProvider("container", new SavedStateRegistry.SavedStateProvider() { // from class: com.squareup.cash.ui.MainContainerDelegate$3$$ExternalSyntheticLambda0
                    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                    public final Bundle saveState() {
                        Bundle bundle;
                        SavedState savePresenterState;
                        int i32 = i3;
                        MainContainerDelegate mainContainerDelegate2 = mainContainerDelegate;
                        switch (i32) {
                            case 0:
                                CashNavigator cashNavigator2 = mainContainerDelegate2.cashNavigator;
                                cashNavigator2.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("needsColdStart", cashNavigator2._needsColdStartNavigation);
                                bundle2.putBoolean("hasReceivedLockNavigation", cashNavigator2.hasReceivedLockNavigation);
                                SimpleActor simpleActor = cashNavigator2.navigator;
                                simpleActor.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("active", ((Enum) simpleActor.consumeMessage).name());
                                Bundle bundle4 = new Bundle();
                                for (Map.Entry entry : ((LinkedHashMap) simpleActor.messageQueue).entrySet()) {
                                    Enum r4 = (Enum) entry.getKey();
                                    BetterNavigator betterNavigator = (BetterNavigator) entry.getValue();
                                    String name = r4.name();
                                    ErrorReporter errorReporter = betterNavigator.errorReporter;
                                    NavigatorState navigatorState = betterNavigator.identifier;
                                    RealBackStack realBackStack = betterNavigator.backStack;
                                    if (betterNavigator.readyToNavigate || (bundle = betterNavigator.savedState) == null || betterNavigator.hasReceivedNavigation) {
                                        boolean isEmpty = betterNavigator.goToQueue.isEmpty();
                                        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                                        if (!isEmpty) {
                                            errorReporter.report(new NavigatorError.SavedWithNonEmptyQueue(navigatorState.name(), betterNavigator.fullScreen == null ? "null" : "non-null", realBackStack.isEmpty() ? "empty" : "not empty"), defaultSamplingStrategy);
                                        }
                                        if (betterNavigator.fullScreen == null && !realBackStack.isEmpty()) {
                                            errorReporter.report(new NavigatorError.SavedWithStackAndNoFullScreen(navigatorState.name()), defaultSamplingStrategy);
                                        }
                                        bundle = new Bundle();
                                        bundle.putString("identifier", navigatorState.name());
                                        bundle.putString("state", betterNavigator.state.name());
                                        bundle.putParcelable("stack", realBackStack);
                                        bundle.putInt("navigationCount", betterNavigator.navigationCount);
                                        bundle.putParcelable("tabsSavedState", new PresentersSavedState(betterNavigator.tabPresenterStates));
                                        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(betterNavigator.pausedStates);
                                        com.squareup.cash.core.navigationcontainer.navigator.FullScreen fullScreen = betterNavigator.swipe;
                                        if (fullScreen != null && (savePresenterState = betterNavigator.savePresenterState(fullScreen)) != null) {
                                            mutableMap.put(betterNavigator.swipeStateKey, savePresenterState);
                                        }
                                        bundle.putParcelable("pausedStates", new PresentersSavedState(mutableMap));
                                        com.squareup.cash.core.navigationcontainer.navigator.FullScreen fullScreen2 = betterNavigator.fullScreen;
                                        if (fullScreen2 != null) {
                                            bundle.putString("fullScreenStateKey", fullScreen2.stateKey);
                                            bundle.putParcelable("fullScreen", fullScreen2.screen);
                                            bundle.putParcelable("fullScreenState", betterNavigator.savePresenterState(fullScreen2));
                                        }
                                        OverlayScreen overlayScreen = betterNavigator.overlay;
                                        if (overlayScreen != null) {
                                            bundle.putString("overlayStateKey", overlayScreen.getStateKey());
                                            bundle.putParcelable("overlayScreen", overlayScreen.getScreen());
                                            bundle.putParcelable("overlayScreenState", betterNavigator.savePresenterState(overlayScreen));
                                        }
                                        bundle.putInt("swipePageVersion", betterNavigator.swipeState.activePage.version);
                                        bundle.putString("swipePage", ((NavigationModel.Ready.Swipe.Page) betterNavigator.swipeState.activePage.value).name());
                                        bundle.putBoolean("sidePanelHasBeenForegrounded", betterNavigator.sidePanelHasBeenForegrounded);
                                    }
                                    bundle4.putBundle(name, bundle);
                                }
                                bundle3.putBundle("navigators", bundle4);
                                bundle2.putBundle("navigator", bundle3);
                                return bundle2;
                            default:
                                ContainerLifecycle containerLifecycle = mainContainerDelegate2.containerLifecycle;
                                if (containerLifecycle == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("containerLifecycle");
                                    throw null;
                                }
                                Bundle bundle5 = new Bundle();
                                containerLifecycle.savedStateRegistryController.performSave(bundle5);
                                return bundle5;
                        }
                    }
                });
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(LifecycleOwner lifecycleOwner2) {
                SavedStateRegistry savedStateRegistry2 = SavedStateRegistry.this;
                savedStateRegistry2.unregisterSavedStateProvider("navigator");
                savedStateRegistry2.unregisterSavedStateProvider("container");
            }
        };
        this.lifecycleObserver = r3;
        mainActivity.getLifecycle().addObserver(r3);
        StateFlow stateInScoped = StateFlowKt.stateInScoped(MutableStateFlow, plus2, new ComposerKt$$ExternalSyntheticLambda0(this, 11));
        this.containerPresenterBinding = stateInScoped;
        Continuation continuation = null;
        int i2 = 0;
        this.containerModels = FlowKt.shareIn(FlowKt.combine((DerivedStateFlow) cashNavigator.navigator.remainingMessages, FlowKt.transformLatest(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateInScoped, 24), new TimeIntervalFlushStrategy$triggers$1(3, continuation)), FlowKt.transformLatest(FlowKt.distinctUntilChanged(new MainContainerDelegate$special$$inlined$map$1(((RealFeatureFlagManager) featureFlagManager).values(AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE), i2)), new Badger$collect$$inlined$combine$2$3(continuation, this, 9)), AnonymousClass5.INSTANCE), plus2, SharingStarted.Companion.Eagerly, 1);
        JobKt.launch$default(plus2, null, null, new AnonymousClass6(this, continuation, i2), 3);
        createAndBindContainer(thingContextThemeWrapper, savedStateRegistry.consumeRestoredStateForKey("container"));
        FrameLayout frameLayout = new FrameLayout(thingContextThemeWrapper);
        RealOverlayLayer realOverlayLayer = this.overlayLayer;
        if (realOverlayLayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overlayLayer");
            throw null;
        }
        frameLayout.addView(realOverlayLayer);
        com.squareup.cash.core.navigationcontainer.UiContainer uiContainer = this.container;
        if (uiContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
            throw null;
        }
        frameLayout.addView(uiContainer, 0);
        this.containerAndOverlay = frameLayout;
    }

    public final void createAndBindContainer(Thing.ThingContextThemeWrapper thingContextThemeWrapper, Bundle bundle) {
        ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SheetV3.INSTANCE)).getClass();
        this.overlayLayer = new RealOverlayLayer(thingContextThemeWrapper);
        this.containerLifecycle = new ContainerLifecycle(bundle);
        RealOverlayLayer realOverlayLayer = this.overlayLayer;
        if (realOverlayLayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overlayLayer");
            throw null;
        }
        OverlayContextWrapper overlayContextWrapper = new OverlayContextWrapper(thingContextThemeWrapper, realOverlayLayer);
        int i = 0;
        MainContainerDelegate$$ExternalSyntheticLambda0 mainContainerDelegate$$ExternalSyntheticLambda0 = new MainContainerDelegate$$ExternalSyntheticLambda0(this, i);
        MainContainerDelegate$$ExternalSyntheticLambda1 mainContainerDelegate$$ExternalSyntheticLambda1 = new MainContainerDelegate$$ExternalSyntheticLambda1(this, i);
        RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = new RoomDatabase$closeBarrier$1(0, this.mainActivityDelegate, MainActivityDelegate.class, "updateWindowFlags", "updateWindowFlags()V", 0, 7);
        ContainerLifecycle containerLifecycle = this.containerLifecycle;
        if (containerLifecycle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerLifecycle");
            throw null;
        }
        MinimumLifecycleOwner minimumLifecycleOwner = new MinimumLifecycleOwner(CollectionsKt__CollectionsKt.listOf((Object[]) new LifecycleOwner[]{this.activityLifecycleOwner, containerLifecycle}));
        int i2 = 0;
        int i3 = 1;
        RealStorage$temp$1 realStorage$temp$1 = new RealStorage$temp$1(i3, this.cashNavigator, CashNavigator.class, "onLocationReceivedInUi", "onLocationReceivedInUi(Ljava/lang/String;)V", i2, 9);
        RealStorage$temp$1 realStorage$temp$12 = new RealStorage$temp$1(i3, this.cashNavigator, CashNavigator.class, "onLocationRemovedFromUi", "onLocationRemovedFromUi(Ljava/lang/String;)V", i2, 10);
        RealStorage$temp$1 realStorage$temp$13 = new RealStorage$temp$1(i3, this.cashNavigator, CashNavigator.class, "onSwipePageChanged", "onSwipePageChanged(Lcom/squareup/cash/core/navigationcontainer/models/NavigationModel$Ready$Swipe$Page;)V", i2, 11);
        DeviceBuildInfo deviceBuildInfo = this.uiContainerFactory.delegateFactory;
        Broadway broadway = (Broadway) ((Provider) deviceBuildInfo.manufacturer).invoke();
        ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) ((Provider) deviceBuildInfo.model).invoke();
        RealTooltipTargetLoadedCallbackRegistry realTooltipTargetLoadedCallbackRegistry = (RealTooltipTargetLoadedCallbackRegistry) ((Provider) deviceBuildInfo.osVersion).invoke();
        LeakDetector leakDetector = (LeakDetector) ((Provider) deviceBuildInfo.osBuild).invoke();
        RealAppMessageImageLoader realAppMessageImageLoader = (RealAppMessageImageLoader) ((Provider) deviceBuildInfo.fingerprint).invoke();
        WireAdapter wireAdapter = (WireAdapter) ((RealClipboardManager.MetroFactory) deviceBuildInfo.tags).invoke();
        SplashScreenAnimationObserver splashScreenAnimationObserver = (SplashScreenAnimationObserver) ((Provider) deviceBuildInfo.brand).invoke();
        List list = (List) ((RealCashVibrator.MetroFactory) deviceBuildInfo.apiLevel).invoke();
        ByteString.Companion companion = new ByteString.Companion();
        RealImageLoader realImageLoader = (RealImageLoader) ((Provider) deviceBuildInfo.cpuAbis).invoke();
        broadway.getClass();
        elementBoundsRegistry.getClass();
        realTooltipTargetLoadedCallbackRegistry.getClass();
        leakDetector.getClass();
        realAppMessageImageLoader.getClass();
        splashScreenAnimationObserver.getClass();
        list.getClass();
        realImageLoader.getClass();
        int i4 = 1;
        com.squareup.cash.core.navigationcontainer.UiContainer uiContainer = new com.squareup.cash.core.navigationcontainer.UiContainer(broadway, elementBoundsRegistry, realTooltipTargetLoadedCallbackRegistry, leakDetector, realAppMessageImageLoader, wireAdapter, splashScreenAnimationObserver, list, companion, realImageLoader, overlayContextWrapper, mainContainerDelegate$$ExternalSyntheticLambda0, realStorage$temp$1, realStorage$temp$12, realStorage$temp$13, mainContainerDelegate$$ExternalSyntheticLambda1, minimumLifecycleOwner, roomDatabase$closeBarrier$1);
        ContainerLifecycle containerLifecycle2 = this.containerLifecycle;
        if (containerLifecycle2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerLifecycle");
            throw null;
        }
        uiContainer.setTag(R.id.view_tree_lifecycle_owner, containerLifecycle2);
        ContainerLifecycle containerLifecycle3 = this.containerLifecycle;
        if (containerLifecycle3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerLifecycle");
            throw null;
        }
        uiContainer.setTag(R.id.view_tree_saved_state_registry_owner, containerLifecycle3);
        this.container = uiContainer;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        Continuation continuation = null;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(this, continuation, i4);
        ContextScope contextScope = this.navigatorScope;
        StandaloneCoroutine launch$default = JobKt.launch$default(contextScope, null, coroutineStart, anonymousClass6, 1);
        StandaloneCoroutine standaloneCoroutine = this.containerModelJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.containerModelJob = launch$default;
        if (this.uiChaosEnabled) {
            StandaloneCoroutine launch$default2 = JobKt.launch$default(contextScope, null, null, new TaxWebAppBridge.AnonymousClass3(this, thingContextThemeWrapper, continuation, 23), 3);
            StandaloneCoroutine standaloneCoroutine2 = this.chaosJob;
            if (standaloneCoroutine2 != null) {
                standaloneCoroutine2.cancel(null);
            }
            this.chaosJob = launch$default2;
        }
    }

    public final void goToColdStart(InitialScreenPlaceholder initialScreenPlaceholder) {
        CashNavigator cashNavigator = this.cashNavigator;
        cashNavigator.getClass();
        cashNavigator._needsColdStartNavigation = false;
        SimpleActor simpleActor = cashNavigator.navigator;
        Enum r0 = (Enum) simpleActor.consumeMessage;
        NavigatorState navigatorState = NavigatorState.ColdStart;
        if (r0 == navigatorState) {
            simpleActor.navigatorFor(navigatorState).goTo(initialScreenPlaceholder, null, null);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        }
    }

    public final void recreateUi(Thing.ThingContextThemeWrapper thingContextThemeWrapper, boolean z) {
        com.squareup.cash.core.navigationcontainer.UiContainer uiContainer = this.container;
        if (uiContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
            throw null;
        }
        RealOverlayLayer realOverlayLayer = this.overlayLayer;
        if (realOverlayLayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overlayLayer");
            throw null;
        }
        ContainerLifecycle containerLifecycle = this.containerLifecycle;
        if (containerLifecycle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerLifecycle");
            throw null;
        }
        LifecycleRegistry lifecycleRegistry = containerLifecycle.lifecycleRegistry;
        lifecycleRegistry.setCurrentState(Lifecycle.State.STARTED);
        Bundle bundle = new Bundle();
        containerLifecycle.savedStateRegistryController.performSave(bundle);
        createAndBindContainer(thingContextThemeWrapper, bundle);
        com.squareup.cash.core.navigationcontainer.UiContainer uiContainer2 = this.container;
        if (uiContainer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
            throw null;
        }
        RealOverlayLayer realOverlayLayer2 = this.overlayLayer;
        if (realOverlayLayer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overlayLayer");
            throw null;
        }
        if (!z) {
            FrameLayout frameLayout = this.containerAndOverlay;
            frameLayout.removeAllViews();
            frameLayout.addView(realOverlayLayer2);
            frameLayout.addView(uiContainer2, 0);
            lifecycleRegistry.setCurrentState(Lifecycle.State.DESTROYED);
            return;
        }
        MainContainerDelegate$recreateUi$$inlined$valueAnimatorOf$default$1 mainContainerDelegate$recreateUi$$inlined$valueAnimatorOf$default$1 = new MainContainerDelegate$recreateUi$$inlined$valueAnimatorOf$default$1(uiContainer2, realOverlayLayer2, this, uiContainer2, realOverlayLayer2, uiContainer, realOverlayLayer, containerLifecycle);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.setStartDelay(0L);
        ofFloat.setDuration(200L);
        ofFloat.setRepeatCount(0);
        ofFloat.setRepeatMode(1);
        ofFloat.addUpdateListener(mainContainerDelegate$recreateUi$$inlined$valueAnimatorOf$default$1);
        ofFloat.addListener(mainContainerDelegate$recreateUi$$inlined$valueAnimatorOf$default$1);
        ofFloat.start();
    }
}
