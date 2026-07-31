package androidx.recyclerview.widget;

import B0.C0000a;
import B0.E;
import C.b;
import N.C;
import N.C0057n;
import N.C0059p;
import N.F;
import N.K;
import N.M;
import N.N;
import N.w;
import N.x;
import a.AbstractC0086a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.BitSet;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends w {

    /* renamed from: h, reason: collision with root package name */
    public final int f1710h;

    /* renamed from: i, reason: collision with root package name */
    public final N[] f1711i;

    /* renamed from: j, reason: collision with root package name */
    public final C0059p f1712j;

    /* renamed from: k, reason: collision with root package name */
    public final C0059p f1713k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1714l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1715m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1716n = false;

    /* renamed from: o, reason: collision with root package name */
    public final E f1717o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1718p;

    /* renamed from: q, reason: collision with root package name */
    public M f1719q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1720r;

    /* renamed from: s, reason: collision with root package name */
    public final b f1721s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1710h = -1;
        this.f1715m = false;
        E e2 = new E(10, false);
        this.f1717o = e2;
        this.f1718p = 2;
        new Rect();
        new C0000a(15, this);
        this.f1720r = true;
        this.f1721s = new b(3, this);
        C0057n w2 = w.w(context, attributeSet, i2, i3);
        int i4 = w2.f759b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i4 != this.f1714l) {
            this.f1714l = i4;
            C0059p c0059p = this.f1712j;
            this.f1712j = this.f1713k;
            this.f1713k = c0059p;
            H();
        }
        int i5 = w2.f760c;
        a(null);
        if (i5 != this.f1710h) {
            e2.f20f = null;
            H();
            this.f1710h = i5;
            new BitSet(this.f1710h);
            this.f1711i = new N[this.f1710h];
            for (int i6 = 0; i6 < this.f1710h; i6++) {
                this.f1711i[i6] = new N(this, i6);
            }
            H();
        }
        boolean z2 = w2.f761d;
        a(null);
        M m2 = this.f1719q;
        if (m2 != null && m2.f682l != z2) {
            m2.f682l = z2;
        }
        this.f1715m = z2;
        H();
        this.f1712j = C0059p.a(this, this.f1714l);
        this.f1713k = C0059p.a(this, 1 - this.f1714l);
    }

    @Override // N.w
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View M2 = M(false);
            View L2 = L(false);
            if (M2 == null || L2 == null) {
                return;
            }
            ((x) M2.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // N.w
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof M) {
            this.f1719q = (M) parcelable;
            H();
        }
    }

    @Override // N.w
    public final Parcelable C() {
        M m2 = this.f1719q;
        if (m2 != null) {
            M m3 = new M();
            m3.f677g = m2.f677g;
            m3.f675e = m2.f675e;
            m3.f676f = m2.f676f;
            m3.f678h = m2.f678h;
            m3.f679i = m2.f679i;
            m3.f680j = m2.f680j;
            m3.f682l = m2.f682l;
            m3.f683m = m2.f683m;
            m3.f684n = m2.f684n;
            m3.f681k = m2.f681k;
            return m3;
        }
        M m4 = new M();
        m4.f682l = this.f1715m;
        m4.f683m = false;
        m4.f684n = false;
        m4.f679i = 0;
        if (p() <= 0) {
            m4.f675e = -1;
            m4.f676f = -1;
            m4.f677g = 0;
            return m4;
        }
        N();
        m4.f675e = 0;
        View L2 = this.f1716n ? L(true) : M(true);
        if (L2 != null) {
            ((x) L2.getLayoutParams()).getClass();
            throw null;
        }
        m4.f676f = -1;
        int i2 = this.f1710h;
        m4.f677g = i2;
        m4.f678h = new int[i2];
        for (int i3 = 0; i3 < this.f1710h; i3++) {
            N n2 = this.f1711i[i3];
            int i4 = n2.f686b;
            if (i4 == Integer.MIN_VALUE) {
                if (n2.f685a.size() == 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    View view = (View) n2.f685a.get(0);
                    K k2 = (K) view.getLayoutParams();
                    n2.f686b = n2.f689e.f1712j.c(view);
                    k2.getClass();
                    i4 = n2.f686b;
                }
            }
            if (i4 != Integer.MIN_VALUE) {
                i4 -= this.f1712j.e();
            }
            m4.f678h[i3] = i4;
        }
        return m4;
    }

    @Override // N.w
    public final void D(int i2) {
        if (i2 == 0) {
            J();
        }
    }

    public final boolean J() {
        if (p() == 0 || this.f1718p == 0 || !this.f778e) {
            return false;
        }
        boolean z2 = this.f1716n;
        if (z2) {
            O();
            N();
        } else {
            N();
            O();
        }
        int p2 = p();
        int i2 = p2 - 1;
        int i3 = this.f1710h;
        new BitSet(i3).set(0, i3, true);
        if (this.f1714l == 1) {
            RecyclerView recyclerView = this.f775b;
            Field field = y.x.f3160a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z2) {
            p2 = -1;
        } else {
            i2 = 0;
        }
        if (i2 == p2) {
            return false;
        }
        ((K) o(i2).getLayoutParams()).getClass();
        throw null;
    }

    public final void K(F f2) {
        if (p() == 0) {
            return;
        }
        boolean z2 = !this.f1720r;
        View M2 = M(z2);
        View L2 = L(z2);
        if (p() == 0 || f2.a() == 0 || M2 == null || L2 == null) {
            return;
        }
        ((x) M2.getLayoutParams()).getClass();
        throw null;
    }

    public final View L(boolean z2) {
        int e2 = this.f1712j.e();
        int d2 = this.f1712j.d();
        View view = null;
        for (int p2 = p() - 1; p2 >= 0; p2--) {
            View o2 = o(p2);
            int c2 = this.f1712j.c(o2);
            int b2 = this.f1712j.b(o2);
            if (b2 > e2 && c2 < d2) {
                if (b2 <= d2 || !z2) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public final View M(boolean z2) {
        int e2 = this.f1712j.e();
        int d2 = this.f1712j.d();
        int p2 = p();
        View view = null;
        for (int i2 = 0; i2 < p2; i2++) {
            View o2 = o(i2);
            int c2 = this.f1712j.c(o2);
            if (this.f1712j.b(o2) > e2 && c2 < d2) {
                if (c2 >= e2 || !z2) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public final void N() {
        if (p() == 0) {
            return;
        }
        w.v(o(0));
        throw null;
    }

    public final void O() {
        int p2 = p();
        if (p2 == 0) {
            return;
        }
        w.v(o(p2 - 1));
        throw null;
    }

    @Override // N.w
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f1719q != null || (recyclerView = this.f775b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // N.w
    public final boolean b() {
        return this.f1714l == 0;
    }

    @Override // N.w
    public final boolean c() {
        return this.f1714l == 1;
    }

    @Override // N.w
    public final boolean d(x xVar) {
        return xVar instanceof K;
    }

    @Override // N.w
    public final int f(F f2) {
        if (p() == 0) {
            return 0;
        }
        boolean z2 = !this.f1720r;
        return AbstractC0086a.i(f2, this.f1712j, M(z2), L(z2), this, this.f1720r);
    }

    @Override // N.w
    public final void g(F f2) {
        K(f2);
    }

    @Override // N.w
    public final int h(F f2) {
        if (p() == 0) {
            return 0;
        }
        boolean z2 = !this.f1720r;
        return AbstractC0086a.j(f2, this.f1712j, M(z2), L(z2), this, this.f1720r);
    }

    @Override // N.w
    public final int i(F f2) {
        if (p() == 0) {
            return 0;
        }
        boolean z2 = !this.f1720r;
        return AbstractC0086a.i(f2, this.f1712j, M(z2), L(z2), this, this.f1720r);
    }

    @Override // N.w
    public final void j(F f2) {
        K(f2);
    }

    @Override // N.w
    public final int k(F f2) {
        if (p() == 0) {
            return 0;
        }
        boolean z2 = !this.f1720r;
        return AbstractC0086a.j(f2, this.f1712j, M(z2), L(z2), this, this.f1720r);
    }

    @Override // N.w
    public final x l() {
        return this.f1714l == 0 ? new K(-2, -1) : new K(-1, -2);
    }

    @Override // N.w
    public final x m(Context context, AttributeSet attributeSet) {
        return new K(context, attributeSet);
    }

    @Override // N.w
    public final x n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new K((ViewGroup.MarginLayoutParams) layoutParams) : new K(layoutParams);
    }

    @Override // N.w
    public final int q(C c2, F f2) {
        if (this.f1714l == 1) {
            return this.f1710h;
        }
        super.q(c2, f2);
        return 1;
    }

    @Override // N.w
    public final int x(C c2, F f2) {
        if (this.f1714l == 0) {
            return this.f1710h;
        }
        super.x(c2, f2);
        return 1;
    }

    @Override // N.w
    public final boolean y() {
        return this.f1718p != 0;
    }

    @Override // N.w
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f775b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1721s);
        }
        for (int i2 = 0; i2 < this.f1710h; i2++) {
            N n2 = this.f1711i[i2];
            n2.f685a.clear();
            n2.f686b = Integer.MIN_VALUE;
            n2.f687c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
