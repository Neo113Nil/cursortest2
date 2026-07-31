package gbcorp.c312.merkmarker.info.ui.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import gbcorp.c312.merkmarker.info.data.model.Product;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRProductRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import java.util.List;
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

/* compiled from: MRKMRProductViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductViewModel$observeProducts$1", f = "MRKMRProductViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS}, m = "invokeSuspend", n = {}, nl = {32}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class MRKMRProductViewModel$observeProducts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MRKMRProductViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMRProductViewModel$observeProducts$1(MRKMRProductViewModel mRKMRProductViewModel, Continuation<? super MRKMRProductViewModel$observeProducts$1> continuation) {
        super(2, continuation);
        this.this$0 = mRKMRProductViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMRProductViewModel$observeProducts$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMRProductViewModel$observeProducts$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MRKMRProductRepository mRKMRProductRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mRKMRProductRepository = this.this$0.productRepository;
            Flow<List<Product>> observeAll = mRKMRProductRepository.observeAll();
            final MRKMRProductViewModel mRKMRProductViewModel = this.this$0;
            this.label = 1;
            if (observeAll.collect(new FlowCollector() { // from class: gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductViewModel$observeProducts$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<Product>) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object emit(List<Product> list, Continuation<? super Unit> continuation) {
                    MutableStateFlow mutableStateFlow;
                    Object value;
                    mutableStateFlow = MRKMRProductViewModel.this._productsState;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, MRKMRDataUiState.INSTANCE.from((List) list)));
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
