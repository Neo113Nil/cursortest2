package f2;

import java.util.Set;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4499b {

    /* renamed from: a, reason: collision with root package name */
    public final long f37663a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37664b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f37665c;

    public C4499b(long j9, long j10, Set set) {
        this.f37663a = j9;
        this.f37664b = j10;
        this.f37665c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4499b) {
            C4499b c4499b = (C4499b) obj;
            if (this.f37663a == c4499b.f37663a && this.f37664b == c4499b.f37664b && this.f37665c.equals(c4499b.f37665c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f37663a;
        int i = (((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f37664b;
        return ((i ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f37665c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f37663a + ", maxAllowedDelay=" + this.f37664b + ", flags=" + this.f37665c + "}";
    }
}
