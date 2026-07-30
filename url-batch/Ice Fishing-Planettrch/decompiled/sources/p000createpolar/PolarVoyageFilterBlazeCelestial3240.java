package p000createpolar;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFilterBlazeCelestial3240 extends PolarVoyageServiceVisionUltraNova5701 {
    public static final Object PolarVoyageMotionLayoutTransitionHeroVision4068 = new Object();
    public static final PolarVoyageFilterBlazeCelestial3240 PolarVoyageKotlinBetaPulseBeta3653 = new PolarVoyageFilterBlazeCelestial3240();

    public static AlertDialog PolarVoyageBarcodeScannerInfernoSolarSpark7767(Activity activity, int i, PolarVoyageGestureDetectorEclipseDragon7494 polarVoyageGestureDetectorEclipseDragon7494, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(PolarVoyageLifecycleCameraControllerEpicInfernoMega5425.PolarVoyageMotionLayoutTransitionHeroVision4068(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.polarvoyage.glacialoceans.icepathfinder.quest.R.string.common_google_play_services_enable_button) : resources.getString(com.polarvoyage.glacialoceans.icepathfinder.quest.R.string.common_google_play_services_update_button) : resources.getString(com.polarvoyage.glacialoceans.icepathfinder.quest.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, polarVoyageGestureDetectorEclipseDragon7494);
        }
        String PolarVoyageKotlinBetaPulseBeta36532 = PolarVoyageLifecycleCameraControllerEpicInfernoMega5425.PolarVoyageKotlinBetaPulseBeta3653(activity, i);
        if (PolarVoyageKotlinBetaPulseBeta36532 != null) {
            builder.setTitle(PolarVoyageKotlinBetaPulseBeta36532);
        }
        Log.w("GoogleApiAvailability", PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Creating dialog for Google Play services availability issue. ConnectionResult=", i), new IllegalArgumentException());
        return builder.create();
    }

    public static void PolarVoyageBitmapVisionAuroraPixel4705(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        PolarVoyageAnimatedVectorDrawableInfernoNeo1500 polarVoyageAnimatedVectorDrawableInfernoNeo1500 = new PolarVoyageAnimatedVectorDrawableInfernoNeo1500();
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageLayerDrawableShadowTitaniumOmega1942(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        polarVoyageAnimatedVectorDrawableInfernoNeo1500.PolarVoyageItemDecorationUltraDeltaEpic7485 = alertDialog;
        if (onCancelListener != null) {
            polarVoyageAnimatedVectorDrawableInfernoNeo1500.PolarVoyageStrictModeLegendEpic1532 = onCancelListener;
        }
        polarVoyageAnimatedVectorDrawableInfernoNeo1500.show(fragmentManager, str);
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("GMS core API Availability. ConnectionResult=", i, ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new PolarVoyageFontFamilyNeoForceEclipse2734(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String PolarVoyageBitmapVisionAuroraPixel4705 = i == 6 ? PolarVoyageLifecycleCameraControllerEpicInfernoMega5425.PolarVoyageBitmapVisionAuroraPixel4705(context, "common_google_play_services_resolution_required_title") : PolarVoyageLifecycleCameraControllerEpicInfernoMega5425.PolarVoyageKotlinBetaPulseBeta3653(context, i);
        if (PolarVoyageBitmapVisionAuroraPixel4705 == null) {
            PolarVoyageBitmapVisionAuroraPixel4705 = context.getResources().getString(com.polarvoyage.glacialoceans.icepathfinder.quest.R.string.common_google_play_services_notification_ticker);
        }
        String PolarVoyageBarcodeScannerInfernoSolarSpark7767 = (i == 6 || i == 19) ? PolarVoyageLifecycleCameraControllerEpicInfernoMega5425.PolarVoyageBarcodeScannerInfernoSolarSpark7767(context, "common_google_play_services_resolution_required_text", PolarVoyageLifecycleCameraControllerEpicInfernoMega5425.PolarVoyageZipVortexCelestial6185(context)) : PolarVoyageLifecycleCameraControllerEpicInfernoMega5425.PolarVoyageMotionLayoutTransitionHeroVision4068(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        PolarVoyageMotionEventEclipseThunderBlaze7795 polarVoyageMotionEventEclipseThunderBlaze7795 = new PolarVoyageMotionEventEclipseThunderBlaze7795(context, null);
        polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageCameraPixelBlaze2629 = true;
        polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233.flags |= 16;
        polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageBitmapVisionAuroraPixel4705);
        PolarVoyageTextInputLayoutHeroTitaniumQuantum9958 polarVoyageTextInputLayoutHeroTitaniumQuantum9958 = new PolarVoyageTextInputLayoutHeroTitaniumQuantum9958();
        polarVoyageTextInputLayoutHeroTitaniumQuantum9958.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageTextInputLayoutHeroTitaniumQuantum9958);
        PackageManager packageManager = context.getPackageManager();
        if (PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141 == null) {
            PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141.booleanValue()) {
            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233.icon = context.getApplicationInfo().icon;
            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 2;
            if (PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDisplayMetricsVortexDragon9516(context)) {
                polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageMotionLayoutTransitionHeroVision4068.add(new PolarVoyageServiceConnectionOmegaSpark3276(resources.getString(com.polarvoyage.glacialoceans.icepathfinder.quest.R.string.common_open_on_phone), pendingIntent));
            } else {
                polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageTextInputEditTextNebulaHero6651 = pendingIntent;
            }
        } else {
            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233.icon = R.drawable.stat_sys_warning;
            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233.tickerText = PolarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageMotionLayoutTransitionHeroVision4068(resources.getString(com.polarvoyage.glacialoceans.icepathfinder.quest.R.string.common_google_play_services_notification_ticker));
            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233.when = System.currentTimeMillis();
            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageTextInputEditTextNebulaHero6651 = pendingIntent;
            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        }
        if (PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803()) {
            if (!PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803()) {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
                return;
            }
            synchronized (PolarVoyageMotionLayoutTransitionHeroVision4068) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.polarvoyage.glacialoceans.icepathfinder.quest.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(PolarVoyageCameraOmegaHyperion2330.PolarVoyageLifecycleOlympianOmega3762(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageRemoteModelManagerOlympianCelestial9141 = "com.google.android.gms.availability";
        }
        Notification PolarVoyageZipVortexCelestial6185 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185();
        if (i == 1 || i == 2 || i == 3) {
            PolarVoyageVideoCaptureCelestialLegend8331.PolarVoyageZipVortexCelestial6185.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, PolarVoyageZipVortexCelestial6185);
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(googleApiActivity, i, new PolarVoyageGestureDetectorEclipseDragon7494(super.PolarVoyageZipVortexCelestial6185(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == null) {
            return;
        }
        PolarVoyageBitmapVisionAuroraPixel4705(googleApiActivity, PolarVoyageBarcodeScannerInfernoSolarSpark7767, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void PolarVoyageTextInputEditTextNebulaHero6651(Activity activity, PolarVoyageSharedElementHyperElite9184 polarVoyageSharedElementHyperElite9184, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(activity, i, new PolarVoyageGestureDetectorEclipseDragon7494(super.PolarVoyageZipVortexCelestial6185(i, activity, "d"), polarVoyageSharedElementHyperElite9184, 1), onCancelListener);
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == null) {
            return;
        }
        PolarVoyageBitmapVisionAuroraPixel4705(activity, PolarVoyageBarcodeScannerInfernoSolarSpark7767, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
