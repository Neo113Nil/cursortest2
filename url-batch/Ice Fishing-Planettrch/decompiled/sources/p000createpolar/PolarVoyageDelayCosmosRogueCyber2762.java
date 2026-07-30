package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDelayCosmosRogueCyber2762 {
    public final boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final boolean PolarVoyageBitmapVisionAuroraPixel4705;
    public final int PolarVoyageDiffUtilTurboStrike5735;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageTextInputEditTextNebulaHero6651;
    public final boolean PolarVoyageZipVortexCelestial6185;

    public PolarVoyageDelayCosmosRogueCyber2762(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.PolarVoyageZipVortexCelestial6185 = z;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = z2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = z3;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = z4;
        this.PolarVoyageDiffUtilTurboStrike5735 = i2;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PolarVoyageDelayCosmosRogueCyber2762)) {
            return false;
        }
        PolarVoyageDelayCosmosRogueCyber2762 polarVoyageDelayCosmosRogueCyber2762 = (PolarVoyageDelayCosmosRogueCyber2762) obj;
        return this.PolarVoyageZipVortexCelestial6185 == polarVoyageDelayCosmosRogueCyber2762.PolarVoyageZipVortexCelestial6185 && this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageDelayCosmosRogueCyber2762.PolarVoyageMotionLayoutTransitionHeroVision4068 && this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageDelayCosmosRogueCyber2762.PolarVoyageKotlinBetaPulseBeta3653 && this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == polarVoyageDelayCosmosRogueCyber2762.PolarVoyageBarcodeScannerInfernoSolarSpark7767 && this.PolarVoyageBitmapVisionAuroraPixel4705 == polarVoyageDelayCosmosRogueCyber2762.PolarVoyageBitmapVisionAuroraPixel4705 && this.PolarVoyageDiffUtilTurboStrike5735 == polarVoyageDelayCosmosRogueCyber2762.PolarVoyageDiffUtilTurboStrike5735 && this.PolarVoyageTextInputEditTextNebulaHero6651 == polarVoyageDelayCosmosRogueCyber2762.PolarVoyageTextInputEditTextNebulaHero6651;
    }

    public final int hashCode() {
        return ((((((((((((((((this.PolarVoyageZipVortexCelestial6185 ? 1 : 0) * 31) + (this.PolarVoyageMotionLayoutTransitionHeroVision4068 ? 1 : 0)) * 31) + this.PolarVoyageKotlinBetaPulseBeta3653) * 923521) + (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 ? 1 : 0)) * 31) + (this.PolarVoyageBitmapVisionAuroraPixel4705 ? 1 : 0)) * 31) + this.PolarVoyageDiffUtilTurboStrike5735) * 31) + this.PolarVoyageTextInputEditTextNebulaHero6651) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PolarVoyageDelayCosmosRogueCyber2762.class.getSimpleName());
        sb.append("(");
        if (this.PolarVoyageZipVortexCelestial6185) {
            sb.append("launchSingleTop ");
        }
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            sb.append("restoreState ");
        }
        int i = this.PolarVoyageTextInputEditTextNebulaHero6651;
        int i2 = this.PolarVoyageDiffUtilTurboStrike5735;
        if (i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        return sb.toString();
    }
}
