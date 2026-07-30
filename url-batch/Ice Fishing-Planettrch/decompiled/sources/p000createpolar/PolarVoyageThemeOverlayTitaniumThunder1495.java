package p000createpolar;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageThemeOverlayTitaniumThunder1495 extends PolarVoyageNotificationBetaStrike7088 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater PolarVoyageDrawableDeltaHyperion5742 = AtomicIntegerFieldUpdater.newUpdater(PolarVoyageThemeOverlayTitaniumThunder1495.class, "_state$volatile");
    public PolarVoyagePagingDataStormPhantomEclipse5825 PolarVoyageCameraPixelBlaze2629;
    public final Thread PolarVoyageViewRogueMaster4778 = Thread.currentThread();
    private volatile /* synthetic */ int _state$volatile;

    public static void PolarVoyageDrawableDeltaHyperion5742(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // p000createpolar.PolarVoyageNotificationBetaStrike7088
    public final boolean PolarVoyageBottomSheetOmegaNeo1907() {
        return true;
    }

    public final void PolarVoyageCameraPixelBlaze2629() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = PolarVoyageDrawableDeltaHyperion5742;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        PolarVoyageDrawableDeltaHyperion5742(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                PolarVoyagePagingDataStormPhantomEclipse5825 polarVoyagePagingDataStormPhantomEclipse5825 = this.PolarVoyageCameraPixelBlaze2629;
                if (polarVoyagePagingDataStormPhantomEclipse5825 != null) {
                    polarVoyagePagingDataStormPhantomEclipse5825.PolarVoyageZipVortexCelestial6185();
                    return;
                }
                return;
            }
        }
    }

    @Override // p000createpolar.PolarVoyageNotificationBetaStrike7088
    public final void PolarVoyageViewRogueMaster4778(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = PolarVoyageDrawableDeltaHyperion5742;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                PolarVoyageDrawableDeltaHyperion5742(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.PolarVoyageViewRogueMaster4778.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }
}
