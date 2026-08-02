package com.withpersona.sdk2.inquiry.internal.workflows;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

/* loaded from: classes9.dex */
public final class WorkflowStateViewModel extends ViewModel {
    public final SavedStateHandle.SavingStateLiveData renderingName;
    public final SavedStateHandle savedStateHandle;

    public WorkflowStateViewModel(SavedStateHandle savedStateHandle) {
        savedStateHandle.getClass();
        this.savedStateHandle = savedStateHandle;
        this.renderingName = savedStateHandle.getLiveData("renderingName");
    }
}
