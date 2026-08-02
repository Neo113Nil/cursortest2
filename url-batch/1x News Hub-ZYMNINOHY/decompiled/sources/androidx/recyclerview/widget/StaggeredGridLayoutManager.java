package androidx.recyclerview.widget;

import E.A;
import K0.j;
import Q.b;
import U.C0077m;
import U.D;
import U.I;
import U.K;
import U.L;
import U.u;
import U.v;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b0.C0178i;
import java.lang.reflect.Field;
import java.util.BitSet;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends u {

    /* renamed from: h, reason: collision with root package name */
    public final int f2498h;

    /* renamed from: i, reason: collision with root package name */
    public final L[] f2499i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2500j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2501k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2502l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f2503m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2504n = false;
    public final C0178i o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2505p;

    /* renamed from: q, reason: collision with root package name */
    public K f2506q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2507r;

    /* renamed from: s, reason: collision with root package name */
    public final B.b f2508s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2498h = -1;
        this.f2503m = false;
        C0178i c0178i = new C0178i(26);
        this.o = c0178i;
        this.f2505p = 2;
        new Rect();
        new j(28, this);
        this.f2507r = true;
        this.f2508s = new B.b(9, this);
        C0077m w3 = u.w(context, attributeSet, i3, i4);
        int i5 = w3.f1439b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i5 != this.f2502l) {
            this.f2502l = i5;
            b bVar = this.f2500j;
            this.f2500j = this.f2501k;
            this.f2501k = bVar;
            H();
        }
        int i6 = w3.f1440c;
        a(null);
        if (i6 != this.f2498h) {
            c0178i.f2532b = null;
            H();
            this.f2498h = i6;
            new BitSet(this.f2498h);
            this.f2499i = new L[this.f2498h];
            for (int i7 = 0; i7 < this.f2498h; i7++) {
                this.f2499i[i7] = new L(this, i7);
            }
            H();
        }
        boolean z = w3.f1441d;
        a(null);
        K k3 = this.f2506q;
        if (k3 != null && k3.f1375h != z) {
            k3.f1375h = z;
        }
        this.f2503m = z;
        H();
        this.f2500j = b.a(this, this.f2502l);
        this.f2501k = b.a(this, 1 - this.f2502l);
    }

    @Override // U.u
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View O2 = O(false);
            View N2 = N(false);
            if (O2 == null || N2 == null) {
                return;
            }
            ((v) O2.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // U.u
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof K) {
            this.f2506q = (K) parcelable;
            H();
        }
    }

    @Override // U.u
    public final Parcelable C() {
        K k3 = this.f2506q;
        if (k3 != null) {
            K k4 = new K();
            k4.f1371c = k3.f1371c;
            k4.f1369a = k3.f1369a;
            k4.f1370b = k3.f1370b;
            k4.f1372d = k3.f1372d;
            k4.f1373e = k3.f1373e;
            k4.f = k3.f;
            k4.f1375h = k3.f1375h;
            k4.f1376i = k3.f1376i;
            k4.f1377j = k3.f1377j;
            k4.f1374g = k3.f1374g;
            return k4;
        }
        K k5 = new K();
        k5.f1375h = this.f2503m;
        k5.f1376i = false;
        k5.f1377j = false;
        k5.f1373e = 0;
        if (p() <= 0) {
            k5.f1369a = -1;
            k5.f1370b = -1;
            k5.f1371c = 0;
            return k5;
        }
        P();
        k5.f1369a = 0;
        View N2 = this.f2504n ? N(true) : O(true);
        if (N2 != null) {
            ((v) N2.getLayoutParams()).getClass();
            throw null;
        }
        k5.f1370b = -1;
        int i3 = this.f2498h;
        k5.f1371c = i3;
        k5.f1372d = new int[i3];
        for (int i4 = 0; i4 < this.f2498h; i4++) {
            L l3 = this.f2499i[i4];
            int i5 = l3.f1379b;
            if (i5 == Integer.MIN_VALUE) {
                if (l3.f1378a.size() == 0) {
                    i5 = Integer.MIN_VALUE;
                } else {
                    View view = (View) l3.f1378a.get(0);
                    I i6 = (I) view.getLayoutParams();
                    l3.f1379b = l3.f1382e.f2500j.c(view);
                    i6.getClass();
                    i5 = l3.f1379b;
                }
            }
            if (i5 != Integer.MIN_VALUE) {
                i5 -= this.f2500j.e();
            }
            k5.f1372d[i4] = i5;
        }
        return k5;
    }

    @Override // U.u
    public final void D(int i3) {
        if (i3 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i3 = this.f2498h;
        boolean z = this.f2504n;
        if (p() == 0 || this.f2505p == 0 || !this.f1455e) {
            return false;
        }
        if (z) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int p3 = p();
        int i4 = p3 - 1;
        new BitSet(i3).set(0, i3, true);
        if (this.f2502l == 1) {
            RecyclerView recyclerView = this.f1452b;
            Field field = A.f243a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z) {
            p3 = -1;
        } else {
            i4 = 0;
        }
        if (i4 == p3) {
            return false;
        }
        ((I) o(i4).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(D d3) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f2500j;
        boolean z = !this.f2507r;
        return a.i(d3, bVar, O(z), N(z), this, this.f2507r);
    }

    public final void L(D d3) {
        if (p() == 0) {
            return;
        }
        boolean z = !this.f2507r;
        View O2 = O(z);
        View N2 = N(z);
        if (p() == 0 || d3.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((v) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(D d3) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f2500j;
        boolean z = !this.f2507r;
        return a.j(d3, bVar, O(z), N(z), this, this.f2507r);
    }

    public final View N(boolean z) {
        int e3 = this.f2500j.e();
        int d3 = this.f2500j.d();
        View view = null;
        for (int p3 = p() - 1; p3 >= 0; p3--) {
            View o = o(p3);
            int c3 = this.f2500j.c(o);
            int b3 = this.f2500j.b(o);
            if (b3 > e3 && c3 < d3) {
                if (b3 <= d3 || !z) {
                    return o;
                }
                if (view == null) {
                    view = o;
                }
            }
        }
        return view;
    }

    public final View O(boolean z) {
        int e3 = this.f2500j.e();
        int d3 = this.f2500j.d();
        int p3 = p();
        View view = null;
        for (int i3 = 0; i3 < p3; i3++) {
            View o = o(i3);
            int c3 = this.f2500j.c(o);
            if (this.f2500j.b(o) > e3 && c3 < d3) {
                if (c3 >= e3 || !z) {
                    return o;
                }
                if (view == null) {
                    view = o;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        u.v(o(0));
        throw null;
    }

    public final void Q() {
        int p3 = p();
        if (p3 == 0) {
            return;
        }
        u.v(o(p3 - 1));
        throw null;
    }

    @Override // U.u
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2506q != null || (recyclerView = this.f1452b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // U.u
    public final boolean b() {
        return this.f2502l == 0;
    }

    @Override // U.u
    public final boolean c() {
        return this.f2502l == 1;
    }

    @Override // U.u
    public final boolean d(v vVar) {
        return vVar instanceof I;
    }

    @Override // U.u
    public final int f(D d3) {
        return K(d3);
    }

    @Override // U.u
    public final void g(D d3) {
        L(d3);
    }

    @Override // U.u
    public final int h(D d3) {
        return M(d3);
    }

    @Override // U.u
    public final int i(D d3) {
        return K(d3);
    }

    @Override // U.u
    public final void j(D d3) {
        L(d3);
    }

    @Override // U.u
    public final int k(D d3) {
        return M(d3);
    }

    @Override // U.u
    public final v l() {
        return this.f2502l == 0 ? new I(-2, -1) : new I(-1, -2);
    }

    @Override // U.u
    public final v m(Context context, AttributeSet attributeSet) {
        return new I(context, attributeSet);
    }

    @Override // U.u
    public final v n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new I((ViewGroup.MarginLayoutParams) layoutParams) : new I(layoutParams);
    }

    @Override // U.u
    public final int q(U.A a3, D d3) {
        if (this.f2502l == 1) {
            return this.f2498h;
        }
        super.q(a3, d3);
        return 1;
    }

    @Override // U.u
    public final int x(U.A a3, D d3) {
        if (this.f2502l == 0) {
            return this.f2498h;
        }
        super.x(a3, d3);
        return 1;
    }

    @Override // U.u
    public final boolean y() {
        return this.f2505p != 0;
    }

    @Override // U.u
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1452b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2508s);
        }
        for (int i3 = 0; i3 < this.f2498h; i3++) {
            L l3 = this.f2499i[i3];
            l3.f1378a.clear();
            l3.f1379b = Integer.MIN_VALUE;
            l3.f1380c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
