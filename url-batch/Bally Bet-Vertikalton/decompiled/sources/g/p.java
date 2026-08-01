package g;

import K.C0001a0;
import K.T;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0110A f2340b;

    public /* synthetic */ p(LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A, int i) {
        this.f2339a = i;
        this.f2340b = layoutInflaterFactory2C0110A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2339a) {
            case 0:
                LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A = this.f2340b;
                if ((layoutInflaterFactory2C0110A.f2219a0 & 1) != 0) {
                    layoutInflaterFactory2C0110A.u(0);
                }
                if ((layoutInflaterFactory2C0110A.f2219a0 & 4096) != 0) {
                    layoutInflaterFactory2C0110A.u(108);
                }
                layoutInflaterFactory2C0110A.f2218Z = false;
                layoutInflaterFactory2C0110A.f2219a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A2 = this.f2340b;
                layoutInflaterFactory2C0110A2.f2240w.showAtLocation(layoutInflaterFactory2C0110A2.f2239v, 55, 0, 0);
                C0001a0 c0001a0 = layoutInflaterFactory2C0110A2.f2242y;
                if (c0001a0 != null) {
                    c0001a0.b();
                }
                if (!(layoutInflaterFactory2C0110A2.f2194A && (viewGroup = layoutInflaterFactory2C0110A2.f2195B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0110A2.f2239v.setAlpha(1.0f);
                    layoutInflaterFactory2C0110A2.f2239v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0110A2.f2239v.setAlpha(0.0f);
                    C0001a0 a2 = T.a(layoutInflaterFactory2C0110A2.f2239v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0110A2.f2242y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
