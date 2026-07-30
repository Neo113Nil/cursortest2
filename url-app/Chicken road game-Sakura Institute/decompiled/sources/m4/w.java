package m4;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6405a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f6406b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6407c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f6408d;

    /* renamed from: e, reason: collision with root package name */
    public final v f6409e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f6410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f6411g;

    public w(y yVar, v vVar) {
        this.f6411g = yVar;
        this.f6409e = vVar;
    }

    public final void a(String str, Executor executor) {
        p4.a aVar;
        Context context;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f6406b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            y yVar = this.f6411g;
            aVar = yVar.f6419d;
            context = yVar.f6417b;
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean c4 = aVar.c(context, str, this.f6409e.a(context), this, 4225, executor);
            this.f6407c = c4;
            if (c4) {
                this.f6411g.f6418c.sendMessageDelayed(this.f6411g.f6418c.obtainMessage(1, this.f6409e), this.f6411g.f6421f);
            } else {
                this.f6406b = 2;
                try {
                    y yVar2 = this.f6411g;
                    yVar2.f6419d.b(yVar2.f6417b, this);
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
        synchronized (this.f6411g.f6416a) {
            try {
                this.f6411g.f6418c.removeMessages(1, this.f6409e);
                this.f6408d = iBinder;
                this.f6410f = componentName;
                Iterator it = this.f6405a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f6406b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6411g.f6416a) {
            try {
                this.f6411g.f6418c.removeMessages(1, this.f6409e);
                this.f6408d = null;
                this.f6410f = componentName;
                Iterator it = this.f6405a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f6406b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
