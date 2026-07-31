package l;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Toolbar f4459e;

    public /* synthetic */ z1(Toolbar toolbar, int i) {
        this.f4458d = i;
        this.f4459e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4458d) {
            case 0:
                e2 e2Var = this.f4459e.N;
                k.j jVar = e2Var == null ? null : e2Var.f4228e;
                if (jVar != null) {
                    jVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f4459e.l();
                break;
        }
    }
}
