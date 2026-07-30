package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class s72 {
    public static List OPXfSBeufaJ8;
    public static final x3 RAsUl2FVSrh6;
    public static q72 Y1f8riQaR6yg;
    public static final n72 a92UlCVFR9N8;
    public static final bb dgRBjINgWbAK;
    public static long e9gEMXR7LXtO;
    public static List rtx2ld2ELZv4;
    public static final wg0 wdg6QnbFHrFF;
    public static final vz1 PxuCJdSBwIXG = new vz1(18);
    public static final m9 lS5Rgt96tfkO = new m9(18);
    public static final Object TSizfFm2Yiuu = new Object();

    static {
        q72.Companion.getClass();
        q72 q72Var = q72.x50lh2ztY7Y5;
        Y1f8riQaR6yg = q72Var;
        e9gEMXR7LXtO = 2L;
        n72 n72Var = new n72();
        n72Var.lS5Rgt96tfkO = new long[16];
        n72Var.TSizfFm2Yiuu = new int[16];
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        n72Var.Y1f8riQaR6yg = iArr;
        a92UlCVFR9N8 = n72Var;
        x3 x3Var = new x3();
        x3Var.lS5Rgt96tfkO = new int[16];
        x3Var.TSizfFm2Yiuu = new bs2[16];
        RAsUl2FVSrh6 = x3Var;
        p50 p50Var = p50.rtx2ld2ELZv4;
        rtx2ld2ELZv4 = p50Var;
        OPXfSBeufaJ8 = p50Var;
        long j = e9gEMXR7LXtO;
        e9gEMXR7LXtO = 1 + j;
        q72.Companion.getClass();
        wg0 wg0Var = new wg0(j, q72Var, null, new wnqUPcAvl7HT(15));
        Y1f8riQaR6yg = Y1f8riQaR6yg.e9gEMXR7LXtO(wg0Var.lS5Rgt96tfkO);
        wdg6QnbFHrFF = wg0Var;
        dgRBjINgWbAK = new bb(0);
    }

    public static final void BRwzKIf41E4i() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final void EcgxDIVH5in8(int i) {
        n72 n72Var = a92UlCVFR9N8;
        int i2 = n72Var.Y1f8riQaR6yg[i];
        n72Var.lS5Rgt96tfkO(i2, n72Var.PxuCJdSBwIXG - 1);
        n72Var.PxuCJdSBwIXG--;
        long[] jArr = n72Var.lS5Rgt96tfkO;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (cs0.BRwzKIf41E4i(jArr[i4], j) <= 0) {
                break;
            }
            n72Var.lS5Rgt96tfkO(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = n72Var.lS5Rgt96tfkO;
        int i5 = n72Var.PxuCJdSBwIXG >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < n72Var.PxuCJdSBwIXG && cs0.BRwzKIf41E4i(jArr2[i6], jArr2[i7]) < 0) {
                if (cs0.BRwzKIf41E4i(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                n72Var.lS5Rgt96tfkO(i6, i2);
                i2 = i6;
            } else {
                if (cs0.BRwzKIf41E4i(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                n72Var.lS5Rgt96tfkO(i7, i2);
                i2 = i7;
            }
        }
        n72Var.Y1f8riQaR6yg[i] = n72Var.e9gEMXR7LXtO;
        n72Var.e9gEMXR7LXtO = i;
    }

    public static final j72 OPXfSBeufaJ8() {
        j72 j72Var = (j72) lS5Rgt96tfkO.QrzZRwfaDlRX();
        return j72Var == null ? wdg6QnbFHrFF : j72Var;
    }

    public static final HashMap PxuCJdSBwIXG(long j, b91 b91Var, q72 q72Var) {
        long[] jArr;
        q72 q72Var2;
        long[] jArr2;
        q72 q72Var3;
        int i;
        int i2;
        r92 XL4ISE6Oc65B;
        w81 ZbWwgt3aGe7A = b91Var.ZbWwgt3aGe7A();
        if (ZbWwgt3aGe7A != null) {
            long RAsUl2FVSrh62 = b91Var.RAsUl2FVSrh6();
            q72 Y1f8riQaR6yg2 = b91Var.Y1f8riQaR6yg().e9gEMXR7LXtO(RAsUl2FVSrh62).Y1f8riQaR6yg(b91Var.wdg6QnbFHrFF);
            Object[] objArr = ZbWwgt3aGe7A.lS5Rgt96tfkO;
            long[] jArr3 = ZbWwgt3aGe7A.PxuCJdSBwIXG;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                p92 p92Var = (p92) objArr[(i3 << 3) + i6];
                                r92 PxuCJdSBwIXG2 = p92Var.PxuCJdSBwIXG();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                r92 XL4ISE6Oc65B2 = XL4ISE6Oc65B(PxuCJdSBwIXG2, j, q72Var);
                                if (XL4ISE6Oc65B2 == null || (XL4ISE6Oc65B = XL4ISE6Oc65B(PxuCJdSBwIXG2, RAsUl2FVSrh62, Y1f8riQaR6yg2)) == null || XL4ISE6Oc65B2.equals(XL4ISE6Oc65B)) {
                                    q72Var3 = Y1f8riQaR6yg2;
                                } else {
                                    q72Var3 = Y1f8riQaR6yg2;
                                    r92 XL4ISE6Oc65B3 = XL4ISE6Oc65B(PxuCJdSBwIXG2, RAsUl2FVSrh62, b91Var.Y1f8riQaR6yg());
                                    if (XL4ISE6Oc65B3 == null) {
                                        BRwzKIf41E4i();
                                        throw null;
                                    }
                                    r92 lS5Rgt96tfkO2 = p92Var.lS5Rgt96tfkO(XL4ISE6Oc65B, XL4ISE6Oc65B2, XL4ISE6Oc65B3);
                                    if (lS5Rgt96tfkO2 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(XL4ISE6Oc65B2, lS5Rgt96tfkO2);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                q72Var3 = Y1f8riQaR6yg2;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            Y1f8riQaR6yg2 = q72Var3;
                        }
                        jArr = jArr3;
                        q72Var2 = Y1f8riQaR6yg2;
                        if (i5 != i4) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        q72Var2 = Y1f8riQaR6yg2;
                    }
                    if (i3 == length) {
                        return hashMap;
                    }
                    i3++;
                    jArr3 = jArr;
                    Y1f8riQaR6yg2 = q72Var2;
                }
            }
        }
        return null;
    }

    public static final boolean QrzZRwfaDlRX(p92 p92Var) {
        r92 r92Var;
        long j = e9gEMXR7LXtO;
        n72 n72Var = a92UlCVFR9N8;
        if (n72Var.PxuCJdSBwIXG > 0) {
            j = n72Var.lS5Rgt96tfkO[0];
        }
        r92 r92Var2 = null;
        r92 r92Var3 = null;
        int i = 0;
        for (r92 PxuCJdSBwIXG2 = p92Var.PxuCJdSBwIXG(); PxuCJdSBwIXG2 != null; PxuCJdSBwIXG2 = PxuCJdSBwIXG2.lS5Rgt96tfkO) {
            long j2 = PxuCJdSBwIXG2.PxuCJdSBwIXG;
            if (j2 != 0) {
                if (cs0.BRwzKIf41E4i(j2, j) >= 0) {
                    i++;
                } else if (r92Var2 == null) {
                    i++;
                    r92Var2 = PxuCJdSBwIXG2;
                } else {
                    if (cs0.BRwzKIf41E4i(PxuCJdSBwIXG2.PxuCJdSBwIXG, r92Var2.PxuCJdSBwIXG) < 0) {
                        r92Var = r92Var2;
                        r92Var2 = PxuCJdSBwIXG2;
                    } else {
                        r92Var = PxuCJdSBwIXG2;
                    }
                    if (r92Var3 == null) {
                        r92Var3 = p92Var.PxuCJdSBwIXG();
                        r92 r92Var4 = r92Var3;
                        while (true) {
                            if (r92Var3 == null) {
                                r92Var3 = r92Var4;
                                break;
                            }
                            if (cs0.BRwzKIf41E4i(r92Var3.PxuCJdSBwIXG, j) >= 0) {
                                break;
                            }
                            if (cs0.BRwzKIf41E4i(r92Var4.PxuCJdSBwIXG, r92Var3.PxuCJdSBwIXG) < 0) {
                                r92Var4 = r92Var3;
                            }
                            r92Var3 = r92Var3.lS5Rgt96tfkO;
                        }
                    }
                    r92Var2.PxuCJdSBwIXG = 0L;
                    r92Var2.PxuCJdSBwIXG(r92Var3);
                    r92Var2 = r92Var;
                }
            }
        }
        return i > 1;
    }

    public static final r92 RAsUl2FVSrh6(r92 r92Var) {
        r92 XL4ISE6Oc65B;
        j72.Companion.getClass();
        j72 OPXfSBeufaJ82 = OPXfSBeufaJ8();
        r92 XL4ISE6Oc65B2 = XL4ISE6Oc65B(r92Var, OPXfSBeufaJ82.RAsUl2FVSrh6(), OPXfSBeufaJ82.Y1f8riQaR6yg());
        if (XL4ISE6Oc65B2 != null) {
            return XL4ISE6Oc65B2;
        }
        synchronized (TSizfFm2Yiuu) {
            j72 OPXfSBeufaJ83 = OPXfSBeufaJ8();
            XL4ISE6Oc65B = XL4ISE6Oc65B(r92Var, OPXfSBeufaJ83.RAsUl2FVSrh6(), OPXfSBeufaJ83.Y1f8riQaR6yg());
        }
        if (XL4ISE6Oc65B != null) {
            return XL4ISE6Oc65B;
        }
        BRwzKIf41E4i();
        throw null;
    }

    public static final r92 RfyTYNmI9Srp(r92 r92Var, p92 p92Var) {
        r92 XL4ISE6Oc65B;
        j72.Companion.getClass();
        j72 OPXfSBeufaJ82 = OPXfSBeufaJ8();
        le0 e9gEMXR7LXtO2 = OPXfSBeufaJ82.e9gEMXR7LXtO();
        if (e9gEMXR7LXtO2 != null) {
            e9gEMXR7LXtO2.OPXfSBeufaJ8(p92Var);
        }
        r92 XL4ISE6Oc65B2 = XL4ISE6Oc65B(r92Var, OPXfSBeufaJ82.RAsUl2FVSrh6(), OPXfSBeufaJ82.Y1f8riQaR6yg());
        if (XL4ISE6Oc65B2 != null) {
            return XL4ISE6Oc65B2;
        }
        synchronized (TSizfFm2Yiuu) {
            j72 OPXfSBeufaJ83 = OPXfSBeufaJ8();
            r92 PxuCJdSBwIXG2 = p92Var.PxuCJdSBwIXG();
            PxuCJdSBwIXG2.getClass();
            XL4ISE6Oc65B = XL4ISE6Oc65B(PxuCJdSBwIXG2, OPXfSBeufaJ83.RAsUl2FVSrh6(), OPXfSBeufaJ83.Y1f8riQaR6yg());
            if (XL4ISE6Oc65B == null) {
                BRwzKIf41E4i();
                throw null;
            }
        }
        return XL4ISE6Oc65B;
    }

    public static final Object S9EYkSpbGuxq(wg0 wg0Var, le0 le0Var) {
        long j = wg0Var.lS5Rgt96tfkO;
        Object OPXfSBeufaJ82 = le0Var.OPXfSBeufaJ8(Y1f8riQaR6yg.lS5Rgt96tfkO(j));
        long j2 = e9gEMXR7LXtO;
        e9gEMXR7LXtO = 1 + j2;
        q72 lS5Rgt96tfkO2 = Y1f8riQaR6yg.lS5Rgt96tfkO(j);
        Y1f8riQaR6yg = lS5Rgt96tfkO2;
        wg0Var.lS5Rgt96tfkO = j2;
        wg0Var.PxuCJdSBwIXG = lS5Rgt96tfkO2;
        wg0Var.RAsUl2FVSrh6 = 0;
        wg0Var.rtx2ld2ELZv4 = null;
        wg0Var.QrzZRwfaDlRX();
        Y1f8riQaR6yg = Y1f8riQaR6yg.e9gEMXR7LXtO(j2);
        return OPXfSBeufaJ82;
    }

    public static final q72 TSizfFm2Yiuu(q72 q72Var, long j, long j2) {
        while (cs0.BRwzKIf41E4i(j, j2) < 0) {
            q72Var = q72Var.e9gEMXR7LXtO(j);
            j++;
        }
        return q72Var;
    }

    public static final r92 VhhvGxCb8gfr(r92 r92Var, p92 p92Var, j72 j72Var) {
        r92 XL4ISE6Oc65B;
        if (j72Var.a92UlCVFR9N8()) {
            j72Var.r3s1LDPKFs1S(p92Var);
        }
        long RAsUl2FVSrh62 = j72Var.RAsUl2FVSrh6();
        r92 XL4ISE6Oc65B2 = XL4ISE6Oc65B(r92Var, RAsUl2FVSrh62, j72Var.Y1f8riQaR6yg());
        if (XL4ISE6Oc65B2 == null) {
            BRwzKIf41E4i();
            throw null;
        }
        if (XL4ISE6Oc65B2.PxuCJdSBwIXG == j72Var.RAsUl2FVSrh6()) {
            return XL4ISE6Oc65B2;
        }
        synchronized (TSizfFm2Yiuu) {
            XL4ISE6Oc65B = XL4ISE6Oc65B(p92Var.PxuCJdSBwIXG(), RAsUl2FVSrh62, j72Var.Y1f8riQaR6yg());
            if (XL4ISE6Oc65B == null) {
                BRwzKIf41E4i();
                throw null;
            }
            if (XL4ISE6Oc65B.PxuCJdSBwIXG != RAsUl2FVSrh62) {
                r92 x50lh2ztY7Y5 = x50lh2ztY7Y5(XL4ISE6Oc65B, p92Var);
                x50lh2ztY7Y5.PxuCJdSBwIXG(XL4ISE6Oc65B);
                x50lh2ztY7Y5.PxuCJdSBwIXG = j72Var.RAsUl2FVSrh6();
                XL4ISE6Oc65B = x50lh2ztY7Y5;
            }
        }
        if (XL4ISE6Oc65B2.PxuCJdSBwIXG != 1) {
            j72Var.r3s1LDPKFs1S(p92Var);
        }
        return XL4ISE6Oc65B;
    }

    public static final r92 XL4ISE6Oc65B(r92 r92Var, long j, q72 q72Var) {
        r92 r92Var2 = null;
        while (r92Var != null) {
            long j2 = r92Var.PxuCJdSBwIXG;
            if (j2 != 0 && cs0.BRwzKIf41E4i(j2, j) <= 0 && !q72Var.TSizfFm2Yiuu(j2) && (r92Var2 == null || cs0.BRwzKIf41E4i(r92Var2.PxuCJdSBwIXG, r92Var.PxuCJdSBwIXG) < 0)) {
                r92Var2 = r92Var;
            }
            r92Var = r92Var.lS5Rgt96tfkO;
        }
        if (r92Var2 != null) {
            return r92Var2;
        }
        return null;
    }

    public static final Object Y1f8riQaR6yg(le0 le0Var) {
        w81 w81Var;
        Object S9EYkSpbGuxq;
        wg0 wg0Var = wdg6QnbFHrFF;
        synchronized (TSizfFm2Yiuu) {
            try {
                w81Var = wg0Var.rtx2ld2ELZv4;
                if (w81Var != null) {
                    dgRBjINgWbAK.addAndGet(1);
                }
                S9EYkSpbGuxq = S9EYkSpbGuxq(wg0Var, le0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (w81Var != null) {
            try {
                List list = rtx2ld2ELZv4;
                e02 e02Var = new e02(w81Var);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((pe0) list.get(i)).rtx2ld2ELZv4(e02Var, wg0Var);
                }
            } finally {
                dgRBjINgWbAK.addAndGet(-1);
            }
        }
        synchronized (TSizfFm2Yiuu) {
            e9gEMXR7LXtO();
            if (w81Var != null) {
                Object[] objArr = w81Var.lS5Rgt96tfkO;
                long[] jArr = w81Var.PxuCJdSBwIXG;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    gPXPFXrUH4XX((p92) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return S9EYkSpbGuxq;
    }

    public static final j72 a92UlCVFR9N8(j72 j72Var, le0 le0Var, boolean z) {
        boolean z2 = j72Var instanceof b91;
        if (z2 || j72Var == null) {
            return new kl2(z2 ? (b91) j72Var : null, le0Var, null, false, z);
        }
        return new ll2(j72Var, le0Var, false, z);
    }

    public static final void cpQdD2nAriOS(j72 j72Var, p92 p92Var) {
        j72Var.EcgxDIVH5in8(j72Var.rtx2ld2ELZv4() + 1);
        le0 OPXfSBeufaJ82 = j72Var.OPXfSBeufaJ8();
        if (OPXfSBeufaJ82 != null) {
            OPXfSBeufaJ82.OPXfSBeufaJ8(p92Var);
        }
    }

    public static final le0 dgRBjINgWbAK(le0 le0Var, le0 le0Var2) {
        return (le0Var == null || le0Var2 == null || le0Var == le0Var2) ? le0Var == null ? le0Var2 : le0Var : new r72(le0Var, le0Var2, 1);
    }

    public static final void e9gEMXR7LXtO() {
        x3 x3Var = RAsUl2FVSrh6;
        int i = x3Var.PxuCJdSBwIXG;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            bs2 bs2Var = ((bs2[]) x3Var.TSizfFm2Yiuu)[i2];
            Object obj = bs2Var != null ? bs2Var.get() : null;
            if (obj != null && QrzZRwfaDlRX((p92) obj)) {
                if (i3 != i2) {
                    ((bs2[]) x3Var.TSizfFm2Yiuu)[i3] = bs2Var;
                    int[] iArr = (int[]) x3Var.lS5Rgt96tfkO;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((bs2[]) x3Var.TSizfFm2Yiuu)[i4] = null;
            ((int[]) x3Var.lS5Rgt96tfkO)[i4] = 0;
        }
        if (i3 != i) {
            x3Var.PxuCJdSBwIXG = i3;
        }
    }

    public static final void gPXPFXrUH4XX(p92 p92Var) {
        if (QrzZRwfaDlRX(p92Var)) {
            x3 x3Var = RAsUl2FVSrh6;
            int i = x3Var.PxuCJdSBwIXG;
            int identityHashCode = System.identityHashCode(p92Var);
            int i2 = -1;
            if (i > 0) {
                int i3 = x3Var.PxuCJdSBwIXG - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) x3Var.lS5Rgt96tfkO)[i5];
                    if (i6 < identityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > identityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        bs2 bs2Var = ((bs2[]) x3Var.TSizfFm2Yiuu)[i5];
                        if (p92Var != (bs2Var != null ? bs2Var.get() : null)) {
                            for (int i7 = i5 - 1; -1 < i7 && ((int[]) x3Var.lS5Rgt96tfkO)[i7] == identityHashCode; i7--) {
                                bs2 bs2Var2 = ((bs2[]) x3Var.TSizfFm2Yiuu)[i7];
                                if ((bs2Var2 != null ? bs2Var2.get() : null) == p92Var) {
                                    i2 = i7;
                                    break;
                                }
                            }
                            i5++;
                            int i8 = x3Var.PxuCJdSBwIXG;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(x3Var.PxuCJdSBwIXG + 1);
                                    break;
                                } else {
                                    if (((int[]) x3Var.lS5Rgt96tfkO)[i5] != identityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    bs2 bs2Var3 = ((bs2[]) x3Var.TSizfFm2Yiuu)[i5];
                                    if ((bs2Var3 != null ? bs2Var3.get() : null) == p92Var) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                        }
                        i2 = i5;
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            bs2[] bs2VarArr = (bs2[]) x3Var.TSizfFm2Yiuu;
            int length = bs2VarArr.length;
            if (i == length) {
                int i10 = length * 2;
                bs2[] bs2VarArr2 = new bs2[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(bs2VarArr, i9, bs2VarArr2, i11, i - i9);
                System.arraycopy((bs2[]) x3Var.TSizfFm2Yiuu, 0, bs2VarArr2, 0, i9);
                na.PsecLrZVVK61((int[]) x3Var.lS5Rgt96tfkO, iArr, i11, i9, i);
                na.rxipThha848g((int[]) x3Var.lS5Rgt96tfkO, iArr, 0, i9, 6);
                x3Var.TSizfFm2Yiuu = bs2VarArr2;
                x3Var.lS5Rgt96tfkO = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(bs2VarArr, i9, bs2VarArr, i12, i - i9);
                int[] iArr2 = (int[]) x3Var.lS5Rgt96tfkO;
                na.PsecLrZVVK61(iArr2, iArr2, i12, i9, i);
            }
            ((bs2[]) x3Var.TSizfFm2Yiuu)[i9] = new bs2(p92Var);
            ((int[]) x3Var.lS5Rgt96tfkO)[i9] = identityHashCode;
            x3Var.PxuCJdSBwIXG++;
        }
    }

    public static final void lS5Rgt96tfkO(j72 j72Var) {
        long j;
        if (Y1f8riQaR6yg.TSizfFm2Yiuu(j72Var.RAsUl2FVSrh6())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(j72Var.RAsUl2FVSrh6());
        sb.append(", disposed=");
        sb.append(j72Var.TSizfFm2Yiuu);
        sb.append(", applied=");
        b91 b91Var = j72Var instanceof b91 ? (b91) j72Var : null;
        sb.append(b91Var != null ? Boolean.valueOf(b91Var.cpQdD2nAriOS) : "read-only");
        sb.append(", lowestPin=");
        synchronized (TSizfFm2Yiuu) {
            n72 n72Var = a92UlCVFR9N8;
            j = n72Var.PxuCJdSBwIXG > 0 ? n72Var.lS5Rgt96tfkO[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final r92 r3s1LDPKFs1S(r92 r92Var, q92 q92Var, j72 j72Var, r92 r92Var2) {
        r92 x50lh2ztY7Y5;
        if (j72Var.a92UlCVFR9N8()) {
            j72Var.r3s1LDPKFs1S(q92Var);
        }
        long RAsUl2FVSrh62 = j72Var.RAsUl2FVSrh6();
        if (r92Var2.PxuCJdSBwIXG == RAsUl2FVSrh62) {
            return r92Var2;
        }
        synchronized (TSizfFm2Yiuu) {
            x50lh2ztY7Y5 = x50lh2ztY7Y5(r92Var, q92Var);
        }
        x50lh2ztY7Y5.PxuCJdSBwIXG = RAsUl2FVSrh62;
        if (r92Var2.PxuCJdSBwIXG != 1) {
            j72Var.r3s1LDPKFs1S(q92Var);
        }
        return x50lh2ztY7Y5;
    }

    public static final r92 rtx2ld2ELZv4(r92 r92Var, j72 j72Var) {
        r92 XL4ISE6Oc65B;
        r92 XL4ISE6Oc65B2 = XL4ISE6Oc65B(r92Var, j72Var.RAsUl2FVSrh6(), j72Var.Y1f8riQaR6yg());
        if (XL4ISE6Oc65B2 != null) {
            return XL4ISE6Oc65B2;
        }
        synchronized (TSizfFm2Yiuu) {
            XL4ISE6Oc65B = XL4ISE6Oc65B(r92Var, j72Var.RAsUl2FVSrh6(), j72Var.Y1f8riQaR6yg());
        }
        if (XL4ISE6Oc65B != null) {
            return XL4ISE6Oc65B;
        }
        BRwzKIf41E4i();
        throw null;
    }

    public static final le0 wdg6QnbFHrFF(le0 le0Var, le0 le0Var2, boolean z) {
        if (!z) {
            le0Var2 = null;
        }
        return (le0Var == null || le0Var2 == null || le0Var == le0Var2) ? le0Var == null ? le0Var2 : le0Var : new r72(le0Var, le0Var2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r92 x50lh2ztY7Y5(r92 r92Var, p92 p92Var) {
        r92 PxuCJdSBwIXG2 = p92Var.PxuCJdSBwIXG();
        long j = e9gEMXR7LXtO;
        n72 n72Var = a92UlCVFR9N8;
        if (n72Var.PxuCJdSBwIXG > 0) {
            j = n72Var.lS5Rgt96tfkO[0];
        }
        long j2 = j - 1;
        q72.Companion.getClass();
        r92 r92Var2 = null;
        r92 r92Var3 = null;
        while (true) {
            if (PxuCJdSBwIXG2 == null) {
                break;
            }
            long j3 = PxuCJdSBwIXG2.PxuCJdSBwIXG;
            if (j3 == 0) {
                break;
            }
            if (j3 != 0 && cs0.BRwzKIf41E4i(j3, j2) <= 0 && !q72.x50lh2ztY7Y5.TSizfFm2Yiuu(j3)) {
                if (r92Var3 == null) {
                    r92Var3 = PxuCJdSBwIXG2;
                } else if (cs0.BRwzKIf41E4i(PxuCJdSBwIXG2.PxuCJdSBwIXG, r92Var3.PxuCJdSBwIXG) >= 0) {
                    r92Var2 = r92Var3;
                }
            }
            PxuCJdSBwIXG2 = PxuCJdSBwIXG2.lS5Rgt96tfkO;
        }
        if (r92Var2 != null) {
            r92Var2.PxuCJdSBwIXG = Long.MAX_VALUE;
            return r92Var2;
        }
        r92 lS5Rgt96tfkO2 = r92Var.lS5Rgt96tfkO(Long.MAX_VALUE);
        lS5Rgt96tfkO2.lS5Rgt96tfkO = p92Var.PxuCJdSBwIXG();
        p92Var.Y1f8riQaR6yg(lS5Rgt96tfkO2);
        return lS5Rgt96tfkO2;
    }
}
