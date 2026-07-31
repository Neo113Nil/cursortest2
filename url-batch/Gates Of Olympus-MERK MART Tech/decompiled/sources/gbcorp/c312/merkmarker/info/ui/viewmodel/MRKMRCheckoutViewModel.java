package gbcorp.c312.merkmarker.info.ui.viewmodel;

import android.util.Patterns;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import gbcorp.c312.merkmarker.info.data.entity.MRKMRCartItemEntity;
import gbcorp.c312.merkmarker.info.data.entity.MRKMROrderEntity;
import gbcorp.c312.merkmarker.info.data.model.Product;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import gbcorp.c312.merkmarker.info.data.repository.MRKMROrderRepository;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRProductRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: MRKMRCheckoutViewModel.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0017J\u000e\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0017J\u000e\u0010+\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0017J\u0006\u0010,\u001a\u00020(J\b\u0010-\u001a\u00020\u0013H\u0002J\b\u0010.\u001a\u00020\u0017H\u0002J\u000e\u0010/\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u00100J\u000e\u00101\u001a\u000202H\u0082@¢\u0006\u0002\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR+\u0010#\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001c¨\u00063"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRCheckoutViewModel;", "Landroidx/lifecycle/ViewModel;", "cartRepository", "Lgbcorp/c312/merkmarker/info/data/repository/MRKMRCartRepository;", "productRepository", "Lgbcorp/c312/merkmarker/info/data/repository/MRKMRProductRepository;", "orderRepository", "Lgbcorp/c312/merkmarker/info/data/repository/MRKMROrderRepository;", "<init>", "(Lgbcorp/c312/merkmarker/info/data/repository/MRKMRCartRepository;Lgbcorp/c312/merkmarker/info/data/repository/MRKMRProductRepository;Lgbcorp/c312/merkmarker/info/data/repository/MRKMROrderRepository;)V", "_orderState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "Lgbcorp/c312/merkmarker/info/data/entity/MRKMROrderEntity;", "orderState", "Lkotlinx/coroutines/flow/StateFlow;", "getOrderState", "()Lkotlinx/coroutines/flow/StateFlow;", "_emailInvalidState", "", "emailInvalidState", "getEmailInvalidState", "<set-?>", "", "customerFirstName", "getCustomerFirstName", "()Ljava/lang/String;", "setCustomerFirstName", "(Ljava/lang/String;)V", "customerFirstName$delegate", "Landroidx/compose/runtime/MutableState;", "customerLastName", "getCustomerLastName", "setCustomerLastName", "customerLastName$delegate", "customerEmail", "getCustomerEmail", "setCustomerEmail", "customerEmail$delegate", "updateCustomerFirstName", "", "input", "updateCustomerLastName", "updateCustomerEmail", "placeOrder", "isEmailValid", "generateOrderNumber", "formOrderDescription", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateOrderPrice", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRCheckoutViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _emailInvalidState;
    private final MutableStateFlow<MRKMRDataUiState<MRKMROrderEntity>> _orderState;
    private final MRKMRCartRepository cartRepository;

    /* renamed from: customerEmail$delegate, reason: from kotlin metadata */
    private final MutableState customerEmail;

    /* renamed from: customerFirstName$delegate, reason: from kotlin metadata */
    private final MutableState customerFirstName;

    /* renamed from: customerLastName$delegate, reason: from kotlin metadata */
    private final MutableState customerLastName;
    private final MRKMROrderRepository orderRepository;
    private final MRKMRProductRepository productRepository;

    public MRKMRCheckoutViewModel(MRKMRCartRepository cartRepository, MRKMRProductRepository productRepository, MRKMROrderRepository orderRepository) {
        Intrinsics.checkNotNullParameter(cartRepository, "cartRepository");
        Intrinsics.checkNotNullParameter(productRepository, "productRepository");
        Intrinsics.checkNotNullParameter(orderRepository, "orderRepository");
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
        this._orderState = StateFlowKt.MutableStateFlow(MRKMRDataUiState.Empty.INSTANCE);
        this._emailInvalidState = StateFlowKt.MutableStateFlow(false);
        this.customerFirstName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.customerLastName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.customerEmail = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    public final StateFlow<MRKMRDataUiState<MRKMROrderEntity>> getOrderState() {
        return FlowKt.asStateFlow(this._orderState);
    }

    public final StateFlow<Boolean> getEmailInvalidState() {
        return FlowKt.asStateFlow(this._emailInvalidState);
    }

    private final void setCustomerFirstName(String str) {
        this.customerFirstName.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCustomerFirstName() {
        return (String) this.customerFirstName.getValue();
    }

    private final void setCustomerLastName(String str) {
        this.customerLastName.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCustomerLastName() {
        return (String) this.customerLastName.getValue();
    }

    private final void setCustomerEmail(String str) {
        this.customerEmail.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCustomerEmail() {
        return (String) this.customerEmail.getValue();
    }

    public final void updateCustomerFirstName(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        setCustomerFirstName(input);
    }

    public final void updateCustomerLastName(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        setCustomerLastName(input);
    }

    public final void updateCustomerEmail(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        setCustomerEmail(input);
        if (this._emailInvalidState.getValue().booleanValue()) {
            this._emailInvalidState.setValue(false);
        }
    }

    public final void placeOrder() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMRCheckoutViewModel$placeOrder$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEmailValid() {
        return Patterns.EMAIL_ADDRESS.matcher(getCustomerEmail()).matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateOrderNumber() {
        IntRange intRange = new IntRange(1, 8);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(Character.valueOf(StringsKt.random("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", Random.INSTANCE)));
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object formOrderDescription(Continuation<? super String> continuation) {
        MRKMRCheckoutViewModel$formOrderDescription$1 mRKMRCheckoutViewModel$formOrderDescription$1;
        int i;
        if (continuation instanceof MRKMRCheckoutViewModel$formOrderDescription$1) {
            mRKMRCheckoutViewModel$formOrderDescription$1 = (MRKMRCheckoutViewModel$formOrderDescription$1) continuation;
            if ((mRKMRCheckoutViewModel$formOrderDescription$1.label & Integer.MIN_VALUE) != 0) {
                mRKMRCheckoutViewModel$formOrderDescription$1.label -= Integer.MIN_VALUE;
                Object obj = mRKMRCheckoutViewModel$formOrderDescription$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mRKMRCheckoutViewModel$formOrderDescription$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MRKMRCartRepository mRKMRCartRepository = this.cartRepository;
                    mRKMRCheckoutViewModel$formOrderDescription$1.label = 1;
                    obj = mRKMRCartRepository.getAll(mRKMRCheckoutViewModel$formOrderDescription$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return CollectionsKt.joinToString$default((Iterable) obj, ", ", null, null, 0, null, new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCheckoutViewModel$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        CharSequence formOrderDescription$lambda$0;
                        formOrderDescription$lambda$0 = MRKMRCheckoutViewModel.formOrderDescription$lambda$0(MRKMRCheckoutViewModel.this, (MRKMRCartItemEntity) obj2);
                        return formOrderDescription$lambda$0;
                    }
                }, 30, null);
            }
        }
        mRKMRCheckoutViewModel$formOrderDescription$1 = new MRKMRCheckoutViewModel$formOrderDescription$1(this, continuation);
        Object obj2 = mRKMRCheckoutViewModel$formOrderDescription$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mRKMRCheckoutViewModel$formOrderDescription$1.label;
        if (i != 0) {
        }
        return CollectionsKt.joinToString$default((Iterable) obj2, ", ", null, null, 0, null, new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCheckoutViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                CharSequence formOrderDescription$lambda$0;
                formOrderDescription$lambda$0 = MRKMRCheckoutViewModel.formOrderDescription$lambda$0(MRKMRCheckoutViewModel.this, (MRKMRCartItemEntity) obj22);
                return formOrderDescription$lambda$0;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence formOrderDescription$lambda$0(MRKMRCheckoutViewModel mRKMRCheckoutViewModel, MRKMRCartItemEntity cartItem) {
        Intrinsics.checkNotNullParameter(cartItem, "cartItem");
        Product byId = mRKMRCheckoutViewModel.productRepository.getById(cartItem.getId());
        return (byId != null ? byId.getTitle() : null) + " x " + cartItem.getQuantity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateOrderPrice(Continuation<? super Double> continuation) {
        MRKMRCheckoutViewModel$calculateOrderPrice$1 mRKMRCheckoutViewModel$calculateOrderPrice$1;
        int i;
        Iterator it;
        if (continuation instanceof MRKMRCheckoutViewModel$calculateOrderPrice$1) {
            mRKMRCheckoutViewModel$calculateOrderPrice$1 = (MRKMRCheckoutViewModel$calculateOrderPrice$1) continuation;
            if ((mRKMRCheckoutViewModel$calculateOrderPrice$1.label & Integer.MIN_VALUE) != 0) {
                mRKMRCheckoutViewModel$calculateOrderPrice$1.label -= Integer.MIN_VALUE;
                Object obj = mRKMRCheckoutViewModel$calculateOrderPrice$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mRKMRCheckoutViewModel$calculateOrderPrice$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MRKMRCartRepository mRKMRCartRepository = this.cartRepository;
                    mRKMRCheckoutViewModel$calculateOrderPrice$1.label = 1;
                    obj = mRKMRCartRepository.getAll(mRKMRCheckoutViewModel$calculateOrderPrice$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                it = ((Iterable) obj).iterator();
                double d = 0.0d;
                while (it.hasNext()) {
                    Product byId = this.productRepository.getById(((MRKMRCartItemEntity) it.next()).getId());
                    d += r4.getQuantity() * (byId != null ? byId.getPrice() : 0.0d);
                }
                return Boxing.boxDouble(d);
            }
        }
        mRKMRCheckoutViewModel$calculateOrderPrice$1 = new MRKMRCheckoutViewModel$calculateOrderPrice$1(this, continuation);
        Object obj2 = mRKMRCheckoutViewModel$calculateOrderPrice$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mRKMRCheckoutViewModel$calculateOrderPrice$1.label;
        if (i != 0) {
        }
        it = ((Iterable) obj2).iterator();
        double d2 = 0.0d;
        while (it.hasNext()) {
        }
        return Boxing.boxDouble(d2);
    }
}
