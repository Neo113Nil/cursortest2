package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class rf1 implements lf1 {
    public final /* synthetic */ Object rtx2ld2ELZv4;

    public /* synthetic */ rf1(Object obj) {
        this.rtx2ld2ELZv4 = obj;
    }

    @Override // defpackage.lf1
    public rt2 PxuCJdSBwIXG(View view, rt2 rt2Var) {
        uc2 uc2Var = (uc2) this.rtx2ld2ELZv4;
        ArrayList arrayList = uc2Var.lS5Rgt96tfkO;
        ot2 ot2Var = rt2Var.PxuCJdSBwIXG;
        wp0 lS5Rgt96tfkO = wp0.lS5Rgt96tfkO(ot2Var.rtx2ld2ELZv4(519), ot2Var.rtx2ld2ELZv4(64));
        wp0 lS5Rgt96tfkO2 = wp0.lS5Rgt96tfkO(ot2Var.OPXfSBeufaJ8(519), ot2Var.OPXfSBeufaJ8(64));
        if (!lS5Rgt96tfkO.equals(uc2Var.TSizfFm2Yiuu) || !lS5Rgt96tfkO2.equals(uc2Var.Y1f8riQaR6yg)) {
            uc2Var.TSizfFm2Yiuu = lS5Rgt96tfkO;
            uc2Var.Y1f8riQaR6yg = lS5Rgt96tfkO2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                br1 br1Var = (br1) arrayList.get(size);
                br1Var.TSizfFm2Yiuu = lS5Rgt96tfkO;
                br1Var.Y1f8riQaR6yg = lS5Rgt96tfkO2;
                br1Var.TSizfFm2Yiuu();
            }
        }
        return rt2Var;
    }

    public void lS5Rgt96tfkO() {
        pe0 pe0Var = (pe0) this.rtx2ld2ELZv4;
        synchronized (s72.TSizfFm2Yiuu) {
            List list = s72.rtx2ld2ELZv4;
            list.getClass();
            ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && cs0.wdg6QnbFHrFF(obj, pe0Var)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            s72.rtx2ld2ELZv4 = arrayList;
        }
    }
}
