package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageJobSchedulerGammaMaster7383 {
    public final long PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageJobSchedulerGammaMaster7383(long j) {
        this.PolarVoyageZipVortexCelestial6185 = j;
    }

    public static final float PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float PolarVoyageBitmapVisionAuroraPixel4705(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long PolarVoyageDiffUtilTurboStrike5735(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long PolarVoyageItemDecorationUltraDeltaEpic7485(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final float PolarVoyageKotlinBetaPulseBeta3653(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final boolean PolarVoyageMotionLayoutTransitionHeroVision4068(long j, long j2) {
        return j == j2;
    }

    public static String PolarVoyageStrictModeLegendEpic1532(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(Float.intBitsToFloat((int) (j >> 32))) + ", " + PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final long PolarVoyageTextInputEditTextNebulaHero6651(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static long PolarVoyageZipVortexCelestial6185(int i, long j) {
        return (Float.floatToRawIntBits((i & 1) != 0 ? Float.intBitsToFloat((int) (j >> 32)) : 0.0f) << 32) | (Float.floatToRawIntBits((i & 2) != 0 ? Float.intBitsToFloat((int) (j & 4294967295L)) : 0.0f) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageJobSchedulerGammaMaster7383) {
            return this.PolarVoyageZipVortexCelestial6185 == ((PolarVoyageJobSchedulerGammaMaster7383) obj).PolarVoyageZipVortexCelestial6185;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PolarVoyageZipVortexCelestial6185);
    }

    public final String toString() {
        return PolarVoyageStrictModeLegendEpic1532(this.PolarVoyageZipVortexCelestial6185);
    }
}
