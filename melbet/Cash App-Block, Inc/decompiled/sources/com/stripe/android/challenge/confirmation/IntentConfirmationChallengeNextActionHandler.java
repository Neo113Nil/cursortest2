package com.stripe.android.challenge.confirmation;

import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.activity.result.ActivityResultLauncher;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler$performNextAction$1;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$register$1;
import com.stripe.android.view.ActivityHost;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;

/* loaded from: classes8.dex */
public final class IntentConfirmationChallengeNextActionHandler extends PaymentNextActionHandler {
    public ActivityResultLauncher intentConfirmationChallengeActivityContractNextActionLauncher;
    public final AlertBannerKt$$ExternalSyntheticLambda3 intentConfirmationChallengeNextActionStarterFactory;
    public final Set productUsageTokens;
    public final Function0 publishableKeyProvider;
    public final CoroutineContext uiContext;

    public IntentConfirmationChallengeNextActionHandler(Function0 function0, Set set, CoroutineContext coroutineContext) {
        function0.getClass();
        set.getClass();
        coroutineContext.getClass();
        this.publishableKeyProvider = function0;
        this.productUsageTokens = set;
        this.uiContext = coroutineContext;
        this.intentConfirmationChallengeNextActionStarterFactory = new AlertBannerKt$$ExternalSyntheticLambda3(this, 27);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public final void onNewActivityResultCaller(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity, PaymentLauncherViewModel$register$1 paymentLauncherViewModel$register$1) {
        this.intentConfirmationChallengeActivityContractNextActionLauncher = paymentLauncherConfirmationActivity.registerForActivityResult(new IntentConfirmationChallengeActivityContract(), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(paymentLauncherViewModel$register$1, 6));
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public final Object performNextActionOnResumed(ActivityHost activityHost, Object obj, ApiRequest.Options options, PaymentNextActionHandler$performNextAction$1 paymentNextActionHandler$performNextAction$1) {
        Object withContext = JobKt.withContext(this.uiContext, new Logger$_log$2(this, activityHost, (StripeIntent) obj, null, 13), paymentNextActionHandler$performNextAction$1);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }
}
