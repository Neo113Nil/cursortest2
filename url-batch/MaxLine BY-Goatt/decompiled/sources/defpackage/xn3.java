package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xn3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ yg3 n;
    public final /* synthetic */ eo3 o;

    public /* synthetic */ xn3(eo3 eo3Var, yg3 yg3Var, int i) {
        this.m = i;
        this.n = yg3Var;
        this.o = eo3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                eo3 eo3Var = this.o;
                synchronized (eo3Var) {
                    try {
                        eo3Var.m = false;
                        jo3 jo3Var = eo3Var.o;
                        if (!jo3Var.N()) {
                            vh3 vh3Var = ((pj3) jo3Var.m).r;
                            pj3.m(vh3Var);
                            vh3Var.z.b("Connected to service");
                            yg3 yg3Var = this.n;
                            jo3Var.v();
                            jo3Var.p = yg3Var;
                            jo3Var.J();
                            jo3Var.L();
                        }
                    } finally {
                    }
                }
                return;
            default:
                eo3 eo3Var2 = this.o;
                synchronized (eo3Var2) {
                    try {
                        eo3Var2.m = false;
                        jo3 jo3Var2 = eo3Var2.o;
                        if (!jo3Var2.N()) {
                            vh3 vh3Var2 = ((pj3) jo3Var2.m).r;
                            pj3.m(vh3Var2);
                            vh3Var2.y.b("Connected to remote service");
                            yg3 yg3Var2 = this.n;
                            jo3Var2.v();
                            jo3Var2.p = yg3Var2;
                            jo3Var2.J();
                            jo3Var2.L();
                        }
                    } finally {
                    }
                }
                jo3 jo3Var3 = this.o.o;
                ScheduledExecutorService scheduledExecutorService = jo3Var3.s;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    jo3Var3.s = null;
                    return;
                }
                return;
        }
    }
}
