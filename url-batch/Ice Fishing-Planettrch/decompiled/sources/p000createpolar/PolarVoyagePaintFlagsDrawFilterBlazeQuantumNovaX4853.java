package p000createpolar;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyagePaintFlagsDrawFilterBlazeQuantumNovaX4853 {
    public static final AtomicReference[] PolarVoyageKotlinBetaPulseBeta3653;
    public static final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final PolarVoyageSupervisorJobPixelEliteMega2147 PolarVoyageZipVortexCelestial6185 = new PolarVoyageSupervisorJobPixelEliteMega2147(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        PolarVoyageMotionLayoutTransitionHeroVision4068 = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        PolarVoyageKotlinBetaPulseBeta3653 = atomicReferenceArr;
    }

    public static final PolarVoyageSupervisorJobPixelEliteMega2147 PolarVoyageMotionLayoutTransitionHeroVision4068() {
        AtomicReference atomicReference = PolarVoyageKotlinBetaPulseBeta3653[(int) (Thread.currentThread().getId() & (PolarVoyageMotionLayoutTransitionHeroVision4068 - 1))];
        PolarVoyageSupervisorJobPixelEliteMega2147 polarVoyageSupervisorJobPixelEliteMega2147 = PolarVoyageZipVortexCelestial6185;
        PolarVoyageSupervisorJobPixelEliteMega2147 polarVoyageSupervisorJobPixelEliteMega21472 = (PolarVoyageSupervisorJobPixelEliteMega2147) atomicReference.getAndSet(polarVoyageSupervisorJobPixelEliteMega2147);
        if (polarVoyageSupervisorJobPixelEliteMega21472 == polarVoyageSupervisorJobPixelEliteMega2147) {
            return new PolarVoyageSupervisorJobPixelEliteMega2147();
        }
        if (polarVoyageSupervisorJobPixelEliteMega21472 == null) {
            atomicReference.set(null);
            return new PolarVoyageSupervisorJobPixelEliteMega2147();
        }
        atomicReference.set(polarVoyageSupervisorJobPixelEliteMega21472.PolarVoyageDiffUtilTurboStrike5735);
        polarVoyageSupervisorJobPixelEliteMega21472.PolarVoyageDiffUtilTurboStrike5735 = null;
        polarVoyageSupervisorJobPixelEliteMega21472.PolarVoyageKotlinBetaPulseBeta3653 = 0;
        return polarVoyageSupervisorJobPixelEliteMega21472;
    }

    public static final void PolarVoyageZipVortexCelestial6185(PolarVoyageSupervisorJobPixelEliteMega2147 polarVoyageSupervisorJobPixelEliteMega2147) {
        polarVoyageSupervisorJobPixelEliteMega2147.getClass();
        if (polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageDiffUtilTurboStrike5735 != null || polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageTextInputEditTextNebulaHero6651 != null) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Failed requirement.");
            return;
        }
        if (polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            return;
        }
        AtomicReference atomicReference = PolarVoyageKotlinBetaPulseBeta3653[(int) (Thread.currentThread().getId() & (PolarVoyageMotionLayoutTransitionHeroVision4068 - 1))];
        PolarVoyageSupervisorJobPixelEliteMega2147 polarVoyageSupervisorJobPixelEliteMega21472 = PolarVoyageZipVortexCelestial6185;
        PolarVoyageSupervisorJobPixelEliteMega2147 polarVoyageSupervisorJobPixelEliteMega21473 = (PolarVoyageSupervisorJobPixelEliteMega2147) atomicReference.getAndSet(polarVoyageSupervisorJobPixelEliteMega21472);
        if (polarVoyageSupervisorJobPixelEliteMega21473 == polarVoyageSupervisorJobPixelEliteMega21472) {
            return;
        }
        int i = polarVoyageSupervisorJobPixelEliteMega21473 != null ? polarVoyageSupervisorJobPixelEliteMega21473.PolarVoyageKotlinBetaPulseBeta3653 : 0;
        if (i >= 65536) {
            atomicReference.set(polarVoyageSupervisorJobPixelEliteMega21473);
            return;
        }
        polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageDiffUtilTurboStrike5735 = polarVoyageSupervisorJobPixelEliteMega21473;
        polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068 = 0;
        polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageKotlinBetaPulseBeta3653 = i + 8192;
        atomicReference.set(polarVoyageSupervisorJobPixelEliteMega2147);
    }
}
