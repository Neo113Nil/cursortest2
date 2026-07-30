package defpackage;

import android.view.DragEvent;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g3 implements View.OnDragListener, s10 {
    public final v10 PxuCJdSBwIXG;
    public final f3 TSizfFm2Yiuu;
    public final ma lS5Rgt96tfkO;

    public g3() {
        v10 v10Var = new v10();
        ir0.Companion.getClass();
        v10Var.ZbWwgt3aGe7A = 0L;
        this.PxuCJdSBwIXG = v10Var;
        this.lS5Rgt96tfkO = new ma(0);
        this.TSizfFm2Yiuu = new f3(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        int i = 10;
        i2 i2Var = new i2(i, dragEvent);
        int action = dragEvent.getAction();
        ml2 ml2Var = ml2.rtx2ld2ELZv4;
        ma maVar = this.lS5Rgt96tfkO;
        v10 v10Var = this.PxuCJdSBwIXG;
        switch (action) {
            case 1:
                v10Var.getClass();
                vt1 vt1Var = new vt1();
                u10 u10Var = new u10(i2Var, v10Var, vt1Var);
                if (u10Var.OPXfSBeufaJ8(v10Var) == ml2Var) {
                    jh0.EpkonXwzFgDB(v10Var, u10Var);
                }
                boolean z = vt1Var.rtx2ld2ELZv4;
                maVar.getClass();
                ga gaVar = new ga(maVar);
                while (gaVar.hasNext()) {
                    ((v10) gaVar.next()).MDTGUQSX7PXD();
                }
                break;
            case 2:
                v10Var.Yadk4uqlxLy8(i2Var);
                break;
            case 4:
                v10Var.getClass();
                y yVar = new y(i, i2Var);
                if (yVar.OPXfSBeufaJ8(v10Var) == ml2Var) {
                    jh0.EpkonXwzFgDB(v10Var, yVar);
                }
                maVar.clear();
                break;
            case 5:
                v10Var.X1HMmH2Ks65g();
                break;
            case 6:
                v10Var.fkblLSN2bAgv();
                break;
        }
        return false;
    }
}
