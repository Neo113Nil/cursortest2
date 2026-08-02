package com.withpersona.sdk2.inquiry.ui.uiStep;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.media3.common.util.StuckPlayerDetector;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager_Factory_Impl;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes9.dex */
public final class UiStepViewModel extends ViewModel {
    public final UiStepStateManager uiStepStateManager;

    public UiStepViewModel(SavedStateHandle savedStateHandle, UiWorkflow.Input input, UiStepStateManager_Factory_Impl uiStepStateManager_Factory_Impl) {
        savedStateHandle.getClass();
        input.getClass();
        uiStepStateManager_Factory_Impl.getClass();
        FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        savedStateHandle.getLiveData("inquiry_id");
        savedStateHandle.getLiveData(TrackingEventsLoggerImpl.KEY_SESSION_TOKEN);
        StuckPlayerDetector stuckPlayerDetector = uiStepStateManager_Factory_Impl.delegateFactory;
        this.uiStepStateManager = new UiStepStateManager(input, savedStateHandle, (Context) ((Provider) stuckPlayerDetector.player).get(), (ScanNfcWorker.Factory) ((Provider) stuckPlayerDetector.playerListener).get(), (CreateReusablePersonaWorker_Factory_Impl) ((Provider) stuckPlayerDetector.callback).get(), (VerifyReusablePersonaWorker_Factory_Impl) ((Provider) stuckPlayerDetector.clock).get(), (NavigationStateManager) ((Provider) stuckPlayerDetector.period).get(), (UiStepComponentWorkHelper) ((Provider) stuckPlayerDetector.handler).get(), (ExternalEventLogger) ((Provider) stuckPlayerDetector.stuckBufferingDetector).get(), (FeatureFlagManager) ((Provider) stuckPlayerDetector.stuckPlayingDetector).get(), (TrackingEventsLogger) ((Provider) stuckPlayerDetector.stuckPlayingNotEndingDetector).get(), (PermissionRequestWorker_Factory_Impl) ((InstanceFactory) stuckPlayerDetector.stuckSuppressedDetector).instance);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.uiStepStateManager.getClass();
        super.onCleared();
    }
}
