package kotlinx.coroutines;

import com.google.mlkit.vision.face.internal.zzm;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsArguments;
import com.withpersona.sdk2.inquiry.ui.MdocHelperKt;
import com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$WorkflowWorkerWithHandler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $block;
    public final /* synthetic */ int $r8$classId = 1;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(VerifyReusablePersonaWorker verifyReusablePersonaWorker, String str, Continuation continuation) {
        super(2, continuation);
        this.L$0 = verifyReusablePersonaWorker;
        this.$block = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$block;
        switch (i) {
            case 0:
                InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2((Function0) obj2, continuation);
                interruptibleKt$runInterruptible$2.L$0 = obj;
                return interruptibleKt$runInterruptible$2;
            case 1:
                return new InterruptibleKt$runInterruptible$2((VerifyReusablePersonaWorker) this.L$0, (String) obj2, continuation);
            default:
                return new InterruptibleKt$runInterruptible$2((WorkflowContextAdapter$WorkflowWorkerWithHandler) obj2, this.L$0, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InterruptibleKt$runInterruptible$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.$r8$classId;
        Object obj2 = this.$block;
        switch (i2) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
                Function0 function0 = (Function0) obj2;
                try {
                    ThreadState threadState = new ThreadState();
                    threadState.cancelHandle = JobKt.invokeOnCompletion$default(JobKt.getJob(coroutineContext), threadState);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ThreadState._state$volatile$FU;
                    try {
                        do {
                            i = atomicIntegerFieldUpdater.get(threadState);
                            if (i != 0) {
                                if (i != 2 && i != 3) {
                                    ThreadState.invalidState(i);
                                    throw null;
                                }
                            }
                            return function0.invoke();
                        } while (!atomicIntegerFieldUpdater.compareAndSet(threadState, i, 0));
                        return function0.invoke();
                    } finally {
                        threadState.clearInterrupt();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                VerifyReusablePersonaWorker verifyReusablePersonaWorker = (VerifyReusablePersonaWorker) this.L$0;
                verifyReusablePersonaWorker.customTabsLauncher.launch(new CustomTabsArguments(new zzm().build(), MdocHelperKt.createReusablePersonaUrl(verifyReusablePersonaWorker.url, (String) obj2, verifyReusablePersonaWorker.componentName)));
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((WorkflowContextAdapter$WorkflowWorkerWithHandler) obj2).handler.invoke(this.L$0);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(WorkflowContextAdapter$WorkflowWorkerWithHandler workflowContextAdapter$WorkflowWorkerWithHandler, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$block = workflowContextAdapter$WorkflowWorkerWithHandler;
        this.L$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$block = function0;
    }
}
