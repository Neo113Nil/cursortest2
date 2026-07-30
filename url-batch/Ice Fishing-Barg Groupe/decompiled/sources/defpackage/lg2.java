package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lg2 implements j51 {
    public final jg2 PxuCJdSBwIXG;
    public final mi1 TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final cg2 lS5Rgt96tfkO;

    public lg2(jg2 jg2Var, cg2 cg2Var, mi1 mi1Var, float f) {
        this.PxuCJdSBwIXG = jg2Var;
        this.lS5Rgt96tfkO = cg2Var;
        this.TSizfFm2Yiuu = mi1Var;
        this.Y1f8riQaR6yg = f;
    }

    public static int e9gEMXR7LXtO(List list, int i, pe0 pe0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj7), "TextField")) {
                int intValue = ((Number) pe0Var.rtx2ld2ELZv4(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                e51 e51Var = (e51) obj2;
                int intValue2 = e51Var != null ? ((Number) pe0Var.rtx2ld2ELZv4(e51Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                e51 e51Var2 = (e51) obj3;
                int intValue3 = e51Var2 != null ? ((Number) pe0Var.rtx2ld2ELZv4(e51Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                e51 e51Var3 = (e51) obj4;
                int intValue4 = e51Var3 != null ? ((Number) pe0Var.rtx2ld2ELZv4(e51Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                e51 e51Var4 = (e51) obj5;
                int intValue5 = e51Var4 != null ? ((Number) pe0Var.rtx2ld2ELZv4(e51Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                e51 e51Var5 = (e51) obj6;
                int intValue6 = e51Var5 != null ? ((Number) pe0Var.rtx2ld2ELZv4(e51Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                e51 e51Var6 = (e51) obj;
                int i9 = intValue4 + intValue5;
                return sr.RAsUl2FVSrh6(Math.max(intValue + i9, Math.max((e51Var6 != null ? ((Number) pe0Var.rtx2ld2ELZv4(e51Var6, Integer.valueOf(i))).intValue() : 0) + i9, intValue2)) + intValue6 + intValue3, sr.lS5Rgt96tfkO(0, 0, 0, 0, 15));
            }
        }
        c21.lS5Rgt96tfkO("Collection contains no element matching the predicate.");
        u9.Y1f8riQaR6yg();
        return 0;
    }

    @Override // defpackage.j51
    public final int OPXfSBeufaJ8(vr0 vr0Var, List list, int i) {
        return e9gEMXR7LXtO(list, i, new uz1(23, (byte) 0));
    }

    @Override // defpackage.j51
    public final int PxuCJdSBwIXG(vr0 vr0Var, List list, int i) {
        return Y1f8riQaR6yg(vr0Var, list, i, new uz1(26, (byte) 0));
    }

    @Override // defpackage.j51
    public final int RAsUl2FVSrh6(vr0 vr0Var, List list, int i) {
        return Y1f8riQaR6yg(vr0Var, list, i, new uz1(25, (byte) 0));
    }

    @Override // defpackage.j51
    public final int TSizfFm2Yiuu(vr0 vr0Var, List list, int i) {
        return e9gEMXR7LXtO(list, i, new uz1(24, (byte) 0));
    }

    public final int Y1f8riQaR6yg(vr0 vr0Var, List list, int i, pe0 pe0Var) {
        Object obj;
        int i2;
        int i3;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj), "Leading")) {
                break;
            }
            i8++;
        }
        e51 e51Var = (e51) obj;
        if (e51Var != null) {
            i2 = i;
            i4 = th0.nLZGh9p8gVSu(i2, e51Var.IXK6ba3ucyzm(Integer.MAX_VALUE));
            i3 = ((Number) pe0Var.rtx2ld2ELZv4(e51Var, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            i3 = 0;
            i4 = i2;
        }
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        e51 e51Var2 = (e51) obj2;
        if (e51Var2 != null) {
            i4 = th0.nLZGh9p8gVSu(i4, e51Var2.IXK6ba3ucyzm(Integer.MAX_VALUE));
            i5 = ((Number) pe0Var.rtx2ld2ELZv4(e51Var2, Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj3), "Label")) {
                break;
            }
            i10++;
        }
        Object obj8 = (e51) obj3;
        int intValue = obj8 != null ? ((Number) pe0Var.rtx2ld2ELZv4(obj8, Integer.valueOf(i4))).intValue() : 0;
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        e51 e51Var3 = (e51) obj4;
        if (e51Var3 != null) {
            int intValue2 = ((Number) pe0Var.rtx2ld2ELZv4(e51Var3, Integer.valueOf(i4))).intValue();
            i4 = th0.nLZGh9p8gVSu(i4, e51Var3.IXK6ba3ucyzm(Integer.MAX_VALUE));
            i6 = intValue2;
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        e51 e51Var4 = (e51) obj5;
        if (e51Var4 != null) {
            int intValue3 = ((Number) pe0Var.rtx2ld2ELZv4(e51Var4, Integer.valueOf(i4))).intValue();
            i4 = th0.nLZGh9p8gVSu(i4, e51Var4.IXK6ba3ucyzm(Integer.MAX_VALUE));
            i7 = intValue3;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i13 = 0; i13 < size6; i13++) {
            Object obj9 = list.get(i13);
            if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj9), "TextField")) {
                int intValue4 = ((Number) pe0Var.rtx2ld2ELZv4(obj9, Integer.valueOf(i4))).intValue();
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                }
                Object obj10 = (e51) obj6;
                int intValue5 = obj10 != null ? ((Number) pe0Var.rtx2ld2ELZv4(obj10, Integer.valueOf(i4))).intValue() : 0;
                int size8 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i15);
                    if (cs0.wdg6QnbFHrFF(th0.EcgxDIVH5in8((e51) obj7), "Supporting")) {
                        break;
                    }
                    i15++;
                }
                Object obj11 = (e51) obj7;
                return lS5Rgt96tfkO(vr0Var, intValue4, intValue, i3, i5, i6, i7, intValue5, obj11 != null ? ((Number) pe0Var.rtx2ld2ELZv4(obj11, Integer.valueOf(i2))).intValue() : 0, sr.lS5Rgt96tfkO(0, 0, 0, 0, 15), this.lS5Rgt96tfkO.PxuCJdSBwIXG());
            }
        }
        c21.lS5Rgt96tfkO("Collection contains no element matching the predicate.");
        u9.Y1f8riQaR6yg();
        return 0;
    }

    @Override // defpackage.j51
    public final k51 a92UlCVFR9N8(final l51 l51Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        em1 em1Var;
        Object obj4;
        int i2;
        em1 em1Var2;
        Object obj5;
        int i3;
        Object obj6;
        Object obj7;
        em1 em1Var3;
        int i4;
        int i5;
        int i6;
        int i7;
        em1 em1Var4;
        int i8;
        em1 em1Var5;
        int i9;
        em1 em1Var6;
        int i10;
        float f;
        em1 em1Var7;
        zt1 zt1Var;
        int i11;
        em1 em1Var8;
        em1 em1Var9;
        int i12;
        int i13;
        lg2 lg2Var;
        int i14;
        float PxuCJdSBwIXG = this.lS5Rgt96tfkO.PxuCJdSBwIXG();
        mi1 mi1Var = this.TSizfFm2Yiuu;
        final int POWyO8hTM6YC = l51Var.POWyO8hTM6YC(mi1Var.Y1f8riQaR6yg());
        int POWyO8hTM6YC2 = l51Var.POWyO8hTM6YC(mi1Var.TSizfFm2Yiuu());
        long PxuCJdSBwIXG2 = rr.PxuCJdSBwIXG(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i15);
            if (cs0.wdg6QnbFHrFF(cs0.pnx5pC0XzaCw((e51) obj), "Leading")) {
                break;
            }
            i15++;
        }
        e51 e51Var = (e51) obj;
        em1 e9gEMXR7LXtO = e51Var != null ? e51Var.e9gEMXR7LXtO(PxuCJdSBwIXG2) : null;
        int i16 = e9gEMXR7LXtO != null ? e9gEMXR7LXtO.rtx2ld2ELZv4 : 0;
        int max = Math.max(0, e9gEMXR7LXtO != null ? e9gEMXR7LXtO.OPXfSBeufaJ8 : 0);
        int size2 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i17);
            if (cs0.wdg6QnbFHrFF(cs0.pnx5pC0XzaCw((e51) obj2), "Trailing")) {
                break;
            }
            i17++;
        }
        e51 e51Var2 = (e51) obj2;
        em1 e9gEMXR7LXtO2 = e51Var2 != null ? e51Var2.e9gEMXR7LXtO(sr.wdg6QnbFHrFF(-i16, 0, 2, PxuCJdSBwIXG2)) : null;
        int i18 = i16 + (e9gEMXR7LXtO2 != null ? e9gEMXR7LXtO2.rtx2ld2ELZv4 : 0);
        int max2 = Math.max(max, e9gEMXR7LXtO2 != null ? e9gEMXR7LXtO2.OPXfSBeufaJ8 : 0);
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i19);
            if (cs0.wdg6QnbFHrFF(cs0.pnx5pC0XzaCw((e51) obj3), "Prefix")) {
                break;
            }
            i19++;
        }
        e51 e51Var3 = (e51) obj3;
        if (e51Var3 != null) {
            i = i18;
            em1Var = e51Var3.e9gEMXR7LXtO(sr.wdg6QnbFHrFF(-i18, 0, 2, PxuCJdSBwIXG2));
        } else {
            i = i18;
            em1Var = null;
        }
        int i20 = (em1Var != null ? em1Var.rtx2ld2ELZv4 : 0) + i;
        int max3 = Math.max(max2, em1Var != null ? em1Var.OPXfSBeufaJ8 : 0);
        int size4 = list.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i21);
            if (cs0.wdg6QnbFHrFF(cs0.pnx5pC0XzaCw((e51) obj4), "Suffix")) {
                break;
            }
            i21++;
        }
        e51 e51Var4 = (e51) obj4;
        if (e51Var4 != null) {
            i2 = i20;
            em1Var2 = e51Var4.e9gEMXR7LXtO(sr.wdg6QnbFHrFF(-i20, 0, 2, PxuCJdSBwIXG2));
        } else {
            i2 = i20;
            em1Var2 = null;
        }
        int i22 = i2 + (em1Var2 != null ? em1Var2.rtx2ld2ELZv4 : 0);
        int max4 = Math.max(max3, em1Var2 != null ? em1Var2.OPXfSBeufaJ8 : 0);
        int size5 = list.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i23);
            int i24 = size5;
            if (cs0.wdg6QnbFHrFF(cs0.pnx5pC0XzaCw((e51) obj5), "Label")) {
                break;
            }
            i23++;
            size5 = i24;
        }
        e51 e51Var5 = (e51) obj5;
        zt1 zt1Var2 = new zt1();
        int i25 = -i22;
        zt1Var2.rtx2ld2ELZv4 = e51Var5 != null ? e51Var5.e9gEMXR7LXtO(sr.OPXfSBeufaJ8(i25, -POWyO8hTM6YC2, PxuCJdSBwIXG2)) : null;
        int size6 = list.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size6) {
                i3 = POWyO8hTM6YC2;
                obj6 = null;
                break;
            }
            obj6 = list.get(i26);
            i3 = POWyO8hTM6YC2;
            if (cs0.wdg6QnbFHrFF(cs0.pnx5pC0XzaCw((e51) obj6), "Supporting")) {
                break;
            }
            i26++;
            POWyO8hTM6YC2 = i3;
        }
        e51 e51Var6 = (e51) obj6;
        int ngxnMNrpiKat = e51Var6 != null ? e51Var6.ngxnMNrpiKat(rr.wdg6QnbFHrFF(j)) : 0;
        em1 em1Var10 = (em1) zt1Var2.rtx2ld2ELZv4;
        int i27 = POWyO8hTM6YC + (em1Var10 != null ? em1Var10.OPXfSBeufaJ8 : 0);
        long OPXfSBeufaJ8 = sr.OPXfSBeufaJ8(i25, ((-i27) - i3) - ngxnMNrpiKat, rr.PxuCJdSBwIXG(j, 0, 0, 0, 0, 11));
        int size7 = list.size();
        int i28 = 0;
        while (i28 < size7) {
            int i29 = i27;
            e51 e51Var7 = (e51) list.get(i28);
            int i30 = size7;
            float f2 = PxuCJdSBwIXG;
            if (cs0.wdg6QnbFHrFF(cs0.pnx5pC0XzaCw(e51Var7), "TextField")) {
                final em1 e9gEMXR7LXtO3 = e51Var7.e9gEMXR7LXtO(OPXfSBeufaJ8);
                long PxuCJdSBwIXG3 = rr.PxuCJdSBwIXG(OPXfSBeufaJ8, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i31 = 0;
                while (true) {
                    if (i31 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i31);
                    int i32 = size8;
                    int i33 = i31;
                    if (cs0.wdg6QnbFHrFF(cs0.pnx5pC0XzaCw((e51) obj7), "Hint")) {
                        break;
                    }
                    i31 = i33 + 1;
                    size8 = i32;
                }
                e51 e51Var8 = (e51) obj7;
                em1 e9gEMXR7LXtO4 = e51Var8 != null ? e51Var8.e9gEMXR7LXtO(PxuCJdSBwIXG3) : null;
                int max5 = Math.max(max4, Math.max(e9gEMXR7LXtO3.OPXfSBeufaJ8, e9gEMXR7LXtO4 != null ? e9gEMXR7LXtO4.OPXfSBeufaJ8 : 0) + i29 + i3);
                int i34 = e9gEMXR7LXtO != null ? e9gEMXR7LXtO.rtx2ld2ELZv4 : 0;
                int i35 = e9gEMXR7LXtO2 != null ? e9gEMXR7LXtO2.rtx2ld2ELZv4 : 0;
                int i36 = em1Var != null ? em1Var.rtx2ld2ELZv4 : 0;
                int i37 = em1Var2 != null ? em1Var2.rtx2ld2ELZv4 : 0;
                int i38 = i35;
                int i39 = e9gEMXR7LXtO3.rtx2ld2ELZv4;
                em1 em1Var11 = (em1) zt1Var2.rtx2ld2ELZv4;
                int i40 = i36 + i37;
                int RAsUl2FVSrh6 = sr.RAsUl2FVSrh6(Math.max(i39 + i40, Math.max((e9gEMXR7LXtO4 != null ? e9gEMXR7LXtO4.rtx2ld2ELZv4 : 0) + i40, em1Var11 != null ? em1Var11.rtx2ld2ELZv4 : 0)) + i34 + i38, j);
                em1 e9gEMXR7LXtO5 = e51Var6 != null ? e51Var6.e9gEMXR7LXtO(rr.PxuCJdSBwIXG(sr.wdg6QnbFHrFF(0, -max5, 1, PxuCJdSBwIXG2), 0, RAsUl2FVSrh6, 0, 0, 9)) : null;
                int i41 = e9gEMXR7LXtO5 != null ? e9gEMXR7LXtO5.OPXfSBeufaJ8 : 0;
                int i42 = e9gEMXR7LXtO3.OPXfSBeufaJ8;
                em1 em1Var12 = (em1) zt1Var2.rtx2ld2ELZv4;
                int i43 = em1Var12 != null ? em1Var12.OPXfSBeufaJ8 : 0;
                int i44 = e9gEMXR7LXtO != null ? e9gEMXR7LXtO.OPXfSBeufaJ8 : 0;
                if (e9gEMXR7LXtO2 != null) {
                    em1Var3 = e9gEMXR7LXtO;
                    i4 = i43;
                    i5 = e9gEMXR7LXtO2.OPXfSBeufaJ8;
                } else {
                    em1Var3 = e9gEMXR7LXtO;
                    i4 = i43;
                    i5 = 0;
                }
                if (em1Var != null) {
                    i6 = i44;
                    i7 = em1Var.OPXfSBeufaJ8;
                } else {
                    i6 = i44;
                    i7 = 0;
                }
                final em1 em1Var13 = e9gEMXR7LXtO2;
                if (em1Var2 != null) {
                    em1 em1Var14 = em1Var;
                    i8 = em1Var2.OPXfSBeufaJ8;
                    em1Var4 = em1Var14;
                } else {
                    em1Var4 = em1Var;
                    i8 = 0;
                }
                final em1 em1Var15 = em1Var4;
                if (e9gEMXR7LXtO4 != null) {
                    em1 em1Var16 = em1Var3;
                    i9 = e9gEMXR7LXtO4.OPXfSBeufaJ8;
                    em1Var5 = em1Var16;
                } else {
                    em1Var5 = em1Var3;
                    i9 = 0;
                }
                if (e9gEMXR7LXtO5 != null) {
                    em1Var7 = em1Var5;
                    em1Var6 = em1Var2;
                    i10 = i6;
                    f = f2;
                    zt1Var = zt1Var2;
                    i11 = e9gEMXR7LXtO5.OPXfSBeufaJ8;
                    em1Var8 = e9gEMXR7LXtO4;
                    em1Var9 = e9gEMXR7LXtO5;
                    i12 = RAsUl2FVSrh6;
                    i13 = 0;
                    i14 = i42;
                    lg2Var = this;
                } else {
                    em1Var6 = em1Var2;
                    i10 = i6;
                    f = f2;
                    em1Var7 = em1Var5;
                    zt1Var = zt1Var2;
                    i11 = 0;
                    em1Var8 = e9gEMXR7LXtO4;
                    em1Var9 = e9gEMXR7LXtO5;
                    i12 = RAsUl2FVSrh6;
                    i13 = 0;
                    lg2Var = this;
                    i14 = i42;
                }
                final int lS5Rgt96tfkO = lg2Var.lS5Rgt96tfkO(l51Var, i14, i4, i10, i5, i7, i8, i9, i11, j, f);
                final int i45 = lS5Rgt96tfkO - i41;
                int size9 = list.size();
                int i46 = i13;
                while (i46 < size9) {
                    e51 e51Var9 = (e51) list.get(i46);
                    if (cs0.wdg6QnbFHrFF(cs0.pnx5pC0XzaCw(e51Var9), "Container")) {
                        final em1 e9gEMXR7LXtO6 = e51Var9.e9gEMXR7LXtO(sr.PxuCJdSBwIXG(i12 != Integer.MAX_VALUE ? i12 : i13, i12, i45 != Integer.MAX_VALUE ? i45 : i13, i45));
                        final int i47 = i12;
                        final float f3 = f;
                        final em1 em1Var17 = em1Var6;
                        final em1 em1Var18 = em1Var7;
                        final zt1 zt1Var3 = zt1Var;
                        final em1 em1Var19 = em1Var8;
                        final em1 em1Var20 = em1Var9;
                        return l51Var.jJwa0q7P5wHq(i47, lS5Rgt96tfkO, q50.rtx2ld2ELZv4, new le0(this, i45, POWyO8hTM6YC, l51Var, i47, lS5Rgt96tfkO, e9gEMXR7LXtO3, em1Var19, em1Var18, em1Var13, em1Var15, em1Var17, e9gEMXR7LXtO6, em1Var20, f3) { // from class: kg2
                            public final /* synthetic */ em1 BRwzKIf41E4i;
                            public final /* synthetic */ em1 EcgxDIVH5in8;
                            public final /* synthetic */ lg2 OPXfSBeufaJ8;
                            public final /* synthetic */ em1 QrzZRwfaDlRX;
                            public final /* synthetic */ em1 RfyTYNmI9Srp;
                            public final /* synthetic */ em1 S9EYkSpbGuxq;
                            public final /* synthetic */ float VhhvGxCb8gfr;
                            public final /* synthetic */ em1 XL4ISE6Oc65B;
                            public final /* synthetic */ int cpQdD2nAriOS;
                            public final /* synthetic */ l51 dgRBjINgWbAK;
                            public final /* synthetic */ em1 gPXPFXrUH4XX;
                            public final /* synthetic */ em1 r3s1LDPKFs1S;
                            public final /* synthetic */ int wdg6QnbFHrFF;
                            public final /* synthetic */ int x50lh2ztY7Y5;

                            {
                                this.wdg6QnbFHrFF = POWyO8hTM6YC;
                                this.dgRBjINgWbAK = l51Var;
                                this.x50lh2ztY7Y5 = i47;
                                this.cpQdD2nAriOS = lS5Rgt96tfkO;
                                this.r3s1LDPKFs1S = e9gEMXR7LXtO3;
                                this.QrzZRwfaDlRX = em1Var19;
                                this.gPXPFXrUH4XX = em1Var18;
                                this.BRwzKIf41E4i = em1Var13;
                                this.XL4ISE6Oc65B = em1Var15;
                                this.RfyTYNmI9Srp = em1Var17;
                                this.EcgxDIVH5in8 = e9gEMXR7LXtO6;
                                this.S9EYkSpbGuxq = em1Var20;
                                this.VhhvGxCb8gfr = f3;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
                            /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
                            /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
                            /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x0094  */
                            @Override // defpackage.le0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object OPXfSBeufaJ8(Object obj8) {
                                int i48;
                                int i49;
                                dm1 dm1Var = (dm1) obj8;
                                zt1 zt1Var4 = zt1.this;
                                Object obj9 = zt1Var4.rtx2ld2ELZv4;
                                lg2 lg2Var2 = this.OPXfSBeufaJ8;
                                l51 l51Var2 = this.dgRBjINgWbAK;
                                int i50 = this.x50lh2ztY7Y5;
                                int i51 = this.cpQdD2nAriOS;
                                em1 em1Var21 = this.r3s1LDPKFs1S;
                                em1 em1Var22 = this.QrzZRwfaDlRX;
                                em1 em1Var23 = this.gPXPFXrUH4XX;
                                em1 em1Var24 = this.BRwzKIf41E4i;
                                em1 em1Var25 = this.XL4ISE6Oc65B;
                                em1 em1Var26 = this.RfyTYNmI9Srp;
                                em1 em1Var27 = this.EcgxDIVH5in8;
                                em1 em1Var28 = this.S9EYkSpbGuxq;
                                if (obj9 != null) {
                                    int POWyO8hTM6YC3 = l51Var2.POWyO8hTM6YC(lg2Var2.Y1f8riQaR6yg);
                                    int i52 = this.wdg6QnbFHrFF;
                                    int i53 = POWyO8hTM6YC3 + i52;
                                    em1 em1Var29 = (em1) zt1Var4.rtx2ld2ELZv4;
                                    int i54 = em1Var29.OPXfSBeufaJ8 + i52;
                                    cw0 layoutDirection = l51Var2.getLayoutDirection();
                                    jg2 jg2Var = lg2Var2.PxuCJdSBwIXG;
                                    dm1.RAsUl2FVSrh6(dm1Var, em1Var27, 0, 0);
                                    int i55 = i51 - (em1Var28 != null ? em1Var28.OPXfSBeufaJ8 : 0);
                                    if (em1Var23 != null) {
                                        s.Companion.getClass();
                                        i48 = i55;
                                        dm1.wdg6QnbFHrFF(dm1Var, em1Var23, 0, Math.round(((i55 - em1Var23.OPXfSBeufaJ8) / 2.0f) * 1.0f));
                                    } else {
                                        i48 = i55;
                                    }
                                    float f4 = this.VhhvGxCb8gfr;
                                    int BjEWd04qc7Mw = ni0.BjEWd04qc7Mw(f4, i53, i52);
                                    if (layoutDirection == cw0.rtx2ld2ELZv4) {
                                        if (em1Var23 != null) {
                                            i49 = em1Var23.rtx2ld2ELZv4;
                                            int i56 = i49;
                                            int PxuCJdSBwIXG4 = jg2Var.lS5Rgt96tfkO.PxuCJdSBwIXG(em1Var29.rtx2ld2ELZv4, (i50 - (em1Var23 == null ? em1Var23.rtx2ld2ELZv4 : 0)) - (em1Var24 == null ? em1Var24.rtx2ld2ELZv4 : 0), layoutDirection) + i56;
                                            if (jg2Var instanceof jg2) {
                                                throw new IllegalArgumentException("Unknown position: " + jg2Var);
                                            }
                                            dm1.RAsUl2FVSrh6(dm1Var, em1Var29, ni0.BjEWd04qc7Mw(f4, PxuCJdSBwIXG4, jg2Var.PxuCJdSBwIXG.PxuCJdSBwIXG(em1Var29.rtx2ld2ELZv4, (i50 - (em1Var23 != null ? em1Var23.rtx2ld2ELZv4 : 0)) - (em1Var24 != null ? em1Var24.rtx2ld2ELZv4 : 0), layoutDirection) + i56), BjEWd04qc7Mw);
                                            if (em1Var25 != null) {
                                                dm1.wdg6QnbFHrFF(dm1Var, em1Var25, em1Var23 != null ? em1Var23.rtx2ld2ELZv4 : 0, i54);
                                            }
                                            int i57 = (em1Var23 != null ? em1Var23.rtx2ld2ELZv4 : 0) + (em1Var25 != null ? em1Var25.rtx2ld2ELZv4 : 0);
                                            dm1.wdg6QnbFHrFF(dm1Var, em1Var21, i57, i54);
                                            if (em1Var22 != null) {
                                                dm1.wdg6QnbFHrFF(dm1Var, em1Var22, i57, i54);
                                            }
                                            if (em1Var26 != null) {
                                                dm1.wdg6QnbFHrFF(dm1Var, em1Var26, (i50 - (em1Var24 != null ? em1Var24.rtx2ld2ELZv4 : 0)) - em1Var26.rtx2ld2ELZv4, i54);
                                            }
                                            if (em1Var24 != null) {
                                                int i58 = i50 - em1Var24.rtx2ld2ELZv4;
                                                s.Companion.getClass();
                                                dm1.wdg6QnbFHrFF(dm1Var, em1Var24, i58, Math.round(((i48 - em1Var24.OPXfSBeufaJ8) / 2.0f) * 1.0f));
                                            }
                                            if (em1Var28 != null) {
                                                dm1.wdg6QnbFHrFF(dm1Var, em1Var28, 0, i48);
                                            }
                                        }
                                        i49 = 0;
                                        int i562 = i49;
                                        int PxuCJdSBwIXG42 = jg2Var.lS5Rgt96tfkO.PxuCJdSBwIXG(em1Var29.rtx2ld2ELZv4, (i50 - (em1Var23 == null ? em1Var23.rtx2ld2ELZv4 : 0)) - (em1Var24 == null ? em1Var24.rtx2ld2ELZv4 : 0), layoutDirection) + i562;
                                        if (jg2Var instanceof jg2) {
                                        }
                                    } else {
                                        if (em1Var24 != null) {
                                            i49 = em1Var24.rtx2ld2ELZv4;
                                            int i5622 = i49;
                                            int PxuCJdSBwIXG422 = jg2Var.lS5Rgt96tfkO.PxuCJdSBwIXG(em1Var29.rtx2ld2ELZv4, (i50 - (em1Var23 == null ? em1Var23.rtx2ld2ELZv4 : 0)) - (em1Var24 == null ? em1Var24.rtx2ld2ELZv4 : 0), layoutDirection) + i5622;
                                            if (jg2Var instanceof jg2) {
                                            }
                                        }
                                        i49 = 0;
                                        int i56222 = i49;
                                        int PxuCJdSBwIXG4222 = jg2Var.lS5Rgt96tfkO.PxuCJdSBwIXG(em1Var29.rtx2ld2ELZv4, (i50 - (em1Var23 == null ? em1Var23.rtx2ld2ELZv4 : 0)) - (em1Var24 == null ? em1Var24.rtx2ld2ELZv4 : 0), layoutDirection) + i56222;
                                        if (jg2Var instanceof jg2) {
                                        }
                                    }
                                } else {
                                    float lS5Rgt96tfkO2 = l51Var2.lS5Rgt96tfkO();
                                    wq0.Companion.getClass();
                                    dm1.OPXfSBeufaJ8(dm1Var, em1Var27, 0L);
                                    int i59 = i51 - (em1Var28 != null ? em1Var28.OPXfSBeufaJ8 : 0);
                                    int IXK6ba3ucyzm = b51.IXK6ba3ucyzm(lg2Var2.TSizfFm2Yiuu.Y1f8riQaR6yg() * lS5Rgt96tfkO2);
                                    if (em1Var23 != null) {
                                        s.Companion.getClass();
                                        dm1.wdg6QnbFHrFF(dm1Var, em1Var23, 0, Math.round(((i59 - em1Var23.OPXfSBeufaJ8) / 2.0f) * 1.0f));
                                    }
                                    if (em1Var25 != null) {
                                        dm1.wdg6QnbFHrFF(dm1Var, em1Var25, em1Var23 != null ? em1Var23.rtx2ld2ELZv4 : 0, IXK6ba3ucyzm);
                                    }
                                    int i60 = (em1Var23 != null ? em1Var23.rtx2ld2ELZv4 : 0) + (em1Var25 != null ? em1Var25.rtx2ld2ELZv4 : 0);
                                    dm1.wdg6QnbFHrFF(dm1Var, em1Var21, i60, IXK6ba3ucyzm);
                                    if (em1Var22 != null) {
                                        dm1.wdg6QnbFHrFF(dm1Var, em1Var22, i60, IXK6ba3ucyzm);
                                    }
                                    if (em1Var26 != null) {
                                        dm1.wdg6QnbFHrFF(dm1Var, em1Var26, (i50 - (em1Var24 != null ? em1Var24.rtx2ld2ELZv4 : 0)) - em1Var26.rtx2ld2ELZv4, IXK6ba3ucyzm);
                                    }
                                    if (em1Var24 != null) {
                                        int i61 = i50 - em1Var24.rtx2ld2ELZv4;
                                        s.Companion.getClass();
                                        dm1.wdg6QnbFHrFF(dm1Var, em1Var24, i61, Math.round(((i59 - em1Var24.OPXfSBeufaJ8) / 2.0f) * 1.0f));
                                    }
                                    if (em1Var28 != null) {
                                        dm1.wdg6QnbFHrFF(dm1Var, em1Var28, 0, i59);
                                    }
                                }
                                return no2.PxuCJdSBwIXG;
                            }
                        });
                    }
                    i46++;
                    i45 = i45;
                }
                c21.lS5Rgt96tfkO("Collection contains no element matching the predicate.");
                u9.Y1f8riQaR6yg();
                return null;
            }
            PxuCJdSBwIXG = f2;
            i28++;
            size7 = i30;
            i27 = i29;
            e9gEMXR7LXtO = e9gEMXR7LXtO;
        }
        c21.lS5Rgt96tfkO("Collection contains no element matching the predicate.");
        u9.Y1f8riQaR6yg();
        return null;
    }

    public final int lS5Rgt96tfkO(vr0 vr0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        mi1 mi1Var = this.TSizfFm2Yiuu;
        int POWyO8hTM6YC = vr0Var.POWyO8hTM6YC(mi1Var.TSizfFm2Yiuu() + mi1Var.Y1f8riQaR6yg());
        int[] iArr = {i7, i5, i6, ni0.BjEWd04qc7Mw(f, i2, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return sr.a92UlCVFR9N8(Math.max(i3, Math.max(i4, POWyO8hTM6YC + (i2 > 0 ? Math.max(vr0Var.POWyO8hTM6YC(this.Y1f8riQaR6yg * 2.0f), ni0.BjEWd04qc7Mw(f71.PxuCJdSBwIXG.lS5Rgt96tfkO(f), 0, i2)) : 0) + i)) + i8, j);
    }
}
