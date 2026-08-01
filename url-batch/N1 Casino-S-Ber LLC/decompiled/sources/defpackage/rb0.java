package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class rb0 {
    public static final rb0 b;
    public final ob0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = mb0.w;
        } else if (i >= 30) {
            b = kb0.v;
        } else {
            b = ob0.b;
        }
    }

    public rb0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new nb0(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new mb0(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new lb0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new kb0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new jb0(this, windowInsets);
        } else if (i >= 28) {
            this.a = new ib0(this, windowInsets);
        } else {
            this.a = new hb0(this, windowInsets);
        }
    }

    public static to e(to toVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, toVar.a - i);
        int max2 = Math.max(0, toVar.b - i2);
        int max3 = Math.max(0, toVar.c - i3);
        int max4 = Math.max(0, toVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? toVar : to.c(max, max2, max3, max4);
    }

    public static rb0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        rb0 rb0Var = new rb0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = x80.a;
            rb0 a = q80.a(view);
            ob0 ob0Var = rb0Var.a;
            ob0Var.v(a);
            View rootView = view.getRootView();
            ob0Var.d(rootView);
            ob0Var.o(rootView);
            ob0Var.p();
            ob0Var.x(view.getWindowSystemUiVisibility());
        }
        return rb0Var;
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
        if (obj instanceof rb0) {
            return Objects.equals(this.a, ((rb0) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        ob0 ob0Var = this.a;
        if (ob0Var instanceof gb0) {
            return ((gb0) ob0Var).c;
        }
        return null;
    }

    public final int hashCode() {
        ob0 ob0Var = this.a;
        if (ob0Var == null) {
            return 0;
        }
        return ob0Var.hashCode();
    }

    public rb0() {
        this.a = new ob0(this);
    }
}
