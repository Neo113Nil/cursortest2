package com.withpersona.sdk2.inquiry.selfie.selfieStep;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.android.volley.RequestQueue;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class SelfieViewModel extends ViewModel {
    public final SelfieStepStateManager selfieStepStateManager;

    public SelfieViewModel(SavedStateHandle savedStateHandle, SelfieWorkflow.Input input, SelfieStepStateManager_Factory_Impl selfieStepStateManager_Factory_Impl) {
        savedStateHandle.getClass();
        input.getClass();
        selfieStepStateManager_Factory_Impl.getClass();
        RequestQueue requestQueue = selfieStepStateManager_Factory_Impl.delegateFactory;
        this.selfieStepStateManager = new SelfieStepStateManager(input, savedStateHandle, (Context) ((Provider) requestQueue.mSequenceGenerator).get(), (SubmitVerificationWorker_Factory_Impl) ((Provider) requestQueue.mCurrentRequests).get(), (WebRtcWorker.Factory) ((Provider) requestQueue.mCacheQueue).get(), (SelfieAnalyzeWorker_Factory_Impl) ((Provider) requestQueue.mNetworkQueue).get(), (PermissionRequestWorker_Factory_Impl) ((Provider) requestQueue.mCache).get(), (CameraXController_Factory_Impl) ((Provider) requestQueue.mNetwork).get(), (Camera2Controller_Factory_Impl) ((InstanceFactory) requestQueue.mDelivery).instance, (RealCameraStatsManager) ((Provider) requestQueue.mDispatchers).get(), (NavigationStateManager) ((Provider) requestQueue.mCacheDispatcher).get(), (ExternalEventLogger) ((Provider) requestQueue.mFinishedListeners).get(), (TrackingEventsLogger) ((Provider) requestQueue.mEventListeners).get());
    }
}
