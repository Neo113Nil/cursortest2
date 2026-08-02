package androidx.recyclerview.widget;

import E1.AbstractC0033i;
import K0.j;
import Q.b;
import U.C0077m;
import U.C0078n;
import U.D;
import U.u;
import U.v;
import android.content.Context;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class LinearLayoutManager extends u {

    /* renamed from: h, reason: collision with root package name */
    public final int f2436h;

    /* renamed from: i, reason: collision with root package name */
    public j f2437i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2438j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2439k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2440l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2441m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2442n = true;
    public C0078n o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2436h = 1;
        this.f2439k = false;
        C0077m c0077m = new C0077m(0);
        c0077m.f1439b = -1;
        c0077m.f1440c = Integer.MIN_VALUE;
        c0077m.f1441d = false;
        c0077m.f1442e = false;
        C0077m w3 = u.w(context, attributeSet, i3, i4);
        int i5 = w3.f1439b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(AbstractC0033i.h(i5, "invalid orientation:"));
        }
        a(null);
        if (i5 != this.f2436h || this.f2438j == null) {
            this.f2438j = b.a(this, i5);
            this.f2436h = i5;
            H();
        }
        boolean z = w3.f1441d;
        a(null);
        if (z != this.f2439k) {
            this.f2439k = z;
            H();
        }
        Q(w3.f1442e);
    }

    @Override // U.u
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P2 = P(0, p(), false);
            if (P2 != null) {
                ((v) P2.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P3 = P(p() - 1, -1, false);
            if (P3 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((v) P3.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // U.u
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0078n) {
            this.o = (C0078n) parcelable;
            H();
        }
    }

    @Override // U.u
    public final Parcelable C() {
        C0078n c0078n = this.o;
        if (c0078n != null) {
            C0078n c0078n2 = new C0078n();
            c0078n2.f1443a = c0078n.f1443a;
            c0078n2.f1444b = c0078n.f1444b;
            c0078n2.f1445c = c0078n.f1445c;
            return c0078n2;
        }
        C0078n c0078n3 = new C0078n();
        if (p() <= 0) {
            c0078n3.f1443a = -1;
            return c0078n3;
        }
        M();
        boolean z = this.f2440l;
        c0078n3.f1445c = z;
        if (!z) {
            u.v(o(z ? p() - 1 : 0));
            throw null;
        }
        View o = o(z ? 0 : p() - 1);
        c0078n3.f1444b = this.f2438j.d() - this.f2438j.b(o);
        u.v(o);
        throw null;
    }

    public final int J(D d3) {
        if (p() == 0) {
            return 0;
        }
        M();
        b bVar = this.f2438j;
        boolean z = !this.f2442n;
        return a.i(d3, bVar, O(z), N(z), this, this.f2442n);
    }

    public final void K(D d3) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z = !this.f2442n;
        View O2 = O(z);
        View N2 = N(z);
        if (p() == 0 || d3.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((v) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(D d3) {
        if (p() == 0) {
            return 0;
        }
        M();
        b bVar = this.f2438j;
        boolean z = !this.f2442n;
        return a.j(d3, bVar, O(z), N(z), this, this.f2442n);
    }

    public final void M() {
        if (this.f2437i == null) {
            this.f2437i = new j(24);
        }
    }

    public final View N(boolean z) {
        return this.f2440l ? P(0, p(), z) : P(p() - 1, -1, z);
    }

    public final View O(boolean z) {
        return this.f2440l ? P(p() - 1, -1, z) : P(0, p(), z);
    }

    public final View P(int i3, int i4, boolean z) {
        M();
        int i5 = z ? 24579 : 320;
        return this.f2436h == 0 ? this.f1453c.z(i3, i4, i5, 320) : this.f1454d.z(i3, i4, i5, 320);
    }

    public void Q(boolean z) {
        a(null);
        if (this.f2441m == z) {
            return;
        }
        this.f2441m = z;
        H();
    }

    @Override // U.u
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.o != null || (recyclerView = this.f1452b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // U.u
    public final boolean b() {
        return this.f2436h == 0;
    }

    @Override // U.u
    public final boolean c() {
        return this.f2436h == 1;
    }

    @Override // U.u
    public final int f(D d3) {
        return J(d3);
    }

    @Override // U.u
    public final void g(D d3) {
        K(d3);
    }

    @Override // U.u
    public final int h(D d3) {
        return L(d3);
    }

    @Override // U.u
    public final int i(D d3) {
        return J(d3);
    }

    @Override // U.u
    public final void j(D d3) {
        K(d3);
    }

    @Override // U.u
    public final int k(D d3) {
        return L(d3);
    }

    @Override // U.u
    public v l() {
        return new v(-2, -2);
    }

    @Override // U.u
    public final boolean y() {
        return true;
    }

    @Override // U.u
    public final void z(RecyclerView recyclerView) {
    }
}
