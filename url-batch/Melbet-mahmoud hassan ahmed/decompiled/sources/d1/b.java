package d1;

import o2.m0;
import o2.s;
import w0.b0;
import w0.c0;

/* loaded from: classes.dex */
final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long f15512a;

    /* renamed from: b, reason: collision with root package name */
    private final s f15513b;

    /* renamed from: c, reason: collision with root package name */
    private final s f15514c;

    /* renamed from: d, reason: collision with root package name */
    private long f15515d;

    public b(long j7, long j8, long j9) {
        this.f15515d = j7;
        this.f15512a = j9;
        s sVar = new s();
        this.f15513b = sVar;
        s sVar2 = new s();
        this.f15514c = sVar2;
        sVar.a(0L);
        sVar2.a(j8);
    }

    public boolean a(long j7) {
        s sVar = this.f15513b;
        return j7 - sVar.b(sVar.c() - 1) < 100000;
    }

    public void b(long j7, long j8) {
        if (a(j7)) {
            return;
        }
        this.f15513b.a(j7);
        this.f15514c.a(j8);
    }

    @Override // d1.g
    public long c(long j7) {
        return this.f15513b.b(m0.g(this.f15514c, j7, true, true));
    }

    void d(long j7) {
        this.f15515d = j7;
    }

    @Override // d1.g
    public long f() {
        return this.f15512a;
    }

    @Override // w0.b0
    public boolean g() {
        return true;
    }

    @Override // w0.b0
    public b0.a i(long j7) {
        int g7 = m0.g(this.f15513b, j7, true, true);
        c0 c0Var = new c0(this.f15513b.b(g7), this.f15514c.b(g7));
        if (c0Var.f22879a == j7 || g7 == this.f15513b.c() - 1) {
            return new b0.a(c0Var);
        }
        int i7 = g7 + 1;
        return new b0.a(c0Var, new c0(this.f15513b.b(i7), this.f15514c.b(i7)));
    }

    @Override // w0.b0
    public long j() {
        return this.f15515d;
    }
}
