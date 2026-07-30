package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sz extends ns2 {
    public final /* synthetic */ tz wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz(tz tzVar) {
        super(1);
        this.wdg6QnbFHrFF = tzVar;
    }

    @Override // defpackage.ns2
    public final rt2 Y1f8riQaR6yg(rt2 rt2Var, List list) {
        tz tzVar = this.wdg6QnbFHrFF;
        if (!tzVar.EcgxDIVH5in8) {
            View childAt = tzVar.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, tzVar.getWidth() - childAt.getRight());
            int max4 = Math.max(0, tzVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return rt2Var.PxuCJdSBwIXG.BRwzKIf41E4i(max, max2, max3, max4);
            }
        }
        return rt2Var;
    }

    @Override // defpackage.ns2
    public final cr1 e9gEMXR7LXtO(xs2 xs2Var, cr1 cr1Var) {
        tz tzVar = this.wdg6QnbFHrFF;
        if (!tzVar.EcgxDIVH5in8) {
            View childAt = tzVar.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, tzVar.getWidth() - childAt.getRight());
            int max4 = Math.max(0, tzVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                wp0 TSizfFm2Yiuu = wp0.TSizfFm2Yiuu(max, max2, max3, max4);
                int i = TSizfFm2Yiuu.PxuCJdSBwIXG;
                wp0 wp0Var = (wp0) cr1Var.OPXfSBeufaJ8;
                int i2 = TSizfFm2Yiuu.lS5Rgt96tfkO;
                int i3 = TSizfFm2Yiuu.TSizfFm2Yiuu;
                int i4 = TSizfFm2Yiuu.Y1f8riQaR6yg;
                return new cr1(11, rt2.PxuCJdSBwIXG(wp0Var, i, i2, i3, i4), rt2.PxuCJdSBwIXG((wp0) cr1Var.wdg6QnbFHrFF, i, i2, i3, i4));
            }
        }
        return cr1Var;
    }
}
