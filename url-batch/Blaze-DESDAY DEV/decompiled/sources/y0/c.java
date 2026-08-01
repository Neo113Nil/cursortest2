package y0;

import L.j;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.winworm.neongrid.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends T.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f4165q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f4165q = chip;
    }

    @Override // T.b
    public final void l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f1772w;
        Chip chip = this.f4165q;
        if (chip.c()) {
            e eVar = chip.f1775e;
            if (eVar != null && eVar.f4181K) {
                z2 = true;
            }
            if (!z2 || chip.h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // T.b
    public final void o(int i, j jVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f561a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f1772w);
            return;
        }
        Chip chip = this.f4165q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        jVar.b(L.e.f552e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
