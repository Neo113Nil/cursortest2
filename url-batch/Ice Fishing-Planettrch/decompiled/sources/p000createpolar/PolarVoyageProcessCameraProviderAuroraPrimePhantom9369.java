package p000createpolar;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageProcessCameraProviderAuroraPrimePhantom9369 {
    public static final int PolarVoyageBarcodeScannerInfernoSolarSpark7767(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((PolarVoyageServiceConnectionPhoenixSpectra4267) arrayList.get(i4)).PolarVoyageZipVortexCelestial6185;
            if (i5 < 0) {
                i5 += i2;
            }
            int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageRemoteModelManagerOlympianCelestial9141(i5, i);
            if (PolarVoyageRemoteModelManagerOlympianCelestial9141 < 0) {
                i3 = i4 + 1;
            } else {
                if (PolarVoyageRemoteModelManagerOlympianCelestial9141 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void PolarVoyageBitmapVisionAuroraPixel4705() {
        throw new ConcurrentModificationException();
    }

    public static final void PolarVoyageKotlinBetaPulseBeta3653(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int PolarVoyageMotionLayoutTransitionHeroVision4068(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final int PolarVoyageZipVortexCelestial6185(ArrayList arrayList, int i, int i2) {
        int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(arrayList, i, i2);
        return PolarVoyageBarcodeScannerInfernoSolarSpark7767 >= 0 ? PolarVoyageBarcodeScannerInfernoSolarSpark7767 : -(PolarVoyageBarcodeScannerInfernoSolarSpark7767 + 1);
    }
}
