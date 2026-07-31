package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Ldev/hyo/openiap/InitConnectionConfig;", "", "alternativeBillingModeAndroid", "Ldev/hyo/openiap/AlternativeBillingModeAndroid;", "enableBillingProgramAndroid", "Ldev/hyo/openiap/BillingProgramAndroid;", "<init>", "(Ldev/hyo/openiap/AlternativeBillingModeAndroid;Ldev/hyo/openiap/BillingProgramAndroid;)V", "getAlternativeBillingModeAndroid", "()Ldev/hyo/openiap/AlternativeBillingModeAndroid;", "getEnableBillingProgramAndroid", "()Ldev/hyo/openiap/BillingProgramAndroid;", "toJson", "", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InitConnectionConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AlternativeBillingModeAndroid alternativeBillingModeAndroid;
    private final BillingProgramAndroid enableBillingProgramAndroid;

    /* JADX WARN: Multi-variable type inference failed */
    public InitConnectionConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InitConnectionConfig copy$default(InitConnectionConfig initConnectionConfig, AlternativeBillingModeAndroid alternativeBillingModeAndroid, BillingProgramAndroid billingProgramAndroid, int i, Object obj) {
        if ((i & 1) != 0) {
            alternativeBillingModeAndroid = initConnectionConfig.alternativeBillingModeAndroid;
        }
        if ((i & 2) != 0) {
            billingProgramAndroid = initConnectionConfig.enableBillingProgramAndroid;
        }
        return initConnectionConfig.copy(alternativeBillingModeAndroid, billingProgramAndroid);
    }

    /* renamed from: component1, reason: from getter */
    public final AlternativeBillingModeAndroid getAlternativeBillingModeAndroid() {
        return this.alternativeBillingModeAndroid;
    }

    /* renamed from: component2, reason: from getter */
    public final BillingProgramAndroid getEnableBillingProgramAndroid() {
        return this.enableBillingProgramAndroid;
    }

    public final InitConnectionConfig copy(AlternativeBillingModeAndroid alternativeBillingModeAndroid, BillingProgramAndroid enableBillingProgramAndroid) {
        return new InitConnectionConfig(alternativeBillingModeAndroid, enableBillingProgramAndroid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitConnectionConfig)) {
            return false;
        }
        InitConnectionConfig initConnectionConfig = (InitConnectionConfig) other;
        return this.alternativeBillingModeAndroid == initConnectionConfig.alternativeBillingModeAndroid && this.enableBillingProgramAndroid == initConnectionConfig.enableBillingProgramAndroid;
    }

    public int hashCode() {
        AlternativeBillingModeAndroid alternativeBillingModeAndroid = this.alternativeBillingModeAndroid;
        int hashCode = (alternativeBillingModeAndroid == null ? 0 : alternativeBillingModeAndroid.hashCode()) * 31;
        BillingProgramAndroid billingProgramAndroid = this.enableBillingProgramAndroid;
        return hashCode + (billingProgramAndroid != null ? billingProgramAndroid.hashCode() : 0);
    }

    public String toString() {
        return "InitConnectionConfig(alternativeBillingModeAndroid=" + this.alternativeBillingModeAndroid + ", enableBillingProgramAndroid=" + this.enableBillingProgramAndroid + ")";
    }

    public InitConnectionConfig(AlternativeBillingModeAndroid alternativeBillingModeAndroid, BillingProgramAndroid billingProgramAndroid) {
        this.alternativeBillingModeAndroid = alternativeBillingModeAndroid;
        this.enableBillingProgramAndroid = billingProgramAndroid;
    }

    public /* synthetic */ InitConnectionConfig(AlternativeBillingModeAndroid alternativeBillingModeAndroid, BillingProgramAndroid billingProgramAndroid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : alternativeBillingModeAndroid, (i & 2) != 0 ? null : billingProgramAndroid);
    }

    public final AlternativeBillingModeAndroid getAlternativeBillingModeAndroid() {
        return this.alternativeBillingModeAndroid;
    }

    public final BillingProgramAndroid getEnableBillingProgramAndroid() {
        return this.enableBillingProgramAndroid;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/InitConnectionConfig$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/InitConnectionConfig;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InitConnectionConfig fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("alternativeBillingModeAndroid");
            String str = obj instanceof String ? (String) obj : null;
            AlternativeBillingModeAndroid fromJson = str != null ? AlternativeBillingModeAndroid.INSTANCE.fromJson(str) : null;
            Object obj2 = json.get("enableBillingProgramAndroid");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            return new InitConnectionConfig(fromJson, str2 != null ? BillingProgramAndroid.INSTANCE.fromJson(str2) : null);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[2];
        AlternativeBillingModeAndroid alternativeBillingModeAndroid = this.alternativeBillingModeAndroid;
        pairArr[0] = TuplesKt.to("alternativeBillingModeAndroid", alternativeBillingModeAndroid != null ? alternativeBillingModeAndroid.toJson() : null);
        BillingProgramAndroid billingProgramAndroid = this.enableBillingProgramAndroid;
        pairArr[1] = TuplesKt.to("enableBillingProgramAndroid", billingProgramAndroid != null ? billingProgramAndroid.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
