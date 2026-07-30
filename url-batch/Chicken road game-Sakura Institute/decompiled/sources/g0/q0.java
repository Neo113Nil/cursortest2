package g0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q0 implements u1 {

    /* renamed from: f, reason: collision with root package name */
    public final q6.e f3857f;

    /* renamed from: g, reason: collision with root package name */
    public final h7.c f3858g;

    /* renamed from: h, reason: collision with root package name */
    public c7.m1 f3859h;

    public q0(h6.i iVar, q6.e eVar) {
        this.f3857f = eVar;
        this.f3858g = c7.a0.a(iVar);
    }

    @Override // g0.u1
    public final void a() {
        c7.m1 m1Var = this.f3859h;
        if (m1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            m1Var.c(cancellationException);
        }
        this.f3859h = c7.a0.p(this.f3858g, null, null, this.f3857f, 3);
    }

    @Override // g0.u1
    public final void b() {
        c7.m1 m1Var = this.f3859h;
        if (m1Var != null) {
            m1Var.p(new s0());
        }
        this.f3859h = null;
    }

    @Override // g0.u1
    public final void c() {
        c7.m1 m1Var = this.f3859h;
        if (m1Var != null) {
            m1Var.p(new s0());
        }
        this.f3859h = null;
    }
}
