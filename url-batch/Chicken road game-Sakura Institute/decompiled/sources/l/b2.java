package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b2 implements y1 {

    /* renamed from: f, reason: collision with root package name */
    public final z1 f5414f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5415g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5416h;

    public b2(z1 z1Var, long j8) {
        this.f5414f = z1Var;
        this.f5415g = (z1Var.k() + z1Var.j()) * 1000000;
        this.f5416h = j8 * 1000000;
    }

    @Override // l.y1
    public final boolean a() {
        return true;
    }

    @Override // l.y1
    public final long b(q qVar, q qVar2, q qVar3) {
        return Long.MAX_VALUE;
    }

    public final long d(long j8) {
        long j9 = j8 + this.f5416h;
        if (j9 <= 0) {
            return 0L;
        }
        long j10 = this.f5415g;
        return j9 - ((j9 / j10) * j10);
    }

    @Override // l.y1
    public final q e(long j8, q qVar, q qVar2, q qVar3) {
        return this.f5414f.e(d(j8), qVar, qVar2, g(j8, qVar, qVar3, qVar2));
    }

    @Override // l.y1
    public final q f(long j8, q qVar, q qVar2, q qVar3) {
        return this.f5414f.f(d(j8), qVar, qVar2, g(j8, qVar, qVar3, qVar2));
    }

    public final q g(long j8, q qVar, q qVar2, q qVar3) {
        long j9 = this.f5416h;
        long j10 = j8 + j9;
        long j11 = this.f5415g;
        return j10 > j11 ? this.f5414f.f(j11 - j9, qVar, qVar3, qVar2) : qVar2;
    }
}
