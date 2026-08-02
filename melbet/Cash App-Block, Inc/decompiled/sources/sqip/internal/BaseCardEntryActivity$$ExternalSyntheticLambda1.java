package sqip.internal;

import android.view.View;
import com.android.volley.Response;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2NavigationBarBinding;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetController;
import com.withpersona.sdk2.inquiry.ui.SignatureBottomSheetController;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda17;

/* loaded from: classes9.dex */
public final /* synthetic */ class BaseCardEntryActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BaseCardEntryActivity$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                BaseCardEntryActivity.onCreate$lambda$4((BaseCardEntryActivity) obj, view);
                break;
            case 1:
                ((UiScreenRunner$$ExternalSyntheticLambda17) obj).invoke();
                break;
            case 2:
                MaterialRadioButton materialRadioButton = (MaterialRadioButton) ((Pi2NavigationBarBinding) obj).navBarBackButton;
                if (!materialRadioButton.isChecked()) {
                    materialRadioButton.setChecked(true);
                    break;
                }
                break;
            case 3:
                ((HelpBottomSheetController) obj).close(new ShimmerThemeKt$$ExternalSyntheticLambda0(26));
                break;
            case 4:
                ((Response) obj).close();
                break;
            default:
                ((SignatureBottomSheetController) obj).getBinding().signatureCanvas.clearCanvas();
                break;
        }
    }
}
