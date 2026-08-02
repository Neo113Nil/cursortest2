package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gby {
    public final long a;
    public final TimeUnit b;

    public gby(long j, TimeUnit timeUnit) {
        this.a = j;
        if (timeUnit == null) {
            throw new NullPointerException("Null timeUnit");
        }
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gby) {
            gby gbyVar = (gby) obj;
            if (this.a == gbyVar.a && this.b.equals(gbyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "TimeUnitPair{duration=" + this.a + ", timeUnit=" + this.b.toString() + "}";
    }

    public gby() {
        throw null;
    }
}
