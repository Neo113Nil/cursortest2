package p000createpolar;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyagePagingDataTitaniumNebula9959 extends PolarVoyageMotionLayoutTransitionPhantomCosmos1553 {
    public static final Condition PolarVoyageBottomSheetOmegaNeo1907;
    public static final long PolarVoyageCameraPixelBlaze2629;
    public static final PolarVoyageViewModelQuantumDragonPhoenix2767 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public static final ReentrantLock PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public static PolarVoyagePagingDataTitaniumNebula9959 PolarVoyageStrictModeLegendEpic1532;
    public static final long PolarVoyageViewRogueMaster4778;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageDiffUtilTurboStrike5735 = -1;
    public long PolarVoyageTextInputEditTextNebulaHero6651;

    static {
        PolarVoyageViewModelQuantumDragonPhoenix2767 polarVoyageViewModelQuantumDragonPhoenix2767 = new PolarVoyageViewModelQuantumDragonPhoenix2767(3);
        polarVoyageViewModelQuantumDragonPhoenix2767.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyagePagingDataTitaniumNebula9959[8];
        PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageViewModelQuantumDragonPhoenix2767;
        ReentrantLock reentrantLock = new ReentrantLock();
        PolarVoyageRotateAnimationCyberCelestialDelta4768 = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        PolarVoyageBottomSheetOmegaNeo1907 = newCondition;
        PolarVoyageViewRogueMaster4778 = 60000L;
        PolarVoyageCameraPixelBlaze2629 = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public IOException PolarVoyageBottomSheetOmegaNeo1907(IOException iOException) {
        throw null;
    }

    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        ReentrantLock reentrantLock = PolarVoyageRotateAnimationCyberCelestialDelta4768;
        reentrantLock.lock();
        try {
            int i = this.PolarVoyageBitmapVisionAuroraPixel4705;
            this.PolarVoyageBitmapVisionAuroraPixel4705 = 0;
            if (i != 1) {
                return i == 2;
            }
            PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void PolarVoyageStrictModeLegendEpic1532() {
        long j = this.PolarVoyageKotlinBetaPulseBeta3653;
        boolean z = this.PolarVoyageZipVortexCelestial6185;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = PolarVoyageRotateAnimationCyberCelestialDelta4768;
            reentrantLock.lock();
            try {
                if (this.PolarVoyageBitmapVisionAuroraPixel4705 != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.PolarVoyageBitmapVisionAuroraPixel4705 = 1;
                PolarVoyageOnLongClickListenerOlympianPhantomAlpha1069.PolarVoyageBottomSheetOmegaNeo1907(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public void PolarVoyageViewRogueMaster4778() {
    }
}
