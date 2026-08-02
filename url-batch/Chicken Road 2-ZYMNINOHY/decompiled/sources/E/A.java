package E;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;

/* loaded from: classes.dex */
public abstract class A {
    public static ColorStateList a(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode b(View view) {
        return view.getBackgroundTintMode();
    }

    public static String c(View view) {
        return view.getTransitionName();
    }

    public static void d(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void e(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void f(View view, String str) {
        view.setTransitionName(str);
    }

    public static void g(View view) {
        view.stopNestedScroll();
    }
}
