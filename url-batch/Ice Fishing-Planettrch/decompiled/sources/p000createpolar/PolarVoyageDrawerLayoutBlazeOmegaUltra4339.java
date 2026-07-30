package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageDrawerLayoutBlazeOmegaUltra4339 {
    public static final String[] PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public static final String[] PolarVoyageKotlinBetaPulseBeta3653;
    public static final String[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final PolarVoyagePropertyValuesHolderVortexNeo2967 PolarVoyageZipVortexCelestial6185;

    static {
        PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967 = PolarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageZipVortexCelestial6185 = PolarVoyageDelayNovaRogueBeta9839.PolarVoyageCameraPixelBlaze2629("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        PolarVoyageMotionLayoutTransitionHeroVision4068 = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        PolarVoyageKotlinBetaPulseBeta3653 = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String replace = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageKotlinBetaPulseBeta3653("%8s", binaryString).replace(' ', '0');
            replace.getClass();
            strArr[i] = replace;
        }
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = strArr;
        String[] strArr2 = PolarVoyageKotlinBetaPulseBeta3653;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = PolarVoyageKotlinBetaPulseBeta3653;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(sb, strArr3[i4], "|PADDED");
        }
        int length = PolarVoyageKotlinBetaPulseBeta3653.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = PolarVoyageKotlinBetaPulseBeta3653;
            if (strArr4[i7] == null) {
                strArr4[i7] = PolarVoyageBarcodeScannerInfernoSolarSpark7767[i7];
            }
        }
    }

    public static String PolarVoyageKotlinBetaPulseBeta3653(int i, int i2, long j, boolean z) {
        return PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageKotlinBetaPulseBeta3653("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), PolarVoyageZipVortexCelestial6185(8), Long.valueOf(j));
    }

    public static String PolarVoyageMotionLayoutTransitionHeroVision4068(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String PolarVoyageZipVortexCelestial61852 = PolarVoyageZipVortexCelestial6185(i3);
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr = PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : strArr[i4];
                } else if (i3 != 7 && i3 != 8) {
                    String[] strArr2 = PolarVoyageKotlinBetaPulseBeta3653;
                    if (i4 < strArr2.length) {
                        str2 = strArr2[i4];
                        str2.getClass();
                    } else {
                        str2 = strArr[i4];
                    }
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageAnimatorSetSparkUltraMax8233(str2, "PRIORITY", "COMPRESSED") : PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageAnimatorSetSparkUltraMax8233(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i4];
        }
        return PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageKotlinBetaPulseBeta3653("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), PolarVoyageZipVortexCelestial61852, str);
    }

    public static String PolarVoyageZipVortexCelestial6185(int i) {
        String[] strArr = PolarVoyageMotionLayoutTransitionHeroVision4068;
        return i < strArr.length ? strArr[i] : PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageKotlinBetaPulseBeta3653("0x%02x", Integer.valueOf(i));
    }
}
