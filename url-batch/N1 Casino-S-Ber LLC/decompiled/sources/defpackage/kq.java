package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class kq {
    public static boolean q = false;
    public final dx d;
    public final a6 m;
    public o6 p;
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
    public e30[] n = new e30[1000];
    public int o = 0;
    public o6[] g = new o6[32];

    public kq() {
        s();
        a6 a6Var = new a6();
        a6Var.b = new zw();
        a6Var.c = new zw();
        a6Var.d = new e30[32];
        this.m = a6Var;
        dx dxVar = new dx(a6Var);
        dxVar.f = new e30[128];
        dxVar.g = new e30[128];
        dxVar.h = 0;
        dxVar.i = new q4(23, dxVar);
        this.d = dxVar;
        this.p = new o6(a6Var);
    }

    public static int n(Object obj) {
        e30 e30Var = ((lc) obj).i;
        if (e30Var != null) {
            return (int) (e30Var.j + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final e30 a(int i) {
        zw zwVar = (zw) this.m.c;
        int i2 = zwVar.b;
        e30 e30Var = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = zwVar.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            zwVar.b = i3;
            e30Var = r4;
        }
        e30 e30Var2 = e30Var;
        if (e30Var2 == null) {
            e30Var2 = new e30(i);
            e30Var2.q = i;
        } else {
            e30Var2.c();
            e30Var2.q = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (e30[]) Arrays.copyOf(this.n, i6);
        }
        e30[] e30VarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        e30VarArr[i7] = e30Var2;
        return e30Var2;
    }

    public final void b(e30 e30Var, e30 e30Var2, int i, float f, e30 e30Var3, e30 e30Var4, int i2, int i3) {
        o6 l = l();
        if (e30Var2 == e30Var3) {
            l.d.g(e30Var, 1.0f);
            l.d.g(e30Var4, 1.0f);
            l.d.g(e30Var2, -2.0f);
        } else {
            h6 h6Var = l.d;
            if (f == 0.5f) {
                h6Var.g(e30Var, 1.0f);
                l.d.g(e30Var2, -1.0f);
                l.d.g(e30Var3, -1.0f);
                l.d.g(e30Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                h6Var.g(e30Var, -1.0f);
                l.d.g(e30Var2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                h6Var.g(e30Var4, -1.0f);
                l.d.g(e30Var3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                h6Var.g(e30Var, f2 * 1.0f);
                l.d.g(e30Var2, f2 * (-1.0f));
                l.d.g(e30Var3, (-1.0f) * f);
                l.d.g(e30Var4, 1.0f * f);
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
    public final void c(o6 o6Var) {
        boolean z;
        boolean z2;
        e30 e30Var;
        e30 f;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (o6Var.e) {
            z = false;
        } else {
            ArrayList arrayList = o6Var.c;
            if (this.g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int d = o6Var.d.d();
                    for (int i = 0; i < d; i++) {
                        e30 e = o6Var.d.e(i);
                        if (e.h != -1 || e.k) {
                            arrayList.add(e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            e30 e30Var2 = (e30) arrayList.get(i2);
                            if (e30Var2.k) {
                                o6Var.h(this, e30Var2, true);
                            } else {
                                o6Var.i(this, this.g[e30Var2.h], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (o6Var.a != null && o6Var.d.d() == 0) {
                    o6Var.e = true;
                    this.b = true;
                }
            }
            if (o6Var.e()) {
                return;
            }
            float f2 = o6Var.b;
            float f3 = 0.0f;
            if (f2 < 0.0f) {
                o6Var.b = f2 * (-1.0f);
                h6 h6Var = o6Var.d;
                int i3 = h6Var.h;
                for (int i4 = 0; i3 != -1 && i4 < h6Var.a; i4++) {
                    float[] fArr = h6Var.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = h6Var.f[i3];
                }
            }
            int d2 = o6Var.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            e30 e30Var3 = null;
            e30 e30Var4 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < d2) {
                float f6 = o6Var.d.f(i5);
                e30 e2 = o6Var.d.e(i5);
                float f7 = f3;
                if (e2.q == 1) {
                    if (e30Var3 != null) {
                        if (f4 <= f6) {
                            if (!z4) {
                                if (e2.p > 1) {
                                }
                            }
                        }
                        z4 = true;
                    }
                    e30Var3 = e2;
                    f4 = f6;
                } else if (e30Var3 == null && f6 < f7) {
                    if (e30Var4 != null) {
                        if (f5 <= f6) {
                            if (!z5) {
                                if (e2.p > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    e30Var4 = e2;
                    f5 = f6;
                }
                i5++;
                f3 = f7;
            }
            float f8 = f3;
            if (e30Var3 == null) {
                e30Var3 = e30Var4;
            }
            if (e30Var3 == null) {
                z2 = true;
            } else {
                o6Var.g(e30Var3);
                z2 = false;
            }
            if (o6Var.d.d() == 0) {
                o6Var.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                e30 a = a(3);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                a.g = i6;
                a6 a6Var = this.m;
                ((e30[]) a6Var.d)[i6] = a;
                o6Var.a = a;
                int i7 = this.k;
                h(o6Var);
                if (this.k == i7 + 1) {
                    o6 o6Var2 = this.p;
                    o6Var2.a = null;
                    o6Var2.d.b();
                    for (int i8 = 0; i8 < o6Var.d.d(); i8++) {
                        o6Var2.d.a(o6Var.d.e(i8), o6Var.d.f(i8), true);
                    }
                    r(this.p);
                    if (a.h == -1) {
                        if (o6Var.a == a && (f = o6Var.f(null, a)) != null) {
                            o6Var.g(f);
                        }
                        if (!o6Var.e) {
                            o6Var.a.e(this, o6Var);
                        }
                        ((zw) a6Var.b).b(o6Var);
                        this.k--;
                    }
                    z = true;
                    e30Var = o6Var.a;
                    if (e30Var != null) {
                        return;
                    }
                    if (e30Var.q != 1 && o6Var.b < f8) {
                        return;
                    }
                }
            }
            z = false;
            e30Var = o6Var.a;
            if (e30Var != null) {
            }
        }
        if (z) {
            return;
        }
        h(o6Var);
    }

    public final void d(e30 e30Var, int i) {
        int i2 = e30Var.h;
        if (i2 == -1) {
            e30Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                e30 e30Var2 = ((e30[]) this.m.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            o6 l = l();
            l.a = e30Var;
            float f = i;
            e30Var.j = f;
            l.b = f;
            l.e = true;
            c(l);
            return;
        }
        o6 o6Var = this.g[i2];
        if (o6Var.e) {
            o6Var.b = i;
            return;
        }
        if (o6Var.d.d() == 0) {
            o6Var.e = true;
            o6Var.b = i;
            return;
        }
        o6 l2 = l();
        if (i < 0) {
            l2.b = i * (-1);
            l2.d.g(e30Var, 1.0f);
        } else {
            l2.b = i;
            l2.d.g(e30Var, -1.0f);
        }
        c(l2);
    }

    public final void e(e30 e30Var, e30 e30Var2, int i, int i2) {
        if (i2 == 8 && e30Var2.k && e30Var.h == -1) {
            e30Var.d(this, e30Var2.j + i);
            return;
        }
        o6 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        h6 h6Var = l.d;
        if (z) {
            h6Var.g(e30Var, 1.0f);
            l.d.g(e30Var2, -1.0f);
        } else {
            h6Var.g(e30Var, -1.0f);
            l.d.g(e30Var2, 1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(e30 e30Var, e30 e30Var2, int i, int i2) {
        o6 l = l();
        e30 m = m();
        m.i = 0;
        l.b(e30Var, e30Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(e30 e30Var, e30 e30Var2, int i, int i2) {
        o6 l = l();
        e30 m = m();
        m.i = 0;
        l.c(e30Var, e30Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(o6 o6Var) {
        int i;
        if (o6Var.e) {
            o6Var.a.d(this, o6Var.b);
        } else {
            o6[] o6VarArr = this.g;
            int i2 = this.k;
            o6VarArr[i2] = o6Var;
            e30 e30Var = o6Var.a;
            e30Var.h = i2;
            this.k = i2 + 1;
            e30Var.e(this, o6Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                o6 o6Var2 = this.g[i3];
                if (o6Var2 != null && o6Var2.e) {
                    o6Var2.a.d(this, o6Var2.b);
                    ((zw) this.m.b).b(o6Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        o6[] o6VarArr2 = this.g;
                        int i6 = i4 - 1;
                        o6 o6Var3 = o6VarArr2[i4];
                        o6VarArr2[i6] = o6Var3;
                        e30 e30Var2 = o6Var3.a;
                        if (e30Var2.h == i4) {
                            e30Var2.h = i6;
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
            o6 o6Var = this.g[i];
            o6Var.a.j = o6Var.b;
        }
    }

    public final e30 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        e30 a = a(4);
        float[] fArr = a.m;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.g = i2;
        a.i = i;
        ((e30[]) this.m.d)[i2] = a;
        dx dxVar = this.d;
        dxVar.i.g = a;
        Arrays.fill(fArr, 0.0f);
        fArr[a.i] = 1.0f;
        dxVar.j(a);
        return a;
    }

    public final e30 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof lc)) {
            return null;
        }
        lc lcVar = (lc) obj;
        e30 e30Var = lcVar.i;
        if (e30Var == null) {
            lcVar.k();
            e30Var = lcVar.i;
        }
        int i = e30Var.g;
        a6 a6Var = this.m;
        if (i != -1 && i <= this.c && ((e30[]) a6Var.d)[i] != null) {
            return e30Var;
        }
        if (i != -1) {
            e30Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        e30Var.g = i2;
        e30Var.q = 1;
        ((e30[]) a6Var.d)[i2] = e30Var;
        return e30Var;
    }

    public final o6 l() {
        Object obj;
        a6 a6Var = this.m;
        zw zwVar = (zw) a6Var.b;
        int i = zwVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = zwVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            zwVar.b = i2;
        } else {
            obj = null;
        }
        o6 o6Var = (o6) obj;
        if (o6Var == null) {
            return new o6(a6Var);
        }
        o6Var.a = null;
        o6Var.d.b();
        o6Var.b = 0.0f;
        o6Var.e = false;
        return o6Var;
    }

    public final e30 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        e30 a = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.g = i;
        ((e30[]) this.m.d)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (o6[]) Arrays.copyOf(this.g, i);
        a6 a6Var = this.m;
        a6Var.d = (e30[]) Arrays.copyOf((e30[]) a6Var.d, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        dx dxVar = this.d;
        if (dxVar.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(dxVar);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(dxVar);
                return;
            }
        }
        i();
    }

    public final void q(dx dxVar) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            o6 o6Var = this.g[i];
            int i2 = 1;
            if (o6Var.a.q != 1) {
                float f = 0.0f;
                if (o6Var.b < 0.0f) {
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
                            o6 o6Var2 = this.g[i6];
                            if (o6Var2.a.q != i2 && !o6Var2.e && o6Var2.b < f) {
                                int d = o6Var2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    e30 e = o6Var2.d.e(i8);
                                    float c = o6Var2.d.c(e);
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
                            o6 o6Var3 = this.g[i4];
                            o6Var3.a.h = -1;
                            o6Var3.g(((e30[]) this.m.d)[i5]);
                            e30 e30Var = o6Var3.a;
                            e30Var.h = i4;
                            e30Var.e(this, o6Var3);
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
        r(dxVar);
        i();
    }

    public final void r(o6 o6Var) {
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
            e30 e30Var = o6Var.a;
            if (e30Var != null) {
                this.i[e30Var.g] = true;
            }
            e30 d = o6Var.d(this.i);
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
                    o6 o6Var2 = this.g[i5];
                    if (o6Var2.a.q != 1 && !o6Var2.e) {
                        h6 h6Var = o6Var2.d;
                        int i7 = h6Var.h;
                        if (i7 != -1) {
                            for (int i8 = i; i7 != -1 && i8 < h6Var.a; i8++) {
                                if (h6Var.e[i7] == d.g) {
                                    z = true;
                                    break;
                                }
                                i7 = h6Var.f[i7];
                            }
                        }
                        z = false;
                        if (z) {
                            float c = o6Var2.d.c(d);
                            if (c < 0.0f) {
                                float f2 = (-o6Var2.b) / c;
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
                    o6 o6Var3 = this.g[i6];
                    o6Var3.a.h = -1;
                    o6Var3.g(d);
                    e30 e30Var2 = o6Var3.a;
                    e30Var2.h = i6;
                    e30Var2.e(this, o6Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            o6 o6Var = this.g[i];
            if (o6Var != null) {
                ((zw) this.m.b).b(o6Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        a6 a6Var;
        int i = 0;
        while (true) {
            a6Var = this.m;
            e30[] e30VarArr = (e30[]) a6Var.d;
            if (i >= e30VarArr.length) {
                break;
            }
            e30 e30Var = e30VarArr[i];
            if (e30Var != null) {
                e30Var.c();
            }
            i++;
        }
        zw zwVar = (zw) a6Var.c;
        e30[] e30VarArr2 = this.n;
        int i2 = this.o;
        zwVar.getClass();
        if (i2 > e30VarArr2.length) {
            i2 = e30VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            e30 e30Var2 = e30VarArr2[i3];
            int i4 = zwVar.b;
            Object[] objArr = zwVar.a;
            if (i4 < objArr.length) {
                objArr[i4] = e30Var2;
                zwVar.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((e30[]) a6Var.d, (Object) null);
        this.c = 0;
        dx dxVar = this.d;
        dxVar.h = 0;
        dxVar.b = 0.0f;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            o6 o6Var = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new o6(a6Var);
    }
}
