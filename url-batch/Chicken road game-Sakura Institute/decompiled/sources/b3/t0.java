package b3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f1366b;

    /* renamed from: a, reason: collision with root package name */
    public final q0 f1367a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f1366b = p0.f1358q;
        } else {
            f1366b = q0.f1359b;
        }
    }

    public t0(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f1367a = new p0(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f1367a = new o0(this, windowInsets);
        } else if (i7 >= 28) {
            this.f1367a = new n0(this, windowInsets);
        } else {
            this.f1367a = new m0(this, windowInsets);
        }
    }

    public static t0 b(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        t0 t0Var = new t0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i7 = s.f1365a;
            t0 a3 = m.a(view);
            q0 q0Var = t0Var.f1367a;
            q0Var.q(a3);
            q0Var.d(view.getRootView());
        }
        return t0Var;
    }

    public final WindowInsets a() {
        q0 q0Var = this.f1367a;
        if (q0Var instanceof l0) {
            return ((l0) q0Var).f1349c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            return Objects.equals(this.f1367a, ((t0) obj).f1367a);
        }
        return false;
    }

    public final int hashCode() {
        q0 q0Var = this.f1367a;
        if (q0Var == null) {
            return 0;
        }
        return q0Var.hashCode();
    }

    public t0() {
        this.f1367a = new q0(this);
    }
}
