package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes9.dex */
public final class SupervisorCoroutine extends ScopeCoroutine {
    public SupervisorCoroutine(CoroutineContext coroutineContext, ContinuationImpl continuationImpl) {
        super(continuationImpl, coroutineContext);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean childCancelled(Throwable th) {
        return false;
    }
}
