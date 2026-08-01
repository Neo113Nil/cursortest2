package a2;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.gdmhkmf.belbet.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d extends u0.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f109q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f109q = chip;
    }

    @Override // u0.b
    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.C;
        Chip chip = this.f109q;
        if (!chip.c() || (fVar = chip.f1000j) == null || !fVar.Y || chip.f1003m == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // u0.b
    public final void o(int i, o0.g gVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2882a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.C);
            return;
        }
        Chip chip = this.f109q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        gVar.b(o0.c.f2870e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        gVar.h(Button.class.getName());
    }

    @Override // u0.b
    public final void p(int i, boolean z4) {
        Chip chip = this.f109q;
        if (i == 1) {
            chip.f1009s = z4;
        }
        f fVar = chip.f1000j;
        boolean z5 = chip.f1009s;
        boolean z6 = false;
        if (fVar.Z != null) {
            z6 = fVar.X(z5 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : f.T0);
        }
        if (z6) {
            chip.refreshDrawableState();
        }
    }
}
