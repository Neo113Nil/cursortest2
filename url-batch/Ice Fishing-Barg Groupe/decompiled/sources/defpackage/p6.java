package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p6 extends TextPaint {
    public l30 OPXfSBeufaJ8;
    public j4 PxuCJdSBwIXG;
    public ty RAsUl2FVSrh6;
    public int TSizfFm2Yiuu;
    public w42 Y1f8riQaR6yg;
    public uf a92UlCVFR9N8;
    public hl e9gEMXR7LXtO;
    public if2 lS5Rgt96tfkO;
    public a62 rtx2ld2ELZv4;

    public final j4 PxuCJdSBwIXG() {
        j4 j4Var = this.PxuCJdSBwIXG;
        if (j4Var != null) {
            return j4Var;
        }
        j4 j4Var2 = new j4(this);
        this.PxuCJdSBwIXG = j4Var2;
        return j4Var2;
    }

    public final void RAsUl2FVSrh6(if2 if2Var) {
        if (if2Var == null || cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, if2Var)) {
            return;
        }
        this.lS5Rgt96tfkO = if2Var;
        hf2 hf2Var = if2.Companion;
        hf2Var.getClass();
        int i = if2Var.PxuCJdSBwIXG;
        setUnderlineText((i | 1) == i);
        if2 if2Var2 = this.lS5Rgt96tfkO;
        hf2Var.getClass();
        int i2 = if2Var2.PxuCJdSBwIXG;
        setStrikeThruText((i2 | 2) == i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if ((r1 == null ? false : defpackage.a62.PxuCJdSBwIXG(r1.PxuCJdSBwIXG, r5)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TSizfFm2Yiuu(uf ufVar, long j, float f) {
        if (ufVar == null) {
            this.RAsUl2FVSrh6 = null;
            this.a92UlCVFR9N8 = null;
            this.rtx2ld2ELZv4 = null;
            setShader(null);
            return;
        }
        if (ufVar instanceof m82) {
            Y1f8riQaR6yg(jh0.IAToe7bXGz4N(((m82) ufVar).PxuCJdSBwIXG, f));
            return;
        }
        if (!(ufVar instanceof vf)) {
            u9.gPXPFXrUH4XX();
            return;
        }
        if (cs0.wdg6QnbFHrFF(this.a92UlCVFR9N8, ufVar)) {
            a62 a62Var = this.rtx2ld2ELZv4;
        }
        if (j != 9205357640488583168L) {
            this.a92UlCVFR9N8 = ufVar;
            this.rtx2ld2ELZv4 = new a62(j);
            this.RAsUl2FVSrh6 = sj0.RfyTYNmI9Srp(new o5(ufVar, j));
        }
        j4 PxuCJdSBwIXG = PxuCJdSBwIXG();
        ty tyVar = this.RAsUl2FVSrh6;
        PxuCJdSBwIXG.dgRBjINgWbAK(tyVar != null ? (Shader) tyVar.getValue() : null);
        this.e9gEMXR7LXtO = null;
        bs0.ozEBbv0hFTAB(this, f);
    }

    public final void Y1f8riQaR6yg(long j) {
        hl hlVar = this.e9gEMXR7LXtO;
        if ((hlVar == null ? false : hl.TSizfFm2Yiuu(hlVar.PxuCJdSBwIXG, j)) || j == 16) {
            return;
        }
        this.e9gEMXR7LXtO = new hl(j);
        setColor(mm2.ngxnMNrpiKat(j));
        this.RAsUl2FVSrh6 = null;
        this.a92UlCVFR9N8 = null;
        this.rtx2ld2ELZv4 = null;
        setShader(null);
    }

    public final void a92UlCVFR9N8(w42 w42Var) {
        if (w42Var == null || cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, w42Var)) {
            return;
        }
        this.Y1f8riQaR6yg = w42Var;
        w42.Companion.getClass();
        if (w42Var.equals(w42.Y1f8riQaR6yg)) {
            clearShadowLayer();
            return;
        }
        w42 w42Var2 = this.Y1f8riQaR6yg;
        float f = w42Var2.TSizfFm2Yiuu;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (w42Var2.lS5Rgt96tfkO >> 32)), Float.intBitsToFloat((int) (this.Y1f8riQaR6yg.lS5Rgt96tfkO & 4294967295L)), mm2.ngxnMNrpiKat(this.Y1f8riQaR6yg.PxuCJdSBwIXG));
    }

    public final void e9gEMXR7LXtO(l30 l30Var) {
        if (l30Var == null || cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, l30Var)) {
            return;
        }
        this.OPXfSBeufaJ8 = l30Var;
        if (l30Var.equals(u70.PxuCJdSBwIXG)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(l30Var instanceof ra2)) {
            u9.gPXPFXrUH4XX();
            return;
        }
        j4 PxuCJdSBwIXG = PxuCJdSBwIXG();
        ui1.Companion.getClass();
        PxuCJdSBwIXG.QrzZRwfaDlRX(1);
        ra2 ra2Var = (ra2) l30Var;
        PxuCJdSBwIXG().r3s1LDPKFs1S(ra2Var.PxuCJdSBwIXG);
        j4 PxuCJdSBwIXG2 = PxuCJdSBwIXG();
        ((Paint) PxuCJdSBwIXG2.TSizfFm2Yiuu).setStrokeMiter(ra2Var.lS5Rgt96tfkO);
        PxuCJdSBwIXG().cpQdD2nAriOS(ra2Var.Y1f8riQaR6yg);
        PxuCJdSBwIXG().x50lh2ztY7Y5(ra2Var.TSizfFm2Yiuu);
        ((Paint) PxuCJdSBwIXG().TSizfFm2Yiuu).setPathEffect(null);
    }

    public final void lS5Rgt96tfkO(int i) {
        if (i == this.TSizfFm2Yiuu) {
            return;
        }
        PxuCJdSBwIXG().RAsUl2FVSrh6(i);
        this.TSizfFm2Yiuu = i;
    }
}
