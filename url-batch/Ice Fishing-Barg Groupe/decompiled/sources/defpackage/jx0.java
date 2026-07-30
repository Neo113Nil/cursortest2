package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jx0 implements io {
    public final v81 BRwzKIf41E4i;
    public final f91 EcgxDIVH5in8;
    public up OPXfSBeufaJ8;
    public final dx0 QrzZRwfaDlRX;
    public final v81 RfyTYNmI9Srp;
    public final String S2OOm9zPNm0h;
    public int S9EYkSpbGuxq;
    public int VhhvGxCb8gfr;
    public final ib2 XL4ISE6Oc65B;
    public final v81 cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public final ax0 gPXPFXrUH4XX;
    public final v81 r3s1LDPKFs1S;
    public final vw0 rtx2ld2ELZv4;
    public jb2 wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    public jx0(vw0 vw0Var, jb2 jb2Var) {
        this.rtx2ld2ELZv4 = vw0Var;
        this.wdg6QnbFHrFF = jb2Var;
        long[] jArr = c02.PxuCJdSBwIXG;
        this.cpQdD2nAriOS = new v81();
        this.r3s1LDPKFs1S = new v81();
        this.QrzZRwfaDlRX = new dx0(this);
        this.gPXPFXrUH4XX = new ax0(this);
        this.BRwzKIf41E4i = new v81();
        this.XL4ISE6Oc65B = new ib2();
        this.RfyTYNmI9Srp = new v81();
        this.EcgxDIVH5in8 = new f91(new Object[16]);
        this.S2OOm9zPNm0h = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void TSizfFm2Yiuu(jx0 jx0Var, Object obj) {
        vw0 vw0Var = jx0Var.rtx2ld2ELZv4;
        jx0Var.rtx2ld2ELZv4();
        vw0 vw0Var2 = (vw0) jx0Var.BRwzKIf41E4i.dgRBjINgWbAK(obj);
        if (vw0Var2 != null) {
            if (jx0Var.VhhvGxCb8gfr <= 0) {
                ep0.lS5Rgt96tfkO("No pre-composed items to dispose");
            }
            int OPXfSBeufaJ8 = ((f91) ((n81) vw0Var.QrzZRwfaDlRX()).OPXfSBeufaJ8).OPXfSBeufaJ8(vw0Var2);
            if (OPXfSBeufaJ8 < ((f91) ((n81) vw0Var.QrzZRwfaDlRX()).OPXfSBeufaJ8).wdg6QnbFHrFF - jx0Var.VhhvGxCb8gfr) {
                ep0.lS5Rgt96tfkO("Item is not in pre-composed item range");
            }
            jx0Var.S9EYkSpbGuxq++;
            jx0Var.VhhvGxCb8gfr--;
            bx0 bx0Var = (bx0) jx0Var.cpQdD2nAriOS.RAsUl2FVSrh6(vw0Var2);
            if (bx0Var != null) {
                e9gEMXR7LXtO(bx0Var);
            }
            int i = (((f91) ((n81) vw0Var.QrzZRwfaDlRX()).OPXfSBeufaJ8).wdg6QnbFHrFF - jx0Var.VhhvGxCb8gfr) - jx0Var.S9EYkSpbGuxq;
            jx0Var.wdg6QnbFHrFF(OPXfSBeufaJ8, i);
            jx0Var.RAsUl2FVSrh6(i);
        }
        if (jx0Var.EcgxDIVH5in8.rtx2ld2ELZv4(obj)) {
            vw0.IXK6ba3ucyzm(vw0Var, true, 6);
        }
    }

    public static void e9gEMXR7LXtO(bx0 bx0Var) {
        w81 w81Var;
        bl1 bl1Var = bx0Var.a92UlCVFR9N8;
        if (bl1Var != null) {
            bl1Var.rtx2ld2ELZv4.set(dl1.OPXfSBeufaJ8);
            ju1 ju1Var = bl1Var.dgRBjINgWbAK;
            if (ju1Var.Y1f8riQaR6yg.rtx2ld2ELZv4()) {
                w81Var = ju1Var.Y1f8riQaR6yg;
                w81 w81Var2 = d02.PxuCJdSBwIXG;
                ju1Var.Y1f8riQaR6yg = new w81();
                ju1Var.TSizfFm2Yiuu.RAsUl2FVSrh6();
            } else {
                w81Var = null;
            }
            ju1Var.lS5Rgt96tfkO();
            zp zpVar = bl1Var.PxuCJdSBwIXG;
            zpVar.ZbWwgt3aGe7A = null;
            if (w81Var != null) {
                zpVar.jyegZNwi31qc.dgRBjINgWbAK = w81Var;
                zpVar.kpCQ9veP6n3I = 2;
            }
            bx0Var.a92UlCVFR9N8 = null;
            zp zpVar2 = bx0Var.TSizfFm2Yiuu;
            if (zpVar2 != null) {
                zpVar2.cpQdD2nAriOS();
            }
            bx0Var.TSizfFm2Yiuu = null;
        }
    }

    public final void OPXfSBeufaJ8(boolean z) {
        this.VhhvGxCb8gfr = 0;
        this.BRwzKIf41E4i.PxuCJdSBwIXG();
        List QrzZRwfaDlRX = this.rtx2ld2ELZv4.QrzZRwfaDlRX();
        int i = ((f91) ((n81) QrzZRwfaDlRX).OPXfSBeufaJ8).wdg6QnbFHrFF;
        if (this.S9EYkSpbGuxq != i) {
            this.S9EYkSpbGuxq = i;
            j72.Companion.getClass();
            j72 PxuCJdSBwIXG = i72.PxuCJdSBwIXG();
            le0 e9gEMXR7LXtO = PxuCJdSBwIXG != null ? PxuCJdSBwIXG.e9gEMXR7LXtO() : null;
            j72 lS5Rgt96tfkO = i72.lS5Rgt96tfkO(PxuCJdSBwIXG);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    vw0 vw0Var = (vw0) ((n81) QrzZRwfaDlRX).get(i2);
                    bx0 bx0Var = (bx0) this.cpQdD2nAriOS.RAsUl2FVSrh6(vw0Var);
                    if (bx0Var != null && ((Boolean) bx0Var.RAsUl2FVSrh6.getValue()).booleanValue()) {
                        zw0 zw0Var = vw0Var.ryVscX7ZL4Ux;
                        i51 i51Var = zw0Var.gPXPFXrUH4XX;
                        tw0 tw0Var = tw0.wdg6QnbFHrFF;
                        i51Var.RfyTYNmI9Srp = tw0Var;
                        a41 a41Var = zw0Var.BRwzKIf41E4i;
                        if (a41Var != null) {
                            a41Var.BRwzKIf41E4i = tw0Var;
                        }
                        x50lh2ztY7Y5(bx0Var, z);
                        bx0Var.PxuCJdSBwIXG = cs0.D0aTLcX6Uhyo;
                    }
                } catch (Throwable th) {
                    i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
                    throw th;
                }
            }
            i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
            this.r3s1LDPKFs1S.PxuCJdSBwIXG();
        }
        rtx2ld2ELZv4();
    }

    @Override // defpackage.io
    public final void PxuCJdSBwIXG() {
        zp zpVar;
        vw0 vw0Var = this.rtx2ld2ELZv4;
        vw0Var.S2OOm9zPNm0h = true;
        v81 v81Var = this.cpQdD2nAriOS;
        Object[] objArr = v81Var.TSizfFm2Yiuu;
        long[] jArr = v81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (zpVar = ((bx0) objArr[(i << 3) + i3]).TSizfFm2Yiuu) != null) {
                            zpVar.cpQdD2nAriOS();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        vw0Var.POWyO8hTM6YC();
        vw0Var.S2OOm9zPNm0h = false;
        v81Var.PxuCJdSBwIXG();
        this.r3s1LDPKFs1S.PxuCJdSBwIXG();
        this.VhhvGxCb8gfr = 0;
        this.S9EYkSpbGuxq = 0;
        this.BRwzKIf41E4i.PxuCJdSBwIXG();
        rtx2ld2ELZv4();
    }

    public final void RAsUl2FVSrh6(int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.S9EYkSpbGuxq = 0;
        vw0 vw0Var = this.rtx2ld2ELZv4;
        List QrzZRwfaDlRX = vw0Var.QrzZRwfaDlRX();
        n81 n81Var = (n81) QrzZRwfaDlRX;
        boolean z4 = true;
        int i2 = (((f91) n81Var.OPXfSBeufaJ8).wdg6QnbFHrFF - this.VhhvGxCb8gfr) - 1;
        if (i <= i2) {
            ib2 ib2Var = this.XL4ISE6Oc65B;
            ib2Var.clear();
            q81 q81Var = (q81) ib2Var.OPXfSBeufaJ8;
            v81 v81Var = this.cpQdD2nAriOS;
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6((vw0) n81Var.get(i3));
                    RAsUl2FVSrh6.getClass();
                    q81Var.PxuCJdSBwIXG(((bx0) RAsUl2FVSrh6).PxuCJdSBwIXG);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.wdg6QnbFHrFF.e9gEMXR7LXtO(ib2Var);
            j72.Companion.getClass();
            j72 PxuCJdSBwIXG = i72.PxuCJdSBwIXG();
            le0 e9gEMXR7LXtO = PxuCJdSBwIXG != null ? PxuCJdSBwIXG.e9gEMXR7LXtO() : null;
            j72 lS5Rgt96tfkO = i72.lS5Rgt96tfkO(PxuCJdSBwIXG);
            boolean z5 = false;
            while (i2 >= i) {
                try {
                    vw0 vw0Var2 = (vw0) ((n81) QrzZRwfaDlRX).get(i2);
                    Object RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6(vw0Var2);
                    RAsUl2FVSrh62.getClass();
                    bx0 bx0Var = (bx0) RAsUl2FVSrh62;
                    Object obj = bx0Var.PxuCJdSBwIXG;
                    if (q81Var.TSizfFm2Yiuu(obj)) {
                        boolean z6 = z4;
                        this.S9EYkSpbGuxq++;
                        if (((Boolean) bx0Var.RAsUl2FVSrh6.getValue()).booleanValue()) {
                            zw0 zw0Var = vw0Var2.ryVscX7ZL4Ux;
                            i51 i51Var = zw0Var.gPXPFXrUH4XX;
                            tw0 tw0Var = tw0.wdg6QnbFHrFF;
                            i51Var.RfyTYNmI9Srp = tw0Var;
                            a41 a41Var = zw0Var.BRwzKIf41E4i;
                            if (a41Var != null) {
                                a41Var.BRwzKIf41E4i = tw0Var;
                            }
                            x50lh2ztY7Y5(bx0Var, false);
                            if (bx0Var.rtx2ld2ELZv4) {
                                z = z6;
                                z5 = z;
                            } else {
                                z = z6;
                            }
                            z2 = false;
                        } else {
                            z2 = z3;
                            z = z6;
                        }
                    } else {
                        vw0Var.S2OOm9zPNm0h = z4;
                        v81Var.dgRBjINgWbAK(vw0Var2);
                        zp zpVar = bx0Var.TSizfFm2Yiuu;
                        if (zpVar != null) {
                            zpVar.cpQdD2nAriOS();
                        }
                        z = true;
                        vw0Var.i68hK7ahKtgp(i2, 1);
                        z2 = false;
                        vw0Var.S2OOm9zPNm0h = false;
                    }
                    this.r3s1LDPKFs1S.dgRBjINgWbAK(obj);
                    i2--;
                    boolean z7 = z2;
                    z4 = z;
                    z3 = z7;
                } catch (Throwable th) {
                    i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
                    throw th;
                }
            }
            i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
            z3 = z5;
        }
        if (z3) {
            j72.Companion.getClass();
            i72.a92UlCVFR9N8();
        }
        rtx2ld2ELZv4();
    }

    public final void Y1f8riQaR6yg(bx0 bx0Var, boolean z) {
        bl1 bl1Var = bx0Var.a92UlCVFR9N8;
        if (bl1Var != null) {
            j72.Companion.getClass();
            j72 PxuCJdSBwIXG = i72.PxuCJdSBwIXG();
            le0 e9gEMXR7LXtO = PxuCJdSBwIXG != null ? PxuCJdSBwIXG.e9gEMXR7LXtO() : null;
            j72 lS5Rgt96tfkO = i72.lS5Rgt96tfkO(PxuCJdSBwIXG);
            try {
                vw0 vw0Var = this.rtx2ld2ELZv4;
                vw0Var.S2OOm9zPNm0h = true;
                if (z) {
                    while (!bl1Var.TSizfFm2Yiuu()) {
                        try {
                            bl1Var.e9gEMXR7LXtO(new u9(20));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                bl1Var.PxuCJdSBwIXG();
                bx0Var.a92UlCVFR9N8 = null;
                vw0Var.S2OOm9zPNm0h = false;
            } finally {
                i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
            }
        }
    }

    public final eb2 a92UlCVFR9N8(Object obj) {
        return !this.rtx2ld2ELZv4.J54yh1s3n4Aq() ? new gx0() : new hx0(this, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:37:0x007b, B:40:0x0087, B:45:0x00b2, B:47:0x00c4, B:49:0x00d8, B:51:0x00dc, B:52:0x0110, B:55:0x00e9, B:56:0x00f4, B:58:0x00f8, B:59:0x010d, B:60:0x00c7, B:63:0x0097, B:65:0x00a5, B:66:0x011a, B:67:0x0124), top: B:36:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:37:0x007b, B:40:0x0087, B:45:0x00b2, B:47:0x00c4, B:49:0x00d8, B:51:0x00dc, B:52:0x0110, B:55:0x00e9, B:56:0x00f4, B:58:0x00f8, B:59:0x010d, B:60:0x00c7, B:63:0x0097, B:65:0x00a5, B:66:0x011a, B:67:0x0124), top: B:36:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:37:0x007b, B:40:0x0087, B:45:0x00b2, B:47:0x00c4, B:49:0x00d8, B:51:0x00dc, B:52:0x0110, B:55:0x00e9, B:56:0x00f4, B:58:0x00f8, B:59:0x010d, B:60:0x00c7, B:63:0x0097, B:65:0x00a5, B:66:0x011a, B:67:0x0124), top: B:36:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:37:0x007b, B:40:0x0087, B:45:0x00b2, B:47:0x00c4, B:49:0x00d8, B:51:0x00dc, B:52:0x0110, B:55:0x00e9, B:56:0x00f4, B:58:0x00f8, B:59:0x010d, B:60:0x00c7, B:63:0x0097, B:65:0x00a5, B:66:0x011a, B:67:0x0124), top: B:36:0x007b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void cpQdD2nAriOS(vw0 vw0Var, Object obj, boolean z, pe0 pe0Var) {
        boolean z2;
        zp zpVar;
        v81 v81Var = this.cpQdD2nAriOS;
        Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(vw0Var);
        Object obj2 = RAsUl2FVSrh6;
        if (RAsUl2FVSrh6 == null) {
            on onVar = xn.PxuCJdSBwIXG;
            bx0 bx0Var = new bx0();
            bx0Var.PxuCJdSBwIXG = obj;
            bx0Var.lS5Rgt96tfkO = onVar;
            bx0Var.TSizfFm2Yiuu = null;
            bx0Var.RAsUl2FVSrh6 = sj0.tmVwIGCQF4zR(Boolean.TRUE);
            v81Var.cpQdD2nAriOS(vw0Var, bx0Var);
            obj2 = bx0Var;
        }
        bx0 bx0Var2 = (bx0) obj2;
        int i = 1;
        boolean z3 = bx0Var2.lS5Rgt96tfkO != pe0Var;
        if (bx0Var2.a92UlCVFR9N8 != null) {
            if (z3) {
                e9gEMXR7LXtO(bx0Var2);
            } else if (z) {
                return;
            } else {
                Y1f8riQaR6yg(bx0Var2, true);
            }
        }
        zp zpVar2 = bx0Var2.TSizfFm2Yiuu;
        if (zpVar2 != null) {
            synchronized (zpVar2.dgRBjINgWbAK) {
                z2 = zpVar2.S9EYkSpbGuxq.e9gEMXR7LXtO > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || bx0Var2.Y1f8riQaR6yg) {
            bx0Var2.lS5Rgt96tfkO = pe0Var;
            if (bx0Var2.a92UlCVFR9N8 != null) {
                ep0.PxuCJdSBwIXG("new subcompose call while paused composition is still active");
            }
            j72.Companion.getClass();
            j72 PxuCJdSBwIXG = i72.PxuCJdSBwIXG();
            le0 e9gEMXR7LXtO = PxuCJdSBwIXG != null ? PxuCJdSBwIXG.e9gEMXR7LXtO() : null;
            j72 lS5Rgt96tfkO = i72.lS5Rgt96tfkO(PxuCJdSBwIXG);
            try {
                vw0 vw0Var2 = this.rtx2ld2ELZv4;
                vw0Var2.S2OOm9zPNm0h = true;
                zp zpVar3 = bx0Var2.TSizfFm2Yiuu;
                up upVar = this.OPXfSBeufaJ8;
                if (upVar == null) {
                    ep0.TSizfFm2Yiuu("parent composition reference not set");
                    throw new tm();
                }
                if (zpVar3 != null) {
                    if (zpVar3.kpCQ9veP6n3I == 3) {
                    }
                    bx0Var2.TSizfFm2Yiuu = zpVar3;
                    pe0 pe0Var2 = bx0Var2.lS5Rgt96tfkO;
                    if (((r1) yw0.PxuCJdSBwIXG(this.rtx2ld2ELZv4)).m18getOutOfFrameExecutor() == null) {
                        bx0Var2.rtx2ld2ELZv4 = false;
                    } else {
                        bx0Var2.rtx2ld2ELZv4 = true;
                        pe0Var2 = new on(1524156494, true, new n2(i, bx0Var2, pe0Var2));
                    }
                    if (z) {
                        if (bx0Var2.e9gEMXR7LXtO) {
                            zpVar3.OPXfSBeufaJ8();
                            zpVar3.BRwzKIf41E4i();
                            tf0 tf0Var = zpVar3.aF05bpZJlKEP;
                            tf0Var.IAToe7bXGz4N = 0;
                            tf0Var.pnx5pC0XzaCw = true;
                            zpVar3.rtx2ld2ELZv4.PxuCJdSBwIXG(zpVar3, pe0Var2);
                            tf0Var.RfyTYNmI9Srp();
                        } else {
                            zpVar3.e6tOsSdd2EFb(pe0Var2);
                        }
                    } else if (bx0Var2.e9gEMXR7LXtO) {
                        zpVar3.OPXfSBeufaJ8();
                        zpVar3.BRwzKIf41E4i();
                        bx0Var2.a92UlCVFR9N8 = zpVar3.dgRBjINgWbAK(true, pe0Var2);
                    } else {
                        bx0Var2.a92UlCVFR9N8 = zpVar3.dgRBjINgWbAK(zpVar3.OPXfSBeufaJ8(), pe0Var2);
                    }
                    bx0Var2.e9gEMXR7LXtO = false;
                    vw0Var2.S2OOm9zPNm0h = false;
                    i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
                    bx0Var2.Y1f8riQaR6yg = false;
                }
                if (z) {
                    ViewGroup.LayoutParams layoutParams = cv2.PxuCJdSBwIXG;
                    zpVar = new zp(upVar, new m9(vw0Var));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = cv2.PxuCJdSBwIXG;
                    zpVar = new zp(upVar, new m9(vw0Var));
                }
                zpVar3 = zpVar;
                bx0Var2.TSizfFm2Yiuu = zpVar3;
                pe0 pe0Var22 = bx0Var2.lS5Rgt96tfkO;
                if (((r1) yw0.PxuCJdSBwIXG(this.rtx2ld2ELZv4)).m18getOutOfFrameExecutor() == null) {
                }
                if (z) {
                }
                bx0Var2.e9gEMXR7LXtO = false;
                vw0Var2.S2OOm9zPNm0h = false;
                i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
                bx0Var2.Y1f8riQaR6yg = false;
            } catch (Throwable th) {
                i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
                throw th;
            }
        }
    }

    public final void dgRBjINgWbAK(Object obj, pe0 pe0Var, boolean z) {
        vw0 vw0Var = this.rtx2ld2ELZv4;
        if (vw0Var.J54yh1s3n4Aq()) {
            rtx2ld2ELZv4();
            if (this.r3s1LDPKFs1S.TSizfFm2Yiuu(obj)) {
                return;
            }
            this.RfyTYNmI9Srp.dgRBjINgWbAK(obj);
            v81 v81Var = this.BRwzKIf41E4i;
            Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(obj);
            if (RAsUl2FVSrh6 == null) {
                RAsUl2FVSrh6 = r3s1LDPKFs1S(obj);
                if (RAsUl2FVSrh6 != null) {
                    wdg6QnbFHrFF(((f91) ((n81) vw0Var.QrzZRwfaDlRX()).OPXfSBeufaJ8).OPXfSBeufaJ8(RAsUl2FVSrh6), ((f91) ((n81) vw0Var.QrzZRwfaDlRX()).OPXfSBeufaJ8).wdg6QnbFHrFF);
                    this.VhhvGxCb8gfr++;
                } else {
                    int i = ((f91) ((n81) vw0Var.QrzZRwfaDlRX()).OPXfSBeufaJ8).wdg6QnbFHrFF;
                    vw0 vw0Var2 = new vw0(2);
                    vw0Var.S2OOm9zPNm0h = true;
                    vw0Var.aF05bpZJlKEP(i, vw0Var2);
                    vw0Var.S2OOm9zPNm0h = false;
                    this.VhhvGxCb8gfr++;
                    RAsUl2FVSrh6 = vw0Var2;
                }
                v81Var.cpQdD2nAriOS(obj, RAsUl2FVSrh6);
            }
            cpQdD2nAriOS((vw0) RAsUl2FVSrh6, obj, z, pe0Var);
        }
    }

    @Override // defpackage.io
    public final void lS5Rgt96tfkO() {
        OPXfSBeufaJ8(true);
    }

    public final vw0 r3s1LDPKFs1S(Object obj) {
        v81 v81Var;
        int i;
        if (this.S9EYkSpbGuxq == 0) {
            return null;
        }
        n81 n81Var = (n81) this.rtx2ld2ELZv4.QrzZRwfaDlRX();
        int i2 = ((f91) n81Var.OPXfSBeufaJ8).wdg6QnbFHrFF - this.VhhvGxCb8gfr;
        int i3 = i2 - this.S9EYkSpbGuxq;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            v81Var = this.cpQdD2nAriOS;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6((vw0) n81Var.get(i5));
            RAsUl2FVSrh6.getClass();
            if (((bx0) RAsUl2FVSrh6).PxuCJdSBwIXG.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6((vw0) n81Var.get(i4));
                RAsUl2FVSrh62.getClass();
                bx0 bx0Var = (bx0) RAsUl2FVSrh62;
                Object obj2 = bx0Var.PxuCJdSBwIXG;
                if (obj2 == cs0.D0aTLcX6Uhyo || this.wdg6QnbFHrFF.OPXfSBeufaJ8(obj, obj2)) {
                    bx0Var.PxuCJdSBwIXG = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            wdg6QnbFHrFF(i5, i3);
        }
        this.S9EYkSpbGuxq--;
        vw0 vw0Var = (vw0) n81Var.get(i3);
        Object RAsUl2FVSrh63 = v81Var.RAsUl2FVSrh6(vw0Var);
        RAsUl2FVSrh63.getClass();
        bx0 bx0Var2 = (bx0) RAsUl2FVSrh63;
        bx0Var2.RAsUl2FVSrh6 = sj0.tmVwIGCQF4zR(Boolean.TRUE);
        bx0Var2.e9gEMXR7LXtO = true;
        bx0Var2.Y1f8riQaR6yg = true;
        return vw0Var;
    }

    public final void rtx2ld2ELZv4() {
        int i = ((f91) ((n81) this.rtx2ld2ELZv4.QrzZRwfaDlRX()).OPXfSBeufaJ8).wdg6QnbFHrFF;
        v81 v81Var = this.cpQdD2nAriOS;
        if (v81Var.e9gEMXR7LXtO != i) {
            ep0.PxuCJdSBwIXG("Inconsistency between the count of nodes tracked by the state (" + v81Var.e9gEMXR7LXtO + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.S9EYkSpbGuxq) - this.VhhvGxCb8gfr < 0) {
            StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i, "Incorrect state. Total children ", ". Reusable children ");
            BRwzKIf41E4i.append(this.S9EYkSpbGuxq);
            BRwzKIf41E4i.append(". Precomposed children ");
            BRwzKIf41E4i.append(this.VhhvGxCb8gfr);
            ep0.PxuCJdSBwIXG(BRwzKIf41E4i.toString());
        }
        v81 v81Var2 = this.BRwzKIf41E4i;
        if (v81Var2.e9gEMXR7LXtO == this.VhhvGxCb8gfr) {
            return;
        }
        ep0.PxuCJdSBwIXG("Incorrect state. Precomposed children " + this.VhhvGxCb8gfr + ". Map size " + v81Var2.e9gEMXR7LXtO);
    }

    public final void wdg6QnbFHrFF(int i, int i2) {
        vw0 vw0Var = this.rtx2ld2ELZv4;
        vw0Var.S2OOm9zPNm0h = true;
        vw0Var.ryVscX7ZL4Ux(i, i2, 1);
        vw0Var.S2OOm9zPNm0h = false;
    }

    public final void x50lh2ztY7Y5(bx0 bx0Var, boolean z) {
        zp zpVar;
        if (z || !bx0Var.rtx2ld2ELZv4) {
            bx0Var.RAsUl2FVSrh6 = sj0.tmVwIGCQF4zR(Boolean.FALSE);
        } else {
            bx0Var.RAsUl2FVSrh6.setValue(Boolean.FALSE);
        }
        if (bx0Var.a92UlCVFR9N8 != null) {
            e9gEMXR7LXtO(bx0Var);
            return;
        }
        if (z) {
            zp zpVar2 = bx0Var.TSizfFm2Yiuu;
            if (zpVar2 != null) {
                zpVar2.x50lh2ztY7Y5();
                return;
            }
            return;
        }
        vh1 m18getOutOfFrameExecutor = ((r1) yw0.PxuCJdSBwIXG(this.rtx2ld2ELZv4)).m18getOutOfFrameExecutor();
        if (m18getOutOfFrameExecutor == null) {
            if (bx0Var.rtx2ld2ELZv4 || (zpVar = bx0Var.TSizfFm2Yiuu) == null) {
                return;
            }
            zpVar.x50lh2ztY7Y5();
            return;
        }
        y4 y4Var = new y4(7, bx0Var);
        r1 r1Var = (r1) m18getOutOfFrameExecutor;
        da daVar = r1Var.gPXPFXrUH4XX;
        boolean isEmpty = daVar.isEmpty();
        daVar.addLast(y4Var);
        if (isEmpty) {
            Handler handler = r1Var.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(r1Var.BRwzKIf41E4i);
            } else {
                u9.XL4ISE6Oc65B("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }
}
