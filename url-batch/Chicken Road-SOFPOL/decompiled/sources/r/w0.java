package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w0 implements t1 {

    /* renamed from: d, reason: collision with root package name */
    public final t1 f6445d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6446e;

    public w0(t1 t1Var, long j7) {
        this.f6445d = t1Var;
        this.f6446e = j7;
    }

    @Override // r.t1
    public final boolean a() {
        return this.f6445d.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return w0Var.f6446e == this.f6446e && q6.i.a(w0Var.f6445d, this.f6445d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6446e) + (this.f6445d.hashCode() * 31);
    }

    @Override // r.t1
    public final p k(long j7, p pVar, p pVar2, p pVar3) {
        long j8 = this.f6446e;
        return j7 < j8 ? pVar : this.f6445d.k(j7 - j8, pVar, pVar2, pVar3);
    }

    @Override // r.t1
    public final p l(long j7, p pVar, p pVar2, p pVar3) {
        long j8 = this.f6446e;
        return j7 < j8 ? pVar3 : this.f6445d.l(j7 - j8, pVar, pVar2, pVar3);
    }

    @Override // r.t1
    public final long m(p pVar, p pVar2, p pVar3) {
        return this.f6445d.m(pVar, pVar2, pVar3) + this.f6446e;
    }
}
