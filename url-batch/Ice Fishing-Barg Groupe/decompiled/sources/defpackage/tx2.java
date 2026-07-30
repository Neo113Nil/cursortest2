package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tx2 implements ServiceConnection {
    public final /* synthetic */ vx2 RAsUl2FVSrh6;
    public boolean TSizfFm2Yiuu;
    public IBinder Y1f8riQaR6yg;
    public ComponentName a92UlCVFR9N8;
    public final rx2 e9gEMXR7LXtO;
    public final HashMap PxuCJdSBwIXG = new HashMap();
    public int lS5Rgt96tfkO = 2;

    public tx2(vx2 vx2Var, rx2 rx2Var) {
        this.RAsUl2FVSrh6 = vx2Var;
        this.e9gEMXR7LXtO = rx2Var;
    }

    public final void PxuCJdSBwIXG(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.lS5Rgt96tfkO = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            vx2 vx2Var = this.RAsUl2FVSrh6;
            dr drVar = vx2Var.Y1f8riQaR6yg;
            Context context = vx2Var.lS5Rgt96tfkO;
            boolean TSizfFm2Yiuu = drVar.TSizfFm2Yiuu(context, str, this.e9gEMXR7LXtO.PxuCJdSBwIXG(context), this, 4225, executor);
            this.TSizfFm2Yiuu = TSizfFm2Yiuu;
            if (TSizfFm2Yiuu) {
                this.RAsUl2FVSrh6.TSizfFm2Yiuu.sendMessageDelayed(this.RAsUl2FVSrh6.TSizfFm2Yiuu.obtainMessage(1, this.e9gEMXR7LXtO), this.RAsUl2FVSrh6.a92UlCVFR9N8);
            } else {
                this.lS5Rgt96tfkO = 2;
                try {
                    vx2 vx2Var2 = this.RAsUl2FVSrh6;
                    vx2Var2.Y1f8riQaR6yg.lS5Rgt96tfkO(vx2Var2.lS5Rgt96tfkO, this);
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
        synchronized (this.RAsUl2FVSrh6.PxuCJdSBwIXG) {
            try {
                this.RAsUl2FVSrh6.TSizfFm2Yiuu.removeMessages(1, this.e9gEMXR7LXtO);
                this.Y1f8riQaR6yg = iBinder;
                this.a92UlCVFR9N8 = componentName;
                Iterator it = this.PxuCJdSBwIXG.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.lS5Rgt96tfkO = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.RAsUl2FVSrh6.PxuCJdSBwIXG) {
            try {
                this.RAsUl2FVSrh6.TSizfFm2Yiuu.removeMessages(1, this.e9gEMXR7LXtO);
                this.Y1f8riQaR6yg = null;
                this.a92UlCVFR9N8 = componentName;
                Iterator it = this.PxuCJdSBwIXG.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.lS5Rgt96tfkO = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
