package l;

import androidx.appcompat.widget.Toolbar;
import k.C0159o;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2940b;

    public /* synthetic */ V0(Toolbar toolbar, int i) {
        this.f2939a = i;
        this.f2940b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2939a) {
            case 0:
                Y0 y02 = this.f2940b.f1218L;
                C0159o c0159o = y02 == null ? null : y02.f2943b;
                if (c0159o != null) {
                    c0159o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2940b.n();
                break;
        }
    }
}
