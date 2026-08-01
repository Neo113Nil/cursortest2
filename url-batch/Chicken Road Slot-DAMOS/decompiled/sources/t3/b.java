package t3;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
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

    public static float c(EdgeEffect edgeEffect, float f3, float f10) {
        try {
            return edgeEffect.onPullDistance(f3, f10);
        } catch (Throwable unused) {
            edgeEffect.onPull(f3, f10);
            return 0.0f;
        }
    }
}
