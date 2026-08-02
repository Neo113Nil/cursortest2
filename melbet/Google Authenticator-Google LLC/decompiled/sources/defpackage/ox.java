package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.android.apps.authenticator2.R;
import com.google.android.gms.common.api.Status;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ox {
    public ox() {
    }

    static int a(BiometricManager biometricManager, int i) {
        int canAuthenticate;
        canAuthenticate = biometricManager.canAuthenticate(i);
        return canAuthenticate;
    }

    public static String d(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", a.Y(i, "Unknown error code: "));
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static boolean e(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return f(context, str, R.array.hide_fingerprint_instantly_prefixes);
    }

    public static Intent i(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String k = k(activity);
        if (k == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, k);
        try {
            return l(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", a.Z(k, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
            return null;
        }
    }

    public static Intent j(Context context, ComponentName componentName) {
        String l = l(context, componentName);
        if (l == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), l);
        return l(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String k(Activity activity) {
        try {
            return l(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String l(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        return string.charAt(0) == '.' ? String.valueOf(context.getPackageName()).concat(string) : string;
    }

    public static int m(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    public static int n(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static cmm o(Status status) {
        return status.h != null ? new cnb(status) : new cmm(status);
    }

    public static cop p(Object obj, String str) {
        oy.au(obj, "Listener must not be null");
        oy.au(str, "Listener type must not be null");
        oy.as(str, "Listener type must not be empty");
        return new cop(obj, str);
    }

    public static void q(Status status, bst bstVar, cmn cmnVar) {
        if (cmnVar != null) {
            dih dihVar = cwz.a;
        }
        r(status, null, bstVar);
    }

    public static void r(Status status, Object obj, bst bstVar) {
        if (status.c()) {
            bstVar.c(obj);
        } else {
            bstVar.b(o(status));
        }
    }

    public static void s(Status status, Object obj, bst bstVar, cmn cmnVar) {
        if (cmnVar != null) {
            dih dihVar = cwz.a;
        }
        r(status, obj, bstVar);
    }

    public static void t(Status status, Object obj, bst bstVar, cmn cmnVar) {
        if (cmnVar != null) {
            dih dihVar = cwz.a;
        }
        u(status, obj, bstVar);
    }

    public static void u(Status status, Object obj, bst bstVar) {
        if (status.c()) {
            bstVar.e(obj);
        } else {
            bstVar.d(o(status));
        }
    }

    public static cme v(Object obj, Looper looper, String str) {
        oy.au(obj, "Listener must not be null");
        oy.au(looper, "Looper must not be null");
        oy.au(str, "Listener type must not be null");
        return new cme(looper, obj, str);
    }

    public static String w(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                return a.Y(i, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return "ERROR";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
            case 23:
                return "RATE_LIMIT_EXCEEDED";
        }
    }

    public static cmn x(cmp cmpVar, boolean z, boolean z2) {
        cmn cmnVar = new cmn(cmpVar, z);
        cmnVar.d = z2;
        return cmnVar;
    }

    @Deprecated
    public cml y(Context context, Looper looper, cpr cprVar, Object obj, cmt cmtVar, cmu cmuVar) {
        return z(context, looper, cprVar, obj, cmtVar, cmuVar);
    }

    public cml z(Context context, Looper looper, cpr cprVar, Object obj, cnx cnxVar, cot cotVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public ox(byte[] bArr) {
    }

    public void c() {
    }

    public void h(bsh bshVar) {
    }

    public void b(int i, CharSequence charSequence) {
    }
}
