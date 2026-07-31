package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0001BB\u009f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010,J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J®\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00032\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010!R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b*\u0010\u0017¨\u0006C"}, d2 = {"Ldev/hyo/openiap/ActiveSubscription;", "", "autoRenewingAndroid", "", "basePlanIdAndroid", "", "currentPlanId", "daysUntilExpirationIOS", "", "environmentIOS", "expirationDateIOS", "isActive", "productId", "purchaseToken", "purchaseTokenAndroid", "renewalInfoIOS", "Ldev/hyo/openiap/RenewalInfoIOS;", "transactionDate", "transactionId", "willExpireSoon", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/RenewalInfoIOS;DLjava/lang/String;Ljava/lang/Boolean;)V", "getAutoRenewingAndroid", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBasePlanIdAndroid", "()Ljava/lang/String;", "getCurrentPlanId", "getDaysUntilExpirationIOS", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEnvironmentIOS", "getExpirationDateIOS", "()Z", "getProductId", "getPurchaseToken", "getPurchaseTokenAndroid", "getRenewalInfoIOS", "()Ldev/hyo/openiap/RenewalInfoIOS;", "getTransactionDate", "()D", "getTransactionId", "getWillExpireSoon", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/RenewalInfoIOS;DLjava/lang/String;Ljava/lang/Boolean;)Ldev/hyo/openiap/ActiveSubscription;", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActiveSubscription {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean autoRenewingAndroid;
    private final String basePlanIdAndroid;
    private final String currentPlanId;
    private final Double daysUntilExpirationIOS;
    private final String environmentIOS;
    private final Double expirationDateIOS;
    private final boolean isActive;
    private final String productId;
    private final String purchaseToken;
    private final String purchaseTokenAndroid;
    private final RenewalInfoIOS renewalInfoIOS;
    private final double transactionDate;
    private final String transactionId;
    private final Boolean willExpireSoon;

    /* renamed from: component1, reason: from getter */
    public final Boolean getAutoRenewingAndroid() {
        return this.autoRenewingAndroid;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPurchaseTokenAndroid() {
        return this.purchaseTokenAndroid;
    }

    /* renamed from: component11, reason: from getter */
    public final RenewalInfoIOS getRenewalInfoIOS() {
        return this.renewalInfoIOS;
    }

    /* renamed from: component12, reason: from getter */
    public final double getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: component13, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getWillExpireSoon() {
        return this.willExpireSoon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBasePlanIdAndroid() {
        return this.basePlanIdAndroid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrentPlanId() {
        return this.currentPlanId;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getDaysUntilExpirationIOS() {
        return this.daysUntilExpirationIOS;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEnvironmentIOS() {
        return this.environmentIOS;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getExpirationDateIOS() {
        return this.expirationDateIOS;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: component8, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final ActiveSubscription copy(Boolean autoRenewingAndroid, String basePlanIdAndroid, String currentPlanId, Double daysUntilExpirationIOS, String environmentIOS, Double expirationDateIOS, boolean isActive, String productId, String purchaseToken, String purchaseTokenAndroid, RenewalInfoIOS renewalInfoIOS, double transactionDate, String transactionId, Boolean willExpireSoon) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        return new ActiveSubscription(autoRenewingAndroid, basePlanIdAndroid, currentPlanId, daysUntilExpirationIOS, environmentIOS, expirationDateIOS, isActive, productId, purchaseToken, purchaseTokenAndroid, renewalInfoIOS, transactionDate, transactionId, willExpireSoon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveSubscription)) {
            return false;
        }
        ActiveSubscription activeSubscription = (ActiveSubscription) other;
        return Intrinsics.areEqual(this.autoRenewingAndroid, activeSubscription.autoRenewingAndroid) && Intrinsics.areEqual(this.basePlanIdAndroid, activeSubscription.basePlanIdAndroid) && Intrinsics.areEqual(this.currentPlanId, activeSubscription.currentPlanId) && Intrinsics.areEqual((Object) this.daysUntilExpirationIOS, (Object) activeSubscription.daysUntilExpirationIOS) && Intrinsics.areEqual(this.environmentIOS, activeSubscription.environmentIOS) && Intrinsics.areEqual((Object) this.expirationDateIOS, (Object) activeSubscription.expirationDateIOS) && this.isActive == activeSubscription.isActive && Intrinsics.areEqual(this.productId, activeSubscription.productId) && Intrinsics.areEqual(this.purchaseToken, activeSubscription.purchaseToken) && Intrinsics.areEqual(this.purchaseTokenAndroid, activeSubscription.purchaseTokenAndroid) && Intrinsics.areEqual(this.renewalInfoIOS, activeSubscription.renewalInfoIOS) && Double.compare(this.transactionDate, activeSubscription.transactionDate) == 0 && Intrinsics.areEqual(this.transactionId, activeSubscription.transactionId) && Intrinsics.areEqual(this.willExpireSoon, activeSubscription.willExpireSoon);
    }

    public int hashCode() {
        Boolean bool = this.autoRenewingAndroid;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.basePlanIdAndroid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currentPlanId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.daysUntilExpirationIOS;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.environmentIOS;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d2 = this.expirationDateIOS;
        int hashCode6 = (((((hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31) + Boolean.hashCode(this.isActive)) * 31) + this.productId.hashCode()) * 31;
        String str4 = this.purchaseToken;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.purchaseTokenAndroid;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RenewalInfoIOS renewalInfoIOS = this.renewalInfoIOS;
        int hashCode9 = (((((hashCode8 + (renewalInfoIOS == null ? 0 : renewalInfoIOS.hashCode())) * 31) + Double.hashCode(this.transactionDate)) * 31) + this.transactionId.hashCode()) * 31;
        Boolean bool2 = this.willExpireSoon;
        return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "ActiveSubscription(autoRenewingAndroid=" + this.autoRenewingAndroid + ", basePlanIdAndroid=" + this.basePlanIdAndroid + ", currentPlanId=" + this.currentPlanId + ", daysUntilExpirationIOS=" + this.daysUntilExpirationIOS + ", environmentIOS=" + this.environmentIOS + ", expirationDateIOS=" + this.expirationDateIOS + ", isActive=" + this.isActive + ", productId=" + this.productId + ", purchaseToken=" + this.purchaseToken + ", purchaseTokenAndroid=" + this.purchaseTokenAndroid + ", renewalInfoIOS=" + this.renewalInfoIOS + ", transactionDate=" + this.transactionDate + ", transactionId=" + this.transactionId + ", willExpireSoon=" + this.willExpireSoon + ")";
    }

    public ActiveSubscription(Boolean bool, String str, String str2, Double d, String str3, Double d2, boolean z, String productId, String str4, String str5, RenewalInfoIOS renewalInfoIOS, double d3, String transactionId, Boolean bool2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.autoRenewingAndroid = bool;
        this.basePlanIdAndroid = str;
        this.currentPlanId = str2;
        this.daysUntilExpirationIOS = d;
        this.environmentIOS = str3;
        this.expirationDateIOS = d2;
        this.isActive = z;
        this.productId = productId;
        this.purchaseToken = str4;
        this.purchaseTokenAndroid = str5;
        this.renewalInfoIOS = renewalInfoIOS;
        this.transactionDate = d3;
        this.transactionId = transactionId;
        this.willExpireSoon = bool2;
    }

    public /* synthetic */ ActiveSubscription(Boolean bool, String str, String str2, Double d, String str3, Double d2, boolean z, String str4, String str5, String str6, RenewalInfoIOS renewalInfoIOS, double d3, String str7, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : d2, z, str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : renewalInfoIOS, d3, str7, (i & 8192) != 0 ? null : bool2);
    }

    public final Boolean getAutoRenewingAndroid() {
        return this.autoRenewingAndroid;
    }

    public final String getBasePlanIdAndroid() {
        return this.basePlanIdAndroid;
    }

    public final String getCurrentPlanId() {
        return this.currentPlanId;
    }

    public final Double getDaysUntilExpirationIOS() {
        return this.daysUntilExpirationIOS;
    }

    public final String getEnvironmentIOS() {
        return this.environmentIOS;
    }

    public final Double getExpirationDateIOS() {
        return this.expirationDateIOS;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getPurchaseTokenAndroid() {
        return this.purchaseTokenAndroid;
    }

    public final RenewalInfoIOS getRenewalInfoIOS() {
        return this.renewalInfoIOS;
    }

    public final double getTransactionDate() {
        return this.transactionDate;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final Boolean getWillExpireSoon() {
        return this.willExpireSoon;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ActiveSubscription$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ActiveSubscription;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ActiveSubscription fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("autoRenewingAndroid");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            Object obj2 = json.get("basePlanIdAndroid");
            String str = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = json.get("currentPlanId");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = json.get("daysUntilExpirationIOS");
            Number number = obj4 instanceof Number ? (Number) obj4 : null;
            Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            Object obj5 = json.get("environmentIOS");
            String str3 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = json.get("expirationDateIOS");
            Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
            Double valueOf2 = number2 != null ? Double.valueOf(number2.doubleValue()) : null;
            Object obj7 = json.get("isActive");
            Boolean bool2 = obj7 instanceof Boolean ? (Boolean) obj7 : null;
            boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
            Object obj8 = json.get("productId");
            String str4 = obj8 instanceof String ? (String) obj8 : null;
            String str5 = str4 == null ? "" : str4;
            Object obj9 = json.get("purchaseToken");
            String str6 = obj9 instanceof String ? (String) obj9 : null;
            Object obj10 = json.get("purchaseTokenAndroid");
            String str7 = obj10 instanceof String ? (String) obj10 : null;
            Object obj11 = json.get("renewalInfoIOS");
            Map<String, ? extends Object> map = obj11 instanceof Map ? (Map) obj11 : null;
            RenewalInfoIOS fromJson = map != null ? RenewalInfoIOS.INSTANCE.fromJson(map) : null;
            Object obj12 = json.get("transactionDate");
            Number number3 = obj12 instanceof Number ? (Number) obj12 : null;
            double doubleValue = number3 != null ? number3.doubleValue() : 0.0d;
            Object obj13 = json.get("transactionId");
            String str8 = obj13 instanceof String ? (String) obj13 : null;
            String str9 = str8 == null ? "" : str8;
            Object obj14 = json.get("willExpireSoon");
            return new ActiveSubscription(bool, str, str2, valueOf, str3, valueOf2, booleanValue, str5, str6, str7, fromJson, doubleValue, str9, obj14 instanceof Boolean ? (Boolean) obj14 : null);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[15];
        pairArr[0] = TuplesKt.to("__typename", "ActiveSubscription");
        pairArr[1] = TuplesKt.to("autoRenewingAndroid", this.autoRenewingAndroid);
        pairArr[2] = TuplesKt.to("basePlanIdAndroid", this.basePlanIdAndroid);
        pairArr[3] = TuplesKt.to("currentPlanId", this.currentPlanId);
        pairArr[4] = TuplesKt.to("daysUntilExpirationIOS", this.daysUntilExpirationIOS);
        pairArr[5] = TuplesKt.to("environmentIOS", this.environmentIOS);
        pairArr[6] = TuplesKt.to("expirationDateIOS", this.expirationDateIOS);
        pairArr[7] = TuplesKt.to("isActive", Boolean.valueOf(this.isActive));
        pairArr[8] = TuplesKt.to("productId", this.productId);
        pairArr[9] = TuplesKt.to("purchaseToken", this.purchaseToken);
        pairArr[10] = TuplesKt.to("purchaseTokenAndroid", this.purchaseTokenAndroid);
        RenewalInfoIOS renewalInfoIOS = this.renewalInfoIOS;
        pairArr[11] = TuplesKt.to("renewalInfoIOS", renewalInfoIOS != null ? renewalInfoIOS.toJson() : null);
        pairArr[12] = TuplesKt.to("transactionDate", Double.valueOf(this.transactionDate));
        pairArr[13] = TuplesKt.to("transactionId", this.transactionId);
        pairArr[14] = TuplesKt.to("willExpireSoon", this.willExpireSoon);
        return MapsKt.mapOf(pairArr);
    }
}
