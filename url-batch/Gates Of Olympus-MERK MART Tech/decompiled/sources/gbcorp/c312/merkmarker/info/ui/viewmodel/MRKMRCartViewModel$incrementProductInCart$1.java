package gbcorp.c312.merkmarker.info.ui.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MRKMRCartViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCartViewModel$incrementProductInCart$1", f = "MRKMRCartViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "invokeSuspend", n = {}, nl = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class MRKMRCartViewModel$incrementProductInCart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $productId;
    int label;
    final /* synthetic */ MRKMRCartViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMRCartViewModel$incrementProductInCart$1(MRKMRCartViewModel mRKMRCartViewModel, int i, Continuation<? super MRKMRCartViewModel$incrementProductInCart$1> continuation) {
        super(2, continuation);
        this.this$0 = mRKMRCartViewModel;
        this.$productId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMRCartViewModel$incrementProductInCart$1(this.this$0, this.$productId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMRCartViewModel$incrementProductInCart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MRKMRCartRepository mRKMRCartRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mRKMRCartRepository = this.this$0.cartRepository;
            this.label = 1;
            if (mRKMRCartRepository.incrementQuantity(this.$productId, this) == coroutine_suspended) {
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
