package K1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1501a;

    public i(ArrayList arrayList) {
        this.f1501a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f1501a.equals(((i) ((o) obj)).f1501a);
    }

    public final int hashCode() {
        return this.f1501a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f1501a + "}";
    }
}
