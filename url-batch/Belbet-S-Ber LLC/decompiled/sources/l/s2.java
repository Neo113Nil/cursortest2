package l;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2564g;

    public /* synthetic */ s2(Toolbar toolbar, int i) {
        this.f2563f = i;
        this.f2564g = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2563f) {
            case 0:
                v2 v2Var = this.f2564g.Q;
                k.o oVar = v2Var == null ? null : v2Var.f2599g;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2564g.m();
                break;
        }
    }
}
