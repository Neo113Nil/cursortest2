package n0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: b, reason: collision with root package name */
    public static final v1 f2841b;

    /* renamed from: a, reason: collision with root package name */
    public final s1 f2842a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f2841b = q1.f2822w;
        } else if (i >= 30) {
            f2841b = o1.f2815v;
        } else {
            f2841b = s1.f2832b;
        }
    }

    public v1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f2842a = new r1(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f2842a = new q1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f2842a = new p1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f2842a = new o1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f2842a = new n1(this, windowInsets);
        } else if (i >= 28) {
            this.f2842a = new m1(this, windowInsets);
        } else {
            this.f2842a = new l1(this, windowInsets);
        }
    }

    public static f0.c e(f0.c cVar, int i, int i4, int i5, int i6) {
        int max = Math.max(0, cVar.f1415a - i);
        int max2 = Math.max(0, cVar.f1416b - i4);
        int max3 = Math.max(0, cVar.f1417c - i5);
        int max4 = Math.max(0, cVar.d - i6);
        return (max == i && max2 == i4 && max3 == i5 && max4 == i6) ? cVar : f0.c.c(max, max2, max3, max4);
    }

    public static v1 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        v1 v1Var = new v1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = p0.f2816a;
            v1 a5 = i0.a(view);
            s1 s1Var = v1Var.f2842a;
            s1Var.v(a5);
            View rootView = view.getRootView();
            s1Var.d(rootView);
            s1Var.o(rootView);
            s1Var.p();
            s1Var.x(view.getWindowSystemUiVisibility());
        }
        return v1Var;
    }

    public final int a() {
        return this.f2842a.m().d;
    }

    public final int b() {
        return this.f2842a.m().f1415a;
    }

    public final int c() {
        return this.f2842a.m().f1417c;
    }

    public final int d() {
        return this.f2842a.m().f1416b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1) {
            return Objects.equals(this.f2842a, ((v1) obj).f2842a);
        }
        return false;
    }

    public final WindowInsets f() {
        s1 s1Var = this.f2842a;
        if (s1Var instanceof k1) {
            return ((k1) s1Var).f2797c;
        }
        return null;
    }

    public final int hashCode() {
        s1 s1Var = this.f2842a;
        if (s1Var == null) {
            return 0;
        }
        return s1Var.hashCode();
    }

    public v1() {
        this.f2842a = new s1(this);
    }
}
