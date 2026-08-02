package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes3.dex */
public final class FlowCoroutine extends ScopeCoroutine {
    @Override // kotlinx.coroutines.JobSupport
    public final boolean childCancelled(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th);
    }
}
