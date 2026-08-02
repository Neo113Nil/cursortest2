package com.stripe.android.payments.core.authentication;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.PaymentRelayContract;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.ActivityResultLauncherHost;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$register$1;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;

/* loaded from: classes8.dex */
public final class DefaultPaymentNextActionHandlerRegistry implements ActivityResultLauncherHost {
    public final boolean includePaymentSheetNextActionHandlers;
    public final NoOpIntentNextActionHandler noOpIntentNextActionHandler;
    public ActivityResultLauncher paymentBrowserAuthLauncher;
    public final Map paymentNextActionHandlers;
    public ActivityResultLauncher paymentRelayLauncher;
    public final Lazy paymentSheetNextActionHandlers$delegate;

    public DefaultPaymentNextActionHandlerRegistry(NoOpIntentNextActionHandler noOpIntentNextActionHandler, Map map, boolean z, Context context) {
        noOpIntentNextActionHandler.getClass();
        map.getClass();
        context.getClass();
        this.noOpIntentNextActionHandler = noOpIntentNextActionHandler;
        this.paymentNextActionHandlers = map;
        this.includePaymentSheetNextActionHandlers = z;
        this.paymentSheetNextActionHandlers$delegate = LazyKt.lazy(new StateFlowsKt$$ExternalSyntheticLambda2(4, this, context));
    }

    public final SetBuilder getAllNextActionHandlers$payments_core_release() {
        SetBuilder setBuilder = new SetBuilder();
        setBuilder.add(this.noOpIntentNextActionHandler);
        setBuilder.addAll(this.paymentNextActionHandlers.values());
        setBuilder.addAll(((Map) this.paymentSheetNextActionHandlers$delegate.getValue()).values());
        return SetsKt__SetsJVMKt.build(setBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.stripe.android.payments.core.authentication.PaymentNextActionHandler] */
    public final PaymentNextActionHandler getNextActionHandler(Object obj) {
        String obj2;
        ?? r2;
        if (!(obj instanceof StripeIntent)) {
            obj2 = ("No suitable PaymentNextActionHandler for " + obj).toString();
            a$$ExternalSyntheticBUOutline0.m$1(obj2);
            return null;
        }
        StripeIntent stripeIntent = (StripeIntent) obj;
        boolean requiresAction = stripeIntent.requiresAction();
        NoOpIntentNextActionHandler noOpIntentNextActionHandler = this.noOpIntentNextActionHandler;
        if (!requiresAction) {
            noOpIntentNextActionHandler.getClass();
            return noOpIntentNextActionHandler;
        }
        LinkedHashMap plus = MapsKt__MapsKt.plus(this.paymentNextActionHandlers, (Map) this.paymentSheetNextActionHandlers$delegate.getValue());
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        if (nextActionData != null && (r2 = (PaymentNextActionHandler) plus.get(nextActionData.getClass())) != 0) {
            noOpIntentNextActionHandler = r2;
        }
        noOpIntentNextActionHandler.getClass();
        return noOpIntentNextActionHandler;
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public final void onLauncherInvalidated() {
        Object it = getAllNextActionHandlers$payments_core_release().iterator();
        while (((MapBuilder.Itr) it).hasNext()) {
            ((PaymentNextActionHandler) ((MapBuilder.KeysItr) it).next()).onLauncherInvalidated();
        }
        ActivityResultLauncher activityResultLauncher = this.paymentRelayLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        ActivityResultLauncher activityResultLauncher2 = this.paymentBrowserAuthLauncher;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        this.paymentRelayLauncher = null;
        this.paymentBrowserAuthLauncher = null;
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public final void onNewActivityResultCaller(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity, PaymentLauncherViewModel$register$1 paymentLauncherViewModel$register$1) {
        Object it = getAllNextActionHandlers$payments_core_release().iterator();
        while (((MapBuilder.Itr) it).hasNext()) {
            ((PaymentNextActionHandler) ((MapBuilder.KeysItr) it).next()).onNewActivityResultCaller(paymentLauncherConfirmationActivity, paymentLauncherViewModel$register$1);
        }
        this.paymentRelayLauncher = paymentLauncherConfirmationActivity.registerForActivityResult(new PaymentRelayContract(), paymentLauncherViewModel$register$1);
        this.paymentBrowserAuthLauncher = paymentLauncherConfirmationActivity.registerForActivityResult(new PaymentBrowserAuthContract(), paymentLauncherViewModel$register$1);
    }
}
