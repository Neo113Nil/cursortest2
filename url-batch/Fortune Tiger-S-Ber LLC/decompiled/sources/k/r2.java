package k;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class r2 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2639f;
    public final /* synthetic */ Toolbar g;

    public /* synthetic */ r2(Toolbar toolbar, int i4) {
        this.f2639f = i4;
        this.g = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2639f) {
            case 0:
                u2 u2Var = this.g.Q;
                j.o oVar = u2Var == null ? null : u2Var.g;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.g.m();
                break;
        }
    }
}
