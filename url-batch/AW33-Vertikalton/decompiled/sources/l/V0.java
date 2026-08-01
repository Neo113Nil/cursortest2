package l;

import androidx.appcompat.widget.Toolbar;
import k.C0159o;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2935b;

    public /* synthetic */ V0(Toolbar toolbar, int i) {
        this.f2934a = i;
        this.f2935b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2934a) {
            case 0:
                Y0 y02 = this.f2935b.f1214L;
                C0159o c0159o = y02 == null ? null : y02.f2938b;
                if (c0159o != null) {
                    c0159o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2935b.n();
                break;
        }
    }
}
