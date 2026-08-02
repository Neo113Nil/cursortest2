package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class InquiryStateManager$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InquiryStateManager f$0;
    public final /* synthetic */ InquiryState.IntegrationStepRunning f$1;

    public /* synthetic */ InquiryStateManager$$ExternalSyntheticLambda7(InquiryStateManager inquiryStateManager, InquiryState.IntegrationStepRunning integrationStepRunning, int i) {
        this.$r8$classId = i;
        this.f$0 = inquiryStateManager;
        this.f$1 = integrationStepRunning;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        IntegrationWorkflow.Output.Cancel cancel = IntegrationWorkflow.Output.Cancel.INSTANCE;
        TransitionStatus.TransitioningBack transitioningBack = TransitionStatus.TransitioningBack.INSTANCE;
        IntegrationWorkflow.Output.Back back = IntegrationWorkflow.Output.Back.INSTANCE;
        IntegrationWorkflow.Output.Finished finished = IntegrationWorkflow.Output.Finished.INSTANCE;
        IntegrationWorkflow.Output.Error error = IntegrationWorkflow.Output.Error.INSTANCE;
        InquiryState.IntegrationStepRunning integrationStepRunning = this.f$1;
        InquiryStateManager inquiryStateManager = this.f$0;
        switch (i) {
            case 0:
                IntegrationWorkflow.Output output = (IntegrationWorkflow.Output) obj;
                output.getClass();
                if (!output.equals(error)) {
                    if (!output.equals(finished)) {
                        if (!output.equals(back)) {
                            if (!output.equals(cancel)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                String str = integrationStepRunning.inquiryId;
                                NextStep.CancelDialog cancelDialog = integrationStepRunning.cancelDialog;
                                inquiryStateManager.setOutput(new InquiryWorkflow$Output.Cancel(str, integrationStepRunning.sessionToken, integrationStepRunning.styles, cancelDialog != null ? cancelDialog.getTitle() : null, cancelDialog != null ? cancelDialog.getPrompt() : null, cancelDialog != null ? cancelDialog.getBtnResume() : null, cancelDialog != null ? cancelDialog.getBtnSubmit() : null));
                            }
                        } else {
                            inquiryStateManager.updateState(InquiryState.IntegrationStepRunning.copy$default(integrationStepRunning, transitioningBack));
                        }
                    } else {
                        inquiryStateManager.updateState(InquiryState.IntegrationStepRunning.copy$default(integrationStepRunning, new TransitionStatus.UpdateInquirySession(null, false)));
                    }
                }
                break;
            default:
                IntegrationWorkflow.Output output2 = (IntegrationWorkflow.Output) obj;
                output2.getClass();
                if (!output2.equals(error)) {
                    if (!output2.equals(finished)) {
                        if (!output2.equals(back)) {
                            if (!output2.equals(cancel)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                String str2 = integrationStepRunning.inquiryId;
                                NextStep.CancelDialog cancelDialog2 = integrationStepRunning.cancelDialog;
                                inquiryStateManager.setOutput(new InquiryWorkflow$Output.Cancel(str2, integrationStepRunning.sessionToken, integrationStepRunning.styles, cancelDialog2 != null ? cancelDialog2.getTitle() : null, cancelDialog2 != null ? cancelDialog2.getPrompt() : null, cancelDialog2 != null ? cancelDialog2.getBtnResume() : null, cancelDialog2 != null ? cancelDialog2.getBtnSubmit() : null));
                            }
                        } else {
                            inquiryStateManager.updateState(InquiryState.IntegrationStepRunning.copy$default(integrationStepRunning, transitioningBack));
                        }
                    } else {
                        inquiryStateManager.updateState(InquiryState.IntegrationStepRunning.copy$default(integrationStepRunning, new TransitionStatus.UpdateInquirySession(null, false)));
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
