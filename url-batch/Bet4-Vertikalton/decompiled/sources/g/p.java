package g;

import K.C0005c0;
import K.T;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0090A f2231b;

    public /* synthetic */ p(LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A, int i) {
        this.f2230a = i;
        this.f2231b = layoutInflaterFactory2C0090A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2230a) {
            case 0:
                LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A = this.f2231b;
                if ((layoutInflaterFactory2C0090A.f2110a0 & 1) != 0) {
                    layoutInflaterFactory2C0090A.u(0);
                }
                if ((layoutInflaterFactory2C0090A.f2110a0 & 4096) != 0) {
                    layoutInflaterFactory2C0090A.u(108);
                }
                layoutInflaterFactory2C0090A.f2109Z = false;
                layoutInflaterFactory2C0090A.f2110a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A2 = this.f2231b;
                layoutInflaterFactory2C0090A2.f2131w.showAtLocation(layoutInflaterFactory2C0090A2.f2130v, 55, 0, 0);
                C0005c0 c0005c0 = layoutInflaterFactory2C0090A2.f2133y;
                if (c0005c0 != null) {
                    c0005c0.b();
                }
                if (!(layoutInflaterFactory2C0090A2.f2085A && (viewGroup = layoutInflaterFactory2C0090A2.f2086B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0090A2.f2130v.setAlpha(1.0f);
                    layoutInflaterFactory2C0090A2.f2130v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0090A2.f2130v.setAlpha(RecyclerView.f1530C0);
                    C0005c0 a2 = T.a(layoutInflaterFactory2C0090A2.f2130v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0090A2.f2133y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
