package gbcorp.c312.merkmarker.info.data.dao;

import androidx.constraintlayout.widget.ConstraintLayout;
import gbcorp.c312.merkmarker.info.data.model.Product;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: CartItemDao_Impl.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl$decrementProductQuantityOrRemove$2", f = "CartItemDao_Impl.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m = "invokeSuspend", n = {}, nl = {ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class CartItemDao_Impl$decrementProductQuantityOrRemove$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Product $product;
    int label;
    final /* synthetic */ CartItemDao_Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartItemDao_Impl$decrementProductQuantityOrRemove$2(CartItemDao_Impl cartItemDao_Impl, Product product, Continuation<? super CartItemDao_Impl$decrementProductQuantityOrRemove$2> continuation) {
        super(1, continuation);
        this.this$0 = cartItemDao_Impl;
        this.$product = product;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CartItemDao_Impl$decrementProductQuantityOrRemove$2(this.this$0, this.$product, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((CartItemDao_Impl$decrementProductQuantityOrRemove$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object decrementProductQuantityOrRemove;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            decrementProductQuantityOrRemove = super/*gbcorp.c312.merkmarker.info.data.dao.CartItemDao*/.decrementProductQuantityOrRemove(this.$product, this);
            if (decrementProductQuantityOrRemove == coroutine_suspended) {
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
