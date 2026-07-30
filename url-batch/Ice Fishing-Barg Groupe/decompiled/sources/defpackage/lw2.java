package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lw2 extends bw2 {
    public final vd2 lS5Rgt96tfkO;

    public lw2(vd2 vd2Var) {
        super(4);
        this.lS5Rgt96tfkO = vd2Var;
    }

    @Override // defpackage.bw2
    public final boolean PxuCJdSBwIXG(uv2 uv2Var) {
        if (uv2Var.rtx2ld2ELZv4.get(null) == null) {
            return false;
        }
        u9.VhhvGxCb8gfr();
        return false;
    }

    @Override // defpackage.bw2
    public final void TSizfFm2Yiuu(Status status) {
        this.lS5Rgt96tfkO.PxuCJdSBwIXG(new i9(status));
    }

    @Override // defpackage.bw2
    public final void Y1f8riQaR6yg(Exception exc) {
        this.lS5Rgt96tfkO.PxuCJdSBwIXG(exc);
    }

    @Override // defpackage.bw2
    public final void e9gEMXR7LXtO(uv2 uv2Var) {
        try {
            rtx2ld2ELZv4(uv2Var);
        } catch (DeadObjectException e) {
            TSizfFm2Yiuu(bw2.RAsUl2FVSrh6(e));
            throw e;
        } catch (RemoteException e2) {
            TSizfFm2Yiuu(bw2.RAsUl2FVSrh6(e2));
        } catch (RuntimeException e3) {
            this.lS5Rgt96tfkO.PxuCJdSBwIXG(e3);
        }
    }

    @Override // defpackage.bw2
    public final t70[] lS5Rgt96tfkO(uv2 uv2Var) {
        if (uv2Var.rtx2ld2ELZv4.get(null) == null) {
            return null;
        }
        u9.VhhvGxCb8gfr();
        return null;
    }

    public final void rtx2ld2ELZv4(uv2 uv2Var) {
        if (uv2Var.rtx2ld2ELZv4.remove(null) != null) {
            u9.VhhvGxCb8gfr();
            return;
        }
        vd2 vd2Var = this.lS5Rgt96tfkO;
        Boolean bool = Boolean.FALSE;
        uj ujVar = vd2Var.PxuCJdSBwIXG;
        synchronized (ujVar.lS5Rgt96tfkO) {
            try {
                if (ujVar.PxuCJdSBwIXG) {
                    return;
                }
                ujVar.PxuCJdSBwIXG = true;
                ujVar.Y1f8riQaR6yg = bool;
                ((bh2) ujVar.TSizfFm2Yiuu).e9gEMXR7LXtO(ujVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bw2
    public final /* bridge */ /* synthetic */ void a92UlCVFR9N8(cr1 cr1Var, boolean z) {
    }
}
