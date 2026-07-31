package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseProps;", "", "apple", "Ldev/hyo/openiap/VerifyPurchaseAppleOptions;", "google", "Ldev/hyo/openiap/VerifyPurchaseGoogleOptions;", "horizon", "Ldev/hyo/openiap/VerifyPurchaseHorizonOptions;", "<init>", "(Ldev/hyo/openiap/VerifyPurchaseAppleOptions;Ldev/hyo/openiap/VerifyPurchaseGoogleOptions;Ldev/hyo/openiap/VerifyPurchaseHorizonOptions;)V", "getApple", "()Ldev/hyo/openiap/VerifyPurchaseAppleOptions;", "getGoogle", "()Ldev/hyo/openiap/VerifyPurchaseGoogleOptions;", "getHorizon", "()Ldev/hyo/openiap/VerifyPurchaseHorizonOptions;", "toJson", "", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerifyPurchaseProps {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final VerifyPurchaseAppleOptions apple;
    private final VerifyPurchaseGoogleOptions google;
    private final VerifyPurchaseHorizonOptions horizon;

    public VerifyPurchaseProps() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ VerifyPurchaseProps copy$default(VerifyPurchaseProps verifyPurchaseProps, VerifyPurchaseAppleOptions verifyPurchaseAppleOptions, VerifyPurchaseGoogleOptions verifyPurchaseGoogleOptions, VerifyPurchaseHorizonOptions verifyPurchaseHorizonOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            verifyPurchaseAppleOptions = verifyPurchaseProps.apple;
        }
        if ((i & 2) != 0) {
            verifyPurchaseGoogleOptions = verifyPurchaseProps.google;
        }
        if ((i & 4) != 0) {
            verifyPurchaseHorizonOptions = verifyPurchaseProps.horizon;
        }
        return verifyPurchaseProps.copy(verifyPurchaseAppleOptions, verifyPurchaseGoogleOptions, verifyPurchaseHorizonOptions);
    }

    /* renamed from: component1, reason: from getter */
    public final VerifyPurchaseAppleOptions getApple() {
        return this.apple;
    }

    /* renamed from: component2, reason: from getter */
    public final VerifyPurchaseGoogleOptions getGoogle() {
        return this.google;
    }

    /* renamed from: component3, reason: from getter */
    public final VerifyPurchaseHorizonOptions getHorizon() {
        return this.horizon;
    }

    public final VerifyPurchaseProps copy(VerifyPurchaseAppleOptions apple, VerifyPurchaseGoogleOptions google, VerifyPurchaseHorizonOptions horizon) {
        return new VerifyPurchaseProps(apple, google, horizon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPurchaseProps)) {
            return false;
        }
        VerifyPurchaseProps verifyPurchaseProps = (VerifyPurchaseProps) other;
        return Intrinsics.areEqual(this.apple, verifyPurchaseProps.apple) && Intrinsics.areEqual(this.google, verifyPurchaseProps.google) && Intrinsics.areEqual(this.horizon, verifyPurchaseProps.horizon);
    }

    public int hashCode() {
        VerifyPurchaseAppleOptions verifyPurchaseAppleOptions = this.apple;
        int hashCode = (verifyPurchaseAppleOptions == null ? 0 : verifyPurchaseAppleOptions.hashCode()) * 31;
        VerifyPurchaseGoogleOptions verifyPurchaseGoogleOptions = this.google;
        int hashCode2 = (hashCode + (verifyPurchaseGoogleOptions == null ? 0 : verifyPurchaseGoogleOptions.hashCode())) * 31;
        VerifyPurchaseHorizonOptions verifyPurchaseHorizonOptions = this.horizon;
        return hashCode2 + (verifyPurchaseHorizonOptions != null ? verifyPurchaseHorizonOptions.hashCode() : 0);
    }

    public String toString() {
        return "VerifyPurchaseProps(apple=" + this.apple + ", google=" + this.google + ", horizon=" + this.horizon + ")";
    }

    public VerifyPurchaseProps(VerifyPurchaseAppleOptions verifyPurchaseAppleOptions, VerifyPurchaseGoogleOptions verifyPurchaseGoogleOptions, VerifyPurchaseHorizonOptions verifyPurchaseHorizonOptions) {
        this.apple = verifyPurchaseAppleOptions;
        this.google = verifyPurchaseGoogleOptions;
        this.horizon = verifyPurchaseHorizonOptions;
    }

    public /* synthetic */ VerifyPurchaseProps(VerifyPurchaseAppleOptions verifyPurchaseAppleOptions, VerifyPurchaseGoogleOptions verifyPurchaseGoogleOptions, VerifyPurchaseHorizonOptions verifyPurchaseHorizonOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : verifyPurchaseAppleOptions, (i & 2) != 0 ? null : verifyPurchaseGoogleOptions, (i & 4) != 0 ? null : verifyPurchaseHorizonOptions);
    }

    public final VerifyPurchaseAppleOptions getApple() {
        return this.apple;
    }

    public final VerifyPurchaseGoogleOptions getGoogle() {
        return this.google;
    }

    public final VerifyPurchaseHorizonOptions getHorizon() {
        return this.horizon;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseProps$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/VerifyPurchaseProps;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VerifyPurchaseProps fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("apple");
            Map<String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
            VerifyPurchaseAppleOptions fromJson = map != null ? VerifyPurchaseAppleOptions.INSTANCE.fromJson(map) : null;
            Object obj2 = json.get("google");
            Map<String, ? extends Object> map2 = obj2 instanceof Map ? (Map) obj2 : null;
            VerifyPurchaseGoogleOptions fromJson2 = map2 != null ? VerifyPurchaseGoogleOptions.INSTANCE.fromJson(map2) : null;
            Object obj3 = json.get("horizon");
            Map<String, ? extends Object> map3 = obj3 instanceof Map ? (Map) obj3 : null;
            return new VerifyPurchaseProps(fromJson, fromJson2, map3 != null ? VerifyPurchaseHorizonOptions.INSTANCE.fromJson(map3) : null);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[3];
        VerifyPurchaseAppleOptions verifyPurchaseAppleOptions = this.apple;
        pairArr[0] = TuplesKt.to("apple", verifyPurchaseAppleOptions != null ? verifyPurchaseAppleOptions.toJson() : null);
        VerifyPurchaseGoogleOptions verifyPurchaseGoogleOptions = this.google;
        pairArr[1] = TuplesKt.to("google", verifyPurchaseGoogleOptions != null ? verifyPurchaseGoogleOptions.toJson() : null);
        VerifyPurchaseHorizonOptions verifyPurchaseHorizonOptions = this.horizon;
        pairArr[2] = TuplesKt.to("horizon", verifyPurchaseHorizonOptions != null ? verifyPurchaseHorizonOptions.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
