package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class o32 {
    public static final Comparator[] PxuCJdSBwIXG;
    public static final m32 lS5Rgt96tfkO;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            db0 db0Var = i == 0 ? db0.e9gEMXR7LXtO : db0.TSizfFm2Yiuu;
            vw0.Companion.getClass();
            comparatorArr[i] = new n32(new n32(db0Var));
            i++;
        }
        PxuCJdSBwIXG = comparatorArr;
        lS5Rgt96tfkO = m32.wdg6QnbFHrFF;
    }

    public static final void PxuCJdSBwIXG(d32 d32Var, ArrayList arrayList, y yVar, y yVar2, c81 c81Var) {
        z22 z22Var = d32Var.Y1f8riQaR6yg;
        Object RAsUl2FVSrh6 = z22Var.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.r3s1LDPKFs1S);
        if (RAsUl2FVSrh6 == null) {
            RAsUl2FVSrh6 = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) RAsUl2FVSrh6).booleanValue();
        if ((booleanValue || ((Boolean) yVar2.OPXfSBeufaJ8(d32Var)).booleanValue()) && ((Boolean) yVar.OPXfSBeufaJ8(d32Var)).booleanValue()) {
            arrayList.add(d32Var);
        }
        if (booleanValue) {
            c81Var.rtx2ld2ELZv4(d32Var.a92UlCVFR9N8, lS5Rgt96tfkO(d32Var, yVar, yVar2, d32.wdg6QnbFHrFF(7, d32Var)));
            return;
        }
        List wdg6QnbFHrFF = d32.wdg6QnbFHrFF(7, d32Var);
        int size = wdg6QnbFHrFF.size();
        for (int i = 0; i < size; i++) {
            PxuCJdSBwIXG((d32) wdg6QnbFHrFF.get(i), arrayList, yVar, yVar2, c81Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EDGE_INSN: B:30:0x00f5->B:31:0x00f5 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList lS5Rgt96tfkO(d32 d32Var, y yVar, y yVar2, List list) {
        int i;
        c81 c81Var = uq0.PxuCJdSBwIXG;
        c81 c81Var2 = new c81();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            PxuCJdSBwIXG((d32) list.get(i2), arrayList, yVar, yVar2, c81Var2);
        }
        int i3 = 1;
        char c = d32Var.TSizfFm2Yiuu.BjEWd04qc7Mw == cw0.OPXfSBeufaJ8 ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                d32 d32Var2 = (d32) arrayList.get(i4);
                if (i4 != 0) {
                    float f = d32Var2.rtx2ld2ELZv4().lS5Rgt96tfkO;
                    float f2 = d32Var2.rtx2ld2ELZv4().Y1f8riQaR6yg;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            qt1 qt1Var = (qt1) ((vi1) arrayList2.get(i6)).rtx2ld2ELZv4;
                            float f3 = qt1Var.lS5Rgt96tfkO;
                            i = i3;
                            float f4 = qt1Var.Y1f8riQaR6yg;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new vi1(new qt1(Math.max(qt1Var.PxuCJdSBwIXG, 0.0f), Math.max(qt1Var.lS5Rgt96tfkO, f), Math.min(qt1Var.TSizfFm2Yiuu, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((vi1) arrayList2.get(i6)).OPXfSBeufaJ8));
                                ((List) ((vi1) arrayList2.get(i6)).OPXfSBeufaJ8).add(d32Var2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                        arrayList2.add(new vi1(d32Var2.rtx2ld2ELZv4(), fx1.PsecLrZVVK61(d32Var2)));
                        if (i4 != size2) {
                            break;
                        }
                        i4++;
                        i3 = i;
                    }
                }
                i = i3;
                arrayList2.add(new vi1(d32Var2.rtx2ld2ELZv4(), fx1.PsecLrZVVK61(d32Var2)));
                if (i4 != size2) {
                }
            }
        } else {
            i = 1;
        }
        dl.Y2PHjkwWz56c(arrayList2, db0.a92UlCVFR9N8);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = PxuCJdSBwIXG[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            vi1 vi1Var = (vi1) arrayList2.get(i8);
            dl.Y2PHjkwWz56c((List) vi1Var.OPXfSBeufaJ8, comparator);
            arrayList3.addAll((Collection) vi1Var.OPXfSBeufaJ8);
        }
        int i9 = i;
        dl.Y2PHjkwWz56c(arrayList3, new om(i9, lS5Rgt96tfkO));
        int i10 = 0;
        while (i10 <= arrayList3.size() - i9) {
            List list2 = (List) c81Var2.lS5Rgt96tfkO(((d32) arrayList3.get(i10)).a92UlCVFR9N8);
            if (list2 != null) {
                if (((Boolean) yVar2.OPXfSBeufaJ8(arrayList3.get(i10))).booleanValue()) {
                    i10++;
                } else {
                    arrayList3.remove(i10);
                }
                arrayList3.addAll(i10, list2);
                i10 += list2.size();
            } else {
                i10++;
            }
        }
        return arrayList3;
    }
}
