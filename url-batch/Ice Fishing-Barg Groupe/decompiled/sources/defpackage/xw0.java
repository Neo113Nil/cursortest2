package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xw0 implements k30 {
    public i30 OPXfSBeufaJ8;
    public final ji rtx2ld2ELZv4 = new ji();

    @Override // defpackage.k30
    public final void EcgxDIVH5in8(float f, long j, long j2) {
        this.rtx2ld2ELZv4.EcgxDIVH5in8(f, j, j2);
    }

    @Override // defpackage.hy
    public final long IAToe7bXGz4N(long j) {
        return this.rtx2ld2ELZv4.IAToe7bXGz4N(j);
    }

    @Override // defpackage.k30
    public final void JHNfcAUfKc4G(yj1 yj1Var, long j, l30 l30Var) {
        this.rtx2ld2ELZv4.JHNfcAUfKc4G(yj1Var, j, l30Var);
    }

    @Override // defpackage.hy
    public final int POWyO8hTM6YC(float f) {
        return this.rtx2ld2ELZv4.POWyO8hTM6YC(f);
    }

    @Override // defpackage.k30
    public final void PsecLrZVVK61(long j, long j2, long j3, float f) {
        this.rtx2ld2ELZv4.PsecLrZVVK61(j, j2, j3, f);
    }

    public final void PxuCJdSBwIXG() {
        ji jiVar = this.rtx2ld2ELZv4;
        gi gPXPFXrUH4XX = jiVar.OPXfSBeufaJ8.gPXPFXrUH4XX();
        tx txVar = this.OPXfSBeufaJ8;
        if (txVar == null) {
            throw o0.a92UlCVFR9N8("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        m61 m61Var = (m61) txVar;
        m61 m61Var2 = m61Var.rtx2ld2ELZv4.cpQdD2nAriOS;
        if (m61Var2 != null && (m61Var2.dgRBjINgWbAK & 4) != 0) {
            while (m61Var2 != null) {
                int i = m61Var2.wdg6QnbFHrFF;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    m61Var2 = m61Var2.cpQdD2nAriOS;
                }
            }
        }
        m61Var2 = null;
        if (m61Var2 == null) {
            pd1 POWyO8hTM6YC = zv.POWyO8hTM6YC(txVar, 4);
            if (POWyO8hTM6YC.kRWHK87H9qm4() == m61Var.rtx2ld2ELZv4) {
                POWyO8hTM6YC = POWyO8hTM6YC.S2OOm9zPNm0h;
                POWyO8hTM6YC.getClass();
            }
            POWyO8hTM6YC.k(gPXPFXrUH4XX, (ph0) jiVar.OPXfSBeufaJ8.wdg6QnbFHrFF);
            return;
        }
        f91 f91Var = null;
        while (m61Var2 != null) {
            if (m61Var2 instanceof i30) {
                i30 i30Var = (i30) m61Var2;
                ph0 ph0Var = (ph0) jiVar.OPXfSBeufaJ8.wdg6QnbFHrFF;
                pd1 POWyO8hTM6YC2 = zv.POWyO8hTM6YC(i30Var, 4);
                long gGoUzNp9JO5I = kj0.gGoUzNp9JO5I(POWyO8hTM6YC2.wdg6QnbFHrFF);
                vw0 vw0Var = POWyO8hTM6YC2.VhhvGxCb8gfr;
                vw0Var.getClass();
                ((r1) yw0.PxuCJdSBwIXG(vw0Var)).getSharedDrawScope().TSizfFm2Yiuu(gPXPFXrUH4XX, gGoUzNp9JO5I, POWyO8hTM6YC2, i30Var, ph0Var);
            } else if ((m61Var2.wdg6QnbFHrFF & 4) != 0 && (m61Var2 instanceof ux)) {
                int i2 = 0;
                for (m61 m61Var3 = ((ux) m61Var2).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                    if ((m61Var3.wdg6QnbFHrFF & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            m61Var2 = m61Var3;
                        } else {
                            if (f91Var == null) {
                                f91Var = new f91(new m61[16]);
                            }
                            if (m61Var2 != null) {
                                f91Var.lS5Rgt96tfkO(m61Var2);
                                m61Var2 = null;
                            }
                            f91Var.lS5Rgt96tfkO(m61Var3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            m61Var2 = zv.dgRBjINgWbAK(f91Var);
        }
    }

    public final void TSizfFm2Yiuu(gi giVar, long j, pd1 pd1Var, i30 i30Var, ph0 ph0Var) {
        i30 i30Var2 = this.OPXfSBeufaJ8;
        this.OPXfSBeufaJ8 = i30Var;
        cw0 cw0Var = pd1Var.VhhvGxCb8gfr.BjEWd04qc7Mw;
        ji jiVar = this.rtx2ld2ELZv4;
        m9 m9Var = jiVar.OPXfSBeufaJ8;
        ii iiVar = ((ji) m9Var.dgRBjINgWbAK).rtx2ld2ELZv4;
        hy hyVar = iiVar.PxuCJdSBwIXG;
        cw0 cw0Var2 = iiVar.lS5Rgt96tfkO;
        gi gPXPFXrUH4XX = m9Var.gPXPFXrUH4XX();
        m9 m9Var2 = jiVar.OPXfSBeufaJ8;
        long S2OOm9zPNm0h = m9Var2.S2OOm9zPNm0h();
        ph0 ph0Var2 = (ph0) m9Var2.wdg6QnbFHrFF;
        m9Var2.rZjpSjn4zoMv(pd1Var);
        m9Var2.BjEWd04qc7Mw(cw0Var);
        m9Var2.kpCQ9veP6n3I(giVar);
        m9Var2.ozEBbv0hFTAB(j);
        m9Var2.wdg6QnbFHrFF = ph0Var;
        giVar.wdg6QnbFHrFF();
        try {
            i30Var.Pf0ThKz3j5YS(this);
            giVar.RAsUl2FVSrh6();
            m9Var2.rZjpSjn4zoMv(hyVar);
            m9Var2.BjEWd04qc7Mw(cw0Var2);
            m9Var2.kpCQ9veP6n3I(gPXPFXrUH4XX);
            m9Var2.ozEBbv0hFTAB(S2OOm9zPNm0h);
            m9Var2.wdg6QnbFHrFF = ph0Var2;
            this.OPXfSBeufaJ8 = i30Var2;
        } catch (Throwable th) {
            giVar.RAsUl2FVSrh6();
            m9Var2.rZjpSjn4zoMv(hyVar);
            m9Var2.BjEWd04qc7Mw(cw0Var2);
            m9Var2.kpCQ9veP6n3I(gPXPFXrUH4XX);
            m9Var2.ozEBbv0hFTAB(S2OOm9zPNm0h);
            m9Var2.wdg6QnbFHrFF = ph0Var2;
            throw th;
        }
    }

    @Override // defpackage.k30
    public final long Y1f8riQaR6yg() {
        return this.rtx2ld2ELZv4.Y1f8riQaR6yg();
    }

    @Override // defpackage.k30
    public final void ZbWwgt3aGe7A(long j, long j2, long j3, long j4) {
        this.rtx2ld2ELZv4.ZbWwgt3aGe7A(j, j2, j3, j4);
    }

    @Override // defpackage.k30
    public final void amuv7NJvPxHu(long j, long j2, long j3, int i) {
        this.rtx2ld2ELZv4.amuv7NJvPxHu(j, j2, j3, i);
    }

    @Override // defpackage.hy
    public final long bEKsvqmvPh2y(long j) {
        return this.rtx2ld2ELZv4.bEKsvqmvPh2y(j);
    }

    @Override // defpackage.k30
    public final void cJeY36nTk9tz(ym0 ym0Var, long j, long j2, long j3, float f, jl jlVar, int i) {
        this.rtx2ld2ELZv4.cJeY36nTk9tz(ym0Var, j, j2, j3, f, jlVar, i);
    }

    @Override // defpackage.hy
    public final float e4HgwifUDUCA(int i) {
        return this.rtx2ld2ELZv4.e4HgwifUDUCA(i);
    }

    @Override // defpackage.hy
    public final float e6tOsSdd2EFb(float f) {
        return this.rtx2ld2ELZv4.lS5Rgt96tfkO() * f;
    }

    @Override // defpackage.k30
    public final cw0 getLayoutDirection() {
        return this.rtx2ld2ELZv4.rtx2ld2ELZv4.lS5Rgt96tfkO;
    }

    @Override // defpackage.k30
    public final void hnJvRxDXo0hm(yj1 yj1Var, uf ufVar, float f, l30 l30Var, int i) {
        this.rtx2ld2ELZv4.hnJvRxDXo0hm(yj1Var, ufVar, f, l30Var, i);
    }

    @Override // defpackage.hy
    public final float lS5Rgt96tfkO() {
        return this.rtx2ld2ELZv4.lS5Rgt96tfkO();
    }

    @Override // defpackage.k30
    public final long nxJAScVArhE9() {
        return this.rtx2ld2ELZv4.nxJAScVArhE9();
    }

    @Override // defpackage.hy
    public final long pnx5pC0XzaCw(float f) {
        return this.rtx2ld2ELZv4.pnx5pC0XzaCw(f);
    }

    @Override // defpackage.hy
    public final float qudtW7lwm99e(long j) {
        return this.rtx2ld2ELZv4.qudtW7lwm99e(j);
    }

    @Override // defpackage.hy
    public final float r3s1LDPKFs1S() {
        return this.rtx2ld2ELZv4.r3s1LDPKFs1S();
    }

    @Override // defpackage.k30
    public final m9 rZjpSjn4zoMv() {
        return this.rtx2ld2ELZv4.OPXfSBeufaJ8;
    }

    @Override // defpackage.hy
    public final long uVlwi32qvXeJ(float f) {
        return this.rtx2ld2ELZv4.uVlwi32qvXeJ(f);
    }

    @Override // defpackage.hy
    public final float uy1Qfkdvj4xZ(float f) {
        return f / this.rtx2ld2ELZv4.lS5Rgt96tfkO();
    }

    @Override // defpackage.hy
    public final float xfACYKDMU6Dj(long j) {
        return this.rtx2ld2ELZv4.xfACYKDMU6Dj(j);
    }
}
