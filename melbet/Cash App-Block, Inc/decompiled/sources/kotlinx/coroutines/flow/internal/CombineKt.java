package kotlinx.coroutines.flow.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.time.DurationKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class CombineKt {
    public static final Continuation[] EMPTY_RESUMES = new Continuation[0];
    public static final Symbol NULL = new Symbol("NULL", 0);
    public static final Symbol UNINITIALIZED = new Symbol("UNINITIALIZED", 0);
    public static final Symbol DONE = new Symbol("DONE", 0);

    public static final Object combineInternal(Continuation continuation, Function0 function0, Function3 function3, FlowCollector flowCollector, Flow[] flowArr) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(null, function0, function3, flowCollector, flowArr);
        FlowCoroutine flowCoroutine = new FlowCoroutine(continuation, continuation.getContext());
        Object startUndispatched = DurationKt.startUndispatched(flowCoroutine, true, flowCoroutine, combineKt$combineInternal$2);
        return startUndispatched == CoroutineSingletons.COROUTINE_SUSPENDED ? startUndispatched : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object withContextUndispatched(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation) {
        ChannelFlowKt$withContextUndispatched$1 channelFlowKt$withContextUndispatched$1;
        int i;
        Object updateThreadContext;
        Object invoke;
        if (continuation instanceof ChannelFlowKt$withContextUndispatched$1) {
            channelFlowKt$withContextUndispatched$1 = (ChannelFlowKt$withContextUndispatched$1) continuation;
            int i2 = channelFlowKt$withContextUndispatched$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                channelFlowKt$withContextUndispatched$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = channelFlowKt$withContextUndispatched$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = channelFlowKt$withContextUndispatched$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    updateThreadContext = ThreadContextKt.updateThreadContext(coroutineContext, obj2);
                    try {
                        channelFlowKt$withContextUndispatched$1.L$0 = coroutineContext;
                        channelFlowKt$withContextUndispatched$1.L$1 = obj;
                        channelFlowKt$withContextUndispatched$1.L$4 = coroutineContext;
                        channelFlowKt$withContextUndispatched$1.L$6 = updateThreadContext;
                        channelFlowKt$withContextUndispatched$1.label = 1;
                        StackFrameContinuation stackFrameContinuation = new StackFrameContinuation(channelFlowKt$withContextUndispatched$1, coroutineContext);
                        if (function2 == null) {
                            invoke = IntrinsicsKt__IntrinsicsJvmKt.wrapWithContinuationImpl(function2, obj, stackFrameContinuation);
                        } else {
                            TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, function2);
                            invoke = function2.invoke(obj, stackFrameContinuation);
                        }
                        obj3 = invoke;
                        if (obj3 == obj4) {
                            return obj4;
                        }
                    } catch (Throwable th) {
                        th = th;
                        ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj5 = channelFlowKt$withContextUndispatched$1.L$6;
                    CoroutineContext coroutineContext2 = channelFlowKt$withContextUndispatched$1.L$4;
                    try {
                        SafeTrace.throwOnFailure(obj3);
                        updateThreadContext = obj5;
                        coroutineContext = coroutineContext2;
                    } catch (Throwable th2) {
                        updateThreadContext = obj5;
                        coroutineContext = coroutineContext2;
                        th = th2;
                        ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
                        throw th;
                    }
                }
                ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
                return obj3;
            }
        }
        channelFlowKt$withContextUndispatched$1 = new ChannelFlowKt$withContextUndispatched$1(continuation);
        Object obj32 = channelFlowKt$withContextUndispatched$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = channelFlowKt$withContextUndispatched$1.label;
        if (i != 0) {
        }
        ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
        return obj32;
    }
}
