package i3;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.ge;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class a {
    private static final String a(Context context) {
        if (!d(context, "android.permission.READ_PHONE_STATE", "android.permission.READ_BASIC_PHONE_STATE")) {
            return "CELLULAR";
        }
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        switch (((TelephonyManager) systemService).getDataNetworkType()) {
        }
        return "CELLULAR";
    }

    public static final String b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return c(context);
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    private static final String c(Context context) {
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        int i4 = Build.VERSION.SDK_INT;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return "NONE";
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities == null ? GrsBaseInfo.CountryCodeSource.UNKNOWN : networkCapabilities.hasTransport(1) ? "WIFI" : networkCapabilities.hasTransport(3) ? "ETHERNET" : networkCapabilities.hasTransport(2) ? "BLUETOOTH" : networkCapabilities.hasTransport(4) ? "VPN" : networkCapabilities.hasTransport(0) ? i4 < 30 ? "CELLULAR" : a(context) : GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    private static final boolean d(Context context, String... strArr) {
        for (String str : strArr) {
            if (context.checkSelfPermission(str) == 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str = Build.PRODUCT;
        return Intrinsics.areEqual(ge.f16386A1, str) || Intrinsics.areEqual("google_sdk", str) || string == null;
    }

    public static final boolean f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i4 = runningAppProcessInfo.importance;
        return i4 == 100 || i4 == 200;
    }

    public static final boolean g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean e4 = e(context);
        String str = Build.TAGS;
        if ((e4 || str == null || !StringsKt.P(str, "test-keys", false, 2, null)) && !new File("/system/app/Superuser.apk").exists()) {
            return !e4 && new File("/system/xbin/su").exists();
        }
        return true;
    }
}
