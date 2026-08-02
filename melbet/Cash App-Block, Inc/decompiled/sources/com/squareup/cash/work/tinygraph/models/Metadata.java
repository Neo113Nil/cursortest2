package com.squareup.cash.work.tinygraph.models;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJÆ\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010'R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b0\u0010$\u001a\u0004\b/\u0010-R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b4\u0010$\u001a\u0004\b2\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b8\u0010$\u001a\u0004\b6\u00107R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010 \u0012\u0004\b:\u0010$\u001a\u0004\b9\u0010\"R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010;\u0012\u0004\b>\u0010$\u001a\u0004\b<\u0010=R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010?\u0012\u0004\bB\u0010$\u001a\u0004\b@\u0010AR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010C\u0012\u0004\bF\u0010$\u001a\u0004\bD\u0010ER\"\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010+\u0012\u0004\bH\u0010$\u001a\u0004\bG\u0010-R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00105\u0012\u0004\bJ\u0010$\u001a\u0004\bI\u00107R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010K\u0012\u0004\bN\u0010$\u001a\u0004\bL\u0010MR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010O\u0012\u0004\bQ\u0010$\u001a\u0004\b\u0019\u0010PR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010R\u0012\u0004\bU\u0010$\u001a\u0004\bS\u0010T¨\u0006V"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Metadata;", "Lcom/squareup/cash/work/tinygraph/models/IBaseEntity;", "", "id", "", "createdAt", "updatedAt", "Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "fromReference", "toReference", "Lcom/squareup/cash/work/tinygraph/models/OnSiteStatus;", "onSiteStatus", "conversationCutOff", "lastAcceptedOptInPolicyId", "Lcom/squareup/cash/work/tinygraph/models/OrganizationProfile;", "profile", "Lcom/squareup/cash/work/tinygraph/models/Suspension;", "suspension", "Lcom/squareup/cash/work/tinygraph/models/WorkingStatus;", "workingStatus", "activeJobExperienceId", "nextGoldStarGrantDate", "Lcom/squareup/cash/work/tinygraph/models/ExtendedAttributes;", "extendedAttributes", "", "isOwner", "Lcom/squareup/cash/work/tinygraph/models/MetadataProperties;", "properties", "<init>", "(Ljava/lang/String;JJLcom/squareup/cash/work/tinygraph/models/EntityReference;Lcom/squareup/cash/work/tinygraph/models/EntityReference;Lcom/squareup/cash/work/tinygraph/models/OnSiteStatus;Ljava/lang/Long;Ljava/lang/String;Lcom/squareup/cash/work/tinygraph/models/OrganizationProfile;Lcom/squareup/cash/work/tinygraph/models/Suspension;Lcom/squareup/cash/work/tinygraph/models/WorkingStatus;Lcom/squareup/cash/work/tinygraph/models/EntityReference;Ljava/lang/Long;Lcom/squareup/cash/work/tinygraph/models/ExtendedAttributes;Ljava/lang/Boolean;Lcom/squareup/cash/work/tinygraph/models/MetadataProperties;)V", "copy", "(Ljava/lang/String;JJLcom/squareup/cash/work/tinygraph/models/EntityReference;Lcom/squareup/cash/work/tinygraph/models/EntityReference;Lcom/squareup/cash/work/tinygraph/models/OnSiteStatus;Ljava/lang/Long;Ljava/lang/String;Lcom/squareup/cash/work/tinygraph/models/OrganizationProfile;Lcom/squareup/cash/work/tinygraph/models/Suspension;Lcom/squareup/cash/work/tinygraph/models/WorkingStatus;Lcom/squareup/cash/work/tinygraph/models/EntityReference;Ljava/lang/Long;Lcom/squareup/cash/work/tinygraph/models/ExtendedAttributes;Ljava/lang/Boolean;Lcom/squareup/cash/work/tinygraph/models/MetadataProperties;)Lcom/squareup/cash/work/tinygraph/models/Metadata;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "J", "getCreatedAt", "()J", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "getFromReference", "()Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "getFromReference$annotations", "getToReference", "getToReference$annotations", "Lcom/squareup/cash/work/tinygraph/models/OnSiteStatus;", "getOnSiteStatus", "()Lcom/squareup/cash/work/tinygraph/models/OnSiteStatus;", "getOnSiteStatus$annotations", "Ljava/lang/Long;", "getConversationCutOff", "()Ljava/lang/Long;", "getConversationCutOff$annotations", "getLastAcceptedOptInPolicyId", "getLastAcceptedOptInPolicyId$annotations", "Lcom/squareup/cash/work/tinygraph/models/OrganizationProfile;", "getProfile", "()Lcom/squareup/cash/work/tinygraph/models/OrganizationProfile;", "getProfile$annotations", "Lcom/squareup/cash/work/tinygraph/models/Suspension;", "getSuspension", "()Lcom/squareup/cash/work/tinygraph/models/Suspension;", "getSuspension$annotations", "Lcom/squareup/cash/work/tinygraph/models/WorkingStatus;", "getWorkingStatus", "()Lcom/squareup/cash/work/tinygraph/models/WorkingStatus;", "getWorkingStatus$annotations", "getActiveJobExperienceId", "getActiveJobExperienceId$annotations", "getNextGoldStarGrantDate", "getNextGoldStarGrantDate$annotations", "Lcom/squareup/cash/work/tinygraph/models/ExtendedAttributes;", "getExtendedAttributes", "()Lcom/squareup/cash/work/tinygraph/models/ExtendedAttributes;", "getExtendedAttributes$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isOwner$annotations", "Lcom/squareup/cash/work/tinygraph/models/MetadataProperties;", "getProperties", "()Lcom/squareup/cash/work/tinygraph/models/MetadataProperties;", "getProperties$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Metadata implements IBaseEntity {
    public final EntityReference activeJobExperienceId;
    public final Long conversationCutOff;
    public final long createdAt;
    public final ExtendedAttributes extendedAttributes;
    public final EntityReference fromReference;
    public final String id;
    public final Boolean isOwner;
    public final String lastAcceptedOptInPolicyId;
    public final Long nextGoldStarGrantDate;
    public final OnSiteStatus onSiteStatus;
    public final OrganizationProfile profile;
    public final MetadataProperties properties;
    public final Suspension suspension;
    public final EntityReference toReference;
    public final long updatedAt;
    public final WorkingStatus workingStatus;

    public /* synthetic */ Metadata(String str, long j, long j2, EntityReference entityReference, EntityReference entityReference2, OnSiteStatus onSiteStatus, Long l, String str2, OrganizationProfile organizationProfile, Suspension suspension, WorkingStatus workingStatus, EntityReference entityReference3, Long l2, ExtendedAttributes extendedAttributes, Boolean bool, MetadataProperties metadataProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, entityReference, entityReference2, (i & 32) != 0 ? null : onSiteStatus, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : organizationProfile, (i & 512) != 0 ? null : suspension, (i & 1024) != 0 ? null : workingStatus, (i & 2048) != 0 ? null : entityReference3, (i & 4096) != 0 ? null : l2, (i & PKIFailureInfo.certRevoked) != 0 ? null : extendedAttributes, (i & 16384) != 0 ? null : bool, (i & 32768) != 0 ? null : metadataProperties);
    }

    @Json(name = "activeJobExperienceId")
    public static /* synthetic */ void getActiveJobExperienceId$annotations() {
    }

    @Json(name = "conversationCutOff")
    public static /* synthetic */ void getConversationCutOff$annotations() {
    }

    @Json(name = "createdAt")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @Json(name = "extendedAttributes")
    public static /* synthetic */ void getExtendedAttributes$annotations() {
    }

    @Json(name = "fromId")
    public static /* synthetic */ void getFromReference$annotations() {
    }

    @Json(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @Json(name = "lastAcceptedOptInPolicyId")
    public static /* synthetic */ void getLastAcceptedOptInPolicyId$annotations() {
    }

    @Json(name = "nextGoldStarGrantDate")
    public static /* synthetic */ void getNextGoldStarGrantDate$annotations() {
    }

    @Json(name = "onSiteStatus")
    public static /* synthetic */ void getOnSiteStatus$annotations() {
    }

    @Json(name = "profile")
    public static /* synthetic */ void getProfile$annotations() {
    }

    @Json(name = "properties")
    public static /* synthetic */ void getProperties$annotations() {
    }

    @Json(name = "suspension")
    public static /* synthetic */ void getSuspension$annotations() {
    }

    @Json(name = "toId")
    public static /* synthetic */ void getToReference$annotations() {
    }

    @Json(name = "updatedAt")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @Json(name = "workingStatus")
    public static /* synthetic */ void getWorkingStatus$annotations() {
    }

    @Json(name = "isOwner")
    public static /* synthetic */ void isOwner$annotations() {
    }

    public final Metadata copy(@Json(name = "id") String id, @Json(name = "createdAt") long createdAt, @Json(name = "updatedAt") long updatedAt, @Json(name = "fromId") EntityReference fromReference, @Json(name = "toId") EntityReference toReference, @Json(name = "onSiteStatus") OnSiteStatus onSiteStatus, @Json(name = "conversationCutOff") Long conversationCutOff, @Json(name = "lastAcceptedOptInPolicyId") String lastAcceptedOptInPolicyId, @Json(name = "profile") OrganizationProfile profile, @Json(name = "suspension") Suspension suspension, @Json(name = "workingStatus") WorkingStatus workingStatus, @Json(name = "activeJobExperienceId") EntityReference activeJobExperienceId, @Json(name = "nextGoldStarGrantDate") Long nextGoldStarGrantDate, @Json(name = "extendedAttributes") ExtendedAttributes extendedAttributes, @Json(name = "isOwner") Boolean isOwner, @Json(name = "properties") MetadataProperties properties) {
        id.getClass();
        fromReference.getClass();
        toReference.getClass();
        return new Metadata(id, createdAt, updatedAt, fromReference, toReference, onSiteStatus, conversationCutOff, lastAcceptedOptInPolicyId, profile, suspension, workingStatus, activeJobExperienceId, nextGoldStarGrantDate, extendedAttributes, isOwner, properties);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Intrinsics.areEqual(this.id, metadata.id) && this.createdAt == metadata.createdAt && this.updatedAt == metadata.updatedAt && Intrinsics.areEqual(this.fromReference, metadata.fromReference) && Intrinsics.areEqual(this.toReference, metadata.toReference) && this.onSiteStatus == metadata.onSiteStatus && Intrinsics.areEqual(this.conversationCutOff, metadata.conversationCutOff) && Intrinsics.areEqual(this.lastAcceptedOptInPolicyId, metadata.lastAcceptedOptInPolicyId) && Intrinsics.areEqual(this.profile, metadata.profile) && Intrinsics.areEqual(this.suspension, metadata.suspension) && this.workingStatus == metadata.workingStatus && Intrinsics.areEqual(this.activeJobExperienceId, metadata.activeJobExperienceId) && Intrinsics.areEqual(this.nextGoldStarGrantDate, metadata.nextGoldStarGrantDate) && Intrinsics.areEqual(this.extendedAttributes, metadata.extendedAttributes) && Intrinsics.areEqual(this.isOwner, metadata.isOwner) && Intrinsics.areEqual(this.properties, metadata.properties);
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
        OnSiteStatus onSiteStatus = this.onSiteStatus;
        int hashCode2 = (hashCode + (onSiteStatus == null ? 0 : onSiteStatus.hashCode())) * 31;
        Long l = this.conversationCutOff;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.lastAcceptedOptInPolicyId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        OrganizationProfile organizationProfile = this.profile;
        int hashCode5 = (hashCode4 + (organizationProfile == null ? 0 : organizationProfile.hashCode())) * 31;
        Suspension suspension = this.suspension;
        int hashCode6 = (hashCode5 + (suspension == null ? 0 : suspension.hashCode())) * 31;
        WorkingStatus workingStatus = this.workingStatus;
        int hashCode7 = (hashCode6 + (workingStatus == null ? 0 : workingStatus.hashCode())) * 31;
        EntityReference entityReference = this.activeJobExperienceId;
        int hashCode8 = (hashCode7 + (entityReference == null ? 0 : entityReference.hashCode())) * 31;
        Long l2 = this.nextGoldStarGrantDate;
        int hashCode9 = (hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        ExtendedAttributes extendedAttributes = this.extendedAttributes;
        int hashCode10 = (hashCode9 + (extendedAttributes == null ? 0 : extendedAttributes.hashCode())) * 31;
        Boolean bool = this.isOwner;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        MetadataProperties metadataProperties = this.properties;
        return hashCode11 + (metadataProperties != null ? metadataProperties.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Metadata(id=", this.id, ", createdAt=", this.createdAt);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.updatedAt, ", updatedAt=", ", fromReference=", m);
        m.append(this.fromReference);
        m.append(", toReference=");
        m.append(this.toReference);
        m.append(", onSiteStatus=");
        m.append(this.onSiteStatus);
        m.append(", conversationCutOff=");
        m.append(this.conversationCutOff);
        m.append(", lastAcceptedOptInPolicyId=");
        m.append(this.lastAcceptedOptInPolicyId);
        m.append(", profile=");
        m.append(this.profile);
        m.append(", suspension=");
        m.append(this.suspension);
        m.append(", workingStatus=");
        m.append(this.workingStatus);
        m.append(", activeJobExperienceId=");
        m.append(this.activeJobExperienceId);
        m.append(", nextGoldStarGrantDate=");
        m.append(this.nextGoldStarGrantDate);
        m.append(", extendedAttributes=");
        m.append(this.extendedAttributes);
        m.append(", isOwner=");
        m.append(this.isOwner);
        m.append(", properties=");
        m.append(this.properties);
        m.append(")");
        return m.toString();
    }

    public Metadata(@Json(name = "id") String str, @Json(name = "createdAt") long j, @Json(name = "updatedAt") long j2, @Json(name = "fromId") EntityReference entityReference, @Json(name = "toId") EntityReference entityReference2, @Json(name = "onSiteStatus") OnSiteStatus onSiteStatus, @Json(name = "conversationCutOff") Long l, @Json(name = "lastAcceptedOptInPolicyId") String str2, @Json(name = "profile") OrganizationProfile organizationProfile, @Json(name = "suspension") Suspension suspension, @Json(name = "workingStatus") WorkingStatus workingStatus, @Json(name = "activeJobExperienceId") EntityReference entityReference3, @Json(name = "nextGoldStarGrantDate") Long l2, @Json(name = "extendedAttributes") ExtendedAttributes extendedAttributes, @Json(name = "isOwner") Boolean bool, @Json(name = "properties") MetadataProperties metadataProperties) {
        str.getClass();
        entityReference.getClass();
        entityReference2.getClass();
        this.id = str;
        this.createdAt = j;
        this.updatedAt = j2;
        this.fromReference = entityReference;
        this.toReference = entityReference2;
        this.onSiteStatus = onSiteStatus;
        this.conversationCutOff = l;
        this.lastAcceptedOptInPolicyId = str2;
        this.profile = organizationProfile;
        this.suspension = suspension;
        this.workingStatus = workingStatus;
        this.activeJobExperienceId = entityReference3;
        this.nextGoldStarGrantDate = l2;
        this.extendedAttributes = extendedAttributes;
        this.isOwner = bool;
        this.properties = metadataProperties;
    }
}
