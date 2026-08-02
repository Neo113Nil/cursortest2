package com.stripe.android.hcaptcha;

import com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class DefaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1$2$1(CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3 cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3, Continuation continuation) {
        super(continuation);
        this.this$0 = cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
