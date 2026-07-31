package gbcorp.c312.merkmarker.info.worker;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GTSLYVisitRequestWorker.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.worker.GTSLYVisitRequestWorker", f = "GTSLYVisitRequestWorker.kt", i = {0, 0, 0, 0}, l = {27}, m = "doWork", n = {"recordId", "linkUrl", "requestBody", "isLinkPresent"}, nl = {33}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes4.dex */
final class GTSLYVisitRequestWorker$doWork$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GTSLYVisitRequestWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GTSLYVisitRequestWorker$doWork$1(GTSLYVisitRequestWorker gTSLYVisitRequestWorker, Continuation<? super GTSLYVisitRequestWorker$doWork$1> continuation) {
        super(continuation);
        this.this$0 = gTSLYVisitRequestWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
