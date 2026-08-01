package w0;

import L.j;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.luckyarcade.spinthrow.R;
import java.util.ArrayList;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360c extends S.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f4533q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0360c(Chip chip, Chip chip2) {
        super(chip2);
        this.f4533q = chip;
    }

    @Override // S.b
    public final void l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f1811w;
        Chip chip = this.f4533q;
        if (chip.c()) {
            C0362e c0362e = chip.f1814e;
            if (c0362e != null && c0362e.f4549K) {
                z2 = true;
            }
            if (!z2 || chip.h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // S.b
    public final void o(int i, j jVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f666a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f1811w);
            return;
        }
        Chip chip = this.f4533q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        jVar.b(L.e.f655e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
