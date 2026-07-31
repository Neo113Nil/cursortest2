package androidx.work.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WorkerWrapper.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", i = {0}, l = {299}, m = "runWorker", n = {"params"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class WorkerWrapper$runWorker$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkerWrapper$runWorker$1(WorkerWrapper workerWrapper, Continuation<? super WorkerWrapper$runWorker$1> continuation) {
        super(continuation);
        this.this$0 = workerWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object runWorker;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runWorker = this.this$0.runWorker(this);
        return runWorker;
    }
}
