package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;

/* loaded from: classes3.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.a implements kotlin.coroutines.d {
    public static final Key Key = new Key(null);

    public static final class Key extends kotlin.coroutines.b {
        public /* synthetic */ Key(kotlin.jvm.internal.o oVar) {
            this();
        }

        private Key() {
            super(kotlin.coroutines.d.Key, new f6.l() { // from class: kotlinx.coroutines.CoroutineDispatcher.Key.1
                @Override // f6.l
                public final CoroutineDispatcher invoke(CoroutineContext.a aVar) {
                    if (aVar instanceof CoroutineDispatcher) {
                        return (CoroutineDispatcher) aVar;
                    }
                    return null;
                }
            });
        }
    }

    public CoroutineDispatcher() {
        super(kotlin.coroutines.d.Key);
    }

    /* renamed from: dispatch */
    public abstract void mo1293dispatch(CoroutineContext coroutineContext, Runnable runnable);

    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        mo1293dispatch(coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b bVar) {
        return (E) d.a.get(this, bVar);
    }

    @Override // kotlin.coroutines.d
    public final <T> kotlin.coroutines.c interceptContinuation(kotlin.coroutines.c cVar) {
        return new kotlinx.coroutines.internal.k(this, cVar);
    }

    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return true;
    }

    public CoroutineDispatcher limitedParallelism(int i8) {
        kotlinx.coroutines.internal.q.checkParallelism(i8);
        return new kotlinx.coroutines.internal.p(this, i8);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return d.a.minusKey(this, bVar);
    }

    public final CoroutineDispatcher plus(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }

    @Override // kotlin.coroutines.d
    public final void releaseInterceptedContinuation(kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.s.checkNotNull(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((kotlinx.coroutines.internal.k) cVar).release$kotlinx_coroutines_core();
    }

    public String toString() {
        return k0.getClassSimpleName(this) + '@' + k0.getHexAddress(this);
    }
}
