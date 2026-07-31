package I;

import j.C0498p;
import j.C0504v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f2133a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2134b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2135c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f2136d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f2137e;

    /* renamed from: f, reason: collision with root package name */
    public C0498p f2138f;

    /* renamed from: g, reason: collision with root package name */
    public int f2139g;

    /* renamed from: h, reason: collision with root package name */
    public int f2140h;

    /* renamed from: i, reason: collision with root package name */
    public int f2141i;

    /* renamed from: j, reason: collision with root package name */
    public int f2142j;

    /* renamed from: k, reason: collision with root package name */
    public int f2143k;

    /* renamed from: l, reason: collision with root package name */
    public int f2144l;

    /* renamed from: m, reason: collision with root package name */
    public int f2145m;

    /* renamed from: n, reason: collision with root package name */
    public int f2146n;

    /* renamed from: o, reason: collision with root package name */
    public int f2147o;
    public final O p;

    /* renamed from: q, reason: collision with root package name */
    public final O f2148q;

    /* renamed from: r, reason: collision with root package name */
    public final O f2149r;

    /* renamed from: s, reason: collision with root package name */
    public C0498p f2150s;

    /* renamed from: t, reason: collision with root package name */
    public int f2151t;

    /* renamed from: u, reason: collision with root package name */
    public int f2152u;

    /* renamed from: v, reason: collision with root package name */
    public int f2153v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2154w;

    /* renamed from: x, reason: collision with root package name */
    public A2.g f2155x;

    public I0(G0 g02) {
        this.f2133a = g02;
        int[] iArr = g02.f2118d;
        this.f2134b = iArr;
        Object[] objArr = g02.f2120f;
        this.f2135c = objArr;
        this.f2136d = g02.f2125k;
        this.f2137e = g02.f2126l;
        this.f2138f = g02.f2127m;
        int i3 = g02.f2119e;
        this.f2139g = i3;
        this.f2140h = (iArr.length / 5) - i3;
        int i4 = g02.f2121g;
        this.f2143k = i4;
        this.f2144l = objArr.length - i4;
        this.f2145m = i3;
        this.p = new O();
        this.f2148q = new O();
        this.f2149r = new O();
        this.f2152u = i3;
        this.f2153v = -1;
    }

    public static int h(int i3, int i4, int i5, int i6) {
        return i3 > i4 ? -(((i6 - i5) - i3) + 1) : i3;
    }

    public final boolean A() {
        if (this.f2146n != 0) {
            C0089d.w("Cannot remove group while inserting");
            throw null;
        }
        int i3 = this.f2151t;
        int i4 = this.f2141i;
        int f3 = f(this.f2134b, p(i3));
        int p = p(this.f2151t);
        int j3 = C0089d.j(this.f2134b, p) + this.f2151t;
        this.f2151t = j3;
        this.f2141i = f(this.f2134b, p(j3));
        int o3 = C0089d.m(this.f2134b, p) ? 1 : C0089d.o(this.f2134b, p);
        G(this.f2153v);
        A2.g gVar = this.f2155x;
        if (gVar != null) {
            while (true) {
                List list = (List) gVar.f83b;
                if (list.isEmpty() || ((Number) M1.l.m0(list)).intValue() < i3) {
                    break;
                }
                gVar.t();
            }
        }
        boolean B = B(i3, this.f2151t - i3);
        C(f3, this.f2141i - f3, i3 - 1);
        this.f2151t = i3;
        this.f2141i = i4;
        this.f2147o -= o3;
        return B;
    }

    public final boolean B(int i3, int i4) {
        if (i4 > 0) {
            ArrayList arrayList = this.f2136d;
            u(i3);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f2137e;
                int i5 = i3 + i4;
                int n3 = C0089d.n(this.f2136d, i5, m() - this.f2140h);
                if (n3 >= this.f2136d.size()) {
                    n3--;
                }
                int i6 = n3 + 1;
                int i7 = 0;
                while (n3 >= 0) {
                    C0087c c0087c = (C0087c) this.f2136d.get(n3);
                    int c3 = c(c0087c);
                    if (c3 < i3) {
                        break;
                    }
                    if (c3 < i5) {
                        c0087c.f2237a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i7 == 0) {
                            i7 = n3 + 1;
                        }
                        i6 = n3;
                    }
                    n3--;
                }
                r0 = i6 < i7;
                if (r0) {
                    this.f2136d.subList(i6, i7).clear();
                }
            }
            this.f2139g = i3;
            this.f2140h += i4;
            int i8 = this.f2145m;
            if (i8 > i3) {
                this.f2145m = Math.max(i3, i8 - i4);
            }
            int i9 = this.f2152u;
            if (i9 >= this.f2139g) {
                this.f2152u = i9 - i4;
            }
            int i10 = this.f2153v;
            if (i10 >= 0 && C0089d.h(this.f2134b, p(i10))) {
                L(i10);
            }
        }
        return r0;
    }

    public final void C(int i3, int i4, int i5) {
        if (i4 > 0) {
            int i6 = this.f2144l;
            int i7 = i3 + i4;
            v(i7, i5);
            this.f2143k = i3;
            this.f2144l = i6 + i4;
            M1.k.c0(this.f2135c, i3, i7);
            int i8 = this.f2142j;
            if (i8 >= i3) {
                this.f2142j = i8 - i4;
            }
        }
    }

    public final void D() {
        int i3 = this.f2152u;
        this.f2151t = i3;
        this.f2141i = f(this.f2134b, p(i3));
    }

    public final int E(int[] iArr, int i3) {
        if (i3 >= m()) {
            return this.f2135c.length - this.f2144l;
        }
        int r3 = C0089d.r(iArr, i3);
        return r3 < 0 ? (this.f2135c.length - this.f2144l) + r3 + 1 : r3;
    }

    public final int F(int i3, int i4) {
        int E3 = E(this.f2134b, p(i3));
        int i5 = E3 + i4;
        if (i5 >= E3 && i5 < f(this.f2134b, p(i3 + 1))) {
            return i5;
        }
        C0089d.w("Write to an invalid slot index " + i4 + " for group " + i3);
        throw null;
    }

    public final N G(int i3) {
        C0087c J3;
        HashMap hashMap = this.f2137e;
        if (hashMap == null || (J3 = J(i3)) == null) {
            return null;
        }
        return (N) hashMap.get(J3);
    }

    public final void H() {
        if (this.f2146n != 0) {
            C0089d.w("Key must be supplied when inserting");
            throw null;
        }
        X x3 = C0105l.f2272a;
        I(0, x3, false, x3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(int i3, Object obj, boolean z3, Object obj2) {
        int i4;
        int i5 = this.f2153v;
        Object[] objArr = this.f2146n > 0;
        this.f2149r.b(this.f2147o);
        X x3 = C0105l.f2272a;
        if (objArr == true) {
            int i6 = this.f2151t;
            int f3 = f(this.f2134b, p(i6));
            r(1);
            this.f2141i = f3;
            this.f2142j = f3;
            int p = p(i6);
            int i7 = obj != x3 ? 1 : 0;
            int i8 = (z3 || obj2 == x3) ? 0 : 1;
            int h3 = h(f3, this.f2143k, this.f2144l, this.f2135c.length);
            if (h3 >= 0 && this.f2145m < i6) {
                h3 = -(((this.f2135c.length - this.f2144l) - h3) + 1);
            }
            int[] iArr = this.f2134b;
            int i9 = this.f2153v;
            int i10 = z3 ? 1073741824 : 0;
            int i11 = i7 != 0 ? 536870912 : 0;
            int i12 = i8 != 0 ? 268435456 : 0;
            int i13 = p * 5;
            iArr[i13] = i3;
            iArr[i13 + 1] = i10 | i11 | i12;
            iArr[i13 + 2] = i9;
            iArr[i13 + 3] = 0;
            iArr[i13 + 4] = h3;
            int i14 = (z3 ? 1 : 0) + i7 + i8;
            if (i14 > 0) {
                s(i14, i6);
                Object[] objArr2 = this.f2135c;
                int i15 = this.f2141i;
                if (z3) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                if (i7 != 0) {
                    objArr2[i15] = obj;
                    i15++;
                }
                if (i8 != 0) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                this.f2141i = i15;
            }
            this.f2147o = 0;
            i4 = i6 + 1;
            this.f2153v = i6;
            this.f2151t = i4;
            if (i5 >= 0) {
                G(i5);
            }
        } else {
            this.p.b(i5);
            this.f2148q.b((m() - this.f2140h) - this.f2152u);
            int i16 = this.f2151t;
            int p3 = p(i16);
            if (!Z1.i.a(obj2, x3)) {
                if (z3) {
                    M(this.f2151t, obj2);
                } else {
                    K(obj2);
                }
            }
            this.f2141i = E(this.f2134b, p3);
            this.f2142j = f(this.f2134b, p(this.f2151t + 1));
            this.f2147o = C0089d.o(this.f2134b, p3);
            this.f2153v = i16;
            this.f2151t = i16 + 1;
            i4 = i16 + this.f2134b[(p3 * 5) + 3];
        }
        this.f2152u = i4;
    }

    public final C0087c J(int i3) {
        ArrayList arrayList;
        int P2;
        if (i3 < 0 || i3 >= n() || (P2 = C0089d.P((arrayList = this.f2136d), i3, n())) < 0) {
            return null;
        }
        return (C0087c) arrayList.get(P2);
    }

    public final void K(Object obj) {
        int p = p(this.f2151t);
        if (!C0089d.k(this.f2134b, p)) {
            C0089d.w("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f2135c;
        int[] iArr = this.f2134b;
        objArr[g(C0089d.y(iArr[(p * 5) + 1] >> 29) + f(iArr, p))] = obj;
    }

    public final void L(int i3) {
        if (i3 >= 0) {
            A2.g gVar = this.f2155x;
            if (gVar == null) {
                gVar = new A2.g(8);
                this.f2155x = gVar;
            }
            gVar.i(i3);
        }
    }

    public final void M(int i3, Object obj) {
        int p = p(i3);
        int[] iArr = this.f2134b;
        if (p < iArr.length && C0089d.m(iArr, p)) {
            this.f2135c[g(f(this.f2134b, p))] = obj;
            return;
        }
        C0089d.w("Updating the node of a group at " + i3 + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i3) {
        boolean z3 = false;
        if (!(i3 >= 0)) {
            C0089d.w("Cannot seek backwards");
            throw null;
        }
        if (!(this.f2146n <= 0)) {
            C0089d.S("Cannot call seek() while inserting");
            throw null;
        }
        if (i3 == 0) {
            return;
        }
        int i4 = this.f2151t + i3;
        if (i4 >= this.f2153v && i4 <= this.f2152u) {
            z3 = true;
        }
        if (z3) {
            this.f2151t = i4;
            int f3 = f(this.f2134b, p(i4));
            this.f2141i = f3;
            this.f2142j = f3;
            return;
        }
        C0089d.w("Cannot seek outside the current group (" + this.f2153v + '-' + this.f2152u + ')');
        throw null;
    }

    public final C0087c b(int i3) {
        ArrayList arrayList = this.f2136d;
        int P2 = C0089d.P(arrayList, i3, n());
        if (P2 >= 0) {
            return (C0087c) arrayList.get(P2);
        }
        if (i3 > this.f2139g) {
            i3 = -(n() - i3);
        }
        C0087c c0087c = new C0087c(i3);
        arrayList.add(-(P2 + 1), c0087c);
        return c0087c;
    }

    public final int c(C0087c c0087c) {
        int i3 = c0087c.f2237a;
        return i3 < 0 ? i3 + n() : i3;
    }

    public final void d() {
        int i3 = this.f2146n;
        this.f2146n = i3 + 1;
        if (i3 == 0) {
            this.f2148q.b((m() - this.f2140h) - this.f2152u);
        }
    }

    public final void e(boolean z3) {
        this.f2154w = true;
        if (z3 && this.p.f2171b == 0) {
            u(n());
            v(this.f2135c.length - this.f2144l, this.f2139g);
            int i3 = this.f2143k;
            M1.k.c0(this.f2135c, i3, this.f2144l + i3);
            z();
        }
        int[] iArr = this.f2134b;
        int i4 = this.f2139g;
        Object[] objArr = this.f2135c;
        int i5 = this.f2143k;
        ArrayList arrayList = this.f2136d;
        HashMap hashMap = this.f2137e;
        C0498p c0498p = this.f2138f;
        G0 g02 = this.f2133a;
        g02.getClass();
        if (!g02.f2123i) {
            C0089d.R("Unexpected writer close()");
            throw null;
        }
        g02.f2123i = false;
        g02.f2118d = iArr;
        g02.f2119e = i4;
        g02.f2120f = objArr;
        g02.f2121g = i5;
        g02.f2125k = arrayList;
        g02.f2126l = hashMap;
        g02.f2127m = c0498p;
    }

    public final int f(int[] iArr, int i3) {
        if (i3 >= m()) {
            return this.f2135c.length - this.f2144l;
        }
        int i4 = C0089d.i(iArr, i3);
        return i4 < 0 ? (this.f2135c.length - this.f2144l) + i4 + 1 : i4;
    }

    public final int g(int i3) {
        return i3 < this.f2143k ? i3 : i3 + this.f2144l;
    }

    public final void i() {
        C0504v c0504v;
        boolean z3 = this.f2146n > 0;
        int i3 = this.f2151t;
        int i4 = this.f2152u;
        int i5 = this.f2153v;
        int p = p(i5);
        int i6 = this.f2147o;
        int i7 = i3 - i5;
        boolean m3 = C0089d.m(this.f2134b, p);
        O o3 = this.f2149r;
        if (z3) {
            C0498p c0498p = this.f2150s;
            if (c0498p != null && (c0504v = (C0504v) c0498p.f(i5)) != null) {
                Object[] objArr = c0504v.f5218a;
                int i8 = c0504v.f5219b;
                for (int i9 = 0; i9 < i8; i9++) {
                    y(objArr[i9]);
                }
            }
            C0089d.s(this.f2134b, p, i7);
            C0089d.t(this.f2134b, p, i6);
            int a3 = o3.a();
            if (m3) {
                i6 = 1;
            }
            this.f2147o = a3 + i6;
            int x3 = x(this.f2134b, i5);
            this.f2153v = x3;
            int n3 = x3 < 0 ? n() : p(x3 + 1);
            int f3 = n3 >= 0 ? f(this.f2134b, n3) : 0;
            this.f2141i = f3;
            this.f2142j = f3;
            return;
        }
        if (i3 != i4) {
            C0089d.w("Expected to be at the end of a group");
            throw null;
        }
        int[] iArr = this.f2134b;
        int i10 = iArr[(p * 5) + 3];
        int o4 = C0089d.o(iArr, p);
        C0089d.s(this.f2134b, p, i7);
        C0089d.t(this.f2134b, p, i6);
        int a4 = this.p.a();
        this.f2152u = (m() - this.f2140h) - this.f2148q.a();
        this.f2153v = a4;
        int x4 = x(this.f2134b, i5);
        int a5 = o3.a();
        this.f2147o = a5;
        if (x4 == a4) {
            this.f2147o = a5 + (m3 ? 0 : i6 - o4);
            return;
        }
        int i11 = i7 - i10;
        int i12 = m3 ? 0 : i6 - o4;
        if (i11 != 0 || i12 != 0) {
            while (x4 != 0 && x4 != a4 && (i12 != 0 || i11 != 0)) {
                int p3 = p(x4);
                if (i11 != 0) {
                    int[] iArr2 = this.f2134b;
                    C0089d.s(iArr2, p3, iArr2[(p3 * 5) + 3] + i11);
                }
                if (i12 != 0) {
                    int[] iArr3 = this.f2134b;
                    C0089d.t(iArr3, p3, C0089d.o(iArr3, p3) + i12);
                }
                if (C0089d.m(this.f2134b, p3)) {
                    i12 = 0;
                }
                x4 = x(this.f2134b, x4);
            }
        }
        this.f2147o += i12;
    }

    public final void j() {
        int i3 = this.f2146n;
        if (!(i3 > 0)) {
            C0089d.S("Unbalanced begin/end insert");
            throw null;
        }
        int i4 = i3 - 1;
        this.f2146n = i4;
        if (i4 == 0) {
            if (this.f2149r.f2171b == this.p.f2171b) {
                this.f2152u = (m() - this.f2140h) - this.f2148q.a();
            } else {
                C0089d.w("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i3) {
        boolean z3 = false;
        if (!(this.f2146n <= 0)) {
            C0089d.w("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i4 = this.f2153v;
        if (i4 != i3) {
            if (i3 >= i4 && i3 < this.f2152u) {
                z3 = true;
            }
            if (!z3) {
                C0089d.w("Started group at " + i3 + " must be a subgroup of the group at " + i4);
                throw null;
            }
            int i5 = this.f2151t;
            int i6 = this.f2141i;
            int i7 = this.f2142j;
            this.f2151t = i3;
            H();
            this.f2151t = i5;
            this.f2141i = i6;
            this.f2142j = i7;
        }
    }

    public final void l(int i3, int i4, int i5) {
        if (i3 >= this.f2139g) {
            i3 = -((n() - i3) + 2);
        }
        while (i5 < i4) {
            this.f2134b[(p(i5) * 5) + 2] = i3;
            int i6 = this.f2134b[(p(i5) * 5) + 3] + i5;
            l(i5, i6, i5 + 1);
            i5 = i6;
        }
    }

    public final int m() {
        return this.f2134b.length / 5;
    }

    public final int n() {
        return m() - this.f2140h;
    }

    public final int o() {
        return this.f2135c.length - this.f2144l;
    }

    public final int p(int i3) {
        return i3 < this.f2139g ? i3 : i3 + this.f2140h;
    }

    public final int q(int i3) {
        return C0089d.j(this.f2134b, p(i3));
    }

    public final void r(int i3) {
        if (i3 > 0) {
            int i4 = this.f2151t;
            u(i4);
            int i5 = this.f2139g;
            int i6 = this.f2140h;
            int[] iArr = this.f2134b;
            int length = iArr.length / 5;
            int i7 = length - i6;
            if (i6 < i3) {
                int max = Math.max(Math.max(length * 2, i7 + i3), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i7;
                M1.k.W(iArr, iArr2, 0, 0, i5 * 5);
                M1.k.W(iArr, iArr2, (i5 + i8) * 5, (i6 + i5) * 5, length * 5);
                this.f2134b = iArr2;
                i6 = i8;
            }
            int i9 = this.f2152u;
            if (i9 >= i5) {
                this.f2152u = i9 + i3;
            }
            int i10 = i5 + i3;
            this.f2139g = i10;
            this.f2140h = i6 - i3;
            int h3 = h(i7 > 0 ? f(this.f2134b, p(i4 + i3)) : 0, this.f2145m >= i5 ? this.f2143k : 0, this.f2144l, this.f2135c.length);
            for (int i11 = i5; i11 < i10; i11++) {
                this.f2134b[(i11 * 5) + 4] = h3;
            }
            int i12 = this.f2145m;
            if (i12 >= i5) {
                this.f2145m = i12 + i3;
            }
        }
    }

    public final void s(int i3, int i4) {
        if (i3 > 0) {
            v(this.f2141i, i4);
            int i5 = this.f2143k;
            int i6 = this.f2144l;
            if (i6 < i3) {
                Object[] objArr = this.f2135c;
                int length = objArr.length;
                int i7 = length - i6;
                int max = Math.max(Math.max(length * 2, i7 + i3), 32);
                Object[] objArr2 = new Object[max];
                for (int i8 = 0; i8 < max; i8++) {
                    objArr2[i8] = null;
                }
                int i9 = max - i7;
                M1.k.X(objArr, objArr2, 0, 0, i5);
                M1.k.X(objArr, objArr2, i5 + i9, i6 + i5, length);
                this.f2135c = objArr2;
                i6 = i9;
            }
            int i10 = this.f2142j;
            if (i10 >= i5) {
                this.f2142j = i10 + i3;
            }
            this.f2143k = i5 + i3;
            this.f2144l = i6 - i3;
        }
    }

    public final void t(G0 g02, int i3) {
        C0089d.O(this.f2146n > 0);
        if (i3 == 0 && this.f2151t == 0 && this.f2133a.f2119e == 0) {
            int[] iArr = g02.f2118d;
            int i4 = iArr[(i3 * 5) + 3];
            int i5 = g02.f2119e;
            if (i4 == i5) {
                int[] iArr2 = this.f2134b;
                Object[] objArr = this.f2135c;
                ArrayList arrayList = this.f2136d;
                HashMap hashMap = this.f2137e;
                C0498p c0498p = this.f2138f;
                Object[] objArr2 = g02.f2120f;
                int i6 = g02.f2121g;
                HashMap hashMap2 = g02.f2126l;
                C0498p c0498p2 = g02.f2127m;
                this.f2134b = iArr;
                this.f2135c = objArr2;
                this.f2136d = g02.f2125k;
                this.f2139g = i5;
                this.f2140h = (iArr.length / 5) - i5;
                this.f2143k = i6;
                this.f2144l = objArr2.length - i6;
                this.f2145m = i5;
                this.f2137e = hashMap2;
                this.f2138f = c0498p2;
                g02.f2118d = iArr2;
                g02.f2119e = 0;
                g02.f2120f = objArr;
                g02.f2121g = 0;
                g02.f2125k = arrayList;
                g02.f2126l = hashMap;
                g02.f2127m = c0498p;
                return;
            }
        }
        I0 i7 = g02.i();
        try {
            C0089d.H(i7, i3, this, true, true, false);
            i7.e(true);
        } catch (Throwable th) {
            i7.e(false);
            throw th;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f2151t + " end=" + this.f2152u + " size = " + n() + " gap=" + this.f2139g + '-' + (this.f2139g + this.f2140h) + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.f2134b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        M1.k.W(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        M1.k.W(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int i3) {
        C0087c c0087c;
        int i4;
        C0087c c0087c2;
        int i5;
        int i6;
        int i7 = this.f2140h;
        int i8 = this.f2139g;
        if (i8 != i3) {
            if (!this.f2136d.isEmpty()) {
                int m3 = m() - this.f2140h;
                if (i8 < i3) {
                    for (int n3 = C0089d.n(this.f2136d, i8, m3); n3 < this.f2136d.size() && (i5 = (c0087c2 = (C0087c) this.f2136d.get(n3)).f2237a) < 0 && (i6 = i5 + m3) < i3; n3++) {
                        c0087c2.f2237a = i6;
                    }
                } else {
                    for (int n4 = C0089d.n(this.f2136d, i3, m3); n4 < this.f2136d.size() && (i4 = (c0087c = (C0087c) this.f2136d.get(n4)).f2237a) >= 0; n4++) {
                        c0087c.f2237a = -(m3 - i4);
                    }
                }
            }
            if (i3 < i8) {
                i8 = i3 + i7;
            }
            int m4 = m();
            C0089d.O(i8 < m4);
            while (i8 < m4) {
                int i9 = (i8 * 5) + 2;
                int i10 = this.f2134b[i9];
                int n5 = i10 > -2 ? i10 : (n() + i10) - (-2);
                if (n5 >= i3) {
                    n5 = -((n() - n5) - (-2));
                }
                if (n5 != i10) {
                    this.f2134b[i9] = n5;
                }
                i8++;
                if (i8 == i3) {
                    i8 += i7;
                }
            }
        }
        this.f2139g = i3;
    }

    public final void v(int i3, int i4) {
        int i5 = this.f2144l;
        int i6 = this.f2143k;
        int i7 = this.f2145m;
        if (i6 != i3) {
            Object[] objArr = this.f2135c;
            if (i3 < i6) {
                M1.k.X(objArr, objArr, i3 + i5, i3, i6);
            } else {
                M1.k.X(objArr, objArr, i6, i6 + i5, i3 + i5);
            }
        }
        int min = Math.min(i4 + 1, n());
        if (i7 != min) {
            int length = this.f2135c.length - i5;
            if (min < i7) {
                int p = p(min);
                int p3 = p(i7);
                int i8 = this.f2139g;
                while (p < p3) {
                    int[] iArr = this.f2134b;
                    int i9 = (p * 5) + 4;
                    int i10 = iArr[i9];
                    if (i10 < 0) {
                        C0089d.w("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    iArr[i9] = -((length - i10) + 1);
                    p++;
                    if (p == i8) {
                        p += this.f2140h;
                    }
                }
            } else {
                int p4 = p(i7);
                int p5 = p(min);
                while (p4 < p5) {
                    int[] iArr2 = this.f2134b;
                    int i11 = (p4 * 5) + 4;
                    int i12 = iArr2[i11];
                    if (i12 >= 0) {
                        C0089d.w("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    iArr2[i11] = i12 + length + 1;
                    p4++;
                    if (p4 == this.f2139g) {
                        p4 += this.f2140h;
                    }
                }
            }
            this.f2145m = min;
        }
        this.f2143k = i3;
    }

    public final Object w(int i3) {
        int p = p(i3);
        if (C0089d.m(this.f2134b, p)) {
            return this.f2135c[g(f(this.f2134b, p))];
        }
        return null;
    }

    public final int x(int[] iArr, int i3) {
        int p = C0089d.p(iArr, p(i3));
        return p > -2 ? p : n() + p + 2;
    }

    public final Object y(Object obj) {
        if (this.f2146n > 0) {
            s(1, this.f2153v);
        }
        Object[] objArr = this.f2135c;
        int i3 = this.f2141i;
        this.f2141i = i3 + 1;
        Object obj2 = objArr[g(i3)];
        int i4 = this.f2141i;
        if (i4 <= this.f2142j) {
            this.f2135c[g(i4 - 1)] = obj;
            return obj2;
        }
        C0089d.w("Writing to an invalid slot");
        throw null;
    }

    public final void z() {
        boolean z3;
        A2.g gVar = this.f2155x;
        if (gVar != null) {
            while (!((List) gVar.f83b).isEmpty()) {
                int t3 = gVar.t();
                int p = p(t3);
                int i3 = t3 + 1;
                int q2 = q(t3) + t3;
                while (true) {
                    if (i3 >= q2) {
                        z3 = false;
                        break;
                    } else {
                        if ((this.f2134b[(p(i3) * 5) + 1] & 201326592) != 0) {
                            z3 = true;
                            break;
                        }
                        i3 += q(i3);
                    }
                }
                if (C0089d.h(this.f2134b, p) != z3) {
                    int[] iArr = this.f2134b;
                    int i4 = (p * 5) + 1;
                    if (z3) {
                        iArr[i4] = iArr[i4] | 67108864;
                    } else {
                        iArr[i4] = iArr[i4] & (-67108865);
                    }
                    int x3 = x(iArr, t3);
                    if (x3 >= 0) {
                        gVar.i(x3);
                    }
                }
            }
        }
    }
}
