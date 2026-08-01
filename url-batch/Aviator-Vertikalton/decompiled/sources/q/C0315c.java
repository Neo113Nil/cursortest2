package q;

import B.j;
import T.r;
import java.util.ArrayList;
import java.util.Arrays;
import s.C0324c;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3902p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3903q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0316d f3906c;

    /* renamed from: f, reason: collision with root package name */
    public C0314b[] f3909f;

    /* renamed from: l, reason: collision with root package name */
    public final r f3913l;

    /* renamed from: o, reason: collision with root package name */
    public C0314b f3916o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3904a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3905b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3907d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3908e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3910g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3911j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3912k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0318f[] f3914m = new C0318f[f3903q];

    /* renamed from: n, reason: collision with root package name */
    public int f3915n = 0;

    public C0315c() {
        this.f3909f = null;
        this.f3909f = new C0314b[32];
        s();
        r rVar = new r();
        rVar.f810b = new J.b();
        rVar.f811c = new J.b();
        rVar.f812d = new C0318f[32];
        this.f3913l = rVar;
        C0316d c0316d = new C0316d(rVar);
        c0316d.f3917f = new C0318f[128];
        c0316d.f3918g = new C0318f[128];
        c0316d.h = 0;
        c0316d.i = new j(c0316d);
        this.f3906c = c0316d;
        this.f3916o = new C0314b(rVar);
    }

    public static int n(Object obj) {
        C0318f c0318f = ((C0324c) obj).i;
        if (c0318f != null) {
            return (int) (c0318f.f3924e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0318f a(int i) {
        J.b bVar = (J.b) this.f3913l.f811c;
        int i2 = bVar.f381b;
        C0318f c0318f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f380a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f381b = i3;
            c0318f = r4;
        }
        C0318f c0318f2 = c0318f;
        if (c0318f2 == null) {
            c0318f2 = new C0318f(i);
            c0318f2.f3929l = i;
        } else {
            c0318f2.c();
            c0318f2.f3929l = i;
        }
        int i4 = this.f3915n;
        int i5 = f3903q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3903q = i6;
            this.f3914m = (C0318f[]) Arrays.copyOf(this.f3914m, i6);
        }
        C0318f[] c0318fArr = this.f3914m;
        int i7 = this.f3915n;
        this.f3915n = i7 + 1;
        c0318fArr[i7] = c0318f2;
        return c0318f2;
    }

    public final void b(C0318f c0318f, C0318f c0318f2, int i, float f2, C0318f c0318f3, C0318f c0318f4, int i2, int i3) {
        C0314b l2 = l();
        if (c0318f2 == c0318f3) {
            l2.f3900d.g(c0318f, 1.0f);
            l2.f3900d.g(c0318f4, 1.0f);
            l2.f3900d.g(c0318f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.f3900d.g(c0318f, 1.0f);
            l2.f3900d.g(c0318f2, -1.0f);
            l2.f3900d.g(c0318f3, -1.0f);
            l2.f3900d.g(c0318f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3898b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.f3900d.g(c0318f, -1.0f);
            l2.f3900d.g(c0318f2, 1.0f);
            l2.f3898b = i;
        } else if (f2 >= 1.0f) {
            l2.f3900d.g(c0318f4, -1.0f);
            l2.f3900d.g(c0318f3, 1.0f);
            l2.f3898b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.f3900d.g(c0318f, f3 * 1.0f);
            l2.f3900d.g(c0318f2, f3 * (-1.0f));
            l2.f3900d.g(c0318f3, (-1.0f) * f2);
            l2.f3900d.g(c0318f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3898b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3928k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3928k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3928k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3928k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0314b c0314b) {
        boolean z2;
        boolean z3;
        C0318f c0318f;
        C0318f f2;
        ArrayList arrayList;
        if (this.f3911j + 1 >= this.f3912k || this.i + 1 >= this.f3908e) {
            o();
        }
        if (c0314b.f3901e) {
            z2 = false;
        } else {
            if (this.f3909f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d2 = c0314b.f3900d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0314b.f3899c;
                        if (i >= d2) {
                            break;
                        }
                        C0318f e2 = c0314b.f3900d.e(i);
                        if (e2.f3922c != -1 || e2.f3925f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0318f c0318f2 = (C0318f) arrayList.get(i2);
                            if (c0318f2.f3925f) {
                                c0314b.h(this, c0318f2, true);
                            } else {
                                c0314b.i(this, this.f3909f[c0318f2.f3922c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0314b.f3897a != null && c0314b.f3900d.d() == 0) {
                    c0314b.f3901e = true;
                    this.f3904a = true;
                }
            }
            if (c0314b.e()) {
                return;
            }
            float f3 = c0314b.f3898b;
            if (f3 < 0.0f) {
                c0314b.f3898b = f3 * (-1.0f);
                C0313a c0313a = c0314b.f3900d;
                int i3 = c0313a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0313a.f3889a; i4++) {
                    float[] fArr = c0313a.f3895g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0313a.f3894f[i3];
                }
            }
            int d3 = c0314b.f3900d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0318f c0318f3 = null;
            C0318f c0318f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d3; i5++) {
                float f6 = c0314b.f3900d.f(i5);
                C0318f e3 = c0314b.f3900d.e(i5);
                if (e3.f3929l == 1) {
                    if (c0318f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3928k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0318f3 = e3;
                    f4 = f6;
                } else if (c0318f3 == null && f6 < 0.0f) {
                    if (c0318f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3928k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0318f4 = e3;
                    f5 = f6;
                }
            }
            if (c0318f3 == null) {
                c0318f3 = c0318f4;
            }
            if (c0318f3 == null) {
                z3 = true;
            } else {
                c0314b.g(c0318f3);
                z3 = false;
            }
            if (c0314b.f3900d.d() == 0) {
                c0314b.f3901e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3908e) {
                    o();
                }
                C0318f a2 = a(3);
                int i6 = this.f3905b + 1;
                this.f3905b = i6;
                this.i++;
                a2.f3921b = i6;
                r rVar = this.f3913l;
                ((C0318f[]) rVar.f812d)[i6] = a2;
                c0314b.f3897a = a2;
                int i7 = this.f3911j;
                h(c0314b);
                if (this.f3911j == i7 + 1) {
                    C0314b c0314b2 = this.f3916o;
                    c0314b2.f3897a = null;
                    c0314b2.f3900d.b();
                    for (int i8 = 0; i8 < c0314b.f3900d.d(); i8++) {
                        c0314b2.f3900d.a(c0314b.f3900d.e(i8), c0314b.f3900d.f(i8), true);
                    }
                    r(this.f3916o);
                    if (a2.f3922c == -1) {
                        if (c0314b.f3897a == a2 && (f2 = c0314b.f(null, a2)) != null) {
                            c0314b.g(f2);
                        }
                        if (!c0314b.f3901e) {
                            c0314b.f3897a.e(this, c0314b);
                        }
                        ((J.b) rVar.f810b).b(c0314b);
                        this.f3911j--;
                    }
                    z2 = true;
                    c0318f = c0314b.f3897a;
                    if (c0318f != null) {
                        return;
                    }
                    if (c0318f.f3929l != 1 && c0314b.f3898b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c0318f = c0314b.f3897a;
            if (c0318f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0314b);
    }

    public final void d(C0318f c0318f, int i) {
        int i2 = c0318f.f3922c;
        if (i2 == -1) {
            c0318f.d(this, i);
            for (int i3 = 0; i3 < this.f3905b + 1; i3++) {
                C0318f c0318f2 = ((C0318f[]) this.f3913l.f812d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0314b l2 = l();
            l2.f3897a = c0318f;
            float f2 = i;
            c0318f.f3924e = f2;
            l2.f3898b = f2;
            l2.f3901e = true;
            c(l2);
            return;
        }
        C0314b c0314b = this.f3909f[i2];
        if (c0314b.f3901e) {
            c0314b.f3898b = i;
            return;
        }
        if (c0314b.f3900d.d() == 0) {
            c0314b.f3901e = true;
            c0314b.f3898b = i;
            return;
        }
        C0314b l3 = l();
        if (i < 0) {
            l3.f3898b = i * (-1);
            l3.f3900d.g(c0318f, 1.0f);
        } else {
            l3.f3898b = i;
            l3.f3900d.g(c0318f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0318f c0318f, C0318f c0318f2, int i, int i2) {
        if (i2 == 8 && c0318f2.f3925f && c0318f.f3922c == -1) {
            c0318f.d(this, c0318f2.f3924e + i);
            return;
        }
        C0314b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3898b = i;
        }
        if (z2) {
            l2.f3900d.g(c0318f, 1.0f);
            l2.f3900d.g(c0318f2, -1.0f);
        } else {
            l2.f3900d.g(c0318f, -1.0f);
            l2.f3900d.g(c0318f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0318f c0318f, C0318f c0318f2, int i, int i2) {
        C0314b l2 = l();
        C0318f m2 = m();
        m2.f3923d = 0;
        l2.b(c0318f, c0318f2, m2, i);
        if (i2 != 8) {
            l2.f3900d.g(j(i2), (int) (l2.f3900d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0318f c0318f, C0318f c0318f2, int i, int i2) {
        C0314b l2 = l();
        C0318f m2 = m();
        m2.f3923d = 0;
        l2.c(c0318f, c0318f2, m2, i);
        if (i2 != 8) {
            l2.f3900d.g(j(i2), (int) (l2.f3900d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0314b c0314b) {
        int i;
        if (c0314b.f3901e) {
            c0314b.f3897a.d(this, c0314b.f3898b);
        } else {
            C0314b[] c0314bArr = this.f3909f;
            int i2 = this.f3911j;
            c0314bArr[i2] = c0314b;
            C0318f c0318f = c0314b.f3897a;
            c0318f.f3922c = i2;
            this.f3911j = i2 + 1;
            c0318f.e(this, c0314b);
        }
        if (this.f3904a) {
            int i3 = 0;
            while (i3 < this.f3911j) {
                if (this.f3909f[i3] == null) {
                    System.out.println("WTF");
                }
                C0314b c0314b2 = this.f3909f[i3];
                if (c0314b2 != null && c0314b2.f3901e) {
                    c0314b2.f3897a.d(this, c0314b2.f3898b);
                    ((J.b) this.f3913l.f810b).b(c0314b2);
                    this.f3909f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3911j;
                        if (i4 >= i) {
                            break;
                        }
                        C0314b[] c0314bArr2 = this.f3909f;
                        int i6 = i4 - 1;
                        C0314b c0314b3 = c0314bArr2[i4];
                        c0314bArr2[i6] = c0314b3;
                        C0318f c0318f2 = c0314b3.f3897a;
                        if (c0318f2.f3922c == i4) {
                            c0318f2.f3922c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3909f[i5] = null;
                    }
                    this.f3911j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3904a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3911j; i++) {
            C0314b c0314b = this.f3909f[i];
            c0314b.f3897a.f3924e = c0314b.f3898b;
        }
    }

    public final C0318f j(int i) {
        if (this.i + 1 >= this.f3908e) {
            o();
        }
        C0318f a2 = a(4);
        int i2 = this.f3905b + 1;
        this.f3905b = i2;
        this.i++;
        a2.f3921b = i2;
        a2.f3923d = i;
        ((C0318f[]) this.f3913l.f812d)[i2] = a2;
        C0316d c0316d = this.f3906c;
        c0316d.i.f36b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.f3923d] = 1.0f;
        c0316d.j(a2);
        return a2;
    }

    public final C0318f k(Object obj) {
        C0318f c0318f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3908e) {
            o();
        }
        if (obj instanceof C0324c) {
            C0324c c0324c = (C0324c) obj;
            c0318f = c0324c.i;
            if (c0318f == null) {
                c0324c.k();
                c0318f = c0324c.i;
            }
            int i = c0318f.f3921b;
            r rVar = this.f3913l;
            if (i == -1 || i > this.f3905b || ((C0318f[]) rVar.f812d)[i] == null) {
                if (i != -1) {
                    c0318f.c();
                }
                int i2 = this.f3905b + 1;
                this.f3905b = i2;
                this.i++;
                c0318f.f3921b = i2;
                c0318f.f3929l = 1;
                ((C0318f[]) rVar.f812d)[i2] = c0318f;
            }
        }
        return c0318f;
    }

    public final C0314b l() {
        Object obj;
        r rVar = this.f3913l;
        J.b bVar = (J.b) rVar.f810b;
        int i = bVar.f381b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f380a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f381b = i2;
        } else {
            obj = null;
        }
        C0314b c0314b = (C0314b) obj;
        if (c0314b == null) {
            return new C0314b(rVar);
        }
        c0314b.f3897a = null;
        c0314b.f3900d.b();
        c0314b.f3898b = 0.0f;
        c0314b.f3901e = false;
        return c0314b;
    }

    public final C0318f m() {
        if (this.i + 1 >= this.f3908e) {
            o();
        }
        C0318f a2 = a(3);
        int i = this.f3905b + 1;
        this.f3905b = i;
        this.i++;
        a2.f3921b = i;
        ((C0318f[]) this.f3913l.f812d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.f3907d * 2;
        this.f3907d = i;
        this.f3909f = (C0314b[]) Arrays.copyOf(this.f3909f, i);
        r rVar = this.f3913l;
        rVar.f812d = (C0318f[]) Arrays.copyOf((C0318f[]) rVar.f812d, this.f3907d);
        int i2 = this.f3907d;
        this.h = new boolean[i2];
        this.f3908e = i2;
        this.f3912k = i2;
    }

    public final void p() {
        C0316d c0316d = this.f3906c;
        if (c0316d.e()) {
            i();
            return;
        }
        if (!this.f3910g) {
            q(c0316d);
            return;
        }
        for (int i = 0; i < this.f3911j; i++) {
            if (!this.f3909f[i].f3901e) {
                q(c0316d);
                return;
            }
        }
        i();
    }

    public final void q(C0316d c0316d) {
        int i = 0;
        while (true) {
            if (i >= this.f3911j) {
                break;
            }
            C0314b c0314b = this.f3909f[i];
            int i2 = 1;
            if (c0314b.f3897a.f3929l != 1) {
                float f2 = 0.0f;
                if (c0314b.f3898b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3911j) {
                            C0314b c0314b2 = this.f3909f[i6];
                            if (c0314b2.f3897a.f3929l != i2 && !c0314b2.f3901e && c0314b2.f3898b < f2) {
                                int d2 = c0314b2.f3900d.d();
                                int i8 = 0;
                                while (i8 < d2) {
                                    C0318f e2 = c0314b2.f3900d.e(i8);
                                    float c2 = c0314b2.f3900d.c(e2);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e2.f3926g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3921b;
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
                            C0314b c0314b3 = this.f3909f[i4];
                            c0314b3.f3897a.f3922c = -1;
                            c0314b3.g(((C0318f[]) this.f3913l.f812d)[i5]);
                            C0318f c0318f = c0314b3.f3897a;
                            c0318f.f3922c = i4;
                            c0318f.e(this, c0314b3);
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
        r(c0316d);
        i();
    }

    public final void r(C0314b c0314b) {
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
            C0318f c0318f = c0314b.f3897a;
            if (c0318f != null) {
                this.h[c0318f.f3921b] = true;
            }
            C0318f d2 = c0314b.d(this.h);
            if (d2 != null) {
                boolean[] zArr = this.h;
                int i5 = d2.f3921b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (d2 != null) {
                float f2 = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.f3911j) {
                    C0314b c0314b2 = this.f3909f[i6];
                    if (c0314b2.f3897a.f3929l != i4 && !c0314b2.f3901e) {
                        C0313a c0313a = c0314b2.f3900d;
                        int i8 = c0313a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0313a.f3889a; i9++) {
                                if (c0313a.f3893e[i8] == d2.f3921b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0313a.f3894f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0314b2.f3900d.c(d2);
                            if (c2 < 0.0f) {
                                float f3 = (-c0314b2.f3898b) / c2;
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
                    C0314b c0314b3 = this.f3909f[i7];
                    c0314b3.f3897a.f3922c = -1;
                    c0314b3.g(d2);
                    C0318f c0318f2 = c0314b3.f3897a;
                    c0318f2.f3922c = i7;
                    c0318f2.e(this, c0314b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3911j; i++) {
            C0314b c0314b = this.f3909f[i];
            if (c0314b != null) {
                ((J.b) this.f3913l.f810b).b(c0314b);
            }
            this.f3909f[i] = null;
        }
    }

    public final void t() {
        r rVar;
        int i = 0;
        while (true) {
            rVar = this.f3913l;
            C0318f[] c0318fArr = (C0318f[]) rVar.f812d;
            if (i >= c0318fArr.length) {
                break;
            }
            C0318f c0318f = c0318fArr[i];
            if (c0318f != null) {
                c0318f.c();
            }
            i++;
        }
        J.b bVar = (J.b) rVar.f811c;
        C0318f[] c0318fArr2 = this.f3914m;
        int i2 = this.f3915n;
        bVar.getClass();
        if (i2 > c0318fArr2.length) {
            i2 = c0318fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0318f c0318f2 = c0318fArr2[i3];
            int i4 = bVar.f381b;
            Object[] objArr = bVar.f380a;
            if (i4 < objArr.length) {
                objArr[i4] = c0318f2;
                bVar.f381b = i4 + 1;
            }
        }
        this.f3915n = 0;
        Arrays.fill((C0318f[]) rVar.f812d, (Object) null);
        this.f3905b = 0;
        C0316d c0316d = this.f3906c;
        c0316d.h = 0;
        c0316d.f3898b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3911j; i5++) {
            C0314b c0314b = this.f3909f[i5];
        }
        s();
        this.f3911j = 0;
        this.f3916o = new C0314b(rVar);
    }
}
