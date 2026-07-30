package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qa0 implements na0 {
    public final r1 PxuCJdSBwIXG;
    public final p81 RAsUl2FVSrh6;
    public final ab0 TSizfFm2Yiuu;
    public final la0 Y1f8riQaR6yg;
    public i81 a92UlCVFR9N8;
    public final oa0 e9gEMXR7LXtO;
    public final r1 lS5Rgt96tfkO;
    public ab0 rtx2ld2ELZv4;

    public qa0(r1 r1Var, r1 r1Var2) {
        this.PxuCJdSBwIXG = r1Var;
        this.lS5Rgt96tfkO = r1Var2;
        cb0.Companion.getClass();
        this.TSizfFm2Yiuu = new ab0(2, null, 14);
        this.Y1f8riQaR6yg = new la0(this, r1Var2);
        this.e9gEMXR7LXtO = new oa0(this);
        this.RAsUl2FVSrh6 = new p81(1);
    }

    public final void OPXfSBeufaJ8(ab0 ab0Var) {
        ab0 ab0Var2 = this.rtx2ld2ELZv4;
        this.rtx2ld2ELZv4 = ab0Var;
        p81 p81Var = this.RAsUl2FVSrh6;
        Object[] objArr = p81Var.PxuCJdSBwIXG;
        int i = p81Var.lS5Rgt96tfkO;
        for (int i2 = 0; i2 < i; i2++) {
            ((ma0) objArr[i2]).TSizfFm2Yiuu(ab0Var2, ab0Var);
        }
    }

    public final boolean PxuCJdSBwIXG(boolean z) {
        kd1 kd1Var;
        if (a92UlCVFR9N8() != null) {
            ab0 a92UlCVFR9N8 = a92UlCVFR9N8();
            OPXfSBeufaJ8(null);
            if (a92UlCVFR9N8 != null) {
                za0 za0Var = za0.rtx2ld2ELZv4;
                za0 za0Var2 = za0.wdg6QnbFHrFF;
                a92UlCVFR9N8.X1HMmH2Ks65g(za0Var, za0Var2);
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
                                        ((ab0) m61Var2).X1HMmH2Ks65g(za0.OPXfSBeufaJ8, za0Var2);
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
        }
        return true;
    }

    public final boolean RAsUl2FVSrh6(int i, boolean z) {
        zt1 zt1Var = new zt1();
        zt1Var.rtx2ld2ELZv4 = Boolean.FALSE;
        ab0 a92UlCVFR9N8 = a92UlCVFR9N8();
        Boolean e9gEMXR7LXtO = e9gEMXR7LXtO(i, this.PxuCJdSBwIXG.getEmbeddedViewFocusRect(), new pa0(i, zt1Var));
        if (cs0.wdg6QnbFHrFF(e9gEMXR7LXtO, Boolean.TRUE) && a92UlCVFR9N8 != a92UlCVFR9N8()) {
            return true;
        }
        if (e9gEMXR7LXtO != null && zt1Var.rtx2ld2ELZv4 != null) {
            if (e9gEMXR7LXtO.booleanValue() && ((Boolean) zt1Var.rtx2ld2ELZv4).booleanValue()) {
                return true;
            }
            if (ov2.tmVwIGCQF4zR(i) && z && lS5Rgt96tfkO(i, false, false)) {
                Boolean e9gEMXR7LXtO2 = e9gEMXR7LXtO(i, null, new n1(i, 3));
                if (e9gEMXR7LXtO2 != null ? e9gEMXR7LXtO2.booleanValue() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void TSizfFm2Yiuu() {
        r1 r1Var = this.PxuCJdSBwIXG;
        if (r1Var.isFocused() || r1Var.hasFocus()) {
            r1Var.clearFocus();
        } else if (r1Var.hasFocus()) {
            View findFocus = r1Var.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            r1Var.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0167 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0019, B:13:0x0023, B:16:0x002f, B:18:0x0035, B:19:0x003a, B:21:0x0042, B:23:0x0047, B:25:0x004d, B:29:0x0053, B:34:0x0167, B:36:0x016d, B:37:0x0170, B:39:0x017b, B:42:0x0187, B:46:0x0191, B:49:0x0197, B:50:0x019c, B:52:0x01a4, B:54:0x01aa, B:56:0x01ae, B:58:0x01b6, B:60:0x01bc, B:66:0x01c4, B:68:0x01cd, B:69:0x01d1, B:64:0x01d4, B:75:0x01da, B:86:0x01df, B:89:0x01e2, B:91:0x01e8, B:98:0x01ec, B:103:0x01f3, B:105:0x01fb, B:113:0x0212, B:115:0x0217, B:149:0x021b, B:144:0x025d, B:117:0x0227, B:119:0x022d, B:121:0x0231, B:123:0x0239, B:125:0x023f, B:131:0x0247, B:133:0x0250, B:134:0x0254, B:129:0x0257, B:155:0x0262, B:159:0x0272, B:161:0x0277, B:195:0x027b, B:190:0x02bd, B:163:0x0287, B:165:0x028d, B:167:0x0291, B:169:0x0299, B:171:0x029f, B:177:0x02a7, B:179:0x02b0, B:180:0x02b4, B:175:0x02b7, B:202:0x02c4, B:204:0x02cb, B:217:0x005b, B:219:0x0061, B:220:0x0064, B:222:0x006c, B:225:0x0078, B:229:0x0082, B:264:0x00d5, B:266:0x00d9, B:231:0x0087, B:233:0x008d, B:235:0x0091, B:237:0x0099, B:239:0x009f, B:245:0x00a7, B:247:0x00b0, B:248:0x00b4, B:243:0x00b7, B:254:0x00bd, B:268:0x00c2, B:271:0x00c5, B:273:0x00cb, B:280:0x00cf, B:285:0x00df, B:287:0x00e5, B:288:0x00e8, B:290:0x00f2, B:293:0x00fe, B:297:0x0108, B:332:0x015b, B:334:0x015f, B:299:0x010d, B:301:0x0113, B:303:0x0117, B:305:0x011f, B:307:0x0125, B:313:0x012d, B:315:0x0136, B:316:0x013a, B:311:0x013d, B:322:0x0143, B:337:0x0148, B:340:0x014b, B:342:0x0151, B:349:0x0155), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [f91] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [f91] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [m61] */
    /* JADX WARN: Type inference failed for: r12v24, types: [m61] */
    /* JADX WARN: Type inference failed for: r12v28, types: [m61] */
    /* JADX WARN: Type inference failed for: r12v29, types: [m61] */
    /* JADX WARN: Type inference failed for: r12v33, types: [m61] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42, types: [m61] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [f91] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [f91] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y1f8riQaR6yg(KeyEvent keyEvent, ae0 ae0Var) {
        tx txVar;
        m61 m61Var;
        kd1 kd1Var;
        tx txVar2;
        kd1 kd1Var2;
        int size;
        kd1 kd1Var3;
        boolean z;
        ab0 ab0Var = this.TSizfFm2Yiuu;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.Y1f8riQaR6yg.e9gEMXR7LXtO) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!wdg6QnbFHrFF(keyEvent)) {
                return false;
            }
            ab0 BRwzKIf41E4i = zv.BRwzKIf41E4i(ab0Var);
            if (BRwzKIf41E4i != null) {
                if (!BRwzKIf41E4i.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO("visitLocalDescendants called on an unattached node");
                }
                m61 m61Var2 = BRwzKIf41E4i.rtx2ld2ELZv4;
                if ((m61Var2.dgRBjINgWbAK & 9216) != 0) {
                    m61Var = null;
                    for (m61 m61Var3 = m61Var2.cpQdD2nAriOS; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                        int i = m61Var3.wdg6QnbFHrFF;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            m61Var = m61Var3;
                        }
                    }
                } else {
                    m61Var = null;
                }
            }
            if (BRwzKIf41E4i != null) {
                if (!BRwzKIf41E4i.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
                }
                m61 m61Var4 = BRwzKIf41E4i.rtx2ld2ELZv4;
                vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(BRwzKIf41E4i);
                loop11: while (true) {
                    if (zf8DYfih6EZu == null) {
                        txVar2 = null;
                        break;
                    }
                    if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 8192) != 0) {
                        while (m61Var4 != null) {
                            if ((m61Var4.wdg6QnbFHrFF & 8192) != 0) {
                                f91 f91Var = null;
                                m61 m61Var5 = m61Var4;
                                while (m61Var5 != null) {
                                    if (m61Var5 instanceof vu0) {
                                        txVar2 = m61Var5;
                                        break loop11;
                                    }
                                    if ((m61Var5.wdg6QnbFHrFF & 8192) != 0 && (m61Var5 instanceof ux)) {
                                        m61 m61Var6 = ((ux) m61Var5).S2OOm9zPNm0h;
                                        int i2 = 0;
                                        m61Var5 = m61Var5;
                                        f91Var = f91Var;
                                        while (m61Var6 != null) {
                                            if ((m61Var6.wdg6QnbFHrFF & 8192) != 0) {
                                                i2++;
                                                f91Var = f91Var;
                                                if (i2 == 1) {
                                                    m61Var5 = m61Var6;
                                                } else {
                                                    if (f91Var == null) {
                                                        f91Var = new f91(new m61[16]);
                                                    }
                                                    if (m61Var5 != null) {
                                                        f91Var.lS5Rgt96tfkO(m61Var5);
                                                        m61Var5 = null;
                                                    }
                                                    f91Var.lS5Rgt96tfkO(m61Var6);
                                                }
                                            }
                                            m61Var6 = m61Var6.cpQdD2nAriOS;
                                            m61Var5 = m61Var5;
                                            f91Var = f91Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    m61Var5 = zv.dgRBjINgWbAK(f91Var);
                                }
                            }
                            m61Var4 = m61Var4.x50lh2ztY7Y5;
                        }
                    }
                    zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                    m61Var4 = (zf8DYfih6EZu == null || (kd1Var2 = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var2.e9gEMXR7LXtO;
                }
                tx txVar3 = (vu0) txVar2;
                if (txVar3 != null) {
                    m61Var = ((m61) txVar3).rtx2ld2ELZv4;
                    if (m61Var != null) {
                        if (!m61Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                            ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
                        }
                        m61 m61Var7 = m61Var.rtx2ld2ELZv4.x50lh2ztY7Y5;
                        vw0 zf8DYfih6EZu2 = zv.zf8DYfih6EZu(m61Var);
                        ArrayList arrayList = null;
                        while (zf8DYfih6EZu2 != null) {
                            if ((zf8DYfih6EZu2.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 8192) != 0) {
                                while (m61Var7 != null) {
                                    if ((m61Var7.wdg6QnbFHrFF & 8192) != 0) {
                                        m61 m61Var8 = m61Var7;
                                        f91 f91Var2 = null;
                                        while (m61Var8 != null) {
                                            if (m61Var8 instanceof vu0) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(m61Var8);
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            if (z && (m61Var8.wdg6QnbFHrFF & 8192) != 0 && (m61Var8 instanceof ux)) {
                                                int i3 = 0;
                                                for (m61 m61Var9 = ((ux) m61Var8).S2OOm9zPNm0h; m61Var9 != null; m61Var9 = m61Var9.cpQdD2nAriOS) {
                                                    if ((m61Var9.wdg6QnbFHrFF & 8192) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            m61Var8 = m61Var9;
                                                        } else {
                                                            if (f91Var2 == null) {
                                                                f91Var2 = new f91(new m61[16]);
                                                            }
                                                            if (m61Var8 != null) {
                                                                f91Var2.lS5Rgt96tfkO(m61Var8);
                                                                m61Var8 = null;
                                                            }
                                                            f91Var2.lS5Rgt96tfkO(m61Var9);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            m61Var8 = zv.dgRBjINgWbAK(f91Var2);
                                        }
                                    }
                                    m61Var7 = m61Var7.x50lh2ztY7Y5;
                                }
                            }
                            zf8DYfih6EZu2 = zf8DYfih6EZu2.S9EYkSpbGuxq();
                            m61Var7 = (zf8DYfih6EZu2 == null || (kd1Var3 = zf8DYfih6EZu2.nLZGh9p8gVSu) == null) ? null : kd1Var3.e9gEMXR7LXtO;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i4 = size - 1;
                                if (((vu0) arrayList.get(size)).x50lh2ztY7Y5(keyEvent)) {
                                    return true;
                                }
                                if (i4 < 0) {
                                    break;
                                }
                                size = i4;
                            }
                        }
                        ux uxVar = m61Var.rtx2ld2ELZv4;
                        ?? r0 = 0;
                        while (uxVar != 0) {
                            if (uxVar instanceof vu0) {
                                if (((vu0) uxVar).x50lh2ztY7Y5(keyEvent)) {
                                    return true;
                                }
                            } else if ((uxVar.wdg6QnbFHrFF & 8192) != 0 && (uxVar instanceof ux)) {
                                m61 m61Var10 = uxVar.S2OOm9zPNm0h;
                                int i5 = 0;
                                r0 = r0;
                                uxVar = uxVar;
                                while (m61Var10 != null) {
                                    if ((m61Var10.wdg6QnbFHrFF & 8192) != 0) {
                                        i5++;
                                        r0 = r0;
                                        if (i5 == 1) {
                                            uxVar = m61Var10;
                                        } else {
                                            if (r0 == 0) {
                                                r0 = new f91(new m61[16]);
                                            }
                                            if (uxVar != 0) {
                                                r0.lS5Rgt96tfkO(uxVar);
                                                uxVar = 0;
                                            }
                                            r0.lS5Rgt96tfkO(m61Var10);
                                        }
                                    }
                                    m61Var10 = m61Var10.cpQdD2nAriOS;
                                    r0 = r0;
                                    uxVar = uxVar;
                                }
                                if (i5 == 1) {
                                }
                            }
                            uxVar = zv.dgRBjINgWbAK(r0);
                        }
                        if (((Boolean) ae0Var.PxuCJdSBwIXG()).booleanValue()) {
                            return true;
                        }
                        ux uxVar2 = m61Var.rtx2ld2ELZv4;
                        ?? r14 = 0;
                        while (uxVar2 != 0) {
                            if (uxVar2 instanceof vu0) {
                                if (((vu0) uxVar2).zf8DYfih6EZu(keyEvent)) {
                                    return true;
                                }
                            } else if ((uxVar2.wdg6QnbFHrFF & 8192) != 0 && (uxVar2 instanceof ux)) {
                                m61 m61Var11 = uxVar2.S2OOm9zPNm0h;
                                int i6 = 0;
                                uxVar2 = uxVar2;
                                r14 = r14;
                                while (m61Var11 != null) {
                                    if ((m61Var11.wdg6QnbFHrFF & 8192) != 0) {
                                        i6++;
                                        r14 = r14;
                                        if (i6 == 1) {
                                            uxVar2 = m61Var11;
                                        } else {
                                            if (r14 == 0) {
                                                r14 = new f91(new m61[16]);
                                            }
                                            if (uxVar2 != 0) {
                                                r14.lS5Rgt96tfkO(uxVar2);
                                                uxVar2 = 0;
                                            }
                                            r14.lS5Rgt96tfkO(m61Var11);
                                        }
                                    }
                                    m61Var11 = m61Var11.cpQdD2nAriOS;
                                    uxVar2 = uxVar2;
                                    r14 = r14;
                                }
                                if (i6 == 1) {
                                }
                            }
                            uxVar2 = zv.dgRBjINgWbAK(r14);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                if (((vu0) arrayList.get(i7)).zf8DYfih6EZu(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
            }
            m61 m61Var12 = ab0Var.rtx2ld2ELZv4.x50lh2ztY7Y5;
            vw0 zf8DYfih6EZu3 = zv.zf8DYfih6EZu(ab0Var);
            loop15: while (true) {
                if (zf8DYfih6EZu3 == null) {
                    txVar = null;
                    break;
                }
                if ((zf8DYfih6EZu3.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 8192) != 0) {
                    while (m61Var12 != null) {
                        if ((m61Var12.wdg6QnbFHrFF & 8192) != 0) {
                            m61 m61Var13 = m61Var12;
                            f91 f91Var3 = null;
                            while (m61Var13 != null) {
                                if (m61Var13 instanceof vu0) {
                                    txVar = m61Var13;
                                    break loop15;
                                }
                                if ((m61Var13.wdg6QnbFHrFF & 8192) != 0 && (m61Var13 instanceof ux)) {
                                    m61 m61Var14 = ((ux) m61Var13).S2OOm9zPNm0h;
                                    int i8 = 0;
                                    m61Var13 = m61Var13;
                                    f91Var3 = f91Var3;
                                    while (m61Var14 != null) {
                                        if ((m61Var14.wdg6QnbFHrFF & 8192) != 0) {
                                            i8++;
                                            f91Var3 = f91Var3;
                                            if (i8 == 1) {
                                                m61Var13 = m61Var14;
                                            } else {
                                                if (f91Var3 == null) {
                                                    f91Var3 = new f91(new m61[16]);
                                                }
                                                if (m61Var13 != null) {
                                                    f91Var3.lS5Rgt96tfkO(m61Var13);
                                                    m61Var13 = null;
                                                }
                                                f91Var3.lS5Rgt96tfkO(m61Var14);
                                            }
                                        }
                                        m61Var14 = m61Var14.cpQdD2nAriOS;
                                        m61Var13 = m61Var13;
                                        f91Var3 = f91Var3;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                m61Var13 = zv.dgRBjINgWbAK(f91Var3);
                            }
                        }
                        m61Var12 = m61Var12.x50lh2ztY7Y5;
                    }
                }
                zf8DYfih6EZu3 = zf8DYfih6EZu3.S9EYkSpbGuxq();
                m61Var12 = (zf8DYfih6EZu3 == null || (kd1Var = zf8DYfih6EZu3.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
            }
            tx txVar4 = (vu0) txVar;
            m61Var = txVar4 != null ? ((m61) txVar4).rtx2ld2ELZv4 : null;
            if (m61Var != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    public final ab0 a92UlCVFR9N8() {
        ab0 ab0Var = this.rtx2ld2ELZv4;
        if (ab0Var == null || !ab0Var.S9EYkSpbGuxq) {
            return null;
        }
        return ab0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0131, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e9gEMXR7LXtO(int i, qt1 qt1Var, le0 le0Var) {
        boolean cpQdD2nAriOS;
        ab0 ab0Var;
        kd1 kd1Var;
        ab0 ab0Var2 = this.TSizfFm2Yiuu;
        ab0 BRwzKIf41E4i = zv.BRwzKIf41E4i(ab0Var2);
        int i2 = 4;
        r1 r1Var = this.lS5Rgt96tfkO;
        boolean z = false;
        if (BRwzKIf41E4i != null) {
            cw0 layoutDirection = r1Var.getLayoutDirection();
            ta0 fkblLSN2bAgv = BRwzKIf41E4i.fkblLSN2bAgv();
            va0 va0Var = fkblLSN2bAgv.rtx2ld2ELZv4;
            va0 va0Var2 = fkblLSN2bAgv.OPXfSBeufaJ8;
            ga0.Companion.getClass();
            if (i == 1) {
                va0Var = fkblLSN2bAgv.lS5Rgt96tfkO;
            } else if (i == 2) {
                va0Var = fkblLSN2bAgv.TSizfFm2Yiuu;
            } else if (i == 5) {
                va0Var = fkblLSN2bAgv.Y1f8riQaR6yg;
            } else if (i == 6) {
                va0Var = fkblLSN2bAgv.e9gEMXR7LXtO;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        u9.gPXPFXrUH4XX();
                        return null;
                    }
                    va0Var = va0Var2;
                }
                va0.Companion.getClass();
                if (va0Var == va0.lS5Rgt96tfkO) {
                    va0Var = null;
                }
                if (va0Var == null) {
                    va0Var = fkblLSN2bAgv.a92UlCVFR9N8;
                }
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    va0Var = va0Var2;
                } else if (ordinal2 != 1) {
                    u9.gPXPFXrUH4XX();
                    return null;
                }
                va0.Companion.getClass();
                if (va0Var == va0.lS5Rgt96tfkO) {
                    va0Var = null;
                }
                if (va0Var == null) {
                    va0Var = fkblLSN2bAgv.RAsUl2FVSrh6;
                }
            } else {
                if (i != 7 && i != 8) {
                    u9.rtx2ld2ELZv4("invalid FocusDirection");
                    return null;
                }
                qa0 qa0Var = (qa0) ((r1) zv.wLFCmsViZrNT(BRwzKIf41E4i)).getFocusOwner();
                ab0 a92UlCVFR9N8 = qa0Var.a92UlCVFR9N8();
                if (i == 7) {
                    fkblLSN2bAgv.wdg6QnbFHrFF.getClass();
                } else {
                    fkblLSN2bAgv.dgRBjINgWbAK.getClass();
                }
                if (a92UlCVFR9N8 != qa0Var.a92UlCVFR9N8()) {
                    va0.Companion.getClass();
                    va0Var = va0.Y1f8riQaR6yg;
                } else {
                    va0.Companion.getClass();
                    va0Var = va0.lS5Rgt96tfkO;
                }
            }
            va0.Companion.getClass();
            va0 va0Var3 = va0.TSizfFm2Yiuu;
            if (!cs0.wdg6QnbFHrFF(va0Var, va0Var3)) {
                if (cs0.wdg6QnbFHrFF(va0Var, va0.Y1f8riQaR6yg)) {
                    ab0 BRwzKIf41E4i2 = zv.BRwzKIf41E4i(ab0Var2);
                    if (BRwzKIf41E4i2 != null) {
                        return (Boolean) le0Var.OPXfSBeufaJ8(BRwzKIf41E4i2);
                    }
                } else {
                    va0 va0Var4 = va0.lS5Rgt96tfkO;
                    if (!cs0.wdg6QnbFHrFF(va0Var, va0Var4)) {
                        if (va0Var == va0Var4) {
                            u9.rtx2ld2ELZv4("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (va0Var == va0Var3) {
                            u9.rtx2ld2ELZv4("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        f91 f91Var = va0Var.PxuCJdSBwIXG;
                        int i3 = f91Var.wdg6QnbFHrFF;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = f91Var.rtx2ld2ELZv4;
                            boolean z2 = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                tx txVar = (xa0) objArr[i4];
                                if (!((m61) txVar).rtx2ld2ELZv4.S9EYkSpbGuxq) {
                                    ep0.lS5Rgt96tfkO("visitChildren called on an unattached node");
                                }
                                f91 f91Var2 = new f91(new m61[16]);
                                m61 m61Var = ((m61) txVar).rtx2ld2ELZv4;
                                m61 m61Var2 = m61Var.cpQdD2nAriOS;
                                if (m61Var2 == null) {
                                    zv.OPXfSBeufaJ8(f91Var2, m61Var);
                                } else {
                                    f91Var2.lS5Rgt96tfkO(m61Var2);
                                }
                                while (true) {
                                    int i5 = f91Var2.wdg6QnbFHrFF;
                                    if (i5 != 0) {
                                        m61 m61Var3 = (m61) f91Var2.dgRBjINgWbAK(i5 - 1);
                                        if ((m61Var3.dgRBjINgWbAK & 1024) == 0) {
                                            zv.OPXfSBeufaJ8(f91Var2, m61Var3);
                                        } else {
                                            while (true) {
                                                if (m61Var3 == null) {
                                                    break;
                                                }
                                                if ((m61Var3.wdg6QnbFHrFF & 1024) != 0) {
                                                    f91 f91Var3 = null;
                                                    while (m61Var3 != null) {
                                                        if (m61Var3 instanceof ab0) {
                                                            if (((Boolean) le0Var.OPXfSBeufaJ8((ab0) m61Var3)).booleanValue()) {
                                                                z2 = true;
                                                                break;
                                                            }
                                                        } else if ((m61Var3.wdg6QnbFHrFF & 1024) != 0 && (m61Var3 instanceof ux)) {
                                                            int i6 = 0;
                                                            for (m61 m61Var4 = ((ux) m61Var3).S2OOm9zPNm0h; m61Var4 != null; m61Var4 = m61Var4.cpQdD2nAriOS) {
                                                                if ((m61Var4.wdg6QnbFHrFF & 1024) != 0) {
                                                                    i6++;
                                                                    if (i6 == 1) {
                                                                        m61Var3 = m61Var4;
                                                                    } else {
                                                                        if (f91Var3 == null) {
                                                                            f91Var3 = new f91(new m61[16]);
                                                                        }
                                                                        if (m61Var3 != null) {
                                                                            f91Var3.lS5Rgt96tfkO(m61Var3);
                                                                            m61Var3 = null;
                                                                        }
                                                                        f91Var3.lS5Rgt96tfkO(m61Var4);
                                                                    }
                                                                }
                                                            }
                                                            if (i6 == 1) {
                                                            }
                                                        }
                                                        m61Var3 = zv.dgRBjINgWbAK(f91Var3);
                                                    }
                                                } else {
                                                    m61Var3 = m61Var3.cpQdD2nAriOS;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z = z2;
                        }
                        return Boolean.valueOf(z);
                    }
                }
            }
            return null;
        }
        BRwzKIf41E4i = null;
        cw0 layoutDirection2 = r1Var.getLayoutDirection();
        l7 l7Var = new l7(BRwzKIf41E4i, this, le0Var, i2);
        ga0.Companion.getClass();
        if (i == 1 || i == 2) {
            if (i == 1) {
                cpQdD2nAriOS = xi0.ZbWwgt3aGe7A(ab0Var2, l7Var);
            } else {
                if (i != 2) {
                    u9.rtx2ld2ELZv4("This function should only be used for 1-D focus search");
                    return null;
                }
                cpQdD2nAriOS = xi0.cpQdD2nAriOS(ab0Var2, l7Var);
            }
            return Boolean.valueOf(cpQdD2nAriOS);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return ki0.JHNfcAUfKc4G(i, l7Var, ab0Var2, qt1Var);
        }
        if (i == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    u9.gPXPFXrUH4XX();
                    return null;
                }
                i2 = 3;
            }
            ab0 BRwzKIf41E4i3 = zv.BRwzKIf41E4i(ab0Var2);
            if (BRwzKIf41E4i3 != null) {
                return ki0.JHNfcAUfKc4G(i2, l7Var, BRwzKIf41E4i3, qt1Var);
            }
            return null;
        }
        if (i != 8) {
            u9.RAsUl2FVSrh6(ga0.PxuCJdSBwIXG(i), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        ab0 BRwzKIf41E4i4 = zv.BRwzKIf41E4i(ab0Var2);
        if (BRwzKIf41E4i4 != null) {
            if (!BRwzKIf41E4i4.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
            }
            m61 m61Var5 = BRwzKIf41E4i4.rtx2ld2ELZv4.x50lh2ztY7Y5;
            vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(BRwzKIf41E4i4);
            loop5: while (zf8DYfih6EZu != null) {
                if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 1024) != 0) {
                    while (m61Var5 != null) {
                        if ((m61Var5.wdg6QnbFHrFF & 1024) != 0) {
                            m61 m61Var6 = m61Var5;
                            f91 f91Var4 = null;
                            while (m61Var6 != null) {
                                if (m61Var6 instanceof ab0) {
                                    ab0 ab0Var3 = (ab0) m61Var6;
                                    if (ab0Var3.fkblLSN2bAgv().PxuCJdSBwIXG) {
                                        ab0Var = ab0Var3;
                                        break loop5;
                                    }
                                } else if ((m61Var6.wdg6QnbFHrFF & 1024) != 0 && (m61Var6 instanceof ux)) {
                                    int i7 = 0;
                                    for (m61 m61Var7 = ((ux) m61Var6).S2OOm9zPNm0h; m61Var7 != null; m61Var7 = m61Var7.cpQdD2nAriOS) {
                                        if ((m61Var7.wdg6QnbFHrFF & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                m61Var6 = m61Var7;
                                            } else {
                                                if (f91Var4 == null) {
                                                    f91Var4 = new f91(new m61[16]);
                                                }
                                                if (m61Var6 != null) {
                                                    f91Var4.lS5Rgt96tfkO(m61Var6);
                                                    m61Var6 = null;
                                                }
                                                f91Var4.lS5Rgt96tfkO(m61Var7);
                                            }
                                        }
                                    }
                                    if (i7 != 1) {
                                        m61Var6 = zv.dgRBjINgWbAK(f91Var4);
                                    }
                                }
                                m61Var6 = zv.dgRBjINgWbAK(f91Var4);
                            }
                        }
                        m61Var5 = m61Var5.x50lh2ztY7Y5;
                    }
                }
                zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                m61Var5 = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
            }
        }
        ab0Var = null;
        if (ab0Var != null && ab0Var != ab0Var2) {
            z = ((Boolean) l7Var.OPXfSBeufaJ8(ab0Var)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    public final boolean lS5Rgt96tfkO(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            PxuCJdSBwIXG(z);
        } else {
            int ordinal = f2.BjEWd04qc7Mw(this.TSizfFm2Yiuu).ordinal();
            if (ordinal == 0) {
                PxuCJdSBwIXG(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    u9.gPXPFXrUH4XX();
                    return false;
                }
                z3 = false;
            }
        }
        if (z3 && z2) {
            TSizfFm2Yiuu();
        }
        return z3;
    }

    public final boolean rtx2ld2ELZv4(int i) {
        if (!lS5Rgt96tfkO(i, false, false)) {
            return false;
        }
        Boolean e9gEMXR7LXtO = e9gEMXR7LXtO(i, null, new n1(i, 2));
        boolean booleanValue = e9gEMXR7LXtO != null ? e9gEMXR7LXtO.booleanValue() : false;
        if (!booleanValue) {
            TSizfFm2Yiuu();
        }
        return booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0353, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        r0 = r4.lS5Rgt96tfkO(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (r4.e9gEMXR7LXtO != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        if (((r4.PxuCJdSBwIXG[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        r0 = r4.TSizfFm2Yiuu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        if (java.lang.Long.compare((r4.Y1f8riQaR6yg * 32) ^ Long.MIN_VALUE, (r0 * 25) ^ Long.MIN_VALUE) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        r0 = r4.PxuCJdSBwIXG;
        r6 = r4.TSizfFm2Yiuu;
        r12 = r4.lS5Rgt96tfkO;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        if (r14 >= r13) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f2, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010d, code lost:
    
        r15 = r5;
        r18 = r6;
        r39 = 128;
        r5 = defpackage.na.uy1Qfkdvj4xZ(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r18;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012e, code lost:
    
        if (r6 == r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0130, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r22 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013e, code lost:
    
        if (r22 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0145, code lost:
    
        if (r22 == 254) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0148, code lost:
    
        r18 = java.lang.Long.hashCode(r12[r6]) * r28;
        r22 = r13;
        r13 = (r18 ^ (r18 << 16)) >>> 7;
        r14 = r4.lS5Rgt96tfkO(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016a, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018f, code lost:
    
        r15 = r7;
        r7 = r14 >> 3;
        r25 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a0, code lost:
    
        if (((r25 >> r8) & 255) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a2, code lost:
    
        r35 = r5;
        r36 = r6;
        r0[r7] = (r25 & (~(255 << r8))) | ((r18 & 127) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r36];
        r12[r36] = r33;
        r6 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e7, code lost:
    
        r0[r0.length - r15] = (r0[0] & r22) | Long.MIN_VALUE;
        r6 = r6 + r15;
        r7 = r15;
        r13 = r22;
        r15 = r29;
        r5 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ca, code lost:
    
        r35 = r5;
        r36 = r6;
        r0[r7] = (r25 & (~(255 << r8))) | ((r18 & 127) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r36];
        r12[r36] = r5;
        r6 = r36 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016c, code lost:
    
        r15 = r7;
        r0[r8] = (r0[r8] & (~(255 << r9))) | ((r18 & 127) << r9);
        r0[r0.length - r15] = (r0[0] & r22) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r7 = r15;
        r13 = r22;
        r15 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0140, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fb, code lost:
    
        r15 = r7;
        r4.e9gEMXR7LXtO = defpackage.c02.PxuCJdSBwIXG(r4.TSizfFm2Yiuu) - r4.Y1f8riQaR6yg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0207, code lost:
    
        r37 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x028a, code lost:
    
        r0 = r4.lS5Rgt96tfkO(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x028e, code lost:
    
        r14 = r0;
        r4.Y1f8riQaR6yg++;
        r0 = r4.e9gEMXR7LXtO;
        r3 = r4.PxuCJdSBwIXG;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a7, code lost:
    
        if (((r6 >> r8) & 255) != r39) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a9, code lost:
    
        r21 = r37 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02ab, code lost:
    
        r4.e9gEMXR7LXtO = r0 - r21;
        r0 = r4.TSizfFm2Yiuu;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r37 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020b, code lost:
    
        r15 = 1;
        r39 = 128;
        r0 = defpackage.c02.lS5Rgt96tfkO(r4.TSizfFm2Yiuu);
        r5 = r4.PxuCJdSBwIXG;
        r6 = r4.lS5Rgt96tfkO;
        r7 = r4.TSizfFm2Yiuu;
        r4.TSizfFm2Yiuu(r0);
        r0 = r4.PxuCJdSBwIXG;
        r8 = r4.lS5Rgt96tfkO;
        r9 = r4.TSizfFm2Yiuu;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0225, code lost:
    
        if (r12 >= r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0235, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0237, code lost:
    
        r13 = r6[r12];
        r16 = java.lang.Long.hashCode(r13) * r28;
        r16 = r16 ^ (r16 << 16);
        r37 = r15;
        r15 = r4.lS5Rgt96tfkO(r16 >>> 7);
        r17 = r0;
        r0 = r16 & 127;
        r16 = r5;
        r18 = r6;
        r5 = r0;
        r0 = r15 >> 3;
        r19 = (r15 & 7) << 3;
        r5 = (r17[r0] & (~(255 << r19))) | (r5 << r19);
        r17[r0] = r5;
        r17[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x027f, code lost:
    
        r12 = r12 + 1;
        r5 = r16;
        r0 = r17;
        r6 = r18;
        r15 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0277, code lost:
    
        r17 = r0;
        r16 = r5;
        r18 = r6;
        r37 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c3, code lost:
    
        r37 = 1;
        r39 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0351, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean wdg6QnbFHrFF(KeyEvent keyEvent) {
        int i;
        long j;
        int i2;
        boolean z;
        long XL4ISE6Oc65B = jh0.XL4ISE6Oc65B(keyEvent);
        int S9EYkSpbGuxq = jh0.S9EYkSpbGuxq(keyEvent);
        su0.Companion.getClass();
        int i3 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i4 = 0;
        int i5 = 1;
        if (S9EYkSpbGuxq == 2) {
            i81 i81Var = this.a92UlCVFR9N8;
            if (i81Var == null) {
                i81Var = new i81(3);
                this.a92UlCVFR9N8 = i81Var;
            }
            i81 i81Var2 = i81Var;
            int hashCode = Long.hashCode(XL4ISE6Oc65B) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 >>> 7;
            int i8 = i6 & 127;
            int i9 = i81Var2.TSizfFm2Yiuu;
            int i10 = i7 & i9;
            int i11 = 0;
            loop0: while (true) {
                long[] jArr = i81Var2.PxuCJdSBwIXG;
                int i12 = i10 >> 3;
                int i13 = (i10 & 7) << 3;
                long j3 = (jArr[i12] >>> i13) | ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63));
                int i14 = i3;
                long j4 = i8;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    i2 = (i10 + (Long.numberOfTrailingZeros(j6) >> 3)) & i9;
                    long j7 = j2;
                    if (i81Var2.lS5Rgt96tfkO[i2] == XL4ISE6Oc65B) {
                        z = 1;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i11 += 8;
                i10 = (i10 + i11) & i9;
                i3 = i14;
                j2 = j;
            }
            i81Var2.lS5Rgt96tfkO[i2] = XL4ISE6Oc65B;
            return z;
        }
        if (S9EYkSpbGuxq != 1) {
            return true;
        }
        i81 i81Var3 = this.a92UlCVFR9N8;
        if (i81Var3 == null || !i81Var3.PxuCJdSBwIXG(XL4ISE6Oc65B)) {
            return false;
        }
        i81 i81Var4 = this.a92UlCVFR9N8;
        if (i81Var4 != null) {
            int hashCode2 = Long.hashCode(XL4ISE6Oc65B) * (-862048943);
            int i15 = hashCode2 ^ (hashCode2 << 16);
            int i16 = i15 & 127;
            int i17 = i81Var4.TSizfFm2Yiuu;
            int i18 = i15 >>> 7;
            loop5: while (true) {
                int i19 = i18 & i17;
                long[] jArr2 = i81Var4.PxuCJdSBwIXG;
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                long j8 = ((jArr2[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i20] >>> i21);
                long j9 = (i16 * 72340172838076673L) ^ j8;
                long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j10) >> 3) + i19) & i17;
                    if (i81Var4.lS5Rgt96tfkO[i] == XL4ISE6Oc65B) {
                        break loop5;
                    }
                    j10 &= j10 - 1;
                }
                i4 += 8;
                i18 = i19 + i4;
            }
            if (i >= 0) {
                i81Var4.Y1f8riQaR6yg--;
                long[] jArr3 = i81Var4.PxuCJdSBwIXG;
                int i22 = i81Var4.TSizfFm2Yiuu;
                int i23 = i >> 3;
                int i24 = (i & 7) << 3;
                long j11 = (jArr3[i23] & (~(255 << i24))) | (254 << i24);
                jArr3[i23] = j11;
                jArr3[(((i - 7) & i22) + (i22 & 7)) >> 3] = j11;
                return true;
            }
        }
        return true;
    }
}
