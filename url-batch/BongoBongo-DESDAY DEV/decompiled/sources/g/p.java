package g;

import L.C0005c0;
import L.T;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f2352b;

    public /* synthetic */ p(A a2, int i) {
        this.f2351a = i;
        this.f2352b = a2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2351a) {
            case 0:
                A a2 = this.f2352b;
                if ((a2.f2225a0 & 1) != 0) {
                    a2.u(0);
                }
                if ((a2.f2225a0 & 4096) != 0) {
                    a2.u(108);
                }
                a2.f2224Z = false;
                a2.f2225a0 = 0;
                break;
            default:
                A a3 = this.f2352b;
                a3.f2246w.showAtLocation(a3.f2245v, 55, 0, 0);
                C0005c0 c0005c0 = a3.f2248y;
                if (c0005c0 != null) {
                    c0005c0.b();
                }
                if (!(a3.f2200A && (viewGroup = a3.f2201B) != null && viewGroup.isLaidOut())) {
                    a3.f2245v.setAlpha(1.0f);
                    a3.f2245v.setVisibility(0);
                    break;
                } else {
                    a3.f2245v.setAlpha(RecyclerView.A0);
                    C0005c0 a4 = T.a(a3.f2245v);
                    a4.a(1.0f);
                    a3.f2248y = a4;
                    a4.d(new r(0, this));
                    break;
                }
        }
    }
}
