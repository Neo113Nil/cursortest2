package c7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1950a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f1951b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1952c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f1953d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f1954e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f1955f;
    public final /* synthetic */ o0 g;

    public m0(o0 o0Var, l0 l0Var) {
        this.g = o0Var;
        this.f1954e = l0Var;
    }

    public final z6.b a(String str, Executor executor) {
        try {
            Intent a9 = e0.a(this.g.f1964b, this.f1954e);
            this.f1951b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(g7.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                o0 o0Var = this.g;
                f7.a aVar = o0Var.f1966d;
                Context context = o0Var.f1964b;
                l0 l0Var = this.f1954e;
                try {
                    boolean d10 = aVar.d(context, str, a9, this, 4225, executor);
                    this.f1952c = d10;
                    if (d10) {
                        o0Var.f1965c.sendMessageDelayed(o0Var.f1965c.obtainMessage(1, l0Var), o0Var.f1968f);
                        z6.b bVar = z6.b.f10865t;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f1951b = 2;
                    try {
                        o0Var.f1966d.c(o0Var.f1964b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    z6.b bVar2 = new z6.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (d0 e2) {
            return e2.f1875d;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o0 o0Var = this.g;
        synchronized (o0Var.f1963a) {
            try {
                o0Var.f1965c.removeMessages(1, this.f1954e);
                this.f1953d = iBinder;
                this.f1955f = componentName;
                Iterator it = this.f1950a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f1951b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o0 o0Var = this.g;
        synchronized (o0Var.f1963a) {
            try {
                o0Var.f1965c.removeMessages(1, this.f1954e);
                this.f1953d = null;
                this.f1955f = componentName;
                Iterator it = this.f1950a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f1951b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
