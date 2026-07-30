package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class br1 {
    public final ArrayList PxuCJdSBwIXG = new ArrayList();
    public wp0 TSizfFm2Yiuu;
    public wp0 Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public int e9gEMXR7LXtO;
    public final uc2 lS5Rgt96tfkO;

    public br1(uc2 uc2Var, ArrayList arrayList) {
        wp0 wp0Var = wp0.e9gEMXR7LXtO;
        this.TSizfFm2Yiuu = wp0Var;
        this.Y1f8riQaR6yg = wp0Var;
        PxuCJdSBwIXG(arrayList, false);
        PxuCJdSBwIXG(arrayList, true);
        ArrayList arrayList2 = uc2Var.lS5Rgt96tfkO;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            wp0 wp0Var2 = uc2Var.TSizfFm2Yiuu;
            wp0 wp0Var3 = uc2Var.Y1f8riQaR6yg;
            this.TSizfFm2Yiuu = wp0Var2;
            this.Y1f8riQaR6yg = wp0Var3;
            TSizfFm2Yiuu();
            lS5Rgt96tfkO(uc2Var.e9gEMXR7LXtO);
        }
        this.lS5Rgt96tfkO = uc2Var;
    }

    public final void PxuCJdSBwIXG(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ol olVar = (ol) list.get(i);
            olVar.getClass();
            if (true == z) {
                br1 br1Var = olVar.e9gEMXR7LXtO;
                if (br1Var != null) {
                    throw new IllegalStateException(olVar + " (" + (i + 1) + "/" + size + ") is already controlled by " + br1Var + " but is still added to " + this);
                }
                olVar.e9gEMXR7LXtO = this;
                this.PxuCJdSBwIXG.add(olVar);
            }
        }
    }

    public final void TSizfFm2Yiuu() {
        int i;
        wp0 TSizfFm2Yiuu;
        ArrayList arrayList = this.PxuCJdSBwIXG;
        wp0 wp0Var = wp0.e9gEMXR7LXtO;
        wp0 wp0Var2 = wp0Var;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ol olVar = (ol) arrayList.get(size);
            wp0 wp0Var3 = this.TSizfFm2Yiuu;
            wp0 wp0Var4 = this.Y1f8riQaR6yg;
            olVar.TSizfFm2Yiuu = wp0Var3;
            ar1 ar1Var = olVar.lS5Rgt96tfkO;
            olVar.Y1f8riQaR6yg = wp0Var4;
            if (!ar1Var.TSizfFm2Yiuu.equals(wp0Var2)) {
                ar1Var.TSizfFm2Yiuu = wp0Var2;
                cr1 cr1Var = ar1Var.OPXfSBeufaJ8;
                if (cr1Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cr1Var.OPXfSBeufaJ8;
                    layoutParams.leftMargin = wp0Var2.PxuCJdSBwIXG;
                    layoutParams.topMargin = wp0Var2.lS5Rgt96tfkO;
                    layoutParams.rightMargin = wp0Var2.TSizfFm2Yiuu;
                    layoutParams.bottomMargin = wp0Var2.Y1f8riQaR6yg;
                    ((View) cr1Var.wdg6QnbFHrFF).setLayoutParams(layoutParams);
                }
            }
            int i2 = olVar.PxuCJdSBwIXG;
            if (i2 == 1) {
                i = olVar.TSizfFm2Yiuu.PxuCJdSBwIXG;
                int i3 = olVar.Y1f8riQaR6yg.PxuCJdSBwIXG;
                if (ar1Var.PxuCJdSBwIXG != i3) {
                    ar1Var.PxuCJdSBwIXG = i3;
                    cr1 cr1Var2 = ar1Var.OPXfSBeufaJ8;
                    if (cr1Var2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) cr1Var2.OPXfSBeufaJ8;
                        layoutParams2.width = i3;
                        ((View) cr1Var2.wdg6QnbFHrFF).setLayoutParams(layoutParams2);
                    }
                }
                TSizfFm2Yiuu = wp0.TSizfFm2Yiuu(i, 0, 0, 0);
            } else if (i2 == 2) {
                i = olVar.TSizfFm2Yiuu.lS5Rgt96tfkO;
                int i4 = olVar.Y1f8riQaR6yg.lS5Rgt96tfkO;
                if (ar1Var.lS5Rgt96tfkO != i4) {
                    ar1Var.lS5Rgt96tfkO = i4;
                    cr1 cr1Var3 = ar1Var.OPXfSBeufaJ8;
                    if (cr1Var3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) cr1Var3.OPXfSBeufaJ8;
                        layoutParams3.height = i4;
                        ((View) cr1Var3.wdg6QnbFHrFF).setLayoutParams(layoutParams3);
                    }
                }
                TSizfFm2Yiuu = wp0.TSizfFm2Yiuu(0, i, 0, 0);
            } else if (i2 == 4) {
                i = olVar.TSizfFm2Yiuu.TSizfFm2Yiuu;
                int i5 = olVar.Y1f8riQaR6yg.TSizfFm2Yiuu;
                if (ar1Var.PxuCJdSBwIXG != i5) {
                    ar1Var.PxuCJdSBwIXG = i5;
                    cr1 cr1Var4 = ar1Var.OPXfSBeufaJ8;
                    if (cr1Var4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) cr1Var4.OPXfSBeufaJ8;
                        layoutParams4.width = i5;
                        ((View) cr1Var4.wdg6QnbFHrFF).setLayoutParams(layoutParams4);
                    }
                }
                TSizfFm2Yiuu = wp0.TSizfFm2Yiuu(0, 0, i, 0);
            } else if (i2 != 8) {
                TSizfFm2Yiuu = wp0Var;
                i = 0;
            } else {
                i = olVar.TSizfFm2Yiuu.Y1f8riQaR6yg;
                int i6 = olVar.Y1f8riQaR6yg.Y1f8riQaR6yg;
                if (ar1Var.lS5Rgt96tfkO != i6) {
                    ar1Var.lS5Rgt96tfkO = i6;
                    cr1 cr1Var5 = ar1Var.OPXfSBeufaJ8;
                    if (cr1Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) cr1Var5.OPXfSBeufaJ8;
                        layoutParams5.height = i6;
                        ((View) cr1Var5.wdg6QnbFHrFF).setLayoutParams(layoutParams5);
                    }
                }
                TSizfFm2Yiuu = wp0.TSizfFm2Yiuu(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (ar1Var.Y1f8riQaR6yg != z) {
                ar1Var.Y1f8riQaR6yg = z;
                cr1 cr1Var6 = ar1Var.OPXfSBeufaJ8;
                if (cr1Var6 != null) {
                    ((View) cr1Var6.wdg6QnbFHrFF).setVisibility(z ? 0 : 8);
                }
            }
            float f = 0.0f;
            olVar.PxuCJdSBwIXG(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            olVar.lS5Rgt96tfkO(f);
            wp0Var2 = wp0.PxuCJdSBwIXG(wp0Var2, TSizfFm2Yiuu);
        }
    }

    public final void lS5Rgt96tfkO(int i) {
        ArrayList arrayList = this.PxuCJdSBwIXG;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ol olVar = (ol) arrayList.get(size);
            if (!olVar.RAsUl2FVSrh6) {
                ColorDrawable colorDrawable = olVar.a92UlCVFR9N8;
                if (olVar.rtx2ld2ELZv4 != i) {
                    olVar.rtx2ld2ELZv4 = i;
                    colorDrawable.setColor(i);
                    ar1 ar1Var = olVar.lS5Rgt96tfkO;
                    ar1Var.e9gEMXR7LXtO = colorDrawable;
                    cr1 cr1Var = ar1Var.OPXfSBeufaJ8;
                    if (cr1Var != null) {
                        ((View) cr1Var.wdg6QnbFHrFF).setBackground(colorDrawable);
                    }
                }
            }
        }
    }
}
