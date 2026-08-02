package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import com.squareup.cash.R;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda38;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdWorkflow$$ExternalSyntheticLambda15 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GovernmentIdWorkflow f$0;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$1;

    public /* synthetic */ GovernmentIdWorkflow$$ExternalSyntheticLambda15(GovernmentIdWorkflow governmentIdWorkflow, StatefulWorkflow.RenderContext renderContext, int i) {
        this.$r8$classId = i;
        this.f$0 = governmentIdWorkflow;
        this.f$1 = renderContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string2;
        int i = this.$r8$classId;
        StatefulWorkflow.RenderContext renderContext = this.f$1;
        GovernmentIdWorkflow governmentIdWorkflow = this.f$0;
        switch (i) {
            case 0:
                SubmitVerificationWorker.Response response = (SubmitVerificationWorker.Response) obj;
                response.getClass();
                if (response instanceof SubmitVerificationWorker.Response.Success) {
                    return Workflows.action$default(governmentIdWorkflow, new GovernmentIdWorkflow$$ExternalSyntheticLambda15(governmentIdWorkflow, renderContext, 1));
                }
                if (!(response instanceof SubmitVerificationWorker.Response.FileUploadError)) {
                    if (response instanceof SubmitVerificationWorker.Response.Error) {
                        return Workflows.action$default(governmentIdWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda38(10, response, governmentIdWorkflow, renderContext));
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse = ((SubmitVerificationWorker.Response.FileUploadError) response).cause;
                boolean z = documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError;
                Context context = governmentIdWorkflow.applicationContext;
                if (z) {
                    string2 = context.getString(R.string.pi2_governmentid_error_min_dimension_size, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) documentErrorResponse).getDetails().getMinDimensionSize()));
                    string2.getClass();
                } else {
                    string2 = context.getString(R.string.pi2_governmentid_error_unable_to_upload_file);
                    string2.getClass();
                }
                return Workflows.action$default(governmentIdWorkflow, new StateBindingsKt$$ExternalSyntheticLambda0(string2, 16));
            default:
                ((WorkflowAction.Updater) obj).getClass();
                GovernmentIdWorkflowUtilsKt.setOutputForWorkflow(renderContext, GovernmentIdWorkflow.Output.Finished.INSTANCE, governmentIdWorkflow.videoCaptureHelper);
                return Unit.INSTANCE;
        }
    }
}
