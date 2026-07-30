package p000createpolar;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageNavigationPrimePhoenix7347 {
    public static volatile ScheduledExecutorService PolarVoyageDrawableDeltaHyperion5742;
    public static final Object PolarVoyageSnackbarGammaEclipse2140 = new Object();
    public ScheduledFuture PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public long PolarVoyageBitmapVisionAuroraPixel4705;
    public final HashMap PolarVoyageBottomSheetOmegaNeo1907;
    public final ScheduledExecutorService PolarVoyageCameraPixelBlaze2629;
    public final HashSet PolarVoyageDiffUtilTurboStrike5735;
    public PolarVoyageApplicationInfoNeoEclipseFusion7988 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public final PowerManager.WakeLock PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final String PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageOnLongClickListenerOlympianPhantomAlpha1069 PolarVoyageStrictModeLegendEpic1532;
    public boolean PolarVoyageTextInputEditTextNebulaHero6651;
    public final AtomicInteger PolarVoyageViewRogueMaster4778;
    public final Object PolarVoyageZipVortexCelestial6185;

    public PolarVoyageNavigationPrimePhoenix7347(Context context) {
        boolean z;
        String packageName = context.getPackageName();
        this.PolarVoyageZipVortexCelestial6185 = new Object();
        this.PolarVoyageKotlinBetaPulseBeta3653 = 0;
        this.PolarVoyageDiffUtilTurboStrike5735 = new HashSet();
        this.PolarVoyageTextInputEditTextNebulaHero6651 = true;
        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageOnLongClickListenerOlympianPhantomAlpha1069.PolarVoyageViewRogueMaster4778;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new HashMap();
        this.PolarVoyageViewRogueMaster4778 = new AtomicInteger(0);
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageAnimatorSetSparkUltraMax8233("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new PolarVoyageToolbarNovaTitanSpeed3010(sb.toString());
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = PolarVoyageAnalyticsSolarDragon5206.PolarVoyageZipVortexCelestial6185;
        synchronized (PolarVoyageAnalyticsSolarDragon5206.class) {
            Boolean bool = PolarVoyageAnalyticsSolarDragon5206.PolarVoyageKotlinBetaPulseBeta3653;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewRogueMaster4778(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                PolarVoyageAnalyticsSolarDragon5206.PolarVoyageKotlinBetaPulseBeta3653 = Boolean.valueOf(z);
            }
        }
        if (z) {
            int i = PolarVoyageBarrierQuantumGamma9493.PolarVoyageZipVortexCelestial6185;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = PolarVoyageAnimationSetPhantomOlympianShadow8476.PolarVoyageZipVortexCelestial6185(context).PolarVoyageItemDecorationUltraDeltaEpic7485.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = PolarVoyageAnalyticsSolarDragon5206.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i2), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method3 = PolarVoyageAnalyticsSolarDragon5206.PolarVoyageZipVortexCelestial6185;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i2));
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.PolarVoyageMotionLayoutTransitionHeroVision4068.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
                    Log.wtf("WakeLock", e3.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = PolarVoyageDrawableDeltaHyperion5742;
        if (scheduledExecutorService == null) {
            synchronized (PolarVoyageSnackbarGammaEclipse2140) {
                try {
                    scheduledExecutorService = PolarVoyageDrawableDeltaHyperion5742;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        PolarVoyageDrawableDeltaHyperion5742 = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.PolarVoyageCameraPixelBlaze2629 = scheduledExecutorService;
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        HashSet hashSet = this.PolarVoyageDiffUtilTurboStrike5735;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705() {
        synchronized (this.PolarVoyageZipVortexCelestial6185) {
            try {
                if (PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                    if (this.PolarVoyageTextInputEditTextNebulaHero6651) {
                        int i = this.PolarVoyageKotlinBetaPulseBeta3653 - 1;
                        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.PolarVoyageKotlinBetaPulseBeta3653 = 0;
                    }
                    PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                    Iterator it = this.PolarVoyageBottomSheetOmegaNeo1907.values().iterator();
                    while (it.hasNext()) {
                        ((PolarVoyageOnClickListenerSolarTitaniumSpectra7047) it.next()).PolarVoyageZipVortexCelestial6185 = 0;
                    }
                    this.PolarVoyageBottomSheetOmegaNeo1907.clear();
                    ScheduledFuture scheduledFuture = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = null;
                        this.PolarVoyageBitmapVisionAuroraPixel4705 = 0L;
                    }
                    if (this.PolarVoyageMotionLayoutTransitionHeroVision4068.isHeld()) {
                        try {
                            try {
                                this.PolarVoyageMotionLayoutTransitionHeroVision4068.release();
                                if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 != null) {
                                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.PolarVoyageRotateAnimationCyberCelestialDelta4768).concat(" failed to release!"), e);
                                if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 != null) {
                                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 != null) {
                                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.PolarVoyageRotateAnimationCyberCelestialDelta4768).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653() {
        if (this.PolarVoyageViewRogueMaster4778.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.PolarVoyageRotateAnimationCyberCelestialDelta4768).concat(" release without a matched acquire!"));
        }
        synchronized (this.PolarVoyageZipVortexCelestial6185) {
            try {
                if (this.PolarVoyageTextInputEditTextNebulaHero6651) {
                    TextUtils.isEmpty(null);
                }
                if (this.PolarVoyageBottomSheetOmegaNeo1907.containsKey(null)) {
                    PolarVoyageOnClickListenerSolarTitaniumSpectra7047 polarVoyageOnClickListenerSolarTitaniumSpectra7047 = (PolarVoyageOnClickListenerSolarTitaniumSpectra7047) this.PolarVoyageBottomSheetOmegaNeo1907.get(null);
                    if (polarVoyageOnClickListenerSolarTitaniumSpectra7047 != null) {
                        int i = polarVoyageOnClickListenerSolarTitaniumSpectra7047.PolarVoyageZipVortexCelestial6185 - 1;
                        polarVoyageOnClickListenerSolarTitaniumSpectra7047.PolarVoyageZipVortexCelestial6185 = i;
                        if (i == 0) {
                            this.PolarVoyageBottomSheetOmegaNeo1907.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.PolarVoyageRotateAnimationCyberCelestialDelta4768).concat(" counter does not exist"));
                }
                PolarVoyageBitmapVisionAuroraPixel4705();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        boolean z;
        synchronized (this.PolarVoyageZipVortexCelestial6185) {
            z = this.PolarVoyageKotlinBetaPulseBeta3653 > 0;
        }
        return z;
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        this.PolarVoyageViewRogueMaster4778.incrementAndGet();
        long min = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.PolarVoyageZipVortexCelestial6185) {
            try {
                if (!PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageApplicationInfoNeoEclipseFusion7988.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    this.PolarVoyageMotionLayoutTransitionHeroVision4068.acquire();
                    this.PolarVoyageStrictModeLegendEpic1532.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.PolarVoyageKotlinBetaPulseBeta3653++;
                if (this.PolarVoyageTextInputEditTextNebulaHero6651) {
                    TextUtils.isEmpty(null);
                }
                PolarVoyageOnClickListenerSolarTitaniumSpectra7047 polarVoyageOnClickListenerSolarTitaniumSpectra7047 = (PolarVoyageOnClickListenerSolarTitaniumSpectra7047) this.PolarVoyageBottomSheetOmegaNeo1907.get(null);
                if (polarVoyageOnClickListenerSolarTitaniumSpectra7047 == null) {
                    polarVoyageOnClickListenerSolarTitaniumSpectra7047 = new PolarVoyageOnClickListenerSolarTitaniumSpectra7047();
                    this.PolarVoyageBottomSheetOmegaNeo1907.put(null, polarVoyageOnClickListenerSolarTitaniumSpectra7047);
                }
                polarVoyageOnClickListenerSolarTitaniumSpectra7047.PolarVoyageZipVortexCelestial6185++;
                this.PolarVoyageStrictModeLegendEpic1532.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - elapsedRealtime > min ? elapsedRealtime + min : Long.MAX_VALUE;
                if (j > this.PolarVoyageBitmapVisionAuroraPixel4705) {
                    this.PolarVoyageBitmapVisionAuroraPixel4705 = j;
                    ScheduledFuture scheduledFuture = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = this.PolarVoyageCameraPixelBlaze2629.schedule(new PolarVoyageDialogSolarMaster1422(13, this), min, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
