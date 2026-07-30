package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vy1 implements ku1 {
    public zy1 OPXfSBeufaJ8;
    public m9 cpQdD2nAriOS;
    public Object dgRBjINgWbAK;
    public final uy1 r3s1LDPKFs1S = new uy1(0, this);
    public tz1 rtx2ld2ELZv4;
    public String wdg6QnbFHrFF;
    public Object[] x50lh2ztY7Y5;

    public vy1(tz1 tz1Var, zy1 zy1Var, String str, Object obj, Object[] objArr) {
        this.rtx2ld2ELZv4 = tz1Var;
        this.OPXfSBeufaJ8 = zy1Var;
        this.wdg6QnbFHrFF = str;
        this.dgRBjINgWbAK = obj;
        this.x50lh2ztY7Y5 = objArr;
    }

    @Override // defpackage.ku1
    public final void PxuCJdSBwIXG() {
        lS5Rgt96tfkO();
    }

    @Override // defpackage.ku1
    public final void TSizfFm2Yiuu() {
        m9 m9Var = this.cpQdD2nAriOS;
        if (m9Var != null) {
            m9Var.tmVwIGCQF4zR();
        }
    }

    @Override // defpackage.ku1
    public final void Y1f8riQaR6yg() {
        m9 m9Var = this.cpQdD2nAriOS;
        if (m9Var != null) {
            m9Var.tmVwIGCQF4zR();
        }
    }

    public final void lS5Rgt96tfkO() {
        String ZbWwgt3aGe7A;
        zy1 zy1Var = this.OPXfSBeufaJ8;
        if (this.cpQdD2nAriOS != null) {
            rc1.OPXfSBeufaJ8("entry(", this.cpQdD2nAriOS, ") is not null");
            return;
        }
        if (zy1Var != null) {
            uy1 uy1Var = this.r3s1LDPKFs1S;
            Object PxuCJdSBwIXG = uy1Var.PxuCJdSBwIXG();
            if (PxuCJdSBwIXG == null || zy1Var.Y1f8riQaR6yg(PxuCJdSBwIXG)) {
                this.cpQdD2nAriOS = zy1Var.PxuCJdSBwIXG(this.wdg6QnbFHrFF, uy1Var);
                return;
            }
            if (PxuCJdSBwIXG instanceof w72) {
                w72 w72Var = (w72) PxuCJdSBwIXG;
                if (w72Var.e9gEMXR7LXtO() == ih0.EcgxDIVH5in8 || w72Var.e9gEMXR7LXtO() == jx1.S2OOm9zPNm0h || w72Var.e9gEMXR7LXtO() == jx1.S9EYkSpbGuxq) {
                    ZbWwgt3aGe7A = "MutableState containing " + w72Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    ZbWwgt3aGe7A = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                ZbWwgt3aGe7A = sj0.ZbWwgt3aGe7A(PxuCJdSBwIXG);
            }
            throw new IllegalArgumentException(ZbWwgt3aGe7A);
        }
    }
}
