package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RenewalInfoIOS.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00013Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003J\u008b\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00064"}, d2 = {"Lcom/margelo/nitro/iap/RenewalInfoIOS;", "", "autoRenewPreference", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "expirationReason", "gracePeriodExpirationDate", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "isInBillingRetry", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "jsonRepresentation", "pendingUpgradeProductId", "priceIncreaseStatus", "renewalDate", "renewalOfferId", "renewalOfferType", "willAutoRenew", "", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Z)V", "getAutoRenewPreference", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getExpirationReason", "getGracePeriodExpirationDate", "()Lcom/margelo/nitro/iap/Variant_NullType_Double;", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "getJsonRepresentation", "getPendingUpgradeProductId", "getPriceIncreaseStatus", "getRenewalDate", "getRenewalOfferId", "getRenewalOfferType", "getWillAutoRenew", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RenewalInfoIOS {

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

    public static /* synthetic */ RenewalInfoIOS copy$default(RenewalInfoIOS renewalInfoIOS, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_String = renewalInfoIOS.autoRenewPreference;
        }
        if ((i & 2) != 0) {
            variant_NullType_String2 = renewalInfoIOS.expirationReason;
        }
        if ((i & 4) != 0) {
            variant_NullType_Double = renewalInfoIOS.gracePeriodExpirationDate;
        }
        if ((i & 8) != 0) {
            variant_NullType_Boolean = renewalInfoIOS.isInBillingRetry;
        }
        if ((i & 16) != 0) {
            variant_NullType_String3 = renewalInfoIOS.jsonRepresentation;
        }
        if ((i & 32) != 0) {
            variant_NullType_String4 = renewalInfoIOS.pendingUpgradeProductId;
        }
        if ((i & 64) != 0) {
            variant_NullType_String5 = renewalInfoIOS.priceIncreaseStatus;
        }
        if ((i & 128) != 0) {
            variant_NullType_Double2 = renewalInfoIOS.renewalDate;
        }
        if ((i & 256) != 0) {
            variant_NullType_String6 = renewalInfoIOS.renewalOfferId;
        }
        if ((i & 512) != 0) {
            variant_NullType_String7 = renewalInfoIOS.renewalOfferType;
        }
        if ((i & 1024) != 0) {
            z = renewalInfoIOS.willAutoRenew;
        }
        Variant_NullType_String variant_NullType_String8 = variant_NullType_String7;
        boolean z2 = z;
        Variant_NullType_Double variant_NullType_Double3 = variant_NullType_Double2;
        Variant_NullType_String variant_NullType_String9 = variant_NullType_String6;
        Variant_NullType_String variant_NullType_String10 = variant_NullType_String4;
        Variant_NullType_String variant_NullType_String11 = variant_NullType_String5;
        Variant_NullType_String variant_NullType_String12 = variant_NullType_String3;
        Variant_NullType_Double variant_NullType_Double4 = variant_NullType_Double;
        return renewalInfoIOS.copy(variant_NullType_String, variant_NullType_String2, variant_NullType_Double4, variant_NullType_Boolean, variant_NullType_String12, variant_NullType_String10, variant_NullType_String11, variant_NullType_Double3, variant_NullType_String9, variant_NullType_String8, z2);
    }

    @JvmStatic
    private static final RenewalInfoIOS fromCpp(Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7, boolean z) {
        return INSTANCE.fromCpp(variant_NullType_String, variant_NullType_String2, variant_NullType_Double, variant_NullType_Boolean, variant_NullType_String3, variant_NullType_String4, variant_NullType_String5, variant_NullType_Double2, variant_NullType_String6, variant_NullType_String7, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_String getAutoRenewPreference() {
        return this.autoRenewPreference;
    }

    /* renamed from: component10, reason: from getter */
    public final Variant_NullType_String getRenewalOfferType() {
        return this.renewalOfferType;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getWillAutoRenew() {
        return this.willAutoRenew;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_String getExpirationReason() {
        return this.expirationReason;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_Double getGracePeriodExpirationDate() {
        return this.gracePeriodExpirationDate;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_Boolean getIsInBillingRetry() {
        return this.isInBillingRetry;
    }

    /* renamed from: component5, reason: from getter */
    public final Variant_NullType_String getJsonRepresentation() {
        return this.jsonRepresentation;
    }

    /* renamed from: component6, reason: from getter */
    public final Variant_NullType_String getPendingUpgradeProductId() {
        return this.pendingUpgradeProductId;
    }

    /* renamed from: component7, reason: from getter */
    public final Variant_NullType_String getPriceIncreaseStatus() {
        return this.priceIncreaseStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final Variant_NullType_Double getRenewalDate() {
        return this.renewalDate;
    }

    /* renamed from: component9, reason: from getter */
    public final Variant_NullType_String getRenewalOfferId() {
        return this.renewalOfferId;
    }

    public final RenewalInfoIOS copy(Variant_NullType_String autoRenewPreference, Variant_NullType_String expirationReason, Variant_NullType_Double gracePeriodExpirationDate, Variant_NullType_Boolean isInBillingRetry, Variant_NullType_String jsonRepresentation, Variant_NullType_String pendingUpgradeProductId, Variant_NullType_String priceIncreaseStatus, Variant_NullType_Double renewalDate, Variant_NullType_String renewalOfferId, Variant_NullType_String renewalOfferType, boolean willAutoRenew) {
        return new RenewalInfoIOS(autoRenewPreference, expirationReason, gracePeriodExpirationDate, isInBillingRetry, jsonRepresentation, pendingUpgradeProductId, priceIncreaseStatus, renewalDate, renewalOfferId, renewalOfferType, willAutoRenew);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenewalInfoIOS)) {
            return false;
        }
        RenewalInfoIOS renewalInfoIOS = (RenewalInfoIOS) other;
        return Intrinsics.areEqual(this.autoRenewPreference, renewalInfoIOS.autoRenewPreference) && Intrinsics.areEqual(this.expirationReason, renewalInfoIOS.expirationReason) && Intrinsics.areEqual(this.gracePeriodExpirationDate, renewalInfoIOS.gracePeriodExpirationDate) && Intrinsics.areEqual(this.isInBillingRetry, renewalInfoIOS.isInBillingRetry) && Intrinsics.areEqual(this.jsonRepresentation, renewalInfoIOS.jsonRepresentation) && Intrinsics.areEqual(this.pendingUpgradeProductId, renewalInfoIOS.pendingUpgradeProductId) && Intrinsics.areEqual(this.priceIncreaseStatus, renewalInfoIOS.priceIncreaseStatus) && Intrinsics.areEqual(this.renewalDate, renewalInfoIOS.renewalDate) && Intrinsics.areEqual(this.renewalOfferId, renewalInfoIOS.renewalOfferId) && Intrinsics.areEqual(this.renewalOfferType, renewalInfoIOS.renewalOfferType) && this.willAutoRenew == renewalInfoIOS.willAutoRenew;
    }

    public int hashCode() {
        Variant_NullType_String variant_NullType_String = this.autoRenewPreference;
        int hashCode = (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String2 = this.expirationReason;
        int hashCode2 = (hashCode + (variant_NullType_String2 == null ? 0 : variant_NullType_String2.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double = this.gracePeriodExpirationDate;
        int hashCode3 = (hashCode2 + (variant_NullType_Double == null ? 0 : variant_NullType_Double.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean = this.isInBillingRetry;
        int hashCode4 = (hashCode3 + (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String3 = this.jsonRepresentation;
        int hashCode5 = (hashCode4 + (variant_NullType_String3 == null ? 0 : variant_NullType_String3.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String4 = this.pendingUpgradeProductId;
        int hashCode6 = (hashCode5 + (variant_NullType_String4 == null ? 0 : variant_NullType_String4.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String5 = this.priceIncreaseStatus;
        int hashCode7 = (hashCode6 + (variant_NullType_String5 == null ? 0 : variant_NullType_String5.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double2 = this.renewalDate;
        int hashCode8 = (hashCode7 + (variant_NullType_Double2 == null ? 0 : variant_NullType_Double2.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String6 = this.renewalOfferId;
        int hashCode9 = (hashCode8 + (variant_NullType_String6 == null ? 0 : variant_NullType_String6.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String7 = this.renewalOfferType;
        return ((hashCode9 + (variant_NullType_String7 != null ? variant_NullType_String7.hashCode() : 0)) * 31) + Boolean.hashCode(this.willAutoRenew);
    }

    public String toString() {
        return "RenewalInfoIOS(autoRenewPreference=" + this.autoRenewPreference + ", expirationReason=" + this.expirationReason + ", gracePeriodExpirationDate=" + this.gracePeriodExpirationDate + ", isInBillingRetry=" + this.isInBillingRetry + ", jsonRepresentation=" + this.jsonRepresentation + ", pendingUpgradeProductId=" + this.pendingUpgradeProductId + ", priceIncreaseStatus=" + this.priceIncreaseStatus + ", renewalDate=" + this.renewalDate + ", renewalOfferId=" + this.renewalOfferId + ", renewalOfferType=" + this.renewalOfferType + ", willAutoRenew=" + this.willAutoRenew + ")";
    }

    public RenewalInfoIOS(Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String6, Variant_NullType_String variant_NullType_String7, boolean z) {
        this.autoRenewPreference = variant_NullType_String;
        this.expirationReason = variant_NullType_String2;
        this.gracePeriodExpirationDate = variant_NullType_Double;
        this.isInBillingRetry = variant_NullType_Boolean;
        this.jsonRepresentation = variant_NullType_String3;
        this.pendingUpgradeProductId = variant_NullType_String4;
        this.priceIncreaseStatus = variant_NullType_String5;
        this.renewalDate = variant_NullType_Double2;
        this.renewalOfferId = variant_NullType_String6;
        this.renewalOfferType = variant_NullType_String7;
        this.willAutoRenew = z;
    }

    public final Variant_NullType_String getAutoRenewPreference() {
        return this.autoRenewPreference;
    }

    public final Variant_NullType_String getExpirationReason() {
        return this.expirationReason;
    }

    public final Variant_NullType_Double getGracePeriodExpirationDate() {
        return this.gracePeriodExpirationDate;
    }

    public final Variant_NullType_Boolean isInBillingRetry() {
        return this.isInBillingRetry;
    }

    public final Variant_NullType_String getJsonRepresentation() {
        return this.jsonRepresentation;
    }

    public final Variant_NullType_String getPendingUpgradeProductId() {
        return this.pendingUpgradeProductId;
    }

    public final Variant_NullType_String getPriceIncreaseStatus() {
        return this.priceIncreaseStatus;
    }

    public final Variant_NullType_Double getRenewalDate() {
        return this.renewalDate;
    }

    public final Variant_NullType_String getRenewalOfferId() {
        return this.renewalOfferId;
    }

    public final Variant_NullType_String getRenewalOfferType() {
        return this.renewalOfferType;
    }

    public final boolean getWillAutoRenew() {
        return this.willAutoRenew;
    }

    /* compiled from: RenewalInfoIOS.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jt\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/iap/RenewalInfoIOS$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/RenewalInfoIOS;", "autoRenewPreference", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "expirationReason", "gracePeriodExpirationDate", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "isInBillingRetry", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "jsonRepresentation", "pendingUpgradeProductId", "priceIncreaseStatus", "renewalDate", "renewalOfferId", "renewalOfferType", "willAutoRenew", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final RenewalInfoIOS fromCpp(Variant_NullType_String autoRenewPreference, Variant_NullType_String expirationReason, Variant_NullType_Double gracePeriodExpirationDate, Variant_NullType_Boolean isInBillingRetry, Variant_NullType_String jsonRepresentation, Variant_NullType_String pendingUpgradeProductId, Variant_NullType_String priceIncreaseStatus, Variant_NullType_Double renewalDate, Variant_NullType_String renewalOfferId, Variant_NullType_String renewalOfferType, boolean willAutoRenew) {
            return new RenewalInfoIOS(autoRenewPreference, expirationReason, gracePeriodExpirationDate, isInBillingRetry, jsonRepresentation, pendingUpgradeProductId, priceIncreaseStatus, renewalDate, renewalOfferId, renewalOfferType, willAutoRenew);
        }
    }
}
