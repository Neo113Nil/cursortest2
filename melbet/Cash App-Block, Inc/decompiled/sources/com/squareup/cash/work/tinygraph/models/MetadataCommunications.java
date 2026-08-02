package com.squareup.cash.work.tinygraph.models;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u0012\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0010\u0010\rR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MetadataCommunications;", "", "Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;", "unmutedUnreadCounts", "unreadCounts", "", "teamFilesLastResetAt", "<init>", "(Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;Ljava/lang/Long;)V", "copy", "(Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;Ljava/lang/Long;)Lcom/squareup/cash/work/tinygraph/models/MetadataCommunications;", "Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;", "getUnmutedUnreadCounts", "()Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;", "getUnmutedUnreadCounts$annotations", "()V", "getUnreadCounts", "getUnreadCounts$annotations", "Ljava/lang/Long;", "getTeamFilesLastResetAt", "()Ljava/lang/Long;", "getTeamFilesLastResetAt$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MetadataCommunications {
    public final Long teamFilesLastResetAt;
    public final MetadataUnreadCounts unmutedUnreadCounts;
    public final MetadataUnreadCounts unreadCounts;

    public /* synthetic */ MetadataCommunications(MetadataUnreadCounts metadataUnreadCounts, MetadataUnreadCounts metadataUnreadCounts2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : metadataUnreadCounts, (i & 2) != 0 ? null : metadataUnreadCounts2, (i & 4) != 0 ? null : l);
    }

    @Json(name = "teamFilesLastResetAt")
    public static /* synthetic */ void getTeamFilesLastResetAt$annotations() {
    }

    @Json(name = "unmutedUnreadCounts")
    public static /* synthetic */ void getUnmutedUnreadCounts$annotations() {
    }

    @Json(name = "unreadCounts")
    public static /* synthetic */ void getUnreadCounts$annotations() {
    }

    public final MetadataCommunications copy(@Json(name = "unmutedUnreadCounts") MetadataUnreadCounts unmutedUnreadCounts, @Json(name = "unreadCounts") MetadataUnreadCounts unreadCounts, @Json(name = "teamFilesLastResetAt") Long teamFilesLastResetAt) {
        return new MetadataCommunications(unmutedUnreadCounts, unreadCounts, teamFilesLastResetAt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataCommunications)) {
            return false;
        }
        MetadataCommunications metadataCommunications = (MetadataCommunications) obj;
        return Intrinsics.areEqual(this.unmutedUnreadCounts, metadataCommunications.unmutedUnreadCounts) && Intrinsics.areEqual(this.unreadCounts, metadataCommunications.unreadCounts) && Intrinsics.areEqual(this.teamFilesLastResetAt, metadataCommunications.teamFilesLastResetAt);
    }

    public final int hashCode() {
        MetadataUnreadCounts metadataUnreadCounts = this.unmutedUnreadCounts;
        int hashCode = (metadataUnreadCounts == null ? 0 : metadataUnreadCounts.hashCode()) * 31;
        MetadataUnreadCounts metadataUnreadCounts2 = this.unreadCounts;
        int hashCode2 = (hashCode + (metadataUnreadCounts2 == null ? 0 : metadataUnreadCounts2.hashCode())) * 31;
        Long l = this.teamFilesLastResetAt;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetadataCommunications(unmutedUnreadCounts=");
        sb.append(this.unmutedUnreadCounts);
        sb.append(", unreadCounts=");
        sb.append(this.unreadCounts);
        sb.append(", teamFilesLastResetAt=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.teamFilesLastResetAt, ")");
    }

    public MetadataCommunications(@Json(name = "unmutedUnreadCounts") MetadataUnreadCounts metadataUnreadCounts, @Json(name = "unreadCounts") MetadataUnreadCounts metadataUnreadCounts2, @Json(name = "teamFilesLastResetAt") Long l) {
        this.unmutedUnreadCounts = metadataUnreadCounts;
        this.unreadCounts = metadataUnreadCounts2;
        this.teamFilesLastResetAt = l;
    }
}
