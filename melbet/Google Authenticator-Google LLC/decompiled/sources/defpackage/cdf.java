package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdf extends cdo {
    private final List a;

    public cdf(List list) {
        this.a = list;
    }

    @Override // defpackage.cdo
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdo) {
            return this.a.equals(((cdo) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a.toString() + "}";
    }
}
