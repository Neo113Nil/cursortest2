package defpackage;

import android.app.Activity;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xf3 extends uf3 {
    public final /* synthetic */ int q;
    public final /* synthetic */ Activity r;
    public final /* synthetic */ cg3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf3(cg3 cg3Var, Activity activity, int i) {
        super((dg3) cg3Var.n, true);
        this.q = i;
        switch (i) {
            case 1:
                this.r = activity;
                this.s = cg3Var;
                super((dg3) cg3Var.n, true);
                break;
            case 2:
                this.r = activity;
                this.s = cg3Var;
                super((dg3) cg3Var.n, true);
                break;
            case 3:
                this.r = activity;
                this.s = cg3Var;
                super((dg3) cg3Var.n, true);
                break;
            case 4:
                this.r = activity;
                this.s = cg3Var;
                super((dg3) cg3Var.n, true);
                break;
            default:
                this.r = activity;
                this.s = cg3Var;
                break;
        }
    }

    @Override // defpackage.uf3
    public final void a() {
        switch (this.q) {
            case 0:
                he3 he3Var = ((dg3) this.s.n).f;
                ll3.v(he3Var);
                he3Var.onActivityStartedByScionActivityInfo(ze3.a(this.r), this.n);
                break;
            case 1:
                he3 he3Var2 = ((dg3) this.s.n).f;
                ll3.v(he3Var2);
                he3Var2.onActivityResumedByScionActivityInfo(ze3.a(this.r), this.n);
                break;
            case 2:
                he3 he3Var3 = ((dg3) this.s.n).f;
                ll3.v(he3Var3);
                he3Var3.onActivityPausedByScionActivityInfo(ze3.a(this.r), this.n);
                break;
            case 3:
                he3 he3Var4 = ((dg3) this.s.n).f;
                ll3.v(he3Var4);
                he3Var4.onActivityStoppedByScionActivityInfo(ze3.a(this.r), this.n);
                break;
            default:
                he3 he3Var5 = ((dg3) this.s.n).f;
                ll3.v(he3Var5);
                he3Var5.onActivityDestroyedByScionActivityInfo(ze3.a(this.r), this.n);
                break;
        }
    }
}
