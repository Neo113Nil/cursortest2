package U0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class B implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2490a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f2491b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2492c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f2493d;

    /* renamed from: e, reason: collision with root package name */
    public final A f2494e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f2495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C f2496g;

    public B(C c7, A a7) {
        this.f2496g = c7;
        this.f2494e = a7;
    }

    public final void a(String str, Executor executor) {
        X0.a aVar;
        Context context;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f2491b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            C c7 = this.f2496g;
            aVar = c7.f2503d;
            context = c7.f2501b;
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean c8 = aVar.c(context, str, this.f2494e.a(context), this, 4225, executor);
            this.f2492c = c8;
            if (c8) {
                this.f2496g.f2502c.sendMessageDelayed(this.f2496g.f2502c.obtainMessage(1, this.f2494e), this.f2496g.f2505f);
            } else {
                this.f2491b = 2;
                try {
                    C c9 = this.f2496g;
                    c9.f2503d.b(c9.f2501b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            StrictMode.setVmPolicy(vmPolicy);
            throw th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f2496g.f2500a) {
            try {
                this.f2496g.f2502c.removeMessages(1, this.f2494e);
                this.f2493d = iBinder;
                this.f2495f = componentName;
                Iterator it = this.f2490a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f2491b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f2496g.f2500a) {
            try {
                this.f2496g.f2502c.removeMessages(1, this.f2494e);
                this.f2493d = null;
                this.f2495f = componentName;
                Iterator it = this.f2490a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f2491b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
