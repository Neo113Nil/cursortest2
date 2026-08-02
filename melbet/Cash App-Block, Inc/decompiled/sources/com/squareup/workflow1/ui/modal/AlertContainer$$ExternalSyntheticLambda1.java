package com.squareup.workflow1.ui.modal;

import android.content.DialogInterface;
import com.fillr.e;
import com.google.mlkit.vision.text.zzc;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FailoverFragment;
import com.miteksystems.misnap.workflow.fragment.HelpFragment;
import com.miteksystems.misnap.workflow.fragment.ReviewFragment;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.modal.AlertScreen;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;

/* loaded from: classes8.dex */
public final /* synthetic */ class AlertContainer$$ExternalSyntheticLambda1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AlertContainer$$ExternalSyntheticLambda1(AlertScreen alertScreen, AlertScreen.Button button) {
        this.$r8$classId = 0;
        this.f$0 = alertScreen;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                AlertScreen alertScreen = (AlertScreen) obj;
                UiScreenRunner.Companion companion = AlertContainer.Companion;
                alertScreen.getClass();
                alertScreen.onEvent.f$0.$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(22)));
                break;
            case 1:
                DocumentAnalysisFragment documentAnalysisFragment = (DocumentAnalysisFragment) obj;
                DocumentAnalysisFragment.Companion companion2 = DocumentAnalysisFragment.Companion;
                documentAnalysisFragment.w.setEnabled(false);
                documentAnalysisFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                break;
            case 2:
                FailoverFragment failoverFragment = (FailoverFragment) obj;
                zzc zzcVar = FailoverFragment.Companion;
                failoverFragment.h.setEnabled(false);
                failoverFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                break;
            case 3:
                HelpFragment helpFragment = (HelpFragment) obj;
                HelpFragment.Companion companion3 = HelpFragment.Companion;
                helpFragment.j.setEnabled(false);
                helpFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                break;
            case 4:
                ReviewFragment reviewFragment = (ReviewFragment) obj;
                e eVar = ReviewFragment.Companion;
                reviewFragment.h.setEnabled(false);
                reviewFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                break;
            default:
                ((FinancialConnectionsSheetLiteActivity) obj).finish();
                break;
        }
    }

    public /* synthetic */ AlertContainer$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
