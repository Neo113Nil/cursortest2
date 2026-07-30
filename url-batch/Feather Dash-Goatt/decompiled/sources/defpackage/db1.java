package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class db1 {
    public final ab1 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public en0 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final da0 p;
    public final da0 q;
    public final da0 r;
    public en0 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public dn0 x;

    public db1(ab1 ab1Var) {
        this.a = ab1Var;
        int[] iArr = ab1Var.d;
        this.b = iArr;
        Object[] objArr = ab1Var.g;
        this.c = objArr;
        this.d = ab1Var.m;
        this.e = ab1Var.n;
        this.f = ab1Var.o;
        int i = ab1Var.e;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = ab1Var.h;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new da0();
        this.q = new da0();
        this.r = new da0();
        this.u = i;
        this.v = -1;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void z(db1 db1Var) {
        int i = db1Var.v;
        int r = db1Var.r(i);
        int[] iArr = db1Var.b;
        int i2 = (r * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        db1Var.T(db1Var.E(iArr, i));
    }

    public final void A(ab1 ab1Var, int i) {
        if (this.n <= 0) {
            kl.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.e == 0) {
            int[] iArr = ab1Var.d;
            int i2 = iArr[(i * 5) + 3];
            int i3 = ab1Var.e;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                en0 en0Var = this.f;
                Object[] objArr2 = ab1Var.g;
                int i4 = ab1Var.h;
                HashMap hashMap2 = ab1Var.n;
                en0 en0Var2 = ab1Var.o;
                this.b = iArr;
                this.c = objArr2;
                this.d = ab1Var.m;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = hashMap2;
                this.f = en0Var2;
                ab1Var.d = iArr2;
                ab1Var.e = 0;
                ab1Var.g = objArr;
                ab1Var.h = 0;
                ab1Var.m = arrayList;
                ab1Var.n = hashMap;
                ab1Var.o = en0Var;
                return;
            }
        }
        db1 e = ab1Var.e();
        try {
            y90.y(e, i, this, true, true, false);
            e.e(true);
        } catch (Throwable th) {
            e.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.w9.a(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.w9.a(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i) {
        d3 d3Var;
        int i2;
        d3 d3Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int o = o() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int a = cb1.a(arrayList, i6, o); a < this.d.size() && (i3 = (d3Var2 = (d3) this.d.get(a)).a) < 0 && (i4 = i3 + o) < i; a++) {
                        d3Var2.a = i4;
                    }
                } else {
                    for (int a2 = cb1.a(arrayList, i, o); a2 < this.d.size() && (i2 = (d3Var = (d3) this.d.get(a2)).a) >= 0; a2++) {
                        d3Var.a = -(o - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int o2 = o();
            if (i6 >= o2) {
                kl.a("Check failed");
            }
            while (i6 < o2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.b[i7];
                int p = i8 > -2 ? i8 : (p() + i8) - (-2);
                if (p >= i) {
                    p = -((p() - p) - (-2));
                }
                if (p != i8) {
                    this.b[i7] = p;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void C(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, p());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int r = r(min);
                int r2 = r(i5);
                int i7 = this.g;
                while (r < r2) {
                    int i8 = (r * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        kl.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    r++;
                    if (r == i7) {
                        r += this.h;
                    }
                }
            } else {
                int r3 = r(i5);
                int r4 = r(min);
                while (r3 < r4) {
                    int i10 = (r3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        kl.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    r3++;
                    if (r3 == this.g) {
                        r3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final Object D(int i) {
        int r = r(i);
        int[] iArr = this.b;
        if ((iArr[(r * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(iArr, r))];
        }
        return null;
    }

    public final int E(int[] iArr, int i) {
        int i2 = iArr[(r(i) * 5) + 2];
        return i2 > -2 ? i2 : (p() + i2) - (-2);
    }

    public final Object F(Object obj) {
        if (this.n > 0) {
            x(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            kl.a("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i;
        dn0 dn0Var = this.x;
        if (dn0Var != null) {
            while (dn0Var.b != 0) {
                int K = t80.K(dn0Var);
                int r = r(K);
                int i2 = K + 1;
                int u = u(K) + K;
                while (true) {
                    if (i2 >= u) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(r(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += u(i2);
                    }
                }
                int[] iArr = this.b;
                int i3 = (r * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int E = E(iArr, K);
                    if (E >= 0) {
                        t80.b(dn0Var, E);
                    }
                }
            }
        }
    }

    public final boolean H() {
        if (this.n != 0) {
            kl.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int g = g(this.b, r(i));
        int L = L();
        O(this.v);
        dn0 dn0Var = this.x;
        if (dn0Var != null) {
            while (true) {
                int i3 = dn0Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                if (dn0Var.a[0] < i) {
                    break;
                }
                t80.K(dn0Var);
            }
        }
        boolean I = I(i, this.t - i);
        J(g, this.i - g, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= L;
        return I;
    }

    public final boolean I(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            B(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int a = cb1.a(this.d, i3, o() - this.h);
                if (a >= this.d.size()) {
                    a--;
                }
                int i4 = a + 1;
                int i5 = 0;
                while (a >= 0) {
                    d3 d3Var = (d3) this.d.get(a);
                    int c = c(d3Var);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        d3Var.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = a + 1;
                        }
                        i4 = a;
                    }
                    a--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(r(i8) * 5) + 1] & 67108864) != 0) {
                T(i8);
            }
        }
        return r0;
    }

    public final void J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            C(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object K(int i, int i2, Object obj) {
        int N = N(this.b, r(i));
        int g = g(this.b, r(i + 1));
        int i3 = N + i2;
        if (i3 < N || i3 >= g) {
            kl.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int h = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[h];
        objArr[h] = obj;
        return obj2;
    }

    public final int L() {
        int r = r(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = r * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = g(iArr, r(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void M() {
        int i = this.u;
        this.t = i;
        this.i = g(this.b, r(i));
    }

    public final int N(int[] iArr, int i) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int b = cb1.b(iArr, i);
        return b < 0 ? (this.c.length - this.l) + b + 1 : b;
    }

    public final t50 O(int i) {
        d3 R;
        HashMap hashMap = this.e;
        if (hashMap == null || (R = R(i)) == null) {
            return null;
        }
        return (t50) hashMap.get(R);
    }

    public final void P() {
        if (this.n != 0) {
            kl.a("Key must be supplied when inserting");
        }
        j41 j41Var = bl.a;
        Q(0, j41Var, j41Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.c(this.o);
        j41 j41Var = bl.a;
        if (objArr == true) {
            int i4 = this.t;
            int g = g(this.b, r(i4));
            w(1);
            this.i = g;
            this.j = g;
            int r = r(i4);
            int i5 = obj != j41Var ? 1 : 0;
            int i6 = (z || obj2 == j41Var) ? 0 : 1;
            int i7 = i(g, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i4) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = r * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i5 + i6;
            if (i10 > 0) {
                x(i10, i4);
                Object[] objArr2 = this.c;
                int i11 = this.i;
                if (z) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                if (i5 != 0) {
                    objArr2[i11] = obj;
                    i11++;
                }
                if (i6 != 0) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                O(i3);
            }
        } else {
            this.p.c(i3);
            this.q.c((o() - this.h) - this.u);
            int i12 = this.t;
            int r2 = r(i12);
            if (!Intrinsics.a(obj2, j41Var)) {
                if (z) {
                    U(this.t, obj2);
                } else {
                    S(obj2);
                }
            }
            this.i = N(this.b, r2);
            this.j = g(this.b, r(this.t + 1));
            int[] iArr2 = this.b;
            int i13 = r2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    public final d3 R(int i) {
        ArrayList arrayList;
        int d;
        if (i < 0 || i >= p() || (d = cb1.d((arrayList = this.d), i, p())) < 0) {
            return null;
        }
        return (d3) arrayList.get(d);
    }

    public final void S(Object obj) {
        int r = r(this.t);
        int i = (r * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            kl.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(iArr, r))] = obj;
    }

    public final void T(int i) {
        if (i >= 0) {
            dn0 dn0Var = this.x;
            if (dn0Var == null) {
                dn0Var = new dn0();
                this.x = dn0Var;
            }
            t80.b(dn0Var, i);
        }
    }

    public final void U(int i, Object obj) {
        int r = r(i);
        int[] iArr = this.b;
        if (r >= iArr.length || (iArr[(r * 5) + 1] & 1073741824) == 0) {
            kl.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[h(g(this.b, r))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            kl.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            cy0.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            kl.a("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int g = g(this.b, r(i2));
        this.i = g;
        this.j = g;
    }

    public final d3 b(int i) {
        ArrayList arrayList = this.d;
        int d = cb1.d(arrayList, i, p());
        if (d >= 0) {
            return (d3) arrayList.get(d);
        }
        if (i > this.g) {
            i = -(p() - i);
        }
        d3 d3Var = new d3(i);
        arrayList.add(-(d + 1), d3Var);
        return d3Var;
    }

    public final int c(d3 d3Var) {
        int i = d3Var.a;
        return i < 0 ? p() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((o() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            B(p());
            C(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            G();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        en0 en0Var = this.f;
        ab1 ab1Var = this.a;
        if (!ab1Var.k) {
            cy0.a("Unexpected writer close()");
        }
        ab1Var.k = false;
        ab1Var.d = iArr;
        ab1Var.e = i2;
        ab1Var.g = objArr;
        ab1Var.h = i3;
        ab1Var.m = arrayList;
        ab1Var.n = hashMap;
        ab1Var.o = en0Var;
    }

    public final int f(int i) {
        return g(this.b, r(i));
    }

    public final int g(int[] iArr, int i) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int h(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void j() {
        mn0 mn0Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int r = r(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = r * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        da0 da0Var = this.r;
        if (z) {
            en0 en0Var = this.s;
            if (en0Var != null && (mn0Var = (mn0) en0Var.b(i3)) != null) {
                Object[] objArr = mn0Var.a;
                int i8 = mn0Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    F(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            cb1.c(iArr, r, i4);
            int b = da0Var.b();
            if (z2) {
                i4 = 1;
            }
            this.o = b + i4;
            int E = E(this.b, i3);
            this.v = E;
            int p = E < 0 ? p() : r(E + 1);
            int g = p >= 0 ? g(this.b, p) : 0;
            this.i = g;
            this.j = g;
            return;
        }
        if (i != i2) {
            kl.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        cb1.c(iArr2, r, i4);
        int b2 = this.p.b();
        this.u = (o() - this.h) - this.q.b();
        this.v = b2;
        int E2 = E(this.b, i3);
        int b3 = da0Var.b();
        this.o = b3;
        if (E2 == b2) {
            this.o = b3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (E2 != 0 && E2 != b2 && (i14 != 0 || i13 != 0)) {
                int r2 = r(E2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (r2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    cb1.c(iArr4, r2, (iArr4[(r2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(r2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                E2 = E(iArr5, E2);
            }
        }
        this.o += i14;
    }

    public final void k() {
        if (this.n <= 0) {
            cy0.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                kl.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (o() - this.h) - this.q.b();
        }
    }

    public final void l(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            kl.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                kl.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            P();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((p() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(r(i3) * 5) + 2] = i;
            int i4 = this.b[(r(i3) * 5) + 3] + i3;
            m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x011e, code lost:
    
        throw new java.lang.IndexOutOfBoundsException("Index must be between 0 and size");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i, Function2 function2) {
        int i2;
        int i3;
        int i4;
        int i5;
        Function2 function22 = function2;
        int E = E(this.b, i);
        int p = p();
        int u = u(i) + i;
        fn0 fn0Var = null;
        int i6 = i;
        dn0 dn0Var = null;
        loop0: while (i6 < u) {
            int f = f(i6);
            int i7 = i6 + 1;
            int f2 = f(i7);
            while (f < f2) {
                Object obj = this.c[h(f)];
                if (!(obj instanceof k21) || (i5 = ((k21) obj).b) < 0) {
                    i4 = E;
                    function22.b(Integer.valueOf(f), obj);
                } else {
                    int u2 = u(i6) + i6;
                    int i8 = i7;
                    int i9 = 0;
                    while (i8 < u2 && i9 < i5) {
                        int r = r(i8);
                        int i10 = E;
                        int[] iArr = this.b;
                        int i11 = r * 5;
                        i8 = iArr[i11 + 3] + i8;
                        if (i8 < u2 && (iArr[i11 + 1] & 536870912) == 0) {
                            i9++;
                        }
                        E = i10;
                    }
                    i4 = E;
                    if (fn0Var == null) {
                        int[] iArr2 = aa0.a;
                        fn0Var = new fn0();
                    }
                    if (dn0Var == null) {
                        dn0Var = new dn0();
                    }
                    fn0Var.a(i8);
                    dn0Var.a(i8);
                    dn0Var.a(f);
                }
                f++;
                E = i4;
            }
            int i12 = E;
            E = i7 < p ? E(this.b, i7) : -1;
            if (E != i6) {
                int i13 = i6;
                int i14 = i12;
                while (true) {
                    if (dn0Var == null || fn0Var == null || !fn0Var.e(i13)) {
                        i2 = p;
                    } else {
                        int i15 = dn0Var.b;
                        int i16 = i15 / 2;
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < i16) {
                            int i19 = i17 * 2;
                            int i20 = p;
                            int c = dn0Var.c(i19);
                            if (c == i13) {
                                int c2 = dn0Var.c(i19 + 1);
                                function22.b(Integer.valueOf(c2), this.c[h(c2)]);
                            } else if (i19 != i18) {
                                int i21 = i18 + 1;
                                dn0Var.e(i18, c);
                                i18 += 2;
                                dn0Var.e(i21, dn0Var.c(i19 + 1));
                            } else {
                                i18 += 2;
                            }
                            i17++;
                            function22 = function2;
                            p = i20;
                        }
                        i2 = p;
                        if (i18 != i15) {
                            if (i18 < 0 || i18 > (i3 = dn0Var.b) || i15 < 0 || i15 > i3) {
                                break loop0;
                            }
                            if (i15 < i18) {
                                dd0.e("The end index must be < start index");
                                return;
                            } else if (i15 != i18) {
                                if (i15 < i3) {
                                    int[] iArr3 = dn0Var.a;
                                    w9.a(iArr3, iArr3, i18, i15, i3);
                                }
                                dn0Var.b -= i15 - i18;
                            }
                        }
                    }
                    if (i13 != i && i14 != E) {
                        i13 = i14;
                        p = i2;
                        i14 = E(this.b, i14);
                        function22 = function2;
                    }
                }
            } else {
                i2 = p;
            }
            function22 = function2;
            i6 = i7;
            p = i2;
        }
    }

    public final int o() {
        return this.b.length / 5;
    }

    public final int p() {
        return o() - this.h;
    }

    public final Object q(int i) {
        int r = r(i);
        int[] iArr = this.b;
        int i2 = (r * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return bl.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + g(iArr, r)];
    }

    public final int r(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int s(int i) {
        return this.b[r(i) * 5];
    }

    public final Object t(int i) {
        int r = r(i);
        int[] iArr = this.b;
        int i2 = r * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + p() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final int u(int i) {
        return this.b[(r(i) * 5) + 3];
    }

    public final boolean v(int i, int i2) {
        int o;
        int u;
        if (i2 == this.v) {
            o = this.u;
        } else {
            da0 da0Var = this.p;
            if (i2 > da0Var.a(0)) {
                u = u(i2);
            } else {
                int[] iArr = da0Var.a;
                int min = Math.min(iArr.length, da0Var.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    u = u(i2);
                } else {
                    o = (o() - this.h) - this.q.a[i3];
                }
            }
            o = u + i2;
        }
        return i > i2 && i < o;
    }

    public final void w(int i) {
        if (i > 0) {
            int i2 = this.t;
            B(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                w9.a(iArr, iArr2, 0, 0, i3 * 5);
                w9.a(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int i9 = i(i5 > 0 ? f(i2 + i) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i8; i10++) {
                this.b[(i10 * 5) + 4] = i9;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    public final void x(int i, int i2) {
        if (i > 0) {
            C(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean y(int i) {
        return (this.b[(r(i) * 5) + 1] & 1073741824) != 0;
    }
}
