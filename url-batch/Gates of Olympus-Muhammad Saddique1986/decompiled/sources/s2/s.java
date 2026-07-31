package s2;

import java.util.concurrent.CancellationException;
import n.AbstractC0695v;
import q2.AbstractC0814a;
import q2.AbstractC0837y;
import q2.C0829p;
import q2.Y;
import q2.e0;
import q2.f0;

/* loaded from: classes.dex */
public final class s extends AbstractC0814a implements t, k {

    /* renamed from: g, reason: collision with root package name */
    public final g f8416g;

    public s(V1.i iVar, g gVar) {
        super(iVar, true);
        this.f8416g = gVar;
    }

    @Override // q2.f0
    public final void F(CancellationException cancellationException) {
        this.f8416g.k(cancellationException, true);
        E(cancellationException);
    }

    @Override // q2.f0, q2.X
    public final void a(CancellationException cancellationException) {
        Object obj = f0.f7895d.get(this);
        if (obj instanceof C0829p) {
            return;
        }
        if ((obj instanceof e0) && ((e0) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Y(H(), null, this);
        }
        F(cancellationException);
    }

    @Override // s2.v
    public final Object c(u2.s sVar) {
        g gVar = this.f8416g;
        gVar.getClass();
        return g.D(gVar, sVar);
    }

    @Override // s2.w
    public final Object f(V1.d dVar, Object obj) {
        return this.f8416g.f(dVar, obj);
    }

    @Override // s2.v
    public final Object i(X1.i iVar) {
        return this.f8416g.i(iVar);
    }

    @Override // q2.AbstractC0814a
    public final void i0(Throwable th, boolean z3) {
        if (this.f8416g.k(th, false) || z3) {
            return;
        }
        AbstractC0837y.m(this.f7877f, th);
    }

    @Override // s2.v
    public final C0969c iterator() {
        g gVar = this.f8416g;
        gVar.getClass();
        return new C0969c(gVar);
    }

    @Override // q2.AbstractC0814a
    public final void j0(Object obj) {
        AbstractC0695v.h(this.f8416g);
    }

    @Override // s2.v
    public final Object o() {
        return this.f8416g.o();
    }

    @Override // s2.w
    public final Object p(Object obj) {
        return this.f8416g.p(obj);
    }
}
