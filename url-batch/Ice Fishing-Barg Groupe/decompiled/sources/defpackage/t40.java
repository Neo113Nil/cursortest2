package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t40 extends bs0 {
    public final /* synthetic */ u40 kpCQ9veP6n3I;

    public t40(u40 u40Var) {
        this.kpCQ9veP6n3I = u40Var;
    }

    @Override // defpackage.bs0
    public final void IAToe7bXGz4N(Throwable th) {
        this.kpCQ9veP6n3I.PxuCJdSBwIXG.a92UlCVFR9N8(th);
    }

    @Override // defpackage.bs0
    public final void e6tOsSdd2EFb(e0 e0Var) {
        u40 u40Var = this.kpCQ9veP6n3I;
        u40Var.TSizfFm2Yiuu = e0Var;
        e0 e0Var2 = u40Var.TSizfFm2Yiuu;
        x40 x40Var = u40Var.PxuCJdSBwIXG;
        u40Var.lS5Rgt96tfkO = new m9(e0Var2, x40Var.RAsUl2FVSrh6, x40Var.OPXfSBeufaJ8, Build.VERSION.SDK_INT >= 34 ? c50.PxuCJdSBwIXG() : cs0.ZbWwgt3aGe7A());
        x40 x40Var2 = u40Var.PxuCJdSBwIXG;
        ArrayList arrayList = new ArrayList();
        x40Var2.PxuCJdSBwIXG.writeLock().lock();
        try {
            x40Var2.TSizfFm2Yiuu = 1;
            arrayList.addAll(x40Var2.lS5Rgt96tfkO);
            x40Var2.lS5Rgt96tfkO.clear();
            x40Var2.PxuCJdSBwIXG.writeLock().unlock();
            x40Var2.Y1f8riQaR6yg.post(new th(arrayList, x40Var2.TSizfFm2Yiuu, (Throwable) null));
        } catch (Throwable th) {
            x40Var2.PxuCJdSBwIXG.writeLock().unlock();
            throw th;
        }
    }
}
