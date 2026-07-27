package G;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;
import z2.C1403G;
import z2.C1436t;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final F0 f2685a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2686b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2687c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f2688d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f2689e;

    /* renamed from: f, reason: collision with root package name */
    public i.q f2690f;

    /* renamed from: g, reason: collision with root package name */
    public int f2691g;

    /* renamed from: h, reason: collision with root package name */
    public int f2692h;

    /* renamed from: i, reason: collision with root package name */
    public int f2693i;

    /* renamed from: j, reason: collision with root package name */
    public int f2694j;

    /* renamed from: k, reason: collision with root package name */
    public int f2695k;

    /* renamed from: l, reason: collision with root package name */
    public int f2696l;

    /* renamed from: m, reason: collision with root package name */
    public int f2697m;

    /* renamed from: n, reason: collision with root package name */
    public int f2698n;

    /* renamed from: o, reason: collision with root package name */
    public int f2699o;

    /* renamed from: p, reason: collision with root package name */
    public final N f2700p;

    /* renamed from: q, reason: collision with root package name */
    public final N f2701q;

    /* renamed from: r, reason: collision with root package name */
    public final N f2702r;

    /* renamed from: s, reason: collision with root package name */
    public i.q f2703s;

    /* renamed from: t, reason: collision with root package name */
    public int f2704t;

    /* renamed from: u, reason: collision with root package name */
    public int f2705u;

    /* renamed from: v, reason: collision with root package name */
    public int f2706v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2707w;

    /* renamed from: x, reason: collision with root package name */
    public C1294c f2708x;

    public H0(F0 f02) {
        this.f2685a = f02;
        int[] iArr = f02.f2670d;
        this.f2686b = iArr;
        Object[] objArr = f02.f2672i;
        this.f2687c = objArr;
        this.f2688d = f02.f2677n;
        this.f2689e = f02.f2678o;
        this.f2690f = f02.f2679p;
        int i2 = f02.f2671e;
        this.f2691g = i2;
        this.f2692h = (iArr.length / 5) - i2;
        int i4 = f02.f2673j;
        this.f2695k = i4;
        this.f2696l = objArr.length - i4;
        this.f2697m = i2;
        this.f2700p = new N();
        this.f2701q = new N();
        this.f2702r = new N();
        this.f2705u = i2;
        this.f2706v = -1;
    }

    public static int h(int i2, int i4, int i5, int i6) {
        return i2 > i4 ? -(((i6 - i5) - i2) + 1) : i2;
    }

    public final boolean A() {
        if (this.f2698n != 0) {
            C0192d.w("Cannot remove group while inserting");
            throw null;
        }
        int i2 = this.f2704t;
        int i4 = this.f2693i;
        int f4 = f(this.f2686b, p(i2));
        int p4 = p(this.f2704t);
        int j4 = C0192d.j(this.f2686b, p4) + this.f2704t;
        this.f2704t = j4;
        this.f2693i = f(this.f2686b, p(j4));
        int o4 = C0192d.m(this.f2686b, p4) ? 1 : C0192d.o(this.f2686b, p4);
        G(this.f2706v);
        C1294c c1294c = this.f2708x;
        if (c1294c != null) {
            while (true) {
                List list = (List) c1294c.f11388d;
                if (list.isEmpty() || ((Number) C1403G.q(list)).intValue() < i2) {
                    break;
                }
                c1294c.q();
            }
        }
        boolean B = B(i2, this.f2704t - i2);
        C(f4, this.f2693i - f4, i2 - 1);
        this.f2704t = i2;
        this.f2693i = i4;
        this.f2699o -= o4;
        return B;
    }

    public final boolean B(int i2, int i4) {
        if (i4 > 0) {
            ArrayList arrayList = this.f2688d;
            u(i2);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f2689e;
                int i5 = i2 + i4;
                int n2 = C0192d.n(this.f2688d, i5, m() - this.f2692h);
                if (n2 >= this.f2688d.size()) {
                    n2--;
                }
                int i6 = n2 + 1;
                int i7 = 0;
                while (n2 >= 0) {
                    C0190c c0190c = (C0190c) this.f2688d.get(n2);
                    int c4 = c(c0190c);
                    if (c4 < i2) {
                        break;
                    }
                    if (c4 < i5) {
                        c0190c.f2791a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i7 == 0) {
                            i7 = n2 + 1;
                        }
                        i6 = n2;
                    }
                    n2--;
                }
                r0 = i6 < i7;
                if (r0) {
                    this.f2688d.subList(i6, i7).clear();
                }
            }
            this.f2691g = i2;
            this.f2692h += i4;
            int i8 = this.f2697m;
            if (i8 > i2) {
                this.f2697m = Math.max(i2, i8 - i4);
            }
            int i9 = this.f2705u;
            if (i9 >= this.f2691g) {
                this.f2705u = i9 - i4;
            }
            int i10 = this.f2706v;
            if (i10 >= 0 && C0192d.h(this.f2686b, p(i10))) {
                L(i10);
            }
        }
        return r0;
    }

    public final void C(int i2, int i4, int i5) {
        if (i4 > 0) {
            int i6 = this.f2696l;
            int i7 = i2 + i4;
            v(i7, i5);
            this.f2695k = i2;
            this.f2696l = i6 + i4;
            C1436t.k(this.f2687c, i2, i7);
            int i8 = this.f2694j;
            if (i8 >= i2) {
                this.f2694j = i8 - i4;
            }
        }
    }

    public final void D() {
        int i2 = this.f2705u;
        this.f2704t = i2;
        this.f2693i = f(this.f2686b, p(i2));
    }

    public final int E(int[] iArr, int i2) {
        if (i2 >= m()) {
            return this.f2687c.length - this.f2696l;
        }
        int r2 = C0192d.r(iArr, i2);
        return r2 < 0 ? (this.f2687c.length - this.f2696l) + r2 + 1 : r2;
    }

    public final int F(int i2, int i4) {
        int E3 = E(this.f2686b, p(i2));
        int i5 = E3 + i4;
        if (i5 >= E3 && i5 < f(this.f2686b, p(i2 + 1))) {
            return i5;
        }
        C0192d.w("Write to an invalid slot index " + i4 + " for group " + i2);
        throw null;
    }

    public final M G(int i2) {
        C0190c J3;
        HashMap hashMap = this.f2689e;
        if (hashMap == null || (J3 = J(i2)) == null) {
            return null;
        }
        return (M) hashMap.get(J3);
    }

    public final void H() {
        if (this.f2698n != 0) {
            C0192d.w("Key must be supplied when inserting");
            throw null;
        }
        W w4 = C0208l.f2826a;
        I(0, w4, w4, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(int i2, Object obj, Object obj2, boolean z4) {
        int i4;
        int i5 = this.f2706v;
        Object[] objArr = this.f2698n > 0;
        this.f2702r.b(this.f2699o);
        W w4 = C0208l.f2826a;
        if (objArr == true) {
            int i6 = this.f2704t;
            int f4 = f(this.f2686b, p(i6));
            r(1);
            this.f2693i = f4;
            this.f2694j = f4;
            int p4 = p(i6);
            int i7 = obj != w4 ? 1 : 0;
            int i8 = (z4 || obj2 == w4) ? 0 : 1;
            int h4 = h(f4, this.f2695k, this.f2696l, this.f2687c.length);
            if (h4 >= 0 && this.f2697m < i6) {
                h4 = -(((this.f2687c.length - this.f2696l) - h4) + 1);
            }
            int[] iArr = this.f2686b;
            int i9 = this.f2706v;
            int i10 = z4 ? 1073741824 : 0;
            int i11 = i7 != 0 ? 536870912 : 0;
            int i12 = i8 != 0 ? 268435456 : 0;
            int i13 = p4 * 5;
            iArr[i13] = i2;
            iArr[i13 + 1] = i10 | i11 | i12;
            iArr[i13 + 2] = i9;
            iArr[i13 + 3] = 0;
            iArr[i13 + 4] = h4;
            int i14 = (z4 ? 1 : 0) + i7 + i8;
            if (i14 > 0) {
                s(i14, i6);
                Object[] objArr2 = this.f2687c;
                int i15 = this.f2693i;
                if (z4) {
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
                this.f2693i = i15;
            }
            this.f2699o = 0;
            i4 = i6 + 1;
            this.f2706v = i6;
            this.f2704t = i4;
            if (i5 >= 0) {
                G(i5);
            }
        } else {
            this.f2700p.b(i5);
            this.f2701q.b((m() - this.f2692h) - this.f2705u);
            int i16 = this.f2704t;
            int p5 = p(i16);
            if (!Intrinsics.a(obj2, w4)) {
                if (z4) {
                    M(this.f2704t, obj2);
                } else {
                    K(obj2);
                }
            }
            this.f2693i = E(this.f2686b, p5);
            this.f2694j = f(this.f2686b, p(this.f2704t + 1));
            this.f2699o = C0192d.o(this.f2686b, p5);
            this.f2706v = i16;
            this.f2704t = i16 + 1;
            i4 = i16 + this.f2686b[(p5 * 5) + 3];
        }
        this.f2705u = i4;
    }

    public final C0190c J(int i2) {
        ArrayList arrayList;
        int Q3;
        if (i2 < 0 || i2 >= n() || (Q3 = C0192d.Q((arrayList = this.f2688d), i2, n())) < 0) {
            return null;
        }
        return (C0190c) arrayList.get(Q3);
    }

    public final void K(Object obj) {
        int p4 = p(this.f2704t);
        if (!C0192d.k(this.f2686b, p4)) {
            C0192d.w("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f2687c;
        int[] iArr = this.f2686b;
        objArr[g(C0192d.y(iArr[(p4 * 5) + 1] >> 29) + f(iArr, p4))] = obj;
    }

    public final void L(int i2) {
        if (i2 >= 0) {
            C1294c c1294c = this.f2708x;
            if (c1294c == null) {
                c1294c = new C1294c(5);
                this.f2708x = c1294c;
            }
            c1294c.a(i2);
        }
    }

    public final void M(int i2, Object obj) {
        int p4 = p(i2);
        int[] iArr = this.f2686b;
        if (p4 < iArr.length && C0192d.m(iArr, p4)) {
            this.f2687c[g(f(this.f2686b, p4))] = obj;
            return;
        }
        C0192d.w("Updating the node of a group at " + i2 + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i2) {
        boolean z4 = false;
        if (!(i2 >= 0)) {
            C0192d.w("Cannot seek backwards");
            throw null;
        }
        if (!(this.f2698n <= 0)) {
            C0192d.T("Cannot call seek() while inserting");
            throw null;
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.f2704t + i2;
        if (i4 >= this.f2706v && i4 <= this.f2705u) {
            z4 = true;
        }
        if (z4) {
            this.f2704t = i4;
            int f4 = f(this.f2686b, p(i4));
            this.f2693i = f4;
            this.f2694j = f4;
            return;
        }
        C0192d.w("Cannot seek outside the current group (" + this.f2706v + '-' + this.f2705u + ')');
        throw null;
    }

    public final C0190c b(int i2) {
        ArrayList arrayList = this.f2688d;
        int Q3 = C0192d.Q(arrayList, i2, n());
        if (Q3 >= 0) {
            return (C0190c) arrayList.get(Q3);
        }
        if (i2 > this.f2691g) {
            i2 = -(n() - i2);
        }
        C0190c c0190c = new C0190c(i2);
        arrayList.add(-(Q3 + 1), c0190c);
        return c0190c;
    }

    public final int c(C0190c c0190c) {
        int i2 = c0190c.f2791a;
        return i2 < 0 ? i2 + n() : i2;
    }

    public final void d() {
        int i2 = this.f2698n;
        this.f2698n = i2 + 1;
        if (i2 == 0) {
            this.f2701q.b((m() - this.f2692h) - this.f2705u);
        }
    }

    public final void e(boolean z4) {
        this.f2707w = true;
        if (z4 && this.f2700p.f2724b == 0) {
            u(n());
            v(this.f2687c.length - this.f2696l, this.f2691g);
            int i2 = this.f2695k;
            C1436t.k(this.f2687c, i2, this.f2696l + i2);
            z();
        }
        int[] iArr = this.f2686b;
        int i4 = this.f2691g;
        Object[] objArr = this.f2687c;
        int i5 = this.f2695k;
        ArrayList arrayList = this.f2688d;
        HashMap hashMap = this.f2689e;
        i.q qVar = this.f2690f;
        F0 f02 = this.f2685a;
        f02.getClass();
        if (!f02.f2675l) {
            C0192d.S("Unexpected writer close()");
            throw null;
        }
        f02.f2675l = false;
        f02.f2670d = iArr;
        f02.f2671e = i4;
        f02.f2672i = objArr;
        f02.f2673j = i5;
        f02.f2677n = arrayList;
        f02.f2678o = hashMap;
        f02.f2679p = qVar;
    }

    public final int f(int[] iArr, int i2) {
        if (i2 >= m()) {
            return this.f2687c.length - this.f2696l;
        }
        int i4 = C0192d.i(iArr, i2);
        return i4 < 0 ? (this.f2687c.length - this.f2696l) + i4 + 1 : i4;
    }

    public final int g(int i2) {
        return i2 < this.f2695k ? i2 : i2 + this.f2696l;
    }

    public final void i() {
        i.w wVar;
        boolean z4 = this.f2698n > 0;
        int i2 = this.f2704t;
        int i4 = this.f2705u;
        int i5 = this.f2706v;
        int p4 = p(i5);
        int i6 = this.f2699o;
        int i7 = i2 - i5;
        boolean m4 = C0192d.m(this.f2686b, p4);
        N n2 = this.f2702r;
        if (z4) {
            i.q qVar = this.f2703s;
            if (qVar != null && (wVar = (i.w) qVar.f(i5)) != null) {
                Object[] objArr = wVar.f6974a;
                int i8 = wVar.f6975b;
                for (int i9 = 0; i9 < i8; i9++) {
                    y(objArr[i9]);
                }
            }
            C0192d.s(this.f2686b, p4, i7);
            C0192d.t(this.f2686b, p4, i6);
            int a4 = n2.a();
            if (m4) {
                i6 = 1;
            }
            this.f2699o = a4 + i6;
            int x2 = x(this.f2686b, i5);
            this.f2706v = x2;
            int n4 = x2 < 0 ? n() : p(x2 + 1);
            int f4 = n4 >= 0 ? f(this.f2686b, n4) : 0;
            this.f2693i = f4;
            this.f2694j = f4;
            return;
        }
        if (i2 != i4) {
            C0192d.w("Expected to be at the end of a group");
            throw null;
        }
        int[] iArr = this.f2686b;
        int i10 = iArr[(p4 * 5) + 3];
        int o4 = C0192d.o(iArr, p4);
        C0192d.s(this.f2686b, p4, i7);
        C0192d.t(this.f2686b, p4, i6);
        int a5 = this.f2700p.a();
        this.f2705u = (m() - this.f2692h) - this.f2701q.a();
        this.f2706v = a5;
        int x3 = x(this.f2686b, i5);
        int a6 = n2.a();
        this.f2699o = a6;
        if (x3 == a5) {
            this.f2699o = a6 + (m4 ? 0 : i6 - o4);
            return;
        }
        int i11 = i7 - i10;
        int i12 = m4 ? 0 : i6 - o4;
        if (i11 != 0 || i12 != 0) {
            while (x3 != 0 && x3 != a5 && (i12 != 0 || i11 != 0)) {
                int p5 = p(x3);
                if (i11 != 0) {
                    int[] iArr2 = this.f2686b;
                    C0192d.s(iArr2, p5, iArr2[(p5 * 5) + 3] + i11);
                }
                if (i12 != 0) {
                    int[] iArr3 = this.f2686b;
                    C0192d.t(iArr3, p5, C0192d.o(iArr3, p5) + i12);
                }
                if (C0192d.m(this.f2686b, p5)) {
                    i12 = 0;
                }
                x3 = x(this.f2686b, x3);
            }
        }
        this.f2699o += i12;
    }

    public final void j() {
        int i2 = this.f2698n;
        if (!(i2 > 0)) {
            C0192d.T("Unbalanced begin/end insert");
            throw null;
        }
        int i4 = i2 - 1;
        this.f2698n = i4;
        if (i4 == 0) {
            if (this.f2702r.f2724b == this.f2700p.f2724b) {
                this.f2705u = (m() - this.f2692h) - this.f2701q.a();
            } else {
                C0192d.w("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i2) {
        boolean z4 = false;
        if (!(this.f2698n <= 0)) {
            C0192d.w("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i4 = this.f2706v;
        if (i4 != i2) {
            if (i2 >= i4 && i2 < this.f2705u) {
                z4 = true;
            }
            if (!z4) {
                C0192d.w("Started group at " + i2 + " must be a subgroup of the group at " + i4);
                throw null;
            }
            int i5 = this.f2704t;
            int i6 = this.f2693i;
            int i7 = this.f2694j;
            this.f2704t = i2;
            H();
            this.f2704t = i5;
            this.f2693i = i6;
            this.f2694j = i7;
        }
    }

    public final void l(int i2, int i4, int i5) {
        if (i2 >= this.f2691g) {
            i2 = -((n() - i2) + 2);
        }
        while (i5 < i4) {
            this.f2686b[(p(i5) * 5) + 2] = i2;
            int i6 = this.f2686b[(p(i5) * 5) + 3] + i5;
            l(i5, i6, i5 + 1);
            i5 = i6;
        }
    }

    public final int m() {
        return this.f2686b.length / 5;
    }

    public final int n() {
        return m() - this.f2692h;
    }

    public final int o() {
        return this.f2687c.length - this.f2696l;
    }

    public final int p(int i2) {
        return i2 < this.f2691g ? i2 : i2 + this.f2692h;
    }

    public final int q(int i2) {
        return C0192d.j(this.f2686b, p(i2));
    }

    public final void r(int i2) {
        if (i2 > 0) {
            int i4 = this.f2704t;
            u(i4);
            int i5 = this.f2691g;
            int i6 = this.f2692h;
            int[] iArr = this.f2686b;
            int length = iArr.length / 5;
            int i7 = length - i6;
            if (i6 < i2) {
                int max = Math.max(Math.max(length * 2, i7 + i2), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i7;
                C1436t.e(iArr, iArr2, 0, 0, i5 * 5);
                C1436t.e(iArr, iArr2, (i5 + i8) * 5, (i6 + i5) * 5, length * 5);
                this.f2686b = iArr2;
                i6 = i8;
            }
            int i9 = this.f2705u;
            if (i9 >= i5) {
                this.f2705u = i9 + i2;
            }
            int i10 = i5 + i2;
            this.f2691g = i10;
            this.f2692h = i6 - i2;
            int h4 = h(i7 > 0 ? f(this.f2686b, p(i4 + i2)) : 0, this.f2697m >= i5 ? this.f2695k : 0, this.f2696l, this.f2687c.length);
            for (int i11 = i5; i11 < i10; i11++) {
                this.f2686b[(i11 * 5) + 4] = h4;
            }
            int i12 = this.f2697m;
            if (i12 >= i5) {
                this.f2697m = i12 + i2;
            }
        }
    }

    public final void s(int i2, int i4) {
        if (i2 > 0) {
            v(this.f2693i, i4);
            int i5 = this.f2695k;
            int i6 = this.f2696l;
            if (i6 < i2) {
                Object[] objArr = this.f2687c;
                int length = objArr.length;
                int i7 = length - i6;
                int max = Math.max(Math.max(length * 2, i7 + i2), 32);
                Object[] objArr2 = new Object[max];
                for (int i8 = 0; i8 < max; i8++) {
                    objArr2[i8] = null;
                }
                int i9 = max - i7;
                C1436t.f(objArr, objArr2, 0, 0, i5);
                C1436t.f(objArr, objArr2, i5 + i9, i6 + i5, length);
                this.f2687c = objArr2;
                i6 = i9;
            }
            int i10 = this.f2694j;
            if (i10 >= i5) {
                this.f2694j = i10 + i2;
            }
            this.f2695k = i5 + i2;
            this.f2696l = i6 - i2;
        }
    }

    public final void t(F0 f02, int i2) {
        C0192d.P(this.f2698n > 0);
        if (i2 == 0 && this.f2704t == 0 && this.f2685a.f2671e == 0) {
            int[] iArr = f02.f2670d;
            int i4 = iArr[(i2 * 5) + 3];
            int i5 = f02.f2671e;
            if (i4 == i5) {
                int[] iArr2 = this.f2686b;
                Object[] objArr = this.f2687c;
                ArrayList arrayList = this.f2688d;
                HashMap hashMap = this.f2689e;
                i.q qVar = this.f2690f;
                Object[] objArr2 = f02.f2672i;
                int i6 = f02.f2673j;
                HashMap hashMap2 = f02.f2678o;
                i.q qVar2 = f02.f2679p;
                this.f2686b = iArr;
                this.f2687c = objArr2;
                this.f2688d = f02.f2677n;
                this.f2691g = i5;
                this.f2692h = (iArr.length / 5) - i5;
                this.f2695k = i6;
                this.f2696l = objArr2.length - i6;
                this.f2697m = i5;
                this.f2689e = hashMap2;
                this.f2690f = qVar2;
                f02.f2670d = iArr2;
                f02.f2671e = 0;
                f02.f2672i = objArr;
                f02.f2673j = 0;
                f02.f2677n = arrayList;
                f02.f2678o = hashMap;
                f02.f2679p = qVar;
                return;
            }
        }
        H0 w4 = f02.w();
        try {
            C0192d.H(w4, i2, this, true, true, false);
            w4.e(true);
        } catch (Throwable th) {
            w4.e(false);
            throw th;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f2704t + " end=" + this.f2705u + " size = " + n() + " gap=" + this.f2691g + '-' + (this.f2691g + this.f2692h) + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.f2686b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        z2.C1436t.e(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        z2.C1436t.e(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int i2) {
        C0190c c0190c;
        int i4;
        C0190c c0190c2;
        int i5;
        int i6;
        int i7 = this.f2692h;
        int i8 = this.f2691g;
        if (i8 != i2) {
            if (!this.f2688d.isEmpty()) {
                int m4 = m() - this.f2692h;
                if (i8 < i2) {
                    for (int n2 = C0192d.n(this.f2688d, i8, m4); n2 < this.f2688d.size() && (i5 = (c0190c2 = (C0190c) this.f2688d.get(n2)).f2791a) < 0 && (i6 = i5 + m4) < i2; n2++) {
                        c0190c2.f2791a = i6;
                    }
                } else {
                    for (int n4 = C0192d.n(this.f2688d, i2, m4); n4 < this.f2688d.size() && (i4 = (c0190c = (C0190c) this.f2688d.get(n4)).f2791a) >= 0; n4++) {
                        c0190c.f2791a = -(m4 - i4);
                    }
                }
            }
            if (i2 < i8) {
                i8 = i2 + i7;
            }
            int m5 = m();
            C0192d.P(i8 < m5);
            while (i8 < m5) {
                int i9 = (i8 * 5) + 2;
                int i10 = this.f2686b[i9];
                int n5 = i10 > -2 ? i10 : (n() + i10) - (-2);
                if (n5 >= i2) {
                    n5 = -((n() - n5) - (-2));
                }
                if (n5 != i10) {
                    this.f2686b[i9] = n5;
                }
                i8++;
                if (i8 == i2) {
                    i8 += i7;
                }
            }
        }
        this.f2691g = i2;
    }

    public final void v(int i2, int i4) {
        int i5 = this.f2696l;
        int i6 = this.f2695k;
        int i7 = this.f2697m;
        if (i6 != i2) {
            Object[] objArr = this.f2687c;
            if (i2 < i6) {
                C1436t.f(objArr, objArr, i2 + i5, i2, i6);
            } else {
                C1436t.f(objArr, objArr, i6, i6 + i5, i2 + i5);
            }
        }
        int min = Math.min(i4 + 1, n());
        if (i7 != min) {
            int length = this.f2687c.length - i5;
            if (min < i7) {
                int p4 = p(min);
                int p5 = p(i7);
                int i8 = this.f2691g;
                while (p4 < p5) {
                    int[] iArr = this.f2686b;
                    int i9 = (p4 * 5) + 4;
                    int i10 = iArr[i9];
                    if (i10 < 0) {
                        C0192d.w("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    iArr[i9] = -((length - i10) + 1);
                    p4++;
                    if (p4 == i8) {
                        p4 += this.f2692h;
                    }
                }
            } else {
                int p6 = p(i7);
                int p7 = p(min);
                while (p6 < p7) {
                    int[] iArr2 = this.f2686b;
                    int i11 = (p6 * 5) + 4;
                    int i12 = iArr2[i11];
                    if (i12 >= 0) {
                        C0192d.w("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    iArr2[i11] = i12 + length + 1;
                    p6++;
                    if (p6 == this.f2691g) {
                        p6 += this.f2692h;
                    }
                }
            }
            this.f2697m = min;
        }
        this.f2695k = i2;
    }

    public final Object w(int i2) {
        int p4 = p(i2);
        if (C0192d.m(this.f2686b, p4)) {
            return this.f2687c[g(f(this.f2686b, p4))];
        }
        return null;
    }

    public final int x(int[] iArr, int i2) {
        int p4 = C0192d.p(iArr, p(i2));
        return p4 > -2 ? p4 : n() + p4 + 2;
    }

    public final Object y(Object obj) {
        if (this.f2698n > 0) {
            s(1, this.f2706v);
        }
        Object[] objArr = this.f2687c;
        int i2 = this.f2693i;
        this.f2693i = i2 + 1;
        Object obj2 = objArr[g(i2)];
        int i4 = this.f2693i;
        if (i4 <= this.f2694j) {
            this.f2687c[g(i4 - 1)] = obj;
            return obj2;
        }
        C0192d.w("Writing to an invalid slot");
        throw null;
    }

    public final void z() {
        boolean z4;
        C1294c c1294c = this.f2708x;
        if (c1294c != null) {
            while (!((List) c1294c.f11388d).isEmpty()) {
                int q2 = c1294c.q();
                int p4 = p(q2);
                int i2 = q2 + 1;
                int q4 = q(q2) + q2;
                while (true) {
                    if (i2 >= q4) {
                        z4 = false;
                        break;
                    } else {
                        if ((this.f2686b[(p(i2) * 5) + 1] & 201326592) != 0) {
                            z4 = true;
                            break;
                        }
                        i2 += q(i2);
                    }
                }
                if (C0192d.h(this.f2686b, p4) != z4) {
                    int[] iArr = this.f2686b;
                    int i4 = (p4 * 5) + 1;
                    if (z4) {
                        iArr[i4] = iArr[i4] | 67108864;
                    } else {
                        iArr[i4] = iArr[i4] & (-67108865);
                    }
                    int x2 = x(iArr, q2);
                    if (x2 >= 0) {
                        c1294c.a(x2);
                    }
                }
            }
        }
    }
}
