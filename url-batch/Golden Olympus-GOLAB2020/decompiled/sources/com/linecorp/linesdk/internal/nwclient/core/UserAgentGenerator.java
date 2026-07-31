package com.linecorp.linesdk.internal.nwclient.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Locale;

/* loaded from: classes2.dex */
class UserAgentGenerator {
    private static final String DEFAULT_PACKAGE_NAME = "UNK";
    private static final String DEFAULT_VERSION_NAME = "UNK";
    private String cachedUserAgent;
    private final PackageInfo packageInfo;

    @NonNull
    private final String sdkVersion;

    UserAgentGenerator(@NonNull Context context, @NonNull String str) {
        this.packageInfo = getPackageInfo(context);
        this.sdkVersion = str;
    }

    private static PackageInfo getPackageInfo(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
        } catch (PackageManager.NameNotFoundException unused) {
            throw null;
        }
    }

    @NonNull
    public String getUserAgent() {
        String str = this.cachedUserAgent;
        if (str != null) {
            return str;
        }
        PackageInfo packageInfo = this.packageInfo;
        String str2 = packageInfo == null ? "UNK" : packageInfo.packageName;
        String str3 = packageInfo != null ? packageInfo.versionName : "UNK";
        Locale locale = Locale.getDefault();
        String str4 = str2 + "/" + str3 + " ChannelSDK/" + this.sdkVersion + " (Linux; U; Android " + Build.VERSION.RELEASE + "; " + locale.getLanguage() + "-" + locale.getCountry() + "; " + Build.MODEL + " Build/" + Build.ID + ")";
        this.cachedUserAgent = str4;
        return str4;
    }
}
