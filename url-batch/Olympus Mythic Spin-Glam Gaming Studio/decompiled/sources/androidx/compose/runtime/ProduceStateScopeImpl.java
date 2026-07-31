package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: ProduceState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u00028\u00008\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/ProduceStateScopeImpl;", "T", "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/compose/runtime/MutableState;", "state", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "onDispose", "", "awaitDispose", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {
    private final /* synthetic */ MutableState $$delegate_0;
    private final CoroutineContext coroutineContext;

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public Object getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(Object obj) {
        this.$$delegate_0.setValue(obj);
    }

    public ProduceStateScopeImpl(MutableState mutableState, CoroutineContext coroutineContext) {
        this.$$delegate_0 = mutableState;
        this.coroutineContext = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitDispose(Function0 function0, Continuation continuation) {
        ProduceStateScopeImpl$awaitDispose$1 produceStateScopeImpl$awaitDispose$1;
        int i;
        try {
            if (continuation instanceof ProduceStateScopeImpl$awaitDispose$1) {
                produceStateScopeImpl$awaitDispose$1 = (ProduceStateScopeImpl$awaitDispose$1) continuation;
                int i2 = produceStateScopeImpl$awaitDispose$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    produceStateScopeImpl$awaitDispose$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = produceStateScopeImpl$awaitDispose$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = produceStateScopeImpl$awaitDispose$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        produceStateScopeImpl$awaitDispose$1.L$0 = function0;
                        produceStateScopeImpl$awaitDispose$1.label = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(produceStateScopeImpl$awaitDispose$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        Object result = cancellableContinuationImpl.getResult();
                        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(produceStateScopeImpl$awaitDispose$1);
                        }
                        if (result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (Function0) produceStateScopeImpl$awaitDispose$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }
            if (i != 0) {
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            function0.mo4828invoke();
            throw th;
        }
        produceStateScopeImpl$awaitDispose$1 = new ProduceStateScopeImpl$awaitDispose$1(this, continuation);
        Object obj2 = produceStateScopeImpl$awaitDispose$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = produceStateScopeImpl$awaitDispose$1.label;
    }
}
