package z0;

import M.j;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.winfour.winrandom.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends U.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f4361q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f4361q = chip;
    }

    @Override // U.b
    public final void l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f1839w;
        Chip chip = this.f4361q;
        if (chip.c()) {
            e eVar = chip.f1842e;
            if (eVar != null && eVar.f4376K) {
                z2 = true;
            }
            if (!z2 || chip.f1845h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // U.b
    public final void o(int i, j jVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f615a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f1839w);
            return;
        }
        Chip chip = this.f4361q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        jVar.b(M.e.f605e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
