package p000createpolar;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRunnableBlazeDragon1360 implements Application.ActivityLifecycleCallbacks {
    public final ArrayDeque PolarVoyageItemDecorationUltraDeltaEpic7485 = new ArrayDeque(10);

    public final void PolarVoyageZipVortexCelestial6185(Intent intent) {
        ArrayDeque arrayDeque = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    PolarVoyageRewardedAdEliteNova2598 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185();
                    if (PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageTextureViewQuantumDelta2831.class) != null) {
                        PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                        return;
                    } else {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                        }
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageToolbarEclipseInfernoHero6368(bundle, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new PolarVoyageMediaPlayerNebulaTurboLegend3509(17, this, intent));
        } else {
            PolarVoyageZipVortexCelestial6185(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
