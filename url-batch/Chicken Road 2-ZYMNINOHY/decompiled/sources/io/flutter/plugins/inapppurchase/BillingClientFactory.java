package io.flutter.plugins.inapppurchase;

import E1.AbstractC0028d;
import android.content.Context;

/* loaded from: classes.dex */
interface BillingClientFactory {
    AbstractC0028d createBillingClient(Context context, InAppPurchaseCallbackApi inAppPurchaseCallbackApi, PlatformBillingChoiceMode platformBillingChoiceMode, PlatformPendingPurchasesParams platformPendingPurchasesParams);
}
