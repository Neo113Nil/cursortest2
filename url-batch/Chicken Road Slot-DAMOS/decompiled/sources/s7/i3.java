package s7;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i3 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f8742e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k3 f8743i;

    public /* synthetic */ i3(k3 k3Var, h0 h0Var, int i3) {
        this.f8741d = i3;
        this.f8742e = h0Var;
        this.f8743i = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8741d) {
            case 0:
                k3 k3Var = this.f8743i;
                synchronized (k3Var) {
                    try {
                        k3Var.f8794a = false;
                        l3 l3Var = k3Var.f8796c;
                        if (!l3Var.J()) {
                            v0 v0Var = ((q1) l3Var.f1478d).f8937t;
                            q1.l(v0Var);
                            v0Var.B.a("Connected to service");
                            h0 h0Var = this.f8742e;
                            l3Var.s();
                            l3Var.f8813r = h0Var;
                            l3Var.F();
                            l3Var.H();
                        }
                    } finally {
                    }
                }
                return;
            default:
                k3 k3Var2 = this.f8743i;
                synchronized (k3Var2) {
                    try {
                        k3Var2.f8794a = false;
                        l3 l3Var2 = k3Var2.f8796c;
                        if (!l3Var2.J()) {
                            v0 v0Var2 = ((q1) l3Var2.f1478d).f8937t;
                            q1.l(v0Var2);
                            v0Var2.A.a("Connected to remote service");
                            h0 h0Var2 = this.f8742e;
                            l3Var2.s();
                            l3Var2.f8813r = h0Var2;
                            l3Var2.F();
                            l3Var2.H();
                        }
                    } finally {
                    }
                }
                l3 l3Var3 = this.f8743i.f8796c;
                ScheduledExecutorService scheduledExecutorService = l3Var3.f8816u;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    l3Var3.f8816u = null;
                    return;
                }
                return;
        }
    }
}
