package p000createpolar;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLinearLayoutNebulaPulse7053 extends PolarVoyagePlaceholderSpeedBetaPhantom4939 implements Runnable {
    public static final long PolarVoyageNavigationViewHyperHyperHyperion1793;
    public static final PolarVoyageLinearLayoutNebulaPulse7053 PolarVoyageRemoteModelManagerOlympianCelestial9141;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        PolarVoyageLinearLayoutNebulaPulse7053 polarVoyageLinearLayoutNebulaPulse7053 = new PolarVoyageLinearLayoutNebulaPulse7053();
        PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageLinearLayoutNebulaPulse7053;
        polarVoyageLinearLayoutNebulaPulse7053.PolarVoyageGuidelineStormSolar2850(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        PolarVoyageNavigationViewHyperHyperHyperion1793 = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // p000createpolar.PolarVoyagePlaceholderSpeedBetaPhantom4939, p000createpolar.PolarVoyageVelocityTrackerGammaDeltaEpic7489
    public final PolarVoyagePagingDataStormPhantomEclipse5825 PolarVoyageBitmapVisionAuroraPixel4705(long j, PolarVoyageViewSparkSolar6735 polarVoyageViewSparkSolar6735, PolarVoyageEventNebulaCelestialOlympian6822 polarVoyageEventNebulaCelestialOlympian6822) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return PolarVoyageTraceCelestialForce1015.PolarVoyageItemDecorationUltraDeltaEpic7485;
        }
        long nanoTime = System.nanoTime();
        PolarVoyageTransformHyperPhoenixTitanium9759 polarVoyageTransformHyperPhoenixTitanium9759 = new PolarVoyageTransformHyperPhoenixTitanium9759(j2 + nanoTime, polarVoyageViewSparkSolar6735);
        PolarVoyageKeyframeEpicNovaXCyber9821(nanoTime, polarVoyageTransformHyperPhoenixTitanium9759);
        return polarVoyageTransformHyperPhoenixTitanium9759;
    }

    @Override // p000createpolar.PolarVoyagePlaceholderSpeedBetaPhantom4939
    public final void PolarVoyageColorStateListEliteStrikeOlympian8131(long j, PolarVoyageDatabaseVisionMega1683 polarVoyageDatabaseVisionMega1683) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000createpolar.PolarVoyagePlaceholderSpeedBetaPhantom4939
    public final void PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(runnable);
    }

    public final synchronized void PolarVoyageMotionSceneStormSolarBeta2208() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            PolarVoyagePlaceholderSpeedBetaPhantom4939.PolarVoyageDrawableDeltaHyperion5742.set(this, null);
            PolarVoyagePlaceholderSpeedBetaPhantom4939.PolarVoyageSnackbarGammaEclipse2140.set(this, null);
            notifyAll();
        }
    }

    @Override // p000createpolar.PolarVoyagePlaceholderSpeedBetaPhantom4939
    public final Thread PolarVoyagePoseDetectionCosmosVision6217() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "create-polar.PolarVoyageLinearLayoutNebulaPulse7053");
                _thread = thread;
                thread.setContextClassLoader(PolarVoyageRemoteModelManagerOlympianCelestial9141.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean PolarVoyageAlertDialogNovaXCelestial4954;
        PolarVoyageTextWatcherNebulaVortex1931.PolarVoyageZipVortexCelestial6185.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (PolarVoyageAlertDialogNovaXCelestial4954) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long PolarVoyageConfigurationMaxSpectraForce5418 = PolarVoyageConfigurationMaxSpectraForce5418();
                    if (PolarVoyageConfigurationMaxSpectraForce5418 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = PolarVoyageNavigationViewHyperHyperHyperion1793 + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            PolarVoyageMotionSceneStormSolarBeta2208();
                            if (PolarVoyageAlertDialogNovaXCelestial4954()) {
                                return;
                            }
                            PolarVoyagePoseDetectionCosmosVision6217();
                            return;
                        }
                        if (PolarVoyageConfigurationMaxSpectraForce5418 > j2) {
                            PolarVoyageConfigurationMaxSpectraForce5418 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (PolarVoyageConfigurationMaxSpectraForce5418 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            PolarVoyageMotionSceneStormSolarBeta2208();
                            if (PolarVoyageAlertDialogNovaXCelestial4954()) {
                                return;
                            }
                            PolarVoyagePoseDetectionCosmosVision6217();
                            return;
                        }
                        LockSupport.parkNanos(this, PolarVoyageConfigurationMaxSpectraForce5418);
                    }
                }
            }
        } finally {
            _thread = null;
            PolarVoyageMotionSceneStormSolarBeta2208();
            if (!PolarVoyageAlertDialogNovaXCelestial4954()) {
                PolarVoyagePoseDetectionCosmosVision6217();
            }
        }
    }

    @Override // p000createpolar.PolarVoyagePlaceholderSpeedBetaPhantom4939, p000createpolar.PolarVoyageProGuardVisionRogue4249
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000createpolar.PolarVoyageAccelerometerAuroraTitanSpeed7821
    public final String toString() {
        return "DefaultExecutor";
    }
}
