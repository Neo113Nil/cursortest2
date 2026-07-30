package com.just.agentweb;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.net.MailTo;
import com.alipay.sdk.app.H5PayCallback;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.util.H5PayResultModel;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class DefaultWebClient extends MiddlewareWebClientBase {
    public static final String ALIPAYS_SCHEME = "alipays://";
    public static final int ASK_USER_OPEN_OTHER_PAGE = 250;
    private static final int CONSTANTS_ABNORMAL_BIG = 7;
    public static final int DERECT_OPEN_OTHER_PAGE = 1001;
    public static final int DISALLOW_OPEN_OTHER_APP = 62;
    private static final boolean HAS_ALIPAY_LIB;
    public static final String HTTPS_SCHEME = "https://";
    public static final String HTTP_SCHEME = "http://";
    public static final String INTENT_SCHEME = "intent://";
    public static final String SCHEME_SMS = "sms:";
    private static final String TAG = "DefaultWebClient";
    public static final String WEBCHAT_PAY_SCHEME = "weixin://wap/pay?";
    private WeakReference<AbsAgentWebUIController> mAgentWebUIController;
    private Handler.Callback mCallback;
    private Set<String> mErrorUrlsSet;
    private boolean mIsInterceptUnkownUrl;
    private Object mPayTask;
    private int mUrlHandleWays;
    private Set<String> mWaittingFinishSet;
    private WeakReference<Activity> mWeakReference;
    private WebView mWebView;
    private android.webkit.WebViewClient mWebViewClient;
    private Method onMainFrameErrorMethod;
    private boolean webClientHelper;

    public static class Builder {
        private Activity mActivity;
        private android.webkit.WebViewClient mClient;
        private boolean mIsInterceptUnkownScheme = true;
        private PermissionInterceptor mPermissionInterceptor;
        private int mUrlHandleWays;
        private boolean mWebClientHelper;
        private WebView mWebView;

        public DefaultWebClient build() {
            return new DefaultWebClient(this);
        }

        public Builder setActivity(Activity activity) {
            this.mActivity = activity;
            return this;
        }

        public Builder setClient(android.webkit.WebViewClient webViewClient) {
            this.mClient = webViewClient;
            return this;
        }

        public Builder setInterceptUnkownUrl(boolean z7) {
            this.mIsInterceptUnkownScheme = z7;
            return this;
        }

        public Builder setPermissionInterceptor(PermissionInterceptor permissionInterceptor) {
            this.mPermissionInterceptor = permissionInterceptor;
            return this;
        }

        public Builder setUrlHandleWays(int i8) {
            this.mUrlHandleWays = i8;
            return this;
        }

        public Builder setWebClientHelper(boolean z7) {
            this.mWebClientHelper = z7;
            return this;
        }

        public Builder setWebView(WebView webView) {
            this.mWebView = webView;
            return this;
        }
    }

    public enum OpenOtherPageWays {
        DERECT(1001),
        ASK(250),
        DISALLOW(62);

        int code;

        OpenOtherPageWays(int i8) {
            this.code = i8;
        }
    }

    static {
        boolean z7;
        try {
            Class.forName("com.alipay.sdk.app.PayTask");
            z7 = true;
        } catch (Throwable unused) {
            z7 = false;
        }
        HAS_ALIPAY_LIB = z7;
        LogUtils.i(TAG, "HAS_ALIPAY_LIB:" + z7);
    }

    DefaultWebClient(Builder builder) {
        super(builder.mClient);
        this.mWeakReference = null;
        this.webClientHelper = true;
        this.mUrlHandleWays = 250;
        this.mIsInterceptUnkownUrl = true;
        this.mAgentWebUIController = null;
        this.mCallback = null;
        this.onMainFrameErrorMethod = null;
        this.mErrorUrlsSet = new HashSet();
        this.mWaittingFinishSet = new HashSet();
        this.mWebView = builder.mWebView;
        this.mWebViewClient = builder.mClient;
        this.mWeakReference = new WeakReference<>(builder.mActivity);
        this.webClientHelper = builder.mWebClientHelper;
        this.mAgentWebUIController = new WeakReference<>(AgentWebUtils.getAgentWebUIControllerByWebView(builder.mWebView));
        this.mIsInterceptUnkownUrl = builder.mIsInterceptUnkownScheme;
        if (builder.mUrlHandleWays <= 0) {
            this.mUrlHandleWays = 250;
        } else {
            this.mUrlHandleWays = builder.mUrlHandleWays;
        }
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    private boolean deepLink(String str) {
        ResolveInfo lookupResolveInfo;
        int i8 = this.mUrlHandleWays;
        if (i8 != 250) {
            if (i8 != 1001) {
                return false;
            }
            lookup(str);
            return true;
        }
        Activity activity = this.mWeakReference.get();
        if (activity == null || (lookupResolveInfo = lookupResolveInfo(str)) == null) {
            return false;
        }
        ActivityInfo activityInfo = lookupResolveInfo.activityInfo;
        LogUtils.e(TAG, "resolve package:" + lookupResolveInfo.activityInfo.packageName + " app package:" + activity.getPackageName());
        if (activityInfo != null && !TextUtils.isEmpty(activityInfo.packageName) && activityInfo.packageName.equals(activity.getPackageName())) {
            return lookup(str);
        }
        if (this.mAgentWebUIController.get() != null) {
            AbsAgentWebUIController absAgentWebUIController = this.mAgentWebUIController.get();
            WebView webView = this.mWebView;
            absAgentWebUIController.onOpenPagePrompt(webView, webView.getUrl(), getCallback(str));
        }
        return true;
    }

    private Handler.Callback getCallback(final String str) {
        Handler.Callback callback = this.mCallback;
        if (callback != null) {
            return callback;
        }
        Handler.Callback callback2 = new Handler.Callback() { // from class: com.just.agentweb.DefaultWebClient.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return true;
                }
                DefaultWebClient.this.lookup(str);
                return true;
            }
        };
        this.mCallback = callback2;
        return callback2;
    }

    private boolean handleCommonLink(String str) {
        if (!str.startsWith("tel:") && !str.startsWith(SCHEME_SMS) && !str.startsWith(MailTo.MAILTO_SCHEME) && !str.startsWith("geo:0,0?q=")) {
            return false;
        }
        try {
            Activity activity = this.mWeakReference.get();
            if (activity == null) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e8) {
            if (!AgentWebConfig.DEBUG) {
                return true;
            }
            e8.printStackTrace();
            return true;
        }
    }

    private void handleIntentUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith(INTENT_SCHEME)) {
                lookup(str);
            }
        } catch (Throwable th) {
            if (LogUtils.isDebug()) {
                th.printStackTrace();
            }
        }
    }

    private boolean isAlipay(final WebView webView, String str) {
        try {
            Activity activity = this.mWeakReference.get();
            if (activity == null) {
                return false;
            }
            if (this.mPayTask == null) {
                this.mPayTask = Class.forName("com.alipay.sdk.app.PayTask").getConstructor(Activity.class).newInstance(activity);
            }
            boolean payInterceptorWithUrl = ((PayTask) this.mPayTask).payInterceptorWithUrl(str, true, new H5PayCallback() { // from class: com.just.agentweb.DefaultWebClient.1
                public void onPayResult(H5PayResultModel h5PayResultModel) {
                    final String returnUrl = h5PayResultModel.getReturnUrl();
                    if (TextUtils.isEmpty(returnUrl)) {
                        return;
                    }
                    AgentWebUtils.runInUiThread(new Runnable() { // from class: com.just.agentweb.DefaultWebClient.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            webView.loadUrl(returnUrl);
                        }
                    });
                }
            });
            if (payInterceptorWithUrl) {
                LogUtils.i(TAG, "alipay-isIntercepted:" + payInterceptorWithUrl + "  url:" + str);
            }
            return payInterceptorWithUrl;
        } catch (Throwable unused) {
            boolean z7 = AgentWebConfig.DEBUG;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lookup(String str) {
        try {
            Activity activity = this.mWeakReference.get();
            if (activity == null) {
                return true;
            }
            PackageManager packageManager = activity.getPackageManager();
            Intent parseUri = Intent.parseUri(str, 1);
            if (packageManager.resolveActivity(parseUri, 65536) == null) {
                return false;
            }
            activity.startActivity(parseUri);
            return true;
        } catch (Throwable th) {
            if (!LogUtils.isDebug()) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    private ResolveInfo lookupResolveInfo(String str) {
        try {
            Activity activity = this.mWeakReference.get();
            if (activity == null) {
                return null;
            }
            return activity.getPackageManager().resolveActivity(Intent.parseUri(str, 1), 65536);
        } catch (Throwable th) {
            if (LogUtils.isDebug()) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r1 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onMainFrameError(WebView webView, int i8, String str, String str2) {
        this.mErrorUrlsSet.add(str2);
        android.webkit.WebViewClient webViewClient = this.mWebViewClient;
        if (webViewClient != null && this.webClientHelper) {
            Method method = this.onMainFrameErrorMethod;
            if (method == null) {
                method = AgentWebUtils.isExistMethod(webViewClient, "onMainFrameError", AbsAgentWebUIController.class, WebView.class, Integer.TYPE, String.class, String.class);
                this.onMainFrameErrorMethod = method;
            }
            try {
                method.invoke(this.mWebViewClient, this.mAgentWebUIController.get(), webView, Integer.valueOf(i8), str, str2);
                return;
            } catch (Throwable th) {
                if (LogUtils.isDebug()) {
                    th.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (this.mAgentWebUIController.get() != null) {
            this.mAgentWebUIController.get().onMainFrameError(webView, i8, str, str2);
        }
    }

    private int queryActiviesNumber(String str) {
        try {
            if (this.mWeakReference.get() == null) {
                return 0;
            }
            List<ResolveInfo> queryIntentActivities = this.mWeakReference.get().getPackageManager().queryIntentActivities(Intent.parseUri(str, 1), 65536);
            if (queryIntentActivities == null) {
                return 0;
            }
            return queryIntentActivities.size();
        } catch (URISyntaxException e8) {
            if (LogUtils.isDebug()) {
                e8.printStackTrace();
            }
            return 0;
        }
    }

    private void startActivity(String str) {
        try {
            if (this.mWeakReference.get() == null) {
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.mWeakReference.get().startActivity(intent);
        } catch (Exception e8) {
            if (LogUtils.isDebug()) {
                e8.printStackTrace();
            }
        }
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z7) {
        if (!this.mWaittingFinishSet.contains(str)) {
            this.mWaittingFinishSet.add(str);
        }
        super.doUpdateVisitedHistory(webView, str, z7);
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.mErrorUrlsSet.contains(str) || !this.mWaittingFinishSet.contains(str)) {
            webView.setVisibility(0);
        } else if (this.mAgentWebUIController.get() != null) {
            this.mAgentWebUIController.get().onShowMainFrame();
        }
        if (this.mWaittingFinishSet.contains(str)) {
            this.mWaittingFinishSet.remove(str);
        }
        if (!this.mErrorUrlsSet.isEmpty()) {
            this.mErrorUrlsSet.clear();
        }
        super.onPageFinished(webView, str);
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!this.mWaittingFinishSet.contains(str)) {
            this.mWaittingFinishSet.add(str);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i8, String str, String str2) {
        LogUtils.i(TAG, "onReceivedError：" + str + "  CODE:" + i8);
        if ((str2 != null || i8 == -12) && i8 != -1) {
            if (i8 == -2 || str2 == null || str2.equals(webView.getUrl()) || str2.equals(webView.getOriginalUrl())) {
                onMainFrameError(webView, i8, str, str2);
            }
        }
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.mAgentWebUIController.get() != null) {
            this.mAgentWebUIController.get().onShowSslCertificateErrorDialog(webView, sslErrorHandler, sslError);
        }
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f8, float f9) {
        LogUtils.i(TAG, "onScaleChanged:" + f8 + "   n:" + f9);
        if (f9 - f8 > 7.0f) {
            webView.setInitialScale((int) ((f8 / f9) * 100.0f));
        }
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        if (uri.startsWith(HTTP_SCHEME) || uri.startsWith(HTTPS_SCHEME)) {
            return this.webClientHelper && HAS_ALIPAY_LIB && isAlipay(webView, uri);
        }
        if (!this.webClientHelper) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        if (handleCommonLink(uri)) {
            return true;
        }
        if (uri.startsWith(INTENT_SCHEME)) {
            handleIntentUrl(uri);
            LogUtils.i(TAG, "intent url ");
            return true;
        }
        if (uri.startsWith(WEBCHAT_PAY_SCHEME)) {
            LogUtils.i(TAG, "lookup wechat to pay ~~");
            startActivity(uri);
            return true;
        }
        if (uri.startsWith(ALIPAYS_SCHEME) && lookup(uri)) {
            LogUtils.i(TAG, "alipays url lookup alipay ~~ ");
            return true;
        }
        if (queryActiviesNumber(uri) > 0 && deepLink(uri)) {
            LogUtils.i(TAG, "intercept url:" + uri);
            return true;
        }
        if (!this.mIsInterceptUnkownUrl) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        LogUtils.i(TAG, "intercept UnkownUrl :" + webResourceRequest.getUrl());
        return true;
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int errorCode;
        CharSequence description;
        int errorCode2;
        int errorCode3;
        CharSequence description2;
        String uri = webResourceRequest.getUrl().toString();
        errorCode = webResourceError.getErrorCode();
        if (webResourceRequest.isForMainFrame()) {
            if ((uri != null || errorCode == -12) && errorCode != -1) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("onReceivedError:");
                description = webResourceError.getDescription();
                sb.append((Object) description);
                sb.append(" code:");
                errorCode2 = webResourceError.getErrorCode();
                sb.append(errorCode2);
                sb.append(" failingUrl:");
                sb.append(uri);
                sb.append(" getUrl:");
                sb.append(webView.getUrl());
                sb.append(" getOriginalUrl:");
                sb.append(webView.getOriginalUrl());
                LogUtils.i(str, sb.toString());
                if (errorCode == -2 || uri == null || uri.equals(webView.getUrl()) || uri.equals(webView.getOriginalUrl())) {
                    errorCode3 = webResourceError.getErrorCode();
                    description2 = webResourceError.getDescription();
                    onMainFrameError(webView, errorCode3, description2.toString(), webResourceRequest.getUrl().toString());
                }
            }
        }
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        String str3;
        if (str.startsWith(HTTP_SCHEME) || str.startsWith(HTTPS_SCHEME)) {
            return this.webClientHelper && HAS_ALIPAY_LIB && isAlipay(webView, str);
        }
        if (!this.webClientHelper) {
            return false;
        }
        if (handleCommonLink(str)) {
            return true;
        }
        if (str.startsWith(INTENT_SCHEME)) {
            handleIntentUrl(str);
            return true;
        }
        if (str.startsWith(WEBCHAT_PAY_SCHEME)) {
            startActivity(str);
            return true;
        }
        if (str.startsWith(ALIPAYS_SCHEME) && lookup(str)) {
            return true;
        }
        if (queryActiviesNumber(str) > 0 && deepLink(str)) {
            str2 = TAG;
            str3 = "intercept OtherAppScheme";
        } else {
            if (!this.mIsInterceptUnkownUrl) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            str2 = TAG;
            str3 = "intercept InterceptUnkownScheme : " + str;
        }
        LogUtils.i(str2, str3);
        return true;
    }
}
