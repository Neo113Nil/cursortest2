package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eo3 implements ServiceConnection, in, jn {
    public volatile boolean m;
    public volatile ph3 n;
    public final /* synthetic */ jo3 o;

    public eo3(jo3 jo3Var) {
        this.o = jo3Var;
    }

    @Override // defpackage.in
    public final void b(int i) {
        pj3 pj3Var = (pj3) this.o.m;
        lj3 lj3Var = pj3Var.s;
        pj3.m(lj3Var);
        lj3Var.B();
        vh3 vh3Var = pj3Var.r;
        pj3.m(vh3Var);
        vh3Var.y.b("Service connection suspended");
        lj3 lj3Var2 = pj3Var.s;
        pj3.m(lj3Var2);
        lj3Var2.F(new r7(19, this));
    }

    @Override // defpackage.jn
    public final void c(c10 c10Var) {
        jo3 jo3Var = this.o;
        lj3 lj3Var = ((pj3) jo3Var.m).s;
        pj3.m(lj3Var);
        lj3Var.B();
        vh3 vh3Var = ((pj3) jo3Var.m).r;
        if (vh3Var == null || !vh3Var.n) {
            vh3Var = null;
        }
        if (vh3Var != null) {
            vh3Var.z.c(c10Var, "Service connection failed");
        }
        synchronized (this) {
            this.m = false;
            this.n = null;
        }
        lj3 lj3Var2 = ((pj3) this.o.m).s;
        pj3.m(lj3Var2);
        lj3Var2.F(new pn3(3, this, c10Var));
    }

    @Override // defpackage.in
    public final void d() {
        lj3 lj3Var = ((pj3) this.o.m).s;
        pj3.m(lj3Var);
        lj3Var.B();
        synchronized (this) {
            try {
                ll3.v(this.n);
                yg3 yg3Var = (yg3) this.n.t();
                lj3 lj3Var2 = ((pj3) this.o.m).s;
                pj3.m(lj3Var2);
                lj3Var2.F(new xn3(this, yg3Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.n = null;
                this.m = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        lj3 lj3Var = ((pj3) this.o.m).s;
        pj3.m(lj3Var);
        lj3Var.B();
        synchronized (this) {
            int i = 0;
            if (iBinder == null) {
                this.m = false;
                vh3 vh3Var = ((pj3) this.o.m).r;
                pj3.m(vh3Var);
                vh3Var.r.b("Service connected with null binder");
                return;
            }
            yg3 yg3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    yg3Var = queryLocalInterface instanceof yg3 ? (yg3) queryLocalInterface : new vg3(iBinder);
                    vh3 vh3Var2 = ((pj3) this.o.m).r;
                    pj3.m(vh3Var2);
                    vh3Var2.z.b("Bound to IMeasurementService interface");
                } else {
                    vh3 vh3Var3 = ((pj3) this.o.m).r;
                    pj3.m(vh3Var3);
                    vh3Var3.r.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                vh3 vh3Var4 = ((pj3) this.o.m).r;
                pj3.m(vh3Var4);
                vh3Var4.r.b("Service connect failed to get IMeasurementService");
            }
            if (yg3Var == null) {
                this.m = false;
                try {
                    i10 b = i10.b();
                    jo3 jo3Var = this.o;
                    b.c(((pj3) jo3Var.m).m, jo3Var.o);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                lj3 lj3Var2 = ((pj3) this.o.m).s;
                pj3.m(lj3Var2);
                lj3Var2.F(new xn3(this, yg3Var, i));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        pj3 pj3Var = (pj3) this.o.m;
        lj3 lj3Var = pj3Var.s;
        pj3.m(lj3Var);
        lj3Var.B();
        vh3 vh3Var = pj3Var.r;
        pj3.m(vh3Var);
        vh3Var.y.b("Service disconnected");
        lj3 lj3Var2 = pj3Var.s;
        pj3.m(lj3Var2);
        lj3Var2.F(new pn3(1, this, componentName));
    }
}
