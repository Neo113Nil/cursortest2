package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class qd1 {
    public static final l81 PxuCJdSBwIXG;

    static {
        l81 l81Var = oe1.PxuCJdSBwIXG;
        PxuCJdSBwIXG = new l81();
    }

    public static final void PxuCJdSBwIXG(m61 m61Var, int i, int i2) {
        if (!(m61Var instanceof ux)) {
            lS5Rgt96tfkO(m61Var, i & m61Var.wdg6QnbFHrFF, i2);
            return;
        }
        ux uxVar = (ux) m61Var;
        int i3 = uxVar.VhhvGxCb8gfr;
        lS5Rgt96tfkO(m61Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (m61 m61Var2 = uxVar.S2OOm9zPNm0h; m61Var2 != null; m61Var2 = m61Var2.cpQdD2nAriOS) {
            PxuCJdSBwIXG(m61Var2, i4, i2);
        }
    }

    public static final boolean RAsUl2FVSrh6(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }

    public static final void TSizfFm2Yiuu(m61 m61Var) {
        if (!m61Var.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("autoInvalidateUpdatedNode called on unattached node");
        }
        PxuCJdSBwIXG(m61Var, -1, 0);
    }

    public static final int Y1f8riQaR6yg(l61 l61Var) {
        int i = l61Var instanceof iw0 ? 3 : 1;
        if (l61Var instanceof h30) {
            i |= 4;
        }
        if (l61Var instanceof p9) {
            i |= 8;
        }
        if (l61Var instanceof t7) {
            i |= 64;
        }
        return l61Var instanceof df ? 524288 | i : i;
    }

    public static final int a92UlCVFR9N8(m61 m61Var) {
        if (!(m61Var instanceof ux)) {
            return e9gEMXR7LXtO(m61Var);
        }
        ux uxVar = (ux) m61Var;
        int i = uxVar.VhhvGxCb8gfr;
        for (m61 m61Var2 = uxVar.S2OOm9zPNm0h; m61Var2 != null; m61Var2 = m61Var2.cpQdD2nAriOS) {
            i |= a92UlCVFR9N8(m61Var2);
        }
        return i;
    }

    public static final int e9gEMXR7LXtO(m61 m61Var) {
        int i = m61Var.wdg6QnbFHrFF;
        if (i != 0) {
            return i;
        }
        Class<?> cls = m61Var.getClass();
        l81 l81Var = PxuCJdSBwIXG;
        int Y1f8riQaR6yg = l81Var.Y1f8riQaR6yg(cls);
        if (Y1f8riQaR6yg >= 0) {
            return l81Var.TSizfFm2Yiuu[Y1f8riQaR6yg];
        }
        int i2 = m61Var instanceof kw0 ? 3 : 1;
        if (m61Var instanceof i30) {
            i2 |= 4;
        }
        if (m61Var instanceof b32) {
            i2 |= 8;
        }
        if (m61Var instanceof do1) {
            i2 |= 16;
        }
        if (m61Var instanceof p61) {
            i2 |= 32;
        }
        if (m61Var instanceof nj1) {
            i2 |= 64;
        }
        if (m61Var instanceof xv0) {
            i2 |= 4194432;
        } else if (m61Var instanceof m51) {
            i2 |= 128;
        }
        if (m61Var instanceof sg0) {
            i2 |= 256;
        }
        if (m61Var instanceof ab0) {
            i2 |= 1024;
        }
        if (m61Var instanceof mc) {
            i2 |= 2048;
        }
        if (m61Var instanceof ha0) {
            i2 |= 4096;
        }
        if (m61Var instanceof vu0) {
            i2 |= 8192;
        }
        if (m61Var instanceof e1) {
            i2 |= 16384;
        }
        if (m61Var instanceof aq) {
            i2 |= 32768;
        }
        if (m61Var instanceof ol2) {
            i2 |= 262144;
        }
        if (m61Var instanceof df) {
            i2 |= 524288;
        }
        if (m61Var instanceof qo0) {
            i2 |= 2097152;
        }
        if (m61Var instanceof wx0) {
            i2 |= 8388608;
        }
        l81Var.RAsUl2FVSrh6(i2, cls);
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void lS5Rgt96tfkO(m61 m61Var, int i, int i2) {
        if (i2 != 0 || m61Var.mFd1aGiJX24N()) {
            if ((i & 2) != 0 && (m61Var instanceof kw0)) {
                ng0.e6tOsSdd2EFb((kw0) m61Var);
                if (i2 == 2) {
                    zv.POWyO8hTM6YC(m61Var, 2).h();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                zv.zf8DYfih6EZu(m61Var).BjEWd04qc7Mw();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                zv.zf8DYfih6EZu(m61Var).nxJAScVArhE9(false);
            }
            if ((i & 256) != 0 && (m61Var instanceof sg0)) {
                if (i2 == 1) {
                    vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(m61Var);
                    zf8DYfih6EZu.KUoIVIumpKat(zf8DYfih6EZu.wLFCmsViZrNT + 1);
                } else if (i2 == 2) {
                    zv.zf8DYfih6EZu(m61Var).KUoIVIumpKat(r0.wLFCmsViZrNT - 1);
                }
                if (i2 != 2) {
                    vw0 zf8DYfih6EZu2 = zv.zf8DYfih6EZu(m61Var);
                    if (zf8DYfih6EZu2.wLFCmsViZrNT != 0 && !zf8DYfih6EZu2.gPXPFXrUH4XX() && !zf8DYfih6EZu2.BRwzKIf41E4i() && !zf8DYfih6EZu2.zf8DYfih6EZu) {
                        r1 r1Var = (r1) yw0.PxuCJdSBwIXG(zf8DYfih6EZu2);
                        bg1 bg1Var = r1Var.qudtW7lwm99e.e9gEMXR7LXtO;
                        bg1Var.getClass();
                        if (zf8DYfih6EZu2.wLFCmsViZrNT > 0) {
                            bg1Var.PxuCJdSBwIXG.lS5Rgt96tfkO(zf8DYfih6EZu2);
                            zf8DYfih6EZu2.zf8DYfih6EZu = true;
                        }
                        r1Var.ozEBbv0hFTAB(null);
                    }
                }
            }
            if ((i & 4) != 0 && (m61Var instanceof i30)) {
                fx1.IXK6ba3ucyzm((i30) m61Var);
            }
            if ((i & 8) != 0 && (m61Var instanceof b32)) {
                zv.zf8DYfih6EZu(m61Var).ZbWwgt3aGe7A = true;
            }
            if ((i & 64) != 0 && (m61Var instanceof nj1)) {
                zw0 zw0Var = zv.zf8DYfih6EZu((nj1) m61Var).ryVscX7ZL4Ux;
                zw0Var.gPXPFXrUH4XX.ZbWwgt3aGe7A = true;
                a41 a41Var = zw0Var.BRwzKIf41E4i;
                if (a41Var != null) {
                    a41Var.kpCQ9veP6n3I = true;
                }
            }
            if ((i & 2048) != 0 && (m61Var instanceof mc)) {
                l61 l61Var = ((mc) m61Var).VhhvGxCb8gfr;
                ep0.lS5Rgt96tfkO("applyFocusProperties called on wrong node");
                l61Var.getClass();
                u9.VhhvGxCb8gfr();
                return;
            }
            if ((i & 4096) != 0 && (m61Var instanceof ha0)) {
                ha0 ha0Var = (ha0) m61Var;
                la0 la0Var = ((qa0) ((r1) zv.wLFCmsViZrNT(ha0Var)).getFocusOwner()).Y1f8riQaR6yg;
                if (la0Var.Y1f8riQaR6yg.PxuCJdSBwIXG(ha0Var)) {
                    la0Var.PxuCJdSBwIXG();
                }
            }
            if ((i & 2097152) != 0 && (m61Var instanceof qo0) && i2 == 2) {
                ((qo0) m61Var).aF05bpZJlKEP();
            }
        }
    }
}
