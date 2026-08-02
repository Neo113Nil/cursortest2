package androidx.recyclerview.widget;

import A.C0010k;
import A.z;
import B.m;
import B0.C0023a;
import F.b;
import P.B;
import P.C0103m;
import P.C0105o;
import P.E;
import P.J;
import P.L;
import P.M;
import P.v;
import P.w;
import a.AbstractC0132a;
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
public class StaggeredGridLayoutManager extends v {

    /* renamed from: h, reason: collision with root package name */
    public final int f1879h;

    /* renamed from: i, reason: collision with root package name */
    public final M[] f1880i;

    /* renamed from: j, reason: collision with root package name */
    public final C0105o f1881j;

    /* renamed from: k, reason: collision with root package name */
    public final C0105o f1882k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1883l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1884m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1885n = false;

    /* renamed from: o, reason: collision with root package name */
    public final m f1886o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1887p;

    /* renamed from: q, reason: collision with root package name */
    public L f1888q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1889r;

    /* renamed from: s, reason: collision with root package name */
    public final b f1890s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1879h = -1;
        this.f1884m = false;
        m mVar = new m(12);
        this.f1886o = mVar;
        this.f1887p = 2;
        new Rect();
        new C0023a(21, this);
        this.f1889r = true;
        this.f1890s = new b(3, this);
        C0103m w2 = v.w(context, attributeSet, i2, i3);
        int i4 = w2.f933b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i4 != this.f1883l) {
            this.f1883l = i4;
            C0105o c0105o = this.f1881j;
            this.f1881j = this.f1882k;
            this.f1882k = c0105o;
            H();
        }
        int i5 = w2.f934c;
        a(null);
        if (i5 != this.f1879h) {
            mVar.f78f = null;
            H();
            this.f1879h = i5;
            new BitSet(this.f1879h);
            this.f1880i = new M[this.f1879h];
            for (int i6 = 0; i6 < this.f1879h; i6++) {
                this.f1880i[i6] = new M(this, i6);
            }
            H();
        }
        boolean z2 = w2.f935d;
        a(null);
        L l2 = this.f1888q;
        if (l2 != null && l2.f859h != z2) {
            l2.f859h = z2;
        }
        this.f1884m = z2;
        H();
        C0010k c0010k = new C0010k(1);
        c0010k.f48b = 0;
        c0010k.f49c = 0;
        this.f1881j = C0105o.a(this, this.f1883l);
        this.f1882k = C0105o.a(this, 1 - this.f1883l);
    }

    @Override // P.v
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View O2 = O(false);
            View N2 = N(false);
            if (O2 == null || N2 == null) {
                return;
            }
            ((w) O2.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // P.v
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof L) {
            this.f1888q = (L) parcelable;
            H();
        }
    }

    @Override // P.v
    public final Parcelable C() {
        L l2 = this.f1888q;
        if (l2 != null) {
            L l3 = new L();
            l3.f854c = l2.f854c;
            l3.f852a = l2.f852a;
            l3.f853b = l2.f853b;
            l3.f855d = l2.f855d;
            l3.f856e = l2.f856e;
            l3.f857f = l2.f857f;
            l3.f859h = l2.f859h;
            l3.f860i = l2.f860i;
            l3.f861j = l2.f861j;
            l3.f858g = l2.f858g;
            return l3;
        }
        L l4 = new L();
        l4.f859h = this.f1884m;
        l4.f860i = false;
        l4.f861j = false;
        l4.f856e = 0;
        if (p() > 0) {
            P();
            l4.f852a = 0;
            View N2 = this.f1885n ? N(true) : O(true);
            if (N2 != null) {
                ((w) N2.getLayoutParams()).getClass();
                throw null;
            }
            l4.f853b = -1;
            int i2 = this.f1879h;
            l4.f854c = i2;
            l4.f855d = new int[i2];
            for (int i3 = 0; i3 < this.f1879h; i3++) {
                M m2 = this.f1880i[i3];
                int i4 = m2.f863b;
                if (i4 == Integer.MIN_VALUE) {
                    if (m2.f862a.size() == 0) {
                        i4 = Integer.MIN_VALUE;
                    } else {
                        View view = (View) m2.f862a.get(0);
                        J j2 = (J) view.getLayoutParams();
                        m2.f863b = m2.f866e.f1881j.c(view);
                        j2.getClass();
                        i4 = m2.f863b;
                    }
                }
                if (i4 != Integer.MIN_VALUE) {
                    i4 -= this.f1881j.e();
                }
                l4.f855d[i3] = i4;
            }
        } else {
            l4.f852a = -1;
            l4.f853b = -1;
            l4.f854c = 0;
        }
        return l4;
    }

    @Override // P.v
    public final void D(int i2) {
        if (i2 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i2 = this.f1879h;
        boolean z2 = this.f1885n;
        if (p() == 0 || this.f1887p == 0 || !this.f952e) {
            return false;
        }
        if (z2) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int p2 = p();
        int i3 = p2 - 1;
        new BitSet(i2).set(0, i2, true);
        if (this.f1883l == 1) {
            RecyclerView recyclerView = this.f949b;
            Field field = z.f58a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z2) {
            p2 = -1;
        } else {
            i3 = 0;
        }
        if (i3 == p2) {
            return false;
        }
        ((J) o(i3).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(E e2) {
        if (p() == 0) {
            return 0;
        }
        C0105o c0105o = this.f1881j;
        boolean z2 = !this.f1889r;
        return AbstractC0132a.m(e2, c0105o, O(z2), N(z2), this, this.f1889r);
    }

    public final void L(E e2) {
        if (p() == 0) {
            return;
        }
        boolean z2 = !this.f1889r;
        View O2 = O(z2);
        View N2 = N(z2);
        if (p() == 0 || e2.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((w) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(E e2) {
        if (p() == 0) {
            return 0;
        }
        C0105o c0105o = this.f1881j;
        boolean z2 = !this.f1889r;
        return AbstractC0132a.n(e2, c0105o, O(z2), N(z2), this, this.f1889r);
    }

    public final View N(boolean z2) {
        int e2 = this.f1881j.e();
        int d2 = this.f1881j.d();
        View view = null;
        for (int p2 = p() - 1; p2 >= 0; p2--) {
            View o2 = o(p2);
            int c2 = this.f1881j.c(o2);
            int b2 = this.f1881j.b(o2);
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

    public final View O(boolean z2) {
        int e2 = this.f1881j.e();
        int d2 = this.f1881j.d();
        int p2 = p();
        View view = null;
        for (int i2 = 0; i2 < p2; i2++) {
            View o2 = o(i2);
            int c2 = this.f1881j.c(o2);
            if (this.f1881j.b(o2) > e2 && c2 < d2) {
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

    public final void P() {
        if (p() == 0) {
            return;
        }
        v.v(o(0));
        throw null;
    }

    public final void Q() {
        int p2 = p();
        if (p2 == 0) {
            return;
        }
        v.v(o(p2 - 1));
        throw null;
    }

    @Override // P.v
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f1888q != null || (recyclerView = this.f949b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // P.v
    public final boolean b() {
        return this.f1883l == 0;
    }

    @Override // P.v
    public final boolean c() {
        return this.f1883l == 1;
    }

    @Override // P.v
    public final boolean d(w wVar) {
        return wVar instanceof J;
    }

    @Override // P.v
    public final int f(E e2) {
        return K(e2);
    }

    @Override // P.v
    public final void g(E e2) {
        L(e2);
    }

    @Override // P.v
    public final int h(E e2) {
        return M(e2);
    }

    @Override // P.v
    public final int i(E e2) {
        return K(e2);
    }

    @Override // P.v
    public final void j(E e2) {
        L(e2);
    }

    @Override // P.v
    public final int k(E e2) {
        return M(e2);
    }

    @Override // P.v
    public final w l() {
        return this.f1883l == 0 ? new J(-2, -1) : new J(-1, -2);
    }

    @Override // P.v
    public final w m(Context context, AttributeSet attributeSet) {
        return new J(context, attributeSet);
    }

    @Override // P.v
    public final w n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new J((ViewGroup.MarginLayoutParams) layoutParams) : new J(layoutParams);
    }

    @Override // P.v
    public final int q(B b2, E e2) {
        if (this.f1883l == 1) {
            return this.f1879h;
        }
        super.q(b2, e2);
        return 1;
    }

    @Override // P.v
    public final int x(B b2, E e2) {
        if (this.f1883l == 0) {
            return this.f1879h;
        }
        super.x(b2, e2);
        return 1;
    }

    @Override // P.v
    public final boolean y() {
        return this.f1887p != 0;
    }

    @Override // P.v
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f949b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1890s);
        }
        for (int i2 = 0; i2 < this.f1879h; i2++) {
            M m2 = this.f1880i[i2];
            m2.f862a.clear();
            m2.f863b = Integer.MIN_VALUE;
            m2.f864c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
