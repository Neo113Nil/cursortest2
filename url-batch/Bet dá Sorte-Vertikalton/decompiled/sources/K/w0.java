package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f437b;

    /* renamed from: a, reason: collision with root package name */
    public final u0 f438a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f437b = t0.f430q;
        } else {
            f437b = u0.f434b;
        }
    }

    public w0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f438a = new t0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f438a = new s0(this, windowInsets);
        } else if (i >= 28) {
            this.f438a = new r0(this, windowInsets);
        } else {
            this.f438a = new q0(this, windowInsets);
        }
    }

    public static C.d e(C.d dVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, dVar.f142a - i);
        int max2 = Math.max(0, dVar.f143b - i2);
        int max3 = Math.max(0, dVar.f144c - i3);
        int max4 = Math.max(0, dVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? dVar : C.d.b(max, max2, max3, max4);
    }

    public static w0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        w0 w0Var = new w0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = S.f351a;
            w0 a2 = H.a(view);
            u0 u0Var = w0Var.f438a;
            u0Var.p(a2);
            u0Var.d(view.getRootView());
        }
        return w0Var;
    }

    public final int a() {
        return this.f438a.j().d;
    }

    public final int b() {
        return this.f438a.j().f142a;
    }

    public final int c() {
        return this.f438a.j().f144c;
    }

    public final int d() {
        return this.f438a.j().f143b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        return Objects.equals(this.f438a, ((w0) obj).f438a);
    }

    public final WindowInsets f() {
        u0 u0Var = this.f438a;
        if (u0Var instanceof p0) {
            return ((p0) u0Var).f420c;
        }
        return null;
    }

    public final int hashCode() {
        u0 u0Var = this.f438a;
        if (u0Var == null) {
            return 0;
        }
        return u0Var.hashCode();
    }

    public w0() {
        this.f438a = new u0(this);
    }
}
