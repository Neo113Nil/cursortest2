package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class o {
    public abstract Object yield(Object obj, kotlin.coroutines.c cVar);

    public final Object yieldAll(Iterable<Object> iterable, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return y5.w.INSTANCE;
        }
        Object yieldAll = yieldAll(iterable.iterator(), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return yieldAll == coroutine_suspended ? yieldAll : y5.w.INSTANCE;
    }

    public abstract Object yieldAll(Iterator<Object> it, kotlin.coroutines.c cVar);

    public final Object yieldAll(m mVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object yieldAll = yieldAll(mVar.iterator(), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return yieldAll == coroutine_suspended ? yieldAll : y5.w.INSTANCE;
    }
}
