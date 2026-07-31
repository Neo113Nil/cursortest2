package gbcorp.c312.merkmarker.info.data.repository;

import gbcorp.c312.merkmarker.info.data.dao.OrderDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MRKMROrderRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.data.repository.MRKMROrderRepository$deleteByNumber$2", f = "MRKMROrderRepository.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, nl = {27}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class MRKMROrderRepository$deleteByNumber$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderNumber;
    int label;
    final /* synthetic */ MRKMROrderRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMROrderRepository$deleteByNumber$2(MRKMROrderRepository mRKMROrderRepository, String str, Continuation<? super MRKMROrderRepository$deleteByNumber$2> continuation) {
        super(2, continuation);
        this.this$0 = mRKMROrderRepository;
        this.$orderNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMROrderRepository$deleteByNumber$2(this.this$0, this.$orderNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMROrderRepository$deleteByNumber$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrderDao orderDao;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            orderDao = this.this$0.orderDao;
            this.label = 1;
            if (orderDao.deleteByNumber(this.$orderNumber, this) == coroutine_suspended) {
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
