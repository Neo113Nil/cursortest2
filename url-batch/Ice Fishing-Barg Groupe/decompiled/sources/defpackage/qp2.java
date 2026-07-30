package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qp2 extends qi1 {
    public float OPXfSBeufaJ8;
    public final mp2 RAsUl2FVSrh6;
    public final mj1 a92UlCVFR9N8;
    public final mj1 e9gEMXR7LXtO;
    public final mj1 rtx2ld2ELZv4;
    public jl wdg6QnbFHrFF;

    public qp2(di0 di0Var) {
        a62.Companion.getClass();
        this.e9gEMXR7LXtO = sj0.tmVwIGCQF4zR(new a62(0L));
        this.a92UlCVFR9N8 = sj0.tmVwIGCQF4zR(Boolean.FALSE);
        mp2 mp2Var = new mp2(di0Var);
        mp2Var.a92UlCVFR9N8 = new y4(15, this);
        this.RAsUl2FVSrh6 = mp2Var;
        this.rtx2ld2ELZv4 = new mj1(no2.PxuCJdSBwIXG, ih0.EcgxDIVH5in8);
        this.OPXfSBeufaJ8 = 1.0f;
    }

    @Override // defpackage.qi1
    public final void PxuCJdSBwIXG(float f) {
        this.OPXfSBeufaJ8 = f;
    }

    @Override // defpackage.qi1
    public final long Y1f8riQaR6yg() {
        return ((a62) this.e9gEMXR7LXtO.getValue()).PxuCJdSBwIXG;
    }

    @Override // defpackage.qi1
    public final void e9gEMXR7LXtO(xw0 xw0Var) {
        ji jiVar = xw0Var.rtx2ld2ELZv4;
        jl jlVar = this.wdg6QnbFHrFF;
        mp2 mp2Var = this.RAsUl2FVSrh6;
        if (jlVar == null) {
            jlVar = (jl) mp2Var.RAsUl2FVSrh6.getValue();
        }
        if (((Boolean) this.a92UlCVFR9N8.getValue()).booleanValue() && xw0Var.getLayoutDirection() == cw0.OPXfSBeufaJ8) {
            long nxJAScVArhE9 = jiVar.nxJAScVArhE9();
            m9 m9Var = jiVar.OPXfSBeufaJ8;
            long S2OOm9zPNm0h = m9Var.S2OOm9zPNm0h();
            m9Var.gPXPFXrUH4XX().wdg6QnbFHrFF();
            try {
                ((i2) m9Var.OPXfSBeufaJ8).r3s1LDPKFs1S(-1.0f, 1.0f, nxJAScVArhE9);
                mp2Var.e9gEMXR7LXtO(xw0Var, this.OPXfSBeufaJ8, jlVar);
            } finally {
                m9Var.gPXPFXrUH4XX().RAsUl2FVSrh6();
                m9Var.ozEBbv0hFTAB(S2OOm9zPNm0h);
            }
        } else {
            mp2Var.e9gEMXR7LXtO(xw0Var, this.OPXfSBeufaJ8, jlVar);
        }
        this.rtx2ld2ELZv4.getValue();
    }

    @Override // defpackage.qi1
    public final void lS5Rgt96tfkO(jl jlVar) {
        this.wdg6QnbFHrFF = jlVar;
    }
}
