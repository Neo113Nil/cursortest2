package m;

/* loaded from: classes.dex */
public final class Y implements w0 {

    /* renamed from: d, reason: collision with root package name */
    public final w0 f6700d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6701e;

    public Y(w0 w0Var, long j3) {
        this.f6700d = w0Var;
        this.f6701e = j3;
    }

    @Override // m.w0
    public final boolean a() {
        return this.f6700d.a();
    }

    @Override // m.w0
    public final r d(long j3, r rVar, r rVar2, r rVar3) {
        long j4 = this.f6701e;
        return j3 < j4 ? rVar3 : this.f6700d.d(j3 - j4, rVar, rVar2, rVar3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y3 = (Y) obj;
        return y3.f6701e == this.f6701e && f2.j.a(y3.f6700d, this.f6700d);
    }

    @Override // m.w0
    public final r f(long j3, r rVar, r rVar2, r rVar3) {
        long j4 = this.f6701e;
        return j3 < j4 ? rVar : this.f6700d.f(j3 - j4, rVar, rVar2, rVar3);
    }

    @Override // m.w0
    public final long g(r rVar, r rVar2, r rVar3) {
        return this.f6700d.g(rVar, rVar2, rVar3) + this.f6701e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6701e) + (this.f6700d.hashCode() * 31);
    }
}
