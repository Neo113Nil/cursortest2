package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;

/* loaded from: classes8.dex */
public final class PaymentRelayActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (paymentFlowResult$Unvalidated = (PaymentFlowResult$Unvalidated) intent.getParcelableExtra("extra_args")) == null) {
            paymentFlowResult$Unvalidated = new PaymentFlowResult$Unvalidated((String) null, 0, (StripeException) null, false, (String) null, (String) null, 127);
        }
        setResult(-1, new Intent().putExtras(paymentFlowResult$Unvalidated.toBundle()));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
