package B0;

import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f116a;

    /* renamed from: b, reason: collision with root package name */
    public final long f117b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f118c;

    public c(long j3, long j4, Set set) {
        this.f116a = j3;
        this.f117b = j4;
        this.f118c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f116a == cVar.f116a && this.f117b == cVar.f117b && this.f118c.equals(cVar.f118c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f116a;
        int i3 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        long j4 = this.f117b;
        return ((i3 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f118c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f116a + ", maxAllowedDelay=" + this.f117b + ", flags=" + this.f118c + "}";
    }
}
