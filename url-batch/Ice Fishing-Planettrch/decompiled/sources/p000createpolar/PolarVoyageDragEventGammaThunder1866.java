package p000createpolar;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageDragEventGammaThunder1866 implements Future {
    public static final PolarVoyageDrawableCompatNebulaTitanNeo6818 PolarVoyageCameraPixelBlaze2629;
    public static final Object PolarVoyageDrawableDeltaHyperion5742;
    public volatile Object PolarVoyageItemDecorationUltraDeltaEpic7485;
    public volatile PolarVoyageInsetDrawableNebulaMaster1564 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public volatile PolarVoyageMenuOlympianGammaAlpha8153 PolarVoyageStrictModeLegendEpic1532;
    public static final boolean PolarVoyageBottomSheetOmegaNeo1907 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger PolarVoyageViewRogueMaster4778 = Logger.getLogger(PolarVoyageDragEventGammaThunder1866.class.getName());

    static {
        PolarVoyageDrawableCompatNebulaTitanNeo6818 polarVoyageColorStateListTitaniumRogue2523;
        try {
            polarVoyageColorStateListTitaniumRogue2523 = new PolarVoyageHandlerQuantumSpeed6604(AtomicReferenceFieldUpdater.newUpdater(PolarVoyageInsetDrawableNebulaMaster1564.class, Thread.class, "PolarVoyageZipVortexCelestial6185"), AtomicReferenceFieldUpdater.newUpdater(PolarVoyageInsetDrawableNebulaMaster1564.class, PolarVoyageInsetDrawableNebulaMaster1564.class, "PolarVoyageMotionLayoutTransitionHeroVision4068"), AtomicReferenceFieldUpdater.newUpdater(PolarVoyageDragEventGammaThunder1866.class, PolarVoyageInsetDrawableNebulaMaster1564.class, "PolarVoyageRotateAnimationCyberCelestialDelta4768"), AtomicReferenceFieldUpdater.newUpdater(PolarVoyageDragEventGammaThunder1866.class, PolarVoyageMenuOlympianGammaAlpha8153.class, "PolarVoyageStrictModeLegendEpic1532"), AtomicReferenceFieldUpdater.newUpdater(PolarVoyageDragEventGammaThunder1866.class, Object.class, "PolarVoyageItemDecorationUltraDeltaEpic7485"));
            th = null;
        } catch (Throwable th) {
            th = th;
            polarVoyageColorStateListTitaniumRogue2523 = new PolarVoyageColorStateListTitaniumRogue2523();
        }
        PolarVoyageCameraPixelBlaze2629 = polarVoyageColorStateListTitaniumRogue2523;
        if (th != null) {
            PolarVoyageViewRogueMaster4778.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        PolarVoyageDrawableDeltaHyperion5742 = new Object();
    }

    public static Object PolarVoyageBarcodeScannerInfernoSolarSpark7767(Object obj) {
        if (obj instanceof PolarVoyageValueAnimatorForceMaster1989) {
            Throwable th = ((PolarVoyageValueAnimatorForceMaster1989) obj).PolarVoyageMotionLayoutTransitionHeroVision4068;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof PolarVoyageLocationManagerPrimeHyperUltra5411) {
            throw new ExecutionException(((PolarVoyageLocationManagerPrimeHyperUltra5411) obj).PolarVoyageZipVortexCelestial6185);
        }
        if (obj == PolarVoyageDrawableDeltaHyperion5742) {
            return null;
        }
        return obj;
    }

    public static Object PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageDragEventGammaThunder1866 polarVoyageDragEventGammaThunder1866) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = polarVoyageDragEventGammaThunder1866.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageDragEventGammaThunder1866 polarVoyageDragEventGammaThunder1866) {
        PolarVoyageInsetDrawableNebulaMaster1564 polarVoyageInsetDrawableNebulaMaster1564;
        PolarVoyageMenuOlympianGammaAlpha8153 polarVoyageMenuOlympianGammaAlpha8153;
        do {
            polarVoyageInsetDrawableNebulaMaster1564 = polarVoyageDragEventGammaThunder1866.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        } while (!PolarVoyageCameraPixelBlaze2629.PolarVoyageContentProviderHyperSpark3838(polarVoyageDragEventGammaThunder1866, polarVoyageInsetDrawableNebulaMaster1564, PolarVoyageInsetDrawableNebulaMaster1564.PolarVoyageKotlinBetaPulseBeta3653));
        while (polarVoyageInsetDrawableNebulaMaster1564 != null) {
            Thread thread = polarVoyageInsetDrawableNebulaMaster1564.PolarVoyageZipVortexCelestial6185;
            if (thread != null) {
                polarVoyageInsetDrawableNebulaMaster1564.PolarVoyageZipVortexCelestial6185 = null;
                LockSupport.unpark(thread);
            }
            polarVoyageInsetDrawableNebulaMaster1564 = polarVoyageInsetDrawableNebulaMaster1564.PolarVoyageMotionLayoutTransitionHeroVision4068;
        }
        polarVoyageDragEventGammaThunder1866.PolarVoyageMotionLayoutTransitionHeroVision4068();
        do {
            polarVoyageMenuOlympianGammaAlpha8153 = polarVoyageDragEventGammaThunder1866.PolarVoyageStrictModeLegendEpic1532;
        } while (!PolarVoyageCameraPixelBlaze2629.PolarVoyageDrawableDeltaHyperion5742(polarVoyageDragEventGammaThunder1866, polarVoyageMenuOlympianGammaAlpha8153, PolarVoyageMenuOlympianGammaAlpha8153.PolarVoyageKotlinBetaPulseBeta3653));
        PolarVoyageMenuOlympianGammaAlpha8153 polarVoyageMenuOlympianGammaAlpha81532 = null;
        while (polarVoyageMenuOlympianGammaAlpha8153 != null) {
            PolarVoyageMenuOlympianGammaAlpha8153 polarVoyageMenuOlympianGammaAlpha81533 = polarVoyageMenuOlympianGammaAlpha8153.PolarVoyageMotionLayoutTransitionHeroVision4068;
            polarVoyageMenuOlympianGammaAlpha8153.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageMenuOlympianGammaAlpha81532;
            polarVoyageMenuOlympianGammaAlpha81532 = polarVoyageMenuOlympianGammaAlpha8153;
            polarVoyageMenuOlympianGammaAlpha8153 = polarVoyageMenuOlympianGammaAlpha81533;
        }
        while (polarVoyageMenuOlympianGammaAlpha81532 != null) {
            PolarVoyageMenuOlympianGammaAlpha8153 polarVoyageMenuOlympianGammaAlpha81534 = polarVoyageMenuOlympianGammaAlpha81532.PolarVoyageMotionLayoutTransitionHeroVision4068;
            Runnable runnable = polarVoyageMenuOlympianGammaAlpha81532.PolarVoyageZipVortexCelestial6185;
            try {
                throw null;
            } catch (RuntimeException e) {
                PolarVoyageViewRogueMaster4778.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor null", (Throwable) e);
                polarVoyageMenuOlympianGammaAlpha81532 = polarVoyageMenuOlympianGammaAlpha81534;
            }
        }
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(PolarVoyageInsetDrawableNebulaMaster1564 polarVoyageInsetDrawableNebulaMaster1564) {
        polarVoyageInsetDrawableNebulaMaster1564.PolarVoyageZipVortexCelestial6185 = null;
        while (true) {
            PolarVoyageInsetDrawableNebulaMaster1564 polarVoyageInsetDrawableNebulaMaster15642 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (polarVoyageInsetDrawableNebulaMaster15642 == PolarVoyageInsetDrawableNebulaMaster1564.PolarVoyageKotlinBetaPulseBeta3653) {
                return;
            }
            PolarVoyageInsetDrawableNebulaMaster1564 polarVoyageInsetDrawableNebulaMaster15643 = null;
            while (polarVoyageInsetDrawableNebulaMaster15642 != null) {
                PolarVoyageInsetDrawableNebulaMaster1564 polarVoyageInsetDrawableNebulaMaster15644 = polarVoyageInsetDrawableNebulaMaster15642.PolarVoyageMotionLayoutTransitionHeroVision4068;
                if (polarVoyageInsetDrawableNebulaMaster15642.PolarVoyageZipVortexCelestial6185 != null) {
                    polarVoyageInsetDrawableNebulaMaster15643 = polarVoyageInsetDrawableNebulaMaster15642;
                } else if (polarVoyageInsetDrawableNebulaMaster15643 != null) {
                    polarVoyageInsetDrawableNebulaMaster15643.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageInsetDrawableNebulaMaster15644;
                    if (polarVoyageInsetDrawableNebulaMaster15643.PolarVoyageZipVortexCelestial6185 == null) {
                        break;
                    }
                } else if (!PolarVoyageCameraPixelBlaze2629.PolarVoyageContentProviderHyperSpark3838(this, polarVoyageInsetDrawableNebulaMaster15642, polarVoyageInsetDrawableNebulaMaster15644)) {
                    break;
                }
                polarVoyageInsetDrawableNebulaMaster15642 = polarVoyageInsetDrawableNebulaMaster15644;
            }
            return;
        }
    }

    public final void PolarVoyageZipVortexCelestial6185(StringBuilder sb) {
        try {
            Object PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(this);
            sb.append("SUCCESS, result=[");
            sb.append(PolarVoyageBitmapVisionAuroraPixel4705 == this ? "this future" : String.valueOf(PolarVoyageBitmapVisionAuroraPixel4705));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (obj == null) {
            if (PolarVoyageCameraPixelBlaze2629.PolarVoyageSnackbarGammaEclipse2140(this, obj, PolarVoyageBottomSheetOmegaNeo1907 ? new PolarVoyageValueAnimatorForceMaster1989(new CancellationException("Future.cancel() was called."), z) : z ? PolarVoyageValueAnimatorForceMaster1989.PolarVoyageKotlinBetaPulseBeta3653 : PolarVoyageValueAnimatorForceMaster1989.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                PolarVoyageKotlinBetaPulseBeta3653(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        PolarVoyageInsetDrawableNebulaMaster1564 polarVoyageInsetDrawableNebulaMaster1564 = PolarVoyageInsetDrawableNebulaMaster1564.PolarVoyageKotlinBetaPulseBeta3653;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (obj != null) {
            return PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            PolarVoyageInsetDrawableNebulaMaster1564 polarVoyageInsetDrawableNebulaMaster15642 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (polarVoyageInsetDrawableNebulaMaster15642 != polarVoyageInsetDrawableNebulaMaster1564) {
                PolarVoyageInsetDrawableNebulaMaster1564 polarVoyageInsetDrawableNebulaMaster15643 = new PolarVoyageInsetDrawableNebulaMaster1564();
                do {
                    PolarVoyageDrawableCompatNebulaTitanNeo6818 polarVoyageDrawableCompatNebulaTitanNeo6818 = PolarVoyageCameraPixelBlaze2629;
                    polarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyagePoseDetectionCosmosVision6217(polarVoyageInsetDrawableNebulaMaster15643, polarVoyageInsetDrawableNebulaMaster15642);
                    if (polarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageContentProviderHyperSpark3838(this, polarVoyageInsetDrawableNebulaMaster15642, polarVoyageInsetDrawableNebulaMaster15643)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                PolarVoyageDiffUtilTurboStrike5735(polarVoyageInsetDrawableNebulaMaster15643);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            if (obj2 != null) {
                                return PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        PolarVoyageDiffUtilTurboStrike5735(polarVoyageInsetDrawableNebulaMaster15643);
                    } else {
                        polarVoyageInsetDrawableNebulaMaster15642 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    }
                } while (polarVoyageInsetDrawableNebulaMaster15642 != polarVoyageInsetDrawableNebulaMaster1564);
            }
            return PolarVoyageBarcodeScannerInfernoSolarSpark7767(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
        while (nanos > 0) {
            Object obj3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (obj3 != null) {
                return PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String polarVoyageDragEventGammaThunder1866 = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + polarVoyageDragEventGammaThunder1866);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 instanceof PolarVoyageValueAnimatorForceMaster1989;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 instanceof PolarVoyageValueAnimatorForceMaster1989) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            PolarVoyageZipVortexCelestial6185(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                PolarVoyageZipVortexCelestial6185(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void PolarVoyageMotionLayoutTransitionHeroVision4068() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        PolarVoyageInsetDrawableNebulaMaster1564 polarVoyageInsetDrawableNebulaMaster1564 = PolarVoyageInsetDrawableNebulaMaster1564.PolarVoyageKotlinBetaPulseBeta3653;
        if (!Thread.interrupted()) {
            Object obj2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (obj2 != null) {
                return PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj2);
            }
            PolarVoyageInsetDrawableNebulaMaster1564 polarVoyageInsetDrawableNebulaMaster15642 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (polarVoyageInsetDrawableNebulaMaster15642 != polarVoyageInsetDrawableNebulaMaster1564) {
                PolarVoyageInsetDrawableNebulaMaster1564 polarVoyageInsetDrawableNebulaMaster15643 = new PolarVoyageInsetDrawableNebulaMaster1564();
                do {
                    PolarVoyageDrawableCompatNebulaTitanNeo6818 polarVoyageDrawableCompatNebulaTitanNeo6818 = PolarVoyageCameraPixelBlaze2629;
                    polarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyagePoseDetectionCosmosVision6217(polarVoyageInsetDrawableNebulaMaster15643, polarVoyageInsetDrawableNebulaMaster15642);
                    if (polarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageContentProviderHyperSpark3838(this, polarVoyageInsetDrawableNebulaMaster15642, polarVoyageInsetDrawableNebulaMaster15643)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            } else {
                                PolarVoyageDiffUtilTurboStrike5735(polarVoyageInsetDrawableNebulaMaster15643);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj);
                    }
                    polarVoyageInsetDrawableNebulaMaster15642 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                } while (polarVoyageInsetDrawableNebulaMaster15642 != polarVoyageInsetDrawableNebulaMaster1564);
            }
            return PolarVoyageBarcodeScannerInfernoSolarSpark7767(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
        throw new InterruptedException();
    }
}
