package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hx0 implements eb2 {
    public final d81 PxuCJdSBwIXG;
    public final /* synthetic */ Object TSizfFm2Yiuu;
    public final /* synthetic */ jx0 lS5Rgt96tfkO;

    public hx0(jx0 jx0Var, Object obj) {
        this.lS5Rgt96tfkO = jx0Var;
        this.TSizfFm2Yiuu = obj;
        int[] iArr = gr0.PxuCJdSBwIXG;
        this.PxuCJdSBwIXG = new d81();
    }

    @Override // defpackage.eb2
    public final void PxuCJdSBwIXG() {
        jx0.TSizfFm2Yiuu(this.lS5Rgt96tfkO, this.TSizfFm2Yiuu);
    }

    @Override // defpackage.eb2
    public final int TSizfFm2Yiuu() {
        vw0 vw0Var = (vw0) this.lS5Rgt96tfkO.BRwzKIf41E4i.RAsUl2FVSrh6(this.TSizfFm2Yiuu);
        if (vw0Var != null) {
            return ((f91) ((n81) vw0Var.r3s1LDPKFs1S()).OPXfSBeufaJ8).wdg6QnbFHrFF;
        }
        return 0;
    }

    @Override // defpackage.eb2
    public final void Y1f8riQaR6yg(int i, long j) {
        jx0 jx0Var = this.lS5Rgt96tfkO;
        vw0 vw0Var = (vw0) jx0Var.BRwzKIf41E4i.RAsUl2FVSrh6(this.TSizfFm2Yiuu);
        if (vw0Var == null || !vw0Var.J54yh1s3n4Aq()) {
            return;
        }
        int i2 = ((f91) ((n81) vw0Var.r3s1LDPKFs1S()).OPXfSBeufaJ8).wdg6QnbFHrFF;
        if (i < 0 || i >= i2) {
            ep0.Y1f8riQaR6yg("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (vw0Var.EpkonXwzFgDB()) {
            ep0.PxuCJdSBwIXG("Pre-measure called on node that is not placed");
        }
        vw0 vw0Var2 = jx0Var.rtx2ld2ELZv4;
        vw0Var2.S2OOm9zPNm0h = true;
        ((r1) yw0.PxuCJdSBwIXG(vw0Var)).ZbWwgt3aGe7A((vw0) ((n81) vw0Var.r3s1LDPKFs1S()).get(i), j);
        vw0Var2.S2OOm9zPNm0h = false;
        this.PxuCJdSBwIXG.PxuCJdSBwIXG(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ib1] */
    /* JADX WARN: Type inference failed for: r5v10, types: [m61] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [m61] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [f91] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [f91] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.eb2
    public final void lS5Rgt96tfkO(ib1 ib1Var) {
        ml2 ml2Var;
        kd1 kd1Var;
        vw0 vw0Var = (vw0) this.lS5Rgt96tfkO.BRwzKIf41E4i.RAsUl2FVSrh6(this.TSizfFm2Yiuu);
        m61 m61Var = (vw0Var == null || (kd1Var = vw0Var.nLZGh9p8gVSu) == null) ? null : kd1Var.a92UlCVFR9N8;
        if (m61Var == null || !m61Var.S9EYkSpbGuxq) {
            return;
        }
        if (!m61Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitSubtreeIf called on an unattached node");
        }
        f91 f91Var = new f91(new m61[16]);
        m61 m61Var2 = m61Var.rtx2ld2ELZv4;
        m61 m61Var3 = m61Var2.cpQdD2nAriOS;
        if (m61Var3 == null) {
            zv.OPXfSBeufaJ8(f91Var, m61Var2);
        } else {
            f91Var.lS5Rgt96tfkO(m61Var3);
        }
        while (true) {
            int i = f91Var.wdg6QnbFHrFF;
            if (i == 0) {
                return;
            }
            m61 m61Var4 = (m61) f91Var.dgRBjINgWbAK(i - 1);
            if ((m61Var4.dgRBjINgWbAK & 262144) != 0) {
                for (m61 m61Var5 = m61Var4; m61Var5 != null && m61Var5.S9EYkSpbGuxq; m61Var5 = m61Var5.cpQdD2nAriOS) {
                    if ((m61Var5.wdg6QnbFHrFF & 262144) != 0) {
                        ?? r6 = 0;
                        ux uxVar = m61Var5;
                        while (uxVar != 0) {
                            if (uxVar instanceof ol2) {
                                ol2 ol2Var = (ol2) uxVar;
                                boolean equals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(ol2Var.RfyTYNmI9Srp());
                                ml2 ml2Var2 = ml2.OPXfSBeufaJ8;
                                if (equals) {
                                    ib1Var.OPXfSBeufaJ8(ol2Var);
                                    ml2Var = ml2Var2;
                                } else {
                                    ml2Var = ml2.rtx2ld2ELZv4;
                                }
                                if (ml2Var == ml2.wdg6QnbFHrFF) {
                                    return;
                                }
                                if (ml2Var == ml2Var2) {
                                    break;
                                }
                            } else if ((uxVar.wdg6QnbFHrFF & 262144) != 0 && (uxVar instanceof ux)) {
                                m61 m61Var6 = uxVar.S2OOm9zPNm0h;
                                int i2 = 0;
                                uxVar = uxVar;
                                r6 = r6;
                                while (m61Var6 != null) {
                                    if ((m61Var6.wdg6QnbFHrFF & 262144) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            uxVar = m61Var6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new f91(new m61[16]);
                                            }
                                            if (uxVar != 0) {
                                                r6.lS5Rgt96tfkO(uxVar);
                                                uxVar = 0;
                                            }
                                            r6.lS5Rgt96tfkO(m61Var6);
                                        }
                                    }
                                    m61Var6 = m61Var6.cpQdD2nAriOS;
                                    uxVar = uxVar;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            uxVar = zv.dgRBjINgWbAK(r6);
                        }
                    }
                }
            }
            zv.OPXfSBeufaJ8(f91Var, m61Var4);
        }
    }
}
