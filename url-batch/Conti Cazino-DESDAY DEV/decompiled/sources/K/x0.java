package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f467b;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f468a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f467b = u0.f463q;
        } else {
            f467b = v0.f464b;
        }
    }

    public x0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f468a = new u0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f468a = new t0(this, windowInsets);
        } else if (i >= 28) {
            this.f468a = new s0(this, windowInsets);
        } else {
            this.f468a = new r0(this, windowInsets);
        }
    }

    public static C.d e(C.d dVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, dVar.f148a - i);
        int max2 = Math.max(0, dVar.f149b - i2);
        int max3 = Math.max(0, dVar.f150c - i3);
        int max4 = Math.max(0, dVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? dVar : C.d.b(max, max2, max3, max4);
    }

    public static x0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        x0 x0Var = new x0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = T.f381a;
            x0 a2 = I.a(view);
            v0 v0Var = x0Var.f468a;
            v0Var.p(a2);
            v0Var.d(view.getRootView());
        }
        return x0Var;
    }

    public final int a() {
        return this.f468a.j().d;
    }

    public final int b() {
        return this.f468a.j().f148a;
    }

    public final int c() {
        return this.f468a.j().f150c;
    }

    public final int d() {
        return this.f468a.j().f149b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        return Objects.equals(this.f468a, ((x0) obj).f468a);
    }

    public final WindowInsets f() {
        v0 v0Var = this.f468a;
        if (v0Var instanceof q0) {
            return ((q0) v0Var).f452c;
        }
        return null;
    }

    public final int hashCode() {
        v0 v0Var = this.f468a;
        if (v0Var == null) {
            return 0;
        }
        return v0Var.hashCode();
    }

    public x0() {
        this.f468a = new v0(this);
    }
}
