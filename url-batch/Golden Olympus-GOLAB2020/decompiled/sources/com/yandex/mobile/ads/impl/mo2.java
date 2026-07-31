package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mo2 {
    private mo2() {
    }

    public static void a(WebView webView) {
        a(webView, "finishSession", new Object[0]);
    }

    public static void b(WebView webView) {
        a(webView, "publishImpressionEvent", new Object[0]);
    }

    public static void a(WebView webView, float f4) {
        a(webView, "setDeviceVolume", Float.valueOf(f4));
    }

    public static void b(WebView webView, @NonNull JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject);
    }

    public static void a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            a(webView, "publishMediaEvent", str);
        }
    }

    public static void b(WebView webView, String str) {
        a(webView, "setState", str);
    }

    public static void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    static void a(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        obj = "\"\"";
                    } else {
                        if (obj2 instanceof String) {
                            obj = obj2.toString();
                            if (!obj.startsWith("{")) {
                                sb.append('\"');
                                sb.append(obj);
                                sb.append('\"');
                            }
                        } else {
                            sb.append(obj2);
                        }
                        sb.append(StringUtils.COMMA);
                    }
                    sb.append(obj);
                    sb.append(StringUtils.COMMA);
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
            } else {
                handler.post(new lo2(webView, sb2));
            }
        }
    }

    public static void a(WebView webView, JSONObject jSONObject) {
        a(webView, b9.a.f15292f, jSONObject);
    }

    public static void a(WebView webView, String str) {
        a(webView, "setNativeViewHierarchy", str);
    }
}
