package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter$Args;
import com.stripe.android.PaymentRelayStarter$Legacy;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.ActivityHost;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class NoOpIntentNextActionHandler extends PaymentNextActionHandler {
    public final Function1 paymentRelayStarterFactory;

    public NoOpIntentNextActionHandler(Function1 function1) {
        function1.getClass();
        this.paymentRelayStarterFactory = function1;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public final Object performNextActionOnResumed(ActivityHost activityHost, Object obj, ApiRequest.Options options, PaymentNextActionHandler$performNextAction$1 paymentNextActionHandler$performNextAction$1) {
        Object setupIntentArgs;
        StripeIntent stripeIntent = (StripeIntent) obj;
        String str = options.stripeAccount;
        stripeIntent.getClass();
        if (stripeIntent instanceof PaymentIntent) {
            setupIntentArgs = new PaymentRelayStarter$Args.PaymentIntentArgs((PaymentIntent) stripeIntent, str);
        } else {
            if (!(stripeIntent instanceof SetupIntent)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            setupIntentArgs = new PaymentRelayStarter$Args.SetupIntentArgs((SetupIntent) stripeIntent, str);
        }
        ((PaymentRelayStarter$Legacy) this.paymentRelayStarterFactory.invoke(activityHost)).start(setupIntentArgs);
        return Unit.INSTANCE;
    }
}
