package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ph1 extends ng0 {
    public int Y1f8riQaR6yg;
    public int a92UlCVFR9N8;
    public int rtx2ld2ELZv4;
    public nh1[] TSizfFm2Yiuu = new nh1[16];
    public int[] e9gEMXR7LXtO = new int[16];
    public Object[] RAsUl2FVSrh6 = new Object[16];

    public final boolean POWyO8hTM6YC() {
        return this.Y1f8riQaR6yg == 0;
    }

    public final void Pf0ThKz3j5YS() {
        this.Y1f8riQaR6yg = 0;
        this.a92UlCVFR9N8 = 0;
        Arrays.fill(this.RAsUl2FVSrh6, 0, this.rtx2ld2ELZv4, (Object) null);
        this.rtx2ld2ELZv4 = 0;
    }

    public final void gGoUzNp9JO5I(r9 r9Var, e72 e72Var, ju1 ju1Var, oh1 oh1Var) {
        if (this.Y1f8riQaR6yg != 0) {
            of0 of0Var = new of0(this);
            ph1 ph1Var = (ph1) of0Var.e9gEMXR7LXtO;
            while (true) {
                nh1 nh1Var = ph1Var.TSizfFm2Yiuu[of0Var.lS5Rgt96tfkO];
                nf0 lS5Rgt96tfkO = nh1Var.lS5Rgt96tfkO(of0Var);
                r9 r9Var2 = r9Var;
                e72 e72Var2 = e72Var;
                ju1 ju1Var2 = ju1Var;
                oh1 oh1Var2 = oh1Var;
                try {
                    nh1Var.PxuCJdSBwIXG(of0Var, r9Var2, e72Var2, ju1Var2, oh1Var2);
                    int i = of0Var.lS5Rgt96tfkO;
                    int i2 = ph1Var.Y1f8riQaR6yg;
                    if (i < i2) {
                        nh1 nh1Var2 = ph1Var.TSizfFm2Yiuu[i];
                        of0Var.TSizfFm2Yiuu += nh1Var2.PxuCJdSBwIXG;
                        of0Var.Y1f8riQaR6yg += nh1Var2.lS5Rgt96tfkO;
                        int i3 = i + 1;
                        of0Var.lS5Rgt96tfkO = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        r9Var = r9Var2;
                        e72Var = e72Var2;
                        ju1Var = ju1Var2;
                        oh1Var = oh1Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        Pf0ThKz3j5YS();
    }

    public final void i68hK7ahKtgp(nh1 nh1Var) {
        int i = this.Y1f8riQaR6yg;
        nh1[] nh1VarArr = this.TSizfFm2Yiuu;
        if (i == nh1VarArr.length) {
            nh1[] nh1VarArr2 = new nh1[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(nh1VarArr, 0, nh1VarArr2, 0, i);
            this.TSizfFm2Yiuu = nh1VarArr2;
        }
        int i2 = this.a92UlCVFR9N8;
        int i3 = nh1Var.PxuCJdSBwIXG;
        int i4 = nh1Var.lS5Rgt96tfkO;
        int i5 = i2 + i3;
        int[] iArr = this.e9gEMXR7LXtO;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            na.PsecLrZVVK61(iArr, iArr2, 0, 0, length);
            this.e9gEMXR7LXtO = iArr2;
        }
        int i7 = this.rtx2ld2ELZv4 + i4;
        Object[] objArr = this.RAsUl2FVSrh6;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.RAsUl2FVSrh6 = objArr2;
        }
        nh1[] nh1VarArr3 = this.TSizfFm2Yiuu;
        int i9 = this.Y1f8riQaR6yg;
        this.Y1f8riQaR6yg = i9 + 1;
        nh1VarArr3[i9] = nh1Var;
        this.a92UlCVFR9N8 += nh1Var.PxuCJdSBwIXG;
        this.rtx2ld2ELZv4 += i4;
    }
}
