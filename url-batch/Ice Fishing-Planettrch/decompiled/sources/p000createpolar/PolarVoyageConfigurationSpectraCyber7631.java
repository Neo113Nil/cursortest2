package p000createpolar;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageConfigurationSpectraCyber7631 extends PolarVoyageExoPlayerVortexDeltaCelestial9351 {
    public boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public IconCompat PolarVoyageKotlinBetaPulseBeta3653;
    public IconCompat PolarVoyageMotionLayoutTransitionHeroVision4068;

    @Override // p000createpolar.PolarVoyageExoPlayerVortexDeltaCelestial9351
    public final String PolarVoyageKotlinBetaPulseBeta3653() {
        return "create-polar.PolarVoyageConfigurationSpectraCyber7631";
    }

    @Override // p000createpolar.PolarVoyageExoPlayerVortexDeltaCelestial9351
    public final void PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821) {
        Bitmap PolarVoyageZipVortexCelestial6185;
        Notification.Builder builder = (Notification.Builder) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Context context = (Context) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageStrictModeLegendEpic1532;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                PolarVoyageTextViewPrimeDeltaTitan4821.PolarVoyageZipVortexCelestial6185(bigContentTitle, iconCompat.PolarVoyageDiffUtilTurboStrike5735(context));
            } else if (iconCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767() == 1) {
                IconCompat iconCompat2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                int i = iconCompat2.PolarVoyageZipVortexCelestial6185;
                if (i == -1) {
                    Object obj = iconCompat2.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    PolarVoyageZipVortexCelestial6185 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    PolarVoyageZipVortexCelestial6185 = (Bitmap) iconCompat2.PolarVoyageMotionLayoutTransitionHeroVision4068;
                } else {
                    if (i != 5) {
                        PolarVoyageR8UltraEliteBeta8736.PolarVoyageBitmapMaxTitanTitan7960(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    PolarVoyageZipVortexCelestial6185 = IconCompat.PolarVoyageZipVortexCelestial6185((Bitmap) iconCompat2.PolarVoyageMotionLayoutTransitionHeroVision4068, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(PolarVoyageZipVortexCelestial6185);
            }
        }
        if (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            IconCompat iconCompat3 = this.PolarVoyageKotlinBetaPulseBeta3653;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.PolarVoyageDiffUtilTurboStrike5735(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            PolarVoyageTextViewPrimeDeltaTitan4821.PolarVoyageKotlinBetaPulseBeta3653(bigContentTitle, false);
            PolarVoyageTextViewPrimeDeltaTitan4821.PolarVoyageMotionLayoutTransitionHeroVision4068(bigContentTitle, null);
        }
    }
}
