package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.PxuCJdSBwIXG;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cx2 extends sv2 {
    public PxuCJdSBwIXG Y1f8riQaR6yg;
    public final int e9gEMXR7LXtO;

    public cx2(PxuCJdSBwIXG pxuCJdSBwIXG, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.Y1f8riQaR6yg = pxuCJdSBwIXG;
        this.e9gEMXR7LXtO = i;
    }

    @Override // defpackage.sv2
    public final boolean e9gEMXR7LXtO(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) bx2.PxuCJdSBwIXG(parcel, Bundle.CREATOR);
            bx2.lS5Rgt96tfkO(parcel);
            jh0.cpQdD2nAriOS(this.Y1f8riQaR6yg, "onPostInitComplete can be called only once per call to getRemoteService");
            PxuCJdSBwIXG pxuCJdSBwIXG = this.Y1f8riQaR6yg;
            int i2 = this.e9gEMXR7LXtO;
            pxuCJdSBwIXG.getClass();
            hx2 hx2Var = new hx2(pxuCJdSBwIXG, readInt, readStrongBinder, bundle);
            yw2 yw2Var = pxuCJdSBwIXG.e9gEMXR7LXtO;
            yw2Var.sendMessage(yw2Var.obtainMessage(1, i2, -1, hx2Var));
            this.Y1f8riQaR6yg = null;
        } else if (i == 2) {
            parcel.readInt();
            bx2.lS5Rgt96tfkO(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            nx2 nx2Var = (nx2) bx2.PxuCJdSBwIXG(parcel, nx2.CREATOR);
            bx2.lS5Rgt96tfkO(parcel);
            PxuCJdSBwIXG pxuCJdSBwIXG2 = this.Y1f8riQaR6yg;
            jh0.cpQdD2nAriOS(pxuCJdSBwIXG2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            jh0.x50lh2ztY7Y5(nx2Var);
            pxuCJdSBwIXG2.S9EYkSpbGuxq = nx2Var;
            Bundle bundle2 = nx2Var.rtx2ld2ELZv4;
            jh0.cpQdD2nAriOS(this.Y1f8riQaR6yg, "onPostInitComplete can be called only once per call to getRemoteService");
            PxuCJdSBwIXG pxuCJdSBwIXG3 = this.Y1f8riQaR6yg;
            int i3 = this.e9gEMXR7LXtO;
            pxuCJdSBwIXG3.getClass();
            hx2 hx2Var2 = new hx2(pxuCJdSBwIXG3, readInt2, readStrongBinder2, bundle2);
            yw2 yw2Var2 = pxuCJdSBwIXG3.e9gEMXR7LXtO;
            yw2Var2.sendMessage(yw2Var2.obtainMessage(1, i3, -1, hx2Var2));
            this.Y1f8riQaR6yg = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
