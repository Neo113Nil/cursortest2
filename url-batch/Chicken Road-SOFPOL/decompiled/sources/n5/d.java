package n5;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.snovikpovik.vuevnxsj.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends x3.a {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f5379q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f5379q = chip;
    }

    @Override // x3.a
    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.f1900z;
        Chip chip = this.f5379q;
        if (!chip.c() || (fVar = chip.f1901h) == null || !fVar.W || chip.f1903k == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // x3.a
    public final void o(int i, r3.f fVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f6557a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f1900z);
            return;
        }
        Chip chip = this.f5379q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        fVar.b(r3.d.f6541e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        fVar.i(Button.class.getName());
    }

    @Override // x3.a
    public final void p(int i, boolean z3) {
        Chip chip = this.f5379q;
        if (i == 1) {
            chip.f1908p = z3;
        }
        f fVar = chip.f1901h;
        boolean z7 = chip.f1908p;
        boolean z8 = false;
        if (fVar.X != null) {
            z8 = fVar.R(z7 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : f.R0);
        }
        if (z8) {
            chip.refreshDrawableState();
        }
    }
}
