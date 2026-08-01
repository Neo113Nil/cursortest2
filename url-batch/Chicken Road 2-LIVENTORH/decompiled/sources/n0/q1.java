package n0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: b, reason: collision with root package name */
    public static final q1 f2774b;

    /* renamed from: a, reason: collision with root package name */
    public final n1 f2775a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f2774b = m1.f2763s;
        } else if (i >= 30) {
            f2774b = k1.f2756r;
        } else {
            f2774b = n1.f2765b;
        }
    }

    public q1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f2775a = new m1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f2775a = new l1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f2775a = new k1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f2775a = new j1(this, windowInsets);
        } else if (i >= 28) {
            this.f2775a = new i1(this, windowInsets);
        } else {
            this.f2775a = new h1(this, windowInsets);
        }
    }

    public static f0.c e(f0.c cVar, int i, int i4, int i5, int i6) {
        int max = Math.max(0, cVar.f1266a - i);
        int max2 = Math.max(0, cVar.f1267b - i4);
        int max3 = Math.max(0, cVar.f1268c - i5);
        int max4 = Math.max(0, cVar.d - i6);
        return (max == i && max2 == i4 && max3 == i5 && max4 == i6) ? cVar : f0.c.c(max, max2, max3, max4);
    }

    public static q1 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        q1 q1Var = new q1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = l0.f2757a;
            q1 a2 = e0.a(view);
            n1 n1Var = q1Var.f2775a;
            n1Var.q(a2);
            n1Var.d(view.getRootView());
            n1Var.s(view.getWindowSystemUiVisibility());
        }
        return q1Var;
    }

    public final int a() {
        return this.f2775a.k().d;
    }

    public final int b() {
        return this.f2775a.k().f1266a;
    }

    public final int c() {
        return this.f2775a.k().f1268c;
    }

    public final int d() {
        return this.f2775a.k().f1267b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q1) {
            return Objects.equals(this.f2775a, ((q1) obj).f2775a);
        }
        return false;
    }

    public final WindowInsets f() {
        n1 n1Var = this.f2775a;
        if (n1Var instanceof g1) {
            return ((g1) n1Var).f2739c;
        }
        return null;
    }

    public final int hashCode() {
        n1 n1Var = this.f2775a;
        if (n1Var == null) {
            return 0;
        }
        return n1Var.hashCode();
    }

    public q1() {
        this.f2775a = new n1(this);
    }
}
