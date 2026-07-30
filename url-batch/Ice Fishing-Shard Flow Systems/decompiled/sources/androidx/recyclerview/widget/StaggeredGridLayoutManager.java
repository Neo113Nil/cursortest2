package androidx.recyclerview.widget;

import C4.d;
import D6.n;
import F.b;
import I.T;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import c2.e;
import g0.AbstractC0440t;
import g0.C0409B;
import g0.C0414G;
import g0.C0416I;
import g0.C0417J;
import g0.C0433m;
import g0.C0435o;
import g0.C0441u;
import java.util.BitSet;
import java.util.WeakHashMap;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0440t {

    /* renamed from: h, reason: collision with root package name */
    public final int f4010h;

    /* renamed from: i, reason: collision with root package name */
    public final C0417J[] f4011i;
    public final C0435o j;

    /* renamed from: k, reason: collision with root package name */
    public final C0435o f4012k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4013l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4014m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4015n = false;

    /* renamed from: o, reason: collision with root package name */
    public final d f4016o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4017p;

    /* renamed from: q, reason: collision with root package name */
    public C0416I f4018q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4019r;

    /* renamed from: s, reason: collision with root package name */
    public final b f4020s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i5) {
        this.f4010h = -1;
        this.f4014m = false;
        d dVar = new d();
        this.f4016o = dVar;
        this.f4017p = 2;
        new Rect();
        new e(this);
        this.f4019r = true;
        this.f4020s = new b(14, this);
        C0433m w4 = AbstractC0440t.w(context, attributeSet, i2, i5);
        int i7 = w4.f4949b;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i7 != this.f4013l) {
            this.f4013l = i7;
            C0435o c0435o = this.j;
            this.j = this.f4012k;
            this.f4012k = c0435o;
            H();
        }
        int i8 = w4.f4950c;
        a(null);
        if (i8 != this.f4010h) {
            dVar.f300a = null;
            H();
            this.f4010h = i8;
            new BitSet(this.f4010h);
            this.f4011i = new C0417J[this.f4010h];
            for (int i9 = 0; i9 < this.f4010h; i9++) {
                this.f4011i[i9] = new C0417J(this, i9);
            }
            H();
        }
        boolean z7 = w4.f4951d;
        a(null);
        C0416I c0416i = this.f4018q;
        if (c0416i != null && c0416i.f4880p != z7) {
            c0416i.f4880p = z7;
        }
        this.f4014m = z7;
        H();
        this.j = C0435o.a(this, this.f4013l);
        this.f4012k = C0435o.a(this, 1 - this.f4013l);
    }

    @Override // g0.AbstractC0440t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View M7 = M(false);
            View L7 = L(false);
            if (M7 == null || L7 == null) {
                return;
            }
            ((C0441u) M7.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // g0.AbstractC0440t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0416I) {
            this.f4018q = (C0416I) parcelable;
            H();
        }
    }

    @Override // g0.AbstractC0440t
    public final Parcelable C() {
        C0416I c0416i = this.f4018q;
        if (c0416i != null) {
            C0416I c0416i2 = new C0416I();
            c0416i2.f4875i = c0416i.f4875i;
            c0416i2.f4873d = c0416i.f4873d;
            c0416i2.f4874e = c0416i.f4874e;
            c0416i2.f4876l = c0416i.f4876l;
            c0416i2.f4877m = c0416i.f4877m;
            c0416i2.f4878n = c0416i.f4878n;
            c0416i2.f4880p = c0416i.f4880p;
            c0416i2.f4881q = c0416i.f4881q;
            c0416i2.f4882r = c0416i.f4882r;
            c0416i2.f4879o = c0416i.f4879o;
            return c0416i2;
        }
        C0416I c0416i3 = new C0416I();
        c0416i3.f4880p = this.f4014m;
        c0416i3.f4881q = false;
        c0416i3.f4882r = false;
        c0416i3.f4877m = 0;
        if (p() <= 0) {
            c0416i3.f4873d = -1;
            c0416i3.f4874e = -1;
            c0416i3.f4875i = 0;
            return c0416i3;
        }
        N();
        c0416i3.f4873d = 0;
        View L7 = this.f4015n ? L(true) : M(true);
        if (L7 != null) {
            ((C0441u) L7.getLayoutParams()).getClass();
            throw null;
        }
        c0416i3.f4874e = -1;
        int i2 = this.f4010h;
        c0416i3.f4875i = i2;
        c0416i3.f4876l = new int[i2];
        for (int i5 = 0; i5 < this.f4010h; i5++) {
            C0417J c0417j = this.f4011i[i5];
            int i7 = c0417j.f4884b;
            if (i7 == Integer.MIN_VALUE) {
                if (c0417j.f4883a.size() == 0) {
                    i7 = Integer.MIN_VALUE;
                } else {
                    View view = (View) c0417j.f4883a.get(0);
                    C0414G c0414g = (C0414G) view.getLayoutParams();
                    c0417j.f4884b = c0417j.f4887e.j.c(view);
                    c0414g.getClass();
                    i7 = c0417j.f4884b;
                }
            }
            if (i7 != Integer.MIN_VALUE) {
                i7 -= this.j.e();
            }
            c0416i3.f4876l[i5] = i7;
        }
        return c0416i3;
    }

    @Override // g0.AbstractC0440t
    public final void D(int i2) {
        if (i2 == 0) {
            J();
        }
    }

    public final boolean J() {
        if (p() == 0 || this.f4017p == 0 || !this.f4966e) {
            return false;
        }
        boolean z7 = this.f4015n;
        if (z7) {
            O();
            N();
        } else {
            N();
            O();
        }
        int p7 = p();
        int i2 = p7 - 1;
        int i5 = this.f4010h;
        new BitSet(i5).set(0, i5, true);
        if (this.f4013l == 1) {
            RecyclerView recyclerView = this.f4963b;
            WeakHashMap weakHashMap = T.f1153a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z7) {
            p7 = -1;
        } else {
            i2 = 0;
        }
        if (i2 == p7) {
            return false;
        }
        ((C0414G) o(i2).getLayoutParams()).getClass();
        throw null;
    }

    public final void K(C0409B c0409b) {
        if (p() == 0) {
            return;
        }
        boolean z7 = !this.f4019r;
        View M7 = M(z7);
        View L7 = L(z7);
        if (p() == 0 || c0409b.a() == 0 || M7 == null || L7 == null) {
            return;
        }
        ((C0441u) M7.getLayoutParams()).getClass();
        throw null;
    }

    public final View L(boolean z7) {
        int e7 = this.j.e();
        int d7 = this.j.d();
        View view = null;
        for (int p7 = p() - 1; p7 >= 0; p7--) {
            View o7 = o(p7);
            int c7 = this.j.c(o7);
            int b7 = this.j.b(o7);
            if (b7 > e7 && c7 < d7) {
                if (b7 <= d7 || !z7) {
                    return o7;
                }
                if (view == null) {
                    view = o7;
                }
            }
        }
        return view;
    }

    public final View M(boolean z7) {
        int e7 = this.j.e();
        int d7 = this.j.d();
        int p7 = p();
        View view = null;
        for (int i2 = 0; i2 < p7; i2++) {
            View o7 = o(i2);
            int c7 = this.j.c(o7);
            if (this.j.b(o7) > e7 && c7 < d7) {
                if (c7 >= e7 || !z7) {
                    return o7;
                }
                if (view == null) {
                    view = o7;
                }
            }
        }
        return view;
    }

    public final void N() {
        if (p() == 0) {
            return;
        }
        AbstractC0440t.v(o(0));
        throw null;
    }

    public final void O() {
        int p7 = p();
        if (p7 == 0) {
            return;
        }
        AbstractC0440t.v(o(p7 - 1));
        throw null;
    }

    @Override // g0.AbstractC0440t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f4018q != null || (recyclerView = this.f4963b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // g0.AbstractC0440t
    public final boolean b() {
        return this.f4013l == 0;
    }

    @Override // g0.AbstractC0440t
    public final boolean c() {
        return this.f4013l == 1;
    }

    @Override // g0.AbstractC0440t
    public final boolean d(C0441u c0441u) {
        return c0441u instanceof C0414G;
    }

    @Override // g0.AbstractC0440t
    public final int f(C0409B c0409b) {
        if (p() == 0) {
            return 0;
        }
        boolean z7 = !this.f4019r;
        return AbstractC1053a.k(c0409b, this.j, M(z7), L(z7), this, this.f4019r);
    }

    @Override // g0.AbstractC0440t
    public final void g(C0409B c0409b) {
        K(c0409b);
    }

    @Override // g0.AbstractC0440t
    public final int h(C0409B c0409b) {
        if (p() == 0) {
            return 0;
        }
        boolean z7 = !this.f4019r;
        return AbstractC1053a.l(c0409b, this.j, M(z7), L(z7), this, this.f4019r);
    }

    @Override // g0.AbstractC0440t
    public final int i(C0409B c0409b) {
        if (p() == 0) {
            return 0;
        }
        boolean z7 = !this.f4019r;
        return AbstractC1053a.k(c0409b, this.j, M(z7), L(z7), this, this.f4019r);
    }

    @Override // g0.AbstractC0440t
    public final void j(C0409B c0409b) {
        K(c0409b);
    }

    @Override // g0.AbstractC0440t
    public final int k(C0409B c0409b) {
        if (p() == 0) {
            return 0;
        }
        boolean z7 = !this.f4019r;
        return AbstractC1053a.l(c0409b, this.j, M(z7), L(z7), this, this.f4019r);
    }

    @Override // g0.AbstractC0440t
    public final C0441u l() {
        return this.f4013l == 0 ? new C0414G(-2, -1) : new C0414G(-1, -2);
    }

    @Override // g0.AbstractC0440t
    public final C0441u m(Context context, AttributeSet attributeSet) {
        return new C0414G(context, attributeSet);
    }

    @Override // g0.AbstractC0440t
    public final C0441u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0414G((ViewGroup.MarginLayoutParams) layoutParams) : new C0414G(layoutParams);
    }

    @Override // g0.AbstractC0440t
    public final int q(n nVar, C0409B c0409b) {
        if (this.f4013l == 1) {
            return this.f4010h;
        }
        super.q(nVar, c0409b);
        return 1;
    }

    @Override // g0.AbstractC0440t
    public final int x(n nVar, C0409B c0409b) {
        if (this.f4013l == 0) {
            return this.f4010h;
        }
        super.x(nVar, c0409b);
        return 1;
    }

    @Override // g0.AbstractC0440t
    public final boolean y() {
        return this.f4017p != 0;
    }

    @Override // g0.AbstractC0440t
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4963b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f4020s);
        }
        for (int i2 = 0; i2 < this.f4010h; i2++) {
            C0417J c0417j = this.f4011i[i2];
            c0417j.f4883a.clear();
            c0417j.f4884b = Integer.MIN_VALUE;
            c0417j.f4885c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
