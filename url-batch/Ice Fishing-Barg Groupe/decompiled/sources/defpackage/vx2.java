package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vx2 {
    public static HandlerThread OPXfSBeufaJ8;
    public static final Object RAsUl2FVSrh6 = new Object();
    public static vx2 rtx2ld2ELZv4;
    public final HashMap PxuCJdSBwIXG = new HashMap();
    public volatile sw2 TSizfFm2Yiuu;
    public final dr Y1f8riQaR6yg;
    public final long a92UlCVFR9N8;
    public final long e9gEMXR7LXtO;
    public final Context lS5Rgt96tfkO;

    public vx2(Context context, Looper looper) {
        ux2 ux2Var = new ux2(this);
        this.lS5Rgt96tfkO = context.getApplicationContext();
        sw2 sw2Var = new sw2(looper, ux2Var);
        Looper.getMainLooper();
        this.TSizfFm2Yiuu = sw2Var;
        this.Y1f8riQaR6yg = dr.PxuCJdSBwIXG();
        this.e9gEMXR7LXtO = 5000L;
        this.a92UlCVFR9N8 = 300000L;
    }

    public final void PxuCJdSBwIXG(String str, ServiceConnection serviceConnection, boolean z) {
        rx2 rx2Var = new rx2(str, z);
        jh0.cpQdD2nAriOS(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.PxuCJdSBwIXG) {
            try {
                tx2 tx2Var = (tx2) this.PxuCJdSBwIXG.get(rx2Var);
                if (tx2Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(rx2Var.toString()));
                }
                if (!tx2Var.PxuCJdSBwIXG.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(rx2Var.toString()));
                }
                tx2Var.PxuCJdSBwIXG.remove(serviceConnection);
                if (tx2Var.PxuCJdSBwIXG.isEmpty()) {
                    this.TSizfFm2Yiuu.sendMessageDelayed(this.TSizfFm2Yiuu.obtainMessage(0, rx2Var), this.e9gEMXR7LXtO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean lS5Rgt96tfkO(rx2 rx2Var, gx2 gx2Var, String str) {
        boolean z;
        synchronized (this.PxuCJdSBwIXG) {
            try {
                tx2 tx2Var = (tx2) this.PxuCJdSBwIXG.get(rx2Var);
                if (tx2Var == null) {
                    tx2Var = new tx2(this, rx2Var);
                    tx2Var.PxuCJdSBwIXG.put(gx2Var, gx2Var);
                    tx2Var.PxuCJdSBwIXG(str, null);
                    this.PxuCJdSBwIXG.put(rx2Var, tx2Var);
                } else {
                    this.TSizfFm2Yiuu.removeMessages(0, rx2Var);
                    if (tx2Var.PxuCJdSBwIXG.containsKey(gx2Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(rx2Var.toString()));
                    }
                    tx2Var.PxuCJdSBwIXG.put(gx2Var, gx2Var);
                    int i = tx2Var.lS5Rgt96tfkO;
                    if (i == 1) {
                        gx2Var.onServiceConnected(tx2Var.a92UlCVFR9N8, tx2Var.Y1f8riQaR6yg);
                    } else if (i == 2) {
                        tx2Var.PxuCJdSBwIXG(str, null);
                    }
                }
                z = tx2Var.TSizfFm2Yiuu;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
