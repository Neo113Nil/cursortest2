package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pn3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public pn3(jo3 jo3Var, tm3 tm3Var) {
        this.m = 0;
        this.n = tm3Var;
        Objects.requireNonNull(jo3Var);
        this.o = jo3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                jo3 jo3Var = (jo3) this.o;
                yg3 yg3Var = jo3Var.p;
                pj3 pj3Var = (pj3) jo3Var.m;
                if (yg3Var == null) {
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.r.b("Failed to send current screen to service");
                    return;
                }
                try {
                    tm3 tm3Var = (tm3) this.n;
                    if (tm3Var == null) {
                        yg3Var.p(0L, null, null, pj3Var.m.getPackageName());
                    } else {
                        yg3Var.p(tm3Var.c, tm3Var.a, tm3Var.b, pj3Var.m.getPackageName());
                    }
                    jo3Var.J();
                    return;
                } catch (RemoteException e) {
                    vh3 vh3Var2 = pj3Var.r;
                    pj3.m(vh3Var2);
                    vh3Var2.r.c(e, "Failed to send current screen to the service");
                    return;
                }
            case 1:
                ((eo3) this.o).o.H((ComponentName) this.n);
                return;
            case 2:
                gq3 gq3Var = (gq3) this.n;
                int i = ((ds3) this.o).a;
                synchronized (gq3Var) {
                    ds3 ds3Var = (ds3) gq3Var.q.get(i);
                    if (ds3Var != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i);
                        gq3Var.q.remove(i);
                        ds3Var.b(new ne("Timed out waiting for response", null));
                        gq3Var.c();
                    }
                }
                return;
            case 3:
                jo3 jo3Var2 = ((eo3) this.o).o;
                jo3Var2.p = null;
                if (((c10) this.n).n != 7777) {
                    jo3Var2.L();
                    return;
                }
                if (jo3Var2.s == null) {
                    jo3Var2.s = Executors.newScheduledThreadPool(1);
                }
                jo3Var2.s.schedule(new r7(20, this), ((Long) ug3.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 4:
                oq3 oq3Var = (oq3) this.n;
                oq3Var.B();
                Runnable runnable = (Runnable) this.o;
                oq3Var.c().v();
                if (oq3Var.B == null) {
                    oq3Var.B = new ArrayList();
                }
                oq3Var.B.add(runnable);
                oq3Var.q();
                return;
            case 5:
                ot2 ot2Var = (ot2) this.n;
                JobParameters jobParameters = (JobParameters) this.o;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((no3) ((Service) ot2Var.n)).c(jobParameters);
                return;
            case 6:
                ei3 ei3Var = (ei3) this.o;
                ys3 ys3Var = (ys3) ei3Var.p;
                try {
                    jt2 j = ((lq2) ei3Var.o).j(((jt2) this.n).i());
                    if (j == null) {
                        ys3Var.p(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    of3 of3Var = lt2.b;
                    j.e(of3Var, ei3Var);
                    j.d(of3Var, ei3Var);
                    j.a(of3Var, ei3Var);
                    return;
                } catch (CancellationException unused) {
                    ei3Var.b();
                    return;
                } catch (mc2 e2) {
                    if (e2.getCause() instanceof Exception) {
                        ei3Var.c((Exception) e2.getCause());
                        return;
                    } else {
                        ys3Var.p(e2);
                        return;
                    }
                } catch (Exception e3) {
                    ys3Var.p(e3);
                    return;
                }
            default:
                ys3 ys3Var2 = (ys3) this.n;
                try {
                    ys3Var2.q(((Callable) this.o).call());
                    return;
                } catch (Exception e4) {
                    ys3Var2.p(e4);
                    return;
                } catch (Throwable th) {
                    ys3Var2.p(new RuntimeException(th));
                    return;
                }
        }
    }

    public /* synthetic */ pn3(int i, Object obj, Object obj2, boolean z) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    public pn3(ot2 ot2Var, oq3 oq3Var, Runnable runnable) {
        this.m = 4;
        this.n = oq3Var;
        this.o = runnable;
    }

    public /* synthetic */ pn3(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj2;
        this.o = obj;
    }
}
