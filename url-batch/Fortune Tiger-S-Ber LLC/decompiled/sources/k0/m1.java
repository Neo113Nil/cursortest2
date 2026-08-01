package k0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m1 f2759b;

    /* renamed from: a, reason: collision with root package name */
    public final i1 f2760a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            f2759b = h1.f2742s;
        } else if (i4 >= 30) {
            f2759b = g1.f2740r;
        } else {
            f2759b = i1.f2746b;
        }
    }

    public m1(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            this.f2760a = new h1(this, windowInsets);
            return;
        }
        if (i4 >= 30) {
            this.f2760a = new g1(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f2760a = new f1(this, windowInsets);
        } else if (i4 >= 28) {
            this.f2760a = new e1(this, windowInsets);
        } else {
            this.f2760a = new d1(this, windowInsets);
        }
    }

    public static c0.c e(c0.c cVar, int i4, int i5, int i6, int i7) {
        int max = Math.max(0, cVar.f978a - i4);
        int max2 = Math.max(0, cVar.f979b - i5);
        int max3 = Math.max(0, cVar.c - i6);
        int max4 = Math.max(0, cVar.f980d - i7);
        return (max == i4 && max2 == i5 && max3 == i6 && max4 == i7) ? cVar : c0.c.c(max, max2, max3, max4);
    }

    public static m1 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        m1 m1Var = new m1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = j0.f2752a;
            m1 a4 = c0.a(view);
            i1 i1Var = m1Var.f2760a;
            i1Var.q(a4);
            i1Var.d(view.getRootView());
            i1Var.s(view.getWindowSystemUiVisibility());
        }
        return m1Var;
    }

    public final int a() {
        return this.f2760a.k().f980d;
    }

    public final int b() {
        return this.f2760a.k().f978a;
    }

    public final int c() {
        return this.f2760a.k().c;
    }

    public final int d() {
        return this.f2760a.k().f979b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m1) {
            return Objects.equals(this.f2760a, ((m1) obj).f2760a);
        }
        return false;
    }

    public final WindowInsets f() {
        i1 i1Var = this.f2760a;
        if (i1Var instanceof c1) {
            return ((c1) i1Var).c;
        }
        return null;
    }

    public final int hashCode() {
        i1 i1Var = this.f2760a;
        if (i1Var == null) {
            return 0;
        }
        return i1Var.hashCode();
    }

    public m1() {
        this.f2760a = new i1(this);
    }
}
