package kotlinx.coroutines.flow.internal;

import f6.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes5.dex */
public abstract class d {
    public static final <T> ChannelFlow asChannelFlow(kotlinx.coroutines.flow.e eVar) {
        ChannelFlow channelFlow = eVar instanceof ChannelFlow ? (ChannelFlow) eVar : null;
        return channelFlow == null ? new e(eVar, null, 0, null, 14, null) : channelFlow;
    }

    public static final <T, V> Object withContextUndispatched(CoroutineContext coroutineContext, V v7, Object obj, p pVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object updateThreadContext = ThreadContextKt.updateThreadContext(coroutineContext, obj);
        try {
            Object invoke = ((p) x.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(v7, new n(cVar, coroutineContext));
            ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (invoke == coroutine_suspended) {
                kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
            }
            return invoke;
        } catch (Throwable th) {
            ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
            throw th;
        }
    }

    public static /* synthetic */ Object withContextUndispatched$default(CoroutineContext coroutineContext, Object obj, Object obj2, p pVar, kotlin.coroutines.c cVar, int i8, Object obj3) {
        if ((i8 & 4) != 0) {
            obj2 = ThreadContextKt.threadContextElements(coroutineContext);
        }
        return withContextUndispatched(coroutineContext, obj, obj2, pVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> kotlinx.coroutines.flow.f withUndispatchedContextCollector(kotlinx.coroutines.flow.f fVar, CoroutineContext coroutineContext) {
        return ((fVar instanceof m) || (fVar instanceof k)) ? fVar : new UndispatchedContextCollector(fVar, coroutineContext);
    }
}
