package com.google.android.gms.internal.ads;

import android.R;
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

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcej extends WebChromeClient {
    private final zzcek zza;

    public zzcej(zzcek zzcekVar) {
        this.zza = zzcekVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcek)) {
            return webView.getContext();
        }
        zzcek zzcekVar = (zzcek) webView;
        Activity zzj = zzcekVar.zzj();
        return zzj != null ? zzj : zzcekVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcek)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzL = ((zzcek) webView).zzL();
        if (zzL != null) {
            zzL.zzb();
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(message).length();
        StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(sourceId).length() + 1 + String.valueOf(lineNumber).length() + 1);
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
        int i = zzcei.zza[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb2);
        } else if (i == 2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
        } else if (i == 3 || i == 4) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
        } else if (i != 5) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
        } else {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzcek zzcekVar = this.zza;
        if (zzcekVar.zzQ() != null) {
            webView2.setWebViewClient(zzcekVar.zzQ());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min(131072L, j4), 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback == null) {
            return;
        }
        zzcek zzcekVar = this.zza;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!com.google.android.gms.ads.internal.util.zzs.zzE(zzcekVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (!com.google.android.gms.ads.internal.util.zzs.zzE(zzcekVar.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznZ)).booleanValue()) {
                    callback.invoke(str, z, true);
                } else {
                    callback.invoke(str, false, true);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoa)).booleanValue()) {
                    return;
                }
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
                return;
            }
        }
        z = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznZ)).booleanValue()) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoa)).booleanValue()) {
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zza.zzL();
        if (zzL != null) {
            zzL.zzc();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zza.zzL();
        if (zzL != null) {
            zzL.zzx(view, customViewCallback);
            zzL.zzw(i);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        }
    }

    protected final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzcek zzcekVar;
        com.google.android.gms.ads.internal.zzb zzh;
        try {
            zzcekVar = this.zza;
        } catch (WindowManager.BadTokenException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to display Dialog.", e);
        }
        if (zzcekVar != null && zzcekVar.zzP() != null && zzcekVar.zzP().zzh() != null && (zzh = zzcekVar.zzP().zzh()) != null && !zzh.zzb()) {
            StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzh.zzc(sb.toString());
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder zzO = com.google.android.gms.ads.internal.util.zzs.zzO(context);
        zzO.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            zzO.setView(linearLayout).setPositiveButton(R.string.ok, new zzceh(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzceg(jsPromptResult)).setOnCancelListener(new zzcef(jsPromptResult)).create().show();
        } else {
            zzO.setMessage(str3).setPositiveButton(R.string.ok, new zzcee(jsResult)).setNegativeButton(R.string.cancel, new zzced(jsResult)).setOnCancelListener(new zzcec(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
