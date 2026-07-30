package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class d32 {
    public final m61 PxuCJdSBwIXG;
    public final vw0 TSizfFm2Yiuu;
    public final z22 Y1f8riQaR6yg;
    public final int a92UlCVFR9N8;
    public d32 e9gEMXR7LXtO;
    public final boolean lS5Rgt96tfkO;

    public d32(m61 m61Var, boolean z, vw0 vw0Var, z22 z22Var) {
        this.PxuCJdSBwIXG = m61Var;
        this.lS5Rgt96tfkO = z;
        this.TSizfFm2Yiuu = vw0Var;
        this.Y1f8riQaR6yg = z22Var;
        this.a92UlCVFR9N8 = vw0Var.OPXfSBeufaJ8;
    }

    public static /* synthetic */ List wdg6QnbFHrFF(int i, d32 d32Var) {
        return d32Var.OPXfSBeufaJ8((i & 1) != 0 ? !d32Var.lS5Rgt96tfkO : false, (i & 2) == 0);
    }

    public final boolean BRwzKIf41E4i() {
        if (QrzZRwfaDlRX() || !wdg6QnbFHrFF(4, this).isEmpty()) {
            return false;
        }
        vw0 S9EYkSpbGuxq = this.TSizfFm2Yiuu.S9EYkSpbGuxq();
        while (true) {
            if (S9EYkSpbGuxq == null) {
                S9EYkSpbGuxq = null;
                break;
            }
            z22 S2OOm9zPNm0h = S9EYkSpbGuxq.S2OOm9zPNm0h();
            if (S2OOm9zPNm0h != null && S2OOm9zPNm0h.wdg6QnbFHrFF) {
                break;
            }
            S9EYkSpbGuxq = S9EYkSpbGuxq.S9EYkSpbGuxq();
        }
        return S9EYkSpbGuxq == null;
    }

    public final List OPXfSBeufaJ8(boolean z, boolean z2) {
        if (!z && this.Y1f8riQaR6yg.dgRBjINgWbAK) {
            return p50.rtx2ld2ELZv4;
        }
        ArrayList arrayList = new ArrayList();
        if (!gPXPFXrUH4XX()) {
            return RfyTYNmI9Srp(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e9gEMXR7LXtO(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [m61] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [m61] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f91] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f91] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final qt1 PxuCJdSBwIXG(pd1 pd1Var) {
        ux uxVar;
        d32 x50lh2ztY7Y5 = x50lh2ztY7Y5();
        if (x50lh2ztY7Y5 == null) {
            qt1.Companion.getClass();
            return qt1.e9gEMXR7LXtO;
        }
        m61 m61Var = x50lh2ztY7Y5.TSizfFm2Yiuu.nLZGh9p8gVSu.a92UlCVFR9N8;
        if ((m61Var.dgRBjINgWbAK & 8) != 0) {
            loop0: while (m61Var != null) {
                if ((m61Var.wdg6QnbFHrFF & 8) != 0) {
                    uxVar = m61Var;
                    ?? r5 = 0;
                    while (uxVar != 0) {
                        if (uxVar instanceof b32) {
                            if (uxVar.wdg6QnbFHrFF()) {
                                break loop0;
                            }
                        } else if ((uxVar.wdg6QnbFHrFF & 8) != 0 && (uxVar instanceof ux)) {
                            m61 m61Var2 = uxVar.S2OOm9zPNm0h;
                            int i = 0;
                            uxVar = uxVar;
                            r5 = r5;
                            while (m61Var2 != null) {
                                if ((m61Var2.wdg6QnbFHrFF & 8) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        uxVar = m61Var2;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new f91(new m61[16]);
                                        }
                                        if (uxVar != 0) {
                                            r5.lS5Rgt96tfkO(uxVar);
                                            uxVar = 0;
                                        }
                                        r5.lS5Rgt96tfkO(m61Var2);
                                    }
                                }
                                m61Var2 = m61Var2.cpQdD2nAriOS;
                                uxVar = uxVar;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        uxVar = zv.dgRBjINgWbAK(r5);
                    }
                }
                if ((m61Var.dgRBjINgWbAK & 8) == 0) {
                    break;
                }
                m61Var = m61Var.cpQdD2nAriOS;
            }
        }
        uxVar = 0;
        b32 b32Var = (b32) uxVar;
        pd1 POWyO8hTM6YC = b32Var != null ? zv.POWyO8hTM6YC(b32Var, 8) : null;
        return POWyO8hTM6YC == null ? x50lh2ztY7Y5.PxuCJdSBwIXG(pd1Var) : POWyO8hTM6YC.nLZGh9p8gVSu(pd1Var, true);
    }

    public final boolean QrzZRwfaDlRX() {
        return this.e9gEMXR7LXtO != null;
    }

    public final qt1 RAsUl2FVSrh6() {
        pd1 Y1f8riQaR6yg = Y1f8riQaR6yg();
        if (Y1f8riQaR6yg != null) {
            if (!Y1f8riQaR6yg.kRWHK87H9qm4().S9EYkSpbGuxq) {
                Y1f8riQaR6yg = null;
            }
            if (Y1f8riQaR6yg != null) {
                return kj0.ZbWwgt3aGe7A(Y1f8riQaR6yg).nLZGh9p8gVSu(Y1f8riQaR6yg, true);
            }
        }
        qt1.Companion.getClass();
        return qt1.e9gEMXR7LXtO;
    }

    public final List RfyTYNmI9Srp(ArrayList arrayList, boolean z) {
        if (QrzZRwfaDlRX()) {
            return p50.rtx2ld2ELZv4;
        }
        TSizfFm2Yiuu(this.TSizfFm2Yiuu, arrayList);
        if (z) {
            z22 z22Var = this.Y1f8riQaR6yg;
            v81 v81Var = z22Var.rtx2ld2ELZv4;
            Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(h32.IAToe7bXGz4N);
            if (RAsUl2FVSrh6 == null) {
                RAsUl2FVSrh6 = null;
            }
            ww1 ww1Var = (ww1) RAsUl2FVSrh6;
            if (ww1Var != null && z22Var.wdg6QnbFHrFF && !arrayList.isEmpty()) {
                arrayList.add(lS5Rgt96tfkO(ww1Var, new y(17, ww1Var)));
            }
            k32 k32Var = h32.PxuCJdSBwIXG;
            if (v81Var.TSizfFm2Yiuu(k32Var) && !arrayList.isEmpty() && z22Var.wdg6QnbFHrFF) {
                Object RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6(k32Var);
                if (RAsUl2FVSrh62 == null) {
                    RAsUl2FVSrh62 = null;
                }
                List list = (List) RAsUl2FVSrh62;
                String str = list != null ? (String) zk.FT2GK7JK5Ma2(list) : null;
                if (str != null) {
                    arrayList.add(0, lS5Rgt96tfkO(null, new y(18, str)));
                }
            }
        }
        return arrayList;
    }

    public final void TSizfFm2Yiuu(vw0 vw0Var, ArrayList arrayList) {
        f91 ZbWwgt3aGe7A = vw0Var.ZbWwgt3aGe7A();
        Object[] objArr = ZbWwgt3aGe7A.rtx2ld2ELZv4;
        int i = ZbWwgt3aGe7A.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            vw0 vw0Var2 = (vw0) objArr[i2];
            if (vw0Var2.J54yh1s3n4Aq() && !vw0Var2.xbgXKYA2cIfu) {
                if (vw0Var2.nLZGh9p8gVSu.Y1f8riQaR6yg(8)) {
                    arrayList.add(ki0.rtx2ld2ELZv4(vw0Var2, this.lS5Rgt96tfkO));
                } else {
                    TSizfFm2Yiuu(vw0Var2, arrayList);
                }
            }
        }
    }

    public final void XL4ISE6Oc65B(ArrayList arrayList, z22 z22Var) {
        if (this.Y1f8riQaR6yg.dgRBjINgWbAK) {
            return;
        }
        RfyTYNmI9Srp(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            d32 d32Var = (d32) arrayList.get(size2);
            if (!d32Var.gPXPFXrUH4XX()) {
                z22Var.Y1f8riQaR6yg(d32Var.Y1f8riQaR6yg);
                d32Var.XL4ISE6Oc65B(arrayList, z22Var);
            }
        }
    }

    public final pd1 Y1f8riQaR6yg() {
        if (!QrzZRwfaDlRX()) {
            b32 a92UlCVFR9N8 = a92UlCVFR9N8();
            return a92UlCVFR9N8 != null ? zv.POWyO8hTM6YC(a92UlCVFR9N8, 8) : this.TSizfFm2Yiuu.nLZGh9p8gVSu.TSizfFm2Yiuu;
        }
        d32 x50lh2ztY7Y5 = x50lh2ztY7Y5();
        if (x50lh2ztY7Y5 != null) {
            return x50lh2ztY7Y5.Y1f8riQaR6yg();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b32 a92UlCVFR9N8() {
        m61 m61Var;
        boolean z;
        boolean z2 = this.Y1f8riQaR6yg.wdg6QnbFHrFF;
        Object obj = null;
        vw0 vw0Var = this.TSizfFm2Yiuu;
        if (!z2) {
            m61 m61Var2 = vw0Var.nLZGh9p8gVSu.a92UlCVFR9N8;
            if ((m61Var2.dgRBjINgWbAK & 8) != 0) {
                loop3: while (m61Var2 != null) {
                    if ((m61Var2.wdg6QnbFHrFF & 8) != 0) {
                        m61Var = m61Var2;
                        f91 f91Var = null;
                        while (m61Var != null) {
                            if (m61Var instanceof b32) {
                                if (((b32) m61Var).wdg6QnbFHrFF()) {
                                    obj = m61Var;
                                }
                            } else if ((m61Var.wdg6QnbFHrFF & 8) != 0 && (m61Var instanceof ux)) {
                                int i = 0;
                                for (m61 m61Var3 = ((ux) m61Var).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                                    if ((m61Var3.wdg6QnbFHrFF & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            m61Var = m61Var3;
                                        } else {
                                            if (f91Var == null) {
                                                f91Var = new f91(new m61[16]);
                                            }
                                            if (m61Var != null) {
                                                f91Var.lS5Rgt96tfkO(m61Var);
                                                m61Var = null;
                                            }
                                            f91Var.lS5Rgt96tfkO(m61Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            m61Var = zv.dgRBjINgWbAK(f91Var);
                        }
                    }
                    if ((m61Var2.dgRBjINgWbAK & 8) == 0) {
                        break;
                    }
                    m61Var2 = m61Var2.cpQdD2nAriOS;
                }
            }
            return (b32) obj;
        }
        m61 m61Var4 = vw0Var.nLZGh9p8gVSu.a92UlCVFR9N8;
        if ((m61Var4.dgRBjINgWbAK & 8) != 0) {
            m61Var = null;
            while (m61Var4 != null) {
                if ((m61Var4.wdg6QnbFHrFF & 8) != 0) {
                    m61 m61Var5 = m61Var4;
                    f91 f91Var2 = null;
                    while (m61Var5 != null) {
                        if (m61Var5 instanceof b32) {
                            b32 b32Var = (b32) m61Var5;
                            if (b32Var.wdg6QnbFHrFF()) {
                                if (b32Var.hVNtCUZb4tYH()) {
                                    return b32Var;
                                }
                                if (m61Var == null) {
                                    m61Var = b32Var;
                                }
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && (m61Var5.wdg6QnbFHrFF & 8) != 0 && (m61Var5 instanceof ux)) {
                            int i2 = 0;
                            for (m61 m61Var6 = ((ux) m61Var5).S2OOm9zPNm0h; m61Var6 != null; m61Var6 = m61Var6.cpQdD2nAriOS) {
                                if ((m61Var6.wdg6QnbFHrFF & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        m61Var5 = m61Var6;
                                    } else {
                                        if (f91Var2 == null) {
                                            f91Var2 = new f91(new m61[16]);
                                        }
                                        if (m61Var5 != null) {
                                            f91Var2.lS5Rgt96tfkO(m61Var5);
                                            m61Var5 = null;
                                        }
                                        f91Var2.lS5Rgt96tfkO(m61Var6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        m61Var5 = zv.dgRBjINgWbAK(f91Var2);
                    }
                }
                if ((m61Var4.dgRBjINgWbAK & 8) == 0) {
                    break;
                }
                m61Var4 = m61Var4.cpQdD2nAriOS;
            }
            obj = m61Var;
        }
        return (b32) obj;
    }

    public final qt1 cpQdD2nAriOS() {
        tx a92UlCVFR9N8 = a92UlCVFR9N8();
        if (a92UlCVFR9N8 == null) {
            return this.TSizfFm2Yiuu.nLZGh9p8gVSu.TSizfFm2Yiuu.r();
        }
        m61 m61Var = ((m61) a92UlCVFR9N8).rtx2ld2ELZv4;
        Object RAsUl2FVSrh6 = this.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(y22.lS5Rgt96tfkO);
        if (RAsUl2FVSrh6 == null) {
            RAsUl2FVSrh6 = null;
        }
        return th0.BRwzKIf41E4i(m61Var, RAsUl2FVSrh6 != null, true);
    }

    public final z22 dgRBjINgWbAK() {
        boolean gPXPFXrUH4XX = gPXPFXrUH4XX();
        z22 z22Var = this.Y1f8riQaR6yg;
        if (!gPXPFXrUH4XX) {
            return z22Var;
        }
        z22 lS5Rgt96tfkO = z22Var.lS5Rgt96tfkO();
        XL4ISE6Oc65B(new ArrayList(), lS5Rgt96tfkO);
        return lS5Rgt96tfkO;
    }

    public final void e9gEMXR7LXtO(ArrayList arrayList, ArrayList arrayList2) {
        RfyTYNmI9Srp(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            d32 d32Var = (d32) arrayList.get(size2);
            if (d32Var.gPXPFXrUH4XX()) {
                arrayList2.add(d32Var);
            } else if (!d32Var.Y1f8riQaR6yg.dgRBjINgWbAK) {
                d32Var.e9gEMXR7LXtO(arrayList, arrayList2);
            }
        }
    }

    public final boolean gPXPFXrUH4XX() {
        return this.lS5Rgt96tfkO && this.Y1f8riQaR6yg.wdg6QnbFHrFF;
    }

    public final d32 lS5Rgt96tfkO(ww1 ww1Var, le0 le0Var) {
        z22 z22Var = new z22();
        z22Var.wdg6QnbFHrFF = false;
        z22Var.dgRBjINgWbAK = false;
        le0Var.OPXfSBeufaJ8(z22Var);
        d32 d32Var = new d32(new c32(le0Var), false, new vw0(this.a92UlCVFR9N8 + (ww1Var != null ? 1000000000 : 2000000000), true), z22Var);
        d32Var.e9gEMXR7LXtO = this;
        return d32Var;
    }

    public final z22 r3s1LDPKFs1S() {
        return this.Y1f8riQaR6yg;
    }

    public final qt1 rtx2ld2ELZv4() {
        pd1 Y1f8riQaR6yg = Y1f8riQaR6yg();
        if (Y1f8riQaR6yg != null) {
            if (!Y1f8riQaR6yg.kRWHK87H9qm4().S9EYkSpbGuxq) {
                Y1f8riQaR6yg = null;
            }
            if (Y1f8riQaR6yg != null) {
                return kj0.wdg6QnbFHrFF(Y1f8riQaR6yg, true);
            }
        }
        qt1.Companion.getClass();
        return qt1.e9gEMXR7LXtO;
    }

    public final d32 x50lh2ztY7Y5() {
        vw0 vw0Var;
        d32 d32Var = this.e9gEMXR7LXtO;
        if (d32Var != null) {
            return d32Var;
        }
        vw0 vw0Var2 = this.TSizfFm2Yiuu;
        boolean z = this.lS5Rgt96tfkO;
        if (z) {
            vw0Var = vw0Var2.S9EYkSpbGuxq();
            while (vw0Var != null) {
                z22 S2OOm9zPNm0h = vw0Var.S2OOm9zPNm0h();
                if (S2OOm9zPNm0h != null && S2OOm9zPNm0h.wdg6QnbFHrFF) {
                    break;
                }
                vw0Var = vw0Var.S9EYkSpbGuxq();
            }
        }
        vw0Var = null;
        if (vw0Var == null) {
            vw0 S9EYkSpbGuxq = vw0Var2.S9EYkSpbGuxq();
            while (true) {
                if (S9EYkSpbGuxq == null) {
                    vw0Var = null;
                    break;
                }
                if (S9EYkSpbGuxq.nLZGh9p8gVSu.Y1f8riQaR6yg(8)) {
                    vw0Var = S9EYkSpbGuxq;
                    break;
                }
                S9EYkSpbGuxq = S9EYkSpbGuxq.S9EYkSpbGuxq();
            }
        }
        if (vw0Var == null) {
            return null;
        }
        return ki0.rtx2ld2ELZv4(vw0Var, z);
    }
}
