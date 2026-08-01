package u1;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends q0.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f3402q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f3402q = chip;
    }

    @Override // q0.b
    public final void l(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        Rect rect = Chip.B;
        Chip chip = this.f3402q;
        if (!chip.c() || (eVar = chip.f1255j) == null || !eVar.Y || chip.f1258m == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // q0.b
    public final void o(int i4, l0.e eVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2855a;
        if (i4 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.B);
            return;
        }
        Chip chip = this.f3402q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        eVar.b(l0.d.f2847e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        eVar.g(Button.class.getName());
    }

    @Override // q0.b
    public final void p(int i4, boolean z3) {
        Chip chip = this.f3402q;
        if (i4 == 1) {
            chip.f1263r = z3;
        }
        e eVar = chip.f1255j;
        boolean z4 = chip.f1263r;
        boolean z5 = false;
        if (eVar.Z != null) {
            z5 = eVar.U(z4 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : e.T0);
        }
        if (z5) {
            chip.refreshDrawableState();
        }
    }
}
