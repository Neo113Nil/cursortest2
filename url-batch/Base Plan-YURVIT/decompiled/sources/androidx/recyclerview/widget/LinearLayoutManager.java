package androidx.recyclerview.widget;

import B0.C0000a;
import L.d;
import N.C0057n;
import N.C0058o;
import N.C0059p;
import N.F;
import N.w;
import N.x;
import a.AbstractC0086a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class LinearLayoutManager extends w {

    /* renamed from: h, reason: collision with root package name */
    public final int f1647h;

    /* renamed from: i, reason: collision with root package name */
    public C0000a f1648i;

    /* renamed from: j, reason: collision with root package name */
    public final C0059p f1649j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1650k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1651l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1652m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1653n = true;

    /* renamed from: o, reason: collision with root package name */
    public C0058o f1654o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1647h = 1;
        this.f1650k = false;
        C0057n c0057n = new C0057n(0);
        c0057n.f759b = -1;
        c0057n.f760c = Integer.MIN_VALUE;
        c0057n.f761d = false;
        c0057n.f762e = false;
        C0057n w2 = w.w(context, attributeSet, i2, i3);
        int i4 = w2.f759b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(d.e("invalid orientation:", i4));
        }
        a(null);
        if (i4 != this.f1647h || this.f1649j == null) {
            this.f1649j = C0059p.a(this, i4);
            this.f1647h = i4;
            H();
        }
        boolean z2 = w2.f761d;
        a(null);
        if (z2 != this.f1650k) {
            this.f1650k = z2;
            H();
        }
        Q(w2.f762e);
    }

    @Override // N.w
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P2 = P(0, p(), false);
            if (P2 != null) {
                ((x) P2.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P3 = P(p() - 1, -1, false);
            if (P3 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((x) P3.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // N.w
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0058o) {
            this.f1654o = (C0058o) parcelable;
            H();
        }
    }

    @Override // N.w
    public final Parcelable C() {
        C0058o c0058o = this.f1654o;
        if (c0058o != null) {
            C0058o c0058o2 = new C0058o();
            c0058o2.f763e = c0058o.f763e;
            c0058o2.f764f = c0058o.f764f;
            c0058o2.f765g = c0058o.f765g;
            return c0058o2;
        }
        C0058o c0058o3 = new C0058o();
        if (p() <= 0) {
            c0058o3.f763e = -1;
            return c0058o3;
        }
        M();
        boolean z2 = this.f1651l;
        c0058o3.f765g = z2;
        if (!z2) {
            w.v(o(z2 ? p() - 1 : 0));
            throw null;
        }
        View o2 = o(z2 ? 0 : p() - 1);
        c0058o3.f764f = this.f1649j.d() - this.f1649j.b(o2);
        w.v(o2);
        throw null;
    }

    public final int J(F f2) {
        if (p() == 0) {
            return 0;
        }
        M();
        boolean z2 = !this.f1653n;
        return AbstractC0086a.i(f2, this.f1649j, O(z2), N(z2), this, this.f1653n);
    }

    public final void K(F f2) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z2 = !this.f1653n;
        View O2 = O(z2);
        View N2 = N(z2);
        if (p() == 0 || f2.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((x) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(F f2) {
        if (p() == 0) {
            return 0;
        }
        M();
        boolean z2 = !this.f1653n;
        return AbstractC0086a.j(f2, this.f1649j, O(z2), N(z2), this, this.f1653n);
    }

    public final void M() {
        if (this.f1648i == null) {
            this.f1648i = new C0000a(11);
        }
    }

    public final View N(boolean z2) {
        return this.f1651l ? P(0, p(), z2) : P(p() - 1, -1, z2);
    }

    public final View O(boolean z2) {
        return this.f1651l ? P(p() - 1, -1, z2) : P(0, p(), z2);
    }

    public final View P(int i2, int i3, boolean z2) {
        M();
        int i4 = z2 ? 24579 : 320;
        return this.f1647h == 0 ? this.f776c.y(i2, i3, i4, 320) : this.f777d.y(i2, i3, i4, 320);
    }

    public void Q(boolean z2) {
        a(null);
        if (this.f1652m == z2) {
            return;
        }
        this.f1652m = z2;
        H();
    }

    @Override // N.w
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f1654o != null || (recyclerView = this.f775b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // N.w
    public final boolean b() {
        return this.f1647h == 0;
    }

    @Override // N.w
    public final boolean c() {
        return this.f1647h == 1;
    }

    @Override // N.w
    public final int f(F f2) {
        return J(f2);
    }

    @Override // N.w
    public final void g(F f2) {
        K(f2);
    }

    @Override // N.w
    public final int h(F f2) {
        return L(f2);
    }

    @Override // N.w
    public final int i(F f2) {
        return J(f2);
    }

    @Override // N.w
    public final void j(F f2) {
        K(f2);
    }

    @Override // N.w
    public final int k(F f2) {
        return L(f2);
    }

    @Override // N.w
    public x l() {
        return new x(-2, -2);
    }

    @Override // N.w
    public final boolean y() {
        return true;
    }

    @Override // N.w
    public final void z(RecyclerView recyclerView) {
    }
}
