package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f450b;

    /* renamed from: a, reason: collision with root package name */
    public final u0 f451a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f450b = t0.f444q;
        } else {
            f450b = u0.f445b;
        }
    }

    public w0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f451a = new t0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f451a = new s0(this, windowInsets);
        } else if (i >= 28) {
            this.f451a = new r0(this, windowInsets);
        } else {
            this.f451a = new q0(this, windowInsets);
        }
    }

    public static C.d e(C.d dVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, dVar.f94a - i);
        int max2 = Math.max(0, dVar.f95b - i2);
        int max3 = Math.max(0, dVar.f96c - i3);
        int max4 = Math.max(0, dVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? dVar : C.d.b(max, max2, max3, max4);
    }

    public static w0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        w0 w0Var = new w0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = S.f365a;
            w0 a2 = H.a(view);
            u0 u0Var = w0Var.f451a;
            u0Var.p(a2);
            u0Var.d(view.getRootView());
        }
        return w0Var;
    }

    public final int a() {
        return this.f451a.j().d;
    }

    public final int b() {
        return this.f451a.j().f94a;
    }

    public final int c() {
        return this.f451a.j().f96c;
    }

    public final int d() {
        return this.f451a.j().f95b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        return Objects.equals(this.f451a, ((w0) obj).f451a);
    }

    public final WindowInsets f() {
        u0 u0Var = this.f451a;
        if (u0Var instanceof p0) {
            return ((p0) u0Var).f434c;
        }
        return null;
    }

    public final int hashCode() {
        u0 u0Var = this.f451a;
        if (u0Var == null) {
            return 0;
        }
        return u0Var.hashCode();
    }

    public w0() {
        this.f451a = new u0(this);
    }
}
