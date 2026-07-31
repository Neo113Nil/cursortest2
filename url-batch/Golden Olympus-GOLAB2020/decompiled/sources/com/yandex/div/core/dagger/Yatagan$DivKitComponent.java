package com.yandex.div.core.dagger;

import android.content.Context;
import android.renderscript.RenderScript;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.actions.DivActionTypedArrayMutationHandler;
import com.yandex.div.core.actions.DivActionTypedClearFocusHandler;
import com.yandex.div.core.actions.DivActionTypedCopyToClipboardHandler;
import com.yandex.div.core.actions.DivActionTypedDictSetValueHandler;
import com.yandex.div.core.actions.DivActionTypedFocusElementHandler;
import com.yandex.div.core.actions.DivActionTypedHandler;
import com.yandex.div.core.actions.DivActionTypedHandlerCombiner;
import com.yandex.div.core.actions.DivActionTypedHideTooltipHandler;
import com.yandex.div.core.actions.DivActionTypedScrollHandler;
import com.yandex.div.core.actions.DivActionTypedSetStateHandler;
import com.yandex.div.core.actions.DivActionTypedSetStoredValueHandler;
import com.yandex.div.core.actions.DivActionTypedSetVariableHandler;
import com.yandex.div.core.actions.DivActionTypedShowTooltipHandler;
import com.yandex.div.core.actions.DivActionTypedSubmitHandler;
import com.yandex.div.core.actions.DivActionTypedTimerHandler;
import com.yandex.div.core.actions.DivActionTypedVideoHandler;
import com.yandex.div.core.actions.DivAnimatorTypedActionHandler;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.TwoWayBooleanVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.player.DivVideoViewMapper;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.core.state.DivStateManager;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.timer.DivTimerEventDispatcherProvider;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.tooltip.DivTooltipViewBuilder;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivValidator;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.DivVisibilityActionDispatcher;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.core.view2.ViewBindingProvider;
import com.yandex.div.core.view2.ViewVisibilityCalculator;
import com.yandex.div.core.view2.animations.DivAnimatorController;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivFocusBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivSwitchBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.pager.DivPagerBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.BitmapEffectHelper;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.errors.ErrorVisualMonitor;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.view2.state.DivJoinedStateSwitcher;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.viewpool.ViewCreator;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.state.DivStateCache;
import com.yandex.div.storage.DivStorageComponent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Yatagan$DivKitComponent implements DivKitComponent {
    final Context mApplicationContext;
    private volatile Object mDivActionTypedHandlerCombinerInstance;
    final DivKitConfiguration mDivKitConfiguration;
    private volatile Object mDivParsingHistogramReporterInstance;
    private volatile Object mDivStorageComponentInstance;
    private volatile Object mHistogramColdTypeCheckerInstance;
    private volatile Object mHistogramRecorderInstance;
    private volatile Object mSendBeaconManagerInstance;
    private volatile Object mViewCreatorInstance;

    private static final class ComponentFactoryImpl implements DivKitComponent.Builder {
        private Context mApplicationContext;
        private DivKitConfiguration mConfiguration;

        private ComponentFactoryImpl() {
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent.Builder applicationContext(Context context) {
            this.mApplicationContext = context;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent build() {
            return new Yatagan$DivKitComponent(this.mApplicationContext, this.mConfiguration);
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent.Builder configuration(DivKitConfiguration divKitConfiguration) {
            this.mConfiguration = divKitConfiguration;
            return this;
        }
    }

    static final class Div2ComponentImpl implements Div2Component {
        private Object mAccessibilityStateProviderInstance;
        final ContextThemeWrapper mBaseContext;
        private Object mBitmapEffectHelperInstance;
        private Object mDiv2BuilderInstance;
        private Object mDivActionBeaconSenderInstance;
        private Object mDivActionBinderInstance;
        private Object mDivBaseBinderInstance;
        private Object mDivBinderInstance;
        final DivConfiguration mDivConfiguration;
        final DivCreationTracker mDivCreationTracker;
        private Object mDivExtensionControllerInstance;
        private Object mDivImageLoaderInstance;
        private Object mDivImagePreloaderInstance;
        final Yatagan$DivKitComponent mDivKitComponent;
        private Object mDivPatchCacheInstance;
        private Object mDivPatchManagerInstance;
        private Object mDivPlaceholderLoaderInstance;
        private Object mDivPreloaderInstance;
        private Object mDivRuntimeVisitorInstance;
        private Object mDivStateManagerInstance;
        private Object mDivTimerEventDispatcherProviderInstance;
        private Object mDivTooltipControllerInstance;
        private Object mDivTypefaceResolverInstance;
        private Object mDivValidatorInstance;
        final DivVariableController mDivVariableController;
        private Object mDivVideoActionHandlerInstance;
        private Object mDivVideoViewMapperInstance;
        private Object mDivViewCreatorInstance;
        private Object mDivViewDataPreloaderInstance;
        private Object mDivViewIdProviderInstance;
        private Object mDivVisibilityActionDispatcherInstance;
        private Object mDivVisibilityActionTrackerInstance;
        private Object mErrorCollectorsInstance;
        private Object mHistogramReporterInstance;
        private Object mJavaxInjectNamedValueThemedContextContextInstance;
        private Object mPagerIndicatorConnectorInstance;
        private Object mPerformanceDependentSessionProfilerInstance;
        private Object mReleaseManagerInstance;
        private Object mRenderScriptInstance;
        private Object mRuntimeStoreProviderInstance;
        private Object mStoredValuesControllerInstance;
        private Object mTabsStateCacheInstance;
        private Object mTemporaryDivStateCacheInstance;
        final Integer mThemeId;
        private Object mTwoWayIntegerVariableBinderInstance;
        private Object mTwoWayStringVariableBinderInstance;
        private Object mViewPoolInstance;
        private Object mViewPreCreationProfileRepositoryInstance;

        private static final class ComponentFactoryImpl implements Div2Component.Builder {
            Yatagan$DivKitComponent fDivKitComponent;
            private ContextThemeWrapper mBaseContext;
            private DivConfiguration mConfiguration;
            private DivCreationTracker mDivCreationTracker;
            private DivVariableController mDivVariableController;
            private Integer mThemeId;

            ComponentFactoryImpl(Yatagan$DivKitComponent yatagan$DivKitComponent) {
                this.fDivKitComponent = yatagan$DivKitComponent;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder baseContext(ContextThemeWrapper contextThemeWrapper) {
                this.mBaseContext = contextThemeWrapper;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component build() {
                return new Div2ComponentImpl(this.fDivKitComponent, this.mBaseContext, this.mConfiguration, this.mThemeId, this.mDivCreationTracker, this.mDivVariableController);
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder configuration(DivConfiguration divConfiguration) {
                this.mConfiguration = divConfiguration;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder divCreationTracker(DivCreationTracker divCreationTracker) {
                this.mDivCreationTracker = divCreationTracker;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder divVariableController(DivVariableController divVariableController) {
                this.mDivVariableController = divVariableController;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder themeId(int i4) {
                this.mThemeId = Integer.valueOf(i4);
                return this;
            }
        }

        static final class Div2ViewComponentImpl implements Div2ViewComponent {
            final Div2ComponentImpl mDiv2Component;
            private Object mDivAnimatorControllerInstance;
            private Object mDivStateSwitcherInstance;
            private Object mDivStateTransitionHolderInstance;
            private Object mDivTransitionBuilderInstance;
            final Div2View mDivView;
            private Object mErrorVisualMonitorInstance;
            private Object mInputFocusTrackerInstance;
            private Object mMediaReleaseViewVisitorInstance;
            private Object mReleaseViewVisitorInstance;
            private Object mViewBindingProviderInstance;

            private static final class CachingProviderImpl implements Q1.a {
                private final Div2ViewComponentImpl mDelegate;
                private final int mIndex;
                private Object mValue;

                CachingProviderImpl(Div2ViewComponentImpl div2ViewComponentImpl, int i4) {
                    this.mDelegate = div2ViewComponentImpl;
                    this.mIndex = i4;
                }

                @Override // V1.a
                public Object get() {
                    Object obj = this.mValue;
                    if (obj != null) {
                        return obj;
                    }
                    R1.b.a();
                    Object switch$$access = this.mDelegate.switch$$access(this.mIndex);
                    this.mValue = switch$$access;
                    return switch$$access;
                }
            }

            private static final class ComponentFactoryImpl implements Div2ViewComponent.Builder {
                Div2ComponentImpl fDiv2Component;
                private Div2View mDivView;

                ComponentFactoryImpl(Div2ComponentImpl div2ComponentImpl) {
                    this.fDiv2Component = div2ComponentImpl;
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public Div2ViewComponent build() {
                    return new Div2ViewComponentImpl(this.fDiv2Component, this.mDivView);
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public Div2ViewComponent.Builder divView(Div2View div2View) {
                    this.mDivView = div2View;
                    return this;
                }
            }

            Div2ViewComponentImpl(Div2ComponentImpl div2ComponentImpl, Div2View div2View) {
                this.mDiv2Component = div2ComponentImpl;
                this.mDivView = (Div2View) R1.a.a(div2View);
            }

            DivAnimatorController cacheDivAnimatorController() {
                Object obj = this.mDivAnimatorControllerInstance;
                if (obj == null) {
                    R1.b.a();
                    obj = new DivAnimatorController(this.mDivView);
                    this.mDivAnimatorControllerInstance = obj;
                }
                return (DivAnimatorController) obj;
            }

            DivStateSwitcher cacheDivStateSwitcher() {
                Object obj = this.mDivStateSwitcherInstance;
                if (obj == null) {
                    R1.b.a();
                    Div2ViewModule div2ViewModule = Div2ViewModule.INSTANCE;
                    obj = R1.a.b(Div2ViewModule.provideStateSwitcher(((Boolean) R1.a.b(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.isMultipleStateChangeEnabled()))).booleanValue(), new CachingProviderImpl(this, 0), new CachingProviderImpl(this, 1)));
                    this.mDivStateSwitcherInstance = obj;
                }
                return (DivStateSwitcher) obj;
            }

            DivStateTransitionHolder cacheDivStateTransitionHolder() {
                Object obj = this.mDivStateTransitionHolderInstance;
                if (obj == null) {
                    R1.b.a();
                    obj = new DivStateTransitionHolder(this.mDivView);
                    this.mDivStateTransitionHolderInstance = obj;
                }
                return (DivStateTransitionHolder) obj;
            }

            DivTransitionBuilder cacheDivTransitionBuilder() {
                Object obj = this.mDivTransitionBuilderInstance;
                if (obj == null) {
                    R1.b.a();
                    Div2ComponentImpl div2ComponentImpl = this.mDiv2Component;
                    obj = new DivTransitionBuilder(div2ComponentImpl.mBaseContext, div2ComponentImpl.cacheDivViewIdProvider());
                    this.mDivTransitionBuilderInstance = obj;
                }
                return (DivTransitionBuilder) obj;
            }

            ErrorVisualMonitor cacheErrorVisualMonitor() {
                Object obj = this.mErrorVisualMonitorInstance;
                if (obj == null) {
                    R1.b.a();
                    ErrorVisualMonitor errorVisualMonitor = new ErrorVisualMonitor(this.mDiv2Component.cacheErrorCollectors(), this.mDivView, ((Boolean) R1.a.b(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.getAreVisualErrorsEnabled()))).booleanValue(), ((Boolean) R1.a.b(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.isPermanentDebugPanelEnabled()))).booleanValue(), cacheViewBindingProvider());
                    this.mErrorVisualMonitorInstance = errorVisualMonitor;
                    obj = errorVisualMonitor;
                }
                return (ErrorVisualMonitor) obj;
            }

            InputFocusTracker cacheInputFocusTracker() {
                Object obj = this.mInputFocusTrackerInstance;
                if (obj == null) {
                    R1.b.a();
                    obj = new InputFocusTracker(this.mDivView);
                    this.mInputFocusTrackerInstance = obj;
                }
                return (InputFocusTracker) obj;
            }

            MediaReleaseViewVisitor cacheMediaReleaseViewVisitor() {
                Object obj = this.mMediaReleaseViewVisitorInstance;
                if (obj == null) {
                    R1.b.a();
                    obj = new MediaReleaseViewVisitor();
                    this.mMediaReleaseViewVisitorInstance = obj;
                }
                return (MediaReleaseViewVisitor) obj;
            }

            ReleaseViewVisitor cacheReleaseViewVisitor() {
                Object obj = this.mReleaseViewVisitorInstance;
                if (obj == null) {
                    R1.b.a();
                    obj = new ReleaseViewVisitor(this.mDivView, (DivCustomContainerViewAdapter) R1.a.b(this.mDiv2Component.mDivConfiguration.getDivCustomContainerViewAdapter()), this.mDiv2Component.cacheDivExtensionController());
                    this.mReleaseViewVisitorInstance = obj;
                }
                return (ReleaseViewVisitor) obj;
            }

            ViewBindingProvider cacheViewBindingProvider() {
                Object obj = this.mViewBindingProviderInstance;
                if (obj == null) {
                    R1.b.a();
                    obj = new ViewBindingProvider();
                    this.mViewBindingProviderInstance = obj;
                }
                return (ViewBindingProvider) obj;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivAnimatorController getAnimatorController() {
                return cacheDivAnimatorController();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ViewBindingProvider getBindingProvider() {
                return cacheViewBindingProvider();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivTooltipController getDivTooltipController() {
                return this.mDiv2Component.cacheDivTooltipController();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ErrorCollectors getErrorCollectors() {
                return this.mDiv2Component.cacheErrorCollectors();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ErrorVisualMonitor getErrorMonitor() {
                return cacheErrorVisualMonitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public InputFocusTracker getInputFocusTracker() {
                return cacheInputFocusTracker();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public MediaReleaseViewVisitor getMediaReleaseViewVisitor() {
                return cacheMediaReleaseViewVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ReleaseViewVisitor getReleaseViewVisitor() {
                return cacheReleaseViewVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivRuntimeVisitor getRuntimeVisitor() {
                return this.mDiv2Component.cacheDivRuntimeVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivStateSwitcher getStateSwitcher() {
                return cacheDivStateSwitcher();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivStateTransitionHolder getStateTransitionHolder() {
                return cacheDivStateTransitionHolder();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivTransitionBuilder getTransitionBuilder() {
                return cacheDivTransitionBuilder();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivViewIdProvider getViewIdProvider() {
                return this.mDiv2Component.cacheDivViewIdProvider();
            }

            Object switch$$access(int i4) {
                if (i4 == 0) {
                    return new DivJoinedStateSwitcher(this.mDivView, this.mDiv2Component.cacheDivBinder());
                }
                if (i4 == 1) {
                    return new DivMultipleStateSwitcher(this.mDivView, this.mDiv2Component.cacheDivBinder());
                }
                throw new AssertionError();
            }
        }

        static final class ProviderImpl implements Q1.a {
            private final Div2ComponentImpl mDelegate;
            private final int mIndex;

            ProviderImpl(Div2ComponentImpl div2ComponentImpl, int i4) {
                this.mDelegate = div2ComponentImpl;
                this.mIndex = i4;
            }

            @Override // V1.a
            public Object get() {
                return this.mDelegate.switch$$access(this.mIndex);
            }
        }

        Div2ComponentImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, Integer num, DivCreationTracker divCreationTracker, DivVariableController divVariableController) {
            this.mDivKitComponent = yatagan$DivKitComponent;
            this.mBaseContext = (ContextThemeWrapper) R1.a.a(contextThemeWrapper);
            this.mDivConfiguration = (DivConfiguration) R1.a.a(divConfiguration);
            this.mThemeId = (Integer) R1.a.a(num);
            this.mDivCreationTracker = (DivCreationTracker) R1.a.a(divCreationTracker);
            this.mDivVariableController = (DivVariableController) R1.a.a(divVariableController);
        }

        AccessibilityStateProvider cacheAccessibilityStateProvider() {
            Object obj = this.mAccessibilityStateProviderInstance;
            if (obj == null) {
                R1.b.a();
                obj = new AccessibilityStateProvider(((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isAccessibilityEnabled()))).booleanValue());
                this.mAccessibilityStateProviderInstance = obj;
            }
            return (AccessibilityStateProvider) obj;
        }

        BitmapEffectHelper cacheBitmapEffectHelper() {
            Object obj = this.mBitmapEffectHelperInstance;
            if (obj == null) {
                R1.b.a();
                obj = new BitmapEffectHelper(cacheRenderScript());
                this.mBitmapEffectHelperInstance = obj;
            }
            return (BitmapEffectHelper) obj;
        }

        Div2Builder cacheDiv2Builder() {
            Object obj = this.mDiv2BuilderInstance;
            if (obj == null) {
                R1.b.a();
                obj = new Div2Builder(cacheDivViewCreator(), cacheDivBinder(), cacheDivRuntimeVisitor());
                this.mDiv2BuilderInstance = obj;
            }
            return (Div2Builder) obj;
        }

        DivActionBeaconSender cacheDivActionBeaconSender() {
            Object obj = this.mDivActionBeaconSenderInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivActionBeaconSender(new ProviderImpl(this.mDivKitComponent, 3), ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isTapBeaconsEnabled()))).booleanValue(), ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isVisibilityBeaconsEnabled()))).booleanValue(), ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isSwipeOutBeaconsEnabled()))).booleanValue());
                this.mDivActionBeaconSenderInstance = obj;
            }
            return (DivActionBeaconSender) obj;
        }

        DivActionBinder cacheDivActionBinder() {
            Object obj = this.mDivActionBinderInstance;
            if (obj == null) {
                R1.b.a();
                DivActionBinder divActionBinder = new DivActionBinder((DivActionHandler) R1.a.b(this.mDivConfiguration.getActionHandler()), (Div2Logger) R1.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivActionBeaconSender(), ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isLongtapActionsPassToChild()))).booleanValue(), ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isContextMenuHandlerOverridden()))).booleanValue(), ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isAccessibilityEnabled()))).booleanValue());
                this.mDivActionBinderInstance = divActionBinder;
                obj = divActionBinder;
            }
            return (DivActionBinder) obj;
        }

        DivBaseBinder cacheDivBaseBinder() {
            Object obj = this.mDivBaseBinderInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivBaseBinder(new DivBackgroundBinder(cacheDivImageLoader()), cacheDivTooltipController(), new DivFocusBinder(cacheDivActionBinder()), new DivAccessibilityBinder(((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isAccessibilityEnabled()))).booleanValue(), cacheAccessibilityStateProvider()));
                this.mDivBaseBinderInstance = obj;
            }
            return (DivBaseBinder) obj;
        }

        DivBinder cacheDivBinder() {
            Object obj = this.mDivBinderInstance;
            if (obj == null) {
                R1.b.a();
                DivBinder divBinder = new DivBinder(cacheDivValidator(), new DivTextBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), new SpannedTextBuilder(cacheDivTypefaceResolver(), cacheDivImageLoader()), ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isHyphenationSupported()))).booleanValue()), new DivContainerBinder(cacheDivBaseBinder(), new ProviderImpl(this, 2), cacheDivPatchManager(), new ProviderImpl(this, 0), cacheErrorCollectors()), new DivSeparatorBinder(cacheDivBaseBinder()), new DivImageBinder(cacheDivBaseBinder(), cacheDivImageLoader(), cacheDivPlaceholderLoader(), cacheErrorCollectors()), new DivGifImageBinder(cacheDivBaseBinder(), cacheDivImageLoader(), cacheDivPlaceholderLoader(), cacheErrorCollectors()), new DivGridBinder(cacheDivBaseBinder(), cacheDivPatchManager(), new ProviderImpl(this, 0), new ProviderImpl(this, 2)), new DivGalleryBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheDivPatchCache(), ((Float) R1.a.b(Float.valueOf(this.mDivConfiguration.getRecyclerScrollInterceptionAngle()))).floatValue()), new DivPagerBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheDivPatchCache(), cacheDivActionBinder(), cachePagerIndicatorConnector(), cacheAccessibilityStateProvider()), new DivTabsBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheViewPool(), (TabTextStyleProvider) R1.a.b(Div2Module.provideTabTextStyleProvider((DivTypefaceProvider) R1.a.b(this.mDivConfiguration.getTypefaceProvider()))), cacheDivActionBinder(), (Div2Logger) R1.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivImageLoader(), cacheDivVisibilityActionTracker(), cacheDivPatchCache(), cacheJavaxInjectNamedValueThemedContextContext(), cacheDivRuntimeVisitor(), cacheTabsStateCache()), new DivStateBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), (DivStateCache) R1.a.b(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache(), cacheDivActionBinder(), cacheDivActionBeaconSender(), cacheDivPatchManager(), cacheDivPatchCache(), (Div2Logger) R1.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivVisibilityActionTracker(), cacheErrorCollectors(), cacheTwoWayStringVariableBinder(), cacheDivRuntimeVisitor()), new DivCustomBinder(cacheDivBaseBinder(), (DivCustomContainerViewAdapter) R1.a.b(this.mDivConfiguration.getDivCustomContainerViewAdapter()), cacheDivExtensionController(), new ProviderImpl(this, 0)), new DivIndicatorBinder(cacheDivBaseBinder(), cachePagerIndicatorConnector()), new DivSliderBinder(cacheDivBaseBinder(), (Div2Logger) R1.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivTypefaceResolver(), cacheTwoWayIntegerVariableBinder(), cacheErrorCollectors(), ((Float) R1.a.b(Float.valueOf(this.mDivConfiguration.getRecyclerScrollInterceptionAngle()))).floatValue(), ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.getAreVisualErrorsEnabled()))).booleanValue()), new DivInputBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), cacheTwoWayStringVariableBinder(), cacheDivActionBinder(), cacheAccessibilityStateProvider(), cacheErrorCollectors()), new DivSelectBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), cacheTwoWayStringVariableBinder(), cacheErrorCollectors()), new DivVideoBinder(cacheDivBaseBinder(), cacheTwoWayIntegerVariableBinder(), cacheDivActionBinder(), cacheDivVideoViewMapper(), (ExecutorService) R1.a.b(this.mDivKitComponent.mDivKitConfiguration.executorService()), (DivPlayerFactory) R1.a.b(this.mDivConfiguration.getDivPlayerFactory())), cacheDivExtensionController(), cachePagerIndicatorConnector(), new DivSwitchBinder(cacheDivBaseBinder(), new TwoWayBooleanVariableBinder(cacheErrorCollectors())));
                this.mDivBinderInstance = divBinder;
                obj = divBinder;
            }
            return (DivBinder) obj;
        }

        DivExtensionController cacheDivExtensionController() {
            Object obj = this.mDivExtensionControllerInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivExtensionController((List) R1.a.b(this.mDivConfiguration.getExtensionHandlers()));
                this.mDivExtensionControllerInstance = obj;
            }
            return (DivExtensionController) obj;
        }

        DivImageLoader cacheDivImageLoader() {
            Object obj = this.mDivImageLoaderInstance;
            if (obj == null) {
                R1.b.a();
                obj = R1.a.b(Div2Module.provideDivImageLoader((DivImageLoader) R1.a.b(this.mDivConfiguration.getImageLoader()), this.mBaseContext));
                this.mDivImageLoaderInstance = obj;
            }
            return (DivImageLoader) obj;
        }

        DivImagePreloader cacheDivImagePreloader() {
            Object obj = this.mDivImagePreloaderInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivImagePreloader(cacheDivImageLoader());
                this.mDivImagePreloaderInstance = obj;
            }
            return (DivImagePreloader) obj;
        }

        DivPatchCache cacheDivPatchCache() {
            Object obj = this.mDivPatchCacheInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivPatchCache();
                this.mDivPatchCacheInstance = obj;
            }
            return (DivPatchCache) obj;
        }

        DivPatchManager cacheDivPatchManager() {
            Object obj = this.mDivPatchManagerInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivPatchManager(cacheDivPatchCache(), new ProviderImpl(this, 1));
                this.mDivPatchManagerInstance = obj;
            }
            return (DivPatchManager) obj;
        }

        DivPlaceholderLoader cacheDivPlaceholderLoader() {
            Object obj = this.mDivPlaceholderLoaderInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivPlaceholderLoader((Div2ImageStubProvider) R1.a.b(this.mDivConfiguration.getDiv2ImageStubProvider()), (ExecutorService) R1.a.b(this.mDivKitComponent.mDivKitConfiguration.executorService()));
                this.mDivPlaceholderLoaderInstance = obj;
            }
            return (DivPlaceholderLoader) obj;
        }

        DivPreloader cacheDivPreloader() {
            Object obj = this.mDivPreloaderInstance;
            if (obj == null) {
                R1.b.a();
                obj = R1.a.b(Div2Module.provideDivPreloader(cacheDivImagePreloader(), (DivCustomContainerViewAdapter) R1.a.b(this.mDivConfiguration.getDivCustomContainerViewAdapter()), (DivPlayerPreloader) R1.a.b(this.mDivConfiguration.getDivPlayerPreloader()), cacheDivExtensionController()));
                this.mDivPreloaderInstance = obj;
            }
            return (DivPreloader) obj;
        }

        DivRuntimeVisitor cacheDivRuntimeVisitor() {
            Object obj = this.mDivRuntimeVisitorInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivRuntimeVisitor((DivStateCache) R1.a.b(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache(), cacheTabsStateCache());
                this.mDivRuntimeVisitorInstance = obj;
            }
            return (DivRuntimeVisitor) obj;
        }

        DivStateManager cacheDivStateManager() {
            Object obj = this.mDivStateManagerInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivStateManager((DivStateCache) R1.a.b(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache());
                this.mDivStateManagerInstance = obj;
            }
            return (DivStateManager) obj;
        }

        DivTimerEventDispatcherProvider cacheDivTimerEventDispatcherProvider() {
            Object obj = this.mDivTimerEventDispatcherProviderInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivTimerEventDispatcherProvider(cacheDivActionBinder(), cacheErrorCollectors());
                this.mDivTimerEventDispatcherProviderInstance = obj;
            }
            return (DivTimerEventDispatcherProvider) obj;
        }

        DivTooltipController cacheDivTooltipController() {
            Object obj = this.mDivTooltipControllerInstance;
            if (obj == null) {
                R1.b.a();
                DivTooltipController divTooltipController = new DivTooltipController((DivTooltipRestrictor) R1.a.b(this.mDivConfiguration.getTooltipRestrictor()), cacheDivVisibilityActionTracker(), cacheDivPreloader(), new DivTooltipViewBuilder(new ProviderImpl(this, 1)), cacheAccessibilityStateProvider(), cacheErrorCollectors());
                this.mDivTooltipControllerInstance = divTooltipController;
                obj = divTooltipController;
            }
            return (DivTooltipController) obj;
        }

        DivTypefaceResolver cacheDivTypefaceResolver() {
            Object obj = this.mDivTypefaceResolverInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivTypefaceResolver((Map) R1.a.b(this.mDivConfiguration.getAdditionalTypefaceProviders()), (DivTypefaceProvider) R1.a.b(this.mDivConfiguration.getTypefaceProvider()));
                this.mDivTypefaceResolverInstance = obj;
            }
            return (DivTypefaceResolver) obj;
        }

        DivValidator cacheDivValidator() {
            Object obj = this.mDivValidatorInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivValidator();
                this.mDivValidatorInstance = obj;
            }
            return (DivValidator) obj;
        }

        DivVideoActionHandler cacheDivVideoActionHandler() {
            Object obj = this.mDivVideoActionHandlerInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivVideoActionHandler(cacheDivVideoViewMapper());
                this.mDivVideoActionHandlerInstance = obj;
            }
            return (DivVideoActionHandler) obj;
        }

        DivVideoViewMapper cacheDivVideoViewMapper() {
            Object obj = this.mDivVideoViewMapperInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivVideoViewMapper();
                this.mDivVideoViewMapperInstance = obj;
            }
            return (DivVideoViewMapper) obj;
        }

        DivViewCreator cacheDivViewCreator() {
            Object obj = this.mDivViewCreatorInstance;
            if (obj == null) {
                R1.b.a();
                DivViewCreator divViewCreator = new DivViewCreator(cacheJavaxInjectNamedValueThemedContextContext(), cacheViewPool(), cacheDivValidator(), (ViewPreCreationProfile) R1.a.b(this.mDivConfiguration.getViewPreCreationProfile()), cacheViewPreCreationProfileRepository());
                this.mDivViewCreatorInstance = divViewCreator;
                obj = divViewCreator;
            }
            return (DivViewCreator) obj;
        }

        DivViewDataPreloader cacheDivViewDataPreloader() {
            Object obj = this.mDivViewDataPreloaderInstance;
            if (obj == null) {
                R1.b.a();
                obj = R1.a.b(Div2Module.provideDivViewDataPreloader(cacheDivImagePreloader(), (DivCustomContainerViewAdapter) R1.a.b(this.mDivConfiguration.getDivCustomContainerViewAdapter()), (DivPlayerPreloader) R1.a.b(this.mDivConfiguration.getDivPlayerPreloader()), cacheDivExtensionController()));
                this.mDivViewDataPreloaderInstance = obj;
            }
            return (DivViewDataPreloader) obj;
        }

        DivViewIdProvider cacheDivViewIdProvider() {
            Object obj = this.mDivViewIdProviderInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivViewIdProvider();
                this.mDivViewIdProviderInstance = obj;
            }
            return (DivViewIdProvider) obj;
        }

        DivVisibilityActionDispatcher cacheDivVisibilityActionDispatcher() {
            Object obj = this.mDivVisibilityActionDispatcherInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivVisibilityActionDispatcher((Div2Logger) R1.a.b(this.mDivConfiguration.getDiv2Logger()), (List) R1.a.b(this.mDivConfiguration.getDivVisibilityChangeListeners()), (DivActionHandler) R1.a.b(this.mDivConfiguration.getActionHandler()), cacheDivActionBeaconSender());
                this.mDivVisibilityActionDispatcherInstance = obj;
            }
            return (DivVisibilityActionDispatcher) obj;
        }

        DivVisibilityActionTracker cacheDivVisibilityActionTracker() {
            Object obj = this.mDivVisibilityActionTrackerInstance;
            if (obj == null) {
                R1.b.a();
                obj = new DivVisibilityActionTracker(new ViewVisibilityCalculator(), cacheDivVisibilityActionDispatcher());
                this.mDivVisibilityActionTrackerInstance = obj;
            }
            return (DivVisibilityActionTracker) obj;
        }

        ErrorCollectors cacheErrorCollectors() {
            Object obj = this.mErrorCollectorsInstance;
            if (obj == null) {
                R1.b.a();
                obj = new ErrorCollectors();
                this.mErrorCollectorsInstance = obj;
            }
            return (ErrorCollectors) obj;
        }

        HistogramReporter cacheHistogramReporter() {
            Object obj = this.mHistogramReporterInstance;
            if (obj == null) {
                R1.b.a();
                obj = R1.a.b(DivHistogramsModule.INSTANCE.provideHistogramReporter(this.mDivKitComponent.accessHistogramReporterDelegate()));
                this.mHistogramReporterInstance = obj;
            }
            return (HistogramReporter) obj;
        }

        Context cacheJavaxInjectNamedValueThemedContextContext() {
            Object obj = this.mJavaxInjectNamedValueThemedContextContextInstance;
            if (obj == null) {
                R1.b.a();
                obj = R1.a.b(Div2Module.provideThemedContext(this.mBaseContext, this.mThemeId.intValue(), ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isResourceCacheEnabled()))).booleanValue()));
                this.mJavaxInjectNamedValueThemedContextContextInstance = obj;
            }
            return (Context) obj;
        }

        PagerIndicatorConnector cachePagerIndicatorConnector() {
            Object obj = this.mPagerIndicatorConnectorInstance;
            if (obj == null) {
                R1.b.a();
                obj = new PagerIndicatorConnector();
                this.mPagerIndicatorConnectorInstance = obj;
            }
            return (PagerIndicatorConnector) obj;
        }

        PerformanceDependentSessionProfiler cachePerformanceDependentSessionProfiler() {
            Object obj = this.mPerformanceDependentSessionProfilerInstance;
            if (obj == null) {
                R1.b.a();
                obj = new PerformanceDependentSessionProfiler(((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isDebuggingViewPoolOptimization()))).booleanValue());
                this.mPerformanceDependentSessionProfilerInstance = obj;
            }
            return (PerformanceDependentSessionProfiler) obj;
        }

        ReleaseManager cacheReleaseManager() {
            Object obj = this.mReleaseManagerInstance;
            if (obj == null) {
                R1.b.a();
                obj = new ReleaseManager(cacheRuntimeStoreProvider());
                this.mReleaseManagerInstance = obj;
            }
            return (ReleaseManager) obj;
        }

        RenderScript cacheRenderScript() {
            Object obj = this.mRenderScriptInstance;
            if (obj == null) {
                R1.b.a();
                obj = R1.a.b(Div2Module.provideRenderScript(this.mBaseContext));
                this.mRenderScriptInstance = obj;
            }
            return (RenderScript) obj;
        }

        RuntimeStoreProvider cacheRuntimeStoreProvider() {
            Object obj = this.mRuntimeStoreProviderInstance;
            if (obj == null) {
                R1.b.a();
                obj = new RuntimeStoreProvider(new ExpressionsRuntimeProvider(this.mDivVariableController, cacheDivActionBinder(), (Div2Logger) R1.a.b(this.mDivConfiguration.getDiv2Logger()), cacheStoredValuesController()), cacheErrorCollectors());
                this.mRuntimeStoreProviderInstance = obj;
            }
            return (RuntimeStoreProvider) obj;
        }

        StoredValuesController cacheStoredValuesController() {
            Object obj = this.mStoredValuesControllerInstance;
            if (obj == null) {
                R1.b.a();
                obj = new StoredValuesController(new ProviderImpl(this.mDivKitComponent, 1));
                this.mStoredValuesControllerInstance = obj;
            }
            return (StoredValuesController) obj;
        }

        TabsStateCache cacheTabsStateCache() {
            Object obj = this.mTabsStateCacheInstance;
            if (obj == null) {
                R1.b.a();
                obj = new TabsStateCache();
                this.mTabsStateCacheInstance = obj;
            }
            return (TabsStateCache) obj;
        }

        TemporaryDivStateCache cacheTemporaryDivStateCache() {
            Object obj = this.mTemporaryDivStateCacheInstance;
            if (obj == null) {
                R1.b.a();
                obj = new TemporaryDivStateCache();
                this.mTemporaryDivStateCacheInstance = obj;
            }
            return (TemporaryDivStateCache) obj;
        }

        TwoWayIntegerVariableBinder cacheTwoWayIntegerVariableBinder() {
            Object obj = this.mTwoWayIntegerVariableBinderInstance;
            if (obj == null) {
                R1.b.a();
                obj = new TwoWayIntegerVariableBinder(cacheErrorCollectors());
                this.mTwoWayIntegerVariableBinderInstance = obj;
            }
            return (TwoWayIntegerVariableBinder) obj;
        }

        TwoWayStringVariableBinder cacheTwoWayStringVariableBinder() {
            Object obj = this.mTwoWayStringVariableBinderInstance;
            if (obj == null) {
                R1.b.a();
                obj = new TwoWayStringVariableBinder(cacheErrorCollectors());
                this.mTwoWayStringVariableBinderInstance = obj;
            }
            return (TwoWayStringVariableBinder) obj;
        }

        ViewPool cacheViewPool() {
            Object obj = this.mViewPoolInstance;
            if (obj == null) {
                R1.b.a();
                obj = R1.a.b(Div2Module.provideViewPool(((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isViewPoolEnabled()))).booleanValue(), (ExternalOptional) R1.a.b(Div2Module.provideViewPoolProfiler(((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isViewPoolProfilingEnabled()))).booleanValue(), (ViewPoolProfiler.Reporter) R1.a.b(this.mDivConfiguration.getViewPoolReporter()))), cachePerformanceDependentSessionProfiler(), this.mDivKitComponent.cacheViewCreator()));
                this.mViewPoolInstance = obj;
            }
            return (ViewPool) obj;
        }

        ViewPreCreationProfileRepository cacheViewPreCreationProfileRepository() {
            Object obj = this.mViewPreCreationProfileRepositoryInstance;
            if (obj == null) {
                R1.b.a();
                obj = new ViewPreCreationProfileRepository(this.mDivKitComponent.mApplicationContext, (ViewPreCreationProfile) R1.a.b(this.mDivConfiguration.getViewPreCreationProfile()));
                this.mViewPreCreationProfileRepositoryInstance = obj;
            }
            return (ViewPreCreationProfileRepository) obj;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionBinder getActionBinder() {
            return cacheDivActionBinder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionHandler getActionHandler() {
            return (DivActionHandler) R1.a.b(this.mDivConfiguration.getActionHandler());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionTypedHandlerCombiner getActionTypedHandlerCombiner() {
            return this.mDivKitComponent.cacheDivActionTypedHandlerCombiner();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public BitmapEffectHelper getBitmapEffectHelper() {
            return cacheBitmapEffectHelper();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2Builder getDiv2Builder() {
            return cacheDiv2Builder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2Logger getDiv2Logger() {
            return (Div2Logger) R1.a.b(this.mDivConfiguration.getDiv2Logger());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivBinder getDivBinder() {
            return cacheDivBinder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivCreationTracker getDivCreationTracker() {
            return this.mDivCreationTracker;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivCustomContainerChildFactory getDivCustomContainerChildFactory() {
            return new DivCustomContainerChildFactory();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivDataChangeListener getDivDataChangeListener() {
            return (DivDataChangeListener) R1.a.b(this.mDivConfiguration.getDivDataChangeListener());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivDownloader getDivDownloader() {
            return (DivDownloader) R1.a.b(this.mDivConfiguration.getDivDownloader());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivStateChangeListener getDivStateChangeListener() {
            return (DivStateChangeListener) R1.a.b(this.mDivConfiguration.getDivStateChangeListener());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivTimerEventDispatcherProvider getDivTimersControllerProvider() {
            return cacheDivTimerEventDispatcherProvider();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVariableController getDivVariableController() {
            return this.mDivVariableController;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVideoActionHandler getDivVideoActionHandler() {
            return cacheDivVideoActionHandler();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivViewCreator getDivViewCreator() {
            return cacheDivViewCreator();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivViewDataPreloader getDivViewDataPreloader() {
            return cacheDivViewDataPreloader();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public ErrorCollectors getErrorCollectors() {
            return cacheErrorCollectors();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public HistogramReporter getHistogramReporter() {
            return cacheHistogramReporter();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public PerformanceDependentSessionProfiler getPerformanceDependentSessionProfiler() {
            return cachePerformanceDependentSessionProfiler();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public ReleaseManager getReleaseManager() {
            return cacheReleaseManager();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public RuntimeStoreProvider getRuntimeStoreProvider() {
            return cacheRuntimeStoreProvider();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivStateManager getStateManager() {
            return cacheDivStateManager();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public StoredValuesController getStoredValuesController() {
            return cacheStoredValuesController();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public TemporaryDivStateCache getTemporaryDivStateCache() {
            return cacheTemporaryDivStateCache();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivTooltipController getTooltipController() {
            return cacheDivTooltipController();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public ViewPreCreationProfileRepository getViewPreCreationProfileRepository() {
            return cacheViewPreCreationProfileRepository();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVisibilityActionDispatcher getVisibilityActionDispatcher() {
            return cacheDivVisibilityActionDispatcher();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVisibilityActionTracker getVisibilityActionTracker() {
            return cacheDivVisibilityActionTracker();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isBindOnAttachEnabled() {
            return ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isBindOnAttachEnabled()))).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isComplexRebindEnabled() {
            return ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isComplexRebindEnabled()))).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isPagerPageClipEnabled() {
            return ((Boolean) R1.a.b(Boolean.valueOf(this.mDivConfiguration.isPagerPageClipEnabled()))).booleanValue();
        }

        Object switch$$access(int i4) {
            if (i4 == 0) {
                return cacheDivBinder();
            }
            if (i4 == 1) {
                return cacheDiv2Builder();
            }
            if (i4 == 2) {
                return cacheDivViewCreator();
            }
            throw new AssertionError();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2ViewComponent.Builder viewComponent() {
            return new Div2ViewComponentImpl.ComponentFactoryImpl(this);
        }
    }

    static final class ProviderImpl implements Q1.a {
        private final Yatagan$DivKitComponent mDelegate;
        private final int mIndex;

        ProviderImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, int i4) {
            this.mDelegate = yatagan$DivKitComponent;
            this.mIndex = i4;
        }

        @Override // V1.a
        public Object get() {
            return this.mDelegate.switch$$access(this.mIndex);
        }
    }

    private static final class UninitializedLock {
        private UninitializedLock() {
        }
    }

    Yatagan$DivKitComponent(Context context, DivKitConfiguration divKitConfiguration) {
        this.mDivActionTypedHandlerCombinerInstance = new UninitializedLock();
        this.mDivStorageComponentInstance = new UninitializedLock();
        this.mViewCreatorInstance = new UninitializedLock();
        this.mSendBeaconManagerInstance = new UninitializedLock();
        this.mHistogramRecorderInstance = new UninitializedLock();
        this.mDivParsingHistogramReporterInstance = new UninitializedLock();
        this.mHistogramColdTypeCheckerInstance = new UninitializedLock();
        this.mApplicationContext = (Context) R1.a.a(context);
        this.mDivKitConfiguration = (DivKitConfiguration) R1.a.a(divKitConfiguration);
    }

    public static DivKitComponent.Builder builder() {
        return new ComponentFactoryImpl();
    }

    HistogramReporterDelegate accessHistogramReporterDelegate() {
        return (HistogramReporterDelegate) R1.a.b(DivKitHistogramsModule.INSTANCE.provideHistogramReporterDelegate((HistogramConfiguration) R1.a.b(this.mDivKitConfiguration.histogramConfiguration()), new ProviderImpl(this, 4), new ProviderImpl(this, 5)));
    }

    DivActionTypedHandlerCombiner cacheDivActionTypedHandlerCombiner() {
        Object obj;
        Object obj2 = this.mDivActionTypedHandlerCombinerInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mDivActionTypedHandlerCombinerInstance;
                    if (obj instanceof UninitializedLock) {
                        obj = new DivActionTypedHandlerCombiner(manyOfSetDivActionTypedHandler());
                        this.mDivActionTypedHandlerCombinerInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (DivActionTypedHandlerCombiner) obj2;
    }

    DivParsingHistogramReporter cacheDivParsingHistogramReporter() {
        Object obj;
        Object obj2 = this.mDivParsingHistogramReporterInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mDivParsingHistogramReporterInstance;
                    if (obj instanceof UninitializedLock) {
                        obj = R1.a.b(DivKitHistogramsModule.INSTANCE.provideDivParsingHistogramReporter((HistogramConfiguration) R1.a.b(this.mDivKitConfiguration.histogramConfiguration()), new ProviderImpl(this, 0), new ProviderImpl(this, 2)));
                        this.mDivParsingHistogramReporterInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (DivParsingHistogramReporter) obj2;
    }

    DivStorageComponent cacheDivStorageComponent() {
        Object obj;
        Object obj2 = this.mDivStorageComponentInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mDivStorageComponentInstance;
                    if (obj instanceof UninitializedLock) {
                        obj = R1.a.b(DivStorageModule.INSTANCE.provideDivStorageComponent((ExternalOptional) R1.a.b(this.mDivKitConfiguration.externalDivStorageComponent()), this.mApplicationContext, accessHistogramReporterDelegate(), cacheDivParsingHistogramReporter()));
                        this.mDivStorageComponentInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (DivStorageComponent) obj2;
    }

    HistogramColdTypeChecker cacheHistogramColdTypeChecker() {
        Object obj;
        Object obj2 = this.mHistogramColdTypeCheckerInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mHistogramColdTypeCheckerInstance;
                    if (obj instanceof UninitializedLock) {
                        obj = new HistogramColdTypeChecker();
                        this.mHistogramColdTypeCheckerInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (HistogramColdTypeChecker) obj2;
    }

    HistogramRecorder cacheHistogramRecorder() {
        Object obj;
        Object obj2 = this.mHistogramRecorderInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mHistogramRecorderInstance;
                    if (obj instanceof UninitializedLock) {
                        obj = R1.a.b(this.mDivKitConfiguration.histogramRecorder());
                        this.mHistogramRecorderInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (HistogramRecorder) obj2;
    }

    i1.b cacheSendBeaconManager() {
        Object obj;
        Object obj2 = this.mSendBeaconManagerInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mSendBeaconManagerInstance;
                    if (obj instanceof UninitializedLock) {
                        DivKitModule divKitModule = DivKitModule.INSTANCE;
                        Context context = this.mApplicationContext;
                        this.mDivKitConfiguration.sendBeaconConfiguration();
                        android.support.v4.media.session.b.a(R1.a.b(null));
                        obj = R1.a.b(DivKitModule.provideSendBeaconManager(context, null));
                        this.mSendBeaconManagerInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (i1.b) obj2;
    }

    ViewCreator cacheViewCreator() {
        Object obj;
        Object obj2 = this.mViewCreatorInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mViewCreatorInstance;
                    if (obj instanceof UninitializedLock) {
                        DivKitModule divKitModule = DivKitModule.INSTANCE;
                        obj = R1.a.b(DivKitModule.provideViewCreator((CpuUsageHistogramReporter) R1.a.b(this.mDivKitConfiguration.cpuUsageHistogramReporter())));
                        this.mViewCreatorInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (ViewCreator) obj2;
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public Div2Component.Builder div2Component() {
        return new Div2ComponentImpl.ComponentFactoryImpl(this);
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public HistogramRecordConfiguration getHistogramRecordConfiguration() {
        return (HistogramRecordConfiguration) R1.a.b(this.mDivKitConfiguration.histogramRecordConfiguration());
    }

    Set<DivActionTypedHandler> manyOfSetDivActionTypedHandler() {
        HashSet hashSet = new HashSet(15);
        hashSet.add(new DivAnimatorTypedActionHandler());
        hashSet.add(new DivActionTypedArrayMutationHandler());
        hashSet.add(new DivActionTypedClearFocusHandler());
        hashSet.add(new DivActionTypedCopyToClipboardHandler());
        hashSet.add(new DivActionTypedDictSetValueHandler());
        hashSet.add(new DivActionTypedFocusElementHandler());
        hashSet.add(new DivActionTypedHideTooltipHandler());
        hashSet.add(new DivActionTypedScrollHandler());
        hashSet.add(new DivActionTypedSetStateHandler());
        hashSet.add(new DivActionTypedSetVariableHandler());
        hashSet.add(new DivActionTypedSetStoredValueHandler());
        hashSet.add(new DivActionTypedShowTooltipHandler());
        hashSet.add(new DivActionTypedSubmitHandler((DivRequestExecutor) R1.a.b(this.mDivKitConfiguration.divRequestExecutor())));
        hashSet.add(new DivActionTypedTimerHandler());
        hashSet.add(new DivActionTypedVideoHandler());
        return hashSet;
    }

    Object switch$$access(int i4) {
        if (i4 == 0) {
            return accessHistogramReporterDelegate();
        }
        if (i4 == 1) {
            return cacheDivStorageComponent();
        }
        if (i4 == 2) {
            return R1.a.b(this.mDivKitConfiguration.executorService());
        }
        if (i4 == 3) {
            return cacheSendBeaconManager();
        }
        if (i4 == 4) {
            return cacheHistogramRecorder();
        }
        if (i4 == 5) {
            return cacheHistogramColdTypeChecker();
        }
        throw new AssertionError();
    }
}
