package l;

import androidx.appcompat.widget.Toolbar;
import k.C0169o;

/* loaded from: classes.dex */
public final /* synthetic */ class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2920b;

    public /* synthetic */ U0(Toolbar toolbar, int i) {
        this.f2919a = i;
        this.f2920b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2919a) {
            case 0:
                X0 x02 = this.f2920b.f1360L;
                C0169o c0169o = x02 == null ? null : x02.f2933b;
                if (c0169o != null) {
                    c0169o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2920b.n();
                break;
        }
    }
}
