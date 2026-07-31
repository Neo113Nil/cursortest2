package O0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1171a = {1, 6, 7, 9};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1172b = {0, 2, 3, 4, 5};

    /* renamed from: c, reason: collision with root package name */
    private static final Map f1173c = new a();

    static class a extends HashMap {
        a() {
            put(1, "2G");
            put(2, "2G");
            put(4, "2G");
            put(7, "2G");
            put(11, "2G");
            put(3, "3G");
            put(8, "3G");
            put(9, "3G");
            put(10, "3G");
            put(15, "3G");
            put(5, "3G");
            put(6, "3G");
            put(12, "3G");
            put(14, "3G");
            put(13, "4G");
            if (Build.VERSION.SDK_INT >= 29) {
                put(20, "5G");
            }
        }
    }

    private static NetworkInfo a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th) {
            j0.e("hmsSdk", "cannot get network state, ensure permission android.permission.ACCESS_NETWORK_STATE in the manifest: " + th.getMessage());
            return null;
        }
    }

    private static String b(int i4) {
        Map map = f1173c;
        String str = map.containsKey(Integer.valueOf(i4)) ? (String) map.get(Integer.valueOf(i4)) : "unknown";
        return "unknown".equals(str) ? i4 != 16 ? i4 != 17 ? "unknown" : "3G" : "2G" : str;
    }

    private static boolean c(NetworkInfo networkInfo) {
        return (networkInfo == null || Arrays.binarySearch(f1172b, networkInfo.getType()) == -1) ? false : true;
    }

    public static String d(Context context) {
        NetworkInfo a4;
        if (context == null) {
            return "unknown";
        }
        try {
            a4 = a(context);
        } catch (Throwable unused) {
        }
        if (!e(a4)) {
            return "none";
        }
        if (f(a4)) {
            return "WIFI";
        }
        if (c(a4)) {
            return b(a4.getSubtype());
        }
        return "unknown";
    }

    private static boolean e(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected();
    }

    private static boolean f(NetworkInfo networkInfo) {
        return (networkInfo == null || Arrays.binarySearch(f1171a, networkInfo.getType()) == -1) ? false : true;
    }
}
