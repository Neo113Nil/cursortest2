package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.f6;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.rk;
import com.startapp.sdk.internal.si;
import java.net.URI;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ConsentActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private WebView f6395a;

    /* renamed from: b, reason: collision with root package name */
    private String f6396b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6397c;

    @Override // android.app.Activity
    public final void onBackPressed() {
        WebView webView = this.f6395a;
        if (webView == null) {
            this.f6397c = true;
            super.onBackPressed();
            return;
        }
        String url = webView.getUrl();
        String str = this.f6396b;
        if (str != null && url != null && url.contains(str)) {
            this.f6395a.loadUrl("javascript:startappBackPressed();");
        } else if (this.f6395a.canGoBack()) {
            this.f6395a.goBack();
        } else {
            this.f6397c = true;
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setFitsSystemWindows(true);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        String dataString = getIntent().getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            try {
                URI uri = new URI(dataString);
                this.f6396b = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null).toString();
                WebView c4 = ((rk) com.startapp.sdk.components.a.a(this).f6561b.a()).c();
                this.f6395a = c4;
                c4.setWebViewClient(new a(this));
                this.f6395a.getSettings().setJavaScriptEnabled(true);
                this.f6395a.setHorizontalScrollBarEnabled(false);
                this.f6395a.setVerticalScrollBarEnabled(false);
                this.f6395a.getSettings().setTextZoom(100);
                this.f6395a.loadUrl(dataString);
                this.f6395a.setBackgroundColor(0);
                this.f6395a.setLayerType(1, null);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                relativeLayout.addView(this.f6395a, layoutParams2);
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        setContentView(relativeLayout, layoutParams);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        ConsentConfig r4 = MetaData.E().r();
        if (!this.f6397c && r4 != null && r4.k()) {
            WeakHashMap weakHashMap = si.f7575a;
            if (((f6) com.startapp.sdk.components.a.a(this).f6577t.a()).b() && si.c(this)) {
                d9 d9Var = new d9(e9.f6838d);
                d9Var.f6792d = "ConsentActivityHasBeenCovered";
                d9Var.a();
                finish();
                try {
                    startActivity(getIntent());
                } catch (Throwable th) {
                    d9.a(th);
                }
            }
        }
        g6 g6Var = (g6) com.startapp.sdk.components.a.a(this).f6569j.a();
        g6Var.f6976e = false;
        if (g6.a(4)) {
            d9 d9Var2 = new d9(e9.f6838d);
            d9Var2.f6792d = "CNS.closed";
            d9Var2.f6793e = String.valueOf(System.currentTimeMillis());
            d9Var2.a();
        }
        Intent intent = g6Var.f6975d;
        if (intent != null) {
            try {
                g6Var.f6972a.startActivity(intent);
            } catch (Throwable th2) {
                if (g6.a(8)) {
                    d9.a(th2);
                }
            }
        }
    }
}
