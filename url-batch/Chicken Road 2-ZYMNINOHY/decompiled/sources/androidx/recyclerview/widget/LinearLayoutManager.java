package androidx.recyclerview.widget;

import E.AbstractC0005f;
import E0.e;
import a0.C0144j;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import i2.AbstractC0457a;
import l1.C1245B;
import l1.C1264k;
import l1.C1265l;
import l1.t;
import l1.u;

/* loaded from: classes.dex */
public class LinearLayoutManager extends t {

    /* renamed from: h, reason: collision with root package name */
    public final int f5127h;

    /* renamed from: i, reason: collision with root package name */
    public C0144j f5128i;

    /* renamed from: j, reason: collision with root package name */
    public final e f5129j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5130k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5131l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5132m = false;
    public final boolean n = true;
    public C1265l o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f5127h = 1;
        this.f5130k = false;
        C1264k c1264k = new C1264k(0);
        c1264k.f14241b = -1;
        c1264k.f14242c = Integer.MIN_VALUE;
        c1264k.f14243d = false;
        c1264k.f14244e = false;
        C1264k w4 = t.w(context, attributeSet, i4, i5);
        int i6 = w4.f14241b;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(AbstractC0005f.j(i6, "invalid orientation:"));
        }
        a(null);
        if (i6 != this.f5127h || this.f5129j == null) {
            this.f5129j = e.a(this, i6);
            this.f5127h = i6;
            H();
        }
        boolean z = w4.f14243d;
        a(null);
        if (z != this.f5130k) {
            this.f5130k = z;
            H();
        }
        Q(w4.f14244e);
    }

    @Override // l1.t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P4 = P(0, false, p());
            if (P4 != null) {
                ((u) P4.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P5 = P(p() - 1, false, -1);
            if (P5 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((u) P5.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // l1.t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C1265l) {
            this.o = (C1265l) parcelable;
            H();
        }
    }

    @Override // l1.t
    public final Parcelable C() {
        C1265l c1265l = this.o;
        if (c1265l != null) {
            C1265l c1265l2 = new C1265l();
            c1265l2.f14245a = c1265l.f14245a;
            c1265l2.f14246b = c1265l.f14246b;
            c1265l2.f14247c = c1265l.f14247c;
            return c1265l2;
        }
        C1265l c1265l3 = new C1265l();
        if (p() <= 0) {
            c1265l3.f14245a = -1;
            return c1265l3;
        }
        M();
        boolean z = this.f5131l;
        c1265l3.f14247c = z;
        if (!z) {
            t.v(o(z ? p() - 1 : 0));
            throw null;
        }
        View o = o(z ? 0 : p() - 1);
        c1265l3.f14246b = this.f5129j.d() - this.f5129j.b(o);
        t.v(o);
        throw null;
    }

    public final int J(C1245B c1245b) {
        if (p() == 0) {
            return 0;
        }
        M();
        boolean z = !this.n;
        return AbstractC0457a.h(c1245b, this.f5129j, O(z), N(z), this, this.n);
    }

    public final void K(C1245B c1245b) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z = !this.n;
        View O4 = O(z);
        View N4 = N(z);
        if (p() == 0 || c1245b.a() == 0 || O4 == null || N4 == null) {
            return;
        }
        ((u) O4.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(C1245B c1245b) {
        if (p() == 0) {
            return 0;
        }
        M();
        boolean z = !this.n;
        return AbstractC0457a.i(c1245b, this.f5129j, O(z), N(z), this, this.n);
    }

    public final void M() {
        if (this.f5128i == null) {
            this.f5128i = new C0144j(16, false);
        }
    }

    public final View N(boolean z) {
        return this.f5131l ? P(0, z, p()) : P(p() - 1, z, -1);
    }

    public final View O(boolean z) {
        return this.f5131l ? P(p() - 1, z, -1) : P(0, z, p());
    }

    public final View P(int i4, boolean z, int i5) {
        M();
        int i6 = z ? 24579 : 320;
        return this.f5127h == 0 ? this.f14257c.E(i4, i5, i6, 320) : this.f14258d.E(i4, i5, i6, 320);
    }

    public void Q(boolean z) {
        a(null);
        if (this.f5132m == z) {
            return;
        }
        this.f5132m = z;
        H();
    }

    @Override // l1.t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.o != null || (recyclerView = this.f14256b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // l1.t
    public final boolean b() {
        return this.f5127h == 0;
    }

    @Override // l1.t
    public final boolean c() {
        return this.f5127h == 1;
    }

    @Override // l1.t
    public final int f(C1245B c1245b) {
        return J(c1245b);
    }

    @Override // l1.t
    public final void g(C1245B c1245b) {
        K(c1245b);
    }

    @Override // l1.t
    public final int h(C1245B c1245b) {
        return L(c1245b);
    }

    @Override // l1.t
    public final int i(C1245B c1245b) {
        return J(c1245b);
    }

    @Override // l1.t
    public final void j(C1245B c1245b) {
        K(c1245b);
    }

    @Override // l1.t
    public final int k(C1245B c1245b) {
        return L(c1245b);
    }

    @Override // l1.t
    public u l() {
        return new u(-2, -2);
    }

    @Override // l1.t
    public final boolean y() {
        return true;
    }

    @Override // l1.t
    public final void z(RecyclerView recyclerView) {
    }
}
