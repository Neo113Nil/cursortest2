package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.JobSupport.SelectOnAwaitCompletionHandler;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;

/* loaded from: classes9.dex */
public final /* synthetic */ class JobSupport$onAwaitInternal$1 extends FunctionReferenceImpl implements Function3 {
    public static final JobSupport$onAwaitInternal$1 INSTANCE = new JobSupport$onAwaitInternal$1(3, JobSupport.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        JobSupport jobSupport = (JobSupport) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport._state$volatile$FU;
        while (true) {
            Object state$kotlinx_coroutines_core = jobSupport.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                    state$kotlinx_coroutines_core = JobKt.unboxState(state$kotlinx_coroutines_core);
                }
                ((SelectImplementation) selectInstance).internalResult = state$kotlinx_coroutines_core;
            } else if (jobSupport.startInternal(state$kotlinx_coroutines_core) >= 0) {
                ((SelectImplementation) selectInstance).disposableHandleOrSegment = JobKt.invokeOnCompletion$default(jobSupport, jobSupport.new SelectOnAwaitCompletionHandler(selectInstance));
                break;
            }
        }
        return Unit.INSTANCE;
    }
}
