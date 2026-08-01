package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class mb implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ c3 g;

    public /* synthetic */ mb(c3 c3Var, int i) {
        this.f = i;
        this.g = c3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        c3 c3Var = this.g;
        switch (i) {
            case 0:
                wb.f(c3Var);
                break;
            default:
                c3Var.invalidateOptionsMenu();
                break;
        }
    }
}
