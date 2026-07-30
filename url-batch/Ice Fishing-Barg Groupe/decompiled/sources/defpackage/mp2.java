package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mp2 extends gp2 {
    public final mj1 OPXfSBeufaJ8;
    public final mj1 RAsUl2FVSrh6;
    public String TSizfFm2Yiuu;
    public boolean Y1f8riQaR6yg;
    public ae0 a92UlCVFR9N8;
    public final lp2 cpQdD2nAriOS;
    public float dgRBjINgWbAK;
    public final f30 e9gEMXR7LXtO;
    public final di0 lS5Rgt96tfkO;
    public td rtx2ld2ELZv4;
    public long wdg6QnbFHrFF;
    public float x50lh2ztY7Y5;

    public mp2(di0 di0Var) {
        this.lS5Rgt96tfkO = di0Var;
        di0Var.OPXfSBeufaJ8 = new lp2(this, 0);
        this.TSizfFm2Yiuu = "";
        this.Y1f8riQaR6yg = true;
        this.e9gEMXR7LXtO = new f30();
        this.a92UlCVFR9N8 = dq.VhhvGxCb8gfr;
        this.RAsUl2FVSrh6 = sj0.tmVwIGCQF4zR(null);
        a62.Companion.getClass();
        this.OPXfSBeufaJ8 = sj0.tmVwIGCQF4zR(new a62(0L));
        this.wdg6QnbFHrFF = 9205357640488583168L;
        this.dgRBjINgWbAK = 1.0f;
        this.x50lh2ztY7Y5 = 1.0f;
        this.cpQdD2nAriOS = new lp2(this, 1);
    }

    @Override // defpackage.gp2
    public final void PxuCJdSBwIXG(k30 k30Var) {
        e9gEMXR7LXtO(k30Var, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        if (r7.Y1f8riQaR6yg == r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e9gEMXR7LXtO(k30 k30Var, float f, jl jlVar) {
        int i;
        td tdVar;
        long j;
        k30 k30Var2;
        jl jlVar2;
        w3 w3Var;
        int i2;
        di0 di0Var = this.lS5Rgt96tfkO;
        boolean z = di0Var.Y1f8riQaR6yg;
        mj1 mj1Var = this.RAsUl2FVSrh6;
        if (z && di0Var.e9gEMXR7LXtO != 16 && op2.PxuCJdSBwIXG((jl) mj1Var.getValue()) && op2.PxuCJdSBwIXG(jlVar)) {
            an0.Companion.getClass();
            i = 1;
        } else {
            an0.Companion.getClass();
            i = 0;
        }
        boolean z2 = this.Y1f8riQaR6yg;
        f30 f30Var = this.e9gEMXR7LXtO;
        if (!z2 && a62.PxuCJdSBwIXG(this.wdg6QnbFHrFF, k30Var.Y1f8riQaR6yg())) {
            w3 w3Var2 = f30Var.PxuCJdSBwIXG;
            if (w3Var2 != null) {
                i2 = w3Var2.PxuCJdSBwIXG();
            } else {
                an0.Companion.getClass();
                i2 = 0;
            }
            if (i == i2) {
                k30Var2 = k30Var;
                if (jlVar != null) {
                    jlVar2 = jlVar;
                } else {
                    jlVar2 = ((jl) mj1Var.getValue()) != null ? (jl) mj1Var.getValue() : this.rtx2ld2ELZv4;
                }
                w3Var = f30Var.PxuCJdSBwIXG;
                if (w3Var == null) {
                    ep0.lS5Rgt96tfkO("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                }
                k30.gPXPFXrUH4XX(k30Var2, w3Var, f30Var.TSizfFm2Yiuu, 0L, f, jlVar2, 0, 858);
            }
        }
        an0.Companion.getClass();
        if (i == 1) {
            il ilVar = jl.Companion;
            long j2 = di0Var.e9gEMXR7LXtO;
            int i3 = op2.PxuCJdSBwIXG;
            if (hl.Y1f8riQaR6yg(j2) != 1.0f) {
                j2 = hl.lS5Rgt96tfkO(j2, 1.0f);
            }
            tdVar = il.PxuCJdSBwIXG(ilVar, j2);
        } else {
            tdVar = null;
        }
        this.rtx2ld2ELZv4 = tdVar;
        float intBitsToFloat = Float.intBitsToFloat((int) (k30Var.Y1f8riQaR6yg() >> 32));
        mj1 mj1Var2 = this.OPXfSBeufaJ8;
        this.dgRBjINgWbAK = intBitsToFloat / Float.intBitsToFloat((int) (((a62) mj1Var2.getValue()).PxuCJdSBwIXG >> 32));
        this.x50lh2ztY7Y5 = Float.intBitsToFloat((int) (k30Var.Y1f8riQaR6yg() & 4294967295L)) / Float.intBitsToFloat((int) (((a62) mj1Var2.getValue()).PxuCJdSBwIXG & 4294967295L));
        long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (k30Var.Y1f8riQaR6yg() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (k30Var.Y1f8riQaR6yg() & 4294967295L)))) & 4294967295L);
        cw0 layoutDirection = k30Var.getLayoutDirection();
        w3 w3Var3 = f30Var.PxuCJdSBwIXG;
        t0 t0Var = f30Var.lS5Rgt96tfkO;
        if (w3Var3 != null && t0Var != null) {
            int i4 = (int) (ceil >> 32);
            Bitmap bitmap = w3Var3.PxuCJdSBwIXG;
            if (i4 <= bitmap.getWidth()) {
                j = 4294967295L;
                if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                }
                w3Var3 = vi0.PxuCJdSBwIXG((int) (ceil >> 32), (int) (ceil & j), i);
                t0Var = zv.PxuCJdSBwIXG(w3Var3);
                f30Var.PxuCJdSBwIXG = w3Var3;
                f30Var.lS5Rgt96tfkO = t0Var;
                f30Var.Y1f8riQaR6yg = i;
                f30Var.TSizfFm2Yiuu = ceil;
                ji jiVar = f30Var.e9gEMXR7LXtO;
                long gGoUzNp9JO5I = kj0.gGoUzNp9JO5I(ceil);
                ii iiVar = jiVar.rtx2ld2ELZv4;
                hy hyVar = iiVar.PxuCJdSBwIXG;
                cw0 cw0Var = iiVar.lS5Rgt96tfkO;
                gi giVar = iiVar.TSizfFm2Yiuu;
                long j3 = iiVar.Y1f8riQaR6yg;
                k30Var2 = k30Var;
                iiVar.PxuCJdSBwIXG = k30Var2;
                iiVar.lS5Rgt96tfkO = layoutDirection;
                iiVar.TSizfFm2Yiuu = t0Var;
                iiVar.Y1f8riQaR6yg = gGoUzNp9JO5I;
                t0Var.wdg6QnbFHrFF();
                hl.Companion.getClass();
                long j4 = hl.lS5Rgt96tfkO;
                sd.Companion.getClass();
                k30.ozEBbv0hFTAB(jiVar, j4, 0L, 62);
                this.cpQdD2nAriOS.OPXfSBeufaJ8(jiVar);
                t0Var.RAsUl2FVSrh6();
                ii iiVar2 = jiVar.rtx2ld2ELZv4;
                iiVar2.PxuCJdSBwIXG = hyVar;
                iiVar2.lS5Rgt96tfkO = cw0Var;
                iiVar2.TSizfFm2Yiuu = giVar;
                iiVar2.Y1f8riQaR6yg = j3;
                w3Var3.PxuCJdSBwIXG.prepareToDraw();
                this.Y1f8riQaR6yg = false;
                this.wdg6QnbFHrFF = k30Var2.Y1f8riQaR6yg();
                if (jlVar != null) {
                }
                w3Var = f30Var.PxuCJdSBwIXG;
                if (w3Var == null) {
                }
                k30.gPXPFXrUH4XX(k30Var2, w3Var, f30Var.TSizfFm2Yiuu, 0L, f, jlVar2, 0, 858);
            }
        }
        j = 4294967295L;
        w3Var3 = vi0.PxuCJdSBwIXG((int) (ceil >> 32), (int) (ceil & j), i);
        t0Var = zv.PxuCJdSBwIXG(w3Var3);
        f30Var.PxuCJdSBwIXG = w3Var3;
        f30Var.lS5Rgt96tfkO = t0Var;
        f30Var.Y1f8riQaR6yg = i;
        f30Var.TSizfFm2Yiuu = ceil;
        ji jiVar2 = f30Var.e9gEMXR7LXtO;
        long gGoUzNp9JO5I2 = kj0.gGoUzNp9JO5I(ceil);
        ii iiVar3 = jiVar2.rtx2ld2ELZv4;
        hy hyVar2 = iiVar3.PxuCJdSBwIXG;
        cw0 cw0Var2 = iiVar3.lS5Rgt96tfkO;
        gi giVar2 = iiVar3.TSizfFm2Yiuu;
        long j32 = iiVar3.Y1f8riQaR6yg;
        k30Var2 = k30Var;
        iiVar3.PxuCJdSBwIXG = k30Var2;
        iiVar3.lS5Rgt96tfkO = layoutDirection;
        iiVar3.TSizfFm2Yiuu = t0Var;
        iiVar3.Y1f8riQaR6yg = gGoUzNp9JO5I2;
        t0Var.wdg6QnbFHrFF();
        hl.Companion.getClass();
        long j42 = hl.lS5Rgt96tfkO;
        sd.Companion.getClass();
        k30.ozEBbv0hFTAB(jiVar2, j42, 0L, 62);
        this.cpQdD2nAriOS.OPXfSBeufaJ8(jiVar2);
        t0Var.RAsUl2FVSrh6();
        ii iiVar22 = jiVar2.rtx2ld2ELZv4;
        iiVar22.PxuCJdSBwIXG = hyVar2;
        iiVar22.lS5Rgt96tfkO = cw0Var2;
        iiVar22.TSizfFm2Yiuu = giVar2;
        iiVar22.Y1f8riQaR6yg = j32;
        w3Var3.PxuCJdSBwIXG.prepareToDraw();
        this.Y1f8riQaR6yg = false;
        this.wdg6QnbFHrFF = k30Var2.Y1f8riQaR6yg();
        if (jlVar != null) {
        }
        w3Var = f30Var.PxuCJdSBwIXG;
        if (w3Var == null) {
        }
        k30.gPXPFXrUH4XX(k30Var2, w3Var, f30Var.TSizfFm2Yiuu, 0L, f, jlVar2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.TSizfFm2Yiuu);
        sb.append("\n\tviewportWidth: ");
        mj1 mj1Var = this.OPXfSBeufaJ8;
        sb.append(Float.intBitsToFloat((int) (((a62) mj1Var.getValue()).PxuCJdSBwIXG >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((a62) mj1Var.getValue()).PxuCJdSBwIXG & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
