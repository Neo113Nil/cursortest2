package gbcorp.c312.merkmarker.info.data.dao;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MRKMRCartItemDao.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.data.dao.CartItemDao", f = "MRKMRCartItemDao.kt", i = {0, 0, 1, 1, 1}, l = {41, 44}, m = "incrementProductQuantityOrAdd$suspendImpl", n = {"$this", "product", "$this", "product", "updated"}, nl = {43, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes4.dex */
final class CartItemDao$incrementProductQuantityOrAdd$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CartItemDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartItemDao$incrementProductQuantityOrAdd$1(CartItemDao cartItemDao, Continuation<? super CartItemDao$incrementProductQuantityOrAdd$1> continuation) {
        super(continuation);
        this.this$0 = cartItemDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CartItemDao.incrementProductQuantityOrAdd$suspendImpl(this.this$0, null, this);
    }
}
