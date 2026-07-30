package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kd1 {
    public final f91 OPXfSBeufaJ8;
    public final vw0 PxuCJdSBwIXG;
    public f91 RAsUl2FVSrh6;
    public final mp0 TSizfFm2Yiuu;
    public pd1 Y1f8riQaR6yg;
    public m61 a92UlCVFR9N8;
    public final gd2 e9gEMXR7LXtO;
    public final jd1 lS5Rgt96tfkO;
    public f91 rtx2ld2ELZv4;
    public id1 wdg6QnbFHrFF;

    public kd1(vw0 vw0Var) {
        this.PxuCJdSBwIXG = vw0Var;
        jd1 jd1Var = new jd1();
        jd1Var.dgRBjINgWbAK = -1;
        this.lS5Rgt96tfkO = jd1Var;
        mp0 mp0Var = new mp0(vw0Var);
        this.TSizfFm2Yiuu = mp0Var;
        this.Y1f8riQaR6yg = mp0Var;
        gd2 gd2Var = mp0Var.bEKsvqmvPh2y;
        this.e9gEMXR7LXtO = gd2Var;
        this.a92UlCVFR9N8 = gd2Var;
        this.OPXfSBeufaJ8 = new f91(new n61[16]);
    }

    public static final void PxuCJdSBwIXG(kd1 kd1Var, m61 m61Var, pd1 pd1Var) {
        for (m61 m61Var2 = m61Var.x50lh2ztY7Y5; m61Var2 != null; m61Var2 = m61Var2.x50lh2ztY7Y5) {
            if (m61Var2 == kd1Var.lS5Rgt96tfkO) {
                vw0 S9EYkSpbGuxq = kd1Var.PxuCJdSBwIXG.S9EYkSpbGuxq();
                pd1Var.ZbWwgt3aGe7A = S9EYkSpbGuxq != null ? S9EYkSpbGuxq.nLZGh9p8gVSu.TSizfFm2Yiuu : null;
                kd1Var.Y1f8riQaR6yg = pd1Var;
                return;
            } else {
                if ((m61Var2.wdg6QnbFHrFF & 2) != 0) {
                    return;
                }
                m61Var2.EP3hG58ROvHh(pd1Var);
            }
        }
    }

    public static m61 TSizfFm2Yiuu(m61 m61Var) {
        boolean z = m61Var.S9EYkSpbGuxq;
        if (z) {
            l81 l81Var = qd1.PxuCJdSBwIXG;
            if (!z) {
                ep0.lS5Rgt96tfkO("autoInvalidateRemovedNode called on unattached node");
            }
            qd1.PxuCJdSBwIXG(m61Var, -1, 2);
            m61Var.Y2PHjkwWz56c();
            m61Var.twy4zb2fCtqq();
        }
        m61 m61Var2 = m61Var.cpQdD2nAriOS;
        m61 m61Var3 = m61Var.x50lh2ztY7Y5;
        if (m61Var2 != null) {
            m61Var2.x50lh2ztY7Y5 = m61Var3;
            m61Var.cpQdD2nAriOS = null;
        }
        if (m61Var3 != null) {
            m61Var3.cpQdD2nAriOS = m61Var2;
            m61Var.x50lh2ztY7Y5 = null;
        }
        m61Var3.getClass();
        return m61Var3;
    }

    public static m61 lS5Rgt96tfkO(l61 l61Var, m61 m61Var) {
        m61 m61Var2;
        if (l61Var instanceof r61) {
            m61Var2 = ((r61) l61Var).Y1f8riQaR6yg();
            m61Var2.wdg6QnbFHrFF = qd1.a92UlCVFR9N8(m61Var2);
        } else {
            mc mcVar = new mc();
            mcVar.wdg6QnbFHrFF = qd1.Y1f8riQaR6yg(l61Var);
            mcVar.VhhvGxCb8gfr = l61Var;
            new HashSet();
            m61Var2 = mcVar;
        }
        if (m61Var2.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        m61Var2.gPXPFXrUH4XX = true;
        m61 m61Var3 = m61Var.cpQdD2nAriOS;
        if (m61Var3 != null) {
            m61Var3.x50lh2ztY7Y5 = m61Var2;
            m61Var2.cpQdD2nAriOS = m61Var3;
        }
        m61Var.cpQdD2nAriOS = m61Var2;
        m61Var2.x50lh2ztY7Y5 = m61Var;
        return m61Var2;
    }

    public static void rtx2ld2ELZv4(l61 l61Var, l61 l61Var2, m61 m61Var) {
        if ((l61Var instanceof r61) && (l61Var2 instanceof r61)) {
            m61Var.getClass();
            ((r61) l61Var2).a92UlCVFR9N8(m61Var);
            if (m61Var.S9EYkSpbGuxq) {
                qd1.TSizfFm2Yiuu(m61Var);
                return;
            } else {
                m61Var.BRwzKIf41E4i = true;
                return;
            }
        }
        if (!(m61Var instanceof mc)) {
            ep0.lS5Rgt96tfkO("Unknown Modifier.Node type");
            return;
        }
        mc mcVar = (mc) m61Var;
        boolean z = mcVar.S9EYkSpbGuxq;
        if (z) {
            if (!z) {
                ep0.lS5Rgt96tfkO("unInitializeModifier called on unattached node");
            }
            if ((mcVar.wdg6QnbFHrFF & 8) != 0) {
                ((r1) zv.wLFCmsViZrNT(mcVar)).aF05bpZJlKEP();
            }
        }
        mcVar.VhhvGxCb8gfr = l61Var2;
        mcVar.wdg6QnbFHrFF = qd1.Y1f8riQaR6yg(l61Var2);
        if (mcVar.S9EYkSpbGuxq) {
            mcVar.W7ceZOzvrRuI(false);
        }
        if (m61Var.S9EYkSpbGuxq) {
            qd1.TSizfFm2Yiuu(m61Var);
        } else {
            m61Var.BRwzKIf41E4i = true;
        }
    }

    public final void RAsUl2FVSrh6() {
        vw0 vw0Var;
        nw0 nw0Var;
        m61 m61Var = this.e9gEMXR7LXtO.x50lh2ztY7Y5;
        pd1 pd1Var = this.TSizfFm2Yiuu;
        m61 m61Var2 = m61Var;
        while (true) {
            vw0Var = this.PxuCJdSBwIXG;
            if (m61Var2 == null) {
                break;
            }
            kw0 x50lh2ztY7Y5 = zv.x50lh2ztY7Y5(m61Var2);
            if (x50lh2ztY7Y5 != null) {
                pd1 pd1Var2 = m61Var2.QrzZRwfaDlRX;
                if (pd1Var2 != null) {
                    nw0 nw0Var2 = (nw0) pd1Var2;
                    kw0 kw0Var = nw0Var2.bEKsvqmvPh2y;
                    nw0Var2.x(x50lh2ztY7Y5);
                    nw0Var = nw0Var2;
                    if (kw0Var != m61Var2) {
                        ci1 ci1Var = nw0Var2.zf8DYfih6EZu;
                        nw0Var = nw0Var2;
                        if (ci1Var != null) {
                            ((uh0) ci1Var).TSizfFm2Yiuu();
                            nw0Var = nw0Var2;
                        }
                    }
                } else {
                    nw0 nw0Var3 = new nw0(vw0Var, x50lh2ztY7Y5);
                    m61Var2.EP3hG58ROvHh(nw0Var3);
                    nw0Var = nw0Var3;
                }
                pd1Var.ZbWwgt3aGe7A = nw0Var;
                nw0Var.S2OOm9zPNm0h = pd1Var;
                pd1Var = nw0Var;
            } else {
                m61Var2.EP3hG58ROvHh(pd1Var);
            }
            m61Var2 = m61Var2.x50lh2ztY7Y5;
        }
        vw0 S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq();
        pd1Var.ZbWwgt3aGe7A = S9EYkSpbGuxq != null ? S9EYkSpbGuxq.nLZGh9p8gVSu.TSizfFm2Yiuu : null;
        this.Y1f8riQaR6yg = pd1Var;
    }

    public final boolean Y1f8riQaR6yg(int i) {
        return (this.a92UlCVFR9N8.dgRBjINgWbAK & i) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:
    
        if (r11 <= r15) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r0.PxuCJdSBwIXG(r14 - 1, r27 - 1) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a92UlCVFR9N8(int i, f91 f91Var, f91 f91Var2, m61 m61Var, boolean z) {
        int i2;
        f91 f91Var3;
        f91 f91Var4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        id1 id1Var = this.wdg6QnbFHrFF;
        if (id1Var == null) {
            i2 = i;
            f91Var3 = f91Var;
            f91Var4 = f91Var2;
            id1Var = new id1(this, m61Var, i2, f91Var3, f91Var4, z);
            this.wdg6QnbFHrFF = id1Var;
        } else {
            i2 = i;
            f91Var3 = f91Var;
            f91Var4 = f91Var2;
            id1Var.PxuCJdSBwIXG = m61Var;
            id1Var.lS5Rgt96tfkO = i2;
            id1Var.TSizfFm2Yiuu = f91Var3;
            id1Var.Y1f8riQaR6yg = f91Var4;
            id1Var.e9gEMXR7LXtO = z;
        }
        kd1 kd1Var = id1Var.a92UlCVFR9N8;
        int i9 = f91Var3.wdg6QnbFHrFF - i2;
        int i10 = f91Var4.wdg6QnbFHrFF - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        jr0 jr0Var = new jr0(i11 * 3);
        jr0 jr0Var2 = new jr0(i11 * 4);
        int i12 = 0;
        jr0Var2.e9gEMXR7LXtO(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = jr0Var2.lS5Rgt96tfkO;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = jr0Var2.PxuCJdSBwIXG;
            int i15 = i12;
            int i16 = i14 - 1;
            jr0Var2.lS5Rgt96tfkO = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            jr0Var2.lS5Rgt96tfkO = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            jr0Var2.lS5Rgt96tfkO = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            jr0Var2.lS5Rgt96tfkO = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 >= 1 && i26 >= 1) {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i37 = ((i6 - i23) + i19) - i4;
                            int i38 = i37 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                            int i39 = i5;
                            i7 = i37;
                            while (i6 < i21 && i7 < i17 && id1Var.PxuCJdSBwIXG(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 == 0) {
                                int i40 = i7;
                                int i41 = i32 - i4;
                                i8 = i24;
                                if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                    iArr2[i15] = i39;
                                    iArr2[1] = i38;
                                    iArr2[c4] = i6;
                                    iArr2[3] = i40;
                                    iArr2[4] = i15;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i8 = i24;
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i372 = ((i6 - i23) + i19) - i4;
                        int i382 = i372 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                        int i392 = i5;
                        i7 = i372;
                        while (i6 < i21) {
                            i6++;
                            i7++;
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 == 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int i45 = iArr2[c4] - i42;
                        if (i44 != i45) {
                            i45 = Math.min(i45, i44);
                            int i46 = iArr2[4];
                            int i47 = i46 != 0 ? 1 : i15;
                            int i48 = iArr2[3];
                            c2 = 1;
                            int i49 = iArr2[1];
                            int i50 = i48 - i49;
                            int i51 = iArr2[c4];
                            int i52 = iArr2[i15];
                            int i53 = i42 + (((i50 > i51 - i52 ? 1 : i15) | i47) ^ 1);
                            i43 += (((i48 - i49 > i51 - i52 ? 1 : i15) ^ 1) | (i46 != 0 ? 1 : i15)) ^ 1;
                            i42 = i53;
                        } else {
                            c2 = 1;
                        }
                        jr0Var.Y1f8riQaR6yg(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    jr0Var2.e9gEMXR7LXtO(i23, iArr2[i15], i19, iArr2[c2]);
                    jr0Var2.e9gEMXR7LXtO(iArr2[c4], i21, iArr2[3], i17);
                    c3 = c4;
                    i12 = i15;
                    i13 = i25;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i54 = i12;
        int i55 = jr0Var.lS5Rgt96tfkO;
        if (i55 % 3 != 0) {
            ep0.lS5Rgt96tfkO("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            jr0Var.a92UlCVFR9N8(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        jr0Var.Y1f8riQaR6yg(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < jr0Var.lS5Rgt96tfkO) {
            int[] iArr8 = jr0Var.PxuCJdSBwIXG;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                m61 m61Var2 = id1Var.PxuCJdSBwIXG.cpQdD2nAriOS;
                m61Var2.getClass();
                if ((m61Var2.wdg6QnbFHrFF & 2) != 0) {
                    pd1 pd1Var = m61Var2.QrzZRwfaDlRX;
                    pd1Var.getClass();
                    pd1 pd1Var2 = pd1Var.ZbWwgt3aGe7A;
                    pd1 pd1Var3 = pd1Var.S2OOm9zPNm0h;
                    pd1Var3.getClass();
                    if (pd1Var2 != null) {
                        pd1Var2.S2OOm9zPNm0h = pd1Var3;
                    }
                    pd1Var3.ZbWwgt3aGe7A = pd1Var2;
                    PxuCJdSBwIXG(kd1Var, id1Var.PxuCJdSBwIXG, pd1Var3);
                }
                id1Var.PxuCJdSBwIXG = TSizfFm2Yiuu(m61Var2);
                i57++;
            }
            while (i58 < i62) {
                m61 lS5Rgt96tfkO = lS5Rgt96tfkO((l61) id1Var.Y1f8riQaR6yg.rtx2ld2ELZv4[id1Var.lS5Rgt96tfkO + i58], id1Var.PxuCJdSBwIXG);
                id1Var.PxuCJdSBwIXG = lS5Rgt96tfkO;
                if (id1Var.e9gEMXR7LXtO) {
                    m61 m61Var3 = lS5Rgt96tfkO.cpQdD2nAriOS;
                    m61Var3.getClass();
                    pd1 pd1Var4 = m61Var3.QrzZRwfaDlRX;
                    pd1Var4.getClass();
                    kw0 x50lh2ztY7Y5 = zv.x50lh2ztY7Y5(id1Var.PxuCJdSBwIXG);
                    if (x50lh2ztY7Y5 != null) {
                        nw0 nw0Var = new nw0(kd1Var.PxuCJdSBwIXG, x50lh2ztY7Y5);
                        id1Var.PxuCJdSBwIXG.EP3hG58ROvHh(nw0Var);
                        PxuCJdSBwIXG(kd1Var, id1Var.PxuCJdSBwIXG, nw0Var);
                        nw0Var.ZbWwgt3aGe7A = pd1Var4.ZbWwgt3aGe7A;
                        nw0Var.S2OOm9zPNm0h = pd1Var4;
                        pd1Var4.ZbWwgt3aGe7A = nw0Var;
                    } else {
                        id1Var.PxuCJdSBwIXG.EP3hG58ROvHh(pd1Var4);
                    }
                    id1Var.PxuCJdSBwIXG.HqMwxkFaipxD();
                    id1Var.PxuCJdSBwIXG.KZw9XyiywG4x();
                    m61 m61Var4 = id1Var.PxuCJdSBwIXG;
                    l81 l81Var = qd1.PxuCJdSBwIXG;
                    if (!m61Var4.S9EYkSpbGuxq) {
                        ep0.lS5Rgt96tfkO("autoInvalidateInsertedNode called on unattached node");
                    }
                    qd1.PxuCJdSBwIXG(m61Var4, -1, 1);
                } else {
                    lS5Rgt96tfkO.gPXPFXrUH4XX = true;
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    m61 m61Var5 = id1Var.PxuCJdSBwIXG.cpQdD2nAriOS;
                    m61Var5.getClass();
                    id1Var.PxuCJdSBwIXG = m61Var5;
                    f91 f91Var5 = id1Var.TSizfFm2Yiuu;
                    int i64 = id1Var.lS5Rgt96tfkO;
                    l61 l61Var = (l61) f91Var5.rtx2ld2ELZv4[i64 + i57];
                    l61 l61Var2 = (l61) id1Var.Y1f8riQaR6yg.rtx2ld2ELZv4[i64 + i58];
                    if (!cs0.wdg6QnbFHrFF(l61Var, l61Var2)) {
                        rtx2ld2ELZv4(l61Var, l61Var2, id1Var.PxuCJdSBwIXG);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        int i65 = i3;
        for (m61 m61Var6 = this.e9gEMXR7LXtO.x50lh2ztY7Y5; m61Var6 != null && m61Var6 != this.lS5Rgt96tfkO; m61Var6 = m61Var6.x50lh2ztY7Y5) {
            i65 |= m61Var6.wdg6QnbFHrFF;
            m61Var6.dgRBjINgWbAK = i65;
        }
    }

    public final void e9gEMXR7LXtO() {
        for (m61 m61Var = this.a92UlCVFR9N8; m61Var != null; m61Var = m61Var.cpQdD2nAriOS) {
            m61Var.KZw9XyiywG4x();
            if (m61Var.gPXPFXrUH4XX) {
                l81 l81Var = qd1.PxuCJdSBwIXG;
                if (!m61Var.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO("autoInvalidateInsertedNode called on unattached node");
                }
                qd1.PxuCJdSBwIXG(m61Var, -1, 1);
            }
            if (m61Var.BRwzKIf41E4i) {
                qd1.TSizfFm2Yiuu(m61Var);
            }
            m61Var.gPXPFXrUH4XX = false;
            m61Var.BRwzKIf41E4i = false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        m61 m61Var = this.a92UlCVFR9N8;
        gd2 gd2Var = this.e9gEMXR7LXtO;
        if (m61Var != gd2Var) {
            while (true) {
                if (m61Var == null || m61Var == gd2Var) {
                    break;
                }
                sb.append(String.valueOf(m61Var));
                if (m61Var.cpQdD2nAriOS == gd2Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                m61Var = m61Var.cpQdD2nAriOS;
            }
        } else {
            sb.append("]");
        }
        return sb.toString();
    }
}
