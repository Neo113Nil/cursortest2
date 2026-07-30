package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class u31 extends em1 implements a71, l51 {
    public static final q31 Companion = new q31();
    public boolean BRwzKIf41E4i;
    public cb1 EcgxDIVH5in8;
    public gm1 QrzZRwfaDlRX;
    public final v31 RfyTYNmI9Srp = new v31(0, this);
    public v81 S9EYkSpbGuxq;
    public boolean XL4ISE6Oc65B;
    public r31 cpQdD2nAriOS;
    public boolean gPXPFXrUH4XX;
    public le0 r3s1LDPKFs1S;

    public static void Y2PHjkwWz56c(pd1 pd1Var) {
        ww0 ww0Var;
        pd1 pd1Var2 = pd1Var.S2OOm9zPNm0h;
        vw0 vw0Var = pd1Var.VhhvGxCb8gfr;
        if (!cs0.wdg6QnbFHrFF(pd1Var2 != null ? pd1Var2.VhhvGxCb8gfr : null, vw0Var)) {
            vw0Var.ryVscX7ZL4Ux.gPXPFXrUH4XX.rZjpSjn4zoMv.a92UlCVFR9N8();
            return;
        }
        z XL4ISE6Oc65B = vw0Var.ryVscX7ZL4Ux.gPXPFXrUH4XX.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B == null || (ww0Var = ((i51) XL4ISE6Oc65B).rZjpSjn4zoMv) == null) {
            return;
        }
        ww0Var.a92UlCVFR9N8();
    }

    public abstract void EP3hG58ROvHh();

    public final void GlTbNTgfSMqy(k51 k51Var) {
        long j;
        long j2;
        v81 v81Var = this.S9EYkSpbGuxq;
        if (this.XL4ISE6Oc65B) {
            return;
        }
        le0 Y1f8riQaR6yg = k51Var.Y1f8riQaR6yg();
        if (Y1f8riQaR6yg == null) {
            if (v81Var != null) {
                Object[] objArr = v81Var.TSizfFm2Yiuu;
                long[] jArr = v81Var.PxuCJdSBwIXG;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j3 = jArr[i];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j3) < 128) {
                                    MBpAROcyNHKN((w81) objArr[(i << 3) + i3]);
                                }
                                j3 >>= 8;
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
                v81Var.PxuCJdSBwIXG();
                return;
            }
            return;
        }
        boolean z = this.r3s1LDPKFs1S != Y1f8riQaR6yg;
        wq0.Companion.getClass();
        ir0.Companion.getClass();
        if (z || !KZw9XyiywG4x().rtx2ld2ELZv4) {
            j = 9223372034707292159L;
            j2 = 0;
        } else {
            bw0 HqMwxkFaipxD = HqMwxkFaipxD();
            long wLFCmsViZrNT = vi0.wLFCmsViZrNT(kj0.EpkonXwzFgDB(HqMwxkFaipxD));
            long ryVscX7ZL4Ux = HqMwxkFaipxD.ryVscX7ZL4Ux();
            j = wLFCmsViZrNT;
            j2 = ryVscX7ZL4Ux;
            z = (wq0.PxuCJdSBwIXG(wLFCmsViZrNT, KZw9XyiywG4x().OPXfSBeufaJ8) && ir0.PxuCJdSBwIXG(ryVscX7ZL4Ux, KZw9XyiywG4x().wdg6QnbFHrFF)) ? false : true;
        }
        if (z) {
            gm1 gm1Var = this.QrzZRwfaDlRX;
            if (gm1Var != null) {
                gm1Var.rtx2ld2ELZv4 = k51Var;
            } else {
                gm1Var = new gm1(k51Var, this);
                this.QrzZRwfaDlRX = gm1Var;
            }
            iSxsmagYqzHM(gm1Var, j, j2);
            this.r3s1LDPKFs1S = k51Var.Y1f8riQaR6yg();
        }
    }

    public abstract u31 HGgCfDnf0ga9();

    public abstract bw0 HqMwxkFaipxD();

    public abstract k51 IxJ9cAW40yOk();

    public final r31 KZw9XyiywG4x() {
        r31 r31Var = this.cpQdD2nAriOS;
        if (r31Var != null) {
            return r31Var;
        }
        r31 r31Var2 = new r31(this);
        this.cpQdD2nAriOS = r31Var2;
        return r31Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void MBpAROcyNHKN(w81 w81Var) {
        vw0 vw0Var;
        Object[] objArr = w81Var.lS5Rgt96tfkO;
        long[] jArr = w81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (vw0Var = (vw0) ((zr2) objArr[(i << 3) + i3]).get()) != null) {
                        if (VhhvGxCb8gfr()) {
                            vw0Var.wLFCmsViZrNT(false);
                        } else {
                            vw0Var.nxJAScVArhE9(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Nlhe969cAGO8(vw0 vw0Var, ey1 ey1Var) {
        char c;
        long j;
        long j2;
        long j3;
        v81 v81Var;
        v81 v81Var2;
        Object RAsUl2FVSrh6;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        v81 v81Var3 = this.S9EYkSpbGuxq;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (v81Var3 != null) {
            Object[] objArr = v81Var3.TSizfFm2Yiuu;
            long[] jArr3 = v81Var3.PxuCJdSBwIXG;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                w81 w81Var = (w81) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = w81Var.lS5Rgt96tfkO;
                                long[] jArr4 = w81Var.PxuCJdSBwIXG;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    vw0 vw0Var2 = (vw0) ((zr2) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (vw0Var2 != null) {
                                                        boolean J54yh1s3n4Aq = vw0Var2.J54yh1s3n4Aq();
                                                        i4 = i8;
                                                        if (J54yh1s3n4Aq) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    w81Var.cpQdD2nAriOS(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                v81Var = this.S9EYkSpbGuxq;
                if (v81Var != null) {
                    long[] jArr5 = v81Var.PxuCJdSBwIXG;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((w81) v81Var.TSizfFm2Yiuu[i18]).RAsUl2FVSrh6()) {
                                            v81Var.x50lh2ztY7Y5(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                v81Var2 = this.S9EYkSpbGuxq;
                if (v81Var2 == null) {
                    v81Var2 = new v81();
                    this.S9EYkSpbGuxq = v81Var2;
                }
                RAsUl2FVSrh6 = v81Var2.RAsUl2FVSrh6(ey1Var);
                if (RAsUl2FVSrh6 == null) {
                    RAsUl2FVSrh6 = new w81();
                    v81Var2.cpQdD2nAriOS(ey1Var, RAsUl2FVSrh6);
                }
                ((w81) RAsUl2FVSrh6).dgRBjINgWbAK(new zr2(vw0Var));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        v81Var = this.S9EYkSpbGuxq;
        if (v81Var != null) {
        }
        v81Var2 = this.S9EYkSpbGuxq;
        if (v81Var2 == null) {
        }
        RAsUl2FVSrh6 = v81Var2.RAsUl2FVSrh6(ey1Var);
        if (RAsUl2FVSrh6 == null) {
        }
        ((w81) RAsUl2FVSrh6).dgRBjINgWbAK(new zr2(vw0Var));
    }

    public abstract vw0 OYiFbU3x63rc();

    @Override // defpackage.a71
    public final void QrzZRwfaDlRX(boolean z) {
        u31 HGgCfDnf0ga9 = HGgCfDnf0ga9();
        vw0 OYiFbU3x63rc = HGgCfDnf0ga9 != null ? HGgCfDnf0ga9.OYiFbU3x63rc() : null;
        if (cs0.wdg6QnbFHrFF(OYiFbU3x63rc, OYiFbU3x63rc())) {
            this.gPXPFXrUH4XX = z;
            return;
        }
        if ((OYiFbU3x63rc != null ? OYiFbU3x63rc.ryVscX7ZL4Ux.Y1f8riQaR6yg : null) != rw0.wdg6QnbFHrFF) {
            if ((OYiFbU3x63rc != null ? OYiFbU3x63rc.ryVscX7ZL4Ux.Y1f8riQaR6yg : null) != rw0.dgRBjINgWbAK) {
                return;
            }
        }
        this.gPXPFXrUH4XX = z;
    }

    @Override // defpackage.vr0
    public boolean VhhvGxCb8gfr() {
        return false;
    }

    @Override // defpackage.l51
    public final k51 gGoUzNp9JO5I(int i, int i2, Map map, le0 le0Var, le0 le0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ep0.lS5Rgt96tfkO("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new t31(i, i2, map, le0Var, le0Var2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void iSxsmagYqzHM(gm1 gm1Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        vw0 vw0Var;
        int i;
        char c2;
        long j6;
        u31 HGgCfDnf0ga9;
        hi1 snapshotObserver;
        v81 v81Var = this.S9EYkSpbGuxq;
        cb1 cb1Var = this.EcgxDIVH5in8;
        if (cb1Var == null) {
            cb1Var = new cb1();
            this.EcgxDIVH5in8 = cb1Var;
        }
        cb1 cb1Var2 = cb1Var;
        ei1 ei1Var = OYiFbU3x63rc().S9EYkSpbGuxq;
        if (ei1Var != null && (snapshotObserver = ((r1) ei1Var).getSnapshotObserver()) != null) {
            snapshotObserver.PxuCJdSBwIXG.Y1f8riQaR6yg(gm1Var, k1.ozEBbv0hFTAB, new s31(this, j, j2, gm1Var));
        }
        boolean VhhvGxCb8gfr = VhhvGxCb8gfr();
        w81 w81Var = (w81) cb1Var2.a92UlCVFR9N8;
        w81 w81Var2 = (w81) cb1Var2.RAsUl2FVSrh6;
        int i2 = cb1Var2.lS5Rgt96tfkO;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) cb1Var2.e9gEMXR7LXtO)[i3];
            if (b == 3) {
                ey1 ey1Var = ((ey1[]) cb1Var2.TSizfFm2Yiuu)[i3];
                ey1Var.getClass();
                w81Var2.dgRBjINgWbAK(ey1Var);
            } else if (b != 0 && v81Var != null) {
                ey1 ey1Var2 = ((ey1[]) cb1Var2.TSizfFm2Yiuu)[i3];
                ey1Var2.getClass();
                w81 w81Var3 = (w81) v81Var.dgRBjINgWbAK(ey1Var2);
                if (w81Var3 != null) {
                    w81Var.wdg6QnbFHrFF(w81Var3);
                }
            }
        }
        int i4 = cb1Var2.lS5Rgt96tfkO;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) cb1Var2.e9gEMXR7LXtO;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                ey1[] ey1VarArr = (ey1[]) cb1Var2.TSizfFm2Yiuu;
                ey1VarArr[i6 - i5] = ey1VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = cb1Var2.lS5Rgt96tfkO;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((ey1[]) cb1Var2.TSizfFm2Yiuu)[i8] = null;
        }
        cb1Var2.lS5Rgt96tfkO -= i5;
        u31 HGgCfDnf0ga92 = HGgCfDnf0ga9();
        Object[] objArr = w81Var2.lS5Rgt96tfkO;
        long[] jArr = w81Var2.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            ey1 ey1Var3 = (ey1) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            u31 u31Var = HGgCfDnf0ga92 == null ? this : HGgCfDnf0ga92;
                            i = i9;
                            u31 u31Var2 = u31Var;
                            while (true) {
                                cb1 cb1Var3 = u31Var2.EcgxDIVH5in8;
                                if ((cb1Var3 == null || na.hnJvRxDXo0hm((ey1[]) cb1Var3.TSizfFm2Yiuu, ey1Var3) < 0) && (HGgCfDnf0ga9 = u31Var2.HGgCfDnf0ga9()) != null) {
                                    u31Var2 = HGgCfDnf0ga9;
                                }
                            }
                            v81 v81Var2 = u31Var2.S9EYkSpbGuxq;
                            w81 w81Var4 = v81Var2 != null ? (w81) v81Var2.dgRBjINgWbAK(ey1Var3) : null;
                            if (w81Var4 != null) {
                                u31Var.MBpAROcyNHKN(w81Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        w81Var2.lS5Rgt96tfkO();
        Object[] objArr2 = w81Var.lS5Rgt96tfkO;
        long[] jArr2 = w81Var.PxuCJdSBwIXG;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (vw0Var = (vw0) ((zr2) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (VhhvGxCb8gfr) {
                                vw0Var.wLFCmsViZrNT(false);
                            } else {
                                vw0Var.nxJAScVArhE9(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        w81Var.lS5Rgt96tfkO();
    }

    public abstract u31 mFd1aGiJX24N();

    public abstract boolean twy4zb2fCtqq();

    public abstract int uURZJOrwXbxn(u uVar);

    public abstract long wnqUPcAvl7HT();

    @Override // defpackage.em1
    public final int yQRudnv4La6p(u uVar) {
        int uURZJOrwXbxn;
        if (!twy4zb2fCtqq() || (uURZJOrwXbxn = uURZJOrwXbxn(uVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = uVar instanceof fq2;
        long j = this.x50lh2ztY7Y5;
        return uURZJOrwXbxn + ((int) (z ? j >> 32 : 4294967295L & j));
    }
}
