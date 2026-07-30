package n;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Toolbar f6839e;

    public /* synthetic */ l1(Toolbar toolbar, int i2) {
        this.f6838d = i2;
        this.f6839e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6838d) {
            case 0:
                n1 n1Var = this.f6839e.f3326U;
                m.o oVar = n1Var == null ? null : n1Var.f6845e;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f6839e.m();
                break;
        }
    }
}
