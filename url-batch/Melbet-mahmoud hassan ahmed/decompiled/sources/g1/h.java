package g1;

import android.net.Uri;
import g1.i0;
import java.io.EOFException;
import java.util.Map;
import r0.n2;
import w0.b0;

/* loaded from: classes.dex */
public final class h implements w0.l {

    /* renamed from: m, reason: collision with root package name */
    public static final w0.r f16304m = new w0.r() { // from class: g1.g
        @Override // w0.r
        public final w0.l[] a() {
            w0.l[] j7;
            j7 = h.j();
            return j7;
        }

        @Override // w0.r
        public /* synthetic */ w0.l[] b(Uri uri, Map map) {
            return w0.q.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f16305a;

    /* renamed from: b, reason: collision with root package name */
    private final i f16306b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.a0 f16307c;

    /* renamed from: d, reason: collision with root package name */
    private final o2.a0 f16308d;

    /* renamed from: e, reason: collision with root package name */
    private final o2.z f16309e;

    /* renamed from: f, reason: collision with root package name */
    private w0.n f16310f;

    /* renamed from: g, reason: collision with root package name */
    private long f16311g;

    /* renamed from: h, reason: collision with root package name */
    private long f16312h;

    /* renamed from: i, reason: collision with root package name */
    private int f16313i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16314j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16315k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16316l;

    public h() {
        this(0);
    }

    public h(int i7) {
        this.f16305a = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f16306b = new i(true);
        this.f16307c = new o2.a0(2048);
        this.f16313i = -1;
        this.f16312h = -1L;
        o2.a0 a0Var = new o2.a0(10);
        this.f16308d = a0Var;
        this.f16309e = new o2.z(a0Var.d());
    }

    private void f(w0.m mVar) {
        if (this.f16314j) {
            return;
        }
        this.f16313i = -1;
        mVar.h();
        long j7 = 0;
        if (mVar.p() == 0) {
            l(mVar);
        }
        int i7 = 0;
        int i8 = 0;
        while (mVar.l(this.f16308d.d(), 0, 2, true)) {
            try {
                this.f16308d.O(0);
                if (!i.m(this.f16308d.I())) {
                    break;
                }
                if (!mVar.l(this.f16308d.d(), 0, 4, true)) {
                    break;
                }
                this.f16309e.p(14);
                int h7 = this.f16309e.h(13);
                if (h7 <= 6) {
                    this.f16314j = true;
                    throw n2.a("Malformed ADTS stream", null);
                }
                j7 += h7;
                i8++;
                if (i8 != 1000 && mVar.j(h7 - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i7 = i8;
        mVar.h();
        if (i7 > 0) {
            this.f16313i = (int) (j7 / i7);
        } else {
            this.f16313i = -1;
        }
        this.f16314j = true;
    }

    private static int g(int i7, long j7) {
        return (int) (((i7 * 8) * 1000000) / j7);
    }

    private w0.b0 i(long j7, boolean z6) {
        return new w0.e(j7, this.f16312h, g(this.f16313i, this.f16306b.k()), this.f16313i, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w0.l[] j() {
        return new w0.l[]{new h()};
    }

    private void k(long j7, boolean z6) {
        if (this.f16316l) {
            return;
        }
        boolean z7 = (this.f16305a & 1) != 0 && this.f16313i > 0;
        if (z7 && this.f16306b.k() == -9223372036854775807L && !z6) {
            return;
        }
        if (!z7 || this.f16306b.k() == -9223372036854775807L) {
            this.f16310f.i(new b0.b(-9223372036854775807L));
        } else {
            this.f16310f.i(i(j7, (this.f16305a & 2) != 0));
        }
        this.f16316l = true;
    }

    private int l(w0.m mVar) {
        int i7 = 0;
        while (true) {
            mVar.n(this.f16308d.d(), 0, 10);
            this.f16308d.O(0);
            if (this.f16308d.F() != 4801587) {
                break;
            }
            this.f16308d.P(3);
            int B = this.f16308d.B();
            i7 += B + 10;
            mVar.o(B);
        }
        mVar.h();
        mVar.o(i7);
        if (this.f16312h == -1) {
            this.f16312h = i7;
        }
        return i7;
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        this.f16315k = false;
        this.f16306b.a();
        this.f16311g = j8;
    }

    @Override // w0.l
    public void d(w0.n nVar) {
        this.f16310f = nVar;
        this.f16306b.d(nVar, new i0.d(0, 1));
        nVar.j();
    }

    @Override // w0.l
    public int e(w0.m mVar, w0.a0 a0Var) {
        o2.a.h(this.f16310f);
        long a7 = mVar.a();
        int i7 = this.f16305a;
        if (((i7 & 2) == 0 && ((i7 & 1) == 0 || a7 == -1)) ? false : true) {
            f(mVar);
        }
        int read = mVar.read(this.f16307c.d(), 0, 2048);
        boolean z6 = read == -1;
        k(a7, z6);
        if (z6) {
            return -1;
        }
        this.f16307c.O(0);
        this.f16307c.N(read);
        if (!this.f16315k) {
            this.f16306b.f(this.f16311g, 4);
            this.f16315k = true;
        }
        this.f16306b.c(this.f16307c);
        return 0;
    }

    @Override // w0.l
    public boolean h(w0.m mVar) {
        int l7 = l(mVar);
        int i7 = l7;
        int i8 = 0;
        int i9 = 0;
        do {
            mVar.n(this.f16308d.d(), 0, 2);
            this.f16308d.O(0);
            if (i.m(this.f16308d.I())) {
                i8++;
                if (i8 >= 4 && i9 > 188) {
                    return true;
                }
                mVar.n(this.f16308d.d(), 0, 4);
                this.f16309e.p(14);
                int h7 = this.f16309e.h(13);
                if (h7 > 6) {
                    mVar.o(h7 - 6);
                    i9 += h7;
                }
            }
            i7++;
            mVar.h();
            mVar.o(i7);
            i8 = 0;
            i9 = 0;
        } while (i7 - l7 < 8192);
        return false;
    }
}
