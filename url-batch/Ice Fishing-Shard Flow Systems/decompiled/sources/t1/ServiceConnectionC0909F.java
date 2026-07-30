package t1;

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
import x1.AbstractC1003e;

/* renamed from: t1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0909F implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7905a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f7906b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7907c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f7908d;

    /* renamed from: e, reason: collision with root package name */
    public final C0908E f7909e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f7910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0911H f7911g;

    public ServiceConnectionC0909F(C0911H c0911h, C0908E c0908e) {
        this.f7911g = c0911h;
        this.f7909e = c0908e;
    }

    public final q1.b a(String str, Executor executor) {
        try {
            Intent a7 = w.a(this.f7911g.f7917b, this.f7909e);
            this.f7906b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(AbstractC1003e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                C0911H c0911h = this.f7911g;
                w1.a aVar = c0911h.f7919d;
                Context context = c0911h.f7917b;
                C0908E c0908e = this.f7909e;
                try {
                    boolean c7 = aVar.c(context, str, a7, this, 4225, executor);
                    this.f7907c = c7;
                    if (c7) {
                        c0911h.f7918c.sendMessageDelayed(c0911h.f7918c.obtainMessage(1, c0908e), c0911h.f7921f);
                        q1.b bVar = q1.b.f7309n;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f7906b = 2;
                    try {
                        c0911h.f7919d.b(c0911h.f7917b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    q1.b bVar2 = new q1.b(16, null, null);
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
        } catch (v e7) {
            return e7.f8004d;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0911H c0911h = this.f7911g;
        synchronized (c0911h.f7916a) {
            try {
                c0911h.f7918c.removeMessages(1, this.f7909e);
                this.f7908d = iBinder;
                this.f7910f = componentName;
                Iterator it = this.f7905a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f7906b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0911H c0911h = this.f7911g;
        synchronized (c0911h.f7916a) {
            try {
                c0911h.f7918c.removeMessages(1, this.f7909e);
                this.f7908d = null;
                this.f7910f = componentName;
                Iterator it = this.f7905a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f7906b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
