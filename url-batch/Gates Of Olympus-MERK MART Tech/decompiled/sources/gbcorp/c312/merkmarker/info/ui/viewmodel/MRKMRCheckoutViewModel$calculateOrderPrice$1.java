package gbcorp.c312.merkmarker.info.ui.viewmodel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MRKMRCheckoutViewModel.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCheckoutViewModel", f = "MRKMRCheckoutViewModel.kt", i = {}, l = {TypedValues.TYPE_TARGET}, m = "calculateOrderPrice", n = {}, nl = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class MRKMRCheckoutViewModel$calculateOrderPrice$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MRKMRCheckoutViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMRCheckoutViewModel$calculateOrderPrice$1(MRKMRCheckoutViewModel mRKMRCheckoutViewModel, Continuation<? super MRKMRCheckoutViewModel$calculateOrderPrice$1> continuation) {
        super(continuation);
        this.this$0 = mRKMRCheckoutViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object calculateOrderPrice;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        calculateOrderPrice = this.this$0.calculateOrderPrice(this);
        return calculateOrderPrice;
    }
}
