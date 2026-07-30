package p000createpolar;

import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewBindingShadowVision5211 extends PolarVoyageAlertDialogSpectraGammaGamma5541 {
    public final /* synthetic */ int PolarVoyageBitmapVisionAuroraPixel4705;

    public PolarVoyageViewBindingShadowVision5211(int i, boolean z) {
        this.PolarVoyageBitmapVisionAuroraPixel4705 = i;
    }

    @Override // p000createpolar.PolarVoyageAlertDialogSpectraGammaGamma5541
    public final Object PolarVoyageBarcodeScannerInfernoSolarSpark7767(String str) {
        int parseInt;
        long parseLong;
        boolean z = true;
        switch (this.PolarVoyageBitmapVisionAuroraPixel4705) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, "0x", false)) {
                    String substring = str.substring(2);
                    PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBottomSheetOmegaNeo1907(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case 2:
                String substring2 = PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageContentProviderHyperSpark3838(str, "L", false) ? str.substring(0, str.length() - 1) : str;
                if (PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, "0x", false)) {
                    String substring3 = substring2.substring(2);
                    PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBottomSheetOmegaNeo1907(16);
                    parseLong = Long.parseLong(substring3, 16);
                } else {
                    parseLong = Long.parseLong(substring2);
                }
                return Long.valueOf(parseLong);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // p000createpolar.PolarVoyageAlertDialogSpectraGammaGamma5541
    public final void PolarVoyageBitmapVisionAuroraPixel4705(Bundle bundle, String str, Object obj) {
        switch (this.PolarVoyageBitmapVisionAuroraPixel4705) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                break;
            case 2:
                long longValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putString(str, str2);
                    break;
                }
        }
    }

    @Override // p000createpolar.PolarVoyageAlertDialogSpectraGammaGamma5541
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068() {
        switch (this.PolarVoyageBitmapVisionAuroraPixel4705) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "boolean";
            case 1:
                return "integer";
            case 2:
                return Constants.LONG;
            default:
                return "string";
        }
    }

    @Override // p000createpolar.PolarVoyageAlertDialogSpectraGammaGamma5541
    public final Object PolarVoyageZipVortexCelestial6185(Bundle bundle, String str) {
        switch (this.PolarVoyageBitmapVisionAuroraPixel4705) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                bundle.getClass();
                if (!bundle.containsKey(str) || PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageItemDecorationUltraDeltaEpic7485(bundle, str)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907(str);
                throw null;
            case 1:
                bundle.getClass();
                return Integer.valueOf(PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageBarcodeScannerInfernoSolarSpark7767(bundle, str));
            case 2:
                bundle.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageItemDecorationUltraDeltaEpic7485(bundle, str)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907(str);
                throw null;
        }
    }
}
