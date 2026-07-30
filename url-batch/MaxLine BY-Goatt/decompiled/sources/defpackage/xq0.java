package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xq0 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ fr0 n;

    public /* synthetic */ xq0(fr0 fr0Var, int i) {
        this.m = i;
        this.n = fr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        fr0 fr0Var = this.n;
        switch (i) {
            case 0:
                fr0Var.startPostponedEnterTransition();
                break;
            default:
                fr0Var.callStartTransitionListener(false);
                break;
        }
    }
}
