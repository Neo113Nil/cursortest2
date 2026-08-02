package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.SharedPreferences;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.model.SpanEvent;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.DefaultCardFundingFilter;
import com.stripe.android.GooglePayConfig;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.core.analytics.ErrorReporter$ExpectedErrorEvent;
import com.stripe.android.payments.core.analytics.ErrorReporter$UnexpectedErrorEvent;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class DefaultGooglePayRepository {
    public final List additionalEnabledNetworks;
    public final boolean allowCreditCards;
    public final GooglePayJsonFactory.BillingAddressParameters billingAddressParameters;
    public final GooglePayEnvironment environment;
    public final RealErrorReporter errorReporter;
    public final boolean existingPaymentMethodRequired;
    public final Lazy googlePayAvailabilityClient$delegate;
    public final GooglePayJsonFactory googlePayJsonFactory;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final DefaultPaymentsClientFactory paymentsClientFactory;

    public DefaultGooglePayRepository(Context context, GooglePayEnvironment googlePayEnvironment, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z, boolean z2, DefaultPaymentsClientFactory defaultPaymentsClientFactory, RealErrorReporter realErrorReporter, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, DefaultCardBrandFilter defaultCardBrandFilter, DefaultCardFundingFilter defaultCardFundingFilter, List list) {
        context.getClass();
        googlePayEnvironment.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        defaultCardBrandFilter.getClass();
        list.getClass();
        this.environment = googlePayEnvironment;
        this.billingAddressParameters = billingAddressParameters;
        this.existingPaymentMethodRequired = z;
        this.allowCreditCards = z2;
        this.paymentsClientFactory = defaultPaymentsClientFactory;
        this.errorReporter = realErrorReporter;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.additionalEnabledNetworks = list;
        PaymentConfiguration paymentConfiguration = PaymentConfiguration.instance;
        if (paymentConfiguration == null) {
            SharedPreferences sharedPreferences = new PaymentConfiguration.Store(context).prefs;
            String string2 = sharedPreferences.getString("key_publishable_key", null);
            paymentConfiguration = string2 != null ? new PaymentConfiguration(string2, sharedPreferences.getString("key_account_id", null)) : null;
            if (paymentConfiguration == null) {
                a$$ExternalSyntheticBUOutline0.m$1("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                throw null;
            }
            PaymentConfiguration.instance = paymentConfiguration;
        }
        this.googlePayJsonFactory = new GooglePayJsonFactory(new GooglePayConfig(paymentConfiguration.publishableKey, paymentConfiguration.stripeAccountId), false, list, defaultCardBrandFilter, defaultCardFundingFilter);
        this.googlePayAvailabilityClient$delegate = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(this, 18));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(2:10|11)(2:27|28))(5:29|30|31|32|(3:34|35|(2:37|38))(2:39|40))|12|(1:14)(1:26)|15|16|(1:18)|19|(1:21)|22|23))|46|6|7|(0)(0)|12|(0)(0)|15|16|(0)|19|(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x002f, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        r12 = kotlin.Result.Companion;
        r11 = new kotlin.Result.Failure(r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x008e, B:14:0x0092, B:15:0x00a0, B:26:0x0097, B:35:0x0072), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x008e, B:14:0x0092, B:15:0x00a0, B:26:0x0097, B:35:0x0072), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$isReadyAsync(DefaultGooglePayRepository defaultGooglePayRepository, ContinuationImpl continuationImpl) {
        DefaultGooglePayRepository$isReadyAsync$1 defaultGooglePayRepository$isReadyAsync$1;
        int i;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        Object obj;
        Boolean bool;
        boolean z;
        RealErrorReporter realErrorReporter = defaultGooglePayRepository.errorReporter;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = defaultGooglePayRepository.logger;
        if (continuationImpl instanceof DefaultGooglePayRepository$isReadyAsync$1) {
            defaultGooglePayRepository$isReadyAsync$1 = (DefaultGooglePayRepository$isReadyAsync$1) continuationImpl;
            int i2 = defaultGooglePayRepository$isReadyAsync$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultGooglePayRepository$isReadyAsync$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = defaultGooglePayRepository$isReadyAsync$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultGooglePayRepository$isReadyAsync$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    try {
                        Result.Companion companion = Result.Companion;
                        String jSONObject = defaultGooglePayRepository.googlePayJsonFactory.createIsReadyToPayRequest(defaultGooglePayRepository.billingAddressParameters, Boolean.valueOf(defaultGooglePayRepository.existingPaymentMethodRequired), Boolean.valueOf(defaultGooglePayRepository.allowCreditCards)).toString();
                        IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
                        zzae.checkNotNull(jSONObject, "isReadyToPayRequestJson cannot be null!");
                        isReadyToPayRequest.zzf = jSONObject;
                        obj = isReadyToPayRequest;
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = new Result.Failure(th);
                    }
                    Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(obj);
                    if (m4120exceptionOrNullimpl2 != null) {
                        ErrorReporter$UnexpectedErrorEvent errorReporter$UnexpectedErrorEvent = ErrorReporter$UnexpectedErrorEvent.GOOGLE_PAY_JSON_REQUEST_PARSING;
                        int i3 = StripeException.$r8$clinit;
                        RealErrorReporter.report$default(realErrorReporter, errorReporter$UnexpectedErrorEvent, SpanEvent.Account.create(m4120exceptionOrNullimpl2), null, 4);
                        logger$Companion$NOOP_LOGGER$1.error("Google Pay json parsing failed.", m4120exceptionOrNullimpl2);
                        return Boolean.FALSE;
                    }
                    IsReadyToPayRequest isReadyToPayRequest2 = (IsReadyToPayRequest) obj;
                    Duration.Companion companion3 = Duration.Companion;
                    long duration = DurationKt.toDuration(30, DurationUnit.SECONDS);
                    ShimmerModifierKt$shimmer$1$1 shimmerModifierKt$shimmer$1$1 = new ShimmerModifierKt$shimmer$1$1(defaultGooglePayRepository, isReadyToPayRequest2, continuation, 16);
                    defaultGooglePayRepository$isReadyAsync$1.L$1 = defaultGooglePayRepository;
                    defaultGooglePayRepository$isReadyAsync$1.label = 1;
                    obj2 = JobKt.m4185withTimeoutOrNullKLykuaI(duration, shimmerModifierKt$shimmer$1$1, defaultGooglePayRepository$isReadyAsync$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defaultGooglePayRepository = defaultGooglePayRepository$isReadyAsync$1.L$1;
                    SafeTrace.throwOnFailure(obj2);
                }
                bool = (Boolean) obj2;
                if (bool == null) {
                    z = bool.booleanValue();
                } else {
                    RealErrorReporter.report$default(defaultGooglePayRepository.errorReporter, ErrorReporter$ExpectedErrorEvent.GOOGLE_PAY_IS_READY_TIMEOUT, null, null, 6);
                    z = false;
                }
                failure = Boolean.valueOf(z);
                Result.Companion companion4 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    ErrorReporter$ExpectedErrorEvent errorReporter$ExpectedErrorEvent = ErrorReporter$ExpectedErrorEvent.GOOGLE_PAY_IS_READY_API_CALL;
                    int i4 = StripeException.$r8$clinit;
                    RealErrorReporter.report$default(realErrorReporter, errorReporter$ExpectedErrorEvent, SpanEvent.Account.create(m4120exceptionOrNullimpl), null, 4);
                    logger$Companion$NOOP_LOGGER$1.error("Google Pay check failed.", m4120exceptionOrNullimpl);
                }
                Boolean bool2 = Boolean.FALSE;
                if (failure instanceof Result.Failure) {
                    failure = bool2;
                }
                Boolean bool3 = (Boolean) failure;
                logger$Companion$NOOP_LOGGER$1.info("Google Pay ready? " + bool3.booleanValue());
                return bool3;
            }
        }
        defaultGooglePayRepository$isReadyAsync$1 = new DefaultGooglePayRepository$isReadyAsync$1(defaultGooglePayRepository, continuationImpl);
        Object obj22 = defaultGooglePayRepository$isReadyAsync$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultGooglePayRepository$isReadyAsync$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        bool = (Boolean) obj22;
        if (bool == null) {
        }
        failure = Boolean.valueOf(z);
        Result.Companion companion42 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
        }
        Boolean bool22 = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
        }
        Boolean bool32 = (Boolean) failure;
        logger$Companion$NOOP_LOGGER$1.info("Google Pay ready? " + bool32.booleanValue());
        return bool32;
    }
}
