package g1;

import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f4975a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4976b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f4977c;

    public b(long j, long j7, Set set) {
        this.f4975a = j;
        this.f4976b = j7;
        this.f4977c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f4975a == bVar.f4975a && this.f4976b == bVar.f4976b && this.f4977c.equals(bVar.f4977c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4975a;
        int i2 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j7 = this.f4976b;
        return ((i2 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f4977c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f4975a + ", maxAllowedDelay=" + this.f4976b + ", flags=" + this.f4977c + "}";
    }
}
