package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sc2 extends ns2 {
    public final /* synthetic */ uc2 dgRBjINgWbAK;
    public final HashMap wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc2(uc2 uc2Var) {
        super(0);
        this.dgRBjINgWbAK = uc2Var;
        this.wdg6QnbFHrFF = new HashMap();
    }

    @Override // defpackage.ns2
    public final void TSizfFm2Yiuu(xs2 xs2Var) {
        ArrayList arrayList = this.dgRBjINgWbAK.lS5Rgt96tfkO;
        if ((xs2Var.PxuCJdSBwIXG.Y1f8riQaR6yg() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((br1) arrayList.get(size)).e9gEMXR7LXtO++;
            }
        }
    }

    @Override // defpackage.ns2
    public final rt2 Y1f8riQaR6yg(rt2 rt2Var, List list) {
        ArrayList arrayList = this.dgRBjINgWbAK.lS5Rgt96tfkO;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            xs2 xs2Var = (xs2) list.get(size);
            Integer num = (Integer) this.wdg6QnbFHrFF.get(xs2Var);
            if (num != null) {
                int intValue = num.intValue();
                float PxuCJdSBwIXG = xs2Var.PxuCJdSBwIXG.PxuCJdSBwIXG();
                if ((intValue & 1) != 0) {
                    rectF.left = PxuCJdSBwIXG;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = PxuCJdSBwIXG;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = PxuCJdSBwIXG;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = PxuCJdSBwIXG;
                }
                i |= intValue;
            }
        }
        wp0 lS5Rgt96tfkO = wp0.lS5Rgt96tfkO(rt2Var.PxuCJdSBwIXG.rtx2ld2ELZv4(519), rt2Var.PxuCJdSBwIXG.rtx2ld2ELZv4(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            br1 br1Var = (br1) arrayList.get(size2);
            wp0 wp0Var = br1Var.Y1f8riQaR6yg;
            ArrayList arrayList2 = br1Var.PxuCJdSBwIXG;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                ol olVar = (ol) arrayList2.get(size3);
                int i2 = olVar.PxuCJdSBwIXG;
                if ((i2 & i) != 0) {
                    ar1 ar1Var = olVar.lS5Rgt96tfkO;
                    if (!ar1Var.Y1f8riQaR6yg) {
                        ar1Var.Y1f8riQaR6yg = true;
                        cr1 cr1Var = ar1Var.OPXfSBeufaJ8;
                        if (cr1Var != null) {
                            ((View) cr1Var.wdg6QnbFHrFF).setVisibility(0);
                        }
                    }
                    if (i2 == 1) {
                        int i3 = wp0Var.PxuCJdSBwIXG;
                        if (i3 > 0) {
                            olVar.lS5Rgt96tfkO(lS5Rgt96tfkO.PxuCJdSBwIXG / i3);
                        }
                        olVar.PxuCJdSBwIXG(rectF.left);
                    } else if (i2 == 2) {
                        int i4 = wp0Var.lS5Rgt96tfkO;
                        if (i4 > 0) {
                            olVar.lS5Rgt96tfkO(lS5Rgt96tfkO.lS5Rgt96tfkO / i4);
                        }
                        olVar.PxuCJdSBwIXG(rectF.top);
                    } else if (i2 == 4) {
                        int i5 = wp0Var.TSizfFm2Yiuu;
                        if (i5 > 0) {
                            olVar.lS5Rgt96tfkO(lS5Rgt96tfkO.TSizfFm2Yiuu / i5);
                        }
                        olVar.PxuCJdSBwIXG(rectF.right);
                    } else if (i2 == 8) {
                        int i6 = wp0Var.Y1f8riQaR6yg;
                        if (i6 > 0) {
                            olVar.lS5Rgt96tfkO(lS5Rgt96tfkO.Y1f8riQaR6yg / i6);
                        }
                        olVar.PxuCJdSBwIXG(rectF.bottom);
                    }
                }
            }
        }
        return rt2Var;
    }

    @Override // defpackage.ns2
    public final cr1 e9gEMXR7LXtO(xs2 xs2Var, cr1 cr1Var) {
        if ((xs2Var.PxuCJdSBwIXG.Y1f8riQaR6yg() & 519) != 0) {
            wp0 wp0Var = (wp0) cr1Var.wdg6QnbFHrFF;
            wp0 wp0Var2 = (wp0) cr1Var.OPXfSBeufaJ8;
            int i = wp0Var.PxuCJdSBwIXG != wp0Var2.PxuCJdSBwIXG ? 1 : 0;
            if (wp0Var.lS5Rgt96tfkO != wp0Var2.lS5Rgt96tfkO) {
                i |= 2;
            }
            if (wp0Var.TSizfFm2Yiuu != wp0Var2.TSizfFm2Yiuu) {
                i |= 4;
            }
            if (wp0Var.Y1f8riQaR6yg != wp0Var2.Y1f8riQaR6yg) {
                i |= 8;
            }
            this.wdg6QnbFHrFF.put(xs2Var, Integer.valueOf(i));
        }
        return cr1Var;
    }

    @Override // defpackage.ns2
    public final void lS5Rgt96tfkO(xs2 xs2Var) {
        ArrayList arrayList = this.dgRBjINgWbAK.lS5Rgt96tfkO;
        if ((xs2Var.PxuCJdSBwIXG.Y1f8riQaR6yg() & 519) != 0) {
            this.wdg6QnbFHrFF.remove(xs2Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                br1 br1Var = (br1) arrayList.get(size);
                int i = br1Var.e9gEMXR7LXtO;
                boolean z = i > 0;
                int i2 = i - 1;
                br1Var.e9gEMXR7LXtO = i2;
                if (z && i2 == 0) {
                    br1Var.TSizfFm2Yiuu();
                }
            }
        }
    }
}
