package z1;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends t0.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f3854q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f3854q = chip;
    }

    @Override // t0.b
    public final void l(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        Rect rect = Chip.B;
        Chip chip = this.f3854q;
        if (!chip.c() || (eVar = chip.f882j) == null || !eVar.Y || chip.f885m == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // t0.b
    public final void o(int i, o0.e eVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2861a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.B);
            return;
        }
        Chip chip = this.f3854q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        eVar.b(o0.c.f2850e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        eVar.i(Button.class.getName());
    }

    @Override // t0.b
    public final void p(int i, boolean z3) {
        Chip chip = this.f3854q;
        if (i == 1) {
            chip.f890r = z3;
        }
        e eVar = chip.f882j;
        boolean z4 = chip.f890r;
        boolean z5 = false;
        if (eVar.Z != null) {
            z5 = eVar.W(z4 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : e.T0);
        }
        if (z5) {
            chip.refreshDrawableState();
        }
    }
}
