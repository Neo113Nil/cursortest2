package h1;

import o2.m0;
import w0.b0;
import w0.c0;

/* loaded from: classes.dex */
final class e implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final c f16775a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16776b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16777c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16778d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16779e;

    public e(c cVar, int i7, long j7, long j8) {
        this.f16775a = cVar;
        this.f16776b = i7;
        this.f16777c = j7;
        long j9 = (j8 - j7) / cVar.f16770e;
        this.f16778d = j9;
        this.f16779e = a(j9);
    }

    private long a(long j7) {
        return m0.N0(j7 * this.f16776b, 1000000L, this.f16775a.f16768c);
    }

    @Override // w0.b0
    public boolean g() {
        return true;
    }

    @Override // w0.b0
    public b0.a i(long j7) {
        long r7 = m0.r((this.f16775a.f16768c * j7) / (this.f16776b * 1000000), 0L, this.f16778d - 1);
        long j8 = this.f16777c + (this.f16775a.f16770e * r7);
        long a7 = a(r7);
        c0 c0Var = new c0(a7, j8);
        if (a7 >= j7 || r7 == this.f16778d - 1) {
            return new b0.a(c0Var);
        }
        long j9 = r7 + 1;
        return new b0.a(c0Var, new c0(a(j9), this.f16777c + (this.f16775a.f16770e * j9)));
    }

    @Override // w0.b0
    public long j() {
        return this.f16779e;
    }
}
