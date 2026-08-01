package g;

import K.S;
import K.Z;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f2463b;

    public /* synthetic */ o(z zVar, int i) {
        this.f2462a = i;
        this.f2463b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2462a) {
            case 0:
                z zVar = this.f2463b;
                if ((zVar.f2515Z & 1) != 0) {
                    zVar.u(0);
                }
                if ((zVar.f2515Z & 4096) != 0) {
                    zVar.u(108);
                }
                zVar.f2514Y = false;
                zVar.f2515Z = 0;
                break;
            default:
                z zVar2 = this.f2463b;
                zVar2.f2536w.showAtLocation(zVar2.f2535v, 55, 0, 0);
                Z z2 = zVar2.f2538y;
                if (z2 != null) {
                    z2.b();
                }
                if (!(zVar2.f2539z && (viewGroup = zVar2.f2491A) != null && viewGroup.isLaidOut())) {
                    zVar2.f2535v.setAlpha(1.0f);
                    zVar2.f2535v.setVisibility(0);
                    break;
                } else {
                    zVar2.f2535v.setAlpha(0.0f);
                    Z a2 = S.a(zVar2.f2535v);
                    a2.a(1.0f);
                    zVar2.f2538y = a2;
                    a2.d(new q(0, this));
                    break;
                }
        }
    }
}
