package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cqj {
    static HandlerThread a = null;
    private static final Object g = new Object();
    private static boolean h = false;
    private static cqj l;
    public final HashMap b = new HashMap();
    public final Context c;
    public volatile Handler d;
    public final long e;
    public boolean f;
    private final cqn i;
    private final long j;
    private volatile Executor k;

    public cqj(Context context, Looper looper) {
        cqn cqnVar = new cqn(this, 0);
        this.i = cqnVar;
        this.c = context.getApplicationContext();
        this.d = new gbg(looper, cqnVar);
        if (csi.b == null) {
            synchronized (csi.a) {
                if (csi.b == null) {
                    csi.b = new csi();
                }
            }
        }
        oy.at(csi.b);
        this.j = 5000L;
        this.e = 300000L;
        this.k = null;
        this.f = false;
    }

    public static HandlerThread a() {
        synchronized (g) {
            HandlerThread handlerThread = a;
            if (handlerThread != null && handlerThread.isAlive()) {
                return a;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            a = handlerThread2;
            handlerThread2.start();
            return a;
        }
    }

    public static cqj b(Context context) {
        cqj cqjVar;
        synchronized (g) {
            cqjVar = l;
            if (cqjVar == null) {
                if (!h) {
                    h = cqh.a(context.getPackageName());
                }
                cqjVar = new cqj(context.getApplicationContext(), h ? a().getLooper() : context.getMainLooper());
                l = cqjVar;
            }
        }
        return cqjVar;
    }

    public final void c(ComponentName componentName, ServiceConnection serviceConnection) {
        d(new cqi(componentName), serviceConnection);
    }

    protected final void d(cqi cqiVar, ServiceConnection serviceConnection) {
        HashMap hashMap = this.b;
        synchronized (hashMap) {
            cqm cqmVar = (cqm) hashMap.get(cqiVar);
            if (cqmVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + cqiVar.toString());
            }
            if (!cqmVar.a(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + cqiVar.toString());
            }
            cqmVar.a.remove(serviceConnection);
            if (cqmVar.b()) {
                this.d.sendMessageDelayed(this.d.obtainMessage(0, cqiVar), this.j);
            }
        }
    }

    public final clg e(cqi cqiVar, ServiceConnection serviceConnection, Executor executor) {
        HashMap hashMap = this.b;
        synchronized (hashMap) {
            cqm cqmVar = (cqm) hashMap.get(cqiVar);
            clg clgVar = null;
            if (executor == null) {
                executor = null;
            }
            if (cqmVar == null) {
                cqmVar = new cqm(this, cqiVar);
                cqmVar.c(serviceConnection, serviceConnection);
                clgVar = cqmVar.d(executor);
                hashMap.put(cqiVar, cqmVar);
            } else {
                this.d.removeMessages(0, cqiVar);
                if (cqmVar.a(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + cqiVar.toString());
                }
                cqmVar.c(serviceConnection, serviceConnection);
                int i = cqmVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(cqmVar.f, cqmVar.d);
                } else if (i == 2) {
                    clgVar = cqmVar.d(executor);
                }
            }
            if (cqmVar.c) {
                return clg.a;
            }
            if (clgVar == null) {
                clgVar = new clg(1, -1, null, null, null);
            }
            return clgVar;
        }
    }
}
