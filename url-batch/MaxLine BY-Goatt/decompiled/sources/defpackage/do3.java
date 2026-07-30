package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class do3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ jo3 n;

    public /* synthetic */ do3(jo3 jo3Var, int i) {
        this.m = i;
        this.n = jo3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        jo3 jo3Var = this.n;
        switch (i) {
            case 0:
                jo3Var.C();
                break;
            case 1:
                pj3 pj3Var = (pj3) jo3Var.m;
                yg3 yg3Var = jo3Var.p;
                if (yg3Var == null) {
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.r.b("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        yg3Var.D(jo3Var.M(false));
                        jo3Var.J();
                        break;
                    } catch (RemoteException e) {
                        vh3 vh3Var2 = pj3Var.r;
                        pj3.m(vh3Var2);
                        vh3Var2.r.c(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                pj3 pj3Var2 = (pj3) jo3Var.m;
                yg3 yg3Var2 = jo3Var.p;
                if (yg3Var2 == null) {
                    vh3 vh3Var3 = pj3Var2.r;
                    pj3.m(vh3Var3);
                    vh3Var3.r.b("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        yg3Var2.u(jo3Var.M(false));
                        jo3Var.J();
                        break;
                    } catch (RemoteException e2) {
                        vh3 vh3Var4 = pj3Var2.r;
                        pj3.m(vh3Var4);
                        vh3Var4.r.c(e2, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
