package s;

import I0.h;
import java.util.ArrayList;
import java.util.Arrays;
import u.C0386c;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f4113p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f4114q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0379d f4117c;

    /* renamed from: f, reason: collision with root package name */
    public C0377b[] f4119f;

    /* renamed from: l, reason: collision with root package name */
    public final h f4123l;

    /* renamed from: o, reason: collision with root package name */
    public C0377b f4126o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4115a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f4116b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f4118d = 32;
    public int e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4120g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f4121h = new boolean[32];
    public int i = 1;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f4122k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0381f[] f4124m = new C0381f[f4114q];

    /* renamed from: n, reason: collision with root package name */
    public int f4125n = 0;

    public C0378c() {
        this.f4119f = null;
        this.f4119f = new C0377b[32];
        s();
        h hVar = new h();
        hVar.f591b = new L.b();
        hVar.f592c = new L.b();
        hVar.f593d = new C0381f[32];
        this.f4123l = hVar;
        C0379d c0379d = new C0379d(hVar);
        c0379d.f4127f = new C0381f[128];
        c0379d.f4128g = new C0381f[128];
        c0379d.f4129h = 0;
        c0379d.i = new B1.c(c0379d);
        this.f4117c = c0379d;
        this.f4126o = new C0377b(hVar);
    }

    public static int n(Object obj) {
        C0381f c0381f = ((C0386c) obj).i;
        if (c0381f != null) {
            return (int) (c0381f.e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0381f a(int i) {
        L.b bVar = (L.b) this.f4123l.f592c;
        int i2 = bVar.f691b;
        C0381f c0381f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f690a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f691b = i3;
            c0381f = r4;
        }
        C0381f c0381f2 = c0381f;
        if (c0381f2 == null) {
            c0381f2 = new C0381f(i);
            c0381f2.f4139l = i;
        } else {
            c0381f2.c();
            c0381f2.f4139l = i;
        }
        int i4 = this.f4125n;
        int i5 = f4114q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f4114q = i6;
            this.f4124m = (C0381f[]) Arrays.copyOf(this.f4124m, i6);
        }
        C0381f[] c0381fArr = this.f4124m;
        int i7 = this.f4125n;
        this.f4125n = i7 + 1;
        c0381fArr[i7] = c0381f2;
        return c0381f2;
    }

    public final void b(C0381f c0381f, C0381f c0381f2, int i, float f2, C0381f c0381f3, C0381f c0381f4, int i2, int i3) {
        C0377b l2 = l();
        if (c0381f2 == c0381f3) {
            l2.f4112d.g(c0381f, 1.0f);
            l2.f4112d.g(c0381f4, 1.0f);
            l2.f4112d.g(c0381f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.f4112d.g(c0381f, 1.0f);
            l2.f4112d.g(c0381f2, -1.0f);
            l2.f4112d.g(c0381f3, -1.0f);
            l2.f4112d.g(c0381f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f4110b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.f4112d.g(c0381f, -1.0f);
            l2.f4112d.g(c0381f2, 1.0f);
            l2.f4110b = i;
        } else if (f2 >= 1.0f) {
            l2.f4112d.g(c0381f4, -1.0f);
            l2.f4112d.g(c0381f3, 1.0f);
            l2.f4110b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.f4112d.g(c0381f, f3 * 1.0f);
            l2.f4112d.g(c0381f2, f3 * (-1.0f));
            l2.f4112d.g(c0381f3, (-1.0f) * f2);
            l2.f4112d.g(c0381f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f4110b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f4138k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f4138k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f4138k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f4138k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0377b c0377b) {
        boolean z2;
        boolean z3;
        C0381f c0381f;
        C0381f f2;
        ArrayList arrayList;
        if (this.j + 1 >= this.f4122k || this.i + 1 >= this.e) {
            o();
        }
        if (c0377b.e) {
            z2 = false;
        } else {
            if (this.f4119f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d2 = c0377b.f4112d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0377b.f4111c;
                        if (i >= d2) {
                            break;
                        }
                        C0381f e = c0377b.f4112d.e(i);
                        if (e.f4133c != -1 || e.f4135f) {
                            arrayList.add(e);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0381f c0381f2 = (C0381f) arrayList.get(i2);
                            if (c0381f2.f4135f) {
                                c0377b.h(this, c0381f2, true);
                            } else {
                                c0377b.i(this, this.f4119f[c0381f2.f4133c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0377b.f4109a != null && c0377b.f4112d.d() == 0) {
                    c0377b.e = true;
                    this.f4115a = true;
                }
            }
            if (c0377b.e()) {
                return;
            }
            float f3 = c0377b.f4110b;
            if (f3 < 0.0f) {
                c0377b.f4110b = f3 * (-1.0f);
                C0376a c0376a = c0377b.f4112d;
                int i3 = c0376a.f4108h;
                for (int i4 = 0; i3 != -1 && i4 < c0376a.f4102a; i4++) {
                    float[] fArr = c0376a.f4107g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0376a.f4106f[i3];
                }
            }
            int d3 = c0377b.f4112d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0381f c0381f3 = null;
            C0381f c0381f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d3; i5++) {
                float f6 = c0377b.f4112d.f(i5);
                C0381f e2 = c0377b.f4112d.e(i5);
                if (e2.f4139l == 1) {
                    if (c0381f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e2.f4138k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0381f3 = e2;
                    f4 = f6;
                } else if (c0381f3 == null && f6 < 0.0f) {
                    if (c0381f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e2.f4138k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0381f4 = e2;
                    f5 = f6;
                }
            }
            if (c0381f3 == null) {
                c0381f3 = c0381f4;
            }
            if (c0381f3 == null) {
                z3 = true;
            } else {
                c0377b.g(c0381f3);
                z3 = false;
            }
            if (c0377b.f4112d.d() == 0) {
                c0377b.e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.e) {
                    o();
                }
                C0381f a2 = a(3);
                int i6 = this.f4116b + 1;
                this.f4116b = i6;
                this.i++;
                a2.f4132b = i6;
                h hVar = this.f4123l;
                ((C0381f[]) hVar.f593d)[i6] = a2;
                c0377b.f4109a = a2;
                int i7 = this.j;
                h(c0377b);
                if (this.j == i7 + 1) {
                    C0377b c0377b2 = this.f4126o;
                    c0377b2.f4109a = null;
                    c0377b2.f4112d.b();
                    for (int i8 = 0; i8 < c0377b.f4112d.d(); i8++) {
                        c0377b2.f4112d.a(c0377b.f4112d.e(i8), c0377b.f4112d.f(i8), true);
                    }
                    r(this.f4126o);
                    if (a2.f4133c == -1) {
                        if (c0377b.f4109a == a2 && (f2 = c0377b.f(null, a2)) != null) {
                            c0377b.g(f2);
                        }
                        if (!c0377b.e) {
                            c0377b.f4109a.e(this, c0377b);
                        }
                        ((L.b) hVar.f591b).b(c0377b);
                        this.j--;
                    }
                    z2 = true;
                    c0381f = c0377b.f4109a;
                    if (c0381f != null) {
                        return;
                    }
                    if (c0381f.f4139l != 1 && c0377b.f4110b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c0381f = c0377b.f4109a;
            if (c0381f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0377b);
    }

    public final void d(C0381f c0381f, int i) {
        int i2 = c0381f.f4133c;
        if (i2 == -1) {
            c0381f.d(this, i);
            for (int i3 = 0; i3 < this.f4116b + 1; i3++) {
                C0381f c0381f2 = ((C0381f[]) this.f4123l.f593d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0377b l2 = l();
            l2.f4109a = c0381f;
            float f2 = i;
            c0381f.e = f2;
            l2.f4110b = f2;
            l2.e = true;
            c(l2);
            return;
        }
        C0377b c0377b = this.f4119f[i2];
        if (c0377b.e) {
            c0377b.f4110b = i;
            return;
        }
        if (c0377b.f4112d.d() == 0) {
            c0377b.e = true;
            c0377b.f4110b = i;
            return;
        }
        C0377b l3 = l();
        if (i < 0) {
            l3.f4110b = i * (-1);
            l3.f4112d.g(c0381f, 1.0f);
        } else {
            l3.f4110b = i;
            l3.f4112d.g(c0381f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0381f c0381f, C0381f c0381f2, int i, int i2) {
        if (i2 == 8 && c0381f2.f4135f && c0381f.f4133c == -1) {
            c0381f.d(this, c0381f2.e + i);
            return;
        }
        C0377b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f4110b = i;
        }
        if (z2) {
            l2.f4112d.g(c0381f, 1.0f);
            l2.f4112d.g(c0381f2, -1.0f);
        } else {
            l2.f4112d.g(c0381f, -1.0f);
            l2.f4112d.g(c0381f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0381f c0381f, C0381f c0381f2, int i, int i2) {
        C0377b l2 = l();
        C0381f m2 = m();
        m2.f4134d = 0;
        l2.b(c0381f, c0381f2, m2, i);
        if (i2 != 8) {
            l2.f4112d.g(j(i2), (int) (l2.f4112d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0381f c0381f, C0381f c0381f2, int i, int i2) {
        C0377b l2 = l();
        C0381f m2 = m();
        m2.f4134d = 0;
        l2.c(c0381f, c0381f2, m2, i);
        if (i2 != 8) {
            l2.f4112d.g(j(i2), (int) (l2.f4112d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0377b c0377b) {
        int i;
        if (c0377b.e) {
            c0377b.f4109a.d(this, c0377b.f4110b);
        } else {
            C0377b[] c0377bArr = this.f4119f;
            int i2 = this.j;
            c0377bArr[i2] = c0377b;
            C0381f c0381f = c0377b.f4109a;
            c0381f.f4133c = i2;
            this.j = i2 + 1;
            c0381f.e(this, c0377b);
        }
        if (this.f4115a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f4119f[i3] == null) {
                    System.out.println("WTF");
                }
                C0377b c0377b2 = this.f4119f[i3];
                if (c0377b2 != null && c0377b2.e) {
                    c0377b2.f4109a.d(this, c0377b2.f4110b);
                    ((L.b) this.f4123l.f591b).b(c0377b2);
                    this.f4119f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        C0377b[] c0377bArr2 = this.f4119f;
                        int i6 = i4 - 1;
                        C0377b c0377b3 = c0377bArr2[i4];
                        c0377bArr2[i6] = c0377b3;
                        C0381f c0381f2 = c0377b3.f4109a;
                        if (c0381f2.f4133c == i4) {
                            c0381f2.f4133c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f4119f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f4115a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            C0377b c0377b = this.f4119f[i];
            c0377b.f4109a.e = c0377b.f4110b;
        }
    }

    public final C0381f j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        C0381f a2 = a(4);
        int i2 = this.f4116b + 1;
        this.f4116b = i2;
        this.i++;
        a2.f4132b = i2;
        a2.f4134d = i;
        ((C0381f[]) this.f4123l.f593d)[i2] = a2;
        C0379d c0379d = this.f4117c;
        c0379d.i.f68b = a2;
        float[] fArr = a2.f4137h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.f4134d] = 1.0f;
        c0379d.j(a2);
        return a2;
    }

    public final C0381f k(Object obj) {
        C0381f c0381f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (obj instanceof C0386c) {
            C0386c c0386c = (C0386c) obj;
            c0381f = c0386c.i;
            if (c0381f == null) {
                c0386c.k();
                c0381f = c0386c.i;
            }
            int i = c0381f.f4132b;
            h hVar = this.f4123l;
            if (i == -1 || i > this.f4116b || ((C0381f[]) hVar.f593d)[i] == null) {
                if (i != -1) {
                    c0381f.c();
                }
                int i2 = this.f4116b + 1;
                this.f4116b = i2;
                this.i++;
                c0381f.f4132b = i2;
                c0381f.f4139l = 1;
                ((C0381f[]) hVar.f593d)[i2] = c0381f;
            }
        }
        return c0381f;
    }

    public final C0377b l() {
        Object obj;
        h hVar = this.f4123l;
        L.b bVar = (L.b) hVar.f591b;
        int i = bVar.f691b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f690a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f691b = i2;
        } else {
            obj = null;
        }
        C0377b c0377b = (C0377b) obj;
        if (c0377b == null) {
            return new C0377b(hVar);
        }
        c0377b.f4109a = null;
        c0377b.f4112d.b();
        c0377b.f4110b = 0.0f;
        c0377b.e = false;
        return c0377b;
    }

    public final C0381f m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        C0381f a2 = a(3);
        int i = this.f4116b + 1;
        this.f4116b = i;
        this.i++;
        a2.f4132b = i;
        ((C0381f[]) this.f4123l.f593d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.f4118d * 2;
        this.f4118d = i;
        this.f4119f = (C0377b[]) Arrays.copyOf(this.f4119f, i);
        h hVar = this.f4123l;
        hVar.f593d = (C0381f[]) Arrays.copyOf((C0381f[]) hVar.f593d, this.f4118d);
        int i2 = this.f4118d;
        this.f4121h = new boolean[i2];
        this.e = i2;
        this.f4122k = i2;
    }

    public final void p() {
        C0379d c0379d = this.f4117c;
        if (c0379d.e()) {
            i();
            return;
        }
        if (!this.f4120g) {
            q(c0379d);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f4119f[i].e) {
                q(c0379d);
                return;
            }
        }
        i();
    }

    public final void q(C0379d c0379d) {
        int i = 0;
        while (true) {
            if (i >= this.j) {
                break;
            }
            C0377b c0377b = this.f4119f[i];
            int i2 = 1;
            if (c0377b.f4109a.f4139l != 1) {
                float f2 = 0.0f;
                if (c0377b.f4110b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.j) {
                            C0377b c0377b2 = this.f4119f[i6];
                            if (c0377b2.f4109a.f4139l != i2 && !c0377b2.e && c0377b2.f4110b < f2) {
                                int d2 = c0377b2.f4112d.d();
                                int i8 = 0;
                                while (i8 < d2) {
                                    C0381f e = c0377b2.f4112d.e(i8);
                                    float c2 = c0377b2.f4112d.c(e);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e.f4136g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e.f4132b;
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
                            C0377b c0377b3 = this.f4119f[i4];
                            c0377b3.f4109a.f4133c = -1;
                            c0377b3.g(((C0381f[]) this.f4123l.f593d)[i5]);
                            C0381f c0381f = c0377b3.f4109a;
                            c0381f.f4133c = i4;
                            c0381f.e(this, c0377b3);
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
        r(c0379d);
        i();
    }

    public final void r(C0377b c0377b) {
        boolean z2;
        int i = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.f4121h[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            int i4 = 1;
            i3++;
            if (i3 >= this.i * 2) {
                return;
            }
            C0381f c0381f = c0377b.f4109a;
            if (c0381f != null) {
                this.f4121h[c0381f.f4132b] = true;
            }
            C0381f d2 = c0377b.d(this.f4121h);
            if (d2 != null) {
                boolean[] zArr = this.f4121h;
                int i5 = d2.f4132b;
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
                while (i6 < this.j) {
                    C0377b c0377b2 = this.f4119f[i6];
                    if (c0377b2.f4109a.f4139l != i4 && !c0377b2.e) {
                        C0376a c0376a = c0377b2.f4112d;
                        int i8 = c0376a.f4108h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0376a.f4102a; i9++) {
                                if (c0376a.e[i8] == d2.f4132b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0376a.f4106f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0377b2.f4112d.c(d2);
                            if (c2 < 0.0f) {
                                float f3 = (-c0377b2.f4110b) / c2;
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
                    C0377b c0377b3 = this.f4119f[i7];
                    c0377b3.f4109a.f4133c = -1;
                    c0377b3.g(d2);
                    C0381f c0381f2 = c0377b3.f4109a;
                    c0381f2.f4133c = i7;
                    c0381f2.e(this, c0377b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            C0377b c0377b = this.f4119f[i];
            if (c0377b != null) {
                ((L.b) this.f4123l.f591b).b(c0377b);
            }
            this.f4119f[i] = null;
        }
    }

    public final void t() {
        h hVar;
        int i = 0;
        while (true) {
            hVar = this.f4123l;
            C0381f[] c0381fArr = (C0381f[]) hVar.f593d;
            if (i >= c0381fArr.length) {
                break;
            }
            C0381f c0381f = c0381fArr[i];
            if (c0381f != null) {
                c0381f.c();
            }
            i++;
        }
        L.b bVar = (L.b) hVar.f592c;
        C0381f[] c0381fArr2 = this.f4124m;
        int i2 = this.f4125n;
        bVar.getClass();
        if (i2 > c0381fArr2.length) {
            i2 = c0381fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0381f c0381f2 = c0381fArr2[i3];
            int i4 = bVar.f691b;
            Object[] objArr = bVar.f690a;
            if (i4 < objArr.length) {
                objArr[i4] = c0381f2;
                bVar.f691b = i4 + 1;
            }
        }
        this.f4125n = 0;
        Arrays.fill((C0381f[]) hVar.f593d, (Object) null);
        this.f4116b = 0;
        C0379d c0379d = this.f4117c;
        c0379d.f4129h = 0;
        c0379d.f4110b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.j; i5++) {
            C0377b c0377b = this.f4119f[i5];
        }
        s();
        this.j = 0;
        this.f4126o = new C0377b(hVar);
    }
}
