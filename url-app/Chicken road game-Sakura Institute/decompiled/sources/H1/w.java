package H1;

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
public final class w implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3303a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f3304b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3305c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f3306d;

    /* renamed from: e, reason: collision with root package name */
    public final v f3307e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f3308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f3309g;

    public w(y yVar, v vVar) {
        this.f3309g = yVar;
        this.f3307e = vVar;
    }

    public final void a(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f3304b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            y yVar = this.f3309g;
            K1.a aVar = yVar.f3317d;
            Context context = yVar.f3315b;
            boolean c4 = aVar.c(context, str, this.f3307e.a(context), this, 4225, executor);
            this.f3305c = c4;
            if (c4) {
                this.f3309g.f3316c.sendMessageDelayed(this.f3309g.f3316c.obtainMessage(1, this.f3307e), this.f3309g.f3319f);
            } else {
                this.f3304b = 2;
                try {
                    y yVar2 = this.f3309g;
                    yVar2.f3317d.b(yVar2.f3315b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f3309g.f3314a) {
            try {
                this.f3309g.f3316c.removeMessages(1, this.f3307e);
                this.f3306d = iBinder;
                this.f3308f = componentName;
                Iterator it = this.f3303a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f3304b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3309g.f3314a) {
            try {
                this.f3309g.f3316c.removeMessages(1, this.f3307e);
                this.f3306d = null;
                this.f3308f = componentName;
                Iterator it = this.f3303a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f3304b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
