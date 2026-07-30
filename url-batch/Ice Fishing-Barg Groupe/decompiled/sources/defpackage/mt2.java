package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class mt2 extends lt2 {
    public static final rt2 S2OOm9zPNm0h;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        S2OOm9zPNm0h = rt2.TSizfFm2Yiuu(windowInsets, null);
    }

    public mt2(rt2 rt2Var, WindowInsets windowInsets) {
        super(rt2Var, windowInsets);
    }

    @Override // defpackage.kt2, defpackage.gt2, defpackage.ot2
    public boolean EcgxDIVH5in8(int i) {
        boolean isVisible;
        isVisible = this.TSizfFm2Yiuu.isVisible(qt2.PxuCJdSBwIXG(i));
        return isVisible;
    }

    @Override // defpackage.kt2, defpackage.gt2, defpackage.ot2
    public wp0 OPXfSBeufaJ8(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.TSizfFm2Yiuu.getInsetsIgnoringVisibility(qt2.PxuCJdSBwIXG(i));
        return wp0.Y1f8riQaR6yg(insetsIgnoringVisibility);
    }

    @Override // defpackage.kt2, defpackage.gt2, defpackage.ot2
    public wp0 rtx2ld2ELZv4(int i) {
        Insets insets;
        insets = this.TSizfFm2Yiuu.getInsets(qt2.PxuCJdSBwIXG(i));
        return wp0.Y1f8riQaR6yg(insets);
    }

    @Override // defpackage.gt2, defpackage.ot2
    public void QrzZRwfaDlRX(View view) {
    }
}
