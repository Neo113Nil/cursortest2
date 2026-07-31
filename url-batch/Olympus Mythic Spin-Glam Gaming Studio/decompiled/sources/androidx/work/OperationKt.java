package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: Operation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"await", "Landroidx/work/Operation$State$SUCCESS;", "Landroidx/work/Operation;", "(Landroidx/work/Operation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "work-runtime-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class OperationKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object await(Operation operation, Continuation continuation) {
        OperationKt$await$1 operationKt$await$1;
        int i;
        Object obj;
        if (continuation instanceof OperationKt$await$1) {
            operationKt$await$1 = (OperationKt$await$1) continuation;
            int i2 = operationKt$await$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                operationKt$await$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = operationKt$await$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = operationKt$await$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    ListenableFuture result = operation.getResult();
                    Intrinsics.checkNotNullExpressionValue(result, "result");
                    if (result.isDone()) {
                        try {
                            obj = result.get();
                            Intrinsics.checkNotNullExpressionValue(obj, "result.await()");
                            return obj;
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            if (cause == null) {
                                throw e;
                            }
                            throw cause;
                        }
                    }
                    operationKt$await$1.L$0 = result;
                    operationKt$await$1.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(operationKt$await$1), 1);
                    cancellableContinuationImpl.initCancellability();
                    result.addListener(new ListenableFutureKt$await$2$1(cancellableContinuationImpl, result), DirectExecutor.INSTANCE);
                    cancellableContinuationImpl.invokeOnCancellation(new ListenableFutureKt$await$2$2(result));
                    obj2 = cancellableContinuationImpl.getResult();
                    if (obj2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(operationKt$await$1);
                    }
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                obj = obj2;
                Intrinsics.checkNotNullExpressionValue(obj, "result.await()");
                return obj;
            }
        }
        operationKt$await$1 = new OperationKt$await$1(continuation);
        Object obj22 = operationKt$await$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = operationKt$await$1.label;
        if (i != 0) {
        }
        obj = obj22;
        Intrinsics.checkNotNullExpressionValue(obj, "result.await()");
        return obj;
    }
}
