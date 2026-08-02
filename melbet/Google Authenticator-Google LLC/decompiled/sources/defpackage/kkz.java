package defpackage;

import j$.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kkz {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public kkz(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = hfm.n(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kkz)) {
            return false;
        }
        kkz kkzVar = (kkz) obj;
        return this.a == kkzVar.a && this.b == kkzVar.b && this.c == kkzVar.c && Double.compare(this.d, kkzVar.d) == 0 && Objects.equals(this.e, kkzVar.e) && Objects.equals(this.f, kkzVar.f);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.e("maxAttempts", this.a);
        T.f("initialBackoffNanos", this.b);
        T.f("maxBackoffNanos", this.c);
        T.c("backoffMultiplier", String.valueOf(this.d));
        T.b("perAttemptRecvTimeoutNanos", this.e);
        T.b("retryableStatusCodes", this.f);
        return T.toString();
    }
}
