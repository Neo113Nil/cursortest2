package androidx.recyclerview.widget;

import B0.C0023a;
import P.C0103m;
import P.C0104n;
import P.C0105o;
import P.E;
import P.v;
import P.w;
import a.AbstractC0132a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class LinearLayoutManager extends v {

    /* renamed from: h, reason: collision with root package name */
    public final int f1813h;

    /* renamed from: i, reason: collision with root package name */
    public C0023a f1814i;

    /* renamed from: j, reason: collision with root package name */
    public final C0105o f1815j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1816k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1817l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1818m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1819n = true;

    /* renamed from: o, reason: collision with root package name */
    public C0104n f1820o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1813h = 1;
        this.f1816k = false;
        C0103m c0103m = new C0103m(0);
        c0103m.f933b = -1;
        c0103m.f934c = Integer.MIN_VALUE;
        c0103m.f935d = false;
        c0103m.f936e = false;
        C0103m w2 = v.w(context, attributeSet, i2, i3);
        int i4 = w2.f933b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i4);
        }
        a(null);
        if (i4 != this.f1813h || this.f1815j == null) {
            this.f1815j = C0105o.a(this, i4);
            this.f1813h = i4;
            H();
        }
        boolean z2 = w2.f935d;
        a(null);
        if (z2 != this.f1816k) {
            this.f1816k = z2;
            H();
        }
        Q(w2.f936e);
    }

    @Override // P.v
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P2 = P(0, p(), false);
            if (P2 != null) {
                ((w) P2.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P3 = P(p() - 1, -1, false);
            if (P3 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((w) P3.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // P.v
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0104n) {
            this.f1820o = (C0104n) parcelable;
            H();
        }
    }

    @Override // P.v
    public final Parcelable C() {
        C0104n c0104n = this.f1820o;
        if (c0104n != null) {
            C0104n c0104n2 = new C0104n();
            c0104n2.f937a = c0104n.f937a;
            c0104n2.f938b = c0104n.f938b;
            c0104n2.f939c = c0104n.f939c;
            return c0104n2;
        }
        C0104n c0104n3 = new C0104n();
        if (p() <= 0) {
            c0104n3.f937a = -1;
            return c0104n3;
        }
        M();
        boolean z2 = this.f1817l;
        c0104n3.f939c = z2;
        if (!z2) {
            v.v(o(z2 ? p() - 1 : 0));
            throw null;
        }
        View o2 = o(z2 ? 0 : p() - 1);
        c0104n3.f938b = this.f1815j.d() - this.f1815j.b(o2);
        v.v(o2);
        throw null;
    }

    public final int J(E e2) {
        if (p() == 0) {
            return 0;
        }
        M();
        C0105o c0105o = this.f1815j;
        boolean z2 = !this.f1819n;
        return AbstractC0132a.m(e2, c0105o, O(z2), N(z2), this, this.f1819n);
    }

    public final void K(E e2) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z2 = !this.f1819n;
        View O2 = O(z2);
        View N2 = N(z2);
        if (p() == 0 || e2.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((w) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(E e2) {
        if (p() == 0) {
            return 0;
        }
        M();
        C0105o c0105o = this.f1815j;
        boolean z2 = !this.f1819n;
        return AbstractC0132a.n(e2, c0105o, O(z2), N(z2), this, this.f1819n);
    }

    public final void M() {
        if (this.f1814i == null) {
            this.f1814i = new C0023a(17);
        }
    }

    public final View N(boolean z2) {
        return this.f1817l ? P(0, p(), z2) : P(p() - 1, -1, z2);
    }

    public final View O(boolean z2) {
        return this.f1817l ? P(p() - 1, -1, z2) : P(0, p(), z2);
    }

    public final View P(int i2, int i3, boolean z2) {
        M();
        int i4 = z2 ? 24579 : 320;
        return this.f1813h == 0 ? this.f950c.m(i2, i3, i4, 320) : this.f951d.m(i2, i3, i4, 320);
    }

    public void Q(boolean z2) {
        a(null);
        if (this.f1818m == z2) {
            return;
        }
        this.f1818m = z2;
        H();
    }

    @Override // P.v
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f1820o != null || (recyclerView = this.f949b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // P.v
    public final boolean b() {
        return this.f1813h == 0;
    }

    @Override // P.v
    public final boolean c() {
        return this.f1813h == 1;
    }

    @Override // P.v
    public final int f(E e2) {
        return J(e2);
    }

    @Override // P.v
    public final void g(E e2) {
        K(e2);
    }

    @Override // P.v
    public final int h(E e2) {
        return L(e2);
    }

    @Override // P.v
    public final int i(E e2) {
        return J(e2);
    }

    @Override // P.v
    public final void j(E e2) {
        K(e2);
    }

    @Override // P.v
    public final int k(E e2) {
        return L(e2);
    }

    @Override // P.v
    public w l() {
        return new w(-2, -2);
    }

    @Override // P.v
    public final boolean y() {
        return true;
    }

    @Override // P.v
    public final void z(RecyclerView recyclerView) {
    }
}
