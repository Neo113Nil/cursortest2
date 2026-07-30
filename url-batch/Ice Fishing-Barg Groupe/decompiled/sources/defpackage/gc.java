package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gc implements p00 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final /* synthetic */ Object TSizfFm2Yiuu;
    public final /* synthetic */ Object lS5Rgt96tfkO;

    public /* synthetic */ gc(int i, Object obj, Object obj2) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
        this.TSizfFm2Yiuu = obj2;
    }

    @Override // defpackage.p00
    public final void PxuCJdSBwIXG() {
        int i = this.PxuCJdSBwIXG;
        Object obj = this.TSizfFm2Yiuu;
        Object obj2 = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                ((cc) obj2).lS5Rgt96tfkO((zn) obj);
                break;
            case 1:
                ((x91) obj2).QrzZRwfaDlRX.wdg6QnbFHrFF.a92UlCVFR9N8((oz) obj);
                break;
            case 2:
                ((vo0) obj2).PxuCJdSBwIXG.wdg6QnbFHrFF((to0) obj);
                break;
            case 3:
                ((o01) obj2).rtx2ld2ELZv4().a92UlCVFR9N8((xm) obj);
                break;
            case 4:
                ((nz0) obj2).wdg6QnbFHrFF.dgRBjINgWbAK(obj);
                break;
            case 5:
                Iterator it = ((List) ((i92) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((go) obj).lS5Rgt96tfkO().TSizfFm2Yiuu((x91) it.next());
                }
                break;
            case 6:
                ((cc) obj2).lS5Rgt96tfkO((mo) obj);
                break;
            case 7:
                d91 d91Var = (d91) obj2;
                wp1 wp1Var = (wp1) d91Var.getValue();
                if (wp1Var != null) {
                    vp1 vp1Var = new vp1(wp1Var);
                    e81 e81Var = (e81) obj;
                    if (e81Var != null) {
                        e81Var.lS5Rgt96tfkO(vp1Var);
                    }
                    d91Var.setValue(null);
                    break;
                }
                break;
            case 8:
                ((gl2) obj2).wdg6QnbFHrFF.remove((gl2) obj);
                break;
            case 9:
                gl2 gl2Var = (gl2) obj2;
                gl2Var.getClass();
                bl2 bl2Var = (bl2) ((cl2) obj).lS5Rgt96tfkO.getValue();
                if (bl2Var != null) {
                    gl2Var.OPXfSBeufaJ8.remove(bl2Var.rtx2ld2ELZv4);
                    break;
                }
                break;
            case 10:
                ((gl2) obj2).OPXfSBeufaJ8.remove((fl2) obj);
                break;
            default:
                xt2 xt2Var = (xt2) obj2;
                View view = (View) obj;
                int i2 = xt2Var.EcgxDIVH5in8 - 1;
                xt2Var.EcgxDIVH5in8 = i2;
                if (i2 == 0) {
                    int i3 = rq2.PxuCJdSBwIXG;
                    mq2.lS5Rgt96tfkO(view, null);
                    rq2.PxuCJdSBwIXG(view, null);
                    view.removeOnAttachStateChangeListener(xt2Var.S9EYkSpbGuxq);
                    break;
                }
                break;
        }
    }
}
