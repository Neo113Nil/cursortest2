package com.squareup.cash.work.tinygraph.models;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u0012\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0010\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u000b\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;", "", "", "announcements", "conversations", "mentions", "messages", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;", "Ljava/lang/Integer;", "getAnnouncements", "()Ljava/lang/Integer;", "getAnnouncements$annotations", "()V", "getConversations", "getConversations$annotations", "getMentions", "getMentions$annotations", "getMessages", "getMessages$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MetadataUnreadCounts {
    public final Integer announcements;
    public final Integer conversations;
    public final Integer mentions;
    public final Integer messages;

    public /* synthetic */ MetadataUnreadCounts(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }

    @Json(name = "announcements")
    public static /* synthetic */ void getAnnouncements$annotations() {
    }

    @Json(name = "conversations")
    public static /* synthetic */ void getConversations$annotations() {
    }

    @Json(name = "mentions")
    public static /* synthetic */ void getMentions$annotations() {
    }

    @Json(name = "messages")
    public static /* synthetic */ void getMessages$annotations() {
    }

    public final MetadataUnreadCounts copy(@Json(name = "announcements") Integer announcements, @Json(name = "conversations") Integer conversations, @Json(name = "mentions") Integer mentions, @Json(name = "messages") Integer messages) {
        return new MetadataUnreadCounts(announcements, conversations, mentions, messages);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataUnreadCounts)) {
            return false;
        }
        MetadataUnreadCounts metadataUnreadCounts = (MetadataUnreadCounts) obj;
        return Intrinsics.areEqual(this.announcements, metadataUnreadCounts.announcements) && Intrinsics.areEqual(this.conversations, metadataUnreadCounts.conversations) && Intrinsics.areEqual(this.mentions, metadataUnreadCounts.mentions) && Intrinsics.areEqual(this.messages, metadataUnreadCounts.messages);
    }

    public final int hashCode() {
        Integer num = this.announcements;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.conversations;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.mentions;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.messages;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "MetadataUnreadCounts(announcements=" + this.announcements + ", conversations=" + this.conversations + ", mentions=" + this.mentions + ", messages=" + this.messages + ")";
    }

    public MetadataUnreadCounts(@Json(name = "announcements") Integer num, @Json(name = "conversations") Integer num2, @Json(name = "mentions") Integer num3, @Json(name = "messages") Integer num4) {
        this.announcements = num;
        this.conversations = num2;
        this.mentions = num3;
        this.messages = num4;
    }
}
