package p000createpolar;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewModelOmegaVortexEclipse9127 extends PolarVoyageResourceBetaDragon8086 {
    public int PolarVoyageAnimatorSetSparkUltraMax8233;
    public int PolarVoyageNavigationViewHyperHyperHyperion1793;
    public long PolarVoyageRemoteModelManagerOlympianCelestial9141;

    public final boolean PolarVoyageBottomSheetOmegaNeo1907() {
        return this.PolarVoyageNavigationViewHyperHyperHyperion1793 > 0;
    }

    @Override // p000createpolar.PolarVoyageResourceBetaDragon8086
    public final void PolarVoyageDiffUtilTurboStrike5735() {
        super.PolarVoyageDiffUtilTurboStrike5735();
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = 0;
    }

    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageResourceBetaDragon8086 polarVoyageResourceBetaDragon8086) {
        ByteBuffer byteBuffer;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(!polarVoyageResourceBetaDragon8086.PolarVoyageBarcodeScannerInfernoSolarSpark7767(1073741824));
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(!polarVoyageResourceBetaDragon8086.PolarVoyageBarcodeScannerInfernoSolarSpark7767(268435456));
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(!polarVoyageResourceBetaDragon8086.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4));
        if (PolarVoyageBottomSheetOmegaNeo1907()) {
            if (this.PolarVoyageNavigationViewHyperHyperHyperion1793 >= this.PolarVoyageAnimatorSetSparkUltraMax8233) {
                return false;
            }
            ByteBuffer byteBuffer2 = polarVoyageResourceBetaDragon8086.PolarVoyageViewRogueMaster4778;
            if (byteBuffer2 != null && (byteBuffer = this.PolarVoyageViewRogueMaster4778) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = i + 1;
        if (i == 0) {
            this.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageResourceBetaDragon8086.PolarVoyageDrawableDeltaHyperion5742;
            if (polarVoyageResourceBetaDragon8086.PolarVoyageBarcodeScannerInfernoSolarSpark7767(1)) {
                this.PolarVoyageStrictModeLegendEpic1532 = 1;
            }
        }
        ByteBuffer byteBuffer3 = polarVoyageResourceBetaDragon8086.PolarVoyageViewRogueMaster4778;
        if (byteBuffer3 != null) {
            PolarVoyageItemDecorationUltraDeltaEpic7485(byteBuffer3.remaining());
            this.PolarVoyageViewRogueMaster4778.put(byteBuffer3);
        }
        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageResourceBetaDragon8086.PolarVoyageDrawableDeltaHyperion5742;
        return true;
    }
}
