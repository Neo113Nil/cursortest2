package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.PxuCJdSBwIXG;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gx2 implements ServiceConnection {
    public final int PxuCJdSBwIXG;
    public final /* synthetic */ PxuCJdSBwIXG lS5Rgt96tfkO;

    public gx2(PxuCJdSBwIXG pxuCJdSBwIXG, int i) {
        this.lS5Rgt96tfkO = pxuCJdSBwIXG;
        this.PxuCJdSBwIXG = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        PxuCJdSBwIXG pxuCJdSBwIXG = this.lS5Rgt96tfkO;
        if (iBinder == null) {
            synchronized (pxuCJdSBwIXG.a92UlCVFR9N8) {
                i = pxuCJdSBwIXG.cpQdD2nAriOS;
            }
            if (i == 3) {
                pxuCJdSBwIXG.EcgxDIVH5in8 = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            yw2 yw2Var = pxuCJdSBwIXG.e9gEMXR7LXtO;
            yw2Var.sendMessage(yw2Var.obtainMessage(i2, pxuCJdSBwIXG.VhhvGxCb8gfr.get(), 16));
            return;
        }
        synchronized (pxuCJdSBwIXG.RAsUl2FVSrh6) {
            try {
                PxuCJdSBwIXG pxuCJdSBwIXG2 = this.lS5Rgt96tfkO;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                pxuCJdSBwIXG2.rtx2ld2ELZv4 = (queryLocalInterface == null || !(queryLocalInterface instanceof ww2)) ? new ww2(iBinder) : (ww2) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        PxuCJdSBwIXG pxuCJdSBwIXG3 = this.lS5Rgt96tfkO;
        int i3 = this.PxuCJdSBwIXG;
        kx2 kx2Var = new kx2(pxuCJdSBwIXG3, 0);
        yw2 yw2Var2 = pxuCJdSBwIXG3.e9gEMXR7LXtO;
        yw2Var2.sendMessage(yw2Var2.obtainMessage(7, i3, -1, kx2Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        PxuCJdSBwIXG pxuCJdSBwIXG;
        synchronized (this.lS5Rgt96tfkO.RAsUl2FVSrh6) {
            pxuCJdSBwIXG = this.lS5Rgt96tfkO;
            pxuCJdSBwIXG.rtx2ld2ELZv4 = null;
        }
        int i = this.PxuCJdSBwIXG;
        yw2 yw2Var = pxuCJdSBwIXG.e9gEMXR7LXtO;
        yw2Var.sendMessage(yw2Var.obtainMessage(6, i, 1));
    }
}
