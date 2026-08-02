package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class InquiryStateManager$$ExternalSyntheticLambda17 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InquiryStateManager f$0;
    public final /* synthetic */ InquiryState.SelfieStepRunning f$1;

    public /* synthetic */ InquiryStateManager$$ExternalSyntheticLambda17(InquiryStateManager inquiryStateManager, InquiryState.SelfieStepRunning selfieStepRunning, int i) {
        this.$r8$classId = i;
        this.f$0 = inquiryStateManager;
        this.f$1 = selfieStepRunning;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        TransitionStatus.TransitioningBack transitioningBack = TransitionStatus.TransitioningBack.INSTANCE;
        SelfieWorkflow.Output.Back back = SelfieWorkflow.Output.Back.INSTANCE;
        SelfieWorkflow.Output.Finished finished = SelfieWorkflow.Output.Finished.INSTANCE;
        SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
        InquiryState.SelfieStepRunning selfieStepRunning = this.f$1;
        InquiryStateManager inquiryStateManager = this.f$0;
        switch (i) {
            case 0:
                SelfieWorkflow.Output output = (SelfieWorkflow.Output) obj;
                output.getClass();
                if (!output.equals(canceled)) {
                    if (!output.equals(finished)) {
                        if (!output.equals(back)) {
                            if (!(output instanceof SelfieWorkflow.Output.Error)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                InternalErrorInfo internalErrorInfo = ((SelfieWorkflow.Output.Error) output).cause;
                                if (InquiryStateManager.isInconsistentStateError(internalErrorInfo)) {
                                    inquiryStateManager.updateState(InquiryStateManager.resyncState(selfieStepRunning));
                                } else {
                                    inquiryStateManager.setErrorOutput(selfieStepRunning.sessionToken, internalErrorInfo, null);
                                }
                            }
                        } else {
                            inquiryStateManager.updateState(InquiryState.SelfieStepRunning.copy$default(selfieStepRunning, transitioningBack));
                        }
                    } else {
                        inquiryStateManager.updateState(InquiryState.SelfieStepRunning.copy$default(selfieStepRunning, new TransitionStatus.UpdateInquirySession(null, false)));
                    }
                } else {
                    String str = selfieStepRunning.inquiryId;
                    NextStep.CancelDialog cancelDialog = selfieStepRunning.cancelDialog;
                    inquiryStateManager.setOutput(new InquiryWorkflow$Output.Cancel(str, selfieStepRunning.sessionToken, selfieStepRunning.styles, cancelDialog != null ? cancelDialog.getTitle() : null, cancelDialog != null ? cancelDialog.getPrompt() : null, cancelDialog != null ? cancelDialog.getBtnResume() : null, cancelDialog != null ? cancelDialog.getBtnSubmit() : null));
                }
                break;
            default:
                SelfieWorkflow.Output output2 = (SelfieWorkflow.Output) obj;
                output2.getClass();
                if (!output2.equals(canceled)) {
                    if (!output2.equals(finished)) {
                        if (!output2.equals(back)) {
                            if (!(output2 instanceof SelfieWorkflow.Output.Error)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                InternalErrorInfo internalErrorInfo2 = ((SelfieWorkflow.Output.Error) output2).cause;
                                if (InquiryStateManager.isInconsistentStateError(internalErrorInfo2)) {
                                    inquiryStateManager.updateState(InquiryStateManager.resyncState(selfieStepRunning));
                                } else {
                                    inquiryStateManager.setErrorOutput(selfieStepRunning.sessionToken, internalErrorInfo2, null);
                                }
                            }
                        } else {
                            inquiryStateManager.updateState(InquiryState.SelfieStepRunning.copy$default(selfieStepRunning, transitioningBack));
                        }
                    } else {
                        inquiryStateManager.updateState(InquiryState.SelfieStepRunning.copy$default(selfieStepRunning, new TransitionStatus.UpdateInquirySession(null, false)));
                    }
                } else {
                    String str2 = selfieStepRunning.inquiryId;
                    NextStep.CancelDialog cancelDialog2 = selfieStepRunning.cancelDialog;
                    inquiryStateManager.setOutput(new InquiryWorkflow$Output.Cancel(str2, selfieStepRunning.sessionToken, selfieStepRunning.styles, cancelDialog2 != null ? cancelDialog2.getTitle() : null, cancelDialog2 != null ? cancelDialog2.getPrompt() : null, cancelDialog2 != null ? cancelDialog2.getBtnResume() : null, cancelDialog2 != null ? cancelDialog2.getBtnSubmit() : null));
                }
                break;
        }
        return null;
    }
}
