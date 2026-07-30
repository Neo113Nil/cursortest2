package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageClipDrawableOmegaInferno8443 {
    public final long PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageClipDrawableOmegaInferno8443(long j) {
        this.PolarVoyageZipVortexCelestial6185 = j;
    }

    public static final boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean PolarVoyageBitmapVisionAuroraPixel4705(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final boolean PolarVoyageBottomSheetOmegaNeo1907(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    public static final boolean PolarVoyageDiffUtilTurboStrike5735(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    public static final int PolarVoyageItemDecorationUltraDeltaEpic7485(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final boolean PolarVoyageKotlinBetaPulseBeta3653(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean PolarVoyageMotionLayoutTransitionHeroVision4068(long j, long j2) {
        return j == j2;
    }

    public static final int PolarVoyageRotateAnimationCyberCelestialDelta4768(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static final int PolarVoyageStrictModeLegendEpic1532(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int PolarVoyageTextInputEditTextNebulaHero6651(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static String PolarVoyageViewRogueMaster4778(long j) {
        int PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(j);
        String valueOf = PolarVoyageItemDecorationUltraDeltaEpic7485 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(PolarVoyageItemDecorationUltraDeltaEpic7485);
        int PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageTextInputEditTextNebulaHero6651(j);
        String valueOf2 = PolarVoyageTextInputEditTextNebulaHero6651 != Integer.MAX_VALUE ? String.valueOf(PolarVoyageTextInputEditTextNebulaHero6651) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(PolarVoyageRotateAnimationCyberCelestialDelta4768(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(PolarVoyageStrictModeLegendEpic1532(j));
        sb.append(", maxHeight = ");
        return PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageDrawableDeltaHyperion5742(sb, valueOf2, ')');
    }

    public static long PolarVoyageZipVortexCelestial6185(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i5 & 1) != 0) {
            i = PolarVoyageRotateAnimationCyberCelestialDelta4768(j);
        }
        if ((i5 & 2) != 0) {
            i2 = PolarVoyageItemDecorationUltraDeltaEpic7485(j);
        }
        if ((i5 & 4) != 0) {
            i3 = PolarVoyageStrictModeLegendEpic1532(j);
        }
        if ((i5 & 8) != 0) {
            i4 = PolarVoyageTextInputEditTextNebulaHero6651(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            PolarVoyageJobIntentServiceStrikeGammaUltra5465.PolarVoyageZipVortexCelestial6185("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return PolarVoyageMotionEventSparkTitaniumAurora9770.PolarVoyageTextInputEditTextNebulaHero6651(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageClipDrawableOmegaInferno8443) {
            return this.PolarVoyageZipVortexCelestial6185 == ((PolarVoyageClipDrawableOmegaInferno8443) obj).PolarVoyageZipVortexCelestial6185;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PolarVoyageZipVortexCelestial6185);
    }

    public final String toString() {
        return PolarVoyageViewRogueMaster4778(this.PolarVoyageZipVortexCelestial6185);
    }
}
