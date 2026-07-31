package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001f"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseResultIOS;", "Ldev/hyo/openiap/VerifyPurchaseResult;", "isValid", "", "jwsRepresentation", "", "latestTransaction", "Ldev/hyo/openiap/Purchase;", "receiptData", "<init>", "(ZLjava/lang/String;Ldev/hyo/openiap/Purchase;Ljava/lang/String;)V", "()Z", "getJwsRepresentation", "()Ljava/lang/String;", "getLatestTransaction", "()Ldev/hyo/openiap/Purchase;", "getReceiptData", "toJson", "", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerifyPurchaseResultIOS implements VerifyPurchaseResult {
    private final boolean isValid;
    private final String jwsRepresentation;
    private final Purchase latestTransaction;
    private final String receiptData;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ VerifyPurchaseResultIOS copy$default(VerifyPurchaseResultIOS verifyPurchaseResultIOS, boolean z, String str, Purchase purchase, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = verifyPurchaseResultIOS.isValid;
        }
        if ((i & 2) != 0) {
            str = verifyPurchaseResultIOS.jwsRepresentation;
        }
        if ((i & 4) != 0) {
            purchase = verifyPurchaseResultIOS.latestTransaction;
        }
        if ((i & 8) != 0) {
            str2 = verifyPurchaseResultIOS.receiptData;
        }
        return verifyPurchaseResultIOS.copy(z, str, purchase, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getJwsRepresentation() {
        return this.jwsRepresentation;
    }

    /* renamed from: component3, reason: from getter */
    public final Purchase getLatestTransaction() {
        return this.latestTransaction;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReceiptData() {
        return this.receiptData;
    }

    public final VerifyPurchaseResultIOS copy(boolean isValid, String jwsRepresentation, Purchase latestTransaction, String receiptData) {
        Intrinsics.checkNotNullParameter(jwsRepresentation, "jwsRepresentation");
        Intrinsics.checkNotNullParameter(receiptData, "receiptData");
        return new VerifyPurchaseResultIOS(isValid, jwsRepresentation, latestTransaction, receiptData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPurchaseResultIOS)) {
            return false;
        }
        VerifyPurchaseResultIOS verifyPurchaseResultIOS = (VerifyPurchaseResultIOS) other;
        return this.isValid == verifyPurchaseResultIOS.isValid && Intrinsics.areEqual(this.jwsRepresentation, verifyPurchaseResultIOS.jwsRepresentation) && Intrinsics.areEqual(this.latestTransaction, verifyPurchaseResultIOS.latestTransaction) && Intrinsics.areEqual(this.receiptData, verifyPurchaseResultIOS.receiptData);
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.isValid) * 31) + this.jwsRepresentation.hashCode()) * 31;
        Purchase purchase = this.latestTransaction;
        return ((hashCode + (purchase == null ? 0 : purchase.hashCode())) * 31) + this.receiptData.hashCode();
    }

    public String toString() {
        return "VerifyPurchaseResultIOS(isValid=" + this.isValid + ", jwsRepresentation=" + this.jwsRepresentation + ", latestTransaction=" + this.latestTransaction + ", receiptData=" + this.receiptData + ")";
    }

    public VerifyPurchaseResultIOS(boolean z, String jwsRepresentation, Purchase purchase, String receiptData) {
        Intrinsics.checkNotNullParameter(jwsRepresentation, "jwsRepresentation");
        Intrinsics.checkNotNullParameter(receiptData, "receiptData");
        this.isValid = z;
        this.jwsRepresentation = jwsRepresentation;
        this.latestTransaction = purchase;
        this.receiptData = receiptData;
    }

    public /* synthetic */ VerifyPurchaseResultIOS(boolean z, String str, Purchase purchase, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? null : purchase, str2);
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final String getJwsRepresentation() {
        return this.jwsRepresentation;
    }

    public final Purchase getLatestTransaction() {
        return this.latestTransaction;
    }

    public final String getReceiptData() {
        return this.receiptData;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseResultIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/VerifyPurchaseResultIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VerifyPurchaseResultIOS fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("isValid");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Object obj2 = json.get("jwsRepresentation");
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                str = "";
            }
            Object obj3 = json.get("latestTransaction");
            Map<String, ? extends Object> map = obj3 instanceof Map ? (Map) obj3 : null;
            Purchase fromJson = map != null ? Purchase.INSTANCE.fromJson(map) : null;
            Object obj4 = json.get("receiptData");
            String str2 = obj4 instanceof String ? (String) obj4 : null;
            return new VerifyPurchaseResultIOS(booleanValue, str, fromJson, str2 != null ? str2 : "");
        }
    }

    @Override // dev.hyo.openiap.VerifyPurchaseResult
    public Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to("__typename", "VerifyPurchaseResultIOS");
        pairArr[1] = TuplesKt.to("isValid", Boolean.valueOf(this.isValid));
        pairArr[2] = TuplesKt.to("jwsRepresentation", this.jwsRepresentation);
        Purchase purchase = this.latestTransaction;
        pairArr[3] = TuplesKt.to("latestTransaction", purchase != null ? purchase.toJson() : null);
        pairArr[4] = TuplesKt.to("receiptData", this.receiptData);
        return MapsKt.mapOf(pairArr);
    }
}
