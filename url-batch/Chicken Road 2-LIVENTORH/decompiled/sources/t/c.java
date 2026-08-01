package t;

import androidx.emoji2.text.q;
import androidx.emoji2.text.t;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f3244q = false;
    public final d d;

    /* renamed from: m, reason: collision with root package name */
    public final t f3255m;

    /* renamed from: p, reason: collision with root package name */
    public b f3258p;

    /* renamed from: a, reason: collision with root package name */
    public int f3245a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3246b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f3247c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3248e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f3249f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3251h = false;
    public boolean[] i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f3252j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f3253k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3254l = 32;

    /* renamed from: n, reason: collision with root package name */
    public f[] f3256n = new f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f3257o = 0;

    /* renamed from: g, reason: collision with root package name */
    public b[] f3250g = new b[32];

    public c() {
        s();
        t tVar = new t();
        tVar.f355b = new m0.b();
        tVar.f356c = new m0.b();
        tVar.d = new f[32];
        this.f3255m = tVar;
        d dVar = new d(tVar);
        dVar.f3259f = new f[128];
        dVar.f3260g = new f[128];
        dVar.f3261h = 0;
        dVar.i = new q(16, dVar);
        this.d = dVar;
        this.f3258p = new b(tVar);
    }

    public static int n(Object obj) {
        f fVar = ((v.c) obj).i;
        if (fVar != null) {
            return (int) (fVar.f3265j + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i) {
        m0.b bVar = (m0.b) this.f3255m.f356c;
        int i4 = bVar.f2683b;
        f fVar = null;
        if (i4 > 0) {
            int i5 = i4 - 1;
            ?? r3 = bVar.f2682a;
            ?? r4 = r3[i5];
            r3[i5] = 0;
            bVar.f2683b = i5;
            fVar = r4;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i);
            fVar2.f3272q = i;
        } else {
            fVar2.c();
            fVar2.f3272q = i;
        }
        int i6 = this.f3257o;
        int i7 = this.f3245a;
        if (i6 >= i7) {
            int i8 = i7 * 2;
            this.f3245a = i8;
            this.f3256n = (f[]) Arrays.copyOf(this.f3256n, i8);
        }
        f[] fVarArr = this.f3256n;
        int i9 = this.f3257o;
        this.f3257o = i9 + 1;
        fVarArr[i9] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i, float f2, f fVar3, f fVar4, int i4, int i5) {
        b l4 = l();
        if (fVar2 == fVar3) {
            l4.d.g(fVar, 1.0f);
            l4.d.g(fVar4, 1.0f);
            l4.d.g(fVar2, -2.0f);
        } else if (f2 == 0.5f) {
            l4.d.g(fVar, 1.0f);
            l4.d.g(fVar2, -1.0f);
            l4.d.g(fVar3, -1.0f);
            l4.d.g(fVar4, 1.0f);
            if (i > 0 || i4 > 0) {
                l4.f3241b = (-i) + i4;
            }
        } else if (f2 <= 0.0f) {
            l4.d.g(fVar, -1.0f);
            l4.d.g(fVar2, 1.0f);
            l4.f3241b = i;
        } else if (f2 >= 1.0f) {
            l4.d.g(fVar4, -1.0f);
            l4.d.g(fVar3, 1.0f);
            l4.f3241b = -i4;
        } else {
            float f4 = 1.0f - f2;
            l4.d.g(fVar, f4 * 1.0f);
            l4.d.g(fVar2, f4 * (-1.0f));
            l4.d.g(fVar3, (-1.0f) * f2);
            l4.d.g(fVar4, 1.0f * f2);
            if (i > 0 || i4 > 0) {
                l4.f3241b = (i4 * f2) + ((-i) * f4);
            }
        }
        if (i5 != 8) {
            l4.a(this, i5);
        }
        c(l4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        if (r4.f3271p <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        if (r4.f3271p <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        if (r4.f3271p <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
    
        if (r4.f3271p <= 1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(b bVar) {
        boolean z3;
        boolean z4;
        f fVar;
        f f2;
        if (this.f3253k + 1 >= this.f3254l || this.f3252j + 1 >= this.f3249f) {
            o();
        }
        if (bVar.f3243e) {
            z3 = false;
        } else {
            ArrayList arrayList = bVar.f3242c;
            if (this.f3250g.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int d = bVar.d.d();
                    for (int i = 0; i < d; i++) {
                        f e4 = bVar.d.e(i);
                        if (e4.f3264h != -1 || e4.f3266k) {
                            arrayList.add(e4);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i4 = 0; i4 < size; i4++) {
                            f fVar2 = (f) arrayList.get(i4);
                            if (fVar2.f3266k) {
                                bVar.h(this, fVar2, true);
                            } else {
                                bVar.i(this, this.f3250g[fVar2.f3264h], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z5 = true;
                    }
                }
                if (bVar.f3240a != null && bVar.d.d() == 0) {
                    bVar.f3243e = true;
                    this.f3246b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f4 = bVar.f3241b;
            float f5 = 0.0f;
            if (f4 < 0.0f) {
                bVar.f3241b = f4 * (-1.0f);
                a aVar = bVar.d;
                int i5 = aVar.f3238h;
                for (int i6 = 0; i5 != -1 && i6 < aVar.f3232a; i6++) {
                    float[] fArr = aVar.f3237g;
                    fArr[i5] = fArr[i5] * (-1.0f);
                    i5 = aVar.f3236f[i5];
                }
            }
            int d3 = bVar.d.d();
            float f6 = 0.0f;
            float f7 = 0.0f;
            f fVar3 = null;
            f fVar4 = null;
            int i7 = 0;
            boolean z6 = false;
            boolean z7 = false;
            while (i7 < d3) {
                float f8 = bVar.d.f(i7);
                f e5 = bVar.d.e(i7);
                float f9 = f5;
                if (e5.f3272q == 1) {
                    if (fVar3 != null) {
                        if (f6 <= f8) {
                            if (!z6) {
                                if (e5.f3271p > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    fVar3 = e5;
                    f6 = f8;
                } else if (fVar3 == null && f8 < f9) {
                    if (fVar4 != null) {
                        if (f7 <= f8) {
                            if (!z7) {
                                if (e5.f3271p > 1) {
                                }
                            }
                        }
                        z7 = true;
                    }
                    fVar4 = e5;
                    f7 = f8;
                }
                i7++;
                f5 = f9;
            }
            float f10 = f5;
            if (fVar3 == null) {
                fVar3 = fVar4;
            }
            if (fVar3 == null) {
                z4 = true;
            } else {
                bVar.g(fVar3);
                z4 = false;
            }
            if (bVar.d.d() == 0) {
                bVar.f3243e = true;
            }
            if (z4) {
                if (this.f3252j + 1 >= this.f3249f) {
                    o();
                }
                f a2 = a(3);
                int i8 = this.f3247c + 1;
                this.f3247c = i8;
                this.f3252j++;
                a2.f3263g = i8;
                t tVar = this.f3255m;
                ((f[]) tVar.d)[i8] = a2;
                bVar.f3240a = a2;
                int i9 = this.f3253k;
                h(bVar);
                if (this.f3253k == i9 + 1) {
                    b bVar2 = this.f3258p;
                    bVar2.f3240a = null;
                    bVar2.d.b();
                    for (int i10 = 0; i10 < bVar.d.d(); i10++) {
                        bVar2.d.a(bVar.d.e(i10), bVar.d.f(i10), true);
                    }
                    r(this.f3258p);
                    if (a2.f3264h == -1) {
                        if (bVar.f3240a == a2 && (f2 = bVar.f(null, a2)) != null) {
                            bVar.g(f2);
                        }
                        if (!bVar.f3243e) {
                            bVar.f3240a.e(this, bVar);
                        }
                        ((m0.b) tVar.f355b).b(bVar);
                        this.f3253k--;
                    }
                    z3 = true;
                    fVar = bVar.f3240a;
                    if (fVar != null) {
                        return;
                    }
                    if (fVar.f3272q != 1 && bVar.f3241b < f10) {
                        return;
                    }
                }
            }
            z3 = false;
            fVar = bVar.f3240a;
            if (fVar != null) {
            }
        }
        if (z3) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i) {
        int i4 = fVar.f3264h;
        if (i4 == -1) {
            fVar.d(this, i);
            for (int i5 = 0; i5 < this.f3247c + 1; i5++) {
                f fVar2 = ((f[]) this.f3255m.d)[i5];
            }
            return;
        }
        if (i4 == -1) {
            b l4 = l();
            l4.f3240a = fVar;
            float f2 = i;
            fVar.f3265j = f2;
            l4.f3241b = f2;
            l4.f3243e = true;
            c(l4);
            return;
        }
        b bVar = this.f3250g[i4];
        if (bVar.f3243e) {
            bVar.f3241b = i;
            return;
        }
        if (bVar.d.d() == 0) {
            bVar.f3243e = true;
            bVar.f3241b = i;
            return;
        }
        b l5 = l();
        if (i < 0) {
            l5.f3241b = i * (-1);
            l5.d.g(fVar, 1.0f);
        } else {
            l5.f3241b = i;
            l5.d.g(fVar, -1.0f);
        }
        c(l5);
    }

    public final void e(f fVar, f fVar2, int i, int i4) {
        if (i4 == 8 && fVar2.f3266k && fVar.f3264h == -1) {
            fVar.d(this, fVar2.f3265j + i);
            return;
        }
        b l4 = l();
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            l4.f3241b = i;
        }
        if (z3) {
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
        if (bVar.f3243e) {
            bVar.f3240a.d(this, bVar.f3241b);
        } else {
            b[] bVarArr = this.f3250g;
            int i4 = this.f3253k;
            bVarArr[i4] = bVar;
            f fVar = bVar.f3240a;
            fVar.f3264h = i4;
            this.f3253k = i4 + 1;
            fVar.e(this, bVar);
        }
        if (this.f3246b) {
            int i5 = 0;
            while (i5 < this.f3253k) {
                if (this.f3250g[i5] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f3250g[i5];
                if (bVar2 != null && bVar2.f3243e) {
                    bVar2.f3240a.d(this, bVar2.f3241b);
                    ((m0.b) this.f3255m.f355b).b(bVar2);
                    this.f3250g[i5] = null;
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (true) {
                        i = this.f3253k;
                        if (i6 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f3250g;
                        int i8 = i6 - 1;
                        b bVar3 = bVarArr2[i6];
                        bVarArr2[i8] = bVar3;
                        f fVar2 = bVar3.f3240a;
                        if (fVar2.f3264h == i6) {
                            fVar2.f3264h = i8;
                        }
                        i7 = i6;
                        i6++;
                    }
                    if (i7 < i) {
                        this.f3250g[i7] = null;
                    }
                    this.f3253k = i - 1;
                    i5--;
                }
                i5++;
            }
            this.f3246b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3253k; i++) {
            b bVar = this.f3250g[i];
            bVar.f3240a.f3265j = bVar.f3241b;
        }
    }

    public final f j(int i) {
        if (this.f3252j + 1 >= this.f3249f) {
            o();
        }
        f a2 = a(4);
        float[] fArr = a2.f3268m;
        int i4 = this.f3247c + 1;
        this.f3247c = i4;
        this.f3252j++;
        a2.f3263g = i4;
        a2.i = i;
        ((f[]) this.f3255m.d)[i4] = a2;
        d dVar = this.d;
        dVar.i.f346g = a2;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.i] = 1.0f;
        dVar.j(a2);
        return a2;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f3252j + 1 >= this.f3249f) {
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
        int i = fVar.f3263g;
        t tVar = this.f3255m;
        if (i != -1 && i <= this.f3247c && ((f[]) tVar.d)[i] != null) {
            return fVar;
        }
        if (i != -1) {
            fVar.c();
        }
        int i4 = this.f3247c + 1;
        this.f3247c = i4;
        this.f3252j++;
        fVar.f3263g = i4;
        fVar.f3272q = 1;
        ((f[]) tVar.d)[i4] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        t tVar = this.f3255m;
        m0.b bVar = (m0.b) tVar.f355b;
        int i = bVar.f2683b;
        if (i > 0) {
            int i4 = i - 1;
            Object[] objArr = bVar.f2682a;
            obj = objArr[i4];
            objArr[i4] = null;
            bVar.f2683b = i4;
        } else {
            obj = null;
        }
        b bVar2 = (b) obj;
        if (bVar2 == null) {
            return new b(tVar);
        }
        bVar2.f3240a = null;
        bVar2.d.b();
        bVar2.f3241b = 0.0f;
        bVar2.f3243e = false;
        return bVar2;
    }

    public final f m() {
        if (this.f3252j + 1 >= this.f3249f) {
            o();
        }
        f a2 = a(3);
        int i = this.f3247c + 1;
        this.f3247c = i;
        this.f3252j++;
        a2.f3263g = i;
        ((f[]) this.f3255m.d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.f3248e * 2;
        this.f3248e = i;
        this.f3250g = (b[]) Arrays.copyOf(this.f3250g, i);
        t tVar = this.f3255m;
        tVar.d = (f[]) Arrays.copyOf((f[]) tVar.d, this.f3248e);
        int i4 = this.f3248e;
        this.i = new boolean[i4];
        this.f3249f = i4;
        this.f3254l = i4;
    }

    public final void p() {
        d dVar = this.d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f3251h) {
            q(dVar);
            return;
        }
        for (int i = 0; i < this.f3253k; i++) {
            if (!this.f3250g[i].f3243e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        int i = 0;
        while (true) {
            if (i >= this.f3253k) {
                break;
            }
            b bVar = this.f3250g[i];
            int i4 = 1;
            if (bVar.f3240a.f3272q != 1) {
                float f2 = 0.0f;
                if (bVar.f3241b < 0.0f) {
                    boolean z3 = false;
                    int i5 = 0;
                    while (!z3) {
                        i5 += i4;
                        float f4 = Float.MAX_VALUE;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < this.f3253k) {
                            b bVar2 = this.f3250g[i8];
                            if (bVar2.f3240a.f3272q != i4 && !bVar2.f3243e && bVar2.f3241b < f2) {
                                int d = bVar2.d.d();
                                int i10 = 0;
                                while (i10 < d) {
                                    f e4 = bVar2.d.e(i10);
                                    float c4 = bVar2.d.c(e4);
                                    if (c4 > f2) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f5 = e4.f3267l[i11] / c4;
                                            if ((f5 < f4 && i11 == i9) || i11 > i9) {
                                                i9 = i11;
                                                i7 = e4.f3263g;
                                                i6 = i8;
                                                f4 = f5;
                                            }
                                        }
                                    }
                                    i10++;
                                    f2 = 0.0f;
                                }
                            }
                            i8++;
                            f2 = 0.0f;
                            i4 = 1;
                        }
                        if (i6 != -1) {
                            b bVar3 = this.f3250g[i6];
                            bVar3.f3240a.f3264h = -1;
                            bVar3.g(((f[]) this.f3255m.d)[i7]);
                            f fVar = bVar3.f3240a;
                            fVar.f3264h = i6;
                            fVar.e(this, bVar3);
                        } else {
                            z3 = true;
                        }
                        if (i5 > this.f3252j / 2) {
                            z3 = true;
                        }
                        f2 = 0.0f;
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
        boolean z3;
        int i = 0;
        for (int i4 = 0; i4 < this.f3252j; i4++) {
            this.i[i4] = false;
        }
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            int i6 = 1;
            i5++;
            if (i5 >= this.f3252j * 2) {
                return;
            }
            f fVar = bVar.f3240a;
            if (fVar != null) {
                this.i[fVar.f3263g] = true;
            }
            f d = bVar.d(this.i);
            if (d != null) {
                boolean[] zArr = this.i;
                int i7 = d.f3263g;
                if (zArr[i7]) {
                    return;
                } else {
                    zArr[i7] = true;
                }
            }
            if (d != null) {
                float f2 = Float.MAX_VALUE;
                int i8 = i;
                int i9 = -1;
                while (i8 < this.f3253k) {
                    b bVar2 = this.f3250g[i8];
                    if (bVar2.f3240a.f3272q != i6 && !bVar2.f3243e) {
                        a aVar = bVar2.d;
                        int i10 = aVar.f3238h;
                        if (i10 != -1) {
                            for (int i11 = 0; i10 != -1 && i11 < aVar.f3232a; i11++) {
                                if (aVar.f3235e[i10] == d.f3263g) {
                                    z3 = true;
                                    break;
                                }
                                i10 = aVar.f3236f[i10];
                            }
                        }
                        z3 = false;
                        if (z3) {
                            float c4 = bVar2.d.c(d);
                            if (c4 < 0.0f) {
                                float f4 = (-bVar2.f3241b) / c4;
                                if (f4 < f2) {
                                    f2 = f4;
                                    i9 = i8;
                                }
                            }
                        }
                    }
                    i8++;
                    i6 = 1;
                }
                if (i9 > -1) {
                    b bVar3 = this.f3250g[i9];
                    bVar3.f3240a.f3264h = -1;
                    bVar3.g(d);
                    f fVar2 = bVar3.f3240a;
                    fVar2.f3264h = i9;
                    fVar2.e(this, bVar3);
                }
            } else {
                z4 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3253k; i++) {
            b bVar = this.f3250g[i];
            if (bVar != null) {
                ((m0.b) this.f3255m.f355b).b(bVar);
            }
            this.f3250g[i] = null;
        }
    }

    public final void t() {
        t tVar;
        int i = 0;
        while (true) {
            tVar = this.f3255m;
            f[] fVarArr = (f[]) tVar.d;
            if (i >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i];
            if (fVar != null) {
                fVar.c();
            }
            i++;
        }
        m0.b bVar = (m0.b) tVar.f356c;
        f[] fVarArr2 = this.f3256n;
        int i4 = this.f3257o;
        bVar.getClass();
        if (i4 > fVarArr2.length) {
            i4 = fVarArr2.length;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            f fVar2 = fVarArr2[i5];
            int i6 = bVar.f2683b;
            Object[] objArr = bVar.f2682a;
            if (i6 < objArr.length) {
                objArr[i6] = fVar2;
                bVar.f2683b = i6 + 1;
            }
        }
        this.f3257o = 0;
        Arrays.fill((f[]) tVar.d, (Object) null);
        this.f3247c = 0;
        d dVar = this.d;
        dVar.f3261h = 0;
        dVar.f3241b = 0.0f;
        this.f3252j = 1;
        for (int i7 = 0; i7 < this.f3253k; i7++) {
            b bVar2 = this.f3250g[i7];
        }
        s();
        this.f3253k = 0;
        this.f3258p = new b(tVar);
    }
}
