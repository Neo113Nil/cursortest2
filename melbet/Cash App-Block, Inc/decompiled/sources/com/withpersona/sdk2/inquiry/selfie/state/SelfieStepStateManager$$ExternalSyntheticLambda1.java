package com.withpersona.sdk2.inquiry.selfie.state;

import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieStepStateManager$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelfieStepStateManager f$0;

    public /* synthetic */ SelfieStepStateManager$$ExternalSyntheticLambda1(SelfieStepStateManager selfieStepStateManager, int i) {
        this.$r8$classId = i;
        this.f$0 = selfieStepStateManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SelfieStepStateManager selfieStepStateManager = this.f$0;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                selfieStepStateManager.getCameraErrorHandler$selfie_release((SubtreeManager) selfieStepStateManager.lastChild).invoke(th);
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                selfieStepStateManager.setErrorOutput(th2);
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                selfieStepStateManager.setErrorOutput(th3);
                break;
            case 3:
                SubmitVerificationWorker.Response response = (SubmitVerificationWorker.Response) obj;
                response.getClass();
                if (!(response instanceof SubmitVerificationWorker.Response.Success)) {
                    if (!(response instanceof SubmitVerificationWorker.Response.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        selfieStepStateManager.setOutputForWorkflow(new SelfieWorkflow.Output.Error(((SubmitVerificationWorker.Response.Error) response).cause));
                    }
                } else {
                    selfieStepStateManager.setOutputForWorkflow(SelfieWorkflow.Output.Finished.INSTANCE);
                }
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                selfieStepStateManager.setErrorOutput(th4);
                break;
            default:
                SelfieState selfieState = (SelfieState) obj;
                if (selfieState != null) {
                    JobKt.launch$default((ContextScope) selfieStepStateManager.parent, Dispatchers.Unconfined, null, new InquiryViewModel.AnonymousClass1(selfieStepStateManager, selfieState, null, 27), 2);
                    break;
                } else {
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
