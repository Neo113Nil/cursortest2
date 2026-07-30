package p000createpolar;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMotionEventEclipseThunderBlaze7795 {
    public final Notification PolarVoyageAnimatorSetSparkUltraMax8233;
    public final ArrayList PolarVoyageBitmapMaxTitanTitan7960;
    public CharSequence PolarVoyageBitmapVisionAuroraPixel4705;
    public CharSequence PolarVoyageDiffUtilTurboStrike5735;
    public Bundle PolarVoyageDrawableDeltaHyperion5742;
    public IconCompat PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final boolean PolarVoyageNavigationViewHyperHyperHyperion1793;
    public String PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public PendingIntent PolarVoyageTextInputEditTextNebulaHero6651;
    public PolarVoyageExoPlayerVortexDeltaCelestial9351 PolarVoyageViewRogueMaster4778;
    public final Context PolarVoyageZipVortexCelestial6185;
    public final ArrayList PolarVoyageMotionLayoutTransitionHeroVision4068 = new ArrayList();
    public final ArrayList PolarVoyageKotlinBetaPulseBeta3653 = new ArrayList();
    public final ArrayList PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new ArrayList();
    public boolean PolarVoyageBottomSheetOmegaNeo1907 = true;
    public boolean PolarVoyageCameraPixelBlaze2629 = false;
    public int PolarVoyageSnackbarGammaEclipse2140 = 0;
    public int PolarVoyageContentProviderHyperSpark3838 = 0;

    public PolarVoyageMotionEventEclipseThunderBlaze7795(Context context, String str) {
        Notification notification = new Notification();
        this.PolarVoyageAnimatorSetSparkUltraMax8233 = notification;
        this.PolarVoyageZipVortexCelestial6185 = context;
        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 0;
        this.PolarVoyageBitmapMaxTitanTitan7960 = new ArrayList();
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = true;
    }

    public static CharSequence PolarVoyageMotionLayoutTransitionHeroVision4068(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageExoPlayerVortexDeltaCelestial9351 polarVoyageExoPlayerVortexDeltaCelestial9351) {
        if (this.PolarVoyageViewRogueMaster4778 != polarVoyageExoPlayerVortexDeltaCelestial9351) {
            this.PolarVoyageViewRogueMaster4778 = polarVoyageExoPlayerVortexDeltaCelestial9351;
            if (((PolarVoyageMotionEventEclipseThunderBlaze7795) polarVoyageExoPlayerVortexDeltaCelestial9351.PolarVoyageZipVortexCelestial6185) != this) {
                polarVoyageExoPlayerVortexDeltaCelestial9351.PolarVoyageZipVortexCelestial6185 = this;
                PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageExoPlayerVortexDeltaCelestial9351);
            }
        }
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.PolarVoyageZipVortexCelestial6185.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.PolarVoyageBottomSheetOmegaNeo1907;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.PolarVoyageMotionLayoutTransitionHeroVision4068 = bitmap;
            iconCompat = iconCompat2;
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = iconCompat;
    }

    public final Notification PolarVoyageZipVortexCelestial6185() {
        Bundle bundle;
        PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = new PolarVoyageAnimatorCelestialDeltaMaster5821(this);
        PolarVoyageMotionEventEclipseThunderBlaze7795 polarVoyageMotionEventEclipseThunderBlaze7795 = (PolarVoyageMotionEventEclipseThunderBlaze7795) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageExoPlayerVortexDeltaCelestial9351 polarVoyageExoPlayerVortexDeltaCelestial9351 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageViewRogueMaster4778;
        if (polarVoyageExoPlayerVortexDeltaCelestial9351 != null) {
            polarVoyageExoPlayerVortexDeltaCelestial9351.PolarVoyageZipVortexCelestial6185(polarVoyageAnimatorCelestialDeltaMaster5821);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Notification build = i >= 26 ? builder.build() : builder.build();
        if (polarVoyageExoPlayerVortexDeltaCelestial9351 != null) {
            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageViewRogueMaster4778.getClass();
        }
        if (polarVoyageExoPlayerVortexDeltaCelestial9351 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", polarVoyageExoPlayerVortexDeltaCelestial9351.PolarVoyageKotlinBetaPulseBeta3653());
        }
        return build;
    }
}
