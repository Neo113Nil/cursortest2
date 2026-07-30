package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ol {
    public final int PxuCJdSBwIXG;
    public boolean RAsUl2FVSrh6;
    public wp0 TSizfFm2Yiuu;
    public wp0 Y1f8riQaR6yg;
    public final ColorDrawable a92UlCVFR9N8;
    public br1 e9gEMXR7LXtO;
    public final ar1 lS5Rgt96tfkO;
    public int rtx2ld2ELZv4;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public ol(int i, int i2) {
        ar1 ar1Var = new ar1();
        ar1Var.PxuCJdSBwIXG = -1;
        ar1Var.lS5Rgt96tfkO = -1;
        wp0 wp0Var = wp0.e9gEMXR7LXtO;
        ar1Var.TSizfFm2Yiuu = wp0Var;
        ar1Var.Y1f8riQaR6yg = false;
        ar1Var.e9gEMXR7LXtO = null;
        ar1Var.a92UlCVFR9N8 = 0.0f;
        ar1Var.RAsUl2FVSrh6 = 0.0f;
        ar1Var.rtx2ld2ELZv4 = 1.0f;
        this.lS5Rgt96tfkO = ar1Var;
        this.TSizfFm2Yiuu = wp0Var;
        this.Y1f8riQaR6yg = wp0Var;
        this.e9gEMXR7LXtO = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Unexpected side: ", i));
            throw null;
        }
        this.PxuCJdSBwIXG = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.a92UlCVFR9N8 = colorDrawable;
        this.rtx2ld2ELZv4 = 0;
        this.RAsUl2FVSrh6 = true;
        if (i2 != 0) {
            this.rtx2ld2ELZv4 = i2;
            colorDrawable.setColor(i2);
            ar1Var.e9gEMXR7LXtO = colorDrawable;
            cr1 cr1Var = ar1Var.OPXfSBeufaJ8;
            if (cr1Var != null) {
                ((View) cr1Var.wdg6QnbFHrFF).setBackground(colorDrawable);
            }
        }
    }

    public final void PxuCJdSBwIXG(float f) {
        float f2 = f * 1.0f;
        ar1 ar1Var = this.lS5Rgt96tfkO;
        if (ar1Var.rtx2ld2ELZv4 != f2) {
            ar1Var.rtx2ld2ELZv4 = f2;
            cr1 cr1Var = ar1Var.OPXfSBeufaJ8;
            if (cr1Var != null) {
                ((View) cr1Var.wdg6QnbFHrFF).setAlpha(f2);
            }
        }
    }

    public final void lS5Rgt96tfkO(float f) {
        float f2 = f * 1.0f;
        ar1 ar1Var = this.lS5Rgt96tfkO;
        int i = this.PxuCJdSBwIXG;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * ar1Var.PxuCJdSBwIXG;
            if (ar1Var.a92UlCVFR9N8 != f3) {
                ar1Var.a92UlCVFR9N8 = f3;
                cr1 cr1Var = ar1Var.OPXfSBeufaJ8;
                if (cr1Var != null) {
                    ((View) cr1Var.wdg6QnbFHrFF).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * ar1Var.lS5Rgt96tfkO;
            if (ar1Var.RAsUl2FVSrh6 != f4) {
                ar1Var.RAsUl2FVSrh6 = f4;
                cr1 cr1Var2 = ar1Var.OPXfSBeufaJ8;
                if (cr1Var2 != null) {
                    ((View) cr1Var2.wdg6QnbFHrFF).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * ar1Var.PxuCJdSBwIXG;
            if (ar1Var.a92UlCVFR9N8 != f5) {
                ar1Var.a92UlCVFR9N8 = f5;
                cr1 cr1Var3 = ar1Var.OPXfSBeufaJ8;
                if (cr1Var3 != null) {
                    ((View) cr1Var3.wdg6QnbFHrFF).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * ar1Var.lS5Rgt96tfkO;
        if (ar1Var.RAsUl2FVSrh6 != f6) {
            ar1Var.RAsUl2FVSrh6 = f6;
            cr1 cr1Var4 = ar1Var.OPXfSBeufaJ8;
            if (cr1Var4 != null) {
                ((View) cr1Var4.wdg6QnbFHrFF).setTranslationY(f6);
            }
        }
    }
}
