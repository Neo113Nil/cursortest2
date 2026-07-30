package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.g0;

/* loaded from: classes5.dex */
public abstract class u {
    private static final g0 NONE = new g0("NONE");
    private static final g0 PENDING = new g0("PENDING");

    public static final <T> j MutableStateFlow(T t7) {
        if (t7 == null) {
            t7 = (T) kotlinx.coroutines.flow.internal.l.NULL;
        }
        return new StateFlowImpl(t7);
    }

    public static final <T> e fuseStateFlow(t tVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return (((i8 < 0 || i8 >= 2) && i8 != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? o.fuseSharedFlow(tVar, coroutineContext, i8, bufferOverflow) : tVar;
    }

    public static final <T> T getAndUpdate(j jVar, f6.l lVar) {
        T t7;
        do {
            t7 = (T) jVar.getValue();
        } while (!jVar.compareAndSet(t7, lVar.invoke(t7)));
        return t7;
    }

    public static final <T> void update(j jVar, f6.l lVar) {
        Object value;
        do {
            value = jVar.getValue();
        } while (!jVar.compareAndSet(value, lVar.invoke(value)));
    }

    public static final <T> T updateAndGet(j jVar, f6.l lVar) {
        Object value;
        T t7;
        do {
            value = jVar.getValue();
            t7 = (T) lVar.invoke(value);
        } while (!jVar.compareAndSet(value, t7));
        return t7;
    }
}
