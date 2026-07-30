package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageHandlerThreadVisionRogueHero7998 {
    public final long PolarVoyageZipVortexCelestial6185;

    public static final long PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long PolarVoyageBitmapVisionAuroraPixel4705(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long PolarVoyageDiffUtilTurboStrike5735(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final float PolarVoyageKotlinBetaPulseBeta3653(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float PolarVoyageMotionLayoutTransitionHeroVision4068(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String PolarVoyageTextInputEditTextNebulaHero6651(long j) {
        return "(" + PolarVoyageMotionLayoutTransitionHeroVision4068(j) + ", " + PolarVoyageKotlinBetaPulseBeta3653(j) + ") px/sec";
    }

    public static long PolarVoyageZipVortexCelestial6185(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageHandlerThreadVisionRogueHero7998) {
            return this.PolarVoyageZipVortexCelestial6185 == ((PolarVoyageHandlerThreadVisionRogueHero7998) obj).PolarVoyageZipVortexCelestial6185;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PolarVoyageZipVortexCelestial6185);
    }

    public final String toString() {
        return PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageZipVortexCelestial6185);
    }
}
