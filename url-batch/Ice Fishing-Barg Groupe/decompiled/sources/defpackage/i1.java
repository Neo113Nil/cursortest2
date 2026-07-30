package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i1 extends kv0 implements ae0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i, Object obj, Object obj2) {
        super(0);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = obj;
        this.dgRBjINgWbAK = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [m61] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [m61] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [f91] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [f91] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        boolean dispatchKeyEvent;
        d32 d32Var;
        vw0 vw0Var;
        int i = this.OPXfSBeufaJ8;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj = this.dgRBjINgWbAK;
        Object obj2 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                break;
            case 1:
                x1 x1Var = (x1) obj;
                m02 m02Var = (m02) obj2;
                h02 h02Var = m02Var.x50lh2ztY7Y5;
                h02 h02Var2 = m02Var.cpQdD2nAriOS;
                Float f = m02Var.wdg6QnbFHrFF;
                Float f2 = m02Var.dgRBjINgWbAK;
                float floatValue = (h02Var == null || f == null) ? 0.0f : ((Number) h02Var.PxuCJdSBwIXG.PxuCJdSBwIXG()).floatValue() - f.floatValue();
                float floatValue2 = (h02Var2 == null || f2 == null) ? 0.0f : ((Number) h02Var2.PxuCJdSBwIXG.PxuCJdSBwIXG()).floatValue() - f2.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int RfyTYNmI9Srp = x1Var.RfyTYNmI9Srp(m02Var.rtx2ld2ELZv4);
                    f32 f32Var = (f32) x1Var.dgRBjINgWbAK().lS5Rgt96tfkO(x1Var.XL4ISE6Oc65B);
                    if (f32Var != null) {
                        try {
                            twy4zb2fCtqq twy4zb2fctqq = x1Var.EcgxDIVH5in8;
                            if (twy4zb2fctqq != null) {
                                twy4zb2fctqq.PxuCJdSBwIXG.setBoundsInScreen(x1Var.TSizfFm2Yiuu(f32Var));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    f32 f32Var2 = (f32) x1Var.dgRBjINgWbAK().lS5Rgt96tfkO(x1Var.RfyTYNmI9Srp);
                    if (f32Var2 != null) {
                        try {
                            twy4zb2fCtqq twy4zb2fctqq2 = x1Var.S9EYkSpbGuxq;
                            if (twy4zb2fctqq2 != null) {
                                twy4zb2fctqq2.PxuCJdSBwIXG.setBoundsInScreen(x1Var.TSizfFm2Yiuu(f32Var2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    x1Var.dgRBjINgWbAK.invalidate();
                    f32 f32Var3 = (f32) x1Var.dgRBjINgWbAK().lS5Rgt96tfkO(RfyTYNmI9Srp);
                    if (f32Var3 != null && (d32Var = f32Var3.PxuCJdSBwIXG) != null && (vw0Var = d32Var.TSizfFm2Yiuu) != null) {
                        if (h02Var != null) {
                            x1Var.S2OOm9zPNm0h.rtx2ld2ELZv4(RfyTYNmI9Srp, h02Var);
                        }
                        if (h02Var2 != null) {
                            x1Var.ZbWwgt3aGe7A.rtx2ld2ELZv4(RfyTYNmI9Srp, h02Var2);
                        }
                        x1Var.QrzZRwfaDlRX(vw0Var);
                    }
                }
                if (h02Var != null) {
                    m02Var.wdg6QnbFHrFF = (Float) h02Var.PxuCJdSBwIXG.PxuCJdSBwIXG();
                }
                if (h02Var2 != null) {
                    m02Var.dgRBjINgWbAK = (Float) h02Var2.PxuCJdSBwIXG.PxuCJdSBwIXG();
                    break;
                }
                break;
            case 2:
                ae0 ae0Var = (ae0) obj2;
                if (ae0Var != null && (r10 = (qt1) ae0Var.PxuCJdSBwIXG()) != null) {
                    break;
                } else {
                    pd1 pd1Var = (pd1) obj;
                    if (!pd1Var.kRWHK87H9qm4().S9EYkSpbGuxq) {
                        pd1Var = null;
                    }
                    if (pd1Var != null) {
                        break;
                    }
                }
                break;
            case 3:
                ((dh) obj2).ZbWwgt3aGe7A.OPXfSBeufaJ8((eh) obj);
                break;
            case 4:
                ((zt1) obj2).rtx2ld2ELZv4 = ((ab0) obj).fkblLSN2bAgv();
                break;
            case 5:
                ((wj0) obj2).Y1f8riQaR6yg((m61) obj);
                break;
            case 6:
                kd1 kd1Var = ((vw0) obj2).nLZGh9p8gVSu;
                zt1 zt1Var = (zt1) obj;
                if ((kd1Var.a92UlCVFR9N8.dgRBjINgWbAK & 8) != 0) {
                    for (m61 m61Var = kd1Var.e9gEMXR7LXtO; m61Var != null; m61Var = m61Var.x50lh2ztY7Y5) {
                        if ((m61Var.wdg6QnbFHrFF & 8) != 0) {
                            ux uxVar = m61Var;
                            ?? r6 = 0;
                            while (uxVar != 0) {
                                if (uxVar instanceof b32) {
                                    b32 b32Var = (b32) uxVar;
                                    if (b32Var.rxipThha848g()) {
                                        z22 z22Var = new z22();
                                        zt1Var.rtx2ld2ELZv4 = z22Var;
                                        z22Var.dgRBjINgWbAK = true;
                                    }
                                    if (b32Var.hVNtCUZb4tYH()) {
                                        ((z22) zt1Var.rtx2ld2ELZv4).wdg6QnbFHrFF = true;
                                    }
                                    b32Var.D0aTLcX6Uhyo((l32) zt1Var.rtx2ld2ELZv4);
                                } else if ((uxVar.wdg6QnbFHrFF & 8) != 0 && (uxVar instanceof ux)) {
                                    m61 m61Var2 = uxVar.S2OOm9zPNm0h;
                                    int i2 = 0;
                                    uxVar = uxVar;
                                    r6 = r6;
                                    while (m61Var2 != null) {
                                        if ((m61Var2.wdg6QnbFHrFF & 8) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                uxVar = m61Var2;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new f91(new m61[16]);
                                                }
                                                if (uxVar != 0) {
                                                    r6.lS5Rgt96tfkO(uxVar);
                                                    uxVar = 0;
                                                }
                                                r6.lS5Rgt96tfkO(m61Var2);
                                            }
                                        }
                                        m61Var2 = m61Var2.cpQdD2nAriOS;
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
                    break;
                }
                break;
            default:
                dw1 dw1Var = pd1.wLFCmsViZrNT;
                ((le0) obj2).OPXfSBeufaJ8(dw1Var);
                pd1 pd1Var2 = (pd1) obj;
                boolean wdg6QnbFHrFF = cs0.wdg6QnbFHrFF(pd1Var2.xfACYKDMU6Dj, dw1Var.BRwzKIf41E4i);
                boolean z = pd1Var2.nLZGh9p8gVSu;
                boolean z2 = dw1Var.XL4ISE6Oc65B;
                boolean z3 = z != z2;
                if (!wdg6QnbFHrFF || z3) {
                    pd1Var2.xfACYKDMU6Dj = dw1Var.BRwzKIf41E4i;
                    pd1Var2.nLZGh9p8gVSu = z2;
                    if (pd1Var2.ryVscX7ZL4Ux && (z3 || (z2 && !wdg6QnbFHrFF))) {
                        pd1Var2.VhhvGxCb8gfr.ozEBbv0hFTAB();
                    }
                }
                pd1Var2.ryVscX7ZL4Ux = true;
                dw1Var.S2OOm9zPNm0h = dw1Var.BRwzKIf41E4i.PxuCJdSBwIXG(dw1Var.RfyTYNmI9Srp, dw1Var.S9EYkSpbGuxq, dw1Var.EcgxDIVH5in8);
                break;
        }
        return no2Var;
    }
}
