package gbcorp.c312.merkmarker.info.ui.viewmodel;

import gbcorp.c312.merkmarker.info.data.model.Product;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRProductRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: MRKMRProductDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductDetailsViewModel$observeProductDetails$1", f = "MRKMRProductDetailsViewModel.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, nl = {31}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class MRKMRProductDetailsViewModel$observeProductDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $productId;
    int label;
    final /* synthetic */ MRKMRProductDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMRProductDetailsViewModel$observeProductDetails$1(MRKMRProductDetailsViewModel mRKMRProductDetailsViewModel, int i, Continuation<? super MRKMRProductDetailsViewModel$observeProductDetails$1> continuation) {
        super(2, continuation);
        this.this$0 = mRKMRProductDetailsViewModel;
        this.$productId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMRProductDetailsViewModel$observeProductDetails$1(this.this$0, this.$productId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMRProductDetailsViewModel$observeProductDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MRKMRProductRepository mRKMRProductRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mRKMRProductRepository = this.this$0.productRepository;
            Flow<Product> observeById = mRKMRProductRepository.observeById(this.$productId);
            final MRKMRProductDetailsViewModel mRKMRProductDetailsViewModel = this.this$0;
            this.label = 1;
            if (observeById.collect(new FlowCollector() { // from class: gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductDetailsViewModel$observeProductDetails$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Product) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object emit(Product product, Continuation<? super Unit> continuation) {
                    MutableStateFlow mutableStateFlow;
                    Object value;
                    mutableStateFlow = MRKMRProductDetailsViewModel.this._productDetailState;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, MRKMRDataUiState.INSTANCE.from((MRKMRDataUiState.Companion) product)));
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
