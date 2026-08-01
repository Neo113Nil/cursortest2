package q;

import B.j;
import K.C0012l;
import java.util.ArrayList;
import java.util.Arrays;
import s.C0297c;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3522p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3523q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0289d f3526c;

    /* renamed from: f, reason: collision with root package name */
    public C0287b[] f3528f;

    /* renamed from: l, reason: collision with root package name */
    public final C0012l f3532l;

    /* renamed from: o, reason: collision with root package name */
    public C0287b f3535o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3524a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3525b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3527e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3529g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3530j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3531k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0291f[] f3533m = new C0291f[f3523q];

    /* renamed from: n, reason: collision with root package name */
    public int f3534n = 0;

    public C0288c() {
        this.f3528f = null;
        this.f3528f = new C0287b[32];
        s();
        C0012l c0012l = new C0012l();
        c0012l.f431b = new J.b();
        c0012l.f432c = new J.b();
        c0012l.d = new C0291f[32];
        this.f3532l = c0012l;
        C0289d c0289d = new C0289d(c0012l);
        c0289d.f3536f = new C0291f[128];
        c0289d.f3537g = new C0291f[128];
        c0289d.h = 0;
        c0289d.i = new j(c0289d);
        this.f3526c = c0289d;
        this.f3535o = new C0287b(c0012l);
    }

    public static int n(Object obj) {
        C0291f c0291f = ((C0297c) obj).i;
        if (c0291f != null) {
            return (int) (c0291f.f3542e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0291f a(int i) {
        J.b bVar = (J.b) this.f3532l.f432c;
        int i2 = bVar.f353b;
        C0291f c0291f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f352a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f353b = i3;
            c0291f = r4;
        }
        C0291f c0291f2 = c0291f;
        if (c0291f2 == null) {
            c0291f2 = new C0291f(i);
            c0291f2.f3547l = i;
        } else {
            c0291f2.c();
            c0291f2.f3547l = i;
        }
        int i4 = this.f3534n;
        int i5 = f3523q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3523q = i6;
            this.f3533m = (C0291f[]) Arrays.copyOf(this.f3533m, i6);
        }
        C0291f[] c0291fArr = this.f3533m;
        int i7 = this.f3534n;
        this.f3534n = i7 + 1;
        c0291fArr[i7] = c0291f2;
        return c0291f2;
    }

    public final void b(C0291f c0291f, C0291f c0291f2, int i, float f2, C0291f c0291f3, C0291f c0291f4, int i2, int i3) {
        C0287b l2 = l();
        if (c0291f2 == c0291f3) {
            l2.d.g(c0291f, 1.0f);
            l2.d.g(c0291f4, 1.0f);
            l2.d.g(c0291f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0291f, 1.0f);
            l2.d.g(c0291f2, -1.0f);
            l2.d.g(c0291f3, -1.0f);
            l2.d.g(c0291f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3519b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.d.g(c0291f, -1.0f);
            l2.d.g(c0291f2, 1.0f);
            l2.f3519b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0291f4, -1.0f);
            l2.d.g(c0291f3, 1.0f);
            l2.f3519b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0291f, f3 * 1.0f);
            l2.d.g(c0291f2, f3 * (-1.0f));
            l2.d.g(c0291f3, (-1.0f) * f2);
            l2.d.g(c0291f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3519b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3546k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3546k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3546k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3546k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0287b c0287b) {
        boolean z2;
        boolean z3;
        C0291f c0291f;
        C0291f f2;
        ArrayList arrayList;
        if (this.f3530j + 1 >= this.f3531k || this.i + 1 >= this.f3527e) {
            o();
        }
        if (c0287b.f3521e) {
            z2 = false;
        } else {
            if (this.f3528f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0287b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0287b.f3520c;
                        if (i >= d) {
                            break;
                        }
                        C0291f e2 = c0287b.d.e(i);
                        if (e2.f3541c != -1 || e2.f3543f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0291f c0291f2 = (C0291f) arrayList.get(i2);
                            if (c0291f2.f3543f) {
                                c0287b.h(this, c0291f2, true);
                            } else {
                                c0287b.i(this, this.f3528f[c0291f2.f3541c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0287b.f3518a != null && c0287b.d.d() == 0) {
                    c0287b.f3521e = true;
                    this.f3524a = true;
                }
            }
            if (c0287b.e()) {
                return;
            }
            float f3 = c0287b.f3519b;
            if (f3 < 0.0f) {
                c0287b.f3519b = f3 * (-1.0f);
                C0286a c0286a = c0287b.d;
                int i3 = c0286a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0286a.f3511a; i4++) {
                    float[] fArr = c0286a.f3516g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0286a.f3515f[i3];
                }
            }
            int d2 = c0287b.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0291f c0291f3 = null;
            C0291f c0291f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d2; i5++) {
                float f6 = c0287b.d.f(i5);
                C0291f e3 = c0287b.d.e(i5);
                if (e3.f3547l == 1) {
                    if (c0291f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3546k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0291f3 = e3;
                    f4 = f6;
                } else if (c0291f3 == null && f6 < 0.0f) {
                    if (c0291f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3546k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0291f4 = e3;
                    f5 = f6;
                }
            }
            if (c0291f3 == null) {
                c0291f3 = c0291f4;
            }
            if (c0291f3 == null) {
                z3 = true;
            } else {
                c0287b.g(c0291f3);
                z3 = false;
            }
            if (c0287b.d.d() == 0) {
                c0287b.f3521e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3527e) {
                    o();
                }
                C0291f a2 = a(3);
                int i6 = this.f3525b + 1;
                this.f3525b = i6;
                this.i++;
                a2.f3540b = i6;
                C0012l c0012l = this.f3532l;
                ((C0291f[]) c0012l.d)[i6] = a2;
                c0287b.f3518a = a2;
                int i7 = this.f3530j;
                h(c0287b);
                if (this.f3530j == i7 + 1) {
                    C0287b c0287b2 = this.f3535o;
                    c0287b2.f3518a = null;
                    c0287b2.d.b();
                    for (int i8 = 0; i8 < c0287b.d.d(); i8++) {
                        c0287b2.d.a(c0287b.d.e(i8), c0287b.d.f(i8), true);
                    }
                    r(this.f3535o);
                    if (a2.f3541c == -1) {
                        if (c0287b.f3518a == a2 && (f2 = c0287b.f(null, a2)) != null) {
                            c0287b.g(f2);
                        }
                        if (!c0287b.f3521e) {
                            c0287b.f3518a.e(this, c0287b);
                        }
                        ((J.b) c0012l.f431b).b(c0287b);
                        this.f3530j--;
                    }
                    z2 = true;
                    c0291f = c0287b.f3518a;
                    if (c0291f != null) {
                        return;
                    }
                    if (c0291f.f3547l != 1 && c0287b.f3519b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c0291f = c0287b.f3518a;
            if (c0291f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0287b);
    }

    public final void d(C0291f c0291f, int i) {
        int i2 = c0291f.f3541c;
        if (i2 == -1) {
            c0291f.d(this, i);
            for (int i3 = 0; i3 < this.f3525b + 1; i3++) {
                C0291f c0291f2 = ((C0291f[]) this.f3532l.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0287b l2 = l();
            l2.f3518a = c0291f;
            float f2 = i;
            c0291f.f3542e = f2;
            l2.f3519b = f2;
            l2.f3521e = true;
            c(l2);
            return;
        }
        C0287b c0287b = this.f3528f[i2];
        if (c0287b.f3521e) {
            c0287b.f3519b = i;
            return;
        }
        if (c0287b.d.d() == 0) {
            c0287b.f3521e = true;
            c0287b.f3519b = i;
            return;
        }
        C0287b l3 = l();
        if (i < 0) {
            l3.f3519b = i * (-1);
            l3.d.g(c0291f, 1.0f);
        } else {
            l3.f3519b = i;
            l3.d.g(c0291f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0291f c0291f, C0291f c0291f2, int i, int i2) {
        if (i2 == 8 && c0291f2.f3543f && c0291f.f3541c == -1) {
            c0291f.d(this, c0291f2.f3542e + i);
            return;
        }
        C0287b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3519b = i;
        }
        if (z2) {
            l2.d.g(c0291f, 1.0f);
            l2.d.g(c0291f2, -1.0f);
        } else {
            l2.d.g(c0291f, -1.0f);
            l2.d.g(c0291f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0291f c0291f, C0291f c0291f2, int i, int i2) {
        C0287b l2 = l();
        C0291f m2 = m();
        m2.d = 0;
        l2.b(c0291f, c0291f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0291f c0291f, C0291f c0291f2, int i, int i2) {
        C0287b l2 = l();
        C0291f m2 = m();
        m2.d = 0;
        l2.c(c0291f, c0291f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0287b c0287b) {
        int i;
        if (c0287b.f3521e) {
            c0287b.f3518a.d(this, c0287b.f3519b);
        } else {
            C0287b[] c0287bArr = this.f3528f;
            int i2 = this.f3530j;
            c0287bArr[i2] = c0287b;
            C0291f c0291f = c0287b.f3518a;
            c0291f.f3541c = i2;
            this.f3530j = i2 + 1;
            c0291f.e(this, c0287b);
        }
        if (this.f3524a) {
            int i3 = 0;
            while (i3 < this.f3530j) {
                if (this.f3528f[i3] == null) {
                    System.out.println("WTF");
                }
                C0287b c0287b2 = this.f3528f[i3];
                if (c0287b2 != null && c0287b2.f3521e) {
                    c0287b2.f3518a.d(this, c0287b2.f3519b);
                    ((J.b) this.f3532l.f431b).b(c0287b2);
                    this.f3528f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3530j;
                        if (i4 >= i) {
                            break;
                        }
                        C0287b[] c0287bArr2 = this.f3528f;
                        int i6 = i4 - 1;
                        C0287b c0287b3 = c0287bArr2[i4];
                        c0287bArr2[i6] = c0287b3;
                        C0291f c0291f2 = c0287b3.f3518a;
                        if (c0291f2.f3541c == i4) {
                            c0291f2.f3541c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3528f[i5] = null;
                    }
                    this.f3530j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3524a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3530j; i++) {
            C0287b c0287b = this.f3528f[i];
            c0287b.f3518a.f3542e = c0287b.f3519b;
        }
    }

    public final C0291f j(int i) {
        if (this.i + 1 >= this.f3527e) {
            o();
        }
        C0291f a2 = a(4);
        int i2 = this.f3525b + 1;
        this.f3525b = i2;
        this.i++;
        a2.f3540b = i2;
        a2.d = i;
        ((C0291f[]) this.f3532l.d)[i2] = a2;
        C0289d c0289d = this.f3526c;
        c0289d.i.f30b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.d] = 1.0f;
        c0289d.j(a2);
        return a2;
    }

    public final C0291f k(Object obj) {
        C0291f c0291f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3527e) {
            o();
        }
        if (obj instanceof C0297c) {
            C0297c c0297c = (C0297c) obj;
            c0291f = c0297c.i;
            if (c0291f == null) {
                c0297c.k();
                c0291f = c0297c.i;
            }
            int i = c0291f.f3540b;
            C0012l c0012l = this.f3532l;
            if (i == -1 || i > this.f3525b || ((C0291f[]) c0012l.d)[i] == null) {
                if (i != -1) {
                    c0291f.c();
                }
                int i2 = this.f3525b + 1;
                this.f3525b = i2;
                this.i++;
                c0291f.f3540b = i2;
                c0291f.f3547l = 1;
                ((C0291f[]) c0012l.d)[i2] = c0291f;
            }
        }
        return c0291f;
    }

    public final C0287b l() {
        Object obj;
        C0012l c0012l = this.f3532l;
        J.b bVar = (J.b) c0012l.f431b;
        int i = bVar.f353b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f352a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f353b = i2;
        } else {
            obj = null;
        }
        C0287b c0287b = (C0287b) obj;
        if (c0287b == null) {
            return new C0287b(c0012l);
        }
        c0287b.f3518a = null;
        c0287b.d.b();
        c0287b.f3519b = 0.0f;
        c0287b.f3521e = false;
        return c0287b;
    }

    public final C0291f m() {
        if (this.i + 1 >= this.f3527e) {
            o();
        }
        C0291f a2 = a(3);
        int i = this.f3525b + 1;
        this.f3525b = i;
        this.i++;
        a2.f3540b = i;
        ((C0291f[]) this.f3532l.d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3528f = (C0287b[]) Arrays.copyOf(this.f3528f, i);
        C0012l c0012l = this.f3532l;
        c0012l.d = (C0291f[]) Arrays.copyOf((C0291f[]) c0012l.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3527e = i2;
        this.f3531k = i2;
    }

    public final void p() {
        C0289d c0289d = this.f3526c;
        if (c0289d.e()) {
            i();
            return;
        }
        if (!this.f3529g) {
            q(c0289d);
            return;
        }
        for (int i = 0; i < this.f3530j; i++) {
            if (!this.f3528f[i].f3521e) {
                q(c0289d);
                return;
            }
        }
        i();
    }

    public final void q(C0289d c0289d) {
        int i = 0;
        while (true) {
            if (i >= this.f3530j) {
                break;
            }
            C0287b c0287b = this.f3528f[i];
            int i2 = 1;
            if (c0287b.f3518a.f3547l != 1) {
                float f2 = 0.0f;
                if (c0287b.f3519b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3530j) {
                            C0287b c0287b2 = this.f3528f[i6];
                            if (c0287b2.f3518a.f3547l != i2 && !c0287b2.f3521e && c0287b2.f3519b < f2) {
                                int d = c0287b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0291f e2 = c0287b2.d.e(i8);
                                    float c2 = c0287b2.d.c(e2);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e2.f3544g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3540b;
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
                            C0287b c0287b3 = this.f3528f[i4];
                            c0287b3.f3518a.f3541c = -1;
                            c0287b3.g(((C0291f[]) this.f3532l.d)[i5]);
                            C0291f c0291f = c0287b3.f3518a;
                            c0291f.f3541c = i4;
                            c0291f.e(this, c0287b3);
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
        r(c0289d);
        i();
    }

    public final void r(C0287b c0287b) {
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
            C0291f c0291f = c0287b.f3518a;
            if (c0291f != null) {
                this.h[c0291f.f3540b] = true;
            }
            C0291f d = c0287b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3540b;
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
                while (i6 < this.f3530j) {
                    C0287b c0287b2 = this.f3528f[i6];
                    if (c0287b2.f3518a.f3547l != i4 && !c0287b2.f3521e) {
                        C0286a c0286a = c0287b2.d;
                        int i8 = c0286a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0286a.f3511a; i9++) {
                                if (c0286a.f3514e[i8] == d.f3540b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0286a.f3515f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0287b2.d.c(d);
                            if (c2 < 0.0f) {
                                float f3 = (-c0287b2.f3519b) / c2;
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
                    C0287b c0287b3 = this.f3528f[i7];
                    c0287b3.f3518a.f3541c = -1;
                    c0287b3.g(d);
                    C0291f c0291f2 = c0287b3.f3518a;
                    c0291f2.f3541c = i7;
                    c0291f2.e(this, c0287b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3530j; i++) {
            C0287b c0287b = this.f3528f[i];
            if (c0287b != null) {
                ((J.b) this.f3532l.f431b).b(c0287b);
            }
            this.f3528f[i] = null;
        }
    }

    public final void t() {
        C0012l c0012l;
        int i = 0;
        while (true) {
            c0012l = this.f3532l;
            C0291f[] c0291fArr = (C0291f[]) c0012l.d;
            if (i >= c0291fArr.length) {
                break;
            }
            C0291f c0291f = c0291fArr[i];
            if (c0291f != null) {
                c0291f.c();
            }
            i++;
        }
        J.b bVar = (J.b) c0012l.f432c;
        C0291f[] c0291fArr2 = this.f3533m;
        int i2 = this.f3534n;
        bVar.getClass();
        if (i2 > c0291fArr2.length) {
            i2 = c0291fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0291f c0291f2 = c0291fArr2[i3];
            int i4 = bVar.f353b;
            Object[] objArr = bVar.f352a;
            if (i4 < objArr.length) {
                objArr[i4] = c0291f2;
                bVar.f353b = i4 + 1;
            }
        }
        this.f3534n = 0;
        Arrays.fill((C0291f[]) c0012l.d, (Object) null);
        this.f3525b = 0;
        C0289d c0289d = this.f3526c;
        c0289d.h = 0;
        c0289d.f3519b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3530j; i5++) {
            C0287b c0287b = this.f3528f[i5];
        }
        s();
        this.f3530j = 0;
        this.f3535o = new C0287b(c0012l);
    }
}
