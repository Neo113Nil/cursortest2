package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dx0 implements hb2 {
    public float OPXfSBeufaJ8;
    public final /* synthetic */ jx0 dgRBjINgWbAK;
    public cw0 rtx2ld2ELZv4 = cw0.OPXfSBeufaJ8;
    public float wdg6QnbFHrFF;

    public dx0(jx0 jx0Var) {
        this.dgRBjINgWbAK = jx0Var;
    }

    @Override // defpackage.hb2
    public final List J54yh1s3n4Aq(pe0 pe0Var, Object obj) {
        jx0 jx0Var = this.dgRBjINgWbAK;
        jx0Var.rtx2ld2ELZv4();
        vw0 vw0Var = jx0Var.rtx2ld2ELZv4;
        rw0 rw0Var = vw0Var.ryVscX7ZL4Ux.Y1f8riQaR6yg;
        rw0 rw0Var2 = rw0.wdg6QnbFHrFF;
        rw0 rw0Var3 = rw0.rtx2ld2ELZv4;
        if (rw0Var != rw0Var3 && rw0Var != rw0Var2 && rw0Var != rw0.OPXfSBeufaJ8 && rw0Var != rw0.dgRBjINgWbAK) {
            ep0.lS5Rgt96tfkO("subcompose can only be used inside the measure or layout blocks");
        }
        v81 v81Var = jx0Var.r3s1LDPKFs1S;
        Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(obj);
        if (RAsUl2FVSrh6 == null) {
            RAsUl2FVSrh6 = (vw0) jx0Var.BRwzKIf41E4i.dgRBjINgWbAK(obj);
            if (RAsUl2FVSrh6 != null) {
                if (jx0Var.VhhvGxCb8gfr <= 0) {
                    ep0.lS5Rgt96tfkO("Check failed.");
                }
                jx0Var.VhhvGxCb8gfr--;
            } else {
                RAsUl2FVSrh6 = jx0Var.r3s1LDPKFs1S(obj);
                if (RAsUl2FVSrh6 == null) {
                    int i = jx0Var.dgRBjINgWbAK;
                    vw0 vw0Var2 = new vw0(2);
                    vw0Var.S2OOm9zPNm0h = true;
                    vw0Var.aF05bpZJlKEP(i, vw0Var2);
                    vw0Var.S2OOm9zPNm0h = false;
                    RAsUl2FVSrh6 = vw0Var2;
                }
            }
            v81Var.cpQdD2nAriOS(obj, RAsUl2FVSrh6);
        }
        vw0 vw0Var3 = (vw0) RAsUl2FVSrh6;
        if (zk.qYgDo2Ye5PY7(jx0Var.dgRBjINgWbAK, vw0Var.QrzZRwfaDlRX()) != vw0Var3) {
            int OPXfSBeufaJ8 = ((f91) ((n81) vw0Var.QrzZRwfaDlRX()).OPXfSBeufaJ8).OPXfSBeufaJ8(vw0Var3);
            if (OPXfSBeufaJ8 < jx0Var.dgRBjINgWbAK) {
                ep0.PxuCJdSBwIXG("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = jx0Var.dgRBjINgWbAK;
            if (i2 != OPXfSBeufaJ8) {
                jx0Var.wdg6QnbFHrFF(OPXfSBeufaJ8, i2);
            }
        }
        jx0Var.dgRBjINgWbAK++;
        jx0Var.cpQdD2nAriOS(vw0Var3, obj, false, pe0Var);
        return (rw0Var == rw0Var3 || rw0Var == rw0Var2) ? vw0Var3.cpQdD2nAriOS() : vw0Var3.x50lh2ztY7Y5();
    }

    @Override // defpackage.vr0
    public final boolean VhhvGxCb8gfr() {
        rw0 rw0Var = this.dgRBjINgWbAK.rtx2ld2ELZv4.ryVscX7ZL4Ux.Y1f8riQaR6yg;
        return rw0Var == rw0.dgRBjINgWbAK || rw0Var == rw0.OPXfSBeufaJ8;
    }

    @Override // defpackage.l51
    public final k51 gGoUzNp9JO5I(int i, int i2, Map map, le0 le0Var, le0 le0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ep0.lS5Rgt96tfkO("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new cx0(i, i2, map, le0Var, this, this.dgRBjINgWbAK, le0Var2);
    }

    @Override // defpackage.vr0
    public final cw0 getLayoutDirection() {
        return this.rtx2ld2ELZv4;
    }

    @Override // defpackage.hy
    public final float lS5Rgt96tfkO() {
        return this.OPXfSBeufaJ8;
    }

    @Override // defpackage.hy
    public final float r3s1LDPKFs1S() {
        return this.wdg6QnbFHrFF;
    }
}
