package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1322w {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static void c(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        marginLayoutParams.setMarginEnd(i4);
    }

    public static void d(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        marginLayoutParams.setMarginStart(i4);
    }
}
