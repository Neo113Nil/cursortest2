package com.onesignal.core.internal.http.impl;

import com.onesignal.common.OneSignalUtils;
import com.onesignal.core.BuildConfig;
import kotlin.Metadata;

/* compiled from: HttpClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"HTTP_SDK_VERSION_HEADER_KEY", "", "HTTP_SDK_VERSION_HEADER_VALUE", "getHTTP_SDK_VERSION_HEADER_VALUE", "()Ljava/lang/String;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpClientKt {
    public static final String HTTP_SDK_VERSION_HEADER_KEY = "SDK-Version";
    private static final String HTTP_SDK_VERSION_HEADER_VALUE = "onesignal/android/" + OneSignalUtils.INSTANCE.getSdkVersion();

    public static final String getHTTP_SDK_VERSION_HEADER_VALUE() {
        return HTTP_SDK_VERSION_HEADER_VALUE;
    }
}
