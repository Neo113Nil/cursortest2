package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroActiveSubscription.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0001AB\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J©\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001e¨\u0006B"}, d2 = {"Lcom/margelo/nitro/iap/NitroActiveSubscription;", "", "productId", "", "isActive", "", "transactionId", "purchaseToken", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "transactionDate", "", "expirationDateIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "environmentIOS", "willExpireSoon", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "daysUntilExpirationIOS", "renewalInfoIOS", "Lcom/margelo/nitro/iap/Variant_NullType_NitroRenewalInfoIOS;", "autoRenewingAndroid", "basePlanIdAndroid", "currentPlanId", "purchaseTokenAndroid", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_String;DLcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_NitroRenewalInfoIOS;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;)V", "getProductId", "()Ljava/lang/String;", "()Z", "getTransactionId", "getPurchaseToken", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getTransactionDate", "()D", "getExpirationDateIOS", "()Lcom/margelo/nitro/iap/Variant_NullType_Double;", "getEnvironmentIOS", "getWillExpireSoon", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "getDaysUntilExpirationIOS", "getRenewalInfoIOS", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroRenewalInfoIOS;", "getAutoRenewingAndroid", "getBasePlanIdAndroid", "getCurrentPlanId", "getPurchaseTokenAndroid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroActiveSubscription {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_Boolean autoRenewingAndroid;
    private final Variant_NullType_String basePlanIdAndroid;
    private final Variant_NullType_String currentPlanId;
    private final Variant_NullType_Double daysUntilExpirationIOS;
    private final Variant_NullType_String environmentIOS;
    private final Variant_NullType_Double expirationDateIOS;
    private final boolean isActive;
    private final String productId;
    private final Variant_NullType_String purchaseToken;
    private final Variant_NullType_String purchaseTokenAndroid;
    private final Variant_NullType_NitroRenewalInfoIOS renewalInfoIOS;
    private final double transactionDate;
    private final String transactionId;
    private final Variant_NullType_Boolean willExpireSoon;

    @JvmStatic
    private static final NitroActiveSubscription fromCpp(String str, boolean z, String str2, Variant_NullType_String variant_NullType_String, double d, Variant_NullType_Double variant_NullType_Double, Variant_NullType_String variant_NullType_String2, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_NitroRenewalInfoIOS variant_NullType_NitroRenewalInfoIOS, Variant_NullType_Boolean variant_NullType_Boolean2, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5) {
        return INSTANCE.fromCpp(str, z, str2, variant_NullType_String, d, variant_NullType_Double, variant_NullType_String2, variant_NullType_Boolean, variant_NullType_Double2, variant_NullType_NitroRenewalInfoIOS, variant_NullType_Boolean2, variant_NullType_String3, variant_NullType_String4, variant_NullType_String5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component10, reason: from getter */
    public final Variant_NullType_NitroRenewalInfoIOS getRenewalInfoIOS() {
        return this.renewalInfoIOS;
    }

    /* renamed from: component11, reason: from getter */
    public final Variant_NullType_Boolean getAutoRenewingAndroid() {
        return this.autoRenewingAndroid;
    }

    /* renamed from: component12, reason: from getter */
    public final Variant_NullType_String getBasePlanIdAndroid() {
        return this.basePlanIdAndroid;
    }

    /* renamed from: component13, reason: from getter */
    public final Variant_NullType_String getCurrentPlanId() {
        return this.currentPlanId;
    }

    /* renamed from: component14, reason: from getter */
    public final Variant_NullType_String getPurchaseTokenAndroid() {
        return this.purchaseTokenAndroid;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component5, reason: from getter */
    public final double getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: component6, reason: from getter */
    public final Variant_NullType_Double getExpirationDateIOS() {
        return this.expirationDateIOS;
    }

    /* renamed from: component7, reason: from getter */
    public final Variant_NullType_String getEnvironmentIOS() {
        return this.environmentIOS;
    }

    /* renamed from: component8, reason: from getter */
    public final Variant_NullType_Boolean getWillExpireSoon() {
        return this.willExpireSoon;
    }

    /* renamed from: component9, reason: from getter */
    public final Variant_NullType_Double getDaysUntilExpirationIOS() {
        return this.daysUntilExpirationIOS;
    }

    public final NitroActiveSubscription copy(String productId, boolean isActive, String transactionId, Variant_NullType_String purchaseToken, double transactionDate, Variant_NullType_Double expirationDateIOS, Variant_NullType_String environmentIOS, Variant_NullType_Boolean willExpireSoon, Variant_NullType_Double daysUntilExpirationIOS, Variant_NullType_NitroRenewalInfoIOS renewalInfoIOS, Variant_NullType_Boolean autoRenewingAndroid, Variant_NullType_String basePlanIdAndroid, Variant_NullType_String currentPlanId, Variant_NullType_String purchaseTokenAndroid) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        return new NitroActiveSubscription(productId, isActive, transactionId, purchaseToken, transactionDate, expirationDateIOS, environmentIOS, willExpireSoon, daysUntilExpirationIOS, renewalInfoIOS, autoRenewingAndroid, basePlanIdAndroid, currentPlanId, purchaseTokenAndroid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroActiveSubscription)) {
            return false;
        }
        NitroActiveSubscription nitroActiveSubscription = (NitroActiveSubscription) other;
        return Intrinsics.areEqual(this.productId, nitroActiveSubscription.productId) && this.isActive == nitroActiveSubscription.isActive && Intrinsics.areEqual(this.transactionId, nitroActiveSubscription.transactionId) && Intrinsics.areEqual(this.purchaseToken, nitroActiveSubscription.purchaseToken) && Double.compare(this.transactionDate, nitroActiveSubscription.transactionDate) == 0 && Intrinsics.areEqual(this.expirationDateIOS, nitroActiveSubscription.expirationDateIOS) && Intrinsics.areEqual(this.environmentIOS, nitroActiveSubscription.environmentIOS) && Intrinsics.areEqual(this.willExpireSoon, nitroActiveSubscription.willExpireSoon) && Intrinsics.areEqual(this.daysUntilExpirationIOS, nitroActiveSubscription.daysUntilExpirationIOS) && Intrinsics.areEqual(this.renewalInfoIOS, nitroActiveSubscription.renewalInfoIOS) && Intrinsics.areEqual(this.autoRenewingAndroid, nitroActiveSubscription.autoRenewingAndroid) && Intrinsics.areEqual(this.basePlanIdAndroid, nitroActiveSubscription.basePlanIdAndroid) && Intrinsics.areEqual(this.currentPlanId, nitroActiveSubscription.currentPlanId) && Intrinsics.areEqual(this.purchaseTokenAndroid, nitroActiveSubscription.purchaseTokenAndroid);
    }

    public int hashCode() {
        int hashCode = ((((this.productId.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + this.transactionId.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String = this.purchaseToken;
        int hashCode2 = (((hashCode + (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode())) * 31) + Double.hashCode(this.transactionDate)) * 31;
        Variant_NullType_Double variant_NullType_Double = this.expirationDateIOS;
        int hashCode3 = (hashCode2 + (variant_NullType_Double == null ? 0 : variant_NullType_Double.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String2 = this.environmentIOS;
        int hashCode4 = (hashCode3 + (variant_NullType_String2 == null ? 0 : variant_NullType_String2.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean = this.willExpireSoon;
        int hashCode5 = (hashCode4 + (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double2 = this.daysUntilExpirationIOS;
        int hashCode6 = (hashCode5 + (variant_NullType_Double2 == null ? 0 : variant_NullType_Double2.hashCode())) * 31;
        Variant_NullType_NitroRenewalInfoIOS variant_NullType_NitroRenewalInfoIOS = this.renewalInfoIOS;
        int hashCode7 = (hashCode6 + (variant_NullType_NitroRenewalInfoIOS == null ? 0 : variant_NullType_NitroRenewalInfoIOS.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean2 = this.autoRenewingAndroid;
        int hashCode8 = (hashCode7 + (variant_NullType_Boolean2 == null ? 0 : variant_NullType_Boolean2.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String3 = this.basePlanIdAndroid;
        int hashCode9 = (hashCode8 + (variant_NullType_String3 == null ? 0 : variant_NullType_String3.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String4 = this.currentPlanId;
        int hashCode10 = (hashCode9 + (variant_NullType_String4 == null ? 0 : variant_NullType_String4.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String5 = this.purchaseTokenAndroid;
        return hashCode10 + (variant_NullType_String5 != null ? variant_NullType_String5.hashCode() : 0);
    }

    public String toString() {
        return "NitroActiveSubscription(productId=" + this.productId + ", isActive=" + this.isActive + ", transactionId=" + this.transactionId + ", purchaseToken=" + this.purchaseToken + ", transactionDate=" + this.transactionDate + ", expirationDateIOS=" + this.expirationDateIOS + ", environmentIOS=" + this.environmentIOS + ", willExpireSoon=" + this.willExpireSoon + ", daysUntilExpirationIOS=" + this.daysUntilExpirationIOS + ", renewalInfoIOS=" + this.renewalInfoIOS + ", autoRenewingAndroid=" + this.autoRenewingAndroid + ", basePlanIdAndroid=" + this.basePlanIdAndroid + ", currentPlanId=" + this.currentPlanId + ", purchaseTokenAndroid=" + this.purchaseTokenAndroid + ")";
    }

    public NitroActiveSubscription(String productId, boolean z, String transactionId, Variant_NullType_String variant_NullType_String, double d, Variant_NullType_Double variant_NullType_Double, Variant_NullType_String variant_NullType_String2, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_NitroRenewalInfoIOS variant_NullType_NitroRenewalInfoIOS, Variant_NullType_Boolean variant_NullType_Boolean2, Variant_NullType_String variant_NullType_String3, Variant_NullType_String variant_NullType_String4, Variant_NullType_String variant_NullType_String5) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.productId = productId;
        this.isActive = z;
        this.transactionId = transactionId;
        this.purchaseToken = variant_NullType_String;
        this.transactionDate = d;
        this.expirationDateIOS = variant_NullType_Double;
        this.environmentIOS = variant_NullType_String2;
        this.willExpireSoon = variant_NullType_Boolean;
        this.daysUntilExpirationIOS = variant_NullType_Double2;
        this.renewalInfoIOS = variant_NullType_NitroRenewalInfoIOS;
        this.autoRenewingAndroid = variant_NullType_Boolean2;
        this.basePlanIdAndroid = variant_NullType_String3;
        this.currentPlanId = variant_NullType_String4;
        this.purchaseTokenAndroid = variant_NullType_String5;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final Variant_NullType_String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final double getTransactionDate() {
        return this.transactionDate;
    }

    public final Variant_NullType_Double getExpirationDateIOS() {
        return this.expirationDateIOS;
    }

    public final Variant_NullType_String getEnvironmentIOS() {
        return this.environmentIOS;
    }

    public final Variant_NullType_Boolean getWillExpireSoon() {
        return this.willExpireSoon;
    }

    public final Variant_NullType_Double getDaysUntilExpirationIOS() {
        return this.daysUntilExpirationIOS;
    }

    public final Variant_NullType_NitroRenewalInfoIOS getRenewalInfoIOS() {
        return this.renewalInfoIOS;
    }

    public final Variant_NullType_Boolean getAutoRenewingAndroid() {
        return this.autoRenewingAndroid;
    }

    public final Variant_NullType_String getBasePlanIdAndroid() {
        return this.basePlanIdAndroid;
    }

    public final Variant_NullType_String getCurrentPlanId() {
        return this.currentPlanId;
    }

    public final Variant_NullType_String getPurchaseTokenAndroid() {
        return this.purchaseTokenAndroid;
    }

    /* compiled from: NitroActiveSubscription.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008c\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0003¨\u0006\u001b"}, d2 = {"Lcom/margelo/nitro/iap/NitroActiveSubscription$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroActiveSubscription;", "productId", "", "isActive", "", "transactionId", "purchaseToken", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "transactionDate", "", "expirationDateIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "environmentIOS", "willExpireSoon", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "daysUntilExpirationIOS", "renewalInfoIOS", "Lcom/margelo/nitro/iap/Variant_NullType_NitroRenewalInfoIOS;", "autoRenewingAndroid", "basePlanIdAndroid", "currentPlanId", "purchaseTokenAndroid", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroActiveSubscription fromCpp(String productId, boolean isActive, String transactionId, Variant_NullType_String purchaseToken, double transactionDate, Variant_NullType_Double expirationDateIOS, Variant_NullType_String environmentIOS, Variant_NullType_Boolean willExpireSoon, Variant_NullType_Double daysUntilExpirationIOS, Variant_NullType_NitroRenewalInfoIOS renewalInfoIOS, Variant_NullType_Boolean autoRenewingAndroid, Variant_NullType_String basePlanIdAndroid, Variant_NullType_String currentPlanId, Variant_NullType_String purchaseTokenAndroid) {
            return new NitroActiveSubscription(productId, isActive, transactionId, purchaseToken, transactionDate, expirationDateIOS, environmentIOS, willExpireSoon, daysUntilExpirationIOS, renewalInfoIOS, autoRenewingAndroid, basePlanIdAndroid, currentPlanId, purchaseTokenAndroid);
        }
    }
}
