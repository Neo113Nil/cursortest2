package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAssetManagerMasterMaster2094 {
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageRotateAnimationBlazePixelTitan5297 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAssetManagerMasterMaster2094(PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan5297, int i, int i2) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageRotateAnimationBlazePixelTitan5297;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i2;
    }

    public static PolarVoyageAssetManagerMasterMaster2094 PolarVoyageZipVortexCelestial6185(Class cls) {
        return new PolarVoyageAssetManagerMasterMaster2094(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyageAssetManagerMasterMaster2094)) {
            return false;
        }
        PolarVoyageAssetManagerMasterMaster2094 polarVoyageAssetManagerMasterMaster2094 = (PolarVoyageAssetManagerMasterMaster2094) obj;
        return this.PolarVoyageZipVortexCelestial6185.equals(polarVoyageAssetManagerMasterMaster2094.PolarVoyageZipVortexCelestial6185) && this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageAssetManagerMasterMaster2094.PolarVoyageMotionLayoutTransitionHeroVision4068 && this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageAssetManagerMasterMaster2094.PolarVoyageKotlinBetaPulseBeta3653;
    }

    public final int hashCode() {
        return this.PolarVoyageKotlinBetaPulseBeta3653 ^ ((((this.PolarVoyageZipVortexCelestial6185.hashCode() ^ 1000003) * 1000003) ^ this.PolarVoyageMotionLayoutTransitionHeroVision4068) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.PolarVoyageZipVortexCelestial6185);
        sb.append(", type=");
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Unsupported injection: ", i2));
            }
            str = "deferred";
        }
        return PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(sb, str, "}");
    }

    public PolarVoyageAssetManagerMasterMaster2094(int i, int i2, Class cls) {
        this(PolarVoyageRotateAnimationBlazePixelTitan5297.PolarVoyageZipVortexCelestial6185(cls), i, i2);
    }
}
