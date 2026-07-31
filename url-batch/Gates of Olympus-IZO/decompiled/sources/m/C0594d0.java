package m;

/* renamed from: m.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594d0 implements A0 {

    /* renamed from: a, reason: collision with root package name */
    public final A0 f5712a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5713b;

    public C0594d0(A0 a02, long j3) {
        this.f5712a = a02;
        this.f5713b = j3;
    }

    @Override // m.A0
    public final boolean a() {
        return this.f5712a.a();
    }

    @Override // m.A0
    public final r b(long j3, r rVar, r rVar2, r rVar3) {
        long j4 = this.f5713b;
        return j3 < j4 ? rVar3 : this.f5712a.b(j3 - j4, rVar, rVar2, rVar3);
    }

    @Override // m.A0
    public final r c(long j3, r rVar, r rVar2, r rVar3) {
        long j4 = this.f5713b;
        return j3 < j4 ? rVar : this.f5712a.c(j3 - j4, rVar, rVar2, rVar3);
    }

    @Override // m.A0
    public final long d(r rVar, r rVar2, r rVar3) {
        return this.f5712a.d(rVar, rVar2, rVar3) + this.f5713b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0594d0)) {
            return false;
        }
        C0594d0 c0594d0 = (C0594d0) obj;
        return c0594d0.f5713b == this.f5713b && Z1.i.a(c0594d0.f5712a, this.f5712a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5713b) + (this.f5712a.hashCode() * 31);
    }
}
