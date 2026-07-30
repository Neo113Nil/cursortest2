package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z6 implements vq2 {
    public final ViewConfiguration PxuCJdSBwIXG;

    public z6(ViewConfiguration viewConfiguration) {
        this.PxuCJdSBwIXG = viewConfiguration;
    }

    @Override // defpackage.vq2
    public final float PxuCJdSBwIXG() {
        return this.PxuCJdSBwIXG.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.vq2
    public final long TSizfFm2Yiuu() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.vq2
    public final float Y1f8riQaR6yg() {
        return this.PxuCJdSBwIXG.getScaledTouchSlop();
    }

    @Override // defpackage.vq2
    public final float a92UlCVFR9N8() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT < 34) {
            return 16.0f;
        }
        scaledHandwritingGestureLineMargin = this.PxuCJdSBwIXG.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }

    @Override // defpackage.vq2
    public final float e9gEMXR7LXtO() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT < 34) {
            return 2.0f;
        }
        scaledHandwritingSlop = this.PxuCJdSBwIXG.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }

    @Override // defpackage.vq2
    public final long lS5Rgt96tfkO() {
        return ViewConfiguration.getDoubleTapTimeout();
    }
}
