package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uc2 {
    public final rc2 PxuCJdSBwIXG;
    public wp0 TSizfFm2Yiuu;
    public wp0 Y1f8riQaR6yg;
    public int e9gEMXR7LXtO;
    public final ArrayList lS5Rgt96tfkO = new ArrayList();

    public uc2(ViewGroup viewGroup) {
        View view;
        wp0 wp0Var = wp0.e9gEMXR7LXtO;
        this.TSizfFm2Yiuu = wp0Var;
        this.Y1f8riQaR6yg = wp0Var;
        Drawable background = viewGroup.getBackground();
        int i = 0;
        this.e9gEMXR7LXtO = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        rc2 rc2Var = new rc2(this, viewGroup.getContext(), viewGroup);
        this.PxuCJdSBwIXG = rc2Var;
        rc2Var.setVisibility(8);
        rc2Var.setWillNotDraw(true);
        rf1 rf1Var = new rf1(this);
        int i2 = rq2.PxuCJdSBwIXG;
        mq2.lS5Rgt96tfkO(rc2Var, rf1Var);
        rq2.PxuCJdSBwIXG(rc2Var, new sc2(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                view = null;
                break;
            }
            view = viewGroup.getChildAt(childCount);
            if (view.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (view == null) {
            viewGroup.addView(rc2Var, 0);
        } else {
            view.addOnAttachStateChangeListener(new tc2(viewGroup, rc2Var, i));
        }
    }
}
