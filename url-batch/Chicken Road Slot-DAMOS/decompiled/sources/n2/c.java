package n2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f6993a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6994b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6995c;

    public c(int i3, int i10, boolean z10) {
        this.f6993a = i3;
        this.f6994b = i10;
        this.f6995c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6993a == cVar.f6993a && this.f6994b == cVar.f6994b && this.f6995c == cVar.f6995c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6995c) + v4.a.x(this.f6994b, Integer.hashCode(this.f6993a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f6993a + ", end=" + this.f6994b + ", isRtl=" + this.f6995c + ')';
    }
}
