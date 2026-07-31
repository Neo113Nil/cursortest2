package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w1 implements t1 {

    /* renamed from: d, reason: collision with root package name */
    public final b3.g f6447d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f6448e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6449f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6450g;

    public w1(b3.g gVar, j0 j0Var, long j7) {
        this.f6447d = gVar;
        this.f6448e = j0Var;
        this.f6449f = (gVar.f1130e + gVar.f1129d) * 1000000;
        this.f6450g = j7 * 1000000;
    }

    @Override // r.t1
    public final boolean a() {
        return true;
    }

    public final long b(long j7) {
        long j8 = this.f6450g;
        if (j7 + j8 <= 0) {
            return 0L;
        }
        long j9 = j7 + j8;
        long j10 = this.f6449f;
        long j11 = j9 / j10;
        return (this.f6448e == j0.f6325d || j11 % ((long) 2) == 0) ? j9 - (j11 * j10) : ((j11 + 1) * j10) - j9;
    }

    public final p c(long j7, p pVar, p pVar2, p pVar3) {
        long j8 = this.f6450g;
        long j9 = j7 + j8;
        long j10 = this.f6449f;
        if (j9 <= j10) {
            return pVar2;
        }
        return ((c5.x) this.f6447d.f1131f).l(j10 - j8, pVar, pVar3, pVar2);
    }

    @Override // r.t1
    public final p k(long j7, p pVar, p pVar2, p pVar3) {
        return ((c5.x) this.f6447d.f1131f).k(b(j7), pVar, pVar2, c(j7, pVar, pVar3, pVar2));
    }

    @Override // r.t1
    public final p l(long j7, p pVar, p pVar2, p pVar3) {
        return ((c5.x) this.f6447d.f1131f).l(b(j7), pVar, pVar2, c(j7, pVar, pVar3, pVar2));
    }

    @Override // r.t1
    public final long m(p pVar, p pVar2, p pVar3) {
        return Long.MAX_VALUE;
    }
}
