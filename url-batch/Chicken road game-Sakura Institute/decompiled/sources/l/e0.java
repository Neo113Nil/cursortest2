package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final x f5467a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5468b;

    public e0(x xVar, long j8) {
        this.f5467a = xVar;
        this.f5468b = j8;
    }

    @Override // l.k
    public final y1 a(w1 w1Var) {
        return new b2(this.f5467a.a(w1Var), this.f5468b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return e0Var.f5467a.equals(this.f5467a) && e0Var.f5468b == this.f5468b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5468b) + ((h.d(1) + (this.f5467a.hashCode() * 31)) * 31);
    }
}
