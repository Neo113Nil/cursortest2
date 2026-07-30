package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.ice.fishing.grenza.R;
import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class zv2 {
    public static final t52 PxuCJdSBwIXG = new t52(0);
    public static Locale lS5Rgt96tfkO;

    public static String PxuCJdSBwIXG(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = dv2.PxuCJdSBwIXG(context).PxuCJdSBwIXG;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String TSizfFm2Yiuu(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e9gEMXR7LXtO(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e9gEMXR7LXtO(context, "common_google_play_services_network_error_title");
            case 8:
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
                return e9gEMXR7LXtO(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e9gEMXR7LXtO(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String Y1f8riQaR6yg(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e9gEMXR7LXtO = e9gEMXR7LXtO(context, str);
        if (e9gEMXR7LXtO == null) {
            e9gEMXR7LXtO = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e9gEMXR7LXtO, str2);
    }

    public static String e9gEMXR7LXtO(Context context, String str) {
        Resources resources;
        t52 t52Var = PxuCJdSBwIXG;
        synchronized (t52Var) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(lS5Rgt96tfkO)) {
                    t52Var.clear();
                    lS5Rgt96tfkO = locale;
                }
                String str2 = (String) t52Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = hh0.TSizfFm2Yiuu;
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
                            PxuCJdSBwIXG.put(str, string);
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

    public static String lS5Rgt96tfkO(Context context, int i) {
        Resources resources = context.getResources();
        String PxuCJdSBwIXG2 = PxuCJdSBwIXG(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, PxuCJdSBwIXG2);
        }
        if (i == 2) {
            return fx1.bEKsvqmvPh2y(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, PxuCJdSBwIXG2);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, PxuCJdSBwIXG2);
        }
        if (i == 5) {
            return Y1f8riQaR6yg(context, "common_google_play_services_invalid_account_text", PxuCJdSBwIXG2);
        }
        if (i == 7) {
            return Y1f8riQaR6yg(context, "common_google_play_services_network_error_text", PxuCJdSBwIXG2);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, PxuCJdSBwIXG2);
        }
        if (i == 20) {
            return Y1f8riQaR6yg(context, "common_google_play_services_restricted_profile_text", PxuCJdSBwIXG2);
        }
        switch (i) {
            case 16:
                return Y1f8riQaR6yg(context, "common_google_play_services_api_unavailable_text", PxuCJdSBwIXG2);
            case 17:
                return Y1f8riQaR6yg(context, "common_google_play_services_sign_in_failed_text", PxuCJdSBwIXG2);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, PxuCJdSBwIXG2);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, PxuCJdSBwIXG2);
        }
    }
}
