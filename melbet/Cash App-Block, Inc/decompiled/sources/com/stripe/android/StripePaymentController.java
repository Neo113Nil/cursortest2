package com.stripe.android;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjo;
import com.google.android.instantapps.InstantApps;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt$$ExternalSyntheticLambda0;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.NetworkTypeDetector;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.view.ActivityHost;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class StripePaymentController {
    public final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    public final DefaultReturnUrl defaultReturnUrl;
    public final boolean isInstantApp;
    public final DefaultPaymentNextActionHandlerRegistry nextActionHandlerRegistry;
    public final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    public final PaymentIntentFlowResultProcessor paymentIntentFlowResultProcessor;
    public final StripePaymentController$$ExternalSyntheticLambda1 paymentRelayStarterFactory;
    public final SetupIntentFlowResultProcessor setupIntentFlowResultProcessor;
    public final StripeApiRepository stripeRepository;
    public final CoroutineContext uiContext;
    public static final List EXPAND_PAYMENT_METHOD = CollectionsKt__CollectionsJVMKt.listOf("payment_method");
    public static final long CHALLENGE_DELAY = 2000;

    public StripePaymentController(Application application, PromotionsTitleBarKt$$ExternalSyntheticLambda0 promotionsTitleBarKt$$ExternalSyntheticLambda0, StripeApiRepository stripeApiRepository, CoroutineContext coroutineContext) {
        Object failure;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = Logger$Companion.NOOP_LOGGER;
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$1, coroutineContext);
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        StripePaymentController$$ExternalSyntheticLambda0 stripePaymentController$$ExternalSyntheticLambda0 = new StripePaymentController$$ExternalSyntheticLambda0(promotionsTitleBarKt$$ExternalSyntheticLambda0, 0);
        PackageManager packageManager = applicationContext.getApplicationContext().getPackageManager();
        Context applicationContext2 = applicationContext.getApplicationContext();
        applicationContext2.getClass();
        try {
            Result.Companion companion = Result.Companion;
            failure = applicationContext2.getPackageManager().getPackageInfo(applicationContext2.getPackageName(), 0);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        PackageInfo packageInfo = (PackageInfo) (failure instanceof Result.Failure ? null : failure);
        String packageName = applicationContext.getApplicationContext().getPackageName();
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(packageManager, packageInfo, packageName == null ? "" : packageName, stripePaymentController$$ExternalSyntheticLambda0, new StripePaymentController$$ExternalSyntheticLambda0(new NetworkTypeDetector(applicationContext), 2), EmptySet.INSTANCE);
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
        coroutineContext.getClass();
        handlerContext.getClass();
        this.stripeRepository = stripeApiRepository;
        this.analyticsRequestExecutor = defaultAnalyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.uiContext = handlerContext;
        this.paymentIntentFlowResultProcessor = new PaymentIntentFlowResultProcessor(application, promotionsTitleBarKt$$ExternalSyntheticLambda0, stripeApiRepository, logger$Companion$NOOP_LOGGER$1, coroutineContext);
        this.setupIntentFlowResultProcessor = new SetupIntentFlowResultProcessor(application, promotionsTitleBarKt$$ExternalSyntheticLambda0, stripeApiRepository, logger$Companion$NOOP_LOGGER$1, coroutineContext);
        String packageName2 = application.getPackageName();
        packageName2.getClass();
        this.defaultReturnUrl = new DefaultReturnUrl(packageName2);
        boolean isInstantApp = InstantApps.isInstantApp(application);
        this.isInstantApp = isInstantApp;
        this.paymentRelayStarterFactory = new StripePaymentController$$ExternalSyntheticLambda1(this);
        this.nextActionHandlerRegistry = zzjo.createInstance(application, paymentAnalyticsRequestFactory, false, coroutineContext, handlerContext, promotionsTitleBarKt$$ExternalSyntheticLambda0, paymentAnalyticsRequestFactory.defaultProductUsageTokens, isInstantApp, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: confirmPaymentIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4006confirmPaymentIntent0E7RQCE(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripePaymentController$confirmPaymentIntent$1 stripePaymentController$confirmPaymentIntent$1;
        int i;
        if (continuationImpl instanceof StripePaymentController$confirmPaymentIntent$1) {
            stripePaymentController$confirmPaymentIntent$1 = (StripePaymentController$confirmPaymentIntent$1) continuationImpl;
            int i2 = stripePaymentController$confirmPaymentIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripePaymentController$confirmPaymentIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripePaymentController$confirmPaymentIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripePaymentController$confirmPaymentIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ConfirmPaymentIntentParams withShouldUseStripeSdk = confirmPaymentIntentParams.withShouldUseStripeSdk();
                stripePaymentController$confirmPaymentIntent$1.label = 1;
                Object m4034confirmPaymentIntentBWLJW6A = this.stripeRepository.m4034confirmPaymentIntentBWLJW6A(withShouldUseStripeSdk, options, EXPAND_PAYMENT_METHOD, stripePaymentController$confirmPaymentIntent$1);
                return m4034confirmPaymentIntentBWLJW6A == coroutineSingletons ? coroutineSingletons : m4034confirmPaymentIntentBWLJW6A;
            }
        }
        stripePaymentController$confirmPaymentIntent$1 = new StripePaymentController$confirmPaymentIntent$1(this, continuationImpl);
        Object obj2 = stripePaymentController$confirmPaymentIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripePaymentController$confirmPaymentIntent$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: confirmSetupIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4007confirmSetupIntent0E7RQCE(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripePaymentController$confirmSetupIntent$1 stripePaymentController$confirmSetupIntent$1;
        int i;
        if (continuationImpl instanceof StripePaymentController$confirmSetupIntent$1) {
            stripePaymentController$confirmSetupIntent$1 = (StripePaymentController$confirmSetupIntent$1) continuationImpl;
            int i2 = stripePaymentController$confirmSetupIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripePaymentController$confirmSetupIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripePaymentController$confirmSetupIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripePaymentController$confirmSetupIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ConfirmSetupIntentParams withShouldUseStripeSdk = confirmSetupIntentParams.withShouldUseStripeSdk();
                stripePaymentController$confirmSetupIntent$1.label = 1;
                Object m4036confirmSetupIntentBWLJW6A = this.stripeRepository.m4036confirmSetupIntentBWLJW6A(withShouldUseStripeSdk, options, EXPAND_PAYMENT_METHOD, stripePaymentController$confirmSetupIntent$1);
                return m4036confirmSetupIntentBWLJW6A == coroutineSingletons ? coroutineSingletons : m4036confirmSetupIntentBWLJW6A;
            }
        }
        stripePaymentController$confirmSetupIntent$1 = new StripePaymentController$confirmSetupIntent$1(this, continuationImpl);
        Object obj2 = stripePaymentController$confirmSetupIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripePaymentController$confirmSetupIntent$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getPaymentIntentResult-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4008getPaymentIntentResultgIAlus(Intent intent, ContinuationImpl continuationImpl) {
        StripePaymentController$getPaymentIntentResult$1 stripePaymentController$getPaymentIntentResult$1;
        int i;
        PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated;
        if (continuationImpl instanceof StripePaymentController$getPaymentIntentResult$1) {
            stripePaymentController$getPaymentIntentResult$1 = (StripePaymentController$getPaymentIntentResult$1) continuationImpl;
            int i2 = stripePaymentController$getPaymentIntentResult$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripePaymentController$getPaymentIntentResult$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripePaymentController$getPaymentIntentResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripePaymentController$getPaymentIntentResult$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (intent == null || (paymentFlowResult$Unvalidated = (PaymentFlowResult$Unvalidated) intent.getParcelableExtra("extra_args")) == null) {
                    paymentFlowResult$Unvalidated = new PaymentFlowResult$Unvalidated((String) null, 0, (StripeException) null, false, (String) null, (String) null, 127);
                }
                stripePaymentController$getPaymentIntentResult$1.label = 1;
                Object m4053processResultgIAlus = this.paymentIntentFlowResultProcessor.m4053processResultgIAlus(paymentFlowResult$Unvalidated, stripePaymentController$getPaymentIntentResult$1);
                return m4053processResultgIAlus == coroutineSingletons ? coroutineSingletons : m4053processResultgIAlus;
            }
        }
        stripePaymentController$getPaymentIntentResult$1 = new StripePaymentController$getPaymentIntentResult$1(this, continuationImpl);
        Object obj2 = stripePaymentController$getPaymentIntentResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripePaymentController$getPaymentIntentResult$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getSetupIntentResult-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4009getSetupIntentResultgIAlus(Intent intent, ContinuationImpl continuationImpl) {
        StripePaymentController$getSetupIntentResult$1 stripePaymentController$getSetupIntentResult$1;
        int i;
        PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated;
        if (continuationImpl instanceof StripePaymentController$getSetupIntentResult$1) {
            stripePaymentController$getSetupIntentResult$1 = (StripePaymentController$getSetupIntentResult$1) continuationImpl;
            int i2 = stripePaymentController$getSetupIntentResult$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripePaymentController$getSetupIntentResult$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripePaymentController$getSetupIntentResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripePaymentController$getSetupIntentResult$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (intent == null || (paymentFlowResult$Unvalidated = (PaymentFlowResult$Unvalidated) intent.getParcelableExtra("extra_args")) == null) {
                    paymentFlowResult$Unvalidated = new PaymentFlowResult$Unvalidated((String) null, 0, (StripeException) null, false, (String) null, (String) null, 127);
                }
                stripePaymentController$getSetupIntentResult$1.label = 1;
                Object m4053processResultgIAlus = this.setupIntentFlowResultProcessor.m4053processResultgIAlus(paymentFlowResult$Unvalidated, stripePaymentController$getSetupIntentResult$1);
                return m4053processResultgIAlus == coroutineSingletons ? coroutineSingletons : m4053processResultgIAlus;
            }
        }
        stripePaymentController$getSetupIntentResult$1 = new StripePaymentController$getSetupIntentResult$1(this, continuationImpl);
        Object obj2 = stripePaymentController$getSetupIntentResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripePaymentController$getSetupIntentResult$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fe, code lost:
    
        if (r0 == r7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0131, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012f, code lost:
    
        if (r0 == r7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
    
        if (r4 == r7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
    
        if (r4 == r7) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startConfirmAndAuth(ActivityHost activityHost, ConfirmStripeIntentParams confirmStripeIntentParams, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        StripePaymentController$startConfirmAndAuth$1 stripePaymentController$startConfirmAndAuth$1;
        int i;
        String returnUrl;
        Object m4007confirmSetupIntent0E7RQCE;
        Throwable m4120exceptionOrNullimpl;
        int i2;
        ActivityHost activityHost2 = activityHost;
        ConfirmStripeIntentParams confirmStripeIntentParams2 = confirmStripeIntentParams;
        ApiRequest.Options options2 = options;
        if (continuationImpl instanceof StripePaymentController$startConfirmAndAuth$1) {
            stripePaymentController$startConfirmAndAuth$1 = (StripePaymentController$startConfirmAndAuth$1) continuationImpl;
            int i3 = stripePaymentController$startConfirmAndAuth$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                stripePaymentController$startConfirmAndAuth$1.label = i3 - PKIFailureInfo.systemUnavail;
                StripePaymentController$startConfirmAndAuth$1 stripePaymentController$startConfirmAndAuth$12 = stripePaymentController$startConfirmAndAuth$1;
                Object obj = stripePaymentController$startConfirmAndAuth$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripePaymentController$startConfirmAndAuth$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String returnUrl2 = confirmStripeIntentParams2.getReturnUrl();
                    DefaultReturnUrl defaultReturnUrl = this.defaultReturnUrl;
                    this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, Intrinsics.areEqual(returnUrl2, defaultReturnUrl.getValue()) ? PaymentAnalyticsEvent.ConfirmReturnUrlDefault : returnUrl2 == null ? PaymentAnalyticsEvent.ConfirmReturnUrlNull : PaymentAnalyticsEvent.ConfirmReturnUrlCustom, null, null, null, null, 62));
                    if (this.isInstantApp) {
                        returnUrl = confirmStripeIntentParams2.getReturnUrl();
                    } else {
                        returnUrl = confirmStripeIntentParams2.getReturnUrl();
                        if (returnUrl == null || StringsKt.isBlank(returnUrl)) {
                            returnUrl = null;
                        }
                        if (returnUrl == null) {
                            returnUrl = defaultReturnUrl.getValue();
                        }
                    }
                    if (confirmStripeIntentParams2 instanceof ConfirmPaymentIntentParams) {
                        ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) confirmStripeIntentParams2;
                        confirmPaymentIntentParams.returnUrl = returnUrl;
                        stripePaymentController$startConfirmAndAuth$12.L$0 = activityHost2;
                        stripePaymentController$startConfirmAndAuth$12.L$1 = confirmStripeIntentParams2;
                        stripePaymentController$startConfirmAndAuth$12.L$2 = options2;
                        stripePaymentController$startConfirmAndAuth$12.label = 1;
                        m4007confirmSetupIntent0E7RQCE = m4006confirmPaymentIntent0E7RQCE(confirmPaymentIntentParams, options2, stripePaymentController$startConfirmAndAuth$12);
                    } else {
                        if (!(confirmStripeIntentParams2 instanceof ConfirmSetupIntentParams)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) confirmStripeIntentParams2;
                        confirmSetupIntentParams.returnUrl = returnUrl;
                        stripePaymentController$startConfirmAndAuth$12.L$0 = activityHost2;
                        stripePaymentController$startConfirmAndAuth$12.L$1 = confirmStripeIntentParams2;
                        stripePaymentController$startConfirmAndAuth$12.L$2 = options2;
                        stripePaymentController$startConfirmAndAuth$12.label = 2;
                        m4007confirmSetupIntent0E7RQCE = m4007confirmSetupIntent0E7RQCE(confirmSetupIntentParams, options2, stripePaymentController$startConfirmAndAuth$12);
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1 && i != 2) {
                    if (i == 3 || i == 4) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ApiRequest.Options options3 = stripePaymentController$startConfirmAndAuth$12.L$2;
                confirmStripeIntentParams2 = stripePaymentController$startConfirmAndAuth$12.L$1;
                ActivityHost activityHost3 = stripePaymentController$startConfirmAndAuth$12.L$0;
                SafeTrace.throwOnFailure(obj);
                m4007confirmSetupIntent0E7RQCE = ((Result) obj).value;
                options2 = options3;
                activityHost2 = activityHost3;
                ConfirmStripeIntentParams confirmStripeIntentParams3 = confirmStripeIntentParams2;
                ActivityHost activityHost4 = activityHost2;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4007confirmSetupIntent0E7RQCE);
                if (m4120exceptionOrNullimpl != null) {
                    StripeIntent stripeIntent = (StripeIntent) m4007confirmSetupIntent0E7RQCE;
                    stripePaymentController$startConfirmAndAuth$12.L$0 = null;
                    stripePaymentController$startConfirmAndAuth$12.L$1 = null;
                    stripePaymentController$startConfirmAndAuth$12.L$2 = null;
                    stripePaymentController$startConfirmAndAuth$12.label = 3;
                    Object performNextAction = this.nextActionHandlerRegistry.getNextActionHandler(stripeIntent).performNextAction(activityHost4, stripeIntent, options2, stripePaymentController$startConfirmAndAuth$12);
                    if (performNextAction != obj2) {
                        performNextAction = Unit.INSTANCE;
                    }
                } else {
                    confirmStripeIntentParams3.getClass();
                    if (confirmStripeIntentParams3 instanceof ConfirmPaymentIntentParams) {
                        i2 = 50000;
                    } else {
                        if (!(confirmStripeIntentParams3 instanceof ConfirmSetupIntentParams)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i2 = 50001;
                    }
                    int i4 = i2;
                    stripePaymentController$startConfirmAndAuth$12.L$0 = null;
                    stripePaymentController$startConfirmAndAuth$12.L$1 = null;
                    stripePaymentController$startConfirmAndAuth$12.L$2 = null;
                    stripePaymentController$startConfirmAndAuth$12.label = 4;
                    Object withContext = JobKt.withContext(this.uiContext, new WorkerWorkflow$render$1(this, activityHost4, m4120exceptionOrNullimpl, i4, (Continuation) null), stripePaymentController$startConfirmAndAuth$12);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                }
            }
        }
        stripePaymentController$startConfirmAndAuth$1 = new StripePaymentController$startConfirmAndAuth$1(this, continuationImpl);
        StripePaymentController$startConfirmAndAuth$1 stripePaymentController$startConfirmAndAuth$122 = stripePaymentController$startConfirmAndAuth$1;
        Object obj3 = stripePaymentController$startConfirmAndAuth$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripePaymentController$startConfirmAndAuth$122.label;
        if (i != 0) {
        }
        ConfirmStripeIntentParams confirmStripeIntentParams32 = confirmStripeIntentParams2;
        ActivityHost activityHost42 = activityHost2;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4007confirmSetupIntent0E7RQCE);
        if (m4120exceptionOrNullimpl != null) {
        }
    }
}
