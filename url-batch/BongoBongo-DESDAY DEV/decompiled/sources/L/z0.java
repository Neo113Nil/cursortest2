package L;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f588b;

    /* renamed from: a, reason: collision with root package name */
    public final x0 f589a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f588b = w0.f582q;
        } else {
            f588b = x0.f585b;
        }
    }

    public z0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f589a = new w0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f589a = new v0(this, windowInsets);
        } else if (i >= 28) {
            this.f589a = new u0(this, windowInsets);
        } else {
            this.f589a = new t0(this, windowInsets);
        }
    }

    public static D.c e(D.c cVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, cVar.f114a - i);
        int max2 = Math.max(0, cVar.f115b - i2);
        int max3 = Math.max(0, cVar.f116c - i3);
        int max4 = Math.max(0, cVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? cVar : D.c.b(max, max2, max3, max4);
    }

    public static z0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        z0 z0Var = new z0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = T.f490a;
            z0 a2 = I.a(view);
            x0 x0Var = z0Var.f589a;
            x0Var.p(a2);
            x0Var.d(view.getRootView());
        }
        return z0Var;
    }

    public final int a() {
        return this.f589a.j().d;
    }

    public final int b() {
        return this.f589a.j().f114a;
    }

    public final int c() {
        return this.f589a.j().f116c;
    }

    public final int d() {
        return this.f589a.j().f115b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        return Objects.equals(this.f589a, ((z0) obj).f589a);
    }

    public final WindowInsets f() {
        x0 x0Var = this.f589a;
        if (x0Var instanceof s0) {
            return ((s0) x0Var).f570c;
        }
        return null;
    }

    public final int hashCode() {
        x0 x0Var = this.f589a;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.hashCode();
    }

    public z0() {
        this.f589a = new x0(this);
    }
}
