package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGuidelineThunderSolarAurora9069 {
    public final int[] PolarVoyageMotionLayoutTransitionHeroVision4068 = new int[10];
    public int PolarVoyageZipVortexCelestial6185;

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (i >= iArr.length) {
                return;
            }
            this.PolarVoyageZipVortexCelestial6185 = (1 << i) | this.PolarVoyageZipVortexCelestial6185;
            iArr[i] = i2;
        }
    }

    public final int PolarVoyageZipVortexCelestial6185() {
        if ((this.PolarVoyageZipVortexCelestial6185 & 16) != 0) {
            return this.PolarVoyageMotionLayoutTransitionHeroVision4068[4];
        }
        return 65535;
    }
}
