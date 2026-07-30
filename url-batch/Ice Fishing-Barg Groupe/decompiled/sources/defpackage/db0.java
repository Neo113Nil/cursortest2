package defpackage;

import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class db0 implements Comparator {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public static final db0 lS5Rgt96tfkO = new db0(0);
    public static final db0 TSizfFm2Yiuu = new db0(1);
    public static final db0 Y1f8riQaR6yg = new db0(2);
    public static final db0 e9gEMXR7LXtO = new db0(3);
    public static final db0 a92UlCVFR9N8 = new db0(4);

    public /* synthetic */ db0(int i) {
        this.PxuCJdSBwIXG = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                ab0 ab0Var = (ab0) obj;
                ab0 ab0Var2 = (ab0) obj2;
                if (zv.BjEWd04qc7Mw(ab0Var) && zv.BjEWd04qc7Mw(ab0Var2)) {
                    vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(ab0Var);
                    vw0 zf8DYfih6EZu2 = zv.zf8DYfih6EZu(ab0Var2);
                    if (!cs0.wdg6QnbFHrFF(zf8DYfih6EZu, zf8DYfih6EZu2)) {
                        vw0[] vw0VarArr = new vw0[16];
                        int i = 0;
                        while (zf8DYfih6EZu != null) {
                            int i2 = i + 1;
                            if (vw0VarArr.length < i2) {
                                int length = vw0VarArr.length;
                                ?? r4 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(vw0VarArr, 0, r4, 0, length);
                                vw0VarArr = r4;
                            }
                            if (i != 0) {
                                System.arraycopy(vw0VarArr, 0, vw0VarArr, 0 + 1, i + 0);
                            }
                            vw0VarArr[0] = zf8DYfih6EZu;
                            i++;
                            zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                        }
                        vw0[] vw0VarArr2 = new vw0[16];
                        int i3 = 0;
                        while (zf8DYfih6EZu2 != null) {
                            int i4 = i3 + 1;
                            if (vw0VarArr2.length < i4) {
                                int length2 = vw0VarArr2.length;
                                ?? r42 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(vw0VarArr2, 0, r42, 0, length2);
                                vw0VarArr2 = r42;
                            }
                            if (i3 != 0) {
                                System.arraycopy(vw0VarArr2, 0, vw0VarArr2, 0 + 1, i3 + 0);
                            }
                            vw0VarArr2[0] = zf8DYfih6EZu2;
                            i3++;
                            zf8DYfih6EZu2 = zf8DYfih6EZu2.S9EYkSpbGuxq();
                        }
                        int min = Math.min(i - 1, i3 - 1);
                        if (min >= 0) {
                            int i5 = 0;
                            while (cs0.wdg6QnbFHrFF(vw0VarArr[i5], vw0VarArr2[i5])) {
                                if (i5 != min) {
                                    i5++;
                                }
                            }
                            return cs0.gPXPFXrUH4XX(vw0VarArr[i5].VhhvGxCb8gfr(), vw0VarArr2[i5].VhhvGxCb8gfr());
                        }
                        u9.rtx2ld2ELZv4("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (zv.BjEWd04qc7Mw(ab0Var)) {
                        return -1;
                    }
                    if (zv.BjEWd04qc7Mw(ab0Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                qt1 rtx2ld2ELZv4 = ((d32) obj).rtx2ld2ELZv4();
                qt1 rtx2ld2ELZv42 = ((d32) obj2).rtx2ld2ELZv4();
                int compare = Float.compare(rtx2ld2ELZv4.PxuCJdSBwIXG, rtx2ld2ELZv42.PxuCJdSBwIXG);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(rtx2ld2ELZv4.lS5Rgt96tfkO, rtx2ld2ELZv42.lS5Rgt96tfkO);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(rtx2ld2ELZv4.Y1f8riQaR6yg, rtx2ld2ELZv42.Y1f8riQaR6yg);
                return compare3 != 0 ? compare3 : Float.compare(rtx2ld2ELZv4.TSizfFm2Yiuu, rtx2ld2ELZv42.TSizfFm2Yiuu);
            case 2:
                vw0 vw0Var = (vw0) obj;
                vw0 vw0Var2 = (vw0) obj2;
                int gPXPFXrUH4XX = cs0.gPXPFXrUH4XX(vw0Var2.VhhvGxCb8gfr, vw0Var.VhhvGxCb8gfr);
                return gPXPFXrUH4XX != 0 ? gPXPFXrUH4XX : cs0.gPXPFXrUH4XX(vw0Var.hashCode(), vw0Var2.hashCode());
            case 3:
                qt1 rtx2ld2ELZv43 = ((d32) obj).rtx2ld2ELZv4();
                qt1 rtx2ld2ELZv44 = ((d32) obj2).rtx2ld2ELZv4();
                int compare4 = Float.compare(rtx2ld2ELZv44.TSizfFm2Yiuu, rtx2ld2ELZv43.TSizfFm2Yiuu);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(rtx2ld2ELZv43.lS5Rgt96tfkO, rtx2ld2ELZv44.lS5Rgt96tfkO);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(rtx2ld2ELZv43.Y1f8riQaR6yg, rtx2ld2ELZv44.Y1f8riQaR6yg);
                return compare6 != 0 ? compare6 : Float.compare(rtx2ld2ELZv44.PxuCJdSBwIXG, rtx2ld2ELZv43.PxuCJdSBwIXG);
            case 4:
                vi1 vi1Var = (vi1) obj;
                vi1 vi1Var2 = (vi1) obj2;
                int compare7 = Float.compare(((qt1) vi1Var.rtx2ld2ELZv4).lS5Rgt96tfkO, ((qt1) vi1Var2.rtx2ld2ELZv4).lS5Rgt96tfkO);
                return compare7 != 0 ? compare7 : Float.compare(((qt1) vi1Var.rtx2ld2ELZv4).Y1f8riQaR6yg, ((qt1) vi1Var2.rtx2ld2ELZv4).Y1f8riQaR6yg);
            case 5:
                return zv.QrzZRwfaDlRX(Integer.valueOf(((u8) obj).lS5Rgt96tfkO), Integer.valueOf(((u8) obj2).lS5Rgt96tfkO));
            case 6:
                return zv.QrzZRwfaDlRX(Integer.valueOf(((u8) obj).lS5Rgt96tfkO), Integer.valueOf(((u8) obj2).lS5Rgt96tfkO));
            case 7:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min2 = Math.min(str.length(), str2.length());
                int i6 = 4;
                while (true) {
                    if (i6 >= min2) {
                        int length3 = str.length();
                        int length4 = str2.length();
                        if (length3 == length4) {
                            return 0;
                        }
                        if (length3 >= length4) {
                            return 1;
                        }
                    } else {
                        char charAt = str.charAt(i6);
                        char charAt2 = str2.charAt(i6);
                        if (charAt == charAt2) {
                            i6++;
                        } else if (cs0.gPXPFXrUH4XX(charAt, charAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 8:
                vw0 vw0Var3 = (vw0) obj;
                vw0 vw0Var4 = (vw0) obj2;
                int gPXPFXrUH4XX2 = cs0.gPXPFXrUH4XX(vw0Var3.VhhvGxCb8gfr, vw0Var4.VhhvGxCb8gfr);
                return gPXPFXrUH4XX2 != 0 ? gPXPFXrUH4XX2 : cs0.gPXPFXrUH4XX(vw0Var3.hashCode(), vw0Var4.hashCode());
            case 9:
                return zv.QrzZRwfaDlRX(((qs0) obj).lS5Rgt96tfkO, ((qs0) obj2).lS5Rgt96tfkO);
            case 10:
                return zv.QrzZRwfaDlRX((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 11:
                return zv.QrzZRwfaDlRX((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 12:
                return zv.QrzZRwfaDlRX(((ad2) obj).PxuCJdSBwIXG, ((ad2) obj2).PxuCJdSBwIXG);
            default:
                return zv.QrzZRwfaDlRX(((ed2) obj).PxuCJdSBwIXG, ((ed2) obj2).PxuCJdSBwIXG);
        }
    }
}
