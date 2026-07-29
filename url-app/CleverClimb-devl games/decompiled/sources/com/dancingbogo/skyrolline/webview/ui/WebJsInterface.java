package com.dancingbogo.skyrolline.webview.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.util.d;
import com.dancingbogo.skyrolline.util.g;
import com.dancingbogo.skyrolline.util.k;
import com.dancingbogo.skyrolline.util.l;
import com.dancingbogo.skyrolline.util.m;
import com.dancingbogo.skyrolline.webview.b.e;
import com.dancingbogo.skyrolline.webview.broadcast.GameBroadcast;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class WebJsInterface {
    public static final String API_VERSION = "api_version";
    public static final String APP_VERSION = "app_version";
    public static final String DEVICE_ID = "did";
    public static final String DEVICE_TYPE = "device_type";
    public static final String IMEI = "imei";
    private com.dancingbogo.skyrolline.webview.a.a mCallBack;
    private WeakReference<Activity> refActivity;

    @JavascriptInterface
    public void doH5Report(int i) {
    }

    @JavascriptInterface
    public String getEmailKey() {
        return "";
    }

    @JavascriptInterface
    public boolean isClickLike(int i) {
        return false;
    }

    @JavascriptInterface
    public int isNewUser() {
        return 2;
    }

    @JavascriptInterface
    public void login() {
    }

    @JavascriptInterface
    public void reportLoginBtnClick() {
    }

    @JavascriptInterface
    public void reportLoginBtnPV() {
    }

    @JavascriptInterface
    public void saveEmailKey(String str) {
    }

    @JavascriptInterface
    public void shareToFacebook(String str) {
    }

    public WebJsInterface(Activity activity) {
        this(activity, null);
    }

    public WebJsInterface(Activity activity, com.dancingbogo.skyrolline.webview.a.a aVar) {
        if (this.refActivity == null) {
            this.refActivity = new WeakReference<>(activity);
        }
        this.mCallBack = aVar;
    }

    @JavascriptInterface
    public void registerLoginCallback(final String str) {
        Activity activity;
        if (this.refActivity == null || (activity = this.refActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.webview.ui.WebJsInterface.1
            @Override // java.lang.Runnable
            public void run() {
                if (WebJsInterface.this.mCallBack != null) {
                    WebJsInterface.this.mCallBack.a(str);
                }
            }
        });
    }

    @JavascriptInterface
    public String getDeviceinfo() {
        return com.dancingbogo.skyrolline.webview.util.b.a();
    }

    @JavascriptInterface
    public String get_device_info() {
        Context context = GameApp.f4485a;
        JSONObject jSONObject = new JSONObject();
        String valueOf = String.valueOf(m.d(context, context.getPackageName()));
        if (valueOf == null) {
            valueOf = "";
        }
        try {
            jSONObject.put("app_version", valueOf);
            jSONObject.put("api_version", 1);
            jSONObject.put("did", "");
            jSONObject.put("device_type", 2);
            jSONObject.put("imei", "");
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public boolean isPkInstall(String str) {
        return m.a(GameApp.f4485a, str);
    }

    @JavascriptInterface
    public void go2Google(String str) {
        Activity activity = this.refActivity.get();
        String trim = str.trim();
        if (activity != null) {
            k.a(GameApp.f4485a, trim);
        }
    }

    @JavascriptInterface
    public void openApp(final String str) {
        com.dancingbogo.skyrolline.util.a.a(new Runnable() { // from class: com.dancingbogo.skyrolline.webview.ui.WebJsInterface.4
            @Override // java.lang.Runnable
            public void run() {
                if (((Activity) WebJsInterface.this.refActivity.get()) == null || TextUtils.isEmpty(str)) {
                    return;
                }
                m.e(GameApp.f4485a, str);
            }
        });
    }

    @JavascriptInterface
    public boolean isWifiAvailable() {
        return l.e(GameApp.f4485a);
    }

    @JavascriptInterface
    public void hideWaitingView() {
        Activity activity = this.refActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.webview.ui.WebJsInterface.5
                @Override // java.lang.Runnable
                public void run() {
                    if (WebJsInterface.this.mCallBack != null) {
                        WebJsInterface.this.mCallBack.a();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void isGetExchangeCode(boolean z) {
        if (this.refActivity.get() == null || !z) {
        }
    }

    @JavascriptInterface
    public String createSecret(String str) {
        Activity activity;
        return (this.refActivity == null || (activity = this.refActivity.get()) == null) ? "" : e.a(activity, str);
    }

    @JavascriptInterface
    public void saveGameLicenseFile(String str) {
        com.dancingbogo.skyrolline.webview.util.b.a(str);
    }

    @JavascriptInterface
    public String getActDeviceInfo() {
        return com.dancingbogo.skyrolline.webview.util.b.c();
    }

    @JavascriptInterface
    public String getActSign(String str) {
        Activity activity = this.refActivity.get();
        return activity != null ? e.a(activity, str) : "";
    }

    @JavascriptInterface
    public void closeWebView() {
        if (this.refActivity == null) {
            return;
        }
        Activity activity = this.refActivity.get();
        if (activity != null && !activity.isFinishing()) {
            activity.finish();
        }
        com.dancingbogo.skyrolline.util.b.b("ly", "webjs closeWebView");
    }

    @JavascriptInterface
    public void registerShareCallback(final String str) {
        Activity activity;
        if (this.refActivity == null || (activity = this.refActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.webview.ui.WebJsInterface.6
            @Override // java.lang.Runnable
            public void run() {
                if (WebJsInterface.this.mCallBack != null) {
                    WebJsInterface.this.mCallBack.b(str);
                }
            }
        });
    }

    @JavascriptInterface
    public boolean isInstallApp(String str) {
        return d.b(str);
    }

    @JavascriptInterface
    public void copyToClipboard(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((ClipboardManager) GameApp.f4485a.getSystemService("clipboard")).setText(str);
    }

    @JavascriptInterface
    public void postFeedbackData(String str) {
        WebViewActivity webViewActivity = (WebViewActivity) this.refActivity.get();
        if (webViewActivity != null) {
            com.dancingbogo.skyrolline.util.b.b("WebJsInterface", "postFeedbackData = " + str);
            GameBroadcast.a(webViewActivity, str);
        }
    }

    @JavascriptInterface
    public String getFeedbackDeviceinfo() {
        return com.dancingbogo.skyrolline.webview.util.b.e();
    }

    @JavascriptInterface
    public void closeLoading() {
        final WebViewActivity webViewActivity = (WebViewActivity) this.refActivity.get();
        webViewActivity.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.webview.ui.WebJsInterface.7
            @Override // java.lang.Runnable
            public void run() {
                WebViewLayout a2;
                if (webViewActivity == null || (a2 = webViewActivity.a()) == null) {
                    return;
                }
                a2.b();
            }
        });
    }

    @JavascriptInterface
    public void showToast(final String str) {
        final Activity activity = this.refActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.webview.ui.WebJsInterface.8
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(activity, str, 0).show();
                }
            });
        }
    }

    @JavascriptInterface
    public void openFacebook(String str) {
        g.a(str);
    }

    @JavascriptInterface
    public void jumpToLevel(int i) {
        com.dancingbogo.skyrolline.util.b.b("WebJsInterface", "jumpToLevel = " + i);
        Activity activity = this.refActivity.get();
        if (activity != null) {
            GameBroadcast.a(activity, i);
        }
    }

    @JavascriptInterface
    public void sendPrize(int i, int i2, int i3) {
        com.dancingbogo.skyrolline.util.b.b("lottery_WebJsInterface", "sence = " + i + "sendPrize id= " + i2 + " count = " + i3);
        Activity activity = this.refActivity.get();
        if (activity != null) {
            GameBroadcast.a(activity, i, i2, i3);
        }
    }

    @JavascriptInterface
    public void JumpToYoutube(String str) {
        Activity activity = this.refActivity.get();
        if (activity != null) {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    @JavascriptInterface
    public void getProp(int i) {
        Activity activity = this.refActivity.get();
        com.dancingbogo.skyrolline.util.b.b("lottery", "getProp  id = " + i + "  activity:" + activity);
        if (activity != null) {
            GameBroadcast.b(activity, i);
        }
    }

    @JavascriptInterface
    public void getProps() {
        com.dancingbogo.skyrolline.util.b.b("lottery", "getProp");
        Activity activity = this.refActivity.get();
        if (activity != null) {
            GameBroadcast.a(activity);
        }
    }

    @JavascriptInterface
    public void getItemsInfo() {
        com.dancingbogo.skyrolline.util.b.b("lottery", "getItemsInfo");
        Activity activity = this.refActivity.get();
        if (activity != null) {
            GameBroadcast.b(activity);
        }
    }

    @JavascriptInterface
    public void canShowAd(int i) {
        com.dancingbogo.skyrolline.util.b.b("lottery", "canShowAd  sence = " + i);
        Activity activity = this.refActivity.get();
        if (activity != null) {
            GameBroadcast.c(activity, i);
        }
    }

    @JavascriptInterface
    public void showAd(int i) {
        com.dancingbogo.skyrolline.util.b.b("lottery", "showAd  sence = " + i);
        Activity activity = this.refActivity.get();
        if (activity != null) {
            GameBroadcast.d(activity, i);
        }
    }

    @JavascriptInterface
    public void setLevelData(String str) {
        com.dancingbogo.skyrolline.util.b.b("lottery", "setLevelData  json = " + str);
        Activity activity = this.refActivity.get();
        if (activity != null) {
            GameBroadcast.b(activity, str);
        }
    }

    @JavascriptInterface
    public void setAddPropNumberData(String str) {
        com.dancingbogo.skyrolline.util.b.b("lottery", "setAddPropNumberData  json = " + str);
        Activity activity = this.refActivity.get();
        if (activity != null) {
            GameBroadcast.c(activity, str);
        }
    }

    @JavascriptInterface
    public void registerGetPropCallback(final String str) {
        Activity activity;
        com.dancingbogo.skyrolline.util.b.b("lottery", "WebJsInterface.registerGetPropCallback   js返回的回调为:" + str);
        if (this.refActivity == null || (activity = this.refActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.webview.ui.WebJsInterface.9
            @Override // java.lang.Runnable
            public void run() {
                if (WebJsInterface.this.mCallBack != null) {
                    WebJsInterface.this.mCallBack.c(str);
                }
            }
        });
    }

    @JavascriptInterface
    public void registerCanShowAdCallback(final String str) {
        Activity activity;
        com.dancingbogo.skyrolline.util.b.b("lottery", "WebJsInterface.registerAdCallback   js返回的回调为:" + str);
        if (this.refActivity == null || (activity = this.refActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.webview.ui.WebJsInterface.10
            @Override // java.lang.Runnable
            public void run() {
                if (WebJsInterface.this.mCallBack != null) {
                    WebJsInterface.this.mCallBack.d(str);
                }
            }
        });
    }

    @JavascriptInterface
    public void registerAdResultCallback(final String str) {
        Activity activity;
        com.dancingbogo.skyrolline.util.b.b("lottery", "WebJsInterface.registerAdCallback   js返回的回调为:" + str);
        if (this.refActivity == null || (activity = this.refActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.webview.ui.WebJsInterface.11
            @Override // java.lang.Runnable
            public void run() {
                if (WebJsInterface.this.mCallBack != null) {
                    WebJsInterface.this.mCallBack.e(str);
                }
            }
        });
    }

    @JavascriptInterface
    public void registerOnDestroyCallback(final String str) {
        Activity activity;
        com.dancingbogo.skyrolline.util.b.b("lottery", "WebJsInterface.registerOnDestroyCallback   js返回的回调为:" + str);
        if (this.refActivity == null || (activity = this.refActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.webview.ui.WebJsInterface.2
            @Override // java.lang.Runnable
            public void run() {
                if (WebJsInterface.this.mCallBack != null) {
                    WebJsInterface.this.mCallBack.f(str);
                }
            }
        });
    }

    @JavascriptInterface
    public void registerGetItemsInfoCallback(final String str) {
        Activity activity;
        com.dancingbogo.skyrolline.util.b.b("lottery", "WebJsInterface.registerGetItemsInfoCallback   js返回的回调为:" + str);
        if (this.refActivity == null || (activity = this.refActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.webview.ui.WebJsInterface.3
            @Override // java.lang.Runnable
            public void run() {
                if (WebJsInterface.this.mCallBack != null) {
                    WebJsInterface.this.mCallBack.g(str);
                }
            }
        });
    }

    @JavascriptInterface
    public void SetLotteryNum(String str, String str2) {
        com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).b(str, str2);
    }

    @JavascriptInterface
    public String GetLotteryNum(String str) {
        return com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).a(str, "");
    }
}
