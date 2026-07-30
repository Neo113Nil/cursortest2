package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xs2 {
    public ws2 PxuCJdSBwIXG;

    public xs2(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.PxuCJdSBwIXG = new vs2(uURZJOrwXbxn.wdg6QnbFHrFF(i, interpolator, j));
        } else {
            this.PxuCJdSBwIXG = new ss2(i, interpolator, j);
        }
    }
}
