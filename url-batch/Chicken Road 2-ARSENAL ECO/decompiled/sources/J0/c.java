package J0;

import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f1241a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1242b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f1243c;

    public c(long j4, long j7, Set set) {
        this.f1241a = j4;
        this.f1242b = j7;
        this.f1243c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f1241a == cVar.f1241a && this.f1242b == cVar.f1242b && this.f1243c.equals(cVar.f1243c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f1241a;
        int i7 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j7 = this.f1242b;
        return ((i7 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f1243c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f1241a + ", maxAllowedDelay=" + this.f1242b + ", flags=" + this.f1243c + "}";
    }
}
