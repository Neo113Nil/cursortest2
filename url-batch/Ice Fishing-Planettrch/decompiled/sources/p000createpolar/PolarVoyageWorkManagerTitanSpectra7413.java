package p000createpolar;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageWorkManagerTitanSpectra7413 implements PolarVoyageViewEliteBeta6786 {
    public boolean PolarVoyageBottomSheetOmegaNeo1907;
    public boolean PolarVoyageCameraPixelBlaze2629;
    public boolean PolarVoyageDrawableDeltaHyperion5742;
    public final PolarVoyageViewEliteBeta6786 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ PolarVoyagePoseDetectionPrimeNebula3086 PolarVoyageSnackbarGammaEclipse2140;
    public final long PolarVoyageStrictModeLegendEpic1532;
    public long PolarVoyageViewRogueMaster4778;

    public PolarVoyageWorkManagerTitanSpectra7413(PolarVoyagePoseDetectionPrimeNebula3086 polarVoyagePoseDetectionPrimeNebula3086, PolarVoyageViewEliteBeta6786 polarVoyageViewEliteBeta6786, long j, boolean z) {
        polarVoyageViewEliteBeta6786.getClass();
        this.PolarVoyageSnackbarGammaEclipse2140 = polarVoyagePoseDetectionPrimeNebula3086;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageViewEliteBeta6786;
        this.PolarVoyageStrictModeLegendEpic1532 = j;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = z;
        this.PolarVoyageCameraPixelBlaze2629 = z;
    }

    public final IOException PolarVoyageBarcodeScannerInfernoSolarSpark7767(IOException iOException) {
        if (this.PolarVoyageBottomSheetOmegaNeo1907) {
            return iOException;
        }
        this.PolarVoyageBottomSheetOmegaNeo1907 = true;
        return PolarVoyagePoseDetectionPrimeNebula3086.PolarVoyageZipVortexCelestial6185(this.PolarVoyageSnackbarGammaEclipse2140, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, iOException, 4);
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.flush();
    }

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653();
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.close();
    }

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786
    public final void PolarVoyageViewRogueMaster4778(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        if (this.PolarVoyageDrawableDeltaHyperion5742) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("closed");
            return;
        }
        long j2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (j2 != -1 && this.PolarVoyageViewRogueMaster4778 + j > j2) {
            throw new ProtocolException("expected " + j2 + " bytes but received " + (this.PolarVoyageViewRogueMaster4778 + j));
        }
        try {
            if (this.PolarVoyageCameraPixelBlaze2629) {
                this.PolarVoyageCameraPixelBlaze2629 = false;
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageViewRogueMaster4778(j, polarVoyageSnackbarSpectraMasterMaster4120);
            this.PolarVoyageViewRogueMaster4778 += j;
        } catch (IOException e) {
            IOException PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(e);
            PolarVoyageBarcodeScannerInfernoSolarSpark7767.getClass();
            throw PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        }
    }

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.PolarVoyageDrawableDeltaHyperion5742) {
            return;
        }
        this.PolarVoyageDrawableDeltaHyperion5742 = true;
        long j = this.PolarVoyageStrictModeLegendEpic1532;
        if (j != -1 && this.PolarVoyageViewRogueMaster4778 != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            PolarVoyageMotionLayoutTransitionHeroVision4068();
            PolarVoyageBarcodeScannerInfernoSolarSpark7767(null);
        } catch (IOException e) {
            IOException PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(e);
            PolarVoyageBarcodeScannerInfernoSolarSpark7767.getClass();
            throw PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        }
    }

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786, java.io.Flushable
    public final void flush() {
        try {
            PolarVoyageBitmapVisionAuroraPixel4705();
        } catch (IOException e) {
            IOException PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(e);
            PolarVoyageBarcodeScannerInfernoSolarSpark7767.getClass();
            throw PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        }
    }

    public final String toString() {
        return PolarVoyageWorkManagerTitanSpectra7413.class.getSimpleName() + '(' + this.PolarVoyageItemDecorationUltraDeltaEpic7485 + ')';
    }
}
