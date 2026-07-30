package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class di0 extends gp2 {
    public float BRwzKIf41E4i;
    public le0 OPXfSBeufaJ8;
    public float QrzZRwfaDlRX;
    public boolean RAsUl2FVSrh6;
    public boolean RfyTYNmI9Srp;
    public float XL4ISE6Oc65B;
    public List a92UlCVFR9N8;
    public float cpQdD2nAriOS;
    public String dgRBjINgWbAK;
    public long e9gEMXR7LXtO;
    public float gPXPFXrUH4XX;
    public float[] lS5Rgt96tfkO;
    public float r3s1LDPKFs1S;
    public r4 rtx2ld2ELZv4;
    public final y wdg6QnbFHrFF;
    public float x50lh2ztY7Y5;
    public final ArrayList TSizfFm2Yiuu = new ArrayList();
    public boolean Y1f8riQaR6yg = true;

    public di0() {
        hl.Companion.getClass();
        this.e9gEMXR7LXtO = hl.RAsUl2FVSrh6;
        int i = op2.PxuCJdSBwIXG;
        this.a92UlCVFR9N8 = p50.rtx2ld2ELZv4;
        this.RAsUl2FVSrh6 = true;
        this.wdg6QnbFHrFF = new y(14, this);
        this.dgRBjINgWbAK = "";
        this.QrzZRwfaDlRX = 1.0f;
        this.gPXPFXrUH4XX = 1.0f;
        this.RfyTYNmI9Srp = true;
    }

    @Override // defpackage.gp2
    public final void PxuCJdSBwIXG(k30 k30Var) {
        if (this.RfyTYNmI9Srp) {
            float[] fArr = this.lS5Rgt96tfkO;
            if (fArr == null) {
                fArr = d51.PxuCJdSBwIXG();
                this.lS5Rgt96tfkO = fArr;
            } else {
                d51.Y1f8riQaR6yg(fArr);
            }
            d51.a92UlCVFR9N8(fArr, this.BRwzKIf41E4i + this.cpQdD2nAriOS, this.XL4ISE6Oc65B + this.r3s1LDPKFs1S);
            float f = this.x50lh2ztY7Y5;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = (f3 * cos) + (f2 * f5);
                float f7 = fArr[1];
                float f8 = fArr[5];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = (f8 * cos) + (f7 * f5);
                float f11 = fArr[2];
                float f12 = fArr[6];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = (f12 * cos) + (f11 * f5);
                float f15 = fArr[3];
                float f16 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f9;
                fArr[2] = f13;
                fArr[3] = (sin * f16) + (cos * f15);
                fArr[4] = f6;
                fArr[5] = f10;
                fArr[6] = f14;
                fArr[7] = (cos * f16) + (f5 * f15);
            }
            float f17 = this.QrzZRwfaDlRX;
            float f18 = this.gPXPFXrUH4XX;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f17;
                fArr[1] = fArr[1] * f17;
                fArr[2] = fArr[2] * f17;
                fArr[3] = fArr[3] * f17;
                fArr[4] = fArr[4] * f18;
                fArr[5] = fArr[5] * f18;
                fArr[6] = fArr[6] * f18;
                fArr[7] = fArr[7] * f18;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            d51.a92UlCVFR9N8(fArr, -this.cpQdD2nAriOS, -this.r3s1LDPKFs1S);
            this.RfyTYNmI9Srp = false;
        }
        if (this.RAsUl2FVSrh6) {
            if (!this.a92UlCVFR9N8.isEmpty()) {
                r4 r4Var = this.rtx2ld2ELZv4;
                if (r4Var == null) {
                    r4Var = t4.PxuCJdSBwIXG();
                    this.rtx2ld2ELZv4 = r4Var;
                }
                xi0.IXK6ba3ucyzm(this.a92UlCVFR9N8, r4Var);
            }
            this.RAsUl2FVSrh6 = false;
        }
        m9 rZjpSjn4zoMv = k30Var.rZjpSjn4zoMv();
        long S2OOm9zPNm0h = rZjpSjn4zoMv.S2OOm9zPNm0h();
        rZjpSjn4zoMv.gPXPFXrUH4XX().wdg6QnbFHrFF();
        try {
            m9 m9Var = (m9) ((i2) rZjpSjn4zoMv.OPXfSBeufaJ8).OPXfSBeufaJ8;
            float[] fArr2 = this.lS5Rgt96tfkO;
            if (fArr2 != null) {
                m9Var.gPXPFXrUH4XX().XL4ISE6Oc65B(fArr2);
            }
            r4 r4Var2 = this.rtx2ld2ELZv4;
            if (!this.a92UlCVFR9N8.isEmpty() && r4Var2 != null) {
                pk.Companion.getClass();
                m9Var.gPXPFXrUH4XX().BRwzKIf41E4i(r4Var2);
            }
            ArrayList arrayList = this.TSizfFm2Yiuu;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gp2) arrayList.get(i)).PxuCJdSBwIXG(k30Var);
            }
        } finally {
            rZjpSjn4zoMv.gPXPFXrUH4XX().RAsUl2FVSrh6();
            rZjpSjn4zoMv.ozEBbv0hFTAB(S2OOm9zPNm0h);
        }
    }

    public final void RAsUl2FVSrh6(gp2 gp2Var) {
        if (!(gp2Var instanceof zj1)) {
            if (gp2Var instanceof di0) {
                di0 di0Var = (di0) gp2Var;
                if (di0Var.Y1f8riQaR6yg && this.Y1f8riQaR6yg) {
                    a92UlCVFR9N8(di0Var.e9gEMXR7LXtO);
                    return;
                }
                this.Y1f8riQaR6yg = false;
                hl.Companion.getClass();
                this.e9gEMXR7LXtO = hl.RAsUl2FVSrh6;
                return;
            }
            return;
        }
        zj1 zj1Var = (zj1) gp2Var;
        uf ufVar = zj1Var.lS5Rgt96tfkO;
        if (this.Y1f8riQaR6yg && ufVar != null) {
            if (ufVar instanceof m82) {
                a92UlCVFR9N8(((m82) ufVar).PxuCJdSBwIXG);
            } else {
                this.Y1f8riQaR6yg = false;
                hl.Companion.getClass();
                this.e9gEMXR7LXtO = hl.RAsUl2FVSrh6;
            }
        }
        uf ufVar2 = zj1Var.RAsUl2FVSrh6;
        if (this.Y1f8riQaR6yg && ufVar2 != null) {
            if (ufVar2 instanceof m82) {
                a92UlCVFR9N8(((m82) ufVar2).PxuCJdSBwIXG);
                return;
            }
            this.Y1f8riQaR6yg = false;
            hl.Companion.getClass();
            this.e9gEMXR7LXtO = hl.RAsUl2FVSrh6;
        }
    }

    @Override // defpackage.gp2
    public final void Y1f8riQaR6yg(y yVar) {
        this.OPXfSBeufaJ8 = yVar;
    }

    public final void a92UlCVFR9N8(long j) {
        if (this.Y1f8riQaR6yg && j != 16) {
            long j2 = this.e9gEMXR7LXtO;
            if (j2 == 16) {
                this.e9gEMXR7LXtO = j;
                return;
            }
            int i = op2.PxuCJdSBwIXG;
            if (hl.rtx2ld2ELZv4(j2) == hl.rtx2ld2ELZv4(j) && hl.RAsUl2FVSrh6(j2) == hl.RAsUl2FVSrh6(j) && hl.e9gEMXR7LXtO(j2) == hl.e9gEMXR7LXtO(j)) {
                return;
            }
            this.Y1f8riQaR6yg = false;
            hl.Companion.getClass();
            this.e9gEMXR7LXtO = hl.RAsUl2FVSrh6;
        }
    }

    public final void e9gEMXR7LXtO(int i, gp2 gp2Var) {
        ArrayList arrayList = this.TSizfFm2Yiuu;
        if (i < arrayList.size()) {
            arrayList.set(i, gp2Var);
        } else {
            arrayList.add(gp2Var);
        }
        RAsUl2FVSrh6(gp2Var);
        gp2Var.Y1f8riQaR6yg(this.wdg6QnbFHrFF);
        TSizfFm2Yiuu();
    }

    @Override // defpackage.gp2
    public final le0 lS5Rgt96tfkO() {
        return this.OPXfSBeufaJ8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.dgRBjINgWbAK);
        ArrayList arrayList = this.TSizfFm2Yiuu;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gp2 gp2Var = (gp2) arrayList.get(i);
            sb.append("\t");
            sb.append(gp2Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
