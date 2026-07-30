package defpackage;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zj1 extends gp2 {
    public ra2 BRwzKIf41E4i;
    public r4 EcgxDIVH5in8;
    public int OPXfSBeufaJ8;
    public boolean QrzZRwfaDlRX;
    public uf RAsUl2FVSrh6;
    public r4 RfyTYNmI9Srp;
    public final nx0 S9EYkSpbGuxq;
    public float TSizfFm2Yiuu = 1.0f;
    public final r4 XL4ISE6Oc65B;
    public List Y1f8riQaR6yg;
    public float a92UlCVFR9N8;
    public float cpQdD2nAriOS;
    public float dgRBjINgWbAK;
    public float e9gEMXR7LXtO;
    public boolean gPXPFXrUH4XX;
    public uf lS5Rgt96tfkO;
    public boolean r3s1LDPKFs1S;
    public int rtx2ld2ELZv4;
    public float wdg6QnbFHrFF;
    public float x50lh2ztY7Y5;

    public zj1() {
        int i = op2.PxuCJdSBwIXG;
        this.Y1f8riQaR6yg = p50.rtx2ld2ELZv4;
        this.e9gEMXR7LXtO = 1.0f;
        this.rtx2ld2ELZv4 = 0;
        this.OPXfSBeufaJ8 = 0;
        this.wdg6QnbFHrFF = 4.0f;
        this.x50lh2ztY7Y5 = 1.0f;
        this.r3s1LDPKFs1S = true;
        this.QrzZRwfaDlRX = true;
        r4 PxuCJdSBwIXG = t4.PxuCJdSBwIXG();
        this.XL4ISE6Oc65B = PxuCJdSBwIXG;
        this.RfyTYNmI9Srp = PxuCJdSBwIXG;
        this.S9EYkSpbGuxq = vi0.ryVscX7ZL4Ux(pz0.OPXfSBeufaJ8, dq.RfyTYNmI9Srp);
    }

    @Override // defpackage.gp2
    public final void PxuCJdSBwIXG(k30 k30Var) {
        k30 k30Var2;
        ra2 ra2Var;
        if (this.r3s1LDPKFs1S) {
            xi0.IXK6ba3ucyzm(this.Y1f8riQaR6yg, this.XL4ISE6Oc65B);
            e9gEMXR7LXtO();
        } else if (this.gPXPFXrUH4XX) {
            e9gEMXR7LXtO();
        }
        this.r3s1LDPKFs1S = false;
        this.gPXPFXrUH4XX = false;
        uf ufVar = this.lS5Rgt96tfkO;
        if (ufVar != null) {
            k30Var2 = k30Var;
            k30.rtx2ld2ELZv4(k30Var2, this.RfyTYNmI9Srp, ufVar, this.TSizfFm2Yiuu, null, 56);
        } else {
            k30Var2 = k30Var;
        }
        uf ufVar2 = this.RAsUl2FVSrh6;
        if (ufVar2 != null) {
            ra2 ra2Var2 = this.BRwzKIf41E4i;
            if (this.QrzZRwfaDlRX || ra2Var2 == null) {
                ra2 ra2Var3 = new ra2(this.a92UlCVFR9N8, this.wdg6QnbFHrFF, this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, 16);
                this.BRwzKIf41E4i = ra2Var3;
                this.QrzZRwfaDlRX = false;
                ra2Var = ra2Var3;
            } else {
                ra2Var = ra2Var2;
            }
            k30.rtx2ld2ELZv4(k30Var2, this.RfyTYNmI9Srp, ufVar2, this.e9gEMXR7LXtO, ra2Var, 48);
        }
    }

    public final void e9gEMXR7LXtO() {
        int i;
        float f = this.dgRBjINgWbAK;
        r4 r4Var = this.XL4ISE6Oc65B;
        if (f == 0.0f && this.x50lh2ztY7Y5 == 1.0f) {
            this.RfyTYNmI9Srp = r4Var;
            return;
        }
        if (cs0.wdg6QnbFHrFF(this.RfyTYNmI9Srp, r4Var)) {
            this.RfyTYNmI9Srp = t4.PxuCJdSBwIXG();
        } else {
            if (this.RfyTYNmI9Srp.PxuCJdSBwIXG.getFillType() == Path.FillType.EVEN_ODD) {
                bk1.Companion.getClass();
                i = 1;
            } else {
                bk1.Companion.getClass();
                i = 0;
            }
            this.RfyTYNmI9Srp.PxuCJdSBwIXG.rewind();
            this.RfyTYNmI9Srp.RAsUl2FVSrh6(i);
        }
        nx0 nx0Var = this.S9EYkSpbGuxq;
        ((s4) nx0Var.getValue()).PxuCJdSBwIXG.setPath(r4Var != null ? r4Var.PxuCJdSBwIXG : null, false);
        float length = ((s4) nx0Var.getValue()).PxuCJdSBwIXG.getLength();
        float f2 = this.dgRBjINgWbAK;
        float f3 = this.cpQdD2nAriOS;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.x50lh2ztY7Y5 + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((s4) nx0Var.getValue()).PxuCJdSBwIXG(f4, f5, this.RfyTYNmI9Srp);
            return;
        }
        r4 r4Var2 = this.EcgxDIVH5in8;
        if (r4Var2 == null) {
            r4Var2 = t4.PxuCJdSBwIXG();
            this.EcgxDIVH5in8 = r4Var2;
        }
        r4Var2.a92UlCVFR9N8();
        ((s4) nx0Var.getValue()).PxuCJdSBwIXG(f4, length, r4Var2);
        yj1.lS5Rgt96tfkO(this.RfyTYNmI9Srp, r4Var2);
        r4Var2.a92UlCVFR9N8();
        ((s4) nx0Var.getValue()).PxuCJdSBwIXG(0.0f, f5, r4Var2);
        yj1.lS5Rgt96tfkO(this.RfyTYNmI9Srp, r4Var2);
    }

    public final String toString() {
        return this.XL4ISE6Oc65B.toString();
    }
}
