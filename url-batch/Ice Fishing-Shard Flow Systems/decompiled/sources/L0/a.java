package L0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1656a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1657b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1658c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1659d;

    public a(boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f1656a = z7;
        this.f1657b = z8;
        this.f1658c = z9;
        this.f1659d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1656a == aVar.f1656a && this.f1657b == aVar.f1657b && this.f1658c == aVar.f1658c && this.f1659d == aVar.f1659d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z7 = this.f1656a;
        int i2 = z7;
        if (z7 != 0) {
            i2 = 1;
        }
        int i5 = i2 * 31;
        boolean z8 = this.f1657b;
        int i7 = z8;
        if (z8 != 0) {
            i7 = 1;
        }
        int i8 = (i5 + i7) * 31;
        boolean z9 = this.f1658c;
        int i9 = z9;
        if (z9 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z10 = this.f1659d;
        return i10 + (z10 ? 1 : z10 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f1656a + ", isValidated=" + this.f1657b + ", isMetered=" + this.f1658c + ", isNotRoaming=" + this.f1659d + ')';
    }
}
