package m;

import androidx.appcompat.widget.Toolbar;
import l.C0171o;

/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3072b;

    public /* synthetic */ b1(Toolbar toolbar, int i) {
        this.f3071a = i;
        this.f3072b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3071a) {
            case 0:
                e1 e1Var = this.f3072b.f1423L;
                C0171o c0171o = e1Var == null ? null : e1Var.f3084b;
                if (c0171o != null) {
                    c0171o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f3072b.n();
                break;
        }
    }
}
