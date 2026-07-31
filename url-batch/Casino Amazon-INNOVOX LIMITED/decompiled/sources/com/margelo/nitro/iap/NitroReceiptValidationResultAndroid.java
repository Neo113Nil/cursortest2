package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroReceiptValidationResultAndroid.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b8\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0001JB\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003J\t\u0010;\u001a\u00020\u000fHÆ\u0003J\t\u0010<\u001a\u00020\u000fHÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\t\u0010?\u001a\u00020\u000fHÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003JÅ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010E\u001a\u00020\u00032\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0016\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0016\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0016\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0016\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0016\u0010\u0015\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0016\u0010\u0016\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0016\u0010\u0017\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001c¨\u0006K"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationResultAndroid;", "", "autoRenewing", "", "betaProduct", "cancelDate", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "cancelReason", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "deferredDate", "deferredSku", "freeTrialEndDate", "", "gracePeriodEndDate", "parentProductId", "", "productId", "productType", "purchaseDate", "quantity", "receiptId", "renewalDate", "term", "termSku", "testTransaction", "<init>", "(ZZLcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Z)V", "getAutoRenewing", "()Z", "getBetaProduct", "getCancelDate", "()Lcom/margelo/nitro/iap/Variant_NullType_Double;", "getCancelReason", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getDeferredDate", "getDeferredSku", "getFreeTrialEndDate", "()D", "getGracePeriodEndDate", "getParentProductId", "()Ljava/lang/String;", "getProductId", "getProductType", "getPurchaseDate", "getQuantity", "getReceiptId", "getRenewalDate", "getTerm", "getTermSku", "getTestTransaction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroReceiptValidationResultAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean autoRenewing;
    private final boolean betaProduct;
    private final Variant_NullType_Double cancelDate;
    private final Variant_NullType_String cancelReason;
    private final Variant_NullType_Double deferredDate;
    private final Variant_NullType_String deferredSku;
    private final double freeTrialEndDate;
    private final double gracePeriodEndDate;
    private final String parentProductId;
    private final String productId;
    private final String productType;
    private final double purchaseDate;
    private final double quantity;
    private final String receiptId;
    private final double renewalDate;
    private final String term;
    private final String termSku;
    private final boolean testTransaction;

    public static /* synthetic */ NitroReceiptValidationResultAndroid copy$default(NitroReceiptValidationResultAndroid nitroReceiptValidationResultAndroid, boolean z, boolean z2, Variant_NullType_Double variant_NullType_Double, Variant_NullType_String variant_NullType_String, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String2, double d, double d2, String str, String str2, String str3, double d3, double d4, String str4, double d5, String str5, String str6, boolean z3, int i, Object obj) {
        boolean z4;
        String str7;
        boolean z5 = (i & 1) != 0 ? nitroReceiptValidationResultAndroid.autoRenewing : z;
        boolean z6 = (i & 2) != 0 ? nitroReceiptValidationResultAndroid.betaProduct : z2;
        Variant_NullType_Double variant_NullType_Double3 = (i & 4) != 0 ? nitroReceiptValidationResultAndroid.cancelDate : variant_NullType_Double;
        Variant_NullType_String variant_NullType_String3 = (i & 8) != 0 ? nitroReceiptValidationResultAndroid.cancelReason : variant_NullType_String;
        Variant_NullType_Double variant_NullType_Double4 = (i & 16) != 0 ? nitroReceiptValidationResultAndroid.deferredDate : variant_NullType_Double2;
        Variant_NullType_String variant_NullType_String4 = (i & 32) != 0 ? nitroReceiptValidationResultAndroid.deferredSku : variant_NullType_String2;
        double d6 = (i & 64) != 0 ? nitroReceiptValidationResultAndroid.freeTrialEndDate : d;
        double d7 = (i & 128) != 0 ? nitroReceiptValidationResultAndroid.gracePeriodEndDate : d2;
        String str8 = (i & 256) != 0 ? nitroReceiptValidationResultAndroid.parentProductId : str;
        String str9 = (i & 512) != 0 ? nitroReceiptValidationResultAndroid.productId : str2;
        String str10 = (i & 1024) != 0 ? nitroReceiptValidationResultAndroid.productType : str3;
        boolean z7 = z5;
        boolean z8 = z6;
        double d8 = (i & 2048) != 0 ? nitroReceiptValidationResultAndroid.purchaseDate : d3;
        double d9 = (i & 4096) != 0 ? nitroReceiptValidationResultAndroid.quantity : d4;
        String str11 = (i & 8192) != 0 ? nitroReceiptValidationResultAndroid.receiptId : str4;
        double d10 = d9;
        double d11 = (i & 16384) != 0 ? nitroReceiptValidationResultAndroid.renewalDate : d5;
        String str12 = (i & 32768) != 0 ? nitroReceiptValidationResultAndroid.term : str5;
        String str13 = (i & 65536) != 0 ? nitroReceiptValidationResultAndroid.termSku : str6;
        if ((i & 131072) != 0) {
            str7 = str13;
            z4 = nitroReceiptValidationResultAndroid.testTransaction;
        } else {
            z4 = z3;
            str7 = str13;
        }
        return nitroReceiptValidationResultAndroid.copy(z7, z8, variant_NullType_Double3, variant_NullType_String3, variant_NullType_Double4, variant_NullType_String4, d6, d7, str8, str9, str10, d8, d10, str11, d11, str12, str7, z4);
    }

    @JvmStatic
    private static final NitroReceiptValidationResultAndroid fromCpp(boolean z, boolean z2, Variant_NullType_Double variant_NullType_Double, Variant_NullType_String variant_NullType_String, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String2, double d, double d2, String str, String str2, String str3, double d3, double d4, String str4, double d5, String str5, String str6, boolean z3) {
        return INSTANCE.fromCpp(z, z2, variant_NullType_Double, variant_NullType_String, variant_NullType_Double2, variant_NullType_String2, d, d2, str, str2, str3, d3, d4, str4, d5, str5, str6, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    /* renamed from: component10, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* renamed from: component12, reason: from getter */
    public final double getPurchaseDate() {
        return this.purchaseDate;
    }

    /* renamed from: component13, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* renamed from: component14, reason: from getter */
    public final String getReceiptId() {
        return this.receiptId;
    }

    /* renamed from: component15, reason: from getter */
    public final double getRenewalDate() {
        return this.renewalDate;
    }

    /* renamed from: component16, reason: from getter */
    public final String getTerm() {
        return this.term;
    }

    /* renamed from: component17, reason: from getter */
    public final String getTermSku() {
        return this.termSku;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getTestTransaction() {
        return this.testTransaction;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBetaProduct() {
        return this.betaProduct;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_Double getCancelDate() {
        return this.cancelDate;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_String getCancelReason() {
        return this.cancelReason;
    }

    /* renamed from: component5, reason: from getter */
    public final Variant_NullType_Double getDeferredDate() {
        return this.deferredDate;
    }

    /* renamed from: component6, reason: from getter */
    public final Variant_NullType_String getDeferredSku() {
        return this.deferredSku;
    }

    /* renamed from: component7, reason: from getter */
    public final double getFreeTrialEndDate() {
        return this.freeTrialEndDate;
    }

    /* renamed from: component8, reason: from getter */
    public final double getGracePeriodEndDate() {
        return this.gracePeriodEndDate;
    }

    /* renamed from: component9, reason: from getter */
    public final String getParentProductId() {
        return this.parentProductId;
    }

    public final NitroReceiptValidationResultAndroid copy(boolean autoRenewing, boolean betaProduct, Variant_NullType_Double cancelDate, Variant_NullType_String cancelReason, Variant_NullType_Double deferredDate, Variant_NullType_String deferredSku, double freeTrialEndDate, double gracePeriodEndDate, String parentProductId, String productId, String productType, double purchaseDate, double quantity, String receiptId, double renewalDate, String term, String termSku, boolean testTransaction) {
        Intrinsics.checkNotNullParameter(parentProductId, "parentProductId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(receiptId, "receiptId");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(termSku, "termSku");
        return new NitroReceiptValidationResultAndroid(autoRenewing, betaProduct, cancelDate, cancelReason, deferredDate, deferredSku, freeTrialEndDate, gracePeriodEndDate, parentProductId, productId, productType, purchaseDate, quantity, receiptId, renewalDate, term, termSku, testTransaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroReceiptValidationResultAndroid)) {
            return false;
        }
        NitroReceiptValidationResultAndroid nitroReceiptValidationResultAndroid = (NitroReceiptValidationResultAndroid) other;
        return this.autoRenewing == nitroReceiptValidationResultAndroid.autoRenewing && this.betaProduct == nitroReceiptValidationResultAndroid.betaProduct && Intrinsics.areEqual(this.cancelDate, nitroReceiptValidationResultAndroid.cancelDate) && Intrinsics.areEqual(this.cancelReason, nitroReceiptValidationResultAndroid.cancelReason) && Intrinsics.areEqual(this.deferredDate, nitroReceiptValidationResultAndroid.deferredDate) && Intrinsics.areEqual(this.deferredSku, nitroReceiptValidationResultAndroid.deferredSku) && Double.compare(this.freeTrialEndDate, nitroReceiptValidationResultAndroid.freeTrialEndDate) == 0 && Double.compare(this.gracePeriodEndDate, nitroReceiptValidationResultAndroid.gracePeriodEndDate) == 0 && Intrinsics.areEqual(this.parentProductId, nitroReceiptValidationResultAndroid.parentProductId) && Intrinsics.areEqual(this.productId, nitroReceiptValidationResultAndroid.productId) && Intrinsics.areEqual(this.productType, nitroReceiptValidationResultAndroid.productType) && Double.compare(this.purchaseDate, nitroReceiptValidationResultAndroid.purchaseDate) == 0 && Double.compare(this.quantity, nitroReceiptValidationResultAndroid.quantity) == 0 && Intrinsics.areEqual(this.receiptId, nitroReceiptValidationResultAndroid.receiptId) && Double.compare(this.renewalDate, nitroReceiptValidationResultAndroid.renewalDate) == 0 && Intrinsics.areEqual(this.term, nitroReceiptValidationResultAndroid.term) && Intrinsics.areEqual(this.termSku, nitroReceiptValidationResultAndroid.termSku) && this.testTransaction == nitroReceiptValidationResultAndroid.testTransaction;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.autoRenewing) * 31) + Boolean.hashCode(this.betaProduct)) * 31;
        Variant_NullType_Double variant_NullType_Double = this.cancelDate;
        int hashCode2 = (hashCode + (variant_NullType_Double == null ? 0 : variant_NullType_Double.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String = this.cancelReason;
        int hashCode3 = (hashCode2 + (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double2 = this.deferredDate;
        int hashCode4 = (hashCode3 + (variant_NullType_Double2 == null ? 0 : variant_NullType_Double2.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String2 = this.deferredSku;
        return ((((((((((((((((((((((((hashCode4 + (variant_NullType_String2 != null ? variant_NullType_String2.hashCode() : 0)) * 31) + Double.hashCode(this.freeTrialEndDate)) * 31) + Double.hashCode(this.gracePeriodEndDate)) * 31) + this.parentProductId.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.productType.hashCode()) * 31) + Double.hashCode(this.purchaseDate)) * 31) + Double.hashCode(this.quantity)) * 31) + this.receiptId.hashCode()) * 31) + Double.hashCode(this.renewalDate)) * 31) + this.term.hashCode()) * 31) + this.termSku.hashCode()) * 31) + Boolean.hashCode(this.testTransaction);
    }

    public String toString() {
        return "NitroReceiptValidationResultAndroid(autoRenewing=" + this.autoRenewing + ", betaProduct=" + this.betaProduct + ", cancelDate=" + this.cancelDate + ", cancelReason=" + this.cancelReason + ", deferredDate=" + this.deferredDate + ", deferredSku=" + this.deferredSku + ", freeTrialEndDate=" + this.freeTrialEndDate + ", gracePeriodEndDate=" + this.gracePeriodEndDate + ", parentProductId=" + this.parentProductId + ", productId=" + this.productId + ", productType=" + this.productType + ", purchaseDate=" + this.purchaseDate + ", quantity=" + this.quantity + ", receiptId=" + this.receiptId + ", renewalDate=" + this.renewalDate + ", term=" + this.term + ", termSku=" + this.termSku + ", testTransaction=" + this.testTransaction + ")";
    }

    public NitroReceiptValidationResultAndroid(boolean z, boolean z2, Variant_NullType_Double variant_NullType_Double, Variant_NullType_String variant_NullType_String, Variant_NullType_Double variant_NullType_Double2, Variant_NullType_String variant_NullType_String2, double d, double d2, String parentProductId, String productId, String productType, double d3, double d4, String receiptId, double d5, String term, String termSku, boolean z3) {
        Intrinsics.checkNotNullParameter(parentProductId, "parentProductId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(receiptId, "receiptId");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(termSku, "termSku");
        this.autoRenewing = z;
        this.betaProduct = z2;
        this.cancelDate = variant_NullType_Double;
        this.cancelReason = variant_NullType_String;
        this.deferredDate = variant_NullType_Double2;
        this.deferredSku = variant_NullType_String2;
        this.freeTrialEndDate = d;
        this.gracePeriodEndDate = d2;
        this.parentProductId = parentProductId;
        this.productId = productId;
        this.productType = productType;
        this.purchaseDate = d3;
        this.quantity = d4;
        this.receiptId = receiptId;
        this.renewalDate = d5;
        this.term = term;
        this.termSku = termSku;
        this.testTransaction = z3;
    }

    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    public final boolean getBetaProduct() {
        return this.betaProduct;
    }

    public final Variant_NullType_Double getCancelDate() {
        return this.cancelDate;
    }

    public final Variant_NullType_String getCancelReason() {
        return this.cancelReason;
    }

    public final Variant_NullType_Double getDeferredDate() {
        return this.deferredDate;
    }

    public final Variant_NullType_String getDeferredSku() {
        return this.deferredSku;
    }

    public final double getFreeTrialEndDate() {
        return this.freeTrialEndDate;
    }

    public final double getGracePeriodEndDate() {
        return this.gracePeriodEndDate;
    }

    public final String getParentProductId() {
        return this.parentProductId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final double getPurchaseDate() {
        return this.purchaseDate;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public final String getReceiptId() {
        return this.receiptId;
    }

    public final double getRenewalDate() {
        return this.renewalDate;
    }

    public final String getTerm() {
        return this.term;
    }

    public final String getTermSku() {
        return this.termSku;
    }

    public final boolean getTestTransaction() {
        return this.testTransaction;
    }

    /* compiled from: NitroReceiptValidationResultAndroid.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0007H\u0003¨\u0006\u001d"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationResultAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroReceiptValidationResultAndroid;", "autoRenewing", "", "betaProduct", "cancelDate", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "cancelReason", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "deferredDate", "deferredSku", "freeTrialEndDate", "", "gracePeriodEndDate", "parentProductId", "", "productId", "productType", "purchaseDate", "quantity", "receiptId", "renewalDate", "term", "termSku", "testTransaction", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroReceiptValidationResultAndroid fromCpp(boolean autoRenewing, boolean betaProduct, Variant_NullType_Double cancelDate, Variant_NullType_String cancelReason, Variant_NullType_Double deferredDate, Variant_NullType_String deferredSku, double freeTrialEndDate, double gracePeriodEndDate, String parentProductId, String productId, String productType, double purchaseDate, double quantity, String receiptId, double renewalDate, String term, String termSku, boolean testTransaction) {
            return new NitroReceiptValidationResultAndroid(autoRenewing, betaProduct, cancelDate, cancelReason, deferredDate, deferredSku, freeTrialEndDate, gracePeriodEndDate, parentProductId, productId, productType, purchaseDate, quantity, receiptId, renewalDate, term, termSku, testTransaction);
        }
    }
}
