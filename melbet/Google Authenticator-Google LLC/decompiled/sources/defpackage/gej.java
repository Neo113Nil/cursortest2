package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gej {
    public final gdn a;
    public final long b;
    public final gdv c;
    public final gdz d;
    public final int e;
    public final Instant f;

    public gej(gdn gdnVar, long j, gdv gdvVar, gdz gdzVar, int i, Instant instant) {
        this.a = gdnVar;
        this.b = j;
        this.c = gdvVar;
        this.d = gdzVar;
        this.e = i;
        if (instant == null) {
            throw new NullPointerException("Null epochTimeAtStart");
        }
        this.f = instant;
    }

    public final gej a(gdn gdnVar, Instant instant) {
        long j = this.b;
        hoq.I(j != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        return new gej(gdnVar, j + 1, new gdv(0L), new gdz(0L), 0, instant);
    }

    public final boolean b(gej gejVar) {
        long j = this.b;
        hoq.H(j != Long.MIN_VALUE);
        hoq.H(!equals(gejVar) || this == gejVar);
        long j2 = gejVar.b;
        if (j < j2) {
            return true;
        }
        if (j == j2) {
            if (this.c.a < gejVar.c.a) {
                return true;
            }
            if (this.d.a < gejVar.d.a) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return this.e > 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gej) {
            gej gejVar = (gej) obj;
            if (this.a.equals(gejVar.a) && this.b == gejVar.b && this.c.equals(gejVar.c) && this.d.equals(gejVar.d) && this.e == gejVar.e && this.f.equals(gejVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        int hashCode2 = (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        Instant instant = this.f;
        return ((this.e ^ (hashCode2 * 1000003)) * 1000003) ^ instant.hashCode();
    }

    public final String toString() {
        Instant instant = this.f;
        gdz gdzVar = this.d;
        gdv gdvVar = this.c;
        return "SubscribeSequenceState{dataSource=" + this.a.toString() + ", index=" + this.b + ", fetchTaskIdentifier=" + gdvVar.toString() + ", loadTaskIdentifier=" + gdzVar.toString() + ", loadAttempts=" + this.e + ", epochTimeAtStart=" + instant.toString() + "}";
    }

    public gej() {
        throw null;
    }
}
