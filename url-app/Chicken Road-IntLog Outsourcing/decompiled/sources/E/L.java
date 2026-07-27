package E;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class L {
    public static boolean a(ViewParent viewParent, View view, float f3, float f6, boolean z) {
        return viewParent.onNestedFling(view, f3, f6, z);
    }

    public static boolean b(ViewParent viewParent, View view, float f3, float f6) {
        return viewParent.onNestedPreFling(view, f3, f6);
    }

    public static void c(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
        viewParent.onNestedPreScroll(view, i2, i3, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i2, int i3, int i6, int i7) {
        viewParent.onNestedScroll(view, i2, i3, i6, i7);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i2) {
        viewParent.onNestedScrollAccepted(view, view2, i2);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i2) {
        return viewParent.onStartNestedScroll(view, view2, i2);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
