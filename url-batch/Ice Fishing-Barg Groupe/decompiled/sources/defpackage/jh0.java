package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class jh0 implements c22, uq2 {
    public static final /* synthetic */ int rtx2ld2ELZv4 = 0;

    public static final ol2 BRwzKIf41E4i(ux uxVar, Object obj) {
        kd1 kd1Var;
        if (!uxVar.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
        }
        m61 m61Var = uxVar.rtx2ld2ELZv4.x50lh2ztY7Y5;
        vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(uxVar);
        while (zf8DYfih6EZu != null) {
            if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 262144) != 0) {
                while (m61Var != null) {
                    if ((m61Var.wdg6QnbFHrFF & 262144) != 0) {
                        m61 m61Var2 = m61Var;
                        f91 f91Var = null;
                        while (m61Var2 != null) {
                            if (m61Var2 instanceof ol2) {
                                ol2 ol2Var = (ol2) m61Var2;
                                if (obj.equals(ol2Var.RfyTYNmI9Srp())) {
                                    return ol2Var;
                                }
                            }
                            if ((m61Var2.wdg6QnbFHrFF & 262144) != 0 && (m61Var2 instanceof ux)) {
                                int i = 0;
                                for (m61 m61Var3 = ((ux) m61Var2).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                                    if ((m61Var3.wdg6QnbFHrFF & 262144) != 0) {
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
        return null;
    }

    public static final String BjEWd04qc7Mw(int i, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        return ((Resources) ((tf0) hpVar).wdg6QnbFHrFF(h2.TSizfFm2Yiuu)).getString(i);
    }

    public static final w31 EcgxDIVH5in8(w31 w31Var) {
        vw0 vw0Var = w31Var.VhhvGxCb8gfr.VhhvGxCb8gfr;
        while (true) {
            vw0 S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq();
            vw0 vw0Var2 = null;
            if ((S9EYkSpbGuxq != null ? S9EYkSpbGuxq.QrzZRwfaDlRX : null) == null) {
                w31 vfcx0XMziUg4 = vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg.vfcx0XMziUg4();
                vfcx0XMziUg4.getClass();
                return vfcx0XMziUg4;
            }
            vw0 S9EYkSpbGuxq2 = vw0Var.S9EYkSpbGuxq();
            if (S9EYkSpbGuxq2 != null) {
                vw0Var2 = S9EYkSpbGuxq2.QrzZRwfaDlRX;
            }
            vw0Var2.getClass();
            vw0 S9EYkSpbGuxq3 = vw0Var.S9EYkSpbGuxq();
            S9EYkSpbGuxq3.getClass();
            vw0Var = S9EYkSpbGuxq3.QrzZRwfaDlRX;
            vw0Var.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, ol2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [le0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [m61] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [m61] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [f91] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [f91] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void EpkonXwzFgDB(ol2 ol2Var, le0 le0Var) {
        if (!((m61) ol2Var).rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitSubtreeIf called on an unattached node");
        }
        f91 f91Var = new f91(new m61[16]);
        m61 m61Var = ((m61) ol2Var).rtx2ld2ELZv4;
        m61 m61Var2 = m61Var.cpQdD2nAriOS;
        if (m61Var2 == null) {
            zv.OPXfSBeufaJ8(f91Var, m61Var);
        } else {
            f91Var.lS5Rgt96tfkO(m61Var2);
        }
        while (true) {
            int i = f91Var.wdg6QnbFHrFF;
            if (i == 0) {
                return;
            }
            m61 m61Var3 = (m61) f91Var.dgRBjINgWbAK(i - 1);
            if ((m61Var3.dgRBjINgWbAK & 262144) != 0) {
                for (m61 m61Var4 = m61Var3; m61Var4 != null && m61Var4.S9EYkSpbGuxq; m61Var4 = m61Var4.cpQdD2nAriOS) {
                    if ((m61Var4.wdg6QnbFHrFF & 262144) != 0) {
                        ux uxVar = m61Var4;
                        ?? r7 = 0;
                        while (uxVar != 0) {
                            if (uxVar instanceof ol2) {
                                ol2 ol2Var2 = (ol2) uxVar;
                                ml2 ml2Var = (cs0.wdg6QnbFHrFF(ol2Var.RfyTYNmI9Srp(), ol2Var2.RfyTYNmI9Srp()) && ol2Var.getClass() == ol2Var2.getClass()) ? (ml2) le0Var.OPXfSBeufaJ8(ol2Var2) : ml2.rtx2ld2ELZv4;
                                if (ml2Var == ml2.wdg6QnbFHrFF) {
                                    return;
                                }
                                if (ml2Var == ml2.OPXfSBeufaJ8) {
                                    break;
                                }
                            } else if ((uxVar.wdg6QnbFHrFF & 262144) != 0 && (uxVar instanceof ux)) {
                                m61 m61Var5 = uxVar.S2OOm9zPNm0h;
                                int i2 = 0;
                                uxVar = uxVar;
                                r7 = r7;
                                while (m61Var5 != null) {
                                    if ((m61Var5.wdg6QnbFHrFF & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            uxVar = m61Var5;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new f91(new m61[16]);
                                            }
                                            if (uxVar != 0) {
                                                r7.lS5Rgt96tfkO(uxVar);
                                                uxVar = 0;
                                            }
                                            r7.lS5Rgt96tfkO(m61Var5);
                                        }
                                    }
                                    m61Var5 = m61Var5.cpQdD2nAriOS;
                                    uxVar = uxVar;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            uxVar = zv.dgRBjINgWbAK(r7);
                        }
                    }
                }
            }
            zv.OPXfSBeufaJ8(f91Var, m61Var3);
        }
    }

    public static final long IAToe7bXGz4N(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : hl.lS5Rgt96tfkO(j, hl.Y1f8riQaR6yg(j) * f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, ol2, tx] */
    /* JADX WARN: Type inference failed for: r11v0, types: [le0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [m61] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [m61] */
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
    public static final void J54yh1s3n4Aq(ol2 ol2Var, le0 le0Var) {
        kd1 kd1Var;
        m61 m61Var = (m61) ol2Var;
        if (!m61Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
        }
        m61 m61Var2 = m61Var.rtx2ld2ELZv4.x50lh2ztY7Y5;
        vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(ol2Var);
        while (zf8DYfih6EZu != null) {
            if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 262144) != 0) {
                while (m61Var2 != null) {
                    if ((m61Var2.wdg6QnbFHrFF & 262144) != 0) {
                        ux uxVar = m61Var2;
                        ?? r5 = 0;
                        while (uxVar != 0) {
                            boolean z = true;
                            if (uxVar instanceof ol2) {
                                ol2 ol2Var2 = (ol2) uxVar;
                                if (cs0.wdg6QnbFHrFF(ol2Var.RfyTYNmI9Srp(), ol2Var2.RfyTYNmI9Srp()) && ol2Var.getClass() == ol2Var2.getClass()) {
                                    z = ((Boolean) le0Var.OPXfSBeufaJ8(ol2Var2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((uxVar.wdg6QnbFHrFF & 262144) != 0 && (uxVar instanceof ux)) {
                                m61 m61Var3 = uxVar.S2OOm9zPNm0h;
                                int i = 0;
                                uxVar = uxVar;
                                r5 = r5;
                                while (m61Var3 != null) {
                                    if ((m61Var3.wdg6QnbFHrFF & 262144) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            uxVar = zv.dgRBjINgWbAK(r5);
                        }
                    }
                    m61Var2 = m61Var2.x50lh2ztY7Y5;
                }
            }
            zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
            m61Var2 = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OPXfSBeufaJ8(defpackage.oc2 r6, defpackage.nc r7) {
        /*
            boolean r0 = r7 instanceof defpackage.mw1
            if (r0 == 0) goto L13
            r0 = r7
            mw1 r0 = (defpackage.mw1) r0
            int r1 = r0.cpQdD2nAriOS
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.cpQdD2nAriOS = r1
            goto L18
        L13:
            mw1 r0 = new mw1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.x50lh2ztY7Y5
            int r1 = r0.cpQdD2nAriOS
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            oc2 r6 = r0.dgRBjINgWbAK
            defpackage.ng0.tmVwIGCQF4zR(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u9.rtx2ld2ELZv4(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.ng0.tmVwIGCQF4zR(r7)
        L31:
            r0.dgRBjINgWbAK = r6
            r0.cpQdD2nAriOS = r2
            rn1 r7 = defpackage.rn1.OPXfSBeufaJ8
            java.lang.Object r7 = r6.PxuCJdSBwIXG(r7, r0)
            su r1 = defpackage.su.rtx2ld2ELZv4
            if (r7 != r1) goto L40
            return r1
        L40:
            qn1 r7 = (defpackage.qn1) r7
            int r1 = r7.Y1f8riQaR6yg
            java.util.List r7 = r7.PxuCJdSBwIXG
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            ao1 r5 = (defpackage.ao1) r5
            boolean r5 = defpackage.ni0.OPXfSBeufaJ8(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh0.OPXfSBeufaJ8(oc2, nc):java.lang.Object");
    }

    public static long QrzZRwfaDlRX(long j, kx0 kx0Var) {
        kx0 kx0Var2 = kx0.rtx2ld2ELZv4;
        return sr.PxuCJdSBwIXG(kx0Var == kx0Var2 ? rr.wdg6QnbFHrFF(j) : rr.OPXfSBeufaJ8(j), kx0Var == kx0Var2 ? rr.rtx2ld2ELZv4(j) : rr.RAsUl2FVSrh6(j), kx0Var == kx0Var2 ? rr.OPXfSBeufaJ8(j) : rr.wdg6QnbFHrFF(j), kx0Var == kx0Var2 ? rr.RAsUl2FVSrh6(j) : rr.rtx2ld2ELZv4(j));
    }

    public static final void RAsUl2FVSrh6(boolean z, pe0 pe0Var, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1818896922);
        int i2 = (tf0Var.RAsUl2FVSrh6(z) ? 4 : 2) | i | (tf0Var.rtx2ld2ELZv4(pe0Var) ? 32 : 16);
        if ((i2 & 19) == 18 && tf0Var.e6tOsSdd2EFb()) {
            tf0Var.i68hK7ahKtgp();
        } else {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            ni0.lS5Rgt96tfkO(z, pe0Var, tf0Var, i2 & 126);
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new lt(z, pe0Var, i);
        }
    }

    public static final Object RfyTYNmI9Srp(z22 z22Var, k32 k32Var) {
        Object RAsUl2FVSrh6 = z22Var.rtx2ld2ELZv4.RAsUl2FVSrh6(k32Var);
        if (RAsUl2FVSrh6 == null) {
            return null;
        }
        return RAsUl2FVSrh6;
    }

    public static final boolean S2OOm9zPNm0h(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static final int S9EYkSpbGuxq(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            su0.Companion.getClass();
            return 2;
        }
        if (action != 1) {
            su0.Companion.getClass();
            return 0;
        }
        su0.Companion.getClass();
        return 1;
    }

    public static final ap0 TSizfFm2Yiuu(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        return new ap0(str, new bp0(kSerializer));
    }

    public static int VhhvGxCb8gfr(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    public static final long XL4ISE6Oc65B(KeyEvent keyEvent) {
        return ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
    }

    public static final boolean ZbWwgt3aGe7A(vw0 vw0Var) {
        if (vw0Var.QrzZRwfaDlRX == null) {
            return false;
        }
        vw0 S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq();
        return (S9EYkSpbGuxq != null ? S9EYkSpbGuxq.QrzZRwfaDlRX : null) == null || vw0Var.ryVscX7ZL4Ux.lS5Rgt96tfkO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ee, code lost:
    
        if (r8 == r11) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02a5, code lost:
    
        if (r14.RAsUl2FVSrh6(true) == false) goto L174;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x022e  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a92UlCVFR9N8(final n61 n61Var, jz0 jz0Var, final mi1 mi1Var, final lw lwVar, final boolean z, final k3 k3Var, final nd ndVar, final z9 z9Var, final le0 le0Var, hp hpVar, final int i, final int i2) {
        int i3;
        int i4;
        jz0 jz0Var2;
        tf0 tf0Var;
        int i5;
        int i6;
        boolean z2;
        Object nLZGh9p8gVSu;
        fb0 fb0Var;
        int i7;
        boolean z3;
        Object obj;
        boolean z4;
        boolean a92UlCVFR9N8;
        Object dz0Var;
        jz0 jz0Var3;
        py0 py0Var;
        ?? r12;
        boolean z5;
        az0 az0Var;
        n61 n61Var2;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(924924659);
        if ((i & 6) == 0) {
            i3 = (tf0Var2.a92UlCVFR9N8(n61Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tf0Var2.a92UlCVFR9N8(jz0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tf0Var2.a92UlCVFR9N8(mi1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tf0Var2.RAsUl2FVSrh6(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tf0Var2.RAsUl2FVSrh6(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= tf0Var2.a92UlCVFR9N8(lwVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= tf0Var2.RAsUl2FVSrh6(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= tf0Var2.a92UlCVFR9N8(k3Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tf0Var2.a92UlCVFR9N8(ndVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (tf0Var2.a92UlCVFR9N8(z9Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i8 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i8 |= tf0Var2.rtx2ld2ELZv4(le0Var) ? 2048 : 1024;
        }
        if (tf0Var2.Pf0ThKz3j5YS(i3 & 1, ((306783379 & i3) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            tf0Var2.wLFCmsViZrNT();
            if ((i & 1) == 0 || tf0Var2.pnx5pC0XzaCw()) {
                gg1 gg1Var = mp.PxuCJdSBwIXG;
            } else {
                tf0Var2.i68hK7ahKtgp();
            }
            int i9 = i3 & (-234881025);
            tf0Var2.BRwzKIf41E4i();
            gg1 gg1Var2 = mp.PxuCJdSBwIXG;
            int i10 = i9 >> 3;
            int i11 = i10 & 14;
            int i12 = i11 | ((i8 >> 6) & 112);
            d91 Pf0ThKz3j5YS = sj0.Pf0ThKz3j5YS(le0Var, tf0Var2);
            boolean z6 = (((i12 & 14) ^ 6) > 4 && tf0Var2.a92UlCVFR9N8(jz0Var)) || (i12 & 6) == 4;
            Object nLZGh9p8gVSu2 = tf0Var2.nLZGh9p8gVSu();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (!z6) {
                hp.Companion.getClass();
                if (nLZGh9p8gVSu2 != jx1Var) {
                    i5 = i11;
                    i6 = i8;
                    az0 az0Var2 = (az0) nLZGh9p8gVSu2;
                    int i13 = i9 >> 9;
                    int i14 = i5 | (i13 & 112);
                    z2 = ((((i14 & 112) ^ 48) <= 32 && tf0Var2.RAsUl2FVSrh6(true)) || (i14 & 48) == 32) | ((((i14 & 14) ^ 6) <= 4 && tf0Var2.a92UlCVFR9N8(jz0Var)) || (i14 & 6) == 4);
                    Object nLZGh9p8gVSu3 = tf0Var2.nLZGh9p8gVSu();
                    if (!z2) {
                        hp.Companion.getClass();
                    }
                    nLZGh9p8gVSu3 = new py0(jz0Var);
                    tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu3);
                    py0 py0Var2 = (py0) nLZGh9p8gVSu3;
                    nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
                    hp.Companion.getClass();
                    if (nLZGh9p8gVSu == jx1Var) {
                        nLZGh9p8gVSu = mm2.kpCQ9veP6n3I(tf0Var2);
                        tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu);
                    }
                    ru ruVar = (ru) nLZGh9p8gVSu;
                    nh0 nh0Var = (nh0) tf0Var2.wdg6QnbFHrFF(eq.RAsUl2FVSrh6);
                    if (((Boolean) tf0Var2.wdg6QnbFHrFF(eq.S2OOm9zPNm0h)).booleanValue()) {
                        y92.Companion.getClass();
                        fb0Var = x92.lS5Rgt96tfkO;
                    } else {
                        fb0Var = null;
                    }
                    int i15 = i6 << 18;
                    i7 = (i9 & 65520) | (i13 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | ((i6 << 27) & 1879048192);
                    boolean z7 = ((((i7 & 896) ^ 384) <= 256 && tf0Var2.a92UlCVFR9N8(mi1Var)) || (i7 & 384) == 256) | ((((i7 & 112) ^ 48) <= 32 && tf0Var2.a92UlCVFR9N8(jz0Var)) || (i7 & 48) == 32) | ((((i7 & 7168) ^ 3072) <= 2048 && tf0Var2.RAsUl2FVSrh6(false)) || (i7 & 3072) == 2048);
                    if (((57344 & i7) ^ 24576) <= 16384) {
                    }
                    if ((i7 & 24576) != 16384) {
                        z3 = false;
                        boolean Y1f8riQaR6yg = z7 | z3 | tf0Var2.Y1f8riQaR6yg(0) | ((((i7 & 3670016) ^ 1572864) <= 1048576 && tf0Var2.a92UlCVFR9N8(ndVar)) || (i7 & 1572864) == 1048576);
                        if (((i7 & 29360128) ^ 12582912) > 8388608) {
                            obj = null;
                            if (tf0Var2.a92UlCVFR9N8(null)) {
                                z4 = true;
                                a92UlCVFR9N8 = (((i7 & 234881024) ^ 100663296) <= 67108864 && tf0Var2.a92UlCVFR9N8(obj)) | Y1f8riQaR6yg | z4 | ((((i7 & 1879048192) ^ 805306368) <= 536870912 && tf0Var2.a92UlCVFR9N8(z9Var)) || (i7 & 805306368) == 536870912) | tf0Var2.a92UlCVFR9N8(nh0Var) | tf0Var2.a92UlCVFR9N8(fb0Var);
                                Object nLZGh9p8gVSu4 = tf0Var2.nLZGh9p8gVSu();
                                if (!a92UlCVFR9N8 || nLZGh9p8gVSu4 == jx1Var) {
                                    jz0Var3 = jz0Var;
                                    py0Var = py0Var2;
                                    r12 = 0;
                                    z5 = true;
                                    dz0Var = new dz0(jz0Var3, mi1Var, az0Var2, z9Var, ruVar, nh0Var, fb0Var, ndVar);
                                    az0Var = az0Var2;
                                    tf0Var2.JTxCbbCwomzt(dz0Var);
                                } else {
                                    dz0Var = nLZGh9p8gVSu4;
                                    py0Var = py0Var2;
                                    az0Var = az0Var2;
                                    r12 = 0;
                                    z5 = true;
                                    jz0Var3 = jz0Var;
                                }
                                dz0 dz0Var2 = (dz0) dz0Var;
                                th1 th1Var = th1.rtx2ld2ELZv4;
                                if (z) {
                                    tf0Var2.IXK6ba3ucyzm(-2076718545);
                                    tf0Var2.gPXPFXrUH4XX(r12);
                                    n61Var2 = n61.Companion;
                                } else {
                                    tf0Var2.IXK6ba3ucyzm(-2077147368);
                                    k61 k61Var = n61.Companion;
                                    if ((((i10 & 14) ^ 6) <= 4 || !tf0Var2.a92UlCVFR9N8(jz0Var3)) && (i10 & 6) != 4) {
                                        z5 = r12;
                                    }
                                    boolean Y1f8riQaR6yg2 = z5 | tf0Var2.Y1f8riQaR6yg(r12);
                                    Object nLZGh9p8gVSu5 = tf0Var2.nLZGh9p8gVSu();
                                    if (Y1f8riQaR6yg2 || nLZGh9p8gVSu5 == jx1Var) {
                                        nLZGh9p8gVSu5 = new vy0(jz0Var3);
                                        tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu5);
                                    }
                                    n61Var2 = mm2.wLFCmsViZrNT(k61Var, (vy0) nLZGh9p8gVSu5, jz0Var3.QrzZRwfaDlRX, th1Var);
                                    tf0Var2.gPXPFXrUH4XX(r12);
                                }
                                jz0Var2 = jz0Var3;
                                tf0Var = tf0Var2;
                                sj0.PxuCJdSBwIXG(az0Var, hq0.gGoUzNp9JO5I(f2.pnx5pC0XzaCw(n61Var.TSizfFm2Yiuu(jz0Var3.x50lh2ztY7Y5).TSizfFm2Yiuu(jz0Var3.cpQdD2nAriOS), az0Var, py0Var, th1Var, z).TSizfFm2Yiuu(n61Var2).TSizfFm2Yiuu(jz0Var3.r3s1LDPKFs1S.OPXfSBeufaJ8), jz0Var3, th1Var, k3Var, z, lwVar, jz0Var3.RAsUl2FVSrh6), jz0Var2.gPXPFXrUH4XX, dz0Var2, tf0Var, 0);
                            }
                        } else {
                            obj = null;
                        }
                        z4 = false;
                        a92UlCVFR9N8 = (((i7 & 234881024) ^ 100663296) <= 67108864 && tf0Var2.a92UlCVFR9N8(obj)) | Y1f8riQaR6yg | z4 | ((((i7 & 1879048192) ^ 805306368) <= 536870912 && tf0Var2.a92UlCVFR9N8(z9Var)) || (i7 & 805306368) == 536870912) | tf0Var2.a92UlCVFR9N8(nh0Var) | tf0Var2.a92UlCVFR9N8(fb0Var);
                        Object nLZGh9p8gVSu42 = tf0Var2.nLZGh9p8gVSu();
                        if (a92UlCVFR9N8) {
                        }
                        jz0Var3 = jz0Var;
                        py0Var = py0Var2;
                        r12 = 0;
                        z5 = true;
                        dz0Var = new dz0(jz0Var3, mi1Var, az0Var2, z9Var, ruVar, nh0Var, fb0Var, ndVar);
                        az0Var = az0Var2;
                        tf0Var2.JTxCbbCwomzt(dz0Var);
                        dz0 dz0Var22 = (dz0) dz0Var;
                        th1 th1Var2 = th1.rtx2ld2ELZv4;
                        if (z) {
                        }
                        jz0Var2 = jz0Var3;
                        tf0Var = tf0Var2;
                        sj0.PxuCJdSBwIXG(az0Var, hq0.gGoUzNp9JO5I(f2.pnx5pC0XzaCw(n61Var.TSizfFm2Yiuu(jz0Var3.x50lh2ztY7Y5).TSizfFm2Yiuu(jz0Var3.cpQdD2nAriOS), az0Var, py0Var, th1Var2, z).TSizfFm2Yiuu(n61Var2).TSizfFm2Yiuu(jz0Var3.r3s1LDPKFs1S.OPXfSBeufaJ8), jz0Var3, th1Var2, k3Var, z, lwVar, jz0Var3.RAsUl2FVSrh6), jz0Var2.gPXPFXrUH4XX, dz0Var22, tf0Var, 0);
                    }
                    z3 = true;
                    boolean Y1f8riQaR6yg3 = z7 | z3 | tf0Var2.Y1f8riQaR6yg(0) | ((((i7 & 3670016) ^ 1572864) <= 1048576 && tf0Var2.a92UlCVFR9N8(ndVar)) || (i7 & 1572864) == 1048576);
                    if (((i7 & 29360128) ^ 12582912) > 8388608) {
                    }
                    z4 = false;
                    a92UlCVFR9N8 = (((i7 & 234881024) ^ 100663296) <= 67108864 && tf0Var2.a92UlCVFR9N8(obj)) | Y1f8riQaR6yg3 | z4 | ((((i7 & 1879048192) ^ 805306368) <= 536870912 && tf0Var2.a92UlCVFR9N8(z9Var)) || (i7 & 805306368) == 536870912) | tf0Var2.a92UlCVFR9N8(nh0Var) | tf0Var2.a92UlCVFR9N8(fb0Var);
                    Object nLZGh9p8gVSu422 = tf0Var2.nLZGh9p8gVSu();
                    if (a92UlCVFR9N8) {
                    }
                    jz0Var3 = jz0Var;
                    py0Var = py0Var2;
                    r12 = 0;
                    z5 = true;
                    dz0Var = new dz0(jz0Var3, mi1Var, az0Var2, z9Var, ruVar, nh0Var, fb0Var, ndVar);
                    az0Var = az0Var2;
                    tf0Var2.JTxCbbCwomzt(dz0Var);
                    dz0 dz0Var222 = (dz0) dz0Var;
                    th1 th1Var22 = th1.rtx2ld2ELZv4;
                    if (z) {
                    }
                    jz0Var2 = jz0Var3;
                    tf0Var = tf0Var2;
                    sj0.PxuCJdSBwIXG(az0Var, hq0.gGoUzNp9JO5I(f2.pnx5pC0XzaCw(n61Var.TSizfFm2Yiuu(jz0Var3.x50lh2ztY7Y5).TSizfFm2Yiuu(jz0Var3.cpQdD2nAriOS), az0Var, py0Var, th1Var22, z).TSizfFm2Yiuu(n61Var2).TSizfFm2Yiuu(jz0Var3.r3s1LDPKFs1S.OPXfSBeufaJ8), jz0Var3, th1Var22, k3Var, z, lwVar, jz0Var3.RAsUl2FVSrh6), jz0Var2.gPXPFXrUH4XX, dz0Var222, tf0Var, 0);
                }
            }
            qx0 qx0Var = new qx0();
            i5 = i11;
            qx0Var.PxuCJdSBwIXG = new hj1(Integer.MAX_VALUE);
            qx0Var.lS5Rgt96tfkO = new hj1(Integer.MAX_VALUE);
            jx1 jx1Var2 = jx1.S9EYkSpbGuxq;
            i6 = i8;
            m6 m6Var = new m6(Pf0ThKz3j5YS, 4);
            m9 m9Var = z72.PxuCJdSBwIXG;
            nLZGh9p8gVSu2 = new az0(0, 0, i92.class, new ty(new vb(new ty(m6Var, jx1Var2), jz0Var, qx0Var, 5), jx1Var2), "value", "getValue()Ljava/lang/Object;");
            tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu2);
            az0 az0Var22 = (az0) nLZGh9p8gVSu2;
            int i132 = i9 >> 9;
            int i142 = i5 | (i132 & 112);
            if (((i142 & 14) ^ 6) <= 4) {
            }
            z2 = ((((i142 & 112) ^ 48) <= 32 && tf0Var2.RAsUl2FVSrh6(true)) || (i142 & 48) == 32) | ((((i142 & 14) ^ 6) <= 4 && tf0Var2.a92UlCVFR9N8(jz0Var)) || (i142 & 6) == 4);
            Object nLZGh9p8gVSu32 = tf0Var2.nLZGh9p8gVSu();
            if (!z2) {
            }
            nLZGh9p8gVSu32 = new py0(jz0Var);
            tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu32);
            py0 py0Var22 = (py0) nLZGh9p8gVSu32;
            nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu == jx1Var) {
            }
            ru ruVar2 = (ru) nLZGh9p8gVSu;
            nh0 nh0Var2 = (nh0) tf0Var2.wdg6QnbFHrFF(eq.RAsUl2FVSrh6);
            if (((Boolean) tf0Var2.wdg6QnbFHrFF(eq.S2OOm9zPNm0h)).booleanValue()) {
            }
            int i152 = i6 << 18;
            i7 = (i9 & 65520) | (i132 & 3670016) | (i152 & 29360128) | (i152 & 234881024) | ((i6 << 27) & 1879048192);
            if (((i7 & 112) ^ 48) <= 32) {
            }
            boolean z72 = ((((i7 & 896) ^ 384) <= 256 && tf0Var2.a92UlCVFR9N8(mi1Var)) || (i7 & 384) == 256) | ((((i7 & 112) ^ 48) <= 32 && tf0Var2.a92UlCVFR9N8(jz0Var)) || (i7 & 48) == 32) | ((((i7 & 7168) ^ 3072) <= 2048 && tf0Var2.RAsUl2FVSrh6(false)) || (i7 & 3072) == 2048);
            if (((57344 & i7) ^ 24576) <= 16384) {
            }
            if ((i7 & 24576) != 16384) {
            }
            z3 = true;
            boolean Y1f8riQaR6yg32 = z72 | z3 | tf0Var2.Y1f8riQaR6yg(0) | ((((i7 & 3670016) ^ 1572864) <= 1048576 && tf0Var2.a92UlCVFR9N8(ndVar)) || (i7 & 1572864) == 1048576);
            if (((i7 & 29360128) ^ 12582912) > 8388608) {
            }
            z4 = false;
            a92UlCVFR9N8 = (((i7 & 234881024) ^ 100663296) <= 67108864 && tf0Var2.a92UlCVFR9N8(obj)) | Y1f8riQaR6yg32 | z4 | ((((i7 & 1879048192) ^ 805306368) <= 536870912 && tf0Var2.a92UlCVFR9N8(z9Var)) || (i7 & 805306368) == 536870912) | tf0Var2.a92UlCVFR9N8(nh0Var2) | tf0Var2.a92UlCVFR9N8(fb0Var);
            Object nLZGh9p8gVSu4222 = tf0Var2.nLZGh9p8gVSu();
            if (a92UlCVFR9N8) {
            }
            jz0Var3 = jz0Var;
            py0Var = py0Var22;
            r12 = 0;
            z5 = true;
            dz0Var = new dz0(jz0Var3, mi1Var, az0Var22, z9Var, ruVar2, nh0Var2, fb0Var, ndVar);
            az0Var = az0Var22;
            tf0Var2.JTxCbbCwomzt(dz0Var);
            dz0 dz0Var2222 = (dz0) dz0Var;
            th1 th1Var222 = th1.rtx2ld2ELZv4;
            if (z) {
            }
            jz0Var2 = jz0Var3;
            tf0Var = tf0Var2;
            sj0.PxuCJdSBwIXG(az0Var, hq0.gGoUzNp9JO5I(f2.pnx5pC0XzaCw(n61Var.TSizfFm2Yiuu(jz0Var3.x50lh2ztY7Y5).TSizfFm2Yiuu(jz0Var3.cpQdD2nAriOS), az0Var, py0Var, th1Var222, z).TSizfFm2Yiuu(n61Var2).TSizfFm2Yiuu(jz0Var3.r3s1LDPKFs1S.OPXfSBeufaJ8), jz0Var3, th1Var222, k3Var, z, lwVar, jz0Var3.RAsUl2FVSrh6), jz0Var2.gPXPFXrUH4XX, dz0Var2222, tf0Var, 0);
        } else {
            jz0Var2 = jz0Var;
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            final jz0 jz0Var4 = jz0Var2;
            XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0() { // from class: bz0
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    jh0.a92UlCVFR9N8(n61.this, jz0Var4, mi1Var, lwVar, z, k3Var, ndVar, z9Var, le0Var, (hp) obj2, ki0.bEKsvqmvPh2y(i | 1), ki0.bEKsvqmvPh2y(i2));
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static void cpQdD2nAriOS(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void dgRBjINgWbAK(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        u9.rtx2ld2ELZv4(str);
    }

    public static long gPXPFXrUH4XX(int i, long j) {
        return sr.PxuCJdSBwIXG(0, rr.rtx2ld2ELZv4(j), (i & 4) != 0 ? rr.OPXfSBeufaJ8(j) : 0, rr.RAsUl2FVSrh6(j));
    }

    public static final boolean jyegZNwi31qc(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final List kpCQ9veP6n3I(hy1 hy1Var) {
        int cpQdD2nAriOS = ng0.cpQdD2nAriOS(hy1Var, "id");
        int cpQdD2nAriOS2 = ng0.cpQdD2nAriOS(hy1Var, "seq");
        int cpQdD2nAriOS3 = ng0.cpQdD2nAriOS(hy1Var, "from");
        int cpQdD2nAriOS4 = ng0.cpQdD2nAriOS(hy1Var, "to");
        z11 BjEWd04qc7Mw = fx1.BjEWd04qc7Mw();
        while (hy1Var.tmVwIGCQF4zR()) {
            BjEWd04qc7Mw.add(new cd0((int) hy1Var.getLong(cpQdD2nAriOS), (int) hy1Var.getLong(cpQdD2nAriOS2), hy1Var.dgRBjINgWbAK(cpQdD2nAriOS3), hy1Var.dgRBjINgWbAK(cpQdD2nAriOS4)));
        }
        return zk.c(fx1.ZbWwgt3aGe7A(BjEWd04qc7Mw));
    }

    public static final String nLZGh9p8gVSu(int i, long j) {
        if (j >= 0) {
            ov2.RfyTYNmI9Srp(i);
            String l = Long.toString(j, i);
            l.getClass();
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        ov2.RfyTYNmI9Srp(i);
        String l2 = Long.toString(j3, i);
        l2.getClass();
        ov2.RfyTYNmI9Srp(i);
        String l3 = Long.toString(j4, i);
        l3.getClass();
        return l2.concat(l3);
    }

    public static final long ozEBbv0hFTAB(long j) {
        return sr.PxuCJdSBwIXG(rr.wdg6QnbFHrFF(j), rr.rtx2ld2ELZv4(j), rr.OPXfSBeufaJ8(j), rr.RAsUl2FVSrh6(j));
    }

    public static final w42 pnx5pC0XzaCw(w42 w42Var, w42 w42Var2, float f) {
        long xbgXKYA2cIfu = mm2.xbgXKYA2cIfu(f, w42Var.PxuCJdSBwIXG, w42Var2.PxuCJdSBwIXG);
        long j = w42Var.lS5Rgt96tfkO;
        long j2 = w42Var2.lS5Rgt96tfkO;
        float rZjpSjn4zoMv = ni0.rZjpSjn4zoMv(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float rZjpSjn4zoMv2 = ni0.rZjpSjn4zoMv(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return new w42(ni0.rZjpSjn4zoMv(w42Var.TSizfFm2Yiuu, w42Var2.TSizfFm2Yiuu, f), xbgXKYA2cIfu, (Float.floatToRawIntBits(rZjpSjn4zoMv) << 32) | (Float.floatToRawIntBits(rZjpSjn4zoMv2) & 4294967295L));
    }

    public static final long r3s1LDPKFs1S(int i, long j) {
        ui2 ui2Var = vi2.Companion;
        int i2 = (int) (j >> 32);
        int i3 = i2 < 0 ? 0 : i2;
        if (i3 > i) {
            i3 = i;
        }
        int i4 = (int) (4294967295L & j);
        int i5 = i4 >= 0 ? i4 : 0;
        if (i5 <= i) {
            i = i5;
        }
        return (i3 == i2 && i == i4) ? j : rtx2ld2ELZv4(i3, i);
    }

    public static final ed2 rZjpSjn4zoMv(fy1 fy1Var, String str, boolean z) {
        hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int cpQdD2nAriOS = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "seqno");
            int cpQdD2nAriOS2 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "cid");
            int cpQdD2nAriOS3 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "name");
            int cpQdD2nAriOS4 = ng0.cpQdD2nAriOS(amuv7NJvPxHu, "desc");
            if (cpQdD2nAriOS != -1 && cpQdD2nAriOS2 != -1 && cpQdD2nAriOS3 != -1 && cpQdD2nAriOS4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (amuv7NJvPxHu.tmVwIGCQF4zR()) {
                    if (((int) amuv7NJvPxHu.getLong(cpQdD2nAriOS2)) >= 0) {
                        int i = (int) amuv7NJvPxHu.getLong(cpQdD2nAriOS);
                        String dgRBjINgWbAK = amuv7NJvPxHu.dgRBjINgWbAK(cpQdD2nAriOS3);
                        String str2 = amuv7NJvPxHu.getLong(cpQdD2nAriOS4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), dgRBjINgWbAK);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List d = zk.d(linkedHashMap.entrySet(), new db0(10));
                ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(d, 10));
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List i2 = zk.i(arrayList);
                List d2 = zk.d(linkedHashMap2.entrySet(), new db0(11));
                ArrayList arrayList2 = new ArrayList(al.KZw9XyiywG4x(d2, 10));
                Iterator it2 = d2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                ed2 ed2Var = new ed2(str, z, i2, zk.i(arrayList2));
                cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
                return ed2Var;
            }
            cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
            return null;
        } finally {
        }
    }

    public static final long rtx2ld2ELZv4(int i, int i2) {
        if (i < 0 || i2 < 0) {
            fp0.PxuCJdSBwIXG("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        ui2 ui2Var = vi2.Companion;
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [le0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [m61] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [m61] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [f91] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [f91] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void tmVwIGCQF4zR(tx txVar, Object obj, le0 le0Var) {
        kd1 kd1Var;
        if (!((m61) txVar).rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
        }
        m61 m61Var = ((m61) txVar).rtx2ld2ELZv4.x50lh2ztY7Y5;
        vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(txVar);
        while (zf8DYfih6EZu != null) {
            if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 262144) != 0) {
                while (m61Var != null) {
                    if ((m61Var.wdg6QnbFHrFF & 262144) != 0) {
                        ux uxVar = m61Var;
                        ?? r4 = 0;
                        while (uxVar != 0) {
                            if (uxVar instanceof ol2) {
                                ol2 ol2Var = (ol2) uxVar;
                                if (!(obj.equals(ol2Var.RfyTYNmI9Srp()) ? ((Boolean) le0Var.OPXfSBeufaJ8(ol2Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((uxVar.wdg6QnbFHrFF & 262144) != 0 && (uxVar instanceof ux)) {
                                m61 m61Var2 = uxVar.S2OOm9zPNm0h;
                                int i = 0;
                                uxVar = uxVar;
                                r4 = r4;
                                while (m61Var2 != null) {
                                    if ((m61Var2.wdg6QnbFHrFF & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            uxVar = m61Var2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new f91(new m61[16]);
                                            }
                                            if (uxVar != 0) {
                                                r4.lS5Rgt96tfkO(uxVar);
                                                uxVar = 0;
                                            }
                                            r4.lS5Rgt96tfkO(m61Var2);
                                        }
                                    }
                                    m61Var2 = m61Var2.cpQdD2nAriOS;
                                    uxVar = uxVar;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            uxVar = zv.dgRBjINgWbAK(r4);
                        }
                    }
                    m61Var = m61Var.x50lh2ztY7Y5;
                }
            }
            zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
            m61Var = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
        }
    }

    public static void wdg6QnbFHrFF(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void x50lh2ztY7Y5(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static final double xfACYKDMU6Dj(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    @Override // defpackage.c22
    public int PxuCJdSBwIXG(int i) {
        return aF05bpZJlKEP(i);
    }

    @Override // defpackage.c22
    public int Y1f8riQaR6yg(int i) {
        int e6tOsSdd2EFb = e6tOsSdd2EFb(i);
        if (e6tOsSdd2EFb == -1 || e6tOsSdd2EFb(e6tOsSdd2EFb) == -1) {
            return -1;
        }
        return e6tOsSdd2EFb;
    }

    public abstract int aF05bpZJlKEP(int i);

    public abstract int e6tOsSdd2EFb(int i);

    @Override // defpackage.c22
    public int e9gEMXR7LXtO(int i) {
        int aF05bpZJlKEP = aF05bpZJlKEP(i);
        if (aF05bpZJlKEP == -1 || aF05bpZJlKEP(aF05bpZJlKEP) == -1) {
            return -1;
        }
        return aF05bpZJlKEP;
    }

    @Override // defpackage.c22
    public int lS5Rgt96tfkO(int i) {
        return e6tOsSdd2EFb(i);
    }
}
