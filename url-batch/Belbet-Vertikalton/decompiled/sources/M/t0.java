package M;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f793b;

    /* renamed from: a, reason: collision with root package name */
    public final r0 f794a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f793b = q0.f786q;
        } else {
            f793b = r0.f787b;
        }
    }

    public t0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f794a = new q0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f794a = new p0(this, windowInsets);
        } else if (i >= 28) {
            this.f794a = new o0(this, windowInsets);
        } else {
            this.f794a = new n0(this, windowInsets);
        }
    }

    public static E.c e(E.c cVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, cVar.f279a - i);
        int max2 = Math.max(0, cVar.f280b - i2);
        int max3 = Math.max(0, cVar.f281c - i3);
        int max4 = Math.max(0, cVar.f282d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? cVar : E.c.b(max, max2, max3, max4);
    }

    public static t0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        t0 t0Var = new t0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = P.f711a;
            t0 a2 = F.a(view);
            r0 r0Var = t0Var.f794a;
            r0Var.p(a2);
            r0Var.d(view.getRootView());
        }
        return t0Var;
    }

    public final int a() {
        return this.f794a.j().f282d;
    }

    public final int b() {
        return this.f794a.j().f279a;
    }

    public final int c() {
        return this.f794a.j().f281c;
    }

    public final int d() {
        return this.f794a.j().f280b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        return Objects.equals(this.f794a, ((t0) obj).f794a);
    }

    public final WindowInsets f() {
        r0 r0Var = this.f794a;
        if (r0Var instanceof m0) {
            return ((m0) r0Var).f776c;
        }
        return null;
    }

    public final int hashCode() {
        r0 r0Var = this.f794a;
        if (r0Var == null) {
            return 0;
        }
        return r0Var.hashCode();
    }

    public t0() {
        this.f794a = new r0(this);
    }
}
