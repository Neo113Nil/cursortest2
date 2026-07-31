package com.yandex.div.core;

import androidx.annotation.NonNull;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.state.DivStateCache;
import com.yandex.div.state.InMemoryDivStateCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class DivConfiguration {
    private final boolean mAccessibilityEnabled;

    @NonNull
    private final DivActionHandler mActionHandler;
    private boolean mBindOnAttachEnabled;
    private boolean mComplexRebindEnabled;

    @NonNull
    private final Div2ImageStubProvider mDiv2ImageStubProvider;

    @NonNull
    private final Div2Logger mDiv2Logger;

    @NonNull
    private final DivCustomContainerViewAdapter mDivCustomContainerViewAdapter;

    @NonNull
    private final DivDataChangeListener mDivDataChangeListener;

    @NonNull
    private final DivDownloader mDivDownloader;

    @NonNull
    private final DivPlayerFactory mDivPlayerFactory;

    @NonNull
    private final DivPlayerPreloader mDivPlayerPreloader;

    @NonNull
    private final DivStateCache mDivStateCache;

    @NonNull
    private final DivStateChangeListener mDivStateChangeListener;

    @NonNull
    private final DivVariableController mDivVariableController;

    @NonNull
    private final List<Object> mDivVisibilityChangeListeners;

    @NonNull
    private final List<DivExtensionHandler> mExtensionHandlers;

    @NonNull
    private final DivImageLoader mImageLoader;
    private final boolean mLongtapActionsPassToChild;
    private boolean mMultipleStateChangeEnabled;
    private boolean mPagerPageClipEnabled;
    private boolean mPermanentDebugPanelEnabled;
    private float mRecyclerScrollInterceptionAngle;
    private boolean mResourceCacheEnabled;
    private final boolean mShouldIgnoreMenuItemsInActions;
    private final boolean mSupportHyphenation;
    private final boolean mSwipeOutBeaconsEnabled;
    private final boolean mTapBeaconsEnabled;

    @NonNull
    private final DivTooltipRestrictor mTooltipRestrictor;

    @NonNull
    private final DivTypefaceProvider mTypefaceProvider;

    @NonNull
    private final Map<String, DivTypefaceProvider> mTypefaceProviders;
    private boolean mViewPoolEnabled;
    private boolean mViewPoolOptimizationDebug;
    private boolean mViewPoolProfilingEnabled;

    @NonNull
    private final ViewPoolProfiler.Reporter mViewPoolReporter;

    @NonNull
    private final ViewPreCreationProfile mViewPreCreationProfile;
    private final boolean mVisibilityBeaconsEnabled;
    private final boolean mVisualErrors;

    public static class Builder {
        private DivActionHandler mActionHandler;
        private Map<String, DivTypefaceProvider> mAdditionalTypefaceProviders;
        private Div2ImageStubProvider mDiv2ImageStubProvider;
        private Div2Logger mDiv2Logger;
        private DivCustomContainerViewAdapter mDivCustomContainerViewAdapter;
        private DivDataChangeListener mDivDataChangeListener;
        private DivDownloader mDivDownloader;
        private DivPlayerFactory mDivPlayerFactory;
        private DivPlayerPreloader mDivPlayerPreloader;
        private DivStateCache mDivStateCache;
        private DivStateChangeListener mDivStateChangeListener;
        private DivVariableController mDivVariableController;

        @NonNull
        private final DivImageLoader mImageLoader;
        private DivTooltipRestrictor mTooltipRestrictor;
        private DivTypefaceProvider mTypefaceProvider;
        private ViewPoolProfiler.Reporter mViewPoolReporter;
        private ViewPreCreationProfile mViewPreCreationProfile;

        @NonNull
        private final List<Object> mDivVisibilityChangeListeners = new ArrayList();

        @NonNull
        private final List<DivExtensionHandler> mExtensionHandlers = new ArrayList();
        private boolean mTapBeaconsEnabled = Experiment.TAP_BEACONS_ENABLED.getDefaultValue();
        private boolean mVisibilityBeaconsEnabled = Experiment.VISIBILITY_BEACONS_ENABLED.getDefaultValue();
        private boolean mSwipeOutBeaconsEnabled = Experiment.SWIPE_OUT_BEACONS_ENABLED.getDefaultValue();
        private boolean mLongtapActionsPassToChild = Experiment.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED.getDefaultValue();
        private boolean mShouldIgnoreMenuItemsInActions = Experiment.IGNORE_ACTION_MENU_ITEMS_ENABLED.getDefaultValue();
        private boolean mSupportHyphenation = Experiment.HYPHENATION_SUPPORT_ENABLED.getDefaultValue();
        private boolean mVisualErrors = Experiment.VISUAL_ERRORS_ENABLED.getDefaultValue();
        private boolean mAccessibilityEnabled = Experiment.ACCESSIBILITY_ENABLED.getDefaultValue();
        private boolean mViewPoolEnabled = Experiment.VIEW_POOL_ENABLED.getDefaultValue();
        private boolean mViewPoolProfilingEnabled = Experiment.VIEW_POOL_PROFILING_ENABLED.getDefaultValue();
        private boolean mViewPoolOptimizationDebug = Experiment.VIEW_POOL_OPTIMIZATION_DEBUG.getDefaultValue();
        private boolean mResourceCacheEnabled = Experiment.RESOURCE_CACHE_ENABLED.getDefaultValue();
        private boolean mMultipleStateChangeEnabled = Experiment.MULTIPLE_STATE_CHANGE_ENABLED.getDefaultValue();
        private boolean mBindOnAttachEnabled = false;
        private boolean mComplexRebindEnabled = Experiment.COMPLEX_REBIND_ENABLED.getDefaultValue();
        private boolean mPagerPageClipEnabled = Experiment.PAGER_PAGE_CLIP_ENABLED.getDefaultValue();
        private boolean mPermanentDebugPanelEnabled = Experiment.PERMANENT_DEBUG_PANEL_ENABLED.getDefaultValue();
        private float mRecyclerScrollInterceptionAngle = 0.0f;

        public Builder(@NonNull DivImageLoader divImageLoader) {
            this.mImageLoader = divImageLoader;
        }

        @NonNull
        public Builder actionHandler(@NonNull DivActionHandler divActionHandler) {
            this.mActionHandler = divActionHandler;
            return this;
        }

        @NonNull
        public DivConfiguration build() {
            DivTypefaceProvider divTypefaceProvider = this.mTypefaceProvider;
            if (divTypefaceProvider == null) {
                divTypefaceProvider = DivTypefaceProvider.DEFAULT;
            }
            DivTypefaceProvider divTypefaceProvider2 = divTypefaceProvider;
            DivPlayerFactory divPlayerFactory = this.mDivPlayerFactory;
            if (divPlayerFactory == null) {
                divPlayerFactory = DivPlayerFactory.STUB;
            }
            DivPlayerFactory divPlayerFactory2 = divPlayerFactory;
            DivPlayerPreloader divPlayerPreloader = this.mDivPlayerPreloader;
            if (divPlayerPreloader == null) {
                divPlayerPreloader = divPlayerFactory2.makePreloader();
            }
            DivPlayerPreloader divPlayerPreloader2 = divPlayerPreloader;
            DivImageLoader divImageLoader = this.mImageLoader;
            DivActionHandler divActionHandler = this.mActionHandler;
            if (divActionHandler == null) {
                divActionHandler = new DivActionHandler();
            }
            DivActionHandler divActionHandler2 = divActionHandler;
            Div2Logger div2Logger = this.mDiv2Logger;
            if (div2Logger == null) {
                div2Logger = Div2Logger.STUB;
            }
            Div2Logger div2Logger2 = div2Logger;
            DivDataChangeListener divDataChangeListener = this.mDivDataChangeListener;
            if (divDataChangeListener == null) {
                divDataChangeListener = DivDataChangeListener.STUB;
            }
            DivDataChangeListener divDataChangeListener2 = divDataChangeListener;
            DivStateChangeListener divStateChangeListener = this.mDivStateChangeListener;
            if (divStateChangeListener == null) {
                divStateChangeListener = DivStateChangeListener.STUB;
            }
            DivStateChangeListener divStateChangeListener2 = divStateChangeListener;
            DivStateCache divStateCache = this.mDivStateCache;
            if (divStateCache == null) {
                divStateCache = new InMemoryDivStateCache();
            }
            DivStateCache divStateCache2 = divStateCache;
            Div2ImageStubProvider div2ImageStubProvider = this.mDiv2ImageStubProvider;
            if (div2ImageStubProvider == null) {
                div2ImageStubProvider = Div2ImageStubProvider.STUB;
            }
            Div2ImageStubProvider div2ImageStubProvider2 = div2ImageStubProvider;
            List<Object> list = this.mDivVisibilityChangeListeners;
            DivCustomContainerViewAdapter divCustomContainerViewAdapter = this.mDivCustomContainerViewAdapter;
            if (divCustomContainerViewAdapter == null) {
                divCustomContainerViewAdapter = DivCustomContainerViewAdapter.STUB;
            }
            DivCustomContainerViewAdapter divCustomContainerViewAdapter2 = divCustomContainerViewAdapter;
            DivTooltipRestrictor divTooltipRestrictor = this.mTooltipRestrictor;
            if (divTooltipRestrictor == null) {
                divTooltipRestrictor = DivTooltipRestrictor.STUB;
            }
            DivTooltipRestrictor divTooltipRestrictor2 = divTooltipRestrictor;
            List<DivExtensionHandler> list2 = this.mExtensionHandlers;
            DivDownloader divDownloader = this.mDivDownloader;
            if (divDownloader == null) {
                divDownloader = DivDownloader.STUB;
            }
            DivDownloader divDownloader2 = divDownloader;
            Map map = this.mAdditionalTypefaceProviders;
            if (map == null) {
                map = new HashMap();
            }
            Map map2 = map;
            ViewPreCreationProfile viewPreCreationProfile = this.mViewPreCreationProfile;
            if (viewPreCreationProfile == null) {
                viewPreCreationProfile = new ViewPreCreationProfile();
            }
            ViewPreCreationProfile viewPreCreationProfile2 = viewPreCreationProfile;
            ViewPoolProfiler.Reporter reporter = this.mViewPoolReporter;
            if (reporter == null) {
                reporter = ViewPoolProfiler.Reporter.NO_OP;
            }
            ViewPoolProfiler.Reporter reporter2 = reporter;
            DivVariableController divVariableController = this.mDivVariableController;
            if (divVariableController == null) {
                divVariableController = new DivVariableController();
            }
            return new DivConfiguration(divImageLoader, divActionHandler2, div2Logger2, divDataChangeListener2, divStateChangeListener2, divStateCache2, div2ImageStubProvider2, list, divCustomContainerViewAdapter2, divPlayerFactory2, divPlayerPreloader2, divTooltipRestrictor2, list2, divDownloader2, divTypefaceProvider2, map2, viewPreCreationProfile2, reporter2, divVariableController, this.mTapBeaconsEnabled, this.mVisibilityBeaconsEnabled, this.mSwipeOutBeaconsEnabled, this.mLongtapActionsPassToChild, this.mShouldIgnoreMenuItemsInActions, this.mVisualErrors, this.mSupportHyphenation, this.mAccessibilityEnabled, this.mViewPoolEnabled, this.mViewPoolProfilingEnabled, this.mViewPoolOptimizationDebug, this.mResourceCacheEnabled, this.mMultipleStateChangeEnabled, this.mBindOnAttachEnabled, this.mComplexRebindEnabled, this.mPagerPageClipEnabled, this.mPermanentDebugPanelEnabled, this.mRecyclerScrollInterceptionAngle);
        }

        @NonNull
        public Builder divCustomContainerViewAdapter(@NonNull DivCustomContainerViewAdapter divCustomContainerViewAdapter) {
            this.mDivCustomContainerViewAdapter = divCustomContainerViewAdapter;
            return this;
        }

        @NonNull
        public Builder extension(@NonNull DivExtensionHandler divExtensionHandler) {
            this.mExtensionHandlers.add(divExtensionHandler);
            return this;
        }

        @NonNull
        public Builder typefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
            this.mTypefaceProvider = divTypefaceProvider;
            return this;
        }
    }

    @NonNull
    public DivActionHandler getActionHandler() {
        return this.mActionHandler;
    }

    @NonNull
    public Map<String, ? extends DivTypefaceProvider> getAdditionalTypefaceProviders() {
        return this.mTypefaceProviders;
    }

    public boolean getAreVisualErrorsEnabled() {
        return this.mVisualErrors;
    }

    @NonNull
    public Div2ImageStubProvider getDiv2ImageStubProvider() {
        return this.mDiv2ImageStubProvider;
    }

    @NonNull
    public Div2Logger getDiv2Logger() {
        return this.mDiv2Logger;
    }

    @NonNull
    public DivCustomContainerViewAdapter getDivCustomContainerViewAdapter() {
        return this.mDivCustomContainerViewAdapter;
    }

    @NonNull
    public DivDataChangeListener getDivDataChangeListener() {
        return this.mDivDataChangeListener;
    }

    @NonNull
    public DivDownloader getDivDownloader() {
        return this.mDivDownloader;
    }

    @NonNull
    public DivPlayerFactory getDivPlayerFactory() {
        return this.mDivPlayerFactory;
    }

    @NonNull
    public DivPlayerPreloader getDivPlayerPreloader() {
        return this.mDivPlayerPreloader;
    }

    @NonNull
    public DivStateCache getDivStateCache() {
        return this.mDivStateCache;
    }

    @NonNull
    public DivStateChangeListener getDivStateChangeListener() {
        return this.mDivStateChangeListener;
    }

    @NonNull
    public DivVariableController getDivVariableController() {
        return this.mDivVariableController;
    }

    @NonNull
    public List<Object> getDivVisibilityChangeListeners() {
        return this.mDivVisibilityChangeListeners;
    }

    @NonNull
    public List<? extends DivExtensionHandler> getExtensionHandlers() {
        return this.mExtensionHandlers;
    }

    @NonNull
    public DivImageLoader getImageLoader() {
        return this.mImageLoader;
    }

    public float getRecyclerScrollInterceptionAngle() {
        return this.mRecyclerScrollInterceptionAngle;
    }

    @NonNull
    public DivTooltipRestrictor getTooltipRestrictor() {
        return this.mTooltipRestrictor;
    }

    @NonNull
    public DivTypefaceProvider getTypefaceProvider() {
        return this.mTypefaceProvider;
    }

    @NonNull
    public ViewPoolProfiler.Reporter getViewPoolReporter() {
        return this.mViewPoolReporter;
    }

    @NonNull
    public ViewPreCreationProfile getViewPreCreationProfile() {
        return this.mViewPreCreationProfile;
    }

    public boolean isAccessibilityEnabled() {
        return this.mAccessibilityEnabled;
    }

    public boolean isBindOnAttachEnabled() {
        return this.mBindOnAttachEnabled;
    }

    public boolean isComplexRebindEnabled() {
        return this.mComplexRebindEnabled;
    }

    public boolean isContextMenuHandlerOverridden() {
        return this.mShouldIgnoreMenuItemsInActions;
    }

    public boolean isDebuggingViewPoolOptimization() {
        return this.mViewPoolOptimizationDebug;
    }

    public boolean isHyphenationSupported() {
        return this.mSupportHyphenation;
    }

    public boolean isLongtapActionsPassToChild() {
        return this.mLongtapActionsPassToChild;
    }

    public boolean isMultipleStateChangeEnabled() {
        return this.mMultipleStateChangeEnabled;
    }

    public boolean isPagerPageClipEnabled() {
        return this.mPagerPageClipEnabled;
    }

    public boolean isPermanentDebugPanelEnabled() {
        return this.mPermanentDebugPanelEnabled;
    }

    public boolean isResourceCacheEnabled() {
        return this.mResourceCacheEnabled;
    }

    public boolean isSwipeOutBeaconsEnabled() {
        return this.mSwipeOutBeaconsEnabled;
    }

    public boolean isTapBeaconsEnabled() {
        return this.mTapBeaconsEnabled;
    }

    public boolean isViewPoolEnabled() {
        return this.mViewPoolEnabled;
    }

    public boolean isViewPoolProfilingEnabled() {
        return this.mViewPoolProfilingEnabled;
    }

    public boolean isVisibilityBeaconsEnabled() {
        return this.mVisibilityBeaconsEnabled;
    }

    private DivConfiguration(@NonNull DivImageLoader divImageLoader, @NonNull DivActionHandler divActionHandler, @NonNull Div2Logger div2Logger, @NonNull DivDataChangeListener divDataChangeListener, @NonNull DivStateChangeListener divStateChangeListener, @NonNull DivStateCache divStateCache, @NonNull Div2ImageStubProvider div2ImageStubProvider, @NonNull List<Object> list, @NonNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NonNull DivPlayerFactory divPlayerFactory, @NonNull DivPlayerPreloader divPlayerPreloader, @NonNull DivTooltipRestrictor divTooltipRestrictor, @NonNull List<DivExtensionHandler> list2, @NonNull DivDownloader divDownloader, @NonNull DivTypefaceProvider divTypefaceProvider, @NonNull Map<String, DivTypefaceProvider> map, @NonNull ViewPreCreationProfile viewPreCreationProfile, @NonNull ViewPoolProfiler.Reporter reporter, @NonNull DivVariableController divVariableController, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, float f4) {
        this.mImageLoader = divImageLoader;
        this.mActionHandler = divActionHandler;
        this.mDiv2Logger = div2Logger;
        this.mDivDataChangeListener = divDataChangeListener;
        this.mDivStateChangeListener = divStateChangeListener;
        this.mDivStateCache = divStateCache;
        this.mDiv2ImageStubProvider = div2ImageStubProvider;
        this.mDivVisibilityChangeListeners = list;
        this.mDivCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.mDivPlayerFactory = divPlayerFactory;
        this.mDivPlayerPreloader = divPlayerPreloader;
        this.mTooltipRestrictor = divTooltipRestrictor;
        this.mExtensionHandlers = list2;
        this.mDivDownloader = divDownloader;
        this.mTypefaceProvider = divTypefaceProvider;
        this.mTypefaceProviders = map;
        this.mViewPoolReporter = reporter;
        this.mTapBeaconsEnabled = z4;
        this.mVisibilityBeaconsEnabled = z5;
        this.mSwipeOutBeaconsEnabled = z6;
        this.mLongtapActionsPassToChild = z7;
        this.mShouldIgnoreMenuItemsInActions = z8;
        this.mVisualErrors = z9;
        this.mSupportHyphenation = z10;
        this.mAccessibilityEnabled = z11;
        this.mViewPoolEnabled = z12;
        this.mViewPreCreationProfile = viewPreCreationProfile;
        this.mViewPoolProfilingEnabled = z13;
        this.mViewPoolOptimizationDebug = z14;
        this.mResourceCacheEnabled = z15;
        this.mMultipleStateChangeEnabled = z16;
        this.mBindOnAttachEnabled = z17;
        this.mComplexRebindEnabled = z18;
        this.mPermanentDebugPanelEnabled = z20;
        this.mDivVariableController = divVariableController;
        this.mRecyclerScrollInterceptionAngle = f4;
        this.mPagerPageClipEnabled = z19;
    }
}
