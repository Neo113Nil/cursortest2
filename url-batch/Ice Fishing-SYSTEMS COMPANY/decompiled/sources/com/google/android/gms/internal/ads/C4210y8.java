package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.y8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4210y8 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC3771q0 f35323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4048v8 f35324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f35325c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f35326d;

    public /* synthetic */ C4210y8(RunnableC3771q0 runnableC3771q0, C4048v8 c4048v8, WebView webView, boolean z8) {
        this.f35323a = runnableC3771q0;
        this.f35324b = c4048v8;
        this.f35325c = webView;
        this.f35326d = z8;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        C4264z8 c4264z8 = (C4264z8) this.f35323a.f33561w;
        C4048v8 c4048v8 = this.f35324b;
        WebView webView = this.f35325c;
        String str = (String) obj;
        boolean z8 = this.f35326d;
        c4264z8.getClass();
        synchronized (c4048v8.f34723g) {
            c4048v8.f34728m--;
        }
        try {
            boolean z9 = true;
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(com.anythink.basead.exoplayer.k.o.f8603c);
                if (c4264z8.f35487G || TextUtils.isEmpty(webView.getTitle())) {
                    c4048v8.a(optString, z8, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    c4048v8.a(sb.toString(), z8, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (c4048v8.f34723g) {
                if (c4048v8.f34728m != 0) {
                    z9 = false;
                }
            }
            if (z9) {
                c4264z8.f35492w.m(c4048v8);
            }
        } catch (JSONException unused) {
            int i = t2.C.f40822b;
            u2.i.a("Json string may be malformed.");
        } catch (Throwable th) {
            int i4 = t2.C.f40822b;
            u2.i.b("Failed to get webview content.", th);
            p2.j.f39798C.f39808h.d("ContentFetchTask.processWebViewContent", th);
        }
    }
}
