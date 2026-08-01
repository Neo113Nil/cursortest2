package nd;

import ge.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final CoroutineContext _context;
    private transient ld.a intercepted;

    public c(ld.a aVar) {
        this(aVar != null ? aVar.getContext() : null, aVar);
    }

    @Override // ld.a
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        coroutineContext.getClass();
        return coroutineContext;
    }

    public final ld.a intercepted() {
        ld.a aVar = this.intercepted;
        if (aVar != null) {
            return aVar;
        }
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().m(kotlin.coroutines.d.f5591n);
        ld.a gVar = dVar != null ? new le.g((t) dVar, this) : this;
        this.intercepted = gVar;
        return gVar;
    }

    @Override // nd.a
    public void releaseIntercepted() {
        ld.a aVar = this.intercepted;
        if (aVar != null && aVar != this) {
            CoroutineContext.Element m10 = getContext().m(kotlin.coroutines.d.f5591n);
            m10.getClass();
            le.g gVar = (le.g) aVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = le.g.f5972v;
            while (atomicReferenceFieldUpdater.get(gVar) == le.b.f5966c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            ge.h hVar = obj instanceof ge.h ? (ge.h) obj : null;
            if (hVar != null) {
                hVar.o();
            }
        }
        this.intercepted = b.f7244d;
    }

    public c(CoroutineContext coroutineContext, ld.a aVar) {
        super(aVar);
        this._context = coroutineContext;
    }
}
