package s7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h3 extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l3 f8728f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(l3 l3Var, q1 q1Var, int i3) {
        super(q1Var);
        this.f8727e = i3;
        this.f8728f = l3Var;
    }

    @Override // s7.n
    public final void a() {
        switch (this.f8727e) {
            case 0:
                l3 l3Var = this.f8728f;
                l3Var.s();
                if (l3Var.J()) {
                    v0 v0Var = ((q1) l3Var.f1478d).f8937t;
                    q1.l(v0Var);
                    v0Var.B.a("Inactivity, disconnecting from the service");
                    l3Var.A();
                    break;
                }
                break;
            default:
                v0 v0Var2 = ((q1) this.f8728f.f1478d).f8937t;
                q1.l(v0Var2);
                v0Var2.f9053w.a("Tasks have been queued for a long time");
                break;
        }
    }
}
