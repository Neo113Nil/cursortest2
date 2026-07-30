package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class kt2 extends jt2 {
    public static final rt2 VhhvGxCb8gfr;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        VhhvGxCb8gfr = rt2.TSizfFm2Yiuu(windowInsets, null);
    }

    public kt2(rt2 rt2Var, WindowInsets windowInsets) {
        super(rt2Var, windowInsets);
    }

    @Override // defpackage.gt2, defpackage.ot2
    public boolean EcgxDIVH5in8(int i) {
        boolean isVisible;
        isVisible = this.TSizfFm2Yiuu.isVisible(pt2.PxuCJdSBwIXG(i));
        return isVisible;
    }

    @Override // defpackage.gt2, defpackage.ot2
    public wp0 OPXfSBeufaJ8(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.TSizfFm2Yiuu.getInsetsIgnoringVisibility(pt2.PxuCJdSBwIXG(i));
        return wp0.Y1f8riQaR6yg(insetsIgnoringVisibility);
    }

    @Override // defpackage.gt2, defpackage.ot2
    public wp0 rtx2ld2ELZv4(int i) {
        Insets insets;
        insets = this.TSizfFm2Yiuu.getInsets(pt2.PxuCJdSBwIXG(i));
        return wp0.Y1f8riQaR6yg(insets);
    }

    @Override // defpackage.gt2, defpackage.ot2
    public final void Y1f8riQaR6yg(View view) {
    }
}
