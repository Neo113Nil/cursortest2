package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00016B\u0087\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010#J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u0090\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0007\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00067"}, d2 = {"Ldev/hyo/openiap/RenewalInfoIOS;", "", "autoRenewPreference", "", "expirationReason", "gracePeriodExpirationDate", "", "isInBillingRetry", "", "jsonRepresentation", "pendingUpgradeProductId", "priceIncreaseStatus", "renewalDate", "renewalOfferId", "renewalOfferType", "willAutoRenew", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Z)V", "getAutoRenewPreference", "()Ljava/lang/String;", "getExpirationReason", "getGracePeriodExpirationDate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getJsonRepresentation", "getPendingUpgradeProductId", "getPriceIncreaseStatus", "getRenewalDate", "getRenewalOfferId", "getRenewalOfferType", "getWillAutoRenew", "()Z", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Z)Ldev/hyo/openiap/RenewalInfoIOS;", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RenewalInfoIOS {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String autoRenewPreference;
    private final String expirationReason;
    private final Double gracePeriodExpirationDate;
    private final Boolean isInBillingRetry;
    private final String jsonRepresentation;
    private final String pendingUpgradeProductId;
    private final String priceIncreaseStatus;
    private final Double renewalDate;
    private final String renewalOfferId;
    private final String renewalOfferType;
    private final boolean willAutoRenew;

    public static /* synthetic */ RenewalInfoIOS copy$default(RenewalInfoIOS renewalInfoIOS, String str, String str2, Double d, Boolean bool, String str3, String str4, String str5, Double d2, String str6, String str7, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = renewalInfoIOS.autoRenewPreference;
        }
        if ((i & 2) != 0) {
            str2 = renewalInfoIOS.expirationReason;
        }
        if ((i & 4) != 0) {
            d = renewalInfoIOS.gracePeriodExpirationDate;
        }
        if ((i & 8) != 0) {
            bool = renewalInfoIOS.isInBillingRetry;
        }
        if ((i & 16) != 0) {
            str3 = renewalInfoIOS.jsonRepresentation;
        }
        if ((i & 32) != 0) {
            str4 = renewalInfoIOS.pendingUpgradeProductId;
        }
        if ((i & 64) != 0) {
            str5 = renewalInfoIOS.priceIncreaseStatus;
        }
        if ((i & 128) != 0) {
            d2 = renewalInfoIOS.renewalDate;
        }
        if ((i & 256) != 0) {
            str6 = renewalInfoIOS.renewalOfferId;
        }
        if ((i & 512) != 0) {
            str7 = renewalInfoIOS.renewalOfferType;
        }
        if ((i & 1024) != 0) {
            z = renewalInfoIOS.willAutoRenew;
        }
        String str8 = str7;
        boolean z2 = z;
        Double d3 = d2;
        String str9 = str6;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        Double d4 = d;
        return renewalInfoIOS.copy(str, str2, d4, bool, str12, str10, str11, d3, str9, str8, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAutoRenewPreference() {
        return this.autoRenewPreference;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRenewalOfferType() {
        return this.renewalOfferType;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getWillAutoRenew() {
        return this.willAutoRenew;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExpirationReason() {
        return this.expirationReason;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getGracePeriodExpirationDate() {
        return this.gracePeriodExpirationDate;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsInBillingRetry() {
        return this.isInBillingRetry;
    }

    /* renamed from: component5, reason: from getter */
    public final String getJsonRepresentation() {
        return this.jsonRepresentation;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPendingUpgradeProductId() {
        return this.pendingUpgradeProductId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPriceIncreaseStatus() {
        return this.priceIncreaseStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final Double getRenewalDate() {
        return this.renewalDate;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRenewalOfferId() {
        return this.renewalOfferId;
    }

    public final RenewalInfoIOS copy(String autoRenewPreference, String expirationReason, Double gracePeriodExpirationDate, Boolean isInBillingRetry, String jsonRepresentation, String pendingUpgradeProductId, String priceIncreaseStatus, Double renewalDate, String renewalOfferId, String renewalOfferType, boolean willAutoRenew) {
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
        return Intrinsics.areEqual(this.autoRenewPreference, renewalInfoIOS.autoRenewPreference) && Intrinsics.areEqual(this.expirationReason, renewalInfoIOS.expirationReason) && Intrinsics.areEqual((Object) this.gracePeriodExpirationDate, (Object) renewalInfoIOS.gracePeriodExpirationDate) && Intrinsics.areEqual(this.isInBillingRetry, renewalInfoIOS.isInBillingRetry) && Intrinsics.areEqual(this.jsonRepresentation, renewalInfoIOS.jsonRepresentation) && Intrinsics.areEqual(this.pendingUpgradeProductId, renewalInfoIOS.pendingUpgradeProductId) && Intrinsics.areEqual(this.priceIncreaseStatus, renewalInfoIOS.priceIncreaseStatus) && Intrinsics.areEqual((Object) this.renewalDate, (Object) renewalInfoIOS.renewalDate) && Intrinsics.areEqual(this.renewalOfferId, renewalInfoIOS.renewalOfferId) && Intrinsics.areEqual(this.renewalOfferType, renewalInfoIOS.renewalOfferType) && this.willAutoRenew == renewalInfoIOS.willAutoRenew;
    }

    public int hashCode() {
        String str = this.autoRenewPreference;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.expirationReason;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.gracePeriodExpirationDate;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.isInBillingRetry;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.jsonRepresentation;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pendingUpgradeProductId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priceIncreaseStatus;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d2 = this.renewalDate;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str6 = this.renewalOfferId;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.renewalOfferType;
        return ((hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31) + Boolean.hashCode(this.willAutoRenew);
    }

    public String toString() {
        return "RenewalInfoIOS(autoRenewPreference=" + this.autoRenewPreference + ", expirationReason=" + this.expirationReason + ", gracePeriodExpirationDate=" + this.gracePeriodExpirationDate + ", isInBillingRetry=" + this.isInBillingRetry + ", jsonRepresentation=" + this.jsonRepresentation + ", pendingUpgradeProductId=" + this.pendingUpgradeProductId + ", priceIncreaseStatus=" + this.priceIncreaseStatus + ", renewalDate=" + this.renewalDate + ", renewalOfferId=" + this.renewalOfferId + ", renewalOfferType=" + this.renewalOfferType + ", willAutoRenew=" + this.willAutoRenew + ")";
    }

    public RenewalInfoIOS(String str, String str2, Double d, Boolean bool, String str3, String str4, String str5, Double d2, String str6, String str7, boolean z) {
        this.autoRenewPreference = str;
        this.expirationReason = str2;
        this.gracePeriodExpirationDate = d;
        this.isInBillingRetry = bool;
        this.jsonRepresentation = str3;
        this.pendingUpgradeProductId = str4;
        this.priceIncreaseStatus = str5;
        this.renewalDate = d2;
        this.renewalOfferId = str6;
        this.renewalOfferType = str7;
        this.willAutoRenew = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RenewalInfoIOS(String str, String str2, Double d, Boolean bool, String str3, String str4, String str5, Double d2, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, bool, str3, str4, str5, d2, str6, r12, r13);
        boolean z2;
        String str8;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        d = (i & 4) != 0 ? null : d;
        bool = (i & 8) != 0 ? null : bool;
        str3 = (i & 16) != 0 ? null : str3;
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & 64) != 0 ? null : str5;
        d2 = (i & 128) != 0 ? null : d2;
        str6 = (i & 256) != 0 ? null : str6;
        if ((i & 512) != 0) {
            z2 = z;
            str8 = null;
        } else {
            z2 = z;
            str8 = str7;
        }
    }

    public final String getAutoRenewPreference() {
        return this.autoRenewPreference;
    }

    public final String getExpirationReason() {
        return this.expirationReason;
    }

    public final Double getGracePeriodExpirationDate() {
        return this.gracePeriodExpirationDate;
    }

    public final Boolean isInBillingRetry() {
        return this.isInBillingRetry;
    }

    public final String getJsonRepresentation() {
        return this.jsonRepresentation;
    }

    public final String getPendingUpgradeProductId() {
        return this.pendingUpgradeProductId;
    }

    public final String getPriceIncreaseStatus() {
        return this.priceIncreaseStatus;
    }

    public final Double getRenewalDate() {
        return this.renewalDate;
    }

    public final String getRenewalOfferId() {
        return this.renewalOfferId;
    }

    public final String getRenewalOfferType() {
        return this.renewalOfferType;
    }

    public final boolean getWillAutoRenew() {
        return this.willAutoRenew;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/RenewalInfoIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/RenewalInfoIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RenewalInfoIOS fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("autoRenewPreference");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("expirationReason");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = json.get("gracePeriodExpirationDate");
            Number number = obj3 instanceof Number ? (Number) obj3 : null;
            Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            Object obj4 = json.get("isInBillingRetry");
            Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
            Object obj5 = json.get("jsonRepresentation");
            String str3 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = json.get("pendingUpgradeProductId");
            String str4 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = json.get("priceIncreaseStatus");
            String str5 = obj7 instanceof String ? (String) obj7 : null;
            Object obj8 = json.get("renewalDate");
            Number number2 = obj8 instanceof Number ? (Number) obj8 : null;
            Double valueOf2 = number2 != null ? Double.valueOf(number2.doubleValue()) : null;
            Object obj9 = json.get("renewalOfferId");
            String str6 = obj9 instanceof String ? (String) obj9 : null;
            Object obj10 = json.get("renewalOfferType");
            String str7 = obj10 instanceof String ? (String) obj10 : null;
            Object obj11 = json.get("willAutoRenew");
            Boolean bool2 = obj11 instanceof Boolean ? (Boolean) obj11 : null;
            return new RenewalInfoIOS(str, str2, valueOf, bool, str3, str4, str5, valueOf2, str6, str7, bool2 != null ? bool2.booleanValue() : false);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "RenewalInfoIOS"), TuplesKt.to("autoRenewPreference", this.autoRenewPreference), TuplesKt.to("expirationReason", this.expirationReason), TuplesKt.to("gracePeriodExpirationDate", this.gracePeriodExpirationDate), TuplesKt.to("isInBillingRetry", this.isInBillingRetry), TuplesKt.to("jsonRepresentation", this.jsonRepresentation), TuplesKt.to("pendingUpgradeProductId", this.pendingUpgradeProductId), TuplesKt.to("priceIncreaseStatus", this.priceIncreaseStatus), TuplesKt.to("renewalDate", this.renewalDate), TuplesKt.to("renewalOfferId", this.renewalOfferId), TuplesKt.to("renewalOfferType", this.renewalOfferType), TuplesKt.to("willAutoRenew", Boolean.valueOf(this.willAutoRenew)));
    }
}
