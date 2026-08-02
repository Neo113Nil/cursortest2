package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class InquiryStateManager$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InquiryStateManager f$0;
    public final /* synthetic */ InquiryState.GovernmentIdStepRunning f$1;

    public /* synthetic */ InquiryStateManager$$ExternalSyntheticLambda3(InquiryStateManager inquiryStateManager, InquiryState.GovernmentIdStepRunning governmentIdStepRunning, int i) {
        this.$r8$classId = i;
        this.f$0 = inquiryStateManager;
        this.f$1 = governmentIdStepRunning;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        TransitionStatus.TransitioningBack transitioningBack = TransitionStatus.TransitioningBack.INSTANCE;
        GovernmentIdWorkflow.Output.Back back = GovernmentIdWorkflow.Output.Back.INSTANCE;
        GovernmentIdWorkflow.Output.Finished finished = GovernmentIdWorkflow.Output.Finished.INSTANCE;
        GovernmentIdWorkflow.Output.Canceled canceled = GovernmentIdWorkflow.Output.Canceled.INSTANCE;
        InquiryState.GovernmentIdStepRunning governmentIdStepRunning = this.f$1;
        InquiryStateManager inquiryStateManager = this.f$0;
        switch (i) {
            case 0:
                GovernmentIdWorkflow.Output output = (GovernmentIdWorkflow.Output) obj;
                output.getClass();
                if (!output.equals(canceled)) {
                    if (!(output instanceof GovernmentIdWorkflow.Output.Error)) {
                        if (!output.equals(finished)) {
                            if (!output.equals(back)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                inquiryStateManager.updateState(InquiryState.GovernmentIdStepRunning.copy$default(governmentIdStepRunning, transitioningBack));
                            }
                        } else {
                            inquiryStateManager.updateState(InquiryState.GovernmentIdStepRunning.copy$default(governmentIdStepRunning, new TransitionStatus.UpdateInquirySession(null, false)));
                        }
                    } else {
                        InternalErrorInfo internalErrorInfo = ((GovernmentIdWorkflow.Output.Error) output).cause;
                        if (InquiryStateManager.isInconsistentStateError(internalErrorInfo)) {
                            inquiryStateManager.updateState(InquiryStateManager.resyncState(governmentIdStepRunning));
                        } else {
                            inquiryStateManager.setErrorOutput(governmentIdStepRunning.sessionToken, internalErrorInfo, null);
                        }
                    }
                } else {
                    String str = governmentIdStepRunning.inquiryId;
                    NextStep.CancelDialog cancelDialog = governmentIdStepRunning.cancelDialog;
                    inquiryStateManager.setOutput(new InquiryWorkflow$Output.Cancel(str, governmentIdStepRunning.sessionToken, governmentIdStepRunning.styles, cancelDialog != null ? cancelDialog.getTitle() : null, cancelDialog != null ? cancelDialog.getPrompt() : null, cancelDialog != null ? cancelDialog.getBtnResume() : null, cancelDialog != null ? cancelDialog.getBtnSubmit() : null));
                }
                break;
            default:
                GovernmentIdWorkflow.Output output2 = (GovernmentIdWorkflow.Output) obj;
                output2.getClass();
                if (!output2.equals(canceled)) {
                    if (!(output2 instanceof GovernmentIdWorkflow.Output.Error)) {
                        if (!output2.equals(finished)) {
                            if (!output2.equals(back)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                inquiryStateManager.updateState(InquiryState.GovernmentIdStepRunning.copy$default(governmentIdStepRunning, transitioningBack));
                            }
                        } else {
                            inquiryStateManager.updateState(InquiryState.GovernmentIdStepRunning.copy$default(governmentIdStepRunning, new TransitionStatus.UpdateInquirySession(null, false)));
                        }
                    } else {
                        InternalErrorInfo internalErrorInfo2 = ((GovernmentIdWorkflow.Output.Error) output2).cause;
                        if (InquiryStateManager.isInconsistentStateError(internalErrorInfo2)) {
                            inquiryStateManager.updateState(InquiryStateManager.resyncState(governmentIdStepRunning));
                        } else {
                            inquiryStateManager.setErrorOutput(governmentIdStepRunning.sessionToken, internalErrorInfo2, null);
                        }
                    }
                } else {
                    String str2 = governmentIdStepRunning.inquiryId;
                    NextStep.CancelDialog cancelDialog2 = governmentIdStepRunning.cancelDialog;
                    inquiryStateManager.setOutput(new InquiryWorkflow$Output.Cancel(str2, governmentIdStepRunning.sessionToken, governmentIdStepRunning.styles, cancelDialog2 != null ? cancelDialog2.getTitle() : null, cancelDialog2 != null ? cancelDialog2.getPrompt() : null, cancelDialog2 != null ? cancelDialog2.getBtnResume() : null, cancelDialog2 != null ? cancelDialog2.getBtnSubmit() : null));
                }
                break;
        }
        return null;
    }
}
