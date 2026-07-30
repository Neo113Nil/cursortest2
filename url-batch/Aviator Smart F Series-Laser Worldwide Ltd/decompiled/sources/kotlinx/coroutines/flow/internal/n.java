package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
final class n implements kotlin.coroutines.c, kotlin.coroutines.jvm.internal.c {
    private final CoroutineContext context;
    private final kotlin.coroutines.c uCont;

    public n(kotlin.coroutines.c cVar, CoroutineContext coroutineContext) {
        this.uCont = cVar;
        this.context = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c cVar = this.uCont;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(Object obj) {
        this.uCont.resumeWith(obj);
    }
}
