package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dp0 {
    public static final dp0 b;
    public final ap0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = yo0.w;
        } else if (i >= 30) {
            b = wo0.v;
        } else {
            b = ap0.b;
        }
    }

    public dp0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new zo0(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new yo0(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new xo0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new wo0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new vo0(this, windowInsets);
        } else if (i >= 28) {
            this.a = new uo0(this, windowInsets);
        } else {
            this.a = new to0(this, windowInsets);
        }
    }

    public static fv e(fv fvVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, fvVar.a - i);
        int max2 = Math.max(0, fvVar.b - i2);
        int max3 = Math.max(0, fvVar.c - i3);
        int max4 = Math.max(0, fvVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? fvVar : fv.c(max, max2, max3, max4);
    }

    public static dp0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        dp0 dp0Var = new dp0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = hm0.a;
            dp0 a = am0.a(view);
            ap0 ap0Var = dp0Var.a;
            ap0Var.v(a);
            View rootView = view.getRootView();
            ap0Var.d(rootView);
            ap0Var.o(rootView);
            ap0Var.p();
            ap0Var.x(view.getWindowSystemUiVisibility());
        }
        return dp0Var;
    }

    public final int a() {
        return this.a.m().d;
    }

    public final int b() {
        return this.a.m().a;
    }

    public final int c() {
        return this.a.m().c;
    }

    public final int d() {
        return this.a.m().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dp0) {
            return Objects.equals(this.a, ((dp0) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        ap0 ap0Var = this.a;
        if (ap0Var instanceof so0) {
            return ((so0) ap0Var).c;
        }
        return null;
    }

    public final int hashCode() {
        ap0 ap0Var = this.a;
        if (ap0Var == null) {
            return 0;
        }
        return ap0Var.hashCode();
    }

    public dp0() {
        this.a = new ap0(this);
    }
}
