package s7;

import android.os.RemoteException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f8759e;

    public /* synthetic */ j3(l3 l3Var, int i3) {
        this.f8758d = i3;
        this.f8759e = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8758d) {
            case 0:
                this.f8759e.y();
                break;
            case 1:
                l3 l3Var = this.f8759e;
                q1 q1Var = (q1) l3Var.f1478d;
                h0 h0Var = l3Var.f8813r;
                if (h0Var == null) {
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.f9050t.a("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        h0Var.o(l3Var.I(false));
                        l3Var.F();
                        break;
                    } catch (RemoteException e2) {
                        v0 v0Var2 = q1Var.f8937t;
                        q1.l(v0Var2);
                        v0Var2.f9050t.b(e2, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                l3 l3Var2 = this.f8759e;
                q1 q1Var2 = (q1) l3Var2.f1478d;
                h0 h0Var2 = l3Var2.f8813r;
                if (h0Var2 == null) {
                    v0 v0Var3 = q1Var2.f8937t;
                    q1.l(v0Var3);
                    v0Var3.f9050t.a("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        h0Var2.i(l3Var2.I(false));
                        l3Var2.F();
                        break;
                    } catch (RemoteException e9) {
                        v0 v0Var4 = q1Var2.f8937t;
                        q1.l(v0Var4);
                        v0Var4.f9050t.b(e9, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
