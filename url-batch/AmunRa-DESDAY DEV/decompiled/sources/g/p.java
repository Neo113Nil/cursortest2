package g;

import K.S;
import K.Z;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0115A f2408b;

    public /* synthetic */ p(LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A, int i) {
        this.f2407a = i;
        this.f2408b = layoutInflaterFactory2C0115A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2407a) {
            case 0:
                LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A = this.f2408b;
                if ((layoutInflaterFactory2C0115A.f2287a0 & 1) != 0) {
                    layoutInflaterFactory2C0115A.u(0);
                }
                if ((layoutInflaterFactory2C0115A.f2287a0 & 4096) != 0) {
                    layoutInflaterFactory2C0115A.u(108);
                }
                layoutInflaterFactory2C0115A.f2286Z = false;
                layoutInflaterFactory2C0115A.f2287a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A2 = this.f2408b;
                layoutInflaterFactory2C0115A2.f2308w.showAtLocation(layoutInflaterFactory2C0115A2.f2307v, 55, 0, 0);
                Z z2 = layoutInflaterFactory2C0115A2.f2310y;
                if (z2 != null) {
                    z2.b();
                }
                if (!(layoutInflaterFactory2C0115A2.f2262A && (viewGroup = layoutInflaterFactory2C0115A2.f2263B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0115A2.f2307v.setAlpha(1.0f);
                    layoutInflaterFactory2C0115A2.f2307v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0115A2.f2307v.setAlpha(0.0f);
                    Z a2 = S.a(layoutInflaterFactory2C0115A2.f2307v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0115A2.f2310y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
