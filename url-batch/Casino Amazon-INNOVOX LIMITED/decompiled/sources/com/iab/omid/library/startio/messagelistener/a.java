package com.iab.omid.library.startio.messagelistener;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.iab.omid.library.startio.utils.d;
import com.iab.omid.library.startio.utils.g;
import com.iab.omid.library.startio.utils.i;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    private static final i c = new i();

    /* renamed from: a, reason: collision with root package name */
    private final WebView f42a;
    private final b b;

    /* renamed from: com.iab.omid.library.startio.messagelistener.a$a, reason: collision with other inner class name */
    class C0014a implements WebViewCompat.WebMessageListener {
        C0014a() {
        }

        @Override // androidx.webkit.WebViewCompat.WebMessageListener
        public void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
            a.this.a(webMessageCompat.getData());
        }
    }

    public a(WebView webView, b bVar) {
        g.a(webView, "WebView is null");
        this.f42a = webView;
        this.b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.b.onMessageReceived(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (JSONException e) {
            d.a("Error parsing JS message", e);
        }
    }

    public void a() {
        if (WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            try {
                b();
                c.a(this.f42a, this.b.getListenerName(), new HashSet(Arrays.asList(ProxyConfig.MATCH_ALL_SCHEMES)), new C0014a());
                return;
            } catch (Exception e) {
                d.a("Error adding WebView listener", e);
            }
        }
        this.b.onWebMessageListenerUnsupported();
    }

    public void b() {
        c.a(this.f42a, this.b.getListenerName());
    }
}
