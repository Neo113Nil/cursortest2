package v1;

import r0.s1;
import w0.e0;

/* loaded from: classes.dex */
public final class p extends a {

    /* renamed from: o, reason: collision with root package name */
    private final int f22798o;

    /* renamed from: p, reason: collision with root package name */
    private final s1 f22799p;

    /* renamed from: q, reason: collision with root package name */
    private long f22800q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f22801r;

    public p(n2.l lVar, n2.p pVar, s1 s1Var, int i7, Object obj, long j7, long j8, long j9, int i8, s1 s1Var2) {
        super(lVar, pVar, s1Var, i7, obj, j7, j8, -9223372036854775807L, -9223372036854775807L, j9);
        this.f22798o = i8;
        this.f22799p = s1Var2;
    }

    @Override // n2.h0.e
    public void a() {
        c j7 = j();
        j7.b(0L);
        e0 d7 = j7.d(0, this.f22798o);
        d7.e(this.f22799p);
        try {
            long b7 = this.f22755i.b(this.f22748b.e(this.f22800q));
            if (b7 != -1) {
                b7 += this.f22800q;
            }
            w0.f fVar = new w0.f(this.f22755i, this.f22800q, b7);
            for (int i7 = 0; i7 != -1; i7 = d7.a(fVar, Integer.MAX_VALUE, true)) {
                this.f22800q += i7;
            }
            d7.b(this.f22753g, 1, (int) this.f22800q, 0, null);
            n2.o.a(this.f22755i);
            this.f22801r = true;
        } catch (Throwable th) {
            n2.o.a(this.f22755i);
            throw th;
        }
    }

    @Override // n2.h0.e
    public void c() {
    }

    @Override // v1.n
    public boolean h() {
        return this.f22801r;
    }
}
