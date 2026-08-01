package g;

import M.Q;
import M.Y;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0101A f2333b;

    public /* synthetic */ p(LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A, int i) {
        this.f2332a = i;
        this.f2333b = layoutInflaterFactory2C0101A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2332a) {
            case 0:
                LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = this.f2333b;
                if ((layoutInflaterFactory2C0101A.f2212a0 & 1) != 0) {
                    layoutInflaterFactory2C0101A.u(0);
                }
                if ((layoutInflaterFactory2C0101A.f2212a0 & 4096) != 0) {
                    layoutInflaterFactory2C0101A.u(108);
                }
                layoutInflaterFactory2C0101A.f2211Z = false;
                layoutInflaterFactory2C0101A.f2212a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A2 = this.f2333b;
                layoutInflaterFactory2C0101A2.f2233w.showAtLocation(layoutInflaterFactory2C0101A2.f2232v, 55, 0, 0);
                Y y2 = layoutInflaterFactory2C0101A2.f2235y;
                if (y2 != null) {
                    y2.b();
                }
                if (!(layoutInflaterFactory2C0101A2.f2187A && (viewGroup = layoutInflaterFactory2C0101A2.f2188B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0101A2.f2232v.setAlpha(1.0f);
                    layoutInflaterFactory2C0101A2.f2232v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0101A2.f2232v.setAlpha(0.0f);
                    Y a2 = Q.a(layoutInflaterFactory2C0101A2.f2232v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0101A2.f2235y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
