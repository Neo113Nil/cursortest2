package q0;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5749a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5750b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5751c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5752d;

    public C0593a(boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f5749a = z5;
        this.f5750b = z6;
        this.f5751c = z7;
        this.f5752d = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0593a)) {
            return false;
        }
        C0593a c0593a = (C0593a) obj;
        return this.f5749a == c0593a.f5749a && this.f5750b == c0593a.f5750b && this.f5751c == c0593a.f5751c && this.f5752d == c0593a.f5752d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z5 = this.f5749a;
        int i7 = z5;
        if (z5 != 0) {
            i7 = 1;
        }
        int i8 = i7 * 31;
        boolean z6 = this.f5750b;
        int i9 = z6;
        if (z6 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z7 = this.f5751c;
        int i11 = z7;
        if (z7 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z8 = this.f5752d;
        return i12 + (z8 ? 1 : z8 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f5749a + ", isValidated=" + this.f5750b + ", isMetered=" + this.f5751c + ", isNotRoaming=" + this.f5752d + ')';
    }
}
