package com.stripe.android.networking;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final /* synthetic */ class StripeApiRepository$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StripeApiRepository f$0;

    public /* synthetic */ StripeApiRepository$$ExternalSyntheticLambda2(StripeApiRepository stripeApiRepository, int i) {
        this.$r8$classId = i;
        this.f$0 = stripeApiRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        StripeApiRepository stripeApiRepository = this.f$0;
        switch (i) {
            case 0:
                stripeApiRepository.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.SetupIntentRetrieve, null, null, null, null, 62));
                break;
            case 1:
                stripeApiRepository.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.SetupIntentRefresh, null, null, null, null, 62));
                break;
            case 2:
                stripeApiRepository.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.PaymentIntentRefresh, null, null, null, null, 62));
                break;
            case 3:
                stripeApiRepository.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.PaymentIntentCancelSource, null, null, null, null, 62));
                break;
            case 4:
                stripeApiRepository.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Start, null, null, null, null, 62));
                break;
            case 5:
                stripeApiRepository.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.PaymentIntentRetrieve, null, null, null, null, 62));
                break;
            default:
                stripeApiRepository.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.SetupIntentCancelSource, null, null, null, null, 62));
                break;
        }
        return Unit.INSTANCE;
    }
}
