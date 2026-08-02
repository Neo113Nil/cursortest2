package d2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.rockchicken.pump.up.road.R;
import i2.AbstractC0457a;
import i2.C0458b;
import io.appmetrica.analytics.impl.C0583e9;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final p.j f8277a = new p.j(0);

    /* renamed from: b, reason: collision with root package name */
    public static Locale f8278b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C0458b.a(context).f1648a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i4) {
        Resources resources = context.getResources();
        String a3 = a(context);
        if (i4 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a3);
        }
        if (i4 == 2) {
            return AbstractC0457a.v(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a3);
        }
        if (i4 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a3);
        }
        if (i4 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a3);
        }
        if (i4 == 7) {
            return d(context, "common_google_play_services_network_error_text", a3);
        }
        if (i4 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a3);
        }
        if (i4 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a3);
        }
        switch (i4) {
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

    public static String c(Context context, int i4) {
        Resources resources = context.getResources();
        switch (i4) {
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
            case C0583e9.f11743C /* 19 */:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i4);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case C0583e9.f11744D /* 20 */:
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
        p.j jVar = f8277a;
        synchronized (jVar) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(f8278b)) {
                    jVar.clear();
                    f8278b = locale;
                }
                String str2 = (String) jVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = a2.h.f4278a;
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
                            f8277a.put(str, string);
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
