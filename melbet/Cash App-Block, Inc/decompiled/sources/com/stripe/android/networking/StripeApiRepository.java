package com.stripe.android.networking;

import android.content.Context;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.trace.Trace;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.Stripe;
import com.stripe.android.StripeApiBeta;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository;
import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.JsonUtilsKt;
import com.stripe.android.core.networking.RequestId;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.exception.CardException;
import com.stripe.android.model.Address;
import com.stripe.android.model.CancelCaptchaChallengeParams;
import com.stripe.android.model.ClientAttributionMetadata;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionParams;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.MandateDataParams$Type$Online;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams$Card;
import com.stripe.android.model.RadarOptions;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceOrderParams;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.VerificationMethodParam;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import dagger.internal.Preconditions;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.io.IOException;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.face.iad.capture.internal.y0;
import net.oneformapp.helper.matching.POPMatchingFactory;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class StripeApiRepository implements StripeRepository {
    public final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    public final ApiRequest.Factory apiRequestFactory;
    public final Context context;
    public final POPMatchingFactory fraudDetectionDataParamsUtils;
    public final DefaultFraudDetectionDataRepository fraudDetectionDataRepository;
    public final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    public final Set productUsageTokens;
    public final Function0 publishableKeyProvider;
    public final DefaultStripeNetworkClient stripeNetworkClient;
    public final CoroutineContext workContext;

    public abstract class DnsCacheData {

        public final class Failure extends DnsCacheData {
            public static final Failure INSTANCE = new Failure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Failure);
            }

            public final int hashCode() {
                return 2054089437;
            }

            public final String toString() {
                return "Failure";
            }
        }

        public final class Success extends DnsCacheData {
            public final String originalDnsCacheTtl;

            public Success(String str) {
                this.originalDnsCacheTtl = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.areEqual(this.originalDnsCacheTtl, ((Success) obj).originalDnsCacheTtl);
            }

            public final int hashCode() {
                String str = this.originalDnsCacheTtl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(originalDnsCacheTtl=", this.originalDnsCacheTtl, ")");
            }
        }
    }

    public StripeApiRepository(Context context, Function0 function0, RequestSurface requestSurface, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, CoroutineContext coroutineContext, Set set, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, int i) {
        CoroutineContext coroutineContext2;
        boolean z = Stripe.advancedFraudSignalsEnabled;
        int i2 = i & 16;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$12 = Logger$Companion.NOOP_LOGGER;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$13 = i2 != 0 ? logger$Companion$NOOP_LOGGER$12 : logger$Companion$NOOP_LOGGER$1;
        if ((i & 32) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            coroutineContext2 = DefaultIoScheduler.INSTANCE;
        } else {
            coroutineContext2 = coroutineContext;
        }
        Set set2 = (i & 64) != 0 ? EmptySet.INSTANCE : set;
        DefaultStripeNetworkClient defaultStripeNetworkClient = new DefaultStripeNetworkClient(coroutineContext2, logger$Companion$NOOP_LOGGER$13, 14);
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor2 = (i & 256) != 0 ? new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$13, coroutineContext2) : defaultAnalyticsRequestExecutor;
        context.getClass();
        coroutineContext2.getClass();
        AndroidFileSaver androidFileSaver = new AndroidFileSaver(1, context, coroutineContext2);
        o0 o0Var = new o0(context, 5);
        DefaultStripeNetworkClient defaultStripeNetworkClient2 = new DefaultStripeNetworkClient(coroutineContext2, null, 30);
        EmptySet emptySet = EmptySet.INSTANCE;
        emptySet.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$14 = logger$Companion$NOOP_LOGGER$13;
        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
        Preconditions.checkNotNullFromProvides(defaultIoScheduler);
        Continuation continuation = null;
        DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository = new DefaultFraudDetectionDataRepository(androidFileSaver, o0Var, defaultStripeNetworkClient2, new RealErrorReporter(new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$12, defaultIoScheduler), new PaymentAnalyticsRequestFactory(applicationContext, new CameraX$$ExternalSyntheticLambda0(applicationContext, 14), emptySet)), coroutineContext2, new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(22));
        context.getClass();
        set2.getClass();
        requestSurface.getClass();
        defaultAnalyticsRequestExecutor2.getClass();
        MarkwonConfiguration markwonConfiguration = new MarkwonConfiguration();
        markwonConfiguration.theme = set2;
        markwonConfiguration.syntaxHighlight = requestSurface;
        markwonConfiguration.linkResolver = defaultAnalyticsRequestExecutor2;
        markwonConfiguration.imageDestinationProcessor = context.getApplicationContext();
        markwonConfiguration.spansFactory = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(markwonConfiguration, 8));
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2 = (i & 2048) != 0 ? new PaymentAnalyticsRequestFactory(context, function0, set2) : paymentAnalyticsRequestFactory;
        POPMatchingFactory pOPMatchingFactory = new POPMatchingFactory(10);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(emptySet, 10));
        Iterator<E> it = emptySet.iterator();
        while (it.hasNext()) {
            ((StripeApiBeta) it.next()).getClass();
            arrayList.add("wechat_pay_beta=v1");
        }
        String code = new ApiVersion(CollectionsKt.toSet(arrayList)).getCode();
        function0.getClass();
        logger$Companion$NOOP_LOGGER$14.getClass();
        coroutineContext2.getClass();
        paymentAnalyticsRequestFactory2.getClass();
        emptySet.getClass();
        this.context = context;
        this.publishableKeyProvider = function0;
        this.workContext = coroutineContext2;
        this.productUsageTokens = set2;
        this.stripeNetworkClient = defaultStripeNetworkClient;
        this.analyticsRequestExecutor = defaultAnalyticsRequestExecutor2;
        this.fraudDetectionDataRepository = defaultFraudDetectionDataRepository;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory2;
        this.fraudDetectionDataParamsUtils = pOPMatchingFactory;
        this.apiRequestFactory = new ApiRequest.Factory(code, "AndroidBindings/23.9.1");
        fireFraudDetectionDataRequest();
        JobKt.launch$default(JobKt.CoroutineScope(coroutineContext2), null, null, new CameraHelper$unbind$2(this, continuation, 20), 3);
    }

    public static LinkedHashMap createClientSecretParam(String str, List list) {
        return MapsKt__MapsKt.plus(Thread$State$EnumUnboxingLocalUtility.m("client_secret", str), KClasses$$Lambda$1.access$createExpandParam(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4027attachFinancialConnectionsSessionToPaymentIntenthUnOzRk(String str, String str2, String str3, ApiRequest.Options options, List list, ContinuationImpl continuationImpl) {
        StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1 stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1) {
            stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1 = (StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1) continuationImpl;
            int i2 = stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                str2.getClass();
                str3.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("payment_intents/%s/link_account_sessions/%s/attach", str2, str3), options, MapsKt__MapsKt.plus(Thread$State$EnumUnboxingLocalUtility.m("client_secret", str), KClasses$$Lambda$1.access$createExpandParam(list)));
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(20);
                Function1 stripeApiRepository$$ExternalSyntheticLambda5 = new StripeApiRepository$$ExternalSyntheticLambda5(19);
                stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda5, stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1 = new StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: attachFinancialConnectionsSessionToSetupIntent-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4028attachFinancialConnectionsSessionToSetupIntenthUnOzRk(String str, String str2, String str3, ApiRequest.Options options, List list, ContinuationImpl continuationImpl) {
        StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1 stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1) {
            stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1 = (StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1) continuationImpl;
            int i2 = stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                str2.getClass();
                str3.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("setup_intents/%s/link_account_sessions/%s/attach", str2, str3), options, MapsKt__MapsKt.plus(Thread$State$EnumUnboxingLocalUtility.m("client_secret", str), KClasses$$Lambda$1.access$createExpandParam(list)));
                int i3 = 0;
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(i3);
                Function1 stripeApiRepository$$ExternalSyntheticLambda5 = new StripeApiRepository$$ExternalSyntheticLambda5(i3);
                stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda5, stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1 = new StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.label;
        if (i == 0) {
        }
    }

    public final Pair buildPaymentUserAgentPair(Set set) {
        set.getClass();
        return new Pair("payment_user_agent", CollectionsKt.joinToString$default(SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus(SetsKt__SetsJVMKt.setOf("stripe-android/23.9.1"), (Iterable) this.productUsageTokens), (Iterable) set), ";", null, null, 0, null, null, 62));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: cancelPaymentIntentCaptchaChallenge-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4029cancelPaymentIntentCaptchaChallengeBWLJW6A(String str, CancelCaptchaChallengeParams cancelCaptchaChallengeParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$cancelPaymentIntentCaptchaChallenge$1 stripeApiRepository$cancelPaymentIntentCaptchaChallenge$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$cancelPaymentIntentCaptchaChallenge$1) {
            stripeApiRepository$cancelPaymentIntentCaptchaChallenge$1 = (StripeApiRepository$cancelPaymentIntentCaptchaChallenge$1) continuationImpl;
            int i2 = stripeApiRepository$cancelPaymentIntentCaptchaChallenge$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$cancelPaymentIntentCaptchaChallenge$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$cancelPaymentIntentCaptchaChallenge$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$cancelPaymentIntentCaptchaChallenge$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                str.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("payment_intents/%s/cancel_challenge", str), options, MapsKt__MapsJVMKt.mapOf(new Pair("client_secret", cancelCaptchaChallengeParams.clientSecret)));
                int i3 = 20;
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(i3);
                stripeApiRepository$cancelPaymentIntentCaptchaChallenge$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, new StripeApiRepository$$ExternalSyntheticLambda5(i3), stripeApiRepository$cancelPaymentIntentCaptchaChallenge$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$cancelPaymentIntentCaptchaChallenge$1 = new StripeApiRepository$cancelPaymentIntentCaptchaChallenge$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$cancelPaymentIntentCaptchaChallenge$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$cancelPaymentIntentCaptchaChallenge$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: cancelPaymentIntentSource-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4030cancelPaymentIntentSourceBWLJW6A(ApiRequest.Options options, String str, String str2, ContinuationImpl continuationImpl) {
        StripeApiRepository$cancelPaymentIntentSource$1 stripeApiRepository$cancelPaymentIntentSource$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$cancelPaymentIntentSource$1) {
            stripeApiRepository$cancelPaymentIntentSource$1 = (StripeApiRepository$cancelPaymentIntentSource$1) continuationImpl;
            int i2 = stripeApiRepository$cancelPaymentIntentSource$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$cancelPaymentIntentSource$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$cancelPaymentIntentSource$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$cancelPaymentIntentSource$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                fireFraudDetectionDataRequest();
                str.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("payment_intents/%s/source_cancel", str), options, MapsKt__MapsJVMKt.mapOf(new Pair("source", str2)));
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(20);
                Function1 stripeApiRepository$$ExternalSyntheticLambda2 = new StripeApiRepository$$ExternalSyntheticLambda2(this, 3);
                stripeApiRepository$cancelPaymentIntentSource$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda2, stripeApiRepository$cancelPaymentIntentSource$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$cancelPaymentIntentSource$1 = new StripeApiRepository$cancelPaymentIntentSource$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$cancelPaymentIntentSource$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$cancelPaymentIntentSource$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: cancelSetupIntentCaptchaChallenge-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4031cancelSetupIntentCaptchaChallengeBWLJW6A(String str, CancelCaptchaChallengeParams cancelCaptchaChallengeParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$cancelSetupIntentCaptchaChallenge$1 stripeApiRepository$cancelSetupIntentCaptchaChallenge$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$cancelSetupIntentCaptchaChallenge$1) {
            stripeApiRepository$cancelSetupIntentCaptchaChallenge$1 = (StripeApiRepository$cancelSetupIntentCaptchaChallenge$1) continuationImpl;
            int i2 = stripeApiRepository$cancelSetupIntentCaptchaChallenge$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$cancelSetupIntentCaptchaChallenge$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$cancelSetupIntentCaptchaChallenge$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$cancelSetupIntentCaptchaChallenge$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                str.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("setup_intents/%s/cancel_challenge", str), options, MapsKt__MapsJVMKt.mapOf(new Pair("client_secret", cancelCaptchaChallengeParams.clientSecret)));
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(0);
                stripeApiRepository$cancelSetupIntentCaptchaChallenge$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, new StripeApiRepository$$ExternalSyntheticLambda5(20), stripeApiRepository$cancelSetupIntentCaptchaChallenge$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$cancelSetupIntentCaptchaChallenge$1 = new StripeApiRepository$cancelSetupIntentCaptchaChallenge$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$cancelSetupIntentCaptchaChallenge$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$cancelSetupIntentCaptchaChallenge$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: cancelSetupIntentSource-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4032cancelSetupIntentSourceBWLJW6A(ApiRequest.Options options, String str, String str2, ContinuationImpl continuationImpl) {
        StripeApiRepository$cancelSetupIntentSource$1 stripeApiRepository$cancelSetupIntentSource$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$cancelSetupIntentSource$1) {
            stripeApiRepository$cancelSetupIntentSource$1 = (StripeApiRepository$cancelSetupIntentSource$1) continuationImpl;
            int i2 = stripeApiRepository$cancelSetupIntentSource$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$cancelSetupIntentSource$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$cancelSetupIntentSource$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$cancelSetupIntentSource$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                str.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("setup_intents/%s/source_cancel", str), options, MapsKt__MapsJVMKt.mapOf(new Pair("source", str2)));
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(0);
                Function1 stripeApiRepository$$ExternalSyntheticLambda2 = new StripeApiRepository$$ExternalSyntheticLambda2(this, 6);
                stripeApiRepository$cancelSetupIntentSource$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda2, stripeApiRepository$cancelSetupIntentSource$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$cancelSetupIntentSource$1 = new StripeApiRepository$cancelSetupIntentSource$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$cancelSetupIntentSource$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$cancelSetupIntentSource$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: complete3ds2Auth-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4033complete3ds2Auth0E7RQCE(String str, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$complete3ds2Auth$1 stripeApiRepository$complete3ds2Auth$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$complete3ds2Auth$1) {
            stripeApiRepository$complete3ds2Auth$1 = (StripeApiRepository$complete3ds2Auth$1) continuationImpl;
            int i2 = stripeApiRepository$complete3ds2Auth$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$complete3ds2Auth$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$complete3ds2Auth$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$complete3ds2Auth$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/".concat("3ds2/challenge_complete"), options, MapsKt__MapsJVMKt.mapOf(new Pair("source", str)));
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(22);
                stripeApiRepository$complete3ds2Auth$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, new StripeApiRepository$$ExternalSyntheticLambda5(20), stripeApiRepository$complete3ds2Auth$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$complete3ds2Auth$1 = new StripeApiRepository$complete3ds2Auth$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$complete3ds2Auth$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$complete3ds2Auth$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: confirmPaymentIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4034confirmPaymentIntentBWLJW6A(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List list, ContinuationImpl continuationImpl) {
        StripeApiRepository$confirmPaymentIntent$1 stripeApiRepository$confirmPaymentIntent$1;
        int i;
        Object m4043maybeForDashboard0E7RQCE;
        Throwable m4120exceptionOrNullimpl;
        if (continuationImpl instanceof StripeApiRepository$confirmPaymentIntent$1) {
            stripeApiRepository$confirmPaymentIntent$1 = (StripeApiRepository$confirmPaymentIntent$1) continuationImpl;
            int i2 = stripeApiRepository$confirmPaymentIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$confirmPaymentIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$confirmPaymentIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$confirmPaymentIntent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    stripeApiRepository$confirmPaymentIntent$1.L$1 = options;
                    stripeApiRepository$confirmPaymentIntent$1.L$2 = list;
                    stripeApiRepository$confirmPaymentIntent$1.label = 1;
                    m4043maybeForDashboard0E7RQCE = m4043maybeForDashboard0E7RQCE(confirmPaymentIntentParams, options, stripeApiRepository$confirmPaymentIntent$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = stripeApiRepository$confirmPaymentIntent$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    list = stripeApiRepository$confirmPaymentIntent$1.L$2;
                    options = stripeApiRepository$confirmPaymentIntent$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    m4043maybeForDashboard0E7RQCE = ((Result) obj).value;
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4043maybeForDashboard0E7RQCE);
                if (m4120exceptionOrNullimpl == null) {
                    return new Result.Failure(m4120exceptionOrNullimpl);
                }
                stripeApiRepository$confirmPaymentIntent$1.L$1 = null;
                stripeApiRepository$confirmPaymentIntent$1.L$2 = null;
                stripeApiRepository$confirmPaymentIntent$1.label = 2;
                Object m4035confirmPaymentIntentInternalBWLJW6A = m4035confirmPaymentIntentInternalBWLJW6A((ConfirmPaymentIntentParams) m4043maybeForDashboard0E7RQCE, options, list, stripeApiRepository$confirmPaymentIntent$1);
                return m4035confirmPaymentIntentInternalBWLJW6A == obj2 ? obj2 : m4035confirmPaymentIntentInternalBWLJW6A;
            }
        }
        stripeApiRepository$confirmPaymentIntent$1 = new StripeApiRepository$confirmPaymentIntent$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$confirmPaymentIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$confirmPaymentIntent$1.label;
        if (i != 0) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4043maybeForDashboard0E7RQCE);
        if (m4120exceptionOrNullimpl == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:14|(1:16)(1:306)|(1:18)|19|(1:21)(1:305)|(1:23)|24|(1:(1:304)(1:303))|(1:29)(1:298)|(1:31)|32|(1:34)(1:297)|(1:36)|37|(8:39|(1:41)(1:295)|42|(5:45|(1:47)(1:53)|(2:49|50)(1:52)|51|43)|54|55|(1:57)(1:294)|58)(1:296)|(1:60)|61|(1:63)(1:293)|(1:65)|66|(1:68)(1:292)|(1:70)|71|(4:73|(5:76|(1:78)(1:84)|(2:80|81)(1:83)|82|74)|85|86)(1:291)|(1:88)|89|(1:91)(1:290)|(1:93)|94|(1:96)(2:127|(1:129)(2:130|(1:132)(15:(26:134|(1:136)|(1:138)(1:285)|(1:140)|141|(1:143)(1:284)|(1:145)|146|(1:148)(1:283)|(1:150)|151|(9:153|(20:156|(1:158)(1:194)|(1:160)|161|(1:163)(1:193)|(1:165)|166|(1:168)(1:192)|(1:170)|171|(1:173)(1:191)|(1:175)|176|(1:178)(1:190)|(1:180)|181|(1:183)(1:189)|(2:185|186)(1:188)|187|154)|195|196|(1:198)|199|(13:201|(1:203)(1:280)|(1:205)|206|(1:208)(1:279)|(1:210)|211|(1:213)(1:278)|(1:215)|216|(1:218)(1:277)|(1:220)|221)(1:281)|(1:223)|224)(1:282)|(1:226)|227|(13:229|(1:231)(1:275)|(1:233)|234|(1:236)(1:274)|(1:238)|239|(1:241)(1:273)|(1:243)|244|(1:246)(1:272)|(1:248)|249)(1:276)|(1:251)|252|(1:254)(1:271)|(1:256)|257|(1:259)(1:270)|(1:261)|262|(1:264)(1:269)|(1:266)|267)(2:286|(1:288)(1:289))|268|98|(1:100)(1:126)|(1:102)|103|(1:105)(1:125)|(1:107)|108|(1:110)|111|112|113|114|(2:116|(1:118)(1:119))(2:120|121))))|97|98|(0)(0)|(0)|103|(0)(0)|(0)|108|(0)|111|112|113|114|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x05bd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x05be, code lost:
    
        r3 = kotlin.Result.Companion;
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.stripe.android.networking.StripeApiRepository, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.Map] */
    /* renamed from: confirmPaymentIntentInternal-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4035confirmPaymentIntentInternalBWLJW6A(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List list, ContinuationImpl continuationImpl) {
        StripeApiRepository$confirmPaymentIntentInternal$1 stripeApiRepository$confirmPaymentIntentInternal$1;
        int i;
        Map m;
        PaymentMethodCreateParams paymentMethodCreateParams;
        CoroutineSingletons coroutineSingletons;
        Map map;
        String str;
        Object obj;
        Map map2;
        LinkedHashMap linkedHashMap;
        SourceParams sourceParams;
        Map map3;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        SourceParams sourceParams2;
        Map map4;
        Map map5;
        Map map6;
        LinkedHashMap linkedHashMap4;
        Map map7;
        String str2;
        Map map8;
        Map m2;
        Map m3;
        Map m4;
        Throwable m4120exceptionOrNullimpl;
        Map map9;
        ConfirmPaymentIntentParams confirmPaymentIntentParams2 = confirmPaymentIntentParams;
        if (continuationImpl instanceof StripeApiRepository$confirmPaymentIntentInternal$1) {
            stripeApiRepository$confirmPaymentIntentInternal$1 = (StripeApiRepository$confirmPaymentIntentInternal$1) continuationImpl;
            int i2 = stripeApiRepository$confirmPaymentIntentInternal$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$confirmPaymentIntentInternal$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = stripeApiRepository$confirmPaymentIntentInternal$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$confirmPaymentIntentInternal$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj2);
                        return ((Result) obj2).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj2);
                PaymentMethodCreateParams paymentMethodCreateParams2 = confirmPaymentIntentParams2.paymentMethodCreateParams;
                SourceParams sourceParams3 = confirmPaymentIntentParams2.sourceParams;
                String str3 = confirmPaymentIntentParams2.clientSecret;
                String str4 = confirmPaymentIntentParams2.mandateId;
                Map mapOf = MapsKt__MapsKt.mapOf(new Pair("client_secret", str3), new Pair("use_stripe_sdk", Boolean.valueOf(confirmPaymentIntentParams2.useStripeSdk)));
                Boolean bool = confirmPaymentIntentParams2.savePaymentMethod;
                Map mapOf2 = bool != null ? MapsKt__MapsJVMKt.mapOf(new Pair("save_payment_method", bool)) : null;
                if (mapOf2 == null) {
                    mapOf2 = EmptyMap.INSTANCE;
                    mapOf2.getClass();
                }
                LinkedHashMap plus = MapsKt__MapsKt.plus(mapOf, mapOf2);
                Map m5 = str4 != null ? Thread$State$EnumUnboxingLocalUtility.m("mandate", str4) : null;
                if (m5 == null) {
                    m5 = EmptyMap.INSTANCE;
                    m5.getClass();
                }
                LinkedHashMap plus2 = MapsKt__MapsKt.plus(plus, m5);
                MandateDataParams mandateDataParams = confirmPaymentIntentParams2.mandateData;
                if (mandateDataParams == null || (m = mandateDataParams.toParamMap()) == null) {
                    m = (paymentMethodCreateParams2 != null && paymentMethodCreateParams2.requiresMandate && str4 == null) ? BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_acceptance", MapsKt__MapsKt.mapOf(new Pair("type", "online"), new Pair("online", MapsKt__MapsJVMKt.mapOf(new Pair("infer_from_client", Boolean.TRUE))))) : null;
                }
                Map m6 = m != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("mandate_data", m) : null;
                if (m6 == null) {
                    m6 = EmptyMap.INSTANCE;
                    m6.getClass();
                }
                LinkedHashMap plus3 = MapsKt__MapsKt.plus(plus2, m6);
                String str5 = confirmPaymentIntentParams2.returnUrl;
                Map m7 = str5 != null ? Thread$State$EnumUnboxingLocalUtility.m("return_url", str5) : null;
                if (m7 == null) {
                    m7 = EmptyMap.INSTANCE;
                    m7.getClass();
                }
                LinkedHashMap plus4 = MapsKt__MapsKt.plus(plus3, m7);
                PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card = confirmPaymentIntentParams2.paymentMethodOptions;
                if (paymentMethodOptionsParams$Card != null) {
                    Pair pair = new Pair("cvc", paymentMethodOptionsParams$Card.cvc);
                    paymentMethodCreateParams = paymentMethodCreateParams2;
                    Pair pair2 = new Pair("network", paymentMethodOptionsParams$Card.network);
                    coroutineSingletons = coroutineSingletons2;
                    Pair pair3 = new Pair("moto", paymentMethodOptionsParams$Card.moto);
                    ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = paymentMethodOptionsParams$Card.setupFutureUsage;
                    List<Pair> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{pair, pair2, pair3, new Pair("setup_future_usage", setupFutureUsage != null ? setupFutureUsage.code : null)});
                    Map map10 = EmptyMap.INSTANCE;
                    map10.getClass();
                    for (Pair pair4 : listOf) {
                        String str6 = (String) pair4.first;
                        Object obj3 = pair4.second;
                        Map mapOf3 = obj3 != null ? MapsKt__MapsJVMKt.mapOf(new Pair(str6, obj3)) : null;
                        if (mapOf3 == null) {
                            mapOf3 = EmptyMap.INSTANCE;
                            mapOf3.getClass();
                        }
                        map10 = MapsKt__MapsKt.plus(map10, mapOf3);
                    }
                    if (map10.isEmpty()) {
                        map9 = EmptyMap.INSTANCE;
                        map9.getClass();
                    } else {
                        y0 y0Var = PaymentMethod.Type.Companion;
                        map9 = MapsKt__MapsJVMKt.mapOf(new Pair("card", map10));
                    }
                    map = BalanceFeedKt$$ExternalSyntheticOutline0.m("payment_method_options", map9);
                } else {
                    paymentMethodCreateParams = paymentMethodCreateParams2;
                    coroutineSingletons = coroutineSingletons2;
                    map = null;
                }
                if (map == null) {
                    map = EmptyMap.INSTANCE;
                    map.getClass();
                }
                LinkedHashMap plus5 = MapsKt__MapsKt.plus(plus4, map);
                ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage2 = confirmPaymentIntentParams2.setupFutureUsage;
                Map m8 = setupFutureUsage2 != null ? Thread$State$EnumUnboxingLocalUtility.m("setup_future_usage", setupFutureUsage2.code) : null;
                if (m8 == null) {
                    m8 = EmptyMap.INSTANCE;
                    m8.getClass();
                }
                LinkedHashMap plus6 = MapsKt__MapsKt.plus(plus5, m8);
                Boolean bool2 = confirmPaymentIntentParams2.setAsDefaultPaymentMethod;
                Map mapOf4 = bool2 != null ? MapsKt__MapsJVMKt.mapOf(new Pair("set_as_default_payment_method", bool2)) : null;
                if (mapOf4 == null) {
                    mapOf4 = EmptyMap.INSTANCE;
                    mapOf4.getClass();
                }
                LinkedHashMap plus7 = MapsKt__MapsKt.plus(plus6, mapOf4);
                ConfirmPaymentIntentParams.Shipping shipping = confirmPaymentIntentParams2.shipping;
                StripeApiRepository$confirmPaymentIntentInternal$1 stripeApiRepository$confirmPaymentIntentInternal$12 = stripeApiRepository$confirmPaymentIntentInternal$1;
                if (shipping != null) {
                    str = str3;
                    obj = "client_secret";
                    List<Pair> listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair("address", shipping.address.toParamMap()), new Pair("name", shipping.name), new Pair("carrier", shipping.carrier), new Pair("phone", shipping.phone), new Pair("tracking_number", shipping.trackingNumber)});
                    Map map11 = EmptyMap.INSTANCE;
                    map11.getClass();
                    for (Pair pair5 : listOf2) {
                        String str7 = (String) pair5.first;
                        Object obj4 = pair5.second;
                        Map mapOf5 = obj4 != null ? MapsKt__MapsJVMKt.mapOf(new Pair(str7, obj4)) : null;
                        if (mapOf5 == null) {
                            mapOf5 = EmptyMap.INSTANCE;
                            mapOf5.getClass();
                        }
                        map11 = MapsKt__MapsKt.plus(map11, mapOf5);
                    }
                    map2 = MapsKt__MapsJVMKt.mapOf(new Pair("shipping", map11));
                } else {
                    str = str3;
                    obj = "client_secret";
                    map2 = null;
                }
                if (map2 == null) {
                    map2 = EmptyMap.INSTANCE;
                    map2.getClass();
                }
                LinkedHashMap plus8 = MapsKt__MapsKt.plus(plus7, map2);
                RadarOptions radarOptions = confirmPaymentIntentParams2.radarOptions;
                Map m9 = radarOptions != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("radar_options", radarOptions.toParamMap()) : null;
                if (m9 == null) {
                    m9 = EmptyMap.INSTANCE;
                    m9.getClass();
                }
                LinkedHashMap plus9 = MapsKt__MapsKt.plus(plus8, m9);
                if (paymentMethodCreateParams != null) {
                    m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m("payment_method_data", paymentMethodCreateParams.toParamMap());
                } else {
                    String str8 = confirmPaymentIntentParams2.paymentMethodId;
                    if (str8 != null) {
                        m2 = Thread$State$EnumUnboxingLocalUtility.m("payment_method", str8);
                    } else {
                        String str9 = confirmPaymentIntentParams2.confirmationTokenId;
                        if (str9 == null) {
                            if (sourceParams3 != null) {
                                String str10 = sourceParams3.typeRaw;
                                Map m10 = Thread$State$EnumUnboxingLocalUtility.m("type", str10);
                                Map map12 = sourceParams3.apiParams.value;
                                if (map12.isEmpty()) {
                                    map12 = null;
                                }
                                Map m11 = map12 != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, map12) : null;
                                if (m11 == null) {
                                    m11 = EmptyMap.INSTANCE;
                                    m11.getClass();
                                }
                                LinkedHashMap plus10 = MapsKt__MapsKt.plus(m10, m11);
                                EmptyMap emptyMap = EmptyMap.INSTANCE;
                                emptyMap.getClass();
                                LinkedHashMap plus11 = MapsKt__MapsKt.plus(plus10, emptyMap);
                                Long l = sourceParams3.amount;
                                String str11 = "amount";
                                Map mapOf6 = l != null ? MapsKt__MapsJVMKt.mapOf(new Pair("amount", Long.valueOf(l.longValue()))) : null;
                                if (mapOf6 == null) {
                                    mapOf6 = emptyMap;
                                }
                                LinkedHashMap plus12 = MapsKt__MapsKt.plus(plus11, mapOf6);
                                String str12 = sourceParams3.currency;
                                Map m12 = str12 != null ? Thread$State$EnumUnboxingLocalUtility.m("currency", str12) : null;
                                if (m12 == null) {
                                    m12 = emptyMap;
                                }
                                LinkedHashMap plus13 = MapsKt__MapsKt.plus(plus12, m12);
                                SourceOrderParams sourceOrderParams = sourceParams3.sourceOrder;
                                if (sourceOrderParams != null) {
                                    ArrayList arrayList = sourceOrderParams.items;
                                    linkedHashMap = plus9;
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        SourceOrderParams.Item item = (SourceOrderParams.Item) it.next();
                                        item.getClass();
                                        Iterator it2 = it;
                                        EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                                        emptyMap2.getClass();
                                        SourceParams sourceParams4 = sourceParams3;
                                        Integer num = item.amount;
                                        if (num != null) {
                                            linkedHashMap4 = plus13;
                                            map7 = MapsKt__MapsJVMKt.mapOf(new Pair(str11, Integer.valueOf(num.intValue())));
                                        } else {
                                            linkedHashMap4 = plus13;
                                            map7 = null;
                                        }
                                        if (map7 == null) {
                                            map7 = emptyMap2;
                                        }
                                        LinkedHashMap plus14 = MapsKt__MapsKt.plus(emptyMap2, map7);
                                        String str13 = item.currency;
                                        Map m13 = str13 != null ? Thread$State$EnumUnboxingLocalUtility.m("currency", str13) : null;
                                        if (m13 == null) {
                                            m13 = emptyMap2;
                                        }
                                        LinkedHashMap plus15 = MapsKt__MapsKt.plus(plus14, m13);
                                        String str14 = item.description;
                                        Map m14 = str14 != null ? Thread$State$EnumUnboxingLocalUtility.m("description", str14) : null;
                                        if (m14 == null) {
                                            m14 = emptyMap2;
                                        }
                                        LinkedHashMap plus16 = MapsKt__MapsKt.plus(plus15, m14);
                                        String str15 = item.parent;
                                        Map m15 = str15 != null ? Thread$State$EnumUnboxingLocalUtility.m("parent", str15) : null;
                                        if (m15 == null) {
                                            m15 = emptyMap2;
                                        }
                                        LinkedHashMap plus17 = MapsKt__MapsKt.plus(plus16, m15);
                                        Integer num2 = item.quantity;
                                        if (num2 != null) {
                                            str2 = str11;
                                            map8 = MapsKt__MapsJVMKt.mapOf(new Pair("quantity", Integer.valueOf(num2.intValue())));
                                        } else {
                                            str2 = str11;
                                            map8 = null;
                                        }
                                        if (map8 == null) {
                                            map8 = emptyMap2;
                                        }
                                        LinkedHashMap plus18 = MapsKt__MapsKt.plus(plus17, map8);
                                        SourceOrderParams.Item.Type type2 = item.f1445type;
                                        Map m16 = type2 != null ? Thread$State$EnumUnboxingLocalUtility.m("type", type2.code) : null;
                                        if (m16 == null) {
                                            m16 = emptyMap2;
                                        }
                                        arrayList2.add(MapsKt__MapsKt.plus(plus18, m16));
                                        it = it2;
                                        sourceParams3 = sourceParams4;
                                        plus13 = linkedHashMap4;
                                        str11 = str2;
                                    }
                                    linkedHashMap3 = plus13;
                                    sourceParams2 = sourceParams3;
                                    Map mapOf7 = MapsKt__MapsJVMKt.mapOf(new Pair("items", arrayList2));
                                    if (mapOf7 == null) {
                                        mapOf7 = EmptyMap.INSTANCE;
                                        mapOf7.getClass();
                                    }
                                    LinkedHashMap plus19 = MapsKt__MapsKt.plus(emptyMap, mapOf7);
                                    SourceOrderParams.Shipping shipping2 = sourceOrderParams.shipping;
                                    if (shipping2 != null) {
                                        Map m17 = BalanceFeedKt$$ExternalSyntheticOutline0.m("address", shipping2.address.toParamMap());
                                        String str16 = shipping2.carrier;
                                        Map m18 = str16 != null ? Thread$State$EnumUnboxingLocalUtility.m("carrier", str16) : null;
                                        if (m18 == null) {
                                            m18 = EmptyMap.INSTANCE;
                                            m18.getClass();
                                        }
                                        LinkedHashMap plus20 = MapsKt__MapsKt.plus(m17, m18);
                                        String str17 = shipping2.name;
                                        Map m19 = str17 != null ? Thread$State$EnumUnboxingLocalUtility.m("name", str17) : null;
                                        if (m19 == null) {
                                            m19 = EmptyMap.INSTANCE;
                                            m19.getClass();
                                        }
                                        LinkedHashMap plus21 = MapsKt__MapsKt.plus(plus20, m19);
                                        String str18 = shipping2.phone;
                                        Map m20 = str18 != null ? Thread$State$EnumUnboxingLocalUtility.m("phone", str18) : null;
                                        if (m20 == null) {
                                            m20 = EmptyMap.INSTANCE;
                                            m20.getClass();
                                        }
                                        LinkedHashMap plus22 = MapsKt__MapsKt.plus(plus21, m20);
                                        String str19 = shipping2.trackingNumber;
                                        Map m21 = str19 != null ? Thread$State$EnumUnboxingLocalUtility.m("tracking_number", str19) : null;
                                        if (m21 == null) {
                                            m21 = EmptyMap.INSTANCE;
                                            m21.getClass();
                                        }
                                        map6 = MapsKt__MapsJVMKt.mapOf(new Pair("shipping", MapsKt__MapsKt.plus(plus22, m21)));
                                    } else {
                                        map6 = null;
                                    }
                                    if (map6 == null) {
                                        map6 = EmptyMap.INSTANCE;
                                        map6.getClass();
                                    }
                                    map4 = MapsKt__MapsJVMKt.mapOf(new Pair("source_order", MapsKt__MapsKt.plus(plus19, map6)));
                                } else {
                                    linkedHashMap = plus9;
                                    linkedHashMap3 = plus13;
                                    sourceParams2 = sourceParams3;
                                    map4 = null;
                                }
                                if (map4 == null) {
                                    map4 = emptyMap;
                                }
                                LinkedHashMap plus23 = MapsKt__MapsKt.plus(linkedHashMap3, map4);
                                sourceParams = sourceParams2;
                                SourceParams.OwnerParams ownerParams = sourceParams.owner;
                                if (ownerParams != null) {
                                    EmptyMap emptyMap3 = EmptyMap.INSTANCE;
                                    emptyMap3.getClass();
                                    Address address = ownerParams.address;
                                    Map m22 = address != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("address", address.toParamMap()) : null;
                                    if (m22 == null) {
                                        m22 = emptyMap3;
                                    }
                                    LinkedHashMap plus24 = MapsKt__MapsKt.plus(emptyMap3, m22);
                                    String str20 = ownerParams.email;
                                    Map m23 = str20 != null ? Thread$State$EnumUnboxingLocalUtility.m("email", str20) : null;
                                    if (m23 == null) {
                                        m23 = emptyMap3;
                                    }
                                    LinkedHashMap plus25 = MapsKt__MapsKt.plus(plus24, m23);
                                    String str21 = ownerParams.name;
                                    Map m24 = str21 != null ? Thread$State$EnumUnboxingLocalUtility.m("name", str21) : null;
                                    if (m24 == null) {
                                        m24 = emptyMap3;
                                    }
                                    LinkedHashMap plus26 = MapsKt__MapsKt.plus(plus25, m24);
                                    String str22 = ownerParams.phone;
                                    EmptyMap m25 = str22 != null ? Thread$State$EnumUnboxingLocalUtility.m("phone", str22) : null;
                                    if (m25 != null) {
                                        emptyMap3 = m25;
                                    }
                                    map5 = MapsKt__MapsJVMKt.mapOf(new Pair("owner", MapsKt__MapsKt.plus(plus26, emptyMap3)));
                                } else {
                                    map5 = null;
                                }
                                if (map5 == null) {
                                    map5 = emptyMap;
                                }
                                LinkedHashMap plus27 = MapsKt__MapsKt.plus(plus23, map5);
                                Map map13 = sourceParams.metadata;
                                Map m26 = map13 != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("metadata", map13) : null;
                                if (m26 == null) {
                                    m26 = emptyMap;
                                }
                                LinkedHashMap plus28 = MapsKt__MapsKt.plus(plus27, m26);
                                String str23 = sourceParams.token;
                                Map m27 = str23 != null ? Thread$State$EnumUnboxingLocalUtility.m("token", str23) : null;
                                if (m27 == null) {
                                    m27 = emptyMap;
                                }
                                LinkedHashMap plus29 = MapsKt__MapsKt.plus(plus28, m27);
                                Source.Usage usage = sourceParams.usage;
                                EmptyMap m28 = usage != null ? Thread$State$EnumUnboxingLocalUtility.m("usage", usage.code) : null;
                                if (m28 != null) {
                                    emptyMap = m28;
                                }
                                map3 = MapsKt__MapsJVMKt.mapOf(new Pair("source_data", MapsKt__MapsKt.plus(plus29, emptyMap)));
                                confirmPaymentIntentParams2 = confirmPaymentIntentParams;
                            } else {
                                linkedHashMap = plus9;
                                sourceParams = sourceParams3;
                                String str24 = confirmPaymentIntentParams2.sourceId;
                                if (str24 != null) {
                                    map3 = Thread$State$EnumUnboxingLocalUtility.m("source", str24);
                                } else {
                                    map3 = EmptyMap.INSTANCE;
                                    map3.getClass();
                                }
                            }
                            linkedHashMap2 = linkedHashMap;
                            LinkedHashMap plus30 = MapsKt__MapsKt.plus(linkedHashMap2, map3);
                            String str25 = confirmPaymentIntentParams2.receiptEmail;
                            m3 = str25 == null ? Thread$State$EnumUnboxingLocalUtility.m("receipt_email", str25) : null;
                            if (m3 == null) {
                                m3 = EmptyMap.INSTANCE;
                                m3.getClass();
                            }
                            LinkedHashMap plus31 = MapsKt__MapsKt.plus(plus30, m3);
                            ClientAttributionMetadata clientAttributionMetadata = confirmPaymentIntentParams2.clientAttributionMetadata;
                            m4 = clientAttributionMetadata == null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("client_attribution_metadata", clientAttributionMetadata.toParamMap()) : null;
                            if (m4 == null) {
                                m4 = EmptyMap.INSTANCE;
                                m4.getClass();
                            }
                            Map plus32 = MapsKt__MapsKt.plus(plus31, m4);
                            if (options.getApiKeyIsUserKey()) {
                                plus32 = MapsKt__MapsKt.minus(plus32, obj);
                            }
                            LinkedHashMap plus33 = MapsKt__MapsKt.plus(maybeAddPaymentUserAgent(plus32, confirmPaymentIntentParams2.paymentMethodCreateParams, sourceParams), KClasses$$Lambda$1.access$createExpandParam(list));
                            FraudDetectionData cached = this.fraudDetectionDataRepository.getCached();
                            this.fraudDetectionDataParamsUtils.getClass();
                            Map addFraudDetectionData = POPMatchingFactory.addFraudDetectionData(plus33, cached);
                            Result.Companion companion = Result.Companion;
                            Object failure = new PaymentIntent.ClientSecret(str).paymentIntentId;
                            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl == null) {
                                return new Result.Failure(m4120exceptionOrNullimpl);
                            }
                            String str26 = (String) failure;
                            fireFraudDetectionDataRequest();
                            str26.getClass();
                            ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("payment_intents/%s/confirm", str26), options, addFraudDetectionData);
                            SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser(20);
                            CardTransitionKt$$ExternalSyntheticLambda4 cardTransitionKt$$ExternalSyntheticLambda4 = new CardTransitionKt$$ExternalSyntheticLambda4(28, confirmPaymentIntentParams2, (Object) this, options);
                            stripeApiRepository$confirmPaymentIntentInternal$12.label = 1;
                            Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, cardTransitionKt$$ExternalSyntheticLambda4, stripeApiRepository$confirmPaymentIntentInternal$12);
                            CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                            return m4042fetchStripeModelResultBWLJW6A == coroutineSingletons3 ? coroutineSingletons3 : m4042fetchStripeModelResultBWLJW6A;
                        }
                        m2 = Thread$State$EnumUnboxingLocalUtility.m("confirmation_token", str9);
                    }
                }
                linkedHashMap2 = plus9;
                map3 = m2;
                sourceParams = sourceParams3;
                LinkedHashMap plus302 = MapsKt__MapsKt.plus(linkedHashMap2, map3);
                String str252 = confirmPaymentIntentParams2.receiptEmail;
                if (str252 == null) {
                }
                if (m3 == null) {
                }
                LinkedHashMap plus312 = MapsKt__MapsKt.plus(plus302, m3);
                ClientAttributionMetadata clientAttributionMetadata2 = confirmPaymentIntentParams2.clientAttributionMetadata;
                if (clientAttributionMetadata2 == null) {
                }
                if (m4 == null) {
                }
                Map plus322 = MapsKt__MapsKt.plus(plus312, m4);
                if (options.getApiKeyIsUserKey()) {
                }
                LinkedHashMap plus332 = MapsKt__MapsKt.plus(maybeAddPaymentUserAgent(plus322, confirmPaymentIntentParams2.paymentMethodCreateParams, sourceParams), KClasses$$Lambda$1.access$createExpandParam(list));
                FraudDetectionData cached2 = this.fraudDetectionDataRepository.getCached();
                this.fraudDetectionDataParamsUtils.getClass();
                Map addFraudDetectionData2 = POPMatchingFactory.addFraudDetectionData(plus332, cached2);
                Result.Companion companion2 = Result.Companion;
                Object failure2 = new PaymentIntent.ClientSecret(str).paymentIntentId;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
                if (m4120exceptionOrNullimpl == null) {
                }
            }
        }
        stripeApiRepository$confirmPaymentIntentInternal$1 = new StripeApiRepository$confirmPaymentIntentInternal$1(this, continuationImpl);
        Object obj22 = stripeApiRepository$confirmPaymentIntentInternal$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$confirmPaymentIntentInternal$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: confirmSetupIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4036confirmSetupIntentBWLJW6A(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List list, ContinuationImpl continuationImpl) {
        StripeApiRepository$confirmSetupIntent$1 stripeApiRepository$confirmSetupIntent$1;
        int i;
        Object m4044maybeForDashboard0E7RQCE;
        Throwable m4120exceptionOrNullimpl;
        if (continuationImpl instanceof StripeApiRepository$confirmSetupIntent$1) {
            stripeApiRepository$confirmSetupIntent$1 = (StripeApiRepository$confirmSetupIntent$1) continuationImpl;
            int i2 = stripeApiRepository$confirmSetupIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$confirmSetupIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$confirmSetupIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$confirmSetupIntent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    stripeApiRepository$confirmSetupIntent$1.L$1 = options;
                    stripeApiRepository$confirmSetupIntent$1.L$2 = list;
                    stripeApiRepository$confirmSetupIntent$1.label = 1;
                    m4044maybeForDashboard0E7RQCE = m4044maybeForDashboard0E7RQCE(confirmSetupIntentParams, options, stripeApiRepository$confirmSetupIntent$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = stripeApiRepository$confirmSetupIntent$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    list = stripeApiRepository$confirmSetupIntent$1.L$2;
                    options = stripeApiRepository$confirmSetupIntent$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    m4044maybeForDashboard0E7RQCE = ((Result) obj).value;
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4044maybeForDashboard0E7RQCE);
                if (m4120exceptionOrNullimpl == null) {
                    return new Result.Failure(m4120exceptionOrNullimpl);
                }
                stripeApiRepository$confirmSetupIntent$1.L$1 = null;
                stripeApiRepository$confirmSetupIntent$1.L$2 = null;
                stripeApiRepository$confirmSetupIntent$1.label = 2;
                Object m4037confirmSetupIntentInternalBWLJW6A = m4037confirmSetupIntentInternalBWLJW6A((ConfirmSetupIntentParams) m4044maybeForDashboard0E7RQCE, options, list, stripeApiRepository$confirmSetupIntent$1);
                return m4037confirmSetupIntentInternalBWLJW6A == obj2 ? obj2 : m4037confirmSetupIntentInternalBWLJW6A;
            }
        }
        stripeApiRepository$confirmSetupIntent$1 = new StripeApiRepository$confirmSetupIntent$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$confirmSetupIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$confirmSetupIntent$1.label;
        if (i != 0) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4044maybeForDashboard0E7RQCE);
        if (m4120exceptionOrNullimpl == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: confirmSetupIntentInternal-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4037confirmSetupIntentInternalBWLJW6A(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List list, ContinuationImpl continuationImpl) {
        StripeApiRepository$confirmSetupIntentInternal$1 stripeApiRepository$confirmSetupIntentInternal$1;
        int i;
        Object failure;
        Map paramMap;
        Map map;
        if (continuationImpl instanceof StripeApiRepository$confirmSetupIntentInternal$1) {
            stripeApiRepository$confirmSetupIntentInternal$1 = (StripeApiRepository$confirmSetupIntentInternal$1) continuationImpl;
            int i2 = stripeApiRepository$confirmSetupIntentInternal$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$confirmSetupIntentInternal$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$confirmSetupIntentInternal$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$confirmSetupIntentInternal$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                try {
                    Result.Companion companion = Result.Companion;
                    failure = new SetupIntent.ClientSecret(confirmSetupIntentParams.clientSecret).setupIntentId;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    return new Result.Failure(m4120exceptionOrNullimpl);
                }
                String str = (String) failure;
                fireFraudDetectionDataRequest();
                str.getClass();
                String apiUrl = KClasses$$Lambda$1.getApiUrl("setup_intents/%s/confirm", str);
                PaymentMethodCreateParams paymentMethodCreateParams = confirmSetupIntentParams.paymentMethodCreateParams;
                String str2 = confirmSetupIntentParams.mandateId;
                Map mapOf = MapsKt__MapsKt.mapOf(new Pair("client_secret", confirmSetupIntentParams.clientSecret), new Pair("use_stripe_sdk", Boolean.valueOf(confirmSetupIntentParams.useStripeSdk)));
                String str3 = confirmSetupIntentParams.returnUrl;
                Map m = str3 != null ? Thread$State$EnumUnboxingLocalUtility.m("return_url", str3) : null;
                if (m == null) {
                    m = EmptyMap.INSTANCE;
                    m.getClass();
                }
                LinkedHashMap plus = MapsKt__MapsKt.plus(mapOf, m);
                Map m2 = str2 != null ? Thread$State$EnumUnboxingLocalUtility.m("mandate", str2) : null;
                if (m2 == null) {
                    m2 = EmptyMap.INSTANCE;
                    m2.getClass();
                }
                LinkedHashMap plus2 = MapsKt__MapsKt.plus(plus, m2);
                MandateDataParams mandateDataParams = confirmSetupIntentParams.mandateData;
                if (mandateDataParams == null || (paramMap = mandateDataParams.toParamMap()) == null) {
                    paramMap = (paymentMethodCreateParams != null && paymentMethodCreateParams.requiresMandate && str2 == null) ? new MandateDataParams(MandateDataParams$Type$Online.DEFAULT).toParamMap() : null;
                }
                Map m3 = paramMap != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("mandate_data", paramMap) : null;
                if (m3 == null) {
                    m3 = EmptyMap.INSTANCE;
                    m3.getClass();
                }
                LinkedHashMap plus3 = MapsKt__MapsKt.plus(plus2, m3);
                Boolean bool = confirmSetupIntentParams.setAsDefaultPaymentMethod;
                Map mapOf2 = bool != null ? MapsKt__MapsJVMKt.mapOf(new Pair("set_as_default_payment_method", bool)) : null;
                if (mapOf2 == null) {
                    mapOf2 = EmptyMap.INSTANCE;
                    mapOf2.getClass();
                }
                LinkedHashMap plus4 = MapsKt__MapsKt.plus(plus3, mapOf2);
                RadarOptions radarOptions = confirmSetupIntentParams.radarOptions;
                Map m4 = radarOptions != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("radar_options", radarOptions.toParamMap()) : null;
                if (m4 == null) {
                    m4 = EmptyMap.INSTANCE;
                    m4.getClass();
                }
                LinkedHashMap plus5 = MapsKt__MapsKt.plus(plus4, m4);
                if (paymentMethodCreateParams != null) {
                    map = BalanceFeedKt$$ExternalSyntheticOutline0.m("payment_method_data", paymentMethodCreateParams.toParamMap());
                } else {
                    String str4 = confirmSetupIntentParams.paymentMethodId;
                    if (str4 != null) {
                        map = Thread$State$EnumUnboxingLocalUtility.m("payment_method", str4);
                    } else {
                        String str5 = confirmSetupIntentParams.confirmationTokenId;
                        if (str5 != null) {
                            map = Thread$State$EnumUnboxingLocalUtility.m("confirmation_token", str5);
                        } else {
                            map = EmptyMap.INSTANCE;
                            map.getClass();
                        }
                    }
                }
                LinkedHashMap plus6 = MapsKt__MapsKt.plus(plus5, map);
                ClientAttributionMetadata clientAttributionMetadata = confirmSetupIntentParams.clientAttributionMetadata;
                Map m5 = clientAttributionMetadata != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("client_attribution_metadata", clientAttributionMetadata.toParamMap()) : null;
                if (m5 == null) {
                    m5 = EmptyMap.INSTANCE;
                    m5.getClass();
                }
                Map plus7 = MapsKt__MapsKt.plus(plus6, m5);
                if (options.getApiKeyIsUserKey()) {
                    plus7 = MapsKt__MapsKt.minus(plus7, "client_secret");
                }
                LinkedHashMap plus8 = MapsKt__MapsKt.plus(maybeAddPaymentUserAgent(plus7, confirmSetupIntentParams.paymentMethodCreateParams, null), KClasses$$Lambda$1.access$createExpandParam(list));
                FraudDetectionData cached = this.fraudDetectionDataRepository.getCached();
                this.fraudDetectionDataParamsUtils.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, apiUrl, options, POPMatchingFactory.addFraudDetectionData(plus8, cached));
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(0);
                Function1 cardTransitionKt$$ExternalSyntheticLambda4 = new CardTransitionKt$$ExternalSyntheticLambda4(27, this, confirmSetupIntentParams, options);
                stripeApiRepository$confirmSetupIntentInternal$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, cardTransitionKt$$ExternalSyntheticLambda4, stripeApiRepository$confirmSetupIntentInternal$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$confirmSetupIntentInternal$1 = new StripeApiRepository$confirmSetupIntentInternal$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$confirmSetupIntentInternal$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$confirmSetupIntentInternal$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: createFinancialConnectionsSessionForDeferredPayments-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4038createFinancialConnectionsSessionForDeferredPayments0E7RQCE(CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1 stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1) {
            stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1 = (StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1) continuationImpl;
            int i2 = stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                String concat = "https://api.stripe.com/v1/".concat("connections/link_account_sessions_for_deferred_payment");
                Pair pair = new Pair("unique_id", createFinancialConnectionsSessionForDeferredPaymentParams.uniqueId);
                Pair pair2 = new Pair("initial_institution", null);
                Pair pair3 = new Pair("manual_entry_only", null);
                Pair pair4 = new Pair("search_session", null);
                VerificationMethodParam verificationMethodParam = VerificationMethodParam.Automatic;
                Pair pair5 = new Pair("verification_method", "automatic");
                Pair pair6 = new Pair("customer", createFinancialConnectionsSessionForDeferredPaymentParams.customer);
                Pair pair7 = new Pair("on_behalf_of", createFinancialConnectionsSessionForDeferredPaymentParams.onBehalfOf);
                Pair pair8 = new Pair("hosted_surface", createFinancialConnectionsSessionForDeferredPaymentParams.hostedSurface);
                LinkMode linkMode = createFinancialConnectionsSessionForDeferredPaymentParams.linkMode;
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, concat, options, MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("link_mode", linkMode != null ? linkMode.value : "LINK_DISABLED"), new Pair("amount", createFinancialConnectionsSessionForDeferredPaymentParams.amount), new Pair("currency", createFinancialConnectionsSessionForDeferredPaymentParams.currency), new Pair("product", createFinancialConnectionsSessionForDeferredPaymentParams.product)));
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(5);
                Function1 stripeApiRepository$$ExternalSyntheticLambda5 = new StripeApiRepository$$ExternalSyntheticLambda5(21);
                stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda5, stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1 = new StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: createPaymentIntentFinancialConnectionsSession-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1 stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1) {
            stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1 = (StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1) continuationImpl;
            int i2 = stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                str.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("payment_intents/%s/link_account_sessions", str), options, createFinancialConnectionsSessionParams.toMap());
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(5);
                Function1 stripeApiRepository$$ExternalSyntheticLambda5 = new StripeApiRepository$$ExternalSyntheticLambda5(17);
                stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda5, stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1 = new StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: createPaymentMethod-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4040createPaymentMethod0E7RQCE(PaymentMethodCreateParams paymentMethodCreateParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$createPaymentMethod$1 stripeApiRepository$createPaymentMethod$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$createPaymentMethod$1) {
            stripeApiRepository$createPaymentMethod$1 = (StripeApiRepository$createPaymentMethod$1) continuationImpl;
            int i2 = stripeApiRepository$createPaymentMethod$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$createPaymentMethod$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$createPaymentMethod$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$createPaymentMethod$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                fireFraudDetectionDataRequest();
                String concat = "https://api.stripe.com/v1/".concat("payment_methods");
                Map plus = MapsKt__MapsKt.plus(paymentMethodCreateParams.toParamMap(), buildPaymentUserAgentPair(paymentMethodCreateParams.getAttribution()));
                FraudDetectionData cached = this.fraudDetectionDataRepository.getCached();
                Map params = cached != null ? cached.getParams() : null;
                if (params == null) {
                    params = EmptyMap.INSTANCE;
                    params.getClass();
                }
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, concat, options, MapsKt__MapsKt.plus(plus, params));
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(21);
                Function1 heroCardViewKt$$ExternalSyntheticLambda0 = new HeroCardViewKt$$ExternalSyntheticLambda0(27, this, paymentMethodCreateParams);
                stripeApiRepository$createPaymentMethod$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, heroCardViewKt$$ExternalSyntheticLambda0, stripeApiRepository$createPaymentMethod$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$createPaymentMethod$1 = new StripeApiRepository$createPaymentMethod$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$createPaymentMethod$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$createPaymentMethod$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: createSetupIntentFinancialConnectionsSession-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4041createSetupIntentFinancialConnectionsSessionBWLJW6A(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$createSetupIntentFinancialConnectionsSession$1 stripeApiRepository$createSetupIntentFinancialConnectionsSession$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$createSetupIntentFinancialConnectionsSession$1) {
            stripeApiRepository$createSetupIntentFinancialConnectionsSession$1 = (StripeApiRepository$createSetupIntentFinancialConnectionsSession$1) continuationImpl;
            int i2 = stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                str.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("setup_intents/%s/link_account_sessions", str), options, createFinancialConnectionsSessionParams.toMap());
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(5);
                Function1 stripeApiRepository$$ExternalSyntheticLambda5 = new StripeApiRepository$$ExternalSyntheticLambda5(18);
                stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda5, stripeApiRepository$createSetupIntentFinancialConnectionsSession$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$createSetupIntentFinancialConnectionsSession$1 = new StripeApiRepository$createSetupIntentFinancialConnectionsSession$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.label;
        if (i == 0) {
        }
    }

    public final String errorMessage(Object obj, ApiRequest.Options options) {
        Result.Companion companion = Result.Companion;
        StripeResponse stripeResponse = (StripeResponse) (obj instanceof Result.Failure ? null : obj);
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
        if (m4120exceptionOrNullimpl != null) {
            return m4120exceptionOrNullimpl instanceof StripeException ? ((StripeException) m4120exceptionOrNullimpl).analyticsValue() : m4120exceptionOrNullimpl instanceof IOException ? "ioException" : "unknown";
        }
        if (stripeResponse == null || !stripeResponse.isError) {
            return null;
        }
        try {
            handleApiError(options, stripeResponse);
            throw null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(new Result.Failure(th));
            if (m4120exceptionOrNullimpl2 != null) {
                return m4120exceptionOrNullimpl2 instanceof StripeException ? ((StripeException) m4120exceptionOrNullimpl2).analyticsValue() : m4120exceptionOrNullimpl2 instanceof IOException ? "ioException" : "unknown";
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:11:0x0027, B:12:0x0042, B:14:0x004e, B:17:0x0051, B:18:0x0069, B:22:0x0035), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:11:0x0027, B:12:0x0042, B:14:0x004e, B:17:0x0051, B:18:0x0069, B:22:0x0035), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: fetchStripeModelResult-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4042fetchStripeModelResultBWLJW6A(ApiRequest apiRequest, ModelJsonParser modelJsonParser, Function1 function1, ContinuationImpl continuationImpl) {
        StripeApiRepository$fetchStripeModelResult$1 stripeApiRepository$fetchStripeModelResult$1;
        int i;
        StripeModel mo4026parse;
        try {
            if (continuationImpl instanceof StripeApiRepository$fetchStripeModelResult$1) {
                stripeApiRepository$fetchStripeModelResult$1 = (StripeApiRepository$fetchStripeModelResult$1) continuationImpl;
                int i2 = stripeApiRepository$fetchStripeModelResult$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    stripeApiRepository$fetchStripeModelResult$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = stripeApiRepository$fetchStripeModelResult$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = stripeApiRepository$fetchStripeModelResult$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Result.Companion companion = Result.Companion;
                        stripeApiRepository$fetchStripeModelResult$1.L$1 = modelJsonParser;
                        stripeApiRepository$fetchStripeModelResult$1.label = 1;
                        obj = makeApiRequest$payments_core_release(apiRequest, function1, stripeApiRepository$fetchStripeModelResult$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        modelJsonParser = stripeApiRepository$fetchStripeModelResult$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                    }
                    mo4026parse = modelJsonParser.mo4026parse(JsonUtilsKt.responseJson((StripeResponse) obj));
                    if (mo4026parse != null) {
                        throw new APIException(0, 23, null, null, "Unable to parse response with ".concat(modelJsonParser.getClass().getSimpleName()), null);
                    }
                    Result.Companion companion2 = Result.Companion;
                    return mo4026parse;
                }
            }
            if (i != 0) {
            }
            mo4026parse = modelJsonParser.mo4026parse(JsonUtilsKt.responseJson((StripeResponse) obj));
            if (mo4026parse != null) {
            }
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            return new Result.Failure(th);
        }
        stripeApiRepository$fetchStripeModelResult$1 = new StripeApiRepository$fetchStripeModelResult$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$fetchStripeModelResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$fetchStripeModelResult$1.label;
    }

    public final void fireFraudDetectionDataRequest() {
        DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository = this.fraudDetectionDataRepository;
        if (defaultFraudDetectionDataRepository.fraudDetectionEnabledProvider.provideFraudDetectionEnabled()) {
            JobKt.launch$default(JobKt.CoroutineScope(defaultFraudDetectionDataRepository.workContext), null, null, new ExoPlayerVideoView.AnonymousClass2(defaultFraudDetectionDataRepository, null, 22), 3);
        }
    }

    public final void handleApiError(ApiRequest.Options options, StripeResponse stripeResponse) {
        RequestId requestId = stripeResponse.requestId;
        String str = requestId != null ? requestId.value : null;
        int i = stripeResponse.code;
        StripeError parse = KClasses$$Lambda$1.parse(JsonUtilsKt.responseJson(stripeResponse));
        boolean z = !StringsKt.contains((CharSequence) options.apiKey, (CharSequence) "test", false);
        Context context = this.context;
        context.getClass();
        StripeError stripeError = new StripeError(parse.f1428type, StripeErrorMappingKt.getErrorMessage(parse.message, parse.f1428type, parse.code, parse.declineCode, z, str, context), parse.code, parse.param, parse.declineCode, parse.charge, parse.docUrl, parse.extraFields);
        if (i == 429) {
            throw new RateLimitException(stripeError, str);
        }
        switch (i) {
            case 400:
            case HttpStatusCode.NOT_FOUND_404 /* 404 */:
                throw new InvalidRequestException(i, 24, stripeError, str, null, null);
            case HttpStatusCode.UNAUTHORIZED_401 /* 401 */:
                throw new AuthenticationException(HttpStatusCode.UNAUTHORIZED_401, 24, stripeError, str, null, null);
            case 402:
                throw new CardException(402, 24, stripeError, str, null, null);
            case 403:
                throw new PermissionException(403, 24, stripeError, str, null, null);
            default:
                throw new APIException(i, 24, stripeError, str, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeApiRequest$payments_core_release(ApiRequest apiRequest, Function1 function1, ContinuationImpl continuationImpl) {
        StripeApiRepository$makeApiRequest$1 stripeApiRepository$makeApiRequest$1;
        int i;
        Object failure;
        DnsCacheData dnsCacheData;
        Object executeRequest;
        Throwable th;
        Object failure2;
        Throwable m4120exceptionOrNullimpl;
        if (continuationImpl instanceof StripeApiRepository$makeApiRequest$1) {
            stripeApiRepository$makeApiRequest$1 = (StripeApiRepository$makeApiRequest$1) continuationImpl;
            int i2 = stripeApiRepository$makeApiRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$makeApiRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$makeApiRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$makeApiRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.Companion;
                        String property = Security.getProperty("networkaddress.cache.ttl");
                        Security.setProperty("networkaddress.cache.ttl", "0");
                        failure = new DnsCacheData.Success(property);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th2);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = DnsCacheData.Failure.INSTANCE;
                    }
                    dnsCacheData = (DnsCacheData) failure;
                    try {
                        DefaultStripeNetworkClient defaultStripeNetworkClient = this.stripeNetworkClient;
                        stripeApiRepository$makeApiRequest$1.L$0 = apiRequest;
                        stripeApiRepository$makeApiRequest$1.L$1 = function1;
                        stripeApiRepository$makeApiRequest$1.L$2 = dnsCacheData;
                        stripeApiRepository$makeApiRequest$1.label = 1;
                        executeRequest = defaultStripeNetworkClient.executeRequest(apiRequest, stripeApiRepository$makeApiRequest$1);
                        if (executeRequest == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion3 = Result.Companion;
                        failure2 = new Result.Failure(th);
                        function1.invoke(new Result(failure2));
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
                        if (m4120exceptionOrNullimpl == null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    DnsCacheData dnsCacheData2 = stripeApiRepository$makeApiRequest$1.L$2;
                    function1 = stripeApiRepository$makeApiRequest$1.L$1;
                    ApiRequest apiRequest2 = stripeApiRepository$makeApiRequest$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        dnsCacheData = dnsCacheData2;
                        apiRequest = apiRequest2;
                        executeRequest = obj;
                    } catch (Throwable th4) {
                        dnsCacheData = dnsCacheData2;
                        apiRequest = apiRequest2;
                        th = th4;
                        Result.Companion companion32 = Result.Companion;
                        failure2 = new Result.Failure(th);
                        function1.invoke(new Result(failure2));
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
                        if (m4120exceptionOrNullimpl == null) {
                        }
                    }
                }
                failure2 = (StripeResponse) executeRequest;
                Result.Companion companion4 = Result.Companion;
                function1.invoke(new Result(failure2));
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
                if (m4120exceptionOrNullimpl == null) {
                    if (!(m4120exceptionOrNullimpl instanceof IOException)) {
                        throw m4120exceptionOrNullimpl;
                    }
                    Set set = APIConnectionException.SENSITIVE_PARAM_NAMES;
                    throw Trace.create(apiRequest.baseUrl, (IOException) m4120exceptionOrNullimpl);
                }
                StripeResponse stripeResponse = (StripeResponse) failure2;
                if (stripeResponse.isError) {
                    handleApiError(apiRequest.options, stripeResponse);
                    throw null;
                }
                if (dnsCacheData instanceof DnsCacheData.Success) {
                    String str = ((DnsCacheData.Success) dnsCacheData).originalDnsCacheTtl;
                    if (str == null) {
                        str = "-1";
                    }
                    Security.setProperty("networkaddress.cache.ttl", str);
                }
                return stripeResponse;
            }
        }
        stripeApiRepository$makeApiRequest$1 = new StripeApiRepository$makeApiRequest$1(this, continuationImpl);
        Object obj2 = stripeApiRepository$makeApiRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$makeApiRequest$1.label;
        if (i != 0) {
        }
        failure2 = (StripeResponse) executeRequest;
        Result.Companion companion42 = Result.Companion;
        function1.invoke(new Result(failure2));
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
        if (m4120exceptionOrNullimpl == null) {
        }
    }

    public final Map maybeAddPaymentUserAgent(Map map, PaymentMethodCreateParams paymentMethodCreateParams, SourceParams sourceParams) {
        Set set;
        Object obj = map.get("payment_method_data");
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 != null) {
            if (paymentMethodCreateParams == null || (set = paymentMethodCreateParams.getAttribution()) == null) {
                set = EmptySet.INSTANCE;
            }
            Map plus = MapsKt__MapsKt.plus(map, new Pair("payment_method_data", MapsKt__MapsKt.plus(map2, buildPaymentUserAgentPair(set))));
            if (plus != null) {
                return plus;
            }
        }
        Object obj2 = map.get("source_data");
        Map map3 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map3 != null) {
            return MapsKt__MapsKt.plus(map, new Pair("source_data", MapsKt__MapsKt.plus(map3, buildPaymentUserAgentPair(sourceParams != null ? sourceParams.attribution : EmptySet.INSTANCE))));
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: maybeForDashboard-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4044maybeForDashboard0E7RQCE(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$maybeForDashboard$3 stripeApiRepository$maybeForDashboard$3;
        int i;
        PaymentMethodCreateParams paymentMethodCreateParams;
        Object obj;
        ConfirmSetupIntentParams confirmSetupIntentParams2;
        if (continuationImpl instanceof StripeApiRepository$maybeForDashboard$3) {
            stripeApiRepository$maybeForDashboard$3 = (StripeApiRepository$maybeForDashboard$3) continuationImpl;
            int i2 = stripeApiRepository$maybeForDashboard$3.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$maybeForDashboard$3.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = stripeApiRepository$maybeForDashboard$3.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$maybeForDashboard$3.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (!options.getApiKeyIsUserKey() || (paymentMethodCreateParams = confirmSetupIntentParams.paymentMethodCreateParams) == null) {
                        Result.Companion companion = Result.Companion;
                        return confirmSetupIntentParams;
                    }
                    stripeApiRepository$maybeForDashboard$3.L$0 = confirmSetupIntentParams;
                    stripeApiRepository$maybeForDashboard$3.label = 1;
                    Object m4040createPaymentMethod0E7RQCE = m4040createPaymentMethod0E7RQCE(paymentMethodCreateParams, options, stripeApiRepository$maybeForDashboard$3);
                    if (m4040createPaymentMethod0E7RQCE == obj3) {
                        return obj3;
                    }
                    obj = m4040createPaymentMethod0E7RQCE;
                    confirmSetupIntentParams2 = confirmSetupIntentParams;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    confirmSetupIntentParams2 = stripeApiRepository$maybeForDashboard$3.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    obj = ((Result) obj2).value;
                }
                Result.Companion companion2 = Result.Companion;
                if (!(obj instanceof Result.Failure)) {
                    return obj;
                }
                try {
                    String str = confirmSetupIntentParams2.clientSecret;
                    String str2 = ((PaymentMethod) obj).id;
                    PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card = confirmSetupIntentParams2.paymentMethodOptions;
                    str.getClass();
                    str2.getClass();
                    if (!(paymentMethodOptionsParams$Card instanceof PaymentMethodOptionsParams$Card)) {
                        paymentMethodOptionsParams$Card = null;
                    }
                    PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card2 = new PaymentMethodOptionsParams$Card(paymentMethodOptionsParams$Card != null ? paymentMethodOptionsParams$Card.setupFutureUsage : null);
                    y0 y0Var = PaymentMethod.Type.Companion;
                    return new ConfirmSetupIntentParams(str, str2, null, null, true, null, null, null, "card", paymentMethodOptionsParams$Card2, null, null, null, 7404);
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    return new Result.Failure(th);
                }
            }
        }
        stripeApiRepository$maybeForDashboard$3 = new StripeApiRepository$maybeForDashboard$3(this, continuationImpl);
        Object obj22 = stripeApiRepository$maybeForDashboard$3.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$maybeForDashboard$3.label;
        if (i != 0) {
        }
        Result.Companion companion22 = Result.Companion;
        if (!(obj instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: refreshPaymentIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4045refreshPaymentIntent0E7RQCE(String str, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$refreshPaymentIntent$1 stripeApiRepository$refreshPaymentIntent$1;
        int i;
        Object failure;
        if (continuationImpl instanceof StripeApiRepository$refreshPaymentIntent$1) {
            stripeApiRepository$refreshPaymentIntent$1 = (StripeApiRepository$refreshPaymentIntent$1) continuationImpl;
            int i2 = stripeApiRepository$refreshPaymentIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$refreshPaymentIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$refreshPaymentIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$refreshPaymentIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                try {
                    Result.Companion companion = Result.Companion;
                    failure = new PaymentIntent.ClientSecret(str).paymentIntentId;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    return new Result.Failure(m4120exceptionOrNullimpl);
                }
                String str2 = (String) failure;
                fireFraudDetectionDataRequest();
                str2.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("payment_intents/%s/refresh", str2), options, createClientSecretParam(str, EmptyList.INSTANCE));
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(20);
                Function1 stripeApiRepository$$ExternalSyntheticLambda2 = new StripeApiRepository$$ExternalSyntheticLambda2(this, 2);
                stripeApiRepository$refreshPaymentIntent$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda2, stripeApiRepository$refreshPaymentIntent$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$refreshPaymentIntent$1 = new StripeApiRepository$refreshPaymentIntent$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$refreshPaymentIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$refreshPaymentIntent$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: refreshSetupIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4046refreshSetupIntent0E7RQCE(String str, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$refreshSetupIntent$1 stripeApiRepository$refreshSetupIntent$1;
        int i;
        Object failure;
        if (continuationImpl instanceof StripeApiRepository$refreshSetupIntent$1) {
            stripeApiRepository$refreshSetupIntent$1 = (StripeApiRepository$refreshSetupIntent$1) continuationImpl;
            int i2 = stripeApiRepository$refreshSetupIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$refreshSetupIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$refreshSetupIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$refreshSetupIntent$1.label;
                int i3 = 1;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                try {
                    Result.Companion companion = Result.Companion;
                    failure = new SetupIntent.ClientSecret(str).setupIntentId;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    return new Result.Failure(m4120exceptionOrNullimpl);
                }
                String str2 = (String) failure;
                fireFraudDetectionDataRequest();
                str2.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("setup_intents/%s/refresh", str2), options, createClientSecretParam(str, EmptyList.INSTANCE));
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(0);
                Function1 stripeApiRepository$$ExternalSyntheticLambda2 = new StripeApiRepository$$ExternalSyntheticLambda2(this, i3);
                stripeApiRepository$refreshSetupIntent$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda2, stripeApiRepository$refreshSetupIntent$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$refreshSetupIntent$1 = new StripeApiRepository$refreshSetupIntent$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$refreshSetupIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$refreshSetupIntent$1.label;
        int i32 = 1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: retrievePaymentIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4047retrievePaymentIntentBWLJW6A(String str, ApiRequest.Options options, List list, ContinuationImpl continuationImpl) {
        StripeApiRepository$retrievePaymentIntent$1 stripeApiRepository$retrievePaymentIntent$1;
        int i;
        Object failure;
        if (continuationImpl instanceof StripeApiRepository$retrievePaymentIntent$1) {
            stripeApiRepository$retrievePaymentIntent$1 = (StripeApiRepository$retrievePaymentIntent$1) continuationImpl;
            int i2 = stripeApiRepository$retrievePaymentIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$retrievePaymentIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$retrievePaymentIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$retrievePaymentIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                try {
                    Result.Companion companion = Result.Companion;
                    failure = new PaymentIntent.ClientSecret(str).paymentIntentId;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    return new Result.Failure(m4120exceptionOrNullimpl);
                }
                String str2 = (String) failure;
                Map access$createExpandParam = options.getApiKeyIsUserKey() ? KClasses$$Lambda$1.access$createExpandParam(list) : createClientSecretParam(str, list);
                fireFraudDetectionDataRequest();
                str2.getClass();
                ApiRequest createGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("payment_intents/%s", str2), options, access$createExpandParam);
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(20);
                Function1 stripeApiRepository$$ExternalSyntheticLambda2 = new StripeApiRepository$$ExternalSyntheticLambda2(this, 5);
                stripeApiRepository$retrievePaymentIntent$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createGet$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda2, stripeApiRepository$retrievePaymentIntent$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$retrievePaymentIntent$1 = new StripeApiRepository$retrievePaymentIntent$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$retrievePaymentIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$retrievePaymentIntent$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: retrieveSetupIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4048retrieveSetupIntentBWLJW6A(String str, ApiRequest.Options options, List list, ContinuationImpl continuationImpl) {
        StripeApiRepository$retrieveSetupIntent$1 stripeApiRepository$retrieveSetupIntent$1;
        int i;
        Object failure;
        if (continuationImpl instanceof StripeApiRepository$retrieveSetupIntent$1) {
            stripeApiRepository$retrieveSetupIntent$1 = (StripeApiRepository$retrieveSetupIntent$1) continuationImpl;
            int i2 = stripeApiRepository$retrieveSetupIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$retrieveSetupIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$retrieveSetupIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$retrieveSetupIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                try {
                    Result.Companion companion = Result.Companion;
                    failure = new SetupIntent.ClientSecret(str).setupIntentId;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    return new Result.Failure(m4120exceptionOrNullimpl);
                }
                String str2 = (String) failure;
                Map access$createExpandParam = options.getApiKeyIsUserKey() ? KClasses$$Lambda$1.access$createExpandParam(list) : createClientSecretParam(str, list);
                fireFraudDetectionDataRequest();
                str2.getClass();
                ApiRequest createGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, KClasses$$Lambda$1.getApiUrl("setup_intents/%s", str2), options, access$createExpandParam);
                int i3 = 0;
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(i3);
                Function1 stripeApiRepository$$ExternalSyntheticLambda2 = new StripeApiRepository$$ExternalSyntheticLambda2(this, i3);
                stripeApiRepository$retrieveSetupIntent$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createGet$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda2, stripeApiRepository$retrieveSetupIntent$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$retrieveSetupIntent$1 = new StripeApiRepository$retrieveSetupIntent$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$retrieveSetupIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$retrieveSetupIntent$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: retrieveStripeIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4049retrieveStripeIntentBWLJW6A(String str, ApiRequest.Options options, List list, ContinuationImpl continuationImpl) {
        StripeApiRepository$retrieveStripeIntent$1 stripeApiRepository$retrieveStripeIntent$1;
        int i;
        if (continuationImpl instanceof StripeApiRepository$retrieveStripeIntent$1) {
            stripeApiRepository$retrieveStripeIntent$1 = (StripeApiRepository$retrieveStripeIntent$1) continuationImpl;
            int i2 = stripeApiRepository$retrieveStripeIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$retrieveStripeIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$retrieveStripeIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$retrieveStripeIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Pattern pattern = PaymentIntent.ClientSecret.PATTERN;
                str.getClass();
                if (PaymentIntent.ClientSecret.PATTERN.matcher(str).matches()) {
                    stripeApiRepository$retrieveStripeIntent$1.label = 1;
                    Object m4047retrievePaymentIntentBWLJW6A = m4047retrievePaymentIntentBWLJW6A(str, options, list, stripeApiRepository$retrieveStripeIntent$1);
                    if (m4047retrievePaymentIntentBWLJW6A != obj2) {
                        return m4047retrievePaymentIntentBWLJW6A;
                    }
                } else {
                    if (!SetupIntent.ClientSecret.PATTERN.matcher(str).matches()) {
                        Result.Companion companion = Result.Companion;
                        return new Result.Failure(new IllegalStateException("Invalid client secret."));
                    }
                    stripeApiRepository$retrieveStripeIntent$1.label = 2;
                    Object m4048retrieveSetupIntentBWLJW6A = m4048retrieveSetupIntentBWLJW6A(str, options, list, stripeApiRepository$retrieveStripeIntent$1);
                    if (m4048retrieveSetupIntentBWLJW6A != obj2) {
                        return m4048retrieveSetupIntentBWLJW6A;
                    }
                }
                return obj2;
            }
        }
        stripeApiRepository$retrieveStripeIntent$1 = new StripeApiRepository$retrieveStripeIntent$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$retrieveStripeIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$retrieveStripeIntent$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: start3ds2Auth-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4050start3ds2Auth0E7RQCE(Stripe3ds2AuthParams stripe3ds2AuthParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$start3ds2Auth$1 stripeApiRepository$start3ds2Auth$1;
        int i;
        Object failure;
        if (continuationImpl instanceof StripeApiRepository$start3ds2Auth$1) {
            stripeApiRepository$start3ds2Auth$1 = (StripeApiRepository$start3ds2Auth$1) continuationImpl;
            int i2 = stripeApiRepository$start3ds2Auth$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$start3ds2Auth$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$start3ds2Auth$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$start3ds2Auth$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                String concat = "https://api.stripe.com/v1/".concat("3ds2/authenticate");
                Pair pair = new Pair("source", stripe3ds2AuthParams.sourceId);
                try {
                    Result.Companion companion = Result.Companion;
                    failure = new JSONObject().put("sdkAppID", stripe3ds2AuthParams.sdkAppId).put("sdkTransID", stripe3ds2AuthParams.sdkTransactionId).put("sdkEncData", stripe3ds2AuthParams.deviceData).put("sdkEphemPubKey", new JSONObject(stripe3ds2AuthParams.sdkEphemeralPublicKey)).put("sdkMaxTimeout", StringsKt.padStart(2, String.valueOf(stripe3ds2AuthParams.maxTimeout))).put("sdkReferenceNumber", stripe3ds2AuthParams.sdkReferenceNumber).put("messageVersion", stripe3ds2AuthParams.messageVersion).put("deviceRenderOptions", Stripe3ds2AuthParams.getDeviceRenderOptions());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                Object jSONObject = new JSONObject();
                if (failure instanceof Result.Failure) {
                    failure = jSONObject;
                }
                Map mapOf = MapsKt__MapsKt.mapOf(pair, new Pair("app", ((JSONObject) failure).toString()));
                String str = stripe3ds2AuthParams.returnUrl;
                Map m = str != null ? Thread$State$EnumUnboxingLocalUtility.m("fallback_return_url", str) : null;
                if (m == null) {
                    m = EmptyMap.INSTANCE;
                    m.getClass();
                }
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, concat, options, MapsKt__MapsKt.plus(mapOf, m));
                ModelJsonParser setupIntentJsonParser = new SetupIntentJsonParser(22);
                Function1 stripeApiRepository$$ExternalSyntheticLambda2 = new StripeApiRepository$$ExternalSyntheticLambda2(this, 4);
                stripeApiRepository$start3ds2Auth$1.label = 1;
                Object m4042fetchStripeModelResultBWLJW6A = m4042fetchStripeModelResultBWLJW6A(createPost$default, setupIntentJsonParser, stripeApiRepository$$ExternalSyntheticLambda2, stripeApiRepository$start3ds2Auth$1);
                return m4042fetchStripeModelResultBWLJW6A == obj2 ? obj2 : m4042fetchStripeModelResultBWLJW6A;
            }
        }
        stripeApiRepository$start3ds2Auth$1 = new StripeApiRepository$start3ds2Auth$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$start3ds2Auth$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$start3ds2Auth$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: maybeForDashboard-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4043maybeForDashboard0E7RQCE(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripeApiRepository$maybeForDashboard$1 stripeApiRepository$maybeForDashboard$1;
        int i;
        PaymentMethodCreateParams paymentMethodCreateParams;
        Object m4040createPaymentMethod0E7RQCE;
        if (continuationImpl instanceof StripeApiRepository$maybeForDashboard$1) {
            stripeApiRepository$maybeForDashboard$1 = (StripeApiRepository$maybeForDashboard$1) continuationImpl;
            int i2 = stripeApiRepository$maybeForDashboard$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeApiRepository$maybeForDashboard$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeApiRepository$maybeForDashboard$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeApiRepository$maybeForDashboard$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (options.getApiKeyIsUserKey() && (paymentMethodCreateParams = confirmPaymentIntentParams.paymentMethodCreateParams) != null) {
                        stripeApiRepository$maybeForDashboard$1.L$0 = confirmPaymentIntentParams;
                        stripeApiRepository$maybeForDashboard$1.label = 1;
                        m4040createPaymentMethod0E7RQCE = m4040createPaymentMethod0E7RQCE(paymentMethodCreateParams, options, stripeApiRepository$maybeForDashboard$1);
                        if (m4040createPaymentMethod0E7RQCE == obj2) {
                            return obj2;
                        }
                    } else {
                        Result.Companion companion = Result.Companion;
                        return confirmPaymentIntentParams;
                    }
                } else if (i == 1) {
                    confirmPaymentIntentParams = stripeApiRepository$maybeForDashboard$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    m4040createPaymentMethod0E7RQCE = ((Result) obj).value;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Result.Companion companion2 = Result.Companion;
                if (!(m4040createPaymentMethod0E7RQCE instanceof Result.Failure)) {
                    return m4040createPaymentMethod0E7RQCE;
                }
                try {
                    String str = confirmPaymentIntentParams.clientSecret;
                    String str2 = ((PaymentMethod) m4040createPaymentMethod0E7RQCE).id;
                    PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card = confirmPaymentIntentParams.paymentMethodOptions;
                    str.getClass();
                    str2.getClass();
                    if (!(paymentMethodOptionsParams$Card instanceof PaymentMethodOptionsParams$Card)) {
                        paymentMethodOptionsParams$Card = null;
                    }
                    PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card2 = new PaymentMethodOptionsParams$Card(paymentMethodOptionsParams$Card != null ? paymentMethodOptionsParams$Card.setupFutureUsage : null);
                    y0 y0Var = PaymentMethod.Type.Companion;
                    return new ConfirmPaymentIntentParams(null, str2, str, Boolean.FALSE, paymentMethodOptionsParams$Card2, "card", 491053);
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    return new Result.Failure(th);
                }
            }
        }
        stripeApiRepository$maybeForDashboard$1 = new StripeApiRepository$maybeForDashboard$1(this, continuationImpl);
        Object obj3 = stripeApiRepository$maybeForDashboard$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeApiRepository$maybeForDashboard$1.label;
        if (i != 0) {
        }
        Result.Companion companion22 = Result.Companion;
        if (!(m4040createPaymentMethod0E7RQCE instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0 function0, RequestSurface requestSurface, CoroutineContext coroutineContext, Set set, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        this(context, function0, requestSurface, logger$Companion$NOOP_LOGGER$1, coroutineContext, set, defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory, 63112);
        context.getClass();
        function0.getClass();
        requestSurface.getClass();
        coroutineContext.getClass();
        set.getClass();
        paymentAnalyticsRequestFactory.getClass();
        defaultAnalyticsRequestExecutor.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
    }
}
