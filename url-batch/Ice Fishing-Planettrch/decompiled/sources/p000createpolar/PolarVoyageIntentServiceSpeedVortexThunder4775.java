package p000createpolar;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageIntentServiceSpeedVortexThunder4775 implements PolarVoyageContentObserverDragonTitaniumNebula2107 {
    public static final ArrayDeque PolarVoyageDrawableDeltaHyperion5742 = new ArrayDeque();
    public static final Object PolarVoyageSnackbarGammaEclipse2140 = new Object();
    public final AtomicReference PolarVoyageBottomSheetOmegaNeo1907;
    public boolean PolarVoyageCameraPixelBlaze2629;
    public final MediaCodec PolarVoyageItemDecorationUltraDeltaEpic7485;
    public PolarVoyageImageViewNebulaMax3760 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final HandlerThread PolarVoyageStrictModeLegendEpic1532;
    public final PolarVoyageBindingAdapterStrikeCosmos6770 PolarVoyageViewRogueMaster4778;

    public PolarVoyageIntentServiceSpeedVortexThunder4775(MediaCodec mediaCodec, HandlerThread handlerThread) {
        PolarVoyageBindingAdapterStrikeCosmos6770 polarVoyageBindingAdapterStrikeCosmos6770 = new PolarVoyageBindingAdapterStrikeCosmos6770();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = mediaCodec;
        this.PolarVoyageStrictModeLegendEpic1532 = handlerThread;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageBindingAdapterStrikeCosmos6770;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new AtomicReference();
    }

    public static PolarVoyageTextRecognitionVortexGamma7297 PolarVoyageZipVortexCelestial6185() {
        ArrayDeque arrayDeque = PolarVoyageDrawableDeltaHyperion5742;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new PolarVoyageTextRecognitionVortexGamma7297();
                }
                return (PolarVoyageTextRecognitionVortexGamma7297) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000createpolar.PolarVoyageContentObserverDragonTitaniumNebula2107
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, PolarVoyageToastStormTitaniumUltra7487 polarVoyageToastStormTitaniumUltra7487, long j, int i2) {
        PolarVoyageItemDecorationUltraDeltaEpic7485();
        PolarVoyageTextRecognitionVortexGamma7297 PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185();
        PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185 = i;
        PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068 = 0;
        PolarVoyageZipVortexCelestial6185.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j;
        PolarVoyageZipVortexCelestial6185.PolarVoyageBitmapVisionAuroraPixel4705 = i2;
        MediaCodec.CryptoInfo cryptoInfo = PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653;
        cryptoInfo.numSubSamples = polarVoyageToastStormTitaniumUltra7487.PolarVoyageDiffUtilTurboStrike5735;
        int[] iArr = polarVoyageToastStormTitaniumUltra7487.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = polarVoyageToastStormTitaniumUltra7487.PolarVoyageBitmapVisionAuroraPixel4705;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = polarVoyageToastStormTitaniumUltra7487.PolarVoyageMotionLayoutTransitionHeroVision4068;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = polarVoyageToastStormTitaniumUltra7487.PolarVoyageZipVortexCelestial6185;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = polarVoyageToastStormTitaniumUltra7487.PolarVoyageKotlinBetaPulseBeta3653;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(polarVoyageToastStormTitaniumUltra7487.PolarVoyageTextInputEditTextNebulaHero6651, polarVoyageToastStormTitaniumUltra7487.PolarVoyageItemDecorationUltraDeltaEpic7485));
        PolarVoyageImageViewNebulaMax3760 polarVoyageImageViewNebulaMax3760 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        polarVoyageImageViewNebulaMax3760.obtainMessage(2, PolarVoyageZipVortexCelestial6185).sendToTarget();
    }

    @Override // p000createpolar.PolarVoyageContentObserverDragonTitaniumNebula2107
    public final void PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2, long j, int i3) {
        PolarVoyageItemDecorationUltraDeltaEpic7485();
        PolarVoyageTextRecognitionVortexGamma7297 PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185();
        PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185 = i;
        PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        PolarVoyageZipVortexCelestial6185.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j;
        PolarVoyageZipVortexCelestial6185.PolarVoyageBitmapVisionAuroraPixel4705 = i3;
        PolarVoyageImageViewNebulaMax3760 polarVoyageImageViewNebulaMax3760 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        polarVoyageImageViewNebulaMax3760.obtainMessage(1, PolarVoyageZipVortexCelestial6185).sendToTarget();
    }

    @Override // p000createpolar.PolarVoyageContentObserverDragonTitaniumNebula2107
    public final void PolarVoyageItemDecorationUltraDeltaEpic7485() {
        RuntimeException runtimeException = (RuntimeException) this.PolarVoyageBottomSheetOmegaNeo1907.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // p000createpolar.PolarVoyageContentObserverDragonTitaniumNebula2107
    public final void PolarVoyageKotlinBetaPulseBeta3653(Bundle bundle) {
        PolarVoyageItemDecorationUltraDeltaEpic7485();
        PolarVoyageImageViewNebulaMax3760 polarVoyageImageViewNebulaMax3760 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        polarVoyageImageViewNebulaMax3760.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p000createpolar.PolarVoyageContentObserverDragonTitaniumNebula2107
    public final void flush() {
        if (this.PolarVoyageCameraPixelBlaze2629) {
            try {
                PolarVoyageImageViewNebulaMax3760 polarVoyageImageViewNebulaMax3760 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                polarVoyageImageViewNebulaMax3760.getClass();
                polarVoyageImageViewNebulaMax3760.removeCallbacksAndMessages(null);
                PolarVoyageBindingAdapterStrikeCosmos6770 polarVoyageBindingAdapterStrikeCosmos6770 = this.PolarVoyageViewRogueMaster4778;
                synchronized (polarVoyageBindingAdapterStrikeCosmos6770) {
                    polarVoyageBindingAdapterStrikeCosmos6770.PolarVoyageMotionLayoutTransitionHeroVision4068 = false;
                }
                PolarVoyageImageViewNebulaMax3760 polarVoyageImageViewNebulaMax37602 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                polarVoyageImageViewNebulaMax37602.getClass();
                polarVoyageImageViewNebulaMax37602.obtainMessage(3).sendToTarget();
                synchronized (polarVoyageBindingAdapterStrikeCosmos6770) {
                    while (!polarVoyageBindingAdapterStrikeCosmos6770.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                        polarVoyageBindingAdapterStrikeCosmos6770.PolarVoyageZipVortexCelestial6185.getClass();
                        polarVoyageBindingAdapterStrikeCosmos6770.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // p000createpolar.PolarVoyageContentObserverDragonTitaniumNebula2107
    public final void shutdown() {
        if (this.PolarVoyageCameraPixelBlaze2629) {
            flush();
            this.PolarVoyageStrictModeLegendEpic1532.quit();
        }
        this.PolarVoyageCameraPixelBlaze2629 = false;
    }

    @Override // p000createpolar.PolarVoyageContentObserverDragonTitaniumNebula2107
    public final void start() {
        if (this.PolarVoyageCameraPixelBlaze2629) {
            return;
        }
        HandlerThread handlerThread = this.PolarVoyageStrictModeLegendEpic1532;
        handlerThread.start();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageImageViewNebulaMax3760(this, handlerThread.getLooper());
        this.PolarVoyageCameraPixelBlaze2629 = true;
    }
}
