package dev.hyo.openiap;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, d2 = {"Ldev/hyo/openiap/PurchaseOfferIOS;", "", "id", "", "paymentMode", WebViewManager.EVENT_TYPE_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPaymentMode", "getType", "toJson", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PurchaseOfferIOS {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private final String paymentMode;
    private final String type;

    public static /* synthetic */ PurchaseOfferIOS copy$default(PurchaseOfferIOS purchaseOfferIOS, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchaseOfferIOS.id;
        }
        if ((i & 2) != 0) {
            str2 = purchaseOfferIOS.paymentMode;
        }
        if ((i & 4) != 0) {
            str3 = purchaseOfferIOS.type;
        }
        return purchaseOfferIOS.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMode() {
        return this.paymentMode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final PurchaseOfferIOS copy(String id, String paymentMode, String type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(type, "type");
        return new PurchaseOfferIOS(id, paymentMode, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseOfferIOS)) {
            return false;
        }
        PurchaseOfferIOS purchaseOfferIOS = (PurchaseOfferIOS) other;
        return Intrinsics.areEqual(this.id, purchaseOfferIOS.id) && Intrinsics.areEqual(this.paymentMode, purchaseOfferIOS.paymentMode) && Intrinsics.areEqual(this.type, purchaseOfferIOS.type);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.paymentMode.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "PurchaseOfferIOS(id=" + this.id + ", paymentMode=" + this.paymentMode + ", type=" + this.type + ")";
    }

    public PurchaseOfferIOS(String id, String paymentMode, String type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.paymentMode = paymentMode;
        this.type = type;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final String getType() {
        return this.type;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/PurchaseOfferIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/PurchaseOfferIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PurchaseOfferIOS fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("id");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = "";
            }
            Object obj2 = json.get("paymentMode");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null) {
                str2 = "";
            }
            Object obj3 = json.get(WebViewManager.EVENT_TYPE_KEY);
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            return new PurchaseOfferIOS(str, str2, str3 != null ? str3 : "");
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "PurchaseOfferIOS"), TuplesKt.to("id", this.id), TuplesKt.to("paymentMode", this.paymentMode), TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, this.type));
    }
}
