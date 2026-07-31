package com.appsflyer.internal.connectors;

import com.appsflyer.api.InAppPurchaseEvent;
import com.appsflyer.api.SubscriptionPurchaseEvent;
import java.util.List;

/* loaded from: classes.dex */
public interface BillingClientConnector {

    public interface BillingClientFactory<StoreClient> {
        StoreClient buildBillingClient();
    }

    public interface BillingUpdatesListener {
        void onNewInAppPurchases(List<InAppPurchaseEvent> list);

        void onNewSubscriptionPurchases(List<SubscriptionPurchaseEvent> list);

        void onSubscriptionPurchaseHistoryRetrieved(List<SubscriptionPurchaseEvent> list);
    }

    public interface ProductType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    boolean getStopped();

    void setListener(BillingUpdatesListener billingUpdatesListener);

    void start();

    void stop();
}
