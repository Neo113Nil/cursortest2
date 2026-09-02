package e0;

import T.C0097o;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import x2.AbstractC1525a;

/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: j, reason: collision with root package name */
    public final B1.j f8406j;

    /* renamed from: k, reason: collision with root package name */
    public final B1.j f8407k;

    /* renamed from: l, reason: collision with root package name */
    public final long f8408l;

    public p(j jVar, long j4, long j5, long j6, long j7, long j8, List list, long j9, B1.j jVar2, B1.j jVar3, long j10, long j11) {
        super(jVar, j4, j5, j6, j8, list, j9, j10, j11);
        this.f8406j = jVar2;
        this.f8407k = jVar3;
        this.f8408l = j7;
    }

    @Override // e0.s
    public final j a(m mVar) {
        B1.j jVar = this.f8406j;
        if (jVar == null) {
            return this.f8413a;
        }
        C0097o c0097o = mVar.f8394a;
        return new j(0L, -1L, jVar.i(c0097o.f2856a, 0L, c0097o.f2865j, 0L));
    }

    @Override // e0.n
    public final long d(long j4) {
        if (this.f8401f != null) {
            return r0.size();
        }
        long j5 = this.f8408l;
        if (j5 != -1) {
            return (j5 - this.f8399d) + 1;
        }
        if (j4 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j4).multiply(BigInteger.valueOf(this.f8414b));
        BigInteger multiply2 = BigInteger.valueOf(this.f8400e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i4 = AbstractC1525a.f15982a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // e0.n
    public final j h(k kVar, long j4) {
        long j5 = this.f8399d;
        List list = this.f8401f;
        long j6 = list != null ? ((q) list.get((int) (j4 - j5))).f8409a : (j4 - j5) * this.f8400e;
        C0097o c0097o = kVar.f8394a;
        return new j(0L, -1L, this.f8407k.i(c0097o.f2856a, j4, c0097o.f2865j, j6));
    }
}
