package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class lx implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ kr0 n;

    public /* synthetic */ lx(kr0 kr0Var, int i) {
        this.m = i;
        this.n = kr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        kr0 kr0Var = this.n;
        switch (i) {
            case 0:
                kr0Var.invalidateMenu();
                break;
            default:
                xx.e(kr0Var);
                break;
        }
    }
}
