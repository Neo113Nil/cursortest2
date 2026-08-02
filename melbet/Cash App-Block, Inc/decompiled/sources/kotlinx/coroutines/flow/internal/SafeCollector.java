package kotlinx.coroutines.flow.internal;

import androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes3.dex */
public final class SafeCollector extends ContinuationImpl implements FlowCollector {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final FlowCollector collector;
    public Continuation completion_;
    public CoroutineContext lastEmissionContext;

    public SafeCollector(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        super(NoOpContinuation.INSTANCE, EmptyCoroutineContext.INSTANCE);
        this.collector = flowCollector;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, new SaversKt$$ExternalSyntheticLambda5(15))).intValue();
    }

    public final Object emit(Continuation continuation, Object obj) {
        CoroutineContext context = continuation.getContext();
        JobKt.ensureActive(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            if (coroutineContext instanceof DownstreamExceptionContext) {
                a$$ExternalSyntheticBUOutline0.m1430m((Object) StringsKt__IndentKt.replaceIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((DownstreamExceptionContext) coroutineContext).e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                return null;
            }
            if (((Number) context.fold(0, new ComposerKt$$ExternalSyntheticLambda0(this, 14))).intValue() != this.collectContextSize) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.collectContext + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.lastEmissionContext = context;
        }
        this.completion_ = continuation;
        Function3 function3 = SafeCollectorKt.emitFun;
        FlowCollector flowCollector = this.collector;
        flowCollector.getClass();
        Object invoke = function3.invoke(flowCollector, obj, this);
        if (!Intrinsics.areEqual(invoke, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.completion_ = null;
        }
        return invoke;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.completion_;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
        if (m4120exceptionOrNullimpl != null) {
            this.lastEmissionContext = new DownstreamExceptionContext(getContext(), m4120exceptionOrNullimpl);
        }
        Continuation continuation = this.completion_;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        try {
            Object emit = emit(continuation, obj);
            return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
        } catch (Throwable th) {
            this.lastEmissionContext = new DownstreamExceptionContext(continuation.getContext(), th);
            throw th;
        }
    }
}
