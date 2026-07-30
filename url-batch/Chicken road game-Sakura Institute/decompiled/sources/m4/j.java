package m4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.android.installreferrer.R;
import i.g0;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f6374a = new g0(0);

    /* renamed from: b, reason: collision with root package name */
    public static Locale f6375b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = r4.b.a(context).f5920a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i7) {
        Resources resources = context.getResources();
        String a3 = a(context);
        if (i7 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a3);
        }
        if (i7 == 2) {
            return a8.m.C(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a3);
        }
        if (i7 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a3);
        }
        if (i7 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a3);
        }
        if (i7 == 7) {
            return d(context, "common_google_play_services_network_error_text", a3);
        }
        if (i7 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a3);
        }
        if (i7 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a3);
        }
        switch (i7) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a3);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a3);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a3);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a3);
        }
    }

    public static String c(Context context, int i7) {
        Resources resources = context.getResources();
        switch (i7) {
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
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case q.c.f7259c /* 9 */:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case q.c.f7261e /* 10 */:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case q.c.f7263g /* 15 */:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i7);
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
        String e9 = e(context, str);
        if (e9 == null) {
            e9 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e9, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        g0 g0Var = f6374a;
        synchronized (g0Var) {
            try {
                Locale locale = x2.c.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f6375b)) {
                    g0Var.clear();
                    f6375b = locale;
                }
                String str2 = (String) g0Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = j4.h.f5016a;
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
                            f6374a.put(str, string);
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
}
