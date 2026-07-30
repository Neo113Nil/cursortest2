package p000createpolar;

import android.app.Notification;
import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageTabLayoutPhantomUltraCosmos1004 {
    public static void PolarVoyageBarcodeScannerInfernoSolarSpark7767(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static float PolarVoyageKotlinBetaPulseBeta3653(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static float PolarVoyageMotionLayoutTransitionHeroVision4068(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static EdgeEffect PolarVoyageZipVortexCelestial6185(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }
}
