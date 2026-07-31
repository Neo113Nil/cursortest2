package c7;

import a7.a1;
import a7.t0;
import a7.x;
import a7.z0;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o extends a7.a implements p, g {

    /* renamed from: g, reason: collision with root package name */
    public final c f1803g;

    public o(g6.h hVar, c cVar) {
        super(hVar, true);
        this.f1803g = cVar;
    }

    @Override // a7.a1
    public final void C(CancellationException cancellationException) {
        this.f1803g.f(cancellationException, true);
        B(cancellationException);
    }

    @Override // a7.a1, a7.s0
    public final void a(CancellationException cancellationException) {
        Object obj = a1.f240d.get(this);
        if (obj instanceof a7.o) {
            return;
        }
        if ((obj instanceof z0) && ((z0) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new t0(E(), null, this);
        }
        C(cancellationException);
    }

    @Override // a7.a
    public final void f0(Throwable th, boolean z3) {
        if (this.f1803g.f(th, false) || z3) {
            return;
        }
        x.j(this.f239f, th);
    }

    @Override // a7.a
    public final void g0(Object obj) {
        this.f1803g.f(null, false);
    }

    @Override // c7.r
    public final Object i(g6.c cVar, Object obj) {
        return this.f1803g.i(cVar, obj);
    }

    @Override // c7.q
    public final b iterator() {
        c cVar = this.f1803g;
        cVar.getClass();
        return new b(cVar);
    }

    @Override // c7.q
    public final Object s() {
        return this.f1803g.s();
    }

    @Override // c7.r
    public final Object t(Object obj) {
        return this.f1803g.t(obj);
    }

    @Override // c7.q
    public final Object x(i6.i iVar) {
        return this.f1803g.x(iVar);
    }
}
