package com.withpersona.sdk2.inquiry.shared;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Arrays;

/* loaded from: classes9.dex */
public abstract class ExtensionsKt {
    public static final DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();

    public static final double getDpToPx(double d) {
        return d * displayMetrics.density;
    }

    public static final String toHexColorString(int i) {
        return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
    }
}
