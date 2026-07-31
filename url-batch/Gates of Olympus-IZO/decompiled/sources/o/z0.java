package o;

import m.C0604n;

/* loaded from: classes.dex */
public final class z0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A0 f6675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f6676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.c f6677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(A0 a02, float f3, Y1.c cVar) {
        super(1);
        this.f6675e = a02;
        this.f6676f = f3;
        this.f6677g = cVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        long N3;
        long longValue = ((Number) obj).longValue();
        A0 a02 = this.f6675e;
        if (a02.f6409b == Long.MIN_VALUE) {
            a02.f6409b = longValue;
        }
        float f3 = a02.f6412e;
        C0604n c0604n = new C0604n(f3);
        float f4 = this.f6676f;
        C0604n c0604n2 = A0.f6407f;
        if (f4 == 0.0f) {
            N3 = a02.f6408a.d(new C0604n(f3), c0604n2, a02.f6410c);
        } else {
            N3 = M1.B.N((longValue - a02.f6409b) / f4);
        }
        long j3 = N3;
        float f5 = ((C0604n) a02.f6408a.c(j3, c0604n, c0604n2, a02.f6410c)).f5808a;
        a02.f6410c = (C0604n) a02.f6408a.b(j3, c0604n, c0604n2, a02.f6410c);
        a02.f6409b = longValue;
        float f6 = a02.f6412e - f5;
        a02.f6412e = f5;
        this.f6677g.j(Float.valueOf(f6));
        return L1.z.f2729a;
    }
}
