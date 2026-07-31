package com.appsflyer.internal.connectors;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.appsflyer.AFLogger;
import com.appsflyer.api.AFActivityLifecycleCallbacksImpl;
import com.appsflyer.api.AndroidLifecycleListener;
import com.appsflyer.api.PurchaseClientImpl;
import com.appsflyer.common.ExtentionsKt;
import com.appsflyer.internal.PurchaseProcessingManager;
import com.appsflyer.internal.connectors.BillingClientConnector;
import com.appsflyer.internal.connectors.callbacks.BillingLibraryAsyncListenersImpl;
import com.appsflyer.internal.db.PurchaseDatabaseHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class GoogleConnector implements BillingClientConnector, BillingClientStateListener, PurchasesUpdatedListener, AndroidLifecycleListener {
    private final AFActivityLifecycleCallbacksImpl activityLifecycleCallbacksImpl;
    private final BillingClient billingClient;
    private final Context context;
    private final PurchaseDatabaseHelper db;
    private BillingClientConnector.BillingUpdatesListener listener;
    private final SharedPreferences sharedPreferences;
    private final PurchasesResponseListener purchasesResponseListenerOnFirstLaunchForInapps = new PurchasesResponseListener() { // from class: com.appsflyer.internal.connectors.GoogleConnector.1
        public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
            if (billingResult.getResponseCode() != 0) {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
            } else if (list.isEmpty()) {
                GoogleConnector.this.sharedPreferences.edit().putBoolean(PurchaseClientImpl.INAPP_PURCHASES_HISTORY_PROCESSED_KEY, true).apply();
                AFLogger.afDebugLog("[PurchaseConnector]: No history for non-consumed one-time purchases found");
            } else {
                GoogleConnector.this.saveOldHistoryInappPurchasesToDB(list);
            }
        }
    };
    private final PurchasesResponseListener purchasesResponseListenerOnFirstLaunchForSubs = new PurchasesResponseListener() { // from class: com.appsflyer.internal.connectors.GoogleConnector.2
        public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
            if (billingResult.getResponseCode() != 0) {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
            } else if (list.isEmpty()) {
                GoogleConnector.this.sharedPreferences.edit().putBoolean(PurchaseClientImpl.ARS_HISTORY_SENT_KEY, true).apply();
                AFLogger.afDebugLog("[PurchaseConnector]: No active subscriptions and/or non-consumed one-time purchases found");
            } else {
                GoogleConnector.this.processNewPurchases(billingResult, list, true);
            }
        }
    };
    private final PurchasesResponseListener purchasesResponseListenerOnResume = new PurchasesResponseListener() { // from class: com.appsflyer.internal.connectors.GoogleConnector$$ExternalSyntheticLambda0
        public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
            GoogleConnector.this.m68lambda$new$0$comappsflyerinternalconnectorsGoogleConnector(billingResult, list);
        }
    };
    private boolean isStopped = true;

    /* renamed from: lambda$new$0$com-appsflyer-internal-connectors-GoogleConnector, reason: not valid java name */
    /* synthetic */ void m68lambda$new$0$comappsflyerinternalconnectorsGoogleConnector(BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() != 0) {
            AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
        } else {
            processNewPurchases(billingResult, list, false);
        }
    }

    public GoogleConnector(Context context, GoogleClientFactory googleClientFactory, SharedPreferences sharedPreferences, PurchaseDatabaseHelper purchaseDatabaseHelper) {
        googleClientFactory = googleClientFactory == null ? new GoogleClientFactory(this) : googleClientFactory;
        this.context = context;
        this.sharedPreferences = sharedPreferences;
        this.billingClient = googleClientFactory.buildBillingClient();
        this.db = purchaseDatabaseHelper;
        this.activityLifecycleCallbacksImpl = new AFActivityLifecycleCallbacksImpl(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveOldHistoryInappPurchasesToDB(List<Purchase> list) {
        HashSet hashSet = new HashSet();
        Iterator<Purchase> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getPurchaseToken());
        }
        this.db.savePurchaseTokens(hashSet);
        this.sharedPreferences.edit().putBoolean(PurchaseClientImpl.INAPP_PURCHASES_HISTORY_PROCESSED_KEY, true).apply();
    }

    @Override // com.appsflyer.internal.connectors.BillingClientConnector
    public void setListener(BillingClientConnector.BillingUpdatesListener billingUpdatesListener) {
        this.listener = billingUpdatesListener;
    }

    @Override // com.appsflyer.internal.connectors.BillingClientConnector
    public void start() {
        if (this.isStopped) {
            this.isStopped = false;
            this.billingClient.startConnection(this);
            Context context = this.context;
            if (context instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(this.activityLifecycleCallbacksImpl);
            }
        }
    }

    @Override // com.appsflyer.internal.connectors.BillingClientConnector
    public void stop() {
        if (this.isStopped) {
            return;
        }
        this.isStopped = true;
        this.billingClient.endConnection();
    }

    @Override // com.appsflyer.internal.connectors.BillingClientConnector
    public boolean getStopped() {
        return this.isStopped;
    }

    private void processSubscriptionHistory() {
        try {
            if (this.sharedPreferences.getBoolean(PurchaseClientImpl.ARS_HISTORY_SENT_KEY, false)) {
                return;
            }
            this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(BillingClientConnector.ProductType.SUBS).build(), this.purchasesResponseListenerOnFirstLaunchForSubs);
        } catch (Throwable th) {
            ExtentionsKt.warnIfBillingLibraryWrongVersion(th);
            AFLogger.afErrorLog("[PurchaseConnector]: Failed to log purchases history", th, true);
        }
    }

    private void processInappPurchaseHistory() {
        try {
            if (this.sharedPreferences.getBoolean(PurchaseClientImpl.INAPP_PURCHASES_HISTORY_PROCESSED_KEY, false)) {
                return;
            }
            this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(BillingClientConnector.ProductType.INAPP).build(), this.purchasesResponseListenerOnFirstLaunchForInapps);
        } catch (Throwable th) {
            ExtentionsKt.warnIfBillingLibraryWrongVersion(th);
            AFLogger.afErrorLog("[PurchaseConnector]: Failed to log purchases history", th, true);
        }
    }

    public void processNewPurchases(BillingResult billingResult, List<Purchase> list, boolean z) {
        try {
            if (billingResult.getResponseCode() == 0 && list != null) {
                if (this.billingClient == null) {
                    AFLogger.afWarnLog("[PurchaseConnector]: Got Ars billing callback but billing client is missing!");
                    return;
                }
                Set<String> purchasedTokens = this.db.getPurchasedTokens();
                AFLogger.afDebugLog("tokens: " + Arrays.deepToString(purchasedTokens.toArray(new String[0])));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Purchase purchase : list) {
                    String sha256AsBase64 = ExtentionsKt.sha256AsBase64(purchase.getPurchaseToken());
                    boolean isTokenInProcessing = PurchaseProcessingManager.isTokenInProcessing(sha256AsBase64);
                    if (!purchasedTokens.contains(sha256AsBase64) && !isTokenInProcessing) {
                        PurchaseProcessingManager.addToken(sha256AsBase64);
                        arrayList2.add(purchase);
                        arrayList.addAll(purchase.getProducts());
                    }
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                handlePurchases(BillingClientConnector.ProductType.SUBS, arrayList, arrayList2, z);
                handlePurchases(BillingClientConnector.ProductType.INAPP, arrayList, arrayList2, z);
                return;
            }
            AFLogger.afWarnLog("[PurchaseConnector]: Failed to setup Ars Play billing service: " + billingResult.getResponseCode() + " " + billingResult.getDebugMessage());
        } catch (Throwable th) {
            ExtentionsKt.warnIfBillingLibraryWrongVersion(th);
            AFLogger.afErrorLog("[PurchaseConnector]: Failed to query new purchase details", th, true);
        }
    }

    private void handlePurchases(String str, List<String> list, List<Purchase> list2, boolean z) {
        if (!BillingClientConnector.ProductType.SUBS.equals(str) && !BillingClientConnector.ProductType.INAPP.equals(str)) {
            AFLogger.afWarnLog("[PurchaseConnector]: " + str + " SKU type is illegal");
            return;
        }
        AFLogger.afDebugLog("[PurchaseConnector]: Querying Sku details:\n\ttype: " + str + "\n\tSkus: " + ExtentionsKt.join(list, ", "));
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(it.next()).setProductType(str).build());
        }
        QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
        if (this.listener == null) {
            AFLogger.afWarnLog("[PurchaseConnector]: Skipping queryProductDetailsAsync because BillingUpdatesListener is null");
        } else {
            this.billingClient.queryProductDetailsAsync(build, new BillingLibraryAsyncListenersImpl(str, this.listener, list2, z));
        }
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        AFLogger.afDebugLog("[PurchaseConnector]: onBillingSetupFinished");
        if (billingResult.getResponseCode() != 0) {
            return;
        }
        processSubscriptionHistory();
        processInappPurchaseHistory();
    }

    public void onBillingServiceDisconnected() {
        AFLogger.afDebugLog("[PurchaseConnector]: onBillingServiceDisconnected");
    }

    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        AFLogger.afDebugLog("[PurchaseConnector]: onPurchasesUpdated");
        processNewPurchases(billingResult, list, false);
    }

    @Override // com.appsflyer.api.AndroidLifecycleListener
    public void onActivityOnCreate() {
        PurchaseProcessingManager.clearAll();
    }

    @Override // com.appsflyer.api.AndroidLifecycleListener
    public void onActivityOnResume() {
        if (this.sharedPreferences.getBoolean(PurchaseClientImpl.ARS_HISTORY_SENT_KEY, false)) {
            this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(BillingClientConnector.ProductType.SUBS).build(), this.purchasesResponseListenerOnResume);
        }
        if (this.sharedPreferences.getBoolean(PurchaseClientImpl.INAPP_PURCHASES_HISTORY_PROCESSED_KEY, false)) {
            this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(BillingClientConnector.ProductType.INAPP).build(), this.purchasesResponseListenerOnResume);
        }
    }

    public class GoogleClientFactory implements BillingClientConnector.BillingClientFactory<BillingClient> {
        private final PurchasesUpdatedListener purchaseUpdatedListener;

        public GoogleClientFactory(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.purchaseUpdatedListener = purchasesUpdatedListener;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.connectors.BillingClientConnector.BillingClientFactory
        public BillingClient buildBillingClient() {
            return BillingClient.newBuilder(GoogleConnector.this.context).setListener(this.purchaseUpdatedListener).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).enableAutoServiceReconnection().build();
        }
    }
}
