package com.stripe.android.payments.bankaccount.domain;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.StripeApiRepository;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class AttachFinancialConnectionsSession {
    public static final List EXPAND_PAYMENT_METHOD = CollectionsKt__CollectionsJVMKt.listOf("payment_method");
    public final StripeApiRepository stripeRepository;

    public AttachFinancialConnectionsSession(StripeApiRepository stripeApiRepository) {
        this.stripeRepository = stripeApiRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* renamed from: forPaymentIntent-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4056forPaymentIntentyxL6bBk(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        AttachFinancialConnectionsSession$forPaymentIntent$1 attachFinancialConnectionsSession$forPaymentIntent$1;
        int i;
        Object failure;
        Object m4027attachFinancialConnectionsSessionToPaymentIntenthUnOzRk;
        try {
            if (continuationImpl instanceof AttachFinancialConnectionsSession$forPaymentIntent$1) {
                attachFinancialConnectionsSession$forPaymentIntent$1 = (AttachFinancialConnectionsSession$forPaymentIntent$1) continuationImpl;
                int i2 = attachFinancialConnectionsSession$forPaymentIntent$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    attachFinancialConnectionsSession$forPaymentIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                    AttachFinancialConnectionsSession$forPaymentIntent$1 attachFinancialConnectionsSession$forPaymentIntent$12 = attachFinancialConnectionsSession$forPaymentIntent$1;
                    Object obj = attachFinancialConnectionsSession$forPaymentIntent$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = attachFinancialConnectionsSession$forPaymentIntent$12.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        try {
                            Result.Companion companion = Result.Companion;
                            failure = new PaymentIntent.ClientSecret(str3);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                        }
                        if (failure instanceof Result.Failure) {
                            return failure;
                        }
                        PaymentIntent.ClientSecret clientSecret = (PaymentIntent.ClientSecret) failure;
                        StripeApiRepository stripeApiRepository = this.stripeRepository;
                        String str5 = clientSecret.value;
                        String str6 = clientSecret.paymentIntentId;
                        ApiRequest.Options options = new ApiRequest.Options(str, str4, 4);
                        List list = EXPAND_PAYMENT_METHOD;
                        attachFinancialConnectionsSession$forPaymentIntent$12.label = 1;
                        m4027attachFinancialConnectionsSessionToPaymentIntenthUnOzRk = stripeApiRepository.m4027attachFinancialConnectionsSessionToPaymentIntenthUnOzRk(str5, str6, str2, options, list, attachFinancialConnectionsSession$forPaymentIntent$12);
                        if (m4027attachFinancialConnectionsSessionToPaymentIntenthUnOzRk == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        m4027attachFinancialConnectionsSessionToPaymentIntenthUnOzRk = ((Result) obj).value;
                    }
                    SafeTrace.throwOnFailure(m4027attachFinancialConnectionsSessionToPaymentIntenthUnOzRk);
                    PaymentIntent paymentIntent = (PaymentIntent) m4027attachFinancialConnectionsSessionToPaymentIntenthUnOzRk;
                    Result.Companion companion3 = Result.Companion;
                    return paymentIntent;
                }
            }
            if (i != 0) {
            }
            SafeTrace.throwOnFailure(m4027attachFinancialConnectionsSessionToPaymentIntenthUnOzRk);
            PaymentIntent paymentIntent2 = (PaymentIntent) m4027attachFinancialConnectionsSessionToPaymentIntenthUnOzRk;
            Result.Companion companion32 = Result.Companion;
            return paymentIntent2;
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            return new Result.Failure(th2);
        }
        attachFinancialConnectionsSession$forPaymentIntent$1 = new AttachFinancialConnectionsSession$forPaymentIntent$1(this, continuationImpl);
        AttachFinancialConnectionsSession$forPaymentIntent$1 attachFinancialConnectionsSession$forPaymentIntent$122 = attachFinancialConnectionsSession$forPaymentIntent$1;
        Object obj2 = attachFinancialConnectionsSession$forPaymentIntent$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = attachFinancialConnectionsSession$forPaymentIntent$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* renamed from: forSetupIntent-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4057forSetupIntentyxL6bBk(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        AttachFinancialConnectionsSession$forSetupIntent$1 attachFinancialConnectionsSession$forSetupIntent$1;
        int i;
        Object failure;
        Object m4028attachFinancialConnectionsSessionToSetupIntenthUnOzRk;
        try {
            if (continuationImpl instanceof AttachFinancialConnectionsSession$forSetupIntent$1) {
                attachFinancialConnectionsSession$forSetupIntent$1 = (AttachFinancialConnectionsSession$forSetupIntent$1) continuationImpl;
                int i2 = attachFinancialConnectionsSession$forSetupIntent$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    attachFinancialConnectionsSession$forSetupIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                    AttachFinancialConnectionsSession$forSetupIntent$1 attachFinancialConnectionsSession$forSetupIntent$12 = attachFinancialConnectionsSession$forSetupIntent$1;
                    Object obj = attachFinancialConnectionsSession$forSetupIntent$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = attachFinancialConnectionsSession$forSetupIntent$12.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        try {
                            Result.Companion companion = Result.Companion;
                            failure = new SetupIntent.ClientSecret(str3);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                        }
                        if (failure instanceof Result.Failure) {
                            return failure;
                        }
                        SetupIntent.ClientSecret clientSecret = (SetupIntent.ClientSecret) failure;
                        StripeApiRepository stripeApiRepository = this.stripeRepository;
                        String str5 = clientSecret.value;
                        String str6 = clientSecret.setupIntentId;
                        ApiRequest.Options options = new ApiRequest.Options(str, str4, 4);
                        List list = EXPAND_PAYMENT_METHOD;
                        attachFinancialConnectionsSession$forSetupIntent$12.label = 1;
                        m4028attachFinancialConnectionsSessionToSetupIntenthUnOzRk = stripeApiRepository.m4028attachFinancialConnectionsSessionToSetupIntenthUnOzRk(str5, str6, str2, options, list, attachFinancialConnectionsSession$forSetupIntent$12);
                        if (m4028attachFinancialConnectionsSessionToSetupIntenthUnOzRk == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        m4028attachFinancialConnectionsSessionToSetupIntenthUnOzRk = ((Result) obj).value;
                    }
                    SafeTrace.throwOnFailure(m4028attachFinancialConnectionsSessionToSetupIntenthUnOzRk);
                    SetupIntent setupIntent = (SetupIntent) m4028attachFinancialConnectionsSessionToSetupIntenthUnOzRk;
                    Result.Companion companion3 = Result.Companion;
                    return setupIntent;
                }
            }
            if (i != 0) {
            }
            SafeTrace.throwOnFailure(m4028attachFinancialConnectionsSessionToSetupIntenthUnOzRk);
            SetupIntent setupIntent2 = (SetupIntent) m4028attachFinancialConnectionsSessionToSetupIntenthUnOzRk;
            Result.Companion companion32 = Result.Companion;
            return setupIntent2;
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            return new Result.Failure(th2);
        }
        attachFinancialConnectionsSession$forSetupIntent$1 = new AttachFinancialConnectionsSession$forSetupIntent$1(this, continuationImpl);
        AttachFinancialConnectionsSession$forSetupIntent$1 attachFinancialConnectionsSession$forSetupIntent$122 = attachFinancialConnectionsSession$forSetupIntent$1;
        Object obj2 = attachFinancialConnectionsSession$forSetupIntent$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = attachFinancialConnectionsSession$forSetupIntent$122.label;
    }
}
