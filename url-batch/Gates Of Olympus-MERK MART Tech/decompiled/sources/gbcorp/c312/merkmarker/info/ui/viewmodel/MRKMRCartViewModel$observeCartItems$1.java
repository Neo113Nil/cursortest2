package gbcorp.c312.merkmarker.info.ui.viewmodel;

import gbcorp.c312.merkmarker.info.data.entity.MRKMRCartItemEntity;
import gbcorp.c312.merkmarker.info.data.model.Product;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRProductRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRCartItemUiState;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: MRKMRCartViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCartViewModel$observeCartItems$1", f = "MRKMRCartViewModel.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, nl = {61}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class MRKMRCartViewModel$observeCartItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MRKMRCartViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMRCartViewModel$observeCartItems$1(MRKMRCartViewModel mRKMRCartViewModel, Continuation<? super MRKMRCartViewModel$observeCartItems$1> continuation) {
        super(2, continuation);
        this.this$0 = mRKMRCartViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMRCartViewModel$observeCartItems$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMRCartViewModel$observeCartItems$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MRKMRCartRepository mRKMRCartRepository;
        MRKMRProductRepository mRKMRProductRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mRKMRCartRepository = this.this$0.cartRepository;
            Flow<List<MRKMRCartItemEntity>> observeAll = mRKMRCartRepository.observeAll();
            mRKMRProductRepository = this.this$0.productRepository;
            Flow combine = FlowKt.combine(observeAll, mRKMRProductRepository.observeAll(), new AnonymousClass1(this.this$0, null));
            final MRKMRCartViewModel mRKMRCartViewModel = this.this$0;
            this.label = 1;
            if (combine.collect(new FlowCollector() { // from class: gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCartViewModel$observeCartItems$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((MRKMRDataUiState<? extends List<MRKMRCartItemUiState>>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(MRKMRDataUiState<? extends List<MRKMRCartItemUiState>> mRKMRDataUiState, Continuation<? super Unit> continuation) {
                    MutableStateFlow mutableStateFlow;
                    mutableStateFlow = MRKMRCartViewModel.this._cartItemsState;
                    mutableStateFlow.setValue(mRKMRDataUiState);
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

    /* compiled from: MRKMRCartViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\n"}, d2 = {"<anonymous>", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRCartItemUiState;", "cartItems", "Lgbcorp/c312/merkmarker/info/data/entity/MRKMRCartItemEntity;", "products", "Lgbcorp/c312/merkmarker/info/data/model/Product;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCartViewModel$observeCartItems$1$1", f = "MRKMRCartViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCartViewModel$observeCartItems$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function3<List<? extends MRKMRCartItemEntity>, List<? extends Product>, Continuation<? super MRKMRDataUiState<? extends List<? extends MRKMRCartItemUiState>>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ MRKMRCartViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MRKMRCartViewModel mRKMRCartViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = mRKMRCartViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(List<? extends MRKMRCartItemEntity> list, List<? extends Product> list2, Continuation<? super MRKMRDataUiState<? extends List<? extends MRKMRCartItemUiState>>> continuation) {
            return invoke2((List<MRKMRCartItemEntity>) list, (List<Product>) list2, (Continuation<? super MRKMRDataUiState<? extends List<MRKMRCartItemUiState>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<MRKMRCartItemEntity> list, List<Product> list2, Continuation<? super MRKMRDataUiState<? extends List<MRKMRCartItemUiState>>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = list2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            double calculateTotalPrice;
            List<MRKMRCartItemEntity> list = (List) this.L$0;
            List list2 = (List) this.L$1;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list3 = list2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
            for (Object obj2 : list3) {
                linkedHashMap.put(Boxing.boxInt(((Product) obj2).getId()), obj2);
            }
            ArrayList arrayList = new ArrayList();
            for (MRKMRCartItemEntity mRKMRCartItemEntity : list) {
                Product product = (Product) linkedHashMap.get(Boxing.boxInt(mRKMRCartItemEntity.getId()));
                MRKMRCartItemUiState mRKMRCartItemUiState = product != null ? new MRKMRCartItemUiState(product.getId(), product.getTitle(), product.getPrice(), mRKMRCartItemEntity.getQuantity(), product.getImageUrl()) : null;
                if (mRKMRCartItemUiState != null) {
                    arrayList.add(mRKMRCartItemUiState);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                return MRKMRDataUiState.Empty.INSTANCE;
            }
            mutableStateFlow = this.this$0._totalPrice;
            calculateTotalPrice = this.this$0.calculateTotalPrice(arrayList2);
            mutableStateFlow.setValue(Boxing.boxDouble(calculateTotalPrice));
            return new MRKMRDataUiState.Populated(arrayList2);
        }
    }
}
