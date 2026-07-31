package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Ldev/hyo/openiap/AndroidSubscriptionOfferInput;", "", "offerToken", "", "sku", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOfferToken", "()Ljava/lang/String;", "getSku", "toJson", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AndroidSubscriptionOfferInput {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String offerToken;
    private final String sku;

    public static /* synthetic */ AndroidSubscriptionOfferInput copy$default(AndroidSubscriptionOfferInput androidSubscriptionOfferInput, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = androidSubscriptionOfferInput.offerToken;
        }
        if ((i & 2) != 0) {
            str2 = androidSubscriptionOfferInput.sku;
        }
        return androidSubscriptionOfferInput.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    public final AndroidSubscriptionOfferInput copy(String offerToken, String sku) {
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new AndroidSubscriptionOfferInput(offerToken, sku);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidSubscriptionOfferInput)) {
            return false;
        }
        AndroidSubscriptionOfferInput androidSubscriptionOfferInput = (AndroidSubscriptionOfferInput) other;
        return Intrinsics.areEqual(this.offerToken, androidSubscriptionOfferInput.offerToken) && Intrinsics.areEqual(this.sku, androidSubscriptionOfferInput.sku);
    }

    public int hashCode() {
        return (this.offerToken.hashCode() * 31) + this.sku.hashCode();
    }

    public String toString() {
        return "AndroidSubscriptionOfferInput(offerToken=" + this.offerToken + ", sku=" + this.sku + ")";
    }

    public AndroidSubscriptionOfferInput(String offerToken, String sku) {
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.offerToken = offerToken;
        this.sku = sku;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final String getSku() {
        return this.sku;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/AndroidSubscriptionOfferInput$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/AndroidSubscriptionOfferInput;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AndroidSubscriptionOfferInput fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("offerToken");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("sku");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str == null || str2 == null) {
                return null;
            }
            return new AndroidSubscriptionOfferInput(str, str2);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("offerToken", this.offerToken), TuplesKt.to("sku", this.sku));
    }
}
