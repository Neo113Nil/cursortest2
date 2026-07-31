package gbcorp.c312.merkmarker.info.data.repository;

import gbcorp.c312.merkmarker.info.data.dao.CartItemDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MRKMRCartRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository$deleteById$2", f = "MRKMRCartRepository.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, nl = {26}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class MRKMRCartRepository$deleteById$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $id;
    int label;
    final /* synthetic */ MRKMRCartRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMRCartRepository$deleteById$2(MRKMRCartRepository mRKMRCartRepository, int i, Continuation<? super MRKMRCartRepository$deleteById$2> continuation) {
        super(2, continuation);
        this.this$0 = mRKMRCartRepository;
        this.$id = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMRCartRepository$deleteById$2(this.this$0, this.$id, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMRCartRepository$deleteById$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CartItemDao cartItemDao;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cartItemDao = this.this$0.cartItemDao;
            this.label = 1;
            if (cartItemDao.deleteById(this.$id, this) == coroutine_suspended) {
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
