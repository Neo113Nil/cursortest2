package l;

import androidx.appcompat.widget.Toolbar;
import k.C0168o;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2890b;

    public /* synthetic */ V0(Toolbar toolbar, int i) {
        this.f2889a = i;
        this.f2890b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2889a) {
            case 0:
                Y0 y02 = this.f2890b.f1368L;
                C0168o c0168o = y02 == null ? null : y02.f2903b;
                if (c0168o != null) {
                    c0168o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2890b.n();
                break;
        }
    }
}
