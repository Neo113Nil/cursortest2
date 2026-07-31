package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, d2 = {"Ldev/hyo/openiap/EntitlementIOS;", "", "jsonRepresentation", "", "sku", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getJsonRepresentation", "()Ljava/lang/String;", "getSku", "getTransactionId", "toJson", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EntitlementIOS {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String jsonRepresentation;
    private final String sku;
    private final String transactionId;

    public static /* synthetic */ EntitlementIOS copy$default(EntitlementIOS entitlementIOS, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entitlementIOS.jsonRepresentation;
        }
        if ((i & 2) != 0) {
            str2 = entitlementIOS.sku;
        }
        if ((i & 4) != 0) {
            str3 = entitlementIOS.transactionId;
        }
        return entitlementIOS.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getJsonRepresentation() {
        return this.jsonRepresentation;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final EntitlementIOS copy(String jsonRepresentation, String sku, String transactionId) {
        Intrinsics.checkNotNullParameter(jsonRepresentation, "jsonRepresentation");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        return new EntitlementIOS(jsonRepresentation, sku, transactionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntitlementIOS)) {
            return false;
        }
        EntitlementIOS entitlementIOS = (EntitlementIOS) other;
        return Intrinsics.areEqual(this.jsonRepresentation, entitlementIOS.jsonRepresentation) && Intrinsics.areEqual(this.sku, entitlementIOS.sku) && Intrinsics.areEqual(this.transactionId, entitlementIOS.transactionId);
    }

    public int hashCode() {
        return (((this.jsonRepresentation.hashCode() * 31) + this.sku.hashCode()) * 31) + this.transactionId.hashCode();
    }

    public String toString() {
        return "EntitlementIOS(jsonRepresentation=" + this.jsonRepresentation + ", sku=" + this.sku + ", transactionId=" + this.transactionId + ")";
    }

    public EntitlementIOS(String jsonRepresentation, String sku, String transactionId) {
        Intrinsics.checkNotNullParameter(jsonRepresentation, "jsonRepresentation");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.jsonRepresentation = jsonRepresentation;
        this.sku = sku;
        this.transactionId = transactionId;
    }

    public final String getJsonRepresentation() {
        return this.jsonRepresentation;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/EntitlementIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/EntitlementIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EntitlementIOS fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("jsonRepresentation");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = "";
            }
            Object obj2 = json.get("sku");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null) {
                str2 = "";
            }
            Object obj3 = json.get("transactionId");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            return new EntitlementIOS(str, str2, str3 != null ? str3 : "");
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "EntitlementIOS"), TuplesKt.to("jsonRepresentation", this.jsonRepresentation), TuplesKt.to("sku", this.sku), TuplesKt.to("transactionId", this.transactionId));
    }
}
