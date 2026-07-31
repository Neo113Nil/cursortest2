package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c1 extends q6.j implements p6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d1 f7608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(d1 d1Var, int i) {
        super(0);
        this.f7607e = i;
        this.f7608f = d1Var;
    }

    @Override // p6.a
    public final Object b() {
        switch (this.f7607e) {
            case 0:
                d1 d1Var = this.f7608f;
                f1.q qVar = d1Var.H;
                q6.i.b(qVar);
                d1Var.y0(qVar, d1Var.G);
                break;
            default:
                d1 d1Var2 = this.f7608f.f7616t;
                if (d1Var2 != null) {
                    d1Var2.L0();
                }
                break;
        }
        return c6.m.f1757a;
    }
}
