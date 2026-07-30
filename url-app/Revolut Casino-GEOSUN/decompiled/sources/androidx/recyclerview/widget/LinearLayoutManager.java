package androidx.recyclerview.widget;

import E.a;
import F0.h;
import L.C0039o;
import L.C0040p;
import L.C0041q;
import L.G;
import L.x;
import L.y;
import a.AbstractC0069a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class LinearLayoutManager extends x {

    /* renamed from: h, reason: collision with root package name */
    public final int f1557h;

    /* renamed from: i, reason: collision with root package name */
    public a f1558i;

    /* renamed from: j, reason: collision with root package name */
    public final C0041q f1559j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1560k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1561l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1562m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1563n = true;

    /* renamed from: o, reason: collision with root package name */
    public C0040p f1564o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1557h = 1;
        this.f1560k = false;
        C0039o c0039o = new C0039o(0);
        c0039o.f581b = -1;
        c0039o.f582c = Integer.MIN_VALUE;
        c0039o.f583d = false;
        c0039o.f584e = false;
        C0039o w2 = x.w(context, attributeSet, i2, i3);
        int i4 = w2.f581b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(h.e("invalid orientation:", i4));
        }
        a(null);
        if (i4 != this.f1557h || this.f1559j == null) {
            this.f1559j = C0041q.a(this, i4);
            this.f1557h = i4;
            H();
        }
        boolean z2 = w2.f583d;
        a(null);
        if (z2 != this.f1560k) {
            this.f1560k = z2;
            H();
        }
        Q(w2.f584e);
    }

    @Override // L.x
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P2 = P(0, p(), false);
            if (P2 != null) {
                ((y) P2.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P3 = P(p() - 1, -1, false);
            if (P3 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((y) P3.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // L.x
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0040p) {
            this.f1564o = (C0040p) parcelable;
            H();
        }
    }

    @Override // L.x
    public final Parcelable C() {
        C0040p c0040p = this.f1564o;
        if (c0040p != null) {
            C0040p c0040p2 = new C0040p();
            c0040p2.f585a = c0040p.f585a;
            c0040p2.f586b = c0040p.f586b;
            c0040p2.f587c = c0040p.f587c;
            return c0040p2;
        }
        C0040p c0040p3 = new C0040p();
        if (p() <= 0) {
            c0040p3.f585a = -1;
            return c0040p3;
        }
        M();
        boolean z2 = this.f1561l;
        c0040p3.f587c = z2;
        if (!z2) {
            x.v(o(z2 ? p() - 1 : 0));
            throw null;
        }
        View o2 = o(z2 ? 0 : p() - 1);
        c0040p3.f586b = this.f1559j.d() - this.f1559j.b(o2);
        x.v(o2);
        throw null;
    }

    public final int J(G g2) {
        if (p() == 0) {
            return 0;
        }
        M();
        C0041q c0041q = this.f1559j;
        boolean z2 = !this.f1563n;
        return AbstractC0069a.g(g2, c0041q, O(z2), N(z2), this, this.f1563n);
    }

    public final void K(G g2) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z2 = !this.f1563n;
        View O2 = O(z2);
        View N2 = N(z2);
        if (p() == 0 || g2.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((y) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(G g2) {
        if (p() == 0) {
            return 0;
        }
        M();
        C0041q c0041q = this.f1559j;
        boolean z2 = !this.f1563n;
        return AbstractC0069a.h(g2, c0041q, O(z2), N(z2), this, this.f1563n);
    }

    public final void M() {
        if (this.f1558i == null) {
            this.f1558i = new a(7);
        }
    }

    public final View N(boolean z2) {
        return this.f1561l ? P(0, p(), z2) : P(p() - 1, -1, z2);
    }

    public final View O(boolean z2) {
        return this.f1561l ? P(p() - 1, -1, z2) : P(0, p(), z2);
    }

    public final View P(int i2, int i3, boolean z2) {
        M();
        int i4 = z2 ? 24579 : 320;
        return this.f1557h == 0 ? this.f598c.q(i2, i3, i4, 320) : this.f599d.q(i2, i3, i4, 320);
    }

    public void Q(boolean z2) {
        a(null);
        if (this.f1562m == z2) {
            return;
        }
        this.f1562m = z2;
        H();
    }

    @Override // L.x
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f1564o != null || (recyclerView = this.f597b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // L.x
    public final boolean b() {
        return this.f1557h == 0;
    }

    @Override // L.x
    public final boolean c() {
        return this.f1557h == 1;
    }

    @Override // L.x
    public final int f(G g2) {
        return J(g2);
    }

    @Override // L.x
    public final void g(G g2) {
        K(g2);
    }

    @Override // L.x
    public final int h(G g2) {
        return L(g2);
    }

    @Override // L.x
    public final int i(G g2) {
        return J(g2);
    }

    @Override // L.x
    public final void j(G g2) {
        K(g2);
    }

    @Override // L.x
    public final int k(G g2) {
        return L(g2);
    }

    @Override // L.x
    public y l() {
        return new y(-2, -2);
    }

    @Override // L.x
    public final boolean y() {
        return true;
    }

    @Override // L.x
    public final void z(RecyclerView recyclerView) {
    }
}
