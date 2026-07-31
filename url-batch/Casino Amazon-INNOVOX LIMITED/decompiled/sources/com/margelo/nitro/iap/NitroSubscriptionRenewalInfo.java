package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroSubscriptionRenewalInfo.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/margelo/nitro/iap/NitroSubscriptionRenewalInfo;", "", "autoRenewStatus", "", "autoRenewPreference", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "expirationReason", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "gracePeriodExpirationDate", "currentProductID", "platform", "", "<init>", "(ZLcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Ljava/lang/String;)V", "getAutoRenewStatus", "()Z", "getAutoRenewPreference", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getExpirationReason", "()Lcom/margelo/nitro/iap/Variant_NullType_Double;", "getGracePeriodExpirationDate", "getCurrentProductID", "getPlatform", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroSubscriptionRenewalInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_String autoRenewPreference;
    private final boolean autoRenewStatus;
    private final Variant_NullType_String currentProductID;
    private final Variant_NullType_Double expirationReason;
    private final Variant_NullType_Double gracePeriodExpirationDate;
    private final String platform;

    public static /* synthetic */ NitroSubscriptionRenewalInfo copy$default(NitroSubscriptionRenewalInfo nitroSubscriptionRenewalInfo, boolean z, Variant_NullType_String variant_NullType_String, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nitroSubscriptionRenewalInfo.autoRenewStatus;
        }
        if ((i & 2) != 0) {
            variant_NullType_String = nitroSubscriptionRenewalInfo.autoRenewPreference;
        }
        if ((i & 4) != 0) {
            variant_NullType_Double = nitroSubscriptionRenewalInfo.expirationReason;
        }
        if ((i & 8) != 0) {
            variant_NullType_Double2 = nitroSubscriptionRenewalInfo.gracePeriodExpirationDate;
        }
        if ((i & 16) != 0) {
            variant_NullType_String2 = nitroSubscriptionRenewalInfo.currentProductID;
        }
        if ((i & 32) != 0) {
            str = nitroSubscriptionRenewalInfo.platform;
        }
        Variant_NullType_String variant_NullType_String3 = variant_NullType_String2;
        String str2 = str;
        return nitroSubscriptionRenewalInfo.copy(z, variant_NullType_String, variant_NullType_Double, variant_NullType_Double2, variant_NullType_String3, str2);
    }

    @JvmStatic
    private static final NitroSubscriptionRenewalInfo fromCpp(boolean z, Variant_NullType_String variant_NullType_String, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String2, String str) {
        return INSTANCE.fromCpp(z, variant_NullType_String, variant_NullType_Double, variant_NullType_Double2, variant_NullType_String2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAutoRenewStatus() {
        return this.autoRenewStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_String getAutoRenewPreference() {
        return this.autoRenewPreference;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_Double getExpirationReason() {
        return this.expirationReason;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_Double getGracePeriodExpirationDate() {
        return this.gracePeriodExpirationDate;
    }

    /* renamed from: component5, reason: from getter */
    public final Variant_NullType_String getCurrentProductID() {
        return this.currentProductID;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public final NitroSubscriptionRenewalInfo copy(boolean autoRenewStatus, Variant_NullType_String autoRenewPreference, Variant_NullType_Double expirationReason, Variant_NullType_Double gracePeriodExpirationDate, Variant_NullType_String currentProductID, String platform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new NitroSubscriptionRenewalInfo(autoRenewStatus, autoRenewPreference, expirationReason, gracePeriodExpirationDate, currentProductID, platform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroSubscriptionRenewalInfo)) {
            return false;
        }
        NitroSubscriptionRenewalInfo nitroSubscriptionRenewalInfo = (NitroSubscriptionRenewalInfo) other;
        return this.autoRenewStatus == nitroSubscriptionRenewalInfo.autoRenewStatus && Intrinsics.areEqual(this.autoRenewPreference, nitroSubscriptionRenewalInfo.autoRenewPreference) && Intrinsics.areEqual(this.expirationReason, nitroSubscriptionRenewalInfo.expirationReason) && Intrinsics.areEqual(this.gracePeriodExpirationDate, nitroSubscriptionRenewalInfo.gracePeriodExpirationDate) && Intrinsics.areEqual(this.currentProductID, nitroSubscriptionRenewalInfo.currentProductID) && Intrinsics.areEqual(this.platform, nitroSubscriptionRenewalInfo.platform);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.autoRenewStatus) * 31;
        Variant_NullType_String variant_NullType_String = this.autoRenewPreference;
        int hashCode2 = (hashCode + (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double = this.expirationReason;
        int hashCode3 = (hashCode2 + (variant_NullType_Double == null ? 0 : variant_NullType_Double.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double2 = this.gracePeriodExpirationDate;
        int hashCode4 = (hashCode3 + (variant_NullType_Double2 == null ? 0 : variant_NullType_Double2.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String2 = this.currentProductID;
        return ((hashCode4 + (variant_NullType_String2 != null ? variant_NullType_String2.hashCode() : 0)) * 31) + this.platform.hashCode();
    }

    public String toString() {
        return "NitroSubscriptionRenewalInfo(autoRenewStatus=" + this.autoRenewStatus + ", autoRenewPreference=" + this.autoRenewPreference + ", expirationReason=" + this.expirationReason + ", gracePeriodExpirationDate=" + this.gracePeriodExpirationDate + ", currentProductID=" + this.currentProductID + ", platform=" + this.platform + ")";
    }

    public NitroSubscriptionRenewalInfo(boolean z, Variant_NullType_String variant_NullType_String, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String2, String platform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.autoRenewStatus = z;
        this.autoRenewPreference = variant_NullType_String;
        this.expirationReason = variant_NullType_Double;
        this.gracePeriodExpirationDate = variant_NullType_Double2;
        this.currentProductID = variant_NullType_String2;
        this.platform = platform;
    }

    public final boolean getAutoRenewStatus() {
        return this.autoRenewStatus;
    }

    public final Variant_NullType_String getAutoRenewPreference() {
        return this.autoRenewPreference;
    }

    public final Variant_NullType_Double getExpirationReason() {
        return this.expirationReason;
    }

    public final Variant_NullType_Double getGracePeriodExpirationDate() {
        return this.gracePeriodExpirationDate;
    }

    public final Variant_NullType_String getCurrentProductID() {
        return this.currentProductID;
    }

    public final String getPlatform() {
        return this.platform;
    }

    /* compiled from: NitroSubscriptionRenewalInfo.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¨\u0006\u0010"}, d2 = {"Lcom/margelo/nitro/iap/NitroSubscriptionRenewalInfo$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroSubscriptionRenewalInfo;", "autoRenewStatus", "", "autoRenewPreference", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "expirationReason", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "gracePeriodExpirationDate", "currentProductID", "platform", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroSubscriptionRenewalInfo fromCpp(boolean autoRenewStatus, Variant_NullType_String autoRenewPreference, Variant_NullType_Double expirationReason, Variant_NullType_Double gracePeriodExpirationDate, Variant_NullType_String currentProductID, String platform) {
            return new NitroSubscriptionRenewalInfo(autoRenewStatus, autoRenewPreference, expirationReason, gracePeriodExpirationDate, currentProductID, platform);
        }
    }
}
