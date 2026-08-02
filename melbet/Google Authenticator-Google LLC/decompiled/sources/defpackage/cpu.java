package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.authenticator2.R;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpu {
    private static final qy a = new qy(0);
    private static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Object obj = csr.b(context).a;
            return ((Context) obj).getPackageManager().getApplicationLabel(((Context) obj).getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a2);
        }
        if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, a2);
            }
            if (i == 4) {
                return resources.getString(R.string.common_google_play_services_signin_required_text, a2);
            }
            if (i == 5) {
                return d(context, "common_google_play_services_invalid_account_text", a2);
            }
            if (i == 7) {
                return d(context, "common_google_play_services_network_error_text", a2);
            }
            if (i == 9) {
                return resources.getString(R.string.common_google_play_services_unsupported_text, a2);
            }
            if (i == 20) {
                return d(context, "common_google_play_services_restricted_profile_text", a2);
            }
            if (i != 21) {
                switch (i) {
                    case 16:
                        return d(context, "common_google_play_services_api_unavailable_text", a2);
                    case 17:
                        return d(context, "common_google_play_services_sign_in_failed_text", a2);
                    case 18:
                        return resources.getString(R.string.common_google_play_services_updating_text, a2);
                    default:
                        return resources.getString(R.string.common_google_play_services_try_again_text, a2);
                }
            }
        }
        return csk.e(context) ? resources.getString(R.string.common_google_play_services_wear_update_text, a2) : resources.getString(R.string.common_google_play_services_update_text, a2);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
            case 21:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
                Log.e("GoogleApiAvailability", "Sign-in is required to use this API.");
                return resources.getString(R.string.common_google_play_services_signin_required_title);
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 6:
                Log.e("GoogleApiAvailability", "Google Play services requires resolution.");
                return e(context, "common_google_play_services_resolution_required_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(R.string.common_google_play_services_unsupported_title);
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            default:
                Log.e("GoogleApiAvailability", a.Y(i, "Unexpected error code "));
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 18:
                Log.e("GoogleApiAvailability", "Google Play services is updating.");
                return resources.getString(R.string.common_google_play_services_updating_client_title);
            case 19:
                Log.e("GoogleApiAvailability", "Google Play services is missing a required permission.");
                return e(context, "common_google_play_services_resolution_required_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e = e(context, str);
        if (e == null) {
            e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        qy qyVar = a;
        synchronized (qyVar) {
            Locale f = pk.g(context.getResources().getConfiguration()).f(0);
            if (!f.equals(b)) {
                qyVar.clear();
                b = f;
            }
            String str2 = (String) qyVar.get(str);
            if (str2 != null) {
                return str2;
            }
            boolean z = cmd.a;
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
                Log.w("GoogleApiAvailability", a.ah(str, "Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", a.ah(str, "Got empty resource: "));
                return null;
            }
            a.put(str, string);
            return string;
        }
    }
}
