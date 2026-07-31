package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w extends o0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x f7799x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar) {
        super(xVar);
        this.f7799x = xVar;
    }

    @Override // w1.n0
    public final int b0(u1.a aVar) {
        int c8 = f.c(this, aVar);
        this.f7742w.h(c8, aVar);
        return c8;
    }

    @Override // u1.d0
    public final u1.l0 e(long j7) {
        X(j7);
        new r2.a(j7);
        x xVar = this.f7799x;
        v vVar = xVar.Q;
        d1 d1Var = xVar.f7615s;
        q6.i.b(d1Var);
        o0 C0 = d1Var.C0();
        q6.i.b(C0);
        o0.t0(this, vVar.e(this, C0, j7));
        return this;
    }
}
