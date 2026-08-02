package com.squareup.cash.ui;

import androidx.tracing.Trace;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class PaymentPasscodeActivity$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaymentPasscodeActivity f$0;

    public /* synthetic */ PaymentPasscodeActivity$$ExternalSyntheticLambda1(PaymentPasscodeActivity paymentPasscodeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentPasscodeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PaymentPasscodeActivity paymentPasscodeActivity = this.f$0;
        switch (i) {
            case 0:
                int i2 = PaymentPasscodeActivity.$r8$clinit;
                return (paymentPasscodeActivity.getResources().getConfiguration().uiMode & 48) == 32 ? Trace.moonCakeDark(paymentPasscodeActivity) : Trace.moonCakeLight(paymentPasscodeActivity);
            default:
                int i3 = PaymentPasscodeActivity.$r8$clinit;
                paymentPasscodeActivity.finish();
                return Unit.INSTANCE;
        }
    }
}
