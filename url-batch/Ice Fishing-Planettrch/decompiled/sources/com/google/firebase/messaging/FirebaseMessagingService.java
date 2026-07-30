package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000createpolar.PolarVoyageAdapterTitanSpark4027;
import p000createpolar.PolarVoyageAlarmManagerAlphaInferno3493;
import p000createpolar.PolarVoyageAnimatorCelestialDeltaMaster5821;
import p000createpolar.PolarVoyageAnimatorHeroPrime4575;
import p000createpolar.PolarVoyageAsyncEpicCelestialSpectra3691;
import p000createpolar.PolarVoyageBarcodeScannerOlympianNeoShadow6002;
import p000createpolar.PolarVoyageBarrierHeroSparkInferno3191;
import p000createpolar.PolarVoyageConstraintSetClonePixelVortex4921;
import p000createpolar.PolarVoyageDialogFragmentTitanCelestial7995;
import p000createpolar.PolarVoyageFilterTurboThunderEclipse3279;
import p000createpolar.PolarVoyageLaunchPrimeStrikeRogue2575;
import p000createpolar.PolarVoyageMotionLayoutHeroSpeed4592;
import p000createpolar.PolarVoyageNavigationViewNebulaNovaXPhoenix7849;
import p000createpolar.PolarVoyageRotateDrawableTurboHyperDelta7408;
import p000createpolar.PolarVoyageSQLiteTitanForceLegend7380;
import p000createpolar.PolarVoyageTextWatcherPhantomStorm4467;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends Service {
    public static final ArrayDeque PolarVoyageDrawableDeltaHyperion5742 = new ArrayDeque(10);
    public int PolarVoyageBottomSheetOmegaNeo1907;
    public PolarVoyageMotionLayoutHeroSpeed4592 PolarVoyageCameraPixelBlaze2629;
    public final ExecutorService PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public PolarVoyageLaunchPrimeStrikeRogue2575 PolarVoyageStrictModeLegendEpic1532;
    public int PolarVoyageViewRogueMaster4778;

    public FirebaseMessagingService() {
        PolarVoyageAsyncEpicCelestialSpectra3691 polarVoyageAsyncEpicCelestialSpectra3691 = new PolarVoyageAsyncEpicCelestialSpectra3691("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), polarVoyageAsyncEpicCelestialSpectra3691);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new Object();
        this.PolarVoyageViewRogueMaster4778 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(Intent intent) {
        String stringExtra;
        PolarVoyageMotionLayoutHeroSpeed4592 polarVoyageMotionLayoutHeroSpeed4592;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                intent.getStringExtra("token");
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            ArrayDeque arrayDeque = PolarVoyageDrawableDeltaHyperion5742;
            if (arrayDeque.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                if (this.PolarVoyageCameraPixelBlaze2629 == null) {
                    this.PolarVoyageCameraPixelBlaze2629 = new PolarVoyageMotionLayoutHeroSpeed4592(getApplicationContext());
                }
                polarVoyageMotionLayoutHeroSpeed4592 = this.PolarVoyageCameraPixelBlaze2629;
                if (polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutForceEpicAurora7183() >= 233700000) {
                    new PolarVoyageDialogFragmentTitanCelestial7995().PolarVoyageRotateAnimationCyberCelestialDelta4768(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                Bundle bundle = new Bundle();
                String stringExtra3 = intent.getStringExtra("google.message_id");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getStringExtra("message_id");
                }
                bundle.putString("google.message_id", stringExtra3);
                Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
                if (valueOf != null) {
                    bundle.putInt("google.product_id", valueOf.intValue());
                }
                PolarVoyageSQLiteTitanForceLegend7380 PolarVoyageViewRogueMaster4778 = PolarVoyageSQLiteTitanForceLegend7380.PolarVoyageViewRogueMaster4778(polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageMotionLayoutTransitionHeroVision4068);
                synchronized (PolarVoyageViewRogueMaster4778) {
                    i = PolarVoyageViewRogueMaster4778.PolarVoyageZipVortexCelestial6185;
                    PolarVoyageViewRogueMaster4778.PolarVoyageZipVortexCelestial6185 = i + 1;
                }
                PolarVoyageViewRogueMaster4778.PolarVoyageCameraPixelBlaze2629(new PolarVoyageAnimatorHeroPrime4575(i, 3, bundle, 0));
                return;
            }
            if (arrayDeque.size() >= 10) {
                arrayDeque.remove();
            }
            arrayDeque.add(stringExtra2);
        }
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                break;
            case "gcm":
                PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (PolarVoyageAdapterTitanSpark4027.PolarVoyageCameraViewSpectraMaxSpectra2824(extras)) {
                    PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027 = new PolarVoyageAdapterTitanSpark4027(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new PolarVoyageAsyncEpicCelestialSpectra3691("Firebase-Messaging-Network-Io"));
                    try {
                        if (!new PolarVoyageAlarmManagerAlphaInferno3493(this, polarVoyageAdapterTitanSpark4027, newSingleThreadExecutor).PolarVoyageSnackbarGammaEclipse2140()) {
                            newSingleThreadExecutor.shutdown();
                            if (PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageHandlerThreadMaxAurora5064(intent)) {
                                PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageToolbarEclipseInfernoHero6368(intent.getExtras(), "_nf");
                                break;
                            }
                        } else {
                            break;
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new PolarVoyageBarcodeScannerOlympianNeoShadow6002(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                    break;
                }
                break;
            case "send_event":
                intent.getStringExtra("google.message_id");
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                break;
        }
        if (this.PolarVoyageCameraPixelBlaze2629 == null) {
        }
        polarVoyageMotionLayoutHeroSpeed4592 = this.PolarVoyageCameraPixelBlaze2629;
        if (polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutForceEpicAurora7183() >= 233700000) {
        }
    }

    public final void PolarVoyageZipVortexCelestial6185(Intent intent) {
        if (intent != null) {
            PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBitmapMaxTitanTitan7960(intent);
        }
        synchronized (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            try {
                int i = this.PolarVoyageViewRogueMaster4778 - 1;
                this.PolarVoyageViewRogueMaster4778 = i;
                if (i == 0) {
                    stopSelfResult(this.PolarVoyageBottomSheetOmegaNeo1907);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.PolarVoyageStrictModeLegendEpic1532 == null) {
                this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageLaunchPrimeStrikeRogue2575(new PolarVoyageAdapterTitanSpark4027(4, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = i2;
            this.PolarVoyageViewRogueMaster4778++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) PolarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageLayerDrawableShadowTitaniumOmega1942().PolarVoyageViewRogueMaster4778).poll();
        if (intent2 == null) {
            PolarVoyageZipVortexCelestial6185(intent);
            return 2;
        }
        PolarVoyageRotateDrawableTurboHyperDelta7408 polarVoyageRotateDrawableTurboHyperDelta7408 = new PolarVoyageRotateDrawableTurboHyperDelta7408();
        int i3 = 3;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.execute(new PolarVoyageBarrierHeroSparkInferno3191(this, intent2, polarVoyageRotateDrawableTurboHyperDelta7408, i3));
        PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995 = polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185;
        if (polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageTextInputEditTextNebulaHero6651()) {
            PolarVoyageZipVortexCelestial6185(intent);
            return 2;
        }
        polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageZipVortexCelestial6185(new PolarVoyageFilterTurboThunderEclipse3279(1), new PolarVoyageTextWatcherPhantomStorm4467(i3, this, intent));
        return 3;
    }
}
