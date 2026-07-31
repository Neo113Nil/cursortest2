package dev.hyo.openiap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Ldev/hyo/openiap/SubscriptionInfoIOS;", "", "introductoryOffer", "Ldev/hyo/openiap/SubscriptionOfferIOS;", "promotionalOffers", "", "subscriptionGroupId", "", "subscriptionPeriod", "Ldev/hyo/openiap/SubscriptionPeriodValueIOS;", "<init>", "(Ldev/hyo/openiap/SubscriptionOfferIOS;Ljava/util/List;Ljava/lang/String;Ldev/hyo/openiap/SubscriptionPeriodValueIOS;)V", "getIntroductoryOffer", "()Ldev/hyo/openiap/SubscriptionOfferIOS;", "getPromotionalOffers", "()Ljava/util/List;", "getSubscriptionGroupId", "()Ljava/lang/String;", "getSubscriptionPeriod", "()Ldev/hyo/openiap/SubscriptionPeriodValueIOS;", "toJson", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionInfoIOS {
    private final SubscriptionOfferIOS introductoryOffer;
    private final List<SubscriptionOfferIOS> promotionalOffers;
    private final String subscriptionGroupId;
    private final SubscriptionPeriodValueIOS subscriptionPeriod;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionInfoIOS copy$default(SubscriptionInfoIOS subscriptionInfoIOS, SubscriptionOfferIOS subscriptionOfferIOS, List list, String str, SubscriptionPeriodValueIOS subscriptionPeriodValueIOS, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionOfferIOS = subscriptionInfoIOS.introductoryOffer;
        }
        if ((i & 2) != 0) {
            list = subscriptionInfoIOS.promotionalOffers;
        }
        if ((i & 4) != 0) {
            str = subscriptionInfoIOS.subscriptionGroupId;
        }
        if ((i & 8) != 0) {
            subscriptionPeriodValueIOS = subscriptionInfoIOS.subscriptionPeriod;
        }
        return subscriptionInfoIOS.copy(subscriptionOfferIOS, list, str, subscriptionPeriodValueIOS);
    }

    /* renamed from: component1, reason: from getter */
    public final SubscriptionOfferIOS getIntroductoryOffer() {
        return this.introductoryOffer;
    }

    public final List<SubscriptionOfferIOS> component2() {
        return this.promotionalOffers;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubscriptionGroupId() {
        return this.subscriptionGroupId;
    }

    /* renamed from: component4, reason: from getter */
    public final SubscriptionPeriodValueIOS getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public final SubscriptionInfoIOS copy(SubscriptionOfferIOS introductoryOffer, List<SubscriptionOfferIOS> promotionalOffers, String subscriptionGroupId, SubscriptionPeriodValueIOS subscriptionPeriod) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        Intrinsics.checkNotNullParameter(subscriptionPeriod, "subscriptionPeriod");
        return new SubscriptionInfoIOS(introductoryOffer, promotionalOffers, subscriptionGroupId, subscriptionPeriod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionInfoIOS)) {
            return false;
        }
        SubscriptionInfoIOS subscriptionInfoIOS = (SubscriptionInfoIOS) other;
        return Intrinsics.areEqual(this.introductoryOffer, subscriptionInfoIOS.introductoryOffer) && Intrinsics.areEqual(this.promotionalOffers, subscriptionInfoIOS.promotionalOffers) && Intrinsics.areEqual(this.subscriptionGroupId, subscriptionInfoIOS.subscriptionGroupId) && Intrinsics.areEqual(this.subscriptionPeriod, subscriptionInfoIOS.subscriptionPeriod);
    }

    public int hashCode() {
        SubscriptionOfferIOS subscriptionOfferIOS = this.introductoryOffer;
        int hashCode = (subscriptionOfferIOS == null ? 0 : subscriptionOfferIOS.hashCode()) * 31;
        List<SubscriptionOfferIOS> list = this.promotionalOffers;
        return ((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.subscriptionGroupId.hashCode()) * 31) + this.subscriptionPeriod.hashCode();
    }

    public String toString() {
        return "SubscriptionInfoIOS(introductoryOffer=" + this.introductoryOffer + ", promotionalOffers=" + this.promotionalOffers + ", subscriptionGroupId=" + this.subscriptionGroupId + ", subscriptionPeriod=" + this.subscriptionPeriod + ")";
    }

    public SubscriptionInfoIOS(SubscriptionOfferIOS subscriptionOfferIOS, List<SubscriptionOfferIOS> list, String subscriptionGroupId, SubscriptionPeriodValueIOS subscriptionPeriod) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        Intrinsics.checkNotNullParameter(subscriptionPeriod, "subscriptionPeriod");
        this.introductoryOffer = subscriptionOfferIOS;
        this.promotionalOffers = list;
        this.subscriptionGroupId = subscriptionGroupId;
        this.subscriptionPeriod = subscriptionPeriod;
    }

    public /* synthetic */ SubscriptionInfoIOS(SubscriptionOfferIOS subscriptionOfferIOS, List list, String str, SubscriptionPeriodValueIOS subscriptionPeriodValueIOS, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : subscriptionOfferIOS, (i & 2) != 0 ? null : list, str, subscriptionPeriodValueIOS);
    }

    public final SubscriptionOfferIOS getIntroductoryOffer() {
        return this.introductoryOffer;
    }

    public final List<SubscriptionOfferIOS> getPromotionalOffers() {
        return this.promotionalOffers;
    }

    public final String getSubscriptionGroupId() {
        return this.subscriptionGroupId;
    }

    public final SubscriptionPeriodValueIOS getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/SubscriptionInfoIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/SubscriptionInfoIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SubscriptionInfoIOS fromJson(Map<String, ? extends Object> json) {
            ArrayList arrayList;
            SubscriptionPeriodValueIOS fromJson;
            SubscriptionOfferIOS fromJson2;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("introductoryOffer");
            Map<String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
            SubscriptionOfferIOS fromJson3 = map != null ? SubscriptionOfferIOS.INSTANCE.fromJson(map) : null;
            Object obj2 = json.get("promotionalOffers");
            List list = obj2 instanceof List ? (List) obj2 : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    Map<String, ? extends Object> map2 = obj3 instanceof Map ? (Map) obj3 : null;
                    if (map2 == null || (fromJson2 = SubscriptionOfferIOS.INSTANCE.fromJson(map2)) == null) {
                        throw new IllegalArgumentException("Missing required object for SubscriptionOfferIOS");
                    }
                    if (fromJson2 != null) {
                        arrayList2.add(fromJson2);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Object obj4 = json.get("subscriptionGroupId");
            String str = obj4 instanceof String ? (String) obj4 : null;
            if (str == null) {
                str = "";
            }
            Object obj5 = json.get("subscriptionPeriod");
            Map<String, ? extends Object> map3 = obj5 instanceof Map ? (Map) obj5 : null;
            if (map3 != null && (fromJson = SubscriptionPeriodValueIOS.INSTANCE.fromJson(map3)) != null) {
                return new SubscriptionInfoIOS(fromJson3, arrayList, str, fromJson);
            }
            throw new IllegalArgumentException("Missing required object for SubscriptionPeriodValueIOS");
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to("__typename", "SubscriptionInfoIOS");
        SubscriptionOfferIOS subscriptionOfferIOS = this.introductoryOffer;
        ArrayList arrayList = null;
        pairArr[1] = TuplesKt.to("introductoryOffer", subscriptionOfferIOS != null ? subscriptionOfferIOS.toJson() : null);
        List<SubscriptionOfferIOS> list = this.promotionalOffers;
        if (list != null) {
            List<SubscriptionOfferIOS> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((SubscriptionOfferIOS) it.next()).toJson());
            }
            arrayList = arrayList2;
        }
        pairArr[2] = TuplesKt.to("promotionalOffers", arrayList);
        pairArr[3] = TuplesKt.to("subscriptionGroupId", this.subscriptionGroupId);
        pairArr[4] = TuplesKt.to("subscriptionPeriod", this.subscriptionPeriod.toJson());
        return MapsKt.mapOf(pairArr);
    }
}
