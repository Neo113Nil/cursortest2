package H0;

import O3.l;
import T.D;

/* loaded from: classes.dex */
public final class c implements D {

    /* renamed from: a, reason: collision with root package name */
    public final long f1089a;

    public c(long j4) {
        this.f1089a = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.f1089a == ((c) obj).f1089a;
    }

    public final int hashCode() {
        return l.r(this.f1089a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f1089a;
    }
}
