package M;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f595b;

    /* renamed from: a, reason: collision with root package name */
    public final t0 f596a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f595b = s0.f588q;
        } else {
            f595b = t0.f592b;
        }
    }

    public v0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f596a = new s0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f596a = new r0(this, windowInsets);
        } else if (i >= 28) {
            this.f596a = new q0(this, windowInsets);
        } else {
            this.f596a = new p0(this, windowInsets);
        }
    }

    public static E.c e(E.c cVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, cVar.f162a - i);
        int max2 = Math.max(0, cVar.f163b - i2);
        int max3 = Math.max(0, cVar.f164c - i3);
        int max4 = Math.max(0, cVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? cVar : E.c.b(max, max2, max3, max4);
    }

    public static v0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        v0 v0Var = new v0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = Q.f513a;
            v0 a2 = G.a(view);
            t0 t0Var = v0Var.f596a;
            t0Var.p(a2);
            t0Var.d(view.getRootView());
        }
        return v0Var;
    }

    public final int a() {
        return this.f596a.j().d;
    }

    public final int b() {
        return this.f596a.j().f162a;
    }

    public final int c() {
        return this.f596a.j().f164c;
    }

    public final int d() {
        return this.f596a.j().f163b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        return Objects.equals(this.f596a, ((v0) obj).f596a);
    }

    public final WindowInsets f() {
        t0 t0Var = this.f596a;
        if (t0Var instanceof o0) {
            return ((o0) t0Var).f578c;
        }
        return null;
    }

    public final int hashCode() {
        t0 t0Var = this.f596a;
        if (t0Var == null) {
            return 0;
        }
        return t0Var.hashCode();
    }

    public v0() {
        this.f596a = new t0(this);
    }
}
