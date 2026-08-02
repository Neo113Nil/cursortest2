package com.squareup.cash.work.tinygraph.models;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Suspension;", "", "", "expiresAt", "", "reason", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/squareup/cash/work/tinygraph/models/Suspension;", "Ljava/lang/Long;", "getExpiresAt", "()Ljava/lang/Long;", "getExpiresAt$annotations", "()V", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "getReason$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Suspension {
    public final Long expiresAt;
    public final String reason;

    public /* synthetic */ Suspension(Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str);
    }

    @Json(name = "expiresAt")
    public static /* synthetic */ void getExpiresAt$annotations() {
    }

    @Json(name = "reason")
    public static /* synthetic */ void getReason$annotations() {
    }

    public final Suspension copy(@Json(name = "expiresAt") Long expiresAt, @Json(name = "reason") String reason) {
        return new Suspension(expiresAt, reason);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suspension)) {
            return false;
        }
        Suspension suspension = (Suspension) obj;
        return Intrinsics.areEqual(this.expiresAt, suspension.expiresAt) && Intrinsics.areEqual(this.reason, suspension.reason);
    }

    public final int hashCode() {
        Long l = this.expiresAt;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.reason;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Suspension(expiresAt=" + this.expiresAt + ", reason=" + this.reason + ")";
    }

    public Suspension(@Json(name = "expiresAt") Long l, @Json(name = "reason") String str) {
        this.expiresAt = l;
        this.reason = str;
    }
}
