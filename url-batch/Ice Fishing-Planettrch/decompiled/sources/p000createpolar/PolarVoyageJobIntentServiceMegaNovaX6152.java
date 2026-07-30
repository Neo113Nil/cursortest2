package p000createpolar;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageJobIntentServiceMegaNovaX6152 {
    public static PolarVoyageStateStormPhantom4957 PolarVoyageKotlinBetaPulseBeta3653;
    public static final int PolarVoyageZipVortexCelestial6185 = Color.argb(230, 255, 255, 255);
    public static final int PolarVoyageMotionLayoutTransitionHeroVision4068 = Color.argb(128, 27, 27, 27);

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        r2.run();
        r10 = r10.getWindow();
        r10.getClass();
        r3.PolarVoyageZipVortexCelestial6185(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void PolarVoyageZipVortexCelestial6185(PolarVoyageBannerAdPhoenixForcePhoenix6096 polarVoyageBannerAdPhoenixForcePhoenix6096) {
        int i = 6;
        int i2 = 0;
        PolarVoyageConstraintSetTitanEpicNova7758 polarVoyageConstraintSetTitanEpicNova7758 = new PolarVoyageConstraintSetTitanEpicNova7758(0, 0, new PolarVoyageFCMPhantomVortexHyper9020(i));
        PolarVoyageConstraintSetTitanEpicNova7758 polarVoyageConstraintSetTitanEpicNova77582 = new PolarVoyageConstraintSetTitanEpicNova7758(PolarVoyageZipVortexCelestial6185, PolarVoyageMotionLayoutTransitionHeroVision4068, new PolarVoyageFCMPhantomVortexHyper9020(i));
        View decorView = polarVoyageBannerAdPhoenixForcePhoenix6096.getWindow().getDecorView();
        decorView.getClass();
        PolarVoyageStateStormPhantom4957 polarVoyageStateStormPhantom4957 = PolarVoyageKotlinBetaPulseBeta3653;
        if (polarVoyageStateStormPhantom4957 == null) {
            int i3 = Build.VERSION.SDK_INT;
            polarVoyageStateStormPhantom4957 = i3 >= 35 ? new PolarVoyageLooperFusionQuantum8693() : i3 >= 30 ? new PolarVoyagePermissionHyperCelestial9056() : i3 >= 29 ? new PolarVoyageDatabaseTitanRogue6600() : i3 >= 28 ? new PolarVoyageManifestHyperUltraSpark9542() : i3 >= 26 ? new PolarVoyageIntentServiceOmegaPrime2552() : new PolarVoyagePaintFlagsDrawFilterVortexSpeedVision4477();
            PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageStateStormPhantom4957;
        }
        PolarVoyageStateStormPhantom4957 polarVoyageStateStormPhantom49572 = polarVoyageStateStormPhantom4957;
        PolarVoyagePushNotificationRoguePrime1424 polarVoyagePushNotificationRoguePrime1424 = new PolarVoyagePushNotificationRoguePrime1424(polarVoyageStateStormPhantom49572, polarVoyageConstraintSetTitanEpicNova7758, polarVoyageConstraintSetTitanEpicNova77582, polarVoyageBannerAdPhoenixForcePhoenix6096, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                PolarVoyageRealtimeDatabaseStormMega2123 polarVoyageRealtimeDatabaseStormMega2123 = new PolarVoyageRealtimeDatabaseStormMega2123(polarVoyagePushNotificationRoguePrime1424, viewGroup.getContext());
                polarVoyageRealtimeDatabaseStormMega2123.setTag(polarVoyageStateStormPhantom49572);
                polarVoyageRealtimeDatabaseStormMega2123.setVisibility(8);
                polarVoyageRealtimeDatabaseStormMega2123.setWillNotDraw(true);
                viewGroup.addView(polarVoyageRealtimeDatabaseStormMega2123);
                break;
            }
            int i4 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof PolarVoyageStateStormPhantom4957) {
                break;
            } else {
                i2 = i4;
            }
        }
    }
}
