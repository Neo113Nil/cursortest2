package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kw2 extends bw2 {
    public final vd2 TSizfFm2Yiuu;
    public final ih0 Y1f8riQaR6yg;
    public final bh2 lS5Rgt96tfkO;

    public kw2(bh2 bh2Var, vd2 vd2Var, ih0 ih0Var) {
        super(2);
        this.TSizfFm2Yiuu = vd2Var;
        this.lS5Rgt96tfkO = bh2Var;
        this.Y1f8riQaR6yg = ih0Var;
        if (bh2Var.PxuCJdSBwIXG) {
            u9.XL4ISE6Oc65B("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.bw2
    public final boolean PxuCJdSBwIXG(uv2 uv2Var) {
        return this.lS5Rgt96tfkO.PxuCJdSBwIXG;
    }

    @Override // defpackage.bw2
    public final void TSizfFm2Yiuu(Status status) {
        this.Y1f8riQaR6yg.getClass();
        this.TSizfFm2Yiuu.PxuCJdSBwIXG(status.wdg6QnbFHrFF != null ? new gv1(status) : new i9(status));
    }

    @Override // defpackage.bw2
    public final void Y1f8riQaR6yg(Exception exc) {
        this.TSizfFm2Yiuu.PxuCJdSBwIXG(exc);
    }

    @Override // defpackage.bw2
    public final void a92UlCVFR9N8(cr1 cr1Var, boolean z) {
        vd2 vd2Var = this.TSizfFm2Yiuu;
        ((Map) cr1Var.wdg6QnbFHrFF).put(vd2Var, Boolean.valueOf(z));
        uj ujVar = vd2Var.PxuCJdSBwIXG;
        cr1 cr1Var2 = new cr1(13, cr1Var, vd2Var, false);
        ujVar.getClass();
        ((bh2) ujVar.TSizfFm2Yiuu).Y1f8riQaR6yg(new lx2(wd2.PxuCJdSBwIXG, cr1Var2));
        synchronized (ujVar.lS5Rgt96tfkO) {
            try {
                if (ujVar.PxuCJdSBwIXG) {
                    ((bh2) ujVar.TSizfFm2Yiuu).e9gEMXR7LXtO(ujVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bw2
    public final void e9gEMXR7LXtO(uv2 uv2Var) {
        vd2 vd2Var = this.TSizfFm2Yiuu;
        try {
            this.lS5Rgt96tfkO.PxuCJdSBwIXG(uv2Var.Y1f8riQaR6yg, vd2Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            TSizfFm2Yiuu(bw2.RAsUl2FVSrh6(e2));
        } catch (RuntimeException e3) {
            vd2Var.PxuCJdSBwIXG(e3);
        }
    }

    @Override // defpackage.bw2
    public final t70[] lS5Rgt96tfkO(uv2 uv2Var) {
        return (t70[]) this.lS5Rgt96tfkO.lS5Rgt96tfkO;
    }
}
