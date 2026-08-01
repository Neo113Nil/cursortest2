package l;

import androidx.appcompat.widget.Toolbar;
import k.C0162o;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2926b;

    public /* synthetic */ V0(Toolbar toolbar, int i) {
        this.f2925a = i;
        this.f2926b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2925a) {
            case 0:
                Y0 y0 = this.f2926b.f1323L;
                C0162o c0162o = y0 == null ? null : y0.f2939b;
                if (c0162o != null) {
                    c0162o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2926b.n();
                break;
        }
    }
}
