package h;

import M.P;
import M.W;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f2816b;

    public /* synthetic */ o(z zVar, int i) {
        this.f2815a = i;
        this.f2816b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2815a) {
            case 0:
                z zVar = this.f2816b;
                if ((zVar.f2869a0 & 1) != 0) {
                    zVar.u(0);
                }
                if ((zVar.f2869a0 & 4096) != 0) {
                    zVar.u(108);
                }
                zVar.f2868Z = false;
                zVar.f2869a0 = 0;
                break;
            default:
                z zVar2 = this.f2816b;
                zVar2.f2889w.showAtLocation(zVar2.f2888v, 55, 0, 0);
                W w2 = zVar2.f2891y;
                if (w2 != null) {
                    w2.b();
                }
                if (!(zVar2.f2844A && (viewGroup = zVar2.f2845B) != null && viewGroup.isLaidOut())) {
                    zVar2.f2888v.setAlpha(1.0f);
                    zVar2.f2888v.setVisibility(0);
                    break;
                } else {
                    zVar2.f2888v.setAlpha(0.0f);
                    W a2 = P.a(zVar2.f2888v);
                    a2.a(1.0f);
                    zVar2.f2891y = a2;
                    a2.d(new q(0, this));
                    break;
                }
        }
    }
}
