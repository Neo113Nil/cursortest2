package q;

import B.j;
import T.r;
import java.util.ArrayList;
import java.util.Arrays;
import s.C0326c;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3906p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3907q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0318d f3910c;

    /* renamed from: f, reason: collision with root package name */
    public C0316b[] f3913f;

    /* renamed from: l, reason: collision with root package name */
    public final r f3917l;

    /* renamed from: o, reason: collision with root package name */
    public C0316b f3920o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3908a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3909b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3911d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3912e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3914g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3915j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3916k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0320f[] f3918m = new C0320f[f3907q];

    /* renamed from: n, reason: collision with root package name */
    public int f3919n = 0;

    public C0317c() {
        this.f3913f = null;
        this.f3913f = new C0316b[32];
        s();
        r rVar = new r();
        rVar.f811b = new J.b();
        rVar.f812c = new J.b();
        rVar.f813d = new C0320f[32];
        this.f3917l = rVar;
        C0318d c0318d = new C0318d(rVar);
        c0318d.f3921f = new C0320f[128];
        c0318d.f3922g = new C0320f[128];
        c0318d.h = 0;
        c0318d.i = new j(c0318d);
        this.f3910c = c0318d;
        this.f3920o = new C0316b(rVar);
    }

    public static int n(Object obj) {
        C0320f c0320f = ((C0326c) obj).i;
        if (c0320f != null) {
            return (int) (c0320f.f3928e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0320f a(int i) {
        J.b bVar = (J.b) this.f3917l.f812c;
        int i2 = bVar.f380b;
        C0320f c0320f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f379a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f380b = i3;
            c0320f = r4;
        }
        C0320f c0320f2 = c0320f;
        if (c0320f2 == null) {
            c0320f2 = new C0320f(i);
            c0320f2.f3933l = i;
        } else {
            c0320f2.c();
            c0320f2.f3933l = i;
        }
        int i4 = this.f3919n;
        int i5 = f3907q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3907q = i6;
            this.f3918m = (C0320f[]) Arrays.copyOf(this.f3918m, i6);
        }
        C0320f[] c0320fArr = this.f3918m;
        int i7 = this.f3919n;
        this.f3919n = i7 + 1;
        c0320fArr[i7] = c0320f2;
        return c0320f2;
    }

    public final void b(C0320f c0320f, C0320f c0320f2, int i, float f2, C0320f c0320f3, C0320f c0320f4, int i2, int i3) {
        C0316b l2 = l();
        if (c0320f2 == c0320f3) {
            l2.f3904d.g(c0320f, 1.0f);
            l2.f3904d.g(c0320f4, 1.0f);
            l2.f3904d.g(c0320f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.f3904d.g(c0320f, 1.0f);
            l2.f3904d.g(c0320f2, -1.0f);
            l2.f3904d.g(c0320f3, -1.0f);
            l2.f3904d.g(c0320f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3902b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.f3904d.g(c0320f, -1.0f);
            l2.f3904d.g(c0320f2, 1.0f);
            l2.f3902b = i;
        } else if (f2 >= 1.0f) {
            l2.f3904d.g(c0320f4, -1.0f);
            l2.f3904d.g(c0320f3, 1.0f);
            l2.f3902b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.f3904d.g(c0320f, f3 * 1.0f);
            l2.f3904d.g(c0320f2, f3 * (-1.0f));
            l2.f3904d.g(c0320f3, (-1.0f) * f2);
            l2.f3904d.g(c0320f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3902b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3932k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3932k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3932k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3932k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0316b c0316b) {
        boolean z2;
        boolean z3;
        C0320f c0320f;
        C0320f f2;
        ArrayList arrayList;
        if (this.f3915j + 1 >= this.f3916k || this.i + 1 >= this.f3912e) {
            o();
        }
        if (c0316b.f3905e) {
            z2 = false;
        } else {
            if (this.f3913f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d2 = c0316b.f3904d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0316b.f3903c;
                        if (i >= d2) {
                            break;
                        }
                        C0320f e2 = c0316b.f3904d.e(i);
                        if (e2.f3926c != -1 || e2.f3929f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0320f c0320f2 = (C0320f) arrayList.get(i2);
                            if (c0320f2.f3929f) {
                                c0316b.h(this, c0320f2, true);
                            } else {
                                c0316b.i(this, this.f3913f[c0320f2.f3926c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0316b.f3901a != null && c0316b.f3904d.d() == 0) {
                    c0316b.f3905e = true;
                    this.f3908a = true;
                }
            }
            if (c0316b.e()) {
                return;
            }
            float f3 = c0316b.f3902b;
            if (f3 < 0.0f) {
                c0316b.f3902b = f3 * (-1.0f);
                C0315a c0315a = c0316b.f3904d;
                int i3 = c0315a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0315a.f3893a; i4++) {
                    float[] fArr = c0315a.f3899g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0315a.f3898f[i3];
                }
            }
            int d3 = c0316b.f3904d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0320f c0320f3 = null;
            C0320f c0320f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d3; i5++) {
                float f6 = c0316b.f3904d.f(i5);
                C0320f e3 = c0316b.f3904d.e(i5);
                if (e3.f3933l == 1) {
                    if (c0320f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3932k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0320f3 = e3;
                    f4 = f6;
                } else if (c0320f3 == null && f6 < 0.0f) {
                    if (c0320f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3932k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0320f4 = e3;
                    f5 = f6;
                }
            }
            if (c0320f3 == null) {
                c0320f3 = c0320f4;
            }
            if (c0320f3 == null) {
                z3 = true;
            } else {
                c0316b.g(c0320f3);
                z3 = false;
            }
            if (c0316b.f3904d.d() == 0) {
                c0316b.f3905e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3912e) {
                    o();
                }
                C0320f a2 = a(3);
                int i6 = this.f3909b + 1;
                this.f3909b = i6;
                this.i++;
                a2.f3925b = i6;
                r rVar = this.f3917l;
                ((C0320f[]) rVar.f813d)[i6] = a2;
                c0316b.f3901a = a2;
                int i7 = this.f3915j;
                h(c0316b);
                if (this.f3915j == i7 + 1) {
                    C0316b c0316b2 = this.f3920o;
                    c0316b2.f3901a = null;
                    c0316b2.f3904d.b();
                    for (int i8 = 0; i8 < c0316b.f3904d.d(); i8++) {
                        c0316b2.f3904d.a(c0316b.f3904d.e(i8), c0316b.f3904d.f(i8), true);
                    }
                    r(this.f3920o);
                    if (a2.f3926c == -1) {
                        if (c0316b.f3901a == a2 && (f2 = c0316b.f(null, a2)) != null) {
                            c0316b.g(f2);
                        }
                        if (!c0316b.f3905e) {
                            c0316b.f3901a.e(this, c0316b);
                        }
                        ((J.b) rVar.f811b).b(c0316b);
                        this.f3915j--;
                    }
                    z2 = true;
                    c0320f = c0316b.f3901a;
                    if (c0320f != null) {
                        return;
                    }
                    if (c0320f.f3933l != 1 && c0316b.f3902b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c0320f = c0316b.f3901a;
            if (c0320f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0316b);
    }

    public final void d(C0320f c0320f, int i) {
        int i2 = c0320f.f3926c;
        if (i2 == -1) {
            c0320f.d(this, i);
            for (int i3 = 0; i3 < this.f3909b + 1; i3++) {
                C0320f c0320f2 = ((C0320f[]) this.f3917l.f813d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0316b l2 = l();
            l2.f3901a = c0320f;
            float f2 = i;
            c0320f.f3928e = f2;
            l2.f3902b = f2;
            l2.f3905e = true;
            c(l2);
            return;
        }
        C0316b c0316b = this.f3913f[i2];
        if (c0316b.f3905e) {
            c0316b.f3902b = i;
            return;
        }
        if (c0316b.f3904d.d() == 0) {
            c0316b.f3905e = true;
            c0316b.f3902b = i;
            return;
        }
        C0316b l3 = l();
        if (i < 0) {
            l3.f3902b = i * (-1);
            l3.f3904d.g(c0320f, 1.0f);
        } else {
            l3.f3902b = i;
            l3.f3904d.g(c0320f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0320f c0320f, C0320f c0320f2, int i, int i2) {
        if (i2 == 8 && c0320f2.f3929f && c0320f.f3926c == -1) {
            c0320f.d(this, c0320f2.f3928e + i);
            return;
        }
        C0316b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3902b = i;
        }
        if (z2) {
            l2.f3904d.g(c0320f, 1.0f);
            l2.f3904d.g(c0320f2, -1.0f);
        } else {
            l2.f3904d.g(c0320f, -1.0f);
            l2.f3904d.g(c0320f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0320f c0320f, C0320f c0320f2, int i, int i2) {
        C0316b l2 = l();
        C0320f m2 = m();
        m2.f3927d = 0;
        l2.b(c0320f, c0320f2, m2, i);
        if (i2 != 8) {
            l2.f3904d.g(j(i2), (int) (l2.f3904d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0320f c0320f, C0320f c0320f2, int i, int i2) {
        C0316b l2 = l();
        C0320f m2 = m();
        m2.f3927d = 0;
        l2.c(c0320f, c0320f2, m2, i);
        if (i2 != 8) {
            l2.f3904d.g(j(i2), (int) (l2.f3904d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0316b c0316b) {
        int i;
        if (c0316b.f3905e) {
            c0316b.f3901a.d(this, c0316b.f3902b);
        } else {
            C0316b[] c0316bArr = this.f3913f;
            int i2 = this.f3915j;
            c0316bArr[i2] = c0316b;
            C0320f c0320f = c0316b.f3901a;
            c0320f.f3926c = i2;
            this.f3915j = i2 + 1;
            c0320f.e(this, c0316b);
        }
        if (this.f3908a) {
            int i3 = 0;
            while (i3 < this.f3915j) {
                if (this.f3913f[i3] == null) {
                    System.out.println("WTF");
                }
                C0316b c0316b2 = this.f3913f[i3];
                if (c0316b2 != null && c0316b2.f3905e) {
                    c0316b2.f3901a.d(this, c0316b2.f3902b);
                    ((J.b) this.f3917l.f811b).b(c0316b2);
                    this.f3913f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3915j;
                        if (i4 >= i) {
                            break;
                        }
                        C0316b[] c0316bArr2 = this.f3913f;
                        int i6 = i4 - 1;
                        C0316b c0316b3 = c0316bArr2[i4];
                        c0316bArr2[i6] = c0316b3;
                        C0320f c0320f2 = c0316b3.f3901a;
                        if (c0320f2.f3926c == i4) {
                            c0320f2.f3926c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3913f[i5] = null;
                    }
                    this.f3915j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3908a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3915j; i++) {
            C0316b c0316b = this.f3913f[i];
            c0316b.f3901a.f3928e = c0316b.f3902b;
        }
    }

    public final C0320f j(int i) {
        if (this.i + 1 >= this.f3912e) {
            o();
        }
        C0320f a2 = a(4);
        int i2 = this.f3909b + 1;
        this.f3909b = i2;
        this.i++;
        a2.f3925b = i2;
        a2.f3927d = i;
        ((C0320f[]) this.f3917l.f813d)[i2] = a2;
        C0318d c0318d = this.f3910c;
        c0318d.i.f36b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.f3927d] = 1.0f;
        c0318d.j(a2);
        return a2;
    }

    public final C0320f k(Object obj) {
        C0320f c0320f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3912e) {
            o();
        }
        if (obj instanceof C0326c) {
            C0326c c0326c = (C0326c) obj;
            c0320f = c0326c.i;
            if (c0320f == null) {
                c0326c.k();
                c0320f = c0326c.i;
            }
            int i = c0320f.f3925b;
            r rVar = this.f3917l;
            if (i == -1 || i > this.f3909b || ((C0320f[]) rVar.f813d)[i] == null) {
                if (i != -1) {
                    c0320f.c();
                }
                int i2 = this.f3909b + 1;
                this.f3909b = i2;
                this.i++;
                c0320f.f3925b = i2;
                c0320f.f3933l = 1;
                ((C0320f[]) rVar.f813d)[i2] = c0320f;
            }
        }
        return c0320f;
    }

    public final C0316b l() {
        Object obj;
        r rVar = this.f3917l;
        J.b bVar = (J.b) rVar.f811b;
        int i = bVar.f380b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f379a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f380b = i2;
        } else {
            obj = null;
        }
        C0316b c0316b = (C0316b) obj;
        if (c0316b == null) {
            return new C0316b(rVar);
        }
        c0316b.f3901a = null;
        c0316b.f3904d.b();
        c0316b.f3902b = 0.0f;
        c0316b.f3905e = false;
        return c0316b;
    }

    public final C0320f m() {
        if (this.i + 1 >= this.f3912e) {
            o();
        }
        C0320f a2 = a(3);
        int i = this.f3909b + 1;
        this.f3909b = i;
        this.i++;
        a2.f3925b = i;
        ((C0320f[]) this.f3917l.f813d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.f3911d * 2;
        this.f3911d = i;
        this.f3913f = (C0316b[]) Arrays.copyOf(this.f3913f, i);
        r rVar = this.f3917l;
        rVar.f813d = (C0320f[]) Arrays.copyOf((C0320f[]) rVar.f813d, this.f3911d);
        int i2 = this.f3911d;
        this.h = new boolean[i2];
        this.f3912e = i2;
        this.f3916k = i2;
    }

    public final void p() {
        C0318d c0318d = this.f3910c;
        if (c0318d.e()) {
            i();
            return;
        }
        if (!this.f3914g) {
            q(c0318d);
            return;
        }
        for (int i = 0; i < this.f3915j; i++) {
            if (!this.f3913f[i].f3905e) {
                q(c0318d);
                return;
            }
        }
        i();
    }

    public final void q(C0318d c0318d) {
        int i = 0;
        while (true) {
            if (i >= this.f3915j) {
                break;
            }
            C0316b c0316b = this.f3913f[i];
            int i2 = 1;
            if (c0316b.f3901a.f3933l != 1) {
                float f2 = 0.0f;
                if (c0316b.f3902b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3915j) {
                            C0316b c0316b2 = this.f3913f[i6];
                            if (c0316b2.f3901a.f3933l != i2 && !c0316b2.f3905e && c0316b2.f3902b < f2) {
                                int d2 = c0316b2.f3904d.d();
                                int i8 = 0;
                                while (i8 < d2) {
                                    C0320f e2 = c0316b2.f3904d.e(i8);
                                    float c2 = c0316b2.f3904d.c(e2);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e2.f3930g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3925b;
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
                            C0316b c0316b3 = this.f3913f[i4];
                            c0316b3.f3901a.f3926c = -1;
                            c0316b3.g(((C0320f[]) this.f3917l.f813d)[i5]);
                            C0320f c0320f = c0316b3.f3901a;
                            c0320f.f3926c = i4;
                            c0320f.e(this, c0316b3);
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
        r(c0318d);
        i();
    }

    public final void r(C0316b c0316b) {
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
            C0320f c0320f = c0316b.f3901a;
            if (c0320f != null) {
                this.h[c0320f.f3925b] = true;
            }
            C0320f d2 = c0316b.d(this.h);
            if (d2 != null) {
                boolean[] zArr = this.h;
                int i5 = d2.f3925b;
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
                while (i6 < this.f3915j) {
                    C0316b c0316b2 = this.f3913f[i6];
                    if (c0316b2.f3901a.f3933l != i4 && !c0316b2.f3905e) {
                        C0315a c0315a = c0316b2.f3904d;
                        int i8 = c0315a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0315a.f3893a; i9++) {
                                if (c0315a.f3897e[i8] == d2.f3925b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0315a.f3898f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0316b2.f3904d.c(d2);
                            if (c2 < 0.0f) {
                                float f3 = (-c0316b2.f3902b) / c2;
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
                    C0316b c0316b3 = this.f3913f[i7];
                    c0316b3.f3901a.f3926c = -1;
                    c0316b3.g(d2);
                    C0320f c0320f2 = c0316b3.f3901a;
                    c0320f2.f3926c = i7;
                    c0320f2.e(this, c0316b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3915j; i++) {
            C0316b c0316b = this.f3913f[i];
            if (c0316b != null) {
                ((J.b) this.f3917l.f811b).b(c0316b);
            }
            this.f3913f[i] = null;
        }
    }

    public final void t() {
        r rVar;
        int i = 0;
        while (true) {
            rVar = this.f3917l;
            C0320f[] c0320fArr = (C0320f[]) rVar.f813d;
            if (i >= c0320fArr.length) {
                break;
            }
            C0320f c0320f = c0320fArr[i];
            if (c0320f != null) {
                c0320f.c();
            }
            i++;
        }
        J.b bVar = (J.b) rVar.f812c;
        C0320f[] c0320fArr2 = this.f3918m;
        int i2 = this.f3919n;
        bVar.getClass();
        if (i2 > c0320fArr2.length) {
            i2 = c0320fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0320f c0320f2 = c0320fArr2[i3];
            int i4 = bVar.f380b;
            Object[] objArr = bVar.f379a;
            if (i4 < objArr.length) {
                objArr[i4] = c0320f2;
                bVar.f380b = i4 + 1;
            }
        }
        this.f3919n = 0;
        Arrays.fill((C0320f[]) rVar.f813d, (Object) null);
        this.f3909b = 0;
        C0318d c0318d = this.f3910c;
        c0318d.h = 0;
        c0318d.f3902b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3915j; i5++) {
            C0316b c0316b = this.f3913f[i5];
        }
        s();
        this.f3915j = 0;
        this.f3920o = new C0316b(rVar);
    }
}
