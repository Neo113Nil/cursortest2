package p000createpolar;

import java.math.RoundingMode;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSupervisorJobStrikeCelestialGamma8770 {
    public final ThreadLocal PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new ThreadLocal();
    public long PolarVoyageKotlinBetaPulseBeta3653;
    public long PolarVoyageMotionLayoutTransitionHeroVision4068;
    public long PolarVoyageZipVortexCelestial6185;

    public PolarVoyageSupervisorJobStrikeCelestialGamma8770(long j) {
        PolarVoyageBitmapVisionAuroraPixel4705(j);
    }

    public final synchronized long PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        long j;
        j = this.PolarVoyageZipVortexCelestial6185;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void PolarVoyageBitmapVisionAuroraPixel4705(long j) {
        this.PolarVoyageZipVortexCelestial6185 = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.PolarVoyageKotlinBetaPulseBeta3653 = -9223372036854775807L;
    }

    public final synchronized long PolarVoyageKotlinBetaPulseBeta3653(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.PolarVoyageKotlinBetaPulseBeta3653;
            if (j2 != -9223372036854775807L) {
                String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                long PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            long j5 = j;
            String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            return PolarVoyageZipVortexCelestial6185(PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long PolarVoyageMotionLayoutTransitionHeroVision4068(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.PolarVoyageKotlinBetaPulseBeta3653;
            if (j2 != -9223372036854775807L) {
                String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                long PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149) < Math.abs(j5 - PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149) ? j4 : j5;
            }
            long j6 = j;
            String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            return PolarVoyageZipVortexCelestial6185(PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long PolarVoyageZipVortexCelestial6185(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.PolarVoyageMotionLayoutTransitionHeroVision4068 != -9223372036854775807L)) {
                    long j3 = this.PolarVoyageZipVortexCelestial6185;
                    if (j3 == 9223372036854775806L) {
                        Long l = (Long) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get();
                        l.getClass();
                        j3 = l.longValue();
                    }
                    this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j3 - j;
                    notifyAll();
                }
                this.PolarVoyageKotlinBetaPulseBeta3653 = j;
                j2 = j + this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            }
            return j2;
        } catch (Throwable th) {
            throw th;
        }
    }
}
