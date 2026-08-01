package s;

import A1.j;
import java.util.ArrayList;
import java.util.Arrays;
import u.C0274c;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3578p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3579q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0266d f3582c;

    /* renamed from: f, reason: collision with root package name */
    public C0264b[] f3584f;

    /* renamed from: l, reason: collision with root package name */
    public final j f3588l;

    /* renamed from: o, reason: collision with root package name */
    public C0264b f3591o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3580a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3581b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3583e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3585g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3586j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3587k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0268f[] f3589m = new C0268f[f3579q];

    /* renamed from: n, reason: collision with root package name */
    public int f3590n = 0;

    public C0265c() {
        this.f3584f = null;
        this.f3584f = new C0264b[32];
        s();
        j jVar = new j();
        jVar.f80b = new L.b();
        jVar.f81c = new L.b();
        jVar.d = new C0268f[32];
        this.f3588l = jVar;
        C0266d c0266d = new C0266d(jVar);
        c0266d.f3592f = new C0268f[128];
        c0266d.f3593g = new C0268f[128];
        c0266d.h = 0;
        c0266d.i = new D.j(17, c0266d);
        this.f3582c = c0266d;
        this.f3591o = new C0264b(jVar);
    }

    public static int n(Object obj) {
        C0268f c0268f = ((C0274c) obj).i;
        if (c0268f != null) {
            return (int) (c0268f.f3598e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0268f a(int i) {
        L.b bVar = (L.b) this.f3588l.f81c;
        int i2 = bVar.f412b;
        C0268f c0268f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f411a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f412b = i3;
            c0268f = r4;
        }
        C0268f c0268f2 = c0268f;
        if (c0268f2 == null) {
            c0268f2 = new C0268f(i);
            c0268f2.f3603l = i;
        } else {
            c0268f2.c();
            c0268f2.f3603l = i;
        }
        int i4 = this.f3590n;
        int i5 = f3579q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3579q = i6;
            this.f3589m = (C0268f[]) Arrays.copyOf(this.f3589m, i6);
        }
        C0268f[] c0268fArr = this.f3589m;
        int i7 = this.f3590n;
        this.f3590n = i7 + 1;
        c0268fArr[i7] = c0268f2;
        return c0268f2;
    }

    public final void b(C0268f c0268f, C0268f c0268f2, int i, float f2, C0268f c0268f3, C0268f c0268f4, int i2, int i3) {
        C0264b l2 = l();
        if (c0268f2 == c0268f3) {
            l2.d.g(c0268f, 1.0f);
            l2.d.g(c0268f4, 1.0f);
            l2.d.g(c0268f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0268f, 1.0f);
            l2.d.g(c0268f2, -1.0f);
            l2.d.g(c0268f3, -1.0f);
            l2.d.g(c0268f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3575b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.d.g(c0268f, -1.0f);
            l2.d.g(c0268f2, 1.0f);
            l2.f3575b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0268f4, -1.0f);
            l2.d.g(c0268f3, 1.0f);
            l2.f3575b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0268f, f3 * 1.0f);
            l2.d.g(c0268f2, f3 * (-1.0f));
            l2.d.g(c0268f3, (-1.0f) * f2);
            l2.d.g(c0268f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3575b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3602k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3602k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3602k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3602k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0264b c0264b) {
        boolean z2;
        boolean z3;
        C0268f c0268f;
        C0268f f2;
        ArrayList arrayList;
        if (this.f3586j + 1 >= this.f3587k || this.i + 1 >= this.f3583e) {
            o();
        }
        if (c0264b.f3577e) {
            z2 = false;
        } else {
            if (this.f3584f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0264b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0264b.f3576c;
                        if (i >= d) {
                            break;
                        }
                        C0268f e2 = c0264b.d.e(i);
                        if (e2.f3597c != -1 || e2.f3599f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0268f c0268f2 = (C0268f) arrayList.get(i2);
                            if (c0268f2.f3599f) {
                                c0264b.h(this, c0268f2, true);
                            } else {
                                c0264b.i(this, this.f3584f[c0268f2.f3597c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0264b.f3574a != null && c0264b.d.d() == 0) {
                    c0264b.f3577e = true;
                    this.f3580a = true;
                }
            }
            if (c0264b.e()) {
                return;
            }
            float f3 = c0264b.f3575b;
            if (f3 < 0.0f) {
                c0264b.f3575b = f3 * (-1.0f);
                C0263a c0263a = c0264b.d;
                int i3 = c0263a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0263a.f3567a; i4++) {
                    float[] fArr = c0263a.f3572g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0263a.f3571f[i3];
                }
            }
            int d2 = c0264b.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0268f c0268f3 = null;
            C0268f c0268f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d2; i5++) {
                float f6 = c0264b.d.f(i5);
                C0268f e3 = c0264b.d.e(i5);
                if (e3.f3603l == 1) {
                    if (c0268f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3602k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0268f3 = e3;
                    f4 = f6;
                } else if (c0268f3 == null && f6 < 0.0f) {
                    if (c0268f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3602k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0268f4 = e3;
                    f5 = f6;
                }
            }
            if (c0268f3 == null) {
                c0268f3 = c0268f4;
            }
            if (c0268f3 == null) {
                z3 = true;
            } else {
                c0264b.g(c0268f3);
                z3 = false;
            }
            if (c0264b.d.d() == 0) {
                c0264b.f3577e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3583e) {
                    o();
                }
                C0268f a2 = a(3);
                int i6 = this.f3581b + 1;
                this.f3581b = i6;
                this.i++;
                a2.f3596b = i6;
                j jVar = this.f3588l;
                ((C0268f[]) jVar.d)[i6] = a2;
                c0264b.f3574a = a2;
                int i7 = this.f3586j;
                h(c0264b);
                if (this.f3586j == i7 + 1) {
                    C0264b c0264b2 = this.f3591o;
                    c0264b2.f3574a = null;
                    c0264b2.d.b();
                    for (int i8 = 0; i8 < c0264b.d.d(); i8++) {
                        c0264b2.d.a(c0264b.d.e(i8), c0264b.d.f(i8), true);
                    }
                    r(this.f3591o);
                    if (a2.f3597c == -1) {
                        if (c0264b.f3574a == a2 && (f2 = c0264b.f(null, a2)) != null) {
                            c0264b.g(f2);
                        }
                        if (!c0264b.f3577e) {
                            c0264b.f3574a.e(this, c0264b);
                        }
                        ((L.b) jVar.f80b).b(c0264b);
                        this.f3586j--;
                    }
                    z2 = true;
                    c0268f = c0264b.f3574a;
                    if (c0268f != null) {
                        return;
                    }
                    if (c0268f.f3603l != 1 && c0264b.f3575b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c0268f = c0264b.f3574a;
            if (c0268f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0264b);
    }

    public final void d(C0268f c0268f, int i) {
        int i2 = c0268f.f3597c;
        if (i2 == -1) {
            c0268f.d(this, i);
            for (int i3 = 0; i3 < this.f3581b + 1; i3++) {
                C0268f c0268f2 = ((C0268f[]) this.f3588l.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0264b l2 = l();
            l2.f3574a = c0268f;
            float f2 = i;
            c0268f.f3598e = f2;
            l2.f3575b = f2;
            l2.f3577e = true;
            c(l2);
            return;
        }
        C0264b c0264b = this.f3584f[i2];
        if (c0264b.f3577e) {
            c0264b.f3575b = i;
            return;
        }
        if (c0264b.d.d() == 0) {
            c0264b.f3577e = true;
            c0264b.f3575b = i;
            return;
        }
        C0264b l3 = l();
        if (i < 0) {
            l3.f3575b = i * (-1);
            l3.d.g(c0268f, 1.0f);
        } else {
            l3.f3575b = i;
            l3.d.g(c0268f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0268f c0268f, C0268f c0268f2, int i, int i2) {
        if (i2 == 8 && c0268f2.f3599f && c0268f.f3597c == -1) {
            c0268f.d(this, c0268f2.f3598e + i);
            return;
        }
        C0264b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3575b = i;
        }
        if (z2) {
            l2.d.g(c0268f, 1.0f);
            l2.d.g(c0268f2, -1.0f);
        } else {
            l2.d.g(c0268f, -1.0f);
            l2.d.g(c0268f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0268f c0268f, C0268f c0268f2, int i, int i2) {
        C0264b l2 = l();
        C0268f m2 = m();
        m2.d = 0;
        l2.b(c0268f, c0268f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0268f c0268f, C0268f c0268f2, int i, int i2) {
        C0264b l2 = l();
        C0268f m2 = m();
        m2.d = 0;
        l2.c(c0268f, c0268f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0264b c0264b) {
        int i;
        if (c0264b.f3577e) {
            c0264b.f3574a.d(this, c0264b.f3575b);
        } else {
            C0264b[] c0264bArr = this.f3584f;
            int i2 = this.f3586j;
            c0264bArr[i2] = c0264b;
            C0268f c0268f = c0264b.f3574a;
            c0268f.f3597c = i2;
            this.f3586j = i2 + 1;
            c0268f.e(this, c0264b);
        }
        if (this.f3580a) {
            int i3 = 0;
            while (i3 < this.f3586j) {
                if (this.f3584f[i3] == null) {
                    System.out.println("WTF");
                }
                C0264b c0264b2 = this.f3584f[i3];
                if (c0264b2 != null && c0264b2.f3577e) {
                    c0264b2.f3574a.d(this, c0264b2.f3575b);
                    ((L.b) this.f3588l.f80b).b(c0264b2);
                    this.f3584f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3586j;
                        if (i4 >= i) {
                            break;
                        }
                        C0264b[] c0264bArr2 = this.f3584f;
                        int i6 = i4 - 1;
                        C0264b c0264b3 = c0264bArr2[i4];
                        c0264bArr2[i6] = c0264b3;
                        C0268f c0268f2 = c0264b3.f3574a;
                        if (c0268f2.f3597c == i4) {
                            c0268f2.f3597c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3584f[i5] = null;
                    }
                    this.f3586j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3580a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3586j; i++) {
            C0264b c0264b = this.f3584f[i];
            c0264b.f3574a.f3598e = c0264b.f3575b;
        }
    }

    public final C0268f j(int i) {
        if (this.i + 1 >= this.f3583e) {
            o();
        }
        C0268f a2 = a(4);
        int i2 = this.f3581b + 1;
        this.f3581b = i2;
        this.i++;
        a2.f3596b = i2;
        a2.d = i;
        ((C0268f[]) this.f3588l.d)[i2] = a2;
        C0266d c0266d = this.f3582c;
        c0266d.i.f133b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.d] = 1.0f;
        c0266d.j(a2);
        return a2;
    }

    public final C0268f k(Object obj) {
        C0268f c0268f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3583e) {
            o();
        }
        if (obj instanceof C0274c) {
            C0274c c0274c = (C0274c) obj;
            c0268f = c0274c.i;
            if (c0268f == null) {
                c0274c.k();
                c0268f = c0274c.i;
            }
            int i = c0268f.f3596b;
            j jVar = this.f3588l;
            if (i == -1 || i > this.f3581b || ((C0268f[]) jVar.d)[i] == null) {
                if (i != -1) {
                    c0268f.c();
                }
                int i2 = this.f3581b + 1;
                this.f3581b = i2;
                this.i++;
                c0268f.f3596b = i2;
                c0268f.f3603l = 1;
                ((C0268f[]) jVar.d)[i2] = c0268f;
            }
        }
        return c0268f;
    }

    public final C0264b l() {
        Object obj;
        j jVar = this.f3588l;
        L.b bVar = (L.b) jVar.f80b;
        int i = bVar.f412b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f411a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f412b = i2;
        } else {
            obj = null;
        }
        C0264b c0264b = (C0264b) obj;
        if (c0264b == null) {
            return new C0264b(jVar);
        }
        c0264b.f3574a = null;
        c0264b.d.b();
        c0264b.f3575b = 0.0f;
        c0264b.f3577e = false;
        return c0264b;
    }

    public final C0268f m() {
        if (this.i + 1 >= this.f3583e) {
            o();
        }
        C0268f a2 = a(3);
        int i = this.f3581b + 1;
        this.f3581b = i;
        this.i++;
        a2.f3596b = i;
        ((C0268f[]) this.f3588l.d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3584f = (C0264b[]) Arrays.copyOf(this.f3584f, i);
        j jVar = this.f3588l;
        jVar.d = (C0268f[]) Arrays.copyOf((C0268f[]) jVar.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3583e = i2;
        this.f3587k = i2;
    }

    public final void p() {
        C0266d c0266d = this.f3582c;
        if (c0266d.e()) {
            i();
            return;
        }
        if (!this.f3585g) {
            q(c0266d);
            return;
        }
        for (int i = 0; i < this.f3586j; i++) {
            if (!this.f3584f[i].f3577e) {
                q(c0266d);
                return;
            }
        }
        i();
    }

    public final void q(C0266d c0266d) {
        int i = 0;
        while (true) {
            if (i >= this.f3586j) {
                break;
            }
            C0264b c0264b = this.f3584f[i];
            int i2 = 1;
            if (c0264b.f3574a.f3603l != 1) {
                float f2 = 0.0f;
                if (c0264b.f3575b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3586j) {
                            C0264b c0264b2 = this.f3584f[i6];
                            if (c0264b2.f3574a.f3603l != i2 && !c0264b2.f3577e && c0264b2.f3575b < f2) {
                                int d = c0264b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0268f e2 = c0264b2.d.e(i8);
                                    float c2 = c0264b2.d.c(e2);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e2.f3600g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3596b;
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
                            C0264b c0264b3 = this.f3584f[i4];
                            c0264b3.f3574a.f3597c = -1;
                            c0264b3.g(((C0268f[]) this.f3588l.d)[i5]);
                            C0268f c0268f = c0264b3.f3574a;
                            c0268f.f3597c = i4;
                            c0268f.e(this, c0264b3);
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
        r(c0266d);
        i();
    }

    public final void r(C0264b c0264b) {
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
            C0268f c0268f = c0264b.f3574a;
            if (c0268f != null) {
                this.h[c0268f.f3596b] = true;
            }
            C0268f d = c0264b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3596b;
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
                while (i6 < this.f3586j) {
                    C0264b c0264b2 = this.f3584f[i6];
                    if (c0264b2.f3574a.f3603l != i4 && !c0264b2.f3577e) {
                        C0263a c0263a = c0264b2.d;
                        int i8 = c0263a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0263a.f3567a; i9++) {
                                if (c0263a.f3570e[i8] == d.f3596b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0263a.f3571f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0264b2.d.c(d);
                            if (c2 < 0.0f) {
                                float f3 = (-c0264b2.f3575b) / c2;
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
                    C0264b c0264b3 = this.f3584f[i7];
                    c0264b3.f3574a.f3597c = -1;
                    c0264b3.g(d);
                    C0268f c0268f2 = c0264b3.f3574a;
                    c0268f2.f3597c = i7;
                    c0268f2.e(this, c0264b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3586j; i++) {
            C0264b c0264b = this.f3584f[i];
            if (c0264b != null) {
                ((L.b) this.f3588l.f80b).b(c0264b);
            }
            this.f3584f[i] = null;
        }
    }

    public final void t() {
        j jVar;
        int i = 0;
        while (true) {
            jVar = this.f3588l;
            C0268f[] c0268fArr = (C0268f[]) jVar.d;
            if (i >= c0268fArr.length) {
                break;
            }
            C0268f c0268f = c0268fArr[i];
            if (c0268f != null) {
                c0268f.c();
            }
            i++;
        }
        L.b bVar = (L.b) jVar.f81c;
        C0268f[] c0268fArr2 = this.f3589m;
        int i2 = this.f3590n;
        bVar.getClass();
        if (i2 > c0268fArr2.length) {
            i2 = c0268fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0268f c0268f2 = c0268fArr2[i3];
            int i4 = bVar.f412b;
            Object[] objArr = bVar.f411a;
            if (i4 < objArr.length) {
                objArr[i4] = c0268f2;
                bVar.f412b = i4 + 1;
            }
        }
        this.f3590n = 0;
        Arrays.fill((C0268f[]) jVar.d, (Object) null);
        this.f3581b = 0;
        C0266d c0266d = this.f3582c;
        c0266d.h = 0;
        c0266d.f3575b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3586j; i5++) {
            C0264b c0264b = this.f3584f[i5];
        }
        s();
        this.f3586j = 0;
        this.f3591o = new C0264b(jVar);
    }
}
