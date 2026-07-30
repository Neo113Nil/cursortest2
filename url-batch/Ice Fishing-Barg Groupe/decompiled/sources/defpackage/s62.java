package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class s62 implements j51 {
    public final /* synthetic */ y62 PxuCJdSBwIXG;

    public s62(y62 y62Var) {
        this.PxuCJdSBwIXG = y62Var;
    }

    @Override // defpackage.j51
    public final k51 a92UlCVFR9N8(l51 l51Var, List list, long j) {
        int i;
        int max;
        int i2;
        int i3;
        int IXK6ba3ucyzm;
        y62 y62Var = this.PxuCJdSBwIXG;
        float[] fArr = y62Var.a92UlCVFR9N8;
        th1 th1Var = y62Var.x50lh2ztY7Y5;
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                c21.lS5Rgt96tfkO("Collection contains no element matching the predicate.");
                u9.Y1f8riQaR6yg();
                return null;
            }
            e51 e51Var = (e51) list.get(i4);
            if (cs0.pnx5pC0XzaCw(e51Var) == g62.rtx2ld2ELZv4) {
                final em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(j);
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    e51 e51Var2 = (e51) list.get(i5);
                    if (cs0.pnx5pC0XzaCw(e51Var2) == g62.OPXfSBeufaJ8) {
                        th1 th1Var2 = th1.rtx2ld2ELZv4;
                        final em1 e9gEMXR7LXtO2 = th1Var == th1Var2 ? e51Var2.e9gEMXR7LXtO(rr.PxuCJdSBwIXG(sr.wdg6QnbFHrFF(0, -e9gEMXR7LXtO.OPXfSBeufaJ8, 1, j), 0, 0, 0, 0, 14)) : e51Var2.e9gEMXR7LXtO(rr.PxuCJdSBwIXG(sr.wdg6QnbFHrFF(-e9gEMXR7LXtO.rtx2ld2ELZv4, 0, 2, j), 0, 0, 0, 0, 11));
                        final xt1 xt1Var = new xt1();
                        float lS5Rgt96tfkO = y62Var.lS5Rgt96tfkO();
                        fArr.getClass();
                        if (!cs0.OPXfSBeufaJ8(lS5Rgt96tfkO, fArr.length != 0 ? Float.valueOf(fArr[0]) : null)) {
                            cs0.OPXfSBeufaJ8(lS5Rgt96tfkO, na.JLGWdXyAxbxj(fArr));
                        }
                        e9gEMXR7LXtO2.yQRudnv4La6p(v62.a92UlCVFR9N8);
                        if (th1Var == th1Var2) {
                            i = Math.max(e9gEMXR7LXtO2.rtx2ld2ELZv4, e9gEMXR7LXtO.rtx2ld2ELZv4);
                            int i6 = e9gEMXR7LXtO.OPXfSBeufaJ8;
                            int i7 = e9gEMXR7LXtO2.OPXfSBeufaJ8;
                            max = i6 + i7;
                            i2 = (i - e9gEMXR7LXtO2.rtx2ld2ELZv4) / 2;
                            i3 = i6 / 2;
                            IXK6ba3ucyzm = (i - e9gEMXR7LXtO.rtx2ld2ELZv4) / 2;
                            xt1Var.rtx2ld2ELZv4 = b51.IXK6ba3ucyzm(i7 * lS5Rgt96tfkO);
                        } else {
                            i = e9gEMXR7LXtO.rtx2ld2ELZv4 + e9gEMXR7LXtO2.rtx2ld2ELZv4;
                            max = Math.max(e9gEMXR7LXtO2.OPXfSBeufaJ8, e9gEMXR7LXtO.OPXfSBeufaJ8);
                            i2 = e9gEMXR7LXtO.rtx2ld2ELZv4 / 2;
                            i3 = (max - e9gEMXR7LXtO2.OPXfSBeufaJ8) / 2;
                            IXK6ba3ucyzm = b51.IXK6ba3ucyzm(e9gEMXR7LXtO2.rtx2ld2ELZv4 * lS5Rgt96tfkO);
                            xt1Var.rtx2ld2ELZv4 = (max - e9gEMXR7LXtO.OPXfSBeufaJ8) / 2;
                        }
                        final int i8 = i3;
                        final int i9 = i2;
                        final int i10 = IXK6ba3ucyzm;
                        y62Var.RAsUl2FVSrh6.OPXfSBeufaJ8(i);
                        y62Var.rtx2ld2ELZv4.OPXfSBeufaJ8(max);
                        return l51Var.jJwa0q7P5wHq(i, max, q50.rtx2ld2ELZv4, new le0() { // from class: r62
                            @Override // defpackage.le0
                            public final Object OPXfSBeufaJ8(Object obj) {
                                dm1 dm1Var = (dm1) obj;
                                dm1.wdg6QnbFHrFF(dm1Var, em1.this, i9, i8);
                                dm1.wdg6QnbFHrFF(dm1Var, e9gEMXR7LXtO, i10, xt1Var.rtx2ld2ELZv4);
                                return no2.PxuCJdSBwIXG;
                            }
                        });
                    }
                }
                c21.lS5Rgt96tfkO("Collection contains no element matching the predicate.");
                u9.Y1f8riQaR6yg();
                return null;
            }
            i4++;
        }
    }
}
