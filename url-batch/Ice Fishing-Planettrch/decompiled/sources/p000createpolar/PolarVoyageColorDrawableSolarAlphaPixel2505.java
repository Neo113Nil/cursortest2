package p000createpolar;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageColorDrawableSolarAlphaPixel2505 extends PolarVoyageFragmentManagerLegendTurboPrime4319 {
    public int[] PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int[] PolarVoyageStrictModeLegendEpic1532;

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final void PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // p000createpolar.PolarVoyageLiveDataQuantumSpeedNovaX2823
    public final void PolarVoyageTextInputEditTextNebulaHero6651(ByteBuffer byteBuffer) {
        int[] iArr = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629(((limit - position) / this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767) * this.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        while (position < limit) {
            for (int i : iArr) {
                int PolarVoyageDrawableDeltaHyperion5742 = (PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageDrawableDeltaHyperion5742(this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653) * i) + position;
                int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653;
                if (i2 != 2) {
                    if (i2 == 3) {
                        PolarVoyageCameraPixelBlaze2629.put(byteBuffer.get(PolarVoyageDrawableDeltaHyperion5742));
                    } else if (i2 != 4) {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            if (i2 != 1879048192) {
                                                throw new IllegalStateException("Unexpected encoding: " + this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653);
                                            }
                                            PolarVoyageCameraPixelBlaze2629.putDouble(byteBuffer.getDouble(PolarVoyageDrawableDeltaHyperion5742));
                                        }
                                    }
                                }
                            }
                            PolarVoyageCameraPixelBlaze2629.putInt(byteBuffer.getInt(PolarVoyageDrawableDeltaHyperion5742));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b = byteBuffer.get(order == byteOrder ? PolarVoyageDrawableDeltaHyperion5742 : PolarVoyageDrawableDeltaHyperion5742 + 2);
                        byte b2 = byteBuffer.get(PolarVoyageDrawableDeltaHyperion5742 + 1);
                        if (byteBuffer.order() == byteOrder) {
                            PolarVoyageDrawableDeltaHyperion5742 += 2;
                        }
                        int i3 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(PolarVoyageDrawableDeltaHyperion5742) << 8) & 65280)) >> 8;
                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAnimatorSetSparkUltraMax8233((i3 & (-16777216)) == 0 || (i3 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(PolarVoyageCameraPixelBlaze2629.remaining() >= 3);
                        PolarVoyageCameraPixelBlaze2629.put((byte) (PolarVoyageCameraPixelBlaze2629.order() == byteOrder ? (i3 & 16711680) >> 16 : i3 & 255)).put((byte) ((i3 & 65280) >> 8)).put((byte) (PolarVoyageCameraPixelBlaze2629.order() == byteOrder ? i3 & 255 : (i3 & 16711680) >> 16));
                    } else {
                        PolarVoyageCameraPixelBlaze2629.putFloat(byteBuffer.getFloat(PolarVoyageDrawableDeltaHyperion5742));
                    }
                }
                PolarVoyageCameraPixelBlaze2629.putShort(byteBuffer.getShort(PolarVoyageDrawableDeltaHyperion5742));
            }
            position += this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        }
        byteBuffer.position(limit);
        PolarVoyageCameraPixelBlaze2629.flip();
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final void PolarVoyageViewRogueMaster4778() {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
        this.PolarVoyageStrictModeLegendEpic1532 = null;
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final PolarVoyageFocusMeteringActionCelestialStrikeMax1103 PolarVoyageZipVortexCelestial6185(PolarVoyageFocusMeteringActionCelestialStrikeMax1103 polarVoyageFocusMeteringActionCelestialStrikeMax1103) {
        int i = polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageKotlinBetaPulseBeta3653;
        int[] iArr = this.PolarVoyageStrictModeLegendEpic1532;
        if (iArr == null) {
            return PolarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageBitmapVisionAuroraPixel4705;
        }
        int i2 = polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (!PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageCameraViewSpectraMaxSpectra2824(i)) {
            throw new PolarVoyageOnAttachStateChangeListenerRoguePulse3137(polarVoyageFocusMeteringActionCelestialStrikeMax1103);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new PolarVoyageOnAttachStateChangeListenerRoguePulse3137("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", polarVoyageFocusMeteringActionCelestialStrikeMax1103);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new PolarVoyageFocusMeteringActionCelestialStrikeMax1103(polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageZipVortexCelestial6185, iArr.length, i) : PolarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageBitmapVisionAuroraPixel4705;
    }
}
