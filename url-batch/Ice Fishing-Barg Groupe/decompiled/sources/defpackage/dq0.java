package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dq0 implements ServiceConnection {
    public final op0 PxuCJdSBwIXG;
    public final /* synthetic */ eq0 lS5Rgt96tfkO;

    public dq0(eq0 eq0Var, op0 op0Var) {
        this.lS5Rgt96tfkO = eq0Var;
        this.PxuCJdSBwIXG = op0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        sm0 qm0Var;
        ni0.ozEBbv0hFTAB("Install Referrer service connected.");
        int i = rm0.TSizfFm2Yiuu;
        if (iBinder == null) {
            qm0Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            qm0Var = queryLocalInterface instanceof sm0 ? (sm0) queryLocalInterface : new qm0(iBinder);
        }
        eq0 eq0Var = this.lS5Rgt96tfkO;
        eq0Var.TSizfFm2Yiuu = qm0Var;
        eq0Var.PxuCJdSBwIXG = 2;
        this.PxuCJdSBwIXG.EcgxDIVH5in8(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ni0.tmVwIGCQF4zR("Install Referrer service disconnected.");
        eq0 eq0Var = this.lS5Rgt96tfkO;
        eq0Var.TSizfFm2Yiuu = null;
        eq0Var.PxuCJdSBwIXG = 0;
        bi biVar = (bi) this.PxuCJdSBwIXG.wdg6QnbFHrFF;
        if (biVar.S2OOm9zPNm0h() instanceof be1) {
            biVar.RAsUl2FVSrh6("");
        }
    }
}
