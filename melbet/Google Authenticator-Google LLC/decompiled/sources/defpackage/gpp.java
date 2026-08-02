package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpp {
    public final long a;
    public final long b;
    public final Map c;
    public final boolean d;

    public gpp(long j, long j2, Map map, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = map;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpp) {
            gpp gppVar = (gpp) obj;
            if (this.a == gppVar.a && this.b == gppVar.b && hnu.B(this.c, gppVar.c) && this.d == gppVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return (true != this.d ? 1237 : 1231) ^ ((((((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SyncConfig{minSyncInterval=" + this.a + ", timeout=" + this.b + ", constraints=" + this.c.toString() + ", allowMultiprocess=" + this.d + "}";
    }

    public gpp() {
        throw null;
    }
}
