package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class BaseContinuationImpl implements kotlin.coroutines.c, c, Serializable {
    private final kotlin.coroutines.c completion;

    public BaseContinuationImpl(kotlin.coroutines.c cVar) {
        this.completion = cVar;
    }

    public kotlin.coroutines.c create(kotlin.coroutines.c completion) {
        s.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public c getCallerFrame() {
        kotlin.coroutines.c cVar = this.completion;
        if (cVar instanceof c) {
            return (c) cVar;
        }
        return null;
    }

    public final kotlin.coroutines.c getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.c
    public abstract /* synthetic */ CoroutineContext getContext();

    @Override // kotlin.coroutines.jvm.internal.c
    public StackTraceElement getStackTraceElement() {
        return e.getStackTraceElement(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object coroutine_suspended;
        kotlin.coroutines.c cVar = this;
        while (true) {
            f.probeCoroutineResumed(cVar);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            kotlin.coroutines.c cVar2 = baseContinuationImpl.completion;
            s.checkNotNull(cVar2);
            try {
                invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            } catch (Throwable th) {
                Result.a aVar = Result.Companion;
                obj = Result.m348constructorimpl(y5.g.createFailure(th));
            }
            if (invokeSuspend == coroutine_suspended) {
                return;
            }
            obj = Result.m348constructorimpl(invokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (!(cVar2 instanceof BaseContinuationImpl)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public kotlin.coroutines.c create(Object obj, kotlin.coroutines.c completion) {
        s.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
