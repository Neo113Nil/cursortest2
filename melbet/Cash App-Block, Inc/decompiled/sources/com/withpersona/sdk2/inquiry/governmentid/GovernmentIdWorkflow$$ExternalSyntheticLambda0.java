package com.withpersona.sdk2.inquiry.governmentid;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdWorkflow$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$0;
    public final /* synthetic */ GovernmentIdWorkflow f$1;

    public /* synthetic */ GovernmentIdWorkflow$$ExternalSyntheticLambda0(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow, int i) {
        this.$r8$classId = i;
        this.f$0 = renderContext;
        this.f$1 = governmentIdWorkflow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        GovernmentIdWorkflow.Output.Canceled canceled = GovernmentIdWorkflow.Output.Canceled.INSTANCE;
        final GovernmentIdWorkflow governmentIdWorkflow = this.f$1;
        StatefulWorkflow.RenderContext renderContext = this.f$0;
        switch (i) {
            case 0:
                final int i2 = 1;
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(governmentIdWorkflow, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        GovernmentIdWorkflow governmentIdWorkflow2 = governmentIdWorkflow;
                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                        switch (i3) {
                            case 0:
                                updater.getClass();
                                Object obj2 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture = obj2 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj2 : null;
                                if (waitForAutocapture != null) {
                                    governmentIdWorkflow2.videoCaptureHelper.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                            default:
                                updater.getClass();
                                Object obj3 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = obj3 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj3 : null;
                                if (waitForAutocapture2 != null) {
                                    governmentIdWorkflow2.videoCaptureHelper.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture2, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                break;
            case 1:
                GovernmentIdWorkflowUtilsKt.goBack(renderContext, governmentIdWorkflow.videoCaptureHelper);
                break;
            case 2:
                GovernmentIdWorkflowUtilsKt.goBack(renderContext, governmentIdWorkflow.videoCaptureHelper);
                break;
            case 3:
                GovernmentIdWorkflowUtilsKt.goBack(renderContext, governmentIdWorkflow.videoCaptureHelper);
                break;
            case 4:
                GovernmentIdWorkflowUtilsKt.setOutputForWorkflow(renderContext, canceled, governmentIdWorkflow.videoCaptureHelper);
                break;
            case 5:
                GovernmentIdWorkflowUtilsKt.setOutputForWorkflow(renderContext, canceled, governmentIdWorkflow.videoCaptureHelper);
                break;
            case 6:
                GovernmentIdWorkflowUtilsKt.goBack(renderContext, governmentIdWorkflow.videoCaptureHelper);
                break;
            default:
                final int i3 = 0;
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(governmentIdWorkflow, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i32 = i3;
                        GovernmentIdWorkflow governmentIdWorkflow2 = governmentIdWorkflow;
                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                        switch (i32) {
                            case 0:
                                updater.getClass();
                                Object obj2 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture = obj2 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj2 : null;
                                if (waitForAutocapture != null) {
                                    governmentIdWorkflow2.videoCaptureHelper.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                            default:
                                updater.getClass();
                                Object obj3 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = obj3 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj3 : null;
                                if (waitForAutocapture2 != null) {
                                    governmentIdWorkflow2.videoCaptureHelper.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture2, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GovernmentIdWorkflow$$ExternalSyntheticLambda0(GovernmentIdWorkflow governmentIdWorkflow, StatefulWorkflow.RenderContext renderContext, int i) {
        this.$r8$classId = i;
        this.f$1 = governmentIdWorkflow;
        this.f$0 = renderContext;
    }
}
