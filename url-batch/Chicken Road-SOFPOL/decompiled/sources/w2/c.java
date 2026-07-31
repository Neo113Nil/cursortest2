package w2;

import a0.a0;
import a0.g1;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f7845q = false;

    /* renamed from: d, reason: collision with root package name */
    public final d f7849d;

    /* renamed from: m, reason: collision with root package name */
    public final g1 f7857m;

    /* renamed from: p, reason: collision with root package name */
    public b f7860p;

    /* renamed from: a, reason: collision with root package name */
    public int f7846a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7847b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f7848c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f7850e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f7851f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7853h = false;
    public boolean[] i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f7854j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f7855k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f7856l = 32;

    /* renamed from: n, reason: collision with root package name */
    public f[] f7858n = new f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f7859o = 0;

    /* renamed from: g, reason: collision with root package name */
    public b[] f7852g = new b[32];

    public c() {
        s();
        g1 g1Var = new g1(13);
        g1Var.f84b = new p3.b();
        g1Var.f85c = new p3.b();
        g1Var.f86d = new f[32];
        this.f7857m = g1Var;
        d dVar = new d(g1Var);
        dVar.f7861f = new f[128];
        dVar.f7862g = new f[128];
        dVar.f7863h = 0;
        dVar.i = new a0(24, dVar);
        this.f7849d = dVar;
        this.f7860p = new b(g1Var);
    }

    public static int n(Object obj) {
        f fVar = ((y2.c) obj).i;
        if (fVar != null) {
            return (int) (fVar.f7869h + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i) {
        p3.b bVar = (p3.b) this.f7857m.f85c;
        int i8 = bVar.f5737b;
        f fVar = null;
        if (i8 > 0) {
            int i9 = i8 - 1;
            ?? r32 = bVar.f5736a;
            ?? r42 = r32[i9];
            r32[i9] = 0;
            bVar.f5737b = i9;
            fVar = r42;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i);
            fVar2.f7875o = i;
        } else {
            fVar2.c();
            fVar2.f7875o = i;
        }
        int i10 = this.f7859o;
        int i11 = this.f7846a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f7846a = i12;
            this.f7858n = (f[]) Arrays.copyOf(this.f7858n, i12);
        }
        f[] fVarArr = this.f7858n;
        int i13 = this.f7859o;
        this.f7859o = i13 + 1;
        fVarArr[i13] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i, float f6, f fVar3, f fVar4, int i8, int i9) {
        b l3 = l();
        if (fVar2 == fVar3) {
            l3.f7843d.g(fVar, 1.0f);
            l3.f7843d.g(fVar4, 1.0f);
            l3.f7843d.g(fVar2, -2.0f);
        } else if (f6 == 0.5f) {
            l3.f7843d.g(fVar, 1.0f);
            l3.f7843d.g(fVar2, -1.0f);
            l3.f7843d.g(fVar3, -1.0f);
            l3.f7843d.g(fVar4, 1.0f);
            if (i > 0 || i8 > 0) {
                l3.f7841b = (-i) + i8;
            }
        } else if (f6 <= 0.0f) {
            l3.f7843d.g(fVar, -1.0f);
            l3.f7843d.g(fVar2, 1.0f);
            l3.f7841b = i;
        } else if (f6 >= 1.0f) {
            l3.f7843d.g(fVar4, -1.0f);
            l3.f7843d.g(fVar3, 1.0f);
            l3.f7841b = -i8;
        } else {
            float f8 = 1.0f - f6;
            l3.f7843d.g(fVar, f8 * 1.0f);
            l3.f7843d.g(fVar2, f8 * (-1.0f));
            l3.f7843d.g(fVar3, (-1.0f) * f6);
            l3.f7843d.g(fVar4, 1.0f * f6);
            if (i > 0 || i8 > 0) {
                l3.f7841b = (i8 * f6) + ((-i) * f8);
            }
        }
        if (i9 != 8) {
            l3.a(this, i9);
        }
        c(l3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        if (r4.f7874n <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        if (r4.f7874n <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        if (r4.f7874n <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
    
        if (r4.f7874n <= 1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(b bVar) {
        boolean z3;
        boolean z7;
        f fVar;
        f f6;
        if (this.f7855k + 1 >= this.f7856l || this.f7854j + 1 >= this.f7851f) {
            o();
        }
        if (bVar.f7844e) {
            z3 = false;
        } else {
            ArrayList arrayList = bVar.f7842c;
            if (this.f7852g.length != 0) {
                boolean z8 = false;
                while (!z8) {
                    int d8 = bVar.f7843d.d();
                    for (int i = 0; i < d8; i++) {
                        f e8 = bVar.f7843d.e(i);
                        if (e8.f7867f != -1 || e8.i) {
                            arrayList.add(e8);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i8 = 0; i8 < size; i8++) {
                            f fVar2 = (f) arrayList.get(i8);
                            if (fVar2.i) {
                                bVar.h(this, fVar2, true);
                            } else {
                                bVar.i(this, this.f7852g[fVar2.f7867f], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z8 = true;
                    }
                }
                if (bVar.f7840a != null && bVar.f7843d.d() == 0) {
                    bVar.f7844e = true;
                    this.f7847b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f8 = bVar.f7841b;
            float f9 = 0.0f;
            if (f8 < 0.0f) {
                bVar.f7841b = f8 * (-1.0f);
                a aVar = bVar.f7843d;
                int i9 = aVar.f7838h;
                for (int i10 = 0; i9 != -1 && i10 < aVar.f7831a; i10++) {
                    float[] fArr = aVar.f7837g;
                    fArr[i9] = fArr[i9] * (-1.0f);
                    i9 = aVar.f7836f[i9];
                }
            }
            int d9 = bVar.f7843d.d();
            float f10 = 0.0f;
            float f11 = 0.0f;
            f fVar3 = null;
            f fVar4 = null;
            int i11 = 0;
            boolean z9 = false;
            boolean z10 = false;
            while (i11 < d9) {
                float f12 = bVar.f7843d.f(i11);
                f e9 = bVar.f7843d.e(i11);
                float f13 = f9;
                if (e9.f7875o == 1) {
                    if (fVar3 != null) {
                        if (f10 <= f12) {
                            if (!z9) {
                                if (e9.f7874n > 1) {
                                }
                            }
                        }
                        z9 = true;
                    }
                    fVar3 = e9;
                    f10 = f12;
                } else if (fVar3 == null && f12 < f13) {
                    if (fVar4 != null) {
                        if (f11 <= f12) {
                            if (!z10) {
                                if (e9.f7874n > 1) {
                                }
                            }
                        }
                        z10 = true;
                    }
                    fVar4 = e9;
                    f11 = f12;
                }
                i11++;
                f9 = f13;
            }
            float f14 = f9;
            if (fVar3 == null) {
                fVar3 = fVar4;
            }
            if (fVar3 == null) {
                z7 = true;
            } else {
                bVar.g(fVar3);
                z7 = false;
            }
            if (bVar.f7843d.d() == 0) {
                bVar.f7844e = true;
            }
            if (z7) {
                if (this.f7854j + 1 >= this.f7851f) {
                    o();
                }
                f a8 = a(3);
                int i12 = this.f7848c + 1;
                this.f7848c = i12;
                this.f7854j++;
                a8.f7866e = i12;
                g1 g1Var = this.f7857m;
                ((f[]) g1Var.f86d)[i12] = a8;
                bVar.f7840a = a8;
                int i13 = this.f7855k;
                h(bVar);
                if (this.f7855k == i13 + 1) {
                    b bVar2 = this.f7860p;
                    bVar2.f7840a = null;
                    bVar2.f7843d.b();
                    for (int i14 = 0; i14 < bVar.f7843d.d(); i14++) {
                        bVar2.f7843d.a(bVar.f7843d.e(i14), bVar.f7843d.f(i14), true);
                    }
                    r(this.f7860p);
                    if (a8.f7867f == -1) {
                        if (bVar.f7840a == a8 && (f6 = bVar.f(null, a8)) != null) {
                            bVar.g(f6);
                        }
                        if (!bVar.f7844e) {
                            bVar.f7840a.e(this, bVar);
                        }
                        ((p3.b) g1Var.f84b).b(bVar);
                        this.f7855k--;
                    }
                    z3 = true;
                    fVar = bVar.f7840a;
                    if (fVar != null) {
                        return;
                    }
                    if (fVar.f7875o != 1 && bVar.f7841b < f14) {
                        return;
                    }
                }
            }
            z3 = false;
            fVar = bVar.f7840a;
            if (fVar != null) {
            }
        }
        if (z3) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i) {
        int i8 = fVar.f7867f;
        if (i8 == -1) {
            fVar.d(this, i);
            for (int i9 = 0; i9 < this.f7848c + 1; i9++) {
                f fVar2 = ((f[]) this.f7857m.f86d)[i9];
            }
            return;
        }
        if (i8 == -1) {
            b l3 = l();
            l3.f7840a = fVar;
            float f6 = i;
            fVar.f7869h = f6;
            l3.f7841b = f6;
            l3.f7844e = true;
            c(l3);
            return;
        }
        b bVar = this.f7852g[i8];
        if (bVar.f7844e) {
            bVar.f7841b = i;
            return;
        }
        if (bVar.f7843d.d() == 0) {
            bVar.f7844e = true;
            bVar.f7841b = i;
            return;
        }
        b l7 = l();
        if (i < 0) {
            l7.f7841b = i * (-1);
            l7.f7843d.g(fVar, 1.0f);
        } else {
            l7.f7841b = i;
            l7.f7843d.g(fVar, -1.0f);
        }
        c(l7);
    }

    public final void e(f fVar, f fVar2, int i, int i8) {
        if (i8 == 8 && fVar2.i && fVar.f7867f == -1) {
            fVar.d(this, fVar2.f7869h + i);
            return;
        }
        b l3 = l();
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            l3.f7841b = i;
        }
        if (z3) {
            l3.f7843d.g(fVar, 1.0f);
            l3.f7843d.g(fVar2, -1.0f);
        } else {
            l3.f7843d.g(fVar, -1.0f);
            l3.f7843d.g(fVar2, 1.0f);
        }
        if (i8 != 8) {
            l3.a(this, i8);
        }
        c(l3);
    }

    public final void f(f fVar, f fVar2, int i, int i8) {
        b l3 = l();
        f m7 = m();
        m7.f7868g = 0;
        l3.b(fVar, fVar2, m7, i);
        if (i8 != 8) {
            l3.f7843d.g(j(i8), (int) (l3.f7843d.c(m7) * (-1.0f)));
        }
        c(l3);
    }

    public final void g(f fVar, f fVar2, int i, int i8) {
        b l3 = l();
        f m7 = m();
        m7.f7868g = 0;
        l3.c(fVar, fVar2, m7, i);
        if (i8 != 8) {
            l3.f7843d.g(j(i8), (int) (l3.f7843d.c(m7) * (-1.0f)));
        }
        c(l3);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.f7844e) {
            bVar.f7840a.d(this, bVar.f7841b);
        } else {
            b[] bVarArr = this.f7852g;
            int i8 = this.f7855k;
            bVarArr[i8] = bVar;
            f fVar = bVar.f7840a;
            fVar.f7867f = i8;
            this.f7855k = i8 + 1;
            fVar.e(this, bVar);
        }
        if (this.f7847b) {
            int i9 = 0;
            while (i9 < this.f7855k) {
                if (this.f7852g[i9] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f7852g[i9];
                if (bVar2 != null && bVar2.f7844e) {
                    bVar2.f7840a.d(this, bVar2.f7841b);
                    ((p3.b) this.f7857m.f84b).b(bVar2);
                    this.f7852g[i9] = null;
                    int i10 = i9 + 1;
                    int i11 = i10;
                    while (true) {
                        i = this.f7855k;
                        if (i10 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f7852g;
                        int i12 = i10 - 1;
                        b bVar3 = bVarArr2[i10];
                        bVarArr2[i12] = bVar3;
                        f fVar2 = bVar3.f7840a;
                        if (fVar2.f7867f == i10) {
                            fVar2.f7867f = i12;
                        }
                        i11 = i10;
                        i10++;
                    }
                    if (i11 < i) {
                        this.f7852g[i11] = null;
                    }
                    this.f7855k = i - 1;
                    i9--;
                }
                i9++;
            }
            this.f7847b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f7855k; i++) {
            b bVar = this.f7852g[i];
            bVar.f7840a.f7869h = bVar.f7841b;
        }
    }

    public final f j(int i) {
        if (this.f7854j + 1 >= this.f7851f) {
            o();
        }
        f a8 = a(4);
        float[] fArr = a8.f7871k;
        int i8 = this.f7848c + 1;
        this.f7848c = i8;
        this.f7854j++;
        a8.f7866e = i8;
        a8.f7868g = i;
        ((f[]) this.f7857m.f86d)[i8] = a8;
        d dVar = this.f7849d;
        dVar.i.f11e = a8;
        Arrays.fill(fArr, 0.0f);
        fArr[a8.f7868g] = 1.0f;
        dVar.j(a8);
        return a8;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f7854j + 1 >= this.f7851f) {
            o();
        }
        if (!(obj instanceof y2.c)) {
            return null;
        }
        y2.c cVar = (y2.c) obj;
        f fVar = cVar.i;
        if (fVar == null) {
            cVar.k();
            fVar = cVar.i;
        }
        int i = fVar.f7866e;
        g1 g1Var = this.f7857m;
        if (i != -1 && i <= this.f7848c && ((f[]) g1Var.f86d)[i] != null) {
            return fVar;
        }
        if (i != -1) {
            fVar.c();
        }
        int i8 = this.f7848c + 1;
        this.f7848c = i8;
        this.f7854j++;
        fVar.f7866e = i8;
        fVar.f7875o = 1;
        ((f[]) g1Var.f86d)[i8] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        g1 g1Var = this.f7857m;
        p3.b bVar = (p3.b) g1Var.f84b;
        int i = bVar.f5737b;
        if (i > 0) {
            int i8 = i - 1;
            Object[] objArr = bVar.f5736a;
            obj = objArr[i8];
            objArr[i8] = null;
            bVar.f5737b = i8;
        } else {
            obj = null;
        }
        b bVar2 = (b) obj;
        if (bVar2 == null) {
            return new b(g1Var);
        }
        bVar2.f7840a = null;
        bVar2.f7843d.b();
        bVar2.f7841b = 0.0f;
        bVar2.f7844e = false;
        return bVar2;
    }

    public final f m() {
        if (this.f7854j + 1 >= this.f7851f) {
            o();
        }
        f a8 = a(3);
        int i = this.f7848c + 1;
        this.f7848c = i;
        this.f7854j++;
        a8.f7866e = i;
        ((f[]) this.f7857m.f86d)[i] = a8;
        return a8;
    }

    public final void o() {
        int i = this.f7850e * 2;
        this.f7850e = i;
        this.f7852g = (b[]) Arrays.copyOf(this.f7852g, i);
        g1 g1Var = this.f7857m;
        g1Var.f86d = (f[]) Arrays.copyOf((f[]) g1Var.f86d, this.f7850e);
        int i8 = this.f7850e;
        this.i = new boolean[i8];
        this.f7851f = i8;
        this.f7856l = i8;
    }

    public final void p() {
        d dVar = this.f7849d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f7853h) {
            q(dVar);
            return;
        }
        for (int i = 0; i < this.f7855k; i++) {
            if (!this.f7852g[i].f7844e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        int i = 0;
        while (true) {
            if (i >= this.f7855k) {
                break;
            }
            b bVar = this.f7852g[i];
            int i8 = 1;
            if (bVar.f7840a.f7875o != 1) {
                float f6 = 0.0f;
                if (bVar.f7841b < 0.0f) {
                    boolean z3 = false;
                    int i9 = 0;
                    while (!z3) {
                        i9 += i8;
                        float f8 = Float.MAX_VALUE;
                        int i10 = -1;
                        int i11 = -1;
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < this.f7855k) {
                            b bVar2 = this.f7852g[i12];
                            if (bVar2.f7840a.f7875o != i8 && !bVar2.f7844e && bVar2.f7841b < f6) {
                                int d8 = bVar2.f7843d.d();
                                int i14 = 0;
                                while (i14 < d8) {
                                    f e8 = bVar2.f7843d.e(i14);
                                    float c8 = bVar2.f7843d.c(e8);
                                    if (c8 > f6) {
                                        for (int i15 = 0; i15 < 9; i15++) {
                                            float f9 = e8.f7870j[i15] / c8;
                                            if ((f9 < f8 && i15 == i13) || i15 > i13) {
                                                i13 = i15;
                                                i11 = e8.f7866e;
                                                i10 = i12;
                                                f8 = f9;
                                            }
                                        }
                                    }
                                    i14++;
                                    f6 = 0.0f;
                                }
                            }
                            i12++;
                            f6 = 0.0f;
                            i8 = 1;
                        }
                        if (i10 != -1) {
                            b bVar3 = this.f7852g[i10];
                            bVar3.f7840a.f7867f = -1;
                            bVar3.g(((f[]) this.f7857m.f86d)[i11]);
                            f fVar = bVar3.f7840a;
                            fVar.f7867f = i10;
                            fVar.e(this, bVar3);
                        } else {
                            z3 = true;
                        }
                        if (i9 > this.f7854j / 2) {
                            z3 = true;
                        }
                        f6 = 0.0f;
                        i8 = 1;
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
        for (int i8 = 0; i8 < this.f7854j; i8++) {
            this.i[i8] = false;
        }
        boolean z7 = false;
        int i9 = 0;
        while (!z7) {
            int i10 = 1;
            i9++;
            if (i9 >= this.f7854j * 2) {
                return;
            }
            f fVar = bVar.f7840a;
            if (fVar != null) {
                this.i[fVar.f7866e] = true;
            }
            f d8 = bVar.d(this.i);
            if (d8 != null) {
                boolean[] zArr = this.i;
                int i11 = d8.f7866e;
                if (zArr[i11]) {
                    return;
                } else {
                    zArr[i11] = true;
                }
            }
            if (d8 != null) {
                float f6 = Float.MAX_VALUE;
                int i12 = i;
                int i13 = -1;
                while (i12 < this.f7855k) {
                    b bVar2 = this.f7852g[i12];
                    if (bVar2.f7840a.f7875o != i10 && !bVar2.f7844e) {
                        a aVar = bVar2.f7843d;
                        int i14 = aVar.f7838h;
                        if (i14 != -1) {
                            for (int i15 = 0; i14 != -1 && i15 < aVar.f7831a; i15++) {
                                if (aVar.f7835e[i14] == d8.f7866e) {
                                    z3 = true;
                                    break;
                                }
                                i14 = aVar.f7836f[i14];
                            }
                        }
                        z3 = false;
                        if (z3) {
                            float c8 = bVar2.f7843d.c(d8);
                            if (c8 < 0.0f) {
                                float f8 = (-bVar2.f7841b) / c8;
                                if (f8 < f6) {
                                    f6 = f8;
                                    i13 = i12;
                                }
                            }
                        }
                    }
                    i12++;
                    i10 = 1;
                }
                if (i13 > -1) {
                    b bVar3 = this.f7852g[i13];
                    bVar3.f7840a.f7867f = -1;
                    bVar3.g(d8);
                    f fVar2 = bVar3.f7840a;
                    fVar2.f7867f = i13;
                    fVar2.e(this, bVar3);
                }
            } else {
                z7 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f7855k; i++) {
            b bVar = this.f7852g[i];
            if (bVar != null) {
                ((p3.b) this.f7857m.f84b).b(bVar);
            }
            this.f7852g[i] = null;
        }
    }

    public final void t() {
        g1 g1Var;
        int i = 0;
        while (true) {
            g1Var = this.f7857m;
            f[] fVarArr = (f[]) g1Var.f86d;
            if (i >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i];
            if (fVar != null) {
                fVar.c();
            }
            i++;
        }
        p3.b bVar = (p3.b) g1Var.f85c;
        f[] fVarArr2 = this.f7858n;
        int i8 = this.f7859o;
        bVar.getClass();
        if (i8 > fVarArr2.length) {
            i8 = fVarArr2.length;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            f fVar2 = fVarArr2[i9];
            int i10 = bVar.f5737b;
            Object[] objArr = bVar.f5736a;
            if (i10 < objArr.length) {
                objArr[i10] = fVar2;
                bVar.f5737b = i10 + 1;
            }
        }
        this.f7859o = 0;
        Arrays.fill((f[]) g1Var.f86d, (Object) null);
        this.f7848c = 0;
        d dVar = this.f7849d;
        dVar.f7863h = 0;
        dVar.f7841b = 0.0f;
        this.f7854j = 1;
        for (int i11 = 0; i11 < this.f7855k; i11++) {
            b bVar2 = this.f7852g[i11];
        }
        s();
        this.f7855k = 0;
        this.f7860p = new b(g1Var);
    }
}
