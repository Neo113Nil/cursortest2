package gbcorp.c312.merkmarker.info.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GTSLYPrepRepository.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository", f = "GTSLYPrepRepository.kt", i = {0, 0, 0}, l = {97}, m = "buildRequest", n = {"token", "language", "timezone"}, nl = {98}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes4.dex */
final class GTSLYPrepRepository$buildRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GTSLYPrepRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GTSLYPrepRepository$buildRequest$1(GTSLYPrepRepository gTSLYPrepRepository, Continuation<? super GTSLYPrepRepository$buildRequest$1> continuation) {
        super(continuation);
        this.this$0 = gTSLYPrepRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object buildRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        buildRequest = this.this$0.buildRequest(null, this);
        return buildRequest;
    }
}
