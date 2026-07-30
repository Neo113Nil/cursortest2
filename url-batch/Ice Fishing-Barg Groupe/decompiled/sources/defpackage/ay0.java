package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ay0 {
    public final n61 OPXfSBeufaJ8;
    public final v81 PxuCJdSBwIXG;
    public final ArrayList RAsUl2FVSrh6;
    public final w81 TSizfFm2Yiuu;
    public final ArrayList Y1f8riQaR6yg;
    public final ArrayList a92UlCVFR9N8;
    public final ArrayList e9gEMXR7LXtO;
    public x3 lS5Rgt96tfkO;
    public final ArrayList rtx2ld2ELZv4;

    public ay0() {
        long[] jArr = c02.PxuCJdSBwIXG;
        this.PxuCJdSBwIXG = new v81();
        w81 w81Var = d02.PxuCJdSBwIXG;
        this.TSizfFm2Yiuu = new w81();
        this.Y1f8riQaR6yg = new ArrayList();
        this.e9gEMXR7LXtO = new ArrayList();
        this.a92UlCVFR9N8 = new ArrayList();
        this.RAsUl2FVSrh6 = new ArrayList();
        this.rtx2ld2ELZv4 = new ArrayList();
        this.OPXfSBeufaJ8 = new xx0(this);
    }

    public static int e9gEMXR7LXtO(int[] iArr, fz0 fz0Var) {
        fz0Var.getClass();
        int i = iArr[0] + fz0Var.x50lh2ztY7Y5;
        iArr[0] = i;
        return Math.max(0, i);
    }

    public final long PxuCJdSBwIXG() {
        ir0.Companion.getClass();
        ArrayList arrayList = this.rtx2ld2ELZv4;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        o0.ZbWwgt3aGe7A(arrayList.get(0));
        throw null;
    }

    public final void TSizfFm2Yiuu() {
        v81 v81Var = this.PxuCJdSBwIXG;
        if (v81Var.wdg6QnbFHrFF()) {
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
                            if ((255 & j) < 128) {
                                o0.ZbWwgt3aGe7A(objArr[(i << 3) + i3]);
                                throw null;
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
            v81Var.PxuCJdSBwIXG();
        }
    }

    public final void Y1f8riQaR6yg(fz0 fz0Var, boolean z) {
        Object RAsUl2FVSrh6 = this.PxuCJdSBwIXG.RAsUl2FVSrh6(fz0Var.RAsUl2FVSrh6);
        RAsUl2FVSrh6.getClass();
        o0.ZbWwgt3aGe7A(RAsUl2FVSrh6);
        throw null;
    }

    public final void lS5Rgt96tfkO(int i, int i2, ArrayList arrayList, x3 x3Var, cz0 cz0Var, boolean z, boolean z2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        w81 w81Var;
        x3 x3Var2 = this.lS5Rgt96tfkO;
        this.lS5Rgt96tfkO = x3Var;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            fz0 fz0Var = (fz0) arrayList.get(i11);
            int size2 = fz0Var.lS5Rgt96tfkO.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((em1) fz0Var.lS5Rgt96tfkO.get(i12)).wdg6QnbFHrFF();
            }
        }
        v81 v81Var = this.PxuCJdSBwIXG;
        if (v81Var.OPXfSBeufaJ8()) {
            TSizfFm2Yiuu();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr = v81Var.lS5Rgt96tfkO;
        long[] jArr = v81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        w81 w81Var2 = this.TSizfFm2Yiuu;
        int i13 = 8;
        boolean z4 = z3;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j = jArr[i14];
                w81 w81Var3 = w81Var2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    long j2 = j;
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j2 & 255) < 128) {
                            w81Var = w81Var3;
                            w81Var.PxuCJdSBwIXG(objArr[(i14 << 3) + i16]);
                        } else {
                            w81Var = w81Var3;
                        }
                        j2 >>= 8;
                        i16++;
                        w81Var3 = w81Var;
                    }
                    w81Var2 = w81Var3;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    w81Var2 = w81Var3;
                }
                if (i14 == length) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        int size3 = arrayList.size();
        for (int i17 = 0; i17 < size3; i17++) {
            fz0 fz0Var2 = (fz0) arrayList.get(i17);
            Object obj = fz0Var2.RAsUl2FVSrh6;
            List list = fz0Var2.lS5Rgt96tfkO;
            w81Var2.x50lh2ztY7Y5(obj);
            int size4 = list.size();
            for (int i18 = 0; i18 < size4; i18++) {
                ((em1) list.get(i18)).wdg6QnbFHrFF();
            }
            o0.ZbWwgt3aGe7A(v81Var.dgRBjINgWbAK(fz0Var2.RAsUl2FVSrh6));
        }
        int[] iArr = new int[1];
        ArrayList arrayList2 = this.e9gEMXR7LXtO;
        ArrayList arrayList3 = this.Y1f8riQaR6yg;
        if (z4 && x3Var2 != null) {
            if (arrayList3.isEmpty()) {
                i10 = 0;
            } else {
                if (arrayList3.size() > 1) {
                    dl.Y2PHjkwWz56c(arrayList3, new zx0(x3Var2, 2));
                }
                if (arrayList3.size() > 0) {
                    fz0 fz0Var3 = (fz0) arrayList3.get(0);
                    e9gEMXR7LXtO(iArr, fz0Var3);
                    Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(fz0Var3.RAsUl2FVSrh6);
                    RAsUl2FVSrh6.getClass();
                    o0.ZbWwgt3aGe7A(RAsUl2FVSrh6);
                    fz0Var3.PxuCJdSBwIXG(0);
                    throw null;
                }
                i10 = 0;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    dl.Y2PHjkwWz56c(arrayList2, new zx0(x3Var2, i10));
                }
                if (arrayList2.size() > 0) {
                    fz0 fz0Var4 = (fz0) arrayList2.get(i10);
                    e9gEMXR7LXtO(iArr, fz0Var4);
                    Object RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6(fz0Var4.RAsUl2FVSrh6);
                    RAsUl2FVSrh62.getClass();
                    o0.ZbWwgt3aGe7A(RAsUl2FVSrh62);
                    fz0Var4.PxuCJdSBwIXG(i10);
                    throw null;
                }
                Arrays.fill(iArr, i10, 1, i10);
            }
        }
        Object[] objArr2 = w81Var2.lS5Rgt96tfkO;
        long[] jArr2 = w81Var2.PxuCJdSBwIXG;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j3 = jArr2[i19];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j3 & 255) < 128) {
                            i9 = i13;
                            o0.ZbWwgt3aGe7A(v81Var.RAsUl2FVSrh6(objArr2[(i19 << 3) + i21]));
                        } else {
                            i9 = i13;
                        }
                        j3 >>= i9;
                        i21++;
                        i13 = i9;
                    }
                    i8 = i13;
                    if (i20 != i8) {
                        break;
                    }
                } else {
                    i8 = i13;
                }
                if (i19 == length2) {
                    break;
                }
                i19++;
                i13 = i8;
            }
        }
        ArrayList arrayList4 = this.a92UlCVFR9N8;
        if (arrayList4.isEmpty()) {
            i5 = i;
            i6 = i2;
            i7 = 1;
        } else {
            if (arrayList4.size() > 1) {
                dl.Y2PHjkwWz56c(arrayList4, new zx0(x3Var, 3));
            }
            int size5 = arrayList4.size();
            for (int i22 = 0; i22 < size5; i22++) {
                fz0 fz0Var5 = (fz0) arrayList4.get(i22);
                Object RAsUl2FVSrh63 = v81Var.RAsUl2FVSrh6(fz0Var5.RAsUl2FVSrh6);
                RAsUl2FVSrh63.getClass();
                o0.ZbWwgt3aGe7A(RAsUl2FVSrh63);
                fz0Var5.TSizfFm2Yiuu((z ? (int) (4294967295L & ((fz0) zk.MDTGUQSX7PXD(arrayList)).PxuCJdSBwIXG(0)) : 0) - e9gEMXR7LXtO(iArr, fz0Var5), i, i2);
                if (z4) {
                    Y1f8riQaR6yg(fz0Var5, true);
                    throw null;
                }
            }
            i5 = i;
            i6 = i2;
            i7 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        ArrayList arrayList5 = this.RAsUl2FVSrh6;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i7) {
                dl.Y2PHjkwWz56c(arrayList5, new zx0(x3Var, i7));
            }
            int size6 = arrayList5.size();
            for (int i23 = 0; i23 < size6; i23++) {
                fz0 fz0Var6 = (fz0) arrayList5.get(i23);
                Object RAsUl2FVSrh64 = v81Var.RAsUl2FVSrh6(fz0Var6.RAsUl2FVSrh6);
                RAsUl2FVSrh64.getClass();
                o0.ZbWwgt3aGe7A(RAsUl2FVSrh64);
                fz0Var6.TSizfFm2Yiuu((0 - fz0Var6.x50lh2ztY7Y5) + e9gEMXR7LXtO(iArr, fz0Var6), i5, i6);
                if (z4) {
                    Y1f8riQaR6yg(fz0Var6, true);
                    throw null;
                }
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        w81Var2.lS5Rgt96tfkO();
    }
}
