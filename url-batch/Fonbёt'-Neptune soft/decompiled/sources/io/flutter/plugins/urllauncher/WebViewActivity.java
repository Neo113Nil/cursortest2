package io.flutter.plugins.urllauncher;

import C0.h;
import C0.i;
import C0.k;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r.b;
import r.d;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f2698i = 0;

    /* renamed from: g, reason: collision with root package name */
    public WebView f2701g;

    /* renamed from: e, reason: collision with root package name */
    public final h f2699e = new h(this);

    /* renamed from: f, reason: collision with root package name */
    public final i f2700f = new i();

    /* renamed from: h, reason: collision with root package name */
    public final IntentFilter f2702h = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f2701g = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.emptyMap();
        } else {
            HashMap hashMap = new HashMap();
            for (String str : bundleExtra.keySet()) {
                hashMap.put(str, bundleExtra.getString(str));
            }
            map = hashMap;
        }
        this.f2701g.loadUrl(stringExtra, map);
        this.f2701g.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f2701g.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f2701g.setWebViewClient(this.f2700f);
        this.f2701g.getSettings().setSupportMultipleWindows(true);
        this.f2701g.setWebChromeClient(new k(this));
        IntentFilter intentFilter = this.f2702h;
        int i2 = Build.VERSION.SDK_INT;
        BroadcastReceiver broadcastReceiver = this.f2699e;
        if (i2 >= 33) {
            d.a(this, broadcastReceiver, intentFilter, null, null, 2);
        } else if (i2 >= 26) {
            b.a(this, broadcastReceiver, intentFilter, null, null, 2);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f2699e);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !this.f2701g.canGoBack()) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.f2701g.goBack();
        return true;
    }
}
