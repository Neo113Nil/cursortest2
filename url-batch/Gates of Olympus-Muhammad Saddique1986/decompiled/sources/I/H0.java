package I;

import j.C0542p;
import j.C0548v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final F0 f2687a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2688b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2689c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f2690d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f2691e;

    /* renamed from: f, reason: collision with root package name */
    public C0542p f2692f;

    /* renamed from: g, reason: collision with root package name */
    public int f2693g;

    /* renamed from: h, reason: collision with root package name */
    public int f2694h;

    /* renamed from: i, reason: collision with root package name */
    public int f2695i;

    /* renamed from: j, reason: collision with root package name */
    public int f2696j;

    /* renamed from: k, reason: collision with root package name */
    public int f2697k;

    /* renamed from: l, reason: collision with root package name */
    public int f2698l;

    /* renamed from: m, reason: collision with root package name */
    public int f2699m;

    /* renamed from: n, reason: collision with root package name */
    public int f2700n;

    /* renamed from: o, reason: collision with root package name */
    public int f2701o;

    /* renamed from: p, reason: collision with root package name */
    public final N f2702p;

    /* renamed from: q, reason: collision with root package name */
    public final N f2703q;

    /* renamed from: r, reason: collision with root package name */
    public final N f2704r;

    /* renamed from: s, reason: collision with root package name */
    public C0542p f2705s;

    /* renamed from: t, reason: collision with root package name */
    public int f2706t;

    /* renamed from: u, reason: collision with root package name */
    public int f2707u;

    /* renamed from: v, reason: collision with root package name */
    public int f2708v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2709w;

    /* renamed from: x, reason: collision with root package name */
    public B.Y f2710x;

    public H0(F0 f02) {
        this.f2687a = f02;
        int[] iArr = f02.f2672d;
        this.f2688b = iArr;
        Object[] objArr = f02.f2674f;
        this.f2689c = objArr;
        this.f2690d = f02.f2679k;
        this.f2691e = f02.f2680l;
        this.f2692f = f02.f2681m;
        int i3 = f02.f2673e;
        this.f2693g = i3;
        this.f2694h = (iArr.length / 5) - i3;
        int i4 = f02.f2675g;
        this.f2697k = i4;
        this.f2698l = objArr.length - i4;
        this.f2699m = i3;
        this.f2702p = new N();
        this.f2703q = new N();
        this.f2704r = new N();
        this.f2707u = i3;
        this.f2708v = -1;
    }

    public static int h(int i3, int i4, int i5, int i6) {
        return i3 > i4 ? -(((i6 - i5) - i3) + 1) : i3;
    }

    public final boolean A() {
        if (this.f2700n != 0) {
            C0143d.w("Cannot remove group while inserting");
            throw null;
        }
        int i3 = this.f2706t;
        int i4 = this.f2695i;
        int f3 = f(this.f2688b, p(i3));
        int p3 = p(this.f2706t);
        int j3 = C0143d.j(this.f2688b, p3) + this.f2706t;
        this.f2706t = j3;
        this.f2695i = f(this.f2688b, p(j3));
        int o3 = C0143d.m(this.f2688b, p3) ? 1 : C0143d.o(this.f2688b, p3);
        G(this.f2708v);
        B.Y y3 = this.f2710x;
        if (y3 != null) {
            while (true) {
                List list = (List) y3.f334d;
                if (list.isEmpty() || ((Number) S1.l.K0(list)).intValue() < i3) {
                    break;
                }
                y3.q();
            }
        }
        boolean B3 = B(i3, this.f2706t - i3);
        C(f3, this.f2695i - f3, i3 - 1);
        this.f2706t = i3;
        this.f2695i = i4;
        this.f2701o -= o3;
        return B3;
    }

    public final boolean B(int i3, int i4) {
        if (i4 > 0) {
            ArrayList arrayList = this.f2690d;
            u(i3);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f2691e;
                int i5 = i3 + i4;
                int n3 = C0143d.n(this.f2690d, i5, m() - this.f2694h);
                if (n3 >= this.f2690d.size()) {
                    n3--;
                }
                int i6 = n3 + 1;
                int i7 = 0;
                while (n3 >= 0) {
                    C0141c c0141c = (C0141c) this.f2690d.get(n3);
                    int c2 = c(c0141c);
                    if (c2 < i3) {
                        break;
                    }
                    if (c2 < i5) {
                        c0141c.f2794a = Integer.MIN_VALUE;
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
                    this.f2690d.subList(i6, i7).clear();
                }
            }
            this.f2693g = i3;
            this.f2694h += i4;
            int i8 = this.f2699m;
            if (i8 > i3) {
                this.f2699m = Math.max(i3, i8 - i4);
            }
            int i9 = this.f2707u;
            if (i9 >= this.f2693g) {
                this.f2707u = i9 - i4;
            }
            int i10 = this.f2708v;
            if (i10 >= 0 && C0143d.h(this.f2688b, p(i10))) {
                L(i10);
            }
        }
        return r0;
    }

    public final void C(int i3, int i4, int i5) {
        if (i4 > 0) {
            int i6 = this.f2698l;
            int i7 = i3 + i4;
            v(i7, i5);
            this.f2697k = i3;
            this.f2698l = i6 + i4;
            Arrays.fill(this.f2689c, i3, i7, (Object) null);
            int i8 = this.f2696j;
            if (i8 >= i3) {
                this.f2696j = i8 - i4;
            }
        }
    }

    public final void D() {
        int i3 = this.f2707u;
        this.f2706t = i3;
        this.f2695i = f(this.f2688b, p(i3));
    }

    public final int E(int[] iArr, int i3) {
        if (i3 >= m()) {
            return this.f2689c.length - this.f2698l;
        }
        int r3 = C0143d.r(iArr, i3);
        return r3 < 0 ? (this.f2689c.length - this.f2698l) + r3 + 1 : r3;
    }

    public final int F(int i3, int i4) {
        int E3 = E(this.f2688b, p(i3));
        int i5 = E3 + i4;
        if (i5 >= E3 && i5 < f(this.f2688b, p(i3 + 1))) {
            return i5;
        }
        C0143d.w("Write to an invalid slot index " + i4 + " for group " + i3);
        throw null;
    }

    public final M G(int i3) {
        C0141c J3;
        HashMap hashMap = this.f2691e;
        if (hashMap == null || (J3 = J(i3)) == null) {
            return null;
        }
        return (M) hashMap.get(J3);
    }

    public final void H() {
        if (this.f2700n != 0) {
            C0143d.w("Key must be supplied when inserting");
            throw null;
        }
        W w2 = C0159l.f2829a;
        I(0, w2, false, w2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(int i3, Object obj, boolean z3, Object obj2) {
        int i4;
        int i5 = this.f2708v;
        Object[] objArr = this.f2700n > 0;
        this.f2704r.b(this.f2701o);
        W w2 = C0159l.f2829a;
        if (objArr == true) {
            int i6 = this.f2706t;
            int f3 = f(this.f2688b, p(i6));
            r(1);
            this.f2695i = f3;
            this.f2696j = f3;
            int p3 = p(i6);
            int i7 = obj != w2 ? 1 : 0;
            int i8 = (z3 || obj2 == w2) ? 0 : 1;
            int h3 = h(f3, this.f2697k, this.f2698l, this.f2689c.length);
            if (h3 >= 0 && this.f2699m < i6) {
                h3 = -(((this.f2689c.length - this.f2698l) - h3) + 1);
            }
            int[] iArr = this.f2688b;
            int i9 = this.f2708v;
            int i10 = z3 ? 1073741824 : 0;
            int i11 = i7 != 0 ? 536870912 : 0;
            int i12 = i8 != 0 ? 268435456 : 0;
            int i13 = p3 * 5;
            iArr[i13] = i3;
            iArr[i13 + 1] = i10 | i11 | i12;
            iArr[i13 + 2] = i9;
            iArr[i13 + 3] = 0;
            iArr[i13 + 4] = h3;
            int i14 = (z3 ? 1 : 0) + i7 + i8;
            if (i14 > 0) {
                s(i14, i6);
                Object[] objArr2 = this.f2689c;
                int i15 = this.f2695i;
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
                this.f2695i = i15;
            }
            this.f2701o = 0;
            i4 = i6 + 1;
            this.f2708v = i6;
            this.f2706t = i4;
            if (i5 >= 0) {
                G(i5);
            }
        } else {
            this.f2702p.b(i5);
            this.f2703q.b((m() - this.f2694h) - this.f2707u);
            int i16 = this.f2706t;
            int p4 = p(i16);
            if (!f2.j.a(obj2, w2)) {
                if (z3) {
                    M(this.f2706t, obj2);
                } else {
                    K(obj2);
                }
            }
            this.f2695i = E(this.f2688b, p4);
            this.f2696j = f(this.f2688b, p(this.f2706t + 1));
            this.f2701o = C0143d.o(this.f2688b, p4);
            this.f2708v = i16;
            this.f2706t = i16 + 1;
            i4 = i16 + this.f2688b[(p4 * 5) + 3];
        }
        this.f2707u = i4;
    }

    public final C0141c J(int i3) {
        ArrayList arrayList;
        int Q3;
        if (i3 < 0 || i3 >= n() || (Q3 = C0143d.Q((arrayList = this.f2690d), i3, n())) < 0) {
            return null;
        }
        return (C0141c) arrayList.get(Q3);
    }

    public final void K(Object obj) {
        int p3 = p(this.f2706t);
        if (!C0143d.k(this.f2688b, p3)) {
            C0143d.w("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f2689c;
        int[] iArr = this.f2688b;
        objArr[g(C0143d.y(iArr[(p3 * 5) + 1] >> 29) + f(iArr, p3))] = obj;
    }

    public final void L(int i3) {
        if (i3 >= 0) {
            B.Y y3 = this.f2710x;
            if (y3 == null) {
                y3 = new B.Y(7);
                this.f2710x = y3;
            }
            y3.c(i3);
        }
    }

    public final void M(int i3, Object obj) {
        int p3 = p(i3);
        int[] iArr = this.f2688b;
        if (p3 < iArr.length && C0143d.m(iArr, p3)) {
            this.f2689c[g(f(this.f2688b, p3))] = obj;
            return;
        }
        C0143d.w("Updating the node of a group at " + i3 + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i3) {
        boolean z3 = false;
        if (!(i3 >= 0)) {
            C0143d.w("Cannot seek backwards");
            throw null;
        }
        if (!(this.f2700n <= 0)) {
            C0143d.T("Cannot call seek() while inserting");
            throw null;
        }
        if (i3 == 0) {
            return;
        }
        int i4 = this.f2706t + i3;
        if (i4 >= this.f2708v && i4 <= this.f2707u) {
            z3 = true;
        }
        if (z3) {
            this.f2706t = i4;
            int f3 = f(this.f2688b, p(i4));
            this.f2695i = f3;
            this.f2696j = f3;
            return;
        }
        C0143d.w("Cannot seek outside the current group (" + this.f2708v + '-' + this.f2707u + ')');
        throw null;
    }

    public final C0141c b(int i3) {
        ArrayList arrayList = this.f2690d;
        int Q3 = C0143d.Q(arrayList, i3, n());
        if (Q3 >= 0) {
            return (C0141c) arrayList.get(Q3);
        }
        if (i3 > this.f2693g) {
            i3 = -(n() - i3);
        }
        C0141c c0141c = new C0141c(i3);
        arrayList.add(-(Q3 + 1), c0141c);
        return c0141c;
    }

    public final int c(C0141c c0141c) {
        int i3 = c0141c.f2794a;
        return i3 < 0 ? i3 + n() : i3;
    }

    public final void d() {
        int i3 = this.f2700n;
        this.f2700n = i3 + 1;
        if (i3 == 0) {
            this.f2703q.b((m() - this.f2694h) - this.f2707u);
        }
    }

    public final void e(boolean z3) {
        this.f2709w = true;
        if (z3 && this.f2702p.f2726b == 0) {
            u(n());
            v(this.f2689c.length - this.f2698l, this.f2693g);
            int i3 = this.f2697k;
            Arrays.fill(this.f2689c, i3, this.f2698l + i3, (Object) null);
            z();
        }
        int[] iArr = this.f2688b;
        int i4 = this.f2693g;
        Object[] objArr = this.f2689c;
        int i5 = this.f2697k;
        ArrayList arrayList = this.f2690d;
        HashMap hashMap = this.f2691e;
        C0542p c0542p = this.f2692f;
        F0 f02 = this.f2687a;
        f02.getClass();
        if (!f02.f2677i) {
            C0143d.S("Unexpected writer close()");
            throw null;
        }
        f02.f2677i = false;
        f02.f2672d = iArr;
        f02.f2673e = i4;
        f02.f2674f = objArr;
        f02.f2675g = i5;
        f02.f2679k = arrayList;
        f02.f2680l = hashMap;
        f02.f2681m = c0542p;
    }

    public final int f(int[] iArr, int i3) {
        if (i3 >= m()) {
            return this.f2689c.length - this.f2698l;
        }
        int i4 = C0143d.i(iArr, i3);
        return i4 < 0 ? (this.f2689c.length - this.f2698l) + i4 + 1 : i4;
    }

    public final int g(int i3) {
        return i3 < this.f2697k ? i3 : i3 + this.f2698l;
    }

    public final void i() {
        C0548v c0548v;
        boolean z3 = this.f2700n > 0;
        int i3 = this.f2706t;
        int i4 = this.f2707u;
        int i5 = this.f2708v;
        int p3 = p(i5);
        int i6 = this.f2701o;
        int i7 = i3 - i5;
        boolean m3 = C0143d.m(this.f2688b, p3);
        N n3 = this.f2704r;
        if (z3) {
            C0542p c0542p = this.f2705s;
            if (c0542p != null && (c0548v = (C0548v) c0542p.f(i5)) != null) {
                Object[] objArr = c0548v.f6336a;
                int i8 = c0548v.f6337b;
                for (int i9 = 0; i9 < i8; i9++) {
                    y(objArr[i9]);
                }
            }
            C0143d.s(this.f2688b, p3, i7);
            C0143d.t(this.f2688b, p3, i6);
            int a3 = n3.a();
            if (m3) {
                i6 = 1;
            }
            this.f2701o = a3 + i6;
            int x3 = x(this.f2688b, i5);
            this.f2708v = x3;
            int n4 = x3 < 0 ? n() : p(x3 + 1);
            int f3 = n4 >= 0 ? f(this.f2688b, n4) : 0;
            this.f2695i = f3;
            this.f2696j = f3;
            return;
        }
        if (i3 != i4) {
            C0143d.w("Expected to be at the end of a group");
            throw null;
        }
        int[] iArr = this.f2688b;
        int i10 = iArr[(p3 * 5) + 3];
        int o3 = C0143d.o(iArr, p3);
        C0143d.s(this.f2688b, p3, i7);
        C0143d.t(this.f2688b, p3, i6);
        int a4 = this.f2702p.a();
        this.f2707u = (m() - this.f2694h) - this.f2703q.a();
        this.f2708v = a4;
        int x4 = x(this.f2688b, i5);
        int a5 = n3.a();
        this.f2701o = a5;
        if (x4 == a4) {
            this.f2701o = a5 + (m3 ? 0 : i6 - o3);
            return;
        }
        int i11 = i7 - i10;
        int i12 = m3 ? 0 : i6 - o3;
        if (i11 != 0 || i12 != 0) {
            while (x4 != 0 && x4 != a4 && (i12 != 0 || i11 != 0)) {
                int p4 = p(x4);
                if (i11 != 0) {
                    int[] iArr2 = this.f2688b;
                    C0143d.s(iArr2, p4, iArr2[(p4 * 5) + 3] + i11);
                }
                if (i12 != 0) {
                    int[] iArr3 = this.f2688b;
                    C0143d.t(iArr3, p4, C0143d.o(iArr3, p4) + i12);
                }
                if (C0143d.m(this.f2688b, p4)) {
                    i12 = 0;
                }
                x4 = x(this.f2688b, x4);
            }
        }
        this.f2701o += i12;
    }

    public final void j() {
        int i3 = this.f2700n;
        if (!(i3 > 0)) {
            C0143d.T("Unbalanced begin/end insert");
            throw null;
        }
        int i4 = i3 - 1;
        this.f2700n = i4;
        if (i4 == 0) {
            if (this.f2704r.f2726b == this.f2702p.f2726b) {
                this.f2707u = (m() - this.f2694h) - this.f2703q.a();
            } else {
                C0143d.w("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i3) {
        boolean z3 = false;
        if (!(this.f2700n <= 0)) {
            C0143d.w("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i4 = this.f2708v;
        if (i4 != i3) {
            if (i3 >= i4 && i3 < this.f2707u) {
                z3 = true;
            }
            if (!z3) {
                C0143d.w("Started group at " + i3 + " must be a subgroup of the group at " + i4);
                throw null;
            }
            int i5 = this.f2706t;
            int i6 = this.f2695i;
            int i7 = this.f2696j;
            this.f2706t = i3;
            H();
            this.f2706t = i5;
            this.f2695i = i6;
            this.f2696j = i7;
        }
    }

    public final void l(int i3, int i4, int i5) {
        if (i3 >= this.f2693g) {
            i3 = -((n() - i3) + 2);
        }
        while (i5 < i4) {
            this.f2688b[(p(i5) * 5) + 2] = i3;
            int i6 = this.f2688b[(p(i5) * 5) + 3] + i5;
            l(i5, i6, i5 + 1);
            i5 = i6;
        }
    }

    public final int m() {
        return this.f2688b.length / 5;
    }

    public final int n() {
        return m() - this.f2694h;
    }

    public final int o() {
        return this.f2689c.length - this.f2698l;
    }

    public final int p(int i3) {
        return i3 < this.f2693g ? i3 : i3 + this.f2694h;
    }

    public final int q(int i3) {
        return C0143d.j(this.f2688b, p(i3));
    }

    public final void r(int i3) {
        if (i3 > 0) {
            int i4 = this.f2706t;
            u(i4);
            int i5 = this.f2693g;
            int i6 = this.f2694h;
            int[] iArr = this.f2688b;
            int length = iArr.length / 5;
            int i7 = length - i6;
            if (i6 < i3) {
                int max = Math.max(Math.max(length * 2, i7 + i3), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i7;
                S1.k.l0(iArr, iArr2, 0, 0, i5 * 5);
                S1.k.l0(iArr, iArr2, (i5 + i8) * 5, (i6 + i5) * 5, length * 5);
                this.f2688b = iArr2;
                i6 = i8;
            }
            int i9 = this.f2707u;
            if (i9 >= i5) {
                this.f2707u = i9 + i3;
            }
            int i10 = i5 + i3;
            this.f2693g = i10;
            this.f2694h = i6 - i3;
            int h3 = h(i7 > 0 ? f(this.f2688b, p(i4 + i3)) : 0, this.f2699m >= i5 ? this.f2697k : 0, this.f2698l, this.f2689c.length);
            for (int i11 = i5; i11 < i10; i11++) {
                this.f2688b[(i11 * 5) + 4] = h3;
            }
            int i12 = this.f2699m;
            if (i12 >= i5) {
                this.f2699m = i12 + i3;
            }
        }
    }

    public final void s(int i3, int i4) {
        if (i3 > 0) {
            v(this.f2695i, i4);
            int i5 = this.f2697k;
            int i6 = this.f2698l;
            if (i6 < i3) {
                Object[] objArr = this.f2689c;
                int length = objArr.length;
                int i7 = length - i6;
                int max = Math.max(Math.max(length * 2, i7 + i3), 32);
                Object[] objArr2 = new Object[max];
                for (int i8 = 0; i8 < max; i8++) {
                    objArr2[i8] = null;
                }
                int i9 = max - i7;
                S1.k.m0(objArr, objArr2, 0, 0, i5);
                S1.k.m0(objArr, objArr2, i5 + i9, i6 + i5, length);
                this.f2689c = objArr2;
                i6 = i9;
            }
            int i10 = this.f2696j;
            if (i10 >= i5) {
                this.f2696j = i10 + i3;
            }
            this.f2697k = i5 + i3;
            this.f2698l = i6 - i3;
        }
    }

    public final void t(F0 f02, int i3) {
        C0143d.P(this.f2700n > 0);
        if (i3 == 0 && this.f2706t == 0 && this.f2687a.f2673e == 0) {
            int[] iArr = f02.f2672d;
            int i4 = iArr[(i3 * 5) + 3];
            int i5 = f02.f2673e;
            if (i4 == i5) {
                int[] iArr2 = this.f2688b;
                Object[] objArr = this.f2689c;
                ArrayList arrayList = this.f2690d;
                HashMap hashMap = this.f2691e;
                C0542p c0542p = this.f2692f;
                Object[] objArr2 = f02.f2674f;
                int i6 = f02.f2675g;
                HashMap hashMap2 = f02.f2680l;
                C0542p c0542p2 = f02.f2681m;
                this.f2688b = iArr;
                this.f2689c = objArr2;
                this.f2690d = f02.f2679k;
                this.f2693g = i5;
                this.f2694h = (iArr.length / 5) - i5;
                this.f2697k = i6;
                this.f2698l = objArr2.length - i6;
                this.f2699m = i5;
                this.f2691e = hashMap2;
                this.f2692f = c0542p2;
                f02.f2672d = iArr2;
                f02.f2673e = 0;
                f02.f2674f = objArr;
                f02.f2675g = 0;
                f02.f2679k = arrayList;
                f02.f2680l = hashMap;
                f02.f2681m = c0542p;
                return;
            }
        }
        H0 i7 = f02.i();
        try {
            C0143d.H(i7, i3, this, true, true, false);
            i7.e(true);
        } catch (Throwable th) {
            i7.e(false);
            throw th;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f2706t + " end=" + this.f2707u + " size = " + n() + " gap=" + this.f2693g + '-' + (this.f2693g + this.f2694h) + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.f2688b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        S1.k.l0(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        S1.k.l0(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int i3) {
        C0141c c0141c;
        int i4;
        C0141c c0141c2;
        int i5;
        int i6;
        int i7 = this.f2694h;
        int i8 = this.f2693g;
        if (i8 != i3) {
            if (!this.f2690d.isEmpty()) {
                int m3 = m() - this.f2694h;
                if (i8 < i3) {
                    for (int n3 = C0143d.n(this.f2690d, i8, m3); n3 < this.f2690d.size() && (i5 = (c0141c2 = (C0141c) this.f2690d.get(n3)).f2794a) < 0 && (i6 = i5 + m3) < i3; n3++) {
                        c0141c2.f2794a = i6;
                    }
                } else {
                    for (int n4 = C0143d.n(this.f2690d, i3, m3); n4 < this.f2690d.size() && (i4 = (c0141c = (C0141c) this.f2690d.get(n4)).f2794a) >= 0; n4++) {
                        c0141c.f2794a = -(m3 - i4);
                    }
                }
            }
            if (i3 < i8) {
                i8 = i3 + i7;
            }
            int m4 = m();
            C0143d.P(i8 < m4);
            while (i8 < m4) {
                int i9 = (i8 * 5) + 2;
                int i10 = this.f2688b[i9];
                int n5 = i10 > -2 ? i10 : (n() + i10) - (-2);
                if (n5 >= i3) {
                    n5 = -((n() - n5) - (-2));
                }
                if (n5 != i10) {
                    this.f2688b[i9] = n5;
                }
                i8++;
                if (i8 == i3) {
                    i8 += i7;
                }
            }
        }
        this.f2693g = i3;
    }

    public final void v(int i3, int i4) {
        int i5 = this.f2698l;
        int i6 = this.f2697k;
        int i7 = this.f2699m;
        if (i6 != i3) {
            Object[] objArr = this.f2689c;
            if (i3 < i6) {
                S1.k.m0(objArr, objArr, i3 + i5, i3, i6);
            } else {
                S1.k.m0(objArr, objArr, i6, i6 + i5, i3 + i5);
            }
        }
        int min = Math.min(i4 + 1, n());
        if (i7 != min) {
            int length = this.f2689c.length - i5;
            if (min < i7) {
                int p3 = p(min);
                int p4 = p(i7);
                int i8 = this.f2693g;
                while (p3 < p4) {
                    int[] iArr = this.f2688b;
                    int i9 = (p3 * 5) + 4;
                    int i10 = iArr[i9];
                    if (i10 < 0) {
                        C0143d.w("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    iArr[i9] = -((length - i10) + 1);
                    p3++;
                    if (p3 == i8) {
                        p3 += this.f2694h;
                    }
                }
            } else {
                int p5 = p(i7);
                int p6 = p(min);
                while (p5 < p6) {
                    int[] iArr2 = this.f2688b;
                    int i11 = (p5 * 5) + 4;
                    int i12 = iArr2[i11];
                    if (i12 >= 0) {
                        C0143d.w("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    iArr2[i11] = i12 + length + 1;
                    p5++;
                    if (p5 == this.f2693g) {
                        p5 += this.f2694h;
                    }
                }
            }
            this.f2699m = min;
        }
        this.f2697k = i3;
    }

    public final Object w(int i3) {
        int p3 = p(i3);
        if (C0143d.m(this.f2688b, p3)) {
            return this.f2689c[g(f(this.f2688b, p3))];
        }
        return null;
    }

    public final int x(int[] iArr, int i3) {
        int p3 = C0143d.p(iArr, p(i3));
        return p3 > -2 ? p3 : n() + p3 + 2;
    }

    public final Object y(Object obj) {
        if (this.f2700n > 0) {
            s(1, this.f2708v);
        }
        Object[] objArr = this.f2689c;
        int i3 = this.f2695i;
        this.f2695i = i3 + 1;
        Object obj2 = objArr[g(i3)];
        int i4 = this.f2695i;
        if (i4 <= this.f2696j) {
            this.f2689c[g(i4 - 1)] = obj;
            return obj2;
        }
        C0143d.w("Writing to an invalid slot");
        throw null;
    }

    public final void z() {
        boolean z3;
        B.Y y3 = this.f2710x;
        if (y3 != null) {
            while (!((List) y3.f334d).isEmpty()) {
                int q3 = y3.q();
                int p3 = p(q3);
                int i3 = q3 + 1;
                int q4 = q(q3) + q3;
                while (true) {
                    if (i3 >= q4) {
                        z3 = false;
                        break;
                    } else {
                        if ((this.f2688b[(p(i3) * 5) + 1] & 201326592) != 0) {
                            z3 = true;
                            break;
                        }
                        i3 += q(i3);
                    }
                }
                if (C0143d.h(this.f2688b, p3) != z3) {
                    int[] iArr = this.f2688b;
                    int i4 = (p3 * 5) + 1;
                    if (z3) {
                        iArr[i4] = iArr[i4] | 67108864;
                    } else {
                        iArr[i4] = iArr[i4] & (-67108865);
                    }
                    int x3 = x(iArr, q3);
                    if (x3 >= 0) {
                        y3.c(x3);
                    }
                }
            }
        }
    }
}
