package dev.hyo.openiap;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Ldev/hyo/openiap/ProductRequest;", "", "skus", "", "", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/ProductQueryType;", "<init>", "(Ljava/util/List;Ldev/hyo/openiap/ProductQueryType;)V", "getSkus", "()Ljava/util/List;", "getType", "()Ldev/hyo/openiap/ProductQueryType;", "toJson", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductRequest {
    private final List<String> skus;
    private final ProductQueryType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductRequest copy$default(ProductRequest productRequest, List list, ProductQueryType productQueryType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productRequest.skus;
        }
        if ((i & 2) != 0) {
            productQueryType = productRequest.type;
        }
        return productRequest.copy(list, productQueryType);
    }

    public final List<String> component1() {
        return this.skus;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductQueryType getType() {
        return this.type;
    }

    public final ProductRequest copy(List<String> skus, ProductQueryType type) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        return new ProductRequest(skus, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductRequest)) {
            return false;
        }
        ProductRequest productRequest = (ProductRequest) other;
        return Intrinsics.areEqual(this.skus, productRequest.skus) && this.type == productRequest.type;
    }

    public int hashCode() {
        int hashCode = this.skus.hashCode() * 31;
        ProductQueryType productQueryType = this.type;
        return hashCode + (productQueryType == null ? 0 : productQueryType.hashCode());
    }

    public String toString() {
        return "ProductRequest(skus=" + this.skus + ", type=" + this.type + ")";
    }

    public ProductRequest(List<String> skus, ProductQueryType productQueryType) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        this.skus = skus;
        this.type = productQueryType;
    }

    public /* synthetic */ ProductRequest(List list, ProductQueryType productQueryType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : productQueryType);
    }

    public final List<String> getSkus() {
        return this.skus;
    }

    public final ProductQueryType getType() {
        return this.type;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ProductRequest$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ProductRequest;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProductRequest fromJson(Map<String, ? extends Object> json) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("skus");
            List list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Object obj3 = json.get(WebViewManager.EVENT_TYPE_KEY);
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            ProductQueryType fromJson = str2 != null ? ProductQueryType.INSTANCE.fromJson(str2) : null;
            if (arrayList == null) {
                return null;
            }
            return new ProductRequest(arrayList, fromJson);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("skus", this.skus);
        ProductQueryType productQueryType = this.type;
        pairArr[1] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, productQueryType != null ? productQueryType.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
