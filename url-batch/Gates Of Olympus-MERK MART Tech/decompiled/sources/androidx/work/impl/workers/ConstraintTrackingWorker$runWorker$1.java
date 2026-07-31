package androidx.work.impl.workers;

import androidx.compose.runtime.ComposerImplKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConstraintTrackingWorker.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", i = {}, l = {ComposerImplKt.nodeKey}, m = "runWorker", n = {}, s = {})
/* loaded from: classes3.dex */
final class ConstraintTrackingWorker$runWorker$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConstraintTrackingWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintTrackingWorker$runWorker$1(ConstraintTrackingWorker constraintTrackingWorker, Continuation<? super ConstraintTrackingWorker$runWorker$1> continuation) {
        super(continuation);
        this.this$0 = constraintTrackingWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object runWorker;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runWorker = this.this$0.runWorker(null, null, null, this);
        return runWorker;
    }
}
