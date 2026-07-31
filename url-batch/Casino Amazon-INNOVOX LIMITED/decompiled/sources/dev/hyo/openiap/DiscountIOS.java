package dev.hyo.openiap;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J[\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006-"}, d2 = {"Ldev/hyo/openiap/DiscountIOS;", "", "identifier", "", "localizedPrice", "numberOfPeriods", "", "paymentMode", "Ldev/hyo/openiap/PaymentModeIOS;", "price", "priceAmount", "", "subscriptionPeriod", WebViewManager.EVENT_TYPE_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;ILdev/hyo/openiap/PaymentModeIOS;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getLocalizedPrice", "getNumberOfPeriods", "()I", "getPaymentMode", "()Ldev/hyo/openiap/PaymentModeIOS;", "getPrice", "getPriceAmount", "()D", "getSubscriptionPeriod", "getType", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiscountIOS {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String identifier;
    private final String localizedPrice;
    private final int numberOfPeriods;
    private final PaymentModeIOS paymentMode;
    private final String price;
    private final double priceAmount;
    private final String subscriptionPeriod;
    private final String type;

    public static /* synthetic */ DiscountIOS copy$default(DiscountIOS discountIOS, String str, String str2, int i, PaymentModeIOS paymentModeIOS, String str3, double d, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = discountIOS.identifier;
        }
        if ((i2 & 2) != 0) {
            str2 = discountIOS.localizedPrice;
        }
        if ((i2 & 4) != 0) {
            i = discountIOS.numberOfPeriods;
        }
        if ((i2 & 8) != 0) {
            paymentModeIOS = discountIOS.paymentMode;
        }
        if ((i2 & 16) != 0) {
            str3 = discountIOS.price;
        }
        if ((i2 & 32) != 0) {
            d = discountIOS.priceAmount;
        }
        if ((i2 & 64) != 0) {
            str4 = discountIOS.subscriptionPeriod;
        }
        if ((i2 & 128) != 0) {
            str5 = discountIOS.type;
        }
        double d2 = d;
        PaymentModeIOS paymentModeIOS2 = paymentModeIOS;
        String str6 = str3;
        int i3 = i;
        return discountIOS.copy(str, str2, i3, paymentModeIOS2, str6, d2, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLocalizedPrice() {
        return this.localizedPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNumberOfPeriods() {
        return this.numberOfPeriods;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentModeIOS getPaymentMode() {
        return this.paymentMode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: component6, reason: from getter */
    public final double getPriceAmount() {
        return this.priceAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    /* renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final DiscountIOS copy(String identifier, String localizedPrice, int numberOfPeriods, PaymentModeIOS paymentMode, String price, double priceAmount, String subscriptionPeriod, String type) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(subscriptionPeriod, "subscriptionPeriod");
        Intrinsics.checkNotNullParameter(type, "type");
        return new DiscountIOS(identifier, localizedPrice, numberOfPeriods, paymentMode, price, priceAmount, subscriptionPeriod, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountIOS)) {
            return false;
        }
        DiscountIOS discountIOS = (DiscountIOS) other;
        return Intrinsics.areEqual(this.identifier, discountIOS.identifier) && Intrinsics.areEqual(this.localizedPrice, discountIOS.localizedPrice) && this.numberOfPeriods == discountIOS.numberOfPeriods && this.paymentMode == discountIOS.paymentMode && Intrinsics.areEqual(this.price, discountIOS.price) && Double.compare(this.priceAmount, discountIOS.priceAmount) == 0 && Intrinsics.areEqual(this.subscriptionPeriod, discountIOS.subscriptionPeriod) && Intrinsics.areEqual(this.type, discountIOS.type);
    }

    public int hashCode() {
        int hashCode = this.identifier.hashCode() * 31;
        String str = this.localizedPrice;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.numberOfPeriods)) * 31) + this.paymentMode.hashCode()) * 31) + this.price.hashCode()) * 31) + Double.hashCode(this.priceAmount)) * 31) + this.subscriptionPeriod.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "DiscountIOS(identifier=" + this.identifier + ", localizedPrice=" + this.localizedPrice + ", numberOfPeriods=" + this.numberOfPeriods + ", paymentMode=" + this.paymentMode + ", price=" + this.price + ", priceAmount=" + this.priceAmount + ", subscriptionPeriod=" + this.subscriptionPeriod + ", type=" + this.type + ")";
    }

    public DiscountIOS(String identifier, String str, int i, PaymentModeIOS paymentMode, String price, double d, String subscriptionPeriod, String type) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(subscriptionPeriod, "subscriptionPeriod");
        Intrinsics.checkNotNullParameter(type, "type");
        this.identifier = identifier;
        this.localizedPrice = str;
        this.numberOfPeriods = i;
        this.paymentMode = paymentMode;
        this.price = price;
        this.priceAmount = d;
        this.subscriptionPeriod = subscriptionPeriod;
        this.type = type;
    }

    public /* synthetic */ DiscountIOS(String str, String str2, int i, PaymentModeIOS paymentModeIOS, String str3, double d, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, i, paymentModeIOS, str3, d, str4, str5);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getLocalizedPrice() {
        return this.localizedPrice;
    }

    public final int getNumberOfPeriods() {
        return this.numberOfPeriods;
    }

    public final PaymentModeIOS getPaymentMode() {
        return this.paymentMode;
    }

    public final String getPrice() {
        return this.price;
    }

    public final double getPriceAmount() {
        return this.priceAmount;
    }

    public final String getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public final String getType() {
        return this.type;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/DiscountIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/DiscountIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DiscountIOS fromJson(Map<String, ? extends Object> json) {
            PaymentModeIOS paymentModeIOS;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("identifier");
            String str = obj instanceof String ? (String) obj : null;
            String str2 = str == null ? "" : str;
            Object obj2 = json.get("localizedPrice");
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = json.get("numberOfPeriods");
            Number number = obj3 instanceof Number ? (Number) obj3 : null;
            int intValue = number != null ? number.intValue() : 0;
            Object obj4 = json.get("paymentMode");
            String str4 = obj4 instanceof String ? (String) obj4 : null;
            if (str4 == null || (paymentModeIOS = PaymentModeIOS.INSTANCE.fromJson(str4)) == null) {
                paymentModeIOS = PaymentModeIOS.Empty;
            }
            PaymentModeIOS paymentModeIOS2 = paymentModeIOS;
            Object obj5 = json.get("price");
            String str5 = obj5 instanceof String ? (String) obj5 : null;
            String str6 = str5 == null ? "" : str5;
            Object obj6 = json.get("priceAmount");
            Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
            double doubleValue = number2 != null ? number2.doubleValue() : 0.0d;
            Object obj7 = json.get("subscriptionPeriod");
            String str7 = obj7 instanceof String ? (String) obj7 : null;
            String str8 = str7 == null ? "" : str7;
            Object obj8 = json.get(WebViewManager.EVENT_TYPE_KEY);
            String str9 = obj8 instanceof String ? (String) obj8 : null;
            return new DiscountIOS(str2, str3, intValue, paymentModeIOS2, str6, doubleValue, str8, str9 == null ? "" : str9);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "DiscountIOS"), TuplesKt.to("identifier", this.identifier), TuplesKt.to("localizedPrice", this.localizedPrice), TuplesKt.to("numberOfPeriods", Integer.valueOf(this.numberOfPeriods)), TuplesKt.to("paymentMode", this.paymentMode.toJson()), TuplesKt.to("price", this.price), TuplesKt.to("priceAmount", Double.valueOf(this.priceAmount)), TuplesKt.to("subscriptionPeriod", this.subscriptionPeriod), TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, this.type));
    }
}
