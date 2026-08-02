package com.squareup.cash.work.tinygraph.models;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJp\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u0012\u0004\b \u0010\u0016\u001a\u0004\b\u001f\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b!\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010#\u0012\u0004\b&\u0010\u0016\u001a\u0004\b$\u0010%R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010#\u0012\u0004\b(\u0010\u0016\u001a\u0004\b'\u0010%R\"\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010#\u0012\u0004\b*\u0010\u0016\u001a\u0004\b)\u0010%¨\u0006+"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MetadataProperties;", "", "Lcom/squareup/cash/work/tinygraph/models/MetadataCommunications;", "communications", "Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;", "unreadCounts", "Lcom/squareup/cash/work/tinygraph/models/LastSentActivity;", "lastSentActivity", "lastReadActivity", "lastVisibleMessageReadActivity", "", "muteEndTime", "conversationCutOff", "earliestVisibleMessageCreatedAt", "<init>", "(Lcom/squareup/cash/work/tinygraph/models/MetadataCommunications;Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;Lcom/squareup/cash/work/tinygraph/models/LastSentActivity;Lcom/squareup/cash/work/tinygraph/models/LastSentActivity;Lcom/squareup/cash/work/tinygraph/models/LastSentActivity;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "copy", "(Lcom/squareup/cash/work/tinygraph/models/MetadataCommunications;Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;Lcom/squareup/cash/work/tinygraph/models/LastSentActivity;Lcom/squareup/cash/work/tinygraph/models/LastSentActivity;Lcom/squareup/cash/work/tinygraph/models/LastSentActivity;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/squareup/cash/work/tinygraph/models/MetadataProperties;", "Lcom/squareup/cash/work/tinygraph/models/MetadataCommunications;", "getCommunications", "()Lcom/squareup/cash/work/tinygraph/models/MetadataCommunications;", "getCommunications$annotations", "()V", "Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;", "getUnreadCounts", "()Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;", "getUnreadCounts$annotations", "Lcom/squareup/cash/work/tinygraph/models/LastSentActivity;", "getLastSentActivity", "()Lcom/squareup/cash/work/tinygraph/models/LastSentActivity;", "getLastSentActivity$annotations", "getLastReadActivity", "getLastReadActivity$annotations", "getLastVisibleMessageReadActivity", "getLastVisibleMessageReadActivity$annotations", "Ljava/lang/Long;", "getMuteEndTime", "()Ljava/lang/Long;", "getMuteEndTime$annotations", "getConversationCutOff", "getConversationCutOff$annotations", "getEarliestVisibleMessageCreatedAt", "getEarliestVisibleMessageCreatedAt$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MetadataProperties {
    public final MetadataCommunications communications;
    public final Long conversationCutOff;
    public final Long earliestVisibleMessageCreatedAt;
    public final LastSentActivity lastReadActivity;
    public final LastSentActivity lastSentActivity;
    public final LastSentActivity lastVisibleMessageReadActivity;
    public final Long muteEndTime;
    public final MetadataUnreadCounts unreadCounts;

    public /* synthetic */ MetadataProperties(MetadataCommunications metadataCommunications, MetadataUnreadCounts metadataUnreadCounts, LastSentActivity lastSentActivity, LastSentActivity lastSentActivity2, LastSentActivity lastSentActivity3, Long l, Long l2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : metadataCommunications, (i & 2) != 0 ? null : metadataUnreadCounts, (i & 4) != 0 ? null : lastSentActivity, (i & 8) != 0 ? null : lastSentActivity2, (i & 16) != 0 ? null : lastSentActivity3, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : l3);
    }

    @Json(name = "communications")
    public static /* synthetic */ void getCommunications$annotations() {
    }

    @Json(name = "conversationCutOff")
    public static /* synthetic */ void getConversationCutOff$annotations() {
    }

    @Json(name = "earliestVisibleMessageCreatedAt")
    public static /* synthetic */ void getEarliestVisibleMessageCreatedAt$annotations() {
    }

    @Json(name = "lastReadActivity")
    public static /* synthetic */ void getLastReadActivity$annotations() {
    }

    @Json(name = "lastSentActivity")
    public static /* synthetic */ void getLastSentActivity$annotations() {
    }

    @Json(name = "lastVisibleMessageReadActivity")
    public static /* synthetic */ void getLastVisibleMessageReadActivity$annotations() {
    }

    @Json(name = "muteEndTime")
    public static /* synthetic */ void getMuteEndTime$annotations() {
    }

    @Json(name = "unreadCounts")
    public static /* synthetic */ void getUnreadCounts$annotations() {
    }

    public final MetadataProperties copy(@Json(name = "communications") MetadataCommunications communications, @Json(name = "unreadCounts") MetadataUnreadCounts unreadCounts, @Json(name = "lastSentActivity") LastSentActivity lastSentActivity, @Json(name = "lastReadActivity") LastSentActivity lastReadActivity, @Json(name = "lastVisibleMessageReadActivity") LastSentActivity lastVisibleMessageReadActivity, @Json(name = "muteEndTime") Long muteEndTime, @Json(name = "conversationCutOff") Long conversationCutOff, @Json(name = "earliestVisibleMessageCreatedAt") Long earliestVisibleMessageCreatedAt) {
        return new MetadataProperties(communications, unreadCounts, lastSentActivity, lastReadActivity, lastVisibleMessageReadActivity, muteEndTime, conversationCutOff, earliestVisibleMessageCreatedAt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataProperties)) {
            return false;
        }
        MetadataProperties metadataProperties = (MetadataProperties) obj;
        return Intrinsics.areEqual(this.communications, metadataProperties.communications) && Intrinsics.areEqual(this.unreadCounts, metadataProperties.unreadCounts) && Intrinsics.areEqual(this.lastSentActivity, metadataProperties.lastSentActivity) && Intrinsics.areEqual(this.lastReadActivity, metadataProperties.lastReadActivity) && Intrinsics.areEqual(this.lastVisibleMessageReadActivity, metadataProperties.lastVisibleMessageReadActivity) && Intrinsics.areEqual(this.muteEndTime, metadataProperties.muteEndTime) && Intrinsics.areEqual(this.conversationCutOff, metadataProperties.conversationCutOff) && Intrinsics.areEqual(this.earliestVisibleMessageCreatedAt, metadataProperties.earliestVisibleMessageCreatedAt);
    }

    public final int hashCode() {
        MetadataCommunications metadataCommunications = this.communications;
        int hashCode = (metadataCommunications == null ? 0 : metadataCommunications.hashCode()) * 31;
        MetadataUnreadCounts metadataUnreadCounts = this.unreadCounts;
        int hashCode2 = (hashCode + (metadataUnreadCounts == null ? 0 : metadataUnreadCounts.hashCode())) * 31;
        LastSentActivity lastSentActivity = this.lastSentActivity;
        int hashCode3 = (hashCode2 + (lastSentActivity == null ? 0 : lastSentActivity.hashCode())) * 31;
        LastSentActivity lastSentActivity2 = this.lastReadActivity;
        int hashCode4 = (hashCode3 + (lastSentActivity2 == null ? 0 : lastSentActivity2.hashCode())) * 31;
        LastSentActivity lastSentActivity3 = this.lastVisibleMessageReadActivity;
        int hashCode5 = (hashCode4 + (lastSentActivity3 == null ? 0 : lastSentActivity3.hashCode())) * 31;
        Long l = this.muteEndTime;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.conversationCutOff;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.earliestVisibleMessageCreatedAt;
        return hashCode7 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "MetadataProperties(communications=" + this.communications + ", unreadCounts=" + this.unreadCounts + ", lastSentActivity=" + this.lastSentActivity + ", lastReadActivity=" + this.lastReadActivity + ", lastVisibleMessageReadActivity=" + this.lastVisibleMessageReadActivity + ", muteEndTime=" + this.muteEndTime + ", conversationCutOff=" + this.conversationCutOff + ", earliestVisibleMessageCreatedAt=" + this.earliestVisibleMessageCreatedAt + ")";
    }

    public MetadataProperties(@Json(name = "communications") MetadataCommunications metadataCommunications, @Json(name = "unreadCounts") MetadataUnreadCounts metadataUnreadCounts, @Json(name = "lastSentActivity") LastSentActivity lastSentActivity, @Json(name = "lastReadActivity") LastSentActivity lastSentActivity2, @Json(name = "lastVisibleMessageReadActivity") LastSentActivity lastSentActivity3, @Json(name = "muteEndTime") Long l, @Json(name = "conversationCutOff") Long l2, @Json(name = "earliestVisibleMessageCreatedAt") Long l3) {
        this.communications = metadataCommunications;
        this.unreadCounts = metadataUnreadCounts;
        this.lastSentActivity = lastSentActivity;
        this.lastReadActivity = lastSentActivity2;
        this.lastVisibleMessageReadActivity = lastSentActivity3;
        this.muteEndTime = l;
        this.conversationCutOff = l2;
        this.earliestVisibleMessageCreatedAt = l3;
    }
}
