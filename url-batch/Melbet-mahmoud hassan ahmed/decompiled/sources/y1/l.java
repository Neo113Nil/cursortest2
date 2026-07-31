package y1;

import r0.t1;
import t1.q0;

/* loaded from: classes.dex */
final class l implements q0 {

    /* renamed from: f, reason: collision with root package name */
    private final int f23325f;

    /* renamed from: g, reason: collision with root package name */
    private final p f23326g;

    /* renamed from: h, reason: collision with root package name */
    private int f23327h = -1;

    public l(p pVar, int i7) {
        this.f23326g = pVar;
        this.f23325f = i7;
    }

    private boolean c() {
        int i7 = this.f23327h;
        return (i7 == -1 || i7 == -3 || i7 == -2) ? false : true;
    }

    public void a() {
        o2.a.a(this.f23327h == -1);
        this.f23327h = this.f23326g.y(this.f23325f);
    }

    @Override // t1.q0
    public void b() {
        int i7 = this.f23327h;
        if (i7 == -2) {
            throw new r(this.f23326g.p().b(this.f23325f).b(0).f20956q);
        }
        if (i7 == -1) {
            this.f23326g.U();
        } else if (i7 != -3) {
            this.f23326g.V(i7);
        }
    }

    @Override // t1.q0
    public int d(long j7) {
        if (c()) {
            return this.f23326g.o0(this.f23327h, j7);
        }
        return 0;
    }

    public void e() {
        if (this.f23327h != -1) {
            this.f23326g.p0(this.f23325f);
            this.f23327h = -1;
        }
    }

    @Override // t1.q0
    public boolean i() {
        return this.f23327h == -3 || (c() && this.f23326g.Q(this.f23327h));
    }

    @Override // t1.q0
    public int j(t1 t1Var, u0.g gVar, int i7) {
        if (this.f23327h == -3) {
            gVar.g(4);
            return -4;
        }
        if (c()) {
            return this.f23326g.e0(this.f23327h, t1Var, gVar, i7);
        }
        return -3;
    }
}
