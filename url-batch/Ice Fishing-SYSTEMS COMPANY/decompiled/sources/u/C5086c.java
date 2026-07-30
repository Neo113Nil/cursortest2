package u;

import java.util.ArrayList;
import java.util.Arrays;
import m.Q0;
import w.C5143c;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5086c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f40969q = false;

    /* renamed from: d, reason: collision with root package name */
    public final C5087d f40973d;

    /* renamed from: m, reason: collision with root package name */
    public final Q0 f40981m;

    /* renamed from: p, reason: collision with root package name */
    public C5085b f40984p;

    /* renamed from: a, reason: collision with root package name */
    public int f40970a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40971b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f40972c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f40974e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f40975f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40977h = false;
    public boolean[] i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f40978j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f40979k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f40980l = 32;

    /* renamed from: n, reason: collision with root package name */
    public C5089f[] f40982n = new C5089f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f40983o = 0;

    /* renamed from: g, reason: collision with root package name */
    public C5085b[] f40976g = new C5085b[32];

    public C5086c() {
        s();
        Q0 q02 = new Q0(3);
        q02.f39325b = new N.c();
        q02.f39326c = new N.c();
        q02.f39327d = new C5089f[32];
        this.f40981m = q02;
        C5087d c5087d = new C5087d(q02);
        c5087d.f40985f = new C5089f[128];
        c5087d.f40986g = new C5089f[128];
        c5087d.f40987h = 0;
        c5087d.i = new S0.e(18, c5087d);
        this.f40973d = c5087d;
        this.f40984p = new C5085b(q02);
    }

    public static int n(Object obj) {
        C5089f c5089f = ((C5143c) obj).i;
        if (c5089f != null) {
            return (int) (c5089f.f40998x + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C5089f a(int i) {
        N.c cVar = (N.c) this.f40981m.f39326c;
        int i4 = cVar.f1941b;
        C5089f c5089f = null;
        if (i4 > 0) {
            int i9 = i4 - 1;
            ?? r32 = cVar.f1940a;
            ?? r42 = r32[i9];
            r32[i9] = 0;
            cVar.f1941b = i9;
            c5089f = r42;
        }
        C5089f c5089f2 = c5089f;
        if (c5089f2 == null) {
            c5089f2 = new C5089f(i);
            c5089f2.f40993E = i;
        } else {
            c5089f2.c();
            c5089f2.f40993E = i;
        }
        int i10 = this.f40983o;
        int i11 = this.f40970a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f40970a = i12;
            this.f40982n = (C5089f[]) Arrays.copyOf(this.f40982n, i12);
        }
        C5089f[] c5089fArr = this.f40982n;
        int i13 = this.f40983o;
        this.f40983o = i13 + 1;
        c5089fArr[i13] = c5089f2;
        return c5089f2;
    }

    public final void b(C5089f c5089f, C5089f c5089f2, int i, float f6, C5089f c5089f3, C5089f c5089f4, int i4, int i9) {
        C5085b l9 = l();
        if (c5089f2 == c5089f3) {
            l9.f40967d.g(c5089f, 1.0f);
            l9.f40967d.g(c5089f4, 1.0f);
            l9.f40967d.g(c5089f2, -2.0f);
        } else if (f6 == 0.5f) {
            l9.f40967d.g(c5089f, 1.0f);
            l9.f40967d.g(c5089f2, -1.0f);
            l9.f40967d.g(c5089f3, -1.0f);
            l9.f40967d.g(c5089f4, 1.0f);
            if (i > 0 || i4 > 0) {
                l9.f40965b = (-i) + i4;
            }
        } else if (f6 <= 0.0f) {
            l9.f40967d.g(c5089f, -1.0f);
            l9.f40967d.g(c5089f2, 1.0f);
            l9.f40965b = i;
        } else if (f6 >= 1.0f) {
            l9.f40967d.g(c5089f4, -1.0f);
            l9.f40967d.g(c5089f3, 1.0f);
            l9.f40965b = -i4;
        } else {
            float f9 = 1.0f - f6;
            l9.f40967d.g(c5089f, f9 * 1.0f);
            l9.f40967d.g(c5089f2, f9 * (-1.0f));
            l9.f40967d.g(c5089f3, (-1.0f) * f6);
            l9.f40967d.g(c5089f4, 1.0f * f6);
            if (i > 0 || i4 > 0) {
                l9.f40965b = (i4 * f6) + ((-i) * f9);
            }
        }
        if (i9 != 8) {
            l9.a(this, i9);
        }
        c(l9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d3, code lost:
    
        if (r4.f40992D <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e0, code lost:
    
        if (r4.f40992D <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f5, code lost:
    
        if (r4.f40992D <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0102, code lost:
    
        if (r4.f40992D <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C5085b c5085b) {
        boolean z8;
        boolean z9;
        C5089f c5089f;
        C5089f f6;
        ArrayList arrayList;
        if (this.f40979k + 1 >= this.f40980l || this.f40978j + 1 >= this.f40975f) {
            o();
        }
        if (c5085b.f40968e) {
            z8 = false;
        } else {
            if (this.f40976g.length != 0) {
                boolean z10 = false;
                while (!z10) {
                    int d2 = c5085b.f40967d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c5085b.f40966c;
                        if (i >= d2) {
                            break;
                        }
                        C5089f e6 = c5085b.f40967d.e(i);
                        if (e6.f40996v != -1 || e6.f40999y) {
                            arrayList.add(e6);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i4 = 0; i4 < size; i4++) {
                            C5089f c5089f2 = (C5089f) arrayList.get(i4);
                            if (c5089f2.f40999y) {
                                c5085b.h(this, c5089f2, true);
                            } else {
                                c5085b.i(this, this.f40976g[c5089f2.f40996v], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z10 = true;
                    }
                }
                if (c5085b.f40964a != null && c5085b.f40967d.d() == 0) {
                    c5085b.f40968e = true;
                    this.f40971b = true;
                }
            }
            if (c5085b.e()) {
                return;
            }
            float f9 = c5085b.f40965b;
            float f10 = 0.0f;
            if (f9 < 0.0f) {
                c5085b.f40965b = f9 * (-1.0f);
                C5084a c5084a = c5085b.f40967d;
                int i9 = c5084a.f40962h;
                for (int i10 = 0; i9 != -1 && i10 < c5084a.f40955a; i10++) {
                    float[] fArr = c5084a.f40961g;
                    fArr[i9] = fArr[i9] * (-1.0f);
                    i9 = c5084a.f40960f[i9];
                }
            }
            int d3 = c5085b.f40967d.d();
            float f11 = 0.0f;
            float f12 = 0.0f;
            C5089f c5089f3 = null;
            C5089f c5089f4 = null;
            int i11 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i11 < d3) {
                float f13 = c5085b.f40967d.f(i11);
                C5089f e9 = c5085b.f40967d.e(i11);
                float f14 = f10;
                if (e9.f40993E == 1) {
                    if (c5089f3 != null) {
                        if (f11 <= f13) {
                            if (!z11) {
                                if (e9.f40992D > 1) {
                                }
                            }
                        }
                        z11 = true;
                    }
                    c5089f3 = e9;
                    f11 = f13;
                } else if (c5089f3 == null && f13 < f14) {
                    if (c5089f4 != null) {
                        if (f12 <= f13) {
                            if (!z12) {
                                if (e9.f40992D > 1) {
                                }
                            }
                        }
                        z12 = true;
                    }
                    c5089f4 = e9;
                    f12 = f13;
                }
                i11++;
                f10 = f14;
            }
            float f15 = f10;
            if (c5089f3 == null) {
                c5089f3 = c5089f4;
            }
            if (c5089f3 == null) {
                z9 = true;
            } else {
                c5085b.g(c5089f3);
                z9 = false;
            }
            if (c5085b.f40967d.d() == 0) {
                c5085b.f40968e = true;
            }
            if (z9) {
                if (this.f40978j + 1 >= this.f40975f) {
                    o();
                }
                C5089f a9 = a(3);
                int i12 = this.f40972c + 1;
                this.f40972c = i12;
                this.f40978j++;
                a9.f40995u = i12;
                Q0 q02 = this.f40981m;
                ((C5089f[]) q02.f39327d)[i12] = a9;
                c5085b.f40964a = a9;
                int i13 = this.f40979k;
                h(c5085b);
                if (this.f40979k == i13 + 1) {
                    C5085b c5085b2 = this.f40984p;
                    c5085b2.f40964a = null;
                    c5085b2.f40967d.b();
                    for (int i14 = 0; i14 < c5085b.f40967d.d(); i14++) {
                        c5085b2.f40967d.a(c5085b.f40967d.e(i14), c5085b.f40967d.f(i14), true);
                    }
                    r(this.f40984p);
                    if (a9.f40996v == -1) {
                        if (c5085b.f40964a == a9 && (f6 = c5085b.f(null, a9)) != null) {
                            c5085b.g(f6);
                        }
                        if (!c5085b.f40968e) {
                            c5085b.f40964a.e(this, c5085b);
                        }
                        ((N.c) q02.f39325b).b(c5085b);
                        this.f40979k--;
                    }
                    z8 = true;
                    c5089f = c5085b.f40964a;
                    if (c5089f != null) {
                        return;
                    }
                    if (c5089f.f40993E != 1 && c5085b.f40965b < f15) {
                        return;
                    }
                }
            }
            z8 = false;
            c5089f = c5085b.f40964a;
            if (c5089f != null) {
            }
        }
        if (z8) {
            return;
        }
        h(c5085b);
    }

    public final void d(C5089f c5089f, int i) {
        int i4 = c5089f.f40996v;
        if (i4 == -1) {
            c5089f.d(this, i);
            for (int i9 = 0; i9 < this.f40972c + 1; i9++) {
                C5089f c5089f2 = ((C5089f[]) this.f40981m.f39327d)[i9];
            }
            return;
        }
        if (i4 == -1) {
            C5085b l9 = l();
            l9.f40964a = c5089f;
            float f6 = i;
            c5089f.f40998x = f6;
            l9.f40965b = f6;
            l9.f40968e = true;
            c(l9);
            return;
        }
        C5085b c5085b = this.f40976g[i4];
        if (c5085b.f40968e) {
            c5085b.f40965b = i;
            return;
        }
        if (c5085b.f40967d.d() == 0) {
            c5085b.f40968e = true;
            c5085b.f40965b = i;
            return;
        }
        C5085b l10 = l();
        if (i < 0) {
            l10.f40965b = i * (-1);
            l10.f40967d.g(c5089f, 1.0f);
        } else {
            l10.f40965b = i;
            l10.f40967d.g(c5089f, -1.0f);
        }
        c(l10);
    }

    public final void e(C5089f c5089f, C5089f c5089f2, int i, int i4) {
        if (i4 == 8 && c5089f2.f40999y && c5089f.f40996v == -1) {
            c5089f.d(this, c5089f2.f40998x + i);
            return;
        }
        C5085b l9 = l();
        boolean z8 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z8 = true;
            }
            l9.f40965b = i;
        }
        if (z8) {
            l9.f40967d.g(c5089f, 1.0f);
            l9.f40967d.g(c5089f2, -1.0f);
        } else {
            l9.f40967d.g(c5089f, -1.0f);
            l9.f40967d.g(c5089f2, 1.0f);
        }
        if (i4 != 8) {
            l9.a(this, i4);
        }
        c(l9);
    }

    public final void f(C5089f c5089f, C5089f c5089f2, int i, int i4) {
        C5085b l9 = l();
        C5089f m8 = m();
        m8.f40997w = 0;
        l9.b(c5089f, c5089f2, m8, i);
        if (i4 != 8) {
            l9.f40967d.g(j(i4), (int) (l9.f40967d.c(m8) * (-1.0f)));
        }
        c(l9);
    }

    public final void g(C5089f c5089f, C5089f c5089f2, int i, int i4) {
        C5085b l9 = l();
        C5089f m8 = m();
        m8.f40997w = 0;
        l9.c(c5089f, c5089f2, m8, i);
        if (i4 != 8) {
            l9.f40967d.g(j(i4), (int) (l9.f40967d.c(m8) * (-1.0f)));
        }
        c(l9);
    }

    public final void h(C5085b c5085b) {
        int i;
        if (c5085b.f40968e) {
            c5085b.f40964a.d(this, c5085b.f40965b);
        } else {
            C5085b[] c5085bArr = this.f40976g;
            int i4 = this.f40979k;
            c5085bArr[i4] = c5085b;
            C5089f c5089f = c5085b.f40964a;
            c5089f.f40996v = i4;
            this.f40979k = i4 + 1;
            c5089f.e(this, c5085b);
        }
        if (this.f40971b) {
            int i9 = 0;
            while (i9 < this.f40979k) {
                if (this.f40976g[i9] == null) {
                    System.out.println("WTF");
                }
                C5085b c5085b2 = this.f40976g[i9];
                if (c5085b2 != null && c5085b2.f40968e) {
                    c5085b2.f40964a.d(this, c5085b2.f40965b);
                    ((N.c) this.f40981m.f39325b).b(c5085b2);
                    this.f40976g[i9] = null;
                    int i10 = i9 + 1;
                    int i11 = i10;
                    while (true) {
                        i = this.f40979k;
                        if (i10 >= i) {
                            break;
                        }
                        C5085b[] c5085bArr2 = this.f40976g;
                        int i12 = i10 - 1;
                        C5085b c5085b3 = c5085bArr2[i10];
                        c5085bArr2[i12] = c5085b3;
                        C5089f c5089f2 = c5085b3.f40964a;
                        if (c5089f2.f40996v == i10) {
                            c5089f2.f40996v = i12;
                        }
                        i11 = i10;
                        i10++;
                    }
                    if (i11 < i) {
                        this.f40976g[i11] = null;
                    }
                    this.f40979k = i - 1;
                    i9--;
                }
                i9++;
            }
            this.f40971b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f40979k; i++) {
            C5085b c5085b = this.f40976g[i];
            c5085b.f40964a.f40998x = c5085b.f40965b;
        }
    }

    public final C5089f j(int i) {
        if (this.f40978j + 1 >= this.f40975f) {
            o();
        }
        C5089f a9 = a(4);
        int i4 = this.f40972c + 1;
        this.f40972c = i4;
        this.f40978j++;
        a9.f40995u = i4;
        a9.f40997w = i;
        ((C5089f[]) this.f40981m.f39327d)[i4] = a9;
        C5087d c5087d = this.f40973d;
        c5087d.i.f2891u = a9;
        float[] fArr = a9.f40989A;
        Arrays.fill(fArr, 0.0f);
        fArr[a9.f40997w] = 1.0f;
        c5087d.j(a9);
        return a9;
    }

    public final C5089f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f40978j + 1 >= this.f40975f) {
            o();
        }
        if (!(obj instanceof C5143c)) {
            return null;
        }
        C5143c c5143c = (C5143c) obj;
        C5089f c5089f = c5143c.i;
        if (c5089f == null) {
            c5143c.k();
            c5089f = c5143c.i;
        }
        int i = c5089f.f40995u;
        Q0 q02 = this.f40981m;
        if (i != -1 && i <= this.f40972c && ((C5089f[]) q02.f39327d)[i] != null) {
            return c5089f;
        }
        if (i != -1) {
            c5089f.c();
        }
        int i4 = this.f40972c + 1;
        this.f40972c = i4;
        this.f40978j++;
        c5089f.f40995u = i4;
        c5089f.f40993E = 1;
        ((C5089f[]) q02.f39327d)[i4] = c5089f;
        return c5089f;
    }

    public final C5085b l() {
        Object obj;
        Q0 q02 = this.f40981m;
        N.c cVar = (N.c) q02.f39325b;
        int i = cVar.f1941b;
        if (i > 0) {
            int i4 = i - 1;
            Object[] objArr = cVar.f1940a;
            obj = objArr[i4];
            objArr[i4] = null;
            cVar.f1941b = i4;
        } else {
            obj = null;
        }
        C5085b c5085b = (C5085b) obj;
        if (c5085b == null) {
            return new C5085b(q02);
        }
        c5085b.f40964a = null;
        c5085b.f40967d.b();
        c5085b.f40965b = 0.0f;
        c5085b.f40968e = false;
        return c5085b;
    }

    public final C5089f m() {
        if (this.f40978j + 1 >= this.f40975f) {
            o();
        }
        C5089f a9 = a(3);
        int i = this.f40972c + 1;
        this.f40972c = i;
        this.f40978j++;
        a9.f40995u = i;
        ((C5089f[]) this.f40981m.f39327d)[i] = a9;
        return a9;
    }

    public final void o() {
        int i = this.f40974e * 2;
        this.f40974e = i;
        this.f40976g = (C5085b[]) Arrays.copyOf(this.f40976g, i);
        Q0 q02 = this.f40981m;
        q02.f39327d = (C5089f[]) Arrays.copyOf((C5089f[]) q02.f39327d, this.f40974e);
        int i4 = this.f40974e;
        this.i = new boolean[i4];
        this.f40975f = i4;
        this.f40980l = i4;
    }

    public final void p() {
        C5087d c5087d = this.f40973d;
        if (c5087d.e()) {
            i();
            return;
        }
        if (!this.f40977h) {
            q(c5087d);
            return;
        }
        for (int i = 0; i < this.f40979k; i++) {
            if (!this.f40976g[i].f40968e) {
                q(c5087d);
                return;
            }
        }
        i();
    }

    public final void q(C5087d c5087d) {
        int i = 0;
        while (true) {
            if (i >= this.f40979k) {
                break;
            }
            C5085b c5085b = this.f40976g[i];
            int i4 = 1;
            if (c5085b.f40964a.f40993E != 1) {
                float f6 = 0.0f;
                if (c5085b.f40965b < 0.0f) {
                    boolean z8 = false;
                    int i9 = 0;
                    while (!z8) {
                        i9 += i4;
                        float f9 = Float.MAX_VALUE;
                        int i10 = -1;
                        int i11 = -1;
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < this.f40979k) {
                            C5085b c5085b2 = this.f40976g[i12];
                            if (c5085b2.f40964a.f40993E != i4 && !c5085b2.f40968e && c5085b2.f40965b < f6) {
                                int d2 = c5085b2.f40967d.d();
                                int i14 = 0;
                                while (i14 < d2) {
                                    C5089f e6 = c5085b2.f40967d.e(i14);
                                    float c4 = c5085b2.f40967d.c(e6);
                                    if (c4 > f6) {
                                        for (int i15 = 0; i15 < 9; i15++) {
                                            float f10 = e6.f41000z[i15] / c4;
                                            if ((f10 < f9 && i15 == i13) || i15 > i13) {
                                                i13 = i15;
                                                i11 = e6.f40995u;
                                                i10 = i12;
                                                f9 = f10;
                                            }
                                        }
                                    }
                                    i14++;
                                    f6 = 0.0f;
                                }
                            }
                            i12++;
                            f6 = 0.0f;
                            i4 = 1;
                        }
                        if (i10 != -1) {
                            C5085b c5085b3 = this.f40976g[i10];
                            c5085b3.f40964a.f40996v = -1;
                            c5085b3.g(((C5089f[]) this.f40981m.f39327d)[i11]);
                            C5089f c5089f = c5085b3.f40964a;
                            c5089f.f40996v = i10;
                            c5089f.e(this, c5085b3);
                        } else {
                            z8 = true;
                        }
                        if (i9 > this.f40978j / 2) {
                            z8 = true;
                        }
                        f6 = 0.0f;
                        i4 = 1;
                    }
                }
            }
            i++;
        }
        r(c5087d);
        i();
    }

    public final void r(C5085b c5085b) {
        boolean z8;
        int i = 0;
        for (int i4 = 0; i4 < this.f40978j; i4++) {
            this.i[i4] = false;
        }
        boolean z9 = false;
        int i9 = 0;
        while (!z9) {
            int i10 = 1;
            i9++;
            if (i9 >= this.f40978j * 2) {
                return;
            }
            C5089f c5089f = c5085b.f40964a;
            if (c5089f != null) {
                this.i[c5089f.f40995u] = true;
            }
            C5089f d2 = c5085b.d(this.i);
            if (d2 != null) {
                boolean[] zArr = this.i;
                int i11 = d2.f40995u;
                if (zArr[i11]) {
                    return;
                } else {
                    zArr[i11] = true;
                }
            }
            if (d2 != null) {
                float f6 = Float.MAX_VALUE;
                int i12 = i;
                int i13 = -1;
                while (i12 < this.f40979k) {
                    C5085b c5085b2 = this.f40976g[i12];
                    if (c5085b2.f40964a.f40993E != i10 && !c5085b2.f40968e) {
                        C5084a c5084a = c5085b2.f40967d;
                        int i14 = c5084a.f40962h;
                        if (i14 != -1) {
                            for (int i15 = 0; i14 != -1 && i15 < c5084a.f40955a; i15++) {
                                if (c5084a.f40959e[i14] == d2.f40995u) {
                                    z8 = true;
                                    break;
                                }
                                i14 = c5084a.f40960f[i14];
                            }
                        }
                        z8 = false;
                        if (z8) {
                            float c4 = c5085b2.f40967d.c(d2);
                            if (c4 < 0.0f) {
                                float f9 = (-c5085b2.f40965b) / c4;
                                if (f9 < f6) {
                                    f6 = f9;
                                    i13 = i12;
                                }
                            }
                        }
                    }
                    i12++;
                    i10 = 1;
                }
                if (i13 > -1) {
                    C5085b c5085b3 = this.f40976g[i13];
                    c5085b3.f40964a.f40996v = -1;
                    c5085b3.g(d2);
                    C5089f c5089f2 = c5085b3.f40964a;
                    c5089f2.f40996v = i13;
                    c5089f2.e(this, c5085b3);
                }
            } else {
                z9 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f40979k; i++) {
            C5085b c5085b = this.f40976g[i];
            if (c5085b != null) {
                ((N.c) this.f40981m.f39325b).b(c5085b);
            }
            this.f40976g[i] = null;
        }
    }

    public final void t() {
        Q0 q02;
        int i = 0;
        while (true) {
            q02 = this.f40981m;
            C5089f[] c5089fArr = (C5089f[]) q02.f39327d;
            if (i >= c5089fArr.length) {
                break;
            }
            C5089f c5089f = c5089fArr[i];
            if (c5089f != null) {
                c5089f.c();
            }
            i++;
        }
        N.c cVar = (N.c) q02.f39326c;
        C5089f[] c5089fArr2 = this.f40982n;
        int i4 = this.f40983o;
        cVar.getClass();
        if (i4 > c5089fArr2.length) {
            i4 = c5089fArr2.length;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            C5089f c5089f2 = c5089fArr2[i9];
            int i10 = cVar.f1941b;
            Object[] objArr = cVar.f1940a;
            if (i10 < objArr.length) {
                objArr[i10] = c5089f2;
                cVar.f1941b = i10 + 1;
            }
        }
        this.f40983o = 0;
        Arrays.fill((C5089f[]) q02.f39327d, (Object) null);
        this.f40972c = 0;
        C5087d c5087d = this.f40973d;
        c5087d.f40987h = 0;
        c5087d.f40965b = 0.0f;
        this.f40978j = 1;
        for (int i11 = 0; i11 < this.f40979k; i11++) {
            C5085b c5085b = this.f40976g[i11];
        }
        s();
        this.f40979k = 0;
        this.f40984p = new C5085b(q02);
    }
}
