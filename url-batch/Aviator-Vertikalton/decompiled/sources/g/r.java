package g;

import K.C0009e0;
import K.X;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0141C f2591b;

    public /* synthetic */ r(LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C, int i) {
        this.f2590a = i;
        this.f2591b = layoutInflaterFactory2C0141C;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2590a) {
            case 0:
                LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = this.f2591b;
                if ((layoutInflaterFactory2C0141C.f2458Z & 1) != 0) {
                    layoutInflaterFactory2C0141C.w(0);
                }
                if ((layoutInflaterFactory2C0141C.f2458Z & 4096) != 0) {
                    layoutInflaterFactory2C0141C.w(108);
                }
                layoutInflaterFactory2C0141C.f2457Y = false;
                layoutInflaterFactory2C0141C.f2458Z = 0;
                break;
            default:
                LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C2 = this.f2591b;
                layoutInflaterFactory2C0141C2.f2479w.showAtLocation(layoutInflaterFactory2C0141C2.f2478v, 55, 0, 0);
                C0009e0 c0009e0 = layoutInflaterFactory2C0141C2.f2481y;
                if (c0009e0 != null) {
                    c0009e0.b();
                }
                if (!(layoutInflaterFactory2C0141C2.f2482z && (viewGroup = layoutInflaterFactory2C0141C2.f2434A) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0141C2.f2478v.setAlpha(1.0f);
                    layoutInflaterFactory2C0141C2.f2478v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0141C2.f2478v.setAlpha(0.0f);
                    C0009e0 a2 = X.a(layoutInflaterFactory2C0141C2.f2478v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0141C2.f2481y = a2;
                    a2.d(new t(0, this));
                    break;
                }
        }
    }
}
