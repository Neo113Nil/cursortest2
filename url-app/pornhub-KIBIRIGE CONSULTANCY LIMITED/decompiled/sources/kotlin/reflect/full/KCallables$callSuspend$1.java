package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: KCallables.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class KCallables$callSuspend$1<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    KCallables$callSuspend$1(Continuation<? super KCallables$callSuspend$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KCallables.callSuspend(null, null, this);
    }
}
