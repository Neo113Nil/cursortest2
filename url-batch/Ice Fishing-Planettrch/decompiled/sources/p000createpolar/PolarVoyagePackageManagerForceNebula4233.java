package p000createpolar;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePackageManagerForceNebula4233 extends PolarVoyageGeocoderMasterHyperHyperion4028 implements RandomAccess {
    public final PolarVoyageGeocoderMasterHyperHyperion4028 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyagePackageManagerForceNebula4233(PolarVoyageGeocoderMasterHyperHyperion4028 polarVoyageGeocoderMasterHyperHyperion4028, int i, int i2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageGeocoderMasterHyperHyperion4028;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageActivityInfoBetaQuantum8726(i, i2, polarVoyageGeocoderMasterHyperHyperion4028.PolarVoyageZipVortexCelestial6185());
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2 - i;
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416
    public final int PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i < 0 || i >= i2) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(this.PolarVoyageStrictModeLegendEpic1532 + i);
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public final List subList(int i, int i2) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageActivityInfoBetaQuantum8726(i, i2, this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        int i3 = this.PolarVoyageStrictModeLegendEpic1532;
        return new PolarVoyagePackageManagerForceNebula4233(this.PolarVoyageItemDecorationUltraDeltaEpic7485, i + i3, i3 + i2);
    }
}
