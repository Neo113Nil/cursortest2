package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0016J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J$\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000fHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseResultHorizon;", "Ldev/hyo/openiap/VerifyPurchaseResult;", "grantTime", "", "success", "", "<init>", "(Ljava/lang/Double;Z)V", "getGrantTime", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSuccess", "()Z", "toJson", "", "", "", "component1", "component2", "copy", "(Ljava/lang/Double;Z)Ldev/hyo/openiap/VerifyPurchaseResultHorizon;", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerifyPurchaseResultHorizon implements VerifyPurchaseResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double grantTime;
    private final boolean success;

    public static /* synthetic */ VerifyPurchaseResultHorizon copy$default(VerifyPurchaseResultHorizon verifyPurchaseResultHorizon, Double d, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = verifyPurchaseResultHorizon.grantTime;
        }
        if ((i & 2) != 0) {
            z = verifyPurchaseResultHorizon.success;
        }
        return verifyPurchaseResultHorizon.copy(d, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getGrantTime() {
        return this.grantTime;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final VerifyPurchaseResultHorizon copy(Double grantTime, boolean success) {
        return new VerifyPurchaseResultHorizon(grantTime, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPurchaseResultHorizon)) {
            return false;
        }
        VerifyPurchaseResultHorizon verifyPurchaseResultHorizon = (VerifyPurchaseResultHorizon) other;
        return Intrinsics.areEqual((Object) this.grantTime, (Object) verifyPurchaseResultHorizon.grantTime) && this.success == verifyPurchaseResultHorizon.success;
    }

    public int hashCode() {
        Double d = this.grantTime;
        return ((d == null ? 0 : d.hashCode()) * 31) + Boolean.hashCode(this.success);
    }

    public String toString() {
        return "VerifyPurchaseResultHorizon(grantTime=" + this.grantTime + ", success=" + this.success + ")";
    }

    public VerifyPurchaseResultHorizon(Double d, boolean z) {
        this.grantTime = d;
        this.success = z;
    }

    public /* synthetic */ VerifyPurchaseResultHorizon(Double d, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, z);
    }

    public final Double getGrantTime() {
        return this.grantTime;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseResultHorizon$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/VerifyPurchaseResultHorizon;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VerifyPurchaseResultHorizon fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("grantTime");
            Number number = obj instanceof Number ? (Number) obj : null;
            Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            Object obj2 = json.get("success");
            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            return new VerifyPurchaseResultHorizon(valueOf, bool != null ? bool.booleanValue() : false);
        }
    }

    @Override // dev.hyo.openiap.VerifyPurchaseResult
    public Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "VerifyPurchaseResultHorizon"), TuplesKt.to("grantTime", this.grantTime), TuplesKt.to("success", Boolean.valueOf(this.success)));
    }
}
