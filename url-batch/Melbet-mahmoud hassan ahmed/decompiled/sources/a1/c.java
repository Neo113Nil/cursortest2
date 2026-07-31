package a1;

import android.net.Uri;
import java.util.Map;
import o2.a0;
import w0.b0;
import w0.l;
import w0.m;
import w0.n;
import w0.q;
import w0.r;
import w0.z;

/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: q, reason: collision with root package name */
    public static final r f6q = new r() { // from class: a1.b
        @Override // w0.r
        public final l[] a() {
            l[] i7;
            i7 = c.i();
            return i7;
        }

        @Override // w0.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private n f12f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14h;

    /* renamed from: i, reason: collision with root package name */
    private long f15i;

    /* renamed from: j, reason: collision with root package name */
    private int f16j;

    /* renamed from: k, reason: collision with root package name */
    private int f17k;

    /* renamed from: l, reason: collision with root package name */
    private int f18l;

    /* renamed from: m, reason: collision with root package name */
    private long f19m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20n;

    /* renamed from: o, reason: collision with root package name */
    private a f21o;

    /* renamed from: p, reason: collision with root package name */
    private f f22p;

    /* renamed from: a, reason: collision with root package name */
    private final a0 f7a = new a0(4);

    /* renamed from: b, reason: collision with root package name */
    private final a0 f8b = new a0(9);

    /* renamed from: c, reason: collision with root package name */
    private final a0 f9c = new a0(11);

    /* renamed from: d, reason: collision with root package name */
    private final a0 f10d = new a0();

    /* renamed from: e, reason: collision with root package name */
    private final d f11e = new d();

    /* renamed from: g, reason: collision with root package name */
    private int f13g = 1;

    private void f() {
        if (this.f20n) {
            return;
        }
        this.f12f.i(new b0.b(-9223372036854775807L));
        this.f20n = true;
    }

    private long g() {
        if (this.f14h) {
            return this.f15i + this.f19m;
        }
        if (this.f11e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f19m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] i() {
        return new l[]{new c()};
    }

    private a0 j(m mVar) {
        if (this.f18l > this.f10d.b()) {
            a0 a0Var = this.f10d;
            a0Var.M(new byte[Math.max(a0Var.b() * 2, this.f18l)], 0);
        } else {
            this.f10d.O(0);
        }
        this.f10d.N(this.f18l);
        mVar.readFully(this.f10d.d(), 0, this.f18l);
        return this.f10d;
    }

    private boolean k(m mVar) {
        if (!mVar.e(this.f8b.d(), 0, 9, true)) {
            return false;
        }
        this.f8b.O(0);
        this.f8b.P(4);
        int C = this.f8b.C();
        boolean z6 = (C & 4) != 0;
        boolean z7 = (C & 1) != 0;
        if (z6 && this.f21o == null) {
            this.f21o = new a(this.f12f.d(8, 1));
        }
        if (z7 && this.f22p == null) {
            this.f22p = new f(this.f12f.d(9, 2));
        }
        this.f12f.j();
        this.f16j = (this.f8b.m() - 9) + 4;
        this.f13g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean l(m mVar) {
        boolean z6;
        e eVar;
        long g7 = g();
        int i7 = this.f17k;
        boolean z7 = false;
        if (i7 == 8 && this.f21o != null) {
            f();
            eVar = this.f21o;
        } else {
            if (i7 != 9 || this.f22p == null) {
                if (i7 != 18 || this.f20n) {
                    mVar.i(this.f18l);
                    z6 = false;
                    if (!this.f14h && z7) {
                        this.f14h = true;
                        this.f15i = this.f11e.d() != -9223372036854775807L ? -this.f19m : 0L;
                    }
                    this.f16j = 4;
                    this.f13g = 2;
                    return z6;
                }
                z7 = this.f11e.a(j(mVar), g7);
                long d7 = this.f11e.d();
                if (d7 != -9223372036854775807L) {
                    this.f12f.i(new z(this.f11e.e(), this.f11e.f(), d7));
                    this.f20n = true;
                }
                z6 = true;
                if (!this.f14h) {
                    this.f14h = true;
                    this.f15i = this.f11e.d() != -9223372036854775807L ? -this.f19m : 0L;
                }
                this.f16j = 4;
                this.f13g = 2;
                return z6;
            }
            f();
            eVar = this.f22p;
        }
        z7 = eVar.a(j(mVar), g7);
        z6 = true;
        if (!this.f14h) {
        }
        this.f16j = 4;
        this.f13g = 2;
        return z6;
    }

    private boolean m(m mVar) {
        if (!mVar.e(this.f9c.d(), 0, 11, true)) {
            return false;
        }
        this.f9c.O(0);
        this.f17k = this.f9c.C();
        this.f18l = this.f9c.F();
        this.f19m = this.f9c.F();
        this.f19m = ((this.f9c.C() << 24) | this.f19m) * 1000;
        this.f9c.P(3);
        this.f13g = 4;
        return true;
    }

    private void n(m mVar) {
        mVar.i(this.f16j);
        this.f16j = 0;
        this.f13g = 3;
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        if (j7 == 0) {
            this.f13g = 1;
            this.f14h = false;
        } else {
            this.f13g = 3;
        }
        this.f16j = 0;
    }

    @Override // w0.l
    public void d(n nVar) {
        this.f12f = nVar;
    }

    @Override // w0.l
    public int e(m mVar, w0.a0 a0Var) {
        o2.a.h(this.f12f);
        while (true) {
            int i7 = this.f13g;
            if (i7 != 1) {
                if (i7 == 2) {
                    n(mVar);
                } else if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException();
                    }
                    if (l(mVar)) {
                        return 0;
                    }
                } else if (!m(mVar)) {
                    return -1;
                }
            } else if (!k(mVar)) {
                return -1;
            }
        }
    }

    @Override // w0.l
    public boolean h(m mVar) {
        mVar.n(this.f7a.d(), 0, 3);
        this.f7a.O(0);
        if (this.f7a.F() != 4607062) {
            return false;
        }
        mVar.n(this.f7a.d(), 0, 2);
        this.f7a.O(0);
        if ((this.f7a.I() & 250) != 0) {
            return false;
        }
        mVar.n(this.f7a.d(), 0, 4);
        this.f7a.O(0);
        int m7 = this.f7a.m();
        mVar.h();
        mVar.o(m7);
        mVar.n(this.f7a.d(), 0, 4);
        this.f7a.O(0);
        return this.f7a.m() == 0;
    }
}
