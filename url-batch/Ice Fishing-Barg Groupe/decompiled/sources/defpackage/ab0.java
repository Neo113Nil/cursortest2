package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ab0 extends m61 implements aq, xv0, we1, p61, tx {
    public boolean S2OOm9zPNm0h;
    public final pe0 VhhvGxCb8gfr;
    public boolean ZbWwgt3aGe7A;
    public final int pnx5pC0XzaCw;

    public ab0(int i, pe0 pe0Var, int i2) {
        this.VhhvGxCb8gfr = (i2 & 4) != 0 ? null : pe0Var;
        this.pnx5pC0XzaCw = i;
    }

    public static /* synthetic */ boolean i6zQx8Kd7UPU(ab0 ab0Var) {
        ga0.Companion.getClass();
        return ab0Var.TVHukqbqS4tB(7);
    }

    public final za0 FT2GK7JK5Ma2() {
        kd1 kd1Var;
        boolean z = this.S9EYkSpbGuxq;
        za0 za0Var = za0.wdg6QnbFHrFF;
        if (!z) {
            return za0Var;
        }
        ab0 a92UlCVFR9N8 = ((qa0) ((r1) zv.wLFCmsViZrNT(this)).getFocusOwner()).a92UlCVFR9N8();
        if (a92UlCVFR9N8 == null) {
            return za0Var;
        }
        if (this == a92UlCVFR9N8) {
            return za0.rtx2ld2ELZv4;
        }
        if (a92UlCVFR9N8.S9EYkSpbGuxq) {
            if (!a92UlCVFR9N8.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
            }
            m61 m61Var = a92UlCVFR9N8.rtx2ld2ELZv4.x50lh2ztY7Y5;
            vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(a92UlCVFR9N8);
            while (zf8DYfih6EZu != null) {
                if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 1024) != 0) {
                    while (m61Var != null) {
                        if ((m61Var.wdg6QnbFHrFF & 1024) != 0) {
                            m61 m61Var2 = m61Var;
                            f91 f91Var = null;
                            while (m61Var2 != null) {
                                if (m61Var2 instanceof ab0) {
                                    if (this == ((ab0) m61Var2)) {
                                        return za0.OPXfSBeufaJ8;
                                    }
                                } else if ((m61Var2.wdg6QnbFHrFF & 1024) != 0 && (m61Var2 instanceof ux)) {
                                    int i = 0;
                                    for (m61 m61Var3 = ((ux) m61Var2).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                                        if ((m61Var3.wdg6QnbFHrFF & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                                m61Var2 = zv.dgRBjINgWbAK(f91Var);
                            }
                        }
                        m61Var = m61Var.x50lh2ztY7Y5;
                    }
                }
                zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                m61Var = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
            }
        }
        return za0Var;
    }

    @Override // defpackage.m61
    public final void HGgCfDnf0ga9() {
        if (FT2GK7JK5Ma2().PxuCJdSBwIXG()) {
            na0 focusOwner = ((r1) zv.wLFCmsViZrNT(this)).getFocusOwner();
            ga0.Companion.getClass();
            ((qa0) focusOwner).lS5Rgt96tfkO(8, true, true);
        }
    }

    @Override // defpackage.m61
    public final void IxJ9cAW40yOk() {
        int ordinal = FT2GK7JK5Ma2().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ((r1) zv.wLFCmsViZrNT(this)).getFocusOwner();
                zv.BRwzKIf41E4i(this);
                return;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                u9.gPXPFXrUH4XX();
                return;
            }
        }
        na0 focusOwner = ((r1) zv.wLFCmsViZrNT(this)).getFocusOwner();
        ga0.Companion.getClass();
        qa0 qa0Var = (qa0) focusOwner;
        qa0Var.lS5Rgt96tfkO(8, true, false);
        qa0Var.Y1f8riQaR6yg.PxuCJdSBwIXG();
    }

    public final wx0 MDTGUQSX7PXD() {
        kd1 kd1Var;
        Object obj;
        if (!this.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
        }
        m61 m61Var = this.rtx2ld2ELZv4.x50lh2ztY7Y5;
        vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(this);
        while (true) {
            if (zf8DYfih6EZu == null) {
                break;
            }
            if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 8388640) != 0) {
                while (m61Var != null) {
                    int i = m61Var.wdg6QnbFHrFF;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(m61Var instanceof wx0)) {
                                if (m61Var instanceof ux) {
                                    m61Var = null;
                                    for (m61 m61Var2 = ((ux) m61Var).S2OOm9zPNm0h; m61Var2 != null; m61Var2 = m61Var2.cpQdD2nAriOS) {
                                        if (m61Var2 instanceof wx0) {
                                            m61Var = m61Var2;
                                        }
                                    }
                                } else {
                                    m61Var = null;
                                }
                            }
                            wx0 wx0Var = (wx0) m61Var;
                            if (wx0Var != null) {
                                return wx0Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (m61Var instanceof p61) {
                                obj = m61Var;
                            } else if (m61Var instanceof ux) {
                                obj = null;
                                for (m61 m61Var3 = ((ux) m61Var).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                                    if (m61Var3 instanceof p61) {
                                        obj = m61Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            p61 p61Var = (p61) obj;
                            if (p61Var != null) {
                                p61Var.dgRBjINgWbAK();
                            }
                        }
                    }
                    m61Var = m61Var.x50lh2ztY7Y5;
                }
            }
            zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
            m61Var = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
        }
        return null;
    }

    public final boolean TVHukqbqS4tB(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return fkblLSN2bAgv().PxuCJdSBwIXG ? W7ceZOzvrRuI() : ki0.e6tOsSdd2EFb(this, i, new gi1(i));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [m61] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [m61] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [f91] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v27 */
    public final boolean W7ceZOzvrRuI() {
        f91 f91Var;
        kd1 kd1Var;
        qa0 qa0Var;
        boolean z;
        int i;
        ?? r5;
        int i2;
        int i3;
        kd1 kd1Var2;
        int ordinal = f2.tmVwIGCQF4zR(this).ordinal();
        if (ordinal == 0) {
            qa0 qa0Var2 = (qa0) ((r1) zv.wLFCmsViZrNT(this)).getFocusOwner();
            ab0 a92UlCVFR9N8 = qa0Var2.a92UlCVFR9N8();
            za0 FT2GK7JK5Ma2 = FT2GK7JK5Ma2();
            if (a92UlCVFR9N8 == this) {
                X1HMmH2Ks65g(FT2GK7JK5Ma2, FT2GK7JK5Ma2);
                return true;
            }
            if (a92UlCVFR9N8 != null || ((qa0) ((r1) zv.wLFCmsViZrNT(this)).getFocusOwner()).PxuCJdSBwIXG.BjEWd04qc7Mw()) {
                if (a92UlCVFR9N8 != null) {
                    f91Var = new f91(new ab0[16]);
                    if (!a92UlCVFR9N8.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                        ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
                    }
                    m61 m61Var = a92UlCVFR9N8.rtx2ld2ELZv4.x50lh2ztY7Y5;
                    vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(a92UlCVFR9N8);
                    while (zf8DYfih6EZu != null) {
                        if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 1024) != 0) {
                            while (m61Var != null) {
                                if ((m61Var.wdg6QnbFHrFF & 1024) != 0) {
                                    m61 m61Var2 = m61Var;
                                    f91 f91Var2 = null;
                                    while (m61Var2 != null) {
                                        if (m61Var2 instanceof ab0) {
                                            f91Var.lS5Rgt96tfkO((ab0) m61Var2);
                                        } else if ((m61Var2.wdg6QnbFHrFF & 1024) != 0 && (m61Var2 instanceof ux)) {
                                            int i4 = 0;
                                            for (m61 m61Var3 = ((ux) m61Var2).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                                                if ((m61Var3.wdg6QnbFHrFF & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        m61Var2 = m61Var3;
                                                    } else {
                                                        if (f91Var2 == null) {
                                                            f91Var2 = new f91(new m61[16]);
                                                        }
                                                        if (m61Var2 != null) {
                                                            f91Var2.lS5Rgt96tfkO(m61Var2);
                                                            m61Var2 = null;
                                                        }
                                                        f91Var2.lS5Rgt96tfkO(m61Var3);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        m61Var2 = zv.dgRBjINgWbAK(f91Var2);
                                    }
                                }
                                m61Var = m61Var.x50lh2ztY7Y5;
                            }
                        }
                        zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                        m61Var = (zf8DYfih6EZu == null || (kd1Var2 = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var2.e9gEMXR7LXtO;
                    }
                } else {
                    f91Var = null;
                }
                ab0[] ab0VarArr = new ab0[16];
                ab0[] ab0VarArr2 = new ab0[16];
                if (!this.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
                }
                m61 m61Var4 = this.rtx2ld2ELZv4.x50lh2ztY7Y5;
                vw0 zf8DYfih6EZu2 = zv.zf8DYfih6EZu(this);
                int i5 = 0;
                int i6 = 0;
                boolean z2 = true;
                while (zf8DYfih6EZu2 != null) {
                    if ((zf8DYfih6EZu2.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 1024) != 0) {
                        while (m61Var4 != null) {
                            if ((m61Var4.wdg6QnbFHrFF & 1024) != 0) {
                                ab0 ab0Var = m61Var4;
                                f91 f91Var3 = null;
                                while (ab0Var != 0) {
                                    if (ab0Var instanceof ab0) {
                                        ab0 ab0Var2 = ab0Var;
                                        if (cs0.wdg6QnbFHrFF(f91Var != null ? Boolean.valueOf(f91Var.wdg6QnbFHrFF(ab0Var2)) : null, Boolean.TRUE)) {
                                            int i7 = i5 + 1;
                                            if (ab0VarArr.length < i7) {
                                                int length = ab0VarArr.length;
                                                qa0Var = qa0Var2;
                                                ?? r1 = new Object[Math.max(i7, length * 2)];
                                                i3 = i7;
                                                System.arraycopy(ab0VarArr, 0, r1, 0, length);
                                                ab0VarArr = r1;
                                            } else {
                                                qa0Var = qa0Var2;
                                                i3 = i7;
                                            }
                                            ab0VarArr[i5] = ab0Var2;
                                            i5 = i3;
                                        } else {
                                            qa0Var = qa0Var2;
                                            int i8 = i6 + 1;
                                            if (ab0VarArr2.length < i8) {
                                                int length2 = ab0VarArr2.length;
                                                ?? r52 = new Object[Math.max(i8, length2 * 2)];
                                                i2 = i8;
                                                System.arraycopy(ab0VarArr2, 0, r52, 0, length2);
                                                ab0VarArr2 = r52;
                                            } else {
                                                i2 = i8;
                                            }
                                            ab0VarArr2[i6] = ab0Var2;
                                            i6 = i2;
                                        }
                                        if (ab0Var2 == a92UlCVFR9N8) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        qa0Var = qa0Var2;
                                        z = true;
                                    }
                                    if (z && (ab0Var.wdg6QnbFHrFF & 1024) != 0 && (ab0Var instanceof ux)) {
                                        m61 m61Var5 = ab0Var.S2OOm9zPNm0h;
                                        int i9 = 0;
                                        ab0Var = ab0Var;
                                        while (m61Var5 != null) {
                                            if ((m61Var5.wdg6QnbFHrFF & 1024) != 0) {
                                                int i10 = i9 + 1;
                                                if (i10 == 1) {
                                                    ab0Var = m61Var5;
                                                    i = i10;
                                                } else {
                                                    if (f91Var3 == null) {
                                                        i = i10;
                                                        r5 = new f91(new m61[16]);
                                                    } else {
                                                        i = i10;
                                                        r5 = f91Var3;
                                                    }
                                                    if (ab0Var != 0) {
                                                        r5.lS5Rgt96tfkO(ab0Var);
                                                        ab0Var = 0;
                                                    }
                                                    r5.lS5Rgt96tfkO(m61Var5);
                                                    f91Var3 = r5;
                                                    ab0Var = ab0Var;
                                                }
                                                i9 = i;
                                            }
                                            m61Var5 = m61Var5.cpQdD2nAriOS;
                                            ab0Var = ab0Var;
                                        }
                                        if (i9 == 1) {
                                            qa0Var2 = qa0Var;
                                        }
                                    }
                                    ab0Var = zv.dgRBjINgWbAK(f91Var3);
                                    qa0Var2 = qa0Var;
                                }
                            }
                            m61Var4 = m61Var4.x50lh2ztY7Y5;
                            qa0Var2 = qa0Var2;
                        }
                    }
                    qa0 qa0Var3 = qa0Var2;
                    zf8DYfih6EZu2 = zf8DYfih6EZu2.S9EYkSpbGuxq();
                    m61Var4 = (zf8DYfih6EZu2 == null || (kd1Var = zf8DYfih6EZu2.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
                    qa0Var2 = qa0Var3;
                }
                qa0 qa0Var4 = qa0Var2;
                if (!z2 || a92UlCVFR9N8 == null || f2.cpQdD2nAriOS(a92UlCVFR9N8, false)) {
                    vi0.POWyO8hTM6YC(this, new y4(4, this));
                    int ordinal2 = FT2GK7JK5Ma2().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    u9.gPXPFXrUH4XX();
                                    return false;
                                }
                            }
                        }
                        ((qa0) ((r1) zv.wLFCmsViZrNT(this)).getFocusOwner()).OPXfSBeufaJ8(this);
                    }
                    za0 za0Var = za0.wdg6QnbFHrFF;
                    za0 za0Var2 = za0.rtx2ld2ELZv4;
                    if (z2 && a92UlCVFR9N8 != null) {
                        a92UlCVFR9N8.X1HMmH2Ks65g(za0Var2, za0Var);
                    }
                    za0 za0Var3 = za0.OPXfSBeufaJ8;
                    if (f91Var != null) {
                        int i11 = f91Var.wdg6QnbFHrFF - 1;
                        Object[] objArr = f91Var.rtx2ld2ELZv4;
                        if (i11 < objArr.length) {
                            while (i11 >= 0) {
                                ab0 ab0Var3 = (ab0) objArr[i11];
                                if (qa0Var4.a92UlCVFR9N8() != this) {
                                    break;
                                }
                                ab0Var3.X1HMmH2Ks65g(za0Var3, za0Var);
                                i11--;
                            }
                        }
                    }
                    int i12 = i6 - 1;
                    if (i12 < ab0VarArr2.length) {
                        while (i12 >= 0) {
                            ab0 ab0Var4 = ab0VarArr2[i12];
                            if (qa0Var4.a92UlCVFR9N8() != this) {
                                break;
                            }
                            ab0Var4.X1HMmH2Ks65g(ab0Var4 == a92UlCVFR9N8 ? za0Var2 : za0Var, za0Var3);
                            i12--;
                        }
                    }
                    if (qa0Var4.a92UlCVFR9N8() == this) {
                        X1HMmH2Ks65g(FT2GK7JK5Ma2, za0Var2);
                        if (qa0Var4.a92UlCVFR9N8() != this) {
                            break;
                        }
                        return true;
                    }
                }
                return false;
            }
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                u9.gPXPFXrUH4XX();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [m61] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [m61] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [f91] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [f91] */
    public final void X1HMmH2Ks65g(za0 za0Var, za0 za0Var2) {
        kd1 kd1Var;
        pe0 pe0Var;
        qa0 qa0Var = (qa0) ((r1) zv.wLFCmsViZrNT(this)).getFocusOwner();
        ab0 a92UlCVFR9N8 = qa0Var.a92UlCVFR9N8();
        if (!za0Var.equals(za0Var2) && (pe0Var = this.VhhvGxCb8gfr) != null) {
            pe0Var.rtx2ld2ELZv4(za0Var, za0Var2);
        }
        m61 m61Var = this.rtx2ld2ELZv4;
        if (!m61Var.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
        }
        m61 m61Var2 = this.rtx2ld2ELZv4;
        vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(this);
        while (zf8DYfih6EZu != null) {
            if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 5120) != 0) {
                while (m61Var2 != null) {
                    int i = m61Var2.wdg6QnbFHrFF;
                    if ((i & 5120) != 0) {
                        if (m61Var2 != m61Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ux uxVar = m61Var2;
                            ?? r5 = 0;
                            while (uxVar != 0) {
                                if (uxVar instanceof ha0) {
                                    ha0 ha0Var = (ha0) uxVar;
                                    if (a92UlCVFR9N8 == qa0Var.a92UlCVFR9N8()) {
                                        ha0Var.xbgXKYA2cIfu(za0Var2);
                                    }
                                } else if ((uxVar.wdg6QnbFHrFF & 4096) != 0 && (uxVar instanceof ux)) {
                                    m61 m61Var3 = uxVar.S2OOm9zPNm0h;
                                    int i2 = 0;
                                    uxVar = uxVar;
                                    r5 = r5;
                                    while (m61Var3 != null) {
                                        if ((m61Var3.wdg6QnbFHrFF & 4096) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                uxVar = m61Var3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new f91(new m61[16]);
                                                }
                                                if (uxVar != 0) {
                                                    r5.lS5Rgt96tfkO(uxVar);
                                                    uxVar = 0;
                                                }
                                                r5.lS5Rgt96tfkO(m61Var3);
                                            }
                                        }
                                        m61Var3 = m61Var3.cpQdD2nAriOS;
                                        uxVar = uxVar;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                uxVar = zv.dgRBjINgWbAK(r5);
                            }
                        }
                    }
                    m61Var2 = m61Var2.x50lh2ztY7Y5;
                }
            }
            zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
            m61Var2 = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
        }
    }

    public final qt1 Yadk4uqlxLy8(bw0 bw0Var) {
        qt1 qt1Var = fkblLSN2bAgv().x50lh2ztY7Y5;
        sa0.Companion.getClass();
        if (qt1Var == ra0.lS5Rgt96tfkO) {
            if (bw0Var != null) {
                return bw0Var.nLZGh9p8gVSu(zv.i68hK7ahKtgp(this), false);
            }
            bf1.Companion.getClass();
            return xi0.PxuCJdSBwIXG(0L, kj0.gGoUzNp9JO5I(zv.i68hK7ahKtgp(this).wdg6QnbFHrFF));
        }
        if (bw0Var == null) {
            return qt1Var;
        }
        pd1 i68hK7ahKtgp = zv.i68hK7ahKtgp(this);
        bf1.Companion.getClass();
        return qt1Var.OPXfSBeufaJ8(bw0Var.BjEWd04qc7Mw(i68hK7ahKtgp, 0L));
    }

    public final ta0 fkblLSN2bAgv() {
        boolean z;
        kd1 kd1Var;
        ta0 ta0Var = new ta0();
        ta0Var.PxuCJdSBwIXG = true;
        va0.Companion.getClass();
        va0 va0Var = va0.lS5Rgt96tfkO;
        ta0Var.lS5Rgt96tfkO = va0Var;
        ta0Var.TSizfFm2Yiuu = va0Var;
        ta0Var.Y1f8riQaR6yg = va0Var;
        ta0Var.e9gEMXR7LXtO = va0Var;
        ta0Var.a92UlCVFR9N8 = va0Var;
        ta0Var.RAsUl2FVSrh6 = va0Var;
        ta0Var.rtx2ld2ELZv4 = va0Var;
        ta0Var.OPXfSBeufaJ8 = va0Var;
        ta0Var.wdg6QnbFHrFF = k1.aF05bpZJlKEP;
        ta0Var.dgRBjINgWbAK = k1.kpCQ9veP6n3I;
        sa0.Companion.getClass();
        ta0Var.x50lh2ztY7Y5 = ra0.lS5Rgt96tfkO;
        int i = this.pnx5pC0XzaCw;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            int i2 = ((rp0) ((tp0) ((sp0) f2.QrzZRwfaDlRX(this, eq.cpQdD2nAriOS))).PxuCJdSBwIXG.getValue()).PxuCJdSBwIXG;
            rp0.Companion.getClass();
            z = !(i2 == 1);
        } else {
            if (i != 2) {
                u9.rtx2ld2ELZv4("Unknown Focusability");
                return null;
            }
            z = false;
        }
        ta0Var.PxuCJdSBwIXG = z;
        m61 m61Var = this.rtx2ld2ELZv4;
        if (!m61Var.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
        }
        m61 m61Var2 = this.rtx2ld2ELZv4;
        vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(this);
        loop0: while (zf8DYfih6EZu != null) {
            if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 3072) != 0) {
                while (m61Var2 != null) {
                    int i3 = m61Var2.wdg6QnbFHrFF;
                    if ((i3 & 3072) != 0) {
                        if (m61Var2 != m61Var && (i3 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i3 & 2048) != 0) {
                            f91 f91Var = null;
                            m61 m61Var3 = m61Var2;
                            while (m61Var3 != null) {
                                if (m61Var3 instanceof mc) {
                                    l61 l61Var = ((mc) m61Var3).VhhvGxCb8gfr;
                                    ep0.lS5Rgt96tfkO("applyFocusProperties called on wrong node");
                                    l61Var.getClass();
                                    u9.VhhvGxCb8gfr();
                                    return null;
                                }
                                if ((m61Var3.wdg6QnbFHrFF & 2048) != 0 && (m61Var3 instanceof ux)) {
                                    int i4 = 0;
                                    for (m61 m61Var4 = ((ux) m61Var3).S2OOm9zPNm0h; m61Var4 != null; m61Var4 = m61Var4.cpQdD2nAriOS) {
                                        if ((m61Var4.wdg6QnbFHrFF & 2048) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                m61Var3 = m61Var4;
                                            } else {
                                                if (f91Var == null) {
                                                    f91Var = new f91(new m61[16]);
                                                }
                                                if (m61Var3 != null) {
                                                    f91Var.lS5Rgt96tfkO(m61Var3);
                                                    m61Var3 = null;
                                                }
                                                f91Var.lS5Rgt96tfkO(m61Var4);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                m61Var3 = zv.dgRBjINgWbAK(f91Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    m61Var2 = m61Var2.x50lh2ztY7Y5;
                }
            }
            zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
            m61Var2 = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
        }
        return ta0Var;
    }

    @Override // defpackage.m61
    public final boolean mFd1aGiJX24N() {
        return false;
    }

    @Override // defpackage.we1
    public final void nLZGh9p8gVSu() {
        qYgDo2Ye5PY7();
    }

    public final void qYgDo2Ye5PY7() {
        int ordinal = FT2GK7JK5Ma2().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                u9.gPXPFXrUH4XX();
                return;
            }
        }
        zt1 zt1Var = new zt1();
        vi0.POWyO8hTM6YC(this, new i1(4, zt1Var, this));
        Object obj = zt1Var.rtx2ld2ELZv4;
        if (obj == null) {
            cs0.tmVwIGCQF4zR("focusProperties");
            throw null;
        }
        if (((sa0) obj).PxuCJdSBwIXG()) {
            return;
        }
        qa0 qa0Var = (qa0) ((r1) zv.wLFCmsViZrNT(this)).getFocusOwner();
        qa0Var.getClass();
        ga0.Companion.getClass();
        qa0Var.lS5Rgt96tfkO(8, true, true);
    }

    @Override // defpackage.xv0
    public final void XL4ISE6Oc65B(bw0 bw0Var) {
    }
}
