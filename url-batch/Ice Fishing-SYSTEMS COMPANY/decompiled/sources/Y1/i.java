package Y1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3932a;

    public i(ArrayList arrayList) {
        this.f3932a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f3932a.equals(((i) ((o) obj)).f3932a);
    }

    public final int hashCode() {
        return this.f3932a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f3932a + "}";
    }
}
