package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f6443a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6444b;

    public v0(v vVar, long j7) {
        this.f6443a = vVar;
        this.f6444b = j7;
    }

    @Override // r.j
    public final t1 a(r1 r1Var) {
        return new w0(this.f6443a.a(r1Var), this.f6444b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return v0Var.f6444b == this.f6444b && q6.i.a(v0Var.f6443a, this.f6443a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6444b) + (this.f6443a.hashCode() * 31);
    }
}
