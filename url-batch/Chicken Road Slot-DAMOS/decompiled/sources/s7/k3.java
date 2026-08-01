package s7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k3 implements ServiceConnection, c7.b, c7.c {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f8794a;

    /* renamed from: b, reason: collision with root package name */
    public volatile q0 f8795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f8796c;

    public k3(l3 l3Var) {
        this.f8796c = l3Var;
    }

    @Override // c7.b
    public final void a() {
        o1 o1Var = ((q1) this.f8796c.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.x();
        synchronized (this) {
            try {
                c7.c0.g(this.f8795b);
                h0 h0Var = (h0) this.f8795b.m();
                o1 o1Var2 = ((q1) this.f8796c.f1478d).f8938u;
                q1.l(o1Var2);
                o1Var2.B(new i3(this, h0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f8795b = null;
                this.f8794a = false;
            }
        }
    }

    @Override // c7.c
    public final void onConnectionFailed(z6.b bVar) {
        l3 l3Var = this.f8796c;
        o1 o1Var = ((q1) l3Var.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.x();
        v0 v0Var = ((q1) l3Var.f1478d).f8937t;
        if (v0Var == null || !v0Var.f9095e) {
            v0Var = null;
        }
        if (v0Var != null) {
            v0Var.B.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f8794a = false;
            this.f8795b = null;
        }
        o1 o1Var2 = ((q1) this.f8796c.f1478d).f8938u;
        q1.l(o1Var2);
        o1Var2.B(new f8.j0(26, this, bVar, false));
    }

    @Override // c7.b
    public final void onConnectionSuspended(int i3) {
        q1 q1Var = (q1) this.f8796c.f1478d;
        o1 o1Var = q1Var.f8938u;
        q1.l(o1Var);
        o1Var.x();
        v0 v0Var = q1Var.f8937t;
        q1.l(v0Var);
        v0Var.A.a("Service connection suspended");
        o1 o1Var2 = q1Var.f8938u;
        q1.l(o1Var2);
        o1Var2.B(new b7.k(13, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o1 o1Var = ((q1) this.f8796c.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.x();
        synchronized (this) {
            if (iBinder == null) {
                this.f8794a = false;
                v0 v0Var = ((q1) this.f8796c.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.f9050t.a("Service connected with null binder");
                return;
            }
            h0 h0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    h0Var = queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new f0(iBinder);
                    v0 v0Var2 = ((q1) this.f8796c.f1478d).f8937t;
                    q1.l(v0Var2);
                    v0Var2.B.a("Bound to IMeasurementService interface");
                } else {
                    v0 v0Var3 = ((q1) this.f8796c.f1478d).f8937t;
                    q1.l(v0Var3);
                    v0Var3.f9050t.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                v0 v0Var4 = ((q1) this.f8796c.f1478d).f8937t;
                q1.l(v0Var4);
                v0Var4.f9050t.a("Service connect failed to get IMeasurementService");
            }
            if (h0Var == null) {
                this.f8794a = false;
                try {
                    f7.a b10 = f7.a.b();
                    l3 l3Var = this.f8796c;
                    b10.c(((q1) l3Var.f1478d).f8932d, l3Var.f8812i);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                o1 o1Var2 = ((q1) this.f8796c.f1478d).f8938u;
                q1.l(o1Var2);
                o1Var2.B(new i3(this, h0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        q1 q1Var = (q1) this.f8796c.f1478d;
        o1 o1Var = q1Var.f8938u;
        q1.l(o1Var);
        o1Var.x();
        v0 v0Var = q1Var.f8937t;
        q1.l(v0Var);
        v0Var.A.a("Service disconnected");
        o1 o1Var2 = q1Var.f8938u;
        q1.l(o1Var2);
        o1Var2.B(new f8.j0(25, this, componentName, false));
    }
}
