package o1;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import r1.C1403a;

/* renamed from: o1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1359D implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11507a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f11508b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11509c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f11510d;

    /* renamed from: e, reason: collision with root package name */
    public final C1358C f11511e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f11512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1361F f11513g;

    public ServiceConnectionC1359D(C1361F c1361f, C1358C c1358c) {
        this.f11513g = c1361f;
        this.f11511e = c1358c;
    }

    public final void a(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f11508b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            C1361F c1361f = this.f11513g;
            C1403a c1403a = c1361f.f11521d;
            Context context = c1361f.f11519b;
            boolean c2 = c1403a.c(context, str, this.f11511e.a(context), this, 4225, executor);
            this.f11509c = c2;
            if (c2) {
                this.f11513g.f11520c.sendMessageDelayed(this.f11513g.f11520c.obtainMessage(1, this.f11511e), this.f11513g.f11523f);
            } else {
                this.f11508b = 2;
                try {
                    C1361F c1361f2 = this.f11513g;
                    c1361f2.f11521d.b(c1361f2.f11519b, this);
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
        synchronized (this.f11513g.f11518a) {
            try {
                this.f11513g.f11520c.removeMessages(1, this.f11511e);
                this.f11510d = iBinder;
                this.f11512f = componentName;
                Iterator it = this.f11507a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f11508b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f11513g.f11518a) {
            try {
                this.f11513g.f11520c.removeMessages(1, this.f11511e);
                this.f11510d = null;
                this.f11512f = componentName;
                Iterator it = this.f11507a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f11508b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
