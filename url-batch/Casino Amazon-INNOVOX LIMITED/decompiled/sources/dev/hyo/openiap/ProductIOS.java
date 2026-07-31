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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010807H\u0016J\t\u00109\u001a\u00020\u0004HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010;\u001a\u00020\u0004HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010=\u001a\u00020\u0004HÆ\u0003J\t\u0010>\u001a\u00020\u0004HÆ\u0003J\t\u0010?\u001a\u00020\u0004HÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\t\u0010F\u001a\u00020\u0004HÆ\u0003J\t\u0010G\u001a\u00020\u0019HÆ\u0003J\t\u0010H\u001a\u00020\u001bHÆ\u0003J¾\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bHÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\f2\b\u0010L\u001a\u0004\u0018\u000108HÖ\u0003J\t\u0010M\u001a\u00020NHÖ\u0001J\t\u0010O\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010&R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0017\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006Q"}, d2 = {"Ldev/hyo/openiap/ProductIOS;", "Ldev/hyo/openiap/ProductCommon;", "Ldev/hyo/openiap/Product;", "currency", "", "debugDescription", "description", "displayName", "displayNameIOS", "displayPrice", "id", "isFamilyShareableIOS", "", "jsonRepresentationIOS", "platform", "Ldev/hyo/openiap/IapPlatform;", "price", "", "subscriptionInfoIOS", "Ldev/hyo/openiap/SubscriptionInfoIOS;", "subscriptionOffers", "", "Ldev/hyo/openiap/SubscriptionOffer;", "title", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/ProductType;", "typeIOS", "Ldev/hyo/openiap/ProductTypeIOS;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ldev/hyo/openiap/IapPlatform;Ljava/lang/Double;Ldev/hyo/openiap/SubscriptionInfoIOS;Ljava/util/List;Ljava/lang/String;Ldev/hyo/openiap/ProductType;Ldev/hyo/openiap/ProductTypeIOS;)V", "getCurrency", "()Ljava/lang/String;", "getDebugDescription", "getDescription", "getDisplayName", "getDisplayNameIOS", "getDisplayPrice", "getId", "()Z", "getJsonRepresentationIOS", "getPlatform", "()Ldev/hyo/openiap/IapPlatform;", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSubscriptionInfoIOS", "()Ldev/hyo/openiap/SubscriptionInfoIOS;", "getSubscriptionOffers", "()Ljava/util/List;", "getTitle", "getType", "()Ldev/hyo/openiap/ProductType;", "getTypeIOS", "()Ldev/hyo/openiap/ProductTypeIOS;", "toJson", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ldev/hyo/openiap/IapPlatform;Ljava/lang/Double;Ldev/hyo/openiap/SubscriptionInfoIOS;Ljava/util/List;Ljava/lang/String;Ldev/hyo/openiap/ProductType;Ldev/hyo/openiap/ProductTypeIOS;)Ldev/hyo/openiap/ProductIOS;", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductIOS implements ProductCommon, Product {
    private final String currency;
    private final String debugDescription;
    private final String description;
    private final String displayName;
    private final String displayNameIOS;
    private final String displayPrice;
    private final String id;
    private final boolean isFamilyShareableIOS;
    private final String jsonRepresentationIOS;
    private final IapPlatform platform;
    private final Double price;
    private final SubscriptionInfoIOS subscriptionInfoIOS;
    private final List<SubscriptionOffer> subscriptionOffers;
    private final String title;
    private final ProductType type;
    private final ProductTypeIOS typeIOS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ ProductIOS copy$default(ProductIOS productIOS, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, IapPlatform iapPlatform, Double d, SubscriptionInfoIOS subscriptionInfoIOS, List list, String str9, ProductType productType, ProductTypeIOS productTypeIOS, int i, Object obj) {
        String str10 = (i & 1) != 0 ? productIOS.currency : str;
        return productIOS.copy(str10, (i & 2) != 0 ? productIOS.debugDescription : str2, (i & 4) != 0 ? productIOS.description : str3, (i & 8) != 0 ? productIOS.displayName : str4, (i & 16) != 0 ? productIOS.displayNameIOS : str5, (i & 32) != 0 ? productIOS.displayPrice : str6, (i & 64) != 0 ? productIOS.id : str7, (i & 128) != 0 ? productIOS.isFamilyShareableIOS : z, (i & 256) != 0 ? productIOS.jsonRepresentationIOS : str8, (i & 512) != 0 ? productIOS.platform : iapPlatform, (i & 1024) != 0 ? productIOS.price : d, (i & 2048) != 0 ? productIOS.subscriptionInfoIOS : subscriptionInfoIOS, (i & 4096) != 0 ? productIOS.subscriptionOffers : list, (i & 8192) != 0 ? productIOS.title : str9, (i & 16384) != 0 ? productIOS.type : productType, (i & 32768) != 0 ? productIOS.typeIOS : productTypeIOS);
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
    public final SubscriptionInfoIOS getSubscriptionInfoIOS() {
        return this.subscriptionInfoIOS;
    }

    public final List<SubscriptionOffer> component13() {
        return this.subscriptionOffers;
    }

    /* renamed from: component14, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component15, reason: from getter */
    public final ProductType getType() {
        return this.type;
    }

    /* renamed from: component16, reason: from getter */
    public final ProductTypeIOS getTypeIOS() {
        return this.typeIOS;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDebugDescription() {
        return this.debugDescription;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisplayNameIOS() {
        return this.displayNameIOS;
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
    public final boolean getIsFamilyShareableIOS() {
        return this.isFamilyShareableIOS;
    }

    /* renamed from: component9, reason: from getter */
    public final String getJsonRepresentationIOS() {
        return this.jsonRepresentationIOS;
    }

    public final ProductIOS copy(String currency, String debugDescription, String description, String displayName, String displayNameIOS, String displayPrice, String id, boolean isFamilyShareableIOS, String jsonRepresentationIOS, IapPlatform platform, Double price, SubscriptionInfoIOS subscriptionInfoIOS, List<SubscriptionOffer> subscriptionOffers, String title, ProductType type, ProductTypeIOS typeIOS) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayNameIOS, "displayNameIOS");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(jsonRepresentationIOS, "jsonRepresentationIOS");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeIOS, "typeIOS");
        return new ProductIOS(currency, debugDescription, description, displayName, displayNameIOS, displayPrice, id, isFamilyShareableIOS, jsonRepresentationIOS, platform, price, subscriptionInfoIOS, subscriptionOffers, title, type, typeIOS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductIOS)) {
            return false;
        }
        ProductIOS productIOS = (ProductIOS) other;
        return Intrinsics.areEqual(this.currency, productIOS.currency) && Intrinsics.areEqual(this.debugDescription, productIOS.debugDescription) && Intrinsics.areEqual(this.description, productIOS.description) && Intrinsics.areEqual(this.displayName, productIOS.displayName) && Intrinsics.areEqual(this.displayNameIOS, productIOS.displayNameIOS) && Intrinsics.areEqual(this.displayPrice, productIOS.displayPrice) && Intrinsics.areEqual(this.id, productIOS.id) && this.isFamilyShareableIOS == productIOS.isFamilyShareableIOS && Intrinsics.areEqual(this.jsonRepresentationIOS, productIOS.jsonRepresentationIOS) && this.platform == productIOS.platform && Intrinsics.areEqual((Object) this.price, (Object) productIOS.price) && Intrinsics.areEqual(this.subscriptionInfoIOS, productIOS.subscriptionInfoIOS) && Intrinsics.areEqual(this.subscriptionOffers, productIOS.subscriptionOffers) && Intrinsics.areEqual(this.title, productIOS.title) && this.type == productIOS.type && this.typeIOS == productIOS.typeIOS;
    }

    public int hashCode() {
        int hashCode = this.currency.hashCode() * 31;
        String str = this.debugDescription;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.description.hashCode()) * 31;
        String str2 = this.displayName;
        int hashCode3 = (((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.displayNameIOS.hashCode()) * 31) + this.displayPrice.hashCode()) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.isFamilyShareableIOS)) * 31) + this.jsonRepresentationIOS.hashCode()) * 31) + this.platform.hashCode()) * 31;
        Double d = this.price;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        SubscriptionInfoIOS subscriptionInfoIOS = this.subscriptionInfoIOS;
        int hashCode5 = (hashCode4 + (subscriptionInfoIOS == null ? 0 : subscriptionInfoIOS.hashCode())) * 31;
        List<SubscriptionOffer> list = this.subscriptionOffers;
        return ((((((hashCode5 + (list != null ? list.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.type.hashCode()) * 31) + this.typeIOS.hashCode();
    }

    public String toString() {
        return "ProductIOS(currency=" + this.currency + ", debugDescription=" + this.debugDescription + ", description=" + this.description + ", displayName=" + this.displayName + ", displayNameIOS=" + this.displayNameIOS + ", displayPrice=" + this.displayPrice + ", id=" + this.id + ", isFamilyShareableIOS=" + this.isFamilyShareableIOS + ", jsonRepresentationIOS=" + this.jsonRepresentationIOS + ", platform=" + this.platform + ", price=" + this.price + ", subscriptionInfoIOS=" + this.subscriptionInfoIOS + ", subscriptionOffers=" + this.subscriptionOffers + ", title=" + this.title + ", type=" + this.type + ", typeIOS=" + this.typeIOS + ")";
    }

    public ProductIOS(String currency, String str, String description, String str2, String displayNameIOS, String displayPrice, String id, boolean z, String jsonRepresentationIOS, IapPlatform platform, Double d, SubscriptionInfoIOS subscriptionInfoIOS, List<SubscriptionOffer> list, String title, ProductType type, ProductTypeIOS typeIOS) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayNameIOS, "displayNameIOS");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(jsonRepresentationIOS, "jsonRepresentationIOS");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeIOS, "typeIOS");
        this.currency = currency;
        this.debugDescription = str;
        this.description = description;
        this.displayName = str2;
        this.displayNameIOS = displayNameIOS;
        this.displayPrice = displayPrice;
        this.id = id;
        this.isFamilyShareableIOS = z;
        this.jsonRepresentationIOS = jsonRepresentationIOS;
        this.platform = platform;
        this.price = d;
        this.subscriptionInfoIOS = subscriptionInfoIOS;
        this.subscriptionOffers = list;
        this.title = title;
        this.type = type;
        this.typeIOS = typeIOS;
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

    @Override // dev.hyo.openiap.ProductCommon
    public String getDisplayName() {
        return this.displayName;
    }

    public final String getDisplayNameIOS() {
        return this.displayNameIOS;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public String getDisplayPrice() {
        return this.displayPrice;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public String getId() {
        return this.id;
    }

    public final boolean isFamilyShareableIOS() {
        return this.isFamilyShareableIOS;
    }

    public final String getJsonRepresentationIOS() {
        return this.jsonRepresentationIOS;
    }

    public /* synthetic */ ProductIOS(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, IapPlatform iapPlatform, Double d, SubscriptionInfoIOS subscriptionInfoIOS, List list, String str9, ProductType productType, ProductTypeIOS productTypeIOS, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, str5, str6, str7, z, str8, (i & 512) != 0 ? IapPlatform.Ios : iapPlatform, (i & 1024) != 0 ? null : d, (i & 2048) != 0 ? null : subscriptionInfoIOS, (i & 4096) != 0 ? null : list, str9, (i & 16384) != 0 ? ProductType.InApp : productType, productTypeIOS);
    }

    @Override // dev.hyo.openiap.ProductCommon
    public IapPlatform getPlatform() {
        return this.platform;
    }

    @Override // dev.hyo.openiap.ProductCommon
    public Double getPrice() {
        return this.price;
    }

    public final SubscriptionInfoIOS getSubscriptionInfoIOS() {
        return this.subscriptionInfoIOS;
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

    public final ProductTypeIOS getTypeIOS() {
        return this.typeIOS;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ProductIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ProductIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProductIOS fromJson(Map<String, ? extends Object> json) {
            IapPlatform iapPlatform;
            ArrayList arrayList;
            ProductType productType;
            ProductTypeIOS productTypeIOS;
            SubscriptionOffer fromJson;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("currency");
            String str = obj instanceof String ? (String) obj : null;
            String str2 = str == null ? "" : str;
            Object obj2 = json.get("debugDescription");
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = json.get("description");
            String str4 = obj3 instanceof String ? (String) obj3 : null;
            String str5 = str4 == null ? "" : str4;
            Object obj4 = json.get("displayName");
            String str6 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = json.get("displayNameIOS");
            String str7 = obj5 instanceof String ? (String) obj5 : null;
            String str8 = str7 == null ? "" : str7;
            Object obj6 = json.get("displayPrice");
            String str9 = obj6 instanceof String ? (String) obj6 : null;
            String str10 = str9 == null ? "" : str9;
            Object obj7 = json.get("id");
            String str11 = obj7 instanceof String ? (String) obj7 : null;
            String str12 = str11 == null ? "" : str11;
            Object obj8 = json.get("isFamilyShareableIOS");
            Boolean bool = obj8 instanceof Boolean ? (Boolean) obj8 : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Object obj9 = json.get("jsonRepresentationIOS");
            String str13 = obj9 instanceof String ? (String) obj9 : null;
            String str14 = str13 == null ? "" : str13;
            Object obj10 = json.get("platform");
            String str15 = obj10 instanceof String ? (String) obj10 : null;
            if (str15 == null || (iapPlatform = IapPlatform.INSTANCE.fromJson(str15)) == null) {
                iapPlatform = IapPlatform.Ios;
            }
            IapPlatform iapPlatform2 = iapPlatform;
            Object obj11 = json.get("price");
            Number number = obj11 instanceof Number ? (Number) obj11 : null;
            Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            Object obj12 = json.get("subscriptionInfoIOS");
            Map<String, ? extends Object> map = obj12 instanceof Map ? (Map) obj12 : null;
            SubscriptionInfoIOS fromJson2 = map != null ? SubscriptionInfoIOS.INSTANCE.fromJson(map) : null;
            Object obj13 = json.get("subscriptionOffers");
            List list = obj13 instanceof List ? (List) obj13 : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    Map<String, ? extends Object> map2 = next instanceof Map ? (Map) next : null;
                    if (map2 == null || (fromJson = SubscriptionOffer.INSTANCE.fromJson(map2)) == null) {
                        throw new IllegalArgumentException("Missing required object for SubscriptionOffer");
                    }
                    if (fromJson != null) {
                        arrayList2.add(fromJson);
                    }
                    it = it2;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Object obj14 = json.get("title");
            String str16 = obj14 instanceof String ? (String) obj14 : null;
            String str17 = str16 == null ? "" : str16;
            Object obj15 = json.get(WebViewManager.EVENT_TYPE_KEY);
            String str18 = obj15 instanceof String ? (String) obj15 : null;
            if (str18 == null || (productType = ProductType.INSTANCE.fromJson(str18)) == null) {
                productType = ProductType.InApp;
            }
            ProductType productType2 = productType;
            Object obj16 = json.get("typeIOS");
            String str19 = obj16 instanceof String ? (String) obj16 : null;
            if (str19 == null || (productTypeIOS = ProductTypeIOS.INSTANCE.fromJson(str19)) == null) {
                productTypeIOS = ProductTypeIOS.Consumable;
            }
            return new ProductIOS(str2, str3, str5, str6, str8, str10, str12, booleanValue, str14, iapPlatform2, valueOf, fromJson2, arrayList, str17, productType2, productTypeIOS);
        }
    }

    @Override // dev.hyo.openiap.Product
    public Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[17];
        pairArr[0] = TuplesKt.to("__typename", "ProductIOS");
        pairArr[1] = TuplesKt.to("currency", getCurrency());
        pairArr[2] = TuplesKt.to("debugDescription", getDebugDescription());
        pairArr[3] = TuplesKt.to("description", getDescription());
        pairArr[4] = TuplesKt.to("displayName", getDisplayName());
        pairArr[5] = TuplesKt.to("displayNameIOS", this.displayNameIOS);
        pairArr[6] = TuplesKt.to("displayPrice", getDisplayPrice());
        pairArr[7] = TuplesKt.to("id", getId());
        pairArr[8] = TuplesKt.to("isFamilyShareableIOS", Boolean.valueOf(this.isFamilyShareableIOS));
        pairArr[9] = TuplesKt.to("jsonRepresentationIOS", this.jsonRepresentationIOS);
        pairArr[10] = TuplesKt.to("platform", getPlatform().toJson());
        pairArr[11] = TuplesKt.to("price", getPrice());
        SubscriptionInfoIOS subscriptionInfoIOS = this.subscriptionInfoIOS;
        ArrayList arrayList = null;
        pairArr[12] = TuplesKt.to("subscriptionInfoIOS", subscriptionInfoIOS != null ? subscriptionInfoIOS.toJson() : null);
        List<SubscriptionOffer> list = this.subscriptionOffers;
        if (list != null) {
            List<SubscriptionOffer> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((SubscriptionOffer) it.next()).toJson());
            }
            arrayList = arrayList2;
        }
        pairArr[13] = TuplesKt.to("subscriptionOffers", arrayList);
        pairArr[14] = TuplesKt.to("title", getTitle());
        pairArr[15] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, getType().toJson());
        pairArr[16] = TuplesKt.to("typeIOS", this.typeIOS.toJson());
        return MapsKt.mapOf(pairArr);
    }
}
