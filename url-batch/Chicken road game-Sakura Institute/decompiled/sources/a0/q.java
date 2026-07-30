package a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final l2.h f124a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125b;

    /* renamed from: c, reason: collision with root package name */
    public final long f126c;

    public q(l2.h hVar, int i7, long j8) {
        this.f124a = hVar;
        this.f125b = i7;
        this.f126c = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f124a == qVar.f124a && this.f125b == qVar.f125b && this.f126c == qVar.f126c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f126c) + l.h.c(this.f125b, this.f124a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f124a + ", offset=" + this.f125b + ", selectableId=" + this.f126c + ')';
    }
}
