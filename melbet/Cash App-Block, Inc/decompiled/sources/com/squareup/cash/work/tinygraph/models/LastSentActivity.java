package com.squareup.cash.work.tinygraph.models;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u000b\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/LastSentActivity;", "", "", "messageCreatedAt", "", "messageId", "occurredAt", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)Lcom/squareup/cash/work/tinygraph/models/LastSentActivity;", "Ljava/lang/Long;", "getMessageCreatedAt", "()Ljava/lang/Long;", "getMessageCreatedAt$annotations", "()V", "Ljava/lang/String;", "getMessageId", "()Ljava/lang/String;", "getMessageId$annotations", "getOccurredAt", "getOccurredAt$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LastSentActivity {
    public final Long messageCreatedAt;
    public final String messageId;
    public final Long occurredAt;

    public /* synthetic */ LastSentActivity(Long l, String str, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l2);
    }

    @Json(name = "messageCreatedAt")
    public static /* synthetic */ void getMessageCreatedAt$annotations() {
    }

    @Json(name = "messageId")
    public static /* synthetic */ void getMessageId$annotations() {
    }

    @Json(name = "occurredAt")
    public static /* synthetic */ void getOccurredAt$annotations() {
    }

    public final LastSentActivity copy(@Json(name = "messageCreatedAt") Long messageCreatedAt, @Json(name = "messageId") String messageId, @Json(name = "occurredAt") Long occurredAt) {
        return new LastSentActivity(messageCreatedAt, messageId, occurredAt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastSentActivity)) {
            return false;
        }
        LastSentActivity lastSentActivity = (LastSentActivity) obj;
        return Intrinsics.areEqual(this.messageCreatedAt, lastSentActivity.messageCreatedAt) && Intrinsics.areEqual(this.messageId, lastSentActivity.messageId) && Intrinsics.areEqual(this.occurredAt, lastSentActivity.occurredAt);
    }

    public final int hashCode() {
        Long l = this.messageCreatedAt;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.messageId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.occurredAt;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastSentActivity(messageCreatedAt=");
        sb.append(this.messageCreatedAt);
        sb.append(", messageId=");
        sb.append(this.messageId);
        sb.append(", occurredAt=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.occurredAt, ")");
    }

    public LastSentActivity(@Json(name = "messageCreatedAt") Long l, @Json(name = "messageId") String str, @Json(name = "occurredAt") Long l2) {
        this.messageCreatedAt = l;
        this.messageId = str;
        this.occurredAt = l2;
    }
}
