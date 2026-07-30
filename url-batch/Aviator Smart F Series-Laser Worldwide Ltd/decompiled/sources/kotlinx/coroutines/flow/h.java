package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.i;
import kotlinx.coroutines.l1;

/* loaded from: classes5.dex */
abstract /* synthetic */ class h {
    public static final <T> e buffer(e eVar, int i8, BufferOverflow bufferOverflow) {
        int i9;
        BufferOverflow bufferOverflow2;
        if (i8 < 0 && i8 != -2 && i8 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i8).toString());
        }
        if (i8 == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i8 == -1) {
            bufferOverflow2 = BufferOverflow.DROP_OLDEST;
            i9 = 0;
        } else {
            i9 = i8;
            bufferOverflow2 = bufferOverflow;
        }
        return eVar instanceof kotlinx.coroutines.flow.internal.i ? i.a.fuse$default((kotlinx.coroutines.flow.internal.i) eVar, null, i9, bufferOverflow2, 1, null) : new kotlinx.coroutines.flow.internal.e(eVar, null, i9, bufferOverflow2, 2, null);
    }

    public static /* synthetic */ e buffer$default(e eVar, int i8, BufferOverflow bufferOverflow, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -2;
        }
        if ((i9 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return g.buffer(eVar, i8, bufferOverflow);
    }

    public static final <T> e cancellable(e eVar) {
        return eVar instanceof a ? eVar : new CancellableFlowImpl(eVar);
    }

    private static final void checkFlowContext$FlowKt__ContextKt(CoroutineContext coroutineContext) {
        if (coroutineContext.get(l1.Key) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    public static final <T> e conflate(e eVar) {
        return buffer$default(eVar, -1, null, 2, null);
    }

    public static final <T> e flowOn(e eVar, CoroutineContext coroutineContext) {
        checkFlowContext$FlowKt__ContextKt(coroutineContext);
        return kotlin.jvm.internal.s.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE) ? eVar : eVar instanceof kotlinx.coroutines.flow.internal.i ? i.a.fuse$default((kotlinx.coroutines.flow.internal.i) eVar, coroutineContext, 0, null, 6, null) : new kotlinx.coroutines.flow.internal.e(eVar, coroutineContext, 0, null, 12, null);
    }

    public static /* synthetic */ e buffer$default(e eVar, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -2;
        }
        return buffer(eVar, i8);
    }

    public static final /* synthetic */ e buffer(e eVar, int i8) {
        return buffer$default(eVar, i8, null, 2, null);
    }
}
