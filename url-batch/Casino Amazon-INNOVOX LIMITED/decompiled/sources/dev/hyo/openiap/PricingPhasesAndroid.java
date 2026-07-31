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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Ldev/hyo/openiap/PricingPhasesAndroid;", "", "pricingPhaseList", "", "Ldev/hyo/openiap/PricingPhaseAndroid;", "<init>", "(Ljava/util/List;)V", "getPricingPhaseList", "()Ljava/util/List;", "toJson", "", "", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PricingPhasesAndroid {
    private final List<PricingPhaseAndroid> pricingPhaseList;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PricingPhasesAndroid copy$default(PricingPhasesAndroid pricingPhasesAndroid, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pricingPhasesAndroid.pricingPhaseList;
        }
        return pricingPhasesAndroid.copy(list);
    }

    public final List<PricingPhaseAndroid> component1() {
        return this.pricingPhaseList;
    }

    public final PricingPhasesAndroid copy(List<PricingPhaseAndroid> pricingPhaseList) {
        Intrinsics.checkNotNullParameter(pricingPhaseList, "pricingPhaseList");
        return new PricingPhasesAndroid(pricingPhaseList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PricingPhasesAndroid) && Intrinsics.areEqual(this.pricingPhaseList, ((PricingPhasesAndroid) other).pricingPhaseList);
    }

    public int hashCode() {
        return this.pricingPhaseList.hashCode();
    }

    public String toString() {
        return "PricingPhasesAndroid(pricingPhaseList=" + this.pricingPhaseList + ")";
    }

    public PricingPhasesAndroid(List<PricingPhaseAndroid> pricingPhaseList) {
        Intrinsics.checkNotNullParameter(pricingPhaseList, "pricingPhaseList");
        this.pricingPhaseList = pricingPhaseList;
    }

    public final List<PricingPhaseAndroid> getPricingPhaseList() {
        return this.pricingPhaseList;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/PricingPhasesAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/PricingPhasesAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PricingPhasesAndroid fromJson(Map<String, ? extends Object> json) {
            ArrayList emptyList;
            PricingPhaseAndroid fromJson;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("pricingPhaseList");
            List list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    Map<String, ? extends Object> map = obj2 instanceof Map ? (Map) obj2 : null;
                    if (map == null || (fromJson = PricingPhaseAndroid.INSTANCE.fromJson(map)) == null) {
                        throw new IllegalArgumentException("Missing required object for PricingPhaseAndroid");
                    }
                    if (fromJson != null) {
                        arrayList.add(fromJson);
                    }
                }
                emptyList = arrayList;
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            return new PricingPhasesAndroid(emptyList);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("__typename", "PricingPhasesAndroid");
        List<PricingPhaseAndroid> list = this.pricingPhaseList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PricingPhaseAndroid) it.next()).toJson());
        }
        pairArr[1] = TuplesKt.to("pricingPhaseList", arrayList);
        return MapsKt.mapOf(pairArr);
    }
}
