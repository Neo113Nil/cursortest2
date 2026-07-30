package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ex0 implements k51 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final /* synthetic */ jx0 TSizfFm2Yiuu;
    public final /* synthetic */ int Y1f8riQaR6yg;
    public final /* synthetic */ k51 e9gEMXR7LXtO;
    public final /* synthetic */ k51 lS5Rgt96tfkO;

    public /* synthetic */ ex0(k51 k51Var, jx0 jx0Var, int i, k51 k51Var2, int i2) {
        this.PxuCJdSBwIXG = i2;
        this.TSizfFm2Yiuu = jx0Var;
        this.Y1f8riQaR6yg = i;
        this.e9gEMXR7LXtO = k51Var2;
        this.lS5Rgt96tfkO = k51Var;
    }

    @Override // defpackage.k51
    public final Map PxuCJdSBwIXG() {
        switch (this.PxuCJdSBwIXG) {
        }
        return this.lS5Rgt96tfkO.PxuCJdSBwIXG();
    }

    @Override // defpackage.k51
    public final int TSizfFm2Yiuu() {
        switch (this.PxuCJdSBwIXG) {
        }
        return this.lS5Rgt96tfkO.TSizfFm2Yiuu();
    }

    @Override // defpackage.k51
    public final le0 Y1f8riQaR6yg() {
        switch (this.PxuCJdSBwIXG) {
        }
        return this.lS5Rgt96tfkO.Y1f8riQaR6yg();
    }

    @Override // defpackage.k51
    public final int e9gEMXR7LXtO() {
        switch (this.PxuCJdSBwIXG) {
        }
        return this.lS5Rgt96tfkO.e9gEMXR7LXtO();
    }

    @Override // defpackage.k51
    public final void lS5Rgt96tfkO() {
        int i;
        int i2 = this.PxuCJdSBwIXG;
        k51 k51Var = this.e9gEMXR7LXtO;
        int i3 = this.Y1f8riQaR6yg;
        jx0 jx0Var = this.TSizfFm2Yiuu;
        switch (i2) {
            case 0:
                jx0Var.x50lh2ztY7Y5 = i3;
                k51Var.lS5Rgt96tfkO();
                f91 f91Var = jx0Var.EcgxDIVH5in8;
                v81 v81Var = jx0Var.RfyTYNmI9Srp;
                long[] jArr = v81Var.PxuCJdSBwIXG;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = v81Var.lS5Rgt96tfkO[i8];
                                    eb2 eb2Var = (eb2) v81Var.TSizfFm2Yiuu[i8];
                                    int OPXfSBeufaJ8 = f91Var.OPXfSBeufaJ8(obj);
                                    if (OPXfSBeufaJ8 < 0 || OPXfSBeufaJ8 >= jx0Var.x50lh2ztY7Y5) {
                                        if (OPXfSBeufaJ8 >= 0) {
                                            Object obj2 = cs0.PsecLrZVVK61;
                                            i = i5;
                                            Object[] objArr = f91Var.rtx2ld2ELZv4;
                                            Object obj3 = objArr[OPXfSBeufaJ8];
                                            objArr[OPXfSBeufaJ8] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (jx0Var.BRwzKIf41E4i.lS5Rgt96tfkO(obj)) {
                                            eb2Var.PxuCJdSBwIXG();
                                        }
                                        v81Var.x50lh2ztY7Y5(i8);
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                    }
                                }
                                i = i5;
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 != i5) {
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                jx0Var.RAsUl2FVSrh6(jx0Var.dgRBjINgWbAK);
                break;
            default:
                jx0Var.dgRBjINgWbAK = i3;
                k51Var.lS5Rgt96tfkO();
                if (jx0Var.rtx2ld2ELZv4.QrzZRwfaDlRX == null) {
                    jx0Var.RAsUl2FVSrh6(jx0Var.dgRBjINgWbAK);
                    break;
                }
                break;
        }
    }
}
