package b1;

import java.util.Set;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266c {

    /* renamed from: a, reason: collision with root package name */
    public final long f4764a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4765b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f4766c;

    public C0266c(long j2, long j6, Set set) {
        this.f4764a = j2;
        this.f4765b = j6;
        this.f4766c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0266c)) {
            return false;
        }
        C0266c c0266c = (C0266c) obj;
        return this.f4764a == c0266c.f4764a && this.f4765b == c0266c.f4765b && this.f4766c.equals(c0266c.f4766c);
    }

    public final int hashCode() {
        long j2 = this.f4764a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j6 = this.f4765b;
        return ((i2 ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f4766c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f4764a + ", maxAllowedDelay=" + this.f4765b + ", flags=" + this.f4766c + "}";
    }
}
