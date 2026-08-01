package j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y implements x.x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4900a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4901b;

    public y(boolean z10, long j) {
        this.f4900a = z10;
        this.f4901b = j;
    }

    @Override // x.x
    public final c2.i a(z.f fVar) {
        return new f(fVar, this.f4900a, new d9.c(26, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f4900a == yVar.f4900a && x2.f.b(Float.NaN, Float.NaN)) {
            return k1.p.c(this.f4901b, yVar.f4901b);
        }
        return false;
    }

    @Override // x.x
    public final int hashCode() {
        int b10 = n0.l.b(Float.NaN, Boolean.hashCode(this.f4900a) * 31, 961);
        int i3 = k1.p.f5341h;
        hd.z zVar = hd.a0.f4495e;
        return Long.hashCode(this.f4901b) + b10;
    }
}
