package t1;

import java.io.IOException;
import r0.j3;
import t1.u;
import t1.x;

/* loaded from: classes.dex */
public final class r implements u, u.a {

    /* renamed from: f, reason: collision with root package name */
    public final x.b f22189f;

    /* renamed from: g, reason: collision with root package name */
    private final long f22190g;

    /* renamed from: h, reason: collision with root package name */
    private final n2.b f22191h;

    /* renamed from: i, reason: collision with root package name */
    private x f22192i;

    /* renamed from: j, reason: collision with root package name */
    private u f22193j;

    /* renamed from: k, reason: collision with root package name */
    private u.a f22194k;

    /* renamed from: l, reason: collision with root package name */
    private a f22195l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22196m;

    /* renamed from: n, reason: collision with root package name */
    private long f22197n = -9223372036854775807L;

    public interface a {
        void a(x.b bVar);

        void b(x.b bVar, IOException iOException);
    }

    public r(x.b bVar, n2.b bVar2, long j7) {
        this.f22189f = bVar;
        this.f22191h = bVar2;
        this.f22190g = j7;
    }

    private long o(long j7) {
        long j8 = this.f22197n;
        return j8 != -9223372036854775807L ? j8 : j7;
    }

    @Override // t1.u, t1.r0
    public boolean a() {
        u uVar = this.f22193j;
        return uVar != null && uVar.a();
    }

    @Override // t1.u, t1.r0
    public long c() {
        return ((u) o2.m0.j(this.f22193j)).c();
    }

    public void d(x.b bVar) {
        long o7 = o(this.f22190g);
        u j7 = ((x) o2.a.e(this.f22192i)).j(bVar, this.f22191h, o7);
        this.f22193j = j7;
        if (this.f22194k != null) {
            j7.q(this, o7);
        }
    }

    @Override // t1.u, t1.r0
    public long e() {
        return ((u) o2.m0.j(this.f22193j)).e();
    }

    @Override // t1.u
    public long f(long j7, j3 j3Var) {
        return ((u) o2.m0.j(this.f22193j)).f(j7, j3Var);
    }

    @Override // t1.u, t1.r0
    public boolean g(long j7) {
        u uVar = this.f22193j;
        return uVar != null && uVar.g(j7);
    }

    @Override // t1.u, t1.r0
    public void h(long j7) {
        ((u) o2.m0.j(this.f22193j)).h(j7);
    }

    @Override // t1.u.a
    public void i(u uVar) {
        ((u.a) o2.m0.j(this.f22194k)).i(this);
        a aVar = this.f22195l;
        if (aVar != null) {
            aVar.a(this.f22189f);
        }
    }

    public long j() {
        return this.f22197n;
    }

    public long m() {
        return this.f22190g;
    }

    @Override // t1.u
    public long n() {
        return ((u) o2.m0.j(this.f22193j)).n();
    }

    @Override // t1.u
    public z0 p() {
        return ((u) o2.m0.j(this.f22193j)).p();
    }

    @Override // t1.u
    public void q(u.a aVar, long j7) {
        this.f22194k = aVar;
        u uVar = this.f22193j;
        if (uVar != null) {
            uVar.q(this, o(this.f22190g));
        }
    }

    @Override // t1.u
    public long r(m2.t[] tVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j7) {
        long j8;
        long j9 = this.f22197n;
        if (j9 == -9223372036854775807L || j7 != this.f22190g) {
            j8 = j7;
        } else {
            this.f22197n = -9223372036854775807L;
            j8 = j9;
        }
        return ((u) o2.m0.j(this.f22193j)).r(tVarArr, zArr, q0VarArr, zArr2, j8);
    }

    @Override // t1.u
    public void s() {
        try {
            u uVar = this.f22193j;
            if (uVar != null) {
                uVar.s();
            } else {
                x xVar = this.f22192i;
                if (xVar != null) {
                    xVar.c();
                }
            }
        } catch (IOException e7) {
            a aVar = this.f22195l;
            if (aVar == null) {
                throw e7;
            }
            if (this.f22196m) {
                return;
            }
            this.f22196m = true;
            aVar.b(this.f22189f, e7);
        }
    }

    @Override // t1.u
    public void t(long j7, boolean z6) {
        ((u) o2.m0.j(this.f22193j)).t(j7, z6);
    }

    @Override // t1.u
    public long u(long j7) {
        return ((u) o2.m0.j(this.f22193j)).u(j7);
    }

    @Override // t1.r0.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void l(u uVar) {
        ((u.a) o2.m0.j(this.f22194k)).l(this);
    }

    public void w(long j7) {
        this.f22197n = j7;
    }

    public void x() {
        if (this.f22193j != null) {
            ((x) o2.a.e(this.f22192i)).e(this.f22193j);
        }
    }

    public void y(x xVar) {
        o2.a.f(this.f22192i == null);
        this.f22192i = xVar;
    }
}
