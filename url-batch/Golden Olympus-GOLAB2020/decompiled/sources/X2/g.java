package X2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
class g implements a {

    /* renamed from: a, reason: collision with root package name */
    protected final BigInteger f9723a;

    g(BigInteger bigInteger) {
        this.f9723a = bigInteger;
    }

    @Override // X2.a
    public int b() {
        return 1;
    }

    @Override // X2.a
    public BigInteger c() {
        return this.f9723a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f9723a.equals(((g) obj).f9723a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9723a.hashCode();
    }
}
