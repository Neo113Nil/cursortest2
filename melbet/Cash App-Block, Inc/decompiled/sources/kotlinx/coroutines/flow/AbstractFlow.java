package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class AbstractFlow implements Flow {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        AbstractFlow$collect$1 abstractFlow$collect$1;
        int i;
        SafeCollector safeCollector;
        if (continuation instanceof AbstractFlow$collect$1) {
            abstractFlow$collect$1 = (AbstractFlow$collect$1) continuation;
            int i2 = abstractFlow$collect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                abstractFlow$collect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = abstractFlow$collect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = abstractFlow$collect$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeCollector safeCollector2 = new SafeCollector(flowCollector, abstractFlow$collect$1.getContext());
                    try {
                        abstractFlow$collect$1.L$1 = safeCollector2;
                        abstractFlow$collect$1.label = 1;
                        if (collectSafely(safeCollector2, abstractFlow$collect$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        safeCollector = safeCollector2;
                    } catch (Throwable th) {
                        th = th;
                        safeCollector = safeCollector2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    safeCollector = abstractFlow$collect$1.L$1;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                safeCollector.releaseIntercepted();
                return Unit.INSTANCE;
            }
        }
        abstractFlow$collect$1 = new AbstractFlow$collect$1(this, continuation);
        Object obj2 = abstractFlow$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = abstractFlow$collect$1.label;
        if (i != 0) {
        }
        safeCollector.releaseIntercepted();
        return Unit.INSTANCE;
    }

    public abstract Object collectSafely(SafeCollector safeCollector, AbstractFlow$collect$1 abstractFlow$collect$1);
}
