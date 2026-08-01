package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ys {
    public static boolean q = false;
    public final g00 d;
    public final k6 m;
    public y6 p;
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
    public g60[] n = new g60[1000];
    public int o = 0;
    public y6[] g = new y6[32];

    public ys() {
        s();
        k6 k6Var = new k6();
        k6Var.g = new c00();
        k6Var.h = new c00();
        k6Var.i = new g60[32];
        this.m = k6Var;
        g00 g00Var = new g00(k6Var);
        g00Var.f = new g60[128];
        g00Var.g = new g60[128];
        g00Var.h = 0;
        g00Var.i = new a5(21, g00Var);
        this.d = g00Var;
        this.p = new y6(k6Var);
    }

    public static int n(Object obj) {
        g60 g60Var = ((ld) obj).i;
        if (g60Var != null) {
            return (int) (g60Var.j + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final g60 a(int i) {
        c00 c00Var = (c00) this.m.h;
        int i2 = c00Var.b;
        g60 g60Var = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = c00Var.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            c00Var.b = i3;
            g60Var = r4;
        }
        g60 g60Var2 = g60Var;
        if (g60Var2 == null) {
            g60Var2 = new g60(i);
            g60Var2.q = i;
        } else {
            g60Var2.c();
            g60Var2.q = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (g60[]) Arrays.copyOf(this.n, i6);
        }
        g60[] g60VarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        g60VarArr[i7] = g60Var2;
        return g60Var2;
    }

    public final void b(g60 g60Var, g60 g60Var2, int i, float f, g60 g60Var3, g60 g60Var4, int i2, int i3) {
        y6 l = l();
        if (g60Var2 == g60Var3) {
            l.d.g(g60Var, 1.0f);
            l.d.g(g60Var4, 1.0f);
            l.d.g(g60Var2, -2.0f);
        } else {
            r6 r6Var = l.d;
            if (f == 0.5f) {
                r6Var.g(g60Var, 1.0f);
                l.d.g(g60Var2, -1.0f);
                l.d.g(g60Var3, -1.0f);
                l.d.g(g60Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                r6Var.g(g60Var, -1.0f);
                l.d.g(g60Var2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                r6Var.g(g60Var4, -1.0f);
                l.d.g(g60Var3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                r6Var.g(g60Var, f2 * 1.0f);
                l.d.g(g60Var2, f2 * (-1.0f));
                l.d.g(g60Var3, (-1.0f) * f);
                l.d.g(g60Var4, 1.0f * f);
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
    public final void c(y6 y6Var) {
        boolean z;
        boolean z2;
        g60 g60Var;
        g60 f;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (y6Var.e) {
            z = false;
        } else {
            ArrayList arrayList = y6Var.c;
            if (this.g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int d = y6Var.d.d();
                    for (int i = 0; i < d; i++) {
                        g60 e = y6Var.d.e(i);
                        if (e.h != -1 || e.k) {
                            arrayList.add(e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            g60 g60Var2 = (g60) arrayList.get(i2);
                            if (g60Var2.k) {
                                y6Var.h(this, g60Var2, true);
                            } else {
                                y6Var.i(this, this.g[g60Var2.h], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (y6Var.a != null && y6Var.d.d() == 0) {
                    y6Var.e = true;
                    this.b = true;
                }
            }
            if (y6Var.e()) {
                return;
            }
            float f2 = y6Var.b;
            float f3 = 0.0f;
            if (f2 < 0.0f) {
                y6Var.b = f2 * (-1.0f);
                r6 r6Var = y6Var.d;
                int i3 = r6Var.h;
                for (int i4 = 0; i3 != -1 && i4 < r6Var.a; i4++) {
                    float[] fArr = r6Var.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = r6Var.f[i3];
                }
            }
            int d2 = y6Var.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            g60 g60Var3 = null;
            g60 g60Var4 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < d2) {
                float f6 = y6Var.d.f(i5);
                g60 e2 = y6Var.d.e(i5);
                float f7 = f3;
                if (e2.q == 1) {
                    if (g60Var3 != null) {
                        if (f4 <= f6) {
                            if (!z4) {
                                if (e2.p > 1) {
                                }
                            }
                        }
                        z4 = true;
                    }
                    g60Var3 = e2;
                    f4 = f6;
                } else if (g60Var3 == null && f6 < f7) {
                    if (g60Var4 != null) {
                        if (f5 <= f6) {
                            if (!z5) {
                                if (e2.p > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    g60Var4 = e2;
                    f5 = f6;
                }
                i5++;
                f3 = f7;
            }
            float f8 = f3;
            if (g60Var3 == null) {
                g60Var3 = g60Var4;
            }
            if (g60Var3 == null) {
                z2 = true;
            } else {
                y6Var.g(g60Var3);
                z2 = false;
            }
            if (y6Var.d.d() == 0) {
                y6Var.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                g60 a = a(3);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                a.g = i6;
                k6 k6Var = this.m;
                ((g60[]) k6Var.i)[i6] = a;
                y6Var.a = a;
                int i7 = this.k;
                h(y6Var);
                if (this.k == i7 + 1) {
                    y6 y6Var2 = this.p;
                    y6Var2.a = null;
                    y6Var2.d.b();
                    for (int i8 = 0; i8 < y6Var.d.d(); i8++) {
                        y6Var2.d.a(y6Var.d.e(i8), y6Var.d.f(i8), true);
                    }
                    r(this.p);
                    if (a.h == -1) {
                        if (y6Var.a == a && (f = y6Var.f(null, a)) != null) {
                            y6Var.g(f);
                        }
                        if (!y6Var.e) {
                            y6Var.a.e(this, y6Var);
                        }
                        ((c00) k6Var.g).b(y6Var);
                        this.k--;
                    }
                    z = true;
                    g60Var = y6Var.a;
                    if (g60Var != null) {
                        return;
                    }
                    if (g60Var.q != 1 && y6Var.b < f8) {
                        return;
                    }
                }
            }
            z = false;
            g60Var = y6Var.a;
            if (g60Var != null) {
            }
        }
        if (z) {
            return;
        }
        h(y6Var);
    }

    public final void d(g60 g60Var, int i) {
        int i2 = g60Var.h;
        if (i2 == -1) {
            g60Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                g60 g60Var2 = ((g60[]) this.m.i)[i3];
            }
            return;
        }
        if (i2 == -1) {
            y6 l = l();
            l.a = g60Var;
            float f = i;
            g60Var.j = f;
            l.b = f;
            l.e = true;
            c(l);
            return;
        }
        y6 y6Var = this.g[i2];
        if (y6Var.e) {
            y6Var.b = i;
            return;
        }
        if (y6Var.d.d() == 0) {
            y6Var.e = true;
            y6Var.b = i;
            return;
        }
        y6 l2 = l();
        if (i < 0) {
            l2.b = i * (-1);
            l2.d.g(g60Var, 1.0f);
        } else {
            l2.b = i;
            l2.d.g(g60Var, -1.0f);
        }
        c(l2);
    }

    public final void e(g60 g60Var, g60 g60Var2, int i, int i2) {
        if (i2 == 8 && g60Var2.k && g60Var.h == -1) {
            g60Var.d(this, g60Var2.j + i);
            return;
        }
        y6 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        r6 r6Var = l.d;
        if (z) {
            r6Var.g(g60Var, 1.0f);
            l.d.g(g60Var2, -1.0f);
        } else {
            r6Var.g(g60Var, -1.0f);
            l.d.g(g60Var2, 1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(g60 g60Var, g60 g60Var2, int i, int i2) {
        y6 l = l();
        g60 m = m();
        m.i = 0;
        l.b(g60Var, g60Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(g60 g60Var, g60 g60Var2, int i, int i2) {
        y6 l = l();
        g60 m = m();
        m.i = 0;
        l.c(g60Var, g60Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(y6 y6Var) {
        int i;
        if (y6Var.e) {
            y6Var.a.d(this, y6Var.b);
        } else {
            y6[] y6VarArr = this.g;
            int i2 = this.k;
            y6VarArr[i2] = y6Var;
            g60 g60Var = y6Var.a;
            g60Var.h = i2;
            this.k = i2 + 1;
            g60Var.e(this, y6Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                y6 y6Var2 = this.g[i3];
                if (y6Var2 != null && y6Var2.e) {
                    y6Var2.a.d(this, y6Var2.b);
                    ((c00) this.m.g).b(y6Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        y6[] y6VarArr2 = this.g;
                        int i6 = i4 - 1;
                        y6 y6Var3 = y6VarArr2[i4];
                        y6VarArr2[i6] = y6Var3;
                        g60 g60Var2 = y6Var3.a;
                        if (g60Var2.h == i4) {
                            g60Var2.h = i6;
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
            y6 y6Var = this.g[i];
            y6Var.a.j = y6Var.b;
        }
    }

    public final g60 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        g60 a = a(4);
        float[] fArr = a.m;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.g = i2;
        a.i = i;
        ((g60[]) this.m.i)[i2] = a;
        g00 g00Var = this.d;
        g00Var.i.g = a;
        Arrays.fill(fArr, 0.0f);
        fArr[a.i] = 1.0f;
        g00Var.j(a);
        return a;
    }

    public final g60 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof ld)) {
            return null;
        }
        ld ldVar = (ld) obj;
        g60 g60Var = ldVar.i;
        if (g60Var == null) {
            ldVar.k();
            g60Var = ldVar.i;
        }
        int i = g60Var.g;
        k6 k6Var = this.m;
        if (i != -1 && i <= this.c && ((g60[]) k6Var.i)[i] != null) {
            return g60Var;
        }
        if (i != -1) {
            g60Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        g60Var.g = i2;
        g60Var.q = 1;
        ((g60[]) k6Var.i)[i2] = g60Var;
        return g60Var;
    }

    public final y6 l() {
        Object obj;
        k6 k6Var = this.m;
        c00 c00Var = (c00) k6Var.g;
        int i = c00Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c00Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            c00Var.b = i2;
        } else {
            obj = null;
        }
        y6 y6Var = (y6) obj;
        if (y6Var == null) {
            return new y6(k6Var);
        }
        y6Var.a = null;
        y6Var.d.b();
        y6Var.b = 0.0f;
        y6Var.e = false;
        return y6Var;
    }

    public final g60 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        g60 a = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.g = i;
        ((g60[]) this.m.i)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (y6[]) Arrays.copyOf(this.g, i);
        k6 k6Var = this.m;
        k6Var.i = (g60[]) Arrays.copyOf((g60[]) k6Var.i, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        g00 g00Var = this.d;
        if (g00Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(g00Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(g00Var);
                return;
            }
        }
        i();
    }

    public final void q(g00 g00Var) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            y6 y6Var = this.g[i];
            int i2 = 1;
            if (y6Var.a.q != 1) {
                float f = 0.0f;
                if (y6Var.b < 0.0f) {
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
                            y6 y6Var2 = this.g[i6];
                            if (y6Var2.a.q != i2 && !y6Var2.e && y6Var2.b < f) {
                                int d = y6Var2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    g60 e = y6Var2.d.e(i8);
                                    float c = y6Var2.d.c(e);
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
                            y6 y6Var3 = this.g[i4];
                            y6Var3.a.h = -1;
                            y6Var3.g(((g60[]) this.m.i)[i5]);
                            g60 g60Var = y6Var3.a;
                            g60Var.h = i4;
                            g60Var.e(this, y6Var3);
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
        r(g00Var);
        i();
    }

    public final void r(y6 y6Var) {
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
            g60 g60Var = y6Var.a;
            if (g60Var != null) {
                this.i[g60Var.g] = true;
            }
            g60 d = y6Var.d(this.i);
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
                    y6 y6Var2 = this.g[i5];
                    if (y6Var2.a.q != 1 && !y6Var2.e) {
                        r6 r6Var = y6Var2.d;
                        int i7 = r6Var.h;
                        if (i7 != -1) {
                            for (int i8 = i; i7 != -1 && i8 < r6Var.a; i8++) {
                                if (r6Var.e[i7] == d.g) {
                                    z = true;
                                    break;
                                }
                                i7 = r6Var.f[i7];
                            }
                        }
                        z = false;
                        if (z) {
                            float c = y6Var2.d.c(d);
                            if (c < 0.0f) {
                                float f2 = (-y6Var2.b) / c;
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
                    y6 y6Var3 = this.g[i6];
                    y6Var3.a.h = -1;
                    y6Var3.g(d);
                    g60 g60Var2 = y6Var3.a;
                    g60Var2.h = i6;
                    g60Var2.e(this, y6Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            y6 y6Var = this.g[i];
            if (y6Var != null) {
                ((c00) this.m.g).b(y6Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        k6 k6Var;
        int i = 0;
        while (true) {
            k6Var = this.m;
            g60[] g60VarArr = (g60[]) k6Var.i;
            if (i >= g60VarArr.length) {
                break;
            }
            g60 g60Var = g60VarArr[i];
            if (g60Var != null) {
                g60Var.c();
            }
            i++;
        }
        c00 c00Var = (c00) k6Var.h;
        g60[] g60VarArr2 = this.n;
        int i2 = this.o;
        c00Var.getClass();
        if (i2 > g60VarArr2.length) {
            i2 = g60VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            g60 g60Var2 = g60VarArr2[i3];
            int i4 = c00Var.b;
            Object[] objArr = c00Var.a;
            if (i4 < objArr.length) {
                objArr[i4] = g60Var2;
                c00Var.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((g60[]) k6Var.i, (Object) null);
        this.c = 0;
        g00 g00Var = this.d;
        g00Var.h = 0;
        g00Var.b = 0.0f;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            y6 y6Var = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new y6(k6Var);
    }
}
