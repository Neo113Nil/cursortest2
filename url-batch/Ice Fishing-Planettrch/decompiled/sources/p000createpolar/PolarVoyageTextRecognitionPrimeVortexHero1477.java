package p000createpolar;

import java.util.ListIterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTextRecognitionPrimeVortexHero1477 extends PolarVoyageCoroutineAuroraSolar8718 implements ListIterator {
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageDialogPhantomEliteAurora3058 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageTextRecognitionPrimeVortexHero1477(PolarVoyageDialogPhantomEliteAurora3058 polarVoyageDialogPhantomEliteAurora3058, int i) {
        int size = polarVoyageDialogPhantomEliteAurora3058.size();
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageCameraViewSpectraMaxSpectra2824(i, size);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = size;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageDialogPhantomEliteAurora3058;
    }

    public final Object PolarVoyageZipVortexCelestial6185(int i) {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.PolarVoyageStrictModeLegendEpic1532 < this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.PolarVoyageStrictModeLegendEpic1532 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageStrictModeLegendEpic1532 = i + 1;
        return PolarVoyageZipVortexCelestial6185(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        int i = this.PolarVoyageStrictModeLegendEpic1532 - 1;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        return PolarVoyageZipVortexCelestial6185(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.PolarVoyageStrictModeLegendEpic1532 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
