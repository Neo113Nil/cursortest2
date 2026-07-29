package com.cmplay.base.util.webview.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.cmplay.base.util.h;
import com.cmplay.base.util.p;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {
    public static final String SET_LOG = "SET_PROMOTION_LOG";
    public static final String WEBVIEW_TYPE = "webview_type";
    public static final String WEBVIEW_URL = "webview_url";
    public static Context mContext = null;
    public static int mFeedbackAppId = 0;
    public static int mFeedbackProductId = 1;
    public static WeakReference<WebViewActivity> sWebViewActivity;
    private boolean mClickLogin = false;
    private WebViewLayout mLayout;
    private int mType;
    private String mUrl;

    public static void init(Context context, int i, int i2) {
        mContext = context.getApplicationContext();
        mFeedbackAppId = i;
        mFeedbackProductId = i2;
    }

    public static void StartWebViewActivity(Context context, String str, int i) {
        mContext = context.getApplicationContext();
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.setFlags(268435456);
        intent.putExtra(WEBVIEW_URL, str);
        intent.putExtra(WEBVIEW_TYPE, i);
        p.a(context, intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            boolean z = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getBoolean("SET_PROMOTION_LOG");
            Log.d("zzb_log", "isDebug =" + z);
            if (z) {
                h.a(true);
            }
        } catch (Exception e) {
            Log.d("zzb_log", "isDebug =" + e.getMessage());
            e.printStackTrace();
        }
        requestWindowFeature(1);
        parseIntent(getIntent());
        if (this.mType == 3) {
            getWindow().setFlags(2048, 2048);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        sWebViewActivity = new WeakReference<>(this);
        this.mLayout = new WebViewLayout(this, this.mUrl, this.mType);
        this.mLayout.closeBtn.setOnClickListener(new View.OnClickListener() { // from class: com.cmplay.base.util.webview.ui.WebViewActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WebViewActivity.this.onBackPressed();
            }
        });
        setRequestedOrientation(14);
        setContentView(this.mLayout);
    }

    private void parseIntent(Intent intent) {
        this.mUrl = intent.getStringExtra(WEBVIEW_URL);
        this.mType = intent.getIntExtra(WEBVIEW_TYPE, -1);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.mLayout != null) {
            this.mLayout.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        try {
            Class.forName("android.webkit.WebView").getMethod("onPause", (Class[]) null).invoke(this.mLayout.getWebView(), (Object[]) null);
            h.a("playable", "WebViewActivity.onPause()  切换到后台");
            this.mLayout.callbackPlayAbleMethon("onPause");
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            Class.forName("android.webkit.WebView").getMethod("onResume", (Class[]) null).invoke(this.mLayout.getWebView(), (Object[]) null);
            h.a("playable", "WebViewActivity.onResume()  切换到前台");
            this.mLayout.callbackPlayAbleMethon("onResume");
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        sWebViewActivity = null;
        if (this.mLayout != null) {
            this.mLayout.clearWebView();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.mClickLogin) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i == 4) {
            if (this.mLayout.getWebView() != null && this.mLayout.getWebView().canGoBack()) {
                this.mLayout.getWebView().goBack();
                return true;
            }
            finish();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public WebViewLayout getLayout() {
        return this.mLayout;
    }

    public void setClickLogin(boolean z) {
        this.mClickLogin = z;
    }

    public void hideCloseBtn() {
        if (this.mLayout != null) {
            this.mLayout.hideCloseBtn();
        }
    }

    public void showCloseBtn() {
        if (this.mLayout != null) {
            this.mLayout.showCloseBtn();
        }
    }

    public static WebViewActivity getWebViewActivityRef() {
        if (sWebViewActivity == null) {
            return null;
        }
        return sWebViewActivity.get();
    }
}
