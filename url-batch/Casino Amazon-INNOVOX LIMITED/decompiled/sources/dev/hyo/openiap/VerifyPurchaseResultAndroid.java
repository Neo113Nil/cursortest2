package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001MB§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u00102\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010403H\u0016J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0012HÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003JÊ\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00032\b\u0010J\u001a\u0004\u0018\u000104HÖ\u0003J\t\u0010K\u001a\u00020\u0012HÖ\u0001J\t\u0010L\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001b¨\u0006N"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseResultAndroid;", "Ldev/hyo/openiap/VerifyPurchaseResult;", "autoRenewing", "", "betaProduct", "cancelDate", "", "cancelReason", "", "deferredDate", "deferredSku", "freeTrialEndDate", "gracePeriodEndDate", "parentProductId", "productId", "productType", "purchaseDate", "quantity", "", "receiptId", "renewalDate", "term", "termSku", "testTransaction", "<init>", "(ZZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Z)V", "getAutoRenewing", "()Z", "getBetaProduct", "getCancelDate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCancelReason", "()Ljava/lang/String;", "getDeferredDate", "getDeferredSku", "getFreeTrialEndDate", "()D", "getGracePeriodEndDate", "getParentProductId", "getProductId", "getProductType", "getPurchaseDate", "getQuantity", "()I", "getReceiptId", "getRenewalDate", "getTerm", "getTermSku", "getTestTransaction", "toJson", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(ZZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Z)Ldev/hyo/openiap/VerifyPurchaseResultAndroid;", "equals", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerifyPurchaseResultAndroid implements VerifyPurchaseResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean autoRenewing;
    private final boolean betaProduct;
    private final Double cancelDate;
    private final String cancelReason;
    private final Double deferredDate;
    private final String deferredSku;
    private final double freeTrialEndDate;
    private final double gracePeriodEndDate;
    private final String parentProductId;
    private final String productId;
    private final String productType;
    private final double purchaseDate;
    private final int quantity;
    private final String receiptId;
    private final double renewalDate;
    private final String term;
    private final String termSku;
    private final boolean testTransaction;

    public static /* synthetic */ VerifyPurchaseResultAndroid copy$default(VerifyPurchaseResultAndroid verifyPurchaseResultAndroid, boolean z, boolean z2, Double d, String str, Double d2, String str2, double d3, double d4, String str3, String str4, String str5, double d5, int i, String str6, double d6, String str7, String str8, boolean z3, int i2, Object obj) {
        boolean z4 = (i2 & 1) != 0 ? verifyPurchaseResultAndroid.autoRenewing : z;
        boolean z5 = (i2 & 2) != 0 ? verifyPurchaseResultAndroid.betaProduct : z2;
        Double d7 = (i2 & 4) != 0 ? verifyPurchaseResultAndroid.cancelDate : d;
        String str9 = (i2 & 8) != 0 ? verifyPurchaseResultAndroid.cancelReason : str;
        Double d8 = (i2 & 16) != 0 ? verifyPurchaseResultAndroid.deferredDate : d2;
        String str10 = (i2 & 32) != 0 ? verifyPurchaseResultAndroid.deferredSku : str2;
        double d9 = (i2 & 64) != 0 ? verifyPurchaseResultAndroid.freeTrialEndDate : d3;
        double d10 = (i2 & 128) != 0 ? verifyPurchaseResultAndroid.gracePeriodEndDate : d4;
        String str11 = (i2 & 256) != 0 ? verifyPurchaseResultAndroid.parentProductId : str3;
        String str12 = (i2 & 512) != 0 ? verifyPurchaseResultAndroid.productId : str4;
        String str13 = (i2 & 1024) != 0 ? verifyPurchaseResultAndroid.productType : str5;
        boolean z6 = z4;
        boolean z7 = z5;
        double d11 = (i2 & 2048) != 0 ? verifyPurchaseResultAndroid.purchaseDate : d5;
        int i3 = (i2 & 4096) != 0 ? verifyPurchaseResultAndroid.quantity : i;
        double d12 = d11;
        String str14 = (i2 & 8192) != 0 ? verifyPurchaseResultAndroid.receiptId : str6;
        double d13 = (i2 & 16384) != 0 ? verifyPurchaseResultAndroid.renewalDate : d6;
        return verifyPurchaseResultAndroid.copy(z6, z7, d7, str9, d8, str10, d9, d10, str11, str12, str13, d12, i3, str14, d13, (i2 & 32768) != 0 ? verifyPurchaseResultAndroid.term : str7, (i2 & 65536) != 0 ? verifyPurchaseResultAndroid.termSku : str8, (i2 & 131072) != 0 ? verifyPurchaseResultAndroid.testTransaction : z3);
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
    public final int getQuantity() {
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
    public final Double getCancelDate() {
        return this.cancelDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCancelReason() {
        return this.cancelReason;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getDeferredDate() {
        return this.deferredDate;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDeferredSku() {
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

    public final VerifyPurchaseResultAndroid copy(boolean autoRenewing, boolean betaProduct, Double cancelDate, String cancelReason, Double deferredDate, String deferredSku, double freeTrialEndDate, double gracePeriodEndDate, String parentProductId, String productId, String productType, double purchaseDate, int quantity, String receiptId, double renewalDate, String term, String termSku, boolean testTransaction) {
        Intrinsics.checkNotNullParameter(parentProductId, "parentProductId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(receiptId, "receiptId");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(termSku, "termSku");
        return new VerifyPurchaseResultAndroid(autoRenewing, betaProduct, cancelDate, cancelReason, deferredDate, deferredSku, freeTrialEndDate, gracePeriodEndDate, parentProductId, productId, productType, purchaseDate, quantity, receiptId, renewalDate, term, termSku, testTransaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPurchaseResultAndroid)) {
            return false;
        }
        VerifyPurchaseResultAndroid verifyPurchaseResultAndroid = (VerifyPurchaseResultAndroid) other;
        return this.autoRenewing == verifyPurchaseResultAndroid.autoRenewing && this.betaProduct == verifyPurchaseResultAndroid.betaProduct && Intrinsics.areEqual((Object) this.cancelDate, (Object) verifyPurchaseResultAndroid.cancelDate) && Intrinsics.areEqual(this.cancelReason, verifyPurchaseResultAndroid.cancelReason) && Intrinsics.areEqual((Object) this.deferredDate, (Object) verifyPurchaseResultAndroid.deferredDate) && Intrinsics.areEqual(this.deferredSku, verifyPurchaseResultAndroid.deferredSku) && Double.compare(this.freeTrialEndDate, verifyPurchaseResultAndroid.freeTrialEndDate) == 0 && Double.compare(this.gracePeriodEndDate, verifyPurchaseResultAndroid.gracePeriodEndDate) == 0 && Intrinsics.areEqual(this.parentProductId, verifyPurchaseResultAndroid.parentProductId) && Intrinsics.areEqual(this.productId, verifyPurchaseResultAndroid.productId) && Intrinsics.areEqual(this.productType, verifyPurchaseResultAndroid.productType) && Double.compare(this.purchaseDate, verifyPurchaseResultAndroid.purchaseDate) == 0 && this.quantity == verifyPurchaseResultAndroid.quantity && Intrinsics.areEqual(this.receiptId, verifyPurchaseResultAndroid.receiptId) && Double.compare(this.renewalDate, verifyPurchaseResultAndroid.renewalDate) == 0 && Intrinsics.areEqual(this.term, verifyPurchaseResultAndroid.term) && Intrinsics.areEqual(this.termSku, verifyPurchaseResultAndroid.termSku) && this.testTransaction == verifyPurchaseResultAndroid.testTransaction;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.autoRenewing) * 31) + Boolean.hashCode(this.betaProduct)) * 31;
        Double d = this.cancelDate;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.cancelReason;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.deferredDate;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str2 = this.deferredSku;
        return ((((((((((((((((((((((((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Double.hashCode(this.freeTrialEndDate)) * 31) + Double.hashCode(this.gracePeriodEndDate)) * 31) + this.parentProductId.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.productType.hashCode()) * 31) + Double.hashCode(this.purchaseDate)) * 31) + Integer.hashCode(this.quantity)) * 31) + this.receiptId.hashCode()) * 31) + Double.hashCode(this.renewalDate)) * 31) + this.term.hashCode()) * 31) + this.termSku.hashCode()) * 31) + Boolean.hashCode(this.testTransaction);
    }

    public String toString() {
        return "VerifyPurchaseResultAndroid(autoRenewing=" + this.autoRenewing + ", betaProduct=" + this.betaProduct + ", cancelDate=" + this.cancelDate + ", cancelReason=" + this.cancelReason + ", deferredDate=" + this.deferredDate + ", deferredSku=" + this.deferredSku + ", freeTrialEndDate=" + this.freeTrialEndDate + ", gracePeriodEndDate=" + this.gracePeriodEndDate + ", parentProductId=" + this.parentProductId + ", productId=" + this.productId + ", productType=" + this.productType + ", purchaseDate=" + this.purchaseDate + ", quantity=" + this.quantity + ", receiptId=" + this.receiptId + ", renewalDate=" + this.renewalDate + ", term=" + this.term + ", termSku=" + this.termSku + ", testTransaction=" + this.testTransaction + ")";
    }

    public VerifyPurchaseResultAndroid(boolean z, boolean z2, Double d, String str, Double d2, String str2, double d3, double d4, String parentProductId, String productId, String productType, double d5, int i, String receiptId, double d6, String term, String termSku, boolean z3) {
        Intrinsics.checkNotNullParameter(parentProductId, "parentProductId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(receiptId, "receiptId");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(termSku, "termSku");
        this.autoRenewing = z;
        this.betaProduct = z2;
        this.cancelDate = d;
        this.cancelReason = str;
        this.deferredDate = d2;
        this.deferredSku = str2;
        this.freeTrialEndDate = d3;
        this.gracePeriodEndDate = d4;
        this.parentProductId = parentProductId;
        this.productId = productId;
        this.productType = productType;
        this.purchaseDate = d5;
        this.quantity = i;
        this.receiptId = receiptId;
        this.renewalDate = d6;
        this.term = term;
        this.termSku = termSku;
        this.testTransaction = z3;
    }

    public /* synthetic */ VerifyPurchaseResultAndroid(boolean z, boolean z2, Double d, String str, Double d2, String str2, double d3, double d4, String str3, String str4, String str5, double d5, int i, String str6, double d6, String str7, String str8, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i2 & 4) != 0 ? null : d, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : d2, (i2 & 32) != 0 ? null : str2, d3, d4, str3, str4, str5, d5, i, str6, d6, str7, str8, z3);
    }

    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    public final boolean getBetaProduct() {
        return this.betaProduct;
    }

    public final Double getCancelDate() {
        return this.cancelDate;
    }

    public final String getCancelReason() {
        return this.cancelReason;
    }

    public final Double getDeferredDate() {
        return this.deferredDate;
    }

    public final String getDeferredSku() {
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

    public final int getQuantity() {
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

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseResultAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/VerifyPurchaseResultAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VerifyPurchaseResultAndroid fromJson(Map<String, ? extends Object> json) {
            int i;
            boolean z;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("autoRenewing");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Object obj2 = json.get("betaProduct");
            Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Object obj3 = json.get("cancelDate");
            Number number = obj3 instanceof Number ? (Number) obj3 : null;
            Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            Object obj4 = json.get("cancelReason");
            String str = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = json.get("deferredDate");
            Number number2 = obj5 instanceof Number ? (Number) obj5 : null;
            Double valueOf2 = number2 != null ? Double.valueOf(number2.doubleValue()) : null;
            Object obj6 = json.get("deferredSku");
            String str2 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = json.get("freeTrialEndDate");
            Number number3 = obj7 instanceof Number ? (Number) obj7 : null;
            double doubleValue = number3 != null ? number3.doubleValue() : 0.0d;
            Object obj8 = json.get("gracePeriodEndDate");
            Number number4 = obj8 instanceof Number ? (Number) obj8 : null;
            double doubleValue2 = number4 != null ? number4.doubleValue() : 0.0d;
            Object obj9 = json.get("parentProductId");
            String str3 = obj9 instanceof String ? (String) obj9 : null;
            if (str3 == null) {
                str3 = "";
            }
            Object obj10 = json.get("productId");
            String str4 = obj10 instanceof String ? (String) obj10 : null;
            if (str4 == null) {
                str4 = "";
            }
            Object obj11 = json.get("productType");
            String str5 = obj11 instanceof String ? (String) obj11 : null;
            if (str5 == null) {
                str5 = "";
            }
            Object obj12 = json.get("purchaseDate");
            boolean z2 = booleanValue;
            Number number5 = obj12 instanceof Number ? (Number) obj12 : null;
            double doubleValue3 = number5 != null ? number5.doubleValue() : 0.0d;
            Object obj13 = json.get("quantity");
            Number number6 = obj13 instanceof Number ? (Number) obj13 : null;
            int intValue = number6 != null ? number6.intValue() : 0;
            Object obj14 = json.get("receiptId");
            int i2 = intValue;
            String str6 = obj14 instanceof String ? (String) obj14 : null;
            if (str6 == null) {
                str6 = "";
            }
            Object obj15 = json.get("renewalDate");
            Number number7 = obj15 instanceof Number ? (Number) obj15 : null;
            double doubleValue4 = number7 != null ? number7.doubleValue() : 0.0d;
            Object obj16 = json.get("term");
            String str7 = obj16 instanceof String ? (String) obj16 : null;
            if (str7 == null) {
                str7 = "";
            }
            Object obj17 = json.get("termSku");
            String str8 = str7;
            String str9 = obj17 instanceof String ? (String) obj17 : null;
            String str10 = str9 != null ? str9 : "";
            Object obj18 = json.get("testTransaction");
            Boolean bool3 = obj18 instanceof Boolean ? (Boolean) obj18 : null;
            if (bool3 != null) {
                i = i2;
                z = bool3.booleanValue();
            } else {
                i = i2;
                z = false;
            }
            return new VerifyPurchaseResultAndroid(z2, booleanValue2, valueOf, str, valueOf2, str2, doubleValue, doubleValue2, str3, str4, str5, doubleValue3, i, str6, doubleValue4, str8, str10, z);
        }
    }

    @Override // dev.hyo.openiap.VerifyPurchaseResult
    public Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "VerifyPurchaseResultAndroid"), TuplesKt.to("autoRenewing", Boolean.valueOf(this.autoRenewing)), TuplesKt.to("betaProduct", Boolean.valueOf(this.betaProduct)), TuplesKt.to("cancelDate", this.cancelDate), TuplesKt.to("cancelReason", this.cancelReason), TuplesKt.to("deferredDate", this.deferredDate), TuplesKt.to("deferredSku", this.deferredSku), TuplesKt.to("freeTrialEndDate", Double.valueOf(this.freeTrialEndDate)), TuplesKt.to("gracePeriodEndDate", Double.valueOf(this.gracePeriodEndDate)), TuplesKt.to("parentProductId", this.parentProductId), TuplesKt.to("productId", this.productId), TuplesKt.to("productType", this.productType), TuplesKt.to("purchaseDate", Double.valueOf(this.purchaseDate)), TuplesKt.to("quantity", Integer.valueOf(this.quantity)), TuplesKt.to("receiptId", this.receiptId), TuplesKt.to("renewalDate", Double.valueOf(this.renewalDate)), TuplesKt.to("term", this.term), TuplesKt.to("termSku", this.termSku), TuplesKt.to("testTransaction", Boolean.valueOf(this.testTransaction)));
    }
}
