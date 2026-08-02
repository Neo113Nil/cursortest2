package com.stripe.android.payments;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.SetupIntent;
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
public final class SetupIntentFlowResultProcessor extends PaymentFlowResultProcessor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupIntentFlowResultProcessor(Context context, Function0 function0, StripeRepository stripeRepository, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, CoroutineContext coroutineContext) {
        super(context, new SetupIntentFlowResultProcessor$$ExternalSyntheticLambda0(0, function0), stripeRepository, logger$Companion$NOOP_LOGGER$1, coroutineContext);
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
        SetupIntentFlowResultProcessor$cancelStripeIntentSource$1 setupIntentFlowResultProcessor$cancelStripeIntentSource$1;
        int i;
        if (continuationImpl instanceof SetupIntentFlowResultProcessor$cancelStripeIntentSource$1) {
            setupIntentFlowResultProcessor$cancelStripeIntentSource$1 = (SetupIntentFlowResultProcessor$cancelStripeIntentSource$1) continuationImpl;
            int i2 = setupIntentFlowResultProcessor$cancelStripeIntentSource$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setupIntentFlowResultProcessor$cancelStripeIntentSource$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = setupIntentFlowResultProcessor$cancelStripeIntentSource$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setupIntentFlowResultProcessor$cancelStripeIntentSource$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    setupIntentFlowResultProcessor$cancelStripeIntentSource$1.label = 1;
                    Object m4032cancelSetupIntentSourceBWLJW6A = ((StripeApiRepository) this.stripeRepository).m4032cancelSetupIntentSourceBWLJW6A(options, str, str2, setupIntentFlowResultProcessor$cancelStripeIntentSource$1);
                    return m4032cancelSetupIntentSourceBWLJW6A == coroutineSingletons ? coroutineSingletons : m4032cancelSetupIntentSourceBWLJW6A;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return ((Result) obj).value;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        setupIntentFlowResultProcessor$cancelStripeIntentSource$1 = new SetupIntentFlowResultProcessor$cancelStripeIntentSource$1(this, continuationImpl);
        Object obj2 = setupIntentFlowResultProcessor$cancelStripeIntentSource$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setupIntentFlowResultProcessor$cancelStripeIntentSource$1.label;
        if (i != 0) {
        }
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public final StripeIntentResult createStripeIntentResult(int i, StripeIntent stripeIntent, String str) {
        return new SetupIntentResult((SetupIntent) stripeIntent, i, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    /* renamed from: refreshStripeIntent-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4054refreshStripeIntentBWLJW6A(String str, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        SetupIntentFlowResultProcessor$refreshStripeIntent$1 setupIntentFlowResultProcessor$refreshStripeIntent$1;
        int i;
        if (continuationImpl instanceof SetupIntentFlowResultProcessor$refreshStripeIntent$1) {
            setupIntentFlowResultProcessor$refreshStripeIntent$1 = (SetupIntentFlowResultProcessor$refreshStripeIntent$1) continuationImpl;
            int i2 = setupIntentFlowResultProcessor$refreshStripeIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setupIntentFlowResultProcessor$refreshStripeIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = setupIntentFlowResultProcessor$refreshStripeIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setupIntentFlowResultProcessor$refreshStripeIntent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    setupIntentFlowResultProcessor$refreshStripeIntent$1.label = 1;
                    Object m4046refreshSetupIntent0E7RQCE = ((StripeApiRepository) this.stripeRepository).m4046refreshSetupIntent0E7RQCE(str, options, setupIntentFlowResultProcessor$refreshStripeIntent$1);
                    return m4046refreshSetupIntent0E7RQCE == coroutineSingletons ? coroutineSingletons : m4046refreshSetupIntent0E7RQCE;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return ((Result) obj).value;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        setupIntentFlowResultProcessor$refreshStripeIntent$1 = new SetupIntentFlowResultProcessor$refreshStripeIntent$1(this, continuationImpl);
        Object obj2 = setupIntentFlowResultProcessor$refreshStripeIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setupIntentFlowResultProcessor$refreshStripeIntent$1.label;
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
        SetupIntentFlowResultProcessor$retrieveStripeIntent$1 setupIntentFlowResultProcessor$retrieveStripeIntent$1;
        int i;
        if (continuationImpl instanceof SetupIntentFlowResultProcessor$retrieveStripeIntent$1) {
            setupIntentFlowResultProcessor$retrieveStripeIntent$1 = (SetupIntentFlowResultProcessor$retrieveStripeIntent$1) continuationImpl;
            int i2 = setupIntentFlowResultProcessor$retrieveStripeIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setupIntentFlowResultProcessor$retrieveStripeIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = setupIntentFlowResultProcessor$retrieveStripeIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setupIntentFlowResultProcessor$retrieveStripeIntent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    setupIntentFlowResultProcessor$retrieveStripeIntent$1.label = 1;
                    Object m4048retrieveSetupIntentBWLJW6A = ((StripeApiRepository) this.stripeRepository).m4048retrieveSetupIntentBWLJW6A(str, options, list, setupIntentFlowResultProcessor$retrieveStripeIntent$1);
                    return m4048retrieveSetupIntentBWLJW6A == coroutineSingletons ? coroutineSingletons : m4048retrieveSetupIntentBWLJW6A;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return ((Result) obj).value;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        setupIntentFlowResultProcessor$retrieveStripeIntent$1 = new SetupIntentFlowResultProcessor$retrieveStripeIntent$1(this, continuationImpl);
        Object obj2 = setupIntentFlowResultProcessor$retrieveStripeIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setupIntentFlowResultProcessor$retrieveStripeIntent$1.label;
        if (i != 0) {
        }
    }
}
