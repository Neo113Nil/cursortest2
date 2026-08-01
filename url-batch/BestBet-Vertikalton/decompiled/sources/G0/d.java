package G0;

import L.j;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.fortunequest.neontrack.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends T.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f296q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f296q = chip;
    }

    @Override // T.b
    public final void l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f2221w;
        Chip chip = this.f296q;
        if (chip.c()) {
            f fVar = chip.f2224e;
            if (fVar != null && fVar.f313K) {
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
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f696a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f2221w);
            return;
        }
        Chip chip = this.f296q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        jVar.b(L.e.f687e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
