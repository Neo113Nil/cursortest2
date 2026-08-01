package g;

import K.S;
import K.Z;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0117A f2409b;

    public /* synthetic */ p(LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A, int i) {
        this.f2408a = i;
        this.f2409b = layoutInflaterFactory2C0117A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2408a) {
            case 0:
                LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A = this.f2409b;
                if ((layoutInflaterFactory2C0117A.f2288a0 & 1) != 0) {
                    layoutInflaterFactory2C0117A.u(0);
                }
                if ((layoutInflaterFactory2C0117A.f2288a0 & 4096) != 0) {
                    layoutInflaterFactory2C0117A.u(108);
                }
                layoutInflaterFactory2C0117A.f2287Z = false;
                layoutInflaterFactory2C0117A.f2288a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A2 = this.f2409b;
                layoutInflaterFactory2C0117A2.f2309w.showAtLocation(layoutInflaterFactory2C0117A2.f2308v, 55, 0, 0);
                Z z2 = layoutInflaterFactory2C0117A2.f2311y;
                if (z2 != null) {
                    z2.b();
                }
                if (!(layoutInflaterFactory2C0117A2.f2263A && (viewGroup = layoutInflaterFactory2C0117A2.f2264B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0117A2.f2308v.setAlpha(1.0f);
                    layoutInflaterFactory2C0117A2.f2308v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0117A2.f2308v.setAlpha(0.0f);
                    Z a2 = S.a(layoutInflaterFactory2C0117A2.f2308v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0117A2.f2311y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
