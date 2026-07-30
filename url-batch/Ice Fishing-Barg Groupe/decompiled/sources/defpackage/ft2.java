package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ft2 {
    public final rt2 PxuCJdSBwIXG;
    public final Rect[][] TSizfFm2Yiuu;
    public final Rect[][] Y1f8riQaR6yg;
    public wp0[] lS5Rgt96tfkO;

    public ft2(rt2 rt2Var) {
        this.TSizfFm2Yiuu = new Rect[10][];
        this.Y1f8riQaR6yg = new Rect[10][];
        this.PxuCJdSBwIXG = rt2Var;
        TSizfFm2Yiuu(rt2Var);
    }

    public final void PxuCJdSBwIXG() {
        wp0[] wp0VarArr = this.lS5Rgt96tfkO;
        if (wp0VarArr != null) {
            wp0 wp0Var = wp0VarArr[0];
            wp0 wp0Var2 = wp0VarArr[1];
            rt2 rt2Var = this.PxuCJdSBwIXG;
            if (wp0Var2 == null) {
                wp0Var2 = rt2Var.PxuCJdSBwIXG.rtx2ld2ELZv4(2);
            }
            if (wp0Var == null) {
                wp0Var = rt2Var.PxuCJdSBwIXG.rtx2ld2ELZv4(1);
            }
            rtx2ld2ELZv4(wp0.PxuCJdSBwIXG(wp0Var, wp0Var2));
            wp0 wp0Var3 = this.lS5Rgt96tfkO[jh0.VhhvGxCb8gfr(16)];
            if (wp0Var3 != null) {
                RAsUl2FVSrh6(wp0Var3);
            }
            wp0 wp0Var4 = this.lS5Rgt96tfkO[jh0.VhhvGxCb8gfr(32)];
            if (wp0Var4 != null) {
                e9gEMXR7LXtO(wp0Var4);
            }
            wp0 wp0Var5 = this.lS5Rgt96tfkO[jh0.VhhvGxCb8gfr(64)];
            if (wp0Var5 != null) {
                OPXfSBeufaJ8(wp0Var5);
            }
        }
    }

    public void TSizfFm2Yiuu(rt2 rt2Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e9gEMXR7LXtO = rt2Var.PxuCJdSBwIXG.e9gEMXR7LXtO(i);
            int VhhvGxCb8gfr = jh0.VhhvGxCb8gfr(i);
            this.TSizfFm2Yiuu[VhhvGxCb8gfr] = (Rect[]) e9gEMXR7LXtO.toArray(new Rect[e9gEMXR7LXtO.size()]);
            if (i != 8) {
                List<Rect> a92UlCVFR9N8 = rt2Var.PxuCJdSBwIXG.a92UlCVFR9N8(i);
                this.Y1f8riQaR6yg[VhhvGxCb8gfr] = (Rect[]) a92UlCVFR9N8.toArray(new Rect[a92UlCVFR9N8.size()]);
            }
        }
    }

    public void Y1f8riQaR6yg(int i, wp0 wp0Var) {
        if (this.lS5Rgt96tfkO == null) {
            this.lS5Rgt96tfkO = new wp0[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.lS5Rgt96tfkO[jh0.VhhvGxCb8gfr(i2)] = wp0Var;
            }
        }
    }

    public abstract void a92UlCVFR9N8(wp0 wp0Var);

    public abstract rt2 lS5Rgt96tfkO();

    public abstract void rtx2ld2ELZv4(wp0 wp0Var);

    public ft2() {
        this(new rt2());
    }

    public void OPXfSBeufaJ8(wp0 wp0Var) {
    }

    public void RAsUl2FVSrh6(wp0 wp0Var) {
    }

    public void e9gEMXR7LXtO(wp0 wp0Var) {
    }
}
