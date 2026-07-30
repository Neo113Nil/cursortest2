package p000createpolar;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMLKitQuantumEpic5634 {
    public static PolarVoyageMLKitQuantumEpic5634 PolarVoyageDiffUtilTurboStrike5735;
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public boolean PolarVoyageBitmapVisionAuroraPixel4705;
    public final Object PolarVoyageKotlinBetaPulseBeta3653;
    public final CopyOnWriteArrayList PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final Executor PolarVoyageZipVortexCelestial6185;

    public PolarVoyageMLKitQuantumEpic5634(Context context) {
        Executor PolarVoyagePackageManagerCelestialPhoenix8393 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyagePackageManagerCelestialPhoenix8393();
        this.PolarVoyageZipVortexCelestial6185 = PolarVoyagePackageManagerCelestialPhoenix8393;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new CopyOnWriteArrayList();
        this.PolarVoyageKotlinBetaPulseBeta3653 = new Object();
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
        PolarVoyagePackageManagerCelestialPhoenix8393.execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(29, this, context));
    }

    public static synchronized PolarVoyageMLKitQuantumEpic5634 PolarVoyageZipVortexCelestial6185(Context context) {
        PolarVoyageMLKitQuantumEpic5634 polarVoyageMLKitQuantumEpic5634;
        synchronized (PolarVoyageMLKitQuantumEpic5634.class) {
            try {
                if (PolarVoyageDiffUtilTurboStrike5735 == null) {
                    PolarVoyageDiffUtilTurboStrike5735 = new PolarVoyageMLKitQuantumEpic5634(context);
                }
                polarVoyageMLKitQuantumEpic5634 = PolarVoyageDiffUtilTurboStrike5735;
            } catch (Throwable th) {
                throw th;
            }
        }
        return polarVoyageMLKitQuantumEpic5634;
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            PolarVoyageCamera2OmegaBlaze5174 polarVoyageCamera2OmegaBlaze5174 = (PolarVoyageCamera2OmegaBlaze5174) it.next();
            if (polarVoyageCamera2OmegaBlaze5174.PolarVoyageZipVortexCelestial6185.get() == null) {
                copyOnWriteArrayList.remove(polarVoyageCamera2OmegaBlaze5174);
            }
        }
        synchronized (this.PolarVoyageKotlinBetaPulseBeta3653) {
            try {
                if (this.PolarVoyageBitmapVisionAuroraPixel4705 && this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == i) {
                    return;
                }
                this.PolarVoyageBitmapVisionAuroraPixel4705 = true;
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i;
                Iterator it2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068.iterator();
                while (it2.hasNext()) {
                    PolarVoyageCamera2OmegaBlaze5174 polarVoyageCamera2OmegaBlaze51742 = (PolarVoyageCamera2OmegaBlaze5174) it2.next();
                    polarVoyageCamera2OmegaBlaze51742.PolarVoyageMotionLayoutTransitionHeroVision4068.execute(new PolarVoyageLightSensorSparkBlazeTitanium9192(21, polarVoyageCamera2OmegaBlaze51742));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int PolarVoyageMotionLayoutTransitionHeroVision4068() {
        int i;
        synchronized (this.PolarVoyageKotlinBetaPulseBeta3653) {
            i = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        }
        return i;
    }
}
