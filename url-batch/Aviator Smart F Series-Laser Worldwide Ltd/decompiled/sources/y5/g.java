package y5;

import kotlin.Result;

/* loaded from: classes3.dex */
public abstract class g {
    public static final Object createFailure(Throwable exception) {
        kotlin.jvm.internal.s.checkNotNullParameter(exception, "exception");
        return new Result.Failure(exception);
    }

    private static final <R, T> R fold(Object obj, f6.l onSuccess, f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        Throwable m351exceptionOrNullimpl = Result.m351exceptionOrNullimpl(obj);
        return m351exceptionOrNullimpl == null ? (R) onSuccess.invoke(obj) : (R) onFailure.invoke(m351exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <R, T extends R> R getOrDefault(Object obj, R r8) {
        return Result.m354isFailureimpl(obj) ? r8 : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <R, T extends R> R getOrElse(Object obj, f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        Throwable m351exceptionOrNullimpl = Result.m351exceptionOrNullimpl(obj);
        return m351exceptionOrNullimpl == null ? obj : (R) onFailure.invoke(m351exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> T getOrThrow(Object obj) {
        throwOnFailure(obj);
        return obj;
    }

    private static final <R, T> Object map(Object obj, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return Result.m355isSuccessimpl(obj) ? Result.m348constructorimpl(transform.invoke(obj)) : Result.m348constructorimpl(obj);
    }

    private static final <R, T> Object mapCatching(Object obj, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        if (!Result.m355isSuccessimpl(obj)) {
            return Result.m348constructorimpl(obj);
        }
        try {
            return Result.m348constructorimpl(transform.invoke(obj));
        } catch (Throwable th) {
            Result.a aVar = Result.Companion;
            return Result.m348constructorimpl(createFailure(th));
        }
    }

    private static final <T> Object onFailure(Object obj, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        Throwable m351exceptionOrNullimpl = Result.m351exceptionOrNullimpl(obj);
        if (m351exceptionOrNullimpl != null) {
            action.invoke(m351exceptionOrNullimpl);
        }
        return obj;
    }

    private static final <T> Object onSuccess(Object obj, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        if (Result.m355isSuccessimpl(obj)) {
            action.invoke(obj);
        }
        return obj;
    }

    private static final <R, T extends R> Object recover(Object obj, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Throwable m351exceptionOrNullimpl = Result.m351exceptionOrNullimpl(obj);
        return m351exceptionOrNullimpl == null ? obj : Result.m348constructorimpl(transform.invoke(m351exceptionOrNullimpl));
    }

    private static final <R, T extends R> Object recoverCatching(Object obj, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        Throwable m351exceptionOrNullimpl = Result.m351exceptionOrNullimpl(obj);
        if (m351exceptionOrNullimpl == null) {
            return obj;
        }
        try {
            return Result.m348constructorimpl(transform.invoke(m351exceptionOrNullimpl));
        } catch (Throwable th) {
            Result.a aVar = Result.Companion;
            return Result.m348constructorimpl(createFailure(th));
        }
    }

    private static final <R> Object runCatching(f6.a block) {
        kotlin.jvm.internal.s.checkNotNullParameter(block, "block");
        try {
            Result.a aVar = Result.Companion;
            return Result.m348constructorimpl(block.invoke());
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            return Result.m348constructorimpl(createFailure(th));
        }
    }

    public static final void throwOnFailure(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }

    private static final <T, R> Object runCatching(T t7, f6.l block) {
        kotlin.jvm.internal.s.checkNotNullParameter(block, "block");
        try {
            Result.a aVar = Result.Companion;
            return Result.m348constructorimpl(block.invoke(t7));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            return Result.m348constructorimpl(createFailure(th));
        }
    }
}
