package m2;

import java.util.concurrent.CancellationException;
import k2.AbstractC0529a;
import k2.AbstractC0552y;
import k2.C0544p;
import k2.Y;
import k2.e0;
import k2.f0;

/* loaded from: classes.dex */
public final class q extends AbstractC0529a implements r, i {

    /* renamed from: g, reason: collision with root package name */
    public final e f5977g;

    public q(P1.i iVar, e eVar) {
        super(iVar, true);
        this.f5977g = eVar;
    }

    @Override // k2.f0, k2.X
    public final void a(CancellationException cancellationException) {
        Object obj = f0.f5356d.get(this);
        if (obj instanceof C0544p) {
            return;
        }
        if ((obj instanceof e0) && ((e0) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Y(A(), null, this);
        }
        w(cancellationException);
    }

    @Override // m2.s
    public final Object c(R1.i iVar) {
        return this.f5977g.c(iVar);
    }

    @Override // m2.t
    public final Object d(P1.d dVar, Object obj) {
        return this.f5977g.d(dVar, obj);
    }

    @Override // k2.AbstractC0529a
    public final void e0(Throwable th, boolean z3) {
        if (this.f5977g.k(th, false) || z3) {
            return;
        }
        AbstractC0552y.l(this.f5338f, th);
    }

    @Override // m2.s
    public final Object f() {
        return this.f5977g.f();
    }

    @Override // k2.AbstractC0529a
    public final void f0(Object obj) {
        this.f5977g.k(null, false);
    }

    @Override // m2.t
    public final Object g(Object obj) {
        return this.f5977g.g(obj);
    }

    @Override // m2.s
    public final C0628c iterator() {
        e eVar = this.f5977g;
        eVar.getClass();
        return new C0628c(eVar);
    }

    @Override // k2.f0
    public final void w(CancellationException cancellationException) {
        this.f5977g.k(cancellationException, true);
        s(cancellationException);
    }
}
