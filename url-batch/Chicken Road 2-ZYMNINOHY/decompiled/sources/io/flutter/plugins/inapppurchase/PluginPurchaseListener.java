package io.flutter.plugins.inapppurchase;

import E1.C0037m;
import E1.InterfaceC0047x;
import c3.C0297i;
import com.android.billingclient.api.Purchase;
import io.flutter.Log;
import java.util.List;

/* loaded from: classes.dex */
class PluginPurchaseListener implements InterfaceC0047x {
    private final InAppPurchaseCallbackApi callbackApi;

    public PluginPurchaseListener(InAppPurchaseCallbackApi inAppPurchaseCallbackApi) {
        this.callbackApi = inAppPurchaseCallbackApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C0297i lambda$onPurchasesUpdated$0(ResultCompat resultCompat) {
        Throwable exceptionOrNull = resultCompat.exceptionOrNull();
        if (exceptionOrNull != null) {
            Log.e("IN_APP_PURCHASE", "onPurchaseUpdated handler error: " + exceptionOrNull);
        }
        return C0297i.f5732a;
    }

    @Override // E1.InterfaceC0047x
    public void onPurchasesUpdated(C0037m c0037m, List<Purchase> list) {
        this.callbackApi.onPurchasesUpdated(new PlatformPurchasesResponse(TranslatorKt.fromBillingResult(c0037m), TranslatorKt.fromPurchasesList(list)), ResultCompat.asCompatCallback(new a(2)));
    }
}
