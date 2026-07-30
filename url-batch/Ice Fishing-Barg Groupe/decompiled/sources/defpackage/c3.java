package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c3 implements j51 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public static final c3 lS5Rgt96tfkO = new c3(0);
    public static final c3 TSizfFm2Yiuu = new c3(1);
    public static final c3 Y1f8riQaR6yg = new c3(2);
    public static final c3 e9gEMXR7LXtO = new c3(3);
    public static final wnqUPcAvl7HT a92UlCVFR9N8 = new wnqUPcAvl7HT(5);
    public static final c3 RAsUl2FVSrh6 = new c3(4);
    public static final c3 rtx2ld2ELZv4 = new c3(5);

    public /* synthetic */ c3(int i) {
        this.PxuCJdSBwIXG = i;
    }

    @Override // defpackage.j51
    public final k51 a92UlCVFR9N8(l51 l51Var, List list, long j) {
        int i = this.PxuCJdSBwIXG;
        q50 q50Var = q50.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    em1 e9gEMXR7LXtO2 = ((e51) list.get(i4)).e9gEMXR7LXtO(j);
                    i2 = Math.max(i2, e9gEMXR7LXtO2.rtx2ld2ELZv4);
                    i3 = Math.max(i3, e9gEMXR7LXtO2.OPXfSBeufaJ8);
                    arrayList.add(e9gEMXR7LXtO2);
                }
                if (list.isEmpty()) {
                    i2 = rr.wdg6QnbFHrFF(j);
                    i3 = rr.OPXfSBeufaJ8(j);
                }
                return l51Var.jJwa0q7P5wHq(i2, i3, q50Var, new b3(0, arrayList));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return l51Var.jJwa0q7P5wHq(0, 0, q50Var, k1.XL4ISE6Oc65B);
                }
                if (size2 == 1) {
                    em1 e9gEMXR7LXtO3 = ((e51) list.get(0)).e9gEMXR7LXtO(j);
                    return l51Var.jJwa0q7P5wHq(e9gEMXR7LXtO3.rtx2ld2ELZv4, e9gEMXR7LXtO3.OPXfSBeufaJ8, q50Var, new d1(e9gEMXR7LXtO3, 1));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int i5 = 0;
                int i6 = 0;
                while (r1 < size3) {
                    em1 e9gEMXR7LXtO4 = ((e51) list.get(r1)).e9gEMXR7LXtO(j);
                    i5 = Math.max(i5, e9gEMXR7LXtO4.rtx2ld2ELZv4);
                    i6 = Math.max(i6, e9gEMXR7LXtO4.OPXfSBeufaJ8);
                    arrayList2.add(e9gEMXR7LXtO4);
                    r1++;
                }
                return l51Var.jJwa0q7P5wHq(i5, i6, q50Var, new b3(1, arrayList2));
            case 2:
                return l51Var.jJwa0q7P5wHq(rr.wdg6QnbFHrFF(j), rr.OPXfSBeufaJ8(j), q50Var, new wnqUPcAvl7HT(5));
            case 3:
                return l51Var.jJwa0q7P5wHq(rr.rtx2ld2ELZv4(j), rr.RAsUl2FVSrh6(j), q50Var, a92UlCVFR9N8);
            case 4:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                int i7 = 0;
                int i8 = 0;
                while (r1 < size4) {
                    em1 e9gEMXR7LXtO5 = ((e51) list.get(r1)).e9gEMXR7LXtO(j);
                    i7 = Math.max(i7, e9gEMXR7LXtO5.rtx2ld2ELZv4);
                    i8 = Math.max(i8, e9gEMXR7LXtO5.OPXfSBeufaJ8);
                    arrayList3.add(e9gEMXR7LXtO5);
                    r1++;
                }
                return l51Var.jJwa0q7P5wHq(i7, i8, q50Var, new xw1(5, arrayList3));
            default:
                return l51Var.jJwa0q7P5wHq(rr.a92UlCVFR9N8(j) ? rr.rtx2ld2ELZv4(j) : 0, rr.e9gEMXR7LXtO(j) ? rr.RAsUl2FVSrh6(j) : 0, q50Var, new wnqUPcAvl7HT(5));
        }
    }
}
