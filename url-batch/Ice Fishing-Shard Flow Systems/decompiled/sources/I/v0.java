package I;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f1238b;

    /* renamed from: a, reason: collision with root package name */
    public final r0 f1239a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            f1238b = o0.f1228w;
        } else if (i2 >= 30) {
            f1238b = m0.f1222v;
        } else {
            f1238b = r0.f1234b;
        }
    }

    public v0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            this.f1239a = new q0(this, windowInsets);
            return;
        }
        if (i2 >= 34) {
            this.f1239a = new o0(this, windowInsets);
            return;
        }
        if (i2 >= 31) {
            this.f1239a = new n0(this, windowInsets);
            return;
        }
        if (i2 >= 30) {
            this.f1239a = new m0(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f1239a = new l0(this, windowInsets);
        } else if (i2 >= 28) {
            this.f1239a = new k0(this, windowInsets);
        } else {
            this.f1239a = new j0(this, windowInsets);
        }
    }

    public static B.c a(B.c cVar, int i2, int i5, int i7, int i8) {
        int max = Math.max(0, cVar.f147a - i2);
        int max2 = Math.max(0, cVar.f148b - i5);
        int max3 = Math.max(0, cVar.f149c - i7);
        int max4 = Math.max(0, cVar.f150d - i8);
        return (max == i2 && max2 == i5 && max3 == i7 && max4 == i8) ? cVar : B.c.a(max, max2, max3, max4);
    }

    public static v0 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        v0 v0Var = new v0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = T.f1153a;
            v0 a7 = L.a(view);
            r0 r0Var = v0Var.f1239a;
            r0Var.u(a7);
            View rootView = view.getRootView();
            r0Var.d(rootView);
            r0Var.m(rootView);
            r0Var.n();
            r0Var.w(view.getWindowSystemUiVisibility());
        }
        return v0Var;
    }

    public final WindowInsets b() {
        r0 r0Var = this.f1239a;
        if (r0Var instanceof i0) {
            return ((i0) r0Var).f1202c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            return Objects.equals(this.f1239a, ((v0) obj).f1239a);
        }
        return false;
    }

    public final int hashCode() {
        r0 r0Var = this.f1239a;
        if (r0Var == null) {
            return 0;
        }
        return r0Var.hashCode();
    }

    public v0() {
        this.f1239a = new r0(this);
    }
}
