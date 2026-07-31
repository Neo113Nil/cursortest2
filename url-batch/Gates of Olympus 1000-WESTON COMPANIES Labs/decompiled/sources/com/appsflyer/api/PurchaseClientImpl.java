package com.appsflyer.api;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.BuildConfig;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.api.PurchaseClient;
import com.appsflyer.common.ExtentionsKt;
import com.appsflyer.internal.HashUtils;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.connectors.BillingClientConnector;
import com.appsflyer.internal.db.PurchaseDatabaseHelper;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: PurchaseClientImpl.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 32\u00020\u0001:\u00013Be\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\"0\u001fH\u0002J\b\u0010#\u001a\u00020\nH\u0002J2\u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J:\u0010(\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010+\u001a\u00020%H\u0002J\b\u0010,\u001a\u00020%H\u0016J\b\u0010-\u001a\u00020%H\u0002J\b\u0010.\u001a\u00020%H\u0016J@\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a00*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a002\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0012\u00101\u001a\u00020%*\b\u0012\u0004\u0012\u0002020\u001fH\u0002R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0018\u001a\u0004\u0018\u00010\n*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lcom/appsflyer/api/PurchaseClientImpl;", "Lcom/appsflyer/api/PurchaseClient;", "context", "Landroid/content/Context;", "sandbox", "", "connector", "Lcom/appsflyer/internal/connectors/BillingClientConnector;", "purchaseTypes", "", "", "validationResultListener", "Lcom/appsflyer/api/PurchaseClient$SubscriptionPurchaseValidationResultListener;", "inAppValidationResultListener", "Lcom/appsflyer/api/PurchaseClient$InAppPurchaseValidationResultListener;", "additionalParamsSourceForSubscriptions", "Lcom/appsflyer/api/PurchaseClient$SubscriptionPurchaseEventDataSource;", "additionalParamsSourceForInApps", "Lcom/appsflyer/api/PurchaseClient$InAppPurchaseEventDataSource;", "afClient", "Lcom/appsflyer/AppsFlyerLib;", "db", "Lcom/appsflyer/internal/db/PurchaseDatabaseHelper;", "(Landroid/content/Context;ZLcom/appsflyer/internal/connectors/BillingClientConnector;Ljava/util/Set;Lcom/appsflyer/api/PurchaseClient$SubscriptionPurchaseValidationResultListener;Lcom/appsflyer/api/PurchaseClient$InAppPurchaseValidationResultListener;Lcom/appsflyer/api/PurchaseClient$SubscriptionPurchaseEventDataSource;Lcom/appsflyer/api/PurchaseClient$InAppPurchaseEventDataSource;Lcom/appsflyer/AppsFlyerLib;Lcom/appsflyer/internal/db/PurchaseDatabaseHelper;)V", "signature", "", "", "getSignature", "(Ljava/util/Map;)Ljava/lang/String;", "getAdditionalParamsForInApp", "purchaseEvents", "", "Lcom/appsflyer/api/InAppPurchaseEvent;", "getAdditionalParamsForSubscriptions", "Lcom/appsflyer/api/SubscriptionPurchaseEvent;", "getBillingLibraryVersion", "sendInAppToServerAndReportResult", "", PurchaseDatabaseHelper.TABLE_NAME, "additionalParams", "sendSubscriptionToServerAndReportResult", "history", BillingClientConnector.ProductType.SUBS, "start", "startObservingTransactions", "stop", "stopObservingTransactions", "createSignedRequestData", "", "saveTokens", "Lcom/appsflyer/api/PurchaseEvent;", "Companion", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PurchaseClientImpl implements PurchaseClient {
    public static final String ARS_HISTORY_SENT_KEY = "ars_google_history_sent";
    public static final String INAPP_PURCHASES_HISTORY_PROCESSED_KEY = "inapp_purchases_history_processed";
    private final PurchaseClient.InAppPurchaseEventDataSource additionalParamsSourceForInApps;
    private final PurchaseClient.SubscriptionPurchaseEventDataSource additionalParamsSourceForSubscriptions;
    private final AppsFlyerLib afClient;
    private final BillingClientConnector connector;
    private final Context context;
    private final PurchaseDatabaseHelper db;
    private final PurchaseClient.InAppPurchaseValidationResultListener inAppValidationResultListener;
    private final Set<String> purchaseTypes;
    private final boolean sandbox;
    private final PurchaseClient.SubscriptionPurchaseValidationResultListener validationResultListener;

    public PurchaseClientImpl(Context context, boolean z, BillingClientConnector connector, Set<String> purchaseTypes, PurchaseClient.SubscriptionPurchaseValidationResultListener subscriptionPurchaseValidationResultListener, PurchaseClient.InAppPurchaseValidationResultListener inAppPurchaseValidationResultListener, PurchaseClient.SubscriptionPurchaseEventDataSource subscriptionPurchaseEventDataSource, PurchaseClient.InAppPurchaseEventDataSource inAppPurchaseEventDataSource, AppsFlyerLib afClient, PurchaseDatabaseHelper db) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(connector, "connector");
        Intrinsics.checkNotNullParameter(purchaseTypes, "purchaseTypes");
        Intrinsics.checkNotNullParameter(afClient, "afClient");
        Intrinsics.checkNotNullParameter(db, "db");
        this.context = context;
        this.sandbox = z;
        this.connector = connector;
        this.purchaseTypes = purchaseTypes;
        this.validationResultListener = subscriptionPurchaseValidationResultListener;
        this.inAppValidationResultListener = inAppPurchaseValidationResultListener;
        this.additionalParamsSourceForSubscriptions = subscriptionPurchaseEventDataSource;
        this.additionalParamsSourceForInApps = inAppPurchaseEventDataSource;
        this.afClient = afClient;
        this.db = db;
    }

    @Override // com.appsflyer.api.PurchaseClient
    public void startObservingTransactions() {
        start();
    }

    @Override // com.appsflyer.api.PurchaseClient
    public void stopObservingTransactions() {
        stop();
    }

    private final void stop() {
        BillingClientConnector billingClientConnector = this.connector;
        if (!billingClientConnector.getStopped()) {
            AFLogger.afDebugLog("[PurchaseConnector]: Stop Observing Transactions");
            billingClientConnector.setListener(null);
            billingClientConnector.stop();
            return;
        }
        AFLogger.afDebugLog("[PurchaseConnector]: Not Observing Transactions");
    }

    private final void start() {
        if (this.purchaseTypes.isEmpty()) {
            AFLogger.afDebugLog("[PurchaseConnector]: No purchase types specify. The connector will not start");
        } else {
            if (!this.connector.getStopped()) {
                AFLogger.afDebugLog("[PurchaseConnector]: Already Observing Transactions");
                return;
            }
            AFLogger.afDebugLog("[PurchaseConnector]: Start Observing Transactions");
            this.connector.setListener(new BillingClientConnector.BillingUpdatesListener() { // from class: com.appsflyer.api.PurchaseClientImpl$start$1
                @Override // com.appsflyer.internal.connectors.BillingClientConnector.BillingUpdatesListener
                public void onSubscriptionPurchaseHistoryRetrieved(List<SubscriptionPurchaseEvent> purchaseHistory) {
                    Set set;
                    Map additionalParamsForSubscriptions;
                    boolean z;
                    Intrinsics.checkNotNullParameter(purchaseHistory, "purchaseHistory");
                    set = PurchaseClientImpl.this.purchaseTypes;
                    if (set.contains(BillingClientConnector.ProductType.SUBS)) {
                        additionalParamsForSubscriptions = PurchaseClientImpl.this.getAdditionalParamsForSubscriptions(purchaseHistory);
                        PurchaseClientImpl purchaseClientImpl = PurchaseClientImpl.this;
                        z = purchaseClientImpl.sandbox;
                        purchaseClientImpl.sendSubscriptionToServerAndReportResult(z, true, purchaseHistory, additionalParamsForSubscriptions);
                        return;
                    }
                    AFLogger.afDebugLog("Not configured for auto Subscription logging");
                }

                @Override // com.appsflyer.internal.connectors.BillingClientConnector.BillingUpdatesListener
                public void onNewSubscriptionPurchases(List<SubscriptionPurchaseEvent> newPurchases) {
                    Set set;
                    Map additionalParamsForSubscriptions;
                    boolean z;
                    Intrinsics.checkNotNullParameter(newPurchases, "newPurchases");
                    set = PurchaseClientImpl.this.purchaseTypes;
                    if (set.contains(BillingClientConnector.ProductType.SUBS)) {
                        additionalParamsForSubscriptions = PurchaseClientImpl.this.getAdditionalParamsForSubscriptions(newPurchases);
                        PurchaseClientImpl purchaseClientImpl = PurchaseClientImpl.this;
                        z = purchaseClientImpl.sandbox;
                        purchaseClientImpl.sendSubscriptionToServerAndReportResult(z, false, newPurchases, additionalParamsForSubscriptions);
                        return;
                    }
                    AFLogger.afDebugLog("Not configured for auto Subscription logging");
                }

                @Override // com.appsflyer.internal.connectors.BillingClientConnector.BillingUpdatesListener
                public void onNewInAppPurchases(List<InAppPurchaseEvent> newPurchases) {
                    Set set;
                    Map additionalParamsForInApp;
                    boolean z;
                    Intrinsics.checkNotNullParameter(newPurchases, "newPurchases");
                    set = PurchaseClientImpl.this.purchaseTypes;
                    if (set.contains(BillingClientConnector.ProductType.INAPP)) {
                        additionalParamsForInApp = PurchaseClientImpl.this.getAdditionalParamsForInApp(newPurchases);
                        PurchaseClientImpl purchaseClientImpl = PurchaseClientImpl.this;
                        z = purchaseClientImpl.sandbox;
                        purchaseClientImpl.sendInAppToServerAndReportResult(z, newPurchases, additionalParamsForInApp);
                        return;
                    }
                    AFLogger.afDebugLog("Not configured for auto In-App purchase logging.");
                }
            });
            this.connector.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> getAdditionalParamsForSubscriptions(List<SubscriptionPurchaseEvent> purchaseEvents) {
        PurchaseClient.SubscriptionPurchaseEventDataSource subscriptionPurchaseEventDataSource = this.additionalParamsSourceForSubscriptions;
        Map<String, Object> onNewPurchases = subscriptionPurchaseEventDataSource != null ? subscriptionPurchaseEventDataSource.onNewPurchases(purchaseEvents) : null;
        return onNewPurchases == null ? MapsKt.emptyMap() : onNewPurchases;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> getAdditionalParamsForInApp(List<InAppPurchaseEvent> purchaseEvents) {
        PurchaseClient.InAppPurchaseEventDataSource inAppPurchaseEventDataSource = this.additionalParamsSourceForInApps;
        Map<String, Object> onNewPurchases = inAppPurchaseEventDataSource != null ? inAppPurchaseEventDataSource.onNewPurchases(purchaseEvents) : null;
        return onNewPurchases == null ? MapsKt.emptyMap() : onNewPurchases;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSubscriptionToServerAndReportResult(boolean sandbox, final boolean history, final List<SubscriptionPurchaseEvent> subs, Map<String, ? extends Object> additionalParams) {
        List<SubscriptionPurchaseEvent> list = subs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SubscriptionPurchaseEvent) it.next()).toJsonMap());
        }
        this.afClient.sendPurchaseData(this.context, createSignedRequestData(MapsKt.mutableMapOf(TuplesKt.to("subscriptions", arrayList), TuplesKt.to("is_cached", Boolean.valueOf(history))), sandbox, additionalParams), new PurchaseHandler.PurchaseValidationCallback() { // from class: com.appsflyer.api.PurchaseClientImpl$sendSubscriptionToServerAndReportResult$1
            @Override // com.appsflyer.PurchaseHandler.PurchaseValidationCallback
            public void onResponse(ResponseNetwork<String> response) {
                PurchaseClient.SubscriptionPurchaseValidationResultListener subscriptionPurchaseValidationResultListener;
                Context context;
                Intrinsics.checkNotNullParameter(response, "response");
                boolean isSuccessful = response.isSuccessful();
                if (isSuccessful) {
                    PurchaseClientImpl.this.saveTokens(subs);
                    if (history) {
                        context = PurchaseClientImpl.this.context;
                        ExtentionsKt.getSharedPreferences(context).edit().putBoolean(PurchaseClientImpl.ARS_HISTORY_SENT_KEY, true).apply();
                    }
                }
                subscriptionPurchaseValidationResultListener = PurchaseClientImpl.this.validationResultListener;
                if (subscriptionPurchaseValidationResultListener != null) {
                    if (isSuccessful) {
                        subscriptionPurchaseValidationResultListener.onResponse(ExtentionsKt.getSubscriptionValidationResult(response));
                        return;
                    }
                    String body = response.getBody();
                    Intrinsics.checkNotNullExpressionValue(body, "response.body");
                    subscriptionPurchaseValidationResultListener.onFailure(body, null);
                }
            }

            @Override // com.appsflyer.PurchaseHandler.PurchaseValidationCallback
            public void onFailure(Throwable throwable) {
                PurchaseClient.SubscriptionPurchaseValidationResultListener subscriptionPurchaseValidationResultListener;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                subscriptionPurchaseValidationResultListener = PurchaseClientImpl.this.validationResultListener;
                if (subscriptionPurchaseValidationResultListener != null) {
                    subscriptionPurchaseValidationResultListener.onFailure("[PurchaseConnector]: Communication exception", throwable);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendInAppToServerAndReportResult(boolean sandbox, final List<InAppPurchaseEvent> purchases, Map<String, ? extends Object> additionalParams) {
        List<InAppPurchaseEvent> list = purchases;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InAppPurchaseEvent) it.next()).toJsonMap());
        }
        this.afClient.sendInAppPurchaseData(this.context, createSignedRequestData(MapsKt.mutableMapOf(TuplesKt.to(PurchaseDatabaseHelper.TABLE_NAME, arrayList)), sandbox, additionalParams), new PurchaseHandler.PurchaseValidationCallback() { // from class: com.appsflyer.api.PurchaseClientImpl$sendInAppToServerAndReportResult$1
            @Override // com.appsflyer.PurchaseHandler.PurchaseValidationCallback
            public void onResponse(ResponseNetwork<String> response) {
                PurchaseClient.InAppPurchaseValidationResultListener inAppPurchaseValidationResultListener;
                Intrinsics.checkNotNullParameter(response, "response");
                boolean isSuccessful = response.isSuccessful();
                if (isSuccessful) {
                    PurchaseClientImpl.this.saveTokens(purchases);
                }
                inAppPurchaseValidationResultListener = PurchaseClientImpl.this.inAppValidationResultListener;
                if (inAppPurchaseValidationResultListener != null) {
                    if (isSuccessful) {
                        inAppPurchaseValidationResultListener.onResponse(ExtentionsKt.getInAppValidationResult(response));
                        return;
                    }
                    String body = response.getBody();
                    Intrinsics.checkNotNullExpressionValue(body, "response.body");
                    inAppPurchaseValidationResultListener.onFailure(body, null);
                }
            }

            @Override // com.appsflyer.PurchaseHandler.PurchaseValidationCallback
            public void onFailure(Throwable throwable) {
                PurchaseClient.SubscriptionPurchaseValidationResultListener subscriptionPurchaseValidationResultListener;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                subscriptionPurchaseValidationResultListener = PurchaseClientImpl.this.validationResultListener;
                if (subscriptionPurchaseValidationResultListener != null) {
                    subscriptionPurchaseValidationResultListener.onFailure("[PurchaseConnector]: Communication exception", throwable);
                }
            }
        });
    }

    private final Map<String, Object> createSignedRequestData(Map<String, Object> map, boolean z, Map<String, ? extends Object> map2) {
        map.put("environment", z ? "SANDBOX" : "PRODUCTION");
        map.put("billing_library_version", getBillingLibraryVersion());
        map.put("connector_version", BuildConfig.VERSION_NAME);
        if (!map2.isEmpty()) {
            map.put("additional_parameters", map2);
        }
        String signature = getSignature(map);
        if (signature != null) {
            map.put("sig", signature);
        }
        return map;
    }

    private final String getBillingLibraryVersion() {
        Object m213constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            PurchaseClientImpl purchaseClientImpl = this;
            Field declaredField = com.android.billingclient.BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            m213constructorimpl = Result.m213constructorimpl((String) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m213constructorimpl = Result.m213constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m219isFailureimpl(m213constructorimpl)) {
            m213constructorimpl = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return (String) m213constructorimpl;
    }

    private final String getSignature(Map<String, ? extends Object> map) {
        return HashUtils.hmacSha256(new JSONObject(map).toString() + this.afClient.getSdkVersion(), this.afClient.getAppsFlyerUID(this.context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveTokens(List<? extends PurchaseEvent> list) {
        List<? extends PurchaseEvent> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ExtentionsKt.sha256AsBase64(((PurchaseEvent) it.next()).getPurchaseToken()));
        }
        this.db.savePurchaseTokens(CollectionsKt.toSet(arrayList));
    }
}
