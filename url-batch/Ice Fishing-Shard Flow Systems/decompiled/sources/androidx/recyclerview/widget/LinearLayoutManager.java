package androidx.recyclerview.widget;

import C4.p;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import c2.e;
import g0.AbstractC0440t;
import g0.C0409B;
import g0.C0433m;
import g0.C0434n;
import g0.C0435o;
import g0.C0441u;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0440t {

    /* renamed from: h, reason: collision with root package name */
    public final int f3945h;

    /* renamed from: i, reason: collision with root package name */
    public e f3946i;
    public final C0435o j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3947k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3948l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3949m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3950n = true;

    /* renamed from: o, reason: collision with root package name */
    public C0434n f3951o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i5) {
        this.f3945h = 1;
        this.f3947k = false;
        C0433m c0433m = new C0433m(0);
        c0433m.f4949b = -1;
        c0433m.f4950c = Integer.MIN_VALUE;
        c0433m.f4951d = false;
        c0433m.f4952e = false;
        C0433m w4 = AbstractC0440t.w(context, attributeSet, i2, i5);
        int i7 = w4.f4949b;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(p.g(i7, "invalid orientation:"));
        }
        a(null);
        if (i7 != this.f3945h || this.j == null) {
            this.j = C0435o.a(this, i7);
            this.f3945h = i7;
            H();
        }
        boolean z7 = w4.f4951d;
        a(null);
        if (z7 != this.f3947k) {
            this.f3947k = z7;
            H();
        }
        Q(w4.f4952e);
    }

    @Override // g0.AbstractC0440t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P7 = P(0, p(), false);
            if (P7 != null) {
                ((C0441u) P7.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P8 = P(p() - 1, -1, false);
            if (P8 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((C0441u) P8.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // g0.AbstractC0440t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0434n) {
            this.f3951o = (C0434n) parcelable;
            H();
        }
    }

    @Override // g0.AbstractC0440t
    public final Parcelable C() {
        C0434n c0434n = this.f3951o;
        if (c0434n != null) {
            C0434n c0434n2 = new C0434n();
            c0434n2.f4953d = c0434n.f4953d;
            c0434n2.f4954e = c0434n.f4954e;
            c0434n2.f4955i = c0434n.f4955i;
            return c0434n2;
        }
        C0434n c0434n3 = new C0434n();
        if (p() <= 0) {
            c0434n3.f4953d = -1;
            return c0434n3;
        }
        M();
        boolean z7 = this.f3948l;
        c0434n3.f4955i = z7;
        if (!z7) {
            AbstractC0440t.v(o(z7 ? p() - 1 : 0));
            throw null;
        }
        View o7 = o(z7 ? 0 : p() - 1);
        c0434n3.f4954e = this.j.d() - this.j.b(o7);
        AbstractC0440t.v(o7);
        throw null;
    }

    public final int J(C0409B c0409b) {
        if (p() == 0) {
            return 0;
        }
        M();
        boolean z7 = !this.f3950n;
        return AbstractC1053a.k(c0409b, this.j, O(z7), N(z7), this, this.f3950n);
    }

    public final void K(C0409B c0409b) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z7 = !this.f3950n;
        View O7 = O(z7);
        View N7 = N(z7);
        if (p() == 0 || c0409b.a() == 0 || O7 == null || N7 == null) {
            return;
        }
        ((C0441u) O7.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(C0409B c0409b) {
        if (p() == 0) {
            return 0;
        }
        M();
        boolean z7 = !this.f3950n;
        return AbstractC1053a.l(c0409b, this.j, O(z7), N(z7), this, this.f3950n);
    }

    public final void M() {
        if (this.f3946i == null) {
            this.f3946i = new e();
        }
    }

    public final View N(boolean z7) {
        return this.f3948l ? P(0, p(), z7) : P(p() - 1, -1, z7);
    }

    public final View O(boolean z7) {
        return this.f3948l ? P(p() - 1, -1, z7) : P(0, p(), z7);
    }

    public final View P(int i2, int i5, boolean z7) {
        M();
        int i7 = z7 ? 24579 : 320;
        return this.f3945h == 0 ? this.f4964c.t(i2, i5, i7, 320) : this.f4965d.t(i2, i5, i7, 320);
    }

    public void Q(boolean z7) {
        a(null);
        if (this.f3949m == z7) {
            return;
        }
        this.f3949m = z7;
        H();
    }

    @Override // g0.AbstractC0440t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f3951o != null || (recyclerView = this.f4963b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // g0.AbstractC0440t
    public final boolean b() {
        return this.f3945h == 0;
    }

    @Override // g0.AbstractC0440t
    public final boolean c() {
        return this.f3945h == 1;
    }

    @Override // g0.AbstractC0440t
    public final int f(C0409B c0409b) {
        return J(c0409b);
    }

    @Override // g0.AbstractC0440t
    public final void g(C0409B c0409b) {
        K(c0409b);
    }

    @Override // g0.AbstractC0440t
    public final int h(C0409B c0409b) {
        return L(c0409b);
    }

    @Override // g0.AbstractC0440t
    public final int i(C0409B c0409b) {
        return J(c0409b);
    }

    @Override // g0.AbstractC0440t
    public final void j(C0409B c0409b) {
        K(c0409b);
    }

    @Override // g0.AbstractC0440t
    public final int k(C0409B c0409b) {
        return L(c0409b);
    }

    @Override // g0.AbstractC0440t
    public C0441u l() {
        return new C0441u(-2, -2);
    }

    @Override // g0.AbstractC0440t
    public final boolean y() {
        return true;
    }

    @Override // g0.AbstractC0440t
    public final void z(RecyclerView recyclerView) {
    }
}
