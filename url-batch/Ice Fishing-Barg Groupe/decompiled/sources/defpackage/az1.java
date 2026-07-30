package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class az1 implements zy1 {
    public final v81 OPXfSBeufaJ8;
    public final le0 rtx2ld2ELZv4;
    public v81 wdg6QnbFHrFF;

    public az1(Map map, le0 le0Var) {
        v81 v81Var;
        this.rtx2ld2ELZv4 = le0Var;
        if (map == null || map.isEmpty()) {
            v81Var = null;
        } else {
            v81Var = new v81(map.size());
            for (Map.Entry entry : map.entrySet()) {
                v81Var.cpQdD2nAriOS(entry.getKey(), entry.getValue());
            }
        }
        this.OPXfSBeufaJ8 = v81Var;
    }

    @Override // defpackage.zy1
    public final m9 PxuCJdSBwIXG(String str, ae0 ae0Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ov2.J54yh1s3n4Aq(str.charAt(i))) {
                v81 v81Var = this.wdg6QnbFHrFF;
                if (v81Var == null) {
                    long[] jArr = c02.PxuCJdSBwIXG;
                    v81Var = new v81();
                    this.wdg6QnbFHrFF = v81Var;
                }
                Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(str);
                if (RAsUl2FVSrh6 == null) {
                    RAsUl2FVSrh6 = new ArrayList();
                    v81Var.cpQdD2nAriOS(str, RAsUl2FVSrh6);
                }
                ((List) RAsUl2FVSrh6).add(ae0Var);
                return new m9(v81Var, str, ae0Var, 17);
            }
        }
        u9.XL4ISE6Oc65B("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.zy1
    public final boolean Y1f8riQaR6yg(Object obj) {
        return ((Boolean) this.rtx2ld2ELZv4.OPXfSBeufaJ8(obj)).booleanValue();
    }

    @Override // defpackage.zy1
    public final Object a92UlCVFR9N8(String str) {
        v81 v81Var = this.OPXfSBeufaJ8;
        List list = v81Var != null ? (List) v81Var.dgRBjINgWbAK(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && v81Var != null) {
            List subList = list.subList(1, list.size());
            int a92UlCVFR9N8 = v81Var.a92UlCVFR9N8(str);
            if (a92UlCVFR9N8 < 0) {
                a92UlCVFR9N8 = ~a92UlCVFR9N8;
            }
            Object[] objArr = v81Var.TSizfFm2Yiuu;
            Object obj = objArr[a92UlCVFR9N8];
            v81Var.lS5Rgt96tfkO[a92UlCVFR9N8] = str;
            objArr[a92UlCVFR9N8] = subList;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // defpackage.zy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map e9gEMXR7LXtO() {
        char c;
        long j;
        long j2;
        long j3;
        v81 v81Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        v81 v81Var2 = this.OPXfSBeufaJ8;
        if (v81Var2 == null && this.wdg6QnbFHrFF == null) {
            return q50.rtx2ld2ELZv4;
        }
        int i3 = 0;
        int i4 = v81Var2 != null ? v81Var2.e9gEMXR7LXtO : 0;
        v81 v81Var3 = this.wdg6QnbFHrFF;
        HashMap hashMap = new HashMap(i4 + (v81Var3 != null ? v81Var3.e9gEMXR7LXtO : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (v81Var2 != null) {
            Object[] objArr = v81Var2.lS5Rgt96tfkO;
            Object[] objArr2 = v81Var2.TSizfFm2Yiuu;
            long[] jArr3 = v81Var2.PxuCJdSBwIXG;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
                v81Var = this.wdg6QnbFHrFF;
                if (v81Var != null) {
                    Object[] objArr3 = v81Var.lS5Rgt96tfkO;
                    Object[] objArr4 = v81Var.TSizfFm2Yiuu;
                    long[] jArr4 = v81Var.PxuCJdSBwIXG;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr4[i10];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = i3;
                                while (i12 < i11) {
                                    if ((j7 & j3) < j2) {
                                        int i13 = (i10 << 3) + i12;
                                        Object obj = objArr3[i13];
                                        List list = (List) objArr4[i13];
                                        String str = (String) obj;
                                        i2 = i5;
                                        if (list.size() == 1) {
                                            Object PxuCJdSBwIXG = ((ae0) list.get(i3)).PxuCJdSBwIXG();
                                            if (PxuCJdSBwIXG != null) {
                                                if (!Y1f8riQaR6yg(PxuCJdSBwIXG)) {
                                                    rc1.e9gEMXR7LXtO(sj0.ZbWwgt3aGe7A(PxuCJdSBwIXG));
                                                    return null;
                                                }
                                                hashMap.put(str, fx1.S9EYkSpbGuxq(PxuCJdSBwIXG));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object PxuCJdSBwIXG2 = ((ae0) list.get(i3)).PxuCJdSBwIXG();
                                                if (PxuCJdSBwIXG2 != null && !Y1f8riQaR6yg(PxuCJdSBwIXG2)) {
                                                    rc1.e9gEMXR7LXtO(sj0.ZbWwgt3aGe7A(PxuCJdSBwIXG2));
                                                    return null;
                                                }
                                                arrayList.add(PxuCJdSBwIXG2);
                                                i3++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i2 = i5;
                                    }
                                    j7 >>= i2;
                                    i12++;
                                    i5 = i2;
                                    jArr4 = jArr2;
                                    i3 = 0;
                                }
                                jArr = jArr4;
                                i = i5;
                                if (i11 != i) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i = i5;
                            }
                            if (i10 == length2) {
                                break;
                            }
                            i10++;
                            i5 = i;
                            jArr4 = jArr;
                            i3 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        v81Var = this.wdg6QnbFHrFF;
        if (v81Var != null) {
        }
        return hashMap;
    }
}
