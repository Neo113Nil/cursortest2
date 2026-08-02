package com.withpersona.sdk2.inquiry.shared.navigation;

import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.TipsFeatureFlag;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes9.dex */
public final class NavigationStateManager {
    public final ContextScope coroutineScope;
    public final InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 externalInquiryController;
    public final FeatureFlagManager featureFlagManager;
    public boolean isNavigationEnabled;
    public boolean isTransitioningBack;
    public final StateFlowImpl navigationStateFlow;
    public boolean shouldShowBackButton;
    public boolean shouldShowCancelButton;
    public boolean shouldShowHelpButton;

    public NavigationStateManager(InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1, FeatureFlagManager featureFlagManager) {
        inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1.getClass();
        featureFlagManager.getClass();
        this.externalInquiryController = inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1;
        this.featureFlagManager = featureFlagManager;
        this.coroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.SupervisorJob$default()));
        this.navigationStateFlow = FlowKt.MutableStateFlow(new NavigationState(true, true, inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1.isNavBarEnabled, true, true, true));
        this.isNavigationEnabled = true;
    }

    public static /* synthetic */ void setState$default(NavigationStateManager navigationStateManager, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 4) != 0) {
            z3 = true;
        }
        navigationStateManager.setState(z, z2, z3, false);
    }

    public final NavigationState getNavigationState() {
        return (NavigationState) this.navigationStateFlow.getValue();
    }

    public final void setState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.shouldShowBackButton = z;
        this.shouldShowCancelButton = z2;
        this.isNavigationEnabled = z3;
        this.shouldShowHelpButton = z4 && this.featureFlagManager.getValue(TipsFeatureFlag.INSTANCE);
        updateScreenState();
    }

    public final void updateScreenState() {
        boolean z = this.shouldShowBackButton;
        boolean z2 = this.shouldShowCancelButton;
        InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 = this.externalInquiryController;
        NavigationState navigationState = new NavigationState(z, z2, inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1.isNavBarEnabled, inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1.handleBackPress, this.isNavigationEnabled && !this.isTransitioningBack, this.shouldShowHelpButton);
        StateFlowImpl stateFlowImpl = this.navigationStateFlow;
        if (Intrinsics.areEqual(stateFlowImpl.getValue(), navigationState)) {
            return;
        }
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, navigationState);
        JobKt.launch$default(this.coroutineScope, null, null, new TransitionWorker$run$1(this, navigationState, null, 26), 3);
    }
}
