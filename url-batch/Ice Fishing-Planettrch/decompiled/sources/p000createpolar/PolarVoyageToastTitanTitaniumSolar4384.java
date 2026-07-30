package p000createpolar;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageToastTitanTitaniumSolar4384 implements PolarVoyageRoomDaoRogueGamma6879 {
    public final InputStream PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageColorDrawableThunderSolar1716 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageToastTitanTitaniumSolar4384(PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAnimatorCelestialDeltaMaster5821;
        Socket socket = (Socket) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = socket.getInputStream();
        this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageColorDrawableThunderSolar1716(socket);
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final long PolarVoyageLayerDrawableShadowTitaniumOmega1942(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        polarVoyageSnackbarSpectraMasterMaster4120.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("byteCount < 0: ", j));
            return 0L;
        }
        PolarVoyageColorDrawableThunderSolar1716 polarVoyageColorDrawableThunderSolar1716 = this.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageColorDrawableThunderSolar1716.PolarVoyageDiffUtilTurboStrike5735();
        PolarVoyageSupervisorJobPixelEliteMega2147 PolarVoyageFCMCelestialCosmosPixel3711 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFCMCelestialCosmosPixel3711(1);
        int min = (int) Math.min(j, 8192 - PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653);
        try {
            polarVoyageColorDrawableThunderSolar1716.PolarVoyageStrictModeLegendEpic1532();
            try {
                int read = this.PolarVoyageItemDecorationUltraDeltaEpic7485.read(PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageZipVortexCelestial6185, PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653, min);
                if (polarVoyageColorDrawableThunderSolar1716.PolarVoyageRotateAnimationCyberCelestialDelta4768()) {
                    throw polarVoyageColorDrawableThunderSolar1716.PolarVoyageBottomSheetOmegaNeo1907(null);
                }
                if (read != -1) {
                    PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653 += read;
                    long j2 = read;
                    polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 += j2;
                    return j2;
                }
                if (PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageMotionLayoutTransitionHeroVision4068 != PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653) {
                    return -1L;
                }
                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageZipVortexCelestial6185();
                PolarVoyagePaintFlagsDrawFilterBlazeQuantumNovaX4853.PolarVoyageZipVortexCelestial6185(PolarVoyageFCMCelestialCosmosPixel3711);
                return -1L;
            } catch (IOException e) {
                if (polarVoyageColorDrawableThunderSolar1716.PolarVoyageRotateAnimationCyberCelestialDelta4768()) {
                    throw polarVoyageColorDrawableThunderSolar1716.PolarVoyageBottomSheetOmegaNeo1907(e);
                }
                throw e;
            } finally {
                polarVoyageColorDrawableThunderSolar1716.PolarVoyageRotateAnimationCyberCelestialDelta4768();
            }
        } catch (AssertionError e2) {
            if (PolarVoyageTextViewLegendCosmos5811.PolarVoyageZipVortexCelestial6185(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageColorDrawableThunderSolar1716 polarVoyageColorDrawableThunderSolar1716 = this.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageColorDrawableThunderSolar1716.PolarVoyageStrictModeLegendEpic1532();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            Socket socket = (Socket) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageStrictModeLegendEpic1532;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.PolarVoyageItemDecorationUltraDeltaEpic7485.close();
                    }
                }
                if (polarVoyageColorDrawableThunderSolar1716.PolarVoyageRotateAnimationCyberCelestialDelta4768()) {
                    throw polarVoyageColorDrawableThunderSolar1716.PolarVoyageBottomSheetOmegaNeo1907(null);
                }
            }
        } catch (IOException e) {
            if (!polarVoyageColorDrawableThunderSolar1716.PolarVoyageRotateAnimationCyberCelestialDelta4768()) {
                throw e;
            }
            throw polarVoyageColorDrawableThunderSolar1716.PolarVoyageBottomSheetOmegaNeo1907(e);
        } finally {
            polarVoyageColorDrawableThunderSolar1716.PolarVoyageRotateAnimationCyberCelestialDelta4768();
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageStrictModeLegendEpic1532) + ')';
    }
}
