package kotlin.coroutines.jvm.internal;

import a2.AbstractC1241b;
import java.io.Serializable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class a implements kotlin.coroutines.d, e, Serializable {

    @Nullable
    private final kotlin.coroutines.d completion;

    public a(kotlin.coroutines.d dVar) {
        this.completion = dVar;
    }

    @NotNull
    public kotlin.coroutines.d create(@NotNull kotlin.coroutines.d completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public e getCallerFrame() {
        kotlin.coroutines.d dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Nullable
    public final kotlin.coroutines.d getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(@NotNull Object obj) {
        Object invokeSuspend;
        kotlin.coroutines.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            kotlin.coroutines.d dVar2 = aVar.completion;
            Intrinsics.checkNotNull(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                obj = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (invokeSuspend == AbstractC1241b.f()) {
                return;
            }
            obj = Result.m243constructorimpl(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    @NotNull
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

    @NotNull
    public kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
