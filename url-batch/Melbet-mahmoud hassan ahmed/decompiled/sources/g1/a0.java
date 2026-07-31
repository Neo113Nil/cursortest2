package g1;

import android.net.Uri;
import android.util.SparseArray;
import g1.i0;
import java.util.Map;
import w0.b0;

/* loaded from: classes.dex */
public final class a0 implements w0.l {

    /* renamed from: l, reason: collision with root package name */
    public static final w0.r f16227l = new w0.r() { // from class: g1.z
        @Override // w0.r
        public final w0.l[] a() {
            w0.l[] f7;
            f7 = a0.f();
            return f7;
        }

        @Override // w0.r
        public /* synthetic */ w0.l[] b(Uri uri, Map map) {
            return w0.q.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final o2.i0 f16228a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f16229b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.a0 f16230c;

    /* renamed from: d, reason: collision with root package name */
    private final y f16231d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16232e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16233f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16234g;

    /* renamed from: h, reason: collision with root package name */
    private long f16235h;

    /* renamed from: i, reason: collision with root package name */
    private x f16236i;

    /* renamed from: j, reason: collision with root package name */
    private w0.n f16237j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16238k;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final m f16239a;

        /* renamed from: b, reason: collision with root package name */
        private final o2.i0 f16240b;

        /* renamed from: c, reason: collision with root package name */
        private final o2.z f16241c = new o2.z(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        private boolean f16242d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16243e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f16244f;

        /* renamed from: g, reason: collision with root package name */
        private int f16245g;

        /* renamed from: h, reason: collision with root package name */
        private long f16246h;

        public a(m mVar, o2.i0 i0Var) {
            this.f16239a = mVar;
            this.f16240b = i0Var;
        }

        private void b() {
            this.f16241c.r(8);
            this.f16242d = this.f16241c.g();
            this.f16243e = this.f16241c.g();
            this.f16241c.r(6);
            this.f16245g = this.f16241c.h(8);
        }

        private void c() {
            this.f16246h = 0L;
            if (this.f16242d) {
                this.f16241c.r(4);
                this.f16241c.r(1);
                this.f16241c.r(1);
                long h7 = (this.f16241c.h(3) << 30) | (this.f16241c.h(15) << 15) | this.f16241c.h(15);
                this.f16241c.r(1);
                if (!this.f16244f && this.f16243e) {
                    this.f16241c.r(4);
                    this.f16241c.r(1);
                    this.f16241c.r(1);
                    this.f16241c.r(1);
                    this.f16240b.b((this.f16241c.h(3) << 30) | (this.f16241c.h(15) << 15) | this.f16241c.h(15));
                    this.f16244f = true;
                }
                this.f16246h = this.f16240b.b(h7);
            }
        }

        public void a(o2.a0 a0Var) {
            a0Var.j(this.f16241c.f19836a, 0, 3);
            this.f16241c.p(0);
            b();
            a0Var.j(this.f16241c.f19836a, 0, this.f16245g);
            this.f16241c.p(0);
            c();
            this.f16239a.f(this.f16246h, 4);
            this.f16239a.c(a0Var);
            this.f16239a.e();
        }

        public void d() {
            this.f16244f = false;
            this.f16239a.a();
        }
    }

    public a0() {
        this(new o2.i0(0L));
    }

    public a0(o2.i0 i0Var) {
        this.f16228a = i0Var;
        this.f16230c = new o2.a0(4096);
        this.f16229b = new SparseArray<>();
        this.f16231d = new y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w0.l[] f() {
        return new w0.l[]{new a0()};
    }

    private void g(long j7) {
        w0.n nVar;
        w0.b0 bVar;
        if (this.f16238k) {
            return;
        }
        this.f16238k = true;
        if (this.f16231d.c() != -9223372036854775807L) {
            x xVar = new x(this.f16231d.d(), this.f16231d.c(), j7);
            this.f16236i = xVar;
            nVar = this.f16237j;
            bVar = xVar.b();
        } else {
            nVar = this.f16237j;
            bVar = new b0.b(this.f16231d.c());
        }
        nVar.i(bVar);
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        boolean z6 = this.f16228a.e() == -9223372036854775807L;
        if (!z6) {
            long c7 = this.f16228a.c();
            z6 = (c7 == -9223372036854775807L || c7 == 0 || c7 == j8) ? false : true;
        }
        if (z6) {
            this.f16228a.g(j8);
        }
        x xVar = this.f16236i;
        if (xVar != null) {
            xVar.h(j8);
        }
        for (int i7 = 0; i7 < this.f16229b.size(); i7++) {
            this.f16229b.valueAt(i7).d();
        }
    }

    @Override // w0.l
    public void d(w0.n nVar) {
        this.f16237j = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    @Override // w0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int e(w0.m mVar, w0.a0 a0Var) {
        int I;
        o2.a.h(this.f16237j);
        long a7 = mVar.a();
        if ((a7 != -1) && !this.f16231d.e()) {
            return this.f16231d.g(mVar, a0Var);
        }
        g(a7);
        x xVar = this.f16236i;
        if (xVar != null && xVar.d()) {
            return this.f16236i.c(mVar, a0Var);
        }
        mVar.h();
        long m7 = a7 != -1 ? a7 - mVar.m() : -1L;
        if ((m7 != -1 && m7 < 4) || !mVar.l(this.f16230c.d(), 0, 4, true)) {
            return -1;
        }
        this.f16230c.O(0);
        int m8 = this.f16230c.m();
        if (m8 == 441) {
            return -1;
        }
        if (m8 == 442) {
            mVar.n(this.f16230c.d(), 0, 10);
            this.f16230c.O(9);
            I = (this.f16230c.C() & 7) + 14;
        } else {
            if (m8 != 443) {
                if (((m8 & (-256)) >> 8) != 1) {
                    mVar.i(1);
                    return 0;
                }
                int i7 = m8 & 255;
                a aVar = this.f16229b.get(i7);
                if (!this.f16232e) {
                    if (aVar == null) {
                        m mVar2 = null;
                        if (i7 == 189) {
                            mVar2 = new c();
                        } else if ((i7 & 224) == 192) {
                            mVar2 = new t();
                        } else {
                            if ((i7 & 240) == 224) {
                                mVar2 = new n();
                                this.f16234g = true;
                                this.f16235h = mVar.p();
                            }
                            if (mVar2 != null) {
                                mVar2.d(this.f16237j, new i0.d(i7, 256));
                                aVar = new a(mVar2, this.f16228a);
                                this.f16229b.put(i7, aVar);
                            }
                        }
                        this.f16233f = true;
                        this.f16235h = mVar.p();
                        if (mVar2 != null) {
                        }
                    }
                    if (mVar.p() > ((this.f16233f && this.f16234g) ? this.f16235h + 8192 : 1048576L)) {
                        this.f16232e = true;
                        this.f16237j.j();
                    }
                }
                mVar.n(this.f16230c.d(), 0, 2);
                this.f16230c.O(0);
                int I2 = this.f16230c.I() + 6;
                if (aVar == null) {
                    mVar.i(I2);
                } else {
                    this.f16230c.K(I2);
                    mVar.readFully(this.f16230c.d(), 0, I2);
                    this.f16230c.O(6);
                    aVar.a(this.f16230c);
                    o2.a0 a0Var2 = this.f16230c;
                    a0Var2.N(a0Var2.b());
                }
                return 0;
            }
            mVar.n(this.f16230c.d(), 0, 2);
            this.f16230c.O(0);
            I = this.f16230c.I() + 6;
        }
        mVar.i(I);
        return 0;
    }

    @Override // w0.l
    public boolean h(w0.m mVar) {
        byte[] bArr = new byte[14];
        mVar.n(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        mVar.o(bArr[13] & 7);
        mVar.n(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
