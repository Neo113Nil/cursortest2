package g;

import K.S;
import K.Z;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0112A f2449b;

    public /* synthetic */ p(LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A, int i) {
        this.f2448a = i;
        this.f2449b = layoutInflaterFactory2C0112A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2448a) {
            case 0:
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = this.f2449b;
                if ((layoutInflaterFactory2C0112A.f2329a0 & 1) != 0) {
                    layoutInflaterFactory2C0112A.u(0);
                }
                if ((layoutInflaterFactory2C0112A.f2329a0 & 4096) != 0) {
                    layoutInflaterFactory2C0112A.u(108);
                }
                layoutInflaterFactory2C0112A.f2328Z = false;
                layoutInflaterFactory2C0112A.f2329a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A2 = this.f2449b;
                layoutInflaterFactory2C0112A2.f2350w.showAtLocation(layoutInflaterFactory2C0112A2.f2349v, 55, 0, 0);
                Z z2 = layoutInflaterFactory2C0112A2.f2352y;
                if (z2 != null) {
                    z2.b();
                }
                if (!(layoutInflaterFactory2C0112A2.f2304A && (viewGroup = layoutInflaterFactory2C0112A2.f2305B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0112A2.f2349v.setAlpha(1.0f);
                    layoutInflaterFactory2C0112A2.f2349v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0112A2.f2349v.setAlpha(0.0f);
                    Z a2 = S.a(layoutInflaterFactory2C0112A2.f2349v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0112A2.f2352y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
