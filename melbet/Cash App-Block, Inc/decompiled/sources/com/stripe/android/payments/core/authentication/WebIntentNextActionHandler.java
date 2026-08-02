package com.stripe.android.payments.core.authentication;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.DatadogTracing;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.kotterknife.Lazy;
import com.stripe.android.StripePaymentController;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.view.ActivityHost;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import net.idrnd.face.iad.capture.internal.y0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class WebIntentNextActionHandler extends PaymentNextActionHandler {
    public final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    public final DefaultReturnUrl defaultReturnUrl;
    public final boolean enableLogging;
    public final boolean isInstantApp;
    public final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    public final Function1 paymentBrowserAuthStarterFactory;
    public final Function0 publishableKeyProvider;
    public final Lazy redirectResolver;
    public final CoroutineContext uiContext;

    public WebIntentNextActionHandler(Function1 function1, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z, CoroutineContext coroutineContext, Function0 function0, boolean z2, DefaultReturnUrl defaultReturnUrl, Lazy lazy) {
        function1.getClass();
        defaultAnalyticsRequestExecutor.getClass();
        paymentAnalyticsRequestFactory.getClass();
        coroutineContext.getClass();
        function0.getClass();
        defaultReturnUrl.getClass();
        lazy.getClass();
        this.paymentBrowserAuthStarterFactory = function1;
        this.analyticsRequestExecutor = defaultAnalyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.enableLogging = z;
        this.uiContext = coroutineContext;
        this.publishableKeyProvider = function0;
        this.isInstantApp = z2;
        this.defaultReturnUrl = defaultReturnUrl;
        this.redirectResolver = lazy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x013a, code lost:
    
        if (r0 == r14) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013c, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2 == r14) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performNextActionOnResumed(ActivityHost activityHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        WebIntentNextActionHandler$performNextActionOnResumed$1 webIntentNextActionHandler$performNextActionOnResumed$1;
        Object obj;
        int i;
        ActivityHost activityHost2;
        ApiRequest.Options options2;
        WebAuthParams webAuthParams;
        String clientSecret;
        Object withContext;
        StripeIntent stripeIntent2 = stripeIntent;
        if (continuation instanceof WebIntentNextActionHandler$performNextActionOnResumed$1) {
            webIntentNextActionHandler$performNextActionOnResumed$1 = (WebIntentNextActionHandler$performNextActionOnResumed$1) continuation;
            int i2 = webIntentNextActionHandler$performNextActionOnResumed$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                webIntentNextActionHandler$performNextActionOnResumed$1.label = i2 - PKIFailureInfo.systemUnavail;
                WebIntentNextActionHandler$performNextActionOnResumed$1 webIntentNextActionHandler$performNextActionOnResumed$12 = webIntentNextActionHandler$performNextActionOnResumed$1;
                Object obj2 = webIntentNextActionHandler$performNextActionOnResumed$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webIntentNextActionHandler$performNextActionOnResumed$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Parcelable nextActionData = stripeIntent2.getNextActionData();
                    if (nextActionData instanceof StripeIntent.NextActionData.RedirectToUrl) {
                        activityHost2 = activityHost;
                        webIntentNextActionHandler$performNextActionOnResumed$12.L$0 = activityHost2;
                        webIntentNextActionHandler$performNextActionOnResumed$12.L$1 = stripeIntent2;
                        options2 = options;
                        webIntentNextActionHandler$performNextActionOnResumed$12.L$2 = options2;
                        webIntentNextActionHandler$performNextActionOnResumed$12.label = 1;
                        obj2 = webAuthParams((StripeIntent.NextActionData.RedirectToUrl) nextActionData, stripeIntent2, webIntentNextActionHandler$performNextActionOnResumed$12);
                    } else {
                        activityHost2 = activityHost;
                        options2 = options;
                        if (nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) {
                            StripeIntent.NextActionData.AlipayRedirect alipayRedirect = (StripeIntent.NextActionData.AlipayRedirect) nextActionData;
                            this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthRedirect, null, null, null, null, 62));
                            String uri = alipayRedirect.webViewUrl.toString();
                            uri.getClass();
                            webAuthParams = new WebAuthParams(uri, alipayRedirect.returnUrl, null, 60);
                        } else if (nextActionData instanceof StripeIntent.NextActionData.DisplayVoucherDetails) {
                            String hostedVoucherUrl = ((StripeIntent.NextActionData.DisplayVoucherDetails) nextActionData).getHostedVoucherUrl();
                            hostedVoucherUrl.getClass();
                            if (hostedVoucherUrl.length() <= 0) {
                                hostedVoucherUrl = null;
                            }
                            if (hostedVoucherUrl == null) {
                                StripeIntent.NextActionType nextActionType = stripeIntent2.getNextActionType();
                                throw new IllegalArgumentException(Recorder$$ExternalSyntheticOutline2.m("null hostedVoucherUrl for ", nextActionType != null ? nextActionType.code : null));
                            }
                            webAuthParams = new WebAuthParams(hostedVoucherUrl, null, null, 52);
                        } else {
                            boolean z = nextActionData instanceof StripeIntent.NextActionData.CashAppRedirect;
                            DefaultReturnUrl defaultReturnUrl = this.defaultReturnUrl;
                            if (z) {
                                webAuthParams = new WebAuthParams(((StripeIntent.NextActionData.CashAppRedirect) nextActionData).mobileAuthUrl, defaultReturnUrl.getValue(), null, 52);
                            } else {
                                if (!(nextActionData instanceof StripeIntent.NextActionData.SwishRedirect)) {
                                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) nextActionData, "WebAuthenticator can't process nextActionData: ");
                                    return null;
                                }
                                webAuthParams = new WebAuthParams(((StripeIntent.NextActionData.SwishRedirect) nextActionData).mobileAuthUrl, defaultReturnUrl.getValue(), null, 52);
                            }
                        }
                        ActivityHost activityHost3 = activityHost2;
                        StripeIntent stripeIntent3 = stripeIntent2;
                        List list = StripePaymentController.EXPAND_PAYMENT_METHOD;
                        int requestCode$payments_core_release = DatadogTracing.getRequestCode$payments_core_release(stripeIntent3);
                        clientSecret = stripeIntent3.getClientSecret();
                        if (clientSecret == null) {
                            clientSecret = "";
                        }
                        String str = webAuthParams.authUrl;
                        String str2 = options2.stripeAccount;
                        String str3 = webAuthParams.returnUrl;
                        boolean z2 = webAuthParams.shouldCancelIntentOnUserNavigation;
                        String str4 = webAuthParams.referrer;
                        boolean z3 = webAuthParams.forceInAppWebView;
                        webIntentNextActionHandler$performNextActionOnResumed$12.L$0 = null;
                        webIntentNextActionHandler$performNextActionOnResumed$12.L$1 = null;
                        webIntentNextActionHandler$performNextActionOnResumed$12.L$2 = null;
                        webIntentNextActionHandler$performNextActionOnResumed$12.label = 2;
                        withContext = JobKt.withContext(this.uiContext, new WebIntentNextActionHandler$beginWebAuth$2(this, activityHost3, stripeIntent3, requestCode$payments_core_release, clientSecret, str, str3, str2, z2, str4, z3, null), webIntentNextActionHandler$performNextActionOnResumed$12);
                        if (withContext != obj) {
                            withContext = Unit.INSTANCE;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ApiRequest.Options options3 = webIntentNextActionHandler$performNextActionOnResumed$12.L$2;
                    StripeIntent stripeIntent4 = webIntentNextActionHandler$performNextActionOnResumed$12.L$1;
                    ActivityHost activityHost4 = webIntentNextActionHandler$performNextActionOnResumed$12.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    options2 = options3;
                    stripeIntent2 = stripeIntent4;
                    activityHost2 = activityHost4;
                }
                webAuthParams = (WebAuthParams) obj2;
                ActivityHost activityHost32 = activityHost2;
                StripeIntent stripeIntent32 = stripeIntent2;
                List list2 = StripePaymentController.EXPAND_PAYMENT_METHOD;
                int requestCode$payments_core_release2 = DatadogTracing.getRequestCode$payments_core_release(stripeIntent32);
                clientSecret = stripeIntent32.getClientSecret();
                if (clientSecret == null) {
                }
                String str5 = webAuthParams.authUrl;
                String str22 = options2.stripeAccount;
                String str32 = webAuthParams.returnUrl;
                boolean z22 = webAuthParams.shouldCancelIntentOnUserNavigation;
                String str42 = webAuthParams.referrer;
                boolean z32 = webAuthParams.forceInAppWebView;
                webIntentNextActionHandler$performNextActionOnResumed$12.L$0 = null;
                webIntentNextActionHandler$performNextActionOnResumed$12.L$1 = null;
                webIntentNextActionHandler$performNextActionOnResumed$12.L$2 = null;
                webIntentNextActionHandler$performNextActionOnResumed$12.label = 2;
                withContext = JobKt.withContext(this.uiContext, new WebIntentNextActionHandler$beginWebAuth$2(this, activityHost32, stripeIntent32, requestCode$payments_core_release2, clientSecret, str5, str32, str22, z22, str42, z32, null), webIntentNextActionHandler$performNextActionOnResumed$12);
                if (withContext != obj) {
                }
            }
        }
        webIntentNextActionHandler$performNextActionOnResumed$1 = new WebIntentNextActionHandler$performNextActionOnResumed$1(this, (ContinuationImpl) continuation);
        WebIntentNextActionHandler$performNextActionOnResumed$1 webIntentNextActionHandler$performNextActionOnResumed$122 = webIntentNextActionHandler$performNextActionOnResumed$1;
        Object obj22 = webIntentNextActionHandler$performNextActionOnResumed$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webIntentNextActionHandler$performNextActionOnResumed$122.label;
        if (i != 0) {
        }
        webAuthParams = (WebAuthParams) obj22;
        ActivityHost activityHost322 = activityHost2;
        StripeIntent stripeIntent322 = stripeIntent2;
        List list22 = StripePaymentController.EXPAND_PAYMENT_METHOD;
        int requestCode$payments_core_release22 = DatadogTracing.getRequestCode$payments_core_release(stripeIntent322);
        clientSecret = stripeIntent322.getClientSecret();
        if (clientSecret == null) {
        }
        String str52 = webAuthParams.authUrl;
        String str222 = options2.stripeAccount;
        String str322 = webAuthParams.returnUrl;
        boolean z222 = webAuthParams.shouldCancelIntentOnUserNavigation;
        String str422 = webAuthParams.referrer;
        boolean z322 = webAuthParams.forceInAppWebView;
        webIntentNextActionHandler$performNextActionOnResumed$122.L$0 = null;
        webIntentNextActionHandler$performNextActionOnResumed$122.L$1 = null;
        webIntentNextActionHandler$performNextActionOnResumed$122.L$2 = null;
        webIntentNextActionHandler$performNextActionOnResumed$122.label = 2;
        withContext = JobKt.withContext(this.uiContext, new WebIntentNextActionHandler$beginWebAuth$2(this, activityHost322, stripeIntent322, requestCode$payments_core_release22, clientSecret, str52, str322, str222, z222, str422, z322, null), webIntentNextActionHandler$performNextActionOnResumed$122);
        if (withContext != obj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object webAuthParams(StripeIntent.NextActionData.RedirectToUrl redirectToUrl, StripeIntent stripeIntent, ContinuationImpl continuationImpl) {
        WebIntentNextActionHandler$webAuthParams$1 webIntentNextActionHandler$webAuthParams$1;
        int i;
        String uri;
        StripeIntent.NextActionData.RedirectToUrl redirectToUrl2;
        StripeIntent.NextActionData.RedirectToUrl redirectToUrl3;
        if (continuationImpl instanceof WebIntentNextActionHandler$webAuthParams$1) {
            webIntentNextActionHandler$webAuthParams$1 = (WebIntentNextActionHandler$webAuthParams$1) continuationImpl;
            int i2 = webIntentNextActionHandler$webAuthParams$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                webIntentNextActionHandler$webAuthParams$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = webIntentNextActionHandler$webAuthParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webIntentNextActionHandler$webAuthParams$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthRedirect, null, null, null, null, 62));
                    PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
                    String str = paymentMethod != null ? paymentMethod.code : null;
                    y0 y0Var = PaymentMethod.Type.Companion;
                    boolean areEqual = Intrinsics.areEqual(str, "wechat_pay");
                    int i3 = 21;
                    Lazy lazy = this.redirectResolver;
                    if (areEqual) {
                        String uri2 = redirectToUrl.url.toString();
                        uri2.getClass();
                        webIntentNextActionHandler$webAuthParams$1.L$0 = redirectToUrl;
                        webIntentNextActionHandler$webAuthParams$1.label = 1;
                        obj = JobKt.withContext((CoroutineContext) lazy.value, new Logger$_log$2(uri2, lazy, continuation, i3), webIntentNextActionHandler$webAuthParams$1);
                        if (obj != coroutineSingletons) {
                            redirectToUrl3 = redirectToUrl;
                            return new WebAuthParams((String) obj, redirectToUrl3.returnUrl, redirectToUrl3.url.toString(), 4);
                        }
                    } else {
                        uri = redirectToUrl.url.toString();
                        uri.getClass();
                        if (StringsKt.contains((CharSequence) uri, (CharSequence) "followRedirectsInSDK=true", false)) {
                            webIntentNextActionHandler$webAuthParams$1.L$0 = redirectToUrl;
                            webIntentNextActionHandler$webAuthParams$1.label = 2;
                            obj = JobKt.withContext((CoroutineContext) lazy.value, new Logger$_log$2(uri, lazy, continuation, i3), webIntentNextActionHandler$webAuthParams$1);
                            if (obj != coroutineSingletons) {
                                redirectToUrl2 = redirectToUrl;
                                uri = (String) obj;
                            }
                        } else {
                            redirectToUrl2 = redirectToUrl;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    redirectToUrl3 = webIntentNextActionHandler$webAuthParams$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    return new WebAuthParams((String) obj, redirectToUrl3.returnUrl, redirectToUrl3.url.toString(), 4);
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                redirectToUrl2 = webIntentNextActionHandler$webAuthParams$1.L$0;
                SafeTrace.throwOnFailure(obj);
                uri = (String) obj;
                return new WebAuthParams(uri, redirectToUrl2.returnUrl, null, 60);
            }
        }
        webIntentNextActionHandler$webAuthParams$1 = new WebIntentNextActionHandler$webAuthParams$1(this, continuationImpl);
        Object obj2 = webIntentNextActionHandler$webAuthParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webIntentNextActionHandler$webAuthParams$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return new WebAuthParams(uri, redirectToUrl2.returnUrl, null, 60);
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public final /* bridge */ /* synthetic */ Object performNextActionOnResumed(ActivityHost activityHost, Object obj, ApiRequest.Options options, PaymentNextActionHandler$performNextAction$1 paymentNextActionHandler$performNextAction$1) {
        return performNextActionOnResumed(activityHost, (StripeIntent) obj, options, (Continuation) paymentNextActionHandler$performNextAction$1);
    }
}
