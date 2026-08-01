package o0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class c {
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

    public static float c(EdgeEffect edgeEffect, float f4, float f5) {
        try {
            return edgeEffect.onPullDistance(f4, f5);
        } catch (Throwable unused) {
            edgeEffect.onPull(f4, f5);
            return 0.0f;
        }
    }
}
