package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00052\u00020\u0001:\u0003\u0005\u0006\u0007J\u0016\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H&\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ldev/hyo/openiap/ProductOrSubscription;", "", "toJson", "", "", "Companion", "ProductItem", "ProductSubscriptionItem", "Ldev/hyo/openiap/ProductOrSubscription$ProductItem;", "Ldev/hyo/openiap/ProductOrSubscription$ProductSubscriptionItem;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductOrSubscription {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Map<String, Object> toJson();

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ProductOrSubscription$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ProductOrSubscription;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public final ProductOrSubscription fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String str = (String) json.get("__typename");
            if (str != null) {
                switch (str.hashCode()) {
                    case -1997196640:
                        if (str.equals("ProductAndroid")) {
                            return new ProductItem(Product.INSTANCE.fromJson(json));
                        }
                        break;
                    case -548515650:
                        if (str.equals("ProductIOS")) {
                            return new ProductItem(Product.INSTANCE.fromJson(json));
                        }
                        break;
                    case 128820547:
                        if (str.equals("ProductSubscriptionAndroid")) {
                            return new ProductSubscriptionItem(ProductSubscription.INSTANCE.fromJson(json));
                        }
                        break;
                    case 454528225:
                        if (str.equals("ProductSubscriptionIOS")) {
                            return new ProductSubscriptionItem(ProductSubscription.INSTANCE.fromJson(json));
                        }
                        break;
                }
            }
            throw new IllegalArgumentException("Unknown __typename for ProductOrSubscription: " + json.get("__typename"));
        }
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Ldev/hyo/openiap/ProductOrSubscription$ProductItem;", "Ldev/hyo/openiap/ProductOrSubscription;", "value", "Ldev/hyo/openiap/Product;", "<init>", "(Ldev/hyo/openiap/Product;)V", "getValue", "()Ldev/hyo/openiap/Product;", "toJson", "", "", "", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductItem implements ProductOrSubscription {
        public static final int $stable = 8;
        private final Product value;

        public static /* synthetic */ ProductItem copy$default(ProductItem productItem, Product product, int i, Object obj) {
            if ((i & 1) != 0) {
                product = productItem.value;
            }
            return productItem.copy(product);
        }

        /* renamed from: component1, reason: from getter */
        public final Product getValue() {
            return this.value;
        }

        public final ProductItem copy(Product value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ProductItem(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProductItem) && Intrinsics.areEqual(this.value, ((ProductItem) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ProductItem(value=" + this.value + ")";
        }

        public ProductItem(Product value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final Product getValue() {
            return this.value;
        }

        @Override // dev.hyo.openiap.ProductOrSubscription
        public Map<String, Object> toJson() {
            return this.value.toJson();
        }
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Ldev/hyo/openiap/ProductOrSubscription$ProductSubscriptionItem;", "Ldev/hyo/openiap/ProductOrSubscription;", "value", "Ldev/hyo/openiap/ProductSubscription;", "<init>", "(Ldev/hyo/openiap/ProductSubscription;)V", "getValue", "()Ldev/hyo/openiap/ProductSubscription;", "toJson", "", "", "", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductSubscriptionItem implements ProductOrSubscription {
        public static final int $stable = 8;
        private final ProductSubscription value;

        public static /* synthetic */ ProductSubscriptionItem copy$default(ProductSubscriptionItem productSubscriptionItem, ProductSubscription productSubscription, int i, Object obj) {
            if ((i & 1) != 0) {
                productSubscription = productSubscriptionItem.value;
            }
            return productSubscriptionItem.copy(productSubscription);
        }

        /* renamed from: component1, reason: from getter */
        public final ProductSubscription getValue() {
            return this.value;
        }

        public final ProductSubscriptionItem copy(ProductSubscription value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ProductSubscriptionItem(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProductSubscriptionItem) && Intrinsics.areEqual(this.value, ((ProductSubscriptionItem) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ProductSubscriptionItem(value=" + this.value + ")";
        }

        public ProductSubscriptionItem(ProductSubscription value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final ProductSubscription getValue() {
            return this.value;
        }

        @Override // dev.hyo.openiap.ProductOrSubscription
        public Map<String, Object> toJson() {
            return this.value.toJson();
        }
    }
}
