package p000createpolar;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTransformHeroLegendPulse4169 implements PolarVoyageTransitionListenerCelestialElite5453 {
    public final AtomicReference PolarVoyageZipVortexCelestial6185;

    public PolarVoyageTransformHeroLegendPulse4169(PolarVoyageTransitionListenerCelestialElite5453 polarVoyageTransitionListenerCelestialElite5453) {
        this.PolarVoyageZipVortexCelestial6185 = new AtomicReference(polarVoyageTransitionListenerCelestialElite5453);
    }

    @Override // p000createpolar.PolarVoyageTransitionListenerCelestialElite5453
    public final Iterator iterator() {
        PolarVoyageTransitionListenerCelestialElite5453 polarVoyageTransitionListenerCelestialElite5453 = (PolarVoyageTransitionListenerCelestialElite5453) this.PolarVoyageZipVortexCelestial6185.getAndSet(null);
        if (polarVoyageTransitionListenerCelestialElite5453 != null) {
            return polarVoyageTransitionListenerCelestialElite5453.iterator();
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("This sequence can be consumed only once.");
        return null;
    }
}
