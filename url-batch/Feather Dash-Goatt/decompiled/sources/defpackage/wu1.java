package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wu1 {
    public static final Object g = new Object();
    public static wu1 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile gt1 c;
    public final s40 d;
    public final long e;
    public final long f;

    public wu1(Context context, Looper looper) {
        pu1 pu1Var = new pu1(1, this);
        this.b = context.getApplicationContext();
        gt1 gt1Var = new gt1(looper, pu1Var);
        Looper.getMainLooper();
        this.c = gt1Var;
        this.d = s40.s();
        this.e = 5000L;
        this.f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        ru1 ru1Var = new ru1(str, z);
        y90.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                su1 su1Var = (su1) this.a.get(ru1Var);
                if (su1Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(ru1Var.toString()));
                }
                if (!su1Var.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(ru1Var.toString()));
                }
                su1Var.a.remove(serviceConnection);
                if (su1Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, ru1Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(ru1 ru1Var, bu1 bu1Var, String str) {
        boolean z;
        synchronized (this.a) {
            try {
                su1 su1Var = (su1) this.a.get(ru1Var);
                if (su1Var == null) {
                    su1Var = new su1(this, ru1Var);
                    su1Var.a.put(bu1Var, bu1Var);
                    su1Var.a(str, null);
                    this.a.put(ru1Var, su1Var);
                } else {
                    this.c.removeMessages(0, ru1Var);
                    if (su1Var.a.containsKey(bu1Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(ru1Var.toString()));
                    }
                    su1Var.a.put(bu1Var, bu1Var);
                    int i2 = su1Var.b;
                    if (i2 == 1) {
                        bu1Var.onServiceConnected(su1Var.f, su1Var.d);
                    } else if (i2 == 2) {
                        su1Var.a(str, null);
                    }
                }
                z = su1Var.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
