package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class Ue {

    /* renamed from: a, reason: collision with root package name */
    public static final SafePackageManager f38360a = new SafePackageManager();

    /* renamed from: b, reason: collision with root package name */
    public static final Pe f38361b = new Pe();

    /* renamed from: c, reason: collision with root package name */
    public static final Qe f38362c = new Qe();

    /* renamed from: d, reason: collision with root package name */
    public static final Re f38363d = new Re(2);

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        String script = locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            sb.append('-');
            sb.append(script);
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    public static Te a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        Te te = Te.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? !(activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected())) : activeNetwork == null) {
            return Te.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            for (Integer num : f38362c.f38555a.keySet()) {
                if (networkCapabilities.hasTransport(num.intValue())) {
                    return (Te) f38362c.a(num);
                }
            }
        }
        return te;
    }
}
