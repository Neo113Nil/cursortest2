package androidx.recyclerview.widget;

import B.b;
import E.H;
import E0.e;
import G3.m;
import a0.C0144j;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import c0.F;
import f1.E;
import i2.AbstractC0457a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.BitSet;
import l1.C1245B;
import l1.C1250G;
import l1.C1252I;
import l1.C1264k;
import l1.t;
import l1.u;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends t {

    /* renamed from: h, reason: collision with root package name */
    public final int f5188h;

    /* renamed from: i, reason: collision with root package name */
    public final E[] f5189i;

    /* renamed from: j, reason: collision with root package name */
    public final e f5190j;

    /* renamed from: k, reason: collision with root package name */
    public final e f5191k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5192l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f5193m;
    public final boolean n = false;
    public final m o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5194p;

    /* renamed from: q, reason: collision with root package name */
    public C1252I f5195q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5196r;

    /* renamed from: s, reason: collision with root package name */
    public final b f5197s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f5188h = -1;
        this.f5193m = false;
        m mVar = new m();
        this.o = mVar;
        this.f5194p = 2;
        new Rect();
        new C0144j(20, this);
        this.f5196r = true;
        this.f5197s = new b(17, this);
        C1264k w4 = t.w(context, attributeSet, i4, i5);
        int i6 = w4.f14241b;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i6 != this.f5192l) {
            this.f5192l = i6;
            e eVar = this.f5190j;
            this.f5190j = this.f5191k;
            this.f5191k = eVar;
            H();
        }
        int i7 = w4.f14242c;
        a(null);
        if (i7 != this.f5188h) {
            mVar.f936a = null;
            H();
            this.f5188h = i7;
            new BitSet(this.f5188h);
            this.f5189i = new E[this.f5188h];
            for (int i8 = 0; i8 < this.f5188h; i8++) {
                this.f5189i[i8] = new E(this, i8);
            }
            H();
        }
        boolean z = w4.f14243d;
        a(null);
        C1252I c1252i = this.f5195q;
        if (c1252i != null && c1252i.f14190h != z) {
            c1252i.f14190h = z;
        }
        this.f5193m = z;
        H();
        this.f5190j = e.a(this, this.f5192l);
        this.f5191k = e.a(this, 1 - this.f5192l);
    }

    @Override // l1.t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View M4 = M(false);
            View L = L(false);
            if (M4 == null || L == null) {
                return;
            }
            ((u) M4.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // l1.t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C1252I) {
            this.f5195q = (C1252I) parcelable;
            H();
        }
    }

    @Override // l1.t
    public final Parcelable C() {
        C1252I c1252i = this.f5195q;
        if (c1252i != null) {
            C1252I c1252i2 = new C1252I();
            c1252i2.f14185c = c1252i.f14185c;
            c1252i2.f14183a = c1252i.f14183a;
            c1252i2.f14184b = c1252i.f14184b;
            c1252i2.f14186d = c1252i.f14186d;
            c1252i2.f14187e = c1252i.f14187e;
            c1252i2.f14188f = c1252i.f14188f;
            c1252i2.f14190h = c1252i.f14190h;
            c1252i2.f14191i = c1252i.f14191i;
            c1252i2.f14192j = c1252i.f14192j;
            c1252i2.f14189g = c1252i.f14189g;
            return c1252i2;
        }
        C1252I c1252i3 = new C1252I();
        c1252i3.f14190h = this.f5193m;
        c1252i3.f14191i = false;
        c1252i3.f14192j = false;
        c1252i3.f14187e = 0;
        if (p() <= 0) {
            c1252i3.f14183a = -1;
            c1252i3.f14184b = -1;
            c1252i3.f14185c = 0;
            return c1252i3;
        }
        N();
        c1252i3.f14183a = 0;
        View L = this.n ? L(true) : M(true);
        if (L != null) {
            ((u) L.getLayoutParams()).getClass();
            throw null;
        }
        c1252i3.f14184b = -1;
        int i4 = this.f5188h;
        c1252i3.f14185c = i4;
        c1252i3.f14186d = new int[i4];
        for (int i5 = 0; i5 < this.f5188h; i5++) {
            E e4 = this.f5189i[i5];
            int i6 = e4.f8527a;
            if (i6 == Integer.MIN_VALUE) {
                if (((ArrayList) e4.f8530d).size() == 0) {
                    i6 = Integer.MIN_VALUE;
                } else {
                    View view = (View) ((ArrayList) e4.f8530d).get(0);
                    C1250G c1250g = (C1250G) view.getLayoutParams();
                    e4.f8527a = ((StaggeredGridLayoutManager) e4.f8531e).f5190j.c(view);
                    c1250g.getClass();
                    i6 = e4.f8527a;
                }
            }
            if (i6 != Integer.MIN_VALUE) {
                i6 -= this.f5190j.e();
            }
            c1252i3.f14186d[i5] = i6;
        }
        return c1252i3;
    }

    @Override // l1.t
    public final void D(int i4) {
        if (i4 == 0) {
            J();
        }
    }

    public final boolean J() {
        if (p() == 0 || this.f5194p == 0 || !this.f14259e) {
            return false;
        }
        boolean z = this.n;
        if (z) {
            O();
            N();
        } else {
            N();
            O();
        }
        int p2 = p();
        int i4 = p2 - 1;
        int i5 = this.f5188h;
        new BitSet(i5).set(0, i5, true);
        if (this.f5192l == 1) {
            RecyclerView recyclerView = this.f14256b;
            Field field = H.f375a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z) {
            p2 = -1;
        } else {
            i4 = 0;
        }
        if (i4 == p2) {
            return false;
        }
        ((C1250G) o(i4).getLayoutParams()).getClass();
        throw null;
    }

    public final void K(C1245B c1245b) {
        if (p() == 0) {
            return;
        }
        boolean z = !this.f5196r;
        View M4 = M(z);
        View L = L(z);
        if (p() == 0 || c1245b.a() == 0 || M4 == null || L == null) {
            return;
        }
        ((u) M4.getLayoutParams()).getClass();
        throw null;
    }

    public final View L(boolean z) {
        int e4 = this.f5190j.e();
        int d4 = this.f5190j.d();
        View view = null;
        for (int p2 = p() - 1; p2 >= 0; p2--) {
            View o = o(p2);
            int c4 = this.f5190j.c(o);
            int b4 = this.f5190j.b(o);
            if (b4 > e4 && c4 < d4) {
                if (b4 <= d4 || !z) {
                    return o;
                }
                if (view == null) {
                    view = o;
                }
            }
        }
        return view;
    }

    public final View M(boolean z) {
        int e4 = this.f5190j.e();
        int d4 = this.f5190j.d();
        int p2 = p();
        View view = null;
        for (int i4 = 0; i4 < p2; i4++) {
            View o = o(i4);
            int c4 = this.f5190j.c(o);
            if (this.f5190j.b(o) > e4 && c4 < d4) {
                if (c4 >= e4 || !z) {
                    return o;
                }
                if (view == null) {
                    view = o;
                }
            }
        }
        return view;
    }

    public final void N() {
        if (p() == 0) {
            return;
        }
        t.v(o(0));
        throw null;
    }

    public final void O() {
        int p2 = p();
        if (p2 == 0) {
            return;
        }
        t.v(o(p2 - 1));
        throw null;
    }

    @Override // l1.t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f5195q != null || (recyclerView = this.f14256b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // l1.t
    public final boolean b() {
        return this.f5192l == 0;
    }

    @Override // l1.t
    public final boolean c() {
        return this.f5192l == 1;
    }

    @Override // l1.t
    public final boolean d(u uVar) {
        return uVar instanceof C1250G;
    }

    @Override // l1.t
    public final int f(C1245B c1245b) {
        if (p() == 0) {
            return 0;
        }
        boolean z = !this.f5196r;
        return AbstractC0457a.h(c1245b, this.f5190j, M(z), L(z), this, this.f5196r);
    }

    @Override // l1.t
    public final void g(C1245B c1245b) {
        K(c1245b);
    }

    @Override // l1.t
    public final int h(C1245B c1245b) {
        if (p() == 0) {
            return 0;
        }
        boolean z = !this.f5196r;
        return AbstractC0457a.i(c1245b, this.f5190j, M(z), L(z), this, this.f5196r);
    }

    @Override // l1.t
    public final int i(C1245B c1245b) {
        if (p() == 0) {
            return 0;
        }
        boolean z = !this.f5196r;
        return AbstractC0457a.h(c1245b, this.f5190j, M(z), L(z), this, this.f5196r);
    }

    @Override // l1.t
    public final void j(C1245B c1245b) {
        K(c1245b);
    }

    @Override // l1.t
    public final int k(C1245B c1245b) {
        if (p() == 0) {
            return 0;
        }
        boolean z = !this.f5196r;
        return AbstractC0457a.i(c1245b, this.f5190j, M(z), L(z), this, this.f5196r);
    }

    @Override // l1.t
    public final u l() {
        return this.f5192l == 0 ? new C1250G(-2, -1) : new C1250G(-1, -2);
    }

    @Override // l1.t
    public final u m(Context context, AttributeSet attributeSet) {
        return new C1250G(context, attributeSet);
    }

    @Override // l1.t
    public final u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1250G((ViewGroup.MarginLayoutParams) layoutParams) : new C1250G(layoutParams);
    }

    @Override // l1.t
    public final int q(F f4, C1245B c1245b) {
        if (this.f5192l == 1) {
            return this.f5188h;
        }
        super.q(f4, c1245b);
        return 1;
    }

    @Override // l1.t
    public final int x(F f4, C1245B c1245b) {
        if (this.f5192l == 0) {
            return this.f5188h;
        }
        super.x(f4, c1245b);
        return 1;
    }

    @Override // l1.t
    public final boolean y() {
        return this.f5194p != 0;
    }

    @Override // l1.t
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f14256b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f5197s);
        }
        for (int i4 = 0; i4 < this.f5188h; i4++) {
            E e4 = this.f5189i[i4];
            ((ArrayList) e4.f8530d).clear();
            e4.f8527a = Integer.MIN_VALUE;
            e4.f8528b = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
