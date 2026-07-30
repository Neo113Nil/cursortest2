package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Path;
import android.view.DisplayCutout;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class d9 {
    public static EdgeEffect PxuCJdSBwIXG(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float TSizfFm2Yiuu(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float Y1f8riQaR6yg(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void e9gEMXR7LXtO(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static Path lS5Rgt96tfkO(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }
}
