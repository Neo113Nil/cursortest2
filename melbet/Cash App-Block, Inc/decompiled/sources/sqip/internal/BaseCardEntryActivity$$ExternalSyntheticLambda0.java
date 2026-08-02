package sqip.internal;

import android.content.DialogInterface;
import com.fillr.e;
import com.google.mlkit.vision.text.zzc;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FailoverFragment;
import com.miteksystems.misnap.workflow.fragment.HelpFragment;
import com.miteksystems.misnap.workflow.fragment.ReviewFragment;

/* loaded from: classes4.dex */
public final /* synthetic */ class BaseCardEntryActivity$$ExternalSyntheticLambda0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BaseCardEntryActivity$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                dialogInterface.dismiss();
                break;
            case 1:
                DocumentAnalysisFragment.Companion companion = DocumentAnalysisFragment.Companion;
                dialogInterface.cancel();
                break;
            case 2:
                zzc zzcVar = FailoverFragment.Companion;
                dialogInterface.cancel();
                break;
            case 3:
                HelpFragment.Companion companion2 = HelpFragment.Companion;
                dialogInterface.cancel();
                break;
            case 4:
                e eVar = ReviewFragment.Companion;
                dialogInterface.cancel();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
