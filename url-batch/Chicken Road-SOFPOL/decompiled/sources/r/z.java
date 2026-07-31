package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z implements j {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f6462a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f6463b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6464c;

    public z(q1 q1Var, j0 j0Var, long j7) {
        this.f6462a = q1Var;
        this.f6463b = j0Var;
        this.f6464c = j7;
    }

    @Override // r.j
    public final t1 a(r1 r1Var) {
        q1 q1Var = this.f6462a;
        return new w1(new b3.g(q1Var.f6399a, q1Var.f6400b, q1Var.f6401c), this.f6463b, this.f6464c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return zVar.f6462a.equals(this.f6462a) && zVar.f6463b == this.f6463b && zVar.f6464c == this.f6464c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6464c) + ((this.f6463b.hashCode() + (this.f6462a.hashCode() * 31)) * 31);
    }
}
