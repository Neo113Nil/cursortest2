package m;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Toolbar f6181e;

    public /* synthetic */ s1(Toolbar toolbar, int i3) {
        this.f6180d = i3;
        this.f6181e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6180d) {
            case 0:
                x1 x1Var = this.f6181e.f442b0;
                l.j jVar = x1Var == null ? null : x1Var.f6204e;
                if (jVar != null) {
                    jVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f6181e.l();
                break;
        }
    }
}
