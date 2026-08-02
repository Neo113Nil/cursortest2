package R1;

import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f2329a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2330b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2331c;

    public c(long j4, long j5, Set set) {
        this.f2329a = j4;
        this.f2330b = j5;
        this.f2331c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f2329a == cVar.f2329a && this.f2330b == cVar.f2330b && this.f2331c.equals(cVar.f2331c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f2329a;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j5 = this.f2330b;
        return ((i4 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f2331c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f2329a + ", maxAllowedDelay=" + this.f2330b + ", flags=" + this.f2331c + "}";
    }
}
