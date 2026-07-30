package X5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0786t;
import n6.C0775h;
import s6.AbstractC0898a;

/* loaded from: classes.dex */
public abstract class c extends a {
    private final CoroutineContext _context;
    private transient V5.b intercepted;

    public c(V5.b bVar, CoroutineContext coroutineContext) {
        super(bVar);
        this._context = coroutineContext;
    }

    @Override // V5.b
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.b(coroutineContext);
        return coroutineContext;
    }

    public final V5.b intercepted() {
        V5.b bVar = this.intercepted;
        if (bVar != null) {
            return bVar;
        }
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().g(kotlin.coroutines.d.f6145f);
        V5.b fVar = dVar != null ? new s6.f((AbstractC0786t) dVar, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override // X5.a
    public void releaseIntercepted() {
        V5.b bVar = this.intercepted;
        if (bVar != null && bVar != this) {
            CoroutineContext.Element g7 = getContext().g(kotlin.coroutines.d.f6145f);
            Intrinsics.b(g7);
            s6.f fVar = (s6.f) bVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s6.f.f7826p;
            while (atomicReferenceFieldUpdater.get(fVar) == AbstractC0898a.f7820c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0775h c0775h = obj instanceof C0775h ? (C0775h) obj : null;
            if (c0775h != null) {
                c0775h.o();
            }
        }
        this.intercepted = b.f2885d;
    }

    public c(V5.b bVar) {
        this(bVar, bVar != null ? bVar.getContext() : null);
    }
}
