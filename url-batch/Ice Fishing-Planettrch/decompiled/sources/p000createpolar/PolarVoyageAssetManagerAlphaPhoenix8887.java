package p000createpolar;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAssetManagerAlphaPhoenix8887 extends PolarVoyageFragmentManagerLegendTurboPrime4319 {
    public boolean PolarVoyageBottomSheetOmegaNeo1907;
    public byte[] PolarVoyageCameraPixelBlaze2629;
    public int PolarVoyageDrawableDeltaHyperion5742;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public long PolarVoyageSnackbarGammaEclipse2140;
    public int PolarVoyageStrictModeLegendEpic1532;
    public int PolarVoyageViewRogueMaster4778;

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319, p000createpolar.PolarVoyageLiveDataQuantumSpeedNovaX2823
    public final ByteBuffer PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        int i;
        if (super.PolarVoyageKotlinBetaPulseBeta3653() && (i = this.PolarVoyageDrawableDeltaHyperion5742) > 0) {
            PolarVoyageCameraPixelBlaze2629(i).put(this.PolarVoyageCameraPixelBlaze2629, 0, this.PolarVoyageDrawableDeltaHyperion5742).flip();
            this.PolarVoyageDrawableDeltaHyperion5742 = 0;
        }
        return super.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final void PolarVoyageBottomSheetOmegaNeo1907() {
        if (this.PolarVoyageBottomSheetOmegaNeo1907) {
            if (this.PolarVoyageDrawableDeltaHyperion5742 > 0) {
                this.PolarVoyageSnackbarGammaEclipse2140 += r0 / this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            }
            this.PolarVoyageDrawableDeltaHyperion5742 = 0;
        }
    }

    @Override // p000createpolar.PolarVoyageLiveDataQuantumSpeedNovaX2823
    public final long PolarVoyageItemDecorationUltraDeltaEpic7485(long j) {
        return Math.max(0L, j - PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageCardViewAlphaVortexCelestial9747(this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185, this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + this.PolarVoyageStrictModeLegendEpic1532));
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319, p000createpolar.PolarVoyageLiveDataQuantumSpeedNovaX2823
    public final boolean PolarVoyageKotlinBetaPulseBeta3653() {
        return super.PolarVoyageKotlinBetaPulseBeta3653() && this.PolarVoyageDrawableDeltaHyperion5742 == 0;
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final void PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        if (this.PolarVoyageBottomSheetOmegaNeo1907) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = false;
            int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            this.PolarVoyageCameraPixelBlaze2629 = new byte[i * i2];
            this.PolarVoyageViewRogueMaster4778 = this.PolarVoyageStrictModeLegendEpic1532 * i2;
        }
        this.PolarVoyageDrawableDeltaHyperion5742 = 0;
    }

    @Override // p000createpolar.PolarVoyageLiveDataQuantumSpeedNovaX2823
    public final void PolarVoyageTextInputEditTextNebulaHero6651(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.PolarVoyageViewRogueMaster4778);
        this.PolarVoyageSnackbarGammaEclipse2140 += min / this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        this.PolarVoyageViewRogueMaster4778 -= min;
        byteBuffer.position(position + min);
        if (this.PolarVoyageViewRogueMaster4778 > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.PolarVoyageDrawableDeltaHyperion5742 + i2) - this.PolarVoyageCameraPixelBlaze2629.length;
        ByteBuffer PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629(length);
        int PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageTextInputEditTextNebulaHero6651(length, 0, this.PolarVoyageDrawableDeltaHyperion5742);
        PolarVoyageCameraPixelBlaze2629.put(this.PolarVoyageCameraPixelBlaze2629, 0, PolarVoyageTextInputEditTextNebulaHero6651);
        int PolarVoyageTextInputEditTextNebulaHero66512 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageTextInputEditTextNebulaHero6651(length - PolarVoyageTextInputEditTextNebulaHero6651, 0, i2);
        byteBuffer.limit(byteBuffer.position() + PolarVoyageTextInputEditTextNebulaHero66512);
        PolarVoyageCameraPixelBlaze2629.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - PolarVoyageTextInputEditTextNebulaHero66512;
        int i4 = this.PolarVoyageDrawableDeltaHyperion5742 - PolarVoyageTextInputEditTextNebulaHero6651;
        this.PolarVoyageDrawableDeltaHyperion5742 = i4;
        byte[] bArr = this.PolarVoyageCameraPixelBlaze2629;
        System.arraycopy(bArr, PolarVoyageTextInputEditTextNebulaHero6651, bArr, 0, i4);
        byteBuffer.get(this.PolarVoyageCameraPixelBlaze2629, this.PolarVoyageDrawableDeltaHyperion5742, i3);
        this.PolarVoyageDrawableDeltaHyperion5742 += i3;
        PolarVoyageCameraPixelBlaze2629.flip();
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final void PolarVoyageViewRogueMaster4778() {
        this.PolarVoyageCameraPixelBlaze2629 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final PolarVoyageFocusMeteringActionCelestialStrikeMax1103 PolarVoyageZipVortexCelestial6185(PolarVoyageFocusMeteringActionCelestialStrikeMax1103 polarVoyageFocusMeteringActionCelestialStrikeMax1103) {
        if (!PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageKotlinBetaPulseBeta3653)) {
            throw new PolarVoyageOnAttachStateChangeListenerRoguePulse3137(polarVoyageFocusMeteringActionCelestialStrikeMax1103);
        }
        this.PolarVoyageBottomSheetOmegaNeo1907 = true;
        return (this.PolarVoyageStrictModeLegendEpic1532 == 0 && this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == 0) ? PolarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageBitmapVisionAuroraPixel4705 : polarVoyageFocusMeteringActionCelestialStrikeMax1103;
    }
}
