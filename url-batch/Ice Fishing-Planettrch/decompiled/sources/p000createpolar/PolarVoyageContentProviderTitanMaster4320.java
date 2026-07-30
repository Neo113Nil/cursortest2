package p000createpolar;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageContentProviderTitanMaster4320 implements Iterator, PolarVoyageTextInputLayoutTitaniumGamma2126, PolarVoyageZipDeltaSpectraRogue6055 {
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public PolarVoyageTextInputLayoutTitaniumGamma2126 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object PolarVoyageStrictModeLegendEpic1532;

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(Object obj, PolarVoyageVectorDrawableLegendSparkMax1744 polarVoyageVectorDrawableLegendSparkMax1744) {
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 3;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageVectorDrawableLegendSparkMax1744;
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTitaniumGamma2126
    public final void PolarVoyageViewRogueMaster4778(Object obj) {
        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 4;
    }

    public final RuntimeException PolarVoyageZipVortexCelestial6185() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTitaniumGamma2126
    public final PolarVoyageEventNebulaCelestialOlympian6822 getContext() {
        return PolarVoyageDialogFragmentLegendEpic2069.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i != 0) {
                break;
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 5;
            PolarVoyageTextInputLayoutTitaniumGamma2126 polarVoyageTextInputLayoutTitaniumGamma2126 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            polarVoyageTextInputLayoutTitaniumGamma2126.getClass();
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
            polarVoyageTextInputLayoutTitaniumGamma2126.PolarVoyageViewRogueMaster4778(PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw PolarVoyageZipVortexCelestial6185();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        if (i == 2) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
            throw null;
        }
        if (i != 3) {
            throw PolarVoyageZipVortexCelestial6185();
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageStrictModeLegendEpic1532 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
