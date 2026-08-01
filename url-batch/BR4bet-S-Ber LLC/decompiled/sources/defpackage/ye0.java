package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ye0 {
    public static final ye0 b;
    public final ve0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = te0.w;
        } else if (i >= 30) {
            b = re0.v;
        } else {
            b = ve0.b;
        }
    }

    public ye0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new ue0(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new te0(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new se0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new re0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new qe0(this, windowInsets);
        } else if (i >= 28) {
            this.a = new pe0(this, windowInsets);
        } else {
            this.a = new oe0(this, windowInsets);
        }
    }

    public static er e(er erVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, erVar.a - i);
        int max2 = Math.max(0, erVar.b - i2);
        int max3 = Math.max(0, erVar.c - i3);
        int max4 = Math.max(0, erVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? erVar : er.c(max, max2, max3, max4);
    }

    public static ye0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        ye0 ye0Var = new ye0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = ic0.a;
            ye0 a = bc0.a(view);
            ve0 ve0Var = ye0Var.a;
            ve0Var.v(a);
            View rootView = view.getRootView();
            ve0Var.d(rootView);
            ve0Var.o(rootView);
            ve0Var.p();
            ve0Var.x(view.getWindowSystemUiVisibility());
        }
        return ye0Var;
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
        if (obj instanceof ye0) {
            return Objects.equals(this.a, ((ye0) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        ve0 ve0Var = this.a;
        if (ve0Var instanceof ne0) {
            return ((ne0) ve0Var).c;
        }
        return null;
    }

    public final int hashCode() {
        ve0 ve0Var = this.a;
        if (ve0Var == null) {
            return 0;
        }
        return ve0Var.hashCode();
    }

    public ye0() {
        this.a = new ve0(this);
    }
}
