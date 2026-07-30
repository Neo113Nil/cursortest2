package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageGradientDrawableSpectraForceCyber5923 {
    public static final PolarVoyageFlowOnCosmosTurbo3722 PolarVoyageZipVortexCelestial6185;

    static {
        PolarVoyageZipVortexCelestial6185 = (PolarVoyageNestedScrollViewStormHero6620.PolarVoyageBitmapVisionAuroraPixel4705 && PolarVoyageNestedScrollViewStormHero6620.PolarVoyageBarcodeScannerInfernoSolarSpark7767 && !PolarVoyageRewardedAdUltraCyber4607.PolarVoyageZipVortexCelestial6185()) ? new PolarVoyageFlowOnCosmosTurbo3722(1) : new PolarVoyageFlowOnCosmosTurbo3722(0);
    }

    public static int PolarVoyageZipVortexCelestial6185(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new PolarVoyageRippleDrawableCelestialVisionThunder3244(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }
}
