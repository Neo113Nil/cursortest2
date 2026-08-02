package com.squareup.preferences.values;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/preferences/values/RecentMoneybotSession;", "", "preferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RecentMoneybotSession {
    public final String sessionId;
    public final Long updatedAtMs;

    public /* synthetic */ RecentMoneybotSession(String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentMoneybotSession)) {
            return false;
        }
        RecentMoneybotSession recentMoneybotSession = (RecentMoneybotSession) obj;
        return Intrinsics.areEqual(this.sessionId, recentMoneybotSession.sessionId) && Intrinsics.areEqual(this.updatedAtMs, recentMoneybotSession.updatedAtMs);
    }

    public final int hashCode() {
        String str = this.sessionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.updatedAtMs;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "RecentMoneybotSession(sessionId=" + this.sessionId + ", updatedAtMs=" + this.updatedAtMs + ")";
    }

    public RecentMoneybotSession(String str, Long l) {
        this.sessionId = str;
        this.updatedAtMs = l;
    }
}
