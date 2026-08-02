package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import coil3.RealImageLoader;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdAutoClassificationRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer_Factory;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdLocalVideoCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdWebRtcRenderer;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryThemeManager;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class GovernmentIdStepViewModel extends ViewModel {
    public final GovernmentIdStepStateManager governmentIdStepStateManager;

    public GovernmentIdStepViewModel(SavedStateHandle savedStateHandle, GovernmentIdWorkflow.Input input, GovernmentIdStepStateManager_Factory_Impl governmentIdStepStateManager_Factory_Impl) {
        savedStateHandle.getClass();
        input.getClass();
        governmentIdStepStateManager_Factory_Impl.getClass();
        AnchoredDraggableState anchoredDraggableState = governmentIdStepStateManager_Factory_Impl.delegateFactory;
        this.governmentIdStepStateManager = new GovernmentIdStepStateManager(input, savedStateHandle, (Context) ((Provider) anchoredDraggableState.positionalThreshold).get(), (RealImageLoader) ((Provider) anchoredDraggableState.confirmValueChange).get(), (SubmitVerificationWorker_Factory_Impl) ((Provider) anchoredDraggableState.velocityThreshold).get(), (DocumentSelectWorker) ((Provider) anchoredDraggableState.animationSpec).get(), (GovIdLocalVideoCaptureRenderer) ((Provider) anchoredDraggableState.dragMutex).get(), (GovIdWebRtcRenderer) ((Provider) anchoredDraggableState.draggableState).get(), (GovIdCaptureRenderer) ((GovIdCaptureRenderer_Factory) anchoredDraggableState.currentValue$delegate).get(), (AutoClassifyWorker.Factory) ((SelfieDirectionFeed_Factory) anchoredDraggableState.dragTarget$delegate).get(), (GovIdAutoClassificationRenderer) ((Logger_Factory) anchoredDraggableState.anchors$delegate).get(), (RealCameraStatsManager) ((Provider) anchoredDraggableState.targetValue$delegate).get(), (NavigationStateManager) ((Provider) anchoredDraggableState.closestValue$delegate).get(), (ExternalEventLogger) ((Provider) anchoredDraggableState.offset$delegate).get(), (TrackingEventsLogger) ((Provider) anchoredDraggableState.lastVelocity$delegate).get(), (InquiryThemeManager) ((Provider) anchoredDraggableState.anchoredDragScope).get());
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        GovernmentIdStepStateManager governmentIdStepStateManager = this.governmentIdStepStateManager;
        governmentIdStepStateManager.videoCaptureHelper.getClass();
        RealCameraStatsManager realCameraStatsManager = governmentIdStepStateManager.cameraStatsManager;
        realCameraStatsManager.measurementsTaken = 0L;
        realCameraStatsManager.averageRotationPerMeasurement = 0.0d;
    }
}
