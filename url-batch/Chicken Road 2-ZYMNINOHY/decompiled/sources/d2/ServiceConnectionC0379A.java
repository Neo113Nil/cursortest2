package d2;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import g2.C0440a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: d2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0379A implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8215a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f8216b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8217c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f8218d;

    /* renamed from: e, reason: collision with root package name */
    public final z f8219e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f8220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0381C f8221g;

    public ServiceConnectionC0379A(C0381C c0381c, z zVar) {
        this.f8221g = c0381c;
        this.f8219e = zVar;
    }

    public final void a(String str, Executor executor) {
        C0440a c0440a;
        Context context;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f8216b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            C0381C c0381c = this.f8221g;
            c0440a = c0381c.f8229d;
            context = c0381c.f8227b;
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean c4 = c0440a.c(context, str, this.f8219e.a(context), this, 4225, executor);
            this.f8217c = c4;
            if (c4) {
                this.f8221g.f8228c.sendMessageDelayed(this.f8221g.f8228c.obtainMessage(1, this.f8219e), this.f8221g.f8231f);
            } else {
                this.f8216b = 2;
                try {
                    C0381C c0381c2 = this.f8221g;
                    c0381c2.f8229d.b(c0381c2.f8227b, this);
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
        synchronized (this.f8221g.f8226a) {
            try {
                this.f8221g.f8228c.removeMessages(1, this.f8219e);
                this.f8218d = iBinder;
                this.f8220f = componentName;
                Iterator it = this.f8215a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f8216b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f8221g.f8226a) {
            try {
                this.f8221g.f8228c.removeMessages(1, this.f8219e);
                this.f8218d = null;
                this.f8220f = componentName;
                Iterator it = this.f8215a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f8216b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
