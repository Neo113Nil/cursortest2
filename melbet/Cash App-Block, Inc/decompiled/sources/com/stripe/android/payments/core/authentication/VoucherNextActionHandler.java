package com.stripe.android.payments.core.authentication;

import android.content.Context;
import android.os.Parcelable;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter$UnexpectedErrorEvent;
import com.stripe.android.view.ActivityHost;
import dagger.internal.Preconditions;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final class VoucherNextActionHandler extends PaymentNextActionHandler {
    public final Context context;
    public final NoOpIntentNextActionHandler noOpIntentAuthenticator;
    public final WebIntentNextActionHandler webIntentAuthenticator;

    public VoucherNextActionHandler(WebIntentNextActionHandler webIntentNextActionHandler, NoOpIntentNextActionHandler noOpIntentNextActionHandler, Context context) {
        webIntentNextActionHandler.getClass();
        noOpIntentNextActionHandler.getClass();
        context.getClass();
        this.webIntentAuthenticator = webIntentNextActionHandler;
        this.noOpIntentAuthenticator = noOpIntentNextActionHandler;
        this.context = context;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public final Object performNextActionOnResumed(ActivityHost activityHost, Object obj, ApiRequest.Options options, PaymentNextActionHandler$performNextAction$1 paymentNextActionHandler$performNextAction$1) {
        StripeIntent stripeIntent = (StripeIntent) obj;
        Parcelable nextActionData = stripeIntent.getNextActionData();
        nextActionData.getClass();
        if (((StripeIntent.NextActionData.DisplayVoucherDetails) nextActionData).getHostedVoucherUrl() != null) {
            Object performNextAction = this.webIntentAuthenticator.performNextAction(activityHost, stripeIntent, options, paymentNextActionHandler$performNextAction$1);
            return performNextAction == CoroutineSingletons.COROUTINE_SUSPENDED ? performNextAction : Unit.INSTANCE;
        }
        EmptySet emptySet = EmptySet.INSTANCE;
        Context context = this.context;
        context.getClass();
        emptySet.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
        Preconditions.checkNotNullFromProvides(defaultIoScheduler);
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor(Logger$Companion.NOOP_LOGGER, defaultIoScheduler);
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(applicationContext, new CameraX$$ExternalSyntheticLambda0(applicationContext, 14), emptySet);
        ErrorReporter$UnexpectedErrorEvent errorReporter$UnexpectedErrorEvent = ErrorReporter$UnexpectedErrorEvent.MISSING_HOSTED_VOUCHER_URL;
        StripeIntent.NextActionType nextActionType = stripeIntent.getNextActionType();
        Map m = Thread$State$EnumUnboxingLocalUtility.m("next_action_type", nextActionType != null ? nextActionType.code : "");
        if ((2 & 4) != 0) {
            m = EmptyMap.INSTANCE;
            m.getClass();
        }
        m.getClass();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        defaultAnalyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.createRequest(errorReporter$UnexpectedErrorEvent, MapsKt__MapsKt.plus(emptyMap, m)));
        Object performNextAction2 = this.noOpIntentAuthenticator.performNextAction(activityHost, stripeIntent, options, paymentNextActionHandler$performNextAction$1);
        return performNextAction2 == CoroutineSingletons.COROUTINE_SUSPENDED ? performNextAction2 : Unit.INSTANCE;
    }
}
