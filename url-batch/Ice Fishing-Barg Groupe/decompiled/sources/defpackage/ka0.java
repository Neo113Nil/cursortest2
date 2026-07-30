package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ka0 {
    public static final int[] PxuCJdSBwIXG = new int[2];
    public static final Rect lS5Rgt96tfkO = new Rect();

    public static final qt1 PxuCJdSBwIXG(View view, r1 r1Var) {
        int[] iArr = PxuCJdSBwIXG;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        r1Var.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(lS5Rgt96tfkO);
        float f2 = (i - i3) + r1.left;
        return new qt1(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }

    public static final ga0 lS5Rgt96tfkO(int i) {
        if (i == 1) {
            ga0.Companion.getClass();
            return new ga0(2);
        }
        if (i == 2) {
            ga0.Companion.getClass();
            return new ga0(1);
        }
        if (i == 17) {
            ga0.Companion.getClass();
            return new ga0(3);
        }
        if (i == 33) {
            ga0.Companion.getClass();
            return new ga0(5);
        }
        if (i == 66) {
            ga0.Companion.getClass();
            return new ga0(4);
        }
        if (i != 130) {
            return null;
        }
        ga0.Companion.getClass();
        return new ga0(6);
    }
}
