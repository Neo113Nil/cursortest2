package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroSubscriptionStatus.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/margelo/nitro/iap/NitroSubscriptionStatus;", "", "state", "", "platform", "", "renewalInfo", "Lcom/margelo/nitro/iap/Variant_NullType_NitroSubscriptionRenewalInfo;", "<init>", "(DLjava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_NitroSubscriptionRenewalInfo;)V", "getState", "()D", "getPlatform", "()Ljava/lang/String;", "getRenewalInfo", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroSubscriptionRenewalInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroSubscriptionStatus {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String platform;
    private final Variant_NullType_NitroSubscriptionRenewalInfo renewalInfo;
    private final double state;

    public static /* synthetic */ NitroSubscriptionStatus copy$default(NitroSubscriptionStatus nitroSubscriptionStatus, double d, String str, Variant_NullType_NitroSubscriptionRenewalInfo variant_NullType_NitroSubscriptionRenewalInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            d = nitroSubscriptionStatus.state;
        }
        if ((i & 2) != 0) {
            str = nitroSubscriptionStatus.platform;
        }
        if ((i & 4) != 0) {
            variant_NullType_NitroSubscriptionRenewalInfo = nitroSubscriptionStatus.renewalInfo;
        }
        return nitroSubscriptionStatus.copy(d, str, variant_NullType_NitroSubscriptionRenewalInfo);
    }

    @JvmStatic
    private static final NitroSubscriptionStatus fromCpp(double d, String str, Variant_NullType_NitroSubscriptionRenewalInfo variant_NullType_NitroSubscriptionRenewalInfo) {
        return INSTANCE.fromCpp(d, str, variant_NullType_NitroSubscriptionRenewalInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final double getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_NitroSubscriptionRenewalInfo getRenewalInfo() {
        return this.renewalInfo;
    }

    public final NitroSubscriptionStatus copy(double state, String platform, Variant_NullType_NitroSubscriptionRenewalInfo renewalInfo) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new NitroSubscriptionStatus(state, platform, renewalInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroSubscriptionStatus)) {
            return false;
        }
        NitroSubscriptionStatus nitroSubscriptionStatus = (NitroSubscriptionStatus) other;
        return Double.compare(this.state, nitroSubscriptionStatus.state) == 0 && Intrinsics.areEqual(this.platform, nitroSubscriptionStatus.platform) && Intrinsics.areEqual(this.renewalInfo, nitroSubscriptionStatus.renewalInfo);
    }

    public int hashCode() {
        int hashCode = ((Double.hashCode(this.state) * 31) + this.platform.hashCode()) * 31;
        Variant_NullType_NitroSubscriptionRenewalInfo variant_NullType_NitroSubscriptionRenewalInfo = this.renewalInfo;
        return hashCode + (variant_NullType_NitroSubscriptionRenewalInfo == null ? 0 : variant_NullType_NitroSubscriptionRenewalInfo.hashCode());
    }

    public String toString() {
        return "NitroSubscriptionStatus(state=" + this.state + ", platform=" + this.platform + ", renewalInfo=" + this.renewalInfo + ")";
    }

    public NitroSubscriptionStatus(double d, String platform, Variant_NullType_NitroSubscriptionRenewalInfo variant_NullType_NitroSubscriptionRenewalInfo) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.state = d;
        this.platform = platform;
        this.renewalInfo = variant_NullType_NitroSubscriptionRenewalInfo;
    }

    public final double getState() {
        return this.state;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final Variant_NullType_NitroSubscriptionRenewalInfo getRenewalInfo() {
        return this.renewalInfo;
    }

    /* compiled from: NitroSubscriptionStatus.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0003¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/iap/NitroSubscriptionStatus$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroSubscriptionStatus;", "state", "", "platform", "", "renewalInfo", "Lcom/margelo/nitro/iap/Variant_NullType_NitroSubscriptionRenewalInfo;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroSubscriptionStatus fromCpp(double state, String platform, Variant_NullType_NitroSubscriptionRenewalInfo renewalInfo) {
            return new NitroSubscriptionStatus(state, platform, renewalInfo);
        }
    }
}
