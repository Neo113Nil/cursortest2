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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0001mB\u0087\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0016\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010M0LH\u0016J\t\u0010N\u001a\u00020\u0004HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010P\u001a\u00020\u0004HÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010S\u001a\u00020\u0004HÆ\u0003J\t\u0010T\u001a\u00020\u0004HÆ\u0003J\t\u0010U\u001a\u00020\u0004HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010Y\u001a\u00020\u0012HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010[\u001a\u00020\u0016HÆ\u0003J\t\u0010\\\u001a\u00020\u0004HÆ\u0003J\t\u0010]\u001a\u00020\u0019HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010_\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0011\u0010`\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\bHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010c\u001a\u00020\u0004HÆ\u0003J\t\u0010d\u001a\u00020$HÆ\u0003J\t\u0010e\u001a\u00020&HÆ\u0003J¢\u0002\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&HÆ\u0001¢\u0006\u0002\u0010gJ\u0013\u0010h\u001a\u00020\u00162\b\u0010i\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010j\u001a\u00020kHÖ\u0001J\t\u0010l\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0014\u0010\r\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010:R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u0004¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0013\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u0013\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bE\u00109R\u0014\u0010\"\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010*R\u0014\u0010#\u001a\u00020$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bI\u0010J¨\u0006n"}, d2 = {"Ldev/hyo/openiap/ProductSubscriptionIOS;", "Ldev/hyo/openiap/ProductCommon;", "Ldev/hyo/openiap/ProductSubscription;", "currency", "", "debugDescription", "description", "discountsIOS", "", "Ldev/hyo/openiap/DiscountIOS;", "displayName", "displayNameIOS", "displayPrice", "id", "introductoryPriceAsAmountIOS", "introductoryPriceIOS", "introductoryPriceNumberOfPeriodsIOS", "introductoryPricePaymentModeIOS", "Ldev/hyo/openiap/PaymentModeIOS;", "introductoryPriceSubscriptionPeriodIOS", "Ldev/hyo/openiap/SubscriptionPeriodIOS;", "isFamilyShareableIOS", "", "jsonRepresentationIOS", "platform", "Ldev/hyo/openiap/IapPlatform;", "price", "", "subscriptionInfoIOS", "Ldev/hyo/openiap/SubscriptionInfoIOS;", "subscriptionOffers", "Ldev/hyo/openiap/SubscriptionOffer;", "subscriptionPeriodNumberIOS", "subscriptionPeriodUnitIOS", "title", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/ProductType;", "typeIOS", "Ldev/hyo/openiap/ProductTypeIOS;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/PaymentModeIOS;Ldev/hyo/openiap/SubscriptionPeriodIOS;ZLjava/lang/String;Ldev/hyo/openiap/IapPlatform;Ljava/lang/Double;Ldev/hyo/openiap/SubscriptionInfoIOS;Ljava/util/List;Ljava/lang/String;Ldev/hyo/openiap/SubscriptionPeriodIOS;Ljava/lang/String;Ldev/hyo/openiap/ProductType;Ldev/hyo/openiap/ProductTypeIOS;)V", "getCurrency", "()Ljava/lang/String;", "getDebugDescription", "getDescription", "getDiscountsIOS", "()Ljava/util/List;", "getDisplayName", "getDisplayNameIOS", "getDisplayPrice", "getId", "getIntroductoryPriceAsAmountIOS", "getIntroductoryPriceIOS", "getIntroductoryPriceNumberOfPeriodsIOS", "getIntroductoryPricePaymentModeIOS", "()Ldev/hyo/openiap/PaymentModeIOS;", "getIntroductoryPriceSubscriptionPeriodIOS", "()Ldev/hyo/openiap/SubscriptionPeriodIOS;", "()Z", "getJsonRepresentationIOS", "getPlatform", "()Ldev/hyo/openiap/IapPlatform;", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSubscriptionInfoIOS", "()Ldev/hyo/openiap/SubscriptionInfoIOS;", "getSubscriptionOffers", "getSubscriptionPeriodNumberIOS", "getSubscriptionPeriodUnitIOS", "getTitle", "getType", "()Ldev/hyo/openiap/ProductType;", "getTypeIOS", "()Ldev/hyo/openiap/ProductTypeIOS;", "toJson", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/PaymentModeIOS;Ldev/hyo/openiap/SubscriptionPeriodIOS;ZLjava/lang/String;Ldev/hyo/openiap/IapPlatform;Ljava/lang/Double;Ldev/hyo/openiap/SubscriptionInfoIOS;Ljava/util/List;Ljava/lang/String;Ldev/hyo/openiap/SubscriptionPeriodIOS;Ljava/lang/String;Ldev/hyo/openiap/ProductType;Ldev/hyo/openiap/ProductTypeIOS;)Ldev/hyo/openiap/ProductSubscriptionIOS;", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductSubscriptionIOS implements ProductCommon, ProductSubscription {
    private final String currency;
    private final String debugDescription;
    private final String description;
    private final List<DiscountIOS> discountsIOS;
    private final String displayName;
    private final String displayNameIOS;
    private final String displayPrice;
    private final String id;
    private final String introductoryPriceAsAmountIOS;
    private final String introductoryPriceIOS;
    private final String introductoryPriceNumberOfPeriodsIOS;
    private final PaymentModeIOS introductoryPricePaymentModeIOS;
    private final SubscriptionPeriodIOS introductoryPriceSubscriptionPeriodIOS;
    private final boolean isFamilyShareableIOS;
    private final String jsonRepresentationIOS;
    private final IapPlatform platform;
    private final Double price;
    private final SubscriptionInfoIOS subscriptionInfoIOS;
    private final List<SubscriptionOffer> subscriptionOffers;
    private final String subscriptionPeriodNumberIOS;
    private final SubscriptionPeriodIOS subscriptionPeriodUnitIOS;
    private final String title;
    private final ProductType type;
    private final ProductTypeIOS typeIOS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ ProductSubscriptionIOS copy$default(ProductSubscriptionIOS productSubscriptionIOS, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, PaymentModeIOS paymentModeIOS, SubscriptionPeriodIOS subscriptionPeriodIOS, boolean z, String str11, IapPlatform iapPlatform, Double d, SubscriptionInfoIOS subscriptionInfoIOS, List list2, String str12, SubscriptionPeriodIOS subscriptionPeriodIOS2, String str13, ProductType productType, ProductTypeIOS productTypeIOS, int i, Object obj) {
        ProductTypeIOS productTypeIOS2;
        ProductType productType2;
        String str14 = (i & 1) != 0 ? productSubscriptionIOS.currency : str;
        String str15 = (i & 2) != 0 ? productSubscriptionIOS.debugDescription : str2;
        String str16 = (i & 4) != 0 ? productSubscriptionIOS.description : str3;
        List list3 = (i & 8) != 0 ? productSubscriptionIOS.discountsIOS : list;
        String str17 = (i & 16) != 0 ? productSubscriptionIOS.displayName : str4;
        String str18 = (i & 32) != 0 ? productSubscriptionIOS.displayNameIOS : str5;
        String str19 = (i & 64) != 0 ? productSubscriptionIOS.displayPrice : str6;
        String str20 = (i & 128) != 0 ? productSubscriptionIOS.id : str7;
        String str21 = (i & 256) != 0 ? productSubscriptionIOS.introductoryPriceAsAmountIOS : str8;
        String str22 = (i & 512) != 0 ? productSubscriptionIOS.introductoryPriceIOS : str9;
        String str23 = (i & 1024) != 0 ? productSubscriptionIOS.introductoryPriceNumberOfPeriodsIOS : str10;
        PaymentModeIOS paymentModeIOS2 = (i & 2048) != 0 ? productSubscriptionIOS.introductoryPricePaymentModeIOS : paymentModeIOS;
        SubscriptionPeriodIOS subscriptionPeriodIOS3 = (i & 4096) != 0 ? productSubscriptionIOS.introductoryPriceSubscriptionPeriodIOS : subscriptionPeriodIOS;
        boolean z2 = (i & 8192) != 0 ? productSubscriptionIOS.isFamilyShareableIOS : z;
        String str24 = str14;
        String str25 = (i & 16384) != 0 ? productSubscriptionIOS.jsonRepresentationIOS : str11;
        IapPlatform iapPlatform2 = (i & 32768) != 0 ? productSubscriptionIOS.platform : iapPlatform;
        Double d2 = (i & 65536) != 0 ? productSubscriptionIOS.price : d;
        SubscriptionInfoIOS subscriptionInfoIOS2 = (i & 131072) != 0 ? productSubscriptionIOS.subscriptionInfoIOS : subscriptionInfoIOS;
        List list4 = (i & 262144) != 0 ? productSubscriptionIOS.subscriptionOffers : list2;
        String str26 = (i & 524288) != 0 ? productSubscriptionIOS.subscriptionPeriodNumberIOS : str12;
        SubscriptionPeriodIOS subscriptionPeriodIOS4 = (i & 1048576) != 0 ? productSubscriptionIOS.subscriptionPeriodUnitIOS : subscriptionPeriodIOS2;
        String str27 = (i & 2097152) != 0 ? productSubscriptionIOS.title : str13;
        ProductType productType3 = (i & 4194304) != 0 ? productSubscriptionIOS.type : productType;
        if ((i & 8388608) != 0) {
            productType2 = productType3;
            productTypeIOS2 = productSubscriptionIOS.typeIOS;
        } else {
            productTypeIOS2 = productTypeIOS;
            productType2 = productType3;
        }
        return productSubscriptionIOS.copy(str24, str15, str16, list3, str17, str18, str19, str20, str21, str22, str23, paymentModeIOS2, subscriptionPeriodIOS3, z2, str25, iapPlatform2, d2, subscriptionInfoIOS2, list4, str26, subscriptionPeriodIOS4, str27, productType2, productTypeIOS2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component10, reason: from getter */
    public final String getIntroductoryPriceIOS() {
        return this.introductoryPriceIOS;
    }

    /* renamed from: component11, reason: from getter */
    public final String getIntroductoryPriceNumberOfPeriodsIOS() {
        return this.introductoryPriceNumberOfPeriodsIOS;
    }

    /* renamed from: component12, reason: from getter */
    public final PaymentModeIOS getIntroductoryPricePaymentModeIOS() {
        return this.introductoryPricePaymentModeIOS;
    }

    /* renamed from: component13, reason: from getter */
    public final SubscriptionPeriodIOS getIntroductoryPriceSubscriptionPeriodIOS() {
        return this.introductoryPriceSubscriptionPeriodIOS;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsFamilyShareableIOS() {
        return this.isFamilyShareableIOS;
    }

    /* renamed from: component15, reason: from getter */
    public final String getJsonRepresentationIOS() {
        return this.jsonRepresentationIOS;
    }

    /* renamed from: component16, reason: from getter */
    public final IapPlatform getPlatform() {
        return this.platform;
    }

    /* renamed from: component17, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    /* renamed from: component18, reason: from getter */
    public final SubscriptionInfoIOS getSubscriptionInfoIOS() {
        return this.subscriptionInfoIOS;
    }

    public final List<SubscriptionOffer> component19() {
        return this.subscriptionOffers;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDebugDescription() {
        return this.debugDescription;
    }

    /* renamed from: component20, reason: from getter */
    public final String getSubscriptionPeriodNumberIOS() {
        return this.subscriptionPeriodNumberIOS;
    }

    /* renamed from: component21, reason: from getter */
    public final SubscriptionPeriodIOS getSubscriptionPeriodUnitIOS() {
        return this.subscriptionPeriodUnitIOS;
    }

    /* renamed from: component22, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component23, reason: from getter */
    public final ProductType getType() {
        return this.type;
    }

    /* renamed from: component24, reason: from getter */
    public final ProductTypeIOS getTypeIOS() {
        return this.typeIOS;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<DiscountIOS> component4() {
        return this.discountsIOS;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDisplayNameIOS() {
        return this.displayNameIOS;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    /* renamed from: component8, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIntroductoryPriceAsAmountIOS() {
        return this.introductoryPriceAsAmountIOS;
    }

    public final ProductSubscriptionIOS copy(String currency, String debugDescription, String description, List<DiscountIOS> discountsIOS, String displayName, String displayNameIOS, String displayPrice, String id, String introductoryPriceAsAmountIOS, String introductoryPriceIOS, String introductoryPriceNumberOfPeriodsIOS, PaymentModeIOS introductoryPricePaymentModeIOS, SubscriptionPeriodIOS introductoryPriceSubscriptionPeriodIOS, boolean isFamilyShareableIOS, String jsonRepresentationIOS, IapPlatform platform, Double price, SubscriptionInfoIOS subscriptionInfoIOS, List<SubscriptionOffer> subscriptionOffers, String subscriptionPeriodNumberIOS, SubscriptionPeriodIOS subscriptionPeriodUnitIOS, String title, ProductType type, ProductTypeIOS typeIOS) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayNameIOS, "displayNameIOS");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(introductoryPricePaymentModeIOS, "introductoryPricePaymentModeIOS");
        Intrinsics.checkNotNullParameter(jsonRepresentationIOS, "jsonRepresentationIOS");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeIOS, "typeIOS");
        return new ProductSubscriptionIOS(currency, debugDescription, description, discountsIOS, displayName, displayNameIOS, displayPrice, id, introductoryPriceAsAmountIOS, introductoryPriceIOS, introductoryPriceNumberOfPeriodsIOS, introductoryPricePaymentModeIOS, introductoryPriceSubscriptionPeriodIOS, isFamilyShareableIOS, jsonRepresentationIOS, platform, price, subscriptionInfoIOS, subscriptionOffers, subscriptionPeriodNumberIOS, subscriptionPeriodUnitIOS, title, type, typeIOS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSubscriptionIOS)) {
            return false;
        }
        ProductSubscriptionIOS productSubscriptionIOS = (ProductSubscriptionIOS) other;
        return Intrinsics.areEqual(this.currency, productSubscriptionIOS.currency) && Intrinsics.areEqual(this.debugDescription, productSubscriptionIOS.debugDescription) && Intrinsics.areEqual(this.description, productSubscriptionIOS.description) && Intrinsics.areEqual(this.discountsIOS, productSubscriptionIOS.discountsIOS) && Intrinsics.areEqual(this.displayName, productSubscriptionIOS.displayName) && Intrinsics.areEqual(this.displayNameIOS, productSubscriptionIOS.displayNameIOS) && Intrinsics.areEqual(this.displayPrice, productSubscriptionIOS.displayPrice) && Intrinsics.areEqual(this.id, productSubscriptionIOS.id) && Intrinsics.areEqual(this.introductoryPriceAsAmountIOS, productSubscriptionIOS.introductoryPriceAsAmountIOS) && Intrinsics.areEqual(this.introductoryPriceIOS, productSubscriptionIOS.introductoryPriceIOS) && Intrinsics.areEqual(this.introductoryPriceNumberOfPeriodsIOS, productSubscriptionIOS.introductoryPriceNumberOfPeriodsIOS) && this.introductoryPricePaymentModeIOS == productSubscriptionIOS.introductoryPricePaymentModeIOS && this.introductoryPriceSubscriptionPeriodIOS == productSubscriptionIOS.introductoryPriceSubscriptionPeriodIOS && this.isFamilyShareableIOS == productSubscriptionIOS.isFamilyShareableIOS && Intrinsics.areEqual(this.jsonRepresentationIOS, productSubscriptionIOS.jsonRepresentationIOS) && this.platform == productSubscriptionIOS.platform && Intrinsics.areEqual((Object) this.price, (Object) productSubscriptionIOS.price) && Intrinsics.areEqual(this.subscriptionInfoIOS, productSubscriptionIOS.subscriptionInfoIOS) && Intrinsics.areEqual(this.subscriptionOffers, productSubscriptionIOS.subscriptionOffers) && Intrinsics.areEqual(this.subscriptionPeriodNumberIOS, productSubscriptionIOS.subscriptionPeriodNumberIOS) && this.subscriptionPeriodUnitIOS == productSubscriptionIOS.subscriptionPeriodUnitIOS && Intrinsics.areEqual(this.title, productSubscriptionIOS.title) && this.type == productSubscriptionIOS.type && this.typeIOS == productSubscriptionIOS.typeIOS;
    }

    public int hashCode() {
        int hashCode = this.currency.hashCode() * 31;
        String str = this.debugDescription;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.description.hashCode()) * 31;
        List<DiscountIOS> list = this.discountsIOS;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.displayName;
        int hashCode4 = (((((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.displayNameIOS.hashCode()) * 31) + this.displayPrice.hashCode()) * 31) + this.id.hashCode()) * 31;
        String str3 = this.introductoryPriceAsAmountIOS;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.introductoryPriceIOS;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.introductoryPriceNumberOfPeriodsIOS;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.introductoryPricePaymentModeIOS.hashCode()) * 31;
        SubscriptionPeriodIOS subscriptionPeriodIOS = this.introductoryPriceSubscriptionPeriodIOS;
        int hashCode8 = (((((((hashCode7 + (subscriptionPeriodIOS == null ? 0 : subscriptionPeriodIOS.hashCode())) * 31) + Boolean.hashCode(this.isFamilyShareableIOS)) * 31) + this.jsonRepresentationIOS.hashCode()) * 31) + this.platform.hashCode()) * 31;
        Double d = this.price;
        int hashCode9 = (hashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        SubscriptionInfoIOS subscriptionInfoIOS = this.subscriptionInfoIOS;
        int hashCode10 = (hashCode9 + (subscriptionInfoIOS == null ? 0 : subscriptionInfoIOS.hashCode())) * 31;
        List<SubscriptionOffer> list2 = this.subscriptionOffers;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.subscriptionPeriodNumberIOS;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SubscriptionPeriodIOS subscriptionPeriodIOS2 = this.subscriptionPeriodUnitIOS;
        return ((((((hashCode12 + (subscriptionPeriodIOS2 != null ? subscriptionPeriodIOS2.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.type.hashCode()) * 31) + this.typeIOS.hashCode();
    }

    public String toString() {
        return "ProductSubscriptionIOS(currency=" + this.currency + ", debugDescription=" + this.debugDescription + ", description=" + this.description + ", discountsIOS=" + this.discountsIOS + ", displayName=" + this.displayName + ", displayNameIOS=" + this.displayNameIOS + ", displayPrice=" + this.displayPrice + ", id=" + this.id + ", introductoryPriceAsAmountIOS=" + this.introductoryPriceAsAmountIOS + ", introductoryPriceIOS=" + this.introductoryPriceIOS + ", introductoryPriceNumberOfPeriodsIOS=" + this.introductoryPriceNumberOfPeriodsIOS + ", introductoryPricePaymentModeIOS=" + this.introductoryPricePaymentModeIOS + ", introductoryPriceSubscriptionPeriodIOS=" + this.introductoryPriceSubscriptionPeriodIOS + ", isFamilyShareableIOS=" + this.isFamilyShareableIOS + ", jsonRepresentationIOS=" + this.jsonRepresentationIOS + ", platform=" + this.platform + ", price=" + this.price + ", subscriptionInfoIOS=" + this.subscriptionInfoIOS + ", subscriptionOffers=" + this.subscriptionOffers + ", subscriptionPeriodNumberIOS=" + this.subscriptionPeriodNumberIOS + ", subscriptionPeriodUnitIOS=" + this.subscriptionPeriodUnitIOS + ", title=" + this.title + ", type=" + this.type + ", typeIOS=" + this.typeIOS + ")";
    }

    public ProductSubscriptionIOS(String currency, String str, String description, List<DiscountIOS> list, String str2, String displayNameIOS, String displayPrice, String id, String str3, String str4, String str5, PaymentModeIOS introductoryPricePaymentModeIOS, SubscriptionPeriodIOS subscriptionPeriodIOS, boolean z, String jsonRepresentationIOS, IapPlatform platform, Double d, SubscriptionInfoIOS subscriptionInfoIOS, List<SubscriptionOffer> list2, String str6, SubscriptionPeriodIOS subscriptionPeriodIOS2, String title, ProductType type, ProductTypeIOS typeIOS) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayNameIOS, "displayNameIOS");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(introductoryPricePaymentModeIOS, "introductoryPricePaymentModeIOS");
        Intrinsics.checkNotNullParameter(jsonRepresentationIOS, "jsonRepresentationIOS");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeIOS, "typeIOS");
        this.currency = currency;
        this.debugDescription = str;
        this.description = description;
        this.discountsIOS = list;
        this.displayName = str2;
        this.displayNameIOS = displayNameIOS;
        this.displayPrice = displayPrice;
        this.id = id;
        this.introductoryPriceAsAmountIOS = str3;
        this.introductoryPriceIOS = str4;
        this.introductoryPriceNumberOfPeriodsIOS = str5;
        this.introductoryPricePaymentModeIOS = introductoryPricePaymentModeIOS;
        this.introductoryPriceSubscriptionPeriodIOS = subscriptionPeriodIOS;
        this.isFamilyShareableIOS = z;
        this.jsonRepresentationIOS = jsonRepresentationIOS;
        this.platform = platform;
        this.price = d;
        this.subscriptionInfoIOS = subscriptionInfoIOS;
        this.subscriptionOffers = list2;
        this.subscriptionPeriodNumberIOS = str6;
        this.subscriptionPeriodUnitIOS = subscriptionPeriodIOS2;
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

    public final List<DiscountIOS> getDiscountsIOS() {
        return this.discountsIOS;
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

    public final String getIntroductoryPriceAsAmountIOS() {
        return this.introductoryPriceAsAmountIOS;
    }

    public final String getIntroductoryPriceIOS() {
        return this.introductoryPriceIOS;
    }

    public final String getIntroductoryPriceNumberOfPeriodsIOS() {
        return this.introductoryPriceNumberOfPeriodsIOS;
    }

    public final PaymentModeIOS getIntroductoryPricePaymentModeIOS() {
        return this.introductoryPricePaymentModeIOS;
    }

    public final SubscriptionPeriodIOS getIntroductoryPriceSubscriptionPeriodIOS() {
        return this.introductoryPriceSubscriptionPeriodIOS;
    }

    public final boolean isFamilyShareableIOS() {
        return this.isFamilyShareableIOS;
    }

    public final String getJsonRepresentationIOS() {
        return this.jsonRepresentationIOS;
    }

    public /* synthetic */ ProductSubscriptionIOS(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, PaymentModeIOS paymentModeIOS, SubscriptionPeriodIOS subscriptionPeriodIOS, boolean z, String str11, IapPlatform iapPlatform, Double d, SubscriptionInfoIOS subscriptionInfoIOS, List list2, String str12, SubscriptionPeriodIOS subscriptionPeriodIOS2, String str13, ProductType productType, ProductTypeIOS productTypeIOS, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4, str5, str6, str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, paymentModeIOS, (i & 4096) != 0 ? null : subscriptionPeriodIOS, z, str11, (32768 & i) != 0 ? IapPlatform.Ios : iapPlatform, (65536 & i) != 0 ? null : d, (131072 & i) != 0 ? null : subscriptionInfoIOS, (262144 & i) != 0 ? null : list2, (524288 & i) != 0 ? null : str12, (1048576 & i) != 0 ? null : subscriptionPeriodIOS2, str13, (i & 4194304) != 0 ? ProductType.Subs : productType, productTypeIOS);
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

    public final String getSubscriptionPeriodNumberIOS() {
        return this.subscriptionPeriodNumberIOS;
    }

    public final SubscriptionPeriodIOS getSubscriptionPeriodUnitIOS() {
        return this.subscriptionPeriodUnitIOS;
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
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ProductSubscriptionIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ProductSubscriptionIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProductSubscriptionIOS fromJson(Map<String, ? extends Object> json) {
            ArrayList arrayList;
            PaymentModeIOS paymentModeIOS;
            IapPlatform iapPlatform;
            ArrayList arrayList2;
            ProductType productType;
            ProductTypeIOS productTypeIOS;
            SubscriptionOffer fromJson;
            DiscountIOS fromJson2;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("currency");
            String str = obj instanceof String ? (String) obj : null;
            String str2 = str == null ? "" : str;
            Object obj2 = json.get("debugDescription");
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = json.get("description");
            String str4 = obj3 instanceof String ? (String) obj3 : null;
            String str5 = str4 == null ? "" : str4;
            Object obj4 = json.get("discountsIOS");
            List list = obj4 instanceof List ? (List) obj4 : null;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list) {
                    Map<String, ? extends Object> map = obj5 instanceof Map ? (Map) obj5 : null;
                    if (map == null || (fromJson2 = DiscountIOS.INSTANCE.fromJson(map)) == null) {
                        throw new IllegalArgumentException("Missing required object for DiscountIOS");
                    }
                    if (fromJson2 != null) {
                        arrayList3.add(fromJson2);
                    }
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            Object obj6 = json.get("displayName");
            String str6 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = json.get("displayNameIOS");
            String str7 = obj7 instanceof String ? (String) obj7 : null;
            String str8 = str7 == null ? "" : str7;
            Object obj8 = json.get("displayPrice");
            String str9 = obj8 instanceof String ? (String) obj8 : null;
            String str10 = str9 == null ? "" : str9;
            Object obj9 = json.get("id");
            String str11 = obj9 instanceof String ? (String) obj9 : null;
            String str12 = str11 == null ? "" : str11;
            Object obj10 = json.get("introductoryPriceAsAmountIOS");
            String str13 = obj10 instanceof String ? (String) obj10 : null;
            Object obj11 = json.get("introductoryPriceIOS");
            String str14 = obj11 instanceof String ? (String) obj11 : null;
            Object obj12 = json.get("introductoryPriceNumberOfPeriodsIOS");
            String str15 = obj12 instanceof String ? (String) obj12 : null;
            Object obj13 = json.get("introductoryPricePaymentModeIOS");
            String str16 = obj13 instanceof String ? (String) obj13 : null;
            if (str16 == null || (paymentModeIOS = PaymentModeIOS.INSTANCE.fromJson(str16)) == null) {
                paymentModeIOS = PaymentModeIOS.Empty;
            }
            PaymentModeIOS paymentModeIOS2 = paymentModeIOS;
            Object obj14 = json.get("introductoryPriceSubscriptionPeriodIOS");
            String str17 = obj14 instanceof String ? (String) obj14 : null;
            SubscriptionPeriodIOS fromJson3 = str17 != null ? SubscriptionPeriodIOS.INSTANCE.fromJson(str17) : null;
            Object obj15 = json.get("isFamilyShareableIOS");
            Boolean bool = obj15 instanceof Boolean ? (Boolean) obj15 : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Object obj16 = json.get("jsonRepresentationIOS");
            String str18 = obj16 instanceof String ? (String) obj16 : null;
            String str19 = str18 == null ? "" : str18;
            Object obj17 = json.get("platform");
            String str20 = obj17 instanceof String ? (String) obj17 : null;
            if (str20 == null || (iapPlatform = IapPlatform.INSTANCE.fromJson(str20)) == null) {
                iapPlatform = IapPlatform.Ios;
            }
            IapPlatform iapPlatform2 = iapPlatform;
            Object obj18 = json.get("price");
            Number number = obj18 instanceof Number ? (Number) obj18 : null;
            Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            Object obj19 = json.get("subscriptionInfoIOS");
            Map<String, ? extends Object> map2 = obj19 instanceof Map ? (Map) obj19 : null;
            SubscriptionInfoIOS fromJson4 = map2 != null ? SubscriptionInfoIOS.INSTANCE.fromJson(map2) : null;
            Object obj20 = json.get("subscriptionOffers");
            List list2 = obj20 instanceof List ? (List) obj20 : null;
            if (list2 != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    Map<String, ? extends Object> map3 = next instanceof Map ? (Map) next : null;
                    if (map3 == null || (fromJson = SubscriptionOffer.INSTANCE.fromJson(map3)) == null) {
                        throw new IllegalArgumentException("Missing required object for SubscriptionOffer");
                    }
                    if (fromJson != null) {
                        arrayList4.add(fromJson);
                    }
                    it = it2;
                }
                arrayList2 = arrayList4;
            } else {
                arrayList2 = null;
            }
            Object obj21 = json.get("subscriptionPeriodNumberIOS");
            String str21 = obj21 instanceof String ? (String) obj21 : null;
            Object obj22 = json.get("subscriptionPeriodUnitIOS");
            String str22 = obj22 instanceof String ? (String) obj22 : null;
            SubscriptionPeriodIOS fromJson5 = str22 != null ? SubscriptionPeriodIOS.INSTANCE.fromJson(str22) : null;
            Object obj23 = json.get("title");
            String str23 = obj23 instanceof String ? (String) obj23 : null;
            String str24 = str23 == null ? "" : str23;
            Object obj24 = json.get(WebViewManager.EVENT_TYPE_KEY);
            String str25 = obj24 instanceof String ? (String) obj24 : null;
            if (str25 == null || (productType = ProductType.INSTANCE.fromJson(str25)) == null) {
                productType = ProductType.InApp;
            }
            ProductType productType2 = productType;
            Object obj25 = json.get("typeIOS");
            String str26 = obj25 instanceof String ? (String) obj25 : null;
            if (str26 == null || (productTypeIOS = ProductTypeIOS.INSTANCE.fromJson(str26)) == null) {
                productTypeIOS = ProductTypeIOS.Consumable;
            }
            return new ProductSubscriptionIOS(str2, str3, str5, arrayList, str6, str8, str10, str12, str13, str14, str15, paymentModeIOS2, fromJson3, booleanValue, str19, iapPlatform2, valueOf, fromJson4, arrayList2, str21, fromJson5, str24, productType2, productTypeIOS);
        }
    }

    @Override // dev.hyo.openiap.ProductSubscription
    public Map<String, Object> toJson() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Pair[] pairArr = new Pair[25];
        pairArr[0] = TuplesKt.to("__typename", "ProductSubscriptionIOS");
        pairArr[1] = TuplesKt.to("currency", getCurrency());
        pairArr[2] = TuplesKt.to("debugDescription", getDebugDescription());
        pairArr[3] = TuplesKt.to("description", getDescription());
        List<DiscountIOS> list = this.discountsIOS;
        if (list != null) {
            List<DiscountIOS> list2 = list;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((DiscountIOS) it.next()).toJson());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        pairArr[4] = TuplesKt.to("discountsIOS", arrayList);
        pairArr[5] = TuplesKt.to("displayName", getDisplayName());
        pairArr[6] = TuplesKt.to("displayNameIOS", this.displayNameIOS);
        pairArr[7] = TuplesKt.to("displayPrice", getDisplayPrice());
        pairArr[8] = TuplesKt.to("id", getId());
        pairArr[9] = TuplesKt.to("introductoryPriceAsAmountIOS", this.introductoryPriceAsAmountIOS);
        pairArr[10] = TuplesKt.to("introductoryPriceIOS", this.introductoryPriceIOS);
        pairArr[11] = TuplesKt.to("introductoryPriceNumberOfPeriodsIOS", this.introductoryPriceNumberOfPeriodsIOS);
        pairArr[12] = TuplesKt.to("introductoryPricePaymentModeIOS", this.introductoryPricePaymentModeIOS.toJson());
        SubscriptionPeriodIOS subscriptionPeriodIOS = this.introductoryPriceSubscriptionPeriodIOS;
        pairArr[13] = TuplesKt.to("introductoryPriceSubscriptionPeriodIOS", subscriptionPeriodIOS != null ? subscriptionPeriodIOS.toJson() : null);
        pairArr[14] = TuplesKt.to("isFamilyShareableIOS", Boolean.valueOf(this.isFamilyShareableIOS));
        pairArr[15] = TuplesKt.to("jsonRepresentationIOS", this.jsonRepresentationIOS);
        pairArr[16] = TuplesKt.to("platform", getPlatform().toJson());
        pairArr[17] = TuplesKt.to("price", getPrice());
        SubscriptionInfoIOS subscriptionInfoIOS = this.subscriptionInfoIOS;
        pairArr[18] = TuplesKt.to("subscriptionInfoIOS", subscriptionInfoIOS != null ? subscriptionInfoIOS.toJson() : null);
        List<SubscriptionOffer> list3 = this.subscriptionOffers;
        if (list3 != null) {
            List<SubscriptionOffer> list4 = list3;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((SubscriptionOffer) it2.next()).toJson());
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        pairArr[19] = TuplesKt.to("subscriptionOffers", arrayList2);
        pairArr[20] = TuplesKt.to("subscriptionPeriodNumberIOS", this.subscriptionPeriodNumberIOS);
        SubscriptionPeriodIOS subscriptionPeriodIOS2 = this.subscriptionPeriodUnitIOS;
        pairArr[21] = TuplesKt.to("subscriptionPeriodUnitIOS", subscriptionPeriodIOS2 != null ? subscriptionPeriodIOS2.toJson() : null);
        pairArr[22] = TuplesKt.to("title", getTitle());
        pairArr[23] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, getType().toJson());
        pairArr[24] = TuplesKt.to("typeIOS", this.typeIOS.toJson());
        return MapsKt.mapOf(pairArr);
    }
}
