package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class j30 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ k30 g;
    public final /* synthetic */ ze h;

    public /* synthetic */ j30(ze zeVar, k30 k30Var, int i) {
        this.f = i;
        this.h = zeVar;
        this.g = k30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        k30 k30Var = this.g;
        ze zeVar = this.h;
        switch (i) {
            case 0:
                if (zeVar.b.contains(k30Var)) {
                    d30.a(k30Var.c.J, k30Var.a);
                    break;
                }
                break;
            default:
                zeVar.b.remove(k30Var);
                zeVar.c.remove(k30Var);
                break;
        }
    }
}
