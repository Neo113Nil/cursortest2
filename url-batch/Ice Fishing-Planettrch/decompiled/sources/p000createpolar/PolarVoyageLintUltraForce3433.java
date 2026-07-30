package p000createpolar;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageLintUltraForce3433 implements Runnable {
    public final /* synthetic */ Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageLintUltraForce3433(int i, Object obj, Object obj2, boolean z) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = z;
        this.PolarVoyageBottomSheetOmegaNeo1907 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String notificationDelegate;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageBottomSheetOmegaNeo1907;
        boolean z = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object obj2 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) obj2).lambda$setPushToken$33(z, (String) obj);
                return;
            case 1:
                ((ActivityHandler) obj2).lambda$setPushToken$32(z, (String) obj);
                return;
            default:
                Context context = (Context) obj2;
                PolarVoyageRotateDrawableTurboHyperDelta7408 polarVoyageRotateDrawableTurboHyperDelta7408 = (PolarVoyageRotateDrawableTurboHyperDelta7408) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageBitmapMaxTitanTitan7960(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageKotlinBetaPulseBeta3653(null);
                }
        }
    }
}
