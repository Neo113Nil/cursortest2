package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroRenewalInfoIOS.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00013Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u008b\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00064"}, d2 = {"Lcom/margelo/nitro/iap/NitroRenewalInfoIOS;", "", "willAutoRenew", "", "autoRenewPreference", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "pendingUpgradeProductId", "renewalDate", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "expirationReason", "isInBillingRetry", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "gracePeriodExpirationDate", "priceIncreaseStatus", "renewalOfferType", "renewalOfferId", "jsonRepresentation", "<init>", "(ZLcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;)V", "getWillAutoRenew", "()Z", "getAutoRenewPreference", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getPendingUpgradeProductId", "getRenewalDate", "()Lcom/margelo/nitro/iap/Variant_NullType_Double;", "getExpirationReason", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "getGracePeriodExpirationDate", "getPriceIncreaseStatus", "getRenewalOfferType", "getRenewalOfferId", "getJsonRepresentation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroRenewalInfoIOS {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_String autoRenewPreference;
    private final Variant_NullType_String expirationReason;
    private final Variant_NullType_Double gracePeriodExpirationDate;
    private final Variant_NullType_Boolean isInBillingRetry;
    private final Variant_NullType_String jsonRepresentation;
    private final Variant_NullType_String pendingUpgradeProductId;
    private final Variant_NullType_String priceIncreaseStatus;
    private final Variant_NullType_Double renewalDate;
    private final Variant_NullType_String renewalOfferId;
    private final Variant_NullType_String renewalOfferType;
    private final boolean willAutoRenew;

    public static /* synthetic */ NitroRenewalInfoIOS copy$default(NitroRenewalInfoIOS nitroRenewalInfoIOS, boolean z, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_Double variant_NullType_Double, Variant_NullType_String variant_NullType_String3, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nitroRenewalInfoIOS.willAutoRenew;
        }
        if ((i & 2) != 0) {
            variant_NullType_String = nitroRenewalInfoIOS.autoRenewPreference;
        }
        if ((i & 4) != 0) {
            variant_NullType_String2 = nitroRenewalInfoIOS.pendingUpgradeProductId;
        }
        if ((i & 8) != 0) {
            variant_NullType_Double = nitroRenewalInfoIOS.renewalDate;
        }
        if ((i & 16) != 0) {
            variant_NullType_String3 = nitroRenewalInfoIOS.expirationReason;
        }
        if ((i & 32) != 0) {
            variant_NullType_Boolean = nitroRenewalInfoIOS.isInBillingRetry;
        }
        if ((i & 64) != 0) {
            variant_NullType_Double2 = nitroRenewalInfoIOS.gracePeriodExpirationDate;
        }
        if ((i & 128) != 0) {
            variant_NullType_String4 = nitroRenewalInfoIOS.priceIncreaseStatus;
        }
        if ((i & 256) != 0) {
            variant_NullType_String5 = nitroRenewalInfoIOS.renewalOfferType;
        }
        if ((i & 512) != 0) {
            variant_NullType_String6 = nitroRenewalInfoIOS.renewalOfferId;
        }
        if ((i & 1024) != 0) {
            variant_NullType_String7 = nitroRenewalInfoIOS.jsonRepresentation;
        }
        Variant_NullType_String variant_NullType_String8 = variant_NullType_String6;
        Variant_NullType_String variant_NullType_String9 = variant_NullType_String7;
        Variant_NullType_String variant_NullType_String10 = variant_NullType_String4;
        Variant_NullType_String variant_NullType_String11 = variant_NullType_String5;
        Variant_NullType_Boolean variant_NullType_Boolean2 = variant_NullType_Boolean;
        Variant_NullType_Double variant_NullType_Double3 = variant_NullType_Double2;
        Variant_NullType_String variant_NullType_String12 = variant_NullType_String3;
        Variant_NullType_String variant_NullType_String13 = variant_NullType_String2;
        return nitroRenewalInfoIOS.copy(z, variant_NullType_String, variant_NullType_String13, variant_NullType_Double, variant_NullType_String12, variant_NullType_Boolean2, variant_NullType_Double3, variant_NullType_String10, variant_NullType_String11, variant_NullType_String8, variant_NullType_String9);
    }

    @JvmStatic
    private static final NitroRenewalInfoIOS fromCpp(boolean z, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_Double variant_NullType_Double, Variant_NullType_String variant_NullType_String3, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7) {
        return INSTANCE.fromCpp(z, variant_NullType_String, variant_NullType_String2, variant_NullType_Double, variant_NullType_String3, variant_NullType_Boolean, variant_NullType_Double2, variant_NullType_String4, variant_NullType_String5, variant_NullType_String6, variant_NullType_String7);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getWillAutoRenew() {
        return this.willAutoRenew;
    }

    /* renamed from: component10, reason: from getter */
    public final Variant_NullType_String getRenewalOfferId() {
        return this.renewalOfferId;
    }

    /* renamed from: component11, reason: from getter */
    public final Variant_NullType_String getJsonRepresentation() {
        return this.jsonRepresentation;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_String getAutoRenewPreference() {
        return this.autoRenewPreference;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_String getPendingUpgradeProductId() {
        return this.pendingUpgradeProductId;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_Double getRenewalDate() {
        return this.renewalDate;
    }

    /* renamed from: component5, reason: from getter */
    public final Variant_NullType_String getExpirationReason() {
        return this.expirationReason;
    }

    /* renamed from: component6, reason: from getter */
    public final Variant_NullType_Boolean getIsInBillingRetry() {
        return this.isInBillingRetry;
    }

    /* renamed from: component7, reason: from getter */
    public final Variant_NullType_Double getGracePeriodExpirationDate() {
        return this.gracePeriodExpirationDate;
    }

    /* renamed from: component8, reason: from getter */
    public final Variant_NullType_String getPriceIncreaseStatus() {
        return this.priceIncreaseStatus;
    }

    /* renamed from: component9, reason: from getter */
    public final Variant_NullType_String getRenewalOfferType() {
        return this.renewalOfferType;
    }

    public final NitroRenewalInfoIOS copy(boolean willAutoRenew, Variant_NullType_String autoRenewPreference, Variant_NullType_String pendingUpgradeProductId, Variant_NullType_Double renewalDate, Variant_NullType_String expirationReason, Variant_NullType_Boolean isInBillingRetry, Variant_NullType_Double gracePeriodExpirationDate, Variant_NullType_String priceIncreaseStatus, Variant_NullType_String renewalOfferType, Variant_NullType_String renewalOfferId, Variant_NullType_String jsonRepresentation) {
        return new NitroRenewalInfoIOS(willAutoRenew, autoRenewPreference, pendingUpgradeProductId, renewalDate, expirationReason, isInBillingRetry, gracePeriodExpirationDate, priceIncreaseStatus, renewalOfferType, renewalOfferId, jsonRepresentation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroRenewalInfoIOS)) {
            return false;
        }
        NitroRenewalInfoIOS nitroRenewalInfoIOS = (NitroRenewalInfoIOS) other;
        return this.willAutoRenew == nitroRenewalInfoIOS.willAutoRenew && Intrinsics.areEqual(this.autoRenewPreference, nitroRenewalInfoIOS.autoRenewPreference) && Intrinsics.areEqual(this.pendingUpgradeProductId, nitroRenewalInfoIOS.pendingUpgradeProductId) && Intrinsics.areEqual(this.renewalDate, nitroRenewalInfoIOS.renewalDate) && Intrinsics.areEqual(this.expirationReason, nitroRenewalInfoIOS.expirationReason) && Intrinsics.areEqual(this.isInBillingRetry, nitroRenewalInfoIOS.isInBillingRetry) && Intrinsics.areEqual(this.gracePeriodExpirationDate, nitroRenewalInfoIOS.gracePeriodExpirationDate) && Intrinsics.areEqual(this.priceIncreaseStatus, nitroRenewalInfoIOS.priceIncreaseStatus) && Intrinsics.areEqual(this.renewalOfferType, nitroRenewalInfoIOS.renewalOfferType) && Intrinsics.areEqual(this.renewalOfferId, nitroRenewalInfoIOS.renewalOfferId) && Intrinsics.areEqual(this.jsonRepresentation, nitroRenewalInfoIOS.jsonRepresentation);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.willAutoRenew) * 31;
        Variant_NullType_String variant_NullType_String = this.autoRenewPreference;
        int hashCode2 = (hashCode + (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String2 = this.pendingUpgradeProductId;
        int hashCode3 = (hashCode2 + (variant_NullType_String2 == null ? 0 : variant_NullType_String2.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double = this.renewalDate;
        int hashCode4 = (hashCode3 + (variant_NullType_Double == null ? 0 : variant_NullType_Double.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String3 = this.expirationReason;
        int hashCode5 = (hashCode4 + (variant_NullType_String3 == null ? 0 : variant_NullType_String3.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean = this.isInBillingRetry;
        int hashCode6 = (hashCode5 + (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double2 = this.gracePeriodExpirationDate;
        int hashCode7 = (hashCode6 + (variant_NullType_Double2 == null ? 0 : variant_NullType_Double2.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String4 = this.priceIncreaseStatus;
        int hashCode8 = (hashCode7 + (variant_NullType_String4 == null ? 0 : variant_NullType_String4.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String5 = this.renewalOfferType;
        int hashCode9 = (hashCode8 + (variant_NullType_String5 == null ? 0 : variant_NullType_String5.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String6 = this.renewalOfferId;
        int hashCode10 = (hashCode9 + (variant_NullType_String6 == null ? 0 : variant_NullType_String6.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String7 = this.jsonRepresentation;
        return hashCode10 + (variant_NullType_String7 != null ? variant_NullType_String7.hashCode() : 0);
    }

    public String toString() {
        return "NitroRenewalInfoIOS(willAutoRenew=" + this.willAutoRenew + ", autoRenewPreference=" + this.autoRenewPreference + ", pendingUpgradeProductId=" + this.pendingUpgradeProductId + ", renewalDate=" + this.renewalDate + ", expirationReason=" + this.expirationReason + ", isInBillingRetry=" + this.isInBillingRetry + ", gracePeriodExpirationDate=" + this.gracePeriodExpirationDate + ", priceIncreaseStatus=" + this.priceIncreaseStatus + ", renewalOfferType=" + this.renewalOfferType + ", renewalOfferId=" + this.renewalOfferId + ", jsonRepresentation=" + this.jsonRepresentation + ")";
    }

    public NitroRenewalInfoIOS(boolean z, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_Double variant_NullType_Double, Variant_NullType_String variant_NullType_String3, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7) {
        this.willAutoRenew = z;
        this.autoRenewPreference = variant_NullType_String;
        this.pendingUpgradeProductId = variant_NullType_String2;
        this.renewalDate = variant_NullType_Double;
        this.expirationReason = variant_NullType_String3;
        this.isInBillingRetry = variant_NullType_Boolean;
        this.gracePeriodExpirationDate = variant_NullType_Double2;
        this.priceIncreaseStatus = variant_NullType_String4;
        this.renewalOfferType = variant_NullType_String5;
        this.renewalOfferId = variant_NullType_String6;
        this.jsonRepresentation = variant_NullType_String7;
    }

    public final boolean getWillAutoRenew() {
        return this.willAutoRenew;
    }

    public final Variant_NullType_String getAutoRenewPreference() {
        return this.autoRenewPreference;
    }

    public final Variant_NullType_String getPendingUpgradeProductId() {
        return this.pendingUpgradeProductId;
    }

    public final Variant_NullType_Double getRenewalDate() {
        return this.renewalDate;
    }

    public final Variant_NullType_String getExpirationReason() {
        return this.expirationReason;
    }

    public final Variant_NullType_Boolean isInBillingRetry() {
        return this.isInBillingRetry;
    }

    public final Variant_NullType_Double getGracePeriodExpirationDate() {
        return this.gracePeriodExpirationDate;
    }

    public final Variant_NullType_String getPriceIncreaseStatus() {
        return this.priceIncreaseStatus;
    }

    public final Variant_NullType_String getRenewalOfferType() {
        return this.renewalOfferType;
    }

    public final Variant_NullType_String getRenewalOfferId() {
        return this.renewalOfferId;
    }

    public final Variant_NullType_String getJsonRepresentation() {
        return this.jsonRepresentation;
    }

    /* compiled from: NitroRenewalInfoIOS.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jt\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0003¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/iap/NitroRenewalInfoIOS$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroRenewalInfoIOS;", "willAutoRenew", "", "autoRenewPreference", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "pendingUpgradeProductId", "renewalDate", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "expirationReason", "isInBillingRetry", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "gracePeriodExpirationDate", "priceIncreaseStatus", "renewalOfferType", "renewalOfferId", "jsonRepresentation", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroRenewalInfoIOS fromCpp(boolean willAutoRenew, Variant_NullType_String autoRenewPreference, Variant_NullType_String pendingUpgradeProductId, Variant_NullType_Double renewalDate, Variant_NullType_String expirationReason, Variant_NullType_Boolean isInBillingRetry, Variant_NullType_Double gracePeriodExpirationDate, Variant_NullType_String priceIncreaseStatus, Variant_NullType_String renewalOfferType, Variant_NullType_String renewalOfferId, Variant_NullType_String jsonRepresentation) {
            return new NitroRenewalInfoIOS(willAutoRenew, autoRenewPreference, pendingUpgradeProductId, renewalDate, expirationReason, isInBillingRetry, gracePeriodExpirationDate, priceIncreaseStatus, renewalOfferType, renewalOfferId, jsonRepresentation);
        }
    }
}
