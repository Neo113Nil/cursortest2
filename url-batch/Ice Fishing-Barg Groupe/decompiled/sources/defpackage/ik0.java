package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ik0 extends m61 implements ol2, do1, aq {
    public b5 S2OOm9zPNm0h;
    public r10 VhhvGxCb8gfr;
    public boolean ZbWwgt3aGe7A;

    public ik0(b5 b5Var, r10 r10Var) {
        this.VhhvGxCb8gfr = r10Var;
        this.S2OOm9zPNm0h = b5Var;
    }

    @Override // defpackage.do1
    public final void EpkonXwzFgDB(qn1 qn1Var, rn1 rn1Var, long j) {
        if (rn1Var == rn1.OPXfSBeufaJ8) {
            List list = qn1Var.PxuCJdSBwIXG;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Yadk4uqlxLy8(((ao1) list.get(i)).OPXfSBeufaJ8)) {
                    int i2 = qn1Var.a92UlCVFR9N8;
                    un1.Companion.getClass();
                    if (i2 == 4) {
                        this.ZbWwgt3aGe7A = true;
                        fkblLSN2bAgv();
                        return;
                    } else {
                        if (qn1Var.a92UlCVFR9N8 == 5) {
                            MDTGUQSX7PXD();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.m61
    public final void IxJ9cAW40yOk() {
        MDTGUQSX7PXD();
    }

    @Override // defpackage.do1
    public final void JTxCbbCwomzt() {
        MDTGUQSX7PXD();
    }

    public final void MDTGUQSX7PXD() {
        if (this.ZbWwgt3aGe7A) {
            this.ZbWwgt3aGe7A = false;
            if (this.S9EYkSpbGuxq) {
                zt1 zt1Var = new zt1();
                jh0.J54yh1s3n4Aq(this, new j1(1, zt1Var));
                ik0 ik0Var = (ik0) zt1Var.rtx2ld2ELZv4;
                if (ik0Var != null) {
                    ik0Var.W7ceZOzvrRuI();
                } else {
                    X1HMmH2Ks65g(null);
                }
            }
        }
    }

    @Override // defpackage.do1
    public final long S9EYkSpbGuxq() {
        if (this.VhhvGxCb8gfr == null) {
            hk2.Companion.getClass();
            return hk2.PxuCJdSBwIXG;
        }
        hy hyVar = zv.zf8DYfih6EZu(this).rZjpSjn4zoMv;
        gk2 gk2Var = hk2.Companion;
        int POWyO8hTM6YC = hyVar.POWyO8hTM6YC(10.0f);
        int POWyO8hTM6YC2 = hyVar.POWyO8hTM6YC(40.0f);
        int POWyO8hTM6YC3 = hyVar.POWyO8hTM6YC(10.0f);
        int POWyO8hTM6YC4 = hyVar.POWyO8hTM6YC(40.0f);
        gk2Var.getClass();
        return gk2.lS5Rgt96tfkO(POWyO8hTM6YC, POWyO8hTM6YC2, POWyO8hTM6YC3, POWyO8hTM6YC4);
    }

    public final void W7ceZOzvrRuI() {
        b5 b5Var;
        zt1 zt1Var = new zt1();
        jh0.J54yh1s3n4Aq(this, new gi1(zt1Var));
        ik0 ik0Var = (ik0) zt1Var.rtx2ld2ELZv4;
        if (ik0Var == null || (b5Var = ik0Var.S2OOm9zPNm0h) == null) {
            b5Var = this.S2OOm9zPNm0h;
        }
        X1HMmH2Ks65g(b5Var);
    }

    public abstract void X1HMmH2Ks65g(yn1 yn1Var);

    public abstract boolean Yadk4uqlxLy8(int i);

    public final void fkblLSN2bAgv() {
        vt1 vt1Var = new vt1();
        vt1Var.rtx2ld2ELZv4 = true;
        jh0.EpkonXwzFgDB(this, new u10(vt1Var));
        if (vt1Var.rtx2ld2ELZv4) {
            W7ceZOzvrRuI();
        }
    }
}
