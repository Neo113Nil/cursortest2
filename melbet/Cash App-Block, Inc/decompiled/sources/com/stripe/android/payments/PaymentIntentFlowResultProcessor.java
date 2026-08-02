package com.stripe.android.payments;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.PaymentIntentResult;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class PaymentIntentFlowResultProcessor extends PaymentFlowResultProcessor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntentFlowResultProcessor(Context context, Function0 function0, StripeRepository stripeRepository, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, CoroutineContext coroutineContext) {
        super(context, new SetupIntentFlowResultProcessor$$ExternalSyntheticLambda0(2, function0), stripeRepository, logger$Companion$NOOP_LOGGER$1, coroutineContext);
        context.getClass();
        function0.getClass();
        stripeRepository.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        coroutineContext.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    /* renamed from: cancelStripeIntentSource-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4052cancelStripeIntentSourceBWLJW6A(ApiRequest.Options options, String str, String str2, ContinuationImpl continuationImpl) {
        PaymentIntentFlowResultProcessor$cancelStripeIntentSource$1 paymentIntentFlowResultProcessor$cancelStripeIntentSource$1;
        int i;
        if (continuationImpl instanceof PaymentIntentFlowResultProcessor$cancelStripeIntentSource$1) {
            paymentIntentFlowResultProcessor$cancelStripeIntentSource$1 = (PaymentIntentFlowResultProcessor$cancelStripeIntentSource$1) continuationImpl;
            int i2 = paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.label = 1;
                    Object m4030cancelPaymentIntentSourceBWLJW6A = ((StripeApiRepository) this.stripeRepository).m4030cancelPaymentIntentSourceBWLJW6A(options, str, str2, paymentIntentFlowResultProcessor$cancelStripeIntentSource$1);
                    return m4030cancelPaymentIntentSourceBWLJW6A == coroutineSingletons ? coroutineSingletons : m4030cancelPaymentIntentSourceBWLJW6A;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return ((Result) obj).value;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        paymentIntentFlowResultProcessor$cancelStripeIntentSource$1 = new PaymentIntentFlowResultProcessor$cancelStripeIntentSource$1(this, continuationImpl);
        Object obj2 = paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.label;
        if (i != 0) {
        }
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public final StripeIntentResult createStripeIntentResult(int i, StripeIntent stripeIntent, String str) {
        return new PaymentIntentResult((PaymentIntent) stripeIntent, i, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    /* renamed from: refreshStripeIntent-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4054refreshStripeIntentBWLJW6A(String str, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        PaymentIntentFlowResultProcessor$refreshStripeIntent$1 paymentIntentFlowResultProcessor$refreshStripeIntent$1;
        int i;
        if (continuationImpl instanceof PaymentIntentFlowResultProcessor$refreshStripeIntent$1) {
            paymentIntentFlowResultProcessor$refreshStripeIntent$1 = (PaymentIntentFlowResultProcessor$refreshStripeIntent$1) continuationImpl;
            int i2 = paymentIntentFlowResultProcessor$refreshStripeIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentIntentFlowResultProcessor$refreshStripeIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentIntentFlowResultProcessor$refreshStripeIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentIntentFlowResultProcessor$refreshStripeIntent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    paymentIntentFlowResultProcessor$refreshStripeIntent$1.label = 1;
                    Object m4045refreshPaymentIntent0E7RQCE = ((StripeApiRepository) this.stripeRepository).m4045refreshPaymentIntent0E7RQCE(str, options, paymentIntentFlowResultProcessor$refreshStripeIntent$1);
                    return m4045refreshPaymentIntent0E7RQCE == coroutineSingletons ? coroutineSingletons : m4045refreshPaymentIntent0E7RQCE;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return ((Result) obj).value;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        paymentIntentFlowResultProcessor$refreshStripeIntent$1 = new PaymentIntentFlowResultProcessor$refreshStripeIntent$1(this, continuationImpl);
        Object obj2 = paymentIntentFlowResultProcessor$refreshStripeIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentIntentFlowResultProcessor$refreshStripeIntent$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    /* renamed from: retrieveStripeIntent-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4055retrieveStripeIntentBWLJW6A(String str, ApiRequest.Options options, List list, ContinuationImpl continuationImpl) {
        PaymentIntentFlowResultProcessor$retrieveStripeIntent$1 paymentIntentFlowResultProcessor$retrieveStripeIntent$1;
        int i;
        if (continuationImpl instanceof PaymentIntentFlowResultProcessor$retrieveStripeIntent$1) {
            paymentIntentFlowResultProcessor$retrieveStripeIntent$1 = (PaymentIntentFlowResultProcessor$retrieveStripeIntent$1) continuationImpl;
            int i2 = paymentIntentFlowResultProcessor$retrieveStripeIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentIntentFlowResultProcessor$retrieveStripeIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentIntentFlowResultProcessor$retrieveStripeIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentIntentFlowResultProcessor$retrieveStripeIntent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    paymentIntentFlowResultProcessor$retrieveStripeIntent$1.label = 1;
                    Object m4047retrievePaymentIntentBWLJW6A = ((StripeApiRepository) this.stripeRepository).m4047retrievePaymentIntentBWLJW6A(str, options, list, paymentIntentFlowResultProcessor$retrieveStripeIntent$1);
                    return m4047retrievePaymentIntentBWLJW6A == coroutineSingletons ? coroutineSingletons : m4047retrievePaymentIntentBWLJW6A;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return ((Result) obj).value;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        paymentIntentFlowResultProcessor$retrieveStripeIntent$1 = new PaymentIntentFlowResultProcessor$retrieveStripeIntent$1(this, continuationImpl);
        Object obj2 = paymentIntentFlowResultProcessor$retrieveStripeIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentIntentFlowResultProcessor$retrieveStripeIntent$1.label;
        if (i != 0) {
        }
    }
}
