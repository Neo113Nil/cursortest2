package p000createpolar;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLayerPhoenixCyber4557 {
    public static final PolarVoyageLayerPhoenixCyber4557 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final PolarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799 PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;

    static {
        PolarVoyageLayerPhoenixCyber4557 polarVoyageLayerPhoenixCyber4557;
        if (Build.VERSION.SDK_INT >= 33) {
            PolarVoyageActionBarSolarQuantumStorm2174 polarVoyageActionBarSolarQuantumStorm2174 = new PolarVoyageActionBarSolarQuantumStorm2174(4);
            for (int i = 1; i <= 10; i++) {
                polarVoyageActionBarSolarQuantumStorm2174.PolarVoyageMotionLayoutTransitionHeroVision4068(Integer.valueOf(PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageCameraPixelBlaze2629(i)));
            }
            polarVoyageLayerPhoenixCyber4557 = new PolarVoyageLayerPhoenixCyber4557(2, polarVoyageActionBarSolarQuantumStorm2174.PolarVoyageTextInputEditTextNebulaHero6651());
        } else {
            polarVoyageLayerPhoenixCyber4557 = new PolarVoyageLayerPhoenixCyber4557(2, 10);
        }
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageLayerPhoenixCyber4557;
    }

    public PolarVoyageLayerPhoenixCyber4557(int i, Set set) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        PolarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799 PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799.PolarVoyageBottomSheetOmegaNeo1907(set);
        this.PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageCoroutineAuroraSolar8718 it = PolarVoyageBottomSheetOmegaNeo1907.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageLayerPhoenixCyber4557)) {
            return false;
        }
        PolarVoyageLayerPhoenixCyber4557 polarVoyageLayerPhoenixCyber4557 = (PolarVoyageLayerPhoenixCyber4557) obj;
        return this.PolarVoyageZipVortexCelestial6185 == polarVoyageLayerPhoenixCyber4557.PolarVoyageZipVortexCelestial6185 && this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageLayerPhoenixCyber4557.PolarVoyageMotionLayoutTransitionHeroVision4068 && Objects.equals(this.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageLayerPhoenixCyber4557.PolarVoyageKotlinBetaPulseBeta3653);
    }

    public final int hashCode() {
        int i = ((this.PolarVoyageZipVortexCelestial6185 * 31) + this.PolarVoyageMotionLayoutTransitionHeroVision4068) * 31;
        PolarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799 polarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799 = this.PolarVoyageKotlinBetaPulseBeta3653;
        return i + (polarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799 == null ? 0 : polarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.PolarVoyageZipVortexCelestial6185 + ", maxChannelCount=" + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ", channelMasks=" + this.PolarVoyageKotlinBetaPulseBeta3653 + "]";
    }

    public PolarVoyageLayerPhoenixCyber4557(int i, int i2) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = null;
    }
}
