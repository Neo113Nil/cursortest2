package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w71 extends to {
    public final ArrayList TSizfFm2Yiuu;
    public final w81 Y1f8riQaR6yg;
    public final rf1 a92UlCVFR9N8;
    public final v81 e9gEMXR7LXtO;
    public final v81 lS5Rgt96tfkO;

    public w71() {
        super(1);
        this.lS5Rgt96tfkO = th0.cpQdD2nAriOS();
        this.TSizfFm2Yiuu = new ArrayList();
        w81 w81Var = d02.PxuCJdSBwIXG;
        this.Y1f8riQaR6yg = new w81();
        this.e9gEMXR7LXtO = new v81();
        i72 i72Var = j72.Companion;
        l4 l4Var = new l4(10, this);
        i72Var.getClass();
        this.a92UlCVFR9N8 = i72.Y1f8riQaR6yg(l4Var);
    }

    @Override // defpackage.to
    public final void OPXfSBeufaJ8(ui uiVar) {
        this.e9gEMXR7LXtO.dgRBjINgWbAK(uiVar);
        TSizfFm2Yiuu(uiVar);
        Y1f8riQaR6yg();
    }

    @Override // defpackage.to
    public final void TSizfFm2Yiuu(v32 v32Var) {
        this.TSizfFm2Yiuu.add(new u71(v32Var));
    }

    @Override // defpackage.to
    public final void Y1f8riQaR6yg() {
        synchronized (this.PxuCJdSBwIXG) {
            try {
                ArrayList arrayList = this.TSizfFm2Yiuu;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    v71 v71Var = (v71) arrayList.get(i);
                    if (v71Var instanceof t71) {
                        th0.rtx2ld2ELZv4(this.lS5Rgt96tfkO, ((t71) v71Var).PxuCJdSBwIXG, ((t71) v71Var).lS5Rgt96tfkO);
                    } else {
                        if (!(v71Var instanceof u71)) {
                            throw new tm();
                        }
                        th0.BjEWd04qc7Mw(this.lS5Rgt96tfkO, ((u71) v71Var).PxuCJdSBwIXG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.TSizfFm2Yiuu.clear();
    }

    @Override // defpackage.to
    public final void e9gEMXR7LXtO() {
        this.a92UlCVFR9N8.lS5Rgt96tfkO();
        this.TSizfFm2Yiuu.clear();
        this.e9gEMXR7LXtO.PxuCJdSBwIXG();
        synchronized (this.PxuCJdSBwIXG) {
            this.lS5Rgt96tfkO.PxuCJdSBwIXG();
        }
    }

    @Override // defpackage.to
    public final le0 rtx2ld2ELZv4(v32 v32Var) {
        v81 v81Var = this.e9gEMXR7LXtO;
        le0 le0Var = (le0) v81Var.RAsUl2FVSrh6(v32Var);
        if (le0Var == null) {
            le0Var = new e9gEMXR7LXtO(19, this, v32Var);
            int a92UlCVFR9N8 = v81Var.a92UlCVFR9N8(v32Var);
            if (a92UlCVFR9N8 < 0) {
                a92UlCVFR9N8 = ~a92UlCVFR9N8;
            }
            Object[] objArr = v81Var.TSizfFm2Yiuu;
            Object obj = objArr[a92UlCVFR9N8];
            v81Var.lS5Rgt96tfkO[a92UlCVFR9N8] = v32Var;
            objArr[a92UlCVFR9N8] = le0Var;
        }
        return le0Var;
    }
}
