package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Ldev/hyo/openiap/DiscountOfferIOS;", "", "identifier", "", "keyIdentifier", "nonce", "signature", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getIdentifier", "()Ljava/lang/String;", "getKeyIdentifier", "getNonce", "getSignature", "getTimestamp", "()D", "toJson", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiscountOfferIOS {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String identifier;
    private final String keyIdentifier;
    private final String nonce;
    private final String signature;
    private final double timestamp;

    public static /* synthetic */ DiscountOfferIOS copy$default(DiscountOfferIOS discountOfferIOS, String str, String str2, String str3, String str4, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discountOfferIOS.identifier;
        }
        if ((i & 2) != 0) {
            str2 = discountOfferIOS.keyIdentifier;
        }
        if ((i & 4) != 0) {
            str3 = discountOfferIOS.nonce;
        }
        if ((i & 8) != 0) {
            str4 = discountOfferIOS.signature;
        }
        if ((i & 16) != 0) {
            d = discountOfferIOS.timestamp;
        }
        double d2 = d;
        return discountOfferIOS.copy(str, str2, str3, str4, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* renamed from: component5, reason: from getter */
    public final double getTimestamp() {
        return this.timestamp;
    }

    public final DiscountOfferIOS copy(String identifier, String keyIdentifier, String nonce, String signature, double timestamp) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new DiscountOfferIOS(identifier, keyIdentifier, nonce, signature, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountOfferIOS)) {
            return false;
        }
        DiscountOfferIOS discountOfferIOS = (DiscountOfferIOS) other;
        return Intrinsics.areEqual(this.identifier, discountOfferIOS.identifier) && Intrinsics.areEqual(this.keyIdentifier, discountOfferIOS.keyIdentifier) && Intrinsics.areEqual(this.nonce, discountOfferIOS.nonce) && Intrinsics.areEqual(this.signature, discountOfferIOS.signature) && Double.compare(this.timestamp, discountOfferIOS.timestamp) == 0;
    }

    public int hashCode() {
        return (((((((this.identifier.hashCode() * 31) + this.keyIdentifier.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.signature.hashCode()) * 31) + Double.hashCode(this.timestamp);
    }

    public String toString() {
        return "DiscountOfferIOS(identifier=" + this.identifier + ", keyIdentifier=" + this.keyIdentifier + ", nonce=" + this.nonce + ", signature=" + this.signature + ", timestamp=" + this.timestamp + ")";
    }

    public DiscountOfferIOS(String identifier, String keyIdentifier, String nonce, String signature, double d) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.identifier = identifier;
        this.keyIdentifier = keyIdentifier;
        this.nonce = nonce;
        this.signature = signature;
        this.timestamp = d;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final double getTimestamp() {
        return this.timestamp;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/DiscountOfferIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/DiscountOfferIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DiscountOfferIOS fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("identifier");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = "";
            }
            Object obj2 = json.get("keyIdentifier");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null) {
                str2 = "";
            }
            Object obj3 = json.get("nonce");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str3 == null) {
                str3 = "";
            }
            Object obj4 = json.get("signature");
            String str4 = obj4 instanceof String ? (String) obj4 : null;
            String str5 = str4 != null ? str4 : "";
            Object obj5 = json.get("timestamp");
            Number number = obj5 instanceof Number ? (Number) obj5 : null;
            return new DiscountOfferIOS(str, str2, str3, str5, number != null ? number.doubleValue() : 0.0d);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "DiscountOfferIOS"), TuplesKt.to("identifier", this.identifier), TuplesKt.to("keyIdentifier", this.keyIdentifier), TuplesKt.to("nonce", this.nonce), TuplesKt.to("signature", this.signature), TuplesKt.to("timestamp", Double.valueOf(this.timestamp)));
    }
}
