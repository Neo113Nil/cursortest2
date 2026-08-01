package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xx {
    public static boolean q = false;
    public final k60 d;
    public final s6 m;
    public h7 p;
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
    public je0[] n = new je0[1000];
    public int o = 0;
    public h7[] g = new h7[32];

    public xx() {
        s();
        s6 s6Var = new s6();
        s6Var.b = new f60();
        s6Var.c = new f60();
        s6Var.d = new je0[32];
        this.m = s6Var;
        k60 k60Var = new k60(s6Var);
        k60Var.f = new je0[128];
        k60Var.g = new je0[128];
        k60Var.h = 0;
        k60Var.i = new i5((Object) k60Var, 24, false);
        this.d = k60Var;
        this.p = new h7(s6Var);
    }

    public static int n(Object obj) {
        je0 je0Var = ((xe) obj).i;
        if (je0Var != null) {
            return (int) (je0Var.j + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final je0 a(ie0 ie0Var) {
        f60 f60Var = (f60) this.m.c;
        int i = f60Var.b;
        je0 je0Var = null;
        if (i > 0) {
            int i2 = i - 1;
            ?? r3 = f60Var.a;
            ?? r4 = r3[i2];
            r3[i2] = 0;
            f60Var.b = i2;
            je0Var = r4;
        }
        je0 je0Var2 = je0Var;
        if (je0Var2 == null) {
            je0Var2 = new je0(ie0Var);
            je0Var2.n = ie0Var;
        } else {
            je0Var2.c();
            je0Var2.n = ie0Var;
        }
        int i3 = this.o;
        int i4 = this.a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.a = i5;
            this.n = (je0[]) Arrays.copyOf(this.n, i5);
        }
        je0[] je0VarArr = this.n;
        int i6 = this.o;
        this.o = i6 + 1;
        je0VarArr[i6] = je0Var2;
        return je0Var2;
    }

    public final void b(je0 je0Var, je0 je0Var2, int i, float f, je0 je0Var3, je0 je0Var4, int i2, int i3) {
        h7 l = l();
        if (je0Var2 == je0Var3) {
            l.d.g(je0Var, 1.0f);
            l.d.g(je0Var4, 1.0f);
            l.d.g(je0Var2, -2.0f);
        } else {
            a7 a7Var = l.d;
            if (f == 0.5f) {
                a7Var.g(je0Var, 1.0f);
                l.d.g(je0Var2, -1.0f);
                l.d.g(je0Var3, -1.0f);
                l.d.g(je0Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                a7Var.g(je0Var, -1.0f);
                l.d.g(je0Var2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                a7Var.g(je0Var4, -1.0f);
                l.d.g(je0Var3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                a7Var.g(je0Var, f2 * 1.0f);
                l.d.g(je0Var2, f2 * (-1.0f));
                l.d.g(je0Var3, (-1.0f) * f);
                l.d.g(je0Var4, 1.0f * f);
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

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d2, code lost:
    
        if (r4.q <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d5, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00df, code lost:
    
        if (r4.q <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f4, code lost:
    
        if (r4.q <= 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f7, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0101, code lost:
    
        if (r4.q <= 1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h7 h7Var) {
        boolean z;
        boolean z2;
        je0 je0Var;
        je0 f;
        boolean z3 = true;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (h7Var.e) {
            z = false;
        } else {
            ArrayList arrayList = h7Var.c;
            if (this.g.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = h7Var.d.d();
                    for (int i = 0; i < d; i++) {
                        je0 e = h7Var.d.e(i);
                        if (e.h != -1 || e.k) {
                            arrayList.add(e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            je0 je0Var2 = (je0) arrayList.get(i2);
                            if (je0Var2.k) {
                                h7Var.h(this, je0Var2, true);
                            } else {
                                h7Var.i(this, this.g[je0Var2.h], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (h7Var.a != null && h7Var.d.d() == 0) {
                    h7Var.e = true;
                    this.b = true;
                }
            }
            if (h7Var.e()) {
                return;
            }
            float f2 = h7Var.b;
            float f3 = 0.0f;
            if (f2 < 0.0f) {
                h7Var.b = f2 * (-1.0f);
                a7 a7Var = h7Var.d;
                int i3 = a7Var.h;
                for (int i4 = 0; i3 != -1 && i4 < a7Var.a; i4++) {
                    float[] fArr = a7Var.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = a7Var.f[i3];
                }
            }
            int d2 = h7Var.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            je0 je0Var3 = null;
            je0 je0Var4 = null;
            int i5 = 0;
            boolean z5 = false;
            boolean z6 = false;
            while (i5 < d2) {
                float f6 = h7Var.d.f(i5);
                je0 e2 = h7Var.d.e(i5);
                float f7 = f3;
                if (e2.n == ie0.UNRESTRICTED) {
                    if (je0Var3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e2.q > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    je0Var3 = e2;
                    f4 = f6;
                } else if (je0Var3 == null && f6 < f7) {
                    if (je0Var4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e2.q > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    je0Var4 = e2;
                    f5 = f6;
                }
                i5++;
                f3 = f7;
            }
            float f8 = f3;
            if (je0Var3 == null) {
                je0Var3 = je0Var4;
            }
            if (je0Var3 == null) {
                z2 = true;
            } else {
                h7Var.g(je0Var3);
                z2 = false;
            }
            if (h7Var.d.d() == 0) {
                h7Var.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                je0 a = a(ie0.SLACK);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                a.g = i6;
                s6 s6Var = this.m;
                ((je0[]) s6Var.d)[i6] = a;
                h7Var.a = a;
                int i7 = this.k;
                h(h7Var);
                if (this.k == i7 + 1) {
                    h7 h7Var2 = this.p;
                    h7Var2.a = null;
                    h7Var2.d.b();
                    for (int i8 = 0; i8 < h7Var.d.d(); i8++) {
                        h7Var2.d.a(h7Var.d.e(i8), h7Var.d.f(i8), true);
                    }
                    r(this.p);
                    if (a.h == -1) {
                        if (h7Var.a == a && (f = h7Var.f(null, a)) != null) {
                            h7Var.g(f);
                        }
                        if (!h7Var.e) {
                            h7Var.a.e(this, h7Var);
                        }
                        ((f60) s6Var.b).b(h7Var);
                        this.k--;
                    }
                    je0Var = h7Var.a;
                    if (je0Var != null) {
                        return;
                    }
                    if (je0Var.n != ie0.UNRESTRICTED && h7Var.b < f8) {
                        return;
                    } else {
                        z = z3;
                    }
                }
            }
            z3 = false;
            je0Var = h7Var.a;
            if (je0Var != null) {
            }
        }
        if (z) {
            return;
        }
        h(h7Var);
    }

    public final void d(je0 je0Var, int i) {
        int i2 = je0Var.h;
        if (i2 == -1) {
            je0Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                je0 je0Var2 = ((je0[]) this.m.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            h7 l = l();
            l.a = je0Var;
            float f = i;
            je0Var.j = f;
            l.b = f;
            l.e = true;
            c(l);
            return;
        }
        h7 h7Var = this.g[i2];
        if (h7Var.e) {
            h7Var.b = i;
            return;
        }
        if (h7Var.d.d() == 0) {
            h7Var.e = true;
            h7Var.b = i;
            return;
        }
        h7 l2 = l();
        if (i < 0) {
            l2.b = i * (-1);
            l2.d.g(je0Var, 1.0f);
        } else {
            l2.b = i;
            l2.d.g(je0Var, -1.0f);
        }
        c(l2);
    }

    public final void e(je0 je0Var, je0 je0Var2, int i, int i2) {
        if (i2 == 8 && je0Var2.k && je0Var.h == -1) {
            je0Var.d(this, je0Var2.j + i);
            return;
        }
        h7 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        a7 a7Var = l.d;
        if (z) {
            a7Var.g(je0Var, 1.0f);
            l.d.g(je0Var2, -1.0f);
        } else {
            a7Var.g(je0Var, -1.0f);
            l.d.g(je0Var2, 1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(je0 je0Var, je0 je0Var2, int i, int i2) {
        h7 l = l();
        je0 m = m();
        m.i = 0;
        l.b(je0Var, je0Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(je0 je0Var, je0 je0Var2, int i, int i2) {
        h7 l = l();
        je0 m = m();
        m.i = 0;
        l.c(je0Var, je0Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(h7 h7Var) {
        int i;
        if (h7Var.e) {
            h7Var.a.d(this, h7Var.b);
        } else {
            h7[] h7VarArr = this.g;
            int i2 = this.k;
            h7VarArr[i2] = h7Var;
            je0 je0Var = h7Var.a;
            je0Var.h = i2;
            this.k = i2 + 1;
            je0Var.e(this, h7Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                h7 h7Var2 = this.g[i3];
                if (h7Var2 != null && h7Var2.e) {
                    h7Var2.a.d(this, h7Var2.b);
                    ((f60) this.m.b).b(h7Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        h7[] h7VarArr2 = this.g;
                        int i6 = i4 - 1;
                        h7 h7Var3 = h7VarArr2[i4];
                        h7VarArr2[i6] = h7Var3;
                        je0 je0Var2 = h7Var3.a;
                        if (je0Var2.h == i4) {
                            je0Var2.h = i6;
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
            h7 h7Var = this.g[i];
            h7Var.a.j = h7Var.b;
        }
    }

    public final je0 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        je0 a = a(ie0.ERROR);
        float[] fArr = a.m;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.g = i2;
        a.i = i;
        ((je0[]) this.m.d)[i2] = a;
        k60 k60Var = this.d;
        k60Var.i.g = a;
        Arrays.fill(fArr, 0.0f);
        fArr[a.i] = 1.0f;
        k60Var.j(a);
        return a;
    }

    public final je0 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof xe)) {
            return null;
        }
        xe xeVar = (xe) obj;
        je0 je0Var = xeVar.i;
        if (je0Var == null) {
            xeVar.k();
            je0Var = xeVar.i;
        }
        int i = je0Var.g;
        s6 s6Var = this.m;
        if (i != -1 && i <= this.c && ((je0[]) s6Var.d)[i] != null) {
            return je0Var;
        }
        if (i != -1) {
            je0Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        je0Var.g = i2;
        je0Var.n = ie0.UNRESTRICTED;
        ((je0[]) s6Var.d)[i2] = je0Var;
        return je0Var;
    }

    public final h7 l() {
        Object obj;
        s6 s6Var = this.m;
        f60 f60Var = (f60) s6Var.b;
        int i = f60Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = f60Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            f60Var.b = i2;
        } else {
            obj = null;
        }
        h7 h7Var = (h7) obj;
        if (h7Var == null) {
            return new h7(s6Var);
        }
        h7Var.a = null;
        h7Var.d.b();
        h7Var.b = 0.0f;
        h7Var.e = false;
        return h7Var;
    }

    public final je0 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        je0 a = a(ie0.SLACK);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.g = i;
        ((je0[]) this.m.d)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (h7[]) Arrays.copyOf(this.g, i);
        s6 s6Var = this.m;
        s6Var.d = (je0[]) Arrays.copyOf((je0[]) s6Var.d, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        k60 k60Var = this.d;
        if (k60Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(k60Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(k60Var);
                return;
            }
        }
        i();
    }

    public final void q(k60 k60Var) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            h7 h7Var = this.g[i];
            if (h7Var.a.n != ie0.UNRESTRICTED) {
                float f = 0.0f;
                if (h7Var.b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.k) {
                            h7 h7Var2 = this.g[i5];
                            if (h7Var2.a.n != ie0.UNRESTRICTED && !h7Var2.e && h7Var2.b < f) {
                                int d = h7Var2.d.d();
                                int i7 = 0;
                                while (i7 < d) {
                                    je0 e = h7Var2.d.e(i7);
                                    float c = h7Var2.d.c(e);
                                    if (c > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = e.l[i8] / c;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i4 = e.g;
                                                i3 = i5;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            h7 h7Var3 = this.g[i3];
                            h7Var3.a.h = -1;
                            h7Var3.g(((je0[]) this.m.d)[i4]);
                            je0 je0Var = h7Var3.a;
                            je0Var.h = i3;
                            je0Var.e(this, h7Var3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        r(k60Var);
        i();
    }

    public final void r(h7 h7Var) {
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
            je0 je0Var = h7Var.a;
            if (je0Var != null) {
                this.i[je0Var.g] = true;
            }
            je0 d = h7Var.d(this.i);
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
                    h7 h7Var2 = this.g[i5];
                    if (h7Var2.a.n != ie0.UNRESTRICTED && !h7Var2.e) {
                        a7 a7Var = h7Var2.d;
                        int i7 = a7Var.h;
                        if (i7 != -1) {
                            for (int i8 = i; i7 != -1 && i8 < a7Var.a; i8++) {
                                if (a7Var.e[i7] == d.g) {
                                    z = true;
                                    break;
                                }
                                i7 = a7Var.f[i7];
                            }
                        }
                        z = false;
                        if (z) {
                            float c = h7Var2.d.c(d);
                            if (c < 0.0f) {
                                float f2 = (-h7Var2.b) / c;
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
                    h7 h7Var3 = this.g[i6];
                    h7Var3.a.h = -1;
                    h7Var3.g(d);
                    je0 je0Var2 = h7Var3.a;
                    je0Var2.h = i6;
                    je0Var2.e(this, h7Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            h7 h7Var = this.g[i];
            if (h7Var != null) {
                ((f60) this.m.b).b(h7Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        s6 s6Var;
        int i = 0;
        while (true) {
            s6Var = this.m;
            je0[] je0VarArr = (je0[]) s6Var.d;
            if (i >= je0VarArr.length) {
                break;
            }
            je0 je0Var = je0VarArr[i];
            if (je0Var != null) {
                je0Var.c();
            }
            i++;
        }
        f60 f60Var = (f60) s6Var.c;
        je0[] je0VarArr2 = this.n;
        int i2 = this.o;
        f60Var.getClass();
        if (i2 > je0VarArr2.length) {
            i2 = je0VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            je0 je0Var2 = je0VarArr2[i3];
            int i4 = f60Var.b;
            Object[] objArr = f60Var.a;
            if (i4 < objArr.length) {
                objArr[i4] = je0Var2;
                f60Var.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((je0[]) s6Var.d, (Object) null);
        this.c = 0;
        k60 k60Var = this.d;
        k60Var.h = 0;
        k60Var.b = 0.0f;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            h7 h7Var = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new h7(s6Var);
    }
}
