package kotlinx.coroutines.flow.internal;

import f6.p;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;
import y5.w;

/* loaded from: classes5.dex */
final class UndispatchedContextCollector implements kotlinx.coroutines.flow.f {
    private final Object countOrElement;
    private final CoroutineContext emitContext;
    private final p emitRef;

    public UndispatchedContextCollector(kotlinx.coroutines.flow.f fVar, CoroutineContext coroutineContext) {
        this.emitContext = coroutineContext;
        this.countOrElement = ThreadContextKt.threadContextElements(coroutineContext);
        this.emitRef = new UndispatchedContextCollector$emitRef$1(fVar, null);
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(Object obj, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object withContextUndispatched = d.withContextUndispatched(this.emitContext, obj, this.countOrElement, this.emitRef, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return withContextUndispatched == coroutine_suspended ? withContextUndispatched : w.INSTANCE;
    }
}
