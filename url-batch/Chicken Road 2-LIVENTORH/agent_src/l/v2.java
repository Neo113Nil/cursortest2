package l;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2483g;

    public /* synthetic */ v2(Toolbar toolbar, int i) {
        this.f2482f = i;
        this.f2483g = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2482f) {
            case 0:
                y2 y2Var = this.f2483g.Q;
                k.o oVar = y2Var == null ? null : y2Var.f2522g;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2483g.m();
                break;
        }
    }
}
