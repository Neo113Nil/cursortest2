package y5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10619a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10620b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10621c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10622d;

    public a(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f10619a = z10;
        this.f10620b = z11;
        this.f10621c = z12;
        this.f10622d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10619a == aVar.f10619a && this.f10620b == aVar.f10620b && this.f10621c == aVar.f10621c && this.f10622d == aVar.f10622d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z10 = this.f10619a;
        int i3 = z10;
        if (z10 != 0) {
            i3 = 1;
        }
        int i10 = i3 * 31;
        boolean z11 = this.f10620b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z12 = this.f10621c;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z13 = this.f10622d;
        return i14 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f10619a + ", isValidated=" + this.f10620b + ", isMetered=" + this.f10621c + ", isNotRoaming=" + this.f10622d + ')';
    }
}
