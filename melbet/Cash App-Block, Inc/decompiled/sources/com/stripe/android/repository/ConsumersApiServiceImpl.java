package com.stripe.android.repository;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.JsonUtilsKt;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams$BankAccount;
import com.stripe.android.model.CustomEmailType;
import com.stripe.android.model.SignUpParams;
import com.stripe.android.model.VerificationType;
import com.stripe.android.model.parsers.ConsumerSessionJsonParser;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.full.KClasses$$Lambda$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ConsumersApiServiceImpl {
    public final ApiRequest.Factory apiRequestFactory;
    public final KClasses$$Lambda$1 stripeErrorJsonParser = new KClasses$$Lambda$1(10);
    public final DefaultStripeNetworkClient stripeNetworkClient;

    public ConsumersApiServiceImpl(DefaultStripeNetworkClient defaultStripeNetworkClient, String str) {
        this.stripeNetworkClient = defaultStripeNetworkClient;
        this.apiRequestFactory = new ApiRequest.Factory(str, "AndroidBindings/23.9.1");
    }

    public static Object startConsumerVerification$default(ConsumersApiServiceImpl consumersApiServiceImpl, String str, Locale locale, String str2, VerificationType verificationType, CustomEmailType customEmailType, String str3, ApiRequest.Options options, FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1 financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1) {
        KClasses$$Lambda$1 kClasses$$Lambda$1 = consumersApiServiceImpl.stripeErrorJsonParser;
        DefaultStripeNetworkClient defaultStripeNetworkClient = consumersApiServiceImpl.stripeNetworkClient;
        ApiRequest.Factory factory = consumersApiServiceImpl.apiRequestFactory;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("request_surface", str2);
        mapBuilder.put("credentials", MapsKt__MapsJVMKt.mapOf(new Pair("consumer_session_client_secret", str)));
        mapBuilder.put("type", verificationType.value);
        if (customEmailType != null) {
            mapBuilder.put("custom_email_type", customEmailType.value);
        }
        if (str3 != null) {
            mapBuilder.put("connections_merchant_name", str3);
        }
        mapBuilder.put("locale", locale.toLanguageTag());
        return JsonUtilsKt.executeRequestWithModelJsonParser(defaultStripeNetworkClient, kClasses$$Lambda$1, ApiRequest.Factory.createPost$default(factory, "https://api.stripe.com/v1/consumers/sessions/start_verification", options, mapBuilder.build()), new ConsumerSessionJsonParser(), financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1);
    }

    public final Object confirmConsumerVerification(String str, String str2, String str3, VerificationType verificationType, ApiRequest.Options options, FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1 financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1) {
        String concat = "https://api.stripe.com/v1/".concat("consumers/sessions/confirm_verification");
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("request_surface", str3), new Pair("credentials", Thread$State$EnumUnboxingLocalUtility.m("consumer_session_client_secret", str)), new Pair("type", verificationType.value), new Pair("code", str2), new Pair("consent_granted", null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapOf.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return JsonUtilsKt.executeRequestWithModelJsonParser(this.stripeNetworkClient, this.stripeErrorJsonParser, ApiRequest.Factory.createPost$default(this.apiRequestFactory, concat, options, linkedHashMap), new ConsumerSessionJsonParser(), financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: createPaymentDetails-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4061createPaymentDetailsyxL6bBk(String str, ConsumerPaymentDetailsCreateParams$BankAccount consumerPaymentDetailsCreateParams$BankAccount, String str2, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        ConsumersApiServiceImpl$createPaymentDetails$1 consumersApiServiceImpl$createPaymentDetails$1;
        int i;
        if (continuationImpl instanceof ConsumersApiServiceImpl$createPaymentDetails$1) {
            consumersApiServiceImpl$createPaymentDetails$1 = (ConsumersApiServiceImpl$createPaymentDetails$1) continuationImpl;
            int i2 = consumersApiServiceImpl$createPaymentDetails$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                consumersApiServiceImpl$createPaymentDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = consumersApiServiceImpl$createPaymentDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = consumersApiServiceImpl$createPaymentDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                String concat = "https://api.stripe.com/v1/".concat("consumers/payment_details");
                Map mapOf = MapsKt__MapsKt.mapOf(new Pair("request_surface", str2), new Pair("credentials", Thread$State$EnumUnboxingLocalUtility.m("consumer_session_client_secret", str)));
                Map map = consumerPaymentDetailsCreateParams$BankAccount.billingAddress;
                MapBuilder mapBuilder = new MapBuilder();
                String str3 = consumerPaymentDetailsCreateParams$BankAccount.billingEmailAddress;
                if (str3 != null) {
                    mapBuilder.put("billing_email_address", str3);
                }
                if (map != null && !map.isEmpty()) {
                    mapBuilder.put("billing_address", map);
                }
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, concat, options, MapsKt__MapsKt.plus(mapOf, MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(MapsKt__MapsKt.mapOf(new Pair("type", "bank_account"), new Pair("bank_account", Thread$State$EnumUnboxingLocalUtility.m("account", consumerPaymentDetailsCreateParams$BankAccount.bankAccountId))), mapBuilder.build()), consumerPaymentDetailsCreateParams$BankAccount.clientAttributionMetadata)));
                SetupIntentJsonParser setupIntentJsonParser = SetupIntentJsonParser.INSTANCE$1;
                consumersApiServiceImpl$createPaymentDetails$1.label = 1;
                Object executeRequestWithResultParser = JsonUtilsKt.executeRequestWithResultParser(this.stripeNetworkClient, this.stripeErrorJsonParser, createPost$default, setupIntentJsonParser, consumersApiServiceImpl$createPaymentDetails$1);
                return executeRequestWithResultParser == coroutineSingletons ? coroutineSingletons : executeRequestWithResultParser;
            }
        }
        consumersApiServiceImpl$createPaymentDetails$1 = new ConsumersApiServiceImpl$createPaymentDetails$1(this, continuationImpl);
        Object obj2 = consumersApiServiceImpl$createPaymentDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = consumersApiServiceImpl$createPaymentDetails$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: mobileSignUp-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4062mobileSignUp0E7RQCE(SignUpParams signUpParams, ApiRequest.Options options, Continuation continuation) {
        ConsumersApiServiceImpl$mobileSignUp$1 consumersApiServiceImpl$mobileSignUp$1;
        int i;
        if (continuation instanceof ConsumersApiServiceImpl$mobileSignUp$1) {
            consumersApiServiceImpl$mobileSignUp$1 = (ConsumersApiServiceImpl$mobileSignUp$1) continuation;
            int i2 = consumersApiServiceImpl$mobileSignUp$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                consumersApiServiceImpl$mobileSignUp$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = consumersApiServiceImpl$mobileSignUp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = consumersApiServiceImpl$mobileSignUp$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/".concat("consumers/mobile/sign_up"), options, signUpParams.toParamMap());
                SetupIntentJsonParser setupIntentJsonParser = SetupIntentJsonParser.INSTANCE$2;
                consumersApiServiceImpl$mobileSignUp$1.label = 1;
                Object executeRequestWithResultParser = JsonUtilsKt.executeRequestWithResultParser(this.stripeNetworkClient, this.stripeErrorJsonParser, createPost$default, setupIntentJsonParser, consumersApiServiceImpl$mobileSignUp$1);
                return executeRequestWithResultParser == coroutineSingletons ? coroutineSingletons : executeRequestWithResultParser;
            }
        }
        consumersApiServiceImpl$mobileSignUp$1 = new ConsumersApiServiceImpl$mobileSignUp$1(this, continuation);
        Object obj2 = consumersApiServiceImpl$mobileSignUp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = consumersApiServiceImpl$mobileSignUp$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: sharePaymentDetails-eH_QyT8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4063sharePaymentDetailseH_QyT8(String str, String str2, String str3, String str4, String str5, ApiRequest.Options options, LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        ConsumersApiServiceImpl$sharePaymentDetails$1 consumersApiServiceImpl$sharePaymentDetails$1;
        int i;
        if (continuationImpl instanceof ConsumersApiServiceImpl$sharePaymentDetails$1) {
            consumersApiServiceImpl$sharePaymentDetails$1 = (ConsumersApiServiceImpl$sharePaymentDetails$1) continuationImpl;
            int i2 = consumersApiServiceImpl$sharePaymentDetails$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                consumersApiServiceImpl$sharePaymentDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = consumersApiServiceImpl$sharePaymentDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = consumersApiServiceImpl$sharePaymentDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/".concat("consumers/payment_details/share"), options, MapsKt__MapsKt.plus(MapsKt__MapsKt.mapOf(new Pair("request_surface", str5), new Pair("id", str2), new Pair("expected_payment_method_type", str3), new Pair("credentials", Thread$State$EnumUnboxingLocalUtility.m("consumer_session_client_secret", str)), new Pair("billing_phone", str4)), linkedHashMap));
                SetupIntentJsonParser setupIntentJsonParser = SetupIntentJsonParser.INSTANCE$3;
                consumersApiServiceImpl$sharePaymentDetails$1.label = 1;
                Object executeRequestWithResultParser = JsonUtilsKt.executeRequestWithResultParser(this.stripeNetworkClient, this.stripeErrorJsonParser, createPost$default, setupIntentJsonParser, consumersApiServiceImpl$sharePaymentDetails$1);
                return executeRequestWithResultParser == coroutineSingletons ? coroutineSingletons : executeRequestWithResultParser;
            }
        }
        consumersApiServiceImpl$sharePaymentDetails$1 = new ConsumersApiServiceImpl$sharePaymentDetails$1(this, continuationImpl);
        Object obj2 = consumersApiServiceImpl$sharePaymentDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = consumersApiServiceImpl$sharePaymentDetails$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: signUp-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4064signUp0E7RQCE(SignUpParams signUpParams, ApiRequest.Options options, Continuation continuation) {
        ConsumersApiServiceImpl$signUp$1 consumersApiServiceImpl$signUp$1;
        int i;
        if (continuation instanceof ConsumersApiServiceImpl$signUp$1) {
            consumersApiServiceImpl$signUp$1 = (ConsumersApiServiceImpl$signUp$1) continuation;
            int i2 = consumersApiServiceImpl$signUp$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                consumersApiServiceImpl$signUp$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = consumersApiServiceImpl$signUp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = consumersApiServiceImpl$signUp$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/".concat("consumers/accounts/sign_up"), options, signUpParams.toParamMap());
                SetupIntentJsonParser setupIntentJsonParser = SetupIntentJsonParser.INSTANCE$2;
                consumersApiServiceImpl$signUp$1.label = 1;
                Object executeRequestWithResultParser = JsonUtilsKt.executeRequestWithResultParser(this.stripeNetworkClient, this.stripeErrorJsonParser, createPost$default, setupIntentJsonParser, consumersApiServiceImpl$signUp$1);
                return executeRequestWithResultParser == coroutineSingletons ? coroutineSingletons : executeRequestWithResultParser;
            }
        }
        consumersApiServiceImpl$signUp$1 = new ConsumersApiServiceImpl$signUp$1(this, continuation);
        Object obj2 = consumersApiServiceImpl$signUp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = consumersApiServiceImpl$signUp$1.label;
        if (i == 0) {
        }
    }
}
