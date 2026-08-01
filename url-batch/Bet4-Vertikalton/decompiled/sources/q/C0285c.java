package q;

import B.j;
import K.C0014l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3472p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3473q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0286d f3476c;

    /* renamed from: f, reason: collision with root package name */
    public C0284b[] f3478f;

    /* renamed from: l, reason: collision with root package name */
    public final C0014l f3482l;

    /* renamed from: o, reason: collision with root package name */
    public C0284b f3485o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3474a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3475b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3477e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3479g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3480j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3481k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0288f[] f3483m = new C0288f[f3473q];

    /* renamed from: n, reason: collision with root package name */
    public int f3484n = 0;

    public C0285c() {
        this.f3478f = null;
        this.f3478f = new C0284b[32];
        s();
        C0014l c0014l = new C0014l();
        c0014l.f474a = new J.b();
        c0014l.f475b = new J.b();
        c0014l.f476c = new C0288f[32];
        this.f3482l = c0014l;
        C0286d c0286d = new C0286d(c0014l);
        c0286d.f3486f = new C0288f[128];
        c0286d.f3487g = new C0288f[128];
        c0286d.h = 0;
        c0286d.i = new j(c0286d);
        this.f3476c = c0286d;
        this.f3485o = new C0284b(c0014l);
    }

    public static int n(Object obj) {
        C0288f c0288f = ((s.c) obj).i;
        if (c0288f != null) {
            return (int) (c0288f.f3492e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0288f a(int i) {
        J.b bVar = (J.b) this.f3482l.f475b;
        int i2 = bVar.f314b;
        C0288f c0288f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f313a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f314b = i3;
            c0288f = r4;
        }
        C0288f c0288f2 = c0288f;
        if (c0288f2 == null) {
            c0288f2 = new C0288f(i);
            c0288f2.f3497l = i;
        } else {
            c0288f2.c();
            c0288f2.f3497l = i;
        }
        int i4 = this.f3484n;
        int i5 = f3473q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3473q = i6;
            this.f3483m = (C0288f[]) Arrays.copyOf(this.f3483m, i6);
        }
        C0288f[] c0288fArr = this.f3483m;
        int i7 = this.f3484n;
        this.f3484n = i7 + 1;
        c0288fArr[i7] = c0288f2;
        return c0288f2;
    }

    public final void b(C0288f c0288f, C0288f c0288f2, int i, float f2, C0288f c0288f3, C0288f c0288f4, int i2, int i3) {
        C0284b l2 = l();
        if (c0288f2 == c0288f3) {
            l2.d.g(c0288f, 1.0f);
            l2.d.g(c0288f4, 1.0f);
            l2.d.g(c0288f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0288f, 1.0f);
            l2.d.g(c0288f2, -1.0f);
            l2.d.g(c0288f3, -1.0f);
            l2.d.g(c0288f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3469b = (-i) + i2;
            }
        } else if (f2 <= RecyclerView.f1530C0) {
            l2.d.g(c0288f, -1.0f);
            l2.d.g(c0288f2, 1.0f);
            l2.f3469b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0288f4, -1.0f);
            l2.d.g(c0288f3, 1.0f);
            l2.f3469b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0288f, f3 * 1.0f);
            l2.d.g(c0288f2, f3 * (-1.0f));
            l2.d.g(c0288f3, (-1.0f) * f2);
            l2.d.g(c0288f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3469b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3496k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3496k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3496k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3496k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0284b c0284b) {
        boolean z2;
        boolean z3;
        C0288f c0288f;
        C0288f f2;
        ArrayList arrayList;
        if (this.f3480j + 1 >= this.f3481k || this.i + 1 >= this.f3477e) {
            o();
        }
        if (c0284b.f3471e) {
            z2 = false;
        } else {
            if (this.f3478f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0284b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0284b.f3470c;
                        if (i >= d) {
                            break;
                        }
                        C0288f e2 = c0284b.d.e(i);
                        if (e2.f3491c != -1 || e2.f3493f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0288f c0288f2 = (C0288f) arrayList.get(i2);
                            if (c0288f2.f3493f) {
                                c0284b.h(this, c0288f2, true);
                            } else {
                                c0284b.i(this, this.f3478f[c0288f2.f3491c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0284b.f3468a != null && c0284b.d.d() == 0) {
                    c0284b.f3471e = true;
                    this.f3474a = true;
                }
            }
            if (c0284b.e()) {
                return;
            }
            float f3 = c0284b.f3469b;
            if (f3 < RecyclerView.f1530C0) {
                c0284b.f3469b = f3 * (-1.0f);
                C0283a c0283a = c0284b.d;
                int i3 = c0283a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0283a.f3461a; i4++) {
                    float[] fArr = c0283a.f3466g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0283a.f3465f[i3];
                }
            }
            int d2 = c0284b.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0288f c0288f3 = null;
            C0288f c0288f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d2; i5++) {
                float f6 = c0284b.d.f(i5);
                C0288f e3 = c0284b.d.e(i5);
                if (e3.f3497l == 1) {
                    if (c0288f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3496k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0288f3 = e3;
                    f4 = f6;
                } else if (c0288f3 == null && f6 < RecyclerView.f1530C0) {
                    if (c0288f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3496k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0288f4 = e3;
                    f5 = f6;
                }
            }
            if (c0288f3 == null) {
                c0288f3 = c0288f4;
            }
            if (c0288f3 == null) {
                z3 = true;
            } else {
                c0284b.g(c0288f3);
                z3 = false;
            }
            if (c0284b.d.d() == 0) {
                c0284b.f3471e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3477e) {
                    o();
                }
                C0288f a2 = a(3);
                int i6 = this.f3475b + 1;
                this.f3475b = i6;
                this.i++;
                a2.f3490b = i6;
                C0014l c0014l = this.f3482l;
                ((C0288f[]) c0014l.f476c)[i6] = a2;
                c0284b.f3468a = a2;
                int i7 = this.f3480j;
                h(c0284b);
                if (this.f3480j == i7 + 1) {
                    C0284b c0284b2 = this.f3485o;
                    c0284b2.f3468a = null;
                    c0284b2.d.b();
                    for (int i8 = 0; i8 < c0284b.d.d(); i8++) {
                        c0284b2.d.a(c0284b.d.e(i8), c0284b.d.f(i8), true);
                    }
                    r(this.f3485o);
                    if (a2.f3491c == -1) {
                        if (c0284b.f3468a == a2 && (f2 = c0284b.f(null, a2)) != null) {
                            c0284b.g(f2);
                        }
                        if (!c0284b.f3471e) {
                            c0284b.f3468a.e(this, c0284b);
                        }
                        ((J.b) c0014l.f474a).b(c0284b);
                        this.f3480j--;
                    }
                    z2 = true;
                    c0288f = c0284b.f3468a;
                    if (c0288f != null) {
                        return;
                    }
                    if (c0288f.f3497l != 1 && c0284b.f3469b < RecyclerView.f1530C0) {
                        return;
                    }
                }
            }
            z2 = false;
            c0288f = c0284b.f3468a;
            if (c0288f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0284b);
    }

    public final void d(C0288f c0288f, int i) {
        int i2 = c0288f.f3491c;
        if (i2 == -1) {
            c0288f.d(this, i);
            for (int i3 = 0; i3 < this.f3475b + 1; i3++) {
                C0288f c0288f2 = ((C0288f[]) this.f3482l.f476c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0284b l2 = l();
            l2.f3468a = c0288f;
            float f2 = i;
            c0288f.f3492e = f2;
            l2.f3469b = f2;
            l2.f3471e = true;
            c(l2);
            return;
        }
        C0284b c0284b = this.f3478f[i2];
        if (c0284b.f3471e) {
            c0284b.f3469b = i;
            return;
        }
        if (c0284b.d.d() == 0) {
            c0284b.f3471e = true;
            c0284b.f3469b = i;
            return;
        }
        C0284b l3 = l();
        if (i < 0) {
            l3.f3469b = i * (-1);
            l3.d.g(c0288f, 1.0f);
        } else {
            l3.f3469b = i;
            l3.d.g(c0288f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0288f c0288f, C0288f c0288f2, int i, int i2) {
        if (i2 == 8 && c0288f2.f3493f && c0288f.f3491c == -1) {
            c0288f.d(this, c0288f2.f3492e + i);
            return;
        }
        C0284b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3469b = i;
        }
        if (z2) {
            l2.d.g(c0288f, 1.0f);
            l2.d.g(c0288f2, -1.0f);
        } else {
            l2.d.g(c0288f, -1.0f);
            l2.d.g(c0288f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0288f c0288f, C0288f c0288f2, int i, int i2) {
        C0284b l2 = l();
        C0288f m2 = m();
        m2.d = 0;
        l2.b(c0288f, c0288f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0288f c0288f, C0288f c0288f2, int i, int i2) {
        C0284b l2 = l();
        C0288f m2 = m();
        m2.d = 0;
        l2.c(c0288f, c0288f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0284b c0284b) {
        int i;
        if (c0284b.f3471e) {
            c0284b.f3468a.d(this, c0284b.f3469b);
        } else {
            C0284b[] c0284bArr = this.f3478f;
            int i2 = this.f3480j;
            c0284bArr[i2] = c0284b;
            C0288f c0288f = c0284b.f3468a;
            c0288f.f3491c = i2;
            this.f3480j = i2 + 1;
            c0288f.e(this, c0284b);
        }
        if (this.f3474a) {
            int i3 = 0;
            while (i3 < this.f3480j) {
                if (this.f3478f[i3] == null) {
                    System.out.println("WTF");
                }
                C0284b c0284b2 = this.f3478f[i3];
                if (c0284b2 != null && c0284b2.f3471e) {
                    c0284b2.f3468a.d(this, c0284b2.f3469b);
                    ((J.b) this.f3482l.f474a).b(c0284b2);
                    this.f3478f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3480j;
                        if (i4 >= i) {
                            break;
                        }
                        C0284b[] c0284bArr2 = this.f3478f;
                        int i6 = i4 - 1;
                        C0284b c0284b3 = c0284bArr2[i4];
                        c0284bArr2[i6] = c0284b3;
                        C0288f c0288f2 = c0284b3.f3468a;
                        if (c0288f2.f3491c == i4) {
                            c0288f2.f3491c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3478f[i5] = null;
                    }
                    this.f3480j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3474a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3480j; i++) {
            C0284b c0284b = this.f3478f[i];
            c0284b.f3468a.f3492e = c0284b.f3469b;
        }
    }

    public final C0288f j(int i) {
        if (this.i + 1 >= this.f3477e) {
            o();
        }
        C0288f a2 = a(4);
        int i2 = this.f3475b + 1;
        this.f3475b = i2;
        this.i++;
        a2.f3490b = i2;
        a2.d = i;
        ((C0288f[]) this.f3482l.f476c)[i2] = a2;
        C0286d c0286d = this.f3476c;
        c0286d.i.f31b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, RecyclerView.f1530C0);
        fArr[a2.d] = 1.0f;
        c0286d.j(a2);
        return a2;
    }

    public final C0288f k(Object obj) {
        C0288f c0288f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3477e) {
            o();
        }
        if (obj instanceof s.c) {
            s.c cVar = (s.c) obj;
            c0288f = cVar.i;
            if (c0288f == null) {
                cVar.k();
                c0288f = cVar.i;
            }
            int i = c0288f.f3490b;
            C0014l c0014l = this.f3482l;
            if (i == -1 || i > this.f3475b || ((C0288f[]) c0014l.f476c)[i] == null) {
                if (i != -1) {
                    c0288f.c();
                }
                int i2 = this.f3475b + 1;
                this.f3475b = i2;
                this.i++;
                c0288f.f3490b = i2;
                c0288f.f3497l = 1;
                ((C0288f[]) c0014l.f476c)[i2] = c0288f;
            }
        }
        return c0288f;
    }

    public final C0284b l() {
        Object obj;
        C0014l c0014l = this.f3482l;
        J.b bVar = (J.b) c0014l.f474a;
        int i = bVar.f314b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f313a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f314b = i2;
        } else {
            obj = null;
        }
        C0284b c0284b = (C0284b) obj;
        if (c0284b == null) {
            return new C0284b(c0014l);
        }
        c0284b.f3468a = null;
        c0284b.d.b();
        c0284b.f3469b = RecyclerView.f1530C0;
        c0284b.f3471e = false;
        return c0284b;
    }

    public final C0288f m() {
        if (this.i + 1 >= this.f3477e) {
            o();
        }
        C0288f a2 = a(3);
        int i = this.f3475b + 1;
        this.f3475b = i;
        this.i++;
        a2.f3490b = i;
        ((C0288f[]) this.f3482l.f476c)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3478f = (C0284b[]) Arrays.copyOf(this.f3478f, i);
        C0014l c0014l = this.f3482l;
        c0014l.f476c = (C0288f[]) Arrays.copyOf((C0288f[]) c0014l.f476c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3477e = i2;
        this.f3481k = i2;
    }

    public final void p() {
        C0286d c0286d = this.f3476c;
        if (c0286d.e()) {
            i();
            return;
        }
        if (!this.f3479g) {
            q(c0286d);
            return;
        }
        for (int i = 0; i < this.f3480j; i++) {
            if (!this.f3478f[i].f3471e) {
                q(c0286d);
                return;
            }
        }
        i();
    }

    public final void q(C0286d c0286d) {
        int i = 0;
        while (true) {
            if (i >= this.f3480j) {
                break;
            }
            C0284b c0284b = this.f3478f[i];
            int i2 = 1;
            if (c0284b.f3468a.f3497l != 1) {
                float f2 = c0284b.f3469b;
                float f3 = RecyclerView.f1530C0;
                if (f2 < RecyclerView.f1530C0) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f4 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3480j) {
                            C0284b c0284b2 = this.f3478f[i6];
                            if (c0284b2.f3468a.f3497l != i2 && !c0284b2.f3471e && c0284b2.f3469b < f3) {
                                int d = c0284b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0288f e2 = c0284b2.d.e(i8);
                                    float c2 = c0284b2.d.c(e2);
                                    if (c2 > f3) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f5 = e2.f3494g[i9] / c2;
                                            if ((f5 < f4 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3490b;
                                                i4 = i6;
                                                f4 = f5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f3 = RecyclerView.f1530C0;
                                }
                            }
                            i6++;
                            f3 = RecyclerView.f1530C0;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0284b c0284b3 = this.f3478f[i4];
                            c0284b3.f3468a.f3491c = -1;
                            c0284b3.g(((C0288f[]) this.f3482l.f476c)[i5]);
                            C0288f c0288f = c0284b3.f3468a;
                            c0288f.f3491c = i4;
                            c0288f.e(this, c0284b3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.i / 2) {
                            z2 = true;
                        }
                        f3 = RecyclerView.f1530C0;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(c0286d);
        i();
    }

    public final void r(C0284b c0284b) {
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
            C0288f c0288f = c0284b.f3468a;
            if (c0288f != null) {
                this.h[c0288f.f3490b] = true;
            }
            C0288f d = c0284b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3490b;
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
                while (i6 < this.f3480j) {
                    C0284b c0284b2 = this.f3478f[i6];
                    if (c0284b2.f3468a.f3497l != i4 && !c0284b2.f3471e) {
                        C0283a c0283a = c0284b2.d;
                        int i8 = c0283a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0283a.f3461a; i9++) {
                                if (c0283a.f3464e[i8] == d.f3490b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0283a.f3465f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0284b2.d.c(d);
                            if (c2 < RecyclerView.f1530C0) {
                                float f3 = (-c0284b2.f3469b) / c2;
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
                    C0284b c0284b3 = this.f3478f[i7];
                    c0284b3.f3468a.f3491c = -1;
                    c0284b3.g(d);
                    C0288f c0288f2 = c0284b3.f3468a;
                    c0288f2.f3491c = i7;
                    c0288f2.e(this, c0284b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3480j; i++) {
            C0284b c0284b = this.f3478f[i];
            if (c0284b != null) {
                ((J.b) this.f3482l.f474a).b(c0284b);
            }
            this.f3478f[i] = null;
        }
    }

    public final void t() {
        C0014l c0014l;
        int i = 0;
        while (true) {
            c0014l = this.f3482l;
            C0288f[] c0288fArr = (C0288f[]) c0014l.f476c;
            if (i >= c0288fArr.length) {
                break;
            }
            C0288f c0288f = c0288fArr[i];
            if (c0288f != null) {
                c0288f.c();
            }
            i++;
        }
        J.b bVar = (J.b) c0014l.f475b;
        C0288f[] c0288fArr2 = this.f3483m;
        int i2 = this.f3484n;
        bVar.getClass();
        if (i2 > c0288fArr2.length) {
            i2 = c0288fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0288f c0288f2 = c0288fArr2[i3];
            int i4 = bVar.f314b;
            Object[] objArr = bVar.f313a;
            if (i4 < objArr.length) {
                objArr[i4] = c0288f2;
                bVar.f314b = i4 + 1;
            }
        }
        this.f3484n = 0;
        Arrays.fill((C0288f[]) c0014l.f476c, (Object) null);
        this.f3475b = 0;
        C0286d c0286d = this.f3476c;
        c0286d.h = 0;
        c0286d.f3469b = RecyclerView.f1530C0;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3480j; i5++) {
            C0284b c0284b = this.f3478f[i5];
        }
        s();
        this.f3480j = 0;
        this.f3485o = new C0284b(c0014l);
    }
}
