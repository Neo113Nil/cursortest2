package l;

import androidx.appcompat.widget.Toolbar;
import k.C0163o;

/* loaded from: classes.dex */
public final /* synthetic */ class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2871b;

    public /* synthetic */ W0(Toolbar toolbar, int i) {
        this.f2870a = i;
        this.f2871b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2870a) {
            case 0:
                Z0 z02 = this.f2871b.f1278L;
                C0163o c0163o = z02 == null ? null : z02.f2884b;
                if (c0163o != null) {
                    c0163o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2871b.n();
                break;
        }
    }
}
