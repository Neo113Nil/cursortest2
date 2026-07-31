package U0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.strategylink.Row.Five.R;
import java.util.Locale;
import q.C0591k;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0591k f2550a = new C0591k();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f2551b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = a1.b.a(context).f345a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i7) {
        Resources resources = context.getResources();
        String a7 = a(context);
        if (i7 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a7);
        }
        if (i7 == 2) {
            return Y0.b.c(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a7);
        }
        if (i7 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a7);
        }
        if (i7 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a7);
        }
        if (i7 == 7) {
            return d(context, "common_google_play_services_network_error_text", a7);
        }
        if (i7 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a7);
        }
        if (i7 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a7);
        }
        switch (i7) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a7);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a7);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a7);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a7);
        }
    }

    public static String c(Context context, int i7) {
        Resources resources = context.getResources();
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return resources.getString(R.string.common_google_play_services_install_title);
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
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
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i7);
                Log.e("GoogleApiAvailability", sb.toString());
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
        C0591k c0591k = f2550a;
        synchronized (c0591k) {
            try {
                Locale locale = z.b.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f2551b)) {
                    c0591k.clear();
                    f2551b = locale;
                }
                String str2 = (String) c0591k.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                int i7 = R0.f.f2067c;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f2550a.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
