package C0;

import N.i;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.winpower.neonfit.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends U.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f74q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f74q = chip;
    }

    @Override // U.b
    public final void l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f2334w;
        Chip chip = this.f74q;
        if (chip.c()) {
            f fVar = chip.e;
            if (fVar != null && fVar.f90K) {
                z2 = true;
            }
            if (!z2 || chip.f2339h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // U.b
    public final void o(int i, i iVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f878a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f2334w);
            return;
        }
        Chip chip = this.f74q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        iVar.b(N.d.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
