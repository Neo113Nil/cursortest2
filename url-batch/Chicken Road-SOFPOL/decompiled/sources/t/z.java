package t;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6890a = ViewConfiguration.getScrollFriction();

    /* renamed from: b, reason: collision with root package name */
    public static final double f6891b;

    /* renamed from: c, reason: collision with root package name */
    public static final double f6892c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f6891b = log;
        f6892c = log - 1.0d;
    }
}
