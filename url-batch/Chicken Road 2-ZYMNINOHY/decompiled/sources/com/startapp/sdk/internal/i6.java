package com.startapp.sdk.internal;

import android.text.TextUtils;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class i6 {

    /* renamed from: a, reason: collision with root package name */
    public static CookieManager f7084a;

    public static void a(HttpURLConnection httpURLConnection, String str) {
        Map<String, List<String>> map;
        List<String> list;
        CookieManager cookieManager = f7084a;
        if (cookieManager == null || (map = cookieManager.get(URI.create(str), httpURLConnection.getRequestProperties())) == null || map.size() <= 0 || (list = map.get("Cookie")) == null || list.size() <= 0) {
            return;
        }
        httpURLConnection.addRequestProperty("Cookie", TextUtils.join("=", list));
    }
}
