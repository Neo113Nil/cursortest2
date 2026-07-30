package p000createpolar;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageImageViewNebulaMax3760 extends Handler {
    public final /* synthetic */ PolarVoyageIntentServiceSpeedVortexThunder4775 PolarVoyageZipVortexCelestial6185;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolarVoyageImageViewNebulaMax3760(PolarVoyageIntentServiceSpeedVortexThunder4775 polarVoyageIntentServiceSpeedVortexThunder4775, Looper looper) {
        super(looper);
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageIntentServiceSpeedVortexThunder4775;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PolarVoyageIntentServiceSpeedVortexThunder4775 polarVoyageIntentServiceSpeedVortexThunder4775 = this.PolarVoyageZipVortexCelestial6185;
        int i = message.what;
        PolarVoyageTextRecognitionVortexGamma7297 polarVoyageTextRecognitionVortexGamma7297 = null;
        if (i == 1) {
            PolarVoyageTextRecognitionVortexGamma7297 polarVoyageTextRecognitionVortexGamma72972 = (PolarVoyageTextRecognitionVortexGamma7297) message.obj;
            try {
                polarVoyageIntentServiceSpeedVortexThunder4775.PolarVoyageItemDecorationUltraDeltaEpic7485.queueInputBuffer(polarVoyageTextRecognitionVortexGamma72972.PolarVoyageZipVortexCelestial6185, 0, polarVoyageTextRecognitionVortexGamma72972.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageTextRecognitionVortexGamma72972.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageTextRecognitionVortexGamma72972.PolarVoyageBitmapVisionAuroraPixel4705);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = polarVoyageIntentServiceSpeedVortexThunder4775.PolarVoyageBottomSheetOmegaNeo1907;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            polarVoyageTextRecognitionVortexGamma7297 = polarVoyageTextRecognitionVortexGamma72972;
        } else if (i == 2) {
            PolarVoyageTextRecognitionVortexGamma7297 polarVoyageTextRecognitionVortexGamma72973 = (PolarVoyageTextRecognitionVortexGamma7297) message.obj;
            int i2 = polarVoyageTextRecognitionVortexGamma72973.PolarVoyageZipVortexCelestial6185;
            MediaCodec.CryptoInfo cryptoInfo = polarVoyageTextRecognitionVortexGamma72973.PolarVoyageKotlinBetaPulseBeta3653;
            long j = polarVoyageTextRecognitionVortexGamma72973.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            int i3 = polarVoyageTextRecognitionVortexGamma72973.PolarVoyageBitmapVisionAuroraPixel4705;
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    polarVoyageIntentServiceSpeedVortexThunder4775.PolarVoyageItemDecorationUltraDeltaEpic7485.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                } else {
                    synchronized (PolarVoyageIntentServiceSpeedVortexThunder4775.PolarVoyageSnackbarGammaEclipse2140) {
                        polarVoyageIntentServiceSpeedVortexThunder4775.PolarVoyageItemDecorationUltraDeltaEpic7485.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    }
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = polarVoyageIntentServiceSpeedVortexThunder4775.PolarVoyageBottomSheetOmegaNeo1907;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            polarVoyageTextRecognitionVortexGamma7297 = polarVoyageTextRecognitionVortexGamma72973;
        } else if (i == 3) {
            polarVoyageIntentServiceSpeedVortexThunder4775.PolarVoyageViewRogueMaster4778.PolarVoyageKotlinBetaPulseBeta3653();
        } else if (i != 4) {
            AtomicReference atomicReference3 = polarVoyageIntentServiceSpeedVortexThunder4775.PolarVoyageBottomSheetOmegaNeo1907;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                polarVoyageIntentServiceSpeedVortexThunder4775.PolarVoyageItemDecorationUltraDeltaEpic7485.setParameters((Bundle) message.obj);
            } catch (RuntimeException e3) {
                AtomicReference atomicReference4 = polarVoyageIntentServiceSpeedVortexThunder4775.PolarVoyageBottomSheetOmegaNeo1907;
                while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                }
            }
        }
        if (polarVoyageTextRecognitionVortexGamma7297 != null) {
            ArrayDeque arrayDeque = PolarVoyageIntentServiceSpeedVortexThunder4775.PolarVoyageDrawableDeltaHyperion5742;
            synchronized (arrayDeque) {
                arrayDeque.add(polarVoyageTextRecognitionVortexGamma7297);
            }
        }
    }
}
