package H1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.attribution.RequestError;
import com.chicken.road.kedro.laqer.R;
import i.G;
import java.util.Locale;
import q.AbstractC1024c;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final G f3272a = new G(0);

    /* renamed from: b, reason: collision with root package name */
    public static Locale f3273b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = M1.c.a(context).f3573a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i2) {
        Resources resources = context.getResources();
        String a4 = a(context);
        if (i2 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a4);
        }
        if (i2 == 2) {
            return M1.a.J(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a4);
        }
        if (i2 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a4);
        }
        if (i2 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a4);
        }
        if (i2 == 7) {
            return d(context, "common_google_play_services_network_error_text", a4);
        }
        if (i2 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a4);
        }
        if (i2 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a4);
        }
        switch (i2) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a4);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a4);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a4);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a4);
        }
    }

    public static String c(Context context, int i2) {
        Resources resources = context.getResources();
        switch (i2) {
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
                return e(context, "common_google_play_services_invalid_account_title");
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case AbstractC1024c.f9242c /* 9 */:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case RequestError.STOP_TRACKING /* 11 */:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case AbstractC1024c.f9246g /* 15 */:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i2);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e4 = e(context, str);
        if (e4 == null) {
            e4 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e4, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        G g4 = f3272a;
        synchronized (g4) {
            try {
                Locale locale = X0.c.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f3273b)) {
                    g4.clear();
                    f3273b = locale;
                }
                String str2 = (String) g4.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i2 = E1.h.f2293c;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f3272a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
