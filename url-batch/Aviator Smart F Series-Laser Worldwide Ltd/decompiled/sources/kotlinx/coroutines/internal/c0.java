package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes5.dex */
public class c0 extends kotlinx.coroutines.a implements kotlin.coroutines.jvm.internal.c {
    public final kotlin.coroutines.c uCont;

    public c0(CoroutineContext coroutineContext, kotlin.coroutines.c cVar) {
        super(coroutineContext, true, true);
        this.uCont = cVar;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void afterCompletion(Object obj) {
        kotlin.coroutines.c intercepted;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.uCont);
        l.resumeCancellableWith$default(intercepted, kotlinx.coroutines.e0.recoverResult(obj, this.uCont), null, 2, null);
    }

    @Override // kotlinx.coroutines.a
    protected void afterResume(Object obj) {
        kotlin.coroutines.c cVar = this.uCont;
        cVar.resumeWith(kotlinx.coroutines.e0.recoverResult(obj, cVar));
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public final kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c cVar = this.uCont;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected final boolean isScopedCoroutine() {
        return true;
    }
}
