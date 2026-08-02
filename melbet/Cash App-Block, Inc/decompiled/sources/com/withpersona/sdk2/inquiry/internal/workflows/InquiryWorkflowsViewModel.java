package com.withpersona.sdk2.inquiry.internal.workflows;

import android.os.Looper;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes9.dex */
public final class InquiryWorkflowsViewModel extends ViewModel {
    public InquiryStateManager inquiryStateManager;
    public final InquiryStateManager_Factory_Impl inquiryStateManagerFactory;
    public final SavedStateHandle savedStateHandle;

    public InquiryWorkflowsViewModel(SavedStateHandle savedStateHandle, InquiryStateManager_Factory_Impl inquiryStateManager_Factory_Impl) {
        savedStateHandle.getClass();
        inquiryStateManager_Factory_Impl.getClass();
        this.savedStateHandle = savedStateHandle;
        this.inquiryStateManagerFactory = inquiryStateManager_Factory_Impl;
        FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        savedStateHandle.getLiveData("inquiry_id");
        savedStateHandle.getLiveData(TrackingEventsLoggerImpl.KEY_SESSION_TOKEN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7 != null ? r7.stepName : null, r6) != false) goto L35;
     */
    @Override // androidx.lifecycle.ViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCleared() {
        InquiryStateManager inquiryStateManager = this.inquiryStateManager;
        if (inquiryStateManager != null) {
            InquiryState inquiryState = (InquiryState) ((SubtreeManager) inquiryStateManager.lastChild).getState();
            if (inquiryState != null && (inquiryState instanceof InquiryState.UiStepRunning)) {
                UiStepSavedStateHelper uiStepSavedStateHelper = inquiryStateManager.uiStepSavedStateHelper;
                InquiryState.UiStepRunning uiStepRunning = (InquiryState.UiStepRunning) inquiryState;
                String str = uiStepRunning.sessionToken;
                String str2 = uiStepRunning.inquiryId;
                String str3 = uiStepRunning.stepName;
                List list = uiStepRunning.components;
                uiStepSavedStateHelper.getClass();
                str.getClass();
                str2.getClass();
                str3.getClass();
                if (!Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                    a$$ExternalSyntheticBUOutline0.m$3("saveComponentConfigs must be called on the main thread.");
                    return;
                }
                if (list != null) {
                    UiStepSavedStateHelper.UiStepUiComponentConfig uiStepUiComponentConfig = uiStepSavedStateHelper.savedData;
                    if (Intrinsics.areEqual(uiStepUiComponentConfig != null ? uiStepUiComponentConfig.sessionToken : null, str)) {
                        UiStepSavedStateHelper.UiStepUiComponentConfig uiStepUiComponentConfig2 = uiStepSavedStateHelper.savedData;
                        if (Intrinsics.areEqual(uiStepUiComponentConfig2 != null ? uiStepUiComponentConfig2.inquiryId : null, str2)) {
                            UiStepSavedStateHelper.UiStepUiComponentConfig uiStepUiComponentConfig3 = uiStepSavedStateHelper.savedData;
                        }
                    }
                    UiStepSavedStateHelper.UiStepUiComponentConfig uiStepUiComponentConfig4 = new UiStepSavedStateHelper.UiStepUiComponentConfig(str, str2, str3, list);
                    uiStepSavedStateHelper.savedData = uiStepUiComponentConfig4;
                    JobKt.launch$default(uiStepSavedStateHelper.coroutineScope, null, null, new TransitionWorker$run$1(uiStepSavedStateHelper, uiStepUiComponentConfig4, null, 15), 3);
                }
            }
            JobKt.cancel(inquiryStateManager.silentNetworkAuthenticationManager.scope, (CancellationException) null);
        }
        super.onCleared();
    }
}
