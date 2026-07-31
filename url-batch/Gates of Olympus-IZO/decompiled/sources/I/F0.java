package I;

import H2.AbstractC0080b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f2101a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2102b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2103c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f2104d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2105e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2106f;

    /* renamed from: g, reason: collision with root package name */
    public int f2107g;

    /* renamed from: h, reason: collision with root package name */
    public int f2108h;

    /* renamed from: i, reason: collision with root package name */
    public int f2109i;

    /* renamed from: j, reason: collision with root package name */
    public final O f2110j;

    /* renamed from: k, reason: collision with root package name */
    public int f2111k;

    /* renamed from: l, reason: collision with root package name */
    public int f2112l;

    /* renamed from: m, reason: collision with root package name */
    public int f2113m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2114n;

    public F0(G0 g02) {
        this.f2101a = g02;
        this.f2102b = g02.f2118d;
        int i3 = g02.f2119e;
        this.f2103c = i3;
        this.f2104d = g02.f2120f;
        this.f2105e = g02.f2121g;
        this.f2108h = i3;
        this.f2109i = -1;
        this.f2110j = new O();
    }

    public final C0087c a(int i3) {
        ArrayList arrayList = this.f2101a.f2125k;
        int P2 = C0089d.P(arrayList, i3, this.f2103c);
        if (P2 >= 0) {
            return (C0087c) arrayList.get(P2);
        }
        C0087c c0087c = new C0087c(i3);
        arrayList.add(-(P2 + 1), c0087c);
        return c0087c;
    }

    public final Object b(int[] iArr, int i3) {
        int y3;
        if (!C0089d.k(iArr, i3)) {
            return C0105l.f2272a;
        }
        int i4 = i3 * 5;
        if (i4 >= iArr.length) {
            y3 = iArr.length;
        } else {
            y3 = C0089d.y(iArr[i4 + 1] >> 29) + iArr[i4 + 4];
        }
        return this.f2104d[y3];
    }

    public final void c() {
        int i3;
        this.f2106f = true;
        G0 g02 = this.f2101a;
        g02.getClass();
        if (this.f2101a != g02 || (i3 = g02.f2122h) <= 0) {
            C0089d.w("Unexpected reader close()");
            throw null;
        }
        g02.f2122h = i3 - 1;
    }

    public final void d() {
        if (this.f2111k == 0) {
            if (!(this.f2107g == this.f2108h)) {
                C0089d.w("endGroup() not called at the end of a group");
                throw null;
            }
            int i3 = this.f2109i;
            int[] iArr = this.f2102b;
            int p = C0089d.p(iArr, i3);
            this.f2109i = p;
            int i4 = this.f2103c;
            this.f2108h = p < 0 ? i4 : C0089d.j(iArr, p) + p;
            int a3 = this.f2110j.a();
            if (a3 < 0) {
                this.f2112l = 0;
                this.f2113m = 0;
            } else {
                this.f2112l = a3;
                this.f2113m = p >= i4 - 1 ? this.f2105e : C0089d.i(iArr, p + 1);
            }
        }
    }

    public final Object e() {
        int i3 = this.f2107g;
        if (i3 < this.f2108h) {
            return b(this.f2102b, i3);
        }
        return 0;
    }

    public final int f() {
        int i3 = this.f2107g;
        if (i3 >= this.f2108h) {
            return 0;
        }
        return this.f2102b[i3 * 5];
    }

    public final Object g(int i3, int i4) {
        int[] iArr = this.f2102b;
        int r3 = C0089d.r(iArr, i3);
        int i5 = i3 + 1;
        int i6 = r3 + i4;
        return i6 < (i5 < this.f2103c ? iArr[(i5 * 5) + 4] : this.f2105e) ? this.f2104d[i6] : C0105l.f2272a;
    }

    public final Object h() {
        int i3;
        if (this.f2111k > 0 || (i3 = this.f2112l) >= this.f2113m) {
            this.f2114n = false;
            return C0105l.f2272a;
        }
        this.f2114n = true;
        this.f2112l = i3 + 1;
        return this.f2104d[i3];
    }

    public final Object i(int i3) {
        int[] iArr = this.f2102b;
        if (!C0089d.m(iArr, i3)) {
            return null;
        }
        if (!C0089d.m(iArr, i3)) {
            return C0105l.f2272a;
        }
        return this.f2104d[iArr[(i3 * 5) + 4]];
    }

    public final Object j(int[] iArr, int i3) {
        if (!C0089d.l(iArr, i3)) {
            return null;
        }
        int i4 = i3 * 5;
        return this.f2104d[C0089d.y(iArr[i4 + 1] >> 30) + iArr[i4 + 4]];
    }

    public final void k(int i3) {
        if (!(this.f2111k == 0)) {
            C0089d.w("Cannot reposition while in an empty region");
            throw null;
        }
        this.f2107g = i3;
        int[] iArr = this.f2102b;
        int i4 = this.f2103c;
        int p = i3 < i4 ? C0089d.p(iArr, i3) : -1;
        this.f2109i = p;
        if (p < 0) {
            this.f2108h = i4;
        } else {
            this.f2108h = C0089d.j(iArr, p) + p;
        }
        this.f2112l = 0;
        this.f2113m = 0;
    }

    public final int l() {
        if (!(this.f2111k == 0)) {
            C0089d.w("Cannot skip while in an empty region");
            throw null;
        }
        int i3 = this.f2107g;
        int[] iArr = this.f2102b;
        int o3 = C0089d.m(iArr, i3) ? 1 : C0089d.o(iArr, this.f2107g);
        int i4 = this.f2107g;
        this.f2107g = C0089d.j(iArr, i4) + i4;
        return o3;
    }

    public final void m() {
        if (!(this.f2111k == 0)) {
            C0089d.w("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f2107g = this.f2108h;
        this.f2112l = 0;
        this.f2113m = 0;
    }

    public final void n() {
        if (this.f2111k <= 0) {
            int i3 = this.f2109i;
            int i4 = this.f2107g;
            int[] iArr = this.f2102b;
            if (!(C0089d.p(iArr, i4) == i3)) {
                C0089d.R("Invalid slot table detected");
                throw null;
            }
            int i5 = this.f2112l;
            int i6 = this.f2113m;
            O o3 = this.f2110j;
            if (i5 == 0 && i6 == 0) {
                o3.b(-1);
            } else {
                o3.b(i5);
            }
            this.f2109i = i4;
            this.f2108h = C0089d.j(iArr, i4) + i4;
            int i7 = i4 + 1;
            this.f2107g = i7;
            this.f2112l = C0089d.r(iArr, i4);
            this.f2113m = i4 >= this.f2103c - 1 ? this.f2105e : C0089d.i(iArr, i7);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f2107g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.f2109i);
        sb.append(", end=");
        return AbstractC0080b.k(sb, this.f2108h, ')');
    }
}
