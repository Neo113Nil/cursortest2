package com.squareup.workflow1.ui.modal;

import android.content.DialogInterface;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;

/* loaded from: classes8.dex */
public final /* synthetic */ class AlertContainer$$ExternalSyntheticLambda0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AlertContainer$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                AlertScreen alertScreen = (AlertScreen) obj;
                UiScreenRunner.Companion companion = AlertContainer.Companion;
                alertScreen.getClass();
                alertScreen.onEvent.f$0.$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(22)));
                break;
            default:
                DocumentAnalysisFragment documentAnalysisFragment = (DocumentAnalysisFragment) obj;
                DocumentAnalysisFragment.Companion companion2 = DocumentAnalysisFragment.Companion;
                documentAnalysisFragment.d.resume(documentAnalysisFragment.n);
                MiSnapView miSnapView = documentAnalysisFragment.getBinding$workflow_release().l;
                miSnapView.l.addUxpEvent("MVRFA", new String[0]);
                miSnapView.g = true;
                Frame frame = miSnapView.e;
                if (frame != null) {
                    frame.close();
                }
                miSnapView.e = null;
                break;
        }
    }
}
