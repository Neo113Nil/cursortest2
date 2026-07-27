package o1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.chickyneer.roadway.R;
import io.appmetrica.analytics.impl.C0793l9;
import java.util.Locale;
import r.C1401k;
import u1.C1478b;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final C1401k f11571a = new C1401k();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f11572b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) C1478b.a(context).f3053a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i2) {
        Resources resources = context.getResources();
        String a6 = a(context);
        if (i2 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a6);
        }
        if (i2 == 2) {
            return s1.b.c(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a6);
        }
        if (i2 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a6);
        }
        if (i2 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a6);
        }
        if (i2 == 7) {
            return d(context, "common_google_play_services_network_error_text", a6);
        }
        if (i2 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a6);
        }
        if (i2 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a6);
        }
        switch (i2) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a6);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a6);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a6);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a6);
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
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
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
            case C0793l9.f8681C /* 19 */:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i2);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case C0793l9.f8682D /* 20 */:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e3 = e(context, str);
        if (e3 == null) {
            e3 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e3, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        C1401k c1401k = f11571a;
        synchronized (c1401k) {
            try {
                Locale locale = A.b.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f11572b)) {
                    c1401k.clear();
                    f11572b = locale;
                }
                String str2 = (String) c1401k.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                int i2 = l1.i.f11015c;
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
                f11571a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
