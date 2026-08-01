package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ac0 {
    public static final ac0 b;
    public final xb0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = vb0.w;
        } else if (i >= 30) {
            b = tb0.v;
        } else {
            b = xb0.b;
        }
    }

    public ac0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new wb0(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new vb0(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new ub0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new tb0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new sb0(this, windowInsets);
        } else if (i >= 28) {
            this.a = new rb0(this, windowInsets);
        } else {
            this.a = new qb0(this, windowInsets);
        }
    }

    public static ip e(ip ipVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, ipVar.a - i);
        int max2 = Math.max(0, ipVar.b - i2);
        int max3 = Math.max(0, ipVar.c - i3);
        int max4 = Math.max(0, ipVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? ipVar : ip.c(max, max2, max3, max4);
    }

    public static ac0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        ac0 ac0Var = new ac0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = e90.a;
            ac0 a = x80.a(view);
            xb0 xb0Var = ac0Var.a;
            xb0Var.v(a);
            View rootView = view.getRootView();
            xb0Var.d(rootView);
            xb0Var.o(rootView);
            xb0Var.p();
            xb0Var.x(view.getWindowSystemUiVisibility());
        }
        return ac0Var;
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
        if (obj instanceof ac0) {
            return Objects.equals(this.a, ((ac0) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        xb0 xb0Var = this.a;
        if (xb0Var instanceof pb0) {
            return ((pb0) xb0Var).c;
        }
        return null;
    }

    public final int hashCode() {
        xb0 xb0Var = this.a;
        if (xb0Var == null) {
            return 0;
        }
        return xb0Var.hashCode();
    }

    public ac0() {
        this.a = new xb0(this);
    }
}
