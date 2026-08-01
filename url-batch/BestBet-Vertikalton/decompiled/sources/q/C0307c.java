package q;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import u0.C0365d;
import u0.C0372k;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3722p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3723q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0308d f3726c;

    /* renamed from: f, reason: collision with root package name */
    public C0306b[] f3728f;

    /* renamed from: l, reason: collision with root package name */
    public final C0372k f3732l;

    /* renamed from: o, reason: collision with root package name */
    public C0306b f3735o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3724a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3725b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3727e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3729g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3730j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3731k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0310f[] f3733m = new C0310f[f3723q];

    /* renamed from: n, reason: collision with root package name */
    public int f3734n = 0;

    public C0307c() {
        this.f3728f = null;
        this.f3728f = new C0306b[32];
        s();
        C0372k c0372k = new C0372k();
        c0372k.f4190a = new J.b();
        c0372k.f4191b = new J.b();
        c0372k.f4192c = new C0310f[32];
        this.f3732l = c0372k;
        C0308d c0308d = new C0308d(c0372k);
        c0308d.f3736f = new C0310f[128];
        c0308d.f3737g = new C0310f[128];
        c0308d.h = 0;
        c0308d.i = new C0365d(c0308d);
        this.f3726c = c0308d;
        this.f3735o = new C0306b(c0372k);
    }

    public static int n(Object obj) {
        C0310f c0310f = ((s.c) obj).i;
        if (c0310f != null) {
            return (int) (c0310f.f3742e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0310f a(int i) {
        J.b bVar = (J.b) this.f3732l.f4191b;
        int i2 = bVar.f563b;
        C0310f c0310f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f562a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f563b = i3;
            c0310f = r4;
        }
        C0310f c0310f2 = c0310f;
        if (c0310f2 == null) {
            c0310f2 = new C0310f(i);
            c0310f2.f3747l = i;
        } else {
            c0310f2.c();
            c0310f2.f3747l = i;
        }
        int i4 = this.f3734n;
        int i5 = f3723q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3723q = i6;
            this.f3733m = (C0310f[]) Arrays.copyOf(this.f3733m, i6);
        }
        C0310f[] c0310fArr = this.f3733m;
        int i7 = this.f3734n;
        this.f3734n = i7 + 1;
        c0310fArr[i7] = c0310f2;
        return c0310f2;
    }

    public final void b(C0310f c0310f, C0310f c0310f2, int i, float f2, C0310f c0310f3, C0310f c0310f4, int i2, int i3) {
        C0306b l2 = l();
        if (c0310f2 == c0310f3) {
            l2.d.g(c0310f, 1.0f);
            l2.d.g(c0310f4, 1.0f);
            l2.d.g(c0310f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0310f, 1.0f);
            l2.d.g(c0310f2, -1.0f);
            l2.d.g(c0310f3, -1.0f);
            l2.d.g(c0310f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3719b = (-i) + i2;
            }
        } else if (f2 <= RecyclerView.f1937A0) {
            l2.d.g(c0310f, -1.0f);
            l2.d.g(c0310f2, 1.0f);
            l2.f3719b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0310f4, -1.0f);
            l2.d.g(c0310f3, 1.0f);
            l2.f3719b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0310f, f3 * 1.0f);
            l2.d.g(c0310f2, f3 * (-1.0f));
            l2.d.g(c0310f3, (-1.0f) * f2);
            l2.d.g(c0310f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3719b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3746k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3746k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3746k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3746k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0306b c0306b) {
        boolean z2;
        boolean z3;
        C0310f c0310f;
        C0310f f2;
        ArrayList arrayList;
        if (this.f3730j + 1 >= this.f3731k || this.i + 1 >= this.f3727e) {
            o();
        }
        if (c0306b.f3721e) {
            z2 = false;
        } else {
            if (this.f3728f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0306b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0306b.f3720c;
                        if (i >= d) {
                            break;
                        }
                        C0310f e2 = c0306b.d.e(i);
                        if (e2.f3741c != -1 || e2.f3743f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0310f c0310f2 = (C0310f) arrayList.get(i2);
                            if (c0310f2.f3743f) {
                                c0306b.h(this, c0310f2, true);
                            } else {
                                c0306b.i(this, this.f3728f[c0310f2.f3741c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0306b.f3718a != null && c0306b.d.d() == 0) {
                    c0306b.f3721e = true;
                    this.f3724a = true;
                }
            }
            if (c0306b.e()) {
                return;
            }
            float f3 = c0306b.f3719b;
            if (f3 < RecyclerView.f1937A0) {
                c0306b.f3719b = f3 * (-1.0f);
                C0305a c0305a = c0306b.d;
                int i3 = c0305a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0305a.f3711a; i4++) {
                    float[] fArr = c0305a.f3716g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0305a.f3715f[i3];
                }
            }
            int d2 = c0306b.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0310f c0310f3 = null;
            C0310f c0310f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d2; i5++) {
                float f6 = c0306b.d.f(i5);
                C0310f e3 = c0306b.d.e(i5);
                if (e3.f3747l == 1) {
                    if (c0310f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3746k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0310f3 = e3;
                    f4 = f6;
                } else if (c0310f3 == null && f6 < RecyclerView.f1937A0) {
                    if (c0310f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3746k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0310f4 = e3;
                    f5 = f6;
                }
            }
            if (c0310f3 == null) {
                c0310f3 = c0310f4;
            }
            if (c0310f3 == null) {
                z3 = true;
            } else {
                c0306b.g(c0310f3);
                z3 = false;
            }
            if (c0306b.d.d() == 0) {
                c0306b.f3721e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3727e) {
                    o();
                }
                C0310f a2 = a(3);
                int i6 = this.f3725b + 1;
                this.f3725b = i6;
                this.i++;
                a2.f3740b = i6;
                C0372k c0372k = this.f3732l;
                ((C0310f[]) c0372k.f4192c)[i6] = a2;
                c0306b.f3718a = a2;
                int i7 = this.f3730j;
                h(c0306b);
                if (this.f3730j == i7 + 1) {
                    C0306b c0306b2 = this.f3735o;
                    c0306b2.f3718a = null;
                    c0306b2.d.b();
                    for (int i8 = 0; i8 < c0306b.d.d(); i8++) {
                        c0306b2.d.a(c0306b.d.e(i8), c0306b.d.f(i8), true);
                    }
                    r(this.f3735o);
                    if (a2.f3741c == -1) {
                        if (c0306b.f3718a == a2 && (f2 = c0306b.f(null, a2)) != null) {
                            c0306b.g(f2);
                        }
                        if (!c0306b.f3721e) {
                            c0306b.f3718a.e(this, c0306b);
                        }
                        ((J.b) c0372k.f4190a).b(c0306b);
                        this.f3730j--;
                    }
                    z2 = true;
                    c0310f = c0306b.f3718a;
                    if (c0310f != null) {
                        return;
                    }
                    if (c0310f.f3747l != 1 && c0306b.f3719b < RecyclerView.f1937A0) {
                        return;
                    }
                }
            }
            z2 = false;
            c0310f = c0306b.f3718a;
            if (c0310f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0306b);
    }

    public final void d(C0310f c0310f, int i) {
        int i2 = c0310f.f3741c;
        if (i2 == -1) {
            c0310f.d(this, i);
            for (int i3 = 0; i3 < this.f3725b + 1; i3++) {
                C0310f c0310f2 = ((C0310f[]) this.f3732l.f4192c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0306b l2 = l();
            l2.f3718a = c0310f;
            float f2 = i;
            c0310f.f3742e = f2;
            l2.f3719b = f2;
            l2.f3721e = true;
            c(l2);
            return;
        }
        C0306b c0306b = this.f3728f[i2];
        if (c0306b.f3721e) {
            c0306b.f3719b = i;
            return;
        }
        if (c0306b.d.d() == 0) {
            c0306b.f3721e = true;
            c0306b.f3719b = i;
            return;
        }
        C0306b l3 = l();
        if (i < 0) {
            l3.f3719b = i * (-1);
            l3.d.g(c0310f, 1.0f);
        } else {
            l3.f3719b = i;
            l3.d.g(c0310f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0310f c0310f, C0310f c0310f2, int i, int i2) {
        if (i2 == 8 && c0310f2.f3743f && c0310f.f3741c == -1) {
            c0310f.d(this, c0310f2.f3742e + i);
            return;
        }
        C0306b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3719b = i;
        }
        if (z2) {
            l2.d.g(c0310f, 1.0f);
            l2.d.g(c0310f2, -1.0f);
        } else {
            l2.d.g(c0310f, -1.0f);
            l2.d.g(c0310f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0310f c0310f, C0310f c0310f2, int i, int i2) {
        C0306b l2 = l();
        C0310f m2 = m();
        m2.d = 0;
        l2.b(c0310f, c0310f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0310f c0310f, C0310f c0310f2, int i, int i2) {
        C0306b l2 = l();
        C0310f m2 = m();
        m2.d = 0;
        l2.c(c0310f, c0310f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0306b c0306b) {
        int i;
        if (c0306b.f3721e) {
            c0306b.f3718a.d(this, c0306b.f3719b);
        } else {
            C0306b[] c0306bArr = this.f3728f;
            int i2 = this.f3730j;
            c0306bArr[i2] = c0306b;
            C0310f c0310f = c0306b.f3718a;
            c0310f.f3741c = i2;
            this.f3730j = i2 + 1;
            c0310f.e(this, c0306b);
        }
        if (this.f3724a) {
            int i3 = 0;
            while (i3 < this.f3730j) {
                if (this.f3728f[i3] == null) {
                    System.out.println("WTF");
                }
                C0306b c0306b2 = this.f3728f[i3];
                if (c0306b2 != null && c0306b2.f3721e) {
                    c0306b2.f3718a.d(this, c0306b2.f3719b);
                    ((J.b) this.f3732l.f4190a).b(c0306b2);
                    this.f3728f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3730j;
                        if (i4 >= i) {
                            break;
                        }
                        C0306b[] c0306bArr2 = this.f3728f;
                        int i6 = i4 - 1;
                        C0306b c0306b3 = c0306bArr2[i4];
                        c0306bArr2[i6] = c0306b3;
                        C0310f c0310f2 = c0306b3.f3718a;
                        if (c0310f2.f3741c == i4) {
                            c0310f2.f3741c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3728f[i5] = null;
                    }
                    this.f3730j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3724a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3730j; i++) {
            C0306b c0306b = this.f3728f[i];
            c0306b.f3718a.f3742e = c0306b.f3719b;
        }
    }

    public final C0310f j(int i) {
        if (this.i + 1 >= this.f3727e) {
            o();
        }
        C0310f a2 = a(4);
        int i2 = this.f3725b + 1;
        this.f3725b = i2;
        this.i++;
        a2.f3740b = i2;
        a2.d = i;
        ((C0310f[]) this.f3732l.f4192c)[i2] = a2;
        C0308d c0308d = this.f3726c;
        c0308d.i.f4175b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, RecyclerView.f1937A0);
        fArr[a2.d] = 1.0f;
        c0308d.j(a2);
        return a2;
    }

    public final C0310f k(Object obj) {
        C0310f c0310f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3727e) {
            o();
        }
        if (obj instanceof s.c) {
            s.c cVar = (s.c) obj;
            c0310f = cVar.i;
            if (c0310f == null) {
                cVar.k();
                c0310f = cVar.i;
            }
            int i = c0310f.f3740b;
            C0372k c0372k = this.f3732l;
            if (i == -1 || i > this.f3725b || ((C0310f[]) c0372k.f4192c)[i] == null) {
                if (i != -1) {
                    c0310f.c();
                }
                int i2 = this.f3725b + 1;
                this.f3725b = i2;
                this.i++;
                c0310f.f3740b = i2;
                c0310f.f3747l = 1;
                ((C0310f[]) c0372k.f4192c)[i2] = c0310f;
            }
        }
        return c0310f;
    }

    public final C0306b l() {
        Object obj;
        C0372k c0372k = this.f3732l;
        J.b bVar = (J.b) c0372k.f4190a;
        int i = bVar.f563b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f562a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f563b = i2;
        } else {
            obj = null;
        }
        C0306b c0306b = (C0306b) obj;
        if (c0306b == null) {
            return new C0306b(c0372k);
        }
        c0306b.f3718a = null;
        c0306b.d.b();
        c0306b.f3719b = RecyclerView.f1937A0;
        c0306b.f3721e = false;
        return c0306b;
    }

    public final C0310f m() {
        if (this.i + 1 >= this.f3727e) {
            o();
        }
        C0310f a2 = a(3);
        int i = this.f3725b + 1;
        this.f3725b = i;
        this.i++;
        a2.f3740b = i;
        ((C0310f[]) this.f3732l.f4192c)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3728f = (C0306b[]) Arrays.copyOf(this.f3728f, i);
        C0372k c0372k = this.f3732l;
        c0372k.f4192c = (C0310f[]) Arrays.copyOf((C0310f[]) c0372k.f4192c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3727e = i2;
        this.f3731k = i2;
    }

    public final void p() {
        C0308d c0308d = this.f3726c;
        if (c0308d.e()) {
            i();
            return;
        }
        if (!this.f3729g) {
            q(c0308d);
            return;
        }
        for (int i = 0; i < this.f3730j; i++) {
            if (!this.f3728f[i].f3721e) {
                q(c0308d);
                return;
            }
        }
        i();
    }

    public final void q(C0308d c0308d) {
        int i = 0;
        while (true) {
            if (i >= this.f3730j) {
                break;
            }
            C0306b c0306b = this.f3728f[i];
            int i2 = 1;
            if (c0306b.f3718a.f3747l != 1) {
                float f2 = c0306b.f3719b;
                float f3 = RecyclerView.f1937A0;
                if (f2 < RecyclerView.f1937A0) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f4 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3730j) {
                            C0306b c0306b2 = this.f3728f[i6];
                            if (c0306b2.f3718a.f3747l != i2 && !c0306b2.f3721e && c0306b2.f3719b < f3) {
                                int d = c0306b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0310f e2 = c0306b2.d.e(i8);
                                    float c2 = c0306b2.d.c(e2);
                                    if (c2 > f3) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f5 = e2.f3744g[i9] / c2;
                                            if ((f5 < f4 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3740b;
                                                i4 = i6;
                                                f4 = f5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f3 = RecyclerView.f1937A0;
                                }
                            }
                            i6++;
                            f3 = RecyclerView.f1937A0;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0306b c0306b3 = this.f3728f[i4];
                            c0306b3.f3718a.f3741c = -1;
                            c0306b3.g(((C0310f[]) this.f3732l.f4192c)[i5]);
                            C0310f c0310f = c0306b3.f3718a;
                            c0310f.f3741c = i4;
                            c0310f.e(this, c0306b3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.i / 2) {
                            z2 = true;
                        }
                        f3 = RecyclerView.f1937A0;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(c0308d);
        i();
    }

    public final void r(C0306b c0306b) {
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
            C0310f c0310f = c0306b.f3718a;
            if (c0310f != null) {
                this.h[c0310f.f3740b] = true;
            }
            C0310f d = c0306b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3740b;
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
                while (i6 < this.f3730j) {
                    C0306b c0306b2 = this.f3728f[i6];
                    if (c0306b2.f3718a.f3747l != i4 && !c0306b2.f3721e) {
                        C0305a c0305a = c0306b2.d;
                        int i8 = c0305a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0305a.f3711a; i9++) {
                                if (c0305a.f3714e[i8] == d.f3740b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0305a.f3715f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0306b2.d.c(d);
                            if (c2 < RecyclerView.f1937A0) {
                                float f3 = (-c0306b2.f3719b) / c2;
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
                    C0306b c0306b3 = this.f3728f[i7];
                    c0306b3.f3718a.f3741c = -1;
                    c0306b3.g(d);
                    C0310f c0310f2 = c0306b3.f3718a;
                    c0310f2.f3741c = i7;
                    c0310f2.e(this, c0306b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3730j; i++) {
            C0306b c0306b = this.f3728f[i];
            if (c0306b != null) {
                ((J.b) this.f3732l.f4190a).b(c0306b);
            }
            this.f3728f[i] = null;
        }
    }

    public final void t() {
        C0372k c0372k;
        int i = 0;
        while (true) {
            c0372k = this.f3732l;
            C0310f[] c0310fArr = (C0310f[]) c0372k.f4192c;
            if (i >= c0310fArr.length) {
                break;
            }
            C0310f c0310f = c0310fArr[i];
            if (c0310f != null) {
                c0310f.c();
            }
            i++;
        }
        J.b bVar = (J.b) c0372k.f4191b;
        C0310f[] c0310fArr2 = this.f3733m;
        int i2 = this.f3734n;
        bVar.getClass();
        if (i2 > c0310fArr2.length) {
            i2 = c0310fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0310f c0310f2 = c0310fArr2[i3];
            int i4 = bVar.f563b;
            Object[] objArr = bVar.f562a;
            if (i4 < objArr.length) {
                objArr[i4] = c0310f2;
                bVar.f563b = i4 + 1;
            }
        }
        this.f3734n = 0;
        Arrays.fill((C0310f[]) c0372k.f4192c, (Object) null);
        this.f3725b = 0;
        C0308d c0308d = this.f3726c;
        c0308d.h = 0;
        c0308d.f3719b = RecyclerView.f1937A0;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3730j; i5++) {
            C0306b c0306b = this.f3728f[i5];
        }
        s();
        this.f3730j = 0;
        this.f3735o = new C0306b(c0372k);
    }
}
