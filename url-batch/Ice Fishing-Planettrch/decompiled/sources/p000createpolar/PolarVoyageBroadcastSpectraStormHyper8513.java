package p000createpolar;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBroadcastSpectraStormHyper8513 implements PolarVoyageMotionEventDeltaNovaXShadow3329 {
    public long PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageCameraPixelBlaze2629;
    public int PolarVoyageDrawableDeltaHyperion5742;
    public final long PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageTracePixelSparkNova2688 PolarVoyageStrictModeLegendEpic1532;
    public byte[] PolarVoyageViewRogueMaster4778 = new byte[65536];
    public final byte[] PolarVoyageItemDecorationUltraDeltaEpic7485 = new byte[4096];

    static {
        PolarVoyagePlaceholderOlympianVision8131.PolarVoyageZipVortexCelestial6185("media3.extractor");
    }

    public PolarVoyageBroadcastSpectraStormHyper8513(PolarVoyageTracePixelSparkNova2688 polarVoyageTracePixelSparkNova2688, long j, long j2) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageTracePixelSparkNova2688;
        this.PolarVoyageBottomSheetOmegaNeo1907 = j;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = j2;
    }

    public final void PolarVoyageAnimatorSetSparkUltraMax8233(int i) {
        int i2 = this.PolarVoyageDrawableDeltaHyperion5742 - i;
        this.PolarVoyageDrawableDeltaHyperion5742 = i2;
        this.PolarVoyageCameraPixelBlaze2629 = 0;
        byte[] bArr = this.PolarVoyageViewRogueMaster4778;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.PolarVoyageViewRogueMaster4778 = bArr2;
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final long PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final int PolarVoyageBitmapVisionAuroraPixel4705(byte[] bArr, int i, int i2) {
        PolarVoyageBroadcastSpectraStormHyper8513 polarVoyageBroadcastSpectraStormHyper8513;
        int min;
        PolarVoyageStrictModeLegendEpic1532(i2);
        int i3 = this.PolarVoyageDrawableDeltaHyperion5742;
        int i4 = this.PolarVoyageCameraPixelBlaze2629;
        int i5 = i3 - i4;
        if (i5 == 0) {
            polarVoyageBroadcastSpectraStormHyper8513 = this;
            min = polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageSnackbarGammaEclipse2140(this.PolarVoyageViewRogueMaster4778, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageDrawableDeltaHyperion5742 += min;
        } else {
            polarVoyageBroadcastSpectraStormHyper8513 = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageViewRogueMaster4778, polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageCameraPixelBlaze2629, bArr, i, min);
        polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageCameraPixelBlaze2629 += min;
        return min;
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final long PolarVoyageCameraPixelBlaze2629() {
        return this.PolarVoyageBottomSheetOmegaNeo1907 + this.PolarVoyageCameraPixelBlaze2629;
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        PolarVoyageRotateAnimationCyberCelestialDelta4768(i, false);
    }

    public final boolean PolarVoyageKotlinBetaPulseBeta3653(int i, boolean z) {
        PolarVoyageStrictModeLegendEpic1532(i);
        int i2 = this.PolarVoyageDrawableDeltaHyperion5742 - this.PolarVoyageCameraPixelBlaze2629;
        while (i2 < i) {
            PolarVoyageBroadcastSpectraStormHyper8513 polarVoyageBroadcastSpectraStormHyper8513 = this;
            int i3 = i;
            boolean z2 = z;
            i2 = polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageSnackbarGammaEclipse2140(this.PolarVoyageViewRogueMaster4778, this.PolarVoyageCameraPixelBlaze2629, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageCameraPixelBlaze2629 + i2;
            this = polarVoyageBroadcastSpectraStormHyper8513;
            i = i3;
            z = z2;
        }
        this.PolarVoyageCameraPixelBlaze2629 += i;
        return true;
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.PolarVoyageDrawableDeltaHyperion5742;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.PolarVoyageViewRogueMaster4778, 0, bArr, i, min);
            PolarVoyageAnimatorSetSparkUltraMax8233(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = PolarVoyageSnackbarGammaEclipse2140(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.PolarVoyageBottomSheetOmegaNeo1907 += i4;
        }
        return i4 != -1;
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final void PolarVoyageNavigationViewHyperHyperHyperion1793(int i) {
        PolarVoyageKotlinBetaPulseBeta3653(i, false);
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final void PolarVoyageRemoteModelManagerOlympianCelestial9141(byte[] bArr, int i, int i2) {
        PolarVoyageViewRogueMaster4778(bArr, i, i2, false);
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768(int i, boolean z) {
        int min = Math.min(this.PolarVoyageDrawableDeltaHyperion5742, i);
        PolarVoyageAnimatorSetSparkUltraMax8233(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            i2 = PolarVoyageSnackbarGammaEclipse2140(bArr, -i2, Math.min(i, bArr.length + i2), i2, z);
        }
        if (i2 != -1) {
            this.PolarVoyageBottomSheetOmegaNeo1907 += i2;
        }
        return i2 != -1;
    }

    public final int PolarVoyageSnackbarGammaEclipse2140(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.PolarVoyageStrictModeLegendEpic1532.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void PolarVoyageStrictModeLegendEpic1532(int i) {
        int i2 = this.PolarVoyageCameraPixelBlaze2629 + i;
        byte[] bArr = this.PolarVoyageViewRogueMaster4778;
        if (i2 > bArr.length) {
            this.PolarVoyageViewRogueMaster4778 = Arrays.copyOf(this.PolarVoyageViewRogueMaster4778, PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageTextInputEditTextNebulaHero6651(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final void PolarVoyageTextInputEditTextNebulaHero6651() {
        this.PolarVoyageCameraPixelBlaze2629 = 0;
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final boolean PolarVoyageViewRogueMaster4778(byte[] bArr, int i, int i2, boolean z) {
        if (!PolarVoyageKotlinBetaPulseBeta3653(i2, z)) {
            return false;
        }
        System.arraycopy(this.PolarVoyageViewRogueMaster4778, this.PolarVoyageCameraPixelBlaze2629 - i2, bArr, i, i2);
        return true;
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final int PolarVoyageZipVortexCelestial6185(int i) {
        PolarVoyageBroadcastSpectraStormHyper8513 polarVoyageBroadcastSpectraStormHyper8513;
        int min = Math.min(this.PolarVoyageDrawableDeltaHyperion5742, i);
        PolarVoyageAnimatorSetSparkUltraMax8233(min);
        if (min == 0) {
            byte[] bArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageBroadcastSpectraStormHyper8513 = this;
            min = polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageSnackbarGammaEclipse2140(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            polarVoyageBroadcastSpectraStormHyper8513 = this;
        }
        if (min != -1) {
            polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageBottomSheetOmegaNeo1907 += min;
        }
        return min;
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final long getPosition() {
        return this.PolarVoyageBottomSheetOmegaNeo1907;
    }

    @Override // p000createpolar.PolarVoyageTracePixelSparkNova2688
    public final int read(byte[] bArr, int i, int i2) {
        PolarVoyageBroadcastSpectraStormHyper8513 polarVoyageBroadcastSpectraStormHyper8513;
        int i3 = this.PolarVoyageDrawableDeltaHyperion5742;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.PolarVoyageViewRogueMaster4778, 0, bArr, i, min);
            PolarVoyageAnimatorSetSparkUltraMax8233(min);
            i4 = min;
        }
        if (i4 == 0) {
            polarVoyageBroadcastSpectraStormHyper8513 = this;
            i4 = polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageSnackbarGammaEclipse2140(bArr, i, i2, 0, true);
        } else {
            polarVoyageBroadcastSpectraStormHyper8513 = this;
        }
        if (i4 != -1) {
            polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageBottomSheetOmegaNeo1907 += i4;
        }
        return i4;
    }

    @Override // p000createpolar.PolarVoyageMotionEventDeltaNovaXShadow3329
    public final void readFully(byte[] bArr, int i, int i2) {
        PolarVoyageMotionLayoutTransitionHeroVision4068(bArr, i, i2, false);
    }
}
