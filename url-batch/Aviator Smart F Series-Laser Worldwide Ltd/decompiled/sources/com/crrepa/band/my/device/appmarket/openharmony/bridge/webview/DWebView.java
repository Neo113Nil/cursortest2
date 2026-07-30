package com.crrepa.band.my.device.appmarket.openharmony.bridge.webview;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DWebView extends WebView {
    private static final String BRIDGE_NAME = "_dsbridge";
    private static final String LOG_TAG = "dsBridge";
    private static boolean isDebug = false;
    private String APP_CACHE_DIRNAME;
    private volatile boolean alertBoxBlock;
    private int callID;
    private ArrayList<CallInfo> callInfoList;
    Map<Integer, OnReturnValue> handlerMap;
    private final InnerJavascriptInterface innerJavascriptInterface;
    private final Map<String, Object> javaScriptNamespaceInterfaces;
    private JavascriptCloseWindowListener javascriptCloseWindowListener;
    private DWebViewListener listener;
    private final WebChromeClient mWebChromeClient;
    private final Handler mainHandler;
    private WebChromeClient webChromeClient;

    private static class CallInfo {
        private final int callbackId;
        private final String data;
        private final String method;

        CallInfo(String str, int i8, Object[] objArr) {
            this.data = new JSONArray((Collection) Arrays.asList(objArr == null ? new Object[0] : objArr)).toString();
            this.callbackId = i8;
            this.method = str;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(FirebaseAnalytics.Param.METHOD, this.method);
                jSONObject.put("callbackId", this.callbackId);
                jSONObject.put("data", this.data);
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            return jSONObject.toString();
        }
    }

    public interface DWebViewListener {
        void onPageFinished();
    }

    public interface FileChooser {
        @TargetApi(11)
        void openFileChooser(ValueCallback valueCallback, String str);

        @TargetApi(16)
        void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2);
    }

    private class InnerJavascriptInterface {
        private InnerJavascriptInterface() {
        }

        private void PrintDebugInfo(String str) {
            Log.d(DWebView.LOG_TAG, str);
            if (DWebView.isDebug) {
                DWebView.this.evaluateJavascript(String.format("alert('%s')", "DEBUG ERR MSG:\\n" + str.replaceAll("\\'", "\\\\'")));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
        @JavascriptInterface
        @Keep
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String call(String str, String str2) {
            boolean z7;
            String[] parseNamespace = DWebView.this.parseNamespace(str.trim());
            String str3 = parseNamespace[1];
            Object obj = DWebView.this.javaScriptNamespaceInterfaces.get(parseNamespace[0]);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", -1);
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            if (obj == null) {
                PrintDebugInfo("Js bridge  called, but can't find a corresponded JavascriptInterface object , please check your code!");
                return jSONObject.toString();
            }
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                Method method = null;
                final String string = jSONObject2.has("_dscbstub") ? jSONObject2.getString("_dscbstub") : null;
                Object obj2 = jSONObject2.has("data") ? jSONObject2.get("data") : null;
                Class<?> cls = obj.getClass();
                try {
                    try {
                        method = cls.getMethod(str3, Object.class, CompletionHandler.class);
                        z7 = true;
                    } catch (Exception unused) {
                        method = cls.getMethod(str3, Object.class);
                        z7 = false;
                        if (method == null) {
                        }
                    }
                } catch (Exception unused2) {
                    z7 = false;
                    if (method == null) {
                    }
                }
                if (method == null) {
                    PrintDebugInfo("Not find method \"" + str3 + "\" implementation! please check if the  signature or namespace of the method is right ");
                    return jSONObject.toString();
                }
                if (((JavascriptInterface) method.getAnnotation(JavascriptInterface.class)) == null) {
                    PrintDebugInfo("Method " + str3 + " is not invoked, since  it is not declared with JavascriptInterface annotation! ");
                    return jSONObject.toString();
                }
                method.setAccessible(true);
                try {
                    if (z7) {
                        method.invoke(obj, obj2, new CompletionHandler() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.InnerJavascriptInterface.1
                            @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler
                            public void complete(Object obj3) {
                                complete(obj3, true);
                            }

                            @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler
                            public void setProgressData(Object obj3) {
                                complete(obj3, false);
                            }

                            @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler
                            public void complete() {
                                complete(null, true);
                            }

                            private void complete(Object obj3, boolean z8) {
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("code", 0);
                                    jSONObject3.put("data", obj3);
                                    String str4 = string;
                                    if (str4 != null) {
                                        String format = String.format("%s(%s.data);", str4, jSONObject3);
                                        if (z8) {
                                            format = format + "delete window." + string;
                                        }
                                        DWebView.this.evaluateJavascript(format);
                                    }
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                }
                            }
                        });
                        return jSONObject.toString();
                    }
                    Object invoke = method.invoke(obj, obj2);
                    jSONObject.put("code", 0);
                    jSONObject.put("data", invoke);
                    return jSONObject.toString();
                } catch (Exception e9) {
                    e9.printStackTrace();
                    PrintDebugInfo(String.format("Call failed：The parameter of \"%s\" in Java is invalid.", str3));
                    return jSONObject.toString();
                }
            } catch (JSONException e10) {
                PrintDebugInfo(String.format("The argument of \"%s\" must be a JSON object string!", str3));
                e10.printStackTrace();
                return jSONObject.toString();
            }
        }
    }

    public interface JavascriptCloseWindowListener {
        boolean onClose();
    }

    public DWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.javaScriptNamespaceInterfaces = new HashMap();
        this.innerJavascriptInterface = new InnerJavascriptInterface();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.handlerMap = new HashMap();
        this.callID = 0;
        this.alertBoxBlock = true;
        this.mWebChromeClient = new WebChromeClient() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.1
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getDefaultVideoPoster() : super.getDefaultVideoPoster();
            }

            @Override // android.webkit.WebChromeClient
            public View getVideoLoadingProgressView() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getVideoLoadingProgressView() : super.getVideoLoadingProgressView();
            }

            @Override // android.webkit.WebChromeClient
            public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.getVisitedHistory(valueCallback);
                } else {
                    super.getVisitedHistory(valueCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onCloseWindow(webView);
                } else {
                    super.onCloseWindow(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onConsoleMessage(String str, int i8, String str2) {
                Log.i(DWebView.LOG_TAG, "------>" + str + "(" + str2 + ":" + i8 + ")");
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onConsoleMessage(str, i8, str2);
                } else {
                    super.onConsoleMessage(str, i8, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onCreateWindow(webView, z7, z8, message) : super.onCreateWindow(webView, z7, z8, message);
            }

            @Override // android.webkit.WebChromeClient
            public void onExceededDatabaseQuota(String str, String str2, long j8, long j9, long j10, WebStorage.QuotaUpdater quotaUpdater) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onExceededDatabaseQuota(str, str2, j8, j9, j10, quotaUpdater);
                } else {
                    super.onExceededDatabaseQuota(str, str2, j8, j9, j10, quotaUpdater);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsHidePrompt() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsHidePrompt();
                } else {
                    super.onGeolocationPermissionsHidePrompt();
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
                } else {
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onHideCustomView();
                } else {
                    super.onHideCustomView();
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsAlert(webView, str, str2, jsResult)) {
                    return true;
                }
                new AlertDialog.Builder(DWebView.this.getContext()).setMessage(str2).setCancelable(false).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i8) {
                        dialogInterface.dismiss();
                        if (DWebView.this.alertBoxBlock) {
                            jsResult.confirm();
                        }
                    }
                }).create().show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult) : super.onJsBeforeUnload(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsConfirm(webView, str, str2, jsResult)) {
                    return true;
                }
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.1.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i8) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i8 == -1) {
                                jsResult.confirm();
                            } else {
                                jsResult.cancel();
                            }
                        }
                    }
                };
                new AlertDialog.Builder(DWebView.this.getContext()).setMessage(str2).setCancelable(false).setPositiveButton(R.string.ok, onClickListener).setNegativeButton(R.string.cancel, onClickListener).show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsPromptResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult)) {
                    return true;
                }
                final EditText editText = new EditText(DWebView.this.getContext());
                editText.setText(str3);
                if (str3 != null) {
                    editText.setSelection(str3.length());
                }
                float f8 = DWebView.this.getContext().getResources().getDisplayMetrics().density;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.1.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i8) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i8 == -1) {
                                jsPromptResult.confirm(editText.getText().toString());
                            } else {
                                jsPromptResult.cancel();
                            }
                        }
                    }
                };
                new AlertDialog.Builder(DWebView.this.getContext()).setTitle(str2).setView(editText).setCancelable(false).setPositiveButton(R.string.ok, onClickListener).setNegativeButton(R.string.cancel, onClickListener).show();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                int i8 = (int) (16.0f * f8);
                layoutParams.setMargins(i8, 0, i8, 0);
                layoutParams.gravity = 1;
                editText.setLayoutParams(layoutParams);
                int i9 = (int) (15.0f * f8);
                editText.setPadding(i9 - ((int) (f8 * 5.0f)), i9, i9, i9);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsTimeout() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsTimeout() : super.onJsTimeout();
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequest(permissionRequest);
                } else {
                    super.onPermissionRequest(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequestCanceled(permissionRequest);
                } else {
                    super.onPermissionRequestCanceled(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i8) {
                if (i8 == 100) {
                    if (DWebView.this.listener != null) {
                        DWebView.this.listener.onPageFinished();
                    }
                } else if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onProgressChanged(webView, i8);
                } else {
                    super.onProgressChanged(webView, i8);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedIcon(WebView webView, Bitmap bitmap) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedIcon(webView, bitmap);
                } else {
                    super.onReceivedIcon(webView, bitmap);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTitle(webView, str);
                } else {
                    super.onReceivedTitle(webView, str);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTouchIconUrl(WebView webView, String str, boolean z7) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTouchIconUrl(webView, str, z7);
                } else {
                    super.onReceivedTouchIconUrl(webView, str, z7);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onRequestFocus(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onRequestFocus(webView);
                } else {
                    super.onRequestFocus(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, customViewCallback);
                } else {
                    super.onShowCustomView(view, customViewCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            @Keep
            public void openFileChooser(ValueCallback valueCallback, String str) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str);
                }
            }

            @Keep
            public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(14)
            public void onShowCustomView(View view, int i8, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, i8, customViewCallback);
                } else {
                    super.onShowCustomView(view, i8, customViewCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Log.i(DWebView.LOG_TAG, "---->[" + consoleMessage.messageLevel() + "] " + consoleMessage.message() + "(" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")");
                if (DWebView.this.webChromeClient != null) {
                    return DWebView.this.webChromeClient.onConsoleMessage(consoleMessage);
                }
                return super.onConsoleMessage(consoleMessage);
            }
        };
        this.javascriptCloseWindowListener = null;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _evaluateJavascript(String str) {
        super.evaluateJavascript(str, null);
    }

    @Keep
    private void addInternalJavascriptObject() {
        addJavascriptObject(new Object() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.2
            @JavascriptInterface
            @Keep
            public String closePage(Object obj) {
                DWebView.this.runOnMainThread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (DWebView.this.javascriptCloseWindowListener == null || DWebView.this.javascriptCloseWindowListener.onClose()) {
                            Context context = DWebView.this.getContext();
                            if (context instanceof Activity) {
                                ((Activity) context).onBackPressed();
                            }
                        }
                    }
                });
                return null;
            }

            @JavascriptInterface
            @Keep
            public void disableJavascriptDialogBlock(Object obj) {
                DWebView.this.alertBoxBlock = !((JSONObject) obj).getBoolean("disable");
            }

            @JavascriptInterface
            @Keep
            public void dsinit(Object obj) {
                DWebView.this.dispatchStartupQueue();
            }

            /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
            @JavascriptInterface
            @Keep
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean hasNativeMethod(Object obj) {
                Method method;
                boolean z7;
                JSONObject jSONObject = (JSONObject) obj;
                String trim = jSONObject.getString("name").trim();
                String trim2 = jSONObject.getString("type").trim();
                String[] parseNamespace = DWebView.this.parseNamespace(trim);
                Object obj2 = DWebView.this.javaScriptNamespaceInterfaces.get(parseNamespace[0]);
                if (obj2 == null) {
                    return false;
                }
                Class<?> cls = obj2.getClass();
                try {
                    try {
                        method = cls.getMethod(parseNamespace[1], Object.class, CompletionHandler.class);
                        z7 = true;
                    } catch (Exception unused) {
                        method = null;
                        z7 = false;
                        return method != null ? false : false;
                    }
                } catch (Exception unused2) {
                    method = cls.getMethod(parseNamespace[1], Object.class);
                    z7 = false;
                    if (method != null) {
                    }
                }
                if (method != null && ((JavascriptInterface) method.getAnnotation(JavascriptInterface.class)) != null) {
                    return TtmlNode.COMBINE_ALL.equals(trim2) || (z7 && "asyn".equals(trim2)) || (!z7 && "syn".equals(trim2));
                }
            }

            @JavascriptInterface
            @Keep
            public void returnValue(final Object obj) {
                DWebView.this.runOnMainThread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        JSONObject jSONObject = (JSONObject) obj;
                        try {
                            int i8 = jSONObject.getInt("id");
                            boolean z7 = jSONObject.getBoolean("complete");
                            OnReturnValue onReturnValue = DWebView.this.handlerMap.get(Integer.valueOf(i8));
                            Object obj2 = jSONObject.has("data") ? jSONObject.get("data") : null;
                            if (onReturnValue != null) {
                                onReturnValue.onValue(obj2);
                                if (z7) {
                                    DWebView.this.handlerMap.remove(Integer.valueOf(i8));
                                }
                            }
                        } catch (JSONException e8) {
                            e8.printStackTrace();
                        }
                    }
                });
            }
        }, "_dsb");
    }

    private void dispatchJavascriptCall(CallInfo callInfo) {
        evaluateJavascript(String.format("window._handleMessageFromNative(%s)", callInfo.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void dispatchStartupQueue() {
        try {
            ArrayList<CallInfo> arrayList = this.callInfoList;
            if (arrayList != null) {
                Iterator<CallInfo> it = arrayList.iterator();
                while (it.hasNext()) {
                    dispatchJavascriptCall(it.next());
                }
                this.callInfoList = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void init() {
        this.APP_CACHE_DIRNAME = getContext().getFilesDir().getAbsolutePath() + "/webcache";
        WebSettings settings = getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + "; HWOH_BRIDGE/1 CASHIER_TYPE01");
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setCacheMode(-1);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        super.setWebChromeClient(this.mWebChromeClient);
        addInternalJavascriptObject();
        super.addJavascriptInterface(this.innerJavascriptInterface, BRIDGE_NAME);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        settings.setMixedContentMode(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String[] parseNamespace(String str) {
        String str2;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str2 = str.substring(0, lastIndexOf);
            str = str.substring(lastIndexOf + 1);
        } else {
            str2 = "";
        }
        return new String[]{str2, str};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnMainThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    public static void setWebContentsDebuggingEnabled(boolean z7) {
        WebView.setWebContentsDebuggingEnabled(z7);
        isDebug = z7;
    }

    public void addJavascriptObject(Object obj, String str) {
        if (str == null) {
            str = "";
        }
        if (obj != null) {
            this.javaScriptNamespaceInterfaces.put(str, obj);
        }
    }

    public synchronized <T> void callHandler(String str, Object[] objArr, OnReturnValue<T> onReturnValue) {
        try {
            int i8 = this.callID + 1;
            this.callID = i8;
            CallInfo callInfo = new CallInfo(str, i8, objArr);
            if (onReturnValue != null) {
                this.handlerMap.put(Integer.valueOf(callInfo.callbackId), onReturnValue);
            }
            ArrayList<CallInfo> arrayList = this.callInfoList;
            if (arrayList != null) {
                arrayList.add(callInfo);
            } else {
                dispatchJavascriptCall(callInfo);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z7) {
        super.clearCache(z7);
        CookieManager.getInstance().removeAllCookie();
        Context context = getContext();
        try {
            context.deleteDatabase("webview.db");
            context.deleteDatabase("webviewCache.db");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        File file = new File(this.APP_CACHE_DIRNAME);
        File file2 = new File(context.getCacheDir().getAbsolutePath() + "/webviewCache");
        if (file2.exists()) {
            deleteFile(file2);
        }
        if (file.exists()) {
            deleteFile(file);
        }
    }

    public void deleteFile(File file) {
        if (!file.exists()) {
            Log.e("Webview", "delete file no exists " + file.getAbsolutePath());
            return;
        }
        if (file.isFile()) {
            file.delete();
        } else if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteFile(file2);
            }
        }
        file.delete();
    }

    public void disableJavascriptDialogBlock(boolean z7) {
        this.alertBoxBlock = !z7;
    }

    public void evaluateJavascript(final String str) {
        runOnMainThread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.3
            @Override // java.lang.Runnable
            public void run() {
                DWebView.this._evaluateJavascript(str);
            }
        });
    }

    public void hasJavascriptMethod(String str, OnReturnValue<Boolean> onReturnValue) {
        callHandler("_hasJavascriptMethod", new Object[]{str}, onReturnValue);
    }

    @Override // android.webkit.WebView
    public void loadUrl(final String str) {
        runOnMainThread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.4
            @Override // java.lang.Runnable
            public void run() {
                String str2 = str;
                if (str2 != null && str2.startsWith("javascript:")) {
                    DWebView.super.loadUrl(str);
                    return;
                }
                DWebView.this.callInfoList = new ArrayList();
                DWebView.super.loadUrl(str);
            }
        });
    }

    @Override // android.webkit.WebView
    public void reload() {
        runOnMainThread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.6
            @Override // java.lang.Runnable
            public void run() {
                DWebView.this.callInfoList = new ArrayList();
                DWebView.super.reload();
            }
        });
    }

    public void removeJavascriptObject(String str) {
        if (str == null) {
            str = "";
        }
        this.javaScriptNamespaceInterfaces.remove(str);
    }

    public void setDWebViewListener(DWebViewListener dWebViewListener) {
        this.listener = dWebViewListener;
    }

    public void setJavascriptCloseWindowListener(JavascriptCloseWindowListener javascriptCloseWindowListener) {
        this.javascriptCloseWindowListener = javascriptCloseWindowListener;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.webChromeClient = webChromeClient;
    }

    @Override // android.webkit.WebView
    public void loadUrl(final String str, final Map<String, String> map) {
        runOnMainThread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.5
            @Override // java.lang.Runnable
            public void run() {
                String str2 = str;
                if (str2 != null && str2.startsWith("javascript:")) {
                    DWebView.super.loadUrl(str, map);
                    return;
                }
                DWebView.this.callInfoList = new ArrayList();
                DWebView.super.loadUrl(str, map);
            }
        });
    }

    public void callHandler(String str, Object[] objArr) {
        callHandler(str, objArr, null);
    }

    public <T> void callHandler(String str, OnReturnValue<T> onReturnValue) {
        callHandler(str, null, onReturnValue);
    }

    public DWebView(Context context) {
        super(context);
        this.javaScriptNamespaceInterfaces = new HashMap();
        this.innerJavascriptInterface = new InnerJavascriptInterface();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.handlerMap = new HashMap();
        this.callID = 0;
        this.alertBoxBlock = true;
        this.mWebChromeClient = new WebChromeClient() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.1
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getDefaultVideoPoster() : super.getDefaultVideoPoster();
            }

            @Override // android.webkit.WebChromeClient
            public View getVideoLoadingProgressView() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getVideoLoadingProgressView() : super.getVideoLoadingProgressView();
            }

            @Override // android.webkit.WebChromeClient
            public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.getVisitedHistory(valueCallback);
                } else {
                    super.getVisitedHistory(valueCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onCloseWindow(webView);
                } else {
                    super.onCloseWindow(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onConsoleMessage(String str, int i8, String str2) {
                Log.i(DWebView.LOG_TAG, "------>" + str + "(" + str2 + ":" + i8 + ")");
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onConsoleMessage(str, i8, str2);
                } else {
                    super.onConsoleMessage(str, i8, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onCreateWindow(webView, z7, z8, message) : super.onCreateWindow(webView, z7, z8, message);
            }

            @Override // android.webkit.WebChromeClient
            public void onExceededDatabaseQuota(String str, String str2, long j8, long j9, long j10, WebStorage.QuotaUpdater quotaUpdater) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onExceededDatabaseQuota(str, str2, j8, j9, j10, quotaUpdater);
                } else {
                    super.onExceededDatabaseQuota(str, str2, j8, j9, j10, quotaUpdater);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsHidePrompt() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsHidePrompt();
                } else {
                    super.onGeolocationPermissionsHidePrompt();
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
                } else {
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onHideCustomView();
                } else {
                    super.onHideCustomView();
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsAlert(webView, str, str2, jsResult)) {
                    return true;
                }
                new AlertDialog.Builder(DWebView.this.getContext()).setMessage(str2).setCancelable(false).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i8) {
                        dialogInterface.dismiss();
                        if (DWebView.this.alertBoxBlock) {
                            jsResult.confirm();
                        }
                    }
                }).create().show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult) : super.onJsBeforeUnload(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsConfirm(webView, str, str2, jsResult)) {
                    return true;
                }
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.1.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i8) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i8 == -1) {
                                jsResult.confirm();
                            } else {
                                jsResult.cancel();
                            }
                        }
                    }
                };
                new AlertDialog.Builder(DWebView.this.getContext()).setMessage(str2).setCancelable(false).setPositiveButton(R.string.ok, onClickListener).setNegativeButton(R.string.cancel, onClickListener).show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsPromptResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult)) {
                    return true;
                }
                final EditText editText = new EditText(DWebView.this.getContext());
                editText.setText(str3);
                if (str3 != null) {
                    editText.setSelection(str3.length());
                }
                float f8 = DWebView.this.getContext().getResources().getDisplayMetrics().density;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.1.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i8) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i8 == -1) {
                                jsPromptResult.confirm(editText.getText().toString());
                            } else {
                                jsPromptResult.cancel();
                            }
                        }
                    }
                };
                new AlertDialog.Builder(DWebView.this.getContext()).setTitle(str2).setView(editText).setCancelable(false).setPositiveButton(R.string.ok, onClickListener).setNegativeButton(R.string.cancel, onClickListener).show();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                int i8 = (int) (16.0f * f8);
                layoutParams.setMargins(i8, 0, i8, 0);
                layoutParams.gravity = 1;
                editText.setLayoutParams(layoutParams);
                int i9 = (int) (15.0f * f8);
                editText.setPadding(i9 - ((int) (f8 * 5.0f)), i9, i9, i9);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsTimeout() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsTimeout() : super.onJsTimeout();
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequest(permissionRequest);
                } else {
                    super.onPermissionRequest(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequestCanceled(permissionRequest);
                } else {
                    super.onPermissionRequestCanceled(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i8) {
                if (i8 == 100) {
                    if (DWebView.this.listener != null) {
                        DWebView.this.listener.onPageFinished();
                    }
                } else if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onProgressChanged(webView, i8);
                } else {
                    super.onProgressChanged(webView, i8);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedIcon(WebView webView, Bitmap bitmap) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedIcon(webView, bitmap);
                } else {
                    super.onReceivedIcon(webView, bitmap);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTitle(webView, str);
                } else {
                    super.onReceivedTitle(webView, str);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTouchIconUrl(WebView webView, String str, boolean z7) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTouchIconUrl(webView, str, z7);
                } else {
                    super.onReceivedTouchIconUrl(webView, str, z7);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onRequestFocus(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onRequestFocus(webView);
                } else {
                    super.onRequestFocus(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, customViewCallback);
                } else {
                    super.onShowCustomView(view, customViewCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            @Keep
            public void openFileChooser(ValueCallback valueCallback, String str) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str);
                }
            }

            @Keep
            public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(14)
            public void onShowCustomView(View view, int i8, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, i8, customViewCallback);
                } else {
                    super.onShowCustomView(view, i8, customViewCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Log.i(DWebView.LOG_TAG, "---->[" + consoleMessage.messageLevel() + "] " + consoleMessage.message() + "(" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")");
                if (DWebView.this.webChromeClient != null) {
                    return DWebView.this.webChromeClient.onConsoleMessage(consoleMessage);
                }
                return super.onConsoleMessage(consoleMessage);
            }
        };
        this.javascriptCloseWindowListener = null;
        init();
    }
}
