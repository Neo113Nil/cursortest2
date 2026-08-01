package n0;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q0 implements a2, ge.v {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f6789d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f6790e;

    /* renamed from: i, reason: collision with root package name */
    public final le.d f6791i;

    /* renamed from: r, reason: collision with root package name */
    public ge.r1 f6792r;

    public q0(CoroutineContext coroutineContext, Function2 function2) {
        this.f6789d = coroutineContext;
        this.f6790e = function2;
        this.f6791i = ge.a0.b(coroutineContext.p(this));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext F(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // ge.v
    public final void J(Throwable th, CoroutineContext coroutineContext) {
        c1.f fVar = (c1.f) coroutineContext.m(c1.f.f1481e);
        if (fVar != null) {
            g8.b.N(th, new a4.a(1, fVar, this));
        }
        ge.v vVar = (ge.v) this.f6789d.m(ge.u.f4402d);
        if (vVar == null) {
            throw th;
        }
        vVar.J(th, coroutineContext);
    }

    @Override // n0.a2
    public final void b() {
        ge.r1 r1Var = this.f6792r;
        if (r1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            r1Var.q(cancellationException);
        }
        this.f6792r = ge.a0.s(this.f6791i, null, this.f6790e, 3);
    }

    @Override // n0.a2
    public final void c() {
        ge.r1 r1Var = this.f6792r;
        if (r1Var != null) {
            r1Var.q(new d0(1));
        }
        this.f6792r = null;
    }

    @Override // n0.a2
    public final void e() {
        ge.r1 r1Var = this.f6792r;
        if (r1Var != null) {
            r1Var.q(new d0(1));
        }
        this.f6792r = null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return ge.u.f4402d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
