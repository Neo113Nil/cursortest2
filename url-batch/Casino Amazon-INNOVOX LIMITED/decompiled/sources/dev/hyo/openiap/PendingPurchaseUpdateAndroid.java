package dev.hyo.openiap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Ldev/hyo/openiap/PendingPurchaseUpdateAndroid;", "", "products", "", "", "purchaseToken", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getProducts", "()Ljava/util/List;", "getPurchaseToken", "()Ljava/lang/String;", "toJson", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PendingPurchaseUpdateAndroid {
    private final List<String> products;
    private final String purchaseToken;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingPurchaseUpdateAndroid copy$default(PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pendingPurchaseUpdateAndroid.products;
        }
        if ((i & 2) != 0) {
            str = pendingPurchaseUpdateAndroid.purchaseToken;
        }
        return pendingPurchaseUpdateAndroid.copy(list, str);
    }

    public final List<String> component1() {
        return this.products;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PendingPurchaseUpdateAndroid copy(List<String> products, String purchaseToken) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        return new PendingPurchaseUpdateAndroid(products, purchaseToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingPurchaseUpdateAndroid)) {
            return false;
        }
        PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid = (PendingPurchaseUpdateAndroid) other;
        return Intrinsics.areEqual(this.products, pendingPurchaseUpdateAndroid.products) && Intrinsics.areEqual(this.purchaseToken, pendingPurchaseUpdateAndroid.purchaseToken);
    }

    public int hashCode() {
        return (this.products.hashCode() * 31) + this.purchaseToken.hashCode();
    }

    public String toString() {
        return "PendingPurchaseUpdateAndroid(products=" + this.products + ", purchaseToken=" + this.purchaseToken + ")";
    }

    public PendingPurchaseUpdateAndroid(List<String> products, String purchaseToken) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.products = products;
        this.purchaseToken = purchaseToken;
    }

    public final List<String> getProducts() {
        return this.products;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/PendingPurchaseUpdateAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/PendingPurchaseUpdateAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PendingPurchaseUpdateAndroid fromJson(Map<String, ? extends Object> json) {
            ArrayList emptyList;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("products");
            List list = obj instanceof List ? (List) obj : null;
            if (list == null) {
                emptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                emptyList = arrayList;
            }
            Object obj3 = json.get("purchaseToken");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 == null) {
                str2 = "";
            }
            return new PendingPurchaseUpdateAndroid(emptyList, str2);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "PendingPurchaseUpdateAndroid"), TuplesKt.to("products", this.products), TuplesKt.to("purchaseToken", this.purchaseToken));
    }
}
