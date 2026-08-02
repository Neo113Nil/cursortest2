package com.stripe.android.payments.core.authentication;

import com.datadog.android.trace.DatadogTracing;
import com.datadog.android.trace.model.SpanEvent;
import com.stripe.android.PaymentRelayStarter$Args;
import com.stripe.android.PaymentRelayStarter$Legacy;
import com.stripe.android.StripePaymentController;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.StripeIntentKtxKt;
import com.stripe.android.view.ActivityHost;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class UnsupportedNextActionHandler extends PaymentNextActionHandler {
    public static final Map ACTION_DEPENDENCY_MAP = MapsKt__MapsJVMKt.mapOf(new Pair(StripeIntent.NextActionData.WeChatPayRedirect.class, "com.stripe:stripe-wechatpay:23.9.1"));
    public final Function1 paymentRelayStarterFactory;

    public UnsupportedNextActionHandler(Function1 function1) {
        function1.getClass();
        this.paymentRelayStarterFactory = function1;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public final Object performNextActionOnResumed(ActivityHost activityHost, Object obj, ApiRequest.Options options, PaymentNextActionHandler$performNextAction$1 paymentNextActionHandler$performNextAction$1) {
        StripeException create;
        StripeIntent stripeIntent = (StripeIntent) obj;
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        if (nextActionData != null) {
            Class<?> cls = nextActionData.getClass();
            int i = StripeException.$r8$clinit;
            create = SpanEvent.Account.create(new IllegalArgumentException(cls.getSimpleName() + " type is not supported, add " + ACTION_DEPENDENCY_MAP.get(cls) + " in build.gradle to support it"));
        } else {
            int i2 = StripeException.$r8$clinit;
            create = SpanEvent.Account.create(new IllegalArgumentException("stripeIntent.nextActionData is null"));
        }
        PaymentRelayStarter$Legacy paymentRelayStarter$Legacy = (PaymentRelayStarter$Legacy) this.paymentRelayStarterFactory.invoke(activityHost);
        Set set = StripeIntentKtxKt.REFRESHABLE_PAYMENT_METHODS;
        List list = StripePaymentController.EXPAND_PAYMENT_METHOD;
        paymentRelayStarter$Legacy.start(new PaymentRelayStarter$Args.ErrorArgs(create, DatadogTracing.getRequestCode$payments_core_release(stripeIntent)));
        return Unit.INSTANCE;
    }
}
