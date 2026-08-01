package l;

import androidx.appcompat.widget.Toolbar;
import k.C0160o;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3018b;

    public /* synthetic */ V0(Toolbar toolbar, int i) {
        this.f3017a = i;
        this.f3018b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3017a) {
            case 0:
                Y0 y0 = this.f3018b.f1253L;
                C0160o c0160o = y0 == null ? null : y0.f3021b;
                if (c0160o != null) {
                    c0160o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f3018b.n();
                break;
        }
    }
}
