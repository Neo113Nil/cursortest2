package com.squareup.cash.work.tinygraph.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u009c\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010 R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010$\u0012\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010&R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010$\u0012\u0004\b)\u0010\u001d\u001a\u0004\b(\u0010&R\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010$\u0012\u0004\b+\u0010\u001d\u001a\u0004\b*\u0010&R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010,\u0012\u0004\b.\u0010\u001d\u001a\u0004\b\f\u0010-R\"\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010$\u0012\u0004\b0\u0010\u001d\u001a\u0004\b/\u0010&R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00101\u0012\u0004\b4\u0010\u001d\u001a\u0004\b2\u00103R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00105\u0012\u0004\b8\u0010\u001d\u001a\u0004\b6\u00107R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00109\u0012\u0004\b<\u0010\u001d\u001a\u0004\b:\u0010;R(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010=\u0012\u0004\b@\u0010\u001d\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Membership;", "Lcom/squareup/cash/work/tinygraph/models/IBaseEntity;", "", "id", "", "createdAt", "updatedAt", "Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "fromReference", "toReference", "merchantId", "", "isTransitive", "metadataReference", "Lcom/squareup/cash/work/tinygraph/models/MembershipStatus;", "status", "invitedAt", "Lcom/squareup/cash/work/tinygraph/models/MembershipProperties;", "properties", "", "permissions", "<init>", "(Ljava/lang/String;JJLcom/squareup/cash/work/tinygraph/models/EntityReference;Lcom/squareup/cash/work/tinygraph/models/EntityReference;Lcom/squareup/cash/work/tinygraph/models/EntityReference;Ljava/lang/Boolean;Lcom/squareup/cash/work/tinygraph/models/EntityReference;Lcom/squareup/cash/work/tinygraph/models/MembershipStatus;Ljava/lang/Long;Lcom/squareup/cash/work/tinygraph/models/MembershipProperties;Ljava/util/List;)V", "copy", "(Ljava/lang/String;JJLcom/squareup/cash/work/tinygraph/models/EntityReference;Lcom/squareup/cash/work/tinygraph/models/EntityReference;Lcom/squareup/cash/work/tinygraph/models/EntityReference;Ljava/lang/Boolean;Lcom/squareup/cash/work/tinygraph/models/EntityReference;Lcom/squareup/cash/work/tinygraph/models/MembershipStatus;Ljava/lang/Long;Lcom/squareup/cash/work/tinygraph/models/MembershipProperties;Ljava/util/List;)Lcom/squareup/cash/work/tinygraph/models/Membership;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "J", "getCreatedAt", "()J", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "getFromReference", "()Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "getFromReference$annotations", "getToReference", "getToReference$annotations", "getMerchantId", "getMerchantId$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isTransitive$annotations", "getMetadataReference", "getMetadataReference$annotations", "Lcom/squareup/cash/work/tinygraph/models/MembershipStatus;", "getStatus", "()Lcom/squareup/cash/work/tinygraph/models/MembershipStatus;", "getStatus$annotations", "Ljava/lang/Long;", "getInvitedAt", "()Ljava/lang/Long;", "getInvitedAt$annotations", "Lcom/squareup/cash/work/tinygraph/models/MembershipProperties;", "getProperties", "()Lcom/squareup/cash/work/tinygraph/models/MembershipProperties;", "getProperties$annotations", "Ljava/util/List;", "getPermissions", "()Ljava/util/List;", "getPermissions$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Membership implements IBaseEntity {
    public final long createdAt;
    public final EntityReference fromReference;
    public final String id;
    public final Long invitedAt;
    public final Boolean isTransitive;
    public final EntityReference merchantId;
    public final EntityReference metadataReference;
    public final List permissions;
    public final MembershipProperties properties;
    public final MembershipStatus status;
    public final EntityReference toReference;
    public final long updatedAt;

    public /* synthetic */ Membership(String str, long j, long j2, EntityReference entityReference, EntityReference entityReference2, EntityReference entityReference3, Boolean bool, EntityReference entityReference4, MembershipStatus membershipStatus, Long l, MembershipProperties membershipProperties, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, entityReference, entityReference2, (i & 32) != 0 ? null : entityReference3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : entityReference4, (i & 256) != 0 ? null : membershipStatus, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : membershipProperties, (i & 2048) != 0 ? null : list);
    }

    @Json(name = "createdAt")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @Json(name = "fromId")
    public static /* synthetic */ void getFromReference$annotations() {
    }

    @Json(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @Json(name = "invitedAt")
    public static /* synthetic */ void getInvitedAt$annotations() {
    }

    @Json(name = "merchantId")
    public static /* synthetic */ void getMerchantId$annotations() {
    }

    @Json(name = "metadataId")
    public static /* synthetic */ void getMetadataReference$annotations() {
    }

    @Json(name = "permissions")
    public static /* synthetic */ void getPermissions$annotations() {
    }

    @Json(name = "properties")
    public static /* synthetic */ void getProperties$annotations() {
    }

    @Json(name = "status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @Json(name = "toId")
    public static /* synthetic */ void getToReference$annotations() {
    }

    @Json(name = "updatedAt")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @Json(name = "isTransitive")
    public static /* synthetic */ void isTransitive$annotations() {
    }

    public final Membership copy(@Json(name = "id") String id, @Json(name = "createdAt") long createdAt, @Json(name = "updatedAt") long updatedAt, @Json(name = "fromId") EntityReference fromReference, @Json(name = "toId") EntityReference toReference, @Json(name = "merchantId") EntityReference merchantId, @Json(name = "isTransitive") Boolean isTransitive, @Json(name = "metadataId") EntityReference metadataReference, @Json(name = "status") MembershipStatus status, @Json(name = "invitedAt") Long invitedAt, @Json(name = "properties") MembershipProperties properties, @Json(name = "permissions") List<String> permissions) {
        id.getClass();
        fromReference.getClass();
        toReference.getClass();
        return new Membership(id, createdAt, updatedAt, fromReference, toReference, merchantId, isTransitive, metadataReference, status, invitedAt, properties, permissions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Membership)) {
            return false;
        }
        Membership membership = (Membership) obj;
        return Intrinsics.areEqual(this.id, membership.id) && this.createdAt == membership.createdAt && this.updatedAt == membership.updatedAt && Intrinsics.areEqual(this.fromReference, membership.fromReference) && Intrinsics.areEqual(this.toReference, membership.toReference) && Intrinsics.areEqual(this.merchantId, membership.merchantId) && Intrinsics.areEqual(this.isTransitive, membership.isTransitive) && Intrinsics.areEqual(this.metadataReference, membership.metadataReference) && this.status == membership.status && Intrinsics.areEqual(this.invitedAt, membership.invitedAt) && Intrinsics.areEqual(this.properties, membership.properties) && Intrinsics.areEqual(this.permissions, membership.permissions);
    }

    @Override // com.squareup.cash.work.tinygraph.models.IBaseEntity
    public final String getId() {
        return this.id;
    }

    @Override // com.squareup.cash.work.tinygraph.models.IBaseEntity
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final int hashCode() {
        int hashCode = (this.toReference.hashCode() + ((this.fromReference.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.id.hashCode() * 31, 31, this.createdAt), 31, this.updatedAt)) * 31)) * 31;
        EntityReference entityReference = this.merchantId;
        int hashCode2 = (hashCode + (entityReference == null ? 0 : entityReference.hashCode())) * 31;
        Boolean bool = this.isTransitive;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        EntityReference entityReference2 = this.metadataReference;
        int hashCode4 = (hashCode3 + (entityReference2 == null ? 0 : entityReference2.hashCode())) * 31;
        MembershipStatus membershipStatus = this.status;
        int hashCode5 = (hashCode4 + (membershipStatus == null ? 0 : membershipStatus.hashCode())) * 31;
        Long l = this.invitedAt;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        MembershipProperties membershipProperties = this.properties;
        int hashCode7 = (hashCode6 + (membershipProperties == null ? 0 : membershipProperties.hashCode())) * 31;
        List list = this.permissions;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Membership(id=", this.id, ", createdAt=", this.createdAt);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.updatedAt, ", updatedAt=", ", fromReference=", m);
        m.append(this.fromReference);
        m.append(", toReference=");
        m.append(this.toReference);
        m.append(", merchantId=");
        m.append(this.merchantId);
        m.append(", isTransitive=");
        m.append(this.isTransitive);
        m.append(", metadataReference=");
        m.append(this.metadataReference);
        m.append(", status=");
        m.append(this.status);
        m.append(", invitedAt=");
        m.append(this.invitedAt);
        m.append(", properties=");
        m.append(this.properties);
        m.append(", permissions=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.permissions, ")");
    }

    public Membership(@Json(name = "id") String str, @Json(name = "createdAt") long j, @Json(name = "updatedAt") long j2, @Json(name = "fromId") EntityReference entityReference, @Json(name = "toId") EntityReference entityReference2, @Json(name = "merchantId") EntityReference entityReference3, @Json(name = "isTransitive") Boolean bool, @Json(name = "metadataId") EntityReference entityReference4, @Json(name = "status") MembershipStatus membershipStatus, @Json(name = "invitedAt") Long l, @Json(name = "properties") MembershipProperties membershipProperties, @Json(name = "permissions") List<String> list) {
        str.getClass();
        entityReference.getClass();
        entityReference2.getClass();
        this.id = str;
        this.createdAt = j;
        this.updatedAt = j2;
        this.fromReference = entityReference;
        this.toReference = entityReference2;
        this.merchantId = entityReference3;
        this.isTransitive = bool;
        this.metadataReference = entityReference4;
        this.status = membershipStatus;
        this.invitedAt = l;
        this.properties = membershipProperties;
        this.permissions = list;
    }
}
