package gbcorp.c312.merkmarker.info.ui.viewmodel;

import gbcorp.c312.merkmarker.info.data.entity.MRKMROrderEntity;
import gbcorp.c312.merkmarker.info.data.repository.MRKMROrderRepository;
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

/* compiled from: MRKMROrderViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMROrderViewModel$observeOrders$1", f = "MRKMROrderViewModel.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, nl = {31}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class MRKMROrderViewModel$observeOrders$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MRKMROrderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMROrderViewModel$observeOrders$1(MRKMROrderViewModel mRKMROrderViewModel, Continuation<? super MRKMROrderViewModel$observeOrders$1> continuation) {
        super(2, continuation);
        this.this$0 = mRKMROrderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMROrderViewModel$observeOrders$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMROrderViewModel$observeOrders$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MRKMROrderRepository mRKMROrderRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mRKMROrderRepository = this.this$0.orderRepository;
            Flow<List<MRKMROrderEntity>> observeAll = mRKMROrderRepository.observeAll();
            final MRKMROrderViewModel mRKMROrderViewModel = this.this$0;
            this.label = 1;
            if (observeAll.collect(new FlowCollector() { // from class: gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMROrderViewModel$observeOrders$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<MRKMROrderEntity>) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object emit(List<MRKMROrderEntity> list, Continuation<? super Unit> continuation) {
                    MutableStateFlow mutableStateFlow;
                    Object value;
                    mutableStateFlow = MRKMROrderViewModel.this._ordersState;
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
