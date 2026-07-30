package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes5.dex */
public abstract class AbstractFlow implements e, a {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(f fVar, kotlin.coroutines.c cVar) {
        AbstractFlow$collect$1 abstractFlow$collect$1;
        Object coroutine_suspended;
        int i8;
        Throwable th;
        SafeCollector safeCollector;
        if (cVar instanceof AbstractFlow$collect$1) {
            abstractFlow$collect$1 = (AbstractFlow$collect$1) cVar;
            int i9 = abstractFlow$collect$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                abstractFlow$collect$1.label = i9 - Integer.MIN_VALUE;
                Object obj = abstractFlow$collect$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = abstractFlow$collect$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    SafeCollector safeCollector2 = new SafeCollector(fVar, abstractFlow$collect$1.getContext());
                    try {
                        abstractFlow$collect$1.L$0 = safeCollector2;
                        abstractFlow$collect$1.label = 1;
                        if (collectSafely(safeCollector2, abstractFlow$collect$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        safeCollector = safeCollector2;
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector = safeCollector2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    safeCollector = (SafeCollector) abstractFlow$collect$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                safeCollector.releaseIntercepted();
                return y5.w.INSTANCE;
            }
        }
        abstractFlow$collect$1 = new AbstractFlow$collect$1(this, cVar);
        Object obj2 = abstractFlow$collect$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = abstractFlow$collect$1.label;
        if (i8 != 0) {
        }
        safeCollector.releaseIntercepted();
        return y5.w.INSTANCE;
    }

    public abstract Object collectSafely(f fVar, kotlin.coroutines.c cVar);
}
