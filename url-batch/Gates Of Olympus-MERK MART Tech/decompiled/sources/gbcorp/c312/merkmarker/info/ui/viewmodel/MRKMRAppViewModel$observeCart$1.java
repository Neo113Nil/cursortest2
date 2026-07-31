package gbcorp.c312.merkmarker.info.ui.viewmodel;

import gbcorp.c312.merkmarker.info.data.entity.MRKMRCartItemEntity;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: MRKMRAppViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRAppViewModel$observeCart$1", f = "MRKMRAppViewModel.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, nl = {41}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class MRKMRAppViewModel$observeCart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MRKMRAppViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMRAppViewModel$observeCart$1(MRKMRAppViewModel mRKMRAppViewModel, Continuation<? super MRKMRAppViewModel$observeCart$1> continuation) {
        super(2, continuation);
        this.this$0 = mRKMRAppViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMRAppViewModel$observeCart$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMRAppViewModel$observeCart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MRKMRCartRepository mRKMRCartRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mRKMRCartRepository = this.this$0.cartRepository;
            Flow<List<MRKMRCartItemEntity>> observeAll = mRKMRCartRepository.observeAll();
            final MRKMRAppViewModel mRKMRAppViewModel = this.this$0;
            this.label = 1;
            if (observeAll.collect(new FlowCollector() { // from class: gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRAppViewModel$observeCart$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<MRKMRCartItemEntity>) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object emit(List<MRKMRCartItemEntity> list, Continuation<? super Unit> continuation) {
                    MutableStateFlow mutableStateFlow;
                    Object value;
                    MRKMRDataUiState mRKMRDataUiState;
                    MutableStateFlow mutableStateFlow2;
                    Object value2;
                    int i2;
                    mutableStateFlow = MRKMRAppViewModel.this._cartPopulatedState;
                    do {
                        value = mutableStateFlow.getValue();
                        if (!list.isEmpty()) {
                            mRKMRDataUiState = new MRKMRDataUiState.Populated(Unit.INSTANCE);
                        } else {
                            mRKMRDataUiState = MRKMRDataUiState.Empty.INSTANCE;
                        }
                    } while (!mutableStateFlow.compareAndSet(value, mRKMRDataUiState));
                    mutableStateFlow2 = MRKMRAppViewModel.this._itemsInCartState;
                    do {
                        value2 = mutableStateFlow2.getValue();
                        ((Number) value2).intValue();
                        Iterator<T> it = list.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            i2 += ((MRKMRCartItemEntity) it.next()).getQuantity();
                        }
                    } while (!mutableStateFlow2.compareAndSet(value2, Boxing.boxInt(i2)));
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
