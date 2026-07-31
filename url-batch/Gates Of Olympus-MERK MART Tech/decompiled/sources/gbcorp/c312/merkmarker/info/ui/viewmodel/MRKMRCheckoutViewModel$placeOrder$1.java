package gbcorp.c312.merkmarker.info.ui.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import gbcorp.c312.merkmarker.info.data.entity.MRKMROrderEntity;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import gbcorp.c312.merkmarker.info.data.repository.MRKMROrderRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: MRKMRCheckoutViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCheckoutViewModel$placeOrder$1", f = "MRKMRCheckoutViewModel.kt", i = {2, 3}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT, 69, 73, 74}, m = "invokeSuspend", n = {"order", "order"}, nl = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, 70, 74, 75}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes4.dex */
final class MRKMRCheckoutViewModel$placeOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MRKMRCheckoutViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMRCheckoutViewModel$placeOrder$1(MRKMRCheckoutViewModel mRKMRCheckoutViewModel, Continuation<? super MRKMRCheckoutViewModel$placeOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = mRKMRCheckoutViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMRCheckoutViewModel$placeOrder$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMRCheckoutViewModel$placeOrder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0113, code lost:
    
        if (r14.deleteAll(r13) != r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0101  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean isEmailValid;
        MutableStateFlow mutableStateFlow;
        Object value;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        String generateOrderNumber;
        Object formOrderDescription;
        String str;
        String str2;
        String customerEmail;
        Object calculateOrderPrice;
        String str3;
        String str4;
        String str5;
        MRKMROrderEntity mRKMROrderEntity;
        MRKMROrderRepository mRKMROrderRepository;
        MRKMROrderEntity mRKMROrderEntity2;
        MRKMRCartRepository mRKMRCartRepository;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            isEmailValid = this.this$0.isEmailValid();
            if (isEmailValid) {
                mutableStateFlow2 = this.this$0._emailInvalidState;
                do {
                    value2 = mutableStateFlow2.getValue();
                    ((Boolean) value2).booleanValue();
                } while (!mutableStateFlow2.compareAndSet(value2, Boxing.boxBoolean(false)));
                generateOrderNumber = this.this$0.generateOrderNumber();
                this.L$0 = generateOrderNumber;
                this.label = 1;
                formOrderDescription = this.this$0.formOrderDescription(this);
                if (formOrderDescription != coroutine_suspended) {
                    str = generateOrderNumber;
                    obj = formOrderDescription;
                }
                return coroutine_suspended;
            }
            mutableStateFlow = this.this$0._emailInvalidState;
            do {
                value = mutableStateFlow.getValue();
                ((Boolean) value).booleanValue();
            } while (!mutableStateFlow.compareAndSet(value, Boxing.boxBoolean(true)));
            return Unit.INSTANCE;
        }
        if (i == 1) {
            String str6 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            str = str6;
        } else {
            if (i == 2) {
                customerEmail = (String) this.L$4;
                String str7 = (String) this.L$3;
                String str8 = (String) this.L$2;
                str2 = (String) this.L$1;
                String str9 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                str3 = str8;
                str4 = str9;
                str5 = str7;
                String str10 = customerEmail;
                double doubleValue = ((Number) obj).doubleValue();
                LocalDateTime truncatedTo = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
                Intrinsics.checkNotNullExpressionValue(truncatedTo, "truncatedTo(...)");
                mRKMROrderEntity = new MRKMROrderEntity(str4, str2, str3, str5, str10, doubleValue, truncatedTo);
                mRKMROrderRepository = this.this$0.orderRepository;
                this.L$0 = mRKMROrderEntity;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                if (mRKMROrderRepository.save(mRKMROrderEntity, this) != coroutine_suspended) {
                    mRKMROrderEntity2 = mRKMROrderEntity;
                    mRKMRCartRepository = this.this$0.cartRepository;
                    this.L$0 = mRKMROrderEntity2;
                    this.label = 4;
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MRKMROrderEntity mRKMROrderEntity3 = (MRKMROrderEntity) this.L$0;
                ResultKt.throwOnFailure(obj);
                mRKMROrderEntity2 = mRKMROrderEntity3;
                mutableStateFlow3 = this.this$0._orderState;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, new MRKMRDataUiState.Populated(mRKMROrderEntity2)));
                return Unit.INSTANCE;
            }
            mRKMROrderEntity2 = (MRKMROrderEntity) this.L$0;
            ResultKt.throwOnFailure(obj);
            mRKMRCartRepository = this.this$0.cartRepository;
            this.L$0 = mRKMROrderEntity2;
            this.label = 4;
        }
        str2 = (String) obj;
        String customerFirstName = this.this$0.getCustomerFirstName();
        String customerLastName = this.this$0.getCustomerLastName();
        customerEmail = this.this$0.getCustomerEmail();
        this.L$0 = str;
        this.L$1 = str2;
        this.L$2 = customerFirstName;
        this.L$3 = customerLastName;
        this.L$4 = customerEmail;
        this.label = 2;
        calculateOrderPrice = this.this$0.calculateOrderPrice(this);
        if (calculateOrderPrice != coroutine_suspended) {
            String str11 = str;
            str3 = customerFirstName;
            str4 = str11;
            str5 = customerLastName;
            obj = calculateOrderPrice;
            String str102 = customerEmail;
            double doubleValue2 = ((Number) obj).doubleValue();
            LocalDateTime truncatedTo2 = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
            Intrinsics.checkNotNullExpressionValue(truncatedTo2, "truncatedTo(...)");
            mRKMROrderEntity = new MRKMROrderEntity(str4, str2, str3, str5, str102, doubleValue2, truncatedTo2);
            mRKMROrderRepository = this.this$0.orderRepository;
            this.L$0 = mRKMROrderEntity;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (mRKMROrderRepository.save(mRKMROrderEntity, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
