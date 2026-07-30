package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cz0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final c81 PxuCJdSBwIXG;
    public final /* synthetic */ int RAsUl2FVSrh6;
    public final fy0 TSizfFm2Yiuu;
    public final long Y1f8riQaR6yg;
    public final /* synthetic */ int a92UlCVFR9N8;
    public final /* synthetic */ long dgRBjINgWbAK;
    public final /* synthetic */ fy0 e9gEMXR7LXtO;
    public final zy0 lS5Rgt96tfkO;
    public final /* synthetic */ nd rtx2ld2ELZv4;
    public final /* synthetic */ int wdg6QnbFHrFF;
    public final /* synthetic */ jz0 x50lh2ztY7Y5;

    public cz0(long j, zy0 zy0Var, fy0 fy0Var, int i, int i2, nd ndVar, int i3, int i4, long j2, jz0 jz0Var) {
        this.e9gEMXR7LXtO = fy0Var;
        this.a92UlCVFR9N8 = i;
        this.RAsUl2FVSrh6 = i2;
        this.rtx2ld2ELZv4 = ndVar;
        this.OPXfSBeufaJ8 = i3;
        this.wdg6QnbFHrFF = i4;
        this.dgRBjINgWbAK = j2;
        this.x50lh2ztY7Y5 = jz0Var;
        c81 c81Var = uq0.PxuCJdSBwIXG;
        this.PxuCJdSBwIXG = new c81();
        this.lS5Rgt96tfkO = zy0Var;
        this.TSizfFm2Yiuu = fy0Var;
        this.Y1f8riQaR6yg = sr.lS5Rgt96tfkO(0, rr.rtx2ld2ELZv4(j), 0, Integer.MAX_VALUE, 5);
    }

    public final fz0 PxuCJdSBwIXG(int i, long j) {
        long j2;
        List list;
        zy0 zy0Var = this.lS5Rgt96tfkO;
        Object Y1f8riQaR6yg = zy0Var.Y1f8riQaR6yg(i);
        zy0Var.lS5Rgt96tfkO(i);
        c81 c81Var = this.PxuCJdSBwIXG;
        List list2 = (List) c81Var.lS5Rgt96tfkO(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            fy0 fy0Var = this.TSizfFm2Yiuu;
            zy0 zy0Var2 = fy0Var.wdg6QnbFHrFF;
            c81 c81Var2 = fy0Var.dgRBjINgWbAK;
            List list3 = (List) c81Var2.lS5Rgt96tfkO(i);
            if (list3 == null) {
                Object Y1f8riQaR6yg2 = zy0Var2.Y1f8riQaR6yg(i);
                zy0Var2.lS5Rgt96tfkO(i);
                list3 = fy0Var.OPXfSBeufaJ8.J54yh1s3n4Aq(fy0Var.rtx2ld2ELZv4.PxuCJdSBwIXG(i, Y1f8riQaR6yg2, null), Y1f8riQaR6yg2);
                c81Var2.rtx2ld2ELZv4(i, list3);
            }
            int size = list3.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((e51) list3.get(i2)).e9gEMXR7LXtO(j));
            }
            j2 = j;
            c81Var.rtx2ld2ELZv4(i, arrayList);
            list = arrayList;
        }
        return new fz0(i, list, this.rtx2ld2ELZv4, this.e9gEMXR7LXtO.OPXfSBeufaJ8.getLayoutDirection(), this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, i != this.a92UlCVFR9N8 + (-1) ? this.RAsUl2FVSrh6 : 0, this.dgRBjINgWbAK, Y1f8riQaR6yg, null, this.x50lh2ztY7Y5.r3s1LDPKFs1S, j2);
    }
}
