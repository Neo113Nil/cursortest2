package q6;

import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f8029a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8030b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f8031c;

    public b(long j, long j3, Set set) {
        this.f8029a = j;
        this.f8030b = j3;
        this.f8031c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f8029a == bVar.f8029a && this.f8030b == bVar.f8030b && this.f8031c.equals(bVar.f8031c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f8029a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.f8030b;
        return ((i3 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f8031c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f8029a + ", maxAllowedDelay=" + this.f8030b + ", flags=" + this.f8031c + "}";
    }
}
