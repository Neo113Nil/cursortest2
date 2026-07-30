package kotlinx.coroutines.flow.internal;

import f6.p;
import f6.q;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.o1;
import y5.w;

/* loaded from: classes5.dex */
public final class SafeCollector<T> extends ContinuationImpl implements kotlinx.coroutines.flow.f {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final kotlinx.coroutines.flow.f collector;
    private kotlin.coroutines.c completion;
    private CoroutineContext lastEmissionContext;

    public SafeCollector(kotlinx.coroutines.flow.f fVar, CoroutineContext coroutineContext) {
        super(j.INSTANCE, EmptyCoroutineContext.INSTANCE);
        this.collector = fVar;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, new p() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            public final Integer invoke(int i8, CoroutineContext.a aVar) {
                return Integer.valueOf(i8 + 1);
            }

            @Override // f6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (CoroutineContext.a) obj2);
            }
        })).intValue();
    }

    private final void checkContext(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t7) {
        if (coroutineContext2 instanceof f) {
            exceptionTransparencyViolated((f) coroutineContext2, t7);
        }
        SafeCollector_commonKt.checkContext(this, coroutineContext);
    }

    private final void exceptionTransparencyViolated(f fVar, Object obj) {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + fVar.f17050e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(trimIndent.toString());
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(T t7, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        try {
            Object emit = emit(cVar, (kotlin.coroutines.c) t7);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (emit == coroutine_suspended) {
                kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
            }
            coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return emit == coroutine_suspended2 ? emit : w.INSTANCE;
        } catch (Throwable th) {
            this.lastEmissionContext = new f(th, cVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.c
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c cVar = this.completion;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.c
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.c
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Throwable m351exceptionOrNullimpl = Result.m351exceptionOrNullimpl(obj);
        if (m351exceptionOrNullimpl != null) {
            this.lastEmissionContext = new f(m351exceptionOrNullimpl, getContext());
        }
        kotlin.coroutines.c cVar = this.completion;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return coroutine_suspended;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    private final Object emit(kotlin.coroutines.c cVar, T t7) {
        q qVar;
        Object coroutine_suspended;
        CoroutineContext context = cVar.getContext();
        o1.ensureActive(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            checkContext(context, coroutineContext, t7);
            this.lastEmissionContext = context;
        }
        this.completion = cVar;
        qVar = SafeCollectorKt.emitFun;
        kotlinx.coroutines.flow.f fVar = this.collector;
        s.checkNotNull(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        s.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = qVar.invoke(fVar, t7, this);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (!s.areEqual(invoke, coroutine_suspended)) {
            this.completion = null;
        }
        return invoke;
    }
}
