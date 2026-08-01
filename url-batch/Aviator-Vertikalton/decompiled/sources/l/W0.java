package l;

import androidx.appcompat.widget.Toolbar;
import k.C0202o;

/* loaded from: classes.dex */
public final /* synthetic */ class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3315b;

    public /* synthetic */ W0(Toolbar toolbar, int i) {
        this.f3314a = i;
        this.f3315b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3314a) {
            case 0:
                Z0 z02 = this.f3315b.f1072M;
                C0202o c0202o = z02 == null ? null : z02.f3318b;
                if (c0202o != null) {
                    c0202o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f3315b.n();
                break;
        }
    }
}
