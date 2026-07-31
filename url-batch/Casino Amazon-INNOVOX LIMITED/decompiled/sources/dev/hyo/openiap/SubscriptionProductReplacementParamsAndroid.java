package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid;", "", "oldProductId", "", "replacementMode", "Ldev/hyo/openiap/SubscriptionReplacementModeAndroid;", "<init>", "(Ljava/lang/String;Ldev/hyo/openiap/SubscriptionReplacementModeAndroid;)V", "getOldProductId", "()Ljava/lang/String;", "getReplacementMode", "()Ldev/hyo/openiap/SubscriptionReplacementModeAndroid;", "toJson", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionProductReplacementParamsAndroid {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String oldProductId;
    private final SubscriptionReplacementModeAndroid replacementMode;

    public static /* synthetic */ SubscriptionProductReplacementParamsAndroid copy$default(SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid, String str, SubscriptionReplacementModeAndroid subscriptionReplacementModeAndroid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionProductReplacementParamsAndroid.oldProductId;
        }
        if ((i & 2) != 0) {
            subscriptionReplacementModeAndroid = subscriptionProductReplacementParamsAndroid.replacementMode;
        }
        return subscriptionProductReplacementParamsAndroid.copy(str, subscriptionReplacementModeAndroid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOldProductId() {
        return this.oldProductId;
    }

    /* renamed from: component2, reason: from getter */
    public final SubscriptionReplacementModeAndroid getReplacementMode() {
        return this.replacementMode;
    }

    public final SubscriptionProductReplacementParamsAndroid copy(String oldProductId, SubscriptionReplacementModeAndroid replacementMode) {
        Intrinsics.checkNotNullParameter(oldProductId, "oldProductId");
        Intrinsics.checkNotNullParameter(replacementMode, "replacementMode");
        return new SubscriptionProductReplacementParamsAndroid(oldProductId, replacementMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionProductReplacementParamsAndroid)) {
            return false;
        }
        SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid = (SubscriptionProductReplacementParamsAndroid) other;
        return Intrinsics.areEqual(this.oldProductId, subscriptionProductReplacementParamsAndroid.oldProductId) && this.replacementMode == subscriptionProductReplacementParamsAndroid.replacementMode;
    }

    public int hashCode() {
        return (this.oldProductId.hashCode() * 31) + this.replacementMode.hashCode();
    }

    public String toString() {
        return "SubscriptionProductReplacementParamsAndroid(oldProductId=" + this.oldProductId + ", replacementMode=" + this.replacementMode + ")";
    }

    public SubscriptionProductReplacementParamsAndroid(String oldProductId, SubscriptionReplacementModeAndroid replacementMode) {
        Intrinsics.checkNotNullParameter(oldProductId, "oldProductId");
        Intrinsics.checkNotNullParameter(replacementMode, "replacementMode");
        this.oldProductId = oldProductId;
        this.replacementMode = replacementMode;
    }

    public final String getOldProductId() {
        return this.oldProductId;
    }

    public final SubscriptionReplacementModeAndroid getReplacementMode() {
        return this.replacementMode;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SubscriptionProductReplacementParamsAndroid fromJson(Map<String, ? extends Object> json) {
            SubscriptionReplacementModeAndroid subscriptionReplacementModeAndroid;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("oldProductId");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("replacementMode");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null || (subscriptionReplacementModeAndroid = SubscriptionReplacementModeAndroid.INSTANCE.fromJson(str2)) == null) {
                subscriptionReplacementModeAndroid = SubscriptionReplacementModeAndroid.UnknownReplacementMode;
            }
            if (str == null) {
                return null;
            }
            return new SubscriptionProductReplacementParamsAndroid(str, subscriptionReplacementModeAndroid);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("oldProductId", this.oldProductId), TuplesKt.to("replacementMode", this.replacementMode.toJson()));
    }
}
