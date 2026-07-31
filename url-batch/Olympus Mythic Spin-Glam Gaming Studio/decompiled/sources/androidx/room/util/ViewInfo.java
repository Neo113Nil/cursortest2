package androidx.room.util;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/room/util/ViewInfo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "sql", "Companion", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes4.dex */
public final class ViewInfo {
    public final String name;
    public final String sql;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) other;
        if (Intrinsics.areEqual(this.name, viewInfo.name)) {
            String str = this.sql;
            String str2 = viewInfo.sql;
            if (str != null ? Intrinsics.areEqual(str, str2) : str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.sql;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ViewInfo{name='" + this.name + "', sql='" + this.sql + "'}";
    }
}
