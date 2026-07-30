package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class b91 extends j72 {
    private static final a91 Companion = new a91();
    public static final int[] r3s1LDPKFs1S = new int[0];
    public ArrayList OPXfSBeufaJ8;
    public int RAsUl2FVSrh6;
    public final le0 a92UlCVFR9N8;
    public boolean cpQdD2nAriOS;
    public int[] dgRBjINgWbAK;
    public final le0 e9gEMXR7LXtO;
    public w81 rtx2ld2ELZv4;
    public q72 wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    public b91(long j, q72 q72Var, le0 le0Var, le0 le0Var2) {
        super(j, q72Var);
        this.e9gEMXR7LXtO = le0Var;
        this.a92UlCVFR9N8 = le0Var2;
        q72.Companion.getClass();
        this.wdg6QnbFHrFF = q72.x50lh2ztY7Y5;
        this.dgRBjINgWbAK = r3s1LDPKFs1S;
        this.x50lh2ztY7Y5 = 1;
    }

    @Override // defpackage.j72
    public void EcgxDIVH5in8(int i) {
        this.RAsUl2FVSrh6 = i;
    }

    public final xi0 IAToe7bXGz4N(long j, w81 w81Var, HashMap hashMap, q72 q72Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        q72 q72Var2;
        Object[] objArr;
        long[] jArr;
        q72 q72Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        r92 lS5Rgt96tfkO;
        q72 Y1f8riQaR6yg = Y1f8riQaR6yg().e9gEMXR7LXtO(RAsUl2FVSrh6()).Y1f8riQaR6yg(this.wdg6QnbFHrFF);
        Object[] objArr3 = w81Var.lS5Rgt96tfkO;
        long[] jArr3 = w81Var.PxuCJdSBwIXG;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            p92 p92Var = (p92) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            r92 PxuCJdSBwIXG = p92Var.PxuCJdSBwIXG();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            r92 XL4ISE6Oc65B = s72.XL4ISE6Oc65B(PxuCJdSBwIXG, j, q72Var);
                            if (XL4ISE6Oc65B == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                r92 XL4ISE6Oc65B2 = s72.XL4ISE6Oc65B(PxuCJdSBwIXG, RAsUl2FVSrh6(), Y1f8riQaR6yg);
                                if (XL4ISE6Oc65B2 != null && XL4ISE6Oc65B2.PxuCJdSBwIXG != 1 && !XL4ISE6Oc65B.equals(XL4ISE6Oc65B2)) {
                                    q72Var3 = Y1f8riQaR6yg;
                                    r92 XL4ISE6Oc65B3 = s72.XL4ISE6Oc65B(PxuCJdSBwIXG, RAsUl2FVSrh6(), Y1f8riQaR6yg());
                                    if (XL4ISE6Oc65B3 == null) {
                                        s72.BRwzKIf41E4i();
                                        throw null;
                                    }
                                    if (hashMap == null || (lS5Rgt96tfkO = (r92) hashMap.get(XL4ISE6Oc65B)) == null) {
                                        lS5Rgt96tfkO = p92Var.lS5Rgt96tfkO(XL4ISE6Oc65B2, XL4ISE6Oc65B, XL4ISE6Oc65B3);
                                    }
                                    if (lS5Rgt96tfkO == null) {
                                        return new l72(this);
                                    }
                                    if (!lS5Rgt96tfkO.equals(XL4ISE6Oc65B3)) {
                                        if (lS5Rgt96tfkO.equals(XL4ISE6Oc65B)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new vi1(p92Var, XL4ISE6Oc65B.lS5Rgt96tfkO(RAsUl2FVSrh6())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(p92Var);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!lS5Rgt96tfkO.equals(XL4ISE6Oc65B2) ? new vi1(p92Var, lS5Rgt96tfkO) : new vi1(p92Var, XL4ISE6Oc65B2.lS5Rgt96tfkO(RAsUl2FVSrh6())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            q72Var3 = Y1f8riQaR6yg;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            q72Var3 = Y1f8riQaR6yg;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        Y1f8riQaR6yg = q72Var3;
                    }
                    q72Var2 = Y1f8riQaR6yg;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    q72Var2 = Y1f8riQaR6yg;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                Y1f8riQaR6yg = q72Var2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            VhhvGxCb8gfr();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                vi1 vi1Var = (vi1) arrayList3.get(i5);
                p92 p92Var2 = (p92) vi1Var.rtx2ld2ELZv4;
                r92 r92Var = (r92) vi1Var.OPXfSBeufaJ8;
                r92Var.PxuCJdSBwIXG = j;
                synchronized (s72.TSizfFm2Yiuu) {
                    r92Var.lS5Rgt96tfkO = p92Var2.PxuCJdSBwIXG();
                    p92Var2.Y1f8riQaR6yg(r92Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                w81Var.x50lh2ztY7Y5((p92) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.OPXfSBeufaJ8;
            if (arrayList7 != null) {
                arrayList2 = zk.wcHq2YQJmeHg(arrayList7, arrayList2);
            }
            this.OPXfSBeufaJ8 = arrayList2;
        }
        return m72.PxuCJdSBwIXG;
    }

    @Override // defpackage.j72
    public le0 OPXfSBeufaJ8() {
        return this.a92UlCVFR9N8;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xi0 S2OOm9zPNm0h() {
        HashMap hashMap;
        List list;
        w81 w81Var;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        w81 ZbWwgt3aGe7A = ZbWwgt3aGe7A();
        if (ZbWwgt3aGe7A != null) {
            long j3 = s72.wdg6QnbFHrFF.lS5Rgt96tfkO;
            hashMap = s72.PxuCJdSBwIXG(j3, this, s72.Y1f8riQaR6yg.lS5Rgt96tfkO(j3));
        } else {
            hashMap = null;
        }
        p50 p50Var = p50.rtx2ld2ELZv4;
        synchronized (s72.TSizfFm2Yiuu) {
            try {
                s72.lS5Rgt96tfkO(this);
                if (ZbWwgt3aGe7A != null && ZbWwgt3aGe7A.Y1f8riQaR6yg != 0) {
                    wg0 wg0Var = s72.wdg6QnbFHrFF;
                    xi0 IAToe7bXGz4N = IAToe7bXGz4N(s72.e9gEMXR7LXtO, ZbWwgt3aGe7A, hashMap, s72.Y1f8riQaR6yg.lS5Rgt96tfkO(wg0Var.lS5Rgt96tfkO));
                    if (!IAToe7bXGz4N.equals(m72.PxuCJdSBwIXG)) {
                        return IAToe7bXGz4N;
                    }
                    lS5Rgt96tfkO();
                    w81Var = wg0Var.rtx2ld2ELZv4;
                    s72.S9EYkSpbGuxq(wg0Var, s72.PxuCJdSBwIXG);
                    jyegZNwi31qc(null);
                    wg0Var.rtx2ld2ELZv4 = null;
                    list = s72.rtx2ld2ELZv4;
                    this.cpQdD2nAriOS = true;
                    if (w81Var != null) {
                        e02 e02Var = new e02(w81Var);
                        if (!w81Var.RAsUl2FVSrh6()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((pe0) list.get(i2)).rtx2ld2ELZv4(e02Var, this);
                            }
                        }
                    }
                    if (ZbWwgt3aGe7A != null && ZbWwgt3aGe7A.rtx2ld2ELZv4()) {
                        e02 e02Var2 = new e02(ZbWwgt3aGe7A);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((pe0) list.get(i)).rtx2ld2ELZv4(e02Var2, this);
                        }
                    }
                    synchronized (s72.TSizfFm2Yiuu) {
                        try {
                            gPXPFXrUH4XX();
                            s72.e9gEMXR7LXtO();
                            if (w81Var != null) {
                                Object[] objArr = w81Var.lS5Rgt96tfkO;
                                long[] jArr = w81Var.PxuCJdSBwIXG;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    s72.gPXPFXrUH4XX((p92) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (ZbWwgt3aGe7A != null) {
                                        Object[] objArr2 = ZbWwgt3aGe7A.lS5Rgt96tfkO;
                                        long[] jArr2 = ZbWwgt3aGe7A.PxuCJdSBwIXG;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            s72.gPXPFXrUH4XX((p92) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.OPXfSBeufaJ8;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            s72.gPXPFXrUH4XX((p92) arrayList.get(i9));
                                        }
                                    }
                                    this.OPXfSBeufaJ8 = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (ZbWwgt3aGe7A != null) {
                            }
                            arrayList = this.OPXfSBeufaJ8;
                            if (arrayList != null) {
                            }
                            this.OPXfSBeufaJ8 = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return m72.PxuCJdSBwIXG;
                }
                lS5Rgt96tfkO();
                wg0 wg0Var2 = s72.wdg6QnbFHrFF;
                w81 w81Var2 = wg0Var2.rtx2ld2ELZv4;
                s72.S9EYkSpbGuxq(wg0Var2, s72.PxuCJdSBwIXG);
                if (w81Var2 == null || !w81Var2.rtx2ld2ELZv4()) {
                    list = p50Var;
                    w81Var = null;
                } else {
                    list = s72.rtx2ld2ELZv4;
                    w81Var = w81Var2;
                }
                this.cpQdD2nAriOS = true;
                if (w81Var != null) {
                }
                if (ZbWwgt3aGe7A != null) {
                    e02 e02Var22 = new e02(ZbWwgt3aGe7A);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (s72.TSizfFm2Yiuu) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.j72
    public j72 S9EYkSpbGuxq(le0 le0Var) {
        yc1 yc1Var;
        if (this.TSizfFm2Yiuu) {
            gp1.PxuCJdSBwIXG("Cannot use a disposed snapshot");
        }
        if (this.cpQdD2nAriOS && this.Y1f8riQaR6yg < 0) {
            gp1.lS5Rgt96tfkO("Unsupported operation on a disposed or applied snapshot");
        }
        long RAsUl2FVSrh6 = RAsUl2FVSrh6();
        e6tOsSdd2EFb(RAsUl2FVSrh6());
        Object obj = s72.TSizfFm2Yiuu;
        synchronized (obj) {
            long j = s72.e9gEMXR7LXtO;
            s72.e9gEMXR7LXtO = j + 1;
            s72.Y1f8riQaR6yg = s72.Y1f8riQaR6yg.e9gEMXR7LXtO(j);
            yc1Var = new yc1(j, s72.TSizfFm2Yiuu(Y1f8riQaR6yg(), RAsUl2FVSrh6 + 1, j), s72.wdg6QnbFHrFF(le0Var, e9gEMXR7LXtO(), true), this);
        }
        if (this.cpQdD2nAriOS || this.TSizfFm2Yiuu) {
            return yc1Var;
        }
        long RAsUl2FVSrh62 = RAsUl2FVSrh6();
        synchronized (obj) {
            long j2 = s72.e9gEMXR7LXtO;
            s72.e9gEMXR7LXtO = j2 + 1;
            RfyTYNmI9Srp(j2);
            s72.Y1f8riQaR6yg = s72.Y1f8riQaR6yg.e9gEMXR7LXtO(RAsUl2FVSrh6());
        }
        XL4ISE6Oc65B(s72.TSizfFm2Yiuu(Y1f8riQaR6yg(), RAsUl2FVSrh62 + 1, RAsUl2FVSrh6()));
        return yc1Var;
    }

    @Override // defpackage.j72
    public void TSizfFm2Yiuu() {
        if (this.TSizfFm2Yiuu) {
            return;
        }
        this.TSizfFm2Yiuu = true;
        synchronized (s72.TSizfFm2Yiuu) {
            QrzZRwfaDlRX();
        }
        x50lh2ztY7Y5();
    }

    public final void VhhvGxCb8gfr() {
        e6tOsSdd2EFb(RAsUl2FVSrh6());
        if (this.cpQdD2nAriOS || this.TSizfFm2Yiuu) {
            return;
        }
        long RAsUl2FVSrh6 = RAsUl2FVSrh6();
        synchronized (s72.TSizfFm2Yiuu) {
            long j = s72.e9gEMXR7LXtO;
            s72.e9gEMXR7LXtO = j + 1;
            RfyTYNmI9Srp(j);
            s72.Y1f8riQaR6yg = s72.Y1f8riQaR6yg.e9gEMXR7LXtO(RAsUl2FVSrh6());
        }
        XL4ISE6Oc65B(s72.TSizfFm2Yiuu(Y1f8riQaR6yg(), RAsUl2FVSrh6 + 1, RAsUl2FVSrh6()));
    }

    public w81 ZbWwgt3aGe7A() {
        return this.rtx2ld2ELZv4;
    }

    @Override // defpackage.j72
    public boolean a92UlCVFR9N8() {
        return false;
    }

    public b91 aF05bpZJlKEP(le0 le0Var, le0 le0Var2) {
        xc1 xc1Var;
        if (this.TSizfFm2Yiuu) {
            gp1.PxuCJdSBwIXG("Cannot use a disposed snapshot");
        }
        if (this.cpQdD2nAriOS && this.Y1f8riQaR6yg < 0) {
            gp1.lS5Rgt96tfkO("Unsupported operation on a disposed or applied snapshot");
        }
        e6tOsSdd2EFb(RAsUl2FVSrh6());
        Object obj = s72.TSizfFm2Yiuu;
        synchronized (obj) {
            long j = s72.e9gEMXR7LXtO;
            s72.e9gEMXR7LXtO = j + 1;
            s72.Y1f8riQaR6yg = s72.Y1f8riQaR6yg.e9gEMXR7LXtO(j);
            q72 Y1f8riQaR6yg = Y1f8riQaR6yg();
            XL4ISE6Oc65B(Y1f8riQaR6yg.e9gEMXR7LXtO(j));
            xc1Var = new xc1(j, s72.TSizfFm2Yiuu(Y1f8riQaR6yg, RAsUl2FVSrh6() + 1, j), s72.wdg6QnbFHrFF(le0Var, e9gEMXR7LXtO(), true), s72.dgRBjINgWbAK(le0Var2, OPXfSBeufaJ8()), this);
        }
        if (this.cpQdD2nAriOS || this.TSizfFm2Yiuu) {
            return xc1Var;
        }
        long RAsUl2FVSrh6 = RAsUl2FVSrh6();
        synchronized (obj) {
            long j2 = s72.e9gEMXR7LXtO;
            s72.e9gEMXR7LXtO = j2 + 1;
            RfyTYNmI9Srp(j2);
            s72.Y1f8riQaR6yg = s72.Y1f8riQaR6yg.e9gEMXR7LXtO(RAsUl2FVSrh6());
        }
        XL4ISE6Oc65B(s72.TSizfFm2Yiuu(Y1f8riQaR6yg(), RAsUl2FVSrh6 + 1, RAsUl2FVSrh6()));
        return xc1Var;
    }

    @Override // defpackage.j72
    public void cpQdD2nAriOS() {
        if (this.cpQdD2nAriOS || this.TSizfFm2Yiuu) {
            return;
        }
        VhhvGxCb8gfr();
    }

    @Override // defpackage.j72
    public void dgRBjINgWbAK() {
        this.x50lh2ztY7Y5++;
    }

    public final void e6tOsSdd2EFb(long j) {
        synchronized (s72.TSizfFm2Yiuu) {
            this.wdg6QnbFHrFF = this.wdg6QnbFHrFF.e9gEMXR7LXtO(j);
        }
    }

    @Override // defpackage.j72
    public final void gPXPFXrUH4XX() {
        int length = this.dgRBjINgWbAK.length;
        for (int i = 0; i < length; i++) {
            s72.EcgxDIVH5in8(this.dgRBjINgWbAK[i]);
        }
        QrzZRwfaDlRX();
    }

    public void jyegZNwi31qc(w81 w81Var) {
        this.rtx2ld2ELZv4 = w81Var;
    }

    @Override // defpackage.j72
    public final void lS5Rgt96tfkO() {
        s72.Y1f8riQaR6yg = s72.Y1f8riQaR6yg.lS5Rgt96tfkO(RAsUl2FVSrh6()).PxuCJdSBwIXG(this.wdg6QnbFHrFF);
    }

    @Override // defpackage.j72
    /* renamed from: pnx5pC0XzaCw, reason: merged with bridge method [inline-methods] */
    public le0 e9gEMXR7LXtO() {
        return this.e9gEMXR7LXtO;
    }

    @Override // defpackage.j72
    public void r3s1LDPKFs1S(p92 p92Var) {
        w81 ZbWwgt3aGe7A = ZbWwgt3aGe7A();
        if (ZbWwgt3aGe7A == null) {
            w81 w81Var = d02.PxuCJdSBwIXG;
            ZbWwgt3aGe7A = new w81();
            jyegZNwi31qc(ZbWwgt3aGe7A);
        }
        ZbWwgt3aGe7A.PxuCJdSBwIXG(p92Var);
    }

    @Override // defpackage.j72
    public int rtx2ld2ELZv4() {
        return this.RAsUl2FVSrh6;
    }

    @Override // defpackage.j72
    public void x50lh2ztY7Y5() {
        if (this.x50lh2ztY7Y5 <= 0) {
            gp1.PxuCJdSBwIXG("no pending nested snapshots");
        }
        int i = this.x50lh2ztY7Y5 - 1;
        this.x50lh2ztY7Y5 = i;
        if (i != 0 || this.cpQdD2nAriOS) {
            return;
        }
        w81 ZbWwgt3aGe7A = ZbWwgt3aGe7A();
        if (ZbWwgt3aGe7A != null) {
            if (this.cpQdD2nAriOS) {
                gp1.lS5Rgt96tfkO("Unsupported operation on a snapshot that has been applied");
            }
            jyegZNwi31qc(null);
            long RAsUl2FVSrh6 = RAsUl2FVSrh6();
            Object[] objArr = ZbWwgt3aGe7A.lS5Rgt96tfkO;
            long[] jArr = ZbWwgt3aGe7A.PxuCJdSBwIXG;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (r92 PxuCJdSBwIXG = ((p92) objArr[(i2 << 3) + i4]).PxuCJdSBwIXG(); PxuCJdSBwIXG != null; PxuCJdSBwIXG = PxuCJdSBwIXG.lS5Rgt96tfkO) {
                                    long j2 = PxuCJdSBwIXG.PxuCJdSBwIXG;
                                    if (j2 == RAsUl2FVSrh6 || zk.fkblLSN2bAgv(this.wdg6QnbFHrFF, Long.valueOf(j2))) {
                                        vz1 vz1Var = s72.PxuCJdSBwIXG;
                                        PxuCJdSBwIXG.PxuCJdSBwIXG = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        PxuCJdSBwIXG();
    }
}
