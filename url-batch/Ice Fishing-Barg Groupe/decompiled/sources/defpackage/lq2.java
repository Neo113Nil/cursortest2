package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lq2 implements View.OnApplyWindowInsetsListener {
    public rt2 PxuCJdSBwIXG = null;
    public final /* synthetic */ lf1 TSizfFm2Yiuu;
    public final /* synthetic */ View lS5Rgt96tfkO;

    public lq2(View view, lf1 lf1Var) {
        this.lS5Rgt96tfkO = view;
        this.TSizfFm2Yiuu = lf1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        rt2 TSizfFm2Yiuu = rt2.TSizfFm2Yiuu(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        lf1 lf1Var = this.TSizfFm2Yiuu;
        if (i < 30) {
            mq2.PxuCJdSBwIXG(windowInsets, this.lS5Rgt96tfkO);
            if (TSizfFm2Yiuu.equals(this.PxuCJdSBwIXG)) {
                return lf1Var.PxuCJdSBwIXG(view, TSizfFm2Yiuu).lS5Rgt96tfkO();
            }
        }
        this.PxuCJdSBwIXG = TSizfFm2Yiuu;
        rt2 PxuCJdSBwIXG = lf1Var.PxuCJdSBwIXG(view, TSizfFm2Yiuu);
        if (i >= 30) {
            return PxuCJdSBwIXG.lS5Rgt96tfkO();
        }
        int i2 = rq2.PxuCJdSBwIXG;
        view.requestApplyInsets();
        return PxuCJdSBwIXG.lS5Rgt96tfkO();
    }
}
