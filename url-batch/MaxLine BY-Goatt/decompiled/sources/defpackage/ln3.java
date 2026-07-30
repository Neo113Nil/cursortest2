package defpackage;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ln3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ cs3 n;
    public final /* synthetic */ jo3 o;

    public ln3(jo3 jo3Var, cs3 cs3Var) {
        this.m = 4;
        this.n = cs3Var;
        Objects.requireNonNull(jo3Var);
        this.o = jo3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        cs3 cs3Var = this.n;
        jo3 jo3Var = this.o;
        switch (i) {
            case 0:
                yg3 yg3Var = jo3Var.p;
                pj3 pj3Var = (pj3) jo3Var.m;
                if (yg3Var != null) {
                    try {
                        yg3Var.z(cs3Var);
                    } catch (RemoteException e) {
                        vh3 vh3Var = pj3Var.r;
                        pj3.m(vh3Var);
                        vh3Var.r.c(e, "Failed to reset data on the service: remote exception");
                    }
                    jo3Var.J();
                    break;
                } else {
                    vh3 vh3Var2 = pj3Var.r;
                    pj3.m(vh3Var2);
                    vh3Var2.r.b("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                yg3 yg3Var2 = jo3Var.p;
                pj3 pj3Var2 = (pj3) jo3Var.m;
                if (yg3Var2 == null) {
                    vh3 vh3Var3 = pj3Var2.r;
                    pj3.m(vh3Var3);
                    vh3Var3.r.b("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        ec3 ec3Var = pj3Var2.p;
                        tg3 tg3Var = ug3.b1;
                        if (ec3Var.G(null, tg3Var)) {
                            jo3Var.O(yg3Var2, null, cs3Var);
                        }
                        yg3Var2.l(cs3Var);
                        pj3Var2.o().B();
                        pj3Var2.p.G(null, tg3Var);
                        jo3Var.O(yg3Var2, null, cs3Var);
                        jo3Var.J();
                        break;
                    } catch (RemoteException e2) {
                        vh3 vh3Var4 = pj3Var2.r;
                        pj3.m(vh3Var4);
                        vh3Var4.r.c(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
            case 2:
                yg3 yg3Var3 = jo3Var.p;
                pj3 pj3Var3 = (pj3) jo3Var.m;
                if (yg3Var3 == null) {
                    vh3 vh3Var5 = pj3Var3.r;
                    pj3.m(vh3Var5);
                    vh3Var5.u.b("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        yg3Var3.y(cs3Var);
                        jo3Var.J();
                        break;
                    } catch (RemoteException e3) {
                        vh3 vh3Var6 = pj3Var3.r;
                        pj3.m(vh3Var6);
                        vh3Var6.r.c(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            case 3:
                yg3 yg3Var4 = jo3Var.p;
                pj3 pj3Var4 = (pj3) jo3Var.m;
                if (yg3Var4 == null) {
                    vh3 vh3Var7 = pj3Var4.r;
                    pj3.m(vh3Var7);
                    vh3Var7.r.b("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        yg3Var4.B(cs3Var);
                        jo3Var.J();
                        break;
                    } catch (RemoteException e4) {
                        vh3 vh3Var8 = pj3Var4.r;
                        pj3.m(vh3Var8);
                        vh3Var8.r.c(e4, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
            default:
                yg3 yg3Var5 = jo3Var.p;
                pj3 pj3Var5 = (pj3) jo3Var.m;
                if (yg3Var5 == null) {
                    vh3 vh3Var9 = pj3Var5.r;
                    pj3.m(vh3Var9);
                    vh3Var9.r.b("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        yg3Var5.A(cs3Var);
                        jo3Var.J();
                        break;
                    } catch (RemoteException e5) {
                        vh3 vh3Var10 = pj3Var5.r;
                        pj3.m(vh3Var10);
                        vh3Var10.r.c(e5, "Failed to send consent settings to the service");
                    }
                }
        }
    }

    public /* synthetic */ ln3(jo3 jo3Var, cs3 cs3Var, int i) {
        this.m = i;
        this.n = cs3Var;
        this.o = jo3Var;
    }
}
