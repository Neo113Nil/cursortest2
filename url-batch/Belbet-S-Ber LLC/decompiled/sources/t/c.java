package t;

import androidx.emoji2.text.q;
import androidx.emoji2.text.t;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f3358q = false;
    public final d d;

    /* renamed from: m, reason: collision with root package name */
    public final t f3368m;

    /* renamed from: p, reason: collision with root package name */
    public b f3371p;

    /* renamed from: a, reason: collision with root package name */
    public int f3359a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3360b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f3361c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3362e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f3363f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f3365j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f3366k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3367l = 32;

    /* renamed from: n, reason: collision with root package name */
    public f[] f3369n = new f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f3370o = 0;

    /* renamed from: g, reason: collision with root package name */
    public b[] f3364g = new b[32];

    public c() {
        s();
        t tVar = new t();
        tVar.f472a = new m0.b();
        tVar.f473b = new m0.b();
        tVar.f474c = new f[32];
        this.f3368m = tVar;
        d dVar = new d(tVar);
        dVar.f3372f = new f[128];
        dVar.f3373g = new f[128];
        dVar.h = 0;
        dVar.i = new q(17, dVar);
        this.d = dVar;
        this.f3371p = new b(tVar);
    }

    public static int n(Object obj) {
        f fVar = ((v.c) obj).i;
        if (fVar != null) {
            return (int) (fVar.f3377j + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i) {
        m0.b bVar = (m0.b) this.f3368m.f473b;
        int i4 = bVar.f2723b;
        f fVar = null;
        if (i4 > 0) {
            int i5 = i4 - 1;
            ?? r32 = bVar.f2722a;
            ?? r4 = r32[i5];
            r32[i5] = 0;
            bVar.f2723b = i5;
            fVar = r4;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i);
            fVar2.f3384q = i;
        } else {
            fVar2.c();
            fVar2.f3384q = i;
        }
        int i6 = this.f3370o;
        int i7 = this.f3359a;
        if (i6 >= i7) {
            int i8 = i7 * 2;
            this.f3359a = i8;
            this.f3369n = (f[]) Arrays.copyOf(this.f3369n, i8);
        }
        f[] fVarArr = this.f3369n;
        int i9 = this.f3370o;
        this.f3370o = i9 + 1;
        fVarArr[i9] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i, float f5, f fVar3, f fVar4, int i4, int i5) {
        b l4 = l();
        if (fVar2 == fVar3) {
            l4.d.g(fVar, 1.0f);
            l4.d.g(fVar4, 1.0f);
            l4.d.g(fVar2, -2.0f);
        } else if (f5 == 0.5f) {
            l4.d.g(fVar, 1.0f);
            l4.d.g(fVar2, -1.0f);
            l4.d.g(fVar3, -1.0f);
            l4.d.g(fVar4, 1.0f);
            if (i > 0 || i4 > 0) {
                l4.f3355b = (-i) + i4;
            }
        } else if (f5 <= 0.0f) {
            l4.d.g(fVar, -1.0f);
            l4.d.g(fVar2, 1.0f);
            l4.f3355b = i;
        } else if (f5 >= 1.0f) {
            l4.d.g(fVar4, -1.0f);
            l4.d.g(fVar3, 1.0f);
            l4.f3355b = -i4;
        } else {
            float f6 = 1.0f - f5;
            l4.d.g(fVar, f6 * 1.0f);
            l4.d.g(fVar2, f6 * (-1.0f));
            l4.d.g(fVar3, (-1.0f) * f5);
            l4.d.g(fVar4, 1.0f * f5);
            if (i > 0 || i4 > 0) {
                l4.f3355b = (i4 * f5) + ((-i) * f6);
            }
        }
        if (i5 != 8) {
            l4.a(this, i5);
        }
        c(l4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        if (r4.f3383p <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        if (r4.f3383p <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        if (r4.f3383p <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
    
        if (r4.f3383p <= 1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(b bVar) {
        boolean z4;
        boolean z5;
        f fVar;
        f f5;
        if (this.f3366k + 1 >= this.f3367l || this.f3365j + 1 >= this.f3363f) {
            o();
        }
        if (bVar.f3357e) {
            z4 = false;
        } else {
            ArrayList arrayList = bVar.f3356c;
            if (this.f3364g.length != 0) {
                boolean z6 = false;
                while (!z6) {
                    int d = bVar.d.d();
                    for (int i = 0; i < d; i++) {
                        f e4 = bVar.d.e(i);
                        if (e4.h != -1 || e4.f3378k) {
                            arrayList.add(e4);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i4 = 0; i4 < size; i4++) {
                            f fVar2 = (f) arrayList.get(i4);
                            if (fVar2.f3378k) {
                                bVar.h(this, fVar2, true);
                            } else {
                                bVar.i(this, this.f3364g[fVar2.h], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z6 = true;
                    }
                }
                if (bVar.f3354a != null && bVar.d.d() == 0) {
                    bVar.f3357e = true;
                    this.f3360b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f6 = bVar.f3355b;
            float f7 = 0.0f;
            if (f6 < 0.0f) {
                bVar.f3355b = f6 * (-1.0f);
                a aVar = bVar.d;
                int i5 = aVar.h;
                for (int i6 = 0; i5 != -1 && i6 < aVar.f3347a; i6++) {
                    float[] fArr = aVar.f3352g;
                    fArr[i5] = fArr[i5] * (-1.0f);
                    i5 = aVar.f3351f[i5];
                }
            }
            int d5 = bVar.d.d();
            float f8 = 0.0f;
            float f9 = 0.0f;
            f fVar3 = null;
            f fVar4 = null;
            int i7 = 0;
            boolean z7 = false;
            boolean z8 = false;
            while (i7 < d5) {
                float f10 = bVar.d.f(i7);
                f e5 = bVar.d.e(i7);
                float f11 = f7;
                if (e5.f3384q == 1) {
                    if (fVar3 != null) {
                        if (f8 <= f10) {
                            if (!z7) {
                                if (e5.f3383p > 1) {
                                }
                            }
                        }
                        z7 = true;
                    }
                    fVar3 = e5;
                    f8 = f10;
                } else if (fVar3 == null && f10 < f11) {
                    if (fVar4 != null) {
                        if (f9 <= f10) {
                            if (!z8) {
                                if (e5.f3383p > 1) {
                                }
                            }
                        }
                        z8 = true;
                    }
                    fVar4 = e5;
                    f9 = f10;
                }
                i7++;
                f7 = f11;
            }
            float f12 = f7;
            if (fVar3 == null) {
                fVar3 = fVar4;
            }
            if (fVar3 == null) {
                z5 = true;
            } else {
                bVar.g(fVar3);
                z5 = false;
            }
            if (bVar.d.d() == 0) {
                bVar.f3357e = true;
            }
            if (z5) {
                if (this.f3365j + 1 >= this.f3363f) {
                    o();
                }
                f a5 = a(3);
                int i8 = this.f3361c + 1;
                this.f3361c = i8;
                this.f3365j++;
                a5.f3376g = i8;
                t tVar = this.f3368m;
                ((f[]) tVar.f474c)[i8] = a5;
                bVar.f3354a = a5;
                int i9 = this.f3366k;
                h(bVar);
                if (this.f3366k == i9 + 1) {
                    b bVar2 = this.f3371p;
                    bVar2.f3354a = null;
                    bVar2.d.b();
                    for (int i10 = 0; i10 < bVar.d.d(); i10++) {
                        bVar2.d.a(bVar.d.e(i10), bVar.d.f(i10), true);
                    }
                    r(this.f3371p);
                    if (a5.h == -1) {
                        if (bVar.f3354a == a5 && (f5 = bVar.f(null, a5)) != null) {
                            bVar.g(f5);
                        }
                        if (!bVar.f3357e) {
                            bVar.f3354a.e(this, bVar);
                        }
                        ((m0.b) tVar.f472a).b(bVar);
                        this.f3366k--;
                    }
                    z4 = true;
                    fVar = bVar.f3354a;
                    if (fVar != null) {
                        return;
                    }
                    if (fVar.f3384q != 1 && bVar.f3355b < f12) {
                        return;
                    }
                }
            }
            z4 = false;
            fVar = bVar.f3354a;
            if (fVar != null) {
            }
        }
        if (z4) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i) {
        int i4 = fVar.h;
        if (i4 == -1) {
            fVar.d(this, i);
            for (int i5 = 0; i5 < this.f3361c + 1; i5++) {
                f fVar2 = ((f[]) this.f3368m.f474c)[i5];
            }
            return;
        }
        if (i4 == -1) {
            b l4 = l();
            l4.f3354a = fVar;
            float f5 = i;
            fVar.f3377j = f5;
            l4.f3355b = f5;
            l4.f3357e = true;
            c(l4);
            return;
        }
        b bVar = this.f3364g[i4];
        if (bVar.f3357e) {
            bVar.f3355b = i;
            return;
        }
        if (bVar.d.d() == 0) {
            bVar.f3357e = true;
            bVar.f3355b = i;
            return;
        }
        b l5 = l();
        if (i < 0) {
            l5.f3355b = i * (-1);
            l5.d.g(fVar, 1.0f);
        } else {
            l5.f3355b = i;
            l5.d.g(fVar, -1.0f);
        }
        c(l5);
    }

    public final void e(f fVar, f fVar2, int i, int i4) {
        if (i4 == 8 && fVar2.f3378k && fVar.h == -1) {
            fVar.d(this, fVar2.f3377j + i);
            return;
        }
        b l4 = l();
        boolean z4 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z4 = true;
            }
            l4.f3355b = i;
        }
        if (z4) {
            l4.d.g(fVar, 1.0f);
            l4.d.g(fVar2, -1.0f);
        } else {
            l4.d.g(fVar, -1.0f);
            l4.d.g(fVar2, 1.0f);
        }
        if (i4 != 8) {
            l4.a(this, i4);
        }
        c(l4);
    }

    public final void f(f fVar, f fVar2, int i, int i4) {
        b l4 = l();
        f m4 = m();
        m4.i = 0;
        l4.b(fVar, fVar2, m4, i);
        if (i4 != 8) {
            l4.d.g(j(i4), (int) (l4.d.c(m4) * (-1.0f)));
        }
        c(l4);
    }

    public final void g(f fVar, f fVar2, int i, int i4) {
        b l4 = l();
        f m4 = m();
        m4.i = 0;
        l4.c(fVar, fVar2, m4, i);
        if (i4 != 8) {
            l4.d.g(j(i4), (int) (l4.d.c(m4) * (-1.0f)));
        }
        c(l4);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.f3357e) {
            bVar.f3354a.d(this, bVar.f3355b);
        } else {
            b[] bVarArr = this.f3364g;
            int i4 = this.f3366k;
            bVarArr[i4] = bVar;
            f fVar = bVar.f3354a;
            fVar.h = i4;
            this.f3366k = i4 + 1;
            fVar.e(this, bVar);
        }
        if (this.f3360b) {
            int i5 = 0;
            while (i5 < this.f3366k) {
                if (this.f3364g[i5] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f3364g[i5];
                if (bVar2 != null && bVar2.f3357e) {
                    bVar2.f3354a.d(this, bVar2.f3355b);
                    ((m0.b) this.f3368m.f472a).b(bVar2);
                    this.f3364g[i5] = null;
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (true) {
                        i = this.f3366k;
                        if (i6 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f3364g;
                        int i8 = i6 - 1;
                        b bVar3 = bVarArr2[i6];
                        bVarArr2[i8] = bVar3;
                        f fVar2 = bVar3.f3354a;
                        if (fVar2.h == i6) {
                            fVar2.h = i8;
                        }
                        i7 = i6;
                        i6++;
                    }
                    if (i7 < i) {
                        this.f3364g[i7] = null;
                    }
                    this.f3366k = i - 1;
                    i5--;
                }
                i5++;
            }
            this.f3360b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3366k; i++) {
            b bVar = this.f3364g[i];
            bVar.f3354a.f3377j = bVar.f3355b;
        }
    }

    public final f j(int i) {
        if (this.f3365j + 1 >= this.f3363f) {
            o();
        }
        f a5 = a(4);
        float[] fArr = a5.f3380m;
        int i4 = this.f3361c + 1;
        this.f3361c = i4;
        this.f3365j++;
        a5.f3376g = i4;
        a5.i = i;
        ((f[]) this.f3368m.f474c)[i4] = a5;
        d dVar = this.d;
        dVar.i.f466g = a5;
        Arrays.fill(fArr, 0.0f);
        fArr[a5.i] = 1.0f;
        dVar.j(a5);
        return a5;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f3365j + 1 >= this.f3363f) {
            o();
        }
        if (!(obj instanceof v.c)) {
            return null;
        }
        v.c cVar = (v.c) obj;
        f fVar = cVar.i;
        if (fVar == null) {
            cVar.k();
            fVar = cVar.i;
        }
        int i = fVar.f3376g;
        t tVar = this.f3368m;
        if (i != -1 && i <= this.f3361c && ((f[]) tVar.f474c)[i] != null) {
            return fVar;
        }
        if (i != -1) {
            fVar.c();
        }
        int i4 = this.f3361c + 1;
        this.f3361c = i4;
        this.f3365j++;
        fVar.f3376g = i4;
        fVar.f3384q = 1;
        ((f[]) tVar.f474c)[i4] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        t tVar = this.f3368m;
        m0.b bVar = (m0.b) tVar.f472a;
        int i = bVar.f2723b;
        if (i > 0) {
            int i4 = i - 1;
            Object[] objArr = bVar.f2722a;
            obj = objArr[i4];
            objArr[i4] = null;
            bVar.f2723b = i4;
        } else {
            obj = null;
        }
        b bVar2 = (b) obj;
        if (bVar2 == null) {
            return new b(tVar);
        }
        bVar2.f3354a = null;
        bVar2.d.b();
        bVar2.f3355b = 0.0f;
        bVar2.f3357e = false;
        return bVar2;
    }

    public final f m() {
        if (this.f3365j + 1 >= this.f3363f) {
            o();
        }
        f a5 = a(3);
        int i = this.f3361c + 1;
        this.f3361c = i;
        this.f3365j++;
        a5.f3376g = i;
        ((f[]) this.f3368m.f474c)[i] = a5;
        return a5;
    }

    public final void o() {
        int i = this.f3362e * 2;
        this.f3362e = i;
        this.f3364g = (b[]) Arrays.copyOf(this.f3364g, i);
        t tVar = this.f3368m;
        tVar.f474c = (f[]) Arrays.copyOf((f[]) tVar.f474c, this.f3362e);
        int i4 = this.f3362e;
        this.i = new boolean[i4];
        this.f3363f = i4;
        this.f3367l = i4;
    }

    public final void p() {
        d dVar = this.d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(dVar);
            return;
        }
        for (int i = 0; i < this.f3366k; i++) {
            if (!this.f3364g[i].f3357e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        int i = 0;
        while (true) {
            if (i >= this.f3366k) {
                break;
            }
            b bVar = this.f3364g[i];
            int i4 = 1;
            if (bVar.f3354a.f3384q != 1) {
                float f5 = 0.0f;
                if (bVar.f3355b < 0.0f) {
                    boolean z4 = false;
                    int i5 = 0;
                    while (!z4) {
                        i5 += i4;
                        float f6 = Float.MAX_VALUE;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < this.f3366k) {
                            b bVar2 = this.f3364g[i8];
                            if (bVar2.f3354a.f3384q != i4 && !bVar2.f3357e && bVar2.f3355b < f5) {
                                int d = bVar2.d.d();
                                int i10 = 0;
                                while (i10 < d) {
                                    f e4 = bVar2.d.e(i10);
                                    float c5 = bVar2.d.c(e4);
                                    if (c5 > f5) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f7 = e4.f3379l[i11] / c5;
                                            if ((f7 < f6 && i11 == i9) || i11 > i9) {
                                                i9 = i11;
                                                i7 = e4.f3376g;
                                                i6 = i8;
                                                f6 = f7;
                                            }
                                        }
                                    }
                                    i10++;
                                    f5 = 0.0f;
                                }
                            }
                            i8++;
                            f5 = 0.0f;
                            i4 = 1;
                        }
                        if (i6 != -1) {
                            b bVar3 = this.f3364g[i6];
                            bVar3.f3354a.h = -1;
                            bVar3.g(((f[]) this.f3368m.f474c)[i7]);
                            f fVar = bVar3.f3354a;
                            fVar.h = i6;
                            fVar.e(this, bVar3);
                        } else {
                            z4 = true;
                        }
                        if (i5 > this.f3365j / 2) {
                            z4 = true;
                        }
                        f5 = 0.0f;
                        i4 = 1;
                    }
                }
            }
            i++;
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z4;
        int i = 0;
        for (int i4 = 0; i4 < this.f3365j; i4++) {
            this.i[i4] = false;
        }
        boolean z5 = false;
        int i5 = 0;
        while (!z5) {
            int i6 = 1;
            i5++;
            if (i5 >= this.f3365j * 2) {
                return;
            }
            f fVar = bVar.f3354a;
            if (fVar != null) {
                this.i[fVar.f3376g] = true;
            }
            f d = bVar.d(this.i);
            if (d != null) {
                boolean[] zArr = this.i;
                int i7 = d.f3376g;
                if (zArr[i7]) {
                    return;
                } else {
                    zArr[i7] = true;
                }
            }
            if (d != null) {
                float f5 = Float.MAX_VALUE;
                int i8 = i;
                int i9 = -1;
                while (i8 < this.f3366k) {
                    b bVar2 = this.f3364g[i8];
                    if (bVar2.f3354a.f3384q != i6 && !bVar2.f3357e) {
                        a aVar = bVar2.d;
                        int i10 = aVar.h;
                        if (i10 != -1) {
                            for (int i11 = 0; i10 != -1 && i11 < aVar.f3347a; i11++) {
                                if (aVar.f3350e[i10] == d.f3376g) {
                                    z4 = true;
                                    break;
                                }
                                i10 = aVar.f3351f[i10];
                            }
                        }
                        z4 = false;
                        if (z4) {
                            float c5 = bVar2.d.c(d);
                            if (c5 < 0.0f) {
                                float f6 = (-bVar2.f3355b) / c5;
                                if (f6 < f5) {
                                    f5 = f6;
                                    i9 = i8;
                                }
                            }
                        }
                    }
                    i8++;
                    i6 = 1;
                }
                if (i9 > -1) {
                    b bVar3 = this.f3364g[i9];
                    bVar3.f3354a.h = -1;
                    bVar3.g(d);
                    f fVar2 = bVar3.f3354a;
                    fVar2.h = i9;
                    fVar2.e(this, bVar3);
                }
            } else {
                z5 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3366k; i++) {
            b bVar = this.f3364g[i];
            if (bVar != null) {
                ((m0.b) this.f3368m.f472a).b(bVar);
            }
            this.f3364g[i] = null;
        }
    }

    public final void t() {
        t tVar;
        int i = 0;
        while (true) {
            tVar = this.f3368m;
            f[] fVarArr = (f[]) tVar.f474c;
            if (i >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i];
            if (fVar != null) {
                fVar.c();
            }
            i++;
        }
        m0.b bVar = (m0.b) tVar.f473b;
        f[] fVarArr2 = this.f3369n;
        int i4 = this.f3370o;
        bVar.getClass();
        if (i4 > fVarArr2.length) {
            i4 = fVarArr2.length;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            f fVar2 = fVarArr2[i5];
            int i6 = bVar.f2723b;
            Object[] objArr = bVar.f2722a;
            if (i6 < objArr.length) {
                objArr[i6] = fVar2;
                bVar.f2723b = i6 + 1;
            }
        }
        this.f3370o = 0;
        Arrays.fill((f[]) tVar.f474c, (Object) null);
        this.f3361c = 0;
        d dVar = this.d;
        dVar.h = 0;
        dVar.f3355b = 0.0f;
        this.f3365j = 1;
        for (int i7 = 0; i7 < this.f3366k; i7++) {
            b bVar2 = this.f3364g[i7];
        }
        s();
        this.f3366k = 0;
        this.f3371p = new b(tVar);
    }
}
