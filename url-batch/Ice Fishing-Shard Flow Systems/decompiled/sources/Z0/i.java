package Z0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2983a;

    public i(ArrayList arrayList) {
        this.f2983a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f2983a.equals(((i) ((o) obj)).f2983a);
    }

    public final int hashCode() {
        return this.f2983a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f2983a + "}";
    }
}
