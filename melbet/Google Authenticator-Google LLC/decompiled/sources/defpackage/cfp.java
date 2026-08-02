package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfp {
    public final long a;
    public final long b;
    public final Set c;

    public cfp(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public static cfo a() {
        cfo cfoVar = new cfo();
        cfoVar.c(Collections.EMPTY_SET);
        return cfoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cfp) {
            cfp cfpVar = (cfp) obj;
            if (this.a == cfpVar.a && this.b == cfpVar.b && this.c.equals(cfpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (int) this.a;
        Set set = this.c;
        return set.hashCode() ^ ((((i ^ 1000003) * 1000003) ^ ((int) this.b)) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + String.valueOf(this.c) + "}";
    }

    public cfp() {
        throw null;
    }
}
