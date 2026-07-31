package androidx.privacysandbox.ads.adservices.appsetid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppSetId.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "", "", "id", "", "scope", "<init>", "(Ljava/lang/String;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getId", "I", "getScope", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppSetId {
    private final String id;
    private final int scope;

    public AppSetId(String id, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.scope = i;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) other;
        return Intrinsics.areEqual(this.id, appSetId.id) && this.scope == appSetId.scope;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + Integer.hashCode(this.scope);
    }

    public String toString() {
        return "AppSetId: id=" + this.id + ", scope=" + (this.scope == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
