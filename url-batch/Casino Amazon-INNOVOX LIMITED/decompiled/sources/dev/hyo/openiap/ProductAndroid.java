package dev.hyo.openiap;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
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
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QBÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010807H\u0016J\t\u00109\u001a\u00020\u0004HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010;\u001a\u00020\u0004HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010>\u001a\u00020\u0004HÆ\u0003J\t\u0010?\u001a\u00020\u0004HÆ\u0003J\t\u0010@\u001a\u00020\u0004HÆ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bHÆ\u0003J\t\u0010B\u001a\u00020\u0011HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010D\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\bHÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\bHÆ\u0003J\t\u0010G\u001a\u00020\u0004HÆ\u0003J\t\u0010H\u001a\u00020\u001cHÆ\u0003JÖ\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\b2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u000108HÖ\u0003J\t\u0010N\u001a\u00020OHÖ\u0001J\t\u0010P\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0014\u0010\u001a\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006R"}, d2 = {"Ldev/hyo/openiap/ProductAndroid;", "Ldev/hyo/openiap/ProductCommon;", "Ldev/hyo/openiap/Product;", "currency", "", "debugDescription", "description", "discountOffers", "", "Ldev/hyo/openiap/DiscountOffer;", "displayName", "displayPrice", "id", "nameAndroid", "oneTimePurchaseOfferDetailsAndroid", "Ldev/hyo/openiap/ProductAndroidOneTimePurchaseOfferDetail;", "platform", "Ldev/hyo/openiap/IapPlatform;", "price", "", "productStatusAndroid", "Ldev/hyo/openiap/ProductStatusAndroid;", "subscriptionOfferDetailsAndroid", "Ldev/hyo/openiap/ProductSubscriptionAndroidOfferDetails;", "subscriptionOffers", "Ldev/hyo/openiap/SubscriptionOffer;", "title", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/ProductType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ldev/hyo/openiap/IapPlatform;Ljava/lang/Double;Ldev/hyo/openiap/ProductStatusAndroid;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ldev/hyo/openiap/ProductType;)V", "getCurrency", "()Ljava/lang/String;", "getDebugDescription", "getDescription", "getDiscountOffers", "()Ljava/util/List;", "getDisplayName", "getDisplayPrice", "getId", "getNameAndroid", "getOneTimePurchaseOfferDetailsAndroid", "getPlatform", "()Ldev/hyo/openiap/IapPlatform;", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getProductStatusAndroid", "()Ldev/hyo/openiap/ProductStatusAndroid;", "getSubscriptionOfferDetailsAndroid", "getSubscriptionOffers", "getTitle", "getType", "()Ldev/hyo/openiap/ProductType;", "toJson", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ldev/hyo/openiap/IapPlatform;Ljava/lang/Double;Ldev/hyo/openiap/ProductStatusAndroid;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ldev/hyo/openiap/ProductType;)Ldev/hyo/openiap/ProductAndroid;", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductAndroid implements ProductCommon, Product {
    private final String currency;
    private final String debugDescription;
    private final String description;
    private final List<DiscountOffer> discountOffers;
    private final String displayName;
    private final String displayPrice;
    private final String id;
    private final String nameAndroid;
    private final List<ProductAndroidOneTimePurchaseOfferDetail> oneTimePurchaseOfferDetailsAndroid;
    private final IapPlatform platform;
    private final Double price;
    private final ProductStatusAndroid productStatusAndroid;
    private final List<ProductSubscriptionAndroidOfferDetails> subscriptionOfferDetailsAndroid;
    private final List<SubscriptionOffer> subscriptionOffers;
    private final String title;
    private final ProductType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ ProductAndroid copy$default(ProductAndroid productAndroid, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, List list2, IapPlatform iapPlatform, Double d, ProductStatusAndroid productStatusAndroid, List list3, List list4, String str8, ProductType productType, int i, Object obj) {
        String str9 = (i & 1) != 0 ? productAndroid.currency : str;
        return productAndroid.copy(str9, (i & 2) != 0 ? productAndroid.debugDescription : str2, (i & 4) != 0 ? productAndroid.description : str3, (i & 8) != 0 ? productAndroid.discountOffers : list, (i & 16) != 0 ? productAndroid.displayName : str4, (i & 32) != 0 ? productAndroid.displayPrice : str5, (i & 64) != 0 ? productAndroid.id : str6, (i & 128) != 0 ? productAndroid.nameAndroid : str7, (i & 256) != 0 ? productAndroid.oneTimePurchaseOfferDetailsAndroid : list2, (i & 512) != 0 ? productAndroid.platform : iapPlatform, (i & 1024) != 0 ? productAndroid.price : d, (i & 2048) != 0 ? productAndroid.productStatusAndroid : productStatusAndroid, (i & 4096) != 0 ? productAndroid.subscriptionOfferDetailsAndroid : list3, (i & 8192) != 0 ? productAndroid.subscriptionOffers : list4, (i & 16384) != 0 ? productAndroid.title : str8, (i & 32768) != 0 ? productAndroid.type : productType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component10, reason: from getter */
    public final IapPlatform getPlatform() {
        return this.platform;
    }

    /* renamed from: component11, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    /* renamed from: component12, reason: from getter */
    public final ProductStatusAndroid getProductStatusAndroid() {
        return this.productStatusAndroid;
    }

    public final List<ProductSubscriptionAndroidOfferDetails> component13() {
        return this.subscriptionOfferDetailsAndroid;
    }

    public final List<SubscriptionOffer> component14() {
        return this.subscriptionOffers;
    }

    /* renamed from: component15, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component16, reason: from getter */
    public final ProductType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDebugDescription() {
        return this.debugDescription;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<DiscountOffer> component4() {
        return this.discountOffers;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    /* renamed from: component7, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNameAndroid() {
        return this.nameAndroid;
    }

    public final List<ProductAndroidOneTimePurchaseOfferDetail> component9() {
        return this.oneTimePurchaseOfferDetailsAndroid;
    }

    public final ProductAndroid copy(String currency, String debugDescription, String description, List<DiscountOffer> discountOffers, String displayName, String displayPrice, String id, String nameAndroid, List<ProductAndroidOneTimePurchaseOfferDetail> oneTimePurchaseOfferDetailsAndroid, IapPlatform platform, Double price, ProductStatusAndroid productStatusAndroid, List<ProductSubscriptionAndroidOfferDetails> subscriptionOfferDetailsAndroid, List<SubscriptionOffer> subscriptionOffers, String title, ProductType type) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nameAndroid, "nameAndroid");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ProductAndroid(currency, debugDescription, description, discountOffers, displayName, displayPrice, id, nameAndroid, oneTimePurchaseOfferDetailsAndroid, platform, price, productStatusAndroid, subscriptionOfferDetailsAndroid, subscriptionOffers, title, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductAndroid)) {
            return false;
        }
        ProductAndroid productAndroid = (ProductAndroid) other;
        return Intrinsics.areEqual(this.currency, productAndroid.currency) && Intrinsics.areEqual(this.debugDescription, productAndroid.debugDescription) && Intrinsics.areEqual(this.description, productAndroid.description) && Intrinsics.areEqual(this.discountOffers, productAndroid.discountOffers) && Intrinsics.areEqual(this.displayName, productAndroid.displayName) && Intrinsics.areEqual(this.displayPrice, productAndroid.displayPrice) && Intrinsics.areEqual(this.id, productAndroid.id) && Intrinsics.areEqual(this.nameAndroid, productAndroid.nameAndroid) && Intrinsics.areEqual(this.oneTimePurchaseOfferDetailsAndroid, productAndroid.oneTimePurchaseOfferDetailsAndroid) && this.platform == productAndroid.platform && Intrinsics.areEqual((Object) this.price, (Object) productAndroid.price) && this.productStatusAndroid == productAndroid.productStatusAndroid && Intrinsics.areEqual(this.subscriptionOfferDetailsAndroid, productAndroid.subscriptionOfferDetailsAndroid) && Intrinsics.areEqual(this.subscriptionOffers, productAndroid.subscriptionOffers) && Intrinsics.areEqual(this.title, productAndroid.title) && this.type == productAndroid.type;
    }

    public int hashCode() {
        int hashCode = this.currency.hashCode() * 31;
        String str = this.debugDescription;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.description.hashCode()) * 31;
        List<DiscountOffer> list = this.discountOffers;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.displayName;
        int hashCode4 = (((((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.displayPrice.hashCode()) * 31) + this.id.hashCode()) * 31) + this.nameAndroid.hashCode()) * 31;
        List<ProductAndroidOneTimePurchaseOfferDetail> list2 = this.oneTimePurchaseOfferDetailsAndroid;
        int hashCode5 = (((hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.platform.hashCode()) * 31;
        Double d = this.price;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        ProductStatusAndroid productStatusAndroid = this.productStatusAndroid;
        int hashCode7 = (hashCode6 + (productStatusAndroid == null ? 0 : productStatusAndroid.hashCode())) * 31;
        List<ProductSubscriptionAndroidOfferDetails> list3 = this.subscriptionOfferDetailsAndroid;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<SubscriptionOffer> list4 = this.subscriptionOffers;
        return ((((hashCode8 + (list4 != null ? list4.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "ProductAndroid(currency=" + this.currency + ", debugDescription=" + this.debugDescription + ", description=" + this.description + ", discountOffers=" + this.discountOffers + ", displayName=" + this.displayName + ", displayPrice=" + this.displayPrice + ", id=" + this.id + ", nameAndroid=" + this.nameAndroid + ", oneTimePurchaseOfferDetailsAndroid=" + this.oneTimePurchaseOfferDetailsAndroid + ", platform=" + this.platform + ", price=" + this.price + ", productStatusAndroid=" + this.productStatusAndroid + ", subscriptionOfferDetailsAndroid=" + this.subscriptionOfferDetailsAndroid + ", subscriptionOffers=" + this.subscriptionOffers + ", title=" + this.title + ", type=" + this.type + ")";
    }

    public ProductAndroid(String currency, String str, String description, List<DiscountOffer> list, String str2, String displayPrice, String id, String nameAndroid, List<ProductAndroidOneTimePurchaseOfferDetail> list2, IapPlatform platform, Double d, ProductStatusAndroid productStatusAndroid, List<ProductSubscriptionAndroidOfferDetails> list3, List<SubscriptionOffer> list4, String title, ProductType type) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nameAndroid, "nameAndroid");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.currency = currency;
        this.debugDescription = str;
        this.description = description;
        this.discountOffers = list;
        this.displayName = str2;
        this.displayPrice = displayPrice;
        this.id = id;
        this.nameAndroid = nameAndroid;
        this.oneTimePurchaseOfferDetailsAndroid = list2;
        this.platform = platform;
        this.price = d;
        this.productStatusAndroid = productStatusAndroid;
        this.subscriptionOfferDetailsAndroid = list3;
        this.subscriptionOffers = list4;
        this.title = title;
        this.type = type;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public String getCurrency() {
        return this.currency;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public String getDebugDescription() {
        return this.debugDescription;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public String getDescription() {
        return this.description;
    }

    public final List<DiscountOffer> getDiscountOffers() {
        return this.discountOffers;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public String getDisplayPrice() {
        return this.displayPrice;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public String getId() {
        return this.id;
    }

    public final String getNameAndroid() {
        return this.nameAndroid;
    }

    public final List<ProductAndroidOneTimePurchaseOfferDetail> getOneTimePurchaseOfferDetailsAndroid() {
        return this.oneTimePurchaseOfferDetailsAndroid;
    }

    public /* synthetic */ ProductAndroid(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, List list2, IapPlatform iapPlatform, Double d, ProductStatusAndroid productStatusAndroid, List list3, List list4, String str8, ProductType productType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4, str5, str6, str7, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? IapPlatform.Android : iapPlatform, (i & 1024) != 0 ? null : d, (i & 2048) != 0 ? null : productStatusAndroid, (i & 4096) != 0 ? null : list3, (i & 8192) != 0 ? null : list4, str8, (i & 32768) != 0 ? ProductType.InApp : productType);
    }

    @Override // dev.hyo.openiap.ProductCommon
    public IapPlatform getPlatform() {
        return this.platform;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public Double getPrice() {
        return this.price;
    }

    public final ProductStatusAndroid getProductStatusAndroid() {
        return this.productStatusAndroid;
    }

    public final List<ProductSubscriptionAndroidOfferDetails> getSubscriptionOfferDetailsAndroid() {
        return this.subscriptionOfferDetailsAndroid;
    }

    public final List<SubscriptionOffer> getSubscriptionOffers() {
        return this.subscriptionOffers;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public String getTitle() {
        return this.title;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public ProductType getType() {
        return this.type;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ProductAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ProductAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProductAndroid fromJson(Map<String, ? extends Object> json) {
            ArrayList arrayList;
            ArrayList arrayList2;
            IapPlatform iapPlatform;
            ArrayList arrayList3;
            String str;
            ArrayList arrayList4;
            ProductType productType;
            SubscriptionOffer fromJson;
            ProductSubscriptionAndroidOfferDetails fromJson2;
            ProductAndroidOneTimePurchaseOfferDetail fromJson3;
            DiscountOffer fromJson4;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("currency");
            String str2 = obj instanceof String ? (String) obj : null;
            String str3 = "";
            String str4 = str2 == null ? "" : str2;
            Object obj2 = json.get("debugDescription");
            String str5 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = json.get("description");
            String str6 = obj3 instanceof String ? (String) obj3 : null;
            String str7 = str6 == null ? "" : str6;
            Object obj4 = json.get("discountOffers");
            List list = obj4 instanceof List ? (List) obj4 : null;
            if (list != null) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list) {
                    Map<String, ? extends Object> map = obj5 instanceof Map ? (Map) obj5 : null;
                    if (map == null || (fromJson4 = DiscountOffer.INSTANCE.fromJson(map)) == null) {
                        throw new IllegalArgumentException("Missing required object for DiscountOffer");
                    }
                    if (fromJson4 != null) {
                        arrayList5.add(fromJson4);
                    }
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            Object obj6 = json.get("displayName");
            String str8 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = json.get("displayPrice");
            String str9 = obj7 instanceof String ? (String) obj7 : null;
            String str10 = str9 == null ? "" : str9;
            Object obj8 = json.get("id");
            String str11 = obj8 instanceof String ? (String) obj8 : null;
            String str12 = str11 == null ? "" : str11;
            Object obj9 = json.get("nameAndroid");
            String str13 = obj9 instanceof String ? (String) obj9 : null;
            String str14 = str13 == null ? "" : str13;
            Object obj10 = json.get("oneTimePurchaseOfferDetailsAndroid");
            List list2 = obj10 instanceof List ? (List) obj10 : null;
            if (list2 != null) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj11 : list2) {
                    Map<String, ? extends Object> map2 = obj11 instanceof Map ? (Map) obj11 : null;
                    if (map2 == null || (fromJson3 = ProductAndroidOneTimePurchaseOfferDetail.INSTANCE.fromJson(map2)) == null) {
                        throw new IllegalArgumentException("Missing required object for ProductAndroidOneTimePurchaseOfferDetail");
                    }
                    if (fromJson3 != null) {
                        arrayList6.add(fromJson3);
                    }
                }
                arrayList2 = arrayList6;
            } else {
                arrayList2 = null;
            }
            Object obj12 = json.get("platform");
            String str15 = obj12 instanceof String ? (String) obj12 : null;
            if (str15 == null || (iapPlatform = IapPlatform.INSTANCE.fromJson(str15)) == null) {
                iapPlatform = IapPlatform.Ios;
            }
            IapPlatform iapPlatform2 = iapPlatform;
            Object obj13 = json.get("price");
            Number number = obj13 instanceof Number ? (Number) obj13 : null;
            Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            Object obj14 = json.get("productStatusAndroid");
            String str16 = obj14 instanceof String ? (String) obj14 : null;
            ProductStatusAndroid fromJson5 = str16 != null ? ProductStatusAndroid.INSTANCE.fromJson(str16) : null;
            Object obj15 = json.get("subscriptionOfferDetailsAndroid");
            List list3 = obj15 instanceof List ? (List) obj15 : null;
            if (list3 != null) {
                ArrayList arrayList7 = new ArrayList();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    Map<String, ? extends Object> map3 = next instanceof Map ? (Map) next : null;
                    if (map3 == null || (fromJson2 = ProductSubscriptionAndroidOfferDetails.INSTANCE.fromJson(map3)) == null) {
                        throw new IllegalArgumentException("Missing required object for ProductSubscriptionAndroidOfferDetails");
                    }
                    if (fromJson2 != null) {
                        arrayList7.add(fromJson2);
                    }
                    it = it2;
                }
                arrayList3 = arrayList7;
            } else {
                arrayList3 = null;
            }
            Object obj16 = json.get("subscriptionOffers");
            List list4 = obj16 instanceof List ? (List) obj16 : null;
            if (list4 != null) {
                ArrayList arrayList8 = new ArrayList();
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    Iterator it4 = it3;
                    Object next2 = it4.next();
                    String str17 = str3;
                    Map<String, ? extends Object> map4 = next2 instanceof Map ? (Map) next2 : null;
                    if (map4 == null || (fromJson = SubscriptionOffer.INSTANCE.fromJson(map4)) == null) {
                        throw new IllegalArgumentException("Missing required object for SubscriptionOffer");
                    }
                    if (fromJson != null) {
                        arrayList8.add(fromJson);
                    }
                    it3 = it4;
                    str3 = str17;
                }
                str = str3;
                arrayList4 = arrayList8;
            } else {
                str = "";
                arrayList4 = null;
            }
            Object obj17 = json.get("title");
            String str18 = obj17 instanceof String ? (String) obj17 : null;
            if (str18 != null) {
                str = str18;
            }
            Object obj18 = json.get(WebViewManager.EVENT_TYPE_KEY);
            String str19 = obj18 instanceof String ? (String) obj18 : null;
            if (str19 == null || (productType = ProductType.INSTANCE.fromJson(str19)) == null) {
                productType = ProductType.InApp;
            }
            return new ProductAndroid(str4, str5, str7, arrayList, str8, str10, str12, str14, arrayList2, iapPlatform2, valueOf, fromJson5, arrayList3, arrayList4, str, productType);
        }
    }

    @Override // dev.hyo.openiap.Product
    public Map<String, Object> toJson() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Pair[] pairArr = new Pair[17];
        pairArr[0] = TuplesKt.to("__typename", "ProductAndroid");
        pairArr[1] = TuplesKt.to("currency", getCurrency());
        pairArr[2] = TuplesKt.to("debugDescription", getDebugDescription());
        pairArr[3] = TuplesKt.to("description", getDescription());
        List<DiscountOffer> list = this.discountOffers;
        ArrayList arrayList4 = null;
        if (list != null) {
            List<DiscountOffer> list2 = list;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList5.add(((DiscountOffer) it.next()).toJson());
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        pairArr[4] = TuplesKt.to("discountOffers", arrayList);
        pairArr[5] = TuplesKt.to("displayName", getDisplayName());
        pairArr[6] = TuplesKt.to("displayPrice", getDisplayPrice());
        pairArr[7] = TuplesKt.to("id", getId());
        pairArr[8] = TuplesKt.to("nameAndroid", this.nameAndroid);
        List<ProductAndroidOneTimePurchaseOfferDetail> list3 = this.oneTimePurchaseOfferDetailsAndroid;
        if (list3 != null) {
            List<ProductAndroidOneTimePurchaseOfferDetail> list4 = list3;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList6.add(((ProductAndroidOneTimePurchaseOfferDetail) it2.next()).toJson());
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        pairArr[9] = TuplesKt.to("oneTimePurchaseOfferDetailsAndroid", arrayList2);
        pairArr[10] = TuplesKt.to("platform", getPlatform().toJson());
        pairArr[11] = TuplesKt.to("price", getPrice());
        ProductStatusAndroid productStatusAndroid = this.productStatusAndroid;
        pairArr[12] = TuplesKt.to("productStatusAndroid", productStatusAndroid != null ? productStatusAndroid.toJson() : null);
        List<ProductSubscriptionAndroidOfferDetails> list5 = this.subscriptionOfferDetailsAndroid;
        if (list5 != null) {
            List<ProductSubscriptionAndroidOfferDetails> list6 = list5;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
            Iterator<T> it3 = list6.iterator();
            while (it3.hasNext()) {
                arrayList7.add(((ProductSubscriptionAndroidOfferDetails) it3.next()).toJson());
            }
            arrayList3 = arrayList7;
        } else {
            arrayList3 = null;
        }
        pairArr[13] = TuplesKt.to("subscriptionOfferDetailsAndroid", arrayList3);
        List<SubscriptionOffer> list7 = this.subscriptionOffers;
        if (list7 != null) {
            List<SubscriptionOffer> list8 = list7;
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
            Iterator<T> it4 = list8.iterator();
            while (it4.hasNext()) {
                arrayList8.add(((SubscriptionOffer) it4.next()).toJson());
            }
            arrayList4 = arrayList8;
        }
        pairArr[14] = TuplesKt.to("subscriptionOffers", arrayList4);
        pairArr[15] = TuplesKt.to("title", getTitle());
        pairArr[16] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, getType().toJson());
        return MapsKt.mapOf(pairArr);
    }
}
