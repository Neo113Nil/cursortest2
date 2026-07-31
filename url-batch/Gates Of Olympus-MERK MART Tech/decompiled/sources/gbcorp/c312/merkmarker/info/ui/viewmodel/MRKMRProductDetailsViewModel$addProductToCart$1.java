package gbcorp.c312.merkmarker.info.ui.viewmodel;

import gbcorp.c312.merkmarker.info.data.model.Product;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
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

/* compiled from: MRKMRProductDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductDetailsViewModel$addProductToCart$1", f = "MRKMRProductDetailsViewModel.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"state"}, nl = {40}, s = {"L$0"}, v = 2)
/* loaded from: classes4.dex */
final class MRKMRProductDetailsViewModel$addProductToCart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MRKMRProductDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMRProductDetailsViewModel$addProductToCart$1(MRKMRProductDetailsViewModel mRKMRProductDetailsViewModel, Continuation<? super MRKMRProductDetailsViewModel$addProductToCart$1> continuation) {
        super(2, continuation);
        this.this$0 = mRKMRProductDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMRProductDetailsViewModel$addProductToCart$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMRProductDetailsViewModel$addProductToCart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MRKMRCartRepository mRKMRCartRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._productDetailState;
            MRKMRDataUiState mRKMRDataUiState = (MRKMRDataUiState) mutableStateFlow.getValue();
            if (mRKMRDataUiState instanceof MRKMRDataUiState.Populated) {
                mRKMRCartRepository = this.this$0.cartRepository;
                this.L$0 = SpillingKt.nullOutSpilledVariable(mRKMRDataUiState);
                this.label = 1;
                if (mRKMRCartRepository.incrementProductQuantityOrAdd((Product) ((MRKMRDataUiState.Populated) mRKMRDataUiState).getData(), this) == coroutine_suspended) {
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
