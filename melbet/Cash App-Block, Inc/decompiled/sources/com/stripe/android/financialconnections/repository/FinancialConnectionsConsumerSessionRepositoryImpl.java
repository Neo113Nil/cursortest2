package com.stripe.android.financialconnections.repository;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository;
import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.JsonUtilsKt;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe;
import com.stripe.android.financialconnections.repository.api.FinancialConnectionsConsumersApiServiceImpl;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams$BankAccount;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.ConsumerSignUpConsentAction;
import com.stripe.android.model.EmailSource;
import com.stripe.android.model.SignUpParams;
import com.stripe.android.model.VerificationType;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.MapBuilderEntries;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import net.idrnd.misnap.iad.Payload;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsConsumerSessionRepositoryImpl {
    public final RealConsumerSessionRepository consumerSessionRepository;
    public final ConsumersApiServiceImpl consumersApiService;
    public final ElementsSessionContext elementsSessionContext;
    public final FinancialConnectionsConsumersApiServiceImpl financialConnectionsConsumersApiService;
    public final DefaultFraudDetectionDataRepository fraudDetectionDataRepository;
    public final Locale locale;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final MutexImpl mutex = new MutexImpl();
    public final ProvideApiRequestOptions provideApiRequestOptions;
    public final String requestSurface;

    public FinancialConnectionsConsumerSessionRepositoryImpl(FinancialConnectionsConsumersApiServiceImpl financialConnectionsConsumersApiServiceImpl, ConsumersApiServiceImpl consumersApiServiceImpl, RealConsumerSessionRepository realConsumerSessionRepository, ProvideApiRequestOptions provideApiRequestOptions, Locale locale, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository, ElementsSessionContext elementsSessionContext, RealIsLinkWithStripe realIsLinkWithStripe) {
        this.financialConnectionsConsumersApiService = financialConnectionsConsumersApiServiceImpl;
        this.consumersApiService = consumersApiServiceImpl;
        this.consumerSessionRepository = realConsumerSessionRepository;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.locale = locale;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.fraudDetectionDataRepository = defaultFraudDetectionDataRepository;
        this.elementsSessionContext = elementsSessionContext;
        this.requestSurface = realIsLinkWithStripe.initialState.isLinkWithStripe ? "android_instant_debits" : "android_connections";
        if (defaultFraudDetectionDataRepository.fraudDetectionEnabledProvider.provideFraudDetectionEnabled()) {
            JobKt.launch$default(JobKt.CoroutineScope(defaultFraudDetectionDataRepository.workContext), null, null, new ExoPlayerVideoView.AnonymousClass2(defaultFraudDetectionDataRepository, null, 22), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmConsumerVerification(String str, String str2, VerificationType verificationType, ContinuationImpl continuationImpl) {
        FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1 financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;
        Object obj;
        int i;
        String str3;
        VerificationType verificationType2;
        Mutex mutex;
        int i2;
        Throwable th;
        Mutex mutex2;
        Object confirmConsumerVerification;
        Object obj2;
        try {
            if (continuationImpl instanceof FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1) {
                financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1 = (FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1) continuationImpl;
                int i3 = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1.label = i3 - PKIFailureInfo.systemUnavail;
                    FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1 financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12 = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;
                    Object obj3 = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.result;
                    obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj3);
                        financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$0 = str;
                        financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$1 = str2;
                        financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$2 = verificationType;
                        MutexImpl mutexImpl = this.mutex;
                        financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$3 = mutexImpl;
                        financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.I$0 = 0;
                        financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.label = 1;
                        if (mutexImpl.lock(financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12) != obj) {
                            str3 = str2;
                            verificationType2 = verificationType;
                            mutex = mutexImpl;
                            i2 = 0;
                        }
                        return obj;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex2 = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$3;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            obj2 = obj3;
                            updateCachedConsumerSession((ConsumerSession) obj2, "confirmConsumerVerification");
                            mutex2.unlock(null);
                            return obj2;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    int i4 = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.I$0;
                    mutex = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$3;
                    VerificationType verificationType3 = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$2;
                    String str4 = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$1;
                    String str5 = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    verificationType2 = verificationType3;
                    i2 = i4;
                    str = str5;
                    str3 = str4;
                    ConsumersApiServiceImpl consumersApiServiceImpl = this.consumersApiService;
                    String str6 = this.requestSurface;
                    ApiRequest.Options invoke = this.provideApiRequestOptions.invoke(false);
                    financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$0 = null;
                    financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$1 = null;
                    financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$2 = null;
                    financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$3 = mutex;
                    financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.I$0 = i2;
                    financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.label = 2;
                    confirmConsumerVerification = consumersApiServiceImpl.confirmConsumerVerification(str, str3, str6, verificationType2, invoke, financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12);
                    if (confirmConsumerVerification != obj) {
                        mutex2 = mutex;
                        obj2 = confirmConsumerVerification;
                        updateCachedConsumerSession((ConsumerSession) obj2, "confirmConsumerVerification");
                        mutex2.unlock(null);
                        return obj2;
                    }
                    return obj;
                }
            }
            ConsumersApiServiceImpl consumersApiServiceImpl2 = this.consumersApiService;
            String str62 = this.requestSurface;
            ApiRequest.Options invoke2 = this.provideApiRequestOptions.invoke(false);
            financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$0 = null;
            financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$1 = null;
            financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$2 = null;
            financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.L$3 = mutex;
            financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.I$0 = i2;
            financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12.label = 2;
            confirmConsumerVerification = consumersApiServiceImpl2.confirmConsumerVerification(str, str3, str62, verificationType2, invoke2, financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$12);
            if (confirmConsumerVerification != obj) {
            }
            return obj;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1 = new FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1(this, continuationImpl);
        FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1 financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$122 = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;
        Object obj32 = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$122.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPaymentDetails(String str, String str2, ElementsSessionContext.BillingDetails billingDetails, ContinuationImpl continuationImpl) {
        FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1 financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;
        int i;
        LinkedHashMap linkedHashMap;
        Object m4061createPaymentDetailsyxL6bBk;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (continuationImpl instanceof FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1) {
            financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1 = (FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1) continuationImpl;
            int i2 = financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1 financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$12 = financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;
                Object obj = financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (billingDetails != null) {
                        MapBuilder mapBuilder = new MapBuilder();
                        String str9 = billingDetails.name;
                        ElementsSessionContext.BillingDetails.Address address = billingDetails.address;
                        if (str9 != null) {
                            mapBuilder.put("name", str9);
                        }
                        MapBuilder build = mapBuilder.build();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Object it = ((MapBuilderEntries) build.entrySet()).iterator();
                        while (((MapBuilder.Itr) it).hasNext()) {
                            Map.Entry entry = (Map.Entry) ((MapBuilder.KeysItr) it).next();
                            if (!StringsKt.isBlank((CharSequence) entry.getValue())) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        MapBuilder mapBuilder2 = new MapBuilder();
                        if (address != null && (str8 = address.line1) != null) {
                        }
                        if (address != null && (str7 = address.line2) != null) {
                        }
                        if (address != null && (str6 = address.postalCode) != null) {
                        }
                        if (address != null && (str5 = address.city) != null) {
                        }
                        if (address != null && (str4 = address.state) != null) {
                        }
                        if (address != null && (str3 = address.country) != null) {
                            mapBuilder2.put("country_code", str3);
                        }
                        MapBuilder build2 = mapBuilder2.build();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        Object it2 = ((MapBuilderEntries) build2.entrySet()).iterator();
                        while (((MapBuilder.Itr) it2).hasNext()) {
                            Map.Entry entry2 = (Map.Entry) ((MapBuilder.KeysItr) it2).next();
                            if (!StringsKt.isBlank((String) entry2.getValue())) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        linkedHashMap = MapsKt__MapsKt.plus(linkedHashMap2, linkedHashMap3);
                    } else {
                        linkedHashMap = null;
                    }
                    String str10 = billingDetails != null ? billingDetails.email : null;
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    ConsumerPaymentDetailsCreateParams$BankAccount consumerPaymentDetailsCreateParams$BankAccount = new ConsumerPaymentDetailsCreateParams$BankAccount(str, linkedHashMap, str10, emptyMap);
                    ApiRequest.Options invoke = this.provideApiRequestOptions.invoke(true);
                    financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$12.label = 1;
                    m4061createPaymentDetailsyxL6bBk = this.consumersApiService.m4061createPaymentDetailsyxL6bBk(str2, consumerPaymentDetailsCreateParams$BankAccount, this.requestSurface, invoke, financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$12);
                    if (m4061createPaymentDetailsyxL6bBk == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m4061createPaymentDetailsyxL6bBk = ((Result) obj).value;
                }
                SafeTrace.throwOnFailure(m4061createPaymentDetailsyxL6bBk);
                return m4061createPaymentDetailsyxL6bBk;
            }
        }
        financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1 = new FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1(this, continuationImpl);
        FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1 financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$122 = financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;
        Object obj2 = financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$122.label;
        if (i != 0) {
        }
        SafeTrace.throwOnFailure(m4061createPaymentDetailsyxL6bBk);
        return m4061createPaymentDetailsyxL6bBk;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mobileLookupConsumerSession(String str, EmailSource emailSource, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1 financialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;
        int i;
        String str5;
        CachedConsumerSession cachedConsumerSession;
        if (continuationImpl instanceof FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1) {
            financialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1 = (FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1) continuationImpl;
            int i2 = financialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ApiRequest.Options invoke = this.provideApiRequestOptions.invoke(false);
                    financialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1.label = 1;
                    ConsumersApiServiceImpl consumersApiServiceImpl = this.consumersApiService;
                    KClasses$$Lambda$1 kClasses$$Lambda$1 = consumersApiServiceImpl.stripeErrorJsonParser;
                    DefaultStripeNetworkClient defaultStripeNetworkClient = consumersApiServiceImpl.stripeNetworkClient;
                    ApiRequest.Factory factory = consumersApiServiceImpl.apiRequestFactory;
                    Pair pair = new Pair("request_surface", this.requestSurface);
                    if (str != null) {
                        str5 = str.toLowerCase(Locale.ROOT);
                        str5.getClass();
                    } else {
                        str5 = null;
                    }
                    Pair pair2 = new Pair("email_address", str5);
                    cachedConsumerSession = null;
                    Map mapOf = MapsKt__MapsKt.mapOf(pair, pair2, new Pair("link_auth_intent_id", null), new Pair("android_verification_token", str2), new Pair("session_id", str3), new Pair("email_source", emailSource != null ? emailSource.backendValue : null), new Pair("app_id", str4), new Pair("customer_id", null), new Pair("supported_verification_types", null), new Pair("link_auth_token_client_secret", null));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : mapOf.entrySet()) {
                        if (entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    obj = JsonUtilsKt.executeRequestWithModelJsonParser(defaultStripeNetworkClient, kClasses$$Lambda$1, ApiRequest.Factory.createPost$default(factory, "https://api.stripe.com/v1/consumers/mobile/sessions/lookup", invoke, linkedHashMap), new Payload(5), financialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    cachedConsumerSession = null;
                }
                ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) obj;
                this.logger.debug("SYNC_CACHE: updating local consumer session from lookupConsumerSession");
                ConsumerSession consumerSession = consumerSessionLookup.consumerSession;
                this.consumerSessionRepository.savedStateHandle.set(consumerSession == null ? RealConsumerSessionRepository.toCached(consumerSession, consumerSessionLookup.publishableKey) : cachedConsumerSession, "ConsumerSession");
                return obj;
            }
        }
        financialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1 = new FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1(this, continuationImpl);
        Object obj2 = financialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1.label;
        if (i != 0) {
        }
        ConsumerSessionLookup consumerSessionLookup2 = (ConsumerSessionLookup) obj2;
        this.logger.debug("SYNC_CACHE: updating local consumer session from lookupConsumerSession");
        ConsumerSession consumerSession2 = consumerSessionLookup2.consumerSession;
        this.consumerSessionRepository.savedStateHandle.set(consumerSession2 == null ? RealConsumerSessionRepository.toCached(consumerSession2, consumerSessionLookup2.publishableKey) : cachedConsumerSession, "ConsumerSession");
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00df A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002e, B:13:0x00d7, B:15:0x00df, B:17:0x00f5, B:18:0x00fb, B:20:0x00fe), top: B:11:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:32:0x0091, B:34:0x0099, B:36:0x00a5, B:37:0x00ac), top: B:31:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:32:0x0091, B:34:0x0099, B:36:0x00a5, B:37:0x00ac), top: B:31:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r29v0, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performSignUp(String str, String str2, String str3, String str4, String str5, Function3 function3, ContinuationImpl continuationImpl) {
        FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1 financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        String str6;
        String str7;
        int i2;
        String str8;
        String str9;
        String str10;
        Function3 function32;
        Mutex mutex;
        Object obj2;
        try {
            if (continuationImpl instanceof FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1) {
                financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1 = (FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1) continuationImpl;
                int i3 = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.label = i3 - PKIFailureInfo.systemUnavail;
                    obj = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$0 = str;
                        financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$1 = str2;
                        financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$2 = str3;
                        financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$3 = str4;
                        financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$4 = str5;
                        financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$5 = (FunctionReferenceImpl) function3;
                        mutexImpl = this.mutex;
                        financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$6 = mutexImpl;
                        financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.I$0 = 0;
                        financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.label = 1;
                        if (mutexImpl.lock(financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1) != coroutineSingletons) {
                            str6 = str;
                            str7 = str2;
                            i2 = 0;
                            str8 = str3;
                            str9 = str4;
                            str10 = str5;
                            function32 = function3;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$6;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            obj2 = ((Result) obj).value;
                            if (!(obj2 instanceof Result.Failure)) {
                                ConsumerSessionSignup consumerSessionSignup = (ConsumerSessionSignup) obj2;
                                this.logger.debug("SYNC_CACHE: updating local consumer session from signUp");
                                RealConsumerSessionRepository realConsumerSessionRepository = this.consumerSessionRepository;
                                ConsumerSession consumerSession = consumerSessionSignup.consumerSession;
                                realConsumerSessionRepository.savedStateHandle.set(consumerSession != null ? RealConsumerSessionRepository.toCached(consumerSession, consumerSessionSignup.publishableKey) : null, "ConsumerSession");
                            }
                            SafeTrace.throwOnFailure(obj2);
                            ConsumerSessionSignup consumerSessionSignup2 = (ConsumerSessionSignup) obj2;
                            mutex.unlock(null);
                            return consumerSessionSignup2;
                        } catch (Throwable th) {
                            th = th;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    i2 = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.I$0;
                    ?? r6 = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$6;
                    function32 = (Function3) financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$5;
                    String str11 = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$4;
                    String str12 = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$3;
                    String str13 = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$2;
                    String str14 = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$1;
                    str6 = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                    str7 = str14;
                    mutexImpl = r6;
                    Locale locale = this.locale;
                    ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
                    Long l = elementsSessionContext == null ? elementsSessionContext.amount : null;
                    String str15 = elementsSessionContext == null ? elementsSessionContext.currency : null;
                    String str16 = this.requestSurface;
                    ConsumerSignUpConsentAction consumerSignUpConsentAction = ConsumerSignUpConsentAction.EnteredPhoneNumberClickedSaveToLink;
                    SignUpParams signUpParams = new SignUpParams(str6, str7, str8, locale, l, str15, str16, str9, str10);
                    ApiRequest.Options invoke = this.provideApiRequestOptions.invoke(false);
                    financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$0 = null;
                    financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$1 = null;
                    financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$2 = null;
                    financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$3 = null;
                    financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$4 = null;
                    financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$5 = null;
                    financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$6 = mutexImpl;
                    financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.I$0 = i2;
                    financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.label = 2;
                    obj = function32.invoke(signUpParams, invoke, financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1);
                    if (obj != coroutineSingletons) {
                        mutex = mutexImpl;
                        obj2 = ((Result) obj).value;
                        if (!(obj2 instanceof Result.Failure)) {
                        }
                        SafeTrace.throwOnFailure(obj2);
                        ConsumerSessionSignup consumerSessionSignup22 = (ConsumerSessionSignup) obj2;
                        mutex.unlock(null);
                        return consumerSessionSignup22;
                    }
                    return coroutineSingletons;
                }
            }
            Locale locale2 = this.locale;
            ElementsSessionContext elementsSessionContext2 = this.elementsSessionContext;
            if (elementsSessionContext2 == null) {
            }
            if (elementsSessionContext2 == null) {
            }
            String str162 = this.requestSurface;
            ConsumerSignUpConsentAction consumerSignUpConsentAction2 = ConsumerSignUpConsentAction.EnteredPhoneNumberClickedSaveToLink;
            SignUpParams signUpParams2 = new SignUpParams(str6, str7, str8, locale2, l, str15, str162, str9, str10);
            ApiRequest.Options invoke2 = this.provideApiRequestOptions.invoke(false);
            financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$0 = null;
            financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$1 = null;
            financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$2 = null;
            financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$3 = null;
            financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$4 = null;
            financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$5 = null;
            financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.L$6 = mutexImpl;
            financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.I$0 = i2;
            financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.label = 2;
            obj = function32.invoke(signUpParams2, invoke2, financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1 = new FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1(this, continuationImpl);
        obj = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsConsumerSessionRepositoryImpl$performSignUp$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postConsumerSession(String str, String str2, ContinuationImpl continuationImpl) {
        FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1 financialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;
        int i;
        if (continuationImpl instanceof FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1) {
            financialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1 = (FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1) continuationImpl;
            int i2 = financialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    financialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1.label = 1;
                    FinancialConnectionsConsumersApiServiceImpl financialConnectionsConsumersApiServiceImpl = this.financialConnectionsConsumersApiService;
                    ApiRequest.Factory factory = financialConnectionsConsumersApiServiceImpl.apiRequestFactory;
                    ApiRequest.Options options = financialConnectionsConsumersApiServiceImpl.apiOptions;
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    obj = financialConnectionsConsumersApiServiceImpl.requestExecutor.execute(ApiRequest.Factory.createPost$default(factory, "https://api.stripe.com/v1/connections/link_account_sessions/consumer_sessions", options, MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("email_address", lowerCase), new Pair("client_secret", str2), new Pair("request_surface", this.requestSurface)))), ConsumerSessionLookup.Companion.serializer(), financialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) obj;
                this.logger.debug("SYNC_CACHE: updating local consumer session from lookupConsumerSession");
                ConsumerSession consumerSession = consumerSessionLookup.consumerSession;
                this.consumerSessionRepository.savedStateHandle.set(consumerSession != null ? RealConsumerSessionRepository.toCached(consumerSession, consumerSessionLookup.publishableKey) : null, "ConsumerSession");
                return obj;
            }
        }
        financialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1 = new FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1(this, continuationImpl);
        Object obj2 = financialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1.label;
        if (i != 0) {
        }
        ConsumerSessionLookup consumerSessionLookup2 = (ConsumerSessionLookup) obj2;
        this.logger.debug("SYNC_CACHE: updating local consumer session from lookupConsumerSession");
        ConsumerSession consumerSession2 = consumerSessionLookup2.consumerSession;
        this.consumerSessionRepository.savedStateHandle.set(consumerSession2 != null ? RealConsumerSessionRepository.toCached(consumerSession2, consumerSessionLookup2.publishableKey) : null, "ConsumerSession");
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sharePaymentDetails(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1 financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;
        int i;
        Object m4063sharePaymentDetailseH_QyT8;
        ElementsSessionContext.BillingDetails billingDetails;
        String str4;
        if (continuationImpl instanceof FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1) {
            financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1 = (FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1) continuationImpl;
            int i2 = financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1 financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$12 = financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;
                Object obj = financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FraudDetectionData cached = this.fraudDetectionDataRepository.getCached();
                    Map params = cached != null ? cached.getParams() : null;
                    if (params == null) {
                        params = EmptyMap.INSTANCE;
                        params.getClass();
                    }
                    Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("expand", CollectionsKt__CollectionsJVMKt.listOf("payment_method")));
                    ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
                    String str5 = (elementsSessionContext == null || (billingDetails = elementsSessionContext.billingDetails) == null || (str4 = billingDetails.phone) == null || StringsKt.isBlank(str4)) ? null : str4;
                    ApiRequest.Options invoke = this.provideApiRequestOptions.invoke(false);
                    LinkedHashMap plus = MapsKt__MapsKt.plus(params, mapOf);
                    financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$12.label = 1;
                    m4063sharePaymentDetailseH_QyT8 = this.consumersApiService.m4063sharePaymentDetailseH_QyT8(str2, str, str3, str5, this.requestSurface, invoke, plus, financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$12);
                    if (m4063sharePaymentDetailseH_QyT8 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m4063sharePaymentDetailseH_QyT8 = ((Result) obj).value;
                }
                SafeTrace.throwOnFailure(m4063sharePaymentDetailseH_QyT8);
                return m4063sharePaymentDetailseH_QyT8;
            }
        }
        financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1 = new FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1(this, continuationImpl);
        FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1 financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$122 = financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;
        Object obj2 = financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$122.label;
        if (i != 0) {
        }
        SafeTrace.throwOnFailure(m4063sharePaymentDetailseH_QyT8);
        return m4063sharePaymentDetailseH_QyT8;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x006e, TryCatch #1 {all -> 0x006e, blocks: (B:27:0x0063, B:29:0x0069, B:30:0x0072), top: B:26:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startConsumerVerification(String str, VerificationType verificationType, ContinuationImpl continuationImpl) {
        FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1 financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;
        Object obj;
        int i;
        VerificationType verificationType2;
        Mutex mutex;
        int i2;
        Throwable th;
        Mutex mutex2;
        Locale locale;
        Object startConsumerVerification$default;
        Object obj2;
        try {
            if (continuationImpl instanceof FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1) {
                financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1 = (FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1) continuationImpl;
                int i3 = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1.label = i3 - PKIFailureInfo.systemUnavail;
                    FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1 financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12 = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;
                    Object obj3 = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.result;
                    obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj3);
                        financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$0 = str;
                        financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$2 = verificationType;
                        MutexImpl mutexImpl = this.mutex;
                        financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$4 = mutexImpl;
                        financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.I$0 = 0;
                        financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.label = 1;
                        if (mutexImpl.lock(financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12) != obj) {
                            verificationType2 = verificationType;
                            mutex = mutexImpl;
                            i2 = 0;
                        }
                        return obj;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex2 = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$4;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            obj2 = obj3;
                            updateCachedConsumerSession((ConsumerSession) obj2, "startConsumerVerification");
                            ConsumerSession consumerSession = (ConsumerSession) obj2;
                            mutex2.unlock(null);
                            return consumerSession;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    int i4 = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.I$0;
                    mutex = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$4;
                    VerificationType verificationType3 = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$2;
                    String str2 = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    i2 = i4;
                    verificationType2 = verificationType3;
                    str = str2;
                    ConsumersApiServiceImpl consumersApiServiceImpl = this.consumersApiService;
                    locale = this.locale;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    locale.getClass();
                    String str3 = this.requestSurface;
                    ApiRequest.Options invoke = this.provideApiRequestOptions.invoke(false);
                    financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$0 = null;
                    financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$2 = null;
                    financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$4 = mutex;
                    financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.I$0 = i2;
                    financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.label = 2;
                    startConsumerVerification$default = ConsumersApiServiceImpl.startConsumerVerification$default(consumersApiServiceImpl, str, locale, str3, verificationType2, null, null, invoke, financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12);
                    if (startConsumerVerification$default != obj) {
                        mutex2 = mutex;
                        obj2 = startConsumerVerification$default;
                        updateCachedConsumerSession((ConsumerSession) obj2, "startConsumerVerification");
                        ConsumerSession consumerSession2 = (ConsumerSession) obj2;
                        mutex2.unlock(null);
                        return consumerSession2;
                    }
                    return obj;
                }
            }
            ConsumersApiServiceImpl consumersApiServiceImpl2 = this.consumersApiService;
            locale = this.locale;
            if (locale == null) {
            }
            locale.getClass();
            String str32 = this.requestSurface;
            ApiRequest.Options invoke2 = this.provideApiRequestOptions.invoke(false);
            financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$0 = null;
            financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$2 = null;
            financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.L$4 = mutex;
            financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.I$0 = i2;
            financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12.label = 2;
            startConsumerVerification$default = ConsumersApiServiceImpl.startConsumerVerification$default(consumersApiServiceImpl2, str, locale, str32, verificationType2, null, null, invoke2, financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$12);
            if (startConsumerVerification$default != obj) {
            }
            return obj;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1 = new FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1(this, continuationImpl);
        FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1 financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$122 = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;
        Object obj32 = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$122.label;
        if (i != 0) {
        }
    }

    public final void updateCachedConsumerSession(ConsumerSession consumerSession, String str) {
        this.logger.debug("SYNC_CACHE: updating local consumer session from ".concat(str));
        consumerSession.getClass();
        RealConsumerSessionRepository realConsumerSessionRepository = this.consumerSessionRepository;
        CachedConsumerSession provideConsumerSession = realConsumerSessionRepository.provideConsumerSession();
        realConsumerSessionRepository.savedStateHandle.set(RealConsumerSessionRepository.toCached(consumerSession, provideConsumerSession != null ? provideConsumerSession.publishableKey : null), "ConsumerSession");
    }
}
