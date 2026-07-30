package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class k7 implements p00 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final /* synthetic */ Object TSizfFm2Yiuu;
    public final /* synthetic */ Object Y1f8riQaR6yg;
    public final /* synthetic */ Object lS5Rgt96tfkO;

    public k7(wz wzVar, x91 x91Var, d82 d82Var) {
        this.PxuCJdSBwIXG = 1;
        this.TSizfFm2Yiuu = wzVar;
        this.Y1f8riQaR6yg = x91Var;
        this.lS5Rgt96tfkO = d82Var;
    }

    @Override // defpackage.p00
    public final void PxuCJdSBwIXG() {
        int i = this.PxuCJdSBwIXG;
        Object obj = this.Y1f8riQaR6yg;
        Object obj2 = this.TSizfFm2Yiuu;
        Object obj3 = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                ((d82) obj3).remove(obj2);
                ((y7) obj).Y1f8riQaR6yg.dgRBjINgWbAK(obj2);
                break;
            case 1:
                x91 x91Var = (x91) obj;
                ((wz) obj2).lS5Rgt96tfkO().TSizfFm2Yiuu(x91Var);
                ((d82) obj3).remove(x91Var);
                break;
            case 2:
                ((o01) obj3).rtx2ld2ELZv4().a92UlCVFR9N8((j01) obj2);
                fc fcVar = (fc) ((zt1) obj).rtx2ld2ELZv4;
                if (fcVar != null) {
                    fcVar.PxuCJdSBwIXG();
                    break;
                }
                break;
            default:
                yy1 yy1Var = (yy1) obj3;
                cz1 cz1Var = (cz1) obj;
                if (yy1Var.OPXfSBeufaJ8.dgRBjINgWbAK(obj2) == cz1Var) {
                    Map map = yy1Var.rtx2ld2ELZv4;
                    Map e9gEMXR7LXtO = cz1Var.e9gEMXR7LXtO();
                    if (!e9gEMXR7LXtO.isEmpty()) {
                        map.put(obj2, e9gEMXR7LXtO);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ k7(Object obj, Object obj2, Object obj3, int i) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
        this.TSizfFm2Yiuu = obj2;
        this.Y1f8riQaR6yg = obj3;
    }
}
