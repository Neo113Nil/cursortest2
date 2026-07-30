package p000createpolar;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageLifecycleCameraControllerEpicInfernoMega5425 {
    public static Locale PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final PolarVoyageLevelListDrawablePhoenixMegaNebula9939 PolarVoyageZipVortexCelestial6185 = new PolarVoyageLevelListDrawablePhoenixMegaNebula9939(0);

    public static String PolarVoyageBarcodeScannerInfernoSolarSpark7767(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(context, str);
        if (PolarVoyageBitmapVisionAuroraPixel4705 == null) {
            PolarVoyageBitmapVisionAuroraPixel4705 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, PolarVoyageBitmapVisionAuroraPixel4705, str2);
    }

    public static String PolarVoyageBitmapVisionAuroraPixel4705(Context context, String str) {
        Resources resources;
        PolarVoyageLevelListDrawablePhoenixMegaNebula9939 polarVoyageLevelListDrawablePhoenixMegaNebula9939 = PolarVoyageZipVortexCelestial6185;
        synchronized (polarVoyageLevelListDrawablePhoenixMegaNebula9939) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                    polarVoyageLevelListDrawablePhoenixMegaNebula9939.clear();
                    PolarVoyageMotionLayoutTransitionHeroVision4068 = locale;
                }
                String str2 = (String) polarVoyageLevelListDrawablePhoenixMegaNebula9939.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = PolarVoyageVideoCaptureCelestialLegend8331.PolarVoyageZipVortexCelestial6185;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            PolarVoyageZipVortexCelestial6185.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public static String PolarVoyageKotlinBetaPulseBeta3653(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return PolarVoyageBitmapVisionAuroraPixel4705(context, "common_google_play_services_invalid_account_title");
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return PolarVoyageBitmapVisionAuroraPixel4705(context, "common_google_play_services_network_error_title");
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return PolarVoyageBitmapVisionAuroraPixel4705(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return PolarVoyageBitmapVisionAuroraPixel4705(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String PolarVoyageMotionLayoutTransitionHeroVision4068(Context context, int i) {
        Resources resources = context.getResources();
        String PolarVoyageZipVortexCelestial61852 = PolarVoyageZipVortexCelestial6185(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, PolarVoyageZipVortexCelestial61852);
        }
        if (i == 2) {
            return PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDisplayMetricsVortexDragon9516(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, PolarVoyageZipVortexCelestial61852);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, PolarVoyageZipVortexCelestial61852);
        }
        if (i == 5) {
            return PolarVoyageBarcodeScannerInfernoSolarSpark7767(context, "common_google_play_services_invalid_account_text", PolarVoyageZipVortexCelestial61852);
        }
        if (i == 7) {
            return PolarVoyageBarcodeScannerInfernoSolarSpark7767(context, "common_google_play_services_network_error_text", PolarVoyageZipVortexCelestial61852);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, PolarVoyageZipVortexCelestial61852);
        }
        if (i == 20) {
            return PolarVoyageBarcodeScannerInfernoSolarSpark7767(context, "common_google_play_services_restricted_profile_text", PolarVoyageZipVortexCelestial61852);
        }
        switch (i) {
            case 16:
                return PolarVoyageBarcodeScannerInfernoSolarSpark7767(context, "common_google_play_services_api_unavailable_text", PolarVoyageZipVortexCelestial61852);
            case 17:
                return PolarVoyageBarcodeScannerInfernoSolarSpark7767(context, "common_google_play_services_sign_in_failed_text", PolarVoyageZipVortexCelestial61852);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, PolarVoyageZipVortexCelestial61852);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, PolarVoyageZipVortexCelestial61852);
        }
    }

    public static String PolarVoyageZipVortexCelestial6185(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = PolarVoyageAnimationSetPhantomOlympianShadow8476.PolarVoyageZipVortexCelestial6185(context).PolarVoyageItemDecorationUltraDeltaEpic7485;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }
}
