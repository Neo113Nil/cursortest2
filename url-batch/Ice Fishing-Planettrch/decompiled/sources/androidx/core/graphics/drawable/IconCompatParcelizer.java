package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import p000createpolar.PolarVoyageCamera2MasterPulse1881;
import p000createpolar.PolarVoyageDigitalInkRecognitionCelestialPixel7898;
import p000createpolar.PolarVoyageNotificationManagerOlympianPixel2030;
import p000createpolar.PolarVoyageZipMegaFusion8832;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(PolarVoyageZipMegaFusion8832 polarVoyageZipMegaFusion8832) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.PolarVoyageZipVortexCelestial6185 = -1;
        iconCompat.PolarVoyageKotlinBetaPulseBeta3653 = null;
        iconCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = null;
        iconCompat.PolarVoyageBitmapVisionAuroraPixel4705 = 0;
        iconCompat.PolarVoyageDiffUtilTurboStrike5735 = 0;
        iconCompat.PolarVoyageTextInputEditTextNebulaHero6651 = null;
        iconCompat.PolarVoyageItemDecorationUltraDeltaEpic7485 = IconCompat.PolarVoyageBottomSheetOmegaNeo1907;
        iconCompat.PolarVoyageStrictModeLegendEpic1532 = null;
        iconCompat.PolarVoyageZipVortexCelestial6185 = !polarVoyageZipMegaFusion8832.PolarVoyageBitmapVisionAuroraPixel4705(1) ? -1 : ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.readInt();
        byte[] bArr = iconCompat.PolarVoyageKotlinBetaPulseBeta3653;
        if (polarVoyageZipMegaFusion8832.PolarVoyageBitmapVisionAuroraPixel4705(2)) {
            Parcel parcel = ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.PolarVoyageKotlinBetaPulseBeta3653 = bArr;
        iconCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageZipMegaFusion8832.PolarVoyageDiffUtilTurboStrike5735(iconCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767, 3);
        int i = iconCompat.PolarVoyageBitmapVisionAuroraPixel4705;
        if (polarVoyageZipMegaFusion8832.PolarVoyageBitmapVisionAuroraPixel4705(4)) {
            i = ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.readInt();
        }
        iconCompat.PolarVoyageBitmapVisionAuroraPixel4705 = i;
        int i2 = iconCompat.PolarVoyageDiffUtilTurboStrike5735;
        if (polarVoyageZipMegaFusion8832.PolarVoyageBitmapVisionAuroraPixel4705(5)) {
            i2 = ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.readInt();
        }
        iconCompat.PolarVoyageDiffUtilTurboStrike5735 = i2;
        iconCompat.PolarVoyageTextInputEditTextNebulaHero6651 = (ColorStateList) polarVoyageZipMegaFusion8832.PolarVoyageDiffUtilTurboStrike5735(iconCompat.PolarVoyageTextInputEditTextNebulaHero6651, 6);
        String str = iconCompat.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageZipMegaFusion8832.PolarVoyageBitmapVisionAuroraPixel4705(7)) {
            str = ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.readString();
        }
        iconCompat.PolarVoyageStrictModeLegendEpic1532 = str;
        String str2 = iconCompat.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (polarVoyageZipMegaFusion8832.PolarVoyageBitmapVisionAuroraPixel4705(8)) {
            str2 = ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.readString();
        }
        iconCompat.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str2;
        iconCompat.PolarVoyageItemDecorationUltraDeltaEpic7485 = PorterDuff.Mode.valueOf(iconCompat.PolarVoyageStrictModeLegendEpic1532);
        switch (iconCompat.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                Parcelable parcelable = iconCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (parcelable != null) {
                    iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068 = parcelable;
                    return iconCompat;
                }
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Invalid icon");
                return null;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                return iconCompat;
            case 1:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (parcelable2 != null) {
                    iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068 = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.PolarVoyageKotlinBetaPulseBeta3653;
                iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068 = bArr3;
                iconCompat.PolarVoyageZipVortexCelestial6185 = 3;
                iconCompat.PolarVoyageBitmapVisionAuroraPixel4705 = 0;
                iconCompat.PolarVoyageDiffUtilTurboStrike5735 = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.PolarVoyageKotlinBetaPulseBeta3653, Charset.forName("UTF-16"));
                iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068 = str3;
                if (iconCompat.PolarVoyageZipVortexCelestial6185 == 2 && iconCompat.PolarVoyageRotateAnimationCyberCelestialDelta4768 == null) {
                    iconCompat.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068 = iconCompat.PolarVoyageKotlinBetaPulseBeta3653;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, PolarVoyageZipMegaFusion8832 polarVoyageZipMegaFusion8832) {
        polarVoyageZipMegaFusion8832.getClass();
        iconCompat.PolarVoyageStrictModeLegendEpic1532 = iconCompat.PolarVoyageItemDecorationUltraDeltaEpic7485.name();
        switch (iconCompat.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                iconCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = (Parcelable) iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068;
                break;
            case 1:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = (Parcelable) iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068;
                break;
            case 2:
                iconCompat.PolarVoyageKotlinBetaPulseBeta3653 = ((String) iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.PolarVoyageKotlinBetaPulseBeta3653 = (byte[]) iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068;
                break;
            case 4:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.PolarVoyageKotlinBetaPulseBeta3653 = iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.PolarVoyageZipVortexCelestial6185;
        if (-1 != i) {
            polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(1);
            ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.writeInt(i);
        }
        byte[] bArr = iconCompat.PolarVoyageKotlinBetaPulseBeta3653;
        if (bArr != null) {
            polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(2);
            Parcel parcel = ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (parcelable != null) {
            polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(3);
            ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.PolarVoyageBitmapVisionAuroraPixel4705;
        if (i2 != 0) {
            polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(4);
            ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.writeInt(i2);
        }
        int i3 = iconCompat.PolarVoyageDiffUtilTurboStrike5735;
        if (i3 != 0) {
            polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(5);
            ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.PolarVoyageTextInputEditTextNebulaHero6651;
        if (colorStateList != null) {
            polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(6);
            ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.PolarVoyageStrictModeLegendEpic1532;
        if (str != null) {
            polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(7);
            ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.writeString(str);
        }
        String str2 = iconCompat.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (str2 != null) {
            polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(8);
            ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.writeString(str2);
        }
    }
}
