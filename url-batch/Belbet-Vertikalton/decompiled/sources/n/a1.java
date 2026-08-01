package n;

import androidx.appcompat.widget.Toolbar;
import m.C0231o;

/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3598b;

    public /* synthetic */ a1(Toolbar toolbar, int i) {
        this.f3597a = i;
        this.f3598b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3597a) {
            case 0:
                d1 d1Var = this.f3598b.f1787L;
                C0231o c0231o = d1Var == null ? null : d1Var.f3611b;
                if (c0231o != null) {
                    c0231o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f3598b.n();
                break;
        }
    }
}
