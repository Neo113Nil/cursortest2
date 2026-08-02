package S0;

import W.J;
import a.AbstractC0124a;
import d2.C0389g;

/* loaded from: classes.dex */
public final class d implements T0.g {

    /* renamed from: a, reason: collision with root package name */
    public long f2407a;

    /* renamed from: b, reason: collision with root package name */
    public long f2408b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2409c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2410d;

    public d(long j4, int i4) {
        AbstractC0124a.t(((u0.a) this.f2409c) == null);
        this.f2407a = j4;
        this.f2408b = j4 + i4;
    }

    @Override // T0.g
    public long b(y0.o oVar) {
        long j4 = this.f2408b;
        if (j4 < 0) {
            return -1L;
        }
        long j5 = -(j4 + 2);
        this.f2408b = -1L;
        return j5;
    }

    @Override // T0.g
    public y0.y d() {
        AbstractC0124a.t(this.f2407a != -1);
        return new A0.b((y0.r) this.f2409c, this.f2407a, 1);
    }

    @Override // T0.g
    public void e(long j4) {
        long[] jArr = (long[]) ((C0389g) this.f2410d).f8264b;
        this.f2408b = jArr[J.f(jArr, j4, true)];
    }

    public d(long j4, String str, long j5, byte[] bArr) {
        this.f2409c = str;
        this.f2410d = bArr;
        this.f2407a = j4;
        this.f2408b = j5;
    }
}
