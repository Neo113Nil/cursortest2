package g;

import K.C0005c0;
import K.T;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0092A f2271b;

    public /* synthetic */ p(LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A, int i) {
        this.f2270a = i;
        this.f2271b = layoutInflaterFactory2C0092A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2270a) {
            case 0:
                LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = this.f2271b;
                if ((layoutInflaterFactory2C0092A.f2150a0 & 1) != 0) {
                    layoutInflaterFactory2C0092A.u(0);
                }
                if ((layoutInflaterFactory2C0092A.f2150a0 & 4096) != 0) {
                    layoutInflaterFactory2C0092A.u(108);
                }
                layoutInflaterFactory2C0092A.f2149Z = false;
                layoutInflaterFactory2C0092A.f2150a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A2 = this.f2271b;
                layoutInflaterFactory2C0092A2.f2171w.showAtLocation(layoutInflaterFactory2C0092A2.f2170v, 55, 0, 0);
                C0005c0 c0005c0 = layoutInflaterFactory2C0092A2.f2173y;
                if (c0005c0 != null) {
                    c0005c0.b();
                }
                if (!(layoutInflaterFactory2C0092A2.f2125A && (viewGroup = layoutInflaterFactory2C0092A2.f2126B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0092A2.f2170v.setAlpha(1.0f);
                    layoutInflaterFactory2C0092A2.f2170v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0092A2.f2170v.setAlpha(RecyclerView.f1559A0);
                    C0005c0 a2 = T.a(layoutInflaterFactory2C0092A2.f2170v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0092A2.f2173y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
