package p6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import l0.C0654a;
import n6.AbstractC0768a;
import n6.AbstractC0792z;
import n6.C0784q;
import n6.Y;
import n6.e0;
import n6.f0;

/* loaded from: classes.dex */
public final class p extends AbstractC0768a implements q, g {

    /* renamed from: l, reason: collision with root package name */
    public final c f7263l;

    public p(CoroutineContext coroutineContext, c cVar) {
        super(coroutineContext, true);
        this.f7263l = cVar;
    }

    @Override // n6.AbstractC0768a
    public final void W(Throwable th, boolean z7) {
        if (this.f7263l.h(th, false) || z7) {
            return;
        }
        AbstractC0792z.i(th, this.f7037i);
    }

    @Override // n6.AbstractC0768a
    public final void X(Object obj) {
        this.f7263l.h(null, false);
    }

    public final void Z(o oVar) {
        c cVar = this.f7263l;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f7230r;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, oVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    C0654a c0654a = e.f7248q;
                    if (obj != c0654a) {
                        if (obj == e.f7249r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    C0654a c0654a2 = e.f7249r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, c0654a, c0654a2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != c0654a) {
                            break;
                        }
                    }
                    oVar.invoke(cVar.n());
                    return;
                }
            }
        }
    }

    @Override // p6.r
    public final Object b(V5.b bVar) {
        return this.f7263l.b(bVar);
    }

    @Override // n6.f0, n6.X
    public final void d(CancellationException cancellationException) {
        Object obj = f0.f7054d.get(this);
        if (obj instanceof C0784q) {
            return;
        }
        if ((obj instanceof e0) && ((e0) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Y(q(), null, this);
        }
        o(cancellationException);
    }

    @Override // p6.s
    public final Object f(V5.b bVar, Object obj) {
        return this.f7263l.f(bVar, obj);
    }

    @Override // p6.s
    public final Object i(Object obj) {
        return this.f7263l.i(obj);
    }

    @Override // n6.f0
    public final void o(CancellationException cancellationException) {
        this.f7263l.h(cancellationException, true);
        n(cancellationException);
    }
}
