package G;

import A.AbstractC0017m;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final F0 f2653a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2654b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2655c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f2656d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2657e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2658f;

    /* renamed from: g, reason: collision with root package name */
    public int f2659g;

    /* renamed from: h, reason: collision with root package name */
    public int f2660h;

    /* renamed from: i, reason: collision with root package name */
    public int f2661i;

    /* renamed from: j, reason: collision with root package name */
    public final N f2662j;

    /* renamed from: k, reason: collision with root package name */
    public int f2663k;

    /* renamed from: l, reason: collision with root package name */
    public int f2664l;

    /* renamed from: m, reason: collision with root package name */
    public int f2665m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2666n;

    public E0(F0 f02) {
        this.f2653a = f02;
        this.f2654b = f02.f2670d;
        int i2 = f02.f2671e;
        this.f2655c = i2;
        this.f2656d = f02.f2672i;
        this.f2657e = f02.f2673j;
        this.f2660h = i2;
        this.f2661i = -1;
        this.f2662j = new N();
    }

    public final C0190c a(int i2) {
        ArrayList arrayList = this.f2653a.f2677n;
        int Q3 = C0192d.Q(arrayList, i2, this.f2655c);
        if (Q3 >= 0) {
            return (C0190c) arrayList.get(Q3);
        }
        C0190c c0190c = new C0190c(i2);
        arrayList.add(-(Q3 + 1), c0190c);
        return c0190c;
    }

    public final Object b(int[] iArr, int i2) {
        int y4;
        if (!C0192d.k(iArr, i2)) {
            return C0208l.f2826a;
        }
        int i4 = i2 * 5;
        if (i4 >= iArr.length) {
            y4 = iArr.length;
        } else {
            y4 = C0192d.y(iArr[i4 + 1] >> 29) + iArr[i4 + 4];
        }
        return this.f2656d[y4];
    }

    public final void c() {
        int i2;
        this.f2658f = true;
        F0 f02 = this.f2653a;
        f02.getClass();
        if (this.f2653a != f02 || (i2 = f02.f2674k) <= 0) {
            C0192d.w("Unexpected reader close()");
            throw null;
        }
        f02.f2674k = i2 - 1;
    }

    public final void d() {
        if (this.f2663k == 0) {
            if (!(this.f2659g == this.f2660h)) {
                C0192d.w("endGroup() not called at the end of a group");
                throw null;
            }
            int i2 = this.f2661i;
            int[] iArr = this.f2654b;
            int p4 = C0192d.p(iArr, i2);
            this.f2661i = p4;
            int i4 = this.f2655c;
            this.f2660h = p4 < 0 ? i4 : C0192d.j(iArr, p4) + p4;
            int a4 = this.f2662j.a();
            if (a4 < 0) {
                this.f2664l = 0;
                this.f2665m = 0;
            } else {
                this.f2664l = a4;
                this.f2665m = p4 >= i4 - 1 ? this.f2657e : C0192d.i(iArr, p4 + 1);
            }
        }
    }

    public final Object e() {
        int i2 = this.f2659g;
        if (i2 < this.f2660h) {
            return b(this.f2654b, i2);
        }
        return 0;
    }

    public final int f() {
        int i2 = this.f2659g;
        if (i2 >= this.f2660h) {
            return 0;
        }
        return this.f2654b[i2 * 5];
    }

    public final Object g(int i2, int i4) {
        int[] iArr = this.f2654b;
        int r2 = C0192d.r(iArr, i2);
        int i5 = i2 + 1;
        int i6 = r2 + i4;
        return i6 < (i5 < this.f2655c ? iArr[(i5 * 5) + 4] : this.f2657e) ? this.f2656d[i6] : C0208l.f2826a;
    }

    public final Object h() {
        int i2;
        if (this.f2663k > 0 || (i2 = this.f2664l) >= this.f2665m) {
            this.f2666n = false;
            return C0208l.f2826a;
        }
        this.f2666n = true;
        this.f2664l = i2 + 1;
        return this.f2656d[i2];
    }

    public final Object i(int i2) {
        int[] iArr = this.f2654b;
        if (!C0192d.m(iArr, i2)) {
            return null;
        }
        if (!C0192d.m(iArr, i2)) {
            return C0208l.f2826a;
        }
        return this.f2656d[iArr[(i2 * 5) + 4]];
    }

    public final Object j(int[] iArr, int i2) {
        if (!C0192d.l(iArr, i2)) {
            return null;
        }
        int i4 = i2 * 5;
        return this.f2656d[C0192d.y(iArr[i4 + 1] >> 30) + iArr[i4 + 4]];
    }

    public final void k(int i2) {
        if (!(this.f2663k == 0)) {
            C0192d.w("Cannot reposition while in an empty region");
            throw null;
        }
        this.f2659g = i2;
        int[] iArr = this.f2654b;
        int i4 = this.f2655c;
        int p4 = i2 < i4 ? C0192d.p(iArr, i2) : -1;
        this.f2661i = p4;
        if (p4 < 0) {
            this.f2660h = i4;
        } else {
            this.f2660h = C0192d.j(iArr, p4) + p4;
        }
        this.f2664l = 0;
        this.f2665m = 0;
    }

    public final int l() {
        if (!(this.f2663k == 0)) {
            C0192d.w("Cannot skip while in an empty region");
            throw null;
        }
        int i2 = this.f2659g;
        int[] iArr = this.f2654b;
        int o4 = C0192d.m(iArr, i2) ? 1 : C0192d.o(iArr, this.f2659g);
        int i4 = this.f2659g;
        this.f2659g = C0192d.j(iArr, i4) + i4;
        return o4;
    }

    public final void m() {
        if (!(this.f2663k == 0)) {
            C0192d.w("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f2659g = this.f2660h;
        this.f2664l = 0;
        this.f2665m = 0;
    }

    public final void n() {
        if (this.f2663k <= 0) {
            int i2 = this.f2661i;
            int i4 = this.f2659g;
            int[] iArr = this.f2654b;
            if (!(C0192d.p(iArr, i4) == i2)) {
                C0192d.S("Invalid slot table detected");
                throw null;
            }
            int i5 = this.f2664l;
            int i6 = this.f2665m;
            N n2 = this.f2662j;
            if (i5 == 0 && i6 == 0) {
                n2.b(-1);
            } else {
                n2.b(i5);
            }
            this.f2661i = i4;
            this.f2660h = C0192d.j(iArr, i4) + i4;
            int i7 = i4 + 1;
            this.f2659g = i7;
            this.f2664l = C0192d.r(iArr, i4);
            this.f2665m = i4 >= this.f2655c - 1 ? this.f2657e : C0192d.i(iArr, i7);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f2659g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.f2661i);
        sb.append(", end=");
        return AbstractC0017m.l(sb, this.f2660h, ')');
    }
}
