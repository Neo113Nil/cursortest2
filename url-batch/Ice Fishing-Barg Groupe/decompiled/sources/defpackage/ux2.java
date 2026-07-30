package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ux2 implements Handler.Callback {
    public final /* synthetic */ vx2 PxuCJdSBwIXG;

    public /* synthetic */ ux2(vx2 vx2Var) {
        this.PxuCJdSBwIXG = vx2Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.PxuCJdSBwIXG.PxuCJdSBwIXG) {
                try {
                    rx2 rx2Var = (rx2) message.obj;
                    tx2 tx2Var = (tx2) this.PxuCJdSBwIXG.PxuCJdSBwIXG.get(rx2Var);
                    if (tx2Var != null && tx2Var.PxuCJdSBwIXG.isEmpty()) {
                        if (tx2Var.TSizfFm2Yiuu) {
                            tx2Var.RAsUl2FVSrh6.TSizfFm2Yiuu.removeMessages(1, tx2Var.e9gEMXR7LXtO);
                            vx2 vx2Var = tx2Var.RAsUl2FVSrh6;
                            vx2Var.Y1f8riQaR6yg.lS5Rgt96tfkO(vx2Var.lS5Rgt96tfkO, tx2Var);
                            tx2Var.TSizfFm2Yiuu = false;
                            tx2Var.lS5Rgt96tfkO = 2;
                        }
                        this.PxuCJdSBwIXG.PxuCJdSBwIXG.remove(rx2Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.PxuCJdSBwIXG.PxuCJdSBwIXG) {
            try {
                rx2 rx2Var2 = (rx2) message.obj;
                tx2 tx2Var2 = (tx2) this.PxuCJdSBwIXG.PxuCJdSBwIXG.get(rx2Var2);
                if (tx2Var2 != null && tx2Var2.lS5Rgt96tfkO == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(rx2Var2)), new Exception());
                    ComponentName componentName = tx2Var2.a92UlCVFR9N8;
                    if (componentName == null) {
                        rx2Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = rx2Var2.lS5Rgt96tfkO;
                        jh0.x50lh2ztY7Y5(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    tx2Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
