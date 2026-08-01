package q;

import B.j;
import K.C0011l;
import java.util.ArrayList;
import java.util.Arrays;
import s.C0295c;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3416p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3417q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0287d f3420c;

    /* renamed from: f, reason: collision with root package name */
    public C0285b[] f3422f;

    /* renamed from: l, reason: collision with root package name */
    public final C0011l f3426l;

    /* renamed from: o, reason: collision with root package name */
    public C0285b f3429o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3418a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3419b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3421e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3423g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3424j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3425k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0289f[] f3427m = new C0289f[f3417q];

    /* renamed from: n, reason: collision with root package name */
    public int f3428n = 0;

    public C0286c() {
        this.f3422f = null;
        this.f3422f = new C0285b[32];
        s();
        C0011l c0011l = new C0011l();
        c0011l.f422b = new J.b();
        c0011l.f423c = new J.b();
        c0011l.d = new C0289f[32];
        this.f3426l = c0011l;
        C0287d c0287d = new C0287d(c0011l);
        c0287d.f3430f = new C0289f[128];
        c0287d.f3431g = new C0289f[128];
        c0287d.h = 0;
        c0287d.i = new j(c0287d);
        this.f3420c = c0287d;
        this.f3429o = new C0285b(c0011l);
    }

    public static int n(Object obj) {
        C0289f c0289f = ((C0295c) obj).i;
        if (c0289f != null) {
            return (int) (c0289f.f3436e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0289f a(int i) {
        J.b bVar = (J.b) this.f3426l.f423c;
        int i2 = bVar.f344b;
        C0289f c0289f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f343a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f344b = i3;
            c0289f = r4;
        }
        C0289f c0289f2 = c0289f;
        if (c0289f2 == null) {
            c0289f2 = new C0289f(i);
            c0289f2.f3441l = i;
        } else {
            c0289f2.c();
            c0289f2.f3441l = i;
        }
        int i4 = this.f3428n;
        int i5 = f3417q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3417q = i6;
            this.f3427m = (C0289f[]) Arrays.copyOf(this.f3427m, i6);
        }
        C0289f[] c0289fArr = this.f3427m;
        int i7 = this.f3428n;
        this.f3428n = i7 + 1;
        c0289fArr[i7] = c0289f2;
        return c0289f2;
    }

    public final void b(C0289f c0289f, C0289f c0289f2, int i, float f2, C0289f c0289f3, C0289f c0289f4, int i2, int i3) {
        C0285b l2 = l();
        if (c0289f2 == c0289f3) {
            l2.d.g(c0289f, 1.0f);
            l2.d.g(c0289f4, 1.0f);
            l2.d.g(c0289f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0289f, 1.0f);
            l2.d.g(c0289f2, -1.0f);
            l2.d.g(c0289f3, -1.0f);
            l2.d.g(c0289f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3413b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.d.g(c0289f, -1.0f);
            l2.d.g(c0289f2, 1.0f);
            l2.f3413b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0289f4, -1.0f);
            l2.d.g(c0289f3, 1.0f);
            l2.f3413b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0289f, f3 * 1.0f);
            l2.d.g(c0289f2, f3 * (-1.0f));
            l2.d.g(c0289f3, (-1.0f) * f2);
            l2.d.g(c0289f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3413b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3440k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3440k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3440k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3440k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0285b c0285b) {
        boolean z2;
        boolean z3;
        C0289f c0289f;
        C0289f f2;
        ArrayList arrayList;
        if (this.f3424j + 1 >= this.f3425k || this.i + 1 >= this.f3421e) {
            o();
        }
        if (c0285b.f3415e) {
            z2 = false;
        } else {
            if (this.f3422f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0285b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0285b.f3414c;
                        if (i >= d) {
                            break;
                        }
                        C0289f e2 = c0285b.d.e(i);
                        if (e2.f3435c != -1 || e2.f3437f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0289f c0289f2 = (C0289f) arrayList.get(i2);
                            if (c0289f2.f3437f) {
                                c0285b.h(this, c0289f2, true);
                            } else {
                                c0285b.i(this, this.f3422f[c0289f2.f3435c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0285b.f3412a != null && c0285b.d.d() == 0) {
                    c0285b.f3415e = true;
                    this.f3418a = true;
                }
            }
            if (c0285b.e()) {
                return;
            }
            float f3 = c0285b.f3413b;
            if (f3 < 0.0f) {
                c0285b.f3413b = f3 * (-1.0f);
                C0284a c0284a = c0285b.d;
                int i3 = c0284a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0284a.f3405a; i4++) {
                    float[] fArr = c0284a.f3410g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0284a.f3409f[i3];
                }
            }
            int d2 = c0285b.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0289f c0289f3 = null;
            C0289f c0289f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d2; i5++) {
                float f6 = c0285b.d.f(i5);
                C0289f e3 = c0285b.d.e(i5);
                if (e3.f3441l == 1) {
                    if (c0289f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3440k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0289f3 = e3;
                    f4 = f6;
                } else if (c0289f3 == null && f6 < 0.0f) {
                    if (c0289f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3440k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0289f4 = e3;
                    f5 = f6;
                }
            }
            if (c0289f3 == null) {
                c0289f3 = c0289f4;
            }
            if (c0289f3 == null) {
                z3 = true;
            } else {
                c0285b.g(c0289f3);
                z3 = false;
            }
            if (c0285b.d.d() == 0) {
                c0285b.f3415e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3421e) {
                    o();
                }
                C0289f a2 = a(3);
                int i6 = this.f3419b + 1;
                this.f3419b = i6;
                this.i++;
                a2.f3434b = i6;
                C0011l c0011l = this.f3426l;
                ((C0289f[]) c0011l.d)[i6] = a2;
                c0285b.f3412a = a2;
                int i7 = this.f3424j;
                h(c0285b);
                if (this.f3424j == i7 + 1) {
                    C0285b c0285b2 = this.f3429o;
                    c0285b2.f3412a = null;
                    c0285b2.d.b();
                    for (int i8 = 0; i8 < c0285b.d.d(); i8++) {
                        c0285b2.d.a(c0285b.d.e(i8), c0285b.d.f(i8), true);
                    }
                    r(this.f3429o);
                    if (a2.f3435c == -1) {
                        if (c0285b.f3412a == a2 && (f2 = c0285b.f(null, a2)) != null) {
                            c0285b.g(f2);
                        }
                        if (!c0285b.f3415e) {
                            c0285b.f3412a.e(this, c0285b);
                        }
                        ((J.b) c0011l.f422b).b(c0285b);
                        this.f3424j--;
                    }
                    z2 = true;
                    c0289f = c0285b.f3412a;
                    if (c0289f != null) {
                        return;
                    }
                    if (c0289f.f3441l != 1 && c0285b.f3413b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c0289f = c0285b.f3412a;
            if (c0289f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0285b);
    }

    public final void d(C0289f c0289f, int i) {
        int i2 = c0289f.f3435c;
        if (i2 == -1) {
            c0289f.d(this, i);
            for (int i3 = 0; i3 < this.f3419b + 1; i3++) {
                C0289f c0289f2 = ((C0289f[]) this.f3426l.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0285b l2 = l();
            l2.f3412a = c0289f;
            float f2 = i;
            c0289f.f3436e = f2;
            l2.f3413b = f2;
            l2.f3415e = true;
            c(l2);
            return;
        }
        C0285b c0285b = this.f3422f[i2];
        if (c0285b.f3415e) {
            c0285b.f3413b = i;
            return;
        }
        if (c0285b.d.d() == 0) {
            c0285b.f3415e = true;
            c0285b.f3413b = i;
            return;
        }
        C0285b l3 = l();
        if (i < 0) {
            l3.f3413b = i * (-1);
            l3.d.g(c0289f, 1.0f);
        } else {
            l3.f3413b = i;
            l3.d.g(c0289f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0289f c0289f, C0289f c0289f2, int i, int i2) {
        if (i2 == 8 && c0289f2.f3437f && c0289f.f3435c == -1) {
            c0289f.d(this, c0289f2.f3436e + i);
            return;
        }
        C0285b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3413b = i;
        }
        if (z2) {
            l2.d.g(c0289f, 1.0f);
            l2.d.g(c0289f2, -1.0f);
        } else {
            l2.d.g(c0289f, -1.0f);
            l2.d.g(c0289f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0289f c0289f, C0289f c0289f2, int i, int i2) {
        C0285b l2 = l();
        C0289f m2 = m();
        m2.d = 0;
        l2.b(c0289f, c0289f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0289f c0289f, C0289f c0289f2, int i, int i2) {
        C0285b l2 = l();
        C0289f m2 = m();
        m2.d = 0;
        l2.c(c0289f, c0289f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0285b c0285b) {
        int i;
        if (c0285b.f3415e) {
            c0285b.f3412a.d(this, c0285b.f3413b);
        } else {
            C0285b[] c0285bArr = this.f3422f;
            int i2 = this.f3424j;
            c0285bArr[i2] = c0285b;
            C0289f c0289f = c0285b.f3412a;
            c0289f.f3435c = i2;
            this.f3424j = i2 + 1;
            c0289f.e(this, c0285b);
        }
        if (this.f3418a) {
            int i3 = 0;
            while (i3 < this.f3424j) {
                if (this.f3422f[i3] == null) {
                    System.out.println("WTF");
                }
                C0285b c0285b2 = this.f3422f[i3];
                if (c0285b2 != null && c0285b2.f3415e) {
                    c0285b2.f3412a.d(this, c0285b2.f3413b);
                    ((J.b) this.f3426l.f422b).b(c0285b2);
                    this.f3422f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3424j;
                        if (i4 >= i) {
                            break;
                        }
                        C0285b[] c0285bArr2 = this.f3422f;
                        int i6 = i4 - 1;
                        C0285b c0285b3 = c0285bArr2[i4];
                        c0285bArr2[i6] = c0285b3;
                        C0289f c0289f2 = c0285b3.f3412a;
                        if (c0289f2.f3435c == i4) {
                            c0289f2.f3435c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3422f[i5] = null;
                    }
                    this.f3424j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3418a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3424j; i++) {
            C0285b c0285b = this.f3422f[i];
            c0285b.f3412a.f3436e = c0285b.f3413b;
        }
    }

    public final C0289f j(int i) {
        if (this.i + 1 >= this.f3421e) {
            o();
        }
        C0289f a2 = a(4);
        int i2 = this.f3419b + 1;
        this.f3419b = i2;
        this.i++;
        a2.f3434b = i2;
        a2.d = i;
        ((C0289f[]) this.f3426l.d)[i2] = a2;
        C0287d c0287d = this.f3420c;
        c0287d.i.f27b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.d] = 1.0f;
        c0287d.j(a2);
        return a2;
    }

    public final C0289f k(Object obj) {
        C0289f c0289f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3421e) {
            o();
        }
        if (obj instanceof C0295c) {
            C0295c c0295c = (C0295c) obj;
            c0289f = c0295c.i;
            if (c0289f == null) {
                c0295c.k();
                c0289f = c0295c.i;
            }
            int i = c0289f.f3434b;
            C0011l c0011l = this.f3426l;
            if (i == -1 || i > this.f3419b || ((C0289f[]) c0011l.d)[i] == null) {
                if (i != -1) {
                    c0289f.c();
                }
                int i2 = this.f3419b + 1;
                this.f3419b = i2;
                this.i++;
                c0289f.f3434b = i2;
                c0289f.f3441l = 1;
                ((C0289f[]) c0011l.d)[i2] = c0289f;
            }
        }
        return c0289f;
    }

    public final C0285b l() {
        Object obj;
        C0011l c0011l = this.f3426l;
        J.b bVar = (J.b) c0011l.f422b;
        int i = bVar.f344b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f343a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f344b = i2;
        } else {
            obj = null;
        }
        C0285b c0285b = (C0285b) obj;
        if (c0285b == null) {
            return new C0285b(c0011l);
        }
        c0285b.f3412a = null;
        c0285b.d.b();
        c0285b.f3413b = 0.0f;
        c0285b.f3415e = false;
        return c0285b;
    }

    public final C0289f m() {
        if (this.i + 1 >= this.f3421e) {
            o();
        }
        C0289f a2 = a(3);
        int i = this.f3419b + 1;
        this.f3419b = i;
        this.i++;
        a2.f3434b = i;
        ((C0289f[]) this.f3426l.d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3422f = (C0285b[]) Arrays.copyOf(this.f3422f, i);
        C0011l c0011l = this.f3426l;
        c0011l.d = (C0289f[]) Arrays.copyOf((C0289f[]) c0011l.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3421e = i2;
        this.f3425k = i2;
    }

    public final void p() {
        C0287d c0287d = this.f3420c;
        if (c0287d.e()) {
            i();
            return;
        }
        if (!this.f3423g) {
            q(c0287d);
            return;
        }
        for (int i = 0; i < this.f3424j; i++) {
            if (!this.f3422f[i].f3415e) {
                q(c0287d);
                return;
            }
        }
        i();
    }

    public final void q(C0287d c0287d) {
        int i = 0;
        while (true) {
            if (i >= this.f3424j) {
                break;
            }
            C0285b c0285b = this.f3422f[i];
            int i2 = 1;
            if (c0285b.f3412a.f3441l != 1) {
                float f2 = 0.0f;
                if (c0285b.f3413b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3424j) {
                            C0285b c0285b2 = this.f3422f[i6];
                            if (c0285b2.f3412a.f3441l != i2 && !c0285b2.f3415e && c0285b2.f3413b < f2) {
                                int d = c0285b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0289f e2 = c0285b2.d.e(i8);
                                    float c2 = c0285b2.d.c(e2);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e2.f3438g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3434b;
                                                i4 = i6;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = 0.0f;
                                }
                            }
                            i6++;
                            f2 = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0285b c0285b3 = this.f3422f[i4];
                            c0285b3.f3412a.f3435c = -1;
                            c0285b3.g(((C0289f[]) this.f3426l.d)[i5]);
                            C0289f c0289f = c0285b3.f3412a;
                            c0289f.f3435c = i4;
                            c0289f.e(this, c0285b3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.i / 2) {
                            z2 = true;
                        }
                        f2 = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(c0287d);
        i();
    }

    public final void r(C0285b c0285b) {
        boolean z2;
        int i = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            int i4 = 1;
            i3++;
            if (i3 >= this.i * 2) {
                return;
            }
            C0289f c0289f = c0285b.f3412a;
            if (c0289f != null) {
                this.h[c0289f.f3434b] = true;
            }
            C0289f d = c0285b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3434b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (d != null) {
                float f2 = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.f3424j) {
                    C0285b c0285b2 = this.f3422f[i6];
                    if (c0285b2.f3412a.f3441l != i4 && !c0285b2.f3415e) {
                        C0284a c0284a = c0285b2.d;
                        int i8 = c0284a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0284a.f3405a; i9++) {
                                if (c0284a.f3408e[i8] == d.f3434b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0284a.f3409f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0285b2.d.c(d);
                            if (c2 < 0.0f) {
                                float f3 = (-c0285b2.f3413b) / c2;
                                if (f3 < f2) {
                                    f2 = f3;
                                    i7 = i6;
                                }
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    C0285b c0285b3 = this.f3422f[i7];
                    c0285b3.f3412a.f3435c = -1;
                    c0285b3.g(d);
                    C0289f c0289f2 = c0285b3.f3412a;
                    c0289f2.f3435c = i7;
                    c0289f2.e(this, c0285b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3424j; i++) {
            C0285b c0285b = this.f3422f[i];
            if (c0285b != null) {
                ((J.b) this.f3426l.f422b).b(c0285b);
            }
            this.f3422f[i] = null;
        }
    }

    public final void t() {
        C0011l c0011l;
        int i = 0;
        while (true) {
            c0011l = this.f3426l;
            C0289f[] c0289fArr = (C0289f[]) c0011l.d;
            if (i >= c0289fArr.length) {
                break;
            }
            C0289f c0289f = c0289fArr[i];
            if (c0289f != null) {
                c0289f.c();
            }
            i++;
        }
        J.b bVar = (J.b) c0011l.f423c;
        C0289f[] c0289fArr2 = this.f3427m;
        int i2 = this.f3428n;
        bVar.getClass();
        if (i2 > c0289fArr2.length) {
            i2 = c0289fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0289f c0289f2 = c0289fArr2[i3];
            int i4 = bVar.f344b;
            Object[] objArr = bVar.f343a;
            if (i4 < objArr.length) {
                objArr[i4] = c0289f2;
                bVar.f344b = i4 + 1;
            }
        }
        this.f3428n = 0;
        Arrays.fill((C0289f[]) c0011l.d, (Object) null);
        this.f3419b = 0;
        C0287d c0287d = this.f3420c;
        c0287d.h = 0;
        c0287d.f3413b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3424j; i5++) {
            C0285b c0285b = this.f3422f[i5];
        }
        s();
        this.f3424j = 0;
        this.f3429o = new C0285b(c0011l);
    }
}
