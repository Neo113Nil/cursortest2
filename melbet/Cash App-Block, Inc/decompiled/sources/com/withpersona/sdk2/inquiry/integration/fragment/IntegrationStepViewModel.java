package com.withpersona.sdk2.inquiry.integration.fragment;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes9.dex */
public final class IntegrationStepViewModel extends ViewModel {
    public IntegrationStepStateManager integrationStepStateManager;
    public final IntegrationStepStateManager_Factory_Impl integrationStepStateManagerFactory;
    public final SavedStateHandle savedStateHandle;

    public IntegrationStepViewModel(SavedStateHandle savedStateHandle, IntegrationStepStateManager_Factory_Impl integrationStepStateManager_Factory_Impl) {
        savedStateHandle.getClass();
        integrationStepStateManager_Factory_Impl.getClass();
        this.savedStateHandle = savedStateHandle;
        this.integrationStepStateManagerFactory = integrationStepStateManager_Factory_Impl;
        FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        savedStateHandle.getLiveData("inquiry_id");
        savedStateHandle.getLiveData(TrackingEventsLoggerImpl.KEY_SESSION_TOKEN);
    }
}
