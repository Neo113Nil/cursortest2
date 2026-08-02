package io.flutter.plugins.inapppurchase;

import C3.v;
import E1.A;
import E1.AbstractC0028d;
import E1.C0026b;
import E1.C0029e;
import E1.C0031g;
import E1.C0032h;
import E1.C0033i;
import E1.C0034j;
import E1.C0035k;
import E1.C0037m;
import E1.C0042s;
import E1.C0043t;
import E1.C0048y;
import E1.G;
import E1.InterfaceC0030f;
import E1.U;
import E1.W;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import c3.C0297i;
import com.google.android.gms.internal.play_billing.AbstractC0346t;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.l1;
import io.flutter.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
class MethodCallHandlerImpl implements Application.ActivityLifecycleCallbacks, InAppPurchaseApi {
    static final String ACTIVITY_UNAVAILABLE = "ACTIVITY_UNAVAILABLE";
    private static final String LOAD_PRODUCT_DOC_URL = "https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale";
    static final PlatformReplacementMode REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = PlatformReplacementMode.UNKNOWN_REPLACEMENT_MODE;
    private static final String TAG = "InAppPurchasePlugin";
    private Activity activity;
    private final Context applicationContext;
    private AbstractC0028d billingClient;
    private final BillingClientFactory billingClientFactory;
    private final HashMap<String, C0043t> cachedProducts = new HashMap<>();
    final InAppPurchaseCallbackApi callbackApi;

    /* renamed from: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$1, reason: invalid class name */
    public class AnonymousClass1 implements InterfaceC0030f {
        private boolean alreadyFinished = false;
        final /* synthetic */ InterfaceC1339l val$callback;
        final /* synthetic */ long val$handle;

        public AnonymousClass1(InterfaceC1339l interfaceC1339l, long j4) {
            this.val$callback = interfaceC1339l;
            this.val$handle = j4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C0297i lambda$onBillingServiceDisconnected$0(ResultCompat resultCompat) {
            Throwable exceptionOrNull = resultCompat.exceptionOrNull();
            if (exceptionOrNull != null) {
                Log.e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + exceptionOrNull);
            }
            return C0297i.f5732a;
        }

        @Override // E1.InterfaceC0030f
        public void onBillingServiceDisconnected() {
            MethodCallHandlerImpl.this.callbackApi.onBillingServiceDisconnected(this.val$handle, ResultCompat.asCompatCallback(new a(1)));
        }

        @Override // E1.InterfaceC0030f
        public void onBillingSetupFinished(C0037m c0037m) {
            if (this.alreadyFinished) {
                android.util.Log.d(MethodCallHandlerImpl.TAG, "Tried to call onBillingSetupFinished multiple times.");
            } else {
                this.alreadyFinished = true;
                ResultCompat.success(TranslatorKt.fromBillingResult(c0037m), this.val$callback);
            }
        }
    }

    public MethodCallHandlerImpl(Activity activity, Context context, InAppPurchaseCallbackApi inAppPurchaseCallbackApi, BillingClientFactory billingClientFactory) {
        this.billingClientFactory = billingClientFactory;
        this.applicationContext = context;
        this.activity = activity;
        this.callbackApi = inAppPurchaseCallbackApi;
    }

    private void endBillingClientConnection() {
        AbstractC0028d abstractC0028d = this.billingClient;
        if (abstractC0028d != null) {
            abstractC0028d.c();
            this.billingClient = null;
        }
    }

