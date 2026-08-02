package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1;

/* loaded from: classes9.dex */
public final class DeepRecursiveScopeImpl extends DeepRecursiveScope implements Continuation {
    public Continuation cont;
    public JsonTreeReader$readDeepRecursive$1 function;
    public Object result;
    public Unit value;

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.cont = null;
        this.result = obj;
    }
}
