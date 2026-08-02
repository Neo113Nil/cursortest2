package com.stripe.android.payments.paymentlauncher;

import android.content.Intent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final /* synthetic */ class PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaymentLauncherConfirmationActivity f$0;

    public /* synthetic */ PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda1(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentLauncherConfirmationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity = this.f$0;
        switch (i) {
            case 0:
                int i2 = PaymentLauncherConfirmationActivity.$r8$clinit;
                Intent intent = paymentLauncherConfirmationActivity.getIntent();
                intent.getClass();
                return (PaymentLauncherContract.Args) intent.getParcelableExtra("extra_args");
            case 1:
                int i3 = PaymentLauncherConfirmationActivity.$r8$clinit;
                PaymentLauncherContract.Args args = (PaymentLauncherContract.Args) paymentLauncherConfirmationActivity.starterArgs$delegate.getValue();
                if (args != null) {
                    return args;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            default:
                return paymentLauncherConfirmationActivity.viewModelFactory;
        }
    }
}
