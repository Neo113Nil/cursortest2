package l;

import androidx.appcompat.widget.Toolbar;
import k.C0159o;

/* loaded from: classes.dex */
public final /* synthetic */ class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2905b;

    public /* synthetic */ U0(Toolbar toolbar, int i) {
        this.f2904a = i;
        this.f2905b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2904a) {
            case 0:
                X0 x02 = this.f2905b.f1295L;
                C0159o c0159o = x02 == null ? null : x02.f2918b;
                if (c0159o != null) {
                    c0159o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2905b.n();
                break;
        }
    }
}
