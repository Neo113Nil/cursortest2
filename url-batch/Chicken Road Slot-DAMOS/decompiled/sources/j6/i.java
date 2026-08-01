package j6;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5079a;

    public i(ArrayList arrayList) {
        this.f5079a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f5079a.equals(((i) ((o) obj)).f5079a);
    }

    public final int hashCode() {
        return this.f5079a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f5079a + "}";
    }
}
