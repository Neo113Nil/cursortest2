package com.withpersona.sdk2.inquiry.governmentid.capture;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public final /* synthetic */ class CaptureRenderer$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$0;
    public final /* synthetic */ POPMatchingFactory f$1;

    public /* synthetic */ CaptureRenderer$$ExternalSyntheticLambda7(StatefulWorkflow.RenderContext renderContext, POPMatchingFactory pOPMatchingFactory, int i) {
        this.$r8$classId = i;
        this.f$0 = renderContext;
        this.f$1 = pOPMatchingFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        final POPMatchingFactory pOPMatchingFactory = this.f$1;
        StatefulWorkflow.RenderContext renderContext = this.f$0;
        switch (i) {
            case 0:
                final int i2 = 0;
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        POPMatchingFactory pOPMatchingFactory2 = pOPMatchingFactory;
                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                        switch (i3) {
                            case 0:
                                updater.getClass();
                                Object obj2 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture = obj2 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj2 : null;
                                if (waitForAutocapture != null) {
                                    pOPMatchingFactory2.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                            case 1:
                                updater.getClass();
                                Object obj3 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = obj3 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj3 : null;
                                if (waitForAutocapture2 != null) {
                                    pOPMatchingFactory2.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture2, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                            default:
                                updater.getClass();
                                Object obj4 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture3 = obj4 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj4 : null;
                                if (waitForAutocapture3 != null) {
                                    pOPMatchingFactory2.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture3, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                break;
            case 1:
                final int i3 = 1;
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i32 = i3;
                        POPMatchingFactory pOPMatchingFactory2 = pOPMatchingFactory;
                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                        switch (i32) {
                            case 0:
                                updater.getClass();
                                Object obj2 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture = obj2 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj2 : null;
                                if (waitForAutocapture != null) {
                                    pOPMatchingFactory2.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                            case 1:
                                updater.getClass();
                                Object obj3 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = obj3 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj3 : null;
                                if (waitForAutocapture2 != null) {
                                    pOPMatchingFactory2.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture2, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                            default:
                                updater.getClass();
                                Object obj4 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture3 = obj4 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj4 : null;
                                if (waitForAutocapture3 != null) {
                                    pOPMatchingFactory2.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture3, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                break;
            case 2:
                GovernmentIdWorkflowUtilsKt.goBack(renderContext, pOPMatchingFactory);
                break;
            case 3:
                GovernmentIdWorkflowUtilsKt.goBack(renderContext, pOPMatchingFactory);
                break;
            case 4:
                final int i4 = 2;
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i32 = i4;
                        POPMatchingFactory pOPMatchingFactory2 = pOPMatchingFactory;
                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                        switch (i32) {
                            case 0:
                                updater.getClass();
                                Object obj2 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture = obj2 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj2 : null;
                                if (waitForAutocapture != null) {
                                    pOPMatchingFactory2.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                            case 1:
                                updater.getClass();
                                Object obj3 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = obj3 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj3 : null;
                                if (waitForAutocapture2 != null) {
                                    pOPMatchingFactory2.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture2, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                            default:
                                updater.getClass();
                                Object obj4 = updater.state;
                                GovernmentIdState.WaitForAutocapture waitForAutocapture3 = obj4 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj4 : null;
                                if (waitForAutocapture3 != null) {
                                    pOPMatchingFactory2.getClass();
                                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture3, null, WebRtcState.Disconnected, null, false, false, null, 32639);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                break;
            case 5:
                GovernmentIdWorkflowUtilsKt.goBack(renderContext, pOPMatchingFactory);
                break;
            case 6:
                GovernmentIdWorkflowUtilsKt.goBack(renderContext, pOPMatchingFactory);
                break;
            case 7:
                GovernmentIdWorkflowUtilsKt.goBack(renderContext, pOPMatchingFactory);
                break;
            default:
                GovernmentIdWorkflowUtilsKt.goBack(renderContext, pOPMatchingFactory);
                break;
        }
        return Unit.INSTANCE;
    }
}
