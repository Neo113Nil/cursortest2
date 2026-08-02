package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.view.PaymentRelayActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/PaymentRelayContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentRelayContract extends ActivityResultContract<PaymentRelayStarter$Args, PaymentFlowResult$Unvalidated> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        PaymentRelayStarter$Args paymentRelayStarter$Args = (PaymentRelayStarter$Args) obj;
        paymentRelayStarter$Args.getClass();
        Intent putExtras = new Intent(context, (Class<?>) PaymentRelayActivity.class).putExtras(paymentRelayStarter$Args.toResult().toBundle());
        putExtras.getClass();
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated;
        return (intent == null || (paymentFlowResult$Unvalidated = (PaymentFlowResult$Unvalidated) intent.getParcelableExtra("extra_args")) == null) ? new PaymentFlowResult$Unvalidated((String) null, 0, (StripeException) null, false, (String) null, (String) null, 127) : paymentFlowResult$Unvalidated;
    }
}
