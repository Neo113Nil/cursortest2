package com.stripe.android.payments.core.authentication.threeds2;

import android.app.Application;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.DatadogTracing;
import com.datadog.android.trace.model.SpanEvent;
import com.google.android.gms.maps.zzai;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.StripePaymentController;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.core.authentication.threeds2.NextStep;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.security.StripeEphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.StripeTransaction;
import com.stripe.android.stripe3ds2.views.Brand;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class Stripe3ds2TransactionViewModel extends ViewModel {
    public final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    public final Stripe3ds2TransactionContract.Args args;
    public final DefaultStripe3ds2ChallengeResultProcessor challengeResultProcessor;
    public final Application context;
    public boolean hasCompleted;
    public final zzai initChallengeRepository;
    public final boolean isInstantApp;
    public final MessageVersionRegistry messageVersionRegistry;
    public final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    public final SavedStateHandle savedStateHandle;
    public final StripeApiRepository stripeRepository;
    public final ApiRequest.Options threeDS2RequestOptions;
    public final StripeThreeDs2ServiceImpl threeDs2Service;
    public final CoroutineContext workContext;

    public Stripe3ds2TransactionViewModel(Application application, Stripe3ds2TransactionContract.Args args, StripeApiRepository stripeApiRepository, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, StripeThreeDs2ServiceImpl stripeThreeDs2ServiceImpl, MessageVersionRegistry messageVersionRegistry, DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor, zzai zzaiVar, CoroutineContext coroutineContext, SavedStateHandle savedStateHandle, boolean z) {
        ApiRequest.Options options;
        stripeThreeDs2ServiceImpl.getClass();
        messageVersionRegistry.getClass();
        defaultStripe3ds2ChallengeResultProcessor.getClass();
        this.context = application;
        this.args = args;
        this.stripeRepository = stripeApiRepository;
        this.analyticsRequestExecutor = defaultAnalyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.threeDs2Service = stripeThreeDs2ServiceImpl;
        this.messageVersionRegistry = messageVersionRegistry;
        this.challengeResultProcessor = defaultStripe3ds2ChallengeResultProcessor;
        this.initChallengeRepository = zzaiVar;
        this.workContext = coroutineContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z;
        JWECryptoParts jWECryptoParts = savedStateHandle.impl;
        jWECryptoParts.getClass();
        this.hasCompleted = ((LinkedHashMap) jWECryptoParts.header).containsKey("key_next_step");
        String str = args.nextActionData.publishableKey;
        if (str != null) {
            str = str.length() <= 0 ? null : str;
            if (str != null) {
                options = new ApiRequest.Options(str, (String) null, 6);
                this.threeDS2RequestOptions = options;
            }
        }
        options = args.requestOptions;
        this.threeDS2RequestOptions = options;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0229, code lost:
    
        if (r1 != r8) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object begin3ds2Auth(Stripe3ds2Fingerprint stripe3ds2Fingerprint, ContinuationImpl continuationImpl) {
        Stripe3ds2TransactionViewModel$begin3ds2Auth$1 stripe3ds2TransactionViewModel$begin3ds2Auth$1;
        int i;
        Stripe3ds2TransactionViewModel$begin3ds2Auth$1 stripe3ds2TransactionViewModel$begin3ds2Auth$12;
        Object obj;
        int i2;
        StripeTransaction stripeTransaction;
        Stripe3ds2Fingerprint stripe3ds2Fingerprint2;
        Throwable m4120exceptionOrNullimpl;
        Object startFallback;
        if (continuationImpl instanceof Stripe3ds2TransactionViewModel$begin3ds2Auth$1) {
            stripe3ds2TransactionViewModel$begin3ds2Auth$1 = (Stripe3ds2TransactionViewModel$begin3ds2Auth$1) continuationImpl;
            int i3 = stripe3ds2TransactionViewModel$begin3ds2Auth$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                stripe3ds2TransactionViewModel$begin3ds2Auth$1.label = i3 - PKIFailureInfo.systemUnavail;
                Stripe3ds2TransactionViewModel$begin3ds2Auth$1 stripe3ds2TransactionViewModel$begin3ds2Auth$13 = stripe3ds2TransactionViewModel$begin3ds2Auth$1;
                Object obj2 = stripe3ds2TransactionViewModel$begin3ds2Auth$13.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripe3ds2TransactionViewModel$begin3ds2Auth$13.label;
                Stripe3ds2TransactionContract.Args args = this.args;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    SdkTransactionId sdkTransactionId = args.sdkTransactionId;
                    PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config = args.config;
                    String str = stripe3ds2Fingerprint.directoryServerEncryption.directoryServerId;
                    this.messageVersionRegistry.getClass();
                    args.stripeIntent.getClass();
                    String str2 = stripe3ds2Fingerprint.directoryServerName;
                    Stripe3ds2Fingerprint.DirectoryServerEncryption directoryServerEncryption = stripe3ds2Fingerprint.directoryServerEncryption;
                    ArrayList arrayList = directoryServerEncryption.rootCerts;
                    PublicKey publicKey = directoryServerEncryption.directoryServerPublicKey;
                    String str3 = directoryServerEncryption.keyId;
                    StripeUiCustomization stripeUiCustomization = stripe3ds2Config.uiCustomization.uiCustomization;
                    StripeThreeDs2ServiceImpl stripeThreeDs2ServiceImpl = this.threeDs2Service;
                    stripeThreeDs2ServiceImpl.getClass();
                    sdkTransactionId.getClass();
                    str.getClass();
                    str2.getClass();
                    publicKey.getClass();
                    stripeUiCustomization.getClass();
                    stripeThreeDs2ServiceImpl.messageVersionRegistry.getClass();
                    if (!CollectionsKt.contains(MessageVersionRegistry.SUPPORTED, "2.2.0")) {
                        throw new InvalidInputException("Message version is unsupported: ".concat("2.2.0"), null);
                    }
                    RealWebSocket$connect$1 realWebSocket$connect$1 = stripeThreeDs2ServiceImpl.transactionFactory;
                    POPMatchingFactory pOPMatchingFactory = Brand.Companion;
                    DefaultErrorReporter defaultErrorReporter = stripeThreeDs2ServiceImpl.errorReporter;
                    pOPMatchingFactory.getClass();
                    POPMatchingFactory.lookup$3ds2sdk_release(str2, defaultErrorReporter);
                    realWebSocket$connect$1.getClass();
                    StripeTransaction stripeTransaction2 = new StripeTransaction((zzai) realWebSocket$connect$1.this$0, str, publicKey, str3, sdkTransactionId, ((StripeEphemeralKeyPairGenerator) realWebSocket$connect$1.$request).generate());
                    int i4 = stripe3ds2Config.timeout;
                    stripe3ds2TransactionViewModel$begin3ds2Auth$13.L$0 = stripe3ds2Fingerprint;
                    stripe3ds2TransactionViewModel$begin3ds2Auth$13.L$1 = stripeTransaction2;
                    stripe3ds2TransactionViewModel$begin3ds2Auth$13.I$0 = i4;
                    stripe3ds2TransactionViewModel$begin3ds2Auth$13.label = 1;
                    Object m4058perform3ds2AuthenticationRequestyxL6bBk = m4058perform3ds2AuthenticationRequestyxL6bBk(stripeTransaction2, stripe3ds2Fingerprint, this.threeDS2RequestOptions, i4, stripe3ds2TransactionViewModel$begin3ds2Auth$13);
                    stripe3ds2TransactionViewModel$begin3ds2Auth$12 = stripe3ds2TransactionViewModel$begin3ds2Auth$13;
                    if (m4058perform3ds2AuthenticationRequestyxL6bBk != obj3) {
                        obj = m4058perform3ds2AuthenticationRequestyxL6bBk;
                        i2 = i4;
                        stripeTransaction = stripeTransaction2;
                        stripe3ds2Fingerprint2 = stripe3ds2Fingerprint;
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj2);
                        return (NextStep) obj2;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = stripe3ds2TransactionViewModel$begin3ds2Auth$13.I$0;
                StripeTransaction stripeTransaction3 = stripe3ds2TransactionViewModel$begin3ds2Auth$13.L$1;
                stripe3ds2Fingerprint2 = stripe3ds2TransactionViewModel$begin3ds2Auth$13.L$0;
                SafeTrace.throwOnFailure(obj2);
                obj = ((Result) obj2).value;
                i2 = i5;
                stripeTransaction = stripeTransaction3;
                stripe3ds2TransactionViewModel$begin3ds2Auth$12 = stripe3ds2TransactionViewModel$begin3ds2Auth$13;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
                if (m4120exceptionOrNullimpl == null) {
                    int i6 = StripeException.$r8$clinit;
                    return new NextStep.Complete(new PaymentFlowResult$Unvalidated((String) null, 0, SpanEvent.Account.create(m4120exceptionOrNullimpl), false, (String) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
                }
                Stripe3ds2AuthResult stripe3ds2AuthResult = (Stripe3ds2AuthResult) obj;
                String str4 = stripe3ds2Fingerprint2.source;
                stripe3ds2TransactionViewModel$begin3ds2Auth$12.L$0 = null;
                stripe3ds2TransactionViewModel$begin3ds2Auth$12.L$1 = null;
                stripe3ds2TransactionViewModel$begin3ds2Auth$12.I$0 = i2;
                stripe3ds2TransactionViewModel$begin3ds2Auth$12.label = 2;
                Stripe3ds2AuthResult.Ares ares = stripe3ds2AuthResult.ares;
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = this.analyticsRequestExecutor;
                if (ares == null) {
                    String str5 = stripe3ds2AuthResult.fallbackRedirectUrl;
                    if (str5 != null) {
                        defaultAnalyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Fallback, null, null, null, null, 62));
                        StripeIntent stripeIntent = args.stripeIntent;
                        String id = stripeIntent.getId();
                        String str6 = id == null ? "" : id;
                        List list = StripePaymentController.EXPAND_PAYMENT_METHOD;
                        int requestCode$payments_core_release = DatadogTracing.getRequestCode$payments_core_release(stripeIntent);
                        String clientSecret = stripeIntent.getClientSecret();
                        String str7 = clientSecret == null ? "" : clientSecret;
                        boolean z = args.enableLogging;
                        String str8 = args.requestOptions.stripeAccount;
                        Integer num = args.statusBarColor;
                        String str9 = this.threeDS2RequestOptions.apiKey;
                        StripeToolbarCustomization stripeToolbarCustomization = new StripeToolbarCustomization();
                        String string2 = this.context.getString(R.string.stripe_cancel);
                        string2.getClass();
                        if (StringsKt.isBlank(string2)) {
                            throw new InvalidInputException("String must not be null or empty", null);
                        }
                        stripeToolbarCustomization.mButtonText = string2;
                        startFallback = new NextStep.StartFallback(new PaymentBrowserAuthContract.Args(str6, requestCode$payments_core_release, str7, str5, null, z, stripeToolbarCustomization, str8, true, false, num, str9, this.isInstantApp, null, false, 25088));
                    } else {
                        Stripe3ds2AuthResult.ThreeDS2Error threeDS2Error = stripe3ds2AuthResult.error;
                        String joinToString$default = threeDS2Error != null ? CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{Recorder$$ExternalSyntheticOutline2.m("Code: ", threeDS2Error.errorCode), Recorder$$ExternalSyntheticOutline2.m("Detail: ", threeDS2Error.errorDetail), Recorder$$ExternalSyntheticOutline2.m("Description: ", threeDS2Error.errorDescription), Recorder$$ExternalSyntheticOutline2.m("Component: ", threeDS2Error.errorComponent)}), ", ", null, null, 0, null, null, 62) : "Invalid 3DS2 authentication response";
                        int i7 = StripeException.$r8$clinit;
                        obj2 = new NextStep.Complete(new PaymentFlowResult$Unvalidated((String) null, 0, SpanEvent.Account.create(new RuntimeException("Error encountered during 3DS2 authentication request. ".concat(joinToString$default))), false, (String) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
                    }
                } else if ("C".equals(ares.transStatus)) {
                    startFallback = JobKt.withContext(this.workContext, new BufferCountKt$bufferSkip$1(ares, stripeTransaction, i2, this, str4, null, 12), stripe3ds2TransactionViewModel$begin3ds2Auth$12);
                    if (startFallback != obj3) {
                        startFallback = (NextStep) startFallback;
                    }
                } else {
                    defaultAnalyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Frictionless, null, null, null, null, 62));
                    startFallback = new NextStep.Complete(new PaymentFlowResult$Unvalidated(args.stripeIntent.getClientSecret(), 0, (StripeException) null, false, (String) null, args.requestOptions.stripeAccount, 62));
                }
                obj2 = startFallback;
            }
        }
        stripe3ds2TransactionViewModel$begin3ds2Auth$1 = new Stripe3ds2TransactionViewModel$begin3ds2Auth$1(this, continuationImpl);
        Stripe3ds2TransactionViewModel$begin3ds2Auth$1 stripe3ds2TransactionViewModel$begin3ds2Auth$132 = stripe3ds2TransactionViewModel$begin3ds2Auth$1;
        Object obj22 = stripe3ds2TransactionViewModel$begin3ds2Auth$132.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripe3ds2TransactionViewModel$begin3ds2Auth$132.label;
        Stripe3ds2TransactionContract.Args args2 = this.args;
        if (i != 0) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
        if (m4120exceptionOrNullimpl == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: perform3ds2AuthenticationRequest-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4058perform3ds2AuthenticationRequestyxL6bBk(StripeTransaction stripeTransaction, Stripe3ds2Fingerprint stripe3ds2Fingerprint, ApiRequest.Options options, int i, ContinuationImpl continuationImpl) {
        Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1 stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1;
        int i2;
        if (continuationImpl instanceof Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1) {
            stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1 = (Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1) continuationImpl;
            int i3 = stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1.label = i3 - PKIFailureInfo.systemUnavail;
                Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1 stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$12 = stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1;
                Object obj = stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$12.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferCountKt$bufferSkip$1 bufferCountKt$bufferSkip$1 = new BufferCountKt$bufferSkip$1(stripeTransaction, stripe3ds2Fingerprint, i, this, options, null, 11);
                    stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$12.label = 1;
                    obj = JobKt.withContext(this.workContext, bufferCountKt$bufferSkip$1, stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ((Result) obj).value;
            }
        }
        stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1 = new Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1(this, continuationImpl);
        Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1 stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$122 = stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1;
        Object obj2 = stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$122.label;
        if (i2 != 0) {
        }
        return ((Result) obj2).value;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|28|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r0 = kotlin.Result.Companion;
        r14 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object start3ds2Flow(ContinuationImpl continuationImpl) {
        Stripe3ds2TransactionViewModel$start3ds2Flow$1 stripe3ds2TransactionViewModel$start3ds2Flow$1;
        int i;
        Throwable m4120exceptionOrNullimpl;
        if (continuationImpl instanceof Stripe3ds2TransactionViewModel$start3ds2Flow$1) {
            stripe3ds2TransactionViewModel$start3ds2Flow$1 = (Stripe3ds2TransactionViewModel$start3ds2Flow$1) continuationImpl;
            int i2 = stripe3ds2TransactionViewModel$start3ds2Flow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripe3ds2TransactionViewModel$start3ds2Flow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripe3ds2TransactionViewModel$start3ds2Flow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripe3ds2TransactionViewModel$start3ds2Flow$1.label;
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = this.analyticsRequestExecutor;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    defaultAnalyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Fingerprint, null, null, null, null, 62));
                    Result.Companion companion = Result.Companion;
                    Stripe3ds2Fingerprint stripe3ds2Fingerprint = new Stripe3ds2Fingerprint(this.args.nextActionData);
                    stripe3ds2TransactionViewModel$start3ds2Flow$1.label = 1;
                    obj = begin3ds2Auth(stripe3ds2Fingerprint, stripe3ds2TransactionViewModel$start3ds2Flow$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Object failure = (NextStep) obj;
                Result.Companion companion2 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    defaultAnalyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2RequestParamsFailed, null, null, null, null, 62));
                    int i3 = StripeException.$r8$clinit;
                    failure = new NextStep.Complete(new PaymentFlowResult$Unvalidated((String) null, 0, SpanEvent.Account.create(m4120exceptionOrNullimpl), false, (String) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
                }
                this.savedStateHandle.set(Boolean.TRUE, "key_next_step");
                this.hasCompleted = true;
                return failure;
            }
        }
        stripe3ds2TransactionViewModel$start3ds2Flow$1 = new Stripe3ds2TransactionViewModel$start3ds2Flow$1(this, continuationImpl);
        Object obj3 = stripe3ds2TransactionViewModel$start3ds2Flow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripe3ds2TransactionViewModel$start3ds2Flow$1.label;
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor2 = this.analyticsRequestExecutor;
        if (i != 0) {
        }
        Object failure2 = (NextStep) obj3;
        Result.Companion companion22 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
        if (m4120exceptionOrNullimpl != null) {
        }
        this.savedStateHandle.set(Boolean.TRUE, "key_next_step");
        this.hasCompleted = true;
        return failure2;
    }
}
