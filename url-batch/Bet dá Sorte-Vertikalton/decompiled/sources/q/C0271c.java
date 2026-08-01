package q;

import B.j;
import K.C0011l;
import java.util.ArrayList;
import java.util.Arrays;
import s.C0280c;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3449p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3450q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0272d f3453c;

    /* renamed from: f, reason: collision with root package name */
    public C0270b[] f3455f;

    /* renamed from: l, reason: collision with root package name */
    public final C0011l f3459l;

    /* renamed from: o, reason: collision with root package name */
    public C0270b f3462o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3451a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3452b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3454e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3456g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3457j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3458k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0274f[] f3460m = new C0274f[f3450q];

    /* renamed from: n, reason: collision with root package name */
    public int f3461n = 0;

    public C0271c() {
        this.f3455f = null;
        this.f3455f = new C0270b[32];
        s();
        C0011l c0011l = new C0011l();
        c0011l.f404b = new J.b();
        c0011l.f405c = new J.b();
        c0011l.d = new C0274f[32];
        this.f3459l = c0011l;
        C0272d c0272d = new C0272d(c0011l);
        c0272d.f3463f = new C0274f[128];
        c0272d.f3464g = new C0274f[128];
        c0272d.h = 0;
        c0272d.i = new j(c0272d);
        this.f3453c = c0272d;
        this.f3462o = new C0270b(c0011l);
    }

    public static int n(Object obj) {
        C0274f c0274f = ((C0280c) obj).i;
        if (c0274f != null) {
            return (int) (c0274f.f3469e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0274f a(int i) {
        J.b bVar = (J.b) this.f3459l.f405c;
        int i2 = bVar.f320b;
        C0274f c0274f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f319a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f320b = i3;
            c0274f = r4;
        }
        C0274f c0274f2 = c0274f;
        if (c0274f2 == null) {
            c0274f2 = new C0274f(i);
            c0274f2.f3474l = i;
        } else {
            c0274f2.c();
            c0274f2.f3474l = i;
        }
        int i4 = this.f3461n;
        int i5 = f3450q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3450q = i6;
            this.f3460m = (C0274f[]) Arrays.copyOf(this.f3460m, i6);
        }
        C0274f[] c0274fArr = this.f3460m;
        int i7 = this.f3461n;
        this.f3461n = i7 + 1;
        c0274fArr[i7] = c0274f2;
        return c0274f2;
    }

    public final void b(C0274f c0274f, C0274f c0274f2, int i, float f2, C0274f c0274f3, C0274f c0274f4, int i2, int i3) {
        C0270b l2 = l();
        if (c0274f2 == c0274f3) {
            l2.d.g(c0274f, 1.0f);
            l2.d.g(c0274f4, 1.0f);
            l2.d.g(c0274f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0274f, 1.0f);
            l2.d.g(c0274f2, -1.0f);
            l2.d.g(c0274f3, -1.0f);
            l2.d.g(c0274f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3446b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.d.g(c0274f, -1.0f);
            l2.d.g(c0274f2, 1.0f);
            l2.f3446b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0274f4, -1.0f);
            l2.d.g(c0274f3, 1.0f);
            l2.f3446b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0274f, f3 * 1.0f);
            l2.d.g(c0274f2, f3 * (-1.0f));
            l2.d.g(c0274f3, (-1.0f) * f2);
            l2.d.g(c0274f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3446b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3473k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3473k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3473k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3473k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0270b c0270b) {
        boolean z2;
        boolean z3;
        C0274f c0274f;
        C0274f f2;
        ArrayList arrayList;
        if (this.f3457j + 1 >= this.f3458k || this.i + 1 >= this.f3454e) {
            o();
        }
        if (c0270b.f3448e) {
            z2 = false;
        } else {
            if (this.f3455f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0270b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0270b.f3447c;
                        if (i >= d) {
                            break;
                        }
                        C0274f e2 = c0270b.d.e(i);
                        if (e2.f3468c != -1 || e2.f3470f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0274f c0274f2 = (C0274f) arrayList.get(i2);
                            if (c0274f2.f3470f) {
                                c0270b.h(this, c0274f2, true);
                            } else {
                                c0270b.i(this, this.f3455f[c0274f2.f3468c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0270b.f3445a != null && c0270b.d.d() == 0) {
                    c0270b.f3448e = true;
                    this.f3451a = true;
                }
            }
            if (c0270b.e()) {
                return;
            }
            float f3 = c0270b.f3446b;
            if (f3 < 0.0f) {
                c0270b.f3446b = f3 * (-1.0f);
                C0269a c0269a = c0270b.d;
                int i3 = c0269a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0269a.f3438a; i4++) {
                    float[] fArr = c0269a.f3443g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0269a.f3442f[i3];
                }
            }
            int d2 = c0270b.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0274f c0274f3 = null;
            C0274f c0274f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d2; i5++) {
                float f6 = c0270b.d.f(i5);
                C0274f e3 = c0270b.d.e(i5);
                if (e3.f3474l == 1) {
                    if (c0274f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3473k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0274f3 = e3;
                    f4 = f6;
                } else if (c0274f3 == null && f6 < 0.0f) {
                    if (c0274f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3473k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0274f4 = e3;
                    f5 = f6;
                }
            }
            if (c0274f3 == null) {
                c0274f3 = c0274f4;
            }
            if (c0274f3 == null) {
                z3 = true;
            } else {
                c0270b.g(c0274f3);
                z3 = false;
            }
            if (c0270b.d.d() == 0) {
                c0270b.f3448e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3454e) {
                    o();
                }
                C0274f a2 = a(3);
                int i6 = this.f3452b + 1;
                this.f3452b = i6;
                this.i++;
                a2.f3467b = i6;
                C0011l c0011l = this.f3459l;
                ((C0274f[]) c0011l.d)[i6] = a2;
                c0270b.f3445a = a2;
                int i7 = this.f3457j;
                h(c0270b);
                if (this.f3457j == i7 + 1) {
                    C0270b c0270b2 = this.f3462o;
                    c0270b2.f3445a = null;
                    c0270b2.d.b();
                    for (int i8 = 0; i8 < c0270b.d.d(); i8++) {
                        c0270b2.d.a(c0270b.d.e(i8), c0270b.d.f(i8), true);
                    }
                    r(this.f3462o);
                    if (a2.f3468c == -1) {
                        if (c0270b.f3445a == a2 && (f2 = c0270b.f(null, a2)) != null) {
                            c0270b.g(f2);
                        }
                        if (!c0270b.f3448e) {
                            c0270b.f3445a.e(this, c0270b);
                        }
                        ((J.b) c0011l.f404b).b(c0270b);
                        this.f3457j--;
                    }
                    z2 = true;
                    c0274f = c0270b.f3445a;
                    if (c0274f != null) {
                        return;
                    }
                    if (c0274f.f3474l != 1 && c0270b.f3446b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c0274f = c0270b.f3445a;
            if (c0274f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0270b);
    }

    public final void d(C0274f c0274f, int i) {
        int i2 = c0274f.f3468c;
        if (i2 == -1) {
            c0274f.d(this, i);
            for (int i3 = 0; i3 < this.f3452b + 1; i3++) {
                C0274f c0274f2 = ((C0274f[]) this.f3459l.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0270b l2 = l();
            l2.f3445a = c0274f;
            float f2 = i;
            c0274f.f3469e = f2;
            l2.f3446b = f2;
            l2.f3448e = true;
            c(l2);
            return;
        }
        C0270b c0270b = this.f3455f[i2];
        if (c0270b.f3448e) {
            c0270b.f3446b = i;
            return;
        }
        if (c0270b.d.d() == 0) {
            c0270b.f3448e = true;
            c0270b.f3446b = i;
            return;
        }
        C0270b l3 = l();
        if (i < 0) {
            l3.f3446b = i * (-1);
            l3.d.g(c0274f, 1.0f);
        } else {
            l3.f3446b = i;
            l3.d.g(c0274f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0274f c0274f, C0274f c0274f2, int i, int i2) {
        if (i2 == 8 && c0274f2.f3470f && c0274f.f3468c == -1) {
            c0274f.d(this, c0274f2.f3469e + i);
            return;
        }
        C0270b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3446b = i;
        }
        if (z2) {
            l2.d.g(c0274f, 1.0f);
            l2.d.g(c0274f2, -1.0f);
        } else {
            l2.d.g(c0274f, -1.0f);
            l2.d.g(c0274f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0274f c0274f, C0274f c0274f2, int i, int i2) {
        C0270b l2 = l();
        C0274f m2 = m();
        m2.d = 0;
        l2.b(c0274f, c0274f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0274f c0274f, C0274f c0274f2, int i, int i2) {
        C0270b l2 = l();
        C0274f m2 = m();
        m2.d = 0;
        l2.c(c0274f, c0274f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0270b c0270b) {
        int i;
        if (c0270b.f3448e) {
            c0270b.f3445a.d(this, c0270b.f3446b);
        } else {
            C0270b[] c0270bArr = this.f3455f;
            int i2 = this.f3457j;
            c0270bArr[i2] = c0270b;
            C0274f c0274f = c0270b.f3445a;
            c0274f.f3468c = i2;
            this.f3457j = i2 + 1;
            c0274f.e(this, c0270b);
        }
        if (this.f3451a) {
            int i3 = 0;
            while (i3 < this.f3457j) {
                if (this.f3455f[i3] == null) {
                    System.out.println("WTF");
                }
                C0270b c0270b2 = this.f3455f[i3];
                if (c0270b2 != null && c0270b2.f3448e) {
                    c0270b2.f3445a.d(this, c0270b2.f3446b);
                    ((J.b) this.f3459l.f404b).b(c0270b2);
                    this.f3455f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3457j;
                        if (i4 >= i) {
                            break;
                        }
                        C0270b[] c0270bArr2 = this.f3455f;
                        int i6 = i4 - 1;
                        C0270b c0270b3 = c0270bArr2[i4];
                        c0270bArr2[i6] = c0270b3;
                        C0274f c0274f2 = c0270b3.f3445a;
                        if (c0274f2.f3468c == i4) {
                            c0274f2.f3468c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3455f[i5] = null;
                    }
                    this.f3457j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3451a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3457j; i++) {
            C0270b c0270b = this.f3455f[i];
            c0270b.f3445a.f3469e = c0270b.f3446b;
        }
    }

    public final C0274f j(int i) {
        if (this.i + 1 >= this.f3454e) {
            o();
        }
        C0274f a2 = a(4);
        int i2 = this.f3452b + 1;
        this.f3452b = i2;
        this.i++;
        a2.f3467b = i2;
        a2.d = i;
        ((C0274f[]) this.f3459l.d)[i2] = a2;
        C0272d c0272d = this.f3453c;
        c0272d.i.f53b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.d] = 1.0f;
        c0272d.j(a2);
        return a2;
    }

    public final C0274f k(Object obj) {
        C0274f c0274f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3454e) {
            o();
        }
        if (obj instanceof C0280c) {
            C0280c c0280c = (C0280c) obj;
            c0274f = c0280c.i;
            if (c0274f == null) {
                c0280c.k();
                c0274f = c0280c.i;
            }
            int i = c0274f.f3467b;
            C0011l c0011l = this.f3459l;
            if (i == -1 || i > this.f3452b || ((C0274f[]) c0011l.d)[i] == null) {
                if (i != -1) {
                    c0274f.c();
                }
                int i2 = this.f3452b + 1;
                this.f3452b = i2;
                this.i++;
                c0274f.f3467b = i2;
                c0274f.f3474l = 1;
                ((C0274f[]) c0011l.d)[i2] = c0274f;
            }
        }
        return c0274f;
    }

    public final C0270b l() {
        Object obj;
        C0011l c0011l = this.f3459l;
        J.b bVar = (J.b) c0011l.f404b;
        int i = bVar.f320b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f319a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f320b = i2;
        } else {
            obj = null;
        }
        C0270b c0270b = (C0270b) obj;
        if (c0270b == null) {
            return new C0270b(c0011l);
        }
        c0270b.f3445a = null;
        c0270b.d.b();
        c0270b.f3446b = 0.0f;
        c0270b.f3448e = false;
        return c0270b;
    }

    public final C0274f m() {
        if (this.i + 1 >= this.f3454e) {
            o();
        }
        C0274f a2 = a(3);
        int i = this.f3452b + 1;
        this.f3452b = i;
        this.i++;
        a2.f3467b = i;
        ((C0274f[]) this.f3459l.d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3455f = (C0270b[]) Arrays.copyOf(this.f3455f, i);
        C0011l c0011l = this.f3459l;
        c0011l.d = (C0274f[]) Arrays.copyOf((C0274f[]) c0011l.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3454e = i2;
        this.f3458k = i2;
    }

    public final void p() {
        C0272d c0272d = this.f3453c;
        if (c0272d.e()) {
            i();
            return;
        }
        if (!this.f3456g) {
            q(c0272d);
            return;
        }
        for (int i = 0; i < this.f3457j; i++) {
            if (!this.f3455f[i].f3448e) {
                q(c0272d);
                return;
            }
        }
        i();
    }

    public final void q(C0272d c0272d) {
        int i = 0;
        while (true) {
            if (i >= this.f3457j) {
                break;
            }
            C0270b c0270b = this.f3455f[i];
            int i2 = 1;
            if (c0270b.f3445a.f3474l != 1) {
                float f2 = 0.0f;
                if (c0270b.f3446b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3457j) {
                            C0270b c0270b2 = this.f3455f[i6];
                            if (c0270b2.f3445a.f3474l != i2 && !c0270b2.f3448e && c0270b2.f3446b < f2) {
                                int d = c0270b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0274f e2 = c0270b2.d.e(i8);
                                    float c2 = c0270b2.d.c(e2);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e2.f3471g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3467b;
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
                            C0270b c0270b3 = this.f3455f[i4];
                            c0270b3.f3445a.f3468c = -1;
                            c0270b3.g(((C0274f[]) this.f3459l.d)[i5]);
                            C0274f c0274f = c0270b3.f3445a;
                            c0274f.f3468c = i4;
                            c0274f.e(this, c0270b3);
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
        r(c0272d);
        i();
    }

    public final void r(C0270b c0270b) {
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
            C0274f c0274f = c0270b.f3445a;
            if (c0274f != null) {
                this.h[c0274f.f3467b] = true;
            }
            C0274f d = c0270b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3467b;
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
                while (i6 < this.f3457j) {
                    C0270b c0270b2 = this.f3455f[i6];
                    if (c0270b2.f3445a.f3474l != i4 && !c0270b2.f3448e) {
                        C0269a c0269a = c0270b2.d;
                        int i8 = c0269a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0269a.f3438a; i9++) {
                                if (c0269a.f3441e[i8] == d.f3467b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0269a.f3442f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0270b2.d.c(d);
                            if (c2 < 0.0f) {
                                float f3 = (-c0270b2.f3446b) / c2;
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
                    C0270b c0270b3 = this.f3455f[i7];
                    c0270b3.f3445a.f3468c = -1;
                    c0270b3.g(d);
                    C0274f c0274f2 = c0270b3.f3445a;
                    c0274f2.f3468c = i7;
                    c0274f2.e(this, c0270b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3457j; i++) {
            C0270b c0270b = this.f3455f[i];
            if (c0270b != null) {
                ((J.b) this.f3459l.f404b).b(c0270b);
            }
            this.f3455f[i] = null;
        }
    }

    public final void t() {
        C0011l c0011l;
        int i = 0;
        while (true) {
            c0011l = this.f3459l;
            C0274f[] c0274fArr = (C0274f[]) c0011l.d;
            if (i >= c0274fArr.length) {
                break;
            }
            C0274f c0274f = c0274fArr[i];
            if (c0274f != null) {
                c0274f.c();
            }
            i++;
        }
        J.b bVar = (J.b) c0011l.f405c;
        C0274f[] c0274fArr2 = this.f3460m;
        int i2 = this.f3461n;
        bVar.getClass();
        if (i2 > c0274fArr2.length) {
            i2 = c0274fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0274f c0274f2 = c0274fArr2[i3];
            int i4 = bVar.f320b;
            Object[] objArr = bVar.f319a;
            if (i4 < objArr.length) {
                objArr[i4] = c0274f2;
                bVar.f320b = i4 + 1;
            }
        }
        this.f3461n = 0;
        Arrays.fill((C0274f[]) c0011l.d, (Object) null);
        this.f3452b = 0;
        C0272d c0272d = this.f3453c;
        c0272d.h = 0;
        c0272d.f3446b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3457j; i5++) {
            C0270b c0270b = this.f3455f[i5];
        }
        s();
        this.f3457j = 0;
        this.f3462o = new C0270b(c0011l);
    }
}
