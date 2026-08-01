package com.facebook.react.internal.featureflags;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReactNativeFeatureFlagsLocalAccessor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b[\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00108\u001a\u00020\nH\u0016J\b\u00109\u001a\u00020\nH\u0016J\b\u0010:\u001a\u00020\nH\u0016J\b\u0010;\u001a\u00020\nH\u0016J\b\u0010<\u001a\u00020\nH\u0016J\b\u0010=\u001a\u00020\nH\u0016J\b\u0010>\u001a\u00020\nH\u0016J\b\u0010?\u001a\u00020\nH\u0016J\b\u0010@\u001a\u00020\nH\u0016J\b\u0010A\u001a\u00020\nH\u0016J\b\u0010B\u001a\u00020\nH\u0016J\b\u0010C\u001a\u00020\nH\u0016J\b\u0010D\u001a\u00020\nH\u0016J\b\u0010E\u001a\u00020\nH\u0016J\b\u0010F\u001a\u00020\nH\u0016J\b\u0010G\u001a\u00020\nH\u0016J\b\u0010H\u001a\u00020\nH\u0016J\b\u0010I\u001a\u00020\nH\u0016J\b\u0010J\u001a\u00020\nH\u0016J\b\u0010K\u001a\u00020\nH\u0016J\b\u0010L\u001a\u00020\nH\u0016J\b\u0010M\u001a\u00020\nH\u0016J\b\u0010N\u001a\u00020\nH\u0016J\b\u0010O\u001a\u00020\nH\u0016J\b\u0010P\u001a\u00020\nH\u0016J\b\u0010Q\u001a\u00020\nH\u0016J\b\u0010R\u001a\u00020\nH\u0016J\b\u0010S\u001a\u00020\nH\u0016J\b\u0010T\u001a\u00020\nH\u0016J\b\u0010U\u001a\u00020\nH\u0016J\b\u0010V\u001a\u00020\nH\u0016J\b\u0010W\u001a\u00020\nH\u0016J\b\u0010X\u001a\u00020\nH\u0016J\b\u0010Y\u001a\u00020\nH\u0016J\b\u0010Z\u001a\u00020\nH\u0016J\b\u0010[\u001a\u00020\nH\u0016J\b\u0010\\\u001a\u00020\nH\u0016J\b\u0010]\u001a\u00020\nH\u0016J\b\u0010^\u001a\u00020\nH\u0016J\b\u0010_\u001a\u00020\nH\u0016J\b\u0010`\u001a\u00020\nH\u0016J\b\u0010a\u001a\u00020\nH\u0016J\b\u0010b\u001a\u00020\nH\u0016J\b\u0010c\u001a\u00020\nH\u0016J\b\u0010d\u001a\u00020\nH\u0016J\u0010\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u0005H\u0016J\b\u0010h\u001a\u00020fH\u0016J\u0012\u0010i\u001a\u0004\u0018\u00010\b2\u0006\u0010g\u001a\u00020\u0005H\u0016J\u000f\u0010j\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\bkR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010 \u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010!\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\"\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010#\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010$\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010%\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010&\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010'\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010(\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010)\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010*\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010+\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010,\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010-\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010.\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010/\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00100\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00101\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00102\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00103\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00104\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00105\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00106\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00107\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006l"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsLocalAccessor;", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;", "<init>", "()V", "currentProvider", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "accessedFeatureFlags", "", "", "commonTestFlagCache", "", "Ljava/lang/Boolean;", "completeReactInstanceCreationOnBgThreadOnAndroidCache", "disableEventLoopOnBridgelessCache", "disableMountItemReorderingAndroidCache", "enableAccumulatedUpdatesInRawPropsAndroidCache", "enableBridgelessArchitectureCache", "enableCppPropsIteratorSetterCache", "enableDeletionOfUnmountedViewsCache", "enableEagerRootViewAttachmentCache", "enableEventEmitterRetentionDuringGesturesOnAndroidCache", "enableFabricLogsCache", "enableFabricRendererCache", "enableFixForViewCommandRaceCache", "enableGranularShadowTreeStateReconciliationCache", "enableIOSViewClipToPaddingBoxCache", "enableImagePrefetchingAndroidCache", "enableLayoutAnimationsOnAndroidCache", "enableLayoutAnimationsOnIOSCache", "enableLongTaskAPICache", "enableNewBackgroundAndBorderDrawablesCache", "enablePreciseSchedulingForPremountItemsOnAndroidCache", "enablePropsUpdateReconciliationAndroidCache", "enableReportEventPaintTimeCache", "enableSynchronousStateUpdatesCache", "enableUIConsistencyCache", "enableViewRecyclingCache", "excludeYogaFromRawPropsCache", "fixDifferentiatorEmittingUpdatesWithWrongParentTagCache", "fixMappingOfEventPrioritiesBetweenFabricAndReactCache", "fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache", "fuseboxEnabledReleaseCache", "initEagerTurboModulesOnNativeModulesQueueAndroidCache", "lazyAnimationCallbacksCache", "loadVectorDrawablesOnImagesCache", "traceTurboModulePromiseRejectionsOnAndroidCache", "useAlwaysAvailableJSErrorHandlingCache", "useFabricInteropCache", "useImmediateExecutorInAndroidBridgelessCache", "useNativeViewConfigsInBridgelessModeCache", "useOptimisedViewPreallocationOnAndroidCache", "useOptimizedEventBatchingOnAndroidCache", "useRawPropsJsiValueCache", "useRuntimeShadowNodeReferenceUpdateCache", "useTurboModuleInteropCache", "useTurboModulesCache", "commonTestFlag", "completeReactInstanceCreationOnBgThreadOnAndroid", "disableEventLoopOnBridgeless", "disableMountItemReorderingAndroid", "enableAccumulatedUpdatesInRawPropsAndroid", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableDeletionOfUnmountedViews", "enableEagerRootViewAttachment", "enableEventEmitterRetentionDuringGesturesOnAndroid", "enableFabricLogs", "enableFabricRenderer", "enableFixForViewCommandRace", "enableGranularShadowTreeStateReconciliation", "enableIOSViewClipToPaddingBox", "enableImagePrefetchingAndroid", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableLongTaskAPI", "enableNewBackgroundAndBorderDrawables", "enablePreciseSchedulingForPremountItemsOnAndroid", "enablePropsUpdateReconciliationAndroid", "enableReportEventPaintTime", "enableSynchronousStateUpdates", "enableUIConsistency", "enableViewRecycling", "excludeYogaFromRawProps", "fixDifferentiatorEmittingUpdatesWithWrongParentTag", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixMountingCoordinatorReportedPendingTransactionsOnAndroid", "fuseboxEnabledRelease", "initEagerTurboModulesOnNativeModulesQueueAndroid", "lazyAnimationCallbacks", "loadVectorDrawablesOnImages", "traceTurboModulePromiseRejectionsOnAndroid", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useImmediateExecutorInAndroidBridgeless", "useNativeViewConfigsInBridgelessMode", "useOptimisedViewPreallocationOnAndroid", "useOptimizedEventBatchingOnAndroid", "useRawPropsJsiValue", "useRuntimeShadowNodeReferenceUpdate", "useTurboModuleInterop", "useTurboModules", "override", "", "provider", "dangerouslyReset", "dangerouslyForceOverride", "getAccessedFeatureFlags", "getAccessedFeatureFlags$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReactNativeFeatureFlagsLocalAccessor implements ReactNativeFeatureFlagsAccessor {
    private Boolean commonTestFlagCache;
    private Boolean completeReactInstanceCreationOnBgThreadOnAndroidCache;
    private Boolean disableEventLoopOnBridgelessCache;
    private Boolean disableMountItemReorderingAndroidCache;
    private Boolean enableAccumulatedUpdatesInRawPropsAndroidCache;
    private Boolean enableBridgelessArchitectureCache;
    private Boolean enableCppPropsIteratorSetterCache;
    private Boolean enableDeletionOfUnmountedViewsCache;
    private Boolean enableEagerRootViewAttachmentCache;
    private Boolean enableEventEmitterRetentionDuringGesturesOnAndroidCache;
    private Boolean enableFabricLogsCache;
    private Boolean enableFabricRendererCache;
    private Boolean enableFixForViewCommandRaceCache;
    private Boolean enableGranularShadowTreeStateReconciliationCache;
    private Boolean enableIOSViewClipToPaddingBoxCache;
    private Boolean enableImagePrefetchingAndroidCache;
    private Boolean enableLayoutAnimationsOnAndroidCache;
    private Boolean enableLayoutAnimationsOnIOSCache;
    private Boolean enableLongTaskAPICache;
    private Boolean enableNewBackgroundAndBorderDrawablesCache;
    private Boolean enablePreciseSchedulingForPremountItemsOnAndroidCache;
    private Boolean enablePropsUpdateReconciliationAndroidCache;
    private Boolean enableReportEventPaintTimeCache;
    private Boolean enableSynchronousStateUpdatesCache;
    private Boolean enableUIConsistencyCache;
    private Boolean enableViewRecyclingCache;
    private Boolean excludeYogaFromRawPropsCache;
    private Boolean fixDifferentiatorEmittingUpdatesWithWrongParentTagCache;
    private Boolean fixMappingOfEventPrioritiesBetweenFabricAndReactCache;
    private Boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache;
    private Boolean fuseboxEnabledReleaseCache;
    private Boolean initEagerTurboModulesOnNativeModulesQueueAndroidCache;
    private Boolean lazyAnimationCallbacksCache;
    private Boolean loadVectorDrawablesOnImagesCache;
    private Boolean traceTurboModulePromiseRejectionsOnAndroidCache;
    private Boolean useAlwaysAvailableJSErrorHandlingCache;
    private Boolean useFabricInteropCache;
    private Boolean useImmediateExecutorInAndroidBridgelessCache;
    private Boolean useNativeViewConfigsInBridgelessModeCache;
    private Boolean useOptimisedViewPreallocationOnAndroidCache;
    private Boolean useOptimizedEventBatchingOnAndroidCache;
    private Boolean useRawPropsJsiValueCache;
    private Boolean useRuntimeShadowNodeReferenceUpdateCache;
    private Boolean useTurboModuleInteropCache;
    private Boolean useTurboModulesCache;
    private ReactNativeFeatureFlagsProvider currentProvider = new ReactNativeFeatureFlagsDefaults();
    private final Set<String> accessedFeatureFlags = new LinkedHashSet();

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void dangerouslyReset() {
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean bool = this.commonTestFlagCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.commonTestFlag());
            this.accessedFeatureFlags.add("commonTestFlag");
            this.commonTestFlagCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean completeReactInstanceCreationOnBgThreadOnAndroid() {
        Boolean bool = this.completeReactInstanceCreationOnBgThreadOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.completeReactInstanceCreationOnBgThreadOnAndroid());
            this.accessedFeatureFlags.add("completeReactInstanceCreationOnBgThreadOnAndroid");
            this.completeReactInstanceCreationOnBgThreadOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableEventLoopOnBridgeless() {
        Boolean bool = this.disableEventLoopOnBridgelessCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.disableEventLoopOnBridgeless());
            this.accessedFeatureFlags.add("disableEventLoopOnBridgeless");
            this.disableEventLoopOnBridgelessCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableMountItemReorderingAndroid() {
        Boolean bool = this.disableMountItemReorderingAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.disableMountItemReorderingAndroid());
            this.accessedFeatureFlags.add("disableMountItemReorderingAndroid");
            this.disableMountItemReorderingAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAccumulatedUpdatesInRawPropsAndroid() {
        Boolean bool = this.enableAccumulatedUpdatesInRawPropsAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableAccumulatedUpdatesInRawPropsAndroid());
            this.accessedFeatureFlags.add("enableAccumulatedUpdatesInRawPropsAndroid");
            this.enableAccumulatedUpdatesInRawPropsAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    /* renamed from: enableBridgelessArchitecture */
    public boolean getNewArchitectureEnabled() {
        Boolean bool = this.enableBridgelessArchitectureCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.getNewArchitectureEnabled());
            this.accessedFeatureFlags.add("enableBridgelessArchitecture");
            this.enableBridgelessArchitectureCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCppPropsIteratorSetter() {
        Boolean bool = this.enableCppPropsIteratorSetterCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableCppPropsIteratorSetter());
            this.accessedFeatureFlags.add("enableCppPropsIteratorSetter");
            this.enableCppPropsIteratorSetterCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableDeletionOfUnmountedViews() {
        Boolean bool = this.enableDeletionOfUnmountedViewsCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableDeletionOfUnmountedViews());
            this.accessedFeatureFlags.add("enableDeletionOfUnmountedViews");
            this.enableDeletionOfUnmountedViewsCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerRootViewAttachment() {
        Boolean bool = this.enableEagerRootViewAttachmentCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableEagerRootViewAttachment());
            this.accessedFeatureFlags.add("enableEagerRootViewAttachment");
            this.enableEagerRootViewAttachmentCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEventEmitterRetentionDuringGesturesOnAndroid() {
        Boolean bool = this.enableEventEmitterRetentionDuringGesturesOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableEventEmitterRetentionDuringGesturesOnAndroid());
            this.accessedFeatureFlags.add("enableEventEmitterRetentionDuringGesturesOnAndroid");
            this.enableEventEmitterRetentionDuringGesturesOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricLogs() {
        Boolean bool = this.enableFabricLogsCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableFabricLogs());
            this.accessedFeatureFlags.add("enableFabricLogs");
            this.enableFabricLogsCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRenderer() {
        Boolean bool = this.enableFabricRendererCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableFabricRenderer());
            this.accessedFeatureFlags.add("enableFabricRenderer");
            this.enableFabricRendererCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFixForViewCommandRace() {
        Boolean bool = this.enableFixForViewCommandRaceCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableFixForViewCommandRace());
            this.accessedFeatureFlags.add("enableFixForViewCommandRace");
            this.enableFixForViewCommandRaceCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableGranularShadowTreeStateReconciliation() {
        Boolean bool = this.enableGranularShadowTreeStateReconciliationCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableGranularShadowTreeStateReconciliation());
            this.accessedFeatureFlags.add("enableGranularShadowTreeStateReconciliation");
            this.enableGranularShadowTreeStateReconciliationCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSViewClipToPaddingBox() {
        Boolean bool = this.enableIOSViewClipToPaddingBoxCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableIOSViewClipToPaddingBox());
            this.accessedFeatureFlags.add("enableIOSViewClipToPaddingBox");
            this.enableIOSViewClipToPaddingBoxCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImagePrefetchingAndroid() {
        Boolean bool = this.enableImagePrefetchingAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableImagePrefetchingAndroid());
            this.accessedFeatureFlags.add("enableImagePrefetchingAndroid");
            this.enableImagePrefetchingAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnAndroid() {
        Boolean bool = this.enableLayoutAnimationsOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableLayoutAnimationsOnAndroid());
            this.accessedFeatureFlags.add("enableLayoutAnimationsOnAndroid");
            this.enableLayoutAnimationsOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnIOS() {
        Boolean bool = this.enableLayoutAnimationsOnIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableLayoutAnimationsOnIOS());
            this.accessedFeatureFlags.add("enableLayoutAnimationsOnIOS");
            this.enableLayoutAnimationsOnIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLongTaskAPI() {
        Boolean bool = this.enableLongTaskAPICache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableLongTaskAPI());
            this.accessedFeatureFlags.add("enableLongTaskAPI");
            this.enableLongTaskAPICache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNewBackgroundAndBorderDrawables() {
        Boolean bool = this.enableNewBackgroundAndBorderDrawablesCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableNewBackgroundAndBorderDrawables());
            this.accessedFeatureFlags.add("enableNewBackgroundAndBorderDrawables");
            this.enableNewBackgroundAndBorderDrawablesCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePreciseSchedulingForPremountItemsOnAndroid() {
        Boolean bool = this.enablePreciseSchedulingForPremountItemsOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enablePreciseSchedulingForPremountItemsOnAndroid());
            this.accessedFeatureFlags.add("enablePreciseSchedulingForPremountItemsOnAndroid");
            this.enablePreciseSchedulingForPremountItemsOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePropsUpdateReconciliationAndroid() {
        Boolean bool = this.enablePropsUpdateReconciliationAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enablePropsUpdateReconciliationAndroid());
            this.accessedFeatureFlags.add("enablePropsUpdateReconciliationAndroid");
            this.enablePropsUpdateReconciliationAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableReportEventPaintTime() {
        Boolean bool = this.enableReportEventPaintTimeCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableReportEventPaintTime());
            this.accessedFeatureFlags.add("enableReportEventPaintTime");
            this.enableReportEventPaintTimeCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSynchronousStateUpdates() {
        Boolean bool = this.enableSynchronousStateUpdatesCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableSynchronousStateUpdates());
            this.accessedFeatureFlags.add("enableSynchronousStateUpdates");
            this.enableSynchronousStateUpdatesCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableUIConsistency() {
        Boolean bool = this.enableUIConsistencyCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableUIConsistency());
            this.accessedFeatureFlags.add("enableUIConsistency");
            this.enableUIConsistencyCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecycling() {
        Boolean bool = this.enableViewRecyclingCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableViewRecycling());
            this.accessedFeatureFlags.add("enableViewRecycling");
            this.enableViewRecyclingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean excludeYogaFromRawProps() {
        Boolean bool = this.excludeYogaFromRawPropsCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.excludeYogaFromRawProps());
            this.accessedFeatureFlags.add("excludeYogaFromRawProps");
            this.excludeYogaFromRawPropsCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixDifferentiatorEmittingUpdatesWithWrongParentTag() {
        Boolean bool = this.fixDifferentiatorEmittingUpdatesWithWrongParentTagCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.fixDifferentiatorEmittingUpdatesWithWrongParentTag());
            this.accessedFeatureFlags.add("fixDifferentiatorEmittingUpdatesWithWrongParentTag");
            this.fixDifferentiatorEmittingUpdatesWithWrongParentTagCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        Boolean bool = this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.fixMappingOfEventPrioritiesBetweenFabricAndReact());
            this.accessedFeatureFlags.add("fixMappingOfEventPrioritiesBetweenFabricAndReact");
            this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid() {
        Boolean bool = this.fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.fixMountingCoordinatorReportedPendingTransactionsOnAndroid());
            this.accessedFeatureFlags.add("fixMountingCoordinatorReportedPendingTransactionsOnAndroid");
            this.fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean bool = this.fuseboxEnabledReleaseCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.fuseboxEnabledRelease());
            this.accessedFeatureFlags.add("fuseboxEnabledRelease");
            this.fuseboxEnabledReleaseCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean initEagerTurboModulesOnNativeModulesQueueAndroid() {
        Boolean bool = this.initEagerTurboModulesOnNativeModulesQueueAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.initEagerTurboModulesOnNativeModulesQueueAndroid());
            this.accessedFeatureFlags.add("initEagerTurboModulesOnNativeModulesQueueAndroid");
            this.initEagerTurboModulesOnNativeModulesQueueAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean lazyAnimationCallbacks() {
        Boolean bool = this.lazyAnimationCallbacksCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.lazyAnimationCallbacks());
            this.accessedFeatureFlags.add("lazyAnimationCallbacks");
            this.lazyAnimationCallbacksCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean loadVectorDrawablesOnImages() {
        Boolean bool = this.loadVectorDrawablesOnImagesCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.loadVectorDrawablesOnImages());
            this.accessedFeatureFlags.add("loadVectorDrawablesOnImages");
            this.loadVectorDrawablesOnImagesCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean traceTurboModulePromiseRejectionsOnAndroid() {
        Boolean bool = this.traceTurboModulePromiseRejectionsOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.traceTurboModulePromiseRejectionsOnAndroid());
            this.accessedFeatureFlags.add("traceTurboModulePromiseRejectionsOnAndroid");
            this.traceTurboModulePromiseRejectionsOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useAlwaysAvailableJSErrorHandling() {
        Boolean bool = this.useAlwaysAvailableJSErrorHandlingCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useAlwaysAvailableJSErrorHandling());
            this.accessedFeatureFlags.add("useAlwaysAvailableJSErrorHandling");
            this.useAlwaysAvailableJSErrorHandlingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        Boolean bool = this.useFabricInteropCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useFabricInterop());
            this.accessedFeatureFlags.add("useFabricInterop");
            this.useFabricInteropCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useImmediateExecutorInAndroidBridgeless() {
        Boolean bool = this.useImmediateExecutorInAndroidBridgelessCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useImmediateExecutorInAndroidBridgeless());
            this.accessedFeatureFlags.add("useImmediateExecutorInAndroidBridgeless");
            this.useImmediateExecutorInAndroidBridgelessCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean bool = this.useNativeViewConfigsInBridgelessModeCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useNativeViewConfigsInBridgelessMode());
            this.accessedFeatureFlags.add("useNativeViewConfigsInBridgelessMode");
            this.useNativeViewConfigsInBridgelessModeCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimisedViewPreallocationOnAndroid() {
        Boolean bool = this.useOptimisedViewPreallocationOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useOptimisedViewPreallocationOnAndroid());
            this.accessedFeatureFlags.add("useOptimisedViewPreallocationOnAndroid");
            this.useOptimisedViewPreallocationOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimizedEventBatchingOnAndroid() {
        Boolean bool = this.useOptimizedEventBatchingOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useOptimizedEventBatchingOnAndroid());
            this.accessedFeatureFlags.add("useOptimizedEventBatchingOnAndroid");
            this.useOptimizedEventBatchingOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRawPropsJsiValue() {
        Boolean bool = this.useRawPropsJsiValueCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useRawPropsJsiValue());
            this.accessedFeatureFlags.add("useRawPropsJsiValue");
            this.useRawPropsJsiValueCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdate() {
        Boolean bool = this.useRuntimeShadowNodeReferenceUpdateCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useRuntimeShadowNodeReferenceUpdate());
            this.accessedFeatureFlags.add("useRuntimeShadowNodeReferenceUpdate");
            this.useRuntimeShadowNodeReferenceUpdateCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        Boolean bool = this.useTurboModuleInteropCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useTurboModuleInterop());
            this.accessedFeatureFlags.add("useTurboModuleInterop");
            this.useTurboModuleInteropCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModules() {
        Boolean bool = this.useTurboModulesCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useTurboModules());
            this.accessedFeatureFlags.add("useTurboModules");
            this.useTurboModulesCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void override(ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (!this.accessedFeatureFlags.isEmpty()) {
            throw new IllegalStateException("Feature flags were accessed before being overridden: " + CollectionsKt.joinToString$default(this.accessedFeatureFlags, ", ", null, null, 0, null, new Function1() { // from class: com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsLocalAccessor$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence override$lambda$0;
                    override$lambda$0 = ReactNativeFeatureFlagsLocalAccessor.override$lambda$0((String) obj);
                    return override$lambda$0;
                }
            }, 30, null));
        }
        this.currentProvider = provider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence override$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public String dangerouslyForceOverride(ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        String accessedFeatureFlags$ReactAndroid_release = getAccessedFeatureFlags$ReactAndroid_release();
        this.currentProvider = provider;
        return accessedFeatureFlags$ReactAndroid_release;
    }

    public final String getAccessedFeatureFlags$ReactAndroid_release() {
        if (this.accessedFeatureFlags.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(this.accessedFeatureFlags, ", ", null, null, 0, null, new Function1() { // from class: com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsLocalAccessor$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence accessedFeatureFlags$lambda$1;
                accessedFeatureFlags$lambda$1 = ReactNativeFeatureFlagsLocalAccessor.getAccessedFeatureFlags$lambda$1((String) obj);
                return accessedFeatureFlags$lambda$1;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getAccessedFeatureFlags$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }
}
