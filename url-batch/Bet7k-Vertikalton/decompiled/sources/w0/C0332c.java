package w0;

import L.j;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.shotwins.games.R;
import java.util.ArrayList;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332c extends S.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f4112q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0332c(Chip chip, Chip chip2) {
        super(chip2);
        this.f4112q = chip;
    }

    @Override // S.b
    public final void l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f1616w;
        Chip chip = this.f4112q;
        if (chip.c()) {
            C0334e c0334e = chip.f1619e;
            if (c0334e != null && c0334e.f4128K) {
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
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f608a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f1616w);
            return;
        }
        Chip chip = this.f4112q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        jVar.b(L.e.f598e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
