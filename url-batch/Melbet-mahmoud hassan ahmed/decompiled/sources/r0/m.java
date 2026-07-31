package r0;

/* loaded from: classes.dex */
final class m implements o2.t {

    /* renamed from: f, reason: collision with root package name */
    private final o2.e0 f20768f;

    /* renamed from: g, reason: collision with root package name */
    private final a f20769g;

    /* renamed from: h, reason: collision with root package name */
    private e3 f20770h;

    /* renamed from: i, reason: collision with root package name */
    private o2.t f20771i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f20772j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20773k;

    public interface a {
        void j(u2 u2Var);
    }

    public m(a aVar, o2.d dVar) {
        this.f20769g = aVar;
        this.f20768f = new o2.e0(dVar);
    }

    private boolean f(boolean z6) {
        e3 e3Var = this.f20770h;
        return e3Var == null || e3Var.c() || (!this.f20770h.i() && (z6 || this.f20770h.k()));
    }

    private void j(boolean z6) {
        if (f(z6)) {
            this.f20772j = true;
            if (this.f20773k) {
                this.f20768f.b();
                return;
            }
            return;
        }
        o2.t tVar = (o2.t) o2.a.e(this.f20771i);
        long z7 = tVar.z();
        if (this.f20772j) {
            if (z7 < this.f20768f.z()) {
                this.f20768f.c();
                return;
            } else {
                this.f20772j = false;
                if (this.f20773k) {
                    this.f20768f.b();
                }
            }
        }
        this.f20768f.a(z7);
        u2 d7 = tVar.d();
        if (d7.equals(this.f20768f.d())) {
            return;
        }
        this.f20768f.e(d7);
        this.f20769g.j(d7);
    }

    public void a(e3 e3Var) {
        if (e3Var == this.f20770h) {
            this.f20771i = null;
            this.f20770h = null;
            this.f20772j = true;
        }
    }

    public void b(e3 e3Var) {
        o2.t tVar;
        o2.t w6 = e3Var.w();
        if (w6 == null || w6 == (tVar = this.f20771i)) {
            return;
        }
        if (tVar != null) {
            throw r.i(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f20771i = w6;
        this.f20770h = e3Var;
        w6.e(this.f20768f.d());
    }

    public void c(long j7) {
        this.f20768f.a(j7);
    }

    @Override // o2.t
    public u2 d() {
        o2.t tVar = this.f20771i;
        return tVar != null ? tVar.d() : this.f20768f.d();
    }

    @Override // o2.t
    public void e(u2 u2Var) {
        o2.t tVar = this.f20771i;
        if (tVar != null) {
            tVar.e(u2Var);
            u2Var = this.f20771i.d();
        }
        this.f20768f.e(u2Var);
    }

    public void g() {
        this.f20773k = true;
        this.f20768f.b();
    }

    public void h() {
        this.f20773k = false;
        this.f20768f.c();
    }

    public long i(boolean z6) {
        j(z6);
        return z();
    }

    @Override // o2.t
    public long z() {
        return this.f20772j ? this.f20768f.z() : ((o2.t) o2.a.e(this.f20771i)).z();
    }
}
