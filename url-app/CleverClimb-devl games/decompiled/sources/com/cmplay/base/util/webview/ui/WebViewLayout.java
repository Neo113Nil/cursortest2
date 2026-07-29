package com.cmplay.base.util.webview.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.cmplay.base.util.R;
import com.cmplay.base.util.h;
import com.cmplay.base.util.webview.callback.JsActivityCallBack;
import com.cmplay.base.util.webview.util.FileUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public class WebViewLayout extends RelativeLayout implements JsActivityCallBack {
    public static final String FEEDBACK_URL = "http://board.cmcm.com/feedback/feedback.html?v=a";
    public static final String HALLOWEEN_URL = "http://board.cmcm.com/dttwt2/christmas.html";
    public static final int TYPE_ACTIVITY = 1;
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_FEEDBACK = 2;
    public static final int TYPE_NO_FULLCREEEN = 3;
    public static final int WEB_STYLE_FULL_SCREEN = 1;
    public static final int WEB_STYLE_NOT_FULL_SCREEN = 2;
    private static String mGetUnLockStateMethonName;
    private static String mLoginMethonName;
    private static String mPlayAbleMethonName;
    private static String mSelectPictureMethonName;
    private static String mShareMethonName;
    private static String mUnLockMethonName;
    public ImageView closeBtn;
    private Activity mActivity;
    private PaxWebChromeClient mChromeClient;
    private boolean mIsError;
    private String[] mNeedReplaceUrl;
    private MsgBoxNetworkStateViewFlipper mNetworkStateVF;
    private String mPreLoadPath;
    private int mType;
    private String mUrl;
    private WebJsInterface mWebJsInterface;
    public WebViewEx mWebView;
    public WebViewLayout sWebViewLayout;

    public WebViewLayout(Context context, String str, int i) {
        super(context);
        this.mType = -1;
        this.mUrl = str;
        this.mType = i;
        init(context);
    }

    public WebViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mType = -1;
        init(context);
    }

    public WebViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mType = -1;
        init(context);
    }

    private void init(Context context) {
        this.mActivity = (Activity) context;
        this.sWebViewLayout = this;
        int i = this.mType;
        if (i != 2) {
            switch (i) {
                case -1:
                    this.mActivity.finish();
                    break;
            }
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.com_cmplay_function_web_layout, this);
        this.closeBtn = (ImageView) findViewById(R.id.close_btn);
        this.mNetworkStateVF = (MsgBoxNetworkStateViewFlipper) findViewById(R.id.viewflipper_layout);
        this.mNetworkStateVF.setRequestLoadCB(new IRequestLoad() { // from class: com.cmplay.base.util.webview.ui.WebViewLayout.1
            @Override // com.cmplay.base.util.webview.ui.IRequestLoad
            public void load() {
                WebViewLayout.this.loadWebView();
            }
        });
        this.mWebView = (WebViewEx) findViewById(R.id.webview);
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.getSettings().setDefaultTextEncodingName("UTF-8");
        this.mWebView.getSettings().setUseWideViewPort(true);
        this.mWebView.getSettings().setLoadWithOverviewMode(true);
        this.mWebView.getSettings().setDomStorageEnabled(true);
        this.mWebView.getSettings().setBuiltInZoomControls(false);
        this.mWebView.getSettings().setTextSize(WebSettings.TextSize.NORMAL);
        this.mWebView.getSettings().setDefaultFixedFontSize(16);
        this.mWebView.getSettings().setDefaultFontSize(16);
        this.mWebView.setBackgroundColor(0);
        this.mWebView.clearCache(false);
        this.mWebJsInterface = new WebJsInterface(this.mActivity, this);
        this.mWebView.addJavascriptInterface(this.mWebJsInterface, "cmplay");
        if (Build.VERSION.SDK_INT >= 11) {
            this.mWebView.getSettings().setDisplayZoomControls(false);
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.cmplay.base.util.webview.ui.WebViewLayout.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
        this.mChromeClient = new PaxWebChromeClient(this.mActivity);
        this.mWebView.setWebChromeClient(this.mChromeClient);
        this.mWebView.setWebViewClient(new WebViewClient() { // from class: com.cmplay.base.util.webview.ui.WebViewLayout.3
            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i2, String str, String str2) {
                super.onReceivedError(webView, i2, str, str2);
                WebViewLayout.this.showNetErrorMode();
                WebViewLayout.this.mIsError = true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (WebViewLayout.this.mIsError) {
                    return;
                }
                WebViewLayout.this.showDataMode();
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    parseUri.addCategory("android.intent.category.BROWSABLE");
                    parseUri.setComponent(null);
                    if ("android.intent.action.VIEW".equals(parseUri.getAction()) && (str.startsWith("http://") || str.startsWith("https://"))) {
                        return false;
                    }
                    try {
                        if (WebViewLayout.this.mActivity.startActivityIfNeeded(parseUri, -1)) {
                            return true;
                        }
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                    } catch (SecurityException e2) {
                        e2.printStackTrace();
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                } catch (URISyntaxException e3) {
                    e3.printStackTrace();
                    return false;
                }
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                WebResourceResponse webResourceResponse = null;
                if (WebViewLayout.this.mNeedReplaceUrl == null || WebViewLayout.this.mNeedReplaceUrl.length < 1) {
                    return null;
                }
                for (int i2 = 0; i2 < WebViewLayout.this.mNeedReplaceUrl.length; i2++) {
                    if (str.equals(WebViewLayout.this.mNeedReplaceUrl[i2]) && FileUtil.isExistsUrlFile(WebViewLayout.this.mPreLoadPath, str)) {
                        try {
                            webResourceResponse = new WebResourceResponse("image/" + FileUtil.getUrlFileType(str), "UTF-8", new FileInputStream(FileUtil.getUrlFilePath(WebViewLayout.this.mPreLoadPath, str)));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return webResourceResponse;
            }
        });
        loadWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadWebView() {
        if (TextUtils.isEmpty(this.mUrl) || this.mWebView == null || this.mNetworkStateVF == null) {
            return;
        }
        this.mNetworkStateVF.setVisibility(0);
        this.mWebView.loadUrl(this.mUrl);
    }

    public void hideLoadingView() {
        if (this.mNetworkStateVF != null) {
            this.mNetworkStateVF.setVisibility(8);
        }
    }

    public void showDataMode() {
        if (this.mWebView != null) {
            this.mWebView.setVisibility(0);
        }
        if (this.mNetworkStateVF != null) {
            this.mNetworkStateVF.setVisibility(8);
        }
    }

    public void showNetErrorMode() {
        if (this.mWebView != null) {
            this.mWebView.setVisibility(8);
        }
        if (this.mNetworkStateVF != null) {
            this.mNetworkStateVF.setVisibility(0);
            this.mNetworkStateVF.toNoNetMode();
        }
    }

    public void clearWebView() {
        this.sWebViewLayout = null;
        if (this.mWebView != null) {
            this.mWebView.clearCache(false);
            this.mWebView.removeAllViews();
            this.mWebView.destroy();
            this.mWebView = null;
        }
    }

    @Override // com.cmplay.base.util.webview.callback.JsActivityCallBack
    public void unlockCallback(String str) {
        mUnLockMethonName = str;
    }

    @Override // com.cmplay.base.util.webview.callback.JsActivityCallBack
    public void getUnlockStateCallback(String str) {
        mGetUnLockStateMethonName = str;
    }

    @Override // com.cmplay.base.util.webview.callback.JsActivityCallBack
    public void playAbleCallBack(String str) {
        mPlayAbleMethonName = str;
        h.a("playable", "WebViewLayout.playAbleCallBack  保存传递过来的方法  methonName:" + mPlayAbleMethonName);
    }

    @Override // com.cmplay.base.util.webview.callback.JsActivityCallBack
    public void selectPictureWithCallback(String str) {
        mSelectPictureMethonName = str;
        h.a("selectPictureWithCallback", "WebViewLayout.selectPictureWithCallback  保存传递过来的方法  methonName:" + mSelectPictureMethonName);
    }

    @Override // com.cmplay.base.util.webview.callback.JsActivityCallBack
    public void hideCloseBtn() {
        if (this.closeBtn != null) {
            this.closeBtn.setVisibility(8);
        }
    }

    @Override // com.cmplay.base.util.webview.callback.JsActivityCallBack
    public void showCloseBtn() {
        if (this.closeBtn != null) {
            this.closeBtn.setVisibility(0);
        }
    }

    @Override // com.cmplay.base.util.webview.callback.JsActivityCallBack
    public void loginCallBack(String str) {
        mLoginMethonName = str;
    }

    @Override // com.cmplay.base.util.webview.callback.JsActivityCallBack
    public void shareCallBack(String str) {
        mShareMethonName = str;
    }

    public static String getShareMethonName() {
        return mShareMethonName;
    }

    public static String getLoginMethonName() {
        return mLoginMethonName;
    }

    public WebViewEx getWebView() {
        return this.mWebView;
    }

    public void callbackGetUnLockStateMethon(String str) {
        if (this.mWebView == null || TextUtils.isEmpty(mGetUnLockStateMethonName) || TextUtils.isEmpty(str)) {
            return;
        }
        this.mWebView.loadUrl("javascript:" + mGetUnLockStateMethonName + "(" + str + ")");
    }

    public void callbackUnLockMethon(String str) {
        if (this.mWebView == null || TextUtils.isEmpty(mUnLockMethonName) || TextUtils.isEmpty(str)) {
            return;
        }
        this.mWebView.loadUrl("javascript:" + mUnLockMethonName + "(" + str + ")");
    }

    public void callbackLoginMethon(String str) {
        if (this.mWebView == null || TextUtils.isEmpty(mLoginMethonName) || TextUtils.isEmpty(str)) {
            return;
        }
        this.mWebView.loadUrl("javascript:" + mLoginMethonName + "(" + str + ")");
        h.c("ly", "callbackLoginMethon = javascript:" + mLoginMethonName + "(" + str + ")");
    }

    public void callbackShareMethon(String str) {
        if (this.mWebView == null || TextUtils.isEmpty(mShareMethonName) || TextUtils.isEmpty(str)) {
            return;
        }
        this.mWebView.loadUrl("javascript:" + mShareMethonName + "(" + str + ")");
        h.c("ly", "callbackShareMethon = javascript:" + mShareMethonName + "(" + str + ")");
    }

    public void callbackPlayAbleMethon(String str) {
        h.a("playable", "WebViewLayout.callbackPlayAbleMethon  mWebView:" + this.mWebView + "  mPlayAbleMethonName:" + mPlayAbleMethonName + "   status:" + str);
        if (this.mWebView == null || TextUtils.isEmpty(mPlayAbleMethonName) || TextUtils.isEmpty(str)) {
            return;
        }
        this.mWebView.loadUrl("javascript:" + mPlayAbleMethonName + "('" + str + "')");
        h.a("playable", "成功调用 WebViewLayout.callbackPlayAbleMethon = javascript:" + mPlayAbleMethonName + "('" + str + "')");
    }

    public void callbackSelectPictureMethon(String str) {
        h.a("selectPicture", "WebViewLayout.callbackSelectPictureMethon  mWebView:" + this.mWebView + "  mSelectPictureMethonName:" + mSelectPictureMethonName + "   base64StrImgData:" + str);
        if (this.mWebView == null || TextUtils.isEmpty(mSelectPictureMethonName) || TextUtils.isEmpty(str)) {
            return;
        }
        h.a("selectPicture", "WebViewLayout.callbackSelectPictureMethon  call javascript");
        this.mWebView.loadUrl("javascript:" + mSelectPictureMethonName + "('" + str + "')");
        h.a("selectPicture", "成功调用 WebViewLayout.mSelectPictureMethonName = javascript:" + mSelectPictureMethonName + "('" + str + "')");
    }

    @Override // com.cmplay.base.util.webview.callback.JsActivityCallBack
    public void closeWebView(int i) {
        setVisibility(8);
        clearWebView();
        if (this.mActivity != null) {
            this.mActivity.finish();
        }
    }

    @Override // com.cmplay.base.util.webview.callback.JsActivityCallBack
    public void showWebView() {
        showDataMode();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mChromeClient.onActivityResult(i, i2, intent);
    }

    public PaxWebChromeClient getChromeClient() {
        return this.mChromeClient;
    }
}
