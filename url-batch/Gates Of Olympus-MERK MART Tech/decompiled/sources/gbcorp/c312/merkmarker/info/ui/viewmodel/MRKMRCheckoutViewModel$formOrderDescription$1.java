package gbcorp.c312.merkmarker.info.ui.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MRKMRCheckoutViewModel.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCheckoutViewModel", f = "MRKMRCheckoutViewModel.kt", i = {}, l = {94}, m = "formOrderDescription", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class MRKMRCheckoutViewModel$formOrderDescription$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MRKMRCheckoutViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMRCheckoutViewModel$formOrderDescription$1(MRKMRCheckoutViewModel mRKMRCheckoutViewModel, Continuation<? super MRKMRCheckoutViewModel$formOrderDescription$1> continuation) {
        super(continuation);
        this.this$0 = mRKMRCheckoutViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object formOrderDescription;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        formOrderDescription = this.this$0.formOrderDescription(this);
        return formOrderDescription;
    }
}
