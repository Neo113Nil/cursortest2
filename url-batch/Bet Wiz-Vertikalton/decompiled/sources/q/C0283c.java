package q;

import B.j;
import K.C0011l;
import java.util.ArrayList;
import java.util.Arrays;
import s.C0292c;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3462p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3463q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0284d f3466c;

    /* renamed from: f, reason: collision with root package name */
    public C0282b[] f3468f;

    /* renamed from: l, reason: collision with root package name */
    public final C0011l f3472l;

    /* renamed from: o, reason: collision with root package name */
    public C0282b f3475o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3464a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3465b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3467e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3469g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3470j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3471k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0286f[] f3473m = new C0286f[f3463q];

    /* renamed from: n, reason: collision with root package name */
    public int f3474n = 0;

    public C0283c() {
        this.f3468f = null;
        this.f3468f = new C0282b[32];
        s();
        C0011l c0011l = new C0011l();
        c0011l.f475b = new J.b();
        c0011l.f476c = new J.b();
        c0011l.d = new C0286f[32];
        this.f3472l = c0011l;
        C0284d c0284d = new C0284d(c0011l);
        c0284d.f3476f = new C0286f[128];
        c0284d.f3477g = new C0286f[128];
        c0284d.h = 0;
        c0284d.i = new j(c0284d);
        this.f3466c = c0284d;
        this.f3475o = new C0282b(c0011l);
    }

    public static int n(Object obj) {
        C0286f c0286f = ((C0292c) obj).i;
        if (c0286f != null) {
            return (int) (c0286f.f3482e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0286f a(int i) {
        J.b bVar = (J.b) this.f3472l.f476c;
        int i2 = bVar.f397b;
        C0286f c0286f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f396a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f397b = i3;
            c0286f = r4;
        }
        C0286f c0286f2 = c0286f;
        if (c0286f2 == null) {
            c0286f2 = new C0286f(i);
            c0286f2.f3487l = i;
        } else {
            c0286f2.c();
            c0286f2.f3487l = i;
        }
        int i4 = this.f3474n;
        int i5 = f3463q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3463q = i6;
            this.f3473m = (C0286f[]) Arrays.copyOf(this.f3473m, i6);
        }
        C0286f[] c0286fArr = this.f3473m;
        int i7 = this.f3474n;
        this.f3474n = i7 + 1;
        c0286fArr[i7] = c0286f2;
        return c0286f2;
    }

    public final void b(C0286f c0286f, C0286f c0286f2, int i, float f2, C0286f c0286f3, C0286f c0286f4, int i2, int i3) {
        C0282b l2 = l();
        if (c0286f2 == c0286f3) {
            l2.d.g(c0286f, 1.0f);
            l2.d.g(c0286f4, 1.0f);
            l2.d.g(c0286f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0286f, 1.0f);
            l2.d.g(c0286f2, -1.0f);
            l2.d.g(c0286f3, -1.0f);
            l2.d.g(c0286f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3459b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.d.g(c0286f, -1.0f);
            l2.d.g(c0286f2, 1.0f);
            l2.f3459b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0286f4, -1.0f);
            l2.d.g(c0286f3, 1.0f);
            l2.f3459b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0286f, f3 * 1.0f);
            l2.d.g(c0286f2, f3 * (-1.0f));
            l2.d.g(c0286f3, (-1.0f) * f2);
            l2.d.g(c0286f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3459b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3486k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3486k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3486k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3486k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0282b c0282b) {
        boolean z2;
        boolean z3;
        C0286f c0286f;
        C0286f f2;
        ArrayList arrayList;
        if (this.f3470j + 1 >= this.f3471k || this.i + 1 >= this.f3467e) {
            o();
        }
        if (c0282b.f3461e) {
            z2 = false;
        } else {
            if (this.f3468f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0282b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0282b.f3460c;
                        if (i >= d) {
                            break;
                        }
                        C0286f e2 = c0282b.d.e(i);
                        if (e2.f3481c != -1 || e2.f3483f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0286f c0286f2 = (C0286f) arrayList.get(i2);
                            if (c0286f2.f3483f) {
                                c0282b.h(this, c0286f2, true);
                            } else {
                                c0282b.i(this, this.f3468f[c0286f2.f3481c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0282b.f3458a != null && c0282b.d.d() == 0) {
                    c0282b.f3461e = true;
                    this.f3464a = true;
                }
            }
            if (c0282b.e()) {
                return;
            }
            float f3 = c0282b.f3459b;
            if (f3 < 0.0f) {
                c0282b.f3459b = f3 * (-1.0f);
                C0281a c0281a = c0282b.d;
                int i3 = c0281a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0281a.f3451a; i4++) {
                    float[] fArr = c0281a.f3456g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0281a.f3455f[i3];
                }
            }
            int d2 = c0282b.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0286f c0286f3 = null;
            C0286f c0286f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d2; i5++) {
                float f6 = c0282b.d.f(i5);
                C0286f e3 = c0282b.d.e(i5);
                if (e3.f3487l == 1) {
                    if (c0286f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3486k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0286f3 = e3;
                    f4 = f6;
                } else if (c0286f3 == null && f6 < 0.0f) {
                    if (c0286f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3486k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0286f4 = e3;
                    f5 = f6;
                }
            }
            if (c0286f3 == null) {
                c0286f3 = c0286f4;
            }
            if (c0286f3 == null) {
                z3 = true;
            } else {
                c0282b.g(c0286f3);
                z3 = false;
            }
            if (c0282b.d.d() == 0) {
                c0282b.f3461e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3467e) {
                    o();
                }
                C0286f a2 = a(3);
                int i6 = this.f3465b + 1;
                this.f3465b = i6;
                this.i++;
                a2.f3480b = i6;
                C0011l c0011l = this.f3472l;
                ((C0286f[]) c0011l.d)[i6] = a2;
                c0282b.f3458a = a2;
                int i7 = this.f3470j;
                h(c0282b);
                if (this.f3470j == i7 + 1) {
                    C0282b c0282b2 = this.f3475o;
                    c0282b2.f3458a = null;
                    c0282b2.d.b();
                    for (int i8 = 0; i8 < c0282b.d.d(); i8++) {
                        c0282b2.d.a(c0282b.d.e(i8), c0282b.d.f(i8), true);
                    }
                    r(this.f3475o);
                    if (a2.f3481c == -1) {
                        if (c0282b.f3458a == a2 && (f2 = c0282b.f(null, a2)) != null) {
                            c0282b.g(f2);
                        }
                        if (!c0282b.f3461e) {
                            c0282b.f3458a.e(this, c0282b);
                        }
                        ((J.b) c0011l.f475b).b(c0282b);
                        this.f3470j--;
                    }
                    z2 = true;
                    c0286f = c0282b.f3458a;
                    if (c0286f != null) {
                        return;
                    }
                    if (c0286f.f3487l != 1 && c0282b.f3459b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c0286f = c0282b.f3458a;
            if (c0286f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0282b);
    }

    public final void d(C0286f c0286f, int i) {
        int i2 = c0286f.f3481c;
        if (i2 == -1) {
            c0286f.d(this, i);
            for (int i3 = 0; i3 < this.f3465b + 1; i3++) {
                C0286f c0286f2 = ((C0286f[]) this.f3472l.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0282b l2 = l();
            l2.f3458a = c0286f;
            float f2 = i;
            c0286f.f3482e = f2;
            l2.f3459b = f2;
            l2.f3461e = true;
            c(l2);
            return;
        }
        C0282b c0282b = this.f3468f[i2];
        if (c0282b.f3461e) {
            c0282b.f3459b = i;
            return;
        }
        if (c0282b.d.d() == 0) {
            c0282b.f3461e = true;
            c0282b.f3459b = i;
            return;
        }
        C0282b l3 = l();
        if (i < 0) {
            l3.f3459b = i * (-1);
            l3.d.g(c0286f, 1.0f);
        } else {
            l3.f3459b = i;
            l3.d.g(c0286f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0286f c0286f, C0286f c0286f2, int i, int i2) {
        if (i2 == 8 && c0286f2.f3483f && c0286f.f3481c == -1) {
            c0286f.d(this, c0286f2.f3482e + i);
            return;
        }
        C0282b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3459b = i;
        }
        if (z2) {
            l2.d.g(c0286f, 1.0f);
            l2.d.g(c0286f2, -1.0f);
        } else {
            l2.d.g(c0286f, -1.0f);
            l2.d.g(c0286f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0286f c0286f, C0286f c0286f2, int i, int i2) {
        C0282b l2 = l();
        C0286f m2 = m();
        m2.d = 0;
        l2.b(c0286f, c0286f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0286f c0286f, C0286f c0286f2, int i, int i2) {
        C0282b l2 = l();
        C0286f m2 = m();
        m2.d = 0;
        l2.c(c0286f, c0286f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0282b c0282b) {
        int i;
        if (c0282b.f3461e) {
            c0282b.f3458a.d(this, c0282b.f3459b);
        } else {
            C0282b[] c0282bArr = this.f3468f;
            int i2 = this.f3470j;
            c0282bArr[i2] = c0282b;
            C0286f c0286f = c0282b.f3458a;
            c0286f.f3481c = i2;
            this.f3470j = i2 + 1;
            c0286f.e(this, c0282b);
        }
        if (this.f3464a) {
            int i3 = 0;
            while (i3 < this.f3470j) {
                if (this.f3468f[i3] == null) {
                    System.out.println("WTF");
                }
                C0282b c0282b2 = this.f3468f[i3];
                if (c0282b2 != null && c0282b2.f3461e) {
                    c0282b2.f3458a.d(this, c0282b2.f3459b);
                    ((J.b) this.f3472l.f475b).b(c0282b2);
                    this.f3468f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3470j;
                        if (i4 >= i) {
                            break;
                        }
                        C0282b[] c0282bArr2 = this.f3468f;
                        int i6 = i4 - 1;
                        C0282b c0282b3 = c0282bArr2[i4];
                        c0282bArr2[i6] = c0282b3;
                        C0286f c0286f2 = c0282b3.f3458a;
                        if (c0286f2.f3481c == i4) {
                            c0286f2.f3481c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3468f[i5] = null;
                    }
                    this.f3470j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3464a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3470j; i++) {
            C0282b c0282b = this.f3468f[i];
            c0282b.f3458a.f3482e = c0282b.f3459b;
        }
    }

    public final C0286f j(int i) {
        if (this.i + 1 >= this.f3467e) {
            o();
        }
        C0286f a2 = a(4);
        int i2 = this.f3465b + 1;
        this.f3465b = i2;
        this.i++;
        a2.f3480b = i2;
        a2.d = i;
        ((C0286f[]) this.f3472l.d)[i2] = a2;
        C0284d c0284d = this.f3466c;
        c0284d.i.f25b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.d] = 1.0f;
        c0284d.j(a2);
        return a2;
    }

    public final C0286f k(Object obj) {
        C0286f c0286f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3467e) {
            o();
        }
        if (obj instanceof C0292c) {
            C0292c c0292c = (C0292c) obj;
            c0286f = c0292c.i;
            if (c0286f == null) {
                c0292c.k();
                c0286f = c0292c.i;
            }
            int i = c0286f.f3480b;
            C0011l c0011l = this.f3472l;
            if (i == -1 || i > this.f3465b || ((C0286f[]) c0011l.d)[i] == null) {
                if (i != -1) {
                    c0286f.c();
                }
                int i2 = this.f3465b + 1;
                this.f3465b = i2;
                this.i++;
                c0286f.f3480b = i2;
                c0286f.f3487l = 1;
                ((C0286f[]) c0011l.d)[i2] = c0286f;
            }
        }
        return c0286f;
    }

    public final C0282b l() {
        Object obj;
        C0011l c0011l = this.f3472l;
        J.b bVar = (J.b) c0011l.f475b;
        int i = bVar.f397b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f396a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f397b = i2;
        } else {
            obj = null;
        }
        C0282b c0282b = (C0282b) obj;
        if (c0282b == null) {
            return new C0282b(c0011l);
        }
        c0282b.f3458a = null;
        c0282b.d.b();
        c0282b.f3459b = 0.0f;
        c0282b.f3461e = false;
        return c0282b;
    }

    public final C0286f m() {
        if (this.i + 1 >= this.f3467e) {
            o();
        }
        C0286f a2 = a(3);
        int i = this.f3465b + 1;
        this.f3465b = i;
        this.i++;
        a2.f3480b = i;
        ((C0286f[]) this.f3472l.d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3468f = (C0282b[]) Arrays.copyOf(this.f3468f, i);
        C0011l c0011l = this.f3472l;
        c0011l.d = (C0286f[]) Arrays.copyOf((C0286f[]) c0011l.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3467e = i2;
        this.f3471k = i2;
    }

    public final void p() {
        C0284d c0284d = this.f3466c;
        if (c0284d.e()) {
            i();
            return;
        }
        if (!this.f3469g) {
            q(c0284d);
            return;
        }
        for (int i = 0; i < this.f3470j; i++) {
            if (!this.f3468f[i].f3461e) {
                q(c0284d);
                return;
            }
        }
        i();
    }

    public final void q(C0284d c0284d) {
        int i = 0;
        while (true) {
            if (i >= this.f3470j) {
                break;
            }
            C0282b c0282b = this.f3468f[i];
            int i2 = 1;
            if (c0282b.f3458a.f3487l != 1) {
                float f2 = 0.0f;
                if (c0282b.f3459b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3470j) {
                            C0282b c0282b2 = this.f3468f[i6];
                            if (c0282b2.f3458a.f3487l != i2 && !c0282b2.f3461e && c0282b2.f3459b < f2) {
                                int d = c0282b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0286f e2 = c0282b2.d.e(i8);
                                    float c2 = c0282b2.d.c(e2);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e2.f3484g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3480b;
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
                            C0282b c0282b3 = this.f3468f[i4];
                            c0282b3.f3458a.f3481c = -1;
                            c0282b3.g(((C0286f[]) this.f3472l.d)[i5]);
                            C0286f c0286f = c0282b3.f3458a;
                            c0286f.f3481c = i4;
                            c0286f.e(this, c0282b3);
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
        r(c0284d);
        i();
    }

    public final void r(C0282b c0282b) {
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
            C0286f c0286f = c0282b.f3458a;
            if (c0286f != null) {
                this.h[c0286f.f3480b] = true;
            }
            C0286f d = c0282b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3480b;
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
                while (i6 < this.f3470j) {
                    C0282b c0282b2 = this.f3468f[i6];
                    if (c0282b2.f3458a.f3487l != i4 && !c0282b2.f3461e) {
                        C0281a c0281a = c0282b2.d;
                        int i8 = c0281a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0281a.f3451a; i9++) {
                                if (c0281a.f3454e[i8] == d.f3480b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0281a.f3455f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0282b2.d.c(d);
                            if (c2 < 0.0f) {
                                float f3 = (-c0282b2.f3459b) / c2;
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
                    C0282b c0282b3 = this.f3468f[i7];
                    c0282b3.f3458a.f3481c = -1;
                    c0282b3.g(d);
                    C0286f c0286f2 = c0282b3.f3458a;
                    c0286f2.f3481c = i7;
                    c0286f2.e(this, c0282b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3470j; i++) {
            C0282b c0282b = this.f3468f[i];
            if (c0282b != null) {
                ((J.b) this.f3472l.f475b).b(c0282b);
            }
            this.f3468f[i] = null;
        }
    }

    public final void t() {
        C0011l c0011l;
        int i = 0;
        while (true) {
            c0011l = this.f3472l;
            C0286f[] c0286fArr = (C0286f[]) c0011l.d;
            if (i >= c0286fArr.length) {
                break;
            }
            C0286f c0286f = c0286fArr[i];
            if (c0286f != null) {
                c0286f.c();
            }
            i++;
        }
        J.b bVar = (J.b) c0011l.f476c;
        C0286f[] c0286fArr2 = this.f3473m;
        int i2 = this.f3474n;
        bVar.getClass();
        if (i2 > c0286fArr2.length) {
            i2 = c0286fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0286f c0286f2 = c0286fArr2[i3];
            int i4 = bVar.f397b;
            Object[] objArr = bVar.f396a;
            if (i4 < objArr.length) {
                objArr[i4] = c0286f2;
                bVar.f397b = i4 + 1;
            }
        }
        this.f3474n = 0;
        Arrays.fill((C0286f[]) c0011l.d, (Object) null);
        this.f3465b = 0;
        C0284d c0284d = this.f3466c;
        c0284d.h = 0;
        c0284d.f3459b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3470j; i5++) {
            C0282b c0282b = this.f3468f[i5];
        }
        s();
        this.f3470j = 0;
        this.f3475o = new C0282b(c0011l);
    }
}
