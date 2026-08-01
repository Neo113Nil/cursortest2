package l;

import androidx.appcompat.widget.Toolbar;
import k.C0204o;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3315b;

    public /* synthetic */ V0(Toolbar toolbar, int i) {
        this.f3314a = i;
        this.f3315b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3314a) {
            case 0:
                Y0 y02 = this.f3315b.f1073M;
                C0204o c0204o = y02 == null ? null : y02.f3318b;
                if (c0204o != null) {
                    c0204o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f3315b.n();
                break;
        }
    }
}
