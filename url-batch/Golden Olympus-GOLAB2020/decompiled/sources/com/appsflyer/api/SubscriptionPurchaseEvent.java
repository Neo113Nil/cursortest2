package com.appsflyer.api;

import com.appsflyer.api.models.SubscriptionOfferDetails;
import java.util.ArrayList;
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
public final class SubscriptionPurchaseEvent extends PurchaseEvent {
    private final Map<String, List<SubscriptionOfferDetails>> subscriptionOfferDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionPurchaseEvent(List<String> list, String str, Store store, long j4, Map<String, ? extends List<SubscriptionOfferDetails>> map) {
        super(list, str, store, "subs", j4);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(store, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.subscriptionOfferDetails = map;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(SubscriptionPurchaseEvent.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        return Intrinsics.areEqual(this.subscriptionOfferDetails, ((SubscriptionPurchaseEvent) obj).subscriptionOfferDetails);
    }

    public final Map<String, List<SubscriptionOfferDetails>> getSubscriptionOfferDetails() {
        return this.subscriptionOfferDetails;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final int hashCode() {
        return (super.hashCode() * 31) + this.subscriptionOfferDetails.hashCode();
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final Map<String, Object> toJsonMap() {
        ArrayList arrayList;
        Map<String, Object> jsonMap = super.toJsonMap();
        Set<Map.Entry<String, List<SubscriptionOfferDetails>>> entrySet = this.subscriptionOfferDetails.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((SubscriptionOfferDetails) it2.next()).toJsonMap());
                }
            } else {
                arrayList = null;
            }
            Pair pair = TuplesKt.to(key, arrayList);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        jsonMap.put("subscription_offer_details", linkedHashMap);
        return jsonMap;
    }
}
