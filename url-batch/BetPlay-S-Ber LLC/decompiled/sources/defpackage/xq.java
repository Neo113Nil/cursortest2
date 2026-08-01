package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class xq {
    public static boolean q = false;
    public final qx d;
    public final r6 m;
    public f7 p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public p30[] n = new p30[1000];
    public int o = 0;
    public f7[] g = new f7[32];

    public xq() {
        s();
        r6 r6Var = new r6();
        r6Var.b = new mx();
        r6Var.c = new mx();
        r6Var.d = new p30[32];
        this.m = r6Var;
        qx qxVar = new qx(r6Var);
        qxVar.f = new p30[128];
        qxVar.g = new p30[128];
        qxVar.h = 0;
        qxVar.i = new h5(19, qxVar);
        this.d = qxVar;
        this.p = new f7(r6Var);
    }

    public static int n(Object obj) {
        p30 p30Var = ((pc) obj).i;
        if (p30Var != null) {
            return (int) (p30Var.j + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final p30 a(int i) {
        mx mxVar = (mx) this.m.c;
        int i2 = mxVar.b;
        p30 p30Var = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = mxVar.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            mxVar.b = i3;
            p30Var = r4;
        }
        p30 p30Var2 = p30Var;
        if (p30Var2 == null) {
            p30Var2 = new p30(i);
            p30Var2.q = i;
        } else {
            p30Var2.c();
            p30Var2.q = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (p30[]) Arrays.copyOf(this.n, i6);
        }
        p30[] p30VarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        p30VarArr[i7] = p30Var2;
        return p30Var2;
    }

    public final void b(p30 p30Var, p30 p30Var2, int i, float f, p30 p30Var3, p30 p30Var4, int i2, int i3) {
        f7 l = l();
        if (p30Var2 == p30Var3) {
            l.d.g(p30Var, 1.0f);
            l.d.g(p30Var4, 1.0f);
            l.d.g(p30Var2, -2.0f);
        } else {
            y6 y6Var = l.d;
            if (f == 0.5f) {
                y6Var.g(p30Var, 1.0f);
                l.d.g(p30Var2, -1.0f);
                l.d.g(p30Var3, -1.0f);
                l.d.g(p30Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                y6Var.g(p30Var, -1.0f);
                l.d.g(p30Var2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                y6Var.g(p30Var4, -1.0f);
                l.d.g(p30Var3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                y6Var.g(p30Var, f2 * 1.0f);
                l.d.g(p30Var2, f2 * (-1.0f));
                l.d.g(p30Var3, (-1.0f) * f);
                l.d.g(p30Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    l.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            l.a(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
    
        if (r4.p <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
    
        if (r4.p <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f2, code lost:
    
        if (r4.p <= 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ff, code lost:
    
        if (r4.p <= 1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(f7 f7Var) {
        boolean z;
        boolean z2;
        p30 p30Var;
        p30 f;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (f7Var.e) {
            z = false;
        } else {
            ArrayList arrayList = f7Var.c;
            if (this.g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int d = f7Var.d.d();
                    for (int i = 0; i < d; i++) {
                        p30 e = f7Var.d.e(i);
                        if (e.h != -1 || e.k) {
                            arrayList.add(e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            p30 p30Var2 = (p30) arrayList.get(i2);
                            if (p30Var2.k) {
                                f7Var.h(this, p30Var2, true);
                            } else {
                                f7Var.i(this, this.g[p30Var2.h], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (f7Var.a != null && f7Var.d.d() == 0) {
                    f7Var.e = true;
                    this.b = true;
                }
            }
            if (f7Var.e()) {
                return;
            }
            float f2 = f7Var.b;
            float f3 = 0.0f;
            if (f2 < 0.0f) {
                f7Var.b = f2 * (-1.0f);
                y6 y6Var = f7Var.d;
                int i3 = y6Var.h;
                for (int i4 = 0; i3 != -1 && i4 < y6Var.a; i4++) {
                    float[] fArr = y6Var.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = y6Var.f[i3];
                }
            }
            int d2 = f7Var.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            p30 p30Var3 = null;
            p30 p30Var4 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < d2) {
                float f6 = f7Var.d.f(i5);
                p30 e2 = f7Var.d.e(i5);
                float f7 = f3;
                if (e2.q == 1) {
                    if (p30Var3 != null) {
                        if (f4 <= f6) {
                            if (!z4) {
                                if (e2.p > 1) {
                                }
                            }
                        }
                        z4 = true;
                    }
                    p30Var3 = e2;
                    f4 = f6;
                } else if (p30Var3 == null && f6 < f7) {
                    if (p30Var4 != null) {
                        if (f5 <= f6) {
                            if (!z5) {
                                if (e2.p > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    p30Var4 = e2;
                    f5 = f6;
                }
                i5++;
                f3 = f7;
            }
            float f8 = f3;
            if (p30Var3 == null) {
                p30Var3 = p30Var4;
            }
            if (p30Var3 == null) {
                z2 = true;
            } else {
                f7Var.g(p30Var3);
                z2 = false;
            }
            if (f7Var.d.d() == 0) {
                f7Var.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                p30 a = a(3);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                a.g = i6;
                r6 r6Var = this.m;
                ((p30[]) r6Var.d)[i6] = a;
                f7Var.a = a;
                int i7 = this.k;
                h(f7Var);
                if (this.k == i7 + 1) {
                    f7 f7Var2 = this.p;
                    f7Var2.a = null;
                    f7Var2.d.b();
                    for (int i8 = 0; i8 < f7Var.d.d(); i8++) {
                        f7Var2.d.a(f7Var.d.e(i8), f7Var.d.f(i8), true);
                    }
                    r(this.p);
                    if (a.h == -1) {
                        if (f7Var.a == a && (f = f7Var.f(null, a)) != null) {
                            f7Var.g(f);
                        }
                        if (!f7Var.e) {
                            f7Var.a.e(this, f7Var);
                        }
                        ((mx) r6Var.b).b(f7Var);
                        this.k--;
                    }
                    z = true;
                    p30Var = f7Var.a;
                    if (p30Var != null) {
                        return;
                    }
                    if (p30Var.q != 1 && f7Var.b < f8) {
                        return;
                    }
                }
            }
            z = false;
            p30Var = f7Var.a;
            if (p30Var != null) {
            }
        }
        if (z) {
            return;
        }
        h(f7Var);
    }

    public final void d(p30 p30Var, int i) {
        int i2 = p30Var.h;
        if (i2 == -1) {
            p30Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                p30 p30Var2 = ((p30[]) this.m.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            f7 l = l();
            l.a = p30Var;
            float f = i;
            p30Var.j = f;
            l.b = f;
            l.e = true;
            c(l);
            return;
        }
        f7 f7Var = this.g[i2];
        if (f7Var.e) {
            f7Var.b = i;
            return;
        }
        if (f7Var.d.d() == 0) {
            f7Var.e = true;
            f7Var.b = i;
            return;
        }
        f7 l2 = l();
        if (i < 0) {
            l2.b = i * (-1);
            l2.d.g(p30Var, 1.0f);
        } else {
            l2.b = i;
            l2.d.g(p30Var, -1.0f);
        }
        c(l2);
    }

    public final void e(p30 p30Var, p30 p30Var2, int i, int i2) {
        if (i2 == 8 && p30Var2.k && p30Var.h == -1) {
            p30Var.d(this, p30Var2.j + i);
            return;
        }
        f7 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        y6 y6Var = l.d;
        if (z) {
            y6Var.g(p30Var, 1.0f);
            l.d.g(p30Var2, -1.0f);
        } else {
            y6Var.g(p30Var, -1.0f);
            l.d.g(p30Var2, 1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(p30 p30Var, p30 p30Var2, int i, int i2) {
        f7 l = l();
        p30 m = m();
        m.i = 0;
        l.b(p30Var, p30Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(p30 p30Var, p30 p30Var2, int i, int i2) {
        f7 l = l();
        p30 m = m();
        m.i = 0;
        l.c(p30Var, p30Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(f7 f7Var) {
        int i;
        if (f7Var.e) {
            f7Var.a.d(this, f7Var.b);
        } else {
            f7[] f7VarArr = this.g;
            int i2 = this.k;
            f7VarArr[i2] = f7Var;
            p30 p30Var = f7Var.a;
            p30Var.h = i2;
            this.k = i2 + 1;
            p30Var.e(this, f7Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                f7 f7Var2 = this.g[i3];
                if (f7Var2 != null && f7Var2.e) {
                    f7Var2.a.d(this, f7Var2.b);
                    ((mx) this.m.b).b(f7Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        f7[] f7VarArr2 = this.g;
                        int i6 = i4 - 1;
                        f7 f7Var3 = f7VarArr2[i4];
                        f7VarArr2[i6] = f7Var3;
                        p30 p30Var2 = f7Var3.a;
                        if (p30Var2.h == i4) {
                            p30Var2.h = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            f7 f7Var = this.g[i];
            f7Var.a.j = f7Var.b;
        }
    }

    public final p30 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        p30 a = a(4);
        float[] fArr = a.m;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.g = i2;
        a.i = i;
        ((p30[]) this.m.d)[i2] = a;
        qx qxVar = this.d;
        qxVar.i.g = a;
        Arrays.fill(fArr, 0.0f);
        fArr[a.i] = 1.0f;
        qxVar.j(a);
        return a;
    }

    public final p30 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof pc)) {
            return null;
        }
        pc pcVar = (pc) obj;
        p30 p30Var = pcVar.i;
        if (p30Var == null) {
            pcVar.k();
            p30Var = pcVar.i;
        }
        int i = p30Var.g;
        r6 r6Var = this.m;
        if (i != -1 && i <= this.c && ((p30[]) r6Var.d)[i] != null) {
            return p30Var;
        }
        if (i != -1) {
            p30Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        p30Var.g = i2;
        p30Var.q = 1;
        ((p30[]) r6Var.d)[i2] = p30Var;
        return p30Var;
    }

    public final f7 l() {
        Object obj;
        r6 r6Var = this.m;
        mx mxVar = (mx) r6Var.b;
        int i = mxVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = mxVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            mxVar.b = i2;
        } else {
            obj = null;
        }
        f7 f7Var = (f7) obj;
        if (f7Var == null) {
            return new f7(r6Var);
        }
        f7Var.a = null;
        f7Var.d.b();
        f7Var.b = 0.0f;
        f7Var.e = false;
        return f7Var;
    }

    public final p30 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        p30 a = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.g = i;
        ((p30[]) this.m.d)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (f7[]) Arrays.copyOf(this.g, i);
        r6 r6Var = this.m;
        r6Var.d = (p30[]) Arrays.copyOf((p30[]) r6Var.d, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        qx qxVar = this.d;
        if (qxVar.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(qxVar);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(qxVar);
                return;
            }
        }
        i();
    }

    public final void q(qx qxVar) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            f7 f7Var = this.g[i];
            int i2 = 1;
            if (f7Var.a.q != 1) {
                float f = 0.0f;
                if (f7Var.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            f7 f7Var2 = this.g[i6];
                            if (f7Var2.a.q != i2 && !f7Var2.e && f7Var2.b < f) {
                                int d = f7Var2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    p30 e = f7Var2.d.e(i8);
                                    float c = f7Var2.d.c(e);
                                    if (c > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = e.l[i9] / c;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e.g;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            f7 f7Var3 = this.g[i4];
                            f7Var3.a.h = -1;
                            f7Var3.g(((p30[]) this.m.d)[i5]);
                            p30 p30Var = f7Var3.a;
                            p30Var.h = i4;
                            p30Var.e(this, f7Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(qxVar);
        i();
    }

    public final void r(f7 f7Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.j * 2) {
                return;
            }
            p30 p30Var = f7Var.a;
            if (p30Var != null) {
                this.i[p30Var.g] = true;
            }
            p30 d = f7Var.d(this.i);
            if (d != null) {
                boolean[] zArr = this.i;
                int i4 = d.g;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (d != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.k) {
                    f7 f7Var2 = this.g[i5];
                    if (f7Var2.a.q != 1 && !f7Var2.e) {
                        y6 y6Var = f7Var2.d;
                        int i7 = y6Var.h;
                        if (i7 != -1) {
                            for (int i8 = i; i7 != -1 && i8 < y6Var.a; i8++) {
                                if (y6Var.e[i7] == d.g) {
                                    z = true;
                                    break;
                                }
                                i7 = y6Var.f[i7];
                            }
                        }
                        z = false;
                        if (z) {
                            float c = f7Var2.d.c(d);
                            if (c < 0.0f) {
                                float f2 = (-f7Var2.b) / c;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    f7 f7Var3 = this.g[i6];
                    f7Var3.a.h = -1;
                    f7Var3.g(d);
                    p30 p30Var2 = f7Var3.a;
                    p30Var2.h = i6;
                    p30Var2.e(this, f7Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            f7 f7Var = this.g[i];
            if (f7Var != null) {
                ((mx) this.m.b).b(f7Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        r6 r6Var;
        int i = 0;
        while (true) {
            r6Var = this.m;
            p30[] p30VarArr = (p30[]) r6Var.d;
            if (i >= p30VarArr.length) {
                break;
            }
            p30 p30Var = p30VarArr[i];
            if (p30Var != null) {
                p30Var.c();
            }
            i++;
        }
        mx mxVar = (mx) r6Var.c;
        p30[] p30VarArr2 = this.n;
        int i2 = this.o;
        mxVar.getClass();
        if (i2 > p30VarArr2.length) {
            i2 = p30VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            p30 p30Var2 = p30VarArr2[i3];
            int i4 = mxVar.b;
            Object[] objArr = mxVar.a;
            if (i4 < objArr.length) {
                objArr[i4] = p30Var2;
                mxVar.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((p30[]) r6Var.d, (Object) null);
        this.c = 0;
        qx qxVar = this.d;
        qxVar.h = 0;
        qxVar.b = 0.0f;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            f7 f7Var = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new f7(r6Var);
    }
}
