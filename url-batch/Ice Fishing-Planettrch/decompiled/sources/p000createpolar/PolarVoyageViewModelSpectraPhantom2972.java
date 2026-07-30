package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewModelSpectraPhantom2972 extends PolarVoyageProcessCameraProviderHeroEpic1690 {
    public final long PolarVoyageKotlinBetaPulseBeta3653;
    public final long PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageViewModelSpectraPhantom2972(int i, long j, long j2) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        switch (i) {
            case 2:
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j;
                this.PolarVoyageKotlinBetaPulseBeta3653 = j2;
                break;
            default:
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j2;
                this.PolarVoyageKotlinBetaPulseBeta3653 = j;
                break;
        }
    }

    public static long PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j, PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312) {
        long PolarVoyagePackageManagerCelestialPhoenix8393 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
        if ((128 & PolarVoyagePackageManagerCelestialPhoenix8393) != 0) {
            return 8589934591L & ((((PolarVoyagePackageManagerCelestialPhoenix8393 & 1) << 32) | polarVoyageTextRecognitionHeroOmega1312.PolarVoyageActivityInfoBetaQuantum8726()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // p000createpolar.PolarVoyageProcessCameraProviderHeroEpic1690
    public final String toString() {
        int i = this.PolarVoyageZipVortexCelestial6185;
        long j = this.PolarVoyageKotlinBetaPulseBeta3653;
        long j2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "SCTE-35 PrivateCommand { ptsAdjustment=" + j2 + ", identifier= " + j + " }";
            case 1:
                return "SCTE-35 SpliceInsertCommand { programSplicePts=" + j2 + ", programSplicePlaybackPositionUs= " + j + " }";
            default:
                return "SCTE-35 TimeSignalCommand { ptsTime=" + j2 + ", playbackPositionUs= " + j + " }";
        }
    }

    public PolarVoyageViewModelSpectraPhantom2972(long j, long j2, List list) {
        this.PolarVoyageZipVortexCelestial6185 = 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j;
        this.PolarVoyageKotlinBetaPulseBeta3653 = j2;
        Collections.unmodifiableList(list);
    }
}
