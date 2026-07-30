package io.flutter.plugins.urllauncher;

import N0.d;
import a.AbstractC0169a;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import z4.g;
import z4.i;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f5782m = 0;

    /* renamed from: i, reason: collision with root package name */
    public WebView f5785i;

    /* renamed from: d, reason: collision with root package name */
    public final d f5783d = new d(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final g f5784e = new g();

    /* renamed from: l, reason: collision with root package name */
    public final IntentFilter f5786l = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f5785i = webView;
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
        this.f5785i.loadUrl(stringExtra, map);
        this.f5785i.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f5785i.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f5785i.setWebViewClient(this.f5784e);
        this.f5785i.getSettings().setSupportMultipleWindows(true);
        this.f5785i.setWebChromeClient(new i(this));
        AbstractC0169a.A(this, this.f5783d, this.f5786l);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f5783d);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !this.f5785i.canGoBack()) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.f5785i.goBack();
        return true;
    }
}
