package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmq {
    public static final int[] a = {R.attr.state_pressed};
    public static final int[] b = {R.attr.state_focused};
    public static final int[] c = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] d = {R.attr.state_selected};

    private fmq() {
    }

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        int alpha = Color.alpha(colorForState);
        return va.c(colorForState, Math.min(alpha + alpha, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }
}
