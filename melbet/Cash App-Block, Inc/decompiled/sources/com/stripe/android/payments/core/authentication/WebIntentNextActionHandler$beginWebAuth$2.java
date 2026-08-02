package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.ActivityHost;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class WebIntentNextActionHandler$beginWebAuth$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $authUrl;
    public final /* synthetic */ String $clientSecret;
    public final /* synthetic */ boolean $forceInAppWebView;
    public final /* synthetic */ ActivityHost $host;
    public final /* synthetic */ String $referrer;
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ String $returnUrl;
    public final /* synthetic */ boolean $shouldCancelIntentOnUserNavigation;
    public final /* synthetic */ String $stripeAccount;
    public final /* synthetic */ StripeIntent $stripeIntent;
    public final /* synthetic */ WebIntentNextActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebIntentNextActionHandler$beginWebAuth$2(WebIntentNextActionHandler webIntentNextActionHandler, ActivityHost activityHost, StripeIntent stripeIntent, int i, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webIntentNextActionHandler;
        this.$host = activityHost;
        this.$stripeIntent = stripeIntent;
        this.$requestCode = i;
        this.$clientSecret = str;
        this.$authUrl = str2;
        this.$returnUrl = str3;
        this.$stripeAccount = str4;
        this.$shouldCancelIntentOnUserNavigation = z;
        this.$referrer = str5;
        this.$forceInAppWebView = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebIntentNextActionHandler$beginWebAuth$2(this.this$0, this.$host, this.$stripeIntent, this.$requestCode, this.$clientSecret, this.$authUrl, this.$returnUrl, this.$stripeAccount, this.$shouldCancelIntentOnUserNavigation, this.$referrer, this.$forceInAppWebView, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WebIntentNextActionHandler$beginWebAuth$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        WebIntentNextActionHandler webIntentNextActionHandler = this.this$0;
        Function1 function1 = webIntentNextActionHandler.paymentBrowserAuthStarterFactory;
        ActivityHost activityHost = this.$host;
        PaymentBrowserAuthStarter paymentBrowserAuthStarter = (PaymentBrowserAuthStarter) function1.invoke(activityHost);
        String id = this.$stripeIntent.getId();
        if (id == null) {
            id = "";
        }
        paymentBrowserAuthStarter.start(new PaymentBrowserAuthContract.Args(id, this.$requestCode, this.$clientSecret, this.$authUrl, this.$returnUrl, webIntentNextActionHandler.enableLogging, null, this.$stripeAccount, false, this.$shouldCancelIntentOnUserNavigation, activityHost.statusBarColor, (String) webIntentNextActionHandler.publishableKeyProvider.invoke(), webIntentNextActionHandler.isInstantApp, this.$referrer, this.$forceInAppWebView, 64));
        return Unit.INSTANCE;
    }
}
