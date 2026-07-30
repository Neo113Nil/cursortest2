package p000createpolar;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewPagerBetaOlympianUltra9813 implements PolarVoyageViewEliteBeta6786 {
    public final OutputStream PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageColorDrawableThunderSolar1716 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageViewPagerBetaOlympianUltra9813(PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAnimatorCelestialDeltaMaster5821;
        Socket socket = (Socket) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = socket.getOutputStream();
        this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageColorDrawableThunderSolar1716(socket);
    }

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786
    public final void PolarVoyageViewRogueMaster4778(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageNavigationViewHyperHyperHyperion1793(polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532, 0L, j);
        while (j > 0) {
            PolarVoyageColorDrawableThunderSolar1716 polarVoyageColorDrawableThunderSolar1716 = this.PolarVoyageStrictModeLegendEpic1532;
            polarVoyageColorDrawableThunderSolar1716.PolarVoyageDiffUtilTurboStrike5735();
            PolarVoyageSupervisorJobPixelEliteMega2147 polarVoyageSupervisorJobPixelEliteMega2147 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageSupervisorJobPixelEliteMega2147.getClass();
            int min = (int) Math.min(j, polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageKotlinBetaPulseBeta3653 - polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068);
            polarVoyageColorDrawableThunderSolar1716.PolarVoyageStrictModeLegendEpic1532();
            try {
                try {
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485.write(polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageZipVortexCelestial6185, polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068, min);
                    if (polarVoyageColorDrawableThunderSolar1716.PolarVoyageRotateAnimationCyberCelestialDelta4768()) {
                        throw polarVoyageColorDrawableThunderSolar1716.PolarVoyageBottomSheetOmegaNeo1907(null);
                    }
                    int i = polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068 + min;
                    polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
                    long j2 = min;
                    j -= j2;
                    polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 -= j2;
                    if (i == polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageKotlinBetaPulseBeta3653) {
                        polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageZipVortexCelestial6185();
                        PolarVoyagePaintFlagsDrawFilterBlazeQuantumNovaX4853.PolarVoyageZipVortexCelestial6185(polarVoyageSupervisorJobPixelEliteMega2147);
                    }
                } catch (IOException e) {
                    if (!polarVoyageColorDrawableThunderSolar1716.PolarVoyageRotateAnimationCyberCelestialDelta4768()) {
                        throw e;
                    }
                    throw polarVoyageColorDrawableThunderSolar1716.PolarVoyageBottomSheetOmegaNeo1907(e);
                }
            } catch (Throwable th) {
                polarVoyageColorDrawableThunderSolar1716.PolarVoyageRotateAnimationCyberCelestialDelta4768();
                throw th;
            }
        }
    }

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageColorDrawableThunderSolar1716 polarVoyageColorDrawableThunderSolar1716 = this.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageColorDrawableThunderSolar1716.PolarVoyageStrictModeLegendEpic1532();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            Socket socket = (Socket) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageStrictModeLegendEpic1532;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
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

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786, java.io.Flushable
    public final void flush() {
        PolarVoyageColorDrawableThunderSolar1716 polarVoyageColorDrawableThunderSolar1716 = this.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageColorDrawableThunderSolar1716.PolarVoyageStrictModeLegendEpic1532();
        try {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.flush();
            if (polarVoyageColorDrawableThunderSolar1716.PolarVoyageRotateAnimationCyberCelestialDelta4768()) {
                throw polarVoyageColorDrawableThunderSolar1716.PolarVoyageBottomSheetOmegaNeo1907(null);
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
        return "sink(" + ((Socket) this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageStrictModeLegendEpic1532) + ')';
    }
}
