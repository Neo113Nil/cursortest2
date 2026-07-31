package gbcorp.c312.merkmarker.info.data.repository;

import gbcorp.c312.merkmarker.info.data.service.GTSLYApiService;
import gbcorp.c312.merkmarker.info.data.service.GTSLYRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GTSLYPrepRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository$refresh$2", f = "GTSLYPrepRepository.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, nl = {90}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class GTSLYPrepRepository$refresh$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GTSLYRequest $request;
    int label;
    final /* synthetic */ GTSLYPrepRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GTSLYPrepRepository$refresh$2(GTSLYPrepRepository gTSLYPrepRepository, GTSLYRequest gTSLYRequest, Continuation<? super GTSLYPrepRepository$refresh$2> continuation) {
        super(2, continuation);
        this.this$0 = gTSLYPrepRepository;
        this.$request = gTSLYRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GTSLYPrepRepository$refresh$2(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GTSLYPrepRepository$refresh$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GTSLYApiService gTSLYApiService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                gTSLYApiService = this.this$0.gtslyApiService;
                this.label = 1;
                obj = gTSLYApiService.refresh(this.$request, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
