package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y62 {
    public static final w62 Companion = new w62();
    public final x62 BRwzKIf41E4i;
    public boolean OPXfSBeufaJ8;
    public ae0 PxuCJdSBwIXG;
    public final fj1 QrzZRwfaDlRX;
    public final fj1 TSizfFm2Yiuu;
    public final n91 XL4ISE6Oc65B;
    public le0 Y1f8riQaR6yg;
    public final fj1 gPXPFXrUH4XX;
    public final tk lS5Rgt96tfkO;
    public final boolean e9gEMXR7LXtO = true;
    public final float[] a92UlCVFR9N8 = new float[0];
    public final hj1 RAsUl2FVSrh6 = new hj1(0);
    public final hj1 rtx2ld2ELZv4 = new hj1(0);
    public final hj1 wdg6QnbFHrFF = new hj1(0);
    public final hj1 dgRBjINgWbAK = new hj1(0);
    public final th1 x50lh2ztY7Y5 = th1.OPXfSBeufaJ8;
    public final mj1 cpQdD2nAriOS = sj0.tmVwIGCQF4zR(Boolean.FALSE);
    public final uy1 r3s1LDPKFs1S = new uy1(10, this);

    public y62(float f, ae0 ae0Var, tk tkVar) {
        this.PxuCJdSBwIXG = ae0Var;
        this.lS5Rgt96tfkO = tkVar;
        this.TSizfFm2Yiuu = new fj1(f);
        float f2 = tkVar.PxuCJdSBwIXG;
        float f3 = tkVar.lS5Rgt96tfkO - f2;
        this.QrzZRwfaDlRX = new fj1(ni0.rZjpSjn4zoMv(0.0f, 0.0f, ng0.OPXfSBeufaJ8(f3 == 0.0f ? 0.0f : (f - f2) / f3, 0.0f, 1.0f)));
        this.gPXPFXrUH4XX = new fj1(0.0f);
        this.BRwzKIf41E4i = new x62(this);
        this.XL4ISE6Oc65B = new n91();
    }

    public final void PxuCJdSBwIXG(float f) {
        float max;
        float min;
        if (this.x50lh2ztY7Y5 == th1.rtx2ld2ELZv4) {
            float rtx2ld2ELZv4 = this.rtx2ld2ELZv4.rtx2ld2ELZv4();
            hj1 hj1Var = this.dgRBjINgWbAK;
            max = Math.max(rtx2ld2ELZv4 - (hj1Var.rtx2ld2ELZv4() / 2.0f), 0.0f);
            min = Math.min(hj1Var.rtx2ld2ELZv4() / 2.0f, max);
        } else {
            float rtx2ld2ELZv42 = this.RAsUl2FVSrh6.rtx2ld2ELZv4();
            hj1 hj1Var2 = this.wdg6QnbFHrFF;
            max = Math.max(rtx2ld2ELZv42 - (hj1Var2.rtx2ld2ELZv4() / 2.0f), 0.0f);
            min = Math.min(hj1Var2.rtx2ld2ELZv4() / 2.0f, max);
        }
        fj1 fj1Var = this.QrzZRwfaDlRX;
        float rtx2ld2ELZv43 = fj1Var.rtx2ld2ELZv4() + f;
        fj1 fj1Var2 = this.gPXPFXrUH4XX;
        fj1Var.OPXfSBeufaJ8(fj1Var2.rtx2ld2ELZv4() + rtx2ld2ELZv43);
        fj1Var2.OPXfSBeufaJ8(0.0f);
        float e9gEMXR7LXtO = v62.e9gEMXR7LXtO(fj1Var.rtx2ld2ELZv4(), this.a92UlCVFR9N8, min, max);
        tk tkVar = this.lS5Rgt96tfkO;
        float f2 = max - min;
        float rZjpSjn4zoMv = ni0.rZjpSjn4zoMv(tkVar.PxuCJdSBwIXG, tkVar.lS5Rgt96tfkO, ng0.OPXfSBeufaJ8(f2 == 0.0f ? 0.0f : (e9gEMXR7LXtO - min) / f2, 0.0f, 1.0f));
        if (rZjpSjn4zoMv == this.TSizfFm2Yiuu.rtx2ld2ELZv4()) {
            return;
        }
        le0 le0Var = this.Y1f8riQaR6yg;
        if (le0Var != null) {
            le0Var.OPXfSBeufaJ8(Float.valueOf(rZjpSjn4zoMv));
        } else {
            TSizfFm2Yiuu(rZjpSjn4zoMv);
        }
    }

    public final void TSizfFm2Yiuu(float f) {
        if (this.e9gEMXR7LXtO) {
            tk tkVar = this.lS5Rgt96tfkO;
            float f2 = tkVar.PxuCJdSBwIXG;
            float f3 = tkVar.lS5Rgt96tfkO;
            f = v62.e9gEMXR7LXtO(ng0.OPXfSBeufaJ8(f, f2, f3), this.a92UlCVFR9N8, f2, f3);
        }
        this.TSizfFm2Yiuu.OPXfSBeufaJ8(f);
    }

    public final float lS5Rgt96tfkO() {
        tk tkVar = this.lS5Rgt96tfkO;
        float f = tkVar.PxuCJdSBwIXG;
        float f2 = tkVar.lS5Rgt96tfkO;
        float OPXfSBeufaJ8 = ng0.OPXfSBeufaJ8(this.TSizfFm2Yiuu.rtx2ld2ELZv4(), f, f2);
        float f3 = f2 - f;
        return ng0.OPXfSBeufaJ8(f3 == 0.0f ? 0.0f : (OPXfSBeufaJ8 - f) / f3, 0.0f, 1.0f);
    }
}
