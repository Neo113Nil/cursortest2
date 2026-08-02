package com.withpersona.sdk2.inquiry.internal.state;

import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$TransitionData;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class InquiryStateManager$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InquiryStateManager f$0;
    public final /* synthetic */ InquiryState.UiStepRunning f$1;

    public /* synthetic */ InquiryStateManager$$ExternalSyntheticLambda9(InquiryStateManager inquiryStateManager, InquiryState.UiStepRunning uiStepRunning, int i) {
        this.$r8$classId = i;
        this.f$0 = inquiryStateManager;
        this.f$1 = uiStepRunning;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        UiWorkflow.Output.Canceled canceled = UiWorkflow.Output.Canceled.INSTANCE;
        InquiryStateManager inquiryStateManager = this.f$0;
        switch (i) {
            case 0:
                UiWorkflow.Output output = (UiWorkflow.Output) obj;
                output.getClass();
                boolean equals = output.equals(canceled);
                InquiryState.UiStepRunning uiStepRunning = this.f$1;
                if (!equals) {
                    if (!(output instanceof UiWorkflow.Output.Error)) {
                        if (!(output instanceof UiWorkflow.Output.FinishedWithoutTransition)) {
                            if (!(output instanceof UiWorkflow.Output.FinishedWithTransition)) {
                                if (!(output instanceof UiWorkflow.Output.Back)) {
                                    if (!(output instanceof UiWorkflow.Output.Completed)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        inquiryStateManager.setOutput(new InquiryWorkflow$Output.Complete(uiStepRunning.inquiryId, uiStepRunning.inquiryStatus, uiStepRunning.sessionToken, uiStepRunning.redirectUri, uiStepRunning.fields));
                                    }
                                } else {
                                    inquiryStateManager.updateState(InquiryState.UiStepRunning.copy$default(uiStepRunning, TransitionStatus.TransitioningBack.INSTANCE, null, null, null, null, false, 1048571));
                                }
                            } else {
                                inquiryStateManager.updateState(InquiryState.UiStepRunning.copy$default(uiStepRunning, new TransitionStatus.UpdateInquirySession(null, true), null, null, null, null, false, 1048571));
                            }
                        } else {
                            UiWorkflow.Output.FinishedWithoutTransition finishedWithoutTransition = (UiWorkflow.Output.FinishedWithoutTransition) output;
                            inquiryStateManager.updateState(InquiryState.UiStepRunning.copy$default(uiStepRunning, new TransitionStatus.Transitioning(new TransitionWorker$TransitionData(finishedWithoutTransition.fromComponent, finishedWithoutTransition.componentParams, finishedWithoutTransition.fromStep)), null, null, null, null, false, 1048571));
                        }
                    } else {
                        InternalErrorInfo internalErrorInfo = ((UiWorkflow.Output.Error) output).cause;
                        if (InquiryStateManager.isInconsistentStateError(internalErrorInfo)) {
                            inquiryStateManager.updateState(InquiryStateManager.resyncState(uiStepRunning));
                        } else {
                            inquiryStateManager.setErrorOutput(uiStepRunning.sessionToken, internalErrorInfo, "Couldn't load address.");
                        }
                    }
                } else {
                    String str = uiStepRunning.inquiryId;
                    NextStep.CancelDialog cancelDialog = uiStepRunning.cancelDialog;
                    inquiryStateManager.setOutput(new InquiryWorkflow$Output.Cancel(str, uiStepRunning.sessionToken, uiStepRunning.styles, cancelDialog != null ? cancelDialog.getTitle() : null, cancelDialog != null ? cancelDialog.getPrompt() : null, cancelDialog != null ? cancelDialog.getBtnResume() : null, cancelDialog != null ? cancelDialog.getBtnSubmit() : null));
                }
                break;
            case 1:
                UiWorkflow.Output output2 = (UiWorkflow.Output) obj;
                output2.getClass();
                boolean equals2 = output2.equals(canceled);
                InquiryState.UiStepRunning uiStepRunning2 = this.f$1;
                if (!equals2) {
                    if (!(output2 instanceof UiWorkflow.Output.Error)) {
                        if (!(output2 instanceof UiWorkflow.Output.FinishedWithoutTransition)) {
                            if (!(output2 instanceof UiWorkflow.Output.FinishedWithTransition)) {
                                if (!(output2 instanceof UiWorkflow.Output.Back)) {
                                    if (!(output2 instanceof UiWorkflow.Output.Completed)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        inquiryStateManager.setOutput(new InquiryWorkflow$Output.Complete(uiStepRunning2.inquiryId, uiStepRunning2.inquiryStatus, uiStepRunning2.sessionToken, uiStepRunning2.redirectUri, uiStepRunning2.fields));
                                    }
                                } else {
                                    inquiryStateManager.updateState(InquiryState.UiStepRunning.copy$default(uiStepRunning2, TransitionStatus.TransitioningBack.INSTANCE, null, null, null, null, false, 1048571));
                                }
                            } else {
                                inquiryStateManager.updateState(InquiryState.UiStepRunning.copy$default(uiStepRunning2, new TransitionStatus.UpdateInquirySession(null, true), null, null, null, null, false, 1048571));
                            }
                        } else {
                            UiWorkflow.Output.FinishedWithoutTransition finishedWithoutTransition2 = (UiWorkflow.Output.FinishedWithoutTransition) output2;
                            inquiryStateManager.updateState(InquiryState.UiStepRunning.copy$default(uiStepRunning2, new TransitionStatus.Transitioning(new TransitionWorker$TransitionData(finishedWithoutTransition2.fromComponent, finishedWithoutTransition2.componentParams, finishedWithoutTransition2.fromStep)), null, null, null, null, false, 1048571));
                        }
                    } else {
                        InternalErrorInfo internalErrorInfo2 = ((UiWorkflow.Output.Error) output2).cause;
                        if (InquiryStateManager.isInconsistentStateError(internalErrorInfo2)) {
                            inquiryStateManager.updateState(InquiryStateManager.resyncState(uiStepRunning2));
                        } else {
                            inquiryStateManager.setErrorOutput(uiStepRunning2.sessionToken, internalErrorInfo2, "Couldn't load address.");
                        }
                    }
                } else {
                    String str2 = uiStepRunning2.inquiryId;
                    NextStep.CancelDialog cancelDialog2 = uiStepRunning2.cancelDialog;
                    inquiryStateManager.setOutput(new InquiryWorkflow$Output.Cancel(str2, uiStepRunning2.sessionToken, uiStepRunning2.styles, cancelDialog2 != null ? cancelDialog2.getTitle() : null, cancelDialog2 != null ? cancelDialog2.getPrompt() : null, cancelDialog2 != null ? cancelDialog2.getBtnResume() : null, cancelDialog2 != null ? cancelDialog2.getBtnSubmit() : null));
                }
                break;
            default:
                SubtreeManager subtreeManager = (SubtreeManager) inquiryStateManager.lastChild;
                RestoreUiStepStateWorker.Output output3 = (RestoreUiStepStateWorker.Output) obj;
                output3.getClass();
                if (!output3.equals(RestoreUiStepStateWorker.Output.Failure.INSTANCE)) {
                    if (!(output3 instanceof RestoreUiStepStateWorker.Output.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        WorkflowState state = subtreeManager.getState();
                        InquiryState.UiStepRunning uiStepRunning3 = state instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) state : null;
                        if (uiStepRunning3 == null) {
                            break;
                        } else {
                            inquiryStateManager.updateState(InquiryState.UiStepRunning.copy$default(uiStepRunning3, null, ((RestoreUiStepStateWorker.Output.Success) output3).components, null, null, null, false, 786175));
                        }
                    }
                } else if (!(subtreeManager.getState() instanceof InquiryState.UiStepRunning)) {
                    break;
                } else {
                    inquiryStateManager.updateState(InquiryStateManager.resyncState(this.f$1));
                }
                break;
        }
        return null;
    }
}
