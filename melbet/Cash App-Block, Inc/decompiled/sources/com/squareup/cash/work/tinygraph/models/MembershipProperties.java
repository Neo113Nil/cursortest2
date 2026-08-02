package com.squareup.cash.work.tinygraph.models;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJR\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0003\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u0012\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0004\u0010\u0010R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u0012\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MembershipProperties;", "", "", "isOwner", "isAdmin", "", "", "accessBlockers", "teamMemberId", "Lcom/squareup/cash/work/tinygraph/models/MembershipWage;", "wage", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Set;Ljava/lang/String;Lcom/squareup/cash/work/tinygraph/models/MembershipWage;)V", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Set;Ljava/lang/String;Lcom/squareup/cash/work/tinygraph/models/MembershipWage;)Lcom/squareup/cash/work/tinygraph/models/MembershipProperties;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isOwner$annotations", "()V", "isAdmin$annotations", "Ljava/util/Set;", "getAccessBlockers", "()Ljava/util/Set;", "getAccessBlockers$annotations", "Ljava/lang/String;", "getTeamMemberId", "()Ljava/lang/String;", "getTeamMemberId$annotations", "Lcom/squareup/cash/work/tinygraph/models/MembershipWage;", "getWage", "()Lcom/squareup/cash/work/tinygraph/models/MembershipWage;", "getWage$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MembershipProperties {
    public final Set accessBlockers;
    public final Boolean isAdmin;
    public final Boolean isOwner;
    public final String teamMemberId;
    public final MembershipWage wage;

    public /* synthetic */ MembershipProperties(Boolean bool, Boolean bool2, Set set, String str, MembershipWage membershipWage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : set, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : membershipWage);
    }

    @Json(name = "accessBlockers")
    public static /* synthetic */ void getAccessBlockers$annotations() {
    }

    @Json(name = "teamMemberId")
    public static /* synthetic */ void getTeamMemberId$annotations() {
    }

    @Json(name = "wage")
    public static /* synthetic */ void getWage$annotations() {
    }

    @Json(name = "isAdmin")
    public static /* synthetic */ void isAdmin$annotations() {
    }

    @Json(name = "isOwner")
    public static /* synthetic */ void isOwner$annotations() {
    }

    public final MembershipProperties copy(@Json(name = "isOwner") Boolean isOwner, @Json(name = "isAdmin") Boolean isAdmin, @Json(name = "accessBlockers") Set<String> accessBlockers, @Json(name = "teamMemberId") String teamMemberId, @Json(name = "wage") MembershipWage wage) {
        return new MembershipProperties(isOwner, isAdmin, accessBlockers, teamMemberId, wage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembershipProperties)) {
            return false;
        }
        MembershipProperties membershipProperties = (MembershipProperties) obj;
        return Intrinsics.areEqual(this.isOwner, membershipProperties.isOwner) && Intrinsics.areEqual(this.isAdmin, membershipProperties.isAdmin) && Intrinsics.areEqual(this.accessBlockers, membershipProperties.accessBlockers) && Intrinsics.areEqual(this.teamMemberId, membershipProperties.teamMemberId) && Intrinsics.areEqual(this.wage, membershipProperties.wage);
    }

    public final int hashCode() {
        Boolean bool = this.isOwner;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isAdmin;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Set set = this.accessBlockers;
        int hashCode3 = (hashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        String str = this.teamMemberId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        MembershipWage membershipWage = this.wage;
        return hashCode4 + (membershipWage != null ? membershipWage.hashCode() : 0);
    }

    public final String toString() {
        return "MembershipProperties(isOwner=" + this.isOwner + ", isAdmin=" + this.isAdmin + ", accessBlockers=" + this.accessBlockers + ", teamMemberId=" + this.teamMemberId + ", wage=" + this.wage + ")";
    }

    public MembershipProperties(@Json(name = "isOwner") Boolean bool, @Json(name = "isAdmin") Boolean bool2, @Json(name = "accessBlockers") Set<String> set, @Json(name = "teamMemberId") String str, @Json(name = "wage") MembershipWage membershipWage) {
        this.isOwner = bool;
        this.isAdmin = bool2;
        this.accessBlockers = set;
        this.teamMemberId = str;
        this.wage = membershipWage;
    }
}
