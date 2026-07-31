package g1;

import g1.i0;
import java.util.Collections;
import o2.m0;
import r0.s1;

/* loaded from: classes.dex */
public final class q implements m {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f16496a;

    /* renamed from: b, reason: collision with root package name */
    private String f16497b;

    /* renamed from: c, reason: collision with root package name */
    private w0.e0 f16498c;

    /* renamed from: d, reason: collision with root package name */
    private a f16499d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16500e;

    /* renamed from: l, reason: collision with root package name */
    private long f16507l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f16501f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final u f16502g = new u(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final u f16503h = new u(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final u f16504i = new u(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final u f16505j = new u(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final u f16506k = new u(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f16508m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final o2.a0 f16509n = new o2.a0();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final w0.e0 f16510a;

        /* renamed from: b, reason: collision with root package name */
        private long f16511b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16512c;

        /* renamed from: d, reason: collision with root package name */
        private int f16513d;

        /* renamed from: e, reason: collision with root package name */
        private long f16514e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f16515f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f16516g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f16517h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f16518i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f16519j;

        /* renamed from: k, reason: collision with root package name */
        private long f16520k;

        /* renamed from: l, reason: collision with root package name */
        private long f16521l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f16522m;

        public a(w0.e0 e0Var) {
            this.f16510a = e0Var;
        }

        private static boolean b(int i7) {
            return (32 <= i7 && i7 <= 35) || i7 == 39;
        }

        private static boolean c(int i7) {
            return i7 < 32 || i7 == 40;
        }

        private void d(int i7) {
            long j7 = this.f16521l;
            if (j7 == -9223372036854775807L) {
                return;
            }
            boolean z6 = this.f16522m;
            this.f16510a.b(j7, z6 ? 1 : 0, (int) (this.f16511b - this.f16520k), i7, null);
        }

        public void a(long j7, int i7, boolean z6) {
            if (this.f16519j && this.f16516g) {
                this.f16522m = this.f16512c;
                this.f16519j = false;
            } else if (this.f16517h || this.f16516g) {
                if (z6 && this.f16518i) {
                    d(i7 + ((int) (j7 - this.f16511b)));
                }
                this.f16520k = this.f16511b;
                this.f16521l = this.f16514e;
                this.f16522m = this.f16512c;
                this.f16518i = true;
            }
        }

        public void e(byte[] bArr, int i7, int i8) {
            if (this.f16515f) {
                int i9 = this.f16513d;
                int i10 = (i7 + 2) - i9;
                if (i10 >= i8) {
                    this.f16513d = i9 + (i8 - i7);
                } else {
                    this.f16516g = (bArr[i10] & 128) != 0;
                    this.f16515f = false;
                }
            }
        }

        public void f() {
            this.f16515f = false;
            this.f16516g = false;
            this.f16517h = false;
            this.f16518i = false;
            this.f16519j = false;
        }

        public void g(long j7, int i7, int i8, long j8, boolean z6) {
            this.f16516g = false;
            this.f16517h = false;
            this.f16514e = j8;
            this.f16513d = 0;
            this.f16511b = j7;
            if (!c(i8)) {
                if (this.f16518i && !this.f16519j) {
                    if (z6) {
                        d(i7);
                    }
                    this.f16518i = false;
                }
                if (b(i8)) {
                    this.f16517h = !this.f16519j;
                    this.f16519j = true;
                }
            }
            boolean z7 = i8 >= 16 && i8 <= 21;
            this.f16512c = z7;
            this.f16515f = z7 || i8 <= 9;
        }
    }

    public q(d0 d0Var) {
        this.f16496a = d0Var;
    }

    private void b() {
        o2.a.h(this.f16498c);
        m0.j(this.f16499d);
    }

    private void g(long j7, int i7, int i8, long j8) {
        this.f16499d.a(j7, i7, this.f16500e);
        if (!this.f16500e) {
            this.f16502g.b(i8);
            this.f16503h.b(i8);
            this.f16504i.b(i8);
            if (this.f16502g.c() && this.f16503h.c() && this.f16504i.c()) {
                this.f16498c.e(i(this.f16497b, this.f16502g, this.f16503h, this.f16504i));
                this.f16500e = true;
            }
        }
        if (this.f16505j.b(i8)) {
            u uVar = this.f16505j;
            this.f16509n.M(this.f16505j.f16565d, o2.w.q(uVar.f16565d, uVar.f16566e));
            this.f16509n.P(5);
            this.f16496a.a(j8, this.f16509n);
        }
        if (this.f16506k.b(i8)) {
            u uVar2 = this.f16506k;
            this.f16509n.M(this.f16506k.f16565d, o2.w.q(uVar2.f16565d, uVar2.f16566e));
            this.f16509n.P(5);
            this.f16496a.a(j8, this.f16509n);
        }
    }

    private void h(byte[] bArr, int i7, int i8) {
        this.f16499d.e(bArr, i7, i8);
        if (!this.f16500e) {
            this.f16502g.a(bArr, i7, i8);
            this.f16503h.a(bArr, i7, i8);
            this.f16504i.a(bArr, i7, i8);
        }
        this.f16505j.a(bArr, i7, i8);
        this.f16506k.a(bArr, i7, i8);
    }

    private static s1 i(String str, u uVar, u uVar2, u uVar3) {
        int i7 = uVar.f16566e;
        byte[] bArr = new byte[uVar2.f16566e + i7 + uVar3.f16566e];
        System.arraycopy(uVar.f16565d, 0, bArr, 0, i7);
        System.arraycopy(uVar2.f16565d, 0, bArr, uVar.f16566e, uVar2.f16566e);
        System.arraycopy(uVar3.f16565d, 0, bArr, uVar.f16566e + uVar2.f16566e, uVar3.f16566e);
        o2.b0 b0Var = new o2.b0(uVar2.f16565d, 0, uVar2.f16566e);
        b0Var.l(44);
        int e7 = b0Var.e(3);
        b0Var.k();
        int e8 = b0Var.e(2);
        boolean d7 = b0Var.d();
        int e9 = b0Var.e(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (b0Var.d()) {
                i8 |= 1 << i9;
            }
        }
        int[] iArr = new int[6];
        for (int i10 = 0; i10 < 6; i10++) {
            iArr[i10] = b0Var.e(8);
        }
        int e10 = b0Var.e(8);
        int i11 = 0;
        for (int i12 = 0; i12 < e7; i12++) {
            if (b0Var.d()) {
                i11 += 89;
            }
            if (b0Var.d()) {
                i11 += 8;
            }
        }
        b0Var.l(i11);
        if (e7 > 0) {
            b0Var.l((8 - e7) * 2);
        }
        b0Var.h();
        int h7 = b0Var.h();
        if (h7 == 3) {
            b0Var.k();
        }
        int h8 = b0Var.h();
        int h9 = b0Var.h();
        if (b0Var.d()) {
            int h10 = b0Var.h();
            int h11 = b0Var.h();
            int h12 = b0Var.h();
            int h13 = b0Var.h();
            h8 -= ((h7 == 1 || h7 == 2) ? 2 : 1) * (h10 + h11);
            h9 -= (h7 == 1 ? 2 : 1) * (h12 + h13);
        }
        b0Var.h();
        b0Var.h();
        int h14 = b0Var.h();
        int i13 = b0Var.d() ? 0 : e7;
        while (true) {
            b0Var.h();
            b0Var.h();
            b0Var.h();
            if (i13 > e7) {
                break;
            }
            i13++;
        }
        b0Var.h();
        b0Var.h();
        b0Var.h();
        if (b0Var.d() && b0Var.d()) {
            j(b0Var);
        }
        b0Var.l(2);
        if (b0Var.d()) {
            b0Var.l(8);
            b0Var.h();
            b0Var.h();
            b0Var.k();
        }
        k(b0Var);
        if (b0Var.d()) {
            for (int i14 = 0; i14 < b0Var.h(); i14++) {
                b0Var.l(h14 + 4 + 1);
            }
        }
        b0Var.l(2);
        float f7 = 1.0f;
        if (b0Var.d()) {
            if (b0Var.d()) {
                int e11 = b0Var.e(8);
                if (e11 == 255) {
                    int e12 = b0Var.e(16);
                    int e13 = b0Var.e(16);
                    if (e12 != 0 && e13 != 0) {
                        f7 = e12 / e13;
                    }
                } else {
                    float[] fArr = o2.w.f19797b;
                    if (e11 < fArr.length) {
                        f7 = fArr[e11];
                    } else {
                        o2.r.i("H265Reader", "Unexpected aspect_ratio_idc value: " + e11);
                    }
                }
            }
            if (b0Var.d()) {
                b0Var.k();
            }
            if (b0Var.d()) {
                b0Var.l(4);
                if (b0Var.d()) {
                    b0Var.l(24);
                }
            }
            if (b0Var.d()) {
                b0Var.h();
                b0Var.h();
            }
            b0Var.k();
            if (b0Var.d()) {
                h9 *= 2;
            }
        }
        return new s1.b().S(str).e0("video/hevc").I(o2.e.c(e8, d7, e9, i8, iArr, e10)).j0(h8).Q(h9).a0(f7).T(Collections.singletonList(bArr)).E();
    }

    private static void j(o2.b0 b0Var) {
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = 0;
            while (i8 < 6) {
                int i9 = 1;
                if (b0Var.d()) {
                    int min = Math.min(64, 1 << ((i7 << 1) + 4));
                    if (i7 > 1) {
                        b0Var.g();
                    }
                    for (int i10 = 0; i10 < min; i10++) {
                        b0Var.g();
                    }
                } else {
                    b0Var.h();
                }
                if (i7 == 3) {
                    i9 = 3;
                }
                i8 += i9;
            }
        }
    }

    private static void k(o2.b0 b0Var) {
        int h7 = b0Var.h();
        boolean z6 = false;
        int i7 = 0;
        for (int i8 = 0; i8 < h7; i8++) {
            if (i8 != 0) {
                z6 = b0Var.d();
            }
            if (z6) {
                b0Var.k();
                b0Var.h();
                for (int i9 = 0; i9 <= i7; i9++) {
                    if (b0Var.d()) {
                        b0Var.k();
                    }
                }
            } else {
                int h8 = b0Var.h();
                int h9 = b0Var.h();
                int i10 = h8 + h9;
                for (int i11 = 0; i11 < h8; i11++) {
                    b0Var.h();
                    b0Var.k();
                }
                for (int i12 = 0; i12 < h9; i12++) {
                    b0Var.h();
                    b0Var.k();
                }
                i7 = i10;
            }
        }
    }

    private void l(long j7, int i7, int i8, long j8) {
        this.f16499d.g(j7, i7, i8, j8, this.f16500e);
        if (!this.f16500e) {
            this.f16502g.e(i8);
            this.f16503h.e(i8);
            this.f16504i.e(i8);
        }
        this.f16505j.e(i8);
        this.f16506k.e(i8);
    }

    @Override // g1.m
    public void a() {
        this.f16507l = 0L;
        this.f16508m = -9223372036854775807L;
        o2.w.a(this.f16501f);
        this.f16502g.d();
        this.f16503h.d();
        this.f16504i.d();
        this.f16505j.d();
        this.f16506k.d();
        a aVar = this.f16499d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // g1.m
    public void c(o2.a0 a0Var) {
        b();
        while (a0Var.a() > 0) {
            int e7 = a0Var.e();
            int f7 = a0Var.f();
            byte[] d7 = a0Var.d();
            this.f16507l += a0Var.a();
            this.f16498c.d(a0Var, a0Var.a());
            while (e7 < f7) {
                int c7 = o2.w.c(d7, e7, f7, this.f16501f);
                if (c7 == f7) {
                    h(d7, e7, f7);
                    return;
                }
                int e8 = o2.w.e(d7, c7);
                int i7 = c7 - e7;
                if (i7 > 0) {
                    h(d7, e7, c7);
                }
                int i8 = f7 - c7;
                long j7 = this.f16507l - i8;
                g(j7, i8, i7 < 0 ? -i7 : 0, this.f16508m);
                l(j7, i8, e8, this.f16508m);
                e7 = c7 + 3;
            }
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        dVar.a();
        this.f16497b = dVar.b();
        w0.e0 d7 = nVar.d(dVar.c(), 2);
        this.f16498c = d7;
        this.f16499d = new a(d7);
        this.f16496a.b(nVar, dVar);
    }

    @Override // g1.m
    public void e() {
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f16508m = j7;
        }
    }
}