    private FlutterError getNullBillingClientError() {
        return new FlutterError("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$acknowledgePurchase$7(InterfaceC1339l interfaceC1339l, C0037m c0037m) {
        ResultCompat.success(TranslatorKt.fromBillingResult(c0037m), interfaceC1339l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$consumeAsync$5(InterfaceC1339l interfaceC1339l, C0037m c0037m, String str) {
        ResultCompat.success(TranslatorKt.fromBillingResult(c0037m), interfaceC1339l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createAlternativeBillingOnlyReportingDetailsAsync$1(InterfaceC1339l interfaceC1339l, C0037m c0037m, C0026b c0026b) {
        ResultCompat.success(TranslatorKt.fromAlternativeBillingOnlyReportingDetails(c0037m, c0026b), interfaceC1339l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getBillingConfigAsync$3(InterfaceC1339l interfaceC1339l, C0037m c0037m, C0031g c0031g) {
        ResultCompat.success(TranslatorKt.fromBillingConfig(c0037m, c0031g), interfaceC1339l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isAlternativeBillingOnlyAvailableAsync$2(InterfaceC1339l interfaceC1339l, C0037m c0037m) {
        ResultCompat.success(TranslatorKt.fromBillingResult(c0037m), interfaceC1339l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$queryProductDetailsAsync$4(InterfaceC1339l interfaceC1339l, C0037m c0037m, A a3) {
        updateCachedProducts(a3.f478a);
        ResultCompat.success(new PlatformProductDetailsResponse(TranslatorKt.fromBillingResult(c0037m), TranslatorKt.fromProductDetailsList(a3.f478a), TranslatorKt.fromUnfetchedProductList(a3.f479b)), interfaceC1339l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryPurchasesAsync$6(InterfaceC1339l interfaceC1339l, C0037m c0037m, List list) {
        ResultCompat.success(new PlatformPurchasesResponse(TranslatorKt.fromBillingResult(c0037m), TranslatorKt.fromPurchasesList(list)), interfaceC1339l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showAlternativeBillingOnlyInformationDialog$0(InterfaceC1339l interfaceC1339l, C0037m c0037m) {
        ResultCompat.success(TranslatorKt.fromBillingResult(c0037m), interfaceC1339l);
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void acknowledgePurchase(String str, InterfaceC1339l interfaceC1339l) {
        AbstractC0028d abstractC0028d = this.billingClient;
        if (abstractC0028d == null) {
            ResultUtilsKt.completeWithError(interfaceC1339l, getNullBillingClientError());
            return;
        }
        try {
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            v vVar = new v(1);
            vVar.f321b = str;
            abstractC0028d.a(vVar, new f(interfaceC1339l));
        } catch (RuntimeException e4) {
            ResultUtilsKt.completeWithError(interfaceC1339l, new FlutterError("error", e4.getMessage(), android.util.Log.getStackTraceString(e4)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void consumeAsync(String str, InterfaceC1339l interfaceC1339l) {
        AbstractC0028d abstractC0028d = this.billingClient;
        if (abstractC0028d == null) {
            ResultUtilsKt.completeWithError(interfaceC1339l, getNullBillingClientError());
            return;
        }
        try {
            f fVar = new f(interfaceC1339l);
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            v vVar = new v(2);
            vVar.f321b = str;
            abstractC0028d.b(vVar, fVar);
        } catch (RuntimeException e4) {
            ResultUtilsKt.completeWithError(interfaceC1339l, new FlutterError("error", e4.getMessage(), android.util.Log.getStackTraceString(e4)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void createAlternativeBillingOnlyReportingDetailsAsync(InterfaceC1339l interfaceC1339l) {
        AbstractC0028d abstractC0028d = this.billingClient;
        if (abstractC0028d == null) {
            ResultUtilsKt.completeWithError(interfaceC1339l, getNullBillingClientError());
            return;
        }
        try {
            f fVar = new f(interfaceC1339l);
            C0029e c0029e = (C0029e) abstractC0028d;
            if (C0029e.j(new G(c0029e, fVar, 1), 30000L, new B.a(c0029e, 6, fVar), c0029e.B(), c0029e.i()) == null) {
                c0029e.n(fVar, c0029e.E(), 25, null);
            }
        } catch (RuntimeException e4) {
            ResultUtilsKt.completeWithError(interfaceC1339l, new FlutterError("error", e4.getMessage(), android.util.Log.getStackTraceString(e4)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void endConnection() {
        endBillingClientConnection();
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void getBillingConfigAsync(InterfaceC1339l interfaceC1339l) {
        AbstractC0028d abstractC0028d = this.billingClient;
        if (abstractC0028d == null) {
            ResultUtilsKt.completeWithError(interfaceC1339l, getNullBillingClientError());
            return;
        }
        try {
            f fVar = new f(interfaceC1339l);
            C0029e c0029e = (C0029e) abstractC0028d;
            if (C0029e.j(new G(c0029e, fVar, 0), 30000L, new B.a(c0029e, 5, fVar), c0029e.B(), c0029e.i()) == null) {
                C0037m E4 = c0029e.E();
                c0029e.J(25, 13, E4);
                fVar.e(E4, null);
            }
        } catch (RuntimeException e4) {
            ResultUtilsKt.completeWithError(interfaceC1339l, new FlutterError("error", e4.getMessage(), android.util.Log.getStackTraceString(e4)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void isAlternativeBillingOnlyAvailableAsync(InterfaceC1339l interfaceC1339l) {
        AbstractC0028d abstractC0028d = this.billingClient;
        if (abstractC0028d == null) {
            ResultUtilsKt.completeWithError(interfaceC1339l, getNullBillingClientError());
            return;
        }
        try {
            f fVar = new f(interfaceC1339l);
            C0029e c0029e = (C0029e) abstractC0028d;
            if (C0029e.j(new G(c0029e, fVar, 2), 30000L, new B.a(c0029e, 7, fVar), c0029e.B(), c0029e.i()) == null) {
                c0029e.l(fVar, c0029e.E(), 25, null);
            }
        } catch (RuntimeException e4) {
            ResultUtilsKt.completeWithError(interfaceC1339l, new FlutterError("error", e4.getMessage(), android.util.Log.getStackTraceString(e4)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public boolean isFeatureSupported(PlatformBillingClientFeature platformBillingClientFeature) {
        boolean z;
        char c4;
        C0037m c0037m;
        AbstractC0028d abstractC0028d = this.billingClient;
        if (abstractC0028d == null) {
            throw getNullBillingClientError();
        }
        String billingClientFeature = TranslatorKt.toBillingClientFeature(platformBillingClientFeature);
        C0029e c0029e = (C0029e) abstractC0028d;
        if (c0029e.w()) {
            C0037m c0037m2 = W.f533a;
            z = false;
            switch (billingClientFeature.hashCode()) {
                case -422092961:
                    if (billingClientFeature.equals("subscriptionsUpdate")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 96321:
                    if (billingClientFeature.equals("aaa")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 97314:
                    if (billingClientFeature.equals("bbb")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 98307:
                    if (billingClientFeature.equals("ccc")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 99300:
                    if (billingClientFeature.equals("ddd")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 100293:
                    if (billingClientFeature.equals("eee")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 101286:
                    if (billingClientFeature.equals("fff")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 102279:
                    if (billingClientFeature.equals("ggg")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 103272:
                    if (billingClientFeature.equals("hhh")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 104265:
                    if (billingClientFeature.equals("iii")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 105258:
                    if (billingClientFeature.equals("jjj")) {
                        c4 = '\f';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 106251:
                    if (billingClientFeature.equals("kkk")) {
                        c4 = '\r';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 107244:
                    if (billingClientFeature.equals("lll")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 108237:
                    if (billingClientFeature.equals("mmm")) {
                        c4 = 15;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109230:
                    if (billingClientFeature.equals("nnn")) {
                        c4 = 16;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 207616302:
                    if (billingClientFeature.equals("priceChangeConfirmation")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1987365622:
                    if (billingClientFeature.equals("subscriptions")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    c0037m = c0029e.f604k ? W.f541i : W.f544l;
                    c0029e.I(9, 2, c0037m);
                    break;
                case 1:
                    c0037m = c0029e.f605l ? W.f541i : W.f545m;
                    c0029e.I(10, 3, c0037m);
                    break;
                case 2:
                    c0037m = c0029e.o ? W.f541i : W.n;
                    c0029e.I(35, 4, c0037m);
                    break;
                case 3:
                    c0037m = c0029e.f608q ? W.f541i : W.f549s;
                    c0029e.I(30, 5, c0037m);
                    break;
                case 4:
                    c0037m = c0029e.f610s ? W.f541i : W.o;
                    c0029e.I(31, 6, c0037m);
                    break;
                case 5:
                    c0037m = c0029e.f609r ? W.f541i : W.f547q;
                    c0029e.I(21, 7, c0037m);
                    break;
                case 6:
                    c0037m = c0029e.f611t ? W.f541i : W.f546p;
                    c0029e.I(19, 8, c0037m);
                    break;
                case 7:
                    c0037m = c0029e.f611t ? W.f541i : W.f546p;
                    c0029e.I(61, 9, c0037m);
                    break;
                case '\b':
                    c0037m = c0029e.f612u ? W.f541i : W.f548r;
                    c0029e.I(20, 10, c0037m);
                    break;
                case '\t':
                    c0037m = c0029e.v ? W.f541i : W.f553x;
                    c0029e.I(32, 11, c0037m);
                    break;
                case '\n':
                    c0037m = c0029e.v ? W.f541i : W.f554y;
                    c0029e.I(33, 12, c0037m);
                    break;
                case 11:
                    c0037m = c0029e.f614x ? W.f541i : W.f529B;
                    c0029e.I(60, 13, c0037m);
                    break;
                case '\f':
                    c0037m = c0029e.f615y ? W.f541i : W.f530C;
                    c0029e.I(66, 14, c0037m);
                    break;
                case '\r':
                    c0037m = c0029e.f587A ? W.f541i : W.z;
                    c0029e.I(121, 18, c0037m);
                    break;
                case 14:
                    c0037m = c0029e.z ? W.f541i : W.f550t;
                    c0029e.I(104, 19, c0037m);
                    break;
                case 15:
                    c0037m = c0029e.f587A ? W.f541i : W.f551u;
                    c0029e.I(119, 20, c0037m);
                    break;
                case 16:
                    c0037m = c0029e.f588B ? W.f541i : W.v;
                    c0029e.I(138, 21, c0037m);
                    break;
                default:
                    AbstractC0352w.h("BillingClient", "Unsupported feature: ".concat(billingClientFeature));
                    c0037m = W.f552w;
                    c0029e.I(34, 1, c0037m);
                    break;
            }
        } else {
            c0037m = W.f542j;
            if (c0037m.f633a != 0) {
                c0029e.J(2, 5, c0037m);
            } else {
                try {
                    int i4 = U.f526a;
                    c0029e.r(U.c(5, l1.BROADCAST_ACTION_UNSPECIFIED));
                } catch (Throwable th) {
                    AbstractC0352w.i("BillingClient", "Unable to log.", th);
                }
            }
            z = false;
        }
        if (c0037m.f633a == 0) {
            return true;
        }
        return z;
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public boolean isReady() {
        AbstractC0028d abstractC0028d = this.billingClient;
        if (abstractC0028d != null) {
            return ((C0029e) abstractC0028d).y();
        }
        throw getNullBillingClientError();
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public PlatformBillingResult launchBillingFlow(PlatformBillingFlowParams platformBillingFlowParams) {
        if (this.billingClient == null) {
            throw getNullBillingClientError();
        }
        C0043t c0043t = this.cachedProducts.get(platformBillingFlowParams.getProduct());
        if (c0043t == null) {
            throw new FlutterError("NOT_FOUND", "Details for product " + platformBillingFlowParams.getProduct() + " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale", null);
        }
        ArrayList arrayList = c0043t.f668j;
        boolean z = false;
        if (arrayList != null) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                C0042s c0042s = (C0042s) obj;
                if (platformBillingFlowParams.getOfferToken() == null || !platformBillingFlowParams.getOfferToken().equals(c0042s.f655c)) {
                }
            }
            throw new FlutterError("INVALID_OFFER_TOKEN", "Offer token " + platformBillingFlowParams.getOfferToken() + " for product " + platformBillingFlowParams.getProduct() + " is not valid. Make sure to only pass offer tokens that belong to the product. To obtain offer tokens for a product, fetch the products. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale", null);
        }
        if (platformBillingFlowParams.getOldProduct() == null && platformBillingFlowParams.getReplacementMode() != REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY) {
            throw new FlutterError("IN_APP_PURCHASE_REQUIRE_OLD_PRODUCT", "launchBillingFlow failed because oldProduct is null. You must provide a valid oldProduct in order to use a replacement mode.", null);
        }
        if (platformBillingFlowParams.getOldProduct() != null && !this.cachedProducts.containsKey(platformBillingFlowParams.getOldProduct())) {
            throw new FlutterError("IN_APP_PURCHASE_INVALID_OLD_PRODUCT", "Details for product " + platformBillingFlowParams.getOldProduct() + " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale", null);
        }
        if (this.activity == null) {
            throw new FlutterError(ACTIVITY_UNAVAILABLE, "Details for product " + platformBillingFlowParams.getProduct() + " are not available. This method must be run with the app in foreground.", null);
        }
        l2.e eVar = new l2.e(2, false);
        eVar.f14270b = c0043t;
        if (c0043t.a() != null) {
            c0043t.a().getClass();
            String str = c0043t.a().f642d;
            if (str != null) {
                eVar.f14271c = str;
            }
        }
        if (platformBillingFlowParams.getOfferToken() != null) {
            String offerToken = platformBillingFlowParams.getOfferToken();
            if (TextUtils.isEmpty(offerToken)) {
                throw new IllegalArgumentException("offerToken can not be empty");
            }
            eVar.f14271c = offerToken;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0032h(eVar));
        C0033i c0033i = new C0033i();
        c0033i.f619a = 0;
        c0033i.f620b = true;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        String accountId = (platformBillingFlowParams.getAccountId() == null || platformBillingFlowParams.getAccountId().isEmpty()) ? null : platformBillingFlowParams.getAccountId();
        String obfuscatedProfileId = (platformBillingFlowParams.getObfuscatedProfileId() == null || platformBillingFlowParams.getObfuscatedProfileId().isEmpty()) ? null : platformBillingFlowParams.getObfuscatedProfileId();
        if (platformBillingFlowParams.getOldProduct() != null && !platformBillingFlowParams.getOldProduct().isEmpty() && platformBillingFlowParams.getPurchaseToken() != null) {
            String purchaseToken = platformBillingFlowParams.getPurchaseToken();
            int replacementMode = platformBillingFlowParams.getReplacementMode() != REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY ? TranslatorKt.toReplacementMode(platformBillingFlowParams.getReplacementMode()) : 0;
            boolean z4 = (TextUtils.isEmpty(purchaseToken) && TextUtils.isEmpty(null)) ? false : true;
            boolean isEmpty = TextUtils.isEmpty(null);
            if (z4 && !isEmpty) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!z4 && isEmpty) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            C0034j c0034j = new C0034j();
            c0034j.f622a = purchaseToken;
            c0034j.f623b = replacementMode;
            c0033i = new C0033i();
            c0033i.f621c = c0034j.f622a;
            c0033i.f619a = c0034j.f623b;
        }
        AbstractC0028d abstractC0028d = this.billingClient;
        Activity activity = this.activity;
        boolean isEmpty2 = arrayList3.isEmpty();
        if (isEmpty2) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            if (((C0032h) obj2) == null) {
                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
            }
        }
        C0035k c0035k = new C0035k();
        if (!isEmpty2 && !((C0032h) arrayList3.get(0)).f617a.f660b.optString("packageName").isEmpty()) {
            z = true;
        }
        c0035k.f624a = z;
        c0035k.f625b = accountId;
        c0035k.f626c = obfuscatedProfileId;
        boolean z5 = true;
        if (TextUtils.isEmpty((String) c0033i.f621c) && TextUtils.isEmpty(null)) {
            z5 = false;
        }
        boolean isEmpty3 = TextUtils.isEmpty(null);
        if (z5 && !isEmpty3) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!c0033i.f620b && !z5 && isEmpty3) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        C0034j c0034j2 = new C0034j();
        c0034j2.f622a = (String) c0033i.f621c;
        c0034j2.f623b = c0033i.f619a;
        c0035k.f627d = c0034j2;
        c0035k.f629f = new ArrayList();
        c0035k.f628e = AbstractC0346t.j(arrayList3);
        return TranslatorKt.fromBillingResult(abstractC0028d.d(activity, c0035k));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Context context;
        if (this.activity != activity || (context = this.applicationContext) == null) {
            return;
        }
        ((Application) context).unregisterActivityLifecycleCallbacks(this);
        endBillingClientConnection();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public void onDetachedFromActivity() {
        endBillingClientConnection();
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void queryProductDetailsAsync(List<PlatformQueryProduct> list, InterfaceC1339l interfaceC1339l) {
        if (this.billingClient == null) {
            ResultUtilsKt.completeWithError(interfaceC1339l, getNullBillingClientError());
            return;
        }
        try {
            C0048y c0048y = new C0048y();
            c0048y.b(TranslatorKt.toProductList(list));
            this.billingClient.e(c0048y.a(), new e(this, interfaceC1339l));
        } catch (RuntimeException e4) {
            ResultUtilsKt.completeWithError(interfaceC1339l, new FlutterError("error", e4.getMessage(), android.util.Log.getStackTraceString(e4)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void queryPurchasesAsync(PlatformProductType platformProductType, InterfaceC1339l interfaceC1339l) {
        if (this.billingClient == null) {
            ResultUtilsKt.completeWithError(interfaceC1339l, getNullBillingClientError());
            return;
        }
        try {
            v vVar = new v(3);
            vVar.f321b = TranslatorKt.toProductTypeString(platformProductType);
            this.billingClient.f(vVar.b(), new f(interfaceC1339l));
        } catch (RuntimeException e4) {
            ResultUtilsKt.completeWithError(interfaceC1339l, new FlutterError("error", e4.getMessage(), android.util.Log.getStackTraceString(e4)));
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void showAlternativeBillingOnlyInformationDialog(InterfaceC1339l interfaceC1339l) {
        AbstractC0028d abstractC0028d = this.billingClient;
        if (abstractC0028d == null) {
            ResultUtilsKt.completeWithError(interfaceC1339l, getNullBillingClientError());
            return;
        }
        Activity activity = this.activity;
        if (activity == null) {
            ResultUtilsKt.completeWithError(interfaceC1339l, new FlutterError(ACTIVITY_UNAVAILABLE, "Not attempting to show dialog", null));
            return;
        }
        try {
            abstractC0028d.g(activity, new f(interfaceC1339l));
        } catch (RuntimeException e4) {
            ResultUtilsKt.completeWithError(interfaceC1339l, new FlutterError("error", e4.getMessage(), android.util.Log.getStackTraceString(e4)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void startConnection(long j4, PlatformBillingChoiceMode platformBillingChoiceMode, PlatformPendingPurchasesParams platformPendingPurchasesParams, InterfaceC1339l interfaceC1339l) {
        if (this.billingClient == null) {
            this.billingClient = this.billingClientFactory.createBillingClient(this.applicationContext, this.callbackApi, platformBillingChoiceMode, platformPendingPurchasesParams);
        }
        try {
            this.billingClient.h(new AnonymousClass1(interfaceC1339l, j4));
        } catch (RuntimeException e4) {
            ResultUtilsKt.completeWithError(interfaceC1339l, new FlutterError("error", e4.getMessage(), android.util.Log.getStackTraceString(e4)));
        }
    }

    public void updateCachedProducts(List<C0043t> list) {
        if (list == null) {
            return;
        }
        for (C0043t c0043t : list) {
            this.cachedProducts.put(c0043t.f661c, c0043t);
        }
    }
}
