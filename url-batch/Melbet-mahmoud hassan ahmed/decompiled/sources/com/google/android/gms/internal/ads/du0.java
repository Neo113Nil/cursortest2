package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

@TargetApi(11)
/* loaded from: classes.dex */
public final class du0 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final eu0 f4340a;

    public du0(eu0 eu0Var) {
        this.f4340a = eu0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context b(WebView webView) {
        if (!(webView instanceof eu0)) {
            return webView.getContext();
        }
        eu0 eu0Var = (eu0) webView;
        Activity j7 = eu0Var.j();
        return j7 != null ? j7 : eu0Var.getContext();
    }

    protected final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z6) {
        eu0 eu0Var;
        AlertDialog create;
        y2.b g7;
        try {
            eu0Var = this.f4340a;
        } catch (WindowManager.BadTokenException e7) {
            io0.h("Fail to display Dialog.", e7);
        }
        if (eu0Var != null && eu0Var.E0() != null && this.f4340a.E0().g() != null && (g7 = this.f4340a.E0().g()) != null && !g7.c()) {
            StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            g7.b(sb.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z6) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            create = builder.setView(linearLayout).setPositiveButton(R.string.ok, new bu0(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new au0(jsPromptResult)).setOnCancelListener(new zt0(jsPromptResult)).create();
        } else {
            create = builder.setMessage(str3).setPositiveButton(R.string.ok, new yt0(jsResult)).setNegativeButton(R.string.cancel, new xt0(jsResult)).setOnCancelListener(new wt0(jsResult)).create();
        }
        create.show();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof eu0) {
            z2.o P = ((eu0) webView).P();
            if (P != null) {
                P.a();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        io0.g(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i7 = cu0.f3947a[consoleMessage.messageLevel().ordinal()];
        if (i7 == 1) {
            io0.d(sb2);
        } else if (i7 == 2) {
            io0.g(sb2);
        } else if (i7 == 3 || i7 == 4 || i7 != 5) {
            io0.f(sb2);
        } else {
            io0.b(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z6, boolean z7, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f4340a.v() != null) {
            webView2.setWebViewClient(this.f4340a.v());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j7, long j8, long j9, WebStorage.QuotaUpdater quotaUpdater) {
        long j10 = 5242880 - j9;
        if (j10 <= 0) {
            quotaUpdater.updateQuota(j7);
            return;
        }
        if (j7 == 0) {
            if (j8 > j10 || j8 > 1048576) {
                j8 = 0;
            }
        } else if (j8 == 0) {
            j8 = Math.min(j7 + Math.min(131072L, j10), 1048576L);
        } else {
            if (j8 <= Math.min(1048576 - j7, j10)) {
                j7 += j8;
            }
            j8 = j7;
        }
        quotaUpdater.updateQuota(j8);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z6;
        if (callback != null) {
            y2.t.q();
            if (!a3.g2.f(this.f4340a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                y2.t.q();
                if (!a3.g2.f(this.f4340a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z6 = false;
                    callback.invoke(str, z6, true);
                }
            }
            z6 = true;
            callback.invoke(str, z6, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        z2.o P = this.f4340a.P();
        if (P == null) {
            io0.g("Could not get ad overlay when hiding custom view.");
        } else {
            P.d();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j7, long j8, WebStorage.QuotaUpdater quotaUpdater) {
        long j9 = j7 + 131072;
        if (5242880 - j8 < j9) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j9);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        z2.o P = this.f4340a.P();
        if (P == null) {
            io0.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            P.t6(view, customViewCallback);
            P.z6(i7);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
