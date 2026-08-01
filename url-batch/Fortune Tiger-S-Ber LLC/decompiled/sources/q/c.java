package q;

import androidx.emoji2.text.s;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f3065q = false;

    /* renamed from: d, reason: collision with root package name */
    public final d f3068d;

    /* renamed from: m, reason: collision with root package name */
    public final s f3075m;

    /* renamed from: p, reason: collision with root package name */
    public b f3078p;

    /* renamed from: a, reason: collision with root package name */
    public int f3066a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3067b = false;
    public int c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3069e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f3070f = 32;
    public boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean[] f3071i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f3072j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f3073k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3074l = 32;

    /* renamed from: n, reason: collision with root package name */
    public f[] f3076n = new f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f3077o = 0;
    public b[] g = new b[32];

    public c() {
        s();
        s sVar = new s();
        sVar.f357b = new j0.b();
        sVar.c = new j0.b();
        sVar.f358d = new f[32];
        this.f3075m = sVar;
        d dVar = new d(sVar);
        dVar.f3079f = new f[128];
        dVar.g = new f[128];
        dVar.h = 0;
        dVar.f3080i = new a2.s(16, dVar);
        this.f3068d = dVar;
        this.f3078p = new b(sVar);
    }

    public static int n(Object obj) {
        f fVar = ((s.c) obj).f3232i;
        if (fVar != null) {
            return (int) (fVar.f3084j + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i4) {
        j0.b bVar = (j0.b) this.f3075m.c;
        int i5 = bVar.f2254b;
        f fVar = null;
        if (i5 > 0) {
            int i6 = i5 - 1;
            ?? r3 = bVar.f2253a;
            ?? r4 = r3[i6];
            r3[i6] = 0;
            bVar.f2254b = i6;
            fVar = r4;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i4);
            fVar2.f3091q = i4;
        } else {
            fVar2.c();
            fVar2.f3091q = i4;
        }
        int i7 = this.f3077o;
        int i8 = this.f3066a;
        if (i7 >= i8) {
            int i9 = i8 * 2;
            this.f3066a = i9;
            this.f3076n = (f[]) Arrays.copyOf(this.f3076n, i9);
        }
        f[] fVarArr = this.f3076n;
        int i10 = this.f3077o;
        this.f3077o = i10 + 1;
        fVarArr[i10] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i4, float f4, f fVar3, f fVar4, int i5, int i6) {
        b l4 = l();
        if (fVar2 == fVar3) {
            l4.f3063d.g(fVar, 1.0f);
            l4.f3063d.g(fVar4, 1.0f);
            l4.f3063d.g(fVar2, -2.0f);
        } else if (f4 == 0.5f) {
            l4.f3063d.g(fVar, 1.0f);
            l4.f3063d.g(fVar2, -1.0f);
            l4.f3063d.g(fVar3, -1.0f);
            l4.f3063d.g(fVar4, 1.0f);
            if (i4 > 0 || i5 > 0) {
                l4.f3062b = (-i4) + i5;
            }
        } else if (f4 <= 0.0f) {
            l4.f3063d.g(fVar, -1.0f);
            l4.f3063d.g(fVar2, 1.0f);
            l4.f3062b = i4;
        } else if (f4 >= 1.0f) {
            l4.f3063d.g(fVar4, -1.0f);
            l4.f3063d.g(fVar3, 1.0f);
            l4.f3062b = -i5;
        } else {
            float f5 = 1.0f - f4;
            l4.f3063d.g(fVar, f5 * 1.0f);
            l4.f3063d.g(fVar2, f5 * (-1.0f));
            l4.f3063d.g(fVar3, (-1.0f) * f4);
            l4.f3063d.g(fVar4, 1.0f * f4);
            if (i4 > 0 || i5 > 0) {
                l4.f3062b = (i5 * f4) + ((-i4) * f5);
            }
        }
        if (i6 != 8) {
            l4.a(this, i6);
        }
        c(l4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        if (r4.f3090p <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        if (r4.f3090p <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        if (r4.f3090p <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
    
        if (r4.f3090p <= 1) goto L86;
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
        f f4;
        if (this.f3073k + 1 >= this.f3074l || this.f3072j + 1 >= this.f3070f) {
            o();
        }
        if (bVar.f3064e) {
            z3 = false;
        } else {
            ArrayList arrayList = bVar.c;
            if (this.g.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int d4 = bVar.f3063d.d();
                    for (int i4 = 0; i4 < d4; i4++) {
                        f e4 = bVar.f3063d.e(i4);
                        if (e4.h != -1 || e4.f3085k) {
                            arrayList.add(e4);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i5 = 0; i5 < size; i5++) {
                            f fVar2 = (f) arrayList.get(i5);
                            if (fVar2.f3085k) {
                                bVar.h(this, fVar2, true);
                            } else {
                                bVar.i(this, this.g[fVar2.h], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z5 = true;
                    }
                }
                if (bVar.f3061a != null && bVar.f3063d.d() == 0) {
                    bVar.f3064e = true;
                    this.f3067b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f5 = bVar.f3062b;
            float f6 = 0.0f;
            if (f5 < 0.0f) {
                bVar.f3062b = f5 * (-1.0f);
                a aVar = bVar.f3063d;
                int i6 = aVar.h;
                for (int i7 = 0; i6 != -1 && i7 < aVar.f3054a; i7++) {
                    float[] fArr = aVar.g;
                    fArr[i6] = fArr[i6] * (-1.0f);
                    i6 = aVar.f3058f[i6];
                }
            }
            int d5 = bVar.f3063d.d();
            float f7 = 0.0f;
            float f8 = 0.0f;
            f fVar3 = null;
            f fVar4 = null;
            int i8 = 0;
            boolean z6 = false;
            boolean z7 = false;
            while (i8 < d5) {
                float f9 = bVar.f3063d.f(i8);
                f e5 = bVar.f3063d.e(i8);
                float f10 = f6;
                if (e5.f3091q == 1) {
                    if (fVar3 != null) {
                        if (f7 <= f9) {
                            if (!z6) {
                                if (e5.f3090p > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    fVar3 = e5;
                    f7 = f9;
                } else if (fVar3 == null && f9 < f10) {
                    if (fVar4 != null) {
                        if (f8 <= f9) {
                            if (!z7) {
                                if (e5.f3090p > 1) {
                                }
                            }
                        }
                        z7 = true;
                    }
                    fVar4 = e5;
                    f8 = f9;
                }
                i8++;
                f6 = f10;
            }
            float f11 = f6;
            if (fVar3 == null) {
                fVar3 = fVar4;
            }
            if (fVar3 == null) {
                z4 = true;
            } else {
                bVar.g(fVar3);
                z4 = false;
            }
            if (bVar.f3063d.d() == 0) {
                bVar.f3064e = true;
            }
            if (z4) {
                if (this.f3072j + 1 >= this.f3070f) {
                    o();
                }
                f a4 = a(3);
                int i9 = this.c + 1;
                this.c = i9;
                this.f3072j++;
                a4.g = i9;
                s sVar = this.f3075m;
                ((f[]) sVar.f358d)[i9] = a4;
                bVar.f3061a = a4;
                int i10 = this.f3073k;
                h(bVar);
                if (this.f3073k == i10 + 1) {
                    b bVar2 = this.f3078p;
                    bVar2.f3061a = null;
                    bVar2.f3063d.b();
                    for (int i11 = 0; i11 < bVar.f3063d.d(); i11++) {
                        bVar2.f3063d.a(bVar.f3063d.e(i11), bVar.f3063d.f(i11), true);
                    }
                    r(this.f3078p);
                    if (a4.h == -1) {
                        if (bVar.f3061a == a4 && (f4 = bVar.f(null, a4)) != null) {
                            bVar.g(f4);
                        }
                        if (!bVar.f3064e) {
                            bVar.f3061a.e(this, bVar);
                        }
                        ((j0.b) sVar.f357b).b(bVar);
                        this.f3073k--;
                    }
                    z3 = true;
                    fVar = bVar.f3061a;
                    if (fVar != null) {
                        return;
                    }
                    if (fVar.f3091q != 1 && bVar.f3062b < f11) {
                        return;
                    }
                }
            }
            z3 = false;
            fVar = bVar.f3061a;
            if (fVar != null) {
            }
        }
        if (z3) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i4) {
        int i5 = fVar.h;
        if (i5 == -1) {
            fVar.d(this, i4);
            for (int i6 = 0; i6 < this.c + 1; i6++) {
                f fVar2 = ((f[]) this.f3075m.f358d)[i6];
            }
            return;
        }
        if (i5 == -1) {
            b l4 = l();
            l4.f3061a = fVar;
            float f4 = i4;
            fVar.f3084j = f4;
            l4.f3062b = f4;
            l4.f3064e = true;
            c(l4);
            return;
        }
        b bVar = this.g[i5];
        if (bVar.f3064e) {
            bVar.f3062b = i4;
            return;
        }
        if (bVar.f3063d.d() == 0) {
            bVar.f3064e = true;
            bVar.f3062b = i4;
            return;
        }
        b l5 = l();
        if (i4 < 0) {
            l5.f3062b = i4 * (-1);
            l5.f3063d.g(fVar, 1.0f);
        } else {
            l5.f3062b = i4;
            l5.f3063d.g(fVar, -1.0f);
        }
        c(l5);
    }

    public final void e(f fVar, f fVar2, int i4, int i5) {
        if (i5 == 8 && fVar2.f3085k && fVar.h == -1) {
            fVar.d(this, fVar2.f3084j + i4);
            return;
        }
        b l4 = l();
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            l4.f3062b = i4;
        }
        if (z3) {
            l4.f3063d.g(fVar, 1.0f);
            l4.f3063d.g(fVar2, -1.0f);
        } else {
            l4.f3063d.g(fVar, -1.0f);
            l4.f3063d.g(fVar2, 1.0f);
        }
        if (i5 != 8) {
            l4.a(this, i5);
        }
        c(l4);
    }

    public final void f(f fVar, f fVar2, int i4, int i5) {
        b l4 = l();
        f m4 = m();
        m4.f3083i = 0;
        l4.b(fVar, fVar2, m4, i4);
        if (i5 != 8) {
            l4.f3063d.g(j(i5), (int) (l4.f3063d.c(m4) * (-1.0f)));
        }
        c(l4);
    }

    public final void g(f fVar, f fVar2, int i4, int i5) {
        b l4 = l();
        f m4 = m();
        m4.f3083i = 0;
        l4.c(fVar, fVar2, m4, i4);
        if (i5 != 8) {
            l4.f3063d.g(j(i5), (int) (l4.f3063d.c(m4) * (-1.0f)));
        }
        c(l4);
    }

    public final void h(b bVar) {
        int i4;
        if (bVar.f3064e) {
            bVar.f3061a.d(this, bVar.f3062b);
        } else {
            b[] bVarArr = this.g;
            int i5 = this.f3073k;
            bVarArr[i5] = bVar;
            f fVar = bVar.f3061a;
            fVar.h = i5;
            this.f3073k = i5 + 1;
            fVar.e(this, bVar);
        }
        if (this.f3067b) {
            int i6 = 0;
            while (i6 < this.f3073k) {
                if (this.g[i6] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.g[i6];
                if (bVar2 != null && bVar2.f3064e) {
                    bVar2.f3061a.d(this, bVar2.f3062b);
                    ((j0.b) this.f3075m.f357b).b(bVar2);
                    this.g[i6] = null;
                    int i7 = i6 + 1;
                    int i8 = i7;
                    while (true) {
                        i4 = this.f3073k;
                        if (i7 >= i4) {
                            break;
                        }
                        b[] bVarArr2 = this.g;
                        int i9 = i7 - 1;
                        b bVar3 = bVarArr2[i7];
                        bVarArr2[i9] = bVar3;
                        f fVar2 = bVar3.f3061a;
                        if (fVar2.h == i7) {
                            fVar2.h = i9;
                        }
                        i8 = i7;
                        i7++;
                    }
                    if (i8 < i4) {
                        this.g[i8] = null;
                    }
                    this.f3073k = i4 - 1;
                    i6--;
                }
                i6++;
            }
            this.f3067b = false;
        }
    }

    public final void i() {
        for (int i4 = 0; i4 < this.f3073k; i4++) {
            b bVar = this.g[i4];
            bVar.f3061a.f3084j = bVar.f3062b;
        }
    }

    public final f j(int i4) {
        if (this.f3072j + 1 >= this.f3070f) {
            o();
        }
        f a4 = a(4);
        float[] fArr = a4.f3087m;
        int i5 = this.c + 1;
        this.c = i5;
        this.f3072j++;
        a4.g = i5;
        a4.f3083i = i4;
        ((f[]) this.f3075m.f358d)[i5] = a4;
        d dVar = this.f3068d;
        dVar.f3080i.g = a4;
        Arrays.fill(fArr, 0.0f);
        fArr[a4.f3083i] = 1.0f;
        dVar.j(a4);
        return a4;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f3072j + 1 >= this.f3070f) {
            o();
        }
        if (!(obj instanceof s.c)) {
            return null;
        }
        s.c cVar = (s.c) obj;
        f fVar = cVar.f3232i;
        if (fVar == null) {
            cVar.k();
            fVar = cVar.f3232i;
        }
        int i4 = fVar.g;
        s sVar = this.f3075m;
        if (i4 != -1 && i4 <= this.c && ((f[]) sVar.f358d)[i4] != null) {
            return fVar;
        }
        if (i4 != -1) {
            fVar.c();
        }
        int i5 = this.c + 1;
        this.c = i5;
        this.f3072j++;
        fVar.g = i5;
        fVar.f3091q = 1;
        ((f[]) sVar.f358d)[i5] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        s sVar = this.f3075m;
        j0.b bVar = (j0.b) sVar.f357b;
        int i4 = bVar.f2254b;
        if (i4 > 0) {
            int i5 = i4 - 1;
            Object[] objArr = bVar.f2253a;
            obj = objArr[i5];
            objArr[i5] = null;
            bVar.f2254b = i5;
        } else {
            obj = null;
        }
        b bVar2 = (b) obj;
        if (bVar2 == null) {
            return new b(sVar);
        }
        bVar2.f3061a = null;
        bVar2.f3063d.b();
        bVar2.f3062b = 0.0f;
        bVar2.f3064e = false;
        return bVar2;
    }

    public final f m() {
        if (this.f3072j + 1 >= this.f3070f) {
            o();
        }
        f a4 = a(3);
        int i4 = this.c + 1;
        this.c = i4;
        this.f3072j++;
        a4.g = i4;
        ((f[]) this.f3075m.f358d)[i4] = a4;
        return a4;
    }

    public final void o() {
        int i4 = this.f3069e * 2;
        this.f3069e = i4;
        this.g = (b[]) Arrays.copyOf(this.g, i4);
        s sVar = this.f3075m;
        sVar.f358d = (f[]) Arrays.copyOf((f[]) sVar.f358d, this.f3069e);
        int i5 = this.f3069e;
        this.f3071i = new boolean[i5];
        this.f3070f = i5;
        this.f3074l = i5;
    }

    public final void p() {
        d dVar = this.f3068d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(dVar);
            return;
        }
        for (int i4 = 0; i4 < this.f3073k; i4++) {
            if (!this.g[i4].f3064e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        int i4 = 0;
        while (true) {
            if (i4 >= this.f3073k) {
                break;
            }
            b bVar = this.g[i4];
            int i5 = 1;
            if (bVar.f3061a.f3091q != 1) {
                float f4 = 0.0f;
                if (bVar.f3062b < 0.0f) {
                    boolean z3 = false;
                    int i6 = 0;
                    while (!z3) {
                        i6 += i5;
                        float f5 = Float.MAX_VALUE;
                        int i7 = -1;
                        int i8 = -1;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < this.f3073k) {
                            b bVar2 = this.g[i9];
                            if (bVar2.f3061a.f3091q != i5 && !bVar2.f3064e && bVar2.f3062b < f4) {
                                int d4 = bVar2.f3063d.d();
                                int i11 = 0;
                                while (i11 < d4) {
                                    f e4 = bVar2.f3063d.e(i11);
                                    float c = bVar2.f3063d.c(e4);
                                    if (c > f4) {
                                        for (int i12 = 0; i12 < 9; i12++) {
                                            float f6 = e4.f3086l[i12] / c;
                                            if ((f6 < f5 && i12 == i10) || i12 > i10) {
                                                i10 = i12;
                                                i8 = e4.g;
                                                i7 = i9;
                                                f5 = f6;
                                            }
                                        }
                                    }
                                    i11++;
                                    f4 = 0.0f;
                                }
                            }
                            i9++;
                            f4 = 0.0f;
                            i5 = 1;
                        }
                        if (i7 != -1) {
                            b bVar3 = this.g[i7];
                            bVar3.f3061a.h = -1;
                            bVar3.g(((f[]) this.f3075m.f358d)[i8]);
                            f fVar = bVar3.f3061a;
                            fVar.h = i7;
                            fVar.e(this, bVar3);
                        } else {
                            z3 = true;
                        }
                        if (i6 > this.f3072j / 2) {
                            z3 = true;
                        }
                        f4 = 0.0f;
                        i5 = 1;
                    }
                }
            }
            i4++;
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f3072j; i5++) {
            this.f3071i[i5] = false;
        }
        boolean z4 = false;
        int i6 = 0;
        while (!z4) {
            int i7 = 1;
            i6++;
            if (i6 >= this.f3072j * 2) {
                return;
            }
            f fVar = bVar.f3061a;
            if (fVar != null) {
                this.f3071i[fVar.g] = true;
            }
            f d4 = bVar.d(this.f3071i);
            if (d4 != null) {
                boolean[] zArr = this.f3071i;
                int i8 = d4.g;
                if (zArr[i8]) {
                    return;
                } else {
                    zArr[i8] = true;
                }
            }
            if (d4 != null) {
                float f4 = Float.MAX_VALUE;
                int i9 = i4;
                int i10 = -1;
                while (i9 < this.f3073k) {
                    b bVar2 = this.g[i9];
                    if (bVar2.f3061a.f3091q != i7 && !bVar2.f3064e) {
                        a aVar = bVar2.f3063d;
                        int i11 = aVar.h;
                        if (i11 != -1) {
                            for (int i12 = 0; i11 != -1 && i12 < aVar.f3054a; i12++) {
                                if (aVar.f3057e[i11] == d4.g) {
                                    z3 = true;
                                    break;
                                }
                                i11 = aVar.f3058f[i11];
                            }
                        }
                        z3 = false;
                        if (z3) {
                            float c = bVar2.f3063d.c(d4);
                            if (c < 0.0f) {
                                float f5 = (-bVar2.f3062b) / c;
                                if (f5 < f4) {
                                    f4 = f5;
                                    i10 = i9;
                                }
                            }
                        }
                    }
                    i9++;
                    i7 = 1;
                }
                if (i10 > -1) {
                    b bVar3 = this.g[i10];
                    bVar3.f3061a.h = -1;
                    bVar3.g(d4);
                    f fVar2 = bVar3.f3061a;
                    fVar2.h = i10;
                    fVar2.e(this, bVar3);
                }
            } else {
                z4 = true;
            }
            i4 = 0;
        }
    }

    public final void s() {
        for (int i4 = 0; i4 < this.f3073k; i4++) {
            b bVar = this.g[i4];
            if (bVar != null) {
                ((j0.b) this.f3075m.f357b).b(bVar);
            }
            this.g[i4] = null;
        }
    }

    public final void t() {
        s sVar;
        int i4 = 0;
        while (true) {
            sVar = this.f3075m;
            f[] fVarArr = (f[]) sVar.f358d;
            if (i4 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i4];
            if (fVar != null) {
                fVar.c();
            }
            i4++;
        }
        j0.b bVar = (j0.b) sVar.c;
        f[] fVarArr2 = this.f3076n;
        int i5 = this.f3077o;
        bVar.getClass();
        if (i5 > fVarArr2.length) {
            i5 = fVarArr2.length;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            f fVar2 = fVarArr2[i6];
            int i7 = bVar.f2254b;
            Object[] objArr = bVar.f2253a;
            if (i7 < objArr.length) {
                objArr[i7] = fVar2;
                bVar.f2254b = i7 + 1;
            }
        }
        this.f3077o = 0;
        Arrays.fill((f[]) sVar.f358d, (Object) null);
        this.c = 0;
        d dVar = this.f3068d;
        dVar.h = 0;
        dVar.f3062b = 0.0f;
        this.f3072j = 1;
        for (int i8 = 0; i8 < this.f3073k; i8++) {
            b bVar2 = this.g[i8];
        }
        s();
        this.f3073k = 0;
        this.f3078p = new b(sVar);
    }
}
