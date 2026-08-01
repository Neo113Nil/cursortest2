package g;

import K.Q;
import K.Z;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0112A f2689b;

    public /* synthetic */ p(LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A, int i) {
        this.f2688a = i;
        this.f2689b = layoutInflaterFactory2C0112A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2688a) {
            case 0:
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = this.f2689b;
                if ((layoutInflaterFactory2C0112A.f2567a0 & 1) != 0) {
                    layoutInflaterFactory2C0112A.u(0);
                }
                if ((layoutInflaterFactory2C0112A.f2567a0 & 4096) != 0) {
                    layoutInflaterFactory2C0112A.u(108);
                }
                layoutInflaterFactory2C0112A.f2566Z = false;
                layoutInflaterFactory2C0112A.f2567a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A2 = this.f2689b;
                layoutInflaterFactory2C0112A2.f2588w.showAtLocation(layoutInflaterFactory2C0112A2.f2587v, 55, 0, 0);
                Z z2 = layoutInflaterFactory2C0112A2.f2590y;
                if (z2 != null) {
                    z2.b();
                }
                if (!(layoutInflaterFactory2C0112A2.f2542A && (viewGroup = layoutInflaterFactory2C0112A2.f2543B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0112A2.f2587v.setAlpha(1.0f);
                    layoutInflaterFactory2C0112A2.f2587v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0112A2.f2587v.setAlpha(RecyclerView.f1937A0);
                    Z a2 = Q.a(layoutInflaterFactory2C0112A2.f2587v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0112A2.f2590y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
