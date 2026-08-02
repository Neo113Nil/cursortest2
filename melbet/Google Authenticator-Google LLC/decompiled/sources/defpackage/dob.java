package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dob {
    public static final int[] a = {R.attr.state_expanded};

    public static int a(ColorStateList colorStateList) {
        return colorStateList.getColorForState(a, colorStateList.getDefaultColor());
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return null;
        }
        return ColorStateList.valueOf(colorStateList.getDefaultColor());
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return null;
        }
        return ColorStateList.valueOf(a(colorStateList));
    }

    public static ColorStateList d(ColorStateList colorStateList, boolean z) {
        if (colorStateList == null) {
            return null;
        }
        return z ? c(colorStateList) : b(colorStateList);
    }
}
