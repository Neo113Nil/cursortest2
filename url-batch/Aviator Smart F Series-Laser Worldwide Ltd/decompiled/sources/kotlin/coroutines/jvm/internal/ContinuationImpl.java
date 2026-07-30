package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final CoroutineContext _context;
    private transient kotlin.coroutines.c intercepted;

    public ContinuationImpl(kotlin.coroutines.c cVar, CoroutineContext coroutineContext) {
        super(cVar);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.c
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        s.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    public final kotlin.coroutines.c intercepted() {
        kotlin.coroutines.c cVar = this.intercepted;
        if (cVar == null) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().get(kotlin.coroutines.d.Key);
            if (dVar == null || (cVar = dVar.interceptContinuation(this)) == null) {
                cVar = this;
            }
            this.intercepted = cVar;
        }
        return cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected void releaseIntercepted() {
        kotlin.coroutines.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            CoroutineContext.a aVar = getContext().get(kotlin.coroutines.d.Key);
            s.checkNotNull(aVar);
            ((kotlin.coroutines.d) aVar).releaseInterceptedContinuation(cVar);
        }
        this.intercepted = b.INSTANCE;
    }

    public ContinuationImpl(kotlin.coroutines.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
