package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Ldev/hyo/openiap/SubscriptionStatusIOS;", "", "renewalInfo", "Ldev/hyo/openiap/RenewalInfoIOS;", "state", "", "<init>", "(Ldev/hyo/openiap/RenewalInfoIOS;Ljava/lang/String;)V", "getRenewalInfo", "()Ldev/hyo/openiap/RenewalInfoIOS;", "getState", "()Ljava/lang/String;", "toJson", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionStatusIOS {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RenewalInfoIOS renewalInfo;
    private final String state;

    public static /* synthetic */ SubscriptionStatusIOS copy$default(SubscriptionStatusIOS subscriptionStatusIOS, RenewalInfoIOS renewalInfoIOS, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            renewalInfoIOS = subscriptionStatusIOS.renewalInfo;
        }
        if ((i & 2) != 0) {
            str = subscriptionStatusIOS.state;
        }
        return subscriptionStatusIOS.copy(renewalInfoIOS, str);
    }

    /* renamed from: component1, reason: from getter */
    public final RenewalInfoIOS getRenewalInfo() {
        return this.renewalInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final SubscriptionStatusIOS copy(RenewalInfoIOS renewalInfo, String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new SubscriptionStatusIOS(renewalInfo, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionStatusIOS)) {
            return false;
        }
        SubscriptionStatusIOS subscriptionStatusIOS = (SubscriptionStatusIOS) other;
        return Intrinsics.areEqual(this.renewalInfo, subscriptionStatusIOS.renewalInfo) && Intrinsics.areEqual(this.state, subscriptionStatusIOS.state);
    }

    public int hashCode() {
        RenewalInfoIOS renewalInfoIOS = this.renewalInfo;
        return ((renewalInfoIOS == null ? 0 : renewalInfoIOS.hashCode()) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "SubscriptionStatusIOS(renewalInfo=" + this.renewalInfo + ", state=" + this.state + ")";
    }

    public SubscriptionStatusIOS(RenewalInfoIOS renewalInfoIOS, String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.renewalInfo = renewalInfoIOS;
        this.state = state;
    }

    public /* synthetic */ SubscriptionStatusIOS(RenewalInfoIOS renewalInfoIOS, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : renewalInfoIOS, str);
    }

    public final RenewalInfoIOS getRenewalInfo() {
        return this.renewalInfo;
    }

    public final String getState() {
        return this.state;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/SubscriptionStatusIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/SubscriptionStatusIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SubscriptionStatusIOS fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("renewalInfo");
            Map<String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
            RenewalInfoIOS fromJson = map != null ? RenewalInfoIOS.INSTANCE.fromJson(map) : null;
            Object obj2 = json.get("state");
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                str = "";
            }
            return new SubscriptionStatusIOS(fromJson, str);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("__typename", "SubscriptionStatusIOS");
        RenewalInfoIOS renewalInfoIOS = this.renewalInfo;
        pairArr[1] = TuplesKt.to("renewalInfo", renewalInfoIOS != null ? renewalInfoIOS.toJson() : null);
        pairArr[2] = TuplesKt.to("state", this.state);
        return MapsKt.mapOf(pairArr);
    }
}
