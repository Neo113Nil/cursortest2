package q;

import r.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v extends q6.j implements p6.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6.c f5918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1 f5919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p6.c cVar, l1 l1Var) {
        super(3);
        this.f5918e = cVar;
        this.f5919f = l1Var;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j7;
        u1.g0 g0Var = (u1.g0) obj;
        u1.l0 e8 = ((u1.d0) obj2).e(((r2.a) obj3).f6514a);
        if (g0Var.p()) {
            if (!((Boolean) this.f5918e.i(this.f5919f.f6349d.getValue())).booleanValue()) {
                j7 = 0;
                return g0Var.e0((int) (j7 >> 32), (int) (4294967295L & j7), d6.v.f2327d, new c1.g(e8, 1));
            }
        }
        j7 = (e8.f7230d << 32) | (e8.f7231e & 4294967295L);
        return g0Var.e0((int) (j7 >> 32), (int) (4294967295L & j7), d6.v.f2327d, new c1.g(e8, 1));
    }
}
