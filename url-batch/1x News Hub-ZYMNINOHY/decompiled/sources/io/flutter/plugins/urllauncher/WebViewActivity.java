package io.flutter.plugins.urllauncher;

import E.AbstractC0005f;
import X1.g;
import X1.h;
import X1.j;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f9332e = 0;

    /* renamed from: c, reason: collision with root package name */
    public WebView f9335c;

    /* renamed from: a, reason: collision with root package name */
    public final g f9333a = new g(this);

    /* renamed from: b, reason: collision with root package name */
    public final h f9334b = new h();

    /* renamed from: d, reason: collision with root package name */
    public final IntentFilter f9336d = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f9335c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.EMPTY_MAP;
        } else {
            HashMap hashMap = new HashMap();
            for (String str : bundleExtra.keySet()) {
                hashMap.put(str, bundleExtra.getString(str));
            }
            map = hashMap;
        }
        this.f9335c.loadUrl(stringExtra, map);
        this.f9335c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f9335c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f9335c.setWebViewClient(this.f9334b);
        this.f9335c.getSettings().setSupportMultipleWindows(true);
        this.f9335c.setWebChromeClient(new j(this));
        IntentFilter intentFilter = this.f9336d;
        int i3 = Build.VERSION.SDK_INT;
        g gVar = this.f9333a;
        if (i3 >= 33) {
            AbstractC0005f.g(this, gVar, intentFilter);
        } else if (i3 >= 26) {
            AbstractC0005f.f(this, gVar, intentFilter);
        } else {
            registerReceiver(gVar, intentFilter, null, null);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f9333a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (i3 != 4 || !this.f9335c.canGoBack()) {
            return super.onKeyDown(i3, keyEvent);
        }
        this.f9335c.goBack();
        return true;
    }
}
