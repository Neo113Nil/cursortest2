package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f5870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1.l0 f5871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5872g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, u1.l0 l0Var, long j7) {
        super(1);
        this.f5870e = oVar;
        this.f5871f = l0Var;
        this.f5872g = j7;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        y0.e eVar = this.f5870e.f5883t.f5887b;
        u1.k0.h((u1.k0) obj, this.f5871f, eVar.a((r0.f7231e & 4294967295L) | (r0.f7230d << 32), this.f5872g, r2.l.f6529d));
        return c6.m.f1757a;
    }
}
