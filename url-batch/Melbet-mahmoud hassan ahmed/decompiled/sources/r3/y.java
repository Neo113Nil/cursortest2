package r3;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final h.e<String, String> f21339a = new h.e<>();

    /* renamed from: b, reason: collision with root package name */
    private static Locale f21340b;

    public static String a(Context context, int i7) {
        String str;
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(n3.b.f19612f);
            case 2:
                return resources.getString(n3.b.f19618l);
            case 3:
                return resources.getString(n3.b.f19609c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case c4.w0.f2149o /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case c4.w0.f2150p /* 8 */:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i7);
                str = sb.toString();
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    public static String b(Context context, int i7) {
        String i8 = i7 == 6 ? i(context, "common_google_play_services_resolution_required_title") : a(context, i7);
        return i8 == null ? context.getResources().getString(n3.b.f19614h) : i8;
    }

    public static String c(Context context, int i7) {
        Resources resources = context.getResources();
        String f7 = f(context);
        if (i7 == 1) {
            return resources.getString(n3.b.f19611e, f7);
        }
        if (i7 == 2) {
            return v3.h.g(context) ? resources.getString(n3.b.f19620n) : resources.getString(n3.b.f19617k, f7);
        }
        if (i7 == 3) {
            return resources.getString(n3.b.f19608b, f7);
        }
        if (i7 == 5) {
            return h(context, "common_google_play_services_invalid_account_text", f7);
        }
        if (i7 == 7) {
            return h(context, "common_google_play_services_network_error_text", f7);
        }
        if (i7 == 9) {
            return resources.getString(n3.b.f19615i, f7);
        }
        if (i7 == 20) {
            return h(context, "common_google_play_services_restricted_profile_text", f7);
        }
        switch (i7) {
            case 16:
                return h(context, "common_google_play_services_api_unavailable_text", f7);
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_text", f7);
            case 18:
                return resources.getString(n3.b.f19619m, f7);
            default:
                return resources.getString(o3.l.f19866a, f7);
        }
    }

    public static String d(Context context, int i7) {
        return (i7 == 6 || i7 == 19) ? h(context, "common_google_play_services_resolution_required_text", f(context)) : c(context, i7);
    }

    public static String e(Context context, int i7) {
        return context.getResources().getString(i7 != 1 ? i7 != 2 ? i7 != 3 ? R.string.ok : n3.b.f19607a : n3.b.f19616j : n3.b.f19610d);
    }

    public static String f(Context context) {
        String packageName = context.getPackageName();
        try {
            return w3.c.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String g(Context context) {
        return context.getResources().getString(n3.b.f19613g);
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i7 = i(context, str);
        if (i7 == null) {
            i7 = resources.getString(o3.l.f19866a);
        }
        return String.format(resources.getConfiguration().locale, i7, str2);
    }

    private static String i(Context context, String str) {
        h.e<String, String> eVar = f21339a;
        synchronized (eVar) {
            Locale c7 = p.b.a(context.getResources().getConfiguration()).c(0);
            if (!c7.equals(f21340b)) {
                eVar.clear();
                f21340b = c7;
            }
            String str2 = eVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources d7 = o3.i.d(context);
            if (d7 == null) {
                return null;
            }
            int identifier = d7.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = d7.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            eVar.put(str, string);
            return string;
        }
    }
}
