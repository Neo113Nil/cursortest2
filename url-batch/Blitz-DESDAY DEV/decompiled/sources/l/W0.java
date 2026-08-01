package l;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2944b;

    public /* synthetic */ W0(Toolbar toolbar, int i) {
        this.f2943a = i;
        this.f2944b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2943a) {
            case 0:
                Z0 z02 = this.f2944b.f1425L;
                k.o oVar = z02 == null ? null : z02.f2957b;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2944b.n();
                break;
        }
    }
}
