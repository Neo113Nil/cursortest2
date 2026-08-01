package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class os extends op {
    @Override // defpackage.op
    public final float C(y20 y20Var) {
        float displayedWidthIncrease;
        displayedWidthIncrease = ((MaterialButton) y20Var).getDisplayedWidthIncrease();
        return displayedWidthIncrease;
    }

    @Override // defpackage.op
    public final void Q(y20 y20Var, float f) {
        ((MaterialButton) y20Var).setDisplayedWidthIncrease(f);
    }
}
