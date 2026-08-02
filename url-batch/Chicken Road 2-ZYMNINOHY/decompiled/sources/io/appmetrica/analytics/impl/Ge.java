package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class Ge {

    /* renamed from: a, reason: collision with root package name */
    public static final Ce f10317a;

    /* renamed from: b, reason: collision with root package name */
    public static final De f10318b;

    /* renamed from: c, reason: collision with root package name */
    public static final Ee f10319c;

    static {
        NetworkType networkType = NetworkType.UNDEFINED;
        f10317a = new Ce(networkType);
        f10318b = new De(networkType);
        f10319c = new Ee(2);
    }

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

    public static NetworkType a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        NetworkType networkType = NetworkType.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? !(activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected())) : activeNetwork == null) {
            return NetworkType.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            for (Integer num : f10318b.f10195a.keySet()) {
                if (networkCapabilities.hasTransport(num.intValue())) {
                    return (NetworkType) f10318b.a(num);
                }
            }
        }
        return networkType;
    }
}
