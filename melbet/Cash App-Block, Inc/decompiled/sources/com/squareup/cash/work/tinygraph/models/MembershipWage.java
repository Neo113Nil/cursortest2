package com.squareup.cash.work.tinygraph.models;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ@\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u0014R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MembershipWage;", "", "Lcom/squareup/cash/work/tinygraph/models/MembershipWageMoney;", "hourlyWage", "", "overtimeExempt", "tipEligible", "", "wageType", "<init>", "(Lcom/squareup/cash/work/tinygraph/models/MembershipWageMoney;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "copy", "(Lcom/squareup/cash/work/tinygraph/models/MembershipWageMoney;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/squareup/cash/work/tinygraph/models/MembershipWage;", "Lcom/squareup/cash/work/tinygraph/models/MembershipWageMoney;", "getHourlyWage", "()Lcom/squareup/cash/work/tinygraph/models/MembershipWageMoney;", "getHourlyWage$annotations", "()V", "Ljava/lang/Boolean;", "getOvertimeExempt", "()Ljava/lang/Boolean;", "getOvertimeExempt$annotations", "getTipEligible", "getTipEligible$annotations", "Ljava/lang/String;", "getWageType", "()Ljava/lang/String;", "getWageType$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MembershipWage {
    public final MembershipWageMoney hourlyWage;
    public final Boolean overtimeExempt;
    public final Boolean tipEligible;
    public final String wageType;

    public /* synthetic */ MembershipWage(MembershipWageMoney membershipWageMoney, Boolean bool, Boolean bool2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : membershipWageMoney, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str);
    }

    @Json(name = "hourlyWage")
    public static /* synthetic */ void getHourlyWage$annotations() {
    }

    @Json(name = "overtimeExempt")
    public static /* synthetic */ void getOvertimeExempt$annotations() {
    }

    @Json(name = "tipEligible")
    public static /* synthetic */ void getTipEligible$annotations() {
    }

    @Json(name = "wageType")
    public static /* synthetic */ void getWageType$annotations() {
    }

    public final MembershipWage copy(@Json(name = "hourlyWage") MembershipWageMoney hourlyWage, @Json(name = "overtimeExempt") Boolean overtimeExempt, @Json(name = "tipEligible") Boolean tipEligible, @Json(name = "wageType") String wageType) {
        return new MembershipWage(hourlyWage, overtimeExempt, tipEligible, wageType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembershipWage)) {
            return false;
        }
        MembershipWage membershipWage = (MembershipWage) obj;
        return Intrinsics.areEqual(this.hourlyWage, membershipWage.hourlyWage) && Intrinsics.areEqual(this.overtimeExempt, membershipWage.overtimeExempt) && Intrinsics.areEqual(this.tipEligible, membershipWage.tipEligible) && Intrinsics.areEqual(this.wageType, membershipWage.wageType);
    }

    public final int hashCode() {
        MembershipWageMoney membershipWageMoney = this.hourlyWage;
        int hashCode = (membershipWageMoney == null ? 0 : membershipWageMoney.hashCode()) * 31;
        Boolean bool = this.overtimeExempt;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.tipEligible;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.wageType;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MembershipWage(hourlyWage=" + this.hourlyWage + ", overtimeExempt=" + this.overtimeExempt + ", tipEligible=" + this.tipEligible + ", wageType=" + this.wageType + ")";
    }

    public MembershipWage(@Json(name = "hourlyWage") MembershipWageMoney membershipWageMoney, @Json(name = "overtimeExempt") Boolean bool, @Json(name = "tipEligible") Boolean bool2, @Json(name = "wageType") String str) {
        this.hourlyWage = membershipWageMoney;
        this.overtimeExempt = bool;
        this.tipEligible = bool2;
        this.wageType = str;
    }
}
