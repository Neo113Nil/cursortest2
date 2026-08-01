package g;

import K.S;
import K.Z;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0116A f2470b;

    public /* synthetic */ p(LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A, int i) {
        this.f2469a = i;
        this.f2470b = layoutInflaterFactory2C0116A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2469a) {
            case 0:
                LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = this.f2470b;
                if ((layoutInflaterFactory2C0116A.f2349a0 & 1) != 0) {
                    layoutInflaterFactory2C0116A.u(0);
                }
                if ((layoutInflaterFactory2C0116A.f2349a0 & 4096) != 0) {
                    layoutInflaterFactory2C0116A.u(108);
                }
                layoutInflaterFactory2C0116A.f2348Z = false;
                layoutInflaterFactory2C0116A.f2349a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A2 = this.f2470b;
                layoutInflaterFactory2C0116A2.f2370w.showAtLocation(layoutInflaterFactory2C0116A2.f2369v, 55, 0, 0);
                Z z2 = layoutInflaterFactory2C0116A2.f2372y;
                if (z2 != null) {
                    z2.b();
                }
                if (!(layoutInflaterFactory2C0116A2.f2324A && (viewGroup = layoutInflaterFactory2C0116A2.f2325B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0116A2.f2369v.setAlpha(1.0f);
                    layoutInflaterFactory2C0116A2.f2369v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0116A2.f2369v.setAlpha(0.0f);
                    Z a2 = S.a(layoutInflaterFactory2C0116A2.f2369v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0116A2.f2372y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
