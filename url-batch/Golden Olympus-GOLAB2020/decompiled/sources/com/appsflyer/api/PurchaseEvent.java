package com.appsflyer.api;

import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public abstract class PurchaseEvent implements AFPurchaseConnectorA1z {
    private final List<String> productIds;
    private final String productType;
    private final long purchaseTime;
    private final String purchaseToken;
    private final Store store;

    public PurchaseEvent(List<String> list, String str, Store store, String str2, long j4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(store, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.productIds = list;
        this.purchaseToken = str;
        this.store = store;
        this.productType = str2;
        this.purchaseTime = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        PurchaseEvent purchaseEvent = (PurchaseEvent) obj;
        return Intrinsics.areEqual(this.productIds, purchaseEvent.productIds) && Intrinsics.areEqual(this.purchaseToken, purchaseEvent.purchaseToken) && this.store == purchaseEvent.store && Intrinsics.areEqual(this.productType, purchaseEvent.productType);
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final Store getStore() {
        return this.store;
    }

    public int hashCode() {
        return (((((this.productIds.hashCode() * 31) + this.purchaseToken.hashCode()) * 31) + this.store.hashCode()) * 31) + this.productType.hashCode();
    }

    public Map<String, Object> toJsonMap() {
        return MapsKt.mutableMapOf(TuplesKt.to("purchase_token", this.purchaseToken), TuplesKt.to("product_ids", this.productIds), TuplesKt.to("product_type", this.productType), TuplesKt.to("purchase_time", Long.valueOf(this.purchaseTime)));
    }
}
