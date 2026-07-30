package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageServiceInfoHyperionPrimeForce8734 {
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageZipVortexCelestial6185;
    public Object PolarVoyageKotlinBetaPulseBeta3653 = new long[10];
    public Object PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new Object[10];

    public synchronized Object PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j) {
        Object obj;
        obj = null;
        while (this.PolarVoyageMotionLayoutTransitionHeroVision4068 > 0 && j - ((long[]) this.PolarVoyageKotlinBetaPulseBeta3653)[this.PolarVoyageZipVortexCelestial6185] >= 0) {
            obj = PolarVoyageBitmapVisionAuroraPixel4705();
        }
        return obj;
    }

    public Object PolarVoyageBitmapVisionAuroraPixel4705() {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(this.PolarVoyageMotionLayoutTransitionHeroVision4068 > 0);
        Object[] objArr = (Object[]) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i = this.PolarVoyageZipVortexCelestial6185;
        Object obj = objArr[i];
        objArr[i] = null;
        this.PolarVoyageZipVortexCelestial6185 = (i + 1) % objArr.length;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068--;
        return obj;
    }

    public synchronized int PolarVoyageDiffUtilTurboStrike5735() {
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public synchronized Object PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068 == 0 ? null : PolarVoyageBitmapVisionAuroraPixel4705();
    }

    public void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        int length = ((Object[]) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767).length;
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.PolarVoyageZipVortexCelestial6185;
        int i3 = length - i2;
        System.arraycopy((long[]) this.PolarVoyageKotlinBetaPulseBeta3653, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, this.PolarVoyageZipVortexCelestial6185, objArr, 0, i3);
        int i4 = this.PolarVoyageZipVortexCelestial6185;
        if (i4 > 0) {
            System.arraycopy((long[]) this.PolarVoyageKotlinBetaPulseBeta3653, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, 0, objArr, i3, this.PolarVoyageZipVortexCelestial6185);
        }
        this.PolarVoyageKotlinBetaPulseBeta3653 = jArr;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = objArr;
        this.PolarVoyageZipVortexCelestial6185 = 0;
    }

    public synchronized void PolarVoyageZipVortexCelestial6185(long j, Object obj) {
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 > 0) {
            if (j <= ((long[]) this.PolarVoyageKotlinBetaPulseBeta3653)[((this.PolarVoyageZipVortexCelestial6185 + r0) - 1) % ((Object[]) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767).length]) {
                synchronized (this) {
                    this.PolarVoyageZipVortexCelestial6185 = 0;
                    this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 0;
                    Arrays.fill((Object[]) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, (Object) null);
                }
            }
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        int i = this.PolarVoyageZipVortexCelestial6185;
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Object[] objArr = (Object[]) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int length = (i + i2) % objArr.length;
        ((long[]) this.PolarVoyageKotlinBetaPulseBeta3653)[length] = j;
        objArr[length] = obj;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2 + 1;
    }
}
