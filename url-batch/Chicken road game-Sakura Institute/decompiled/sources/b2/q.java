package b2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f1293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1294b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1295c;

    public q(int i7, int i8, boolean z8) {
        this.f1293a = i7;
        this.f1294b = i8;
        this.f1295c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f1293a == qVar.f1293a && this.f1294b == qVar.f1294b && this.f1295c == qVar.f1295c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1295c) + l.h.c(this.f1294b, Integer.hashCode(this.f1293a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f1293a + ", end=" + this.f1294b + ", isRtl=" + this.f1295c + ')';
    }
}
