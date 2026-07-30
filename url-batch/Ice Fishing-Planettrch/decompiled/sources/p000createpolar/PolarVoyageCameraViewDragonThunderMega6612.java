package p000createpolar;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCameraViewDragonThunderMega6612 extends PolarVoyageFragmentManagerLegendTurboPrime4319 {
    public byte[] PolarVoyageAnimatorSetSparkUltraMax8233;
    public int PolarVoyageContentProviderHyperSpark3838;
    public int PolarVoyageDrawableDeltaHyperion5742;
    public byte[] PolarVoyageLayerDrawableShadowTitaniumOmega1942;
    public long PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public boolean PolarVoyageSnackbarGammaEclipse2140;
    public int PolarVoyageNavigationViewHyperHyperHyperion1793 = 0;
    public int PolarVoyageBitmapMaxTitanTitan7960 = 0;
    public int PolarVoyageDisplayMetricsVortexDragon9516 = 0;
    public final long PolarVoyageViewRogueMaster4778 = 100000;
    public final float PolarVoyageStrictModeLegendEpic1532 = 0.2f;
    public final long PolarVoyageCameraPixelBlaze2629 = 2000000;
    public final int PolarVoyageBottomSheetOmegaNeo1907 = 10;
    public final short PolarVoyageRotateAnimationCyberCelestialDelta4768 = 1024;

    public PolarVoyageCameraViewDragonThunderMega6612() {
        byte[] bArr = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageAnimatorSetSparkUltraMax8233 = bArr;
        this.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = bArr;
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final void PolarVoyageBottomSheetOmegaNeo1907() {
        if (this.PolarVoyageDisplayMetricsVortexDragon9516 > 0) {
            PolarVoyageSnackbarGammaEclipse2140(true);
            this.PolarVoyageNavigationViewHyperHyperHyperion1793 = 0;
        }
    }

    public final void PolarVoyageContentProviderHyperSpark3838(int i, int i2) {
        if (i == 0) {
            return;
        }
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(this.PolarVoyageDisplayMetricsVortexDragon9516 >= i);
        int i3 = this.PolarVoyageBitmapMaxTitanTitan7960;
        if (i2 == 2) {
            int i4 = this.PolarVoyageDisplayMetricsVortexDragon9516;
            int i5 = i3 + i4;
            byte[] bArr = this.PolarVoyageAnimatorSetSparkUltraMax8233;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.PolarVoyageLayerDrawableShadowTitaniumOmega1942, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                byte[] bArr2 = this.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, bArr2, 0, i6);
                    System.arraycopy(this.PolarVoyageAnimatorSetSparkUltraMax8233, 0, this.PolarVoyageLayerDrawableShadowTitaniumOmega1942, i6, length);
                }
            }
        } else {
            int i7 = i3 + i;
            byte[] bArr3 = this.PolarVoyageAnimatorSetSparkUltraMax8233;
            int length2 = bArr3.length;
            byte[] bArr4 = this.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
            if (i7 <= length2) {
                System.arraycopy(bArr3, i3, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i3;
                System.arraycopy(bArr3, i3, bArr4, 0, length3);
                System.arraycopy(this.PolarVoyageAnimatorSetSparkUltraMax8233, 0, this.PolarVoyageLayerDrawableShadowTitaniumOmega1942, length3, i - length3);
            }
        }
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageRemoteModelManagerOlympianCelestial9141(i % this.PolarVoyageDrawableDeltaHyperion5742 == 0, "sizeToOutput is not aligned to frame size: %s", i);
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(this.PolarVoyageBitmapMaxTitanTitan7960 < this.PolarVoyageAnimatorSetSparkUltraMax8233.length);
        byte[] bArr5 = this.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageRemoteModelManagerOlympianCelestial9141(i % this.PolarVoyageDrawableDeltaHyperion5742 == 0, "byteOutput size is not aligned to frame size %s", i);
        if (i2 != 3) {
            for (int i8 = 0; i8 < i; i8 += 2) {
                int i9 = i8 + 1;
                int i10 = (bArr5[i9] << 8) | (bArr5[i8] & 255);
                int i11 = this.PolarVoyageBottomSheetOmegaNeo1907;
                if (i2 == 0) {
                    i11 = ((((i8 * 1000) / (i - 1)) * (i11 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i11 += (((i8 * 1000) * (100 - i11)) / (i - 1)) / 1000;
                }
                int i12 = (i10 * i11) / 100;
                if (i12 >= 32767) {
                    bArr5[i8] = -1;
                    bArr5[i9] = Byte.MAX_VALUE;
                } else if (i12 <= -32768) {
                    bArr5[i8] = 0;
                    bArr5[i9] = Byte.MIN_VALUE;
                } else {
                    bArr5[i8] = (byte) (i12 & 255);
                    bArr5[i9] = (byte) (i12 >> 8);
                }
            }
        }
        PolarVoyageCameraPixelBlaze2629(i).put(bArr5, 0, i).flip();
    }

    public final int PolarVoyageDrawableDeltaHyperion5742(int i) {
        int length = ((((int) ((this.PolarVoyageCameraPixelBlaze2629 * this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185) / 1000000)) - this.PolarVoyageNavigationViewHyperHyperHyperion1793) * this.PolarVoyageDrawableDeltaHyperion5742) - (this.PolarVoyageAnimatorSetSparkUltraMax8233.length / 2);
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(length >= 0);
        int min = (int) Math.min((i * this.PolarVoyageStrictModeLegendEpic1532) + 0.5f, length);
        int i2 = this.PolarVoyageDrawableDeltaHyperion5742;
        return (min / i2) * i2;
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319, p000createpolar.PolarVoyageLiveDataQuantumSpeedNovaX2823
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return super.PolarVoyageMotionLayoutTransitionHeroVision4068() && this.PolarVoyageSnackbarGammaEclipse2140;
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final void PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        if (PolarVoyageMotionLayoutTransitionHeroVision4068()) {
            int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068 * 2;
            this.PolarVoyageDrawableDeltaHyperion5742 = i;
            int i2 = ((((int) ((this.PolarVoyageViewRogueMaster4778 * r0.PolarVoyageZipVortexCelestial6185) / 1000000)) / 2) / i) * i * 2;
            if (this.PolarVoyageAnimatorSetSparkUltraMax8233.length != i2) {
                this.PolarVoyageAnimatorSetSparkUltraMax8233 = new byte[i2];
                this.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = new byte[i2];
            }
        }
        this.PolarVoyageContentProviderHyperSpark3838 = 0;
        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = 0L;
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = 0;
        this.PolarVoyageBitmapMaxTitanTitan7960 = 0;
        this.PolarVoyageDisplayMetricsVortexDragon9516 = 0;
    }

    public final void PolarVoyageSnackbarGammaEclipse2140(boolean z) {
        int length;
        int PolarVoyageDrawableDeltaHyperion5742;
        int i = this.PolarVoyageDisplayMetricsVortexDragon9516;
        byte[] bArr = this.PolarVoyageAnimatorSetSparkUltraMax8233;
        if (i == bArr.length || z) {
            if (this.PolarVoyageNavigationViewHyperHyperHyperion1793 == 0) {
                if (z) {
                    PolarVoyageContentProviderHyperSpark3838(i, 3);
                    length = i;
                } else {
                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(i >= bArr.length / 2);
                    length = this.PolarVoyageAnimatorSetSparkUltraMax8233.length / 2;
                    PolarVoyageContentProviderHyperSpark3838(length, 0);
                }
                PolarVoyageDrawableDeltaHyperion5742 = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int PolarVoyageDrawableDeltaHyperion57422 = PolarVoyageDrawableDeltaHyperion5742(length2) + (this.PolarVoyageAnimatorSetSparkUltraMax8233.length / 2);
                PolarVoyageContentProviderHyperSpark3838(PolarVoyageDrawableDeltaHyperion57422, 2);
                PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDrawableDeltaHyperion57422;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDrawableDeltaHyperion5742(length);
                PolarVoyageContentProviderHyperSpark3838(PolarVoyageDrawableDeltaHyperion5742, 1);
            }
            if (!(length % this.PolarVoyageDrawableDeltaHyperion5742 == 0)) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629(PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageRotateAnimationCyberCelestialDelta4768("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
                return;
            }
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(i >= PolarVoyageDrawableDeltaHyperion5742);
            this.PolarVoyageDisplayMetricsVortexDragon9516 -= length;
            int i2 = this.PolarVoyageBitmapMaxTitanTitan7960 + length;
            this.PolarVoyageBitmapMaxTitanTitan7960 = i2;
            this.PolarVoyageBitmapMaxTitanTitan7960 = i2 % this.PolarVoyageAnimatorSetSparkUltraMax8233.length;
            this.PolarVoyageNavigationViewHyperHyperHyperion1793 = (PolarVoyageDrawableDeltaHyperion5742 / this.PolarVoyageDrawableDeltaHyperion5742) + this.PolarVoyageNavigationViewHyperHyperHyperion1793;
            this.PolarVoyageRemoteModelManagerOlympianCelestial9141 += (length - PolarVoyageDrawableDeltaHyperion5742) / r2;
        }
    }

    @Override // p000createpolar.PolarVoyageLiveDataQuantumSpeedNovaX2823
    public final void PolarVoyageTextInputEditTextNebulaHero6651(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.PolarVoyageTextInputEditTextNebulaHero6651.hasRemaining()) {
            int i = this.PolarVoyageContentProviderHyperSpark3838;
            short s = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (i == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.PolarVoyageAnimatorSetSparkUltraMax8233.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s) {
                        int i2 = this.PolarVoyageDrawableDeltaHyperion5742;
                        position = ((limit3 / i2) * i2) + i2;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.PolarVoyageContentProviderHyperSpark3838 = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    PolarVoyageCameraPixelBlaze2629(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i != 1) {
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
                    return;
                }
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(this.PolarVoyageBitmapMaxTitanTitan7960 < this.PolarVoyageAnimatorSetSparkUltraMax8233.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s) {
                        int i3 = this.PolarVoyageDrawableDeltaHyperion5742;
                        limit = (position2 / i3) * i3;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i4 = this.PolarVoyageBitmapMaxTitanTitan7960;
                int i5 = this.PolarVoyageDisplayMetricsVortexDragon9516;
                int i6 = i4 + i5;
                byte[] bArr = this.PolarVoyageAnimatorSetSparkUltraMax8233;
                if (i6 < bArr.length) {
                    i4 = bArr.length;
                } else {
                    i6 = i5 - (bArr.length - i4);
                }
                int i7 = i4 - i6;
                boolean z = limit < limit4;
                int min = Math.min(position3, i7);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.PolarVoyageAnimatorSetSparkUltraMax8233, i6, min);
                int i8 = this.PolarVoyageDisplayMetricsVortexDragon9516 + min;
                this.PolarVoyageDisplayMetricsVortexDragon9516 = i8;
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(i8 <= this.PolarVoyageAnimatorSetSparkUltraMax8233.length);
                boolean z2 = z && position3 < i7;
                PolarVoyageSnackbarGammaEclipse2140(z2);
                if (z2) {
                    this.PolarVoyageContentProviderHyperSpark3838 = 0;
                    this.PolarVoyageNavigationViewHyperHyperHyperion1793 = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final void PolarVoyageViewRogueMaster4778() {
        this.PolarVoyageSnackbarGammaEclipse2140 = false;
        byte[] bArr = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageAnimatorSetSparkUltraMax8233 = bArr;
        this.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = bArr;
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final PolarVoyageFocusMeteringActionCelestialStrikeMax1103 PolarVoyageZipVortexCelestial6185(PolarVoyageFocusMeteringActionCelestialStrikeMax1103 polarVoyageFocusMeteringActionCelestialStrikeMax1103) {
        if (polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageKotlinBetaPulseBeta3653 == 2) {
            return polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageZipVortexCelestial6185 == -1 ? PolarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageBitmapVisionAuroraPixel4705 : polarVoyageFocusMeteringActionCelestialStrikeMax1103;
        }
        throw new PolarVoyageOnAttachStateChangeListenerRoguePulse3137(polarVoyageFocusMeteringActionCelestialStrikeMax1103);
    }
}
