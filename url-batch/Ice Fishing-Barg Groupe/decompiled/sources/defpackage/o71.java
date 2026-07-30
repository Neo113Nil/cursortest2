package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o71 implements j51 {
    public final x90 PxuCJdSBwIXG;

    public o71(x90 x90Var) {
        this.PxuCJdSBwIXG = x90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0218 A[SYNTHETIC] */
    @Override // defpackage.j51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OPXfSBeufaJ8(vr0 vr0Var, List list, int i) {
        int[] iArr;
        long j;
        List list2;
        long PxuCJdSBwIXG;
        e51 e51Var;
        int i2;
        qq0 qq0Var;
        ArrayList e6tOsSdd2EFb = xi0.e6tOsSdd2EFb(vr0Var);
        x90 x90Var = this.PxuCJdSBwIXG;
        v90 v90Var = x90Var.a92UlCVFR9N8;
        int i3 = 1;
        List list3 = (List) zk.qYgDo2Ye5PY7(1, e6tOsSdd2EFb);
        e51 e51Var2 = list3 != null ? (e51) zk.FT2GK7JK5Ma2(list3) : null;
        List list4 = (List) zk.qYgDo2Ye5PY7(2, e6tOsSdd2EFb);
        v90Var.PxuCJdSBwIXG(e51Var2, list4 != null ? (e51) zk.FT2GK7JK5Ma2(list4) : null, sr.lS5Rgt96tfkO(0, 0, 0, i, 7));
        List list5 = (List) zk.FT2GK7JK5Ma2(e6tOsSdd2EFb);
        if (list5 == null) {
            list5 = p50.rtx2ld2ELZv4;
        }
        int POWyO8hTM6YC = vr0Var.POWyO8hTM6YC(x90Var.TSizfFm2Yiuu);
        int POWyO8hTM6YC2 = vr0Var.POWyO8hTM6YC(x90Var.e9gEMXR7LXtO);
        v90 v90Var2 = x90Var.a92UlCVFR9N8;
        long PxuCJdSBwIXG2 = qq0.PxuCJdSBwIXG(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i4 = 0; i4 < size3; i4++) {
            e51 e51Var3 = (e51) list5.get(i4);
            int i68hK7ahKtgp = e51Var3.i68hK7ahKtgp(i);
            iArr2[i4] = i68hK7ahKtgp;
            iArr3[i4] = e51Var3.ngxnMNrpiKat(i68hK7ahKtgp);
        }
        int i5 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE < list5.size()) {
            v90Var2.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            v90Var2.getClass();
        }
        int min = Math.min(Integer.MAX_VALUE, list5.size());
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += iArr2[i7];
        }
        int size4 = ((list5.size() - 1) * POWyO8hTM6YC) + i6;
        if (size2 == 0) {
            u9.RfyTYNmI9Srp();
            return 0;
        }
        int i8 = iArr3[0];
        int i9 = size2 - 1;
        int i10 = 0;
        if (1 <= i9) {
            int i11 = 1;
            while (true) {
                int i12 = iArr3[i11];
                if (i8 < i12) {
                    i8 = i12;
                }
                if (i11 == i9) {
                    break;
                }
                i11++;
            }
        }
        if (size == 0) {
            u9.RfyTYNmI9Srp();
            return 0;
        }
        int i13 = iArr2[0];
        int i14 = size - 1;
        if (1 <= i14) {
            int i15 = 1;
            while (true) {
                int i16 = iArr2[i15];
                if (i13 < i16) {
                    i13 = i16;
                }
                if (i15 == i14) {
                    break;
                }
                i15++;
            }
        }
        int i17 = size4;
        while (i13 <= i17 && i8 != i) {
            int i18 = (i13 + i17) / 2;
            if (list5.isEmpty()) {
                list2 = list5;
                j = PxuCJdSBwIXG2;
                iArr = iArr2;
            } else {
                int i19 = i10;
                o90 o90Var = new o90(v90Var2, sr.PxuCJdSBwIXG(i19, i18, i19, i5), POWyO8hTM6YC, POWyO8hTM6YC2);
                e51 e51Var4 = (e51) zk.qYgDo2Ye5PY7(i19, list5);
                int i20 = e51Var4 != null ? iArr3[i19] : i19;
                int i21 = e51Var4 != null ? iArr2[i19] : 0;
                iArr = iArr2;
                int i22 = 0;
                if (o90Var.lS5Rgt96tfkO(list5.size() > i3 ? i3 : 0, 0, qq0.PxuCJdSBwIXG(i18, Integer.MAX_VALUE), e51Var4 == null ? null : new qq0(qq0.PxuCJdSBwIXG(i21, i20)), 0, 0, 0, false, false).lS5Rgt96tfkO) {
                    v90Var2.getClass();
                    list2 = list5;
                    j = PxuCJdSBwIXG2;
                } else {
                    int size5 = list5.size();
                    j = PxuCJdSBwIXG2;
                    int i23 = i18;
                    int i24 = i21;
                    int i25 = i20;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    while (true) {
                        if (i28 >= size5) {
                            list2 = list5;
                            break;
                        }
                        int i31 = i23 - i24;
                        i30 = i28 + 1;
                        int max = Math.max(i27, i25);
                        e51 e51Var5 = (e51) zk.qYgDo2Ye5PY7(i30, list5);
                        i25 = e51Var5 != null ? iArr3[i30] : 0;
                        i24 = e51Var5 != null ? iArr[i30] + POWyO8hTM6YC : 0;
                        list2 = list5;
                        boolean z = i28 + 2 < list2.size();
                        int i32 = i30 - i29;
                        int i33 = i26;
                        long PxuCJdSBwIXG3 = qq0.PxuCJdSBwIXG(i31, Integer.MAX_VALUE);
                        if (e51Var5 == null) {
                            e51Var = e51Var5;
                            i2 = i31;
                            qq0Var = null;
                        } else {
                            e51Var = e51Var5;
                            i2 = i31;
                            qq0Var = new qq0(qq0.PxuCJdSBwIXG(i24, i25));
                        }
                        n90 lS5Rgt96tfkO = o90Var.lS5Rgt96tfkO(z, i32, PxuCJdSBwIXG3, qq0Var, i33, i22, max, false, false);
                        if (lS5Rgt96tfkO.PxuCJdSBwIXG) {
                            int i34 = max + POWyO8hTM6YC2 + i22;
                            o90Var.PxuCJdSBwIXG(lS5Rgt96tfkO, e51Var != null, i33, i34, i2, i32);
                            i24 -= POWyO8hTM6YC;
                            i26 = i33 + 1;
                            if (lS5Rgt96tfkO.lS5Rgt96tfkO) {
                                i22 = i34;
                                break;
                            }
                            i23 = i18;
                            i29 = i30;
                            i22 = i34;
                            i27 = 0;
                        } else {
                            i26 = i33;
                            i27 = max;
                            i23 = i2;
                        }
                        i28 = i30;
                        list5 = list2;
                    }
                    PxuCJdSBwIXG = qq0.PxuCJdSBwIXG(i22 - POWyO8hTM6YC2, i30);
                    i8 = (int) (PxuCJdSBwIXG >> 32);
                    int i35 = (int) (PxuCJdSBwIXG & 4294967295L);
                    if (i8 <= i || i35 < min) {
                        i13 = i18 + 1;
                        if (i13 <= i17) {
                            return i13;
                        }
                    } else {
                        if (i8 >= i) {
                            return i18;
                        }
                        i17 = i18 - 1;
                    }
                    size4 = i18;
                    iArr2 = iArr;
                    PxuCJdSBwIXG2 = j;
                    list5 = list2;
                    i3 = 1;
                    i5 = Integer.MAX_VALUE;
                    i10 = 0;
                }
            }
            PxuCJdSBwIXG = j;
            i8 = (int) (PxuCJdSBwIXG >> 32);
            int i352 = (int) (PxuCJdSBwIXG & 4294967295L);
            if (i8 <= i) {
            }
            i13 = i18 + 1;
            if (i13 <= i17) {
            }
        }
        return size4;
    }

    @Override // defpackage.j51
    public final int PxuCJdSBwIXG(vr0 vr0Var, List list, int i) {
        ArrayList e6tOsSdd2EFb = xi0.e6tOsSdd2EFb(vr0Var);
        x90 x90Var = this.PxuCJdSBwIXG;
        v90 v90Var = x90Var.a92UlCVFR9N8;
        List list2 = (List) zk.qYgDo2Ye5PY7(1, e6tOsSdd2EFb);
        e51 e51Var = list2 != null ? (e51) zk.FT2GK7JK5Ma2(list2) : null;
        List list3 = (List) zk.qYgDo2Ye5PY7(2, e6tOsSdd2EFb);
        v90Var.PxuCJdSBwIXG(e51Var, list3 != null ? (e51) zk.FT2GK7JK5Ma2(list3) : null, sr.lS5Rgt96tfkO(0, i, 0, 0, 13));
        List list4 = (List) zk.FT2GK7JK5Ma2(e6tOsSdd2EFb);
        if (list4 == null) {
            list4 = p50.rtx2ld2ELZv4;
        }
        return x90.PxuCJdSBwIXG(list4, i, vr0Var.POWyO8hTM6YC(x90Var.TSizfFm2Yiuu), vr0Var.POWyO8hTM6YC(x90Var.e9gEMXR7LXtO), x90Var.a92UlCVFR9N8);
    }

    @Override // defpackage.j51
    public final int RAsUl2FVSrh6(vr0 vr0Var, List list, int i) {
        ArrayList e6tOsSdd2EFb = xi0.e6tOsSdd2EFb(vr0Var);
        x90 x90Var = this.PxuCJdSBwIXG;
        v90 v90Var = x90Var.a92UlCVFR9N8;
        List list2 = (List) zk.qYgDo2Ye5PY7(1, e6tOsSdd2EFb);
        e51 e51Var = list2 != null ? (e51) zk.FT2GK7JK5Ma2(list2) : null;
        List list3 = (List) zk.qYgDo2Ye5PY7(2, e6tOsSdd2EFb);
        v90Var.PxuCJdSBwIXG(e51Var, list3 != null ? (e51) zk.FT2GK7JK5Ma2(list3) : null, sr.lS5Rgt96tfkO(0, i, 0, 0, 13));
        List list4 = (List) zk.FT2GK7JK5Ma2(e6tOsSdd2EFb);
        if (list4 == null) {
            list4 = p50.rtx2ld2ELZv4;
        }
        return x90.PxuCJdSBwIXG(list4, i, vr0Var.POWyO8hTM6YC(x90Var.TSizfFm2Yiuu), vr0Var.POWyO8hTM6YC(x90Var.e9gEMXR7LXtO), x90Var.a92UlCVFR9N8);
    }

    @Override // defpackage.j51
    public final int TSizfFm2Yiuu(vr0 vr0Var, List list, int i) {
        ArrayList e6tOsSdd2EFb = xi0.e6tOsSdd2EFb(vr0Var);
        x90 x90Var = this.PxuCJdSBwIXG;
        v90 v90Var = x90Var.a92UlCVFR9N8;
        List list2 = (List) zk.qYgDo2Ye5PY7(1, e6tOsSdd2EFb);
        e51 e51Var = list2 != null ? (e51) zk.FT2GK7JK5Ma2(list2) : null;
        List list3 = (List) zk.qYgDo2Ye5PY7(2, e6tOsSdd2EFb);
        v90Var.PxuCJdSBwIXG(e51Var, list3 != null ? (e51) zk.FT2GK7JK5Ma2(list3) : null, sr.lS5Rgt96tfkO(0, 0, 0, i, 7));
        List list4 = (List) zk.FT2GK7JK5Ma2(e6tOsSdd2EFb);
        if (list4 == null) {
            list4 = p50.rtx2ld2ELZv4;
        }
        int POWyO8hTM6YC = vr0Var.POWyO8hTM6YC(x90Var.TSizfFm2Yiuu);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int IXK6ba3ucyzm = ((e51) list4.get(i2)).IXK6ba3ucyzm(i) + POWyO8hTM6YC;
            int i6 = i2 + 1;
            if (i6 - i4 == Integer.MAX_VALUE || i6 == list4.size()) {
                i3 = Math.max(i3, (i5 + IXK6ba3ucyzm) - POWyO8hTM6YC);
                i4 = i2;
                i5 = 0;
            } else {
                i5 += IXK6ba3ucyzm;
            }
            i2 = i6;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0350 A[LOOP:1: B:99:0x034e->B:100:0x0350, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0216  */
    @Override // defpackage.j51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k51 a92UlCVFR9N8(l51 l51Var, List list, long j) {
        e51 e51Var;
        long j2;
        em1 em1Var;
        qq0 qq0Var;
        em1 em1Var2;
        Integer valueOf;
        Integer valueOf2;
        o90 o90Var;
        n90 lS5Rgt96tfkO;
        n90 n90Var;
        e51 e51Var2;
        int i;
        n90 n90Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int size;
        int i11;
        int i12;
        int i13;
        int i14;
        int POWyO8hTM6YC;
        int OPXfSBeufaJ8;
        int RAsUl2FVSrh6;
        int wdg6QnbFHrFF;
        int rtx2ld2ELZv4;
        int i15;
        char c;
        int[] iArr;
        e51 e51Var3;
        e51 e51Var4;
        int i16;
        em1 em1Var3;
        qq0 qq0Var2;
        int i17;
        Integer num;
        qq0 qq0Var3;
        n90 lS5Rgt96tfkO2;
        n90 n90Var3;
        int i18;
        long PxuCJdSBwIXG;
        em1 em1Var4;
        long PxuCJdSBwIXG2;
        em1 em1Var5;
        ArrayList e6tOsSdd2EFb = xi0.e6tOsSdd2EFb(l51Var);
        final x90 x90Var = this.PxuCJdSBwIXG;
        final v90 v90Var = x90Var.a92UlCVFR9N8;
        boolean isEmpty = e6tOsSdd2EFb.isEmpty();
        q50 q50Var = q50.rtx2ld2ELZv4;
        final int i19 = 0;
        if (!isEmpty) {
            if (rr.RAsUl2FVSrh6(j) != 0) {
                List list2 = (List) zk.MDTGUQSX7PXD(e6tOsSdd2EFb);
                if (list2.isEmpty()) {
                    return l51Var.jJwa0q7P5wHq(0, 0, q50Var, new wnqUPcAvl7HT(5));
                }
                List list3 = (List) zk.qYgDo2Ye5PY7(1, e6tOsSdd2EFb);
                e51 e51Var5 = list3 != null ? (e51) zk.FT2GK7JK5Ma2(list3) : null;
                List list4 = (List) zk.qYgDo2Ye5PY7(2, e6tOsSdd2EFb);
                e51 e51Var6 = list4 != null ? (e51) zk.FT2GK7JK5Ma2(list4) : null;
                list2.size();
                v90Var.getClass();
                kx0 kx0Var = kx0.rtx2ld2ELZv4;
                long ozEBbv0hFTAB = jh0.ozEBbv0hFTAB(jh0.gPXPFXrUH4XX(10, jh0.QrzZRwfaDlRX(j, kx0Var)));
                if (e51Var5 != null) {
                    s90.TSizfFm2Yiuu(e51Var5, x90Var, ozEBbv0hFTAB, new le0() { // from class: u90
                        @Override // defpackage.le0
                        public final Object OPXfSBeufaJ8(Object obj) {
                            int i20;
                            int i21;
                            int i22 = i19;
                            no2 no2Var = no2.PxuCJdSBwIXG;
                            int i23 = 0;
                            x90 x90Var2 = x90Var;
                            v90 v90Var2 = v90Var;
                            em1 em1Var6 = (em1) obj;
                            switch (i22) {
                                case 0:
                                    if (em1Var6 != null) {
                                        x90Var2.getClass();
                                        i23 = em1Var6.JTxCbbCwomzt();
                                        i20 = em1Var6.D0aTLcX6Uhyo();
                                    } else {
                                        i20 = 0;
                                    }
                                    new qq0(qq0.PxuCJdSBwIXG(i23, i20));
                                    v90Var2.getClass();
                                    break;
                                default:
                                    if (em1Var6 != null) {
                                        x90Var2.getClass();
                                        i23 = em1Var6.JTxCbbCwomzt();
                                        i21 = em1Var6.D0aTLcX6Uhyo();
                                    } else {
                                        i21 = 0;
                                    }
                                    new qq0(qq0.PxuCJdSBwIXG(i23, i21));
                                    v90Var2.getClass();
                                    break;
                            }
                            return no2Var;
                        }
                    });
                }
                if (e51Var6 != null) {
                    final int i20 = 1;
                    s90.TSizfFm2Yiuu(e51Var6, x90Var, ozEBbv0hFTAB, new le0() { // from class: u90
                        @Override // defpackage.le0
                        public final Object OPXfSBeufaJ8(Object obj) {
                            int i202;
                            int i21;
                            int i22 = i20;
                            no2 no2Var = no2.PxuCJdSBwIXG;
                            int i23 = 0;
                            x90 x90Var2 = x90Var;
                            v90 v90Var2 = v90Var;
                            em1 em1Var6 = (em1) obj;
                            switch (i22) {
                                case 0:
                                    if (em1Var6 != null) {
                                        x90Var2.getClass();
                                        i23 = em1Var6.JTxCbbCwomzt();
                                        i202 = em1Var6.D0aTLcX6Uhyo();
                                    } else {
                                        i202 = 0;
                                    }
                                    new qq0(qq0.PxuCJdSBwIXG(i23, i202));
                                    v90Var2.getClass();
                                    break;
                                default:
                                    if (em1Var6 != null) {
                                        x90Var2.getClass();
                                        i23 = em1Var6.JTxCbbCwomzt();
                                        i21 = em1Var6.D0aTLcX6Uhyo();
                                    } else {
                                        i21 = 0;
                                    }
                                    new qq0(qq0.PxuCJdSBwIXG(i23, i21));
                                    v90Var2.getClass();
                                    break;
                            }
                            return no2Var;
                        }
                    });
                }
                Iterator it = list2.iterator();
                float f = x90Var.TSizfFm2Yiuu;
                float f2 = x90Var.e9gEMXR7LXtO;
                long QrzZRwfaDlRX = jh0.QrzZRwfaDlRX(j, kx0Var);
                v90 v90Var2 = x90Var.a92UlCVFR9N8;
                f91 f91Var = new f91(new k51[16]);
                int rtx2ld2ELZv42 = rr.rtx2ld2ELZv4(QrzZRwfaDlRX);
                int wdg6QnbFHrFF2 = rr.wdg6QnbFHrFF(QrzZRwfaDlRX);
                int RAsUl2FVSrh62 = rr.RAsUl2FVSrh6(QrzZRwfaDlRX);
                c81 c81Var = uq0.PxuCJdSBwIXG;
                c81 c81Var2 = new c81();
                ArrayList arrayList = new ArrayList();
                int ceil = (int) Math.ceil(l51Var.e6tOsSdd2EFb(f));
                int ceil2 = (int) Math.ceil(l51Var.e6tOsSdd2EFb(f2));
                long PxuCJdSBwIXG3 = sr.PxuCJdSBwIXG(0, rtx2ld2ELZv42, 0, RAsUl2FVSrh62);
                long ozEBbv0hFTAB2 = jh0.ozEBbv0hFTAB(jh0.gPXPFXrUH4XX(14, PxuCJdSBwIXG3));
                if (it.hasNext()) {
                    int i21 = s90.PxuCJdSBwIXG;
                    try {
                        e51Var = (e51) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                    }
                    if (e51Var == null) {
                        if (vi0.rZjpSjn4zoMv(vi0.pnx5pC0XzaCw(e51Var)) == 0.0f) {
                            vi0.pnx5pC0XzaCw(e51Var);
                            em1Var5 = e51Var.e9gEMXR7LXtO(ozEBbv0hFTAB2);
                            j2 = PxuCJdSBwIXG3;
                            PxuCJdSBwIXG2 = qq0.PxuCJdSBwIXG(em1Var5.JTxCbbCwomzt(), em1Var5.D0aTLcX6Uhyo());
                        } else {
                            j2 = PxuCJdSBwIXG3;
                            int i68hK7ahKtgp = e51Var.i68hK7ahKtgp(Integer.MAX_VALUE);
                            PxuCJdSBwIXG2 = qq0.PxuCJdSBwIXG(i68hK7ahKtgp, e51Var.ngxnMNrpiKat(i68hK7ahKtgp));
                            em1Var5 = null;
                        }
                        qq0Var = new qq0(PxuCJdSBwIXG2);
                        em1Var = em1Var5;
                    } else {
                        j2 = PxuCJdSBwIXG3;
                        em1Var = null;
                        qq0Var = null;
                    }
                    em1Var2 = em1Var;
                    valueOf = qq0Var == null ? Integer.valueOf((int) (qq0Var.PxuCJdSBwIXG >> 32)) : null;
                    valueOf2 = qq0Var == null ? Integer.valueOf((int) (qq0Var.PxuCJdSBwIXG & 4294967295L)) : null;
                    int[] iArr2 = new int[16];
                    int[] iArr3 = new int[16];
                    qq0 qq0Var4 = qq0Var;
                    d81 d81Var = new d81();
                    o90Var = new o90(v90Var2, QrzZRwfaDlRX, ceil, ceil2);
                    lS5Rgt96tfkO = o90Var.lS5Rgt96tfkO(it.hasNext(), 0, qq0.PxuCJdSBwIXG(rtx2ld2ELZv42, RAsUl2FVSrh62), qq0Var4, 0, 0, 0, false, false);
                    if (lS5Rgt96tfkO.lS5Rgt96tfkO) {
                        n90Var = lS5Rgt96tfkO;
                    } else {
                        n90Var = lS5Rgt96tfkO;
                        o90Var.PxuCJdSBwIXG(n90Var, qq0Var4 != null, -1, 0, rtx2ld2ELZv42, 0);
                    }
                    x90 x90Var2 = x90Var;
                    int i22 = wdg6QnbFHrFF2;
                    int[] iArr4 = iArr3;
                    e51Var2 = e51Var;
                    i = RAsUl2FVSrh62;
                    d81 d81Var2 = d81Var;
                    int[] iArr5 = iArr2;
                    n90Var2 = n90Var;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    i9 = 0;
                    i10 = rtx2ld2ELZv42;
                    while (!n90Var2.lS5Rgt96tfkO && e51Var2 != null) {
                        valueOf.getClass();
                        int intValue = valueOf.intValue();
                        valueOf2.getClass();
                        int intValue2 = valueOf2.intValue();
                        int i23 = i5;
                        int i24 = i6 + intValue;
                        int max = Math.max(i2, intValue2);
                        int i25 = i10 - intValue;
                        int i26 = i3 + 1;
                        v90Var2.getClass();
                        arrayList.add(e51Var2);
                        c81Var2.rtx2ld2ELZv4(i3, em1Var2);
                        e51Var2.wdg6QnbFHrFF();
                        int i27 = i26 - i7;
                        if (it.hasNext()) {
                            int i28 = s90.PxuCJdSBwIXG;
                            try {
                                e51Var3 = (e51) it.next();
                            } catch (IndexOutOfBoundsException unused2) {
                            }
                            if (e51Var3 != null) {
                                if (vi0.rZjpSjn4zoMv(vi0.pnx5pC0XzaCw(e51Var3)) == 0.0f) {
                                    vi0.pnx5pC0XzaCw(e51Var3);
                                    em1 e9gEMXR7LXtO = e51Var3.e9gEMXR7LXtO(ozEBbv0hFTAB2);
                                    em1Var4 = e9gEMXR7LXtO;
                                    PxuCJdSBwIXG = qq0.PxuCJdSBwIXG(e9gEMXR7LXtO.JTxCbbCwomzt(), em1Var4.D0aTLcX6Uhyo());
                                } else {
                                    int i68hK7ahKtgp2 = e51Var3.i68hK7ahKtgp(Integer.MAX_VALUE);
                                    PxuCJdSBwIXG = qq0.PxuCJdSBwIXG(i68hK7ahKtgp2, e51Var3.ngxnMNrpiKat(i68hK7ahKtgp2));
                                    em1Var4 = null;
                                }
                                e51Var4 = e51Var3;
                                i16 = i26;
                                qq0Var2 = new qq0(PxuCJdSBwIXG);
                                em1Var3 = em1Var4;
                            } else {
                                e51Var4 = e51Var3;
                                i16 = i26;
                                em1Var3 = null;
                                qq0Var2 = null;
                            }
                            em1 em1Var6 = em1Var3;
                            Integer valueOf3 = qq0Var2 != null ? Integer.valueOf(((int) (qq0Var2.PxuCJdSBwIXG >> 32)) + ceil) : null;
                            Integer valueOf4 = qq0Var2 != null ? Integer.valueOf((int) (qq0Var2.PxuCJdSBwIXG & 4294967295L)) : null;
                            boolean hasNext = it.hasNext();
                            long PxuCJdSBwIXG4 = qq0.PxuCJdSBwIXG(i25, i);
                            if (qq0Var2 == null) {
                                i17 = i25;
                                num = valueOf4;
                                qq0Var3 = null;
                            } else {
                                valueOf3.getClass();
                                int intValue3 = valueOf3.intValue();
                                valueOf4.getClass();
                                i17 = i25;
                                num = valueOf4;
                                qq0Var3 = new qq0(qq0.PxuCJdSBwIXG(intValue3, valueOf4.intValue()));
                            }
                            lS5Rgt96tfkO2 = o90Var.lS5Rgt96tfkO(hasNext, i27, PxuCJdSBwIXG4, qq0Var3, i8, i9, max, false, false);
                            if (lS5Rgt96tfkO2.PxuCJdSBwIXG) {
                                int min = Math.min(Math.max(i22, i24), rtx2ld2ELZv42);
                                int i29 = i9 + max;
                                n90Var3 = lS5Rgt96tfkO2;
                                o90Var.PxuCJdSBwIXG(n90Var3, qq0Var2 != null, i8, i29, i17, i27);
                                int i30 = i23 + 1;
                                if (iArr4.length < i30) {
                                    iArr4 = Arrays.copyOf(iArr4, Math.max(i30, (iArr4.length * 3) / 2));
                                }
                                iArr4[i23] = max;
                                i5 = i23 + 1;
                                i = (i - i29) - ceil2;
                                int i31 = i4 + 1;
                                if (iArr5.length < i31) {
                                    iArr5 = Arrays.copyOf(iArr5, Math.max(i31, (iArr5.length * 3) / 2));
                                }
                                iArr5[i4] = i16;
                                i4++;
                                i8++;
                                i9 = i29 + ceil2;
                                valueOf = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - ceil) : null;
                                i22 = min;
                                i17 = rtx2ld2ELZv42;
                                i7 = i16;
                                i18 = 0;
                                i2 = 0;
                            } else {
                                n90Var3 = lS5Rgt96tfkO2;
                                i18 = i24;
                                valueOf = valueOf3;
                                i2 = max;
                                i5 = i23;
                            }
                            n90 n90Var4 = n90Var3;
                            i6 = i18;
                            n90Var2 = n90Var4;
                            e51Var2 = e51Var4;
                            em1Var2 = em1Var6;
                            i10 = i17;
                            i3 = i16;
                            valueOf2 = num;
                        }
                        e51Var3 = null;
                        if (e51Var3 != null) {
                        }
                        em1 em1Var62 = em1Var3;
                        Integer valueOf32 = qq0Var2 != null ? Integer.valueOf(((int) (qq0Var2.PxuCJdSBwIXG >> 32)) + ceil) : null;
                        if (qq0Var2 != null) {
                        }
                        boolean hasNext2 = it.hasNext();
                        long PxuCJdSBwIXG42 = qq0.PxuCJdSBwIXG(i25, i);
                        if (qq0Var2 == null) {
                        }
                        lS5Rgt96tfkO2 = o90Var.lS5Rgt96tfkO(hasNext2, i27, PxuCJdSBwIXG42, qq0Var3, i8, i9, max, false, false);
                        if (lS5Rgt96tfkO2.PxuCJdSBwIXG) {
                        }
                        n90 n90Var42 = n90Var3;
                        i6 = i18;
                        n90Var2 = n90Var42;
                        e51Var2 = e51Var4;
                        em1Var2 = em1Var62;
                        i10 = i17;
                        i3 = i16;
                        valueOf2 = num;
                    }
                    int i32 = i5;
                    size = arrayList.size();
                    int[] iArr6 = iArr5;
                    em1[] em1VarArr = new em1[size];
                    for (i11 = 0; i11 < size; i11++) {
                        em1VarArr[i11] = c81Var2.lS5Rgt96tfkO(i11);
                    }
                    int[] iArr7 = new int[i4];
                    int[] iArr8 = new int[i4];
                    i12 = i22;
                    int i33 = 0;
                    i13 = 0;
                    int i34 = 0;
                    while (i13 < i4) {
                        int[] iArr9 = iArr4;
                        int i35 = iArr6[i13];
                        if (i13 < 0 || i13 >= (i15 = i32)) {
                            throw new IndexOutOfBoundsException("Index must be between 0 and size");
                        }
                        int i36 = iArr9[i13];
                        d81 d81Var3 = d81Var2;
                        if (d81Var3.lS5Rgt96tfkO(i13)) {
                            iArr = iArr9;
                            c = 65535;
                        } else {
                            c = 65535;
                            if (rr.RAsUl2FVSrh6(j2) == Integer.MAX_VALUE) {
                                iArr = iArr9;
                                i36 = Integer.MAX_VALUE;
                            } else {
                                i36 = rr.RAsUl2FVSrh6(j2) - i34;
                                iArr = iArr9;
                            }
                        }
                        d81Var2 = d81Var3;
                        int[] iArr10 = iArr6;
                        int i37 = i4;
                        int[] iArr11 = iArr7;
                        x90 x90Var3 = x90Var2;
                        k51 amuv7NJvPxHu = xi0.amuv7NJvPxHu(x90Var3, i12, rr.OPXfSBeufaJ8(j2), rr.rtx2ld2ELZv4(j2), i36, ceil, l51Var, arrayList, em1VarArr, i33, i35, iArr11, i13);
                        int e9gEMXR7LXtO2 = amuv7NJvPxHu.e9gEMXR7LXtO();
                        int TSizfFm2Yiuu = amuv7NJvPxHu.TSizfFm2Yiuu();
                        iArr8[i13] = TSizfFm2Yiuu;
                        i12 = Math.max(i12, e9gEMXR7LXtO2);
                        f91Var.lS5Rgt96tfkO(amuv7NJvPxHu);
                        i13++;
                        i33 = i35;
                        i32 = i15;
                        iArr4 = iArr;
                        x90Var2 = x90Var3;
                        i34 += TSizfFm2Yiuu;
                        iArr7 = iArr11;
                        i4 = i37;
                        iArr6 = iArr10;
                    }
                    int[] iArr12 = iArr7;
                    int i38 = i34;
                    x90 x90Var4 = x90Var2;
                    if (f91Var.wdg6QnbFHrFF != 0) {
                        i12 = 0;
                        i14 = 0;
                    } else {
                        i14 = i38;
                    }
                    z9 z9Var = x90Var4.lS5Rgt96tfkO;
                    POWyO8hTM6YC = ((f91Var.wdg6QnbFHrFF - 1) * l51Var.POWyO8hTM6YC(z9Var.PxuCJdSBwIXG())) + i14;
                    OPXfSBeufaJ8 = rr.OPXfSBeufaJ8(QrzZRwfaDlRX);
                    RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(QrzZRwfaDlRX);
                    if (POWyO8hTM6YC < OPXfSBeufaJ8) {
                        POWyO8hTM6YC = OPXfSBeufaJ8;
                    }
                    if (POWyO8hTM6YC <= RAsUl2FVSrh6) {
                        RAsUl2FVSrh6 = POWyO8hTM6YC;
                    }
                    z9Var.wdg6QnbFHrFF(RAsUl2FVSrh6, l51Var, iArr8, iArr12);
                    wdg6QnbFHrFF = rr.wdg6QnbFHrFF(QrzZRwfaDlRX);
                    rtx2ld2ELZv4 = rr.rtx2ld2ELZv4(QrzZRwfaDlRX);
                    if (i12 < wdg6QnbFHrFF) {
                        i12 = wdg6QnbFHrFF;
                    }
                    if (i12 <= rtx2ld2ELZv4) {
                        rtx2ld2ELZv4 = i12;
                    }
                    return l51Var.jJwa0q7P5wHq(rtx2ld2ELZv4, RAsUl2FVSrh6, q50Var, new r3s1LDPKFs1S(10, f91Var));
                }
                e51Var = null;
                if (e51Var == null) {
                }
                em1Var2 = em1Var;
                valueOf = qq0Var == null ? Integer.valueOf((int) (qq0Var.PxuCJdSBwIXG >> 32)) : null;
                if (qq0Var == null) {
                }
                int[] iArr22 = new int[16];
                int[] iArr32 = new int[16];
                qq0 qq0Var42 = qq0Var;
                d81 d81Var4 = new d81();
                o90Var = new o90(v90Var2, QrzZRwfaDlRX, ceil, ceil2);
                lS5Rgt96tfkO = o90Var.lS5Rgt96tfkO(it.hasNext(), 0, qq0.PxuCJdSBwIXG(rtx2ld2ELZv42, RAsUl2FVSrh62), qq0Var42, 0, 0, 0, false, false);
                if (lS5Rgt96tfkO.lS5Rgt96tfkO) {
                }
                x90 x90Var22 = x90Var;
                int i222 = wdg6QnbFHrFF2;
                int[] iArr42 = iArr32;
                e51Var2 = e51Var;
                i = RAsUl2FVSrh62;
                d81 d81Var22 = d81Var4;
                int[] iArr52 = iArr22;
                n90Var2 = n90Var;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = rtx2ld2ELZv42;
                while (!n90Var2.lS5Rgt96tfkO) {
                    valueOf.getClass();
                    int intValue4 = valueOf.intValue();
                    valueOf2.getClass();
                    int intValue22 = valueOf2.intValue();
                    int i232 = i5;
                    int i242 = i6 + intValue4;
                    int max2 = Math.max(i2, intValue22);
                    int i252 = i10 - intValue4;
                    int i262 = i3 + 1;
                    v90Var2.getClass();
                    arrayList.add(e51Var2);
                    c81Var2.rtx2ld2ELZv4(i3, em1Var2);
                    e51Var2.wdg6QnbFHrFF();
                    int i272 = i262 - i7;
                    if (it.hasNext()) {
                    }
                    e51Var3 = null;
                    if (e51Var3 != null) {
                    }
                    em1 em1Var622 = em1Var3;
                    Integer valueOf322 = qq0Var2 != null ? Integer.valueOf(((int) (qq0Var2.PxuCJdSBwIXG >> 32)) + ceil) : null;
                    if (qq0Var2 != null) {
                    }
                    boolean hasNext22 = it.hasNext();
                    long PxuCJdSBwIXG422 = qq0.PxuCJdSBwIXG(i252, i);
                    if (qq0Var2 == null) {
                    }
                    lS5Rgt96tfkO2 = o90Var.lS5Rgt96tfkO(hasNext22, i272, PxuCJdSBwIXG422, qq0Var3, i8, i9, max2, false, false);
                    if (lS5Rgt96tfkO2.PxuCJdSBwIXG) {
                    }
                    n90 n90Var422 = n90Var3;
                    i6 = i18;
                    n90Var2 = n90Var422;
                    e51Var2 = e51Var4;
                    em1Var2 = em1Var622;
                    i10 = i17;
                    i3 = i16;
                    valueOf2 = num;
                }
                int i322 = i5;
                size = arrayList.size();
                int[] iArr62 = iArr52;
                em1[] em1VarArr2 = new em1[size];
                while (i11 < size) {
                }
                int[] iArr72 = new int[i4];
                int[] iArr82 = new int[i4];
                i12 = i222;
                int i332 = 0;
                i13 = 0;
                int i342 = 0;
                while (i13 < i4) {
                }
                int[] iArr122 = iArr72;
                int i382 = i342;
                x90 x90Var42 = x90Var22;
                if (f91Var.wdg6QnbFHrFF != 0) {
                }
                z9 z9Var2 = x90Var42.lS5Rgt96tfkO;
                POWyO8hTM6YC = ((f91Var.wdg6QnbFHrFF - 1) * l51Var.POWyO8hTM6YC(z9Var2.PxuCJdSBwIXG())) + i14;
                OPXfSBeufaJ8 = rr.OPXfSBeufaJ8(QrzZRwfaDlRX);
                RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(QrzZRwfaDlRX);
                if (POWyO8hTM6YC < OPXfSBeufaJ8) {
                }
                if (POWyO8hTM6YC <= RAsUl2FVSrh6) {
                }
                z9Var2.wdg6QnbFHrFF(RAsUl2FVSrh6, l51Var, iArr82, iArr122);
                wdg6QnbFHrFF = rr.wdg6QnbFHrFF(QrzZRwfaDlRX);
                rtx2ld2ELZv4 = rr.rtx2ld2ELZv4(QrzZRwfaDlRX);
                if (i12 < wdg6QnbFHrFF) {
                }
                if (i12 <= rtx2ld2ELZv4) {
                }
                return l51Var.jJwa0q7P5wHq(rtx2ld2ELZv4, RAsUl2FVSrh6, q50Var, new r3s1LDPKFs1S(10, f91Var));
            }
            v90Var.getClass();
        }
        return l51Var.jJwa0q7P5wHq(0, 0, q50Var, new wnqUPcAvl7HT(5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o71) && cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ((o71) obj).PxuCJdSBwIXG);
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.PxuCJdSBwIXG + ')';
    }
}
