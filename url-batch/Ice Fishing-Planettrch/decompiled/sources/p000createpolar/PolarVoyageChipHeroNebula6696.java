package p000createpolar;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageChipHeroNebula6696 implements Runnable {
    public final Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
    public final Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final long PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageChipHeroNebula6696(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new PolarVoyageAsyncEpicCelestialSpectra3691("firebase-iid-executor"));
        this.PolarVoyageBottomSheetOmegaNeo1907 = firebaseMessaging;
        this.PolarVoyageStrictModeLegendEpic1532 = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.PolarVoyageMotionLayoutTransitionHeroVision4068.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        try {
            if (((FirebaseMessaging) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageZipVortexCelestial6185() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public boolean PolarVoyageZipVortexCelestial6185() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    Thread.sleep(this.PolarVoyageStrictModeLegendEpic1532);
                } catch (InterruptedException e) {
                    AdjustFactory.getLogger().warn("Sleep delay exception: %s", e.getMessage());
                }
                ((SingleThreadCachedScheduler) this.PolarVoyageBottomSheetOmegaNeo1907).submit((Runnable) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageLayerDrawableShadowTitaniumOmega1942 = PolarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageLayerDrawableShadowTitaniumOmega1942();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.PolarVoyageBottomSheetOmegaNeo1907;
                if (PolarVoyageLayerDrawableShadowTitaniumOmega1942.PolarVoyageLooperThreadAlphaPrime1279(firebaseMessaging.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.PolarVoyageStrictModeLegendEpic1532 = true;
                        }
                        if (!firebaseMessaging.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.PolarVoyageStrictModeLegendEpic1532 = false;
                            }
                            if (!PolarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageLayerDrawableShadowTitaniumOmega1942().PolarVoyageLooperThreadAlphaPrime1279(firebaseMessaging.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                                return;
                            }
                        } else if (!PolarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageLayerDrawableShadowTitaniumOmega1942().PolarVoyagePackageManagerCelestialPhoenix8393(firebaseMessaging.PolarVoyageMotionLayoutTransitionHeroVision4068) || PolarVoyageZipVortexCelestial6185()) {
                            if (PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.PolarVoyageStrictModeLegendEpic1532 = false;
                                }
                            } else {
                                firebaseMessaging.PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageStrictModeLegendEpic1532);
                            }
                            if (!PolarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageLayerDrawableShadowTitaniumOmega1942().PolarVoyageLooperThreadAlphaPrime1279(firebaseMessaging.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                                return;
                            }
                        } else {
                            PolarVoyagePropertyValuesHolderPixelBlaze4806 polarVoyagePropertyValuesHolderPixelBlaze4806 = new PolarVoyagePropertyValuesHolderPixelBlaze4806();
                            polarVoyagePropertyValuesHolderPixelBlaze4806.PolarVoyageKotlinBetaPulseBeta3653 = this;
                            polarVoyagePropertyValuesHolderPixelBlaze4806.PolarVoyageZipVortexCelestial6185();
                            if (!PolarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageLayerDrawableShadowTitaniumOmega1942().PolarVoyageLooperThreadAlphaPrime1279(firebaseMessaging.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                                return;
                            }
                        }
                    } catch (IOException e2) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.PolarVoyageStrictModeLegendEpic1532 = false;
                            if (!PolarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageLayerDrawableShadowTitaniumOmega1942().PolarVoyageLooperThreadAlphaPrime1279(firebaseMessaging.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (PolarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageLayerDrawableShadowTitaniumOmega1942().PolarVoyageLooperThreadAlphaPrime1279(firebaseMessaging.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public PolarVoyageChipHeroNebula6696(SingleThreadCachedScheduler singleThreadCachedScheduler, long j, Runnable runnable) {
        this.PolarVoyageBottomSheetOmegaNeo1907 = singleThreadCachedScheduler;
        this.PolarVoyageStrictModeLegendEpic1532 = j;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = runnable;
    }
}
