package p000createpolar;

import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCameraSelectorMegaHyperion6530 {
    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final int PolarVoyageBitmapVisionAuroraPixel4705;
    public final int PolarVoyageDiffUtilTurboStrike5735;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageCameraSelectorMegaHyperion6530(int i, int i2, int i3, int i4, int i5, int i6) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i3;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i4;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = i5;
        this.PolarVoyageDiffUtilTurboStrike5735 = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static PolarVoyageCameraSelectorMegaHyperion6530 PolarVoyageZipVortexCelestial6185(String str) {
        char c;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(split[i6].trim());
            PolarVoyageFlingGestureEclipsePrimeMax1376.getClass();
            switch (PolarVoyageFlingGestureEclipsePrimeMax1376.hashCode()) {
                case 100571:
                    if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("end")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 102749521:
                    if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("layer")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("start")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    i3 = i6;
                    break;
                case 1:
                    i5 = i6;
                    break;
                case 2:
                    i = i6;
                    break;
                case 3:
                    i2 = i6;
                    break;
                case 4:
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new PolarVoyageCameraSelectorMegaHyperion6530(i, i2, i3, i4, i5, split.length);
    }
}
