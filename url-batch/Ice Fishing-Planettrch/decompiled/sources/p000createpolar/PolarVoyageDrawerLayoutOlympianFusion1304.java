package p000createpolar;

import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDrawerLayoutOlympianFusion1304 {
    public boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public final PolarVoyageAnimatorCelestialBeta6967 PolarVoyageKotlinBetaPulseBeta3653;
    public ArrayList PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final ArrayList PolarVoyageZipVortexCelestial6185;

    public PolarVoyageDrawerLayoutOlympianFusion1304(PolarVoyageAnimatorCelestialBeta6967 polarVoyageAnimatorCelestialBeta6967) {
        polarVoyageAnimatorCelestialBeta6967.getClass();
        this.PolarVoyageZipVortexCelestial6185 = new ArrayList();
        this.PolarVoyageBitmapVisionAuroraPixel4705 = -1;
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageAnimatorCelestialBeta6967;
    }

    public final int PolarVoyageZipVortexCelestial6185(boolean z) {
        String str;
        PolarVoyageAnimatorCelestialBeta6967 polarVoyageAnimatorCelestialBeta6967 = this.PolarVoyageKotlinBetaPulseBeta3653;
        if (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("commit already called");
            return 0;
        }
        if (PolarVoyageAnimatorCelestialBeta6967.PolarVoyageViewRogueMaster4778(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new PolarVoyageColorStateListInflaterTitanTitanium5900());
            ArrayList arrayList = this.PolarVoyageZipVortexCelestial6185;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.PolarVoyageBitmapVisionAuroraPixel4705);
            printWriter.print(" mCommitted=");
            printWriter.println(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    PolarVoyageSharedPreferencesMegaEclipseCosmos2242 polarVoyageSharedPreferencesMegaEclipseCosmos2242 = (PolarVoyageSharedPreferencesMegaEclipseCosmos2242) arrayList.get(i);
                    switch (polarVoyageSharedPreferencesMegaEclipseCosmos2242.PolarVoyageZipVortexCelestial6185) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                            str = "SHOW";
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "DETACH";
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "ATTACH";
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + polarVoyageSharedPreferencesMegaEclipseCosmos2242.PolarVoyageZipVortexCelestial6185;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(polarVoyageSharedPreferencesMegaEclipseCosmos2242.PolarVoyageMotionLayoutTransitionHeroVision4068);
                    if (polarVoyageSharedPreferencesMegaEclipseCosmos2242.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != 0 || polarVoyageSharedPreferencesMegaEclipseCosmos2242.PolarVoyageBitmapVisionAuroraPixel4705 != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(polarVoyageSharedPreferencesMegaEclipseCosmos2242.PolarVoyageBarcodeScannerInfernoSolarSpark7767));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(polarVoyageSharedPreferencesMegaEclipseCosmos2242.PolarVoyageBitmapVisionAuroraPixel4705));
                    }
                    if (polarVoyageSharedPreferencesMegaEclipseCosmos2242.PolarVoyageDiffUtilTurboStrike5735 != 0 || polarVoyageSharedPreferencesMegaEclipseCosmos2242.PolarVoyageTextInputEditTextNebulaHero6651 != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(polarVoyageSharedPreferencesMegaEclipseCosmos2242.PolarVoyageDiffUtilTurboStrike5735));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(polarVoyageSharedPreferencesMegaEclipseCosmos2242.PolarVoyageTextInputEditTextNebulaHero6651));
                    }
                }
            }
            printWriter.close();
        }
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = true;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = -1;
        if (!z) {
            polarVoyageAnimatorCelestialBeta6967.getClass();
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("FragmentManager has not been attached to a host.");
            return 0;
        }
        synchronized (polarVoyageAnimatorCelestialBeta6967.PolarVoyageKotlinBetaPulseBeta3653) {
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.PolarVoyageBitmapVisionAuroraPixel4705;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.PolarVoyageBitmapVisionAuroraPixel4705 >= 0) {
            sb.append(" #");
            sb.append(this.PolarVoyageBitmapVisionAuroraPixel4705);
        }
        sb.append("}");
        return sb.toString();
    }
}
