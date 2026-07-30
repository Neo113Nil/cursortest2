package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.PxuCJdSBwIXG;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hx2 extends uw2 {
    public final IBinder RAsUl2FVSrh6;
    public final /* synthetic */ PxuCJdSBwIXG rtx2ld2ELZv4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx2(PxuCJdSBwIXG pxuCJdSBwIXG, int i, IBinder iBinder, Bundle bundle) {
        super(pxuCJdSBwIXG, i, bundle);
        this.rtx2ld2ELZv4 = pxuCJdSBwIXG;
        this.RAsUl2FVSrh6 = iBinder;
    }

    @Override // defpackage.uw2
    public final void PxuCJdSBwIXG(xq xqVar) {
        b42 b42Var = this.rtx2ld2ELZv4.QrzZRwfaDlRX;
        if (b42Var != null) {
            ((eh0) b42Var.OPXfSBeufaJ8).lS5Rgt96tfkO(xqVar);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.uw2
    public final boolean lS5Rgt96tfkO() {
        IBinder iBinder = this.RAsUl2FVSrh6;
        try {
            jh0.x50lh2ztY7Y5(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            PxuCJdSBwIXG pxuCJdSBwIXG = this.rtx2ld2ELZv4;
            if (!pxuCJdSBwIXG.XL4ISE6Oc65B().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + pxuCJdSBwIXG.XL4ISE6Oc65B() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface cpQdD2nAriOS = pxuCJdSBwIXG.cpQdD2nAriOS(iBinder);
            if (cpQdD2nAriOS == null || !(PxuCJdSBwIXG.S9EYkSpbGuxq(pxuCJdSBwIXG, 2, 4, cpQdD2nAriOS) || PxuCJdSBwIXG.S9EYkSpbGuxq(pxuCJdSBwIXG, 3, 4, cpQdD2nAriOS))) {
                return false;
            }
            pxuCJdSBwIXG.RfyTYNmI9Srp = null;
            b42 b42Var = pxuCJdSBwIXG.r3s1LDPKFs1S;
            if (b42Var == null) {
                return true;
            }
            ((dh0) b42Var.OPXfSBeufaJ8).Y1f8riQaR6yg();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
