package m0;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f4952a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4953b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4954c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4955d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f4956e;

    /* renamed from: f, reason: collision with root package name */
    public o.x f4957f;

    /* renamed from: g, reason: collision with root package name */
    public int f4958g;

    /* renamed from: h, reason: collision with root package name */
    public int f4959h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4960j;

    /* renamed from: k, reason: collision with root package name */
    public int f4961k;

    /* renamed from: l, reason: collision with root package name */
    public int f4962l;

    /* renamed from: m, reason: collision with root package name */
    public int f4963m;

    /* renamed from: n, reason: collision with root package name */
    public int f4964n;

    /* renamed from: o, reason: collision with root package name */
    public int f4965o;

    /* renamed from: p, reason: collision with root package name */
    public final n0 f4966p;

    /* renamed from: q, reason: collision with root package name */
    public final n0 f4967q;

    /* renamed from: r, reason: collision with root package name */
    public final n0 f4968r;

    /* renamed from: s, reason: collision with root package name */
    public o.x f4969s;

    /* renamed from: t, reason: collision with root package name */
    public int f4970t;

    /* renamed from: u, reason: collision with root package name */
    public int f4971u;

    /* renamed from: v, reason: collision with root package name */
    public int f4972v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4973w;

    /* renamed from: x, reason: collision with root package name */
    public o.w f4974x;

    public i2(f2 f2Var) {
        this.f4952a = f2Var;
        int[] iArr = f2Var.f4928d;
        this.f4953b = iArr;
        Object[] objArr = f2Var.f4930f;
        this.f4954c = objArr;
        this.f4955d = f2Var.f4935l;
        this.f4956e = f2Var.f4936m;
        this.f4957f = f2Var.f4937n;
        int i = f2Var.f4929e;
        this.f4958g = i;
        this.f4959h = (iArr.length / 5) - i;
        int i8 = f2Var.f4931g;
        this.f4961k = i8;
        this.f4962l = objArr.length - i8;
        this.f4963m = i;
        this.f4966p = new n0();
        this.f4967q = new n0();
        this.f4968r = new n0();
        this.f4971u = i;
        this.f4972v = -1;
    }

    public static int i(int i, int i8, int i9, int i10) {
        return i > i8 ? -(((i10 - i9) - i) + 1) : i;
    }

    public static void y(i2 i2Var) {
        int i = i2Var.f4972v;
        int r7 = i2Var.r(i);
        int[] iArr = i2Var.f4953b;
        int i8 = (r7 * 5) + 1;
        int i9 = iArr[i8];
        if ((i9 & 134217728) != 0) {
            return;
        }
        int i10 = (i9 & (-134217729)) | 134217728;
        iArr[i8] = i10;
        if ((67108864 & i10) != 0) {
            return;
        }
        i2Var.S(i2Var.D(iArr, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.f4953b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        d6.l.F(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        d6.l.F(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i) {
        a aVar;
        int i8;
        a aVar2;
        int i9;
        int i10;
        int i11 = this.f4959h;
        int i12 = this.f4958g;
        if (i12 != i) {
            if (!this.f4955d.isEmpty()) {
                int o2 = o() - this.f4959h;
                if (i12 < i) {
                    for (int b8 = h2.b(this.f4955d, i12, o2); b8 < this.f4955d.size() && (i9 = (aVar2 = (a) this.f4955d.get(b8)).f4874a) < 0 && (i10 = i9 + o2) < i; b8++) {
                        aVar2.f4874a = i10;
                    }
                } else {
                    for (int b9 = h2.b(this.f4955d, i, o2); b9 < this.f4955d.size() && (i8 = (aVar = (a) this.f4955d.get(b9)).f4874a) >= 0; b9++) {
                        aVar.f4874a = -(o2 - i8);
                    }
                }
            }
            if (i < i12) {
                i12 = i + i11;
            }
            int o5 = o();
            if (i12 >= o5) {
                t.c("Check failed");
            }
            while (i12 < o5) {
                int i13 = (i12 * 5) + 2;
                int i14 = this.f4953b[i13];
                int p7 = i14 > -2 ? i14 : (p() + i14) - (-2);
                if (p7 >= i) {
                    p7 = -((p() - p7) - (-2));
                }
                if (p7 != i14) {
                    this.f4953b[i13] = p7;
                }
                i12++;
                if (i12 == i) {
                    i12 += i11;
                }
            }
        }
        this.f4958g = i;
    }

    public final void B(int i, int i8) {
        int i9 = this.f4962l;
        int i10 = this.f4961k;
        int i11 = this.f4963m;
        if (i10 != i) {
            Object[] objArr = this.f4954c;
            if (i < i10) {
                System.arraycopy(objArr, i, objArr, i + i9, i10 - i);
            } else {
                int i12 = i10 + i9;
                System.arraycopy(objArr, i12, objArr, i10, (i + i9) - i12);
            }
        }
        int min = Math.min(i8 + 1, p());
        if (i11 != min) {
            int length = this.f4954c.length - i9;
            if (min < i11) {
                int r7 = r(min);
                int r8 = r(i11);
                int i13 = this.f4958g;
                while (r7 < r8) {
                    int i14 = (r7 * 5) + 4;
                    int i15 = this.f4953b[i14];
                    if (!(i15 >= 0)) {
                        t.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f4953b[i14] = -((length - i15) + 1);
                    r7++;
                    if (r7 == i13) {
                        r7 += this.f4959h;
                    }
                }
            } else {
                int r9 = r(i11);
                int r10 = r(min);
                while (r9 < r10) {
                    int i16 = (r9 * 5) + 4;
                    int i17 = this.f4953b[i16];
                    if (!(i17 < 0)) {
                        t.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f4953b[i16] = i17 + length + 1;
                    r9++;
                    if (r9 == this.f4958g) {
                        r9 += this.f4959h;
                    }
                }
            }
            this.f4963m = min;
        }
        this.f4961k = i;
    }

    public final Object C(int i) {
        int r7 = r(i);
        int[] iArr = this.f4953b;
        if ((iArr[(r7 * 5) + 1] & 1073741824) != 0) {
            return this.f4954c[h(g(iArr, r7))];
        }
        return null;
    }

    public final int D(int[] iArr, int i) {
        int i8 = iArr[(r(i) * 5) + 2];
        return i8 > -2 ? i8 : (p() + i8) - (-2);
    }

    public final Object E(Object obj) {
        if (this.f4964n > 0) {
            w(1, this.f4972v);
        }
        Object[] objArr = this.f4954c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.f4960j) {
            t.c("Writing to an invalid slot");
        }
        this.f4954c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void F() {
        int i;
        o.w wVar = this.f4974x;
        if (wVar != null) {
            while (wVar.f5560b != 0) {
                int v7 = b.v(wVar);
                int r7 = r(v7);
                int i8 = v7 + 1;
                int t3 = t(v7) + v7;
                while (true) {
                    if (i8 >= t3) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f4953b[(r(i8) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i8 += t(i8);
                    }
                }
                int[] iArr = this.f4953b;
                int i9 = (r7 * 5) + 1;
                int i10 = iArr[i9];
                if (((67108864 & i10) != 0 ? 1 : 0) != i) {
                    iArr[i9] = (i << 26) | ((-67108865) & i10);
                    int D = D(iArr, v7);
                    if (D >= 0) {
                        b.h(wVar, D);
                    }
                }
            }
        }
    }

    public final boolean G() {
        if (!(this.f4964n == 0)) {
            t.c("Cannot remove group while inserting");
        }
        int i = this.f4970t;
        int i8 = this.i;
        int g3 = g(this.f4953b, r(i));
        int K = K();
        N(this.f4972v);
        o.w wVar = this.f4974x;
        if (wVar != null) {
            while (true) {
                int i9 = wVar.f5560b;
                if (i9 == 0) {
                    break;
                }
                if (i9 == 0) {
                    p.a.e("IntList is empty.");
                    throw null;
                }
                if (wVar.f5559a[0] < i) {
                    break;
                }
                b.v(wVar);
            }
        }
        boolean H = H(i, this.f4970t - i);
        I(g3, this.i - g3, i - 1);
        this.f4970t = i;
        this.i = i8;
        this.f4965o -= K;
        return H;
    }

    public final boolean H(int i, int i8) {
        if (i8 > 0) {
            ArrayList arrayList = this.f4955d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f4956e;
                int i9 = i + i8;
                int b8 = h2.b(this.f4955d, i9, o() - this.f4959h);
                if (b8 >= this.f4955d.size()) {
                    b8--;
                }
                int i10 = b8 + 1;
                int i11 = 0;
                while (b8 >= 0) {
                    a aVar = (a) this.f4955d.get(b8);
                    int c8 = c(aVar);
                    if (c8 < i) {
                        break;
                    }
                    if (c8 < i9) {
                        aVar.f4874a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i11 == 0) {
                            i11 = b8 + 1;
                        }
                        i10 = b8;
                    }
                    b8--;
                }
                r0 = i10 < i11;
                if (r0) {
                    this.f4955d.subList(i10, i11).clear();
                }
            }
            this.f4958g = i;
            this.f4959h += i8;
            int i12 = this.f4963m;
            if (i12 > i) {
                this.f4963m = Math.max(i, i12 - i8);
            }
            int i13 = this.f4971u;
            if (i13 >= this.f4958g) {
                this.f4971u = i13 - i8;
            }
            int i14 = this.f4972v;
            if (i14 >= 0 && (this.f4953b[(r(i14) * 5) + 1] & 67108864) != 0) {
                S(i14);
            }
        }
        return r0;
    }

    public final void I(int i, int i8, int i9) {
        if (i8 > 0) {
            int i10 = this.f4962l;
            int i11 = i + i8;
            B(i11, i9);
            this.f4961k = i;
            this.f4962l = i10 + i8;
            d6.l.L(this.f4954c, i, i11);
            int i12 = this.f4960j;
            if (i12 >= i) {
                this.f4960j = i12 - i8;
            }
        }
    }

    public final Object J(int i, int i8, Object obj) {
        int M = M(this.f4953b, r(i));
        int g3 = g(this.f4953b, r(i + 1));
        int i9 = M + i8;
        if (i9 < M || i9 >= g3) {
            t.c("Write to an invalid slot index " + i8 + " for group " + i);
        }
        int h8 = h(i9);
        Object[] objArr = this.f4954c;
        Object obj2 = objArr[h8];
        objArr[h8] = obj;
        return obj2;
    }

    public final int K() {
        int r7 = r(this.f4970t);
        int a8 = h2.a(this.f4953b, r7) + this.f4970t;
        this.f4970t = a8;
        this.i = g(this.f4953b, r(a8));
        int i = this.f4953b[(r7 * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final void L() {
        int i = this.f4971u;
        this.f4970t = i;
        this.i = g(this.f4953b, r(i));
    }

    public final int M(int[] iArr, int i) {
        if (i >= o()) {
            return this.f4954c.length - this.f4962l;
        }
        int c8 = h2.c(iArr, i);
        return c8 < 0 ? (this.f4954c.length - this.f4962l) + c8 + 1 : c8;
    }

    public final m0 N(int i) {
        a Q;
        HashMap hashMap = this.f4956e;
        if (hashMap == null || (Q = Q(i)) == null) {
            return null;
        }
        return (m0) hashMap.get(Q);
    }

    public final void O() {
        if (this.f4964n != 0) {
            t.c("Key must be supplied when inserting");
        }
        v0 v0Var = n.f5019a;
        P(0, v0Var, v0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(int i, Object obj, Object obj2, boolean z3) {
        int i8;
        int i9 = this.f4972v;
        Object[] objArr = this.f4964n > 0;
        this.f4968r.c(this.f4965o);
        v0 v0Var = n.f5019a;
        if (objArr == true) {
            int i10 = this.f4970t;
            int g3 = g(this.f4953b, r(i10));
            v(1);
            this.i = g3;
            this.f4960j = g3;
            int r7 = r(i10);
            int i11 = obj != v0Var ? 1 : 0;
            int i12 = (z3 || obj2 == v0Var) ? 0 : 1;
            int i13 = i(g3, this.f4961k, this.f4962l, this.f4954c.length);
            if (i13 >= 0 && this.f4963m < i10) {
                i13 = -(((this.f4954c.length - this.f4962l) - i13) + 1);
            }
            int[] iArr = this.f4953b;
            int i14 = this.f4972v;
            int i15 = r7 * 5;
            iArr[i15] = i;
            iArr[i15 + 1] = ((z3 ? 1 : 0) << 30) | (i11 << 29) | (i12 << 28);
            iArr[i15 + 2] = i14;
            iArr[i15 + 3] = 0;
            iArr[i15 + 4] = i13;
            int i16 = (z3 ? 1 : 0) + i11 + i12;
            if (i16 > 0) {
                w(i16, i10);
                Object[] objArr2 = this.f4954c;
                int i17 = this.i;
                if (z3) {
                    objArr2[i17] = obj2;
                    i17++;
                }
                if (i11 != 0) {
                    objArr2[i17] = obj;
                    i17++;
                }
                if (i12 != 0) {
                    objArr2[i17] = obj2;
                    i17++;
                }
                this.i = i17;
            }
            this.f4965o = 0;
            i8 = i10 + 1;
            this.f4972v = i10;
            this.f4970t = i8;
            if (i9 >= 0) {
                N(i9);
            }
        } else {
            this.f4966p.c(i9);
            this.f4967q.c((o() - this.f4959h) - this.f4971u);
            int i18 = this.f4970t;
            int r8 = r(i18);
            if (!q6.i.a(obj2, v0Var)) {
                if (z3) {
                    T(this.f4970t, obj2);
                } else {
                    R(obj2);
                }
            }
            this.i = M(this.f4953b, r8);
            this.f4960j = g(this.f4953b, r(this.f4970t + 1));
            int[] iArr2 = this.f4953b;
            int i19 = r8 * 5;
            this.f4965o = iArr2[i19 + 1] & 67108863;
            this.f4972v = i18;
            this.f4970t = i18 + 1;
            i8 = i18 + iArr2[i19 + 3];
        }
        this.f4971u = i8;
    }

    public final a Q(int i) {
        ArrayList arrayList;
        int e8;
        if (i < 0 || i >= p() || (e8 = h2.e((arrayList = this.f4955d), i, p())) < 0) {
            return null;
        }
        return (a) arrayList.get(e8);
    }

    public final void R(Object obj) {
        int r7 = r(this.f4970t);
        int i = (r7 * 5) + 1;
        if ((this.f4953b[i] & 268435456) == 0) {
            t.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f4954c;
        int[] iArr = this.f4953b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(iArr, r7))] = obj;
    }

    public final void S(int i) {
        if (i >= 0) {
            o.w wVar = this.f4974x;
            if (wVar == null) {
                wVar = new o.w();
                this.f4974x = wVar;
            }
            b.h(wVar, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i, Object obj) {
        int r7 = r(i);
        int[] iArr = this.f4953b;
        boolean z3 = r7 < iArr.length;
        if (!z3) {
            t.c("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f4954c[h(g(this.f4953b, r7))] = obj;
    }

    public final void a(int i) {
        boolean z3 = false;
        if (!(i >= 0)) {
            t.c("Cannot seek backwards");
        }
        if (!(this.f4964n <= 0)) {
            p1.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i8 = this.f4970t + i;
        if (i8 >= this.f4972v && i8 <= this.f4971u) {
            z3 = true;
        }
        if (!z3) {
            t.c("Cannot seek outside the current group (" + this.f4972v + '-' + this.f4971u + ')');
        }
        this.f4970t = i8;
        int g3 = g(this.f4953b, r(i8));
        this.i = g3;
        this.f4960j = g3;
    }

    public final a b(int i) {
        ArrayList arrayList = this.f4955d;
        int e8 = h2.e(arrayList, i, p());
        if (e8 >= 0) {
            return (a) arrayList.get(e8);
        }
        if (i > this.f4958g) {
            i = -(p() - i);
        }
        a aVar = new a(i);
        arrayList.add(-(e8 + 1), aVar);
        return aVar;
    }

    public final int c(a aVar) {
        int i = aVar.f4874a;
        return i < 0 ? p() + i : i;
    }

    public final void d() {
        int i = this.f4964n;
        this.f4964n = i + 1;
        if (i == 0) {
            this.f4967q.c((o() - this.f4959h) - this.f4971u);
        }
    }

    public final void e(boolean z3) {
        this.f4973w = true;
        if (z3 && this.f4966p.f5021b == 0) {
            A(p());
            B(this.f4954c.length - this.f4962l, this.f4958g);
            int i = this.f4961k;
            d6.l.L(this.f4954c, i, this.f4962l + i);
            F();
        }
        int[] iArr = this.f4953b;
        int i8 = this.f4958g;
        Object[] objArr = this.f4954c;
        int i9 = this.f4961k;
        ArrayList arrayList = this.f4955d;
        HashMap hashMap = this.f4956e;
        o.x xVar = this.f4957f;
        f2 f2Var = this.f4952a;
        if (!f2Var.f4933j) {
            p1.a("Unexpected writer close()");
        }
        f2Var.f4933j = false;
        f2Var.f4928d = iArr;
        f2Var.f4929e = i8;
        f2Var.f4930f = objArr;
        f2Var.f4931g = i9;
        f2Var.f4935l = arrayList;
        f2Var.f4936m = hashMap;
        f2Var.f4937n = xVar;
    }

    public final int f(int i) {
        return g(this.f4953b, r(i));
    }

    public final int g(int[] iArr, int i) {
        if (i >= o()) {
            return this.f4954c.length - this.f4962l;
        }
        int i8 = iArr[(i * 5) + 4];
        return i8 < 0 ? (this.f4954c.length - this.f4962l) + i8 + 1 : i8;
    }

    public final int h(int i) {
        return (this.f4962l * (i < this.f4961k ? 0 : 1)) + i;
    }

    public final void j() {
        o.e0 e0Var;
        boolean z3 = this.f4964n > 0;
        int i = this.f4970t;
        int i8 = this.f4971u;
        int i9 = this.f4972v;
        int r7 = r(i9);
        int i10 = this.f4965o;
        int i11 = i - i9;
        int i12 = r7 * 5;
        int i13 = i12 + 1;
        boolean z7 = (this.f4953b[i13] & 1073741824) != 0;
        n0 n0Var = this.f4968r;
        if (z3) {
            o.x xVar = this.f4969s;
            if (xVar != null && (e0Var = (o.e0) xVar.b(i9)) != null) {
                Object[] objArr = e0Var.f5442a;
                int i14 = e0Var.f5443b;
                for (int i15 = 0; i15 < i14; i15++) {
                    E(objArr[i15]);
                }
            }
            int[] iArr = this.f4953b;
            iArr[i12 + 3] = i11;
            h2.d(r7, i10, iArr);
            int b8 = n0Var.b();
            if (z7) {
                i10 = 1;
            }
            this.f4965o = b8 + i10;
            int D = D(this.f4953b, i9);
            this.f4972v = D;
            int p7 = D < 0 ? p() : r(D + 1);
            int g3 = p7 >= 0 ? g(this.f4953b, p7) : 0;
            this.i = g3;
            this.f4960j = g3;
            return;
        }
        if (i != i8) {
            t.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f4953b;
        int i16 = i12 + 3;
        int i17 = iArr2[i16];
        int i18 = iArr2[i13] & 67108863;
        iArr2[i16] = i11;
        h2.d(r7, i10, iArr2);
        int b9 = this.f4966p.b();
        this.f4971u = (o() - this.f4959h) - this.f4967q.b();
        this.f4972v = b9;
        int D2 = D(this.f4953b, i9);
        int b10 = n0Var.b();
        this.f4965o = b10;
        if (D2 == b9) {
            this.f4965o = b10 + (z7 ? 0 : i10 - i18);
            return;
        }
        int i19 = i11 - i17;
        int i20 = z7 ? 0 : i10 - i18;
        if (i19 != 0 || i20 != 0) {
            while (D2 != 0 && D2 != b9 && (i20 != 0 || i19 != 0)) {
                int r8 = r(D2);
                if (i19 != 0) {
                    int[] iArr3 = this.f4953b;
                    int i21 = (r8 * 5) + 3;
                    iArr3[i21] = iArr3[i21] + i19;
                }
                if (i20 != 0) {
                    int[] iArr4 = this.f4953b;
                    h2.d(r8, (iArr4[(r8 * 5) + 1] & 67108863) + i20, iArr4);
                }
                int[] iArr5 = this.f4953b;
                if ((iArr5[(r8 * 5) + 1] & 1073741824) != 0) {
                    i20 = 0;
                }
                D2 = D(iArr5, D2);
            }
        }
        this.f4965o += i20;
    }

    public final void k() {
        if (this.f4964n <= 0) {
            p1.b("Unbalanced begin/end insert");
        }
        int i = this.f4964n - 1;
        this.f4964n = i;
        if (i == 0) {
            if (this.f4968r.f5021b != this.f4966p.f5021b) {
                t.c("startGroup/endGroup mismatch while inserting");
            }
            this.f4971u = (o() - this.f4959h) - this.f4967q.b();
        }
    }

    public final void l(int i) {
        boolean z3 = false;
        if (!(this.f4964n <= 0)) {
            t.c("Cannot call ensureStarted() while inserting");
        }
        int i8 = this.f4972v;
        if (i8 != i) {
            if (i >= i8 && i < this.f4971u) {
                z3 = true;
            }
            if (!z3) {
                t.c("Started group at " + i + " must be a subgroup of the group at " + i8);
            }
            int i9 = this.f4970t;
            int i10 = this.i;
            int i11 = this.f4960j;
            this.f4970t = i;
            O();
            this.f4970t = i9;
            this.i = i10;
            this.f4960j = i11;
        }
    }

    public final void m(int i, int i8, int i9) {
        if (i >= this.f4958g) {
            i = -((p() - i) + 2);
        }
        while (i9 < i8) {
            this.f4953b[(r(i9) * 5) + 2] = i;
            int i10 = this.f4953b[(r(i9) * 5) + 3] + i9;
            m(i9, i10, i9 + 1);
            i9 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i, p6.e eVar) {
        int i8;
        int i9;
        a aVar;
        p6.e eVar2 = eVar;
        int D = D(this.f4953b, i);
        int p7 = p();
        int t3 = t(i) + i;
        int i10 = i;
        o.y yVar = null;
        o.w wVar = null;
        loop0: while (i10 < t3) {
            int i11 = i10 + 1;
            int f6 = f(i11);
            for (int f8 = f(i10); f8 < f6; f8++) {
                Object obj = this.f4954c[h(f8)];
                if ((obj instanceof b2) && (aVar = ((b2) obj).f4882b) != null && aVar.a()) {
                    int c8 = c(aVar);
                    if (yVar == null) {
                        int[] iArr = o.n.f5513a;
                        yVar = new o.y();
                    }
                    if (wVar == null) {
                        wVar = new o.w();
                    }
                    yVar.a(c8);
                    wVar.a(c8);
                    wVar.a(f8);
                } else {
                    eVar2.g(Integer.valueOf(f8), obj);
                }
            }
            int D2 = i11 < p7 ? D(this.f4953b, i11) : -1;
            if (D2 != i10) {
                while (true) {
                    if (wVar == null || yVar == null || !yVar.e(i10)) {
                        i8 = p7;
                    } else {
                        int i12 = wVar.f5560b;
                        int i13 = i12 / 2;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < i13) {
                            int i16 = i14 * 2;
                            int i17 = p7;
                            int b8 = wVar.b(i16);
                            if (b8 == i10) {
                                int b9 = wVar.b(i16 + 1);
                                eVar2.g(Integer.valueOf(b9), this.f4954c[h(b9)]);
                            } else if (i16 != i15) {
                                int i18 = i15 + 1;
                                wVar.d(i15, b8);
                                i15 += 2;
                                wVar.d(i18, wVar.b(i16 + 1));
                            } else {
                                i15 += 2;
                            }
                            i14++;
                            eVar2 = eVar;
                            p7 = i17;
                        }
                        i8 = p7;
                        if (i15 != i12) {
                            if (i15 < 0 || i15 > (i9 = wVar.f5560b) || i12 < 0 || i12 > i9) {
                                break loop0;
                            }
                            if (i12 < i15) {
                                p.a.c("The end index must be < start index");
                                throw null;
                            }
                            if (i12 != i15) {
                                if (i12 < i9) {
                                    int[] iArr2 = wVar.f5559a;
                                    d6.l.F(i15, i12, i9, iArr2, iArr2);
                                }
                                wVar.f5560b -= i12 - i15;
                            }
                        }
                    }
                    if (i10 != i && D != D2) {
                        i10 = D;
                        p7 = i8;
                        D = D(this.f4953b, D);
                        eVar2 = eVar;
                    }
                }
            } else {
                i8 = p7;
            }
            eVar2 = eVar;
            D = D2;
            i10 = i11;
            p7 = i8;
        }
    }

    public final int o() {
        return this.f4953b.length / 5;
    }

    public final int p() {
        return o() - this.f4959h;
    }

    public final Object q(int i) {
        int r7 = r(i);
        int[] iArr = this.f4953b;
        int i8 = (r7 * 5) + 1;
        if ((iArr[i8] & 268435456) == 0) {
            return n.f5019a;
        }
        return this.f4954c[Integer.bitCount(iArr[i8] >> 29) + g(iArr, r7)];
    }

    public final int r(int i) {
        return (this.f4959h * (i < this.f4958g ? 0 : 1)) + i;
    }

    public final Object s(int i) {
        int r7 = r(i);
        int[] iArr = this.f4953b;
        int i8 = r7 * 5;
        int i9 = iArr[i8 + 1];
        if ((536870912 & i9) == 0) {
            return null;
        }
        return this.f4954c[Integer.bitCount(i9 >> 30) + iArr[i8 + 4]];
    }

    public final int t(int i) {
        return h2.a(this.f4953b, r(i));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f4970t + " end=" + this.f4971u + " size = " + p() + " gap=" + this.f4958g + '-' + (this.f4958g + this.f4959h) + ')';
    }

    public final boolean u(int i, int i8) {
        int o2;
        int t3;
        if (i8 == this.f4972v) {
            o2 = this.f4971u;
        } else {
            n0 n0Var = this.f4966p;
            if (i8 > n0Var.a(0)) {
                t3 = t(i8);
            } else {
                int[] iArr = n0Var.f5020a;
                int min = Math.min(iArr.length, n0Var.f5021b);
                int i9 = 0;
                while (true) {
                    if (i9 >= min) {
                        i9 = -1;
                        break;
                    }
                    if (iArr[i9] == i8) {
                        break;
                    }
                    i9++;
                }
                if (i9 < 0) {
                    t3 = t(i8);
                } else {
                    o2 = (o() - this.f4959h) - this.f4967q.f5020a[i9];
                }
            }
            o2 = t3 + i8;
        }
        return i > i8 && i < o2;
    }

    public final void v(int i) {
        if (i > 0) {
            int i8 = this.f4970t;
            A(i8);
            int i9 = this.f4958g;
            int i10 = this.f4959h;
            int[] iArr = this.f4953b;
            int length = iArr.length / 5;
            int i11 = length - i10;
            if (i10 < i) {
                int max = Math.max(Math.max(length * 2, i11 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i12 = max - i11;
                d6.l.F(0, 0, i9 * 5, iArr, iArr2);
                d6.l.F((i9 + i12) * 5, (i10 + i9) * 5, length * 5, iArr, iArr2);
                this.f4953b = iArr2;
                i10 = i12;
            }
            int i13 = this.f4971u;
            if (i13 >= i9) {
                this.f4971u = i13 + i;
            }
            int i14 = i9 + i;
            this.f4958g = i14;
            this.f4959h = i10 - i;
            int i15 = i(i11 > 0 ? f(i8 + i) : 0, this.f4963m >= i9 ? this.f4961k : 0, this.f4962l, this.f4954c.length);
            for (int i16 = i9; i16 < i14; i16++) {
                this.f4953b[(i16 * 5) + 4] = i15;
            }
            int i17 = this.f4963m;
            if (i17 >= i9) {
                this.f4963m = i17 + i;
            }
        }
    }

    public final void w(int i, int i8) {
        if (i > 0) {
            B(this.i, i8);
            int i9 = this.f4961k;
            int i10 = this.f4962l;
            if (i10 < i) {
                Object[] objArr = this.f4954c;
                int length = objArr.length;
                int i11 = length - i10;
                int max = Math.max(Math.max(length * 2, i11 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i12 = 0; i12 < max; i12++) {
                    objArr2[i12] = null;
                }
                int i13 = max - i11;
                int i14 = i10 + i9;
                System.arraycopy(objArr, 0, objArr2, 0, i9);
                System.arraycopy(objArr, i14, objArr2, i9 + i13, length - i14);
                this.f4954c = objArr2;
                i10 = i13;
            }
            int i15 = this.f4960j;
            if (i15 >= i9) {
                this.f4960j = i15 + i;
            }
            this.f4961k = i9 + i;
            this.f4962l = i10 - i;
        }
    }

    public final boolean x(int i) {
        return (this.f4953b[(r(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void z(f2 f2Var, int i) {
        if (this.f4964n <= 0) {
            t.c("Check failed");
        }
        if (i == 0 && this.f4970t == 0 && this.f4952a.f4929e == 0) {
            int[] iArr = f2Var.f4928d;
            int i8 = iArr[(i * 5) + 3];
            int i9 = f2Var.f4929e;
            if (i8 == i9) {
                int[] iArr2 = this.f4953b;
                Object[] objArr = this.f4954c;
                ArrayList arrayList = this.f4955d;
                HashMap hashMap = this.f4956e;
                o.x xVar = this.f4957f;
                Object[] objArr2 = f2Var.f4930f;
                int i10 = f2Var.f4931g;
                HashMap hashMap2 = f2Var.f4936m;
                o.x xVar2 = f2Var.f4937n;
                this.f4953b = iArr;
                this.f4954c = objArr2;
                this.f4955d = f2Var.f4935l;
                this.f4958g = i9;
                this.f4959h = (iArr.length / 5) - i9;
                this.f4961k = i10;
                this.f4962l = objArr2.length - i10;
                this.f4963m = i9;
                this.f4956e = hashMap2;
                this.f4957f = xVar2;
                f2Var.f4928d = iArr2;
                f2Var.f4929e = 0;
                f2Var.f4930f = objArr;
                f2Var.f4931g = 0;
                f2Var.f4935l = arrayList;
                f2Var.f4936m = hashMap;
                f2Var.f4937n = xVar;
                return;
            }
        }
        i2 e8 = f2Var.e();
        try {
            b.p(e8, i, this, true, true, false);
            e8.e(true);
        } catch (Throwable th) {
            e8.e(false);
            throw th;
        }
    }
}
