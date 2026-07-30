package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class b40 {
    public static final float PxuCJdSBwIXG = ViewConfiguration.getScrollFriction();
    public static final double TSizfFm2Yiuu;
    public static final double lS5Rgt96tfkO;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        lS5Rgt96tfkO = log;
        TSizfFm2Yiuu = log - 1.0d;
    }
}
