package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: b, reason: collision with root package name */
    public static final B0 f394b;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f395a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f394b = y0.f517q;
        } else {
            f394b = z0.f518b;
        }
    }

    public B0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f395a = new y0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f395a = new x0(this, windowInsets);
        } else if (i >= 28) {
            this.f395a = new w0(this, windowInsets);
        } else {
            this.f395a = new v0(this, windowInsets);
        }
    }

    public static C.d e(C.d dVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, dVar.f158a - i);
        int max2 = Math.max(0, dVar.f159b - i2);
        int max3 = Math.max(0, dVar.f160c - i3);
        int max4 = Math.max(0, dVar.f161d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? dVar : C.d.b(max, max2, max3, max4);
    }

    public static B0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        B0 b02 = new B0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = X.f418a;
            B0 a2 = M.a(view);
            z0 z0Var = b02.f395a;
            z0Var.p(a2);
            z0Var.d(view.getRootView());
        }
        return b02;
    }

    public final int a() {
        return this.f395a.j().f161d;
    }

    public final int b() {
        return this.f395a.j().f158a;
    }

    public final int c() {
        return this.f395a.j().f160c;
    }

    public final int d() {
        return this.f395a.j().f159b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        return Objects.equals(this.f395a, ((B0) obj).f395a);
    }

    public final WindowInsets f() {
        z0 z0Var = this.f395a;
        if (z0Var instanceof u0) {
            return ((u0) z0Var).f505c;
        }
        return null;
    }

    public final int hashCode() {
        z0 z0Var = this.f395a;
        if (z0Var == null) {
            return 0;
        }
        return z0Var.hashCode();
    }

    public B0() {
        this.f395a = new z0(this);
    }
}
