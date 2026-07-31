package com.appsflyer.api;

import com.appsflyer.api.models.OneTimePurchaseOfferDetails;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

@Metadata
/* loaded from: classes.dex */
public final class InAppPurchaseEvent extends PurchaseEvent {
    private final Map<String, OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetails;
    private final String packageName;
    private final int quantity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseEvent(List<String> list, String str, Store store, long j4, String str2, int i4, Map<String, OneTimePurchaseOfferDetails> map) {
        super(list, str, store, "inapp", j4);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(store, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.packageName = str2;
        this.quantity = i4;
        this.oneTimePurchaseOfferDetails = map;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(InAppPurchaseEvent.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        InAppPurchaseEvent inAppPurchaseEvent = (InAppPurchaseEvent) obj;
        return Intrinsics.areEqual(this.packageName, inAppPurchaseEvent.packageName) && this.quantity == inAppPurchaseEvent.quantity && Intrinsics.areEqual(this.oneTimePurchaseOfferDetails, inAppPurchaseEvent.oneTimePurchaseOfferDetails);
    }

    public final Map<String, OneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetails() {
        return this.oneTimePurchaseOfferDetails;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final int hashCode() {
        return (((((super.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.quantity) * 31) + this.oneTimePurchaseOfferDetails.hashCode();
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final Map<String, Object> toJsonMap() {
        Map<String, Object> jsonMap = super.toJsonMap();
        Set<Map.Entry<String, OneTimePurchaseOfferDetails>> entrySet = this.oneTimePurchaseOfferDetails.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = (OneTimePurchaseOfferDetails) entry.getValue();
            Pair pair = TuplesKt.to(key, oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.toJsonMap() : null);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        jsonMap.put(b9.h.f15462V, this.packageName);
        jsonMap.put("one_time_purchase_offer_details", linkedHashMap);
        jsonMap.put(FirebaseAnalytics.Param.QUANTITY, Integer.valueOf(this.quantity));
        return jsonMap;
    }
}
