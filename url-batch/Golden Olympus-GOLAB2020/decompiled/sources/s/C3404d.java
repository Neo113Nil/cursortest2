package s;

import java.util.Arrays;
import java.util.HashMap;
import s.i;
import t.C3422d;
import t.C3423e;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3404d {

    /* renamed from: q, reason: collision with root package name */
    private static int f45885q = 1000;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f45886r = true;

    /* renamed from: s, reason: collision with root package name */
    public static long f45887s;

    /* renamed from: t, reason: collision with root package name */
    public static long f45888t;

    /* renamed from: c, reason: collision with root package name */
    private a f45891c;

    /* renamed from: f, reason: collision with root package name */
    C3402b[] f45894f;

    /* renamed from: m, reason: collision with root package name */
    final C3403c f45901m;

    /* renamed from: p, reason: collision with root package name */
    private a f45904p;

    /* renamed from: a, reason: collision with root package name */
    int f45889a = 0;

    /* renamed from: b, reason: collision with root package name */
    private HashMap f45890b = null;

    /* renamed from: d, reason: collision with root package name */
    private int f45892d = 32;

    /* renamed from: e, reason: collision with root package name */
    private int f45893e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45895g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45896h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean[] f45897i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    int f45898j = 1;

    /* renamed from: k, reason: collision with root package name */
    int f45899k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f45900l = 32;

    /* renamed from: n, reason: collision with root package name */
    private i[] f45902n = new i[f45885q];

    /* renamed from: o, reason: collision with root package name */
    private int f45903o = 0;

    /* renamed from: s.d$a */
    interface a {
        void a(i iVar);

        i b(C3404d c3404d, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();
    }

    /* renamed from: s.d$b */
    class b extends C3402b {
        public b(C3403c c3403c) {
            this.f45879e = new j(this, c3403c);
        }
    }

    public C3404d() {
        this.f45894f = null;
        this.f45894f = new C3402b[32];
        D();
        C3403c c3403c = new C3403c();
        this.f45901m = c3403c;
        this.f45891c = new h(c3403c);
        if (f45886r) {
            this.f45904p = new b(c3403c);
        } else {
            this.f45904p = new C3402b(c3403c);
        }
    }

    private final int C(a aVar, boolean z4) {
        for (int i4 = 0; i4 < this.f45898j; i4++) {
            this.f45897i[i4] = false;
        }
        boolean z5 = false;
        int i5 = 0;
        while (!z5) {
            i5++;
            if (i5 < this.f45898j * 2) {
                if (aVar.getKey() != null) {
                    this.f45897i[aVar.getKey().f45921c] = true;
                }
                i b4 = aVar.b(this, this.f45897i);
                if (b4 != null) {
                    boolean[] zArr = this.f45897i;
                    int i6 = b4.f45921c;
                    if (!zArr[i6]) {
                        zArr[i6] = true;
                    }
                }
                if (b4 != null) {
                    float f4 = Float.MAX_VALUE;
                    int i7 = -1;
                    for (int i8 = 0; i8 < this.f45899k; i8++) {
                        C3402b c3402b = this.f45894f[i8];
                        if (c3402b.f45875a.f45928j != i.a.UNRESTRICTED && !c3402b.f45880f && c3402b.t(b4)) {
                            float f5 = c3402b.f45879e.f(b4);
                            if (f5 < 0.0f) {
                                float f6 = (-c3402b.f45876b) / f5;
                                if (f6 < f4) {
                                    i7 = i8;
                                    f4 = f6;
                                }
                            }
                        }
                    }
                    if (i7 > -1) {
                        C3402b c3402b2 = this.f45894f[i7];
                        c3402b2.f45875a.f45922d = -1;
                        c3402b2.y(b4);
                        i iVar = c3402b2.f45875a;
                        iVar.f45922d = i7;
                        iVar.g(c3402b2);
                    }
                } else {
                    z5 = true;
                }
            }
            return i5;
        }
        return i5;
    }

    private void D() {
        int i4 = 0;
        if (f45886r) {
            while (true) {
                C3402b[] c3402bArr = this.f45894f;
                if (i4 >= c3402bArr.length) {
                    return;
                }
                C3402b c3402b = c3402bArr[i4];
                if (c3402b != null) {
                    this.f45901m.f45881a.a(c3402b);
                }
                this.f45894f[i4] = null;
                i4++;
            }
        } else {
            while (true) {
                C3402b[] c3402bArr2 = this.f45894f;
                if (i4 >= c3402bArr2.length) {
                    return;
                }
                C3402b c3402b2 = c3402bArr2[i4];
                if (c3402b2 != null) {
                    this.f45901m.f45882b.a(c3402b2);
                }
                this.f45894f[i4] = null;
                i4++;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f45901m.f45883c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.f(aVar, str);
        } else {
            iVar.d();
            iVar.f(aVar, str);
        }
        int i4 = this.f45903o;
        int i5 = f45885q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f45885q = i6;
            this.f45902n = (i[]) Arrays.copyOf(this.f45902n, i6);
        }
        i[] iVarArr = this.f45902n;
        int i7 = this.f45903o;
        this.f45903o = i7 + 1;
        iVarArr[i7] = iVar;
        return iVar;
    }

    private final void l(C3402b c3402b) {
        if (f45886r) {
            C3402b c3402b2 = this.f45894f[this.f45899k];
            if (c3402b2 != null) {
                this.f45901m.f45881a.a(c3402b2);
            }
        } else {
            C3402b c3402b3 = this.f45894f[this.f45899k];
            if (c3402b3 != null) {
                this.f45901m.f45882b.a(c3402b3);
            }
        }
        C3402b[] c3402bArr = this.f45894f;
        int i4 = this.f45899k;
        c3402bArr[i4] = c3402b;
        i iVar = c3402b.f45875a;
        iVar.f45922d = i4;
        this.f45899k = i4 + 1;
        iVar.g(c3402b);
    }

    private void n() {
        for (int i4 = 0; i4 < this.f45899k; i4++) {
            C3402b c3402b = this.f45894f[i4];
            c3402b.f45875a.f45924f = c3402b.f45876b;
        }
    }

    public static C3402b s(C3404d c3404d, i iVar, i iVar2, float f4) {
        return c3404d.r().j(iVar, iVar2, f4);
    }

    private int u(a aVar) {
        for (int i4 = 0; i4 < this.f45899k; i4++) {
            C3402b c3402b = this.f45894f[i4];
            if (c3402b.f45875a.f45928j != i.a.UNRESTRICTED && c3402b.f45876b < 0.0f) {
                boolean z4 = false;
                int i5 = 0;
                while (!z4) {
                    i5++;
                    float f4 = Float.MAX_VALUE;
                    int i6 = -1;
                    int i7 = -1;
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (i8 >= this.f45899k) {
                            break;
                        }
                        C3402b c3402b2 = this.f45894f[i8];
                        if (c3402b2.f45875a.f45928j != i.a.UNRESTRICTED && !c3402b2.f45880f && c3402b2.f45876b < 0.0f) {
                            for (int i10 = 1; i10 < this.f45898j; i10++) {
                                i iVar = this.f45901m.f45884d[i10];
                                float f5 = c3402b2.f45879e.f(iVar);
                                if (f5 > 0.0f) {
                                    for (int i11 = 0; i11 < 9; i11++) {
                                        float f6 = iVar.f45926h[i11] / f5;
                                        if ((f6 < f4 && i11 == i9) || i11 > i9) {
                                            f4 = f6;
                                            i6 = i8;
                                            i7 = i10;
                                            i9 = i11;
                                        }
                                    }
                                }
                            }
                        }
                        i8++;
                    }
                    if (i6 != -1) {
                        C3402b c3402b3 = this.f45894f[i6];
                        c3402b3.f45875a.f45922d = -1;
                        c3402b3.y(this.f45901m.f45884d[i7]);
                        i iVar2 = c3402b3.f45875a;
                        iVar2.f45922d = i6;
                        iVar2.g(c3402b3);
                    } else {
                        z4 = true;
                    }
                    if (i5 > this.f45898j / 2) {
                        z4 = true;
                    }
                }
                return i5;
            }
        }
        return 0;
    }

    public static AbstractC3405e x() {
        return null;
    }

    private void z() {
        int i4 = this.f45892d * 2;
        this.f45892d = i4;
        this.f45894f = (C3402b[]) Arrays.copyOf(this.f45894f, i4);
        C3403c c3403c = this.f45901m;
        c3403c.f45884d = (i[]) Arrays.copyOf(c3403c.f45884d, this.f45892d);
        int i5 = this.f45892d;
        this.f45897i = new boolean[i5];
        this.f45893e = i5;
        this.f45900l = i5;
    }

    public void A() {
        if (!this.f45895g && !this.f45896h) {
            B(this.f45891c);
            return;
        }
        for (int i4 = 0; i4 < this.f45899k; i4++) {
            if (!this.f45894f[i4].f45880f) {
                B(this.f45891c);
                return;
            }
        }
        n();
    }

    void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        C3403c c3403c;
        int i4 = 0;
        while (true) {
            c3403c = this.f45901m;
            i[] iVarArr = c3403c.f45884d;
            if (i4 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i4];
            if (iVar != null) {
                iVar.d();
            }
            i4++;
        }
        c3403c.f45883c.c(this.f45902n, this.f45903o);
        this.f45903o = 0;
        Arrays.fill(this.f45901m.f45884d, (Object) null);
        HashMap hashMap = this.f45890b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f45889a = 0;
        this.f45891c.clear();
        this.f45898j = 1;
        for (int i5 = 0; i5 < this.f45899k; i5++) {
            this.f45894f[i5].f45877c = false;
        }
        D();
        this.f45899k = 0;
        if (f45886r) {
            this.f45904p = new b(this.f45901m);
        } else {
            this.f45904p = new C3402b(this.f45901m);
        }
    }

    public void b(C3423e c3423e, C3423e c3423e2, float f4, int i4) {
        C3422d.b bVar = C3422d.b.LEFT;
        i q4 = q(c3423e.k(bVar));
        C3422d.b bVar2 = C3422d.b.TOP;
        i q5 = q(c3423e.k(bVar2));
        C3422d.b bVar3 = C3422d.b.RIGHT;
        i q6 = q(c3423e.k(bVar3));
        C3422d.b bVar4 = C3422d.b.BOTTOM;
        i q7 = q(c3423e.k(bVar4));
        i q8 = q(c3423e2.k(bVar));
        i q9 = q(c3423e2.k(bVar2));
        i q10 = q(c3423e2.k(bVar3));
        i q11 = q(c3423e2.k(bVar4));
        C3402b r4 = r();
        double d4 = f4;
        double d5 = i4;
        r4.q(q5, q7, q9, q11, (float) (Math.sin(d4) * d5));
        d(r4);
        C3402b r5 = r();
        r5.q(q4, q6, q8, q10, (float) (Math.cos(d4) * d5));
        d(r5);
    }

    public void c(i iVar, i iVar2, int i4, float f4, i iVar3, i iVar4, int i5, int i6) {
        C3402b r4 = r();
        r4.h(iVar, iVar2, i4, f4, iVar3, iVar4, i5);
        if (i6 != 8) {
            r4.d(this, i6);
        }
        d(r4);
    }

    public void d(C3402b c3402b) {
        i w4;
        if (c3402b == null) {
            return;
        }
        boolean z4 = true;
        if (this.f45899k + 1 >= this.f45900l || this.f45898j + 1 >= this.f45893e) {
            z();
        }
        boolean z5 = false;
        if (!c3402b.f45880f) {
            c3402b.D(this);
            if (c3402b.u()) {
                return;
            }
            c3402b.r();
            if (c3402b.f(this)) {
                i p4 = p();
                c3402b.f45875a = p4;
                l(c3402b);
                this.f45904p.c(c3402b);
                C(this.f45904p, true);
                if (p4.f45922d == -1) {
                    if (c3402b.f45875a == p4 && (w4 = c3402b.w(p4)) != null) {
                        c3402b.y(w4);
                    }
                    if (!c3402b.f45880f) {
                        c3402b.f45875a.g(c3402b);
                    }
                    this.f45899k--;
                }
            } else {
                z4 = false;
            }
            if (!c3402b.s()) {
                return;
            } else {
                z5 = z4;
            }
        }
        if (z5) {
            return;
        }
        l(c3402b);
    }

    public C3402b e(i iVar, i iVar2, int i4, int i5) {
        if (i5 == 8 && iVar2.f45925g && iVar.f45922d == -1) {
            iVar.e(this, iVar2.f45924f + i4);
            return null;
        }
        C3402b r4 = r();
        r4.n(iVar, iVar2, i4);
        if (i5 != 8) {
            r4.d(this, i5);
        }
        d(r4);
        return r4;
    }

    public void f(i iVar, int i4) {
        int i5 = iVar.f45922d;
        if (i5 == -1) {
            iVar.e(this, i4);
            return;
        }
        if (i5 == -1) {
            C3402b r4 = r();
            r4.i(iVar, i4);
            d(r4);
            return;
        }
        C3402b c3402b = this.f45894f[i5];
        if (c3402b.f45880f) {
            c3402b.f45876b = i4;
            return;
        }
        if (c3402b.f45879e.b() == 0) {
            c3402b.f45880f = true;
            c3402b.f45876b = i4;
        } else {
            C3402b r5 = r();
            r5.m(iVar, i4);
            d(r5);
        }
    }

    public void g(i iVar, i iVar2, int i4, boolean z4) {
        C3402b r4 = r();
        i t4 = t();
        t4.f45923e = 0;
        r4.o(iVar, iVar2, t4, i4);
        d(r4);
    }

    public void h(i iVar, i iVar2, int i4, int i5) {
        C3402b r4 = r();
        i t4 = t();
        t4.f45923e = 0;
        r4.o(iVar, iVar2, t4, i4);
        if (i5 != 8) {
            m(r4, (int) (r4.f45879e.f(t4) * (-1.0f)), i5);
        }
        d(r4);
    }

    public void i(i iVar, i iVar2, int i4, boolean z4) {
        C3402b r4 = r();
        i t4 = t();
        t4.f45923e = 0;
        r4.p(iVar, iVar2, t4, i4);
        d(r4);
    }

    public void j(i iVar, i iVar2, int i4, int i5) {
        C3402b r4 = r();
        i t4 = t();
        t4.f45923e = 0;
        r4.p(iVar, iVar2, t4, i4);
        if (i5 != 8) {
            m(r4, (int) (r4.f45879e.f(t4) * (-1.0f)), i5);
        }
        d(r4);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f4, int i4) {
        C3402b r4 = r();
        r4.k(iVar, iVar2, iVar3, iVar4, f4);
        if (i4 != 8) {
            r4.d(this, i4);
        }
        d(r4);
    }

    void m(C3402b c3402b, int i4, int i5) {
        c3402b.e(o(i5, null), i4);
    }

    public i o(int i4, String str) {
        if (this.f45898j + 1 >= this.f45893e) {
            z();
        }
        i a4 = a(i.a.ERROR, str);
        int i5 = this.f45889a + 1;
        this.f45889a = i5;
        this.f45898j++;
        a4.f45921c = i5;
        a4.f45923e = i4;
        this.f45901m.f45884d[i5] = a4;
        this.f45891c.a(a4);
        return a4;
    }

    public i p() {
        if (this.f45898j + 1 >= this.f45893e) {
            z();
        }
        i a4 = a(i.a.SLACK, null);
        int i4 = this.f45889a + 1;
        this.f45889a = i4;
        this.f45898j++;
        a4.f45921c = i4;
        this.f45901m.f45884d[i4] = a4;
        return a4;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f45898j + 1 >= this.f45893e) {
            z();
        }
        if (obj instanceof C3422d) {
            C3422d c3422d = (C3422d) obj;
            iVar = c3422d.e();
            if (iVar == null) {
                c3422d.l(this.f45901m);
                iVar = c3422d.e();
            }
            int i4 = iVar.f45921c;
            if (i4 != -1 && i4 <= this.f45889a && this.f45901m.f45884d[i4] != null) {
                return iVar;
            }
            if (i4 != -1) {
                iVar.d();
            }
            int i5 = this.f45889a + 1;
            this.f45889a = i5;
            this.f45898j++;
            iVar.f45921c = i5;
            iVar.f45928j = i.a.UNRESTRICTED;
            this.f45901m.f45884d[i5] = iVar;
        }
        return iVar;
    }

    public C3402b r() {
        C3402b c3402b;
        if (f45886r) {
            c3402b = (C3402b) this.f45901m.f45881a.b();
            if (c3402b == null) {
                c3402b = new b(this.f45901m);
                f45888t++;
            } else {
                c3402b.z();
            }
        } else {
            c3402b = (C3402b) this.f45901m.f45882b.b();
            if (c3402b == null) {
                c3402b = new C3402b(this.f45901m);
                f45887s++;
            } else {
                c3402b.z();
            }
        }
        i.b();
        return c3402b;
    }

    public i t() {
        if (this.f45898j + 1 >= this.f45893e) {
            z();
        }
        i a4 = a(i.a.SLACK, null);
        int i4 = this.f45889a + 1;
        this.f45889a = i4;
        this.f45898j++;
        a4.f45921c = i4;
        this.f45901m.f45884d[i4] = a4;
        return a4;
    }

    public C3403c w() {
        return this.f45901m;
    }

    public int y(Object obj) {
        i e4 = ((C3422d) obj).e();
        if (e4 != null) {
            return (int) (e4.f45924f + 0.5f);
        }
        return 0;
    }

    public void v(AbstractC3405e abstractC3405e) {
    }
}
