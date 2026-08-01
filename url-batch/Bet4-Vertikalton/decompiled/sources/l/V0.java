package l;

import androidx.appcompat.widget.Toolbar;
import k.C0166o;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2863b;

    public /* synthetic */ V0(Toolbar toolbar, int i) {
        this.f2862a = i;
        this.f2863b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2862a) {
            case 0:
                Y0 y02 = this.f2863b.f1337L;
                C0166o c0166o = y02 == null ? null : y02.f2876b;
                if (c0166o != null) {
                    c0166o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2863b.n();
                break;
        }
    }
}
