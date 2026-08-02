package y0;

import E1.P;
import W.J;
import a.AbstractC0124a;

/* loaded from: classes.dex */
public final class v implements y {

    /* renamed from: a, reason: collision with root package name */
    public final P f16212a;

    /* renamed from: b, reason: collision with root package name */
    public final P f16213b;

    /* renamed from: c, reason: collision with root package name */
    public long f16214c;

    public v(long j4, long[] jArr, long[] jArr2) {
        AbstractC0124a.h(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f16212a = new P(length, 5);
            this.f16213b = new P(length, 5);
        } else {
            int i4 = length + 1;
            P p2 = new P(i4, 5);
            this.f16212a = p2;
            P p4 = new P(i4, 5);
            this.f16213b = p4;
            p2.b(0L);
            p4.b(0L);
        }
        this.f16212a.c(jArr);
        this.f16213b.c(jArr2);
        this.f16214c = j4;
    }

    @Override // y0.y
    public final boolean c() {
        return this.f16213b.f518b > 0;
    }

    @Override // y0.y
    public final x e(long j4) {
        P p2 = this.f16213b;
        if (p2.f518b == 0) {
            z zVar = z.f16224c;
            return new x(zVar, zVar);
        }
        int c4 = J.c(p2, j4);
        long d4 = p2.d(c4);
        P p4 = this.f16212a;
        z zVar2 = new z(d4, p4.d(c4));
        if (d4 == j4 || c4 == p2.f518b - 1) {
            return new x(zVar2, zVar2);
        }
        int i4 = c4 + 1;
        return new x(zVar2, new z(p2.d(i4), p4.d(i4)));
    }

    @Override // y0.y
    public final long g() {
        return this.f16214c;
    }
}
