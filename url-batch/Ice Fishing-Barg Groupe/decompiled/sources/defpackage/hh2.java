package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class hh2 implements le0 {
    public final /* synthetic */ hy OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ d91 wdg6QnbFHrFF;

    public /* synthetic */ hh2(hy hyVar, d91 d91Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = hyVar;
        this.wdg6QnbFHrFF = d91Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.rtx2ld2ELZv4;
        d91 d91Var = this.wdg6QnbFHrFF;
        hy hyVar = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                k61 k61Var = n61.Companion;
                xw1 xw1Var = new xw1(15, (ae0) obj);
                hh2 hh2Var = new hh2(hyVar, d91Var, 1);
                rm1.Companion.getClass();
                k32 k32Var = f41.PxuCJdSBwIXG;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
                }
                tm1 tm1Var = i2 == 28 ? tm1.lS5Rgt96tfkO : tm1.TSizfFm2Yiuu;
                p10.Companion.getClass();
                k10.Companion.getClass();
                if (i2 < 28) {
                    return k61Var;
                }
                c41 c41Var = new c41(xw1Var, hh2Var, tm1Var);
                k61Var.getClass();
                return c41Var;
            default:
                p10 p10Var = (p10) obj;
                d91Var.setValue(new ir0((hyVar.POWyO8hTM6YC(p10.PxuCJdSBwIXG(p10Var.PxuCJdSBwIXG)) & 4294967295L) | (hyVar.POWyO8hTM6YC(p10.lS5Rgt96tfkO(p10Var.PxuCJdSBwIXG)) << 32)));
                return no2.PxuCJdSBwIXG;
        }
    }
}
