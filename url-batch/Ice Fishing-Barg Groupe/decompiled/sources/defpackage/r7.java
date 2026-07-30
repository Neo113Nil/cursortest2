package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r7 implements j51 {
    public final y7 PxuCJdSBwIXG;

    public r7(y7 y7Var) {
        this.PxuCJdSBwIXG = y7Var;
    }

    @Override // defpackage.j51
    public final int OPXfSBeufaJ8(vr0 vr0Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((e51) list.get(0)).i68hK7ahKtgp(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((e51) list.get(i2)).i68hK7ahKtgp(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.j51
    public final int PxuCJdSBwIXG(vr0 vr0Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((e51) list.get(0)).a92UlCVFR9N8(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((e51) list.get(i2)).a92UlCVFR9N8(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.j51
    public final int RAsUl2FVSrh6(vr0 vr0Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((e51) list.get(0)).ngxnMNrpiKat(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((e51) list.get(i2)).ngxnMNrpiKat(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.j51
    public final int TSizfFm2Yiuu(vr0 vr0Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((e51) list.get(0)).IXK6ba3ucyzm(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((e51) list.get(i2)).IXK6ba3ucyzm(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.j51
    public final k51 a92UlCVFR9N8(l51 l51Var, List list, long j) {
        em1 em1Var;
        int i;
        em1 em1Var2;
        int i2;
        int i3;
        int size = list.size();
        em1[] em1VarArr = new em1[size];
        ir0.Companion.getClass();
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            em1Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            e51 e51Var = (e51) list.get(i4);
            Object wdg6QnbFHrFF = e51Var.wdg6QnbFHrFF();
            t7 t7Var = wdg6QnbFHrFF instanceof t7 ? (t7) wdg6QnbFHrFF : null;
            if (t7Var != null && ((Boolean) t7Var.PxuCJdSBwIXG.getValue()).booleanValue()) {
                em1VarArr[i4] = e51Var.e9gEMXR7LXtO(j);
                j2 = (r7.OPXfSBeufaJ8 & 4294967295L) | (r7.rtx2ld2ELZv4 << 32);
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            e51 e51Var2 = (e51) list.get(i5);
            if (em1VarArr[i5] == null) {
                em1VarArr[i5] = e51Var2.e9gEMXR7LXtO(j);
            }
        }
        if (l51Var.VhhvGxCb8gfr()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                em1Var2 = null;
            } else {
                em1Var2 = em1VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = em1Var2 != null ? em1Var2.rtx2ld2ELZv4 : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            em1 em1Var3 = em1VarArr[i8];
                            int i9 = em1Var3 != null ? em1Var3.rtx2ld2ELZv4 : 0;
                            if (i7 < i9) {
                                em1Var2 = em1Var3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = em1Var2 != null ? em1Var2.rtx2ld2ELZv4 : 0;
        }
        if (l51Var.VhhvGxCb8gfr()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                em1Var = em1VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = em1Var != null ? em1Var.OPXfSBeufaJ8 : 0;
                    if (1 <= i10) {
                        while (true) {
                            em1 em1Var4 = em1VarArr[i];
                            int i12 = em1Var4 != null ? em1Var4.OPXfSBeufaJ8 : 0;
                            if (i11 < i12) {
                                em1Var = em1Var4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = em1Var != null ? em1Var.OPXfSBeufaJ8 : 0;
        }
        if (!l51Var.VhhvGxCb8gfr()) {
            this.PxuCJdSBwIXG.TSizfFm2Yiuu.setValue(new ir0((i2 << 32) | (i3 & 4294967295L)));
        }
        return l51Var.jJwa0q7P5wHq(i2, i3, q50.rtx2ld2ELZv4, new q7(em1VarArr, this, i2, i3));
    }
}
