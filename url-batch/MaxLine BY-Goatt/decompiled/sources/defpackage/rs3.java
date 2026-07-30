package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rs3 {
    public static final Object g = new Object();
    public static rs3 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile bb3 c;
    public final i10 d;
    public final long e;
    public final long f;

    public rs3(Context context, Looper looper) {
        cn3 cn3Var = new cn3(1, this);
        this.b = context.getApplicationContext();
        bb3 bb3Var = new bb3(looper, cn3Var);
        Looper.getMainLooper();
        this.c = bb3Var;
        this.d = i10.b();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static rs3 a(Context context) {
        synchronized (g) {
            try {
                if (h == null) {
                    h = new rs3(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public final c10 b(bp3 bp3Var, lf3 lf3Var, String str, Executor executor) {
        synchronized (this.a) {
            try {
                eq3 eq3Var = (eq3) this.a.get(bp3Var);
                c10 c10Var = null;
                if (executor == null) {
                    executor = null;
                }
                if (eq3Var == null) {
                    eq3Var = new eq3(this, bp3Var);
                    eq3Var.m.put(lf3Var, lf3Var);
                    c10Var = eq3.a(eq3Var, str, executor);
                    this.a.put(bp3Var, eq3Var);
                } else {
                    this.c.removeMessages(0, bp3Var);
                    if (eq3Var.m.containsKey(lf3Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(bp3Var.toString()));
                    }
                    eq3Var.m.put(lf3Var, lf3Var);
                    int i2 = eq3Var.n;
                    if (i2 == 1) {
                        lf3Var.onServiceConnected(eq3Var.r, eq3Var.p);
                    } else if (i2 == 2) {
                        c10Var = eq3.a(eq3Var, str, executor);
                    }
                }
                if (eq3Var.o) {
                    return c10.q;
                }
                if (c10Var == null) {
                    c10Var = new c10(-1);
                }
                return c10Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z) {
        bp3 bp3Var = new bp3(str, z);
        ll3.w(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                eq3 eq3Var = (eq3) this.a.get(bp3Var);
                if (eq3Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(bp3Var.toString()));
                }
                if (!eq3Var.m.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(bp3Var.toString()));
                }
                eq3Var.m.remove(serviceConnection);
                if (eq3Var.m.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, bp3Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
