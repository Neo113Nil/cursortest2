package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class g implements kotlinx.coroutines.i0 {
    private final CoroutineContext coroutineContext;

    public g(CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
    }

    @Override // kotlinx.coroutines.i0
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
