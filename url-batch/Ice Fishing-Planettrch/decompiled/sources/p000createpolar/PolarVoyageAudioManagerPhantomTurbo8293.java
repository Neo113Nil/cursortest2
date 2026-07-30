package p000createpolar;

import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAudioManagerPhantomTurbo8293 extends PolarVoyageGeocoderMasterHyperHyperion4028 {
    public final PolarVoyageInputFilterLegendMaster1587 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageAudioManagerPhantomTurbo8293(PolarVoyageInputFilterLegendMaster1587 polarVoyageInputFilterLegendMaster1587, int i, int i2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageInputFilterLegendMaster1587;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleOlympianOmega3762(i, i2, polarVoyageInputFilterLegendMaster1587.PolarVoyageZipVortexCelestial6185());
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2 - i;
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416
    public final int PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.util.List
    public final Object get(int i) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLayerDrawableShadowTitaniumOmega1942(i, this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(this.PolarVoyageStrictModeLegendEpic1532 + i);
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public final List subList(int i, int i2) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleOlympianOmega3762(i, i2, this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        int i3 = this.PolarVoyageStrictModeLegendEpic1532;
        return new PolarVoyageAudioManagerPhantomTurbo8293(this.PolarVoyageItemDecorationUltraDeltaEpic7485, i + i3, i3 + i2);
    }
}
