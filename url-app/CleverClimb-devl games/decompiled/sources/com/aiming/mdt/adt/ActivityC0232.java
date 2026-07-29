package com.aiming.mdt.adt;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.C0107;
import com.aiming.mdt.adt.bean.AdBean;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;
import com.aiming.mdt.utils.webview.C0265;
import com.aiming.mdt.utils.webview.ViewOnAttachStateChangeListenerC0269;
import com.facebook.ads.AudienceNetworkActivity;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.SoftReference;

/* renamed from: com.aiming.mdt.adt.ʻʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class ActivityC0232 extends Activity {
    protected AdBean mAdBean;
    protected SoftReference<InterfaceC0231> mAdListener;
    protected C0265 mAdView;
    protected RelativeLayout mLytAd;
    protected String mPlacementId;

    /* renamed from: com.aiming.mdt.adt.ʻʽ$ʽ, reason: contains not printable characters */
    public class C0233 extends WebViewClient {
        protected C0233() {
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebResourceResponse m386 = C0107.m386(webView, str);
            if (m386 == null) {
                StringBuilder sb = new StringBuilder("response null:");
                sb.append(str);
                C0282.m971(sb.toString());
            }
            return m386 == null ? super.shouldInterceptRequest(webView, str) : m386;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!C0226.m825(str)) {
                webView.loadUrl(str);
                return true;
            }
            C0226.m824(webView.getContext().getApplicationContext(), str);
            ActivityC0232.this.callbackAdCloseOnUIThread();
            ActivityC0232.this.finish();
            return true;
        }
    }

    protected void callbackAdClickOnUIThread() {
        if (this.mAdListener == null || this.mAdListener.get() == null) {
            return;
        }
        C0285.m979(new RunnableC0229(this));
    }

    protected void callbackAdCloseOnUIThread() {
        C0285.m979(new RunnableC0237(this));
    }

    protected void callbackAdErrorOnUIThread(String str) {
        if (this.mAdListener == null || this.mAdListener.get() == null) {
            return;
        }
        C0285.m979(new RunnableC0235(this, str));
    }

    protected void callbackWhenClose() {
    }

    protected void initViewAndLoad(String str) {
        this.mAdView = ViewOnAttachStateChangeListenerC0269.m920().m923();
        if (this.mAdView.getParent() != null) {
            ((ViewGroup) this.mAdView.getParent()).removeView(this.mAdView);
        }
        this.mLytAd.addView(this.mAdView, new RelativeLayout.LayoutParams(-1, -1));
        this.mAdView.setWebViewClient(new C0233());
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.mLytAd = new RelativeLayout(this);
            setContentView(this.mLytAd);
            this.mPlacementId = getIntent().getStringExtra(AudienceNetworkActivity.PLACEMENT_ID);
            this.mAdListener = new SoftReference<>(C0234.m847(this.mPlacementId));
            Bundle bundleExtra = getIntent().getBundleExtra(TJAdUnitConstants.String.BUNDLE);
            if (bundleExtra == null) {
                callbackAdErrorOnUIThread("resource empty");
                finish();
                return;
            }
            bundleExtra.setClassLoader(AdBean.class.getClassLoader());
            this.mAdBean = (AdBean) bundleExtra.getParcelable("ad");
            if (this.mAdBean != null && this.mAdBean.getResources() != null) {
                String str = this.mAdBean.getResources().get(0);
                if (!TextUtils.isEmpty(str)) {
                    initViewAndLoad(str);
                    return;
                } else {
                    callbackAdErrorOnUIThread("resource empty");
                    finish();
                    return;
                }
            }
            callbackAdErrorOnUIThread("resource empty");
            finish();
        } catch (Throwable th) {
            C0282.m972("BaseActivity", th);
            C0076.m232().m236(th);
            callbackAdErrorOnUIThread(th.getMessage());
            finish();
        }
    }
}
