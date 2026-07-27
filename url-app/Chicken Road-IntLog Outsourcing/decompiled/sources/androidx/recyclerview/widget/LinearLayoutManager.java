package androidx.recyclerview.widget;

import W.B;
import W.C0168m;
import W.n;
import W.o;
import W.t;
import W.u;
import W1.e;
import a.AbstractC0169a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import b2.AbstractC0279e;

/* loaded from: classes.dex */
public class LinearLayoutManager extends t {

    /* renamed from: h, reason: collision with root package name */
    public final int f4619h;

    /* renamed from: i, reason: collision with root package name */
    public e f4620i;

    /* renamed from: j, reason: collision with root package name */
    public final o f4621j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4622k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4623l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4624m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4625n = true;

    /* renamed from: o, reason: collision with root package name */
    public n f4626o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f4619h = 1;
        this.f4622k = false;
        C0168m c0168m = new C0168m(0);
        c0168m.f3354b = -1;
        c0168m.f3355c = Integer.MIN_VALUE;
        c0168m.f3356d = false;
        c0168m.f3357e = false;
        C0168m w3 = t.w(context, attributeSet, i2, i3);
        int i6 = w3.f3354b;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(AbstractC0279e.d(i6, "invalid orientation:"));
        }
        a(null);
        if (i6 != this.f4619h || this.f4621j == null) {
            this.f4621j = o.a(this, i6);
            this.f4619h = i6;
            H();
        }
        boolean z = w3.f3356d;
        a(null);
        if (z != this.f4622k) {
            this.f4622k = z;
            H();
        }
        Q(w3.f3357e);
    }

    @Override // W.t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P5 = P(0, p(), false);
            if (P5 != null) {
                ((u) P5.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P6 = P(p() - 1, -1, false);
            if (P6 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((u) P6.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // W.t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof n) {
            this.f4626o = (n) parcelable;
            H();
        }
    }

    @Override // W.t
    public final Parcelable C() {
        n nVar = this.f4626o;
        if (nVar != null) {
            n nVar2 = new n();
            nVar2.f3358a = nVar.f3358a;
            nVar2.f3359b = nVar.f3359b;
            nVar2.f3360c = nVar.f3360c;
            return nVar2;
        }
        n nVar3 = new n();
        if (p() <= 0) {
            nVar3.f3358a = -1;
            return nVar3;
        }
        M();
        boolean z = this.f4623l;
        nVar3.f3360c = z;
        if (!z) {
            t.v(o(z ? p() - 1 : 0));
            throw null;
        }
        View o2 = o(z ? 0 : p() - 1);
        nVar3.f3359b = this.f4621j.d() - this.f4621j.b(o2);
        t.v(o2);
        throw null;
    }

    public final int J(B b6) {
        if (p() == 0) {
            return 0;
        }
        M();
        o oVar = this.f4621j;
        boolean z = !this.f4625n;
        return AbstractC0169a.d(b6, oVar, O(z), N(z), this, this.f4625n);
    }

    public final void K(B b6) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z = !this.f4625n;
        View O5 = O(z);
        View N = N(z);
        if (p() == 0 || b6.a() == 0 || O5 == null || N == null) {
            return;
        }
        ((u) O5.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(B b6) {
        if (p() == 0) {
            return 0;
        }
        M();
        o oVar = this.f4621j;
        boolean z = !this.f4625n;
        return AbstractC0169a.e(b6, oVar, O(z), N(z), this, this.f4625n);
    }

    public final void M() {
        if (this.f4620i == null) {
            this.f4620i = new e();
        }
    }

    public final View N(boolean z) {
        return this.f4623l ? P(0, p(), z) : P(p() - 1, -1, z);
    }

    public final View O(boolean z) {
        return this.f4623l ? P(p() - 1, -1, z) : P(0, p(), z);
    }

    public final View P(int i2, int i3, boolean z) {
        M();
        int i6 = z ? 24579 : 320;
        return this.f4619h == 0 ? this.f3369c.e(i2, i3, i6, 320) : this.f3370d.e(i2, i3, i6, 320);
    }

    public void Q(boolean z) {
        a(null);
        if (this.f4624m == z) {
            return;
        }
        this.f4624m = z;
        H();
    }

    @Override // W.t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f4626o != null || (recyclerView = this.f3368b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // W.t
    public final boolean b() {
        return this.f4619h == 0;
    }

    @Override // W.t
    public final boolean c() {
        return this.f4619h == 1;
    }

    @Override // W.t
    public final int f(B b6) {
        return J(b6);
    }

    @Override // W.t
    public final void g(B b6) {
        K(b6);
    }

    @Override // W.t
    public final int h(B b6) {
        return L(b6);
    }

    @Override // W.t
    public final int i(B b6) {
        return J(b6);
    }

    @Override // W.t
    public final void j(B b6) {
        K(b6);
    }

    @Override // W.t
    public final int k(B b6) {
        return L(b6);
    }

    @Override // W.t
    public u l() {
        return new u(-2, -2);
    }

    @Override // W.t
    public final boolean y() {
        return true;
    }

    @Override // W.t
    public final void z(RecyclerView recyclerView) {
    }
}
