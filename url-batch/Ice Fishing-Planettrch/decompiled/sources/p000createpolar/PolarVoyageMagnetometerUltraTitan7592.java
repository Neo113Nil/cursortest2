package p000createpolar;

import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMagnetometerUltraTitan7592 implements PolarVoyageTransitionListenerCelestialElite5453, PolarVoyageAudioManagerThunderUltra6529 {
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageTransitionListenerCelestialElite5453 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageMagnetometerUltraTitan7592(PolarVoyageTransitionListenerCelestialElite5453 polarVoyageTransitionListenerCelestialElite5453, int i) {
        polarVoyageTransitionListenerCelestialElite5453.getClass();
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageTransitionListenerCelestialElite5453;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p000createpolar.PolarVoyageAudioManagerThunderUltra6529
    public final PolarVoyageTransitionListenerCelestialElite5453 PolarVoyageZipVortexCelestial6185(int i) {
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068 + i;
        return i2 < 0 ? new PolarVoyageMagnetometerUltraTitan7592(this, i) : new PolarVoyageMagnetometerUltraTitan7592(this.PolarVoyageZipVortexCelestial6185, i2);
    }

    @Override // p000createpolar.PolarVoyageTransitionListenerCelestialElite5453
    public final Iterator iterator() {
        return new PolarVoyageProximitySensorHyperBlaze3823(this);
    }
}
