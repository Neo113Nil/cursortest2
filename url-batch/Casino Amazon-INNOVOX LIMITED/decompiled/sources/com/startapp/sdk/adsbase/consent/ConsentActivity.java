package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.uj;
import com.startapp.sdk.internal.w5;
import com.startapp.sdk.internal.x5;
import com.startapp.sdk.internal.zh;
import java.net.URI;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class ConsentActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private WebView f135a;
    private String b;
    private boolean c;

    @Override // android.app.Activity
    public final void onBackPressed() {
        WebView webView = this.f135a;
        if (webView == null) {
            this.c = true;
            super.onBackPressed();
            return;
        }
        String url = webView.getUrl();
        String str = this.b;
        if (str != null && url != null && url.contains(str)) {
            this.f135a.loadUrl("javascript:startappBackPressed();");
        } else if (this.f135a.canGoBack()) {
            this.f135a.goBack();
        } else {
            this.c = true;
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setFitsSystemWindows(true);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        String dataString = getIntent().getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            try {
                URI uri = new URI(dataString);
                this.b = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null).toString();
                WebView c = ((uj) com.startapp.sdk.components.a.a(this).f160a.a()).c();
                this.f135a = c;
                c.setWebViewClient(new a(this));
                this.f135a.getSettings().setJavaScriptEnabled(true);
                this.f135a.setHorizontalScrollBarEnabled(false);
                this.f135a.setVerticalScrollBarEnabled(false);
                this.f135a.getSettings().setTextZoom(100);
                this.f135a.loadUrl(dataString);
                this.f135a.setBackgroundColor(0);
                this.f135a.setLayerType(1, null);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                relativeLayout.addView(this.f135a, layoutParams2);
            } catch (Throwable th) {
                n8.a(th);
            }
        }
        setContentView(relativeLayout, layoutParams);
    }

    @Override // android.app.Activity
    protected final void onStop() {
        super.onStop();
        ConsentConfig q = MetaData.A().q();
        if (!this.c && q != null && q.k()) {
            WeakHashMap weakHashMap = zh.f528a;
            if (((w5) com.startapp.sdk.components.a.a(this).t.a()).b() && zh.c(this)) {
                n8 n8Var = new n8(o8.d);
                n8Var.d = "ConsentActivityHasBeenCovered";
                n8Var.a();
                finish();
                try {
                    startActivity(getIntent());
                } catch (Throwable th) {
                    n8.a(th);
                }
            }
        }
        x5 x5Var = (x5) com.startapp.sdk.components.a.a(this).i.a();
        x5Var.e = false;
        if (x5.a(4)) {
            n8 n8Var2 = new n8(o8.d);
            n8Var2.d = "CNS.closed";
            n8Var2.e = String.valueOf(System.currentTimeMillis());
            n8Var2.a();
        }
        Intent intent = x5Var.d;
        if (intent != null) {
            try {
                x5Var.f490a.startActivity(intent);
            } catch (Throwable th2) {
                if (x5.a(8)) {
                    n8.a(th2);
                }
            }
        }
    }
}
