package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c2 extends g6.a implements a7.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.b f4885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d2 f4886f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c2(x0.b bVar, d2 d2Var) {
        super(r0);
        a7.r rVar = a7.r.f296d;
        this.f4885e = bVar;
        this.f4886f = d2Var;
    }

    @Override // a7.s
    public final void n(g6.h hVar, Throwable th) {
        x0.b bVar = this.f4885e;
        d2 d2Var = this.f4886f;
        r2.o.t0(th, new a0.z0(10, bVar, d2Var));
        a7.s sVar = (a7.s) d2Var.f4897d.l(a7.r.f296d);
        if (sVar == null) {
            throw th;
        }
        sVar.n(hVar, th);
    }
}
