package com.iab.omid.library.startio.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.firebase.messaging.Constants;
import com.iab.omid.library.startio.adsession.ErrorType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static h f37a = new h();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f38a;
        final /* synthetic */ String b;

        a(WebView webView, String str) {
            this.f38a = webView;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.c(this.f38a, this.b);
        }
    }

    private h() {
    }

    public static final h a() {
        return f37a;
    }

    public void a(WebView webView, String str) {
        a(webView, "finishSession", str);
    }

    public void a(WebView webView, String str, float f) {
        a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    public void a(WebView webView, String str, ErrorType errorType, String str2) {
        a(webView, Constants.IPC_BUNDLE_KEY_SEND_ERROR, errorType.toString(), str2, str);
    }

    public void a(WebView webView, String str, String str2) {
        a(webView, "setDeviceLockState", str2);
    }

    public void a(WebView webView, String str, String str2, JSONObject jSONObject) {
        a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject) {
        a(webView, "init", jSONObject, str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    void a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            com.iab.omid.library.startio.utils.d.c("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        a(sb, objArr);
        sb.append(")}");
        a(webView, sb);
    }

    void a(WebView webView, StringBuilder sb) {
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            c(webView, sb2);
        } else {
            handler.post(new a(webView, sb2));
        }
    }

    public void a(WebView webView, JSONObject jSONObject) {
        a(webView, "setLastActivity", jSONObject);
    }

    void a(StringBuilder sb, Object[] objArr) {
        String obj;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj2 : objArr) {
            if (obj2 == null) {
                obj = AbstractJsonLexerKt.NULL;
            } else {
                if (obj2 instanceof String) {
                    obj = obj2.toString();
                    if (!obj.startsWith("{")) {
                        sb.append('\"').append(obj).append('\"');
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

    public void b(WebView webView, String str) {
        a(webView, "publishImpressionEvent", str);
    }

    public void b(WebView webView, String str, String str2) {
        a(webView, "setNativeViewHierarchy", str2, str);
    }

    public void b(WebView webView, String str, JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject, str);
    }

    public void b(WebView webView, JSONObject jSONObject) {
        a(webView, "setSupportedAttestations", jSONObject);
    }

    public void c(WebView webView, String str, String str2) {
        a(webView, "setState", str2, str);
    }

    public boolean c(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    webView.loadUrl("javascript: " + str);
                    return true;
                }
            } catch (Exception e) {
                com.iab.omid.library.startio.utils.d.d("Unable to inject javascript: " + e.getMessage());
            }
        }
        return false;
    }

    public void d(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }
}
