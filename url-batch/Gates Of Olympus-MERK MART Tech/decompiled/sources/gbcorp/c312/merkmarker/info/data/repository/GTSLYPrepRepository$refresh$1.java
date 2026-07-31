package gbcorp.c312.merkmarker.info.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GTSLYPrepRepository.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository", f = "GTSLYPrepRepository.kt", i = {0, 1, 1}, l = {85, 87}, m = "refresh", n = {"token", "token", "request"}, nl = {87, 93}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes4.dex */
final class GTSLYPrepRepository$refresh$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GTSLYPrepRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GTSLYPrepRepository$refresh$1(GTSLYPrepRepository gTSLYPrepRepository, Continuation<? super GTSLYPrepRepository$refresh$1> continuation) {
        super(continuation);
        this.this$0 = gTSLYPrepRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object refresh;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        refresh = this.this$0.refresh(null, this);
        return refresh;
    }
}
