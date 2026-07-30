package p000createpolar;

import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTextViewForceRogueMega8389 extends PolarVoyageAuthGammaDelta6297 implements Iterator {
    public PolarVoyageLevelListDrawableNebulaMaster1203 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageCoroutinePixelPhoenixTurbo2808 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public boolean PolarVoyageStrictModeLegendEpic1532 = true;

    public PolarVoyageTextViewForceRogueMega8389(PolarVoyageCoroutinePixelPhoenixTurbo2808 polarVoyageCoroutinePixelPhoenixTurbo2808) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageCoroutinePixelPhoenixTurbo2808;
    }

    @Override // p000createpolar.PolarVoyageAuthGammaDelta6297
    public final void PolarVoyageZipVortexCelestial6185(PolarVoyageLevelListDrawableNebulaMaster1203 polarVoyageLevelListDrawableNebulaMaster1203) {
        PolarVoyageLevelListDrawableNebulaMaster1203 polarVoyageLevelListDrawableNebulaMaster12032 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (polarVoyageLevelListDrawableNebulaMaster1203 == polarVoyageLevelListDrawableNebulaMaster12032) {
            PolarVoyageLevelListDrawableNebulaMaster1203 polarVoyageLevelListDrawableNebulaMaster12033 = polarVoyageLevelListDrawableNebulaMaster12032.PolarVoyageBottomSheetOmegaNeo1907;
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageLevelListDrawableNebulaMaster12033;
            this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageLevelListDrawableNebulaMaster12033 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.PolarVoyageStrictModeLegendEpic1532) {
            return this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageItemDecorationUltraDeltaEpic7485 != null;
        }
        PolarVoyageLevelListDrawableNebulaMaster1203 polarVoyageLevelListDrawableNebulaMaster1203 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return (polarVoyageLevelListDrawableNebulaMaster1203 == null || polarVoyageLevelListDrawableNebulaMaster1203.PolarVoyageRotateAnimationCyberCelestialDelta4768 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.PolarVoyageStrictModeLegendEpic1532) {
            this.PolarVoyageStrictModeLegendEpic1532 = false;
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageItemDecorationUltraDeltaEpic7485;
        } else {
            PolarVoyageLevelListDrawableNebulaMaster1203 polarVoyageLevelListDrawableNebulaMaster1203 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageLevelListDrawableNebulaMaster1203 != null ? polarVoyageLevelListDrawableNebulaMaster1203.PolarVoyageRotateAnimationCyberCelestialDelta4768 : null;
        }
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }
}
