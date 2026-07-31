package gbcorp.c312.merkmarker.info.service;

import gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GTSLYFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.service.GTSLYFirebaseMessagingService$onNewToken$1", f = "GTSLYFirebaseMessagingService.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, nl = {31}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class GTSLYFirebaseMessagingService$onNewToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ GTSLYFirebaseMessagingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GTSLYFirebaseMessagingService$onNewToken$1(GTSLYFirebaseMessagingService gTSLYFirebaseMessagingService, String str, Continuation<? super GTSLYFirebaseMessagingService$onNewToken$1> continuation) {
        super(2, continuation);
        this.this$0 = gTSLYFirebaseMessagingService;
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GTSLYFirebaseMessagingService$onNewToken$1(this.this$0, this.$token, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GTSLYFirebaseMessagingService$onNewToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GTSLYPrepRepository repository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            repository = this.this$0.getRepository();
            this.label = 1;
            if (repository.onNewFcmToken(this.$token, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
