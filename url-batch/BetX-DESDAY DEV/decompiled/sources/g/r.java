package g;

import K.C0009e0;
import K.X;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0142C f2595b;

    public /* synthetic */ r(LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C, int i) {
        this.f2594a = i;
        this.f2595b = layoutInflaterFactory2C0142C;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2594a) {
            case 0:
                LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = this.f2595b;
                if ((layoutInflaterFactory2C0142C.f2462Z & 1) != 0) {
                    layoutInflaterFactory2C0142C.w(0);
                }
                if ((layoutInflaterFactory2C0142C.f2462Z & 4096) != 0) {
                    layoutInflaterFactory2C0142C.w(108);
                }
                layoutInflaterFactory2C0142C.f2461Y = false;
                layoutInflaterFactory2C0142C.f2462Z = 0;
                break;
            default:
                LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C2 = this.f2595b;
                layoutInflaterFactory2C0142C2.f2483w.showAtLocation(layoutInflaterFactory2C0142C2.f2482v, 55, 0, 0);
                C0009e0 c0009e0 = layoutInflaterFactory2C0142C2.f2485y;
                if (c0009e0 != null) {
                    c0009e0.b();
                }
                if (!(layoutInflaterFactory2C0142C2.f2486z && (viewGroup = layoutInflaterFactory2C0142C2.f2438A) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0142C2.f2482v.setAlpha(1.0f);
                    layoutInflaterFactory2C0142C2.f2482v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0142C2.f2482v.setAlpha(0.0f);
                    C0009e0 a2 = X.a(layoutInflaterFactory2C0142C2.f2482v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0142C2.f2485y = a2;
                    a2.d(new t(0, this));
                    break;
                }
        }
    }
}
