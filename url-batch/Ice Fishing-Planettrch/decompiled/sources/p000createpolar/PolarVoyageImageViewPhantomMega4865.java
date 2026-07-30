package p000createpolar;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageImageViewPhantomMega4865 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageBitmapVisionAuroraPixel4705 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageImageViewPhantomMega4865.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater PolarVoyageDiffUtilTurboStrike5735 = AtomicLongFieldUpdater.newUpdater(PolarVoyageImageViewPhantomMega4865.class, "_state$volatile");
    public static final PolarVoyageAssetManagerEclipseHyperInferno7091 PolarVoyageTextInputEditTextNebulaHero6651 = new PolarVoyageAssetManagerEclipseHyperInferno7091("REMOVE_FROZEN", 3);
    public final /* synthetic */ AtomicReferenceArray PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    public PolarVoyageImageViewPhantomMega4865(int i, boolean z) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = z;
        int i2 = i - 1;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i2;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Check failed.");
        throw null;
    }

    public final Object PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        PolarVoyageImageViewPhantomMega4865 polarVoyageImageViewPhantomMega4865 = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageDiffUtilTurboStrike5735;
            long j = atomicLongFieldUpdater.get(polarVoyageImageViewPhantomMega4865);
            if ((j & 1152921504606846976L) != 0) {
                return PolarVoyageTextInputEditTextNebulaHero6651;
            }
            int i = (int) (j & 1073741823);
            int i2 = polarVoyageImageViewPhantomMega4865.PolarVoyageKotlinBetaPulseBeta3653;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = polarVoyageImageViewPhantomMega4865.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = polarVoyageImageViewPhantomMega4865.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof PolarVoyageInterstitialAdShadowPrime6552) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (PolarVoyageDiffUtilTurboStrike5735.compareAndSet(polarVoyageImageViewPhantomMega4865, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                polarVoyageImageViewPhantomMega4865 = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(polarVoyageImageViewPhantomMega4865);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            polarVoyageImageViewPhantomMega4865 = polarVoyageImageViewPhantomMega4865.PolarVoyageKotlinBetaPulseBeta3653();
                        } else {
                            PolarVoyageImageViewPhantomMega4865 polarVoyageImageViewPhantomMega48652 = polarVoyageImageViewPhantomMega4865;
                            if (PolarVoyageDiffUtilTurboStrike5735.compareAndSet(polarVoyageImageViewPhantomMega48652, j3, (j3 & (-1073741824)) | j2)) {
                                polarVoyageImageViewPhantomMega48652.PolarVoyageBarcodeScannerInfernoSolarSpark7767.set(i4 & polarVoyageImageViewPhantomMega48652.PolarVoyageKotlinBetaPulseBeta3653, null);
                                polarVoyageImageViewPhantomMega4865 = null;
                            } else {
                                polarVoyageImageViewPhantomMega4865 = polarVoyageImageViewPhantomMega48652;
                            }
                        }
                        if (polarVoyageImageViewPhantomMega4865 == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final PolarVoyageImageViewPhantomMega4865 PolarVoyageKotlinBetaPulseBeta3653() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        PolarVoyageImageViewPhantomMega4865 polarVoyageImageViewPhantomMega4865;
        while (true) {
            atomicLongFieldUpdater = PolarVoyageDiffUtilTurboStrike5735;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                polarVoyageImageViewPhantomMega4865 = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            polarVoyageImageViewPhantomMega4865 = this;
            if (atomicLongFieldUpdater.compareAndSet(polarVoyageImageViewPhantomMega4865, j, j2)) {
                j = j2;
                break;
            }
            this = polarVoyageImageViewPhantomMega4865;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageBitmapVisionAuroraPixel4705;
            PolarVoyageImageViewPhantomMega4865 polarVoyageImageViewPhantomMega48652 = (PolarVoyageImageViewPhantomMega4865) atomicReferenceFieldUpdater.get(polarVoyageImageViewPhantomMega4865);
            if (polarVoyageImageViewPhantomMega48652 != null) {
                return polarVoyageImageViewPhantomMega48652;
            }
            PolarVoyageImageViewPhantomMega4865 polarVoyageImageViewPhantomMega48653 = new PolarVoyageImageViewPhantomMega4865(polarVoyageImageViewPhantomMega4865.PolarVoyageZipVortexCelestial6185 * 2, polarVoyageImageViewPhantomMega4865.PolarVoyageMotionLayoutTransitionHeroVision4068);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = polarVoyageImageViewPhantomMega4865.PolarVoyageKotlinBetaPulseBeta3653;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = polarVoyageImageViewPhantomMega4865.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get(i4);
                if (obj == null) {
                    obj = new PolarVoyageInterstitialAdShadowPrime6552(i);
                }
                polarVoyageImageViewPhantomMega48653.PolarVoyageBarcodeScannerInfernoSolarSpark7767.set(polarVoyageImageViewPhantomMega48653.PolarVoyageKotlinBetaPulseBeta3653 & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(polarVoyageImageViewPhantomMega48653, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(polarVoyageImageViewPhantomMega4865, null, polarVoyageImageViewPhantomMega48653) && atomicReferenceFieldUpdater.get(polarVoyageImageViewPhantomMega4865) == null) {
            }
        }
    }

    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageDiffUtilTurboStrike5735;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            PolarVoyageImageViewPhantomMega4865 polarVoyageImageViewPhantomMega4865 = this;
            if (atomicLongFieldUpdater.compareAndSet(polarVoyageImageViewPhantomMega4865, j, 2305843009213693952L | j)) {
                return true;
            }
            this = polarVoyageImageViewPhantomMega4865;
        }
    }

    public final int PolarVoyageZipVortexCelestial6185(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = PolarVoyageDiffUtilTurboStrike5735;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.PolarVoyageKotlinBetaPulseBeta3653;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            AtomicReferenceArray atomicReferenceArray = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                PolarVoyageImageViewPhantomMega4865 polarVoyageImageViewPhantomMega4865 = this;
                if (PolarVoyageDiffUtilTurboStrike5735.compareAndSet(polarVoyageImageViewPhantomMega4865, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    PolarVoyageImageViewPhantomMega4865 polarVoyageImageViewPhantomMega48652 = polarVoyageImageViewPhantomMega4865;
                    while ((atomicLongFieldUpdater.get(polarVoyageImageViewPhantomMega48652) & 1152921504606846976L) != 0) {
                        polarVoyageImageViewPhantomMega48652 = polarVoyageImageViewPhantomMega48652.PolarVoyageKotlinBetaPulseBeta3653();
                        AtomicReferenceArray atomicReferenceArray2 = polarVoyageImageViewPhantomMega48652.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        int i4 = polarVoyageImageViewPhantomMega48652.PolarVoyageKotlinBetaPulseBeta3653 & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof PolarVoyageInterstitialAdShadowPrime6552) && ((PolarVoyageInterstitialAdShadowPrime6552) obj2).PolarVoyageZipVortexCelestial6185 == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            polarVoyageImageViewPhantomMega48652 = null;
                        }
                        if (polarVoyageImageViewPhantomMega48652 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = polarVoyageImageViewPhantomMega4865;
            } else {
                int i5 = this.PolarVoyageZipVortexCelestial6185;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }
}
