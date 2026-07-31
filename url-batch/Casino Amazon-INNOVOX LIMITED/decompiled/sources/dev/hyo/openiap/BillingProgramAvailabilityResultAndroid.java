package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, d2 = {"Ldev/hyo/openiap/BillingProgramAvailabilityResultAndroid;", "", "billingProgram", "Ldev/hyo/openiap/BillingProgramAndroid;", "isAvailable", "", "<init>", "(Ldev/hyo/openiap/BillingProgramAndroid;Z)V", "getBillingProgram", "()Ldev/hyo/openiap/BillingProgramAndroid;", "()Z", "toJson", "", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BillingProgramAvailabilityResultAndroid {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BillingProgramAndroid billingProgram;
    private final boolean isAvailable;

    public static /* synthetic */ BillingProgramAvailabilityResultAndroid copy$default(BillingProgramAvailabilityResultAndroid billingProgramAvailabilityResultAndroid, BillingProgramAndroid billingProgramAndroid, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            billingProgramAndroid = billingProgramAvailabilityResultAndroid.billingProgram;
        }
        if ((i & 2) != 0) {
            z = billingProgramAvailabilityResultAndroid.isAvailable;
        }
        return billingProgramAvailabilityResultAndroid.copy(billingProgramAndroid, z);
    }

    /* renamed from: component1, reason: from getter */
    public final BillingProgramAndroid getBillingProgram() {
        return this.billingProgram;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    public final BillingProgramAvailabilityResultAndroid copy(BillingProgramAndroid billingProgram, boolean isAvailable) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        return new BillingProgramAvailabilityResultAndroid(billingProgram, isAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingProgramAvailabilityResultAndroid)) {
            return false;
        }
        BillingProgramAvailabilityResultAndroid billingProgramAvailabilityResultAndroid = (BillingProgramAvailabilityResultAndroid) other;
        return this.billingProgram == billingProgramAvailabilityResultAndroid.billingProgram && this.isAvailable == billingProgramAvailabilityResultAndroid.isAvailable;
    }

    public int hashCode() {
        return (this.billingProgram.hashCode() * 31) + Boolean.hashCode(this.isAvailable);
    }

    public String toString() {
        return "BillingProgramAvailabilityResultAndroid(billingProgram=" + this.billingProgram + ", isAvailable=" + this.isAvailable + ")";
    }

    public BillingProgramAvailabilityResultAndroid(BillingProgramAndroid billingProgram, boolean z) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        this.billingProgram = billingProgram;
        this.isAvailable = z;
    }

    public final BillingProgramAndroid getBillingProgram() {
        return this.billingProgram;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/BillingProgramAvailabilityResultAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/BillingProgramAvailabilityResultAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BillingProgramAvailabilityResultAndroid fromJson(Map<String, ? extends Object> json) {
            BillingProgramAndroid billingProgramAndroid;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("billingProgram");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || (billingProgramAndroid = BillingProgramAndroid.INSTANCE.fromJson(str)) == null) {
                billingProgramAndroid = BillingProgramAndroid.Unspecified;
            }
            Object obj2 = json.get("isAvailable");
            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            return new BillingProgramAvailabilityResultAndroid(billingProgramAndroid, bool != null ? bool.booleanValue() : false);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "BillingProgramAvailabilityResultAndroid"), TuplesKt.to("billingProgram", this.billingProgram.toJson()), TuplesKt.to("isAvailable", Boolean.valueOf(this.isAvailable)));
    }
}
