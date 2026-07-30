package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlingGestureBetaStormThunder1052 implements PolarVoyageFragmentManagerHyperionHeroFusion7976 {
    public int PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public Object PolarVoyageViewRogueMaster4778;

    @Override // p000createpolar.PolarVoyageFragmentManagerHyperionHeroFusion7976
    public int PolarVoyageBitmapVisionAuroraPixel4705() {
        return -1;
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerHyperionHeroFusion7976
    public int PolarVoyageDrawableDeltaHyperion5742() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerHyperionHeroFusion7976
    public int PolarVoyageRemoteModelManagerOlympianCelestial9141() {
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312 = (PolarVoyageTextRecognitionHeroOmega1312) this.PolarVoyageViewRogueMaster4778;
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        if (i == 8) {
            return polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
        }
        if (i == 16) {
            return polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747();
        }
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.PolarVoyageBottomSheetOmegaNeo1907 & 15;
        }
        int PolarVoyagePackageManagerCelestialPhoenix8393 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
        this.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyagePackageManagerCelestialPhoenix8393;
        return (PolarVoyagePackageManagerCelestialPhoenix8393 & 240) >> 4;
    }

    public long PolarVoyageZipVortexCelestial6185() {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i == 0) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return 0L;
        }
        long[] jArr = (long[]) this.PolarVoyageViewRogueMaster4778;
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        long j = jArr[i2];
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = this.PolarVoyageBottomSheetOmegaNeo1907 & (i2 + 1);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i - 1;
        return j;
    }
}
