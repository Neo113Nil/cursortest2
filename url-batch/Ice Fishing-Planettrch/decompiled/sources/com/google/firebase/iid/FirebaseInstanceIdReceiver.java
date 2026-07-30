package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000createpolar.PolarVoyageAsyncEpicCelestialSpectra3691;
import p000createpolar.PolarVoyageConstraintSetClonePixelVortex4921;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static SoftReference PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static SoftReference PolarVoyageZipVortexCelestial6185;

    public static int PolarVoyageZipVortexCelestial6185(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (!PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageHandlerThreadMaxAurora5064(putExtras)) {
            return -1;
        }
        PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageToolbarEclipseInfernoHero6368(putExtras.getExtras(), "_nd");
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (FirebaseInstanceIdReceiver.class) {
            try {
                SoftReference softReference = PolarVoyageZipVortexCelestial6185;
                ExecutorService executorService2 = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService2 == null) {
                    executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new PolarVoyageAsyncEpicCelestialSpectra3691("firebase-iid-executor")));
                    PolarVoyageZipVortexCelestial6185 = new SoftReference(executorService2);
                }
                executorService = executorService2;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new Runnable(this) { // from class: create-polar.PolarVoyageMediaPlayerGammaTurbo3483
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor;
                int i;
                Intent intent2 = intent;
                Context context2 = context;
                boolean z = isOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent3 != null) {
                        i = FirebaseInstanceIdReceiver.PolarVoyageZipVortexCelestial6185(intent3);
                    } else {
                        int i2 = 500;
                        if (intent2.getExtras() != null) {
                            PolarVoyageIntentCyberElite6469 polarVoyageIntentCyberElite6469 = new PolarVoyageIntentCyberElite6469(intent2);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference2 = FirebaseInstanceIdReceiver.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                    executor = softReference2 != null ? (Executor) softReference2.get() : null;
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new PolarVoyageAsyncEpicCelestialSpectra3691("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.PolarVoyageMotionLayoutTransitionHeroVision4068 = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new PolarVoyageWindowManagerInfernoPulseQuantum9931(context2, polarVoyageIntentCyberElite6469, countDownLatch));
                            try {
                                i2 = ((Integer) PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageBarcodeScannerInfernoSolarSpark7767(new PolarVoyageZoomStateAlphaVision6590(context2, 0).PolarVoyageBitmapMaxTitanTitan7960(intent2))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        i = i2;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            }
        });
    }
}
