package com.stripe.android.payments.core.authentication.threeds2;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler$performNextAction$1;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$register$1;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.view.ActivityHost;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final class Stripe3DS2NextActionHandler extends PaymentNextActionHandler {
    public final PaymentAuthConfig config;
    public final boolean enableLogging;
    public final Set productUsage;
    public final Function0 publishableKeyProvider;
    public ActivityResultLauncher stripe3ds2CompletionLauncher;
    public final HCaptcha$$ExternalSyntheticLambda2 stripe3ds2CompletionStarterFactory;

    public Stripe3DS2NextActionHandler(PaymentAuthConfig paymentAuthConfig, boolean z, Function0 function0, Set set) {
        paymentAuthConfig.getClass();
        function0.getClass();
        set.getClass();
        this.config = paymentAuthConfig;
        this.enableLogging = z;
        this.publishableKeyProvider = function0;
        this.productUsage = set;
        this.stripe3ds2CompletionStarterFactory = new HCaptcha$$ExternalSyntheticLambda2(this, 3);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public final void onLauncherInvalidated() {
        ActivityResultLauncher activityResultLauncher = this.stripe3ds2CompletionLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.stripe3ds2CompletionLauncher = null;
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public final void onNewActivityResultCaller(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity, PaymentLauncherViewModel$register$1 paymentLauncherViewModel$register$1) {
        this.stripe3ds2CompletionLauncher = paymentLauncherConfirmationActivity.registerForActivityResult(new Stripe3ds2TransactionContract(), paymentLauncherViewModel$register$1);
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public final Object performNextActionOnResumed(ActivityHost activityHost, Object obj, ApiRequest.Options options, PaymentNextActionHandler$performNextAction$1 paymentNextActionHandler$performNextAction$1) {
        StripeIntent stripeIntent = (StripeIntent) obj;
        Stripe3ds2TransactionStarter stripe3ds2TransactionStarter = (Stripe3ds2TransactionStarter) this.stripe3ds2CompletionStarterFactory.invoke(activityHost);
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        SdkTransactionId sdkTransactionId = new SdkTransactionId(randomUUID);
        PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config = this.config.stripe3ds2Config;
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        nextActionData.getClass();
        stripe3ds2TransactionStarter.start(new Stripe3ds2TransactionContract.Args(sdkTransactionId, stripe3ds2Config, stripeIntent, (StripeIntent.NextActionData.SdkData.Use3DS2) nextActionData, options, this.enableLogging, activityHost.statusBarColor, (String) this.publishableKeyProvider.invoke(), this.productUsage));
        return Unit.INSTANCE;
    }
}
