package dev.cct.translatorapp.Billing;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import dev.cct.translatorapp.util.Preferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingClass.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Ldev/cct/translatorapp/Billing/BillingClass;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "activityContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "googleBillingGalleryVaultLockerClient", "Lcom/android/billingclient/api/BillingClient;", "listAvailGalleryVaultLockerPurchases", "Ljava/util/ArrayList;", "Lcom/android/billingclient/api/SkuDetails;", "Lkotlin/collections/ArrayList;", "purchaseAcknowledgedListener", "Lcom/android/billingclient/api/AcknowledgePurchaseResponseListener;", "tag", "", "fetchGalleryVaultLockerAllInAppsFromConsole", "", "fetchGalleryVaultLockerPurchasedInAppsFromConsole", "handlePurchase", FirebaseAnalytics.Event.PURCHASE, "Lcom/android/billingclient/api/Purchase;", "initMyBillingClient", "onPurchasesUpdated", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "purchases", "", "setBillingPackage", "i", "", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BillingClass implements PurchasesUpdatedListener {
    private final Context activityContext;
    private BillingClient googleBillingGalleryVaultLockerClient;
    private final ArrayList<SkuDetails> listAvailGalleryVaultLockerPurchases;
    private final AcknowledgePurchaseResponseListener purchaseAcknowledgedListener;
    private final String tag;

    public BillingClass(Context activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        this.activityContext = activityContext;
        this.tag = "BillingStatus:";
        this.listAvailGalleryVaultLockerPurchases = new ArrayList<>();
        initMyBillingClient();
        Log.e("BillingStatus:", "initMyBillingClient");
        this.purchaseAcknowledgedListener = new AcknowledgePurchaseResponseListener() { // from class: dev.cct.translatorapp.Billing.BillingClass$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                BillingClass.purchaseAcknowledgedListener$lambda$2(BillingClass.this, billingResult);
            }
        };
    }

    private final void initMyBillingClient() {
        BillingClient build = BillingClient.newBuilder(this.activityContext).enablePendingPurchases().setListener(this).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder(activityConte…his)\n            .build()");
        this.googleBillingGalleryVaultLockerClient = build;
        if (build == null) {
            Intrinsics.throwUninitializedPropertyAccessException("googleBillingGalleryVaultLockerClient");
            build = null;
        }
        build.startConnection(new BillingClientStateListener() { // from class: dev.cct.translatorapp.Billing.BillingClass$initMyBillingClient$1
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                String str;
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                if (billingResult.getResponseCode() == 0) {
                    str = BillingClass.this.tag;
                    Log.d(str, "Google Billing is Connected");
                    BillingClass.this.fetchGalleryVaultLockerAllInAppsFromConsole();
                    BillingClass.this.fetchGalleryVaultLockerPurchasedInAppsFromConsole();
                }
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                String str;
                str = BillingClass.this.tag;
                Log.d(str, "Google Billing is  Disconnected");
            }
        });
    }

    public final void fetchGalleryVaultLockerAllInAppsFromConsole() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("weekly_trans");
        arrayList.add("monthly_trans");
        arrayList.add("sku_quarter");
        SkuDetailsParams.Builder newBuilder = SkuDetailsParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        newBuilder.setSkusList(arrayList).setType("subs");
        BillingClient billingClient = this.googleBillingGalleryVaultLockerClient;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("googleBillingGalleryVaultLockerClient");
            billingClient = null;
        }
        billingClient.querySkuDetailsAsync(newBuilder.build(), new SkuDetailsResponseListener() { // from class: dev.cct.translatorapp.Billing.BillingClass$$ExternalSyntheticLambda2
            @Override // com.android.billingclient.api.SkuDetailsResponseListener
            public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                BillingClass.fetchGalleryVaultLockerAllInAppsFromConsole$lambda$0(BillingClass.this, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchGalleryVaultLockerAllInAppsFromConsole$lambda$0(BillingClass this$0, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(billingResult, "<anonymous parameter 0>");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SkuDetails skuDetails = (SkuDetails) it.next();
                this$0.listAvailGalleryVaultLockerPurchases.add(skuDetails);
                Log.d(this$0.tag, "onSkuDetailsResponse: " + skuDetails.getSku());
                String sku = skuDetails.getSku();
                int hashCode = sku.hashCode();
                if (hashCode != 669495658) {
                    if (hashCode != 1202644982) {
                        if (hashCode == 1947769226 && sku.equals("sku_quarter")) {
                            new Preferences(this$0.activityContext).setQuarterlyPrice(skuDetails.getPrice());
                        }
                    } else if (sku.equals("monthly_trans")) {
                        new Preferences(this$0.activityContext).setMonthlyPrice(skuDetails.getPrice());
                    }
                } else if (sku.equals("weekly_trans")) {
                    new Preferences(this$0.activityContext).setWeeklyPrice(skuDetails.getPrice());
                }
                Log.e(this$0.tag, skuDetails.getPriceCurrencyCode());
            }
            return;
        }
        Log.e(this$0.tag, "No skus for this application");
        new Preferences(this$0.activityContext).setCheckBillingStatus(false);
    }

    public final void fetchGalleryVaultLockerPurchasedInAppsFromConsole() {
        BillingClient billingClient = this.googleBillingGalleryVaultLockerClient;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("googleBillingGalleryVaultLockerClient");
            billingClient = null;
        }
        billingClient.queryPurchasesAsync("subs", new PurchasesResponseListener() { // from class: dev.cct.translatorapp.Billing.BillingClass$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                BillingClass.fetchGalleryVaultLockerPurchasedInAppsFromConsole$lambda$1(BillingClass.this, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchGalleryVaultLockerPurchasedInAppsFromConsole$lambda$1(BillingClass this$0, BillingResult billingResult, List purchasesList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        if (billingResult.getResponseCode() == 0) {
            if (!purchasesList.isEmpty()) {
                Iterator it = purchasesList.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    if (purchase.getPurchaseState() == 1) {
                        Log.e(this$0.tag, "Product Purchased: " + purchase.getSkus());
                        new Preferences(this$0.activityContext).setCheckBillingStatus(true);
                    } else {
                        new Preferences(this$0.activityContext).setCheckBillingStatus(false);
                        Log.e(this$0.tag, "Product Not Purchased: " + purchase.getSkus());
                    }
                }
                return;
            }
            Log.e(this$0.tag, "Array List Purchase Null 1 " + purchasesList);
            new Preferences(this$0.activityContext).setCheckBillingStatus(false);
            return;
        }
        Log.e(this$0.tag, "Billing Checker Failed 1: " + billingResult.getResponseCode());
    }

    public final void setBillingPackage(int i) {
        Log.d(this.tag, "Going to purchase ads_purchase");
        if (this.listAvailGalleryVaultLockerPurchases.size() > 0) {
            try {
                BillingFlowParams build = BillingFlowParams.newBuilder().setSkuDetails(this.listAvailGalleryVaultLockerPurchases.get(i)).build();
                Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …                 .build()");
                BillingClient billingClient = this.googleBillingGalleryVaultLockerClient;
                if (billingClient == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("googleBillingGalleryVaultLockerClient");
                    billingClient = null;
                }
                Context context = this.activityContext;
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                Log.d(this.tag, "Google Billing Response : " + billingClient.launchBillingFlow((Activity) context, build).getResponseCode());
                return;
            } catch (Exception e) {
                Log.d(this.tag, String.valueOf(e));
                return;
            }
        }
        Log.d(this.tag, "Nothing to purchase for google billing");
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> purchases) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (billingResult.getResponseCode() == 0 && purchases != null) {
            for (Purchase purchase : purchases) {
                Log.d(this.tag, "onPurchases Successfully Purchased : " + purchase.getSkus());
                handlePurchase(purchase);
            }
            return;
        }
        if (billingResult.getResponseCode() == 1) {
            Log.d(this.tag, "Google Billing Cancelled");
        } else {
            if (billingResult.getResponseCode() == 7) {
                Log.d(this.tag, "Google Billing Purchased Already");
                return;
            }
            Log.d(this.tag, "Google billing other error " + billingResult.getResponseCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseAcknowledgedListener$lambda$2(BillingClass this$0, BillingResult p0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        Log.d(this$0.tag, "Success Acknowledged : " + p0.getResponseCode() + "  :" + p0.getDebugMessage());
        this$0.fetchGalleryVaultLockerPurchasedInAppsFromConsole();
    }

    private final void handlePurchase(Purchase purchase) {
        if (purchase.getPurchaseState() != 1 || purchase.isAcknowledged()) {
            return;
        }
        Log.d(this.tag, "Process acknowledging: " + purchase.getSkus());
        AcknowledgePurchaseParams build = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …                 .build()");
        BillingClient billingClient = this.googleBillingGalleryVaultLockerClient;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("googleBillingGalleryVaultLockerClient");
            billingClient = null;
        }
        billingClient.acknowledgePurchase(build, this.purchaseAcknowledgedListener);
    }
}
