package m;

/* loaded from: classes.dex */
public final class C0 implements A0 {

    /* renamed from: a, reason: collision with root package name */
    public final H2.z f5560a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5561b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5562c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5563d;

    public C0(H2.z zVar, int i3, long j3) {
        this.f5560a = zVar;
        this.f5561b = i3;
        this.f5562c = (zVar.f2056b + zVar.f2055a) * 1000000;
        this.f5563d = j3 * 1000000;
    }

    @Override // m.A0
    public final boolean a() {
        return true;
    }

    @Override // m.A0
    public final r b(long j3, r rVar, r rVar2, r rVar3) {
        return ((A2.k) this.f5560a.f2057c).b(f(j3), rVar, rVar2, g(j3, rVar, rVar3, rVar2));
    }

    @Override // m.A0
    public final r c(long j3, r rVar, r rVar2, r rVar3) {
        return ((A2.k) this.f5560a.f2057c).c(f(j3), rVar, rVar2, g(j3, rVar, rVar3, rVar2));
    }

    @Override // m.A0
    public final long d(r rVar, r rVar2, r rVar3) {
        return Long.MAX_VALUE;
    }

    public final long f(long j3) {
        long j4 = j3 + this.f5563d;
        if (j4 <= 0) {
            return 0L;
        }
        long j5 = this.f5562c;
        long j6 = j4 / j5;
        return (this.f5561b == 1 || j6 % ((long) 2) == 0) ? j4 - (j6 * j5) : ((j6 + 1) * j5) - j4;
    }

    public final r g(long j3, r rVar, r rVar2, r rVar3) {
        long j4 = this.f5563d;
        long j5 = j3 + j4;
        long j6 = this.f5562c;
        if (j5 <= j6) {
            return rVar2;
        }
        return ((A2.k) this.f5560a.f2057c).b(j6 - j4, rVar, rVar3, rVar2);
    }
}
