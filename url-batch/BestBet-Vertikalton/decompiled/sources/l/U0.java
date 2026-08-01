package l;

import androidx.appcompat.widget.Toolbar;
import k.C0192p;

/* loaded from: classes.dex */
public final /* synthetic */ class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3340b;

    public /* synthetic */ U0(Toolbar toolbar, int i) {
        this.f3339a = i;
        this.f3340b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3339a) {
            case 0:
                X0 x02 = this.f3340b.f1741L;
                C0192p c0192p = x02 == null ? null : x02.f3353b;
                if (c0192p != null) {
                    c0192p.collapseActionView();
                    break;
                }
                break;
            default:
                this.f3340b.n();
                break;
        }
    }
}
