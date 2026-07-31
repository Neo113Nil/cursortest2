package gbcorp.c312.merkmarker.info.ui.viewmodel;

import gbcorp.c312.merkmarker.info.data.model.Product;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: MRKMRProductViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductViewModel$addToCart$1", f = "MRKMRProductViewModel.kt", i = {0, 0}, l = {40}, m = "invokeSuspend", n = {"products", "product"}, nl = {42}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes4.dex */
final class MRKMRProductViewModel$addToCart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $productId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MRKMRProductViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMRProductViewModel$addToCart$1(MRKMRProductViewModel mRKMRProductViewModel, int i, Continuation<? super MRKMRProductViewModel$addToCart$1> continuation) {
        super(2, continuation);
        this.this$0 = mRKMRProductViewModel;
        this.$productId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMRProductViewModel$addToCart$1(this.this$0, this.$productId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMRProductViewModel$addToCart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object obj2;
        MRKMRCartRepository mRKMRCartRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._productsState;
            MRKMRDataUiState mRKMRDataUiState = (MRKMRDataUiState) mutableStateFlow.getValue();
            if (mRKMRDataUiState instanceof MRKMRDataUiState.Populated) {
                Iterable iterable = (Iterable) ((MRKMRDataUiState.Populated) mRKMRDataUiState).getData();
                int i2 = this.$productId;
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((Product) obj2).getId() == i2) {
                        break;
                    }
                }
                Product product = (Product) obj2;
                if (product == null) {
                    return Unit.INSTANCE;
                }
                mRKMRCartRepository = this.this$0.cartRepository;
                this.L$0 = SpillingKt.nullOutSpilledVariable(mRKMRDataUiState);
                this.L$1 = SpillingKt.nullOutSpilledVariable(product);
                this.label = 1;
                if (mRKMRCartRepository.incrementProductQuantityOrAdd(product, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
