package com.cmplay.base.util.webview.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.widget.Toast;
import com.cmplay.base.util.e;
import com.cmplay.base.util.g;
import com.cmplay.base.util.h;
import com.cmplay.base.util.i;
import com.cmplay.base.util.p;
import com.cmplay.base.util.s;
import com.cmplay.base.util.t;
import com.cmplay.base.util.webview.broadcast.GameBroadcast;
import com.cmplay.base.util.webview.callback.JsActivityCallBack;
import com.cmplay.base.util.webview.encode.UrlEncoder;
import com.cmplay.base.util.webview.util.WebUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class WebJsInterface {
    public static final String API_VERSION = "api_version";
    public static final String APP_VERSION = "app_version";
    public static final String DEVICE_ID = "did";
    public static final String DEVICE_TYPE = "device_type";
    public static final String IMEI = "imei";
    private JsActivityCallBack mCallBack;
    private Context mContext;
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

    public WebJsInterface(Activity activity, JsActivityCallBack jsActivityCallBack) {
        if (this.refActivity == null) {
            this.refActivity = new WeakReference<>(activity);
        }
        this.mContext = activity.getApplicationContext();
        this.mCallBack = jsActivityCallBack;
    }

    @JavascriptInterface
    public void registerLoginCallback(final String str) {
        Activity activity;
        if (this.refActivity == null || (activity = this.refActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.cmplay.base.util.webview.ui.WebJsInterface.1
            @Override // java.lang.Runnable
            public void run() {
                if (WebJsInterface.this.mCallBack != null) {
                    WebJsInterface.this.mCallBack.loginCallBack(str);
                }
            }
        });
    }

    @JavascriptInterface
    public String getDeviceinfo() {
        return WebUtils.getDeviceInfo(this.mContext);
    }

    @JavascriptInterface
    public String get_device_info() {
        Context context = this.mContext;
        JSONObject jSONObject = new JSONObject();
        String valueOf = String.valueOf(i.b(context));
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
        return t.a(this.mContext, str);
    }

    @JavascriptInterface
    public void go2Google(String str) {
        Activity activity = this.refActivity.get();
        String trim = str.trim();
        if (activity != null) {
            p.c(this.mContext, trim);
        }
    }

    @JavascriptInterface
    public void openApp(final String str) {
        e.a(new Runnable() { // from class: com.cmplay.base.util.webview.ui.WebJsInterface.2
            @Override // java.lang.Runnable
            public void run() {
                if (((Activity) WebJsInterface.this.refActivity.get()) == null || TextUtils.isEmpty(str)) {
                    return;
                }
                t.d(WebJsInterface.this.mContext, str);
            }
        });
    }

    @JavascriptInterface
    public boolean isWifiAvailable() {
        return s.e(this.mContext);
    }

    @JavascriptInterface
    public void hideWaitingView() {
        Activity activity = this.refActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.cmplay.base.util.webview.ui.WebJsInterface.3
                @Override // java.lang.Runnable
                public void run() {
                    if (WebJsInterface.this.mCallBack != null) {
                        WebJsInterface.this.mCallBack.showWebView();
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
        return (this.refActivity == null || (activity = this.refActivity.get()) == null) ? "" : UrlEncoder.getSign(activity, str);
    }

    @JavascriptInterface
    public void saveGameLicenseFile(String str) {
        WebUtils.createGameLicenseFile(this.mContext, str);
    }

    @JavascriptInterface
    public String getActDeviceInfo() {
        return WebUtils.createActDeviceInfo(this.mContext);
    }

    @JavascriptInterface
    public String getActSign(String str) {
        Activity activity = this.refActivity.get();
        return activity != null ? UrlEncoder.getSign(activity, str) : "";
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
        h.c("ly", "webjs closeWebView");
    }

    @JavascriptInterface
    public void registerShareCallback(final String str) {
        Activity activity;
        if (this.refActivity == null || (activity = this.refActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.cmplay.base.util.webview.ui.WebJsInterface.4
            @Override // java.lang.Runnable
            public void run() {
                if (WebJsInterface.this.mCallBack != null) {
                    WebJsInterface.this.mCallBack.shareCallBack(str);
                }
            }
        });
    }

    @JavascriptInterface
    public boolean isInstallApp(String str) {
        return t.a(this.mContext, str);
    }

    @JavascriptInterface
    public void copyToClipboard(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((ClipboardManager) this.mContext.getSystemService("clipboard")).setText(str);
    }

    @JavascriptInterface
    public void postFeedbackData(String str) {
        WebViewActivity webViewActivity = (WebViewActivity) this.refActivity.get();
        if (webViewActivity != null) {
            h.c("WebJsInterface", "postFeedbackData = " + str);
            GameBroadcast.PostFeedbackData(webViewActivity, str);
        }
    }

    @JavascriptInterface
    public String getFeedbackDeviceinfo() {
        return WebUtils.getFeedbackDeviceinfo(this.mContext);
    }

    @JavascriptInterface
    public void closeLoading() {
        final WebViewActivity webViewActivity = (WebViewActivity) this.refActivity.get();
        webViewActivity.runOnUiThread(new Runnable() { // from class: com.cmplay.base.util.webview.ui.WebJsInterface.5
            @Override // java.lang.Runnable
            public void run() {
                WebViewLayout layout;
                if (webViewActivity == null || (layout = webViewActivity.getLayout()) == null) {
                    return;
                }
                layout.hideLoadingView();
            }
        });
    }

    @JavascriptInterface
    public void hideCloseBtn() {
        final WebViewActivity webViewActivity = (WebViewActivity) this.refActivity.get();
        webViewActivity.runOnUiThread(new Runnable() { // from class: com.cmplay.base.util.webview.ui.WebJsInterface.6
            @Override // java.lang.Runnable
            public void run() {
                WebViewLayout layout;
                if (webViewActivity == null || (layout = webViewActivity.getLayout()) == null) {
                    return;
                }
                layout.hideCloseBtn();
            }
        });
    }

    @JavascriptInterface
    public void showCloseBtn() {
        final WebViewActivity webViewActivity = (WebViewActivity) this.refActivity.get();
        webViewActivity.runOnUiThread(new Runnable() { // from class: com.cmplay.base.util.webview.ui.WebJsInterface.7
            @Override // java.lang.Runnable
            public void run() {
                WebViewLayout layout;
                if (webViewActivity == null || (layout = webViewActivity.getLayout()) == null) {
                    return;
                }
                layout.showCloseBtn();
            }
        });
    }

    @JavascriptInterface
    public void showToast(final String str) {
        final Activity activity = this.refActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.cmplay.base.util.webview.ui.WebJsInterface.8
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(activity, str, 0).show();
                }
            });
        }
    }

    @JavascriptInterface
    public void openFacebook(String str) {
        p.a(this.mContext, str);
    }

    @JavascriptInterface
    public void jumpToLevel(int i) {
        h.c("WebJsInterface", "jumpToLevel = " + i);
        Activity activity = this.refActivity.get();
        if (activity != null) {
            GameBroadcast.jumpToLevel(activity, i);
        }
    }

    @JavascriptInterface
    public void sendPrize(int i, int i2, int i3) {
        h.c("WebJsInterface", "sence = " + i + "sendPrize id= " + i2 + " count = " + i3);
        Activity activity = this.refActivity.get();
        if (activity != null) {
            GameBroadcast.sendPrize(activity, i, i2, i3);
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
    public void registerStatusCallback(final String str) {
        Activity activity;
        h.a("playable", "WebJsInterface.registerCloseCallback   js返回的回调应用为:" + str);
        if (this.refActivity == null || (activity = this.refActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.cmplay.base.util.webview.ui.WebJsInterface.9
            @Override // java.lang.Runnable
            public void run() {
                if (WebJsInterface.this.mCallBack != null) {
                    WebJsInterface.this.mCallBack.playAbleCallBack(str);
                }
            }
        });
    }

    @JavascriptInterface
    public void selectPictureWithCallback(final String str) {
        final Activity activity;
        h.a("selectPicture", "WebJsInterface.registerCloseCallback   js返回的回调应用为:" + str);
        if (this.refActivity == null || (activity = this.refActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.cmplay.base.util.webview.ui.WebJsInterface.10
            @Override // java.lang.Runnable
            public void run() {
                if (WebJsInterface.this.mCallBack != null) {
                    WebJsInterface.this.mCallBack.selectPictureWithCallback(str);
                }
                final WebViewActivity webViewActivity = (WebViewActivity) activity;
                if (webViewActivity.getLayout() == null || webViewActivity.getLayout().getChromeClient() == null) {
                    return;
                }
                ValueCallback<Uri> valueCallback = new ValueCallback<Uri>() { // from class: com.cmplay.base.util.webview.ui.WebJsInterface.10.1
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(Uri uri) {
                        String string;
                        if (uri != null) {
                            if (Build.VERSION.SDK_INT >= 19) {
                                String[] strArr = {"_data"};
                                Cursor query = activity.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "_id=?", new String[]{DocumentsContract.getDocumentId(uri).split(":")[1]}, null);
                                string = query.moveToFirst() ? query.getString(query.getColumnIndex(strArr[0])) : null;
                                query.close();
                            } else {
                                Cursor query2 = activity.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
                                int columnIndexOrThrow = query2.getColumnIndexOrThrow("_data");
                                query2.moveToFirst();
                                string = query2.getString(columnIndexOrThrow);
                            }
                            h.a("selectPicture", "callbackSelectPictureMethon  path:" + string);
                            Bitmap a2 = g.a(string, 720, 1280);
                            h.a("selectPicture", "callbackSelectPictureMethon  bitmap:" + a2);
                            if (a2 != null) {
                                webViewActivity.getLayout().callbackSelectPictureMethon(g.a(a2));
                            }
                        }
                    }
                };
                h.a("selectPicture", "openFileChooser");
                webViewActivity.getLayout().getChromeClient().openFileChooser(valueCallback);
            }
        });
    }
}
