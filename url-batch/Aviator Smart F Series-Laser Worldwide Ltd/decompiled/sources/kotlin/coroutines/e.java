package kotlin.coroutines;

import f6.l;
import f6.p;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import y5.g;
import y5.w;

/* loaded from: classes4.dex */
public abstract class e {

    public static final class a implements c {
        final /* synthetic */ CoroutineContext $context;
        final /* synthetic */ l $resumeWith;

        public a(CoroutineContext coroutineContext, l lVar) {
            this.$context = coroutineContext;
            this.$resumeWith = lVar;
        }

        @Override // kotlin.coroutines.c
        public CoroutineContext getContext() {
            return this.$context;
        }

        @Override // kotlin.coroutines.c
        public void resumeWith(Object obj) {
            this.$resumeWith.invoke(Result.m347boximpl(obj));
        }
    }

    private static final <T> c Continuation(CoroutineContext context, l resumeWith) {
        s.checkNotNullParameter(context, "context");
        s.checkNotNullParameter(resumeWith, "resumeWith");
        return new a(context, resumeWith);
    }

    public static final <T> c createCoroutine(l lVar, c completion) {
        c createCoroutineUnintercepted;
        c intercepted;
        Object coroutine_suspended;
        s.checkNotNullParameter(lVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(lVar, completion);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(createCoroutineUnintercepted);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return new f(intercepted, coroutine_suspended);
    }

    private static final CoroutineContext getCoroutineContext() {
        throw new NotImplementedError("Implemented as intrinsic");
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    private static final <T> void resume(c cVar, T t7) {
        s.checkNotNullParameter(cVar, "<this>");
        cVar.resumeWith(Result.m348constructorimpl(t7));
    }

    private static final <T> void resumeWithException(c cVar, Throwable exception) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(exception, "exception");
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m348constructorimpl(g.createFailure(exception)));
    }

    public static final <T> void startCoroutine(l lVar, c completion) {
        c createCoroutineUnintercepted;
        c intercepted;
        s.checkNotNullParameter(lVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(lVar, completion);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(createCoroutineUnintercepted);
        Result.a aVar = Result.Companion;
        intercepted.resumeWith(Result.m348constructorimpl(w.INSTANCE));
    }

    private static final <T> Object suspendCoroutine(l lVar, c cVar) {
        c intercepted;
        Object coroutine_suspended;
        r.mark(0);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        f fVar = new f(intercepted);
        lVar.invoke(fVar);
        Object orThrow = fVar.getOrThrow();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (orThrow == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        r.mark(1);
        return orThrow;
    }

    public static final <R, T> c createCoroutine(p pVar, R r8, c completion) {
        c createCoroutineUnintercepted;
        c intercepted;
        Object coroutine_suspended;
        s.checkNotNullParameter(pVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(pVar, r8, completion);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(createCoroutineUnintercepted);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return new f(intercepted, coroutine_suspended);
    }

    public static final <R, T> void startCoroutine(p pVar, R r8, c completion) {
        c createCoroutineUnintercepted;
        c intercepted;
        s.checkNotNullParameter(pVar, "<this>");
        s.checkNotNullParameter(completion, "completion");
        createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(pVar, r8, completion);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(createCoroutineUnintercepted);
        Result.a aVar = Result.Companion;
        intercepted.resumeWith(Result.m348constructorimpl(w.INSTANCE));
    }
}
