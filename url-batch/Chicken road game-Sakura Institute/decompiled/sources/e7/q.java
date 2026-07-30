package e7;

import c7.a0;
import c7.e1;
import c7.f1;
import c7.y0;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends c7.a implements r, i {

    /* renamed from: i, reason: collision with root package name */
    public final e f2886i;

    public q(h6.i iVar, e eVar) {
        super(iVar, true);
        this.f2886i = eVar;
    }

    @Override // e7.t
    public final Object a(j6.i iVar) {
        return this.f2886i.a(iVar);
    }

    @Override // c7.f1, c7.x0
    public final void c(CancellationException cancellationException) {
        Object obj = f1.f1692f.get(this);
        if (obj instanceof c7.p) {
            return;
        }
        if ((obj instanceof e1) && ((e1) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new y0(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // e7.t
    public final Object d() {
        return this.f2886i.d();
    }

    @Override // c7.a
    public final void d0(Throwable th, boolean z8) {
        if (this.f2886i.k(th, false) || z8) {
            return;
        }
        a0.l(this.f1659h, th);
    }

    @Override // e7.u
    public final Object e(Object obj) {
        return this.f2886i.e(obj);
    }

    @Override // c7.a
    public final void e0(Object obj) {
        r4.a.q(this.f2886i);
    }

    @Override // e7.t
    public final Object f(g7.p pVar) {
        e eVar = this.f2886i;
        eVar.getClass();
        return e.B(eVar, pVar);
    }

    @Override // e7.u
    public final Object h(h6.d dVar, Object obj) {
        return this.f2886i.h(dVar, obj);
    }

    @Override // e7.t
    public final b iterator() {
        e eVar = this.f2886i;
        eVar.getClass();
        return new b(eVar);
    }

    @Override // c7.f1
    public final void p(CancellationException cancellationException) {
        this.f2886i.k(cancellationException, true);
        m(cancellationException);
    }
}
