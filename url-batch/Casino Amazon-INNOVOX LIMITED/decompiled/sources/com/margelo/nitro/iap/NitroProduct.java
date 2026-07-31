package com.margelo.nitro.iap;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.sqlite.driver.bundled.BundledSQLite;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroProduct.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\bM\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 {2\u00020\u0001:\u0001{BÅ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\f\u0012\b\u0010!\u001a\u0004\u0018\u00010\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010+J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010[\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010c\u001a\u00020\u0018HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010(HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0089\u0003\u0010t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010u\u001a\u00020v2\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010x\u001a\u00020yHÖ\u0001J\t\u0010z\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010-R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00102R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010:R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00102R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00102R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00102R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00106R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00102R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00102R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00102R\u0018\u0010 \u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00106R\u0018\u0010!\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00106R\u0018\u0010\"\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00102R\u0018\u0010#\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00106R\u0018\u0010$\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00102R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00102R\u0018\u0010&\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00102¨\u0006|"}, d2 = {"Lcom/margelo/nitro/iap/NitroProduct;", "", "id", "", "title", "description", WebViewManager.EVENT_TYPE_KEY, "displayName", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "displayPrice", "currency", "price", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "platform", "Lcom/margelo/nitro/iap/IapPlatform;", "typeIOS", "isFamilyShareableIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "jsonRepresentationIOS", "discountsIOS", "introductoryPriceIOS", "introductoryPriceAsAmountIOS", "introductoryPriceNumberOfPeriodsIOS", "introductoryPricePaymentModeIOS", "Lcom/margelo/nitro/iap/PaymentModeIOS;", "introductoryPriceSubscriptionPeriodIOS", "subscriptionPeriodNumberIOS", "subscriptionPeriodUnitIOS", "subscriptionOffers", "discountOffers", "nameAndroid", "originalPriceAndroid", "originalPriceAmountMicrosAndroid", "introductoryPriceCyclesAndroid", "introductoryPricePeriodAndroid", "introductoryPriceValueAndroid", "subscriptionPeriodAndroid", "freeTrialPeriodAndroid", "subscriptionOfferDetailsAndroid", "oneTimePurchaseOfferDetailsAndroid", "Lcom/margelo/nitro/iap/Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_;", "productStatusAndroid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_String;Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/IapPlatform;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/PaymentModeIOS;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_;Lcom/margelo/nitro/iap/Variant_NullType_String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getType", "getDisplayName", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getDisplayPrice", "getCurrency", "getPrice", "()Lcom/margelo/nitro/iap/Variant_NullType_Double;", "getPlatform", "()Lcom/margelo/nitro/iap/IapPlatform;", "getTypeIOS", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "getJsonRepresentationIOS", "getDiscountsIOS", "getIntroductoryPriceIOS", "getIntroductoryPriceAsAmountIOS", "getIntroductoryPriceNumberOfPeriodsIOS", "getIntroductoryPricePaymentModeIOS", "()Lcom/margelo/nitro/iap/PaymentModeIOS;", "getIntroductoryPriceSubscriptionPeriodIOS", "getSubscriptionPeriodNumberIOS", "getSubscriptionPeriodUnitIOS", "getSubscriptionOffers", "getDiscountOffers", "getNameAndroid", "getOriginalPriceAndroid", "getOriginalPriceAmountMicrosAndroid", "getIntroductoryPriceCyclesAndroid", "getIntroductoryPricePeriodAndroid", "getIntroductoryPriceValueAndroid", "getSubscriptionPeriodAndroid", "getFreeTrialPeriodAndroid", "getSubscriptionOfferDetailsAndroid", "getOneTimePurchaseOfferDetailsAndroid", "()Lcom/margelo/nitro/iap/Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_;", "getProductStatusAndroid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroProduct {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String currency;
    private final String description;
    private final Variant_NullType_String discountOffers;
    private final Variant_NullType_String discountsIOS;
    private final Variant_NullType_String displayName;
    private final String displayPrice;
    private final Variant_NullType_String freeTrialPeriodAndroid;
    private final String id;
    private final Variant_NullType_Double introductoryPriceAsAmountIOS;
    private final Variant_NullType_Double introductoryPriceCyclesAndroid;
    private final Variant_NullType_String introductoryPriceIOS;
    private final Variant_NullType_Double introductoryPriceNumberOfPeriodsIOS;
    private final PaymentModeIOS introductoryPricePaymentModeIOS;
    private final Variant_NullType_String introductoryPricePeriodAndroid;
    private final Variant_NullType_String introductoryPriceSubscriptionPeriodIOS;
    private final Variant_NullType_Double introductoryPriceValueAndroid;
    private final Variant_NullType_Boolean isFamilyShareableIOS;
    private final Variant_NullType_String jsonRepresentationIOS;
    private final Variant_NullType_String nameAndroid;
    private final Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ oneTimePurchaseOfferDetailsAndroid;
    private final Variant_NullType_Double originalPriceAmountMicrosAndroid;
    private final Variant_NullType_String originalPriceAndroid;
    private final IapPlatform platform;
    private final Variant_NullType_Double price;
    private final Variant_NullType_String productStatusAndroid;
    private final Variant_NullType_String subscriptionOfferDetailsAndroid;
    private final Variant_NullType_String subscriptionOffers;
    private final Variant_NullType_String subscriptionPeriodAndroid;
    private final Variant_NullType_Double subscriptionPeriodNumberIOS;
    private final Variant_NullType_String subscriptionPeriodUnitIOS;
    private final String title;
    private final String type;
    private final Variant_NullType_String typeIOS;

    public static /* synthetic */ NitroProduct copy$default(NitroProduct nitroProduct, String str, String str2, String str3, String str4, Variant_NullType_String variant_NullType_String, String str5, String str6, Variant_NullType_Double variant_NullType_Double, IapPlatform iapPlatform, Variant_NullType_String variant_NullType_String2, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_Double variant_NullType_Double3, PaymentModeIOS paymentModeIOS, Variant_NullType_String variant_NullType_String6, Variant_NullType_Double variant_NullType_Double4, Variant_NullType_String variant_NullType_String7, Variant_NullType_String variant_NullType_String8, Variant_NullType_String variant_NullType_String9, Variant_NullType_String variant_NullType_String10, Variant_NullType_String variant_NullType_String11, Variant_NullType_Double variant_NullType_Double5, Variant_NullType_Double variant_NullType_Double6, Variant_NullType_String variant_NullType_String12, Variant_NullType_Double variant_NullType_Double7, Variant_NullType_String variant_NullType_String13, Variant_NullType_String variant_NullType_String14, Variant_NullType_String variant_NullType_String15, Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ variant_NullType_Array_NitroOneTimePurchaseOfferDetail_, Variant_NullType_String variant_NullType_String16, int i, int i2, Object obj) {
        Variant_NullType_String variant_NullType_String17;
        Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ variant_NullType_Array_NitroOneTimePurchaseOfferDetail_2;
        PaymentModeIOS paymentModeIOS2;
        Variant_NullType_String variant_NullType_String18;
        Variant_NullType_Double variant_NullType_Double8;
        Variant_NullType_String variant_NullType_String19;
        Variant_NullType_String variant_NullType_String20;
        Variant_NullType_String variant_NullType_String21;
        Variant_NullType_String variant_NullType_String22;
        Variant_NullType_String variant_NullType_String23;
        Variant_NullType_Double variant_NullType_Double9;
        Variant_NullType_Double variant_NullType_Double10;
        Variant_NullType_String variant_NullType_String24;
        Variant_NullType_Double variant_NullType_Double11;
        Variant_NullType_String variant_NullType_String25;
        Variant_NullType_String variant_NullType_String26;
        Variant_NullType_String variant_NullType_String27;
        Variant_NullType_Double variant_NullType_Double12;
        String str7;
        String str8;
        String str9;
        Variant_NullType_String variant_NullType_String28;
        String str10;
        String str11;
        Variant_NullType_Double variant_NullType_Double13;
        IapPlatform iapPlatform2;
        Variant_NullType_String variant_NullType_String29;
        Variant_NullType_Boolean variant_NullType_Boolean2;
        Variant_NullType_String variant_NullType_String30;
        Variant_NullType_String variant_NullType_String31;
        Variant_NullType_String variant_NullType_String32;
        Variant_NullType_Double variant_NullType_Double14;
        String str12 = (i & 1) != 0 ? nitroProduct.id : str;
        String str13 = (i & 2) != 0 ? nitroProduct.title : str2;
        String str14 = (i & 4) != 0 ? nitroProduct.description : str3;
        String str15 = (i & 8) != 0 ? nitroProduct.type : str4;
        Variant_NullType_String variant_NullType_String33 = (i & 16) != 0 ? nitroProduct.displayName : variant_NullType_String;
        String str16 = (i & 32) != 0 ? nitroProduct.displayPrice : str5;
        String str17 = (i & 64) != 0 ? nitroProduct.currency : str6;
        Variant_NullType_Double variant_NullType_Double15 = (i & 128) != 0 ? nitroProduct.price : variant_NullType_Double;
        IapPlatform iapPlatform3 = (i & 256) != 0 ? nitroProduct.platform : iapPlatform;
        Variant_NullType_String variant_NullType_String34 = (i & 512) != 0 ? nitroProduct.typeIOS : variant_NullType_String2;
        Variant_NullType_Boolean variant_NullType_Boolean3 = (i & 1024) != 0 ? nitroProduct.isFamilyShareableIOS : variant_NullType_Boolean;
        Variant_NullType_String variant_NullType_String35 = (i & 2048) != 0 ? nitroProduct.jsonRepresentationIOS : variant_NullType_String3;
        Variant_NullType_String variant_NullType_String36 = (i & 4096) != 0 ? nitroProduct.discountsIOS : variant_NullType_String4;
        Variant_NullType_String variant_NullType_String37 = (i & 8192) != 0 ? nitroProduct.introductoryPriceIOS : variant_NullType_String5;
        String str18 = str12;
        Variant_NullType_Double variant_NullType_Double16 = (i & 16384) != 0 ? nitroProduct.introductoryPriceAsAmountIOS : variant_NullType_Double2;
        Variant_NullType_Double variant_NullType_Double17 = (i & 32768) != 0 ? nitroProduct.introductoryPriceNumberOfPeriodsIOS : variant_NullType_Double3;
        PaymentModeIOS paymentModeIOS3 = (i & 65536) != 0 ? nitroProduct.introductoryPricePaymentModeIOS : paymentModeIOS;
        Variant_NullType_String variant_NullType_String38 = (i & 131072) != 0 ? nitroProduct.introductoryPriceSubscriptionPeriodIOS : variant_NullType_String6;
        Variant_NullType_Double variant_NullType_Double18 = (i & 262144) != 0 ? nitroProduct.subscriptionPeriodNumberIOS : variant_NullType_Double4;
        Variant_NullType_String variant_NullType_String39 = (i & 524288) != 0 ? nitroProduct.subscriptionPeriodUnitIOS : variant_NullType_String7;
        Variant_NullType_String variant_NullType_String40 = (i & 1048576) != 0 ? nitroProduct.subscriptionOffers : variant_NullType_String8;
        Variant_NullType_String variant_NullType_String41 = (i & 2097152) != 0 ? nitroProduct.discountOffers : variant_NullType_String9;
        Variant_NullType_String variant_NullType_String42 = (i & 4194304) != 0 ? nitroProduct.nameAndroid : variant_NullType_String10;
        Variant_NullType_String variant_NullType_String43 = (i & 8388608) != 0 ? nitroProduct.originalPriceAndroid : variant_NullType_String11;
        Variant_NullType_Double variant_NullType_Double19 = (i & 16777216) != 0 ? nitroProduct.originalPriceAmountMicrosAndroid : variant_NullType_Double5;
        Variant_NullType_Double variant_NullType_Double20 = (i & BundledSQLite.SQLITE_OPEN_EXRESCODE) != 0 ? nitroProduct.introductoryPriceCyclesAndroid : variant_NullType_Double6;
        Variant_NullType_String variant_NullType_String44 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? nitroProduct.introductoryPricePeriodAndroid : variant_NullType_String12;
        Variant_NullType_Double variant_NullType_Double21 = (i & 134217728) != 0 ? nitroProduct.introductoryPriceValueAndroid : variant_NullType_Double7;
        Variant_NullType_String variant_NullType_String45 = (i & 268435456) != 0 ? nitroProduct.subscriptionPeriodAndroid : variant_NullType_String13;
        Variant_NullType_String variant_NullType_String46 = (i & 536870912) != 0 ? nitroProduct.freeTrialPeriodAndroid : variant_NullType_String14;
        Variant_NullType_String variant_NullType_String47 = (i & 1073741824) != 0 ? nitroProduct.subscriptionOfferDetailsAndroid : variant_NullType_String15;
        Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ variant_NullType_Array_NitroOneTimePurchaseOfferDetail_3 = (i & Integer.MIN_VALUE) != 0 ? nitroProduct.oneTimePurchaseOfferDetailsAndroid : variant_NullType_Array_NitroOneTimePurchaseOfferDetail_;
        if ((i2 & 1) != 0) {
            variant_NullType_Array_NitroOneTimePurchaseOfferDetail_2 = variant_NullType_Array_NitroOneTimePurchaseOfferDetail_3;
            variant_NullType_String17 = nitroProduct.productStatusAndroid;
            variant_NullType_String18 = variant_NullType_String38;
            variant_NullType_Double8 = variant_NullType_Double18;
            variant_NullType_String19 = variant_NullType_String39;
            variant_NullType_String20 = variant_NullType_String40;
            variant_NullType_String21 = variant_NullType_String41;
            variant_NullType_String22 = variant_NullType_String42;
            variant_NullType_String23 = variant_NullType_String43;
            variant_NullType_Double9 = variant_NullType_Double19;
            variant_NullType_Double10 = variant_NullType_Double20;
            variant_NullType_String24 = variant_NullType_String44;
            variant_NullType_Double11 = variant_NullType_Double21;
            variant_NullType_String25 = variant_NullType_String45;
            variant_NullType_String26 = variant_NullType_String46;
            variant_NullType_String27 = variant_NullType_String47;
            variant_NullType_Double12 = variant_NullType_Double16;
            str8 = str14;
            str9 = str15;
            variant_NullType_String28 = variant_NullType_String33;
            str10 = str16;
            str11 = str17;
            variant_NullType_Double13 = variant_NullType_Double15;
            iapPlatform2 = iapPlatform3;
            variant_NullType_String29 = variant_NullType_String34;
            variant_NullType_Boolean2 = variant_NullType_Boolean3;
            variant_NullType_String30 = variant_NullType_String35;
            variant_NullType_String31 = variant_NullType_String36;
            variant_NullType_String32 = variant_NullType_String37;
            variant_NullType_Double14 = variant_NullType_Double17;
            paymentModeIOS2 = paymentModeIOS3;
            str7 = str13;
        } else {
            variant_NullType_String17 = variant_NullType_String16;
            variant_NullType_Array_NitroOneTimePurchaseOfferDetail_2 = variant_NullType_Array_NitroOneTimePurchaseOfferDetail_3;
            paymentModeIOS2 = paymentModeIOS3;
            variant_NullType_String18 = variant_NullType_String38;
            variant_NullType_Double8 = variant_NullType_Double18;
            variant_NullType_String19 = variant_NullType_String39;
            variant_NullType_String20 = variant_NullType_String40;
            variant_NullType_String21 = variant_NullType_String41;
            variant_NullType_String22 = variant_NullType_String42;
            variant_NullType_String23 = variant_NullType_String43;
            variant_NullType_Double9 = variant_NullType_Double19;
            variant_NullType_Double10 = variant_NullType_Double20;
            variant_NullType_String24 = variant_NullType_String44;
            variant_NullType_Double11 = variant_NullType_Double21;
            variant_NullType_String25 = variant_NullType_String45;
            variant_NullType_String26 = variant_NullType_String46;
            variant_NullType_String27 = variant_NullType_String47;
            variant_NullType_Double12 = variant_NullType_Double16;
            str7 = str13;
            str8 = str14;
            str9 = str15;
            variant_NullType_String28 = variant_NullType_String33;
            str10 = str16;
            str11 = str17;
            variant_NullType_Double13 = variant_NullType_Double15;
            iapPlatform2 = iapPlatform3;
            variant_NullType_String29 = variant_NullType_String34;
            variant_NullType_Boolean2 = variant_NullType_Boolean3;
            variant_NullType_String30 = variant_NullType_String35;
            variant_NullType_String31 = variant_NullType_String36;
            variant_NullType_String32 = variant_NullType_String37;
            variant_NullType_Double14 = variant_NullType_Double17;
        }
        return nitroProduct.copy(str18, str7, str8, str9, variant_NullType_String28, str10, str11, variant_NullType_Double13, iapPlatform2, variant_NullType_String29, variant_NullType_Boolean2, variant_NullType_String30, variant_NullType_String31, variant_NullType_String32, variant_NullType_Double12, variant_NullType_Double14, paymentModeIOS2, variant_NullType_String18, variant_NullType_Double8, variant_NullType_String19, variant_NullType_String20, variant_NullType_String21, variant_NullType_String22, variant_NullType_String23, variant_NullType_Double9, variant_NullType_Double10, variant_NullType_String24, variant_NullType_Double11, variant_NullType_String25, variant_NullType_String26, variant_NullType_String27, variant_NullType_Array_NitroOneTimePurchaseOfferDetail_2, variant_NullType_String17);
    }

    @JvmStatic
    private static final NitroProduct fromCpp(String str, String str2, String str3, String str4, Variant_NullType_String variant_NullType_String, String str5, String str6, Variant_NullType_Double variant_NullType_Double, IapPlatform iapPlatform, Variant_NullType_String variant_NullType_String2, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_Double variant_NullType_Double3, PaymentModeIOS paymentModeIOS, Variant_NullType_String variant_NullType_String6, Variant_NullType_Double variant_NullType_Double4, Variant_NullType_String variant_NullType_String7, Variant_NullType_String variant_NullType_String8, Variant_NullType_String variant_NullType_String9, Variant_NullType_String variant_NullType_String10, Variant_NullType_String variant_NullType_String11, Variant_NullType_Double variant_NullType_Double5, Variant_NullType_Double variant_NullType_Double6, Variant_NullType_String variant_NullType_String12, Variant_NullType_Double variant_NullType_Double7, Variant_NullType_String variant_NullType_String13, Variant_NullType_String variant_NullType_String14, Variant_NullType_String variant_NullType_String15, Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ variant_NullType_Array_NitroOneTimePurchaseOfferDetail_, Variant_NullType_String variant_NullType_String16) {
        return INSTANCE.fromCpp(str, str2, str3, str4, variant_NullType_String, str5, str6, variant_NullType_Double, iapPlatform, variant_NullType_String2, variant_NullType_Boolean, variant_NullType_String3, variant_NullType_String4, variant_NullType_String5, variant_NullType_Double2, variant_NullType_Double3, paymentModeIOS, variant_NullType_String6, variant_NullType_Double4, variant_NullType_String7, variant_NullType_String8, variant_NullType_String9, variant_NullType_String10, variant_NullType_String11, variant_NullType_Double5, variant_NullType_Double6, variant_NullType_String12, variant_NullType_Double7, variant_NullType_String13, variant_NullType_String14, variant_NullType_String15, variant_NullType_Array_NitroOneTimePurchaseOfferDetail_, variant_NullType_String16);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Variant_NullType_String getTypeIOS() {
        return this.typeIOS;
    }

    /* renamed from: component11, reason: from getter */
    public final Variant_NullType_Boolean getIsFamilyShareableIOS() {
        return this.isFamilyShareableIOS;
    }

    /* renamed from: component12, reason: from getter */
    public final Variant_NullType_String getJsonRepresentationIOS() {
        return this.jsonRepresentationIOS;
    }

    /* renamed from: component13, reason: from getter */
    public final Variant_NullType_String getDiscountsIOS() {
        return this.discountsIOS;
    }

    /* renamed from: component14, reason: from getter */
    public final Variant_NullType_String getIntroductoryPriceIOS() {
        return this.introductoryPriceIOS;
    }

    /* renamed from: component15, reason: from getter */
    public final Variant_NullType_Double getIntroductoryPriceAsAmountIOS() {
        return this.introductoryPriceAsAmountIOS;
    }

    /* renamed from: component16, reason: from getter */
    public final Variant_NullType_Double getIntroductoryPriceNumberOfPeriodsIOS() {
        return this.introductoryPriceNumberOfPeriodsIOS;
    }

    /* renamed from: component17, reason: from getter */
    public final PaymentModeIOS getIntroductoryPricePaymentModeIOS() {
        return this.introductoryPricePaymentModeIOS;
    }

    /* renamed from: component18, reason: from getter */
    public final Variant_NullType_String getIntroductoryPriceSubscriptionPeriodIOS() {
        return this.introductoryPriceSubscriptionPeriodIOS;
    }

    /* renamed from: component19, reason: from getter */
    public final Variant_NullType_Double getSubscriptionPeriodNumberIOS() {
        return this.subscriptionPeriodNumberIOS;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component20, reason: from getter */
    public final Variant_NullType_String getSubscriptionPeriodUnitIOS() {
        return this.subscriptionPeriodUnitIOS;
    }

    /* renamed from: component21, reason: from getter */
    public final Variant_NullType_String getSubscriptionOffers() {
        return this.subscriptionOffers;
    }

    /* renamed from: component22, reason: from getter */
    public final Variant_NullType_String getDiscountOffers() {
        return this.discountOffers;
    }

    /* renamed from: component23, reason: from getter */
    public final Variant_NullType_String getNameAndroid() {
        return this.nameAndroid;
    }

    /* renamed from: component24, reason: from getter */
    public final Variant_NullType_String getOriginalPriceAndroid() {
        return this.originalPriceAndroid;
    }

    /* renamed from: component25, reason: from getter */
    public final Variant_NullType_Double getOriginalPriceAmountMicrosAndroid() {
        return this.originalPriceAmountMicrosAndroid;
    }

    /* renamed from: component26, reason: from getter */
    public final Variant_NullType_Double getIntroductoryPriceCyclesAndroid() {
        return this.introductoryPriceCyclesAndroid;
    }

    /* renamed from: component27, reason: from getter */
    public final Variant_NullType_String getIntroductoryPricePeriodAndroid() {
        return this.introductoryPricePeriodAndroid;
    }

    /* renamed from: component28, reason: from getter */
    public final Variant_NullType_Double getIntroductoryPriceValueAndroid() {
        return this.introductoryPriceValueAndroid;
    }

    /* renamed from: component29, reason: from getter */
    public final Variant_NullType_String getSubscriptionPeriodAndroid() {
        return this.subscriptionPeriodAndroid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component30, reason: from getter */
    public final Variant_NullType_String getFreeTrialPeriodAndroid() {
        return this.freeTrialPeriodAndroid;
    }

    /* renamed from: component31, reason: from getter */
    public final Variant_NullType_String getSubscriptionOfferDetailsAndroid() {
        return this.subscriptionOfferDetailsAndroid;
    }

    /* renamed from: component32, reason: from getter */
    public final Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ getOneTimePurchaseOfferDetailsAndroid() {
        return this.oneTimePurchaseOfferDetailsAndroid;
    }

    /* renamed from: component33, reason: from getter */
    public final Variant_NullType_String getProductStatusAndroid() {
        return this.productStatusAndroid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final Variant_NullType_String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component8, reason: from getter */
    public final Variant_NullType_Double getPrice() {
        return this.price;
    }

    /* renamed from: component9, reason: from getter */
    public final IapPlatform getPlatform() {
        return this.platform;
    }

    public final NitroProduct copy(String id, String title, String description, String type, Variant_NullType_String displayName, String displayPrice, String currency, Variant_NullType_Double price, IapPlatform platform, Variant_NullType_String typeIOS, Variant_NullType_Boolean isFamilyShareableIOS, Variant_NullType_String jsonRepresentationIOS, Variant_NullType_String discountsIOS, Variant_NullType_String introductoryPriceIOS, Variant_NullType_Double introductoryPriceAsAmountIOS, Variant_NullType_Double introductoryPriceNumberOfPeriodsIOS, PaymentModeIOS introductoryPricePaymentModeIOS, Variant_NullType_String introductoryPriceSubscriptionPeriodIOS, Variant_NullType_Double subscriptionPeriodNumberIOS, Variant_NullType_String subscriptionPeriodUnitIOS, Variant_NullType_String subscriptionOffers, Variant_NullType_String discountOffers, Variant_NullType_String nameAndroid, Variant_NullType_String originalPriceAndroid, Variant_NullType_Double originalPriceAmountMicrosAndroid, Variant_NullType_Double introductoryPriceCyclesAndroid, Variant_NullType_String introductoryPricePeriodAndroid, Variant_NullType_Double introductoryPriceValueAndroid, Variant_NullType_String subscriptionPeriodAndroid, Variant_NullType_String freeTrialPeriodAndroid, Variant_NullType_String subscriptionOfferDetailsAndroid, Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ oneTimePurchaseOfferDetailsAndroid, Variant_NullType_String productStatusAndroid) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(introductoryPricePaymentModeIOS, "introductoryPricePaymentModeIOS");
        return new NitroProduct(id, title, description, type, displayName, displayPrice, currency, price, platform, typeIOS, isFamilyShareableIOS, jsonRepresentationIOS, discountsIOS, introductoryPriceIOS, introductoryPriceAsAmountIOS, introductoryPriceNumberOfPeriodsIOS, introductoryPricePaymentModeIOS, introductoryPriceSubscriptionPeriodIOS, subscriptionPeriodNumberIOS, subscriptionPeriodUnitIOS, subscriptionOffers, discountOffers, nameAndroid, originalPriceAndroid, originalPriceAmountMicrosAndroid, introductoryPriceCyclesAndroid, introductoryPricePeriodAndroid, introductoryPriceValueAndroid, subscriptionPeriodAndroid, freeTrialPeriodAndroid, subscriptionOfferDetailsAndroid, oneTimePurchaseOfferDetailsAndroid, productStatusAndroid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroProduct)) {
            return false;
        }
        NitroProduct nitroProduct = (NitroProduct) other;
        return Intrinsics.areEqual(this.id, nitroProduct.id) && Intrinsics.areEqual(this.title, nitroProduct.title) && Intrinsics.areEqual(this.description, nitroProduct.description) && Intrinsics.areEqual(this.type, nitroProduct.type) && Intrinsics.areEqual(this.displayName, nitroProduct.displayName) && Intrinsics.areEqual(this.displayPrice, nitroProduct.displayPrice) && Intrinsics.areEqual(this.currency, nitroProduct.currency) && Intrinsics.areEqual(this.price, nitroProduct.price) && this.platform == nitroProduct.platform && Intrinsics.areEqual(this.typeIOS, nitroProduct.typeIOS) && Intrinsics.areEqual(this.isFamilyShareableIOS, nitroProduct.isFamilyShareableIOS) && Intrinsics.areEqual(this.jsonRepresentationIOS, nitroProduct.jsonRepresentationIOS) && Intrinsics.areEqual(this.discountsIOS, nitroProduct.discountsIOS) && Intrinsics.areEqual(this.introductoryPriceIOS, nitroProduct.introductoryPriceIOS) && Intrinsics.areEqual(this.introductoryPriceAsAmountIOS, nitroProduct.introductoryPriceAsAmountIOS) && Intrinsics.areEqual(this.introductoryPriceNumberOfPeriodsIOS, nitroProduct.introductoryPriceNumberOfPeriodsIOS) && this.introductoryPricePaymentModeIOS == nitroProduct.introductoryPricePaymentModeIOS && Intrinsics.areEqual(this.introductoryPriceSubscriptionPeriodIOS, nitroProduct.introductoryPriceSubscriptionPeriodIOS) && Intrinsics.areEqual(this.subscriptionPeriodNumberIOS, nitroProduct.subscriptionPeriodNumberIOS) && Intrinsics.areEqual(this.subscriptionPeriodUnitIOS, nitroProduct.subscriptionPeriodUnitIOS) && Intrinsics.areEqual(this.subscriptionOffers, nitroProduct.subscriptionOffers) && Intrinsics.areEqual(this.discountOffers, nitroProduct.discountOffers) && Intrinsics.areEqual(this.nameAndroid, nitroProduct.nameAndroid) && Intrinsics.areEqual(this.originalPriceAndroid, nitroProduct.originalPriceAndroid) && Intrinsics.areEqual(this.originalPriceAmountMicrosAndroid, nitroProduct.originalPriceAmountMicrosAndroid) && Intrinsics.areEqual(this.introductoryPriceCyclesAndroid, nitroProduct.introductoryPriceCyclesAndroid) && Intrinsics.areEqual(this.introductoryPricePeriodAndroid, nitroProduct.introductoryPricePeriodAndroid) && Intrinsics.areEqual(this.introductoryPriceValueAndroid, nitroProduct.introductoryPriceValueAndroid) && Intrinsics.areEqual(this.subscriptionPeriodAndroid, nitroProduct.subscriptionPeriodAndroid) && Intrinsics.areEqual(this.freeTrialPeriodAndroid, nitroProduct.freeTrialPeriodAndroid) && Intrinsics.areEqual(this.subscriptionOfferDetailsAndroid, nitroProduct.subscriptionOfferDetailsAndroid) && Intrinsics.areEqual(this.oneTimePurchaseOfferDetailsAndroid, nitroProduct.oneTimePurchaseOfferDetailsAndroid) && Intrinsics.areEqual(this.productStatusAndroid, nitroProduct.productStatusAndroid);
    }

    public int hashCode() {
        int hashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.type.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String = this.displayName;
        int hashCode2 = (hashCode + (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode())) * 31;
        String str = this.displayPrice;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double = this.price;
        int hashCode5 = (((hashCode4 + (variant_NullType_Double == null ? 0 : variant_NullType_Double.hashCode())) * 31) + this.platform.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String2 = this.typeIOS;
        int hashCode6 = (hashCode5 + (variant_NullType_String2 == null ? 0 : variant_NullType_String2.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean = this.isFamilyShareableIOS;
        int hashCode7 = (hashCode6 + (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String3 = this.jsonRepresentationIOS;
        int hashCode8 = (hashCode7 + (variant_NullType_String3 == null ? 0 : variant_NullType_String3.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String4 = this.discountsIOS;
        int hashCode9 = (hashCode8 + (variant_NullType_String4 == null ? 0 : variant_NullType_String4.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String5 = this.introductoryPriceIOS;
        int hashCode10 = (hashCode9 + (variant_NullType_String5 == null ? 0 : variant_NullType_String5.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double2 = this.introductoryPriceAsAmountIOS;
        int hashCode11 = (hashCode10 + (variant_NullType_Double2 == null ? 0 : variant_NullType_Double2.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double3 = this.introductoryPriceNumberOfPeriodsIOS;
        int hashCode12 = (((hashCode11 + (variant_NullType_Double3 == null ? 0 : variant_NullType_Double3.hashCode())) * 31) + this.introductoryPricePaymentModeIOS.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String6 = this.introductoryPriceSubscriptionPeriodIOS;
        int hashCode13 = (hashCode12 + (variant_NullType_String6 == null ? 0 : variant_NullType_String6.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double4 = this.subscriptionPeriodNumberIOS;
        int hashCode14 = (hashCode13 + (variant_NullType_Double4 == null ? 0 : variant_NullType_Double4.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String7 = this.subscriptionPeriodUnitIOS;
        int hashCode15 = (hashCode14 + (variant_NullType_String7 == null ? 0 : variant_NullType_String7.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String8 = this.subscriptionOffers;
        int hashCode16 = (hashCode15 + (variant_NullType_String8 == null ? 0 : variant_NullType_String8.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String9 = this.discountOffers;
        int hashCode17 = (hashCode16 + (variant_NullType_String9 == null ? 0 : variant_NullType_String9.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String10 = this.nameAndroid;
        int hashCode18 = (hashCode17 + (variant_NullType_String10 == null ? 0 : variant_NullType_String10.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String11 = this.originalPriceAndroid;
        int hashCode19 = (hashCode18 + (variant_NullType_String11 == null ? 0 : variant_NullType_String11.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double5 = this.originalPriceAmountMicrosAndroid;
        int hashCode20 = (hashCode19 + (variant_NullType_Double5 == null ? 0 : variant_NullType_Double5.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double6 = this.introductoryPriceCyclesAndroid;
        int hashCode21 = (hashCode20 + (variant_NullType_Double6 == null ? 0 : variant_NullType_Double6.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String12 = this.introductoryPricePeriodAndroid;
        int hashCode22 = (hashCode21 + (variant_NullType_String12 == null ? 0 : variant_NullType_String12.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double7 = this.introductoryPriceValueAndroid;
        int hashCode23 = (hashCode22 + (variant_NullType_Double7 == null ? 0 : variant_NullType_Double7.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String13 = this.subscriptionPeriodAndroid;
        int hashCode24 = (hashCode23 + (variant_NullType_String13 == null ? 0 : variant_NullType_String13.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String14 = this.freeTrialPeriodAndroid;
        int hashCode25 = (hashCode24 + (variant_NullType_String14 == null ? 0 : variant_NullType_String14.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String15 = this.subscriptionOfferDetailsAndroid;
        int hashCode26 = (hashCode25 + (variant_NullType_String15 == null ? 0 : variant_NullType_String15.hashCode())) * 31;
        Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ = this.oneTimePurchaseOfferDetailsAndroid;
        int hashCode27 = (hashCode26 + (variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ == null ? 0 : variant_NullType_Array_NitroOneTimePurchaseOfferDetail_.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String16 = this.productStatusAndroid;
        return hashCode27 + (variant_NullType_String16 != null ? variant_NullType_String16.hashCode() : 0);
    }

    public String toString() {
        return "NitroProduct(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", type=" + this.type + ", displayName=" + this.displayName + ", displayPrice=" + this.displayPrice + ", currency=" + this.currency + ", price=" + this.price + ", platform=" + this.platform + ", typeIOS=" + this.typeIOS + ", isFamilyShareableIOS=" + this.isFamilyShareableIOS + ", jsonRepresentationIOS=" + this.jsonRepresentationIOS + ", discountsIOS=" + this.discountsIOS + ", introductoryPriceIOS=" + this.introductoryPriceIOS + ", introductoryPriceAsAmountIOS=" + this.introductoryPriceAsAmountIOS + ", introductoryPriceNumberOfPeriodsIOS=" + this.introductoryPriceNumberOfPeriodsIOS + ", introductoryPricePaymentModeIOS=" + this.introductoryPricePaymentModeIOS + ", introductoryPriceSubscriptionPeriodIOS=" + this.introductoryPriceSubscriptionPeriodIOS + ", subscriptionPeriodNumberIOS=" + this.subscriptionPeriodNumberIOS + ", subscriptionPeriodUnitIOS=" + this.subscriptionPeriodUnitIOS + ", subscriptionOffers=" + this.subscriptionOffers + ", discountOffers=" + this.discountOffers + ", nameAndroid=" + this.nameAndroid + ", originalPriceAndroid=" + this.originalPriceAndroid + ", originalPriceAmountMicrosAndroid=" + this.originalPriceAmountMicrosAndroid + ", introductoryPriceCyclesAndroid=" + this.introductoryPriceCyclesAndroid + ", introductoryPricePeriodAndroid=" + this.introductoryPricePeriodAndroid + ", introductoryPriceValueAndroid=" + this.introductoryPriceValueAndroid + ", subscriptionPeriodAndroid=" + this.subscriptionPeriodAndroid + ", freeTrialPeriodAndroid=" + this.freeTrialPeriodAndroid + ", subscriptionOfferDetailsAndroid=" + this.subscriptionOfferDetailsAndroid + ", oneTimePurchaseOfferDetailsAndroid=" + this.oneTimePurchaseOfferDetailsAndroid + ", productStatusAndroid=" + this.productStatusAndroid + ")";
    }

    public NitroProduct(String id, String title, String description, String type, Variant_NullType_String variant_NullType_String, String str, String str2, Variant_NullType_Double variant_NullType_Double, IapPlatform platform, Variant_NullType_String variant_NullType_String2, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_Double variant_NullType_Double3, PaymentModeIOS introductoryPricePaymentModeIOS, Variant_NullType_String variant_NullType_String6, Variant_NullType_Double variant_NullType_Double4, Variant_NullType_String variant_NullType_String7, Variant_NullType_String variant_NullType_String8, Variant_NullType_String variant_NullType_String9, Variant_NullType_String variant_NullType_String10, Variant_NullType_String variant_NullType_String11, Variant_NullType_Double variant_NullType_Double5, Variant_NullType_Double variant_NullType_Double6, Variant_NullType_String variant_NullType_String12, Variant_NullType_Double variant_NullType_Double7, Variant_NullType_String variant_NullType_String13, Variant_NullType_String variant_NullType_String14, Variant_NullType_String variant_NullType_String15, Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ variant_NullType_Array_NitroOneTimePurchaseOfferDetail_, Variant_NullType_String variant_NullType_String16) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(introductoryPricePaymentModeIOS, "introductoryPricePaymentModeIOS");
        this.id = id;
        this.title = title;
        this.description = description;
        this.type = type;
        this.displayName = variant_NullType_String;
        this.displayPrice = str;
        this.currency = str2;
        this.price = variant_NullType_Double;
        this.platform = platform;
        this.typeIOS = variant_NullType_String2;
        this.isFamilyShareableIOS = variant_NullType_Boolean;
        this.jsonRepresentationIOS = variant_NullType_String3;
        this.discountsIOS = variant_NullType_String4;
        this.introductoryPriceIOS = variant_NullType_String5;
        this.introductoryPriceAsAmountIOS = variant_NullType_Double2;
        this.introductoryPriceNumberOfPeriodsIOS = variant_NullType_Double3;
        this.introductoryPricePaymentModeIOS = introductoryPricePaymentModeIOS;
        this.introductoryPriceSubscriptionPeriodIOS = variant_NullType_String6;
        this.subscriptionPeriodNumberIOS = variant_NullType_Double4;
        this.subscriptionPeriodUnitIOS = variant_NullType_String7;
        this.subscriptionOffers = variant_NullType_String8;
        this.discountOffers = variant_NullType_String9;
        this.nameAndroid = variant_NullType_String10;
        this.originalPriceAndroid = variant_NullType_String11;
        this.originalPriceAmountMicrosAndroid = variant_NullType_Double5;
        this.introductoryPriceCyclesAndroid = variant_NullType_Double6;
        this.introductoryPricePeriodAndroid = variant_NullType_String12;
        this.introductoryPriceValueAndroid = variant_NullType_Double7;
        this.subscriptionPeriodAndroid = variant_NullType_String13;
        this.freeTrialPeriodAndroid = variant_NullType_String14;
        this.subscriptionOfferDetailsAndroid = variant_NullType_String15;
        this.oneTimePurchaseOfferDetailsAndroid = variant_NullType_Array_NitroOneTimePurchaseOfferDetail_;
        this.productStatusAndroid = variant_NullType_String16;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getType() {
        return this.type;
    }

    public final Variant_NullType_String getDisplayName() {
        return this.displayName;
    }

    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Variant_NullType_Double getPrice() {
        return this.price;
    }

    public final IapPlatform getPlatform() {
        return this.platform;
    }

    public final Variant_NullType_String getTypeIOS() {
        return this.typeIOS;
    }

    public final Variant_NullType_Boolean isFamilyShareableIOS() {
        return this.isFamilyShareableIOS;
    }

    public final Variant_NullType_String getJsonRepresentationIOS() {
        return this.jsonRepresentationIOS;
    }

    public final Variant_NullType_String getDiscountsIOS() {
        return this.discountsIOS;
    }

    public final Variant_NullType_String getIntroductoryPriceIOS() {
        return this.introductoryPriceIOS;
    }

    public final Variant_NullType_Double getIntroductoryPriceAsAmountIOS() {
        return this.introductoryPriceAsAmountIOS;
    }

    public final Variant_NullType_Double getIntroductoryPriceNumberOfPeriodsIOS() {
        return this.introductoryPriceNumberOfPeriodsIOS;
    }

    public final PaymentModeIOS getIntroductoryPricePaymentModeIOS() {
        return this.introductoryPricePaymentModeIOS;
    }

    public final Variant_NullType_String getIntroductoryPriceSubscriptionPeriodIOS() {
        return this.introductoryPriceSubscriptionPeriodIOS;
    }

    public final Variant_NullType_Double getSubscriptionPeriodNumberIOS() {
        return this.subscriptionPeriodNumberIOS;
    }

    public final Variant_NullType_String getSubscriptionPeriodUnitIOS() {
        return this.subscriptionPeriodUnitIOS;
    }

    public final Variant_NullType_String getSubscriptionOffers() {
        return this.subscriptionOffers;
    }

    public final Variant_NullType_String getDiscountOffers() {
        return this.discountOffers;
    }

    public final Variant_NullType_String getNameAndroid() {
        return this.nameAndroid;
    }

    public final Variant_NullType_String getOriginalPriceAndroid() {
        return this.originalPriceAndroid;
    }

    public final Variant_NullType_Double getOriginalPriceAmountMicrosAndroid() {
        return this.originalPriceAmountMicrosAndroid;
    }

    public final Variant_NullType_Double getIntroductoryPriceCyclesAndroid() {
        return this.introductoryPriceCyclesAndroid;
    }

    public final Variant_NullType_String getIntroductoryPricePeriodAndroid() {
        return this.introductoryPricePeriodAndroid;
    }

    public final Variant_NullType_Double getIntroductoryPriceValueAndroid() {
        return this.introductoryPriceValueAndroid;
    }

    public final Variant_NullType_String getSubscriptionPeriodAndroid() {
        return this.subscriptionPeriodAndroid;
    }

    public final Variant_NullType_String getFreeTrialPeriodAndroid() {
        return this.freeTrialPeriodAndroid;
    }

    public final Variant_NullType_String getSubscriptionOfferDetailsAndroid() {
        return this.subscriptionOfferDetailsAndroid;
    }

    public final Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ getOneTimePurchaseOfferDetailsAndroid() {
        return this.oneTimePurchaseOfferDetailsAndroid;
    }

    public final Variant_NullType_String getProductStatusAndroid() {
        return this.productStatusAndroid;
    }

    /* compiled from: NitroProduct.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÆ\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010!\u001a\u0004\u0018\u00010\f2\b\u0010\"\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\u00102\b\u0010%\u001a\u0004\u0018\u00010\u00102\b\u0010&\u001a\u0004\u0018\u00010\f2\b\u0010'\u001a\u0004\u0018\u00010\u00102\b\u0010(\u001a\u0004\u0018\u00010\f2\b\u0010)\u001a\u0004\u0018\u00010\f2\b\u0010*\u001a\u0004\u0018\u00010\f2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010\fH\u0003¨\u0006."}, d2 = {"Lcom/margelo/nitro/iap/NitroProduct$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroProduct;", "id", "", "title", "description", WebViewManager.EVENT_TYPE_KEY, "displayName", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "displayPrice", "currency", "price", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "platform", "Lcom/margelo/nitro/iap/IapPlatform;", "typeIOS", "isFamilyShareableIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "jsonRepresentationIOS", "discountsIOS", "introductoryPriceIOS", "introductoryPriceAsAmountIOS", "introductoryPriceNumberOfPeriodsIOS", "introductoryPricePaymentModeIOS", "Lcom/margelo/nitro/iap/PaymentModeIOS;", "introductoryPriceSubscriptionPeriodIOS", "subscriptionPeriodNumberIOS", "subscriptionPeriodUnitIOS", "subscriptionOffers", "discountOffers", "nameAndroid", "originalPriceAndroid", "originalPriceAmountMicrosAndroid", "introductoryPriceCyclesAndroid", "introductoryPricePeriodAndroid", "introductoryPriceValueAndroid", "subscriptionPeriodAndroid", "freeTrialPeriodAndroid", "subscriptionOfferDetailsAndroid", "oneTimePurchaseOfferDetailsAndroid", "Lcom/margelo/nitro/iap/Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_;", "productStatusAndroid", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroProduct fromCpp(String id, String title, String description, String type, Variant_NullType_String displayName, String displayPrice, String currency, Variant_NullType_Double price, IapPlatform platform, Variant_NullType_String typeIOS, Variant_NullType_Boolean isFamilyShareableIOS, Variant_NullType_String jsonRepresentationIOS, Variant_NullType_String discountsIOS, Variant_NullType_String introductoryPriceIOS, Variant_NullType_Double introductoryPriceAsAmountIOS, Variant_NullType_Double introductoryPriceNumberOfPeriodsIOS, PaymentModeIOS introductoryPricePaymentModeIOS, Variant_NullType_String introductoryPriceSubscriptionPeriodIOS, Variant_NullType_Double subscriptionPeriodNumberIOS, Variant_NullType_String subscriptionPeriodUnitIOS, Variant_NullType_String subscriptionOffers, Variant_NullType_String discountOffers, Variant_NullType_String nameAndroid, Variant_NullType_String originalPriceAndroid, Variant_NullType_Double originalPriceAmountMicrosAndroid, Variant_NullType_Double introductoryPriceCyclesAndroid, Variant_NullType_String introductoryPricePeriodAndroid, Variant_NullType_Double introductoryPriceValueAndroid, Variant_NullType_String subscriptionPeriodAndroid, Variant_NullType_String freeTrialPeriodAndroid, Variant_NullType_String subscriptionOfferDetailsAndroid, Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_ oneTimePurchaseOfferDetailsAndroid, Variant_NullType_String productStatusAndroid) {
            return new NitroProduct(id, title, description, type, displayName, displayPrice, currency, price, platform, typeIOS, isFamilyShareableIOS, jsonRepresentationIOS, discountsIOS, introductoryPriceIOS, introductoryPriceAsAmountIOS, introductoryPriceNumberOfPeriodsIOS, introductoryPricePaymentModeIOS, introductoryPriceSubscriptionPeriodIOS, subscriptionPeriodNumberIOS, subscriptionPeriodUnitIOS, subscriptionOffers, discountOffers, nameAndroid, originalPriceAndroid, originalPriceAmountMicrosAndroid, introductoryPriceCyclesAndroid, introductoryPricePeriodAndroid, introductoryPriceValueAndroid, subscriptionPeriodAndroid, freeTrialPeriodAndroid, subscriptionOfferDetailsAndroid, oneTimePurchaseOfferDetailsAndroid, productStatusAndroid);
        }
    }
}
