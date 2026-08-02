package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejy {
    public final Level a;
    public final String b;
    public final String c;
    public final long d;

    public ejy(Level level, String str, String str2, long j) {
        this.a = level;
        if (str == null) {
            throw new NullPointerException("Null logFormat");
        }
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejy) {
            ejy ejyVar = (ejy) obj;
            if (this.a.equals(ejyVar.a) && this.b.equals(ejyVar.b) && this.c.equals(ejyVar.c) && this.d == ejyVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) ^ (hashCode * 1000003);
    }

    public final String toString() {
        return "AbseilLogData{logLevel=" + this.a.toString() + ", logFormat=" + this.b + ", fileName=" + this.c + ", threadId=" + this.d + "}";
    }

    public ejy() {
        throw null;
    }
}
