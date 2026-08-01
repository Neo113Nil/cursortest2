package com.bykv.vk.openvk.preload.falconx.a;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.google.common.net.HttpHeaders;
import io.ktor.http.auth.HttpAuthHeader;
import java.io.InputStream;
import java.util.Map;

/* compiled from: WebResourceUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static WebResourceResponse a(InputStream inputStream, Map<String, String> map) {
        if (inputStream == null) {
            return null;
        }
        try {
            String str = map.get("content-type");
            String[] strArr = new String[0];
            if (TextUtils.isEmpty(str)) {
                str = map.get(HttpHeaders.CONTENT_TYPE);
            }
            if (!TextUtils.isEmpty(str) && str != null) {
                str = str.replace(" ", "");
                strArr = str.split(";");
            }
            String str2 = "";
            String str3 = str2;
            for (String str4 : strArr) {
                if (!TextUtils.isEmpty(str4)) {
                    int indexOf = str4.indexOf("=");
                    if (indexOf == -1) {
                        str2 = str4;
                    } else if (str4.contains(HttpAuthHeader.Parameters.Charset)) {
                        str3 = str4.substring(indexOf + 1);
                    }
                }
            }
            if (str != null ? str.contains("font/ttf") : false) {
                return new WebResourceResponse(str2, str3, 200, "OK", map, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str2, str3, inputStream);
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (Throwable th) {
            Log.e("WebResourceUtils", "getResponseWithHeaders error", th);
            return null;
        }
    }
}
