package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes3.dex */
final class u1 extends c2 {
    private final kotlin.coroutines.c continuation;

    public u1(CoroutineContext coroutineContext, f6.p pVar) {
        super(coroutineContext, false);
        kotlin.coroutines.c createCoroutineUnintercepted;
        createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(pVar, this, this);
        this.continuation = createCoroutineUnintercepted;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void onStart() {
        l6.a.startCoroutineCancellable(this.continuation, this);
    }
}
