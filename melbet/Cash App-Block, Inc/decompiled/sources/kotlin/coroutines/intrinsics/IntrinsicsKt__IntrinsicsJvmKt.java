package kotlin.coroutines.intrinsics;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import papa.SafeTrace;

/* loaded from: classes.dex */
public class IntrinsicsKt__IntrinsicsJvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation createCoroutineUnintercepted(final Continuation continuation, final Continuation continuation2, final Function2 function2) {
        function2.getClass();
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(continuation, continuation2);
        }
        final CoroutineContext context = continuation2.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(continuation2) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            public int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("This coroutine had already completed");
                        return null;
                    }
                    this.label = 2;
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                this.label = 1;
                SafeTrace.throwOnFailure(obj);
                Function2 function22 = function2;
                function22.getClass();
                TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, function22);
                return function22.invoke(continuation, this);
            }
        } : new ContinuationImpl(continuation2, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            public int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("This coroutine had already completed");
                        return null;
                    }
                    this.label = 2;
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                this.label = 1;
                SafeTrace.throwOnFailure(obj);
                Function2 function22 = function2;
                function22.getClass();
                TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, function22);
                return function22.invoke(continuation, this);
            }
        };
    }

    public static Continuation intercepted(Continuation continuation) {
        Continuation<Object> intercepted;
        continuation.getClass();
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) ? continuation : intercepted;
    }

    public static Object wrapWithContinuationImpl(Function2 function2, Object obj, Continuation continuation) {
        function2.getClass();
        CoroutineContext context = continuation.getContext();
        Object intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = context == EmptyCoroutineContext.INSTANCE ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(continuation) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(continuation, context);
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, function2);
        return function2.invoke(obj, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
    }
}
