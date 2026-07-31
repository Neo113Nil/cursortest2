package dev.hyo.openiap;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\nHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Ldev/hyo/openiap/SubscriptionOfferIOS;", "", "displayPrice", "", "id", "paymentMode", "Ldev/hyo/openiap/PaymentModeIOS;", TypedValues.Cycle.S_WAVE_PERIOD, "Ldev/hyo/openiap/SubscriptionPeriodValueIOS;", "periodCount", "", "price", "", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/SubscriptionOfferTypeIOS;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/PaymentModeIOS;Ldev/hyo/openiap/SubscriptionPeriodValueIOS;IDLdev/hyo/openiap/SubscriptionOfferTypeIOS;)V", "getDisplayPrice", "()Ljava/lang/String;", "getId", "getPaymentMode", "()Ldev/hyo/openiap/PaymentModeIOS;", "getPeriod", "()Ldev/hyo/openiap/SubscriptionPeriodValueIOS;", "getPeriodCount", "()I", "getPrice", "()D", "getType", "()Ldev/hyo/openiap/SubscriptionOfferTypeIOS;", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionOfferIOS {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String displayPrice;
    private final String id;
    private final PaymentModeIOS paymentMode;
    private final SubscriptionPeriodValueIOS period;
    private final int periodCount;
    private final double price;
    private final SubscriptionOfferTypeIOS type;

    public static /* synthetic */ SubscriptionOfferIOS copy$default(SubscriptionOfferIOS subscriptionOfferIOS, String str, String str2, PaymentModeIOS paymentModeIOS, SubscriptionPeriodValueIOS subscriptionPeriodValueIOS, int i, double d, SubscriptionOfferTypeIOS subscriptionOfferTypeIOS, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subscriptionOfferIOS.displayPrice;
        }
        if ((i2 & 2) != 0) {
            str2 = subscriptionOfferIOS.id;
        }
        if ((i2 & 4) != 0) {
            paymentModeIOS = subscriptionOfferIOS.paymentMode;
        }
        if ((i2 & 8) != 0) {
            subscriptionPeriodValueIOS = subscriptionOfferIOS.period;
        }
        if ((i2 & 16) != 0) {
            i = subscriptionOfferIOS.periodCount;
        }
        if ((i2 & 32) != 0) {
            d = subscriptionOfferIOS.price;
        }
        if ((i2 & 64) != 0) {
            subscriptionOfferTypeIOS = subscriptionOfferIOS.type;
        }
        SubscriptionOfferTypeIOS subscriptionOfferTypeIOS2 = subscriptionOfferTypeIOS;
        double d2 = d;
        int i3 = i;
        PaymentModeIOS paymentModeIOS2 = paymentModeIOS;
        return subscriptionOfferIOS.copy(str, str2, paymentModeIOS2, subscriptionPeriodValueIOS, i3, d2, subscriptionOfferTypeIOS2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentModeIOS getPaymentMode() {
        return this.paymentMode;
    }

    /* renamed from: component4, reason: from getter */
    public final SubscriptionPeriodValueIOS getPeriod() {
        return this.period;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    /* renamed from: component6, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component7, reason: from getter */
    public final SubscriptionOfferTypeIOS getType() {
        return this.type;
    }

    public final SubscriptionOfferIOS copy(String displayPrice, String id, PaymentModeIOS paymentMode, SubscriptionPeriodValueIOS period, int periodCount, double price, SubscriptionOfferTypeIOS type) {
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(type, "type");
        return new SubscriptionOfferIOS(displayPrice, id, paymentMode, period, periodCount, price, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionOfferIOS)) {
            return false;
        }
        SubscriptionOfferIOS subscriptionOfferIOS = (SubscriptionOfferIOS) other;
        return Intrinsics.areEqual(this.displayPrice, subscriptionOfferIOS.displayPrice) && Intrinsics.areEqual(this.id, subscriptionOfferIOS.id) && this.paymentMode == subscriptionOfferIOS.paymentMode && Intrinsics.areEqual(this.period, subscriptionOfferIOS.period) && this.periodCount == subscriptionOfferIOS.periodCount && Double.compare(this.price, subscriptionOfferIOS.price) == 0 && this.type == subscriptionOfferIOS.type;
    }

    public int hashCode() {
        return (((((((((((this.displayPrice.hashCode() * 31) + this.id.hashCode()) * 31) + this.paymentMode.hashCode()) * 31) + this.period.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Double.hashCode(this.price)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SubscriptionOfferIOS(displayPrice=" + this.displayPrice + ", id=" + this.id + ", paymentMode=" + this.paymentMode + ", period=" + this.period + ", periodCount=" + this.periodCount + ", price=" + this.price + ", type=" + this.type + ")";
    }

    public SubscriptionOfferIOS(String displayPrice, String id, PaymentModeIOS paymentMode, SubscriptionPeriodValueIOS period, int i, double d, SubscriptionOfferTypeIOS type) {
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(type, "type");
        this.displayPrice = displayPrice;
        this.id = id;
        this.paymentMode = paymentMode;
        this.period = period;
        this.periodCount = i;
        this.price = d;
        this.type = type;
    }

    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    public final String getId() {
        return this.id;
    }

    public final PaymentModeIOS getPaymentMode() {
        return this.paymentMode;
    }

    public final SubscriptionPeriodValueIOS getPeriod() {
        return this.period;
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final double getPrice() {
        return this.price;
    }

    public final SubscriptionOfferTypeIOS getType() {
        return this.type;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/SubscriptionOfferIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/SubscriptionOfferIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SubscriptionOfferIOS fromJson(Map<String, ? extends Object> json) {
            PaymentModeIOS paymentModeIOS;
            SubscriptionPeriodValueIOS fromJson;
            SubscriptionOfferTypeIOS subscriptionOfferTypeIOS;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("displayPrice");
            String str = obj instanceof String ? (String) obj : null;
            String str2 = str == null ? "" : str;
            Object obj2 = json.get("id");
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            String str4 = str3 == null ? "" : str3;
            Object obj3 = json.get("paymentMode");
            String str5 = obj3 instanceof String ? (String) obj3 : null;
            if (str5 == null || (paymentModeIOS = PaymentModeIOS.INSTANCE.fromJson(str5)) == null) {
                paymentModeIOS = PaymentModeIOS.Empty;
            }
            PaymentModeIOS paymentModeIOS2 = paymentModeIOS;
            Object obj4 = json.get(TypedValues.Cycle.S_WAVE_PERIOD);
            Map<String, ? extends Object> map = obj4 instanceof Map ? (Map) obj4 : null;
            if (map == null || (fromJson = SubscriptionPeriodValueIOS.INSTANCE.fromJson(map)) == null) {
                throw new IllegalArgumentException("Missing required object for SubscriptionPeriodValueIOS");
            }
            Object obj5 = json.get("periodCount");
            Number number = obj5 instanceof Number ? (Number) obj5 : null;
            int intValue = number != null ? number.intValue() : 0;
            Object obj6 = json.get("price");
            Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
            double doubleValue = number2 != null ? number2.doubleValue() : 0.0d;
            Object obj7 = json.get(WebViewManager.EVENT_TYPE_KEY);
            String str6 = obj7 instanceof String ? (String) obj7 : null;
            if (str6 == null || (subscriptionOfferTypeIOS = SubscriptionOfferTypeIOS.INSTANCE.fromJson(str6)) == null) {
                subscriptionOfferTypeIOS = SubscriptionOfferTypeIOS.Introductory;
            }
            return new SubscriptionOfferIOS(str2, str4, paymentModeIOS2, fromJson, intValue, doubleValue, subscriptionOfferTypeIOS);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "SubscriptionOfferIOS"), TuplesKt.to("displayPrice", this.displayPrice), TuplesKt.to("id", this.id), TuplesKt.to("paymentMode", this.paymentMode.toJson()), TuplesKt.to(TypedValues.Cycle.S_WAVE_PERIOD, this.period.toJson()), TuplesKt.to("periodCount", Integer.valueOf(this.periodCount)), TuplesKt.to("price", Double.valueOf(this.price)), TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, this.type.toJson()));
    }
}
