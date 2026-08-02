package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements Function3 {
    public static final JobSupport$onAwaitInternal$2 INSTANCE = new JobSupport$onAwaitInternal$2(3, JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport._state$volatile$FU;
        ((JobSupport) obj).getClass();
        if (obj3 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) obj3).cause;
        }
        return obj3;
    }
}
