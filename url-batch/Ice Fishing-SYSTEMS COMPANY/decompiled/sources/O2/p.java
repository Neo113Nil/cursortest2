package O2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final s.k f2452a = new s.k();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f2453b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = U2.c.a(context).f3280n;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String a9 = a(context);
        if (i == 1) {
            return resources.getString(C5284R.string.common_google_play_services_install_text, a9);
        }
        if (i == 2) {
            return S2.b.i(context) ? resources.getString(C5284R.string.common_google_play_services_wear_update_text) : resources.getString(C5284R.string.common_google_play_services_update_text, a9);
        }
        if (i == 3) {
            return resources.getString(C5284R.string.common_google_play_services_enable_text, a9);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a9);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", a9);
        }
        if (i == 9) {
            return resources.getString(C5284R.string.common_google_play_services_unsupported_text, a9);
        }
        if (i == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a9);
        }
        switch (i) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a9);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a9);
            case 18:
                return resources.getString(C5284R.string.common_google_play_services_updating_text, a9);
            default:
                return resources.getString(C5284R.string.common_google_play_services_unknown_issue, a9);
        }
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C5284R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C5284R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C5284R.string.common_google_play_services_enable_title);
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
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
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
        String e6 = e(context, str);
        if (e6 == null) {
            e6 = resources.getString(C5284R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e6, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        s.k kVar = f2452a;
        synchronized (kVar) {
            try {
                Locale locale = K.g.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f2453b)) {
                    kVar.clear();
                    f2453b = locale;
                }
                String str2 = (String) kVar.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = L2.h.f1727a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, com.anythink.expressad.foundation.h.k.f19794g, "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f2452a.put(str, string);
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
