package t1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.attribution.RequestError;
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.util.Locale;
import u.C0939j;
import x1.AbstractC1000b;
import z1.C1054b;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final C0939j f7972a = new C0939j(0);

    /* renamed from: b, reason: collision with root package name */
    public static Locale f7973b;

    public static String a(Context context, int i2) {
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
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
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
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i2);
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

    public static String b(Context context, int i2) {
        Resources resources = context.getResources();
        String c7 = c(context);
        if (i2 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, c7);
        }
        if (i2 == 2) {
            return AbstractC1000b.c(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, c7);
        }
        if (i2 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, c7);
        }
        if (i2 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", c7);
        }
        if (i2 == 7) {
            return d(context, "common_google_play_services_network_error_text", c7);
        }
        if (i2 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, c7);
        }
        if (i2 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", c7);
        }
        switch (i2) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", c7);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", c7);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, c7);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, c7);
        }
    }

    public static String c(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C1054b.a(context).f3070a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e7 = e(context, str);
        if (e7 == null) {
            e7 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e7, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        C0939j c0939j = f7972a;
        synchronized (c0939j) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(f7973b)) {
                    c0939j.clear();
                    f7973b = locale;
                }
                String str2 = (String) c0939j.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i2 = q1.g.f7329c;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(str.length() + 18);
                        sb.append("Missing resource: ");
                        sb.append(str);
                        Log.w("GoogleApiAvailability", sb.toString());
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            c0939j.put(str, string);
                            return string;
                        }
                        StringBuilder sb2 = new StringBuilder(str.length() + 20);
                        sb2.append("Got empty resource: ");
                        sb2.append(str);
                        Log.w("GoogleApiAvailability", sb2.toString());
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
