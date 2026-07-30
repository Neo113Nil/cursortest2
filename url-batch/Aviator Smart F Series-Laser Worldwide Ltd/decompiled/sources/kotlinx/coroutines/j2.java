package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes3.dex */
public final class j2 extends kotlinx.coroutines.internal.c0 {
    private volatile boolean threadLocalIsSet;
    private final ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j2(CoroutineContext coroutineContext, kotlin.coroutines.c cVar) {
        super(coroutineContext.get(r0) == null ? coroutineContext.plus(r0) : coroutineContext, cVar);
        k2 k2Var = k2.INSTANCE;
        this.threadStateToRecover = new ThreadLocal<>();
        if (cVar.getContext().get(kotlin.coroutines.d.Key) instanceof CoroutineDispatcher) {
            return;
        }
        Object updateThreadContext = ThreadContextKt.updateThreadContext(coroutineContext, null);
        ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
        saveThreadContext(coroutineContext, updateThreadContext);
    }

    @Override // kotlinx.coroutines.internal.c0, kotlinx.coroutines.a
    protected void afterResume(Object obj) {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
            if (pair != null) {
                ThreadContextKt.restoreThreadContext(pair.component1(), pair.component2());
            }
            this.threadStateToRecover.remove();
        }
        Object recoverResult = e0.recoverResult(obj, this.uCont);
        kotlin.coroutines.c cVar = this.uCont;
        CoroutineContext context = cVar.getContext();
        Object updateThreadContext = ThreadContextKt.updateThreadContext(context, null);
        j2 updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(cVar, context, updateThreadContext) : null;
        try {
            this.uCont.resumeWith(recoverResult);
            y5.w wVar = y5.w.INSTANCE;
        } finally {
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        }
    }

    public final boolean clearThreadContext() {
        boolean z7 = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z7;
    }

    public final void saveThreadContext(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(y5.h.to(coroutineContext, obj));
    }
}
