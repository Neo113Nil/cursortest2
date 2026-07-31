package t;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class m {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f6, float f8) {
        try {
            return edgeEffect.onPullDistance(f6, f8);
        } catch (Throwable unused) {
            edgeEffect.onPull(f6, f8);
            return 0.0f;
        }
    }
}
