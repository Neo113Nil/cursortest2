package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eq3 implements ServiceConnection {
    public final HashMap m = new HashMap();
    public int n = 2;
    public boolean o;
    public IBinder p;
    public final bp3 q;
    public ComponentName r;
    public final /* synthetic */ rs3 s;

    public eq3(rs3 rs3Var, bp3 bp3Var) {
        this.s = rs3Var;
        this.q = bp3Var;
    }

    public static c10 a(eq3 eq3Var, String str, Executor executor) {
        try {
            Intent a = eq3Var.q.a(eq3Var.s.b);
            eq3Var.n = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(zc3.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                rs3 rs3Var = eq3Var.s;
                boolean d = rs3Var.d.d(rs3Var.b, str, a, eq3Var, 4225, executor);
                eq3Var.o = d;
                if (d) {
                    eq3Var.s.c.sendMessageDelayed(eq3Var.s.c.obtainMessage(1, eq3Var.q), eq3Var.s.f);
                    c10 c10Var = c10.q;
                    StrictMode.setVmPolicy(vmPolicy);
                    return c10Var;
                }
                eq3Var.n = 2;
                try {
                    rs3 rs3Var2 = eq3Var.s;
                    rs3Var2.d.c(rs3Var2.b, eq3Var);
                } catch (IllegalArgumentException unused) {
                }
                c10 c10Var2 = new c10(16);
                StrictMode.setVmPolicy(vmPolicy);
                return c10Var2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (bc3 e) {
            return e.m;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.s.a) {
            try {
                this.s.c.removeMessages(1, this.q);
                this.p = iBinder;
                this.r = componentName;
                Iterator it = this.m.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.n = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.s.a) {
            try {
                this.s.c.removeMessages(1, this.q);
                this.p = null;
                this.r = componentName;
                Iterator it = this.m.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.n = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
